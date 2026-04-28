package org.bouncycastle.util.encoders;

import i4.a;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public class Base64Encoder implements Encoder {
    protected final byte[] encodingTable = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
    protected byte padding = 61;
    protected final byte[] decodingTable = new byte[128];

    public Base64Encoder() {
        initialiseDecodingTable();
    }

    private int decodeLastBlock(OutputStream outputStream, char c3, char c7, char c8, char c11) throws IOException {
        char c12 = this.padding;
        if (c8 == c12) {
            if (c11 != c12) {
                a.k("invalid characters encountered at end of base64 data");
                return 0;
            }
            byte[] bArr = this.decodingTable;
            byte b8 = bArr[c3];
            byte b11 = bArr[c7];
            if ((b8 | b11) >= 0) {
                outputStream.write((b8 << 2) | (b11 >> 4));
                return 1;
            }
            a.k("invalid characters encountered at end of base64 data");
            return 0;
        }
        byte[] bArr2 = this.decodingTable;
        if (c11 == c12) {
            byte b12 = bArr2[c3];
            byte b13 = bArr2[c7];
            byte b14 = bArr2[c8];
            if ((b12 | b13 | b14) < 0) {
                a.k("invalid characters encountered at end of base64 data");
                return 0;
            }
            outputStream.write((b12 << 2) | (b13 >> 4));
            outputStream.write((b13 << 4) | (b14 >> 2));
            return 2;
        }
        byte b15 = bArr2[c3];
        byte b16 = bArr2[c7];
        byte b17 = bArr2[c8];
        byte b18 = bArr2[c11];
        if ((b15 | b16 | b17 | b18) < 0) {
            a.k("invalid characters encountered at end of base64 data");
            return 0;
        }
        outputStream.write((b15 << 2) | (b16 >> 4));
        outputStream.write((b16 << 4) | (b17 >> 2));
        outputStream.write((b17 << 6) | b18);
        return 3;
    }

    private boolean ignore(char c3) {
        return c3 == '\n' || c3 == '\r' || c3 == '\t' || c3 == ' ';
    }

    private int nextI(String str, int i11, int i12) {
        while (i11 < i12 && ignore(str.charAt(i11))) {
            i11++;
        }
        return i11;
    }

    @Override // org.bouncycastle.util.encoders.Encoder
    public int decode(String str, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[54];
        int length = str.length();
        while (length > 0 && ignore(str.charAt(length - 1))) {
            length--;
        }
        if (length == 0) {
            return 0;
        }
        int i11 = length;
        int i12 = 0;
        while (i11 > 0 && i12 != 4) {
            if (!ignore(str.charAt(i11 - 1))) {
                i12++;
            }
            i11--;
        }
        int iNextI = nextI(str, 0, i11);
        int i13 = 0;
        int i14 = 0;
        while (iNextI < i11) {
            int i15 = iNextI + 1;
            byte b8 = this.decodingTable[str.charAt(iNextI)];
            int iNextI2 = nextI(str, i15, i11);
            int i16 = iNextI2 + 1;
            byte b11 = this.decodingTable[str.charAt(iNextI2)];
            int iNextI3 = nextI(str, i16, i11);
            int i17 = iNextI3 + 1;
            byte b12 = this.decodingTable[str.charAt(iNextI3)];
            int iNextI4 = nextI(str, i17, i11);
            int i18 = iNextI4 + 1;
            byte b13 = this.decodingTable[str.charAt(iNextI4)];
            if ((b8 | b11 | b12 | b13) < 0) {
                a.k("invalid characters encountered in base64 data");
                return 0;
            }
            bArr[i13] = (byte) ((b8 << 2) | (b11 >> 4));
            int i19 = i13 + 2;
            bArr[i13 + 1] = (byte) ((b11 << 4) | (b12 >> 2));
            i13 += 3;
            bArr[i19] = (byte) ((b12 << 6) | b13);
            i14 += 3;
            if (i13 == 54) {
                outputStream.write(bArr);
                i13 = 0;
            }
            iNextI = nextI(str, i18, i11);
        }
        if (i13 > 0) {
            outputStream.write(bArr, 0, i13);
        }
        int iNextI5 = nextI(str, iNextI, length);
        int iNextI6 = nextI(str, iNextI5 + 1, length);
        int iNextI7 = nextI(str, iNextI6 + 1, length);
        return i14 + decodeLastBlock(outputStream, str.charAt(iNextI5), str.charAt(iNextI6), str.charAt(iNextI7), str.charAt(nextI(str, iNextI7 + 1, length)));
    }

    public int encode(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) throws IOException {
        int i14 = (i11 + i12) - 2;
        int i15 = i11;
        int i16 = i13;
        while (i15 < i14) {
            byte b8 = bArr[i15];
            int i17 = i15 + 2;
            int i18 = bArr[i15 + 1] & 255;
            i15 += 3;
            byte b11 = bArr[i17];
            byte[] bArr3 = this.encodingTable;
            bArr2[i16] = bArr3[(b8 >>> 2) & 63];
            bArr2[i16 + 1] = bArr3[((b8 << 4) | (i18 >>> 4)) & 63];
            int i19 = i16 + 3;
            bArr2[i16 + 2] = bArr3[((i18 << 2) | ((b11 & 255) >>> 6)) & 63];
            i16 += 4;
            bArr2[i19] = bArr3[b11 & 63];
        }
        int i21 = i12 - (i15 - i11);
        if (i21 == 1) {
            int i22 = bArr[i15] & 255;
            byte[] bArr4 = this.encodingTable;
            bArr2[i16] = bArr4[(i22 >>> 2) & 63];
            bArr2[i16 + 1] = bArr4[(i22 << 4) & 63];
            int i23 = i16 + 3;
            byte b12 = this.padding;
            bArr2[i16 + 2] = b12;
            i16 += 4;
            bArr2[i23] = b12;
        } else if (i21 == 2) {
            int i24 = bArr[i15] & 255;
            int i25 = bArr[i15 + 1] & 255;
            byte[] bArr5 = this.encodingTable;
            bArr2[i16] = bArr5[(i24 >>> 2) & 63];
            bArr2[i16 + 1] = bArr5[((i24 << 4) | (i25 >>> 4)) & 63];
            int i26 = i16 + 3;
            bArr2[i16 + 2] = bArr5[(i25 << 2) & 63];
            i16 += 4;
            bArr2[i26] = this.padding;
        }
        return i16 - i13;
    }

    @Override // org.bouncycastle.util.encoders.Encoder
    public int getEncodedLength(int i11) {
        return ((i11 + 2) / 3) * 4;
    }

    @Override // org.bouncycastle.util.encoders.Encoder
    public int getMaxDecodedLength(int i11) {
        return (i11 / 4) * 3;
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

    private int nextI(byte[] bArr, int i11, int i12) {
        while (i11 < i12 && ignore((char) bArr[i11])) {
            i11++;
        }
        return i11;
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
            int iMin = Math.min(54, i14);
            byte[] bArr3 = bArr;
            outputStream.write(bArr2, 0, encode(bArr3, i13, iMin, bArr2, 0));
            i13 += iMin;
            i14 -= iMin;
            bArr = bArr3;
        }
        return ((i12 + 2) / 3) * 4;
    }

    @Override // org.bouncycastle.util.encoders.Encoder
    public int decode(byte[] bArr, int i11, int i12, OutputStream outputStream) throws IOException {
        byte[] bArr2 = new byte[54];
        int i13 = i11 + i12;
        while (i13 > i11 && ignore((char) bArr[i13 - 1])) {
            i13--;
        }
        if (i13 == 0) {
            return 0;
        }
        int i14 = i13;
        int i15 = 0;
        while (i14 > i11 && i15 != 4) {
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
            if ((b8 | b11 | b12 | b13) < 0) {
                a.k("invalid characters encountered in base64 data");
                return 0;
            }
            bArr2[i16] = (byte) ((b8 << 2) | (b11 >> 4));
            int i23 = i16 + 2;
            bArr2[i16 + 1] = (byte) ((b11 << 4) | (b12 >> 2));
            i16 += 3;
            bArr2[i23] = (byte) ((b12 << 6) | b13);
            if (i16 == 54) {
                outputStream.write(bArr2);
                i16 = 0;
            }
            i17 += 3;
            iNextI = nextI(bArr, i22, i14);
        }
        if (i16 > 0) {
            outputStream.write(bArr2, 0, i16);
        }
        int iNextI5 = nextI(bArr, iNextI, i13);
        int iNextI6 = nextI(bArr, iNextI5 + 1, i13);
        int iNextI7 = nextI(bArr, iNextI6 + 1, i13);
        return i17 + decodeLastBlock(outputStream, (char) bArr[iNextI5], (char) bArr[iNextI6], (char) bArr[iNextI7], (char) bArr[nextI(bArr, iNextI7 + 1, i13)]);
    }
}
