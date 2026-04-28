package org.bouncycastle.pqc.crypto.slhdsa;

import i4.a;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.Xof;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.digests.SHA512Digest;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.crypto.generators.MGF1BytesGenerator;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.MGFParameters;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Bytes;
import org.bouncycastle.util.Memoable;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes3.dex */
abstract class SLHDSAEngine {
    final int A;
    final int D;
    final int H;
    final int H_PRIME;
    final int K;
    final int N;
    final int T;
    final int WOTS_LEN;
    final int WOTS_LEN1;
    final int WOTS_LEN2;
    final int WOTS_LOGW;
    final int WOTS_W;

    public SLHDSAEngine(int i11, int i12, int i13, int i14, int i15, int i16) {
        this.N = i11;
        if (i12 == 16) {
            this.WOTS_LOGW = 4;
            this.WOTS_LEN1 = (i11 * 8) / 4;
            if (i11 <= 8) {
                this.WOTS_LEN2 = 2;
            } else if (i11 <= 136) {
                this.WOTS_LEN2 = 3;
            } else {
                if (i11 > 256) {
                    a.f("cannot precompute SPX_WOTS_LEN2 for n outside {2, .., 256}");
                    throw null;
                }
                this.WOTS_LEN2 = 4;
            }
        } else {
            if (i12 != 256) {
                a.f("wots_w assumed 16 or 256");
                throw null;
            }
            this.WOTS_LOGW = 8;
            this.WOTS_LEN1 = (i11 * 8) / 8;
            if (i11 <= 1) {
                this.WOTS_LEN2 = 1;
            } else {
                if (i11 > 256) {
                    a.f("cannot precompute SPX_WOTS_LEN2 for n outside {2, .., 256}");
                    throw null;
                }
                this.WOTS_LEN2 = 2;
            }
        }
        this.WOTS_W = i12;
        this.WOTS_LEN = this.WOTS_LEN1 + this.WOTS_LEN2;
        this.D = i13;
        this.A = i14;
        this.K = i15;
        this.H = i16;
        this.H_PRIME = i16 / i13;
        this.T = 1 << i14;
    }

    public abstract byte[] F(byte[] bArr, ADRS adrs, byte[] bArr2);

    public abstract byte[] H(byte[] bArr, ADRS adrs, byte[] bArr2, byte[] bArr3);

    public abstract IndexedDigest H_msg(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5);

    public abstract byte[] PRF(byte[] bArr, byte[] bArr2, ADRS adrs);

    public abstract byte[] PRF_msg(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4);

    public abstract byte[] T_l(byte[] bArr, ADRS adrs, byte[] bArr2);

    public abstract void init(byte[] bArr);

    public static class Shake256Engine extends SLHDSAEngine {
        private final Xof maskDigest;
        private final Xof treeDigest;

        public Shake256Engine(int i11, int i12, int i13, int i14, int i15, int i16) {
            super(i11, i12, i13, i14, i15, i16);
            this.treeDigest = new SHAKEDigest(256);
            this.maskDigest = new SHAKEDigest(256);
        }

        @Override // org.bouncycastle.pqc.crypto.slhdsa.SLHDSAEngine
        public byte[] F(byte[] bArr, ADRS adrs, byte[] bArr2) {
            int i11 = this.N;
            byte[] bArr3 = new byte[i11];
            this.treeDigest.update(bArr, 0, bArr.length);
            Xof xof = this.treeDigest;
            byte[] bArr4 = adrs.value;
            xof.update(bArr4, 0, bArr4.length);
            this.treeDigest.update(bArr2, 0, bArr2.length);
            this.treeDigest.doFinal(bArr3, 0, i11);
            return bArr3;
        }

        @Override // org.bouncycastle.pqc.crypto.slhdsa.SLHDSAEngine
        public byte[] H(byte[] bArr, ADRS adrs, byte[] bArr2, byte[] bArr3) {
            int i11 = this.N;
            byte[] bArr4 = new byte[i11];
            this.treeDigest.update(bArr, 0, bArr.length);
            Xof xof = this.treeDigest;
            byte[] bArr5 = adrs.value;
            xof.update(bArr5, 0, bArr5.length);
            this.treeDigest.update(bArr2, 0, bArr2.length);
            this.treeDigest.update(bArr3, 0, bArr3.length);
            this.treeDigest.doFinal(bArr4, 0, i11);
            return bArr4;
        }

