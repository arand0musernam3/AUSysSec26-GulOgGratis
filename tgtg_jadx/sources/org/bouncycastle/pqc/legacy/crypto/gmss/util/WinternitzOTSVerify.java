package org.bouncycastle.pqc.legacy.crypto.gmss.util;

import org.bouncycastle.crypto.Digest;

/* JADX INFO: loaded from: classes3.dex */
public class WinternitzOTSVerify {
    private int mdsize;
    private Digest messDigestOTS;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f33674w;

    public WinternitzOTSVerify(Digest digest, int i11) {
        this.f33674w = i11;
        this.messDigestOTS = digest;
        this.mdsize = digest.getDigestSize();
    }

    private void hashSignatureBlock(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) {
        if (i12 < 1) {
            System.arraycopy(bArr, i11, bArr2, i13, this.mdsize);
            return;
        }
        this.messDigestOTS.update(bArr, i11, this.mdsize);
        while (true) {
            this.messDigestOTS.doFinal(bArr2, i13);
            i12--;
            if (i12 <= 0) {
                return;
            } else {
                this.messDigestOTS.update(bArr2, i13, this.mdsize);
            }
        }
    }

    public byte[] Verify(byte[] bArr, byte[] bArr2) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = this.mdsize;
        byte[] bArr3 = new byte[i15];
        int i16 = 0;
        this.messDigestOTS.update(bArr, 0, bArr.length);
        this.messDigestOTS.doFinal(bArr3, 0);
        int i17 = this.mdsize << 3;
        int i18 = this.f33674w;
        int i19 = ((i18 - 1) + i17) / i18;
        boolean z11 = true;
        int log = getLog((i19 << i18) + 1);
        int i21 = this.f33674w;
        int i22 = this.mdsize;
        int i23 = i22 * ((((log + i21) - 1) / i21) + i19);
        if (i23 != bArr2.length) {
            return null;
        }
        byte[] bArr4 = new byte[i23];
        char c3 = '\b';
        if (8 % i21 == 0) {
            int i24 = 8 / i21;
            int i25 = (1 << i21) - 1;
            int i26 = 0;
            int i27 = 0;
            int i28 = 0;
            while (i28 < i15) {
                int i29 = i27;
                int i31 = 0;
                while (i31 < i24) {
                    int i32 = bArr3[i28] & i25;
                    int i33 = i26 + i32;
                    int i34 = this.mdsize;
                    hashSignatureBlock(bArr2, i29 * i34, i25 - i32, bArr4, i34 * i29);
                    bArr3[i28] = (byte) (bArr3[i28] >>> this.f33674w);
                    i29++;
                    i31++;
                    i26 = i33;
                }
                i28++;
                i27 = i29;
            }
            int i35 = (i19 << this.f33674w) - i26;
            int i36 = i27;
            int i37 = 0;
            while (i37 < log) {
                int i38 = this.mdsize;
                hashSignatureBlock(bArr2, i36 * i38, i25 - (i35 & i25), bArr4, i36 * i38);
                int i39 = this.f33674w;
                i35 >>>= i39;
                i36++;
                i37 += i39;
            }
        } else {
            if (i21 >= 8) {
                if (i21 < 57) {
                    int i41 = (i22 << 3) - i21;
                    int i42 = (1 << i21) - 1;
                    byte[] bArr5 = new byte[i22];
                    int i43 = 0;
                    int i44 = 0;
                    int i45 = 0;
                    while (i43 <= i41) {
                        int i46 = i43 >>> 3;
                        int i47 = i43 % 8;
                        char c7 = c3;
                        i43 += this.f33674w;
                        int i48 = (i43 + 7) >>> 3;
                        int i49 = i16;
                        int i51 = i46;
                        long j9 = 0;
                        while (true) {
                            i14 = i41;
                            if (i51 >= i48) {
                                break;
                            }
                            j9 ^= (long) ((bArr3[i51] & 255) << (i49 << 3));
                            i49++;
                            i51++;
                            i41 = i14;
                            bArr3 = bArr3;
                        }
                        byte[] bArr6 = bArr3;
                        long j11 = i42;
                        long j12 = (j9 >>> i47) & j11;
                        i44 = (int) (((long) i44) + j12);
                        int i52 = this.mdsize;
                        System.arraycopy(bArr2, i45 * i52, bArr5, 0, i52);
                        while (j12 < j11) {
                            this.messDigestOTS.update(bArr5, 0, i22);
                            this.messDigestOTS.doFinal(bArr5, 0);
                            j12++;
                        }
                        int i53 = this.mdsize;
                        System.arraycopy(bArr5, 0, bArr4, i45 * i53, i53);
                        i45++;
                        c3 = c7;
                        i41 = i14;
                        bArr3 = bArr6;
                        i16 = 0;
                    }
                    byte[] bArr7 = bArr3;
                    int i54 = i43 >>> 3;
                    if (i54 < this.mdsize) {
                        int i55 = i43 % 8;
                        int i56 = 0;
                        long j13 = 0;
                        while (true) {
                            i13 = this.mdsize;
                            if (i54 >= i13) {
                                break;
                            }
                            j13 ^= (long) ((bArr7[i54] & 255) << (i56 << 3));
                            i56++;
                            i54++;
                        }
                        i11 = i19;
                        long j14 = i42;
                        long j15 = (j13 >>> i55) & j14;
                        i44 = (int) (((long) i44) + j15);
                        System.arraycopy(bArr2, i45 * i13, bArr5, 0, i13);
                        while (j15 < j14) {
                            this.messDigestOTS.update(bArr5, 0, i22);
                            this.messDigestOTS.doFinal(bArr5, 0);
                            j15++;
                        }
                        int i57 = this.mdsize;
                        System.arraycopy(bArr5, 0, bArr4, i45 * i57, i57);
                        i45++;
                    } else {
                        i11 = i19;
                    }
                    int i58 = (i11 << this.f33674w) - i44;
                    int i59 = 0;
                    while (i59 < log) {
                        int i61 = this.mdsize;
                        System.arraycopy(bArr2, i45 * i61, bArr5, 0, i61);
                        int i62 = i45;
                        for (long j16 = i58 & i42; j16 < i42; j16++) {
                            this.messDigestOTS.update(bArr5, 0, i22);
                            this.messDigestOTS.doFinal(bArr5, 0);
                        }
                        int i63 = this.mdsize;
                        System.arraycopy(bArr5, 0, bArr4, i62 * i63, i63);
                        int i64 = this.f33674w;
                        i58 >>>= i64;
                        i45 = i62 + 1;
                        i59 += i64;
                    }
                    i12 = 0;
                }
                this.messDigestOTS.update(bArr4, i12, i23);
                byte[] bArr8 = new byte[this.mdsize];
                this.messDigestOTS.doFinal(bArr8, i12);
                return bArr8;
            }
            int i65 = i22 / i21;
            int i66 = (1 << i21) - 1;
            int i67 = 0;
            int i68 = 0;
            int i69 = 0;
            int i71 = 0;
            while (i67 < i65) {
                int i72 = i68;
                boolean z12 = z11;
                long j17 = 0;
                for (int i73 = 0; i73 < this.f33674w; i73++) {
                    j17 ^= (long) ((bArr3[i72] & 255) << (i73 << 3));
                    i72++;
                }
                int i74 = 0;
                while (i74 < 8) {
                    int i75 = (int) (j17 & ((long) i66));
                    int i76 = i69 + i75;
                    int i77 = this.mdsize;
                    hashSignatureBlock(bArr2, i71 * i77, i66 - i75, bArr4, i77 * i71);
                    j17 >>>= this.f33674w;
                    i71++;
                    i74++;
                    i69 = i76;
                    i66 = i66;
                    i67 = i67;
                }
                i67++;
                z11 = z12;
                i68 = i72;
            }
            int i78 = i66;
            int i79 = this.mdsize % this.f33674w;
            long j18 = 0;
            for (int i81 = 0; i81 < i79; i81++) {
                j18 ^= (long) ((bArr3[i68] & 255) << (i81 << 3));
                i68++;
            }
            int i82 = i79 << 3;
            int i83 = 0;
            while (i83 < i82) {
                int i84 = (int) (j18 & ((long) i78));
                int i85 = i69 + i84;
                int i86 = this.mdsize;
                hashSignatureBlock(bArr2, i71 * i86, i78 - i84, bArr4, i71 * i86);
                int i87 = this.f33674w;
                j18 >>>= i87;
                i71++;
                i83 += i87;
                i69 = i85;
            }
            int i88 = (i19 << this.f33674w) - i69;
            int i89 = 0;
            while (i89 < log) {
                int i91 = this.mdsize;
                hashSignatureBlock(bArr2, i71 * i91, i78 - (i88 & i78), bArr4, i71 * i91);
                int i92 = this.f33674w;
                i88 >>>= i92;
                i71++;
                i89 += i92;
            }
        }
        i12 = 0;
        this.messDigestOTS.update(bArr4, i12, i23);
        byte[] bArr82 = new byte[this.mdsize];
        this.messDigestOTS.doFinal(bArr82, i12);
        return bArr82;
    }

    public int getLog(int i11) {
        int i12 = 1;
        int i13 = 2;
        while (i13 < i11) {
            i13 <<= 1;
            i12++;
        }
        return i12;
    }

    public int getSignatureLength() {
        int digestSize = this.messDigestOTS.getDigestSize();
        int i11 = this.f33674w;
        int i12 = ((i11 - 1) + (digestSize << 3)) / i11;
        int log = getLog((i12 << i11) + 1);
        return ((((log + r2) - 1) / this.f33674w) + i12) * digestSize;
    }
}
