package org.bouncycastle.util.encoders;

import i4.a;
import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;

/* JADX INFO: loaded from: classes3.dex */
public class Base32Encoder implements Encoder {
    private static final byte[] DEAULT_ENCODING_TABLE = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 50, 51, 52, 53, 54, 55};
    private static final byte DEFAULT_PADDING = 61;
    private final byte[] decodingTable;
    private final byte[] encodingTable;
    private final byte padding;

    public Base32Encoder(byte[] bArr, byte b8) {
        this.decodingTable = new byte[128];
        if (bArr.length != 32) {
            a.f("encoding table needs to be length 32");
            throw null;
        }
        this.encodingTable = Arrays.clone(bArr);
        this.padding = b8;
        initialiseDecodingTable();
    }

    private int decodeLastBlock(OutputStream outputStream, char c3, char c7, char c8, char c11, char c12, char c13, char c14, char c15) throws IOException {
        char c16 = this.padding;
        if (c15 != c16) {
            byte[] bArr = this.decodingTable;
            byte b8 = bArr[c3];
            byte b11 = bArr[c7];
            byte b12 = bArr[c8];
            byte b13 = bArr[c11];
            byte b14 = bArr[c12];
            byte b15 = bArr[c13];
            byte b16 = bArr[c14];
            byte b17 = bArr[c15];
            if ((b8 | b11 | b12 | b13 | b14 | b15 | b16 | b17) >= 0) {
                outputStream.write((b8 << 3) | (b11 >> 2));
                outputStream.write((b11 << 6) | (b12 << 1) | (b13 >> 4));
                outputStream.write((b13 << 4) | (b14 >> 1));
                outputStream.write((b14 << 7) | (b15 << 2) | (b16 >> 3));
                outputStream.write((b16 << 5) | b17);
                return 5;
            }
        } else if (c14 != c16) {
            byte[] bArr2 = this.decodingTable;
            byte b18 = bArr2[c3];
            byte b19 = bArr2[c7];
            byte b21 = bArr2[c8];
            byte b22 = bArr2[c11];
            byte b23 = bArr2[c12];
            byte b24 = bArr2[c13];
            byte b25 = bArr2[c14];
            if ((b18 | b19 | b21 | b22 | b23 | b24 | b25) >= 0) {
                outputStream.write((b18 << 3) | (b19 >> 2));
                outputStream.write((b19 << 6) | (b21 << 1) | (b22 >> 4));
                outputStream.write((b22 << 4) | (b23 >> 1));
                outputStream.write((b23 << 7) | (b24 << 2) | (b25 >> 3));
                return 4;
            }
        } else if (c13 == c16) {
            if (c12 != c16) {
                byte[] bArr3 = this.decodingTable;
                byte b26 = bArr3[c3];
                byte b27 = bArr3[c7];
                byte b28 = bArr3[c8];
                byte b29 = bArr3[c11];
                byte b31 = bArr3[c12];
                if ((b26 | b27 | b28 | b29 | b31) >= 0) {
                    outputStream.write((b26 << 3) | (b27 >> 2));
                    outputStream.write((b27 << 6) | (b28 << 1) | (b29 >> 4));
                    outputStream.write((b29 << 4) | (b31 >> 1));
                    return 3;
                }
            } else if (c11 != c16) {
                byte[] bArr4 = this.decodingTable;
                byte b32 = bArr4[c3];
                byte b33 = bArr4[c7];
                byte b34 = bArr4[c8];
                byte b35 = bArr4[c11];
                if ((b32 | b33 | b34 | b35) >= 0) {
                    outputStream.write((b32 << 3) | (b33 >> 2));
                    outputStream.write((b33 << 6) | (b34 << 1) | (b35 >> 4));
                    return 2;
                }
            } else if (c8 == c16) {
                byte[] bArr5 = this.decodingTable;
                byte b36 = bArr5[c3];
                byte b37 = bArr5[c7];
                if ((b36 | b37) >= 0) {
                    outputStream.write((b36 << 3) | (b37 >> 2));
                    return 1;
                }
            }
        }
        a.k("invalid characters encountered at end of base32 data");
        return 0;
    }

    private void encodeBlock(byte[] bArr, int i11, byte[] bArr2, int i12) {
        byte b8 = bArr[i11];
        int i13 = bArr[i11 + 1] & 255;
        int i14 = bArr[i11 + 2] & 255;
        int i15 = bArr[i11 + 3] & 255;
        byte b11 = bArr[i11 + 4];
        byte[] bArr3 = this.encodingTable;
        bArr2[i12] = bArr3[(b8 >>> 3) & 31];
        bArr2[i12 + 1] = bArr3[((b8 << 2) | (i13 >>> 6)) & 31];
        bArr2[i12 + 2] = bArr3[(i13 >>> 1) & 31];
        bArr2[i12 + 3] = bArr3[((i13 << 4) | (i14 >>> 4)) & 31];
        bArr2[i12 + 4] = bArr3[((i14 << 1) | (i15 >>> 7)) & 31];
        bArr2[i12 + 5] = bArr3[(i15 >>> 2) & 31];
        bArr2[i12 + 6] = bArr3[(((b11 & 255) >>> 5) | (i15 << 3)) & 31];
        bArr2[i12 + 7] = bArr3[b11 & 31];
    }

    private boolean ignore(char c3) {
        return c3 == '\n' || c3 == '\r' || c3 == '\t' || c3 == ' ';
    }

    private int nextI(byte[] bArr, int i11, int i12) {
        while (i11 < i12 && ignore((char) bArr[i11])) {
            i11++;
        }
        return i11;
    }

    @Override // org.bouncycastle.util.encoders.Encoder
    public int decode(byte[] bArr, int i11, int i12, OutputStream outputStream) throws IOException {
        byte[] bArr2 = new byte[55];
        int i13 = i11 + i12;
        while (i13 > i11 && ignore((char) bArr[i13 - 1])) {
            i13--;
        }
        if (i13 == 0) {
            return 0;
        }
        int i14 = i13;
        int i15 = 0;
        while (i14 > i11 && i15 != 8) {
            if (!ignore((char) bArr[i14 - 1])) {
                i15++;
            }
            i14--;
        }
        int iNextI = nextI(bArr, i11, i14);
        int i16 = 0;
        int i17 = 0;
        while (iNextI < i14) {
            int i18 = iNextI + 1;
            byte b8 = this.decodingTable[bArr[iNextI]];
            int iNextI2 = nextI(bArr, i18, i14);
            int i19 = iNextI2 + 1;
            byte b11 = this.decodingTable[bArr[iNextI2]];
            int iNextI3 = nextI(bArr, i19, i14);
            int i21 = iNextI3 + 1;
            byte b12 = this.decodingTable[bArr[iNextI3]];
            int iNextI4 = nextI(bArr, i21, i14);
            int i22 = iNextI4 + 1;
            byte b13 = this.decodingTable[bArr[iNextI4]];
            int iNextI5 = nextI(bArr, i22, i14);
            int i23 = iNextI5 + 1;
            byte b14 = this.decodingTable[bArr[iNextI5]];
            int iNextI6 = nextI(bArr, i23, i14);
            int i24 = iNextI6 + 1;
            byte b15 = this.decodingTable[bArr[iNextI6]];
            int iNextI7 = nextI(bArr, i24, i14);
            int i25 = iNextI7 + 1;
            byte b16 = this.decodingTable[bArr[iNextI7]];
            int iNextI8 = nextI(bArr, i25, i14);
            int i26 = iNextI8 + 1;
            byte b17 = this.decodingTable[bArr[iNextI8]];
            if ((b8 | b11 | b12 | b13 | b14 | b15 | b16 | b17) < 0) {
                a.k("invalid characters encountered in base32 data");
                return 0;
            }
            bArr2[i16] = (byte) ((b8 << 3) | (b11 >> 2));
            bArr2[i16 + 1] = (byte) ((b11 << 6) | (b12 << 1) | (b13 >> 4));
            bArr2[i16 + 2] = (byte) ((b13 << 4) | (b14 >> 1));
            int i27 = i16 + 4;
            bArr2[i16 + 3] = (byte) ((b15 << 2) | (b14 << 7) | (b16 >> 3));
            i16 += 5;
            bArr2[i27] = (byte) ((b16 << 5) | b17);
            if (i16 == 55) {
                outputStream.write(bArr2);
                i16 = 0;
            }
            i17 += 5;
            iNextI = nextI(bArr, i26, i14);
        }
        if (i16 > 0) {
            outputStream.write(bArr2, 0, i16);
        }
        int iNextI9 = nextI(bArr, iNextI, i13);
        int iNextI10 = nextI(bArr, iNextI9 + 1, i13);
        int iNextI11 = nextI(bArr, iNextI10 + 1, i13);
        int iNextI12 = nextI(bArr, iNextI11 + 1, i13);
        int iNextI13 = nextI(bArr, iNextI12 + 1, i13);
        int iNextI14 = nextI(bArr, iNextI13 + 1, i13);
        int iNextI15 = nextI(bArr, iNextI14 + 1, i13);
        return i17 + decodeLastBlock(outputStream, (char) bArr[iNextI9], (char) bArr[iNextI10], (char) bArr[iNextI11], (char) bArr[iNextI12], (char) bArr[iNextI13], (char) bArr[iNextI14], (char) bArr[iNextI15], (char) bArr[nextI(bArr, iNextI15 + 1, i13)]);
    }

    public int encode(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) throws IOException {
        int i14 = (i11 + i12) - 4;
        int i15 = i11;
        int i16 = i13;
        while (i15 < i14) {
            encodeBlock(bArr, i15, bArr2, i16);
            i15 += 5;
            i16 += 8;
        }
        int i17 = i12 - (i15 - i11);
        if (i17 > 0) {
            byte[] bArr3 = new byte[5];
            System.arraycopy(bArr, i15, bArr3, 0, i17);
            encodeBlock(bArr3, 0, bArr2, i16);
            if (i17 == 1) {
                byte b8 = this.padding;
                bArr2[i16 + 2] = b8;
                bArr2[i16 + 3] = b8;
                bArr2[i16 + 4] = b8;
                bArr2[i16 + 5] = b8;
                bArr2[i16 + 6] = b8;
                bArr2[i16 + 7] = b8;
            } else if (i17 == 2) {
                byte b11 = this.padding;
                bArr2[i16 + 4] = b11;
                bArr2[i16 + 5] = b11;
                bArr2[i16 + 6] = b11;
                bArr2[i16 + 7] = b11;
            } else if (i17 == 3) {
                byte b12 = this.padding;
                bArr2[i16 + 5] = b12;
                bArr2[i16 + 6] = b12;
                bArr2[i16 + 7] = b12;
            } else if (i17 == 4) {
                bArr2[i16 + 7] = this.padding;
            }
            i16 += 8;
        }
        return i16 - i13;
    }

    @Override // org.bouncycastle.util.encoders.Encoder
    public int getEncodedLength(int i11) {
        return ((i11 + 4) / 5) * 8;
    }

    @Override // org.bouncycastle.util.encoders.Encoder
    public int getMaxDecodedLength(int i11) {
        return (i11 / 8) * 5;
    }

    public void initialiseDecodingTable() {
        int i11 = 0;
        int i12 = 0;
        while (true) {
            byte[] bArr = this.decodingTable;
            if (i12 >= bArr.length) {
                break;
            }
            bArr[i12] = -1;
            i12++;
        }
        while (true) {
            byte[] bArr2 = this.encodingTable;
            if (i11 >= bArr2.length) {
                return;
            }
            this.decodingTable[bArr2[i11]] = (byte) i11;
            i11++;
        }
    }

    public Base32Encoder() {
        this.decodingTable = new byte[128];
        this.encodingTable = DEAULT_ENCODING_TABLE;
        this.padding = DEFAULT_PADDING;
        initialiseDecodingTable();
    }

    @Override // org.bouncycastle.util.encoders.Encoder
    public int encode(byte[] bArr, int i11, int i12, OutputStream outputStream) throws IOException {
        if (i12 < 0) {
            return 0;
        }
        byte[] bArr2 = new byte[72];
        int i13 = i11;
        int i14 = i12;
        while (i14 > 0) {
            int iMin = Math.min(45, i14);
            byte[] bArr3 = bArr;
            outputStream.write(bArr2, 0, encode(bArr3, i13, iMin, bArr2, 0));
            i13 += iMin;
            i14 -= iMin;
            bArr = bArr3;
        }
        return ((i12 + 2) / 3) * 4;
    }

    @Override // org.bouncycastle.util.encoders.Encoder
    public int decode(String str, OutputStream outputStream) throws IOException {
        byte[] byteArray = Strings.toByteArray(str);
        return decode(byteArray, 0, byteArray.length, outputStream);
    }
}