        @Override // org.bouncycastle.pqc.crypto.slhdsa.SLHDSAEngine
        public IndexedDigest H_msg(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
            int i11 = ((this.A * this.K) + 7) / 8;
            int i12 = this.H;
            int i13 = i12 / this.D;
            int i14 = i12 - i13;
            int i15 = (i13 + 7) / 8;
            int i16 = (i14 + 7) / 8;
            int i17 = i11 + i15 + i16;
            byte[] bArr6 = new byte[i17];
            this.treeDigest.update(bArr, 0, bArr.length);
            this.treeDigest.update(bArr2, 0, bArr2.length);
            this.treeDigest.update(bArr3, 0, bArr3.length);
            if (bArr4 != null) {
                this.treeDigest.update(bArr4, 0, bArr4.length);
            }
            this.treeDigest.update(bArr5, 0, bArr5.length);
            this.treeDigest.doFinal(bArr6, 0, i17);
            byte[] bArr7 = new byte[8];
            System.arraycopy(bArr6, i11, bArr7, 8 - i16, i16);
            long jBigEndianToLong = Pack.bigEndianToLong(bArr7, 0) & ((-1) >>> (64 - i14));
            byte[] bArr8 = new byte[4];
            System.arraycopy(bArr6, i16 + i11, bArr8, 4 - i15, i15);
            return new IndexedDigest(jBigEndianToLong, Pack.bigEndianToInt(bArr8, 0) & ((-1) >>> (32 - i13)), Arrays.copyOfRange(bArr6, 0, i11));
        }

        @Override // org.bouncycastle.pqc.crypto.slhdsa.SLHDSAEngine
        public byte[] PRF(byte[] bArr, byte[] bArr2, ADRS adrs) {
            this.treeDigest.update(bArr, 0, bArr.length);
            Xof xof = this.treeDigest;
            byte[] bArr3 = adrs.value;
            xof.update(bArr3, 0, bArr3.length);
            this.treeDigest.update(bArr2, 0, bArr2.length);
            int i11 = this.N;
            byte[] bArr4 = new byte[i11];
            this.treeDigest.doFinal(bArr4, 0, i11);
            return bArr4;
        }

        @Override // org.bouncycastle.pqc.crypto.slhdsa.SLHDSAEngine
        public byte[] PRF_msg(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
            this.treeDigest.update(bArr, 0, bArr.length);
            this.treeDigest.update(bArr2, 0, bArr2.length);
            if (bArr3 != null) {
                this.treeDigest.update(bArr3, 0, bArr3.length);
            }
            this.treeDigest.update(bArr4, 0, bArr4.length);
            int i11 = this.N;
            byte[] bArr5 = new byte[i11];
            this.treeDigest.doFinal(bArr5, 0, i11);
            return bArr5;
        }

        @Override // org.bouncycastle.pqc.crypto.slhdsa.SLHDSAEngine
        public byte[] T_l(byte[] bArr, ADRS adrs, byte[] bArr2) {
            int i11 = this.N;
            byte[] bArr3 = new byte[i11];
            this.treeDigest.update(bArr, 0, bArr.length);
            Xof xof = this.treeDigest;
            byte[] bArr4 = adrs.value;
            xof.update(bArr4, 0, bArr4.length);
            this.treeDigest.update(bArr2, 0, bArr2.length);
            this.treeDigest.doFinal(bArr3, 0, i11);
            return bArr3;
        }

        public byte[] bitmask(byte[] bArr, ADRS adrs, byte[] bArr2, byte[] bArr3) {
            int length = bArr2.length + bArr3.length;
            byte[] bArr4 = new byte[length];
            this.maskDigest.update(bArr, 0, bArr.length);
            Xof xof = this.maskDigest;
            byte[] bArr5 = adrs.value;
            xof.update(bArr5, 0, bArr5.length);
            this.maskDigest.doFinal(bArr4, 0, length);
            Bytes.xorTo(bArr2.length, bArr2, bArr4);
            Bytes.xorTo(bArr3.length, bArr3, 0, bArr4, bArr2.length);
            return bArr4;
        }

        @Override // org.bouncycastle.pqc.crypto.slhdsa.SLHDSAEngine
        public void init(byte[] bArr) {
        }

        public byte[] bitmask(byte[] bArr, ADRS adrs, byte[] bArr2) {
            int length = bArr2.length;
            byte[] bArr3 = new byte[length];
            this.maskDigest.update(bArr, 0, bArr.length);
            Xof xof = this.maskDigest;
            byte[] bArr4 = adrs.value;
            xof.update(bArr4, 0, bArr4.length);
            this.maskDigest.doFinal(bArr3, 0, length);
            Bytes.xorTo(bArr2.length, bArr2, bArr3);
            return bArr3;
        }
    }

    public static class Sha2Engine extends SLHDSAEngine {

        /* JADX INFO: renamed from: bl, reason: collision with root package name */
        private final int f33595bl;
        private final byte[] hmacBuf;
        private final MGF1BytesGenerator mgf1;
        private final Digest msgDigest;
        private final byte[] msgDigestBuf;
        private Memoable msgMemo;
        private final Digest sha256;
        private final byte[] sha256Buf;
        private Memoable sha256Memo;
        private final HMac treeHMac;

        public Sha2Engine(int i11, int i12, int i13, int i14, int i15, int i16) {
            int i17;
            super(i11, i12, i13, i14, i15, i16);
            SHA256Digest sHA256Digest = new SHA256Digest();
            this.sha256 = sHA256Digest;
            this.sha256Buf = new byte[sHA256Digest.getDigestSize()];
            if (i11 == 16) {
                this.msgDigest = new SHA256Digest();
                this.treeHMac = new HMac(new SHA256Digest());
                this.mgf1 = new MGF1BytesGenerator(new SHA256Digest());
                i17 = 64;
            } else {
                this.msgDigest = new SHA512Digest();
                this.treeHMac = new HMac(new SHA512Digest());
                this.mgf1 = new MGF1BytesGenerator(new SHA512Digest());
                i17 = 128;
            }
            this.f33595bl = i17;
            this.hmacBuf = new byte[this.treeHMac.getMacSize()];
            this.msgDigestBuf = new byte[this.msgDigest.getDigestSize()];
        }

        private byte[] compressedADRS(ADRS adrs) {
            byte[] bArr = new byte[22];
            System.arraycopy(adrs.value, 3, bArr, 0, 1);
            System.arraycopy(adrs.value, 8, bArr, 1, 8);
            System.arraycopy(adrs.value, 19, bArr, 9, 1);
            System.arraycopy(adrs.value, 20, bArr, 10, 12);
            return bArr;
        }

        @Override // org.bouncycastle.pqc.crypto.slhdsa.SLHDSAEngine
        public byte[] F(byte[] bArr, ADRS adrs, byte[] bArr2) {
            byte[] bArrCompressedADRS = compressedADRS(adrs);
            ((Memoable) this.sha256).reset(this.sha256Memo);
            this.sha256.update(bArrCompressedADRS, 0, bArrCompressedADRS.length);
            this.sha256.update(bArr2, 0, bArr2.length);
            this.sha256.doFinal(this.sha256Buf, 0);
            return Arrays.copyOfRange(this.sha256Buf, 0, this.N);
        }

        @Override // org.bouncycastle.pqc.crypto.slhdsa.SLHDSAEngine
        public byte[] H(byte[] bArr, ADRS adrs, byte[] bArr2, byte[] bArr3) {
            byte[] bArrCompressedADRS = compressedADRS(adrs);
            ((Memoable) this.msgDigest).reset(this.msgMemo);
            this.msgDigest.update(bArrCompressedADRS, 0, bArrCompressedADRS.length);
            this.msgDigest.update(bArr2, 0, bArr2.length);
            this.msgDigest.update(bArr3, 0, bArr3.length);
            this.msgDigest.doFinal(this.msgDigestBuf, 0);
            return Arrays.copyOfRange(this.msgDigestBuf, 0, this.N);
        }

        @Override // org.bouncycastle.pqc.crypto.slhdsa.SLHDSAEngine
        public IndexedDigest H_msg(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
            int i11 = ((this.A * this.K) + 7) / 8;
            int i12 = this.H;
            int i13 = i12 / this.D;
            int i14 = i12 - i13;
            int i15 = (i13 + 7) / 8;
            int i16 = (i14 + 7) / 8;
            byte[] bArr6 = new byte[i11 + i15 + i16];
            byte[] bArr7 = new byte[this.msgDigest.getDigestSize()];
            this.msgDigest.update(bArr, 0, bArr.length);
            this.msgDigest.update(bArr2, 0, bArr2.length);
            this.msgDigest.update(bArr3, 0, bArr3.length);
            if (bArr4 != null) {
                this.msgDigest.update(bArr4, 0, bArr4.length);
            }
            this.msgDigest.update(bArr5, 0, bArr5.length);
            this.msgDigest.doFinal(bArr7, 0);
            byte[] bArrBitmask = bitmask(Arrays.concatenate(bArr, bArr2, bArr7), bArr6);
            byte[] bArr8 = new byte[8];
            System.arraycopy(bArrBitmask, i11, bArr8, 8 - i16, i16);
            long jBigEndianToLong = Pack.bigEndianToLong(bArr8, 0) & ((-1) >>> (64 - i14));
            byte[] bArr9 = new byte[4];
            System.arraycopy(bArrBitmask, i16 + i11, bArr9, 4 - i15, i15);
            return new IndexedDigest(jBigEndianToLong, Pack.bigEndianToInt(bArr9, 0) & ((-1) >>> (32 - i13)), Arrays.copyOfRange(bArrBitmask, 0, i11));
        }

        @Override // org.bouncycastle.pqc.crypto.slhdsa.SLHDSAEngine
        public byte[] PRF(byte[] bArr, byte[] bArr2, ADRS adrs) {
            int length = bArr2.length;
            ((Memoable) this.sha256).reset(this.sha256Memo);
            byte[] bArrCompressedADRS = compressedADRS(adrs);
            this.sha256.update(bArrCompressedADRS, 0, bArrCompressedADRS.length);
            this.sha256.update(bArr2, 0, bArr2.length);
            this.sha256.doFinal(this.sha256Buf, 0);
            return Arrays.copyOfRange(this.sha256Buf, 0, length);
        }

        @Override // org.bouncycastle.pqc.crypto.slhdsa.SLHDSAEngine
        public byte[] PRF_msg(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
            this.treeHMac.init(new KeyParameter(bArr));
            this.treeHMac.update(bArr2, 0, bArr2.length);
            if (bArr3 != null) {
                this.treeHMac.update(bArr3, 0, bArr3.length);
            }
            this.treeHMac.update(bArr4, 0, bArr4.length);
            this.treeHMac.doFinal(this.hmacBuf, 0);
            return Arrays.copyOfRange(this.hmacBuf, 0, this.N);
        }

        @Override // org.bouncycastle.pqc.crypto.slhdsa.SLHDSAEngine
        public byte[] T_l(byte[] bArr, ADRS adrs, byte[] bArr2) {
            byte[] bArrCompressedADRS = compressedADRS(adrs);
            ((Memoable) this.msgDigest).reset(this.msgMemo);
            this.msgDigest.update(bArrCompressedADRS, 0, bArrCompressedADRS.length);
            this.msgDigest.update(bArr2, 0, bArr2.length);
            this.msgDigest.doFinal(this.msgDigestBuf, 0);
            return Arrays.copyOfRange(this.msgDigestBuf, 0, this.N);
        }

        public byte[] bitmask(byte[] bArr, byte[] bArr2, byte[] bArr3) {
            int length = bArr2.length + bArr3.length;
            byte[] bArr4 = new byte[length];
            this.mgf1.init(new MGFParameters(bArr));
            this.mgf1.generateBytes(bArr4, 0, length);
            Bytes.xorTo(bArr2.length, bArr2, bArr4);
            Bytes.xorTo(bArr3.length, bArr3, 0, bArr4, bArr2.length);
            return bArr4;
        }

        public byte[] bitmask256(byte[] bArr, byte[] bArr2) {
            int length = bArr2.length;
            byte[] bArr3 = new byte[length];
            MGF1BytesGenerator mGF1BytesGenerator = new MGF1BytesGenerator(new SHA256Digest());
            mGF1BytesGenerator.init(new MGFParameters(bArr));
            mGF1BytesGenerator.generateBytes(bArr3, 0, length);
            Bytes.xorTo(bArr2.length, bArr2, bArr3);
            return bArr3;
        }

        @Override // org.bouncycastle.pqc.crypto.slhdsa.SLHDSAEngine
        public void init(byte[] bArr) {
            byte[] bArr2 = new byte[this.f33595bl];
            this.msgDigest.update(bArr, 0, bArr.length);
            this.msgDigest.update(bArr2, 0, this.f33595bl - this.N);
            this.msgMemo = ((Memoable) this.msgDigest).copy();
            this.msgDigest.reset();
            this.sha256.update(bArr, 0, bArr.length);
            this.sha256.update(bArr2, 0, 64 - bArr.length);
            this.sha256Memo = ((Memoable) this.sha256).copy();
            this.sha256.reset();
        }

        public byte[] bitmask(byte[] bArr, byte[] bArr2) {
            int length = bArr2.length;
            byte[] bArr3 = new byte[length];
            this.mgf1.init(new MGFParameters(bArr));
            this.mgf1.generateBytes(bArr3, 0, length);
            Bytes.xorTo(bArr2.length, bArr2, bArr3);
            return bArr3;
        }
    }
}
