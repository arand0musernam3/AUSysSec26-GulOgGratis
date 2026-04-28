package org.bouncycastle.crypto.engines;

import i4.a;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.bouncycastle.crypto.engines.AEADBaseEngine;
import org.bouncycastle.crypto.engines.AsconPermutationFriend;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Bytes;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes3.dex */
public class ISAPEngine extends AEADBaseEngine {
    private static final int ISAP_STATE_SZ = 40;
    private final ISAP_AEAD ISAPAEAD;
    private int ISAP_rH;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private byte[] f33120k;
    private byte[] npub;

    /* JADX INFO: renamed from: org.bouncycastle.crypto.engines.ISAPEngine$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$bouncycastle$crypto$engines$ISAPEngine$IsapType;

        static {
            int[] iArr = new int[IsapType.values().length];
            $SwitchMap$org$bouncycastle$crypto$engines$ISAPEngine$IsapType = iArr;
            try {
                iArr[IsapType.ISAP_A_128A.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$engines$ISAPEngine$IsapType[IsapType.ISAP_K_128A.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$engines$ISAPEngine$IsapType[IsapType.ISAP_A_128.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$engines$ISAPEngine$IsapType[IsapType.ISAP_K_128.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public abstract class ISAPAEAD_A implements ISAP_AEAD {
        protected long ISAP_IV1_64;
        protected long ISAP_IV2_64;
        protected long ISAP_IV3_64;
        protected long[] k64;
        AsconPermutationFriend.AsconPermutation mac;
        protected long[] npub64;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        AsconPermutationFriend.AsconPermutation f33121p;

        public ISAPAEAD_A() {
            ISAPEngine.this.ISAP_rH = 64;
            ISAPEngine.this.BlockSize = (ISAPEngine.this.ISAP_rH + 7) >> 3;
            this.f33121p = new AsconPermutationFriend.AsconPermutation();
            this.mac = new AsconPermutationFriend.AsconPermutation();
        }

        private int getLongSize(int i11) {
            return (i11 + 7) >>> 3;
        }

        private void isap_rk(AsconPermutationFriend.AsconPermutation asconPermutation, long j9, byte[] bArr, int i11) {
            long[] jArr = this.k64;
            int i12 = 0;
            asconPermutation.set(jArr[0], jArr[1], j9, 0L, 0L);
            asconPermutation.p(12);
            while (true) {
                int i13 = (i11 << 3) - 1;
                long j11 = asconPermutation.f33096x0;
                if (i12 >= i13) {
                    asconPermutation.f33096x0 = j11 ^ ((((long) bArr[i11 - 1]) & 1) << 63);
                    asconPermutation.p(12);
                    return;
                } else {
                    asconPermutation.f33096x0 = j11 ^ ((((long) (((bArr[i12 >>> 3] >>> (7 - (i12 & 7))) & 1) << 7)) & 255) << 56);
                    PX2(asconPermutation);
                    i12++;
                }
            }
        }

        public abstract void PX1(AsconPermutationFriend.AsconPermutation asconPermutation);

        public abstract void PX2(AsconPermutationFriend.AsconPermutation asconPermutation);

        @Override // org.bouncycastle.crypto.engines.ISAPEngine.ISAP_AEAD
        public void absorbFinalAADBlock() {
            int i11 = 0;
            while (true) {
                ISAPEngine iSAPEngine = ISAPEngine.this;
                int i12 = iSAPEngine.m_aadPos;
                AsconPermutationFriend.AsconPermutation asconPermutation = this.mac;
                if (i11 >= i12) {
                    asconPermutation.f33096x0 ^= 128 << ((7 - i12) << 3);
                    asconPermutation.p(12);
                    this.mac.f33100x4 ^= 1;
                    return;
                }
                asconPermutation.f33096x0 = ((((long) iSAPEngine.m_aad[i11]) & 255) << ((7 - i11) << 3)) ^ asconPermutation.f33096x0;
                i11++;
            }
        }

        @Override // org.bouncycastle.crypto.engines.ISAPEngine.ISAP_AEAD
        public void absorbMacBlock(byte[] bArr, int i11) {
            AsconPermutationFriend.AsconPermutation asconPermutation = this.mac;
            asconPermutation.f33096x0 = Pack.bigEndianToLong(bArr, i11) ^ asconPermutation.f33096x0;
            this.mac.p(12);
        }

        @Override // org.bouncycastle.crypto.engines.ISAPEngine.ISAP_AEAD
        public void init() {
            this.npub64 = new long[getLongSize(ISAPEngine.this.npub.length)];
            this.k64 = new long[getLongSize(ISAPEngine.this.f33120k.length)];
            Pack.bigEndianToLong(ISAPEngine.this.npub, 0, this.npub64);
            Pack.bigEndianToLong(ISAPEngine.this.f33120k, 0, this.k64);
        }

        @Override // org.bouncycastle.crypto.engines.ISAPEngine.ISAP_AEAD
        public void processEncBlock(byte[] bArr, int i11, byte[] bArr2, int i12) {
            Pack.longToBigEndian(Pack.bigEndianToLong(bArr, i11) ^ this.f33121p.f33096x0, bArr2, i12);
            PX1(this.f33121p);
        }

        @Override // org.bouncycastle.crypto.engines.ISAPEngine.ISAP_AEAD
        public void processEncFinalBlock(byte[] bArr, int i11) {
            byte[] bArrLongToLittleEndian = Pack.longToLittleEndian(this.f33121p.f33096x0);
            ISAPEngine iSAPEngine = ISAPEngine.this;
            int i12 = iSAPEngine.m_bufPos;
            Bytes.xor(i12, bArrLongToLittleEndian, iSAPEngine.BlockSize - i12, iSAPEngine.m_buf, 0, bArr, i11);
        }

        @Override // org.bouncycastle.crypto.engines.ISAPEngine.ISAP_AEAD
        public void processMACFinal(byte[] bArr, int i11, int i12, byte[] bArr2) {
            int i13 = i11;
            int i14 = 0;
            while (true) {
                AsconPermutationFriend.AsconPermutation asconPermutation = this.mac;
                if (i14 >= i12) {
                    asconPermutation.f33096x0 ^= 128 << ((7 - i12) << 3);
                    asconPermutation.p(12);
                    Pack.longToBigEndian(this.mac.f33096x0, bArr2, 0);
                    Pack.longToBigEndian(this.mac.f33097x1, bArr2, 8);
                    AsconPermutationFriend.AsconPermutation asconPermutation2 = this.mac;
                    long j9 = asconPermutation2.f33098x2;
                    long j11 = asconPermutation2.f33099x3;
                    long j12 = asconPermutation2.f33100x4;
                    isap_rk(asconPermutation2, this.ISAP_IV2_64, bArr2, ISAPEngine.this.KEY_SIZE);
                    AsconPermutationFriend.AsconPermutation asconPermutation3 = this.mac;
                    asconPermutation3.f33098x2 = j9;
                    asconPermutation3.f33099x3 = j11;
                    asconPermutation3.f33100x4 = j12;
                    asconPermutation3.p(12);
                    Pack.longToBigEndian(this.mac.f33096x0, bArr2, 0);
                    Pack.longToBigEndian(this.mac.f33097x1, bArr2, 8);
                    return;
                }
                asconPermutation.f33096x0 ^= (((long) bArr[i13]) & 255) << ((7 - i14) << 3);
                i14++;
                i13++;
            }
        }

        @Override // org.bouncycastle.crypto.engines.ISAPEngine.ISAP_AEAD
        public void reset() {
            isap_rk(this.f33121p, this.ISAP_IV3_64, ISAPEngine.this.npub, ISAPEngine.this.IV_SIZE);
            AsconPermutationFriend.AsconPermutation asconPermutation = this.f33121p;
            long[] jArr = this.npub64;
            asconPermutation.f33099x3 = jArr[0];
            asconPermutation.f33100x4 = jArr[1];
            PX1(asconPermutation);
            AsconPermutationFriend.AsconPermutation asconPermutation2 = this.mac;
            long[] jArr2 = this.npub64;
            asconPermutation2.set(jArr2[0], jArr2[1], this.ISAP_IV1_64, 0L, 0L);
            this.mac.p(12);
        }
    }

    public class ISAPAEAD_A_128 extends ISAPAEAD_A {
        public ISAPAEAD_A_128() {
            super();
            this.ISAP_IV1_64 = 108156764298152972L;
            this.ISAP_IV2_64 = 180214358336080908L;
            this.ISAP_IV3_64 = 252271952374008844L;
        }

        @Override // org.bouncycastle.crypto.engines.ISAPEngine.ISAPAEAD_A
        public void PX1(AsconPermutationFriend.AsconPermutation asconPermutation) {
            asconPermutation.p(12);
        }

        @Override // org.bouncycastle.crypto.engines.ISAPEngine.ISAPAEAD_A
        public void PX2(AsconPermutationFriend.AsconPermutation asconPermutation) {
            asconPermutation.p(12);
        }
    }

    public class ISAPAEAD_A_128A extends ISAPAEAD_A {
        public ISAPAEAD_A_128A() {
            super();
            this.ISAP_IV1_64 = 108156764297430540L;
            this.ISAP_IV2_64 = 180214358335358476L;
            this.ISAP_IV3_64 = 252271952373286412L;
        }

        @Override // org.bouncycastle.crypto.engines.ISAPEngine.ISAPAEAD_A
        public void PX1(AsconPermutationFriend.AsconPermutation asconPermutation) {
            asconPermutation.p(6);
        }

        @Override // org.bouncycastle.crypto.engines.ISAPEngine.ISAPAEAD_A
        public void PX2(AsconPermutationFriend.AsconPermutation asconPermutation) {
            asconPermutation.round(75L);
        }
    }

    public abstract class ISAPAEAD_K implements ISAP_AEAD {
        protected short[] ISAP_IV1_16;
        protected short[] ISAP_IV2_16;
        protected short[] ISAP_IV3_16;
        protected final int ISAP_STATE_SZ_CRYPTO_NPUBBYTES;
        protected short[] iv16;
        protected short[] k16;
        private final int[] KeccakF400RoundConstants = {1, 32898, 32906, 32768, 32907, 1, 32897, 32777, 138, 136, 32777, 10, 32907, 139, 32905, 32771, 32770, 128, 32778, 10};
        protected short[] SX = new short[25];
        protected short[] macSX = new short[25];
        protected short[] E = new short[25];
        protected short[] C = new short[5];
        protected short[] macE = new short[25];
        protected short[] macC = new short[5];

        public ISAPAEAD_K() {
            this.ISAP_STATE_SZ_CRYPTO_NPUBBYTES = 40 - ISAPEngine.this.IV_SIZE;
            ISAPEngine.this.ISAP_rH = 144;
            ISAPEngine.this.BlockSize = (ISAPEngine.this.ISAP_rH + 7) >> 3;
        }

        private short ROL16(short s7, int i11) {
            int i12 = s7 & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH;
            return (short) ((i12 >>> (16 - i11)) ^ (i12 << i11));
        }

        private void byteToShortXor(byte[] bArr, int i11, short[] sArr, int i12) {
            for (int i13 = 0; i13 < i12; i13++) {
                sArr[i13] = (short) (sArr[i13] ^ Pack.littleEndianToShort(bArr, (i13 << 1) + i11));
            }
        }

        public abstract void PermuteRoundsBX(short[] sArr, short[] sArr2, short[] sArr3);

        public abstract void PermuteRoundsHX(short[] sArr, short[] sArr2, short[] sArr3);

        public abstract void PermuteRoundsKX(short[] sArr, short[] sArr2, short[] sArr3);

        @Override // org.bouncycastle.crypto.engines.ISAPEngine.ISAP_AEAD
        public void absorbFinalAADBlock() {
            int i11 = 0;
            while (true) {
                ISAPEngine iSAPEngine = ISAPEngine.this;
                int i12 = iSAPEngine.m_aadPos;
                short[] sArr = this.macSX;
                if (i11 >= i12) {
                    int i13 = i12 >> 1;
                    sArr[i13] = (short) (sArr[i13] ^ (128 << ((i12 & 1) << 3)));
                    PermuteRoundsHX(sArr, this.macE, this.macC);
                    short[] sArr2 = this.macSX;
                    sArr2[24] = (short) (sArr2[24] ^ 256);
                    return;
                }
                int i14 = i11 >> 1;
                sArr[i14] = (short) (((iSAPEngine.m_aad[i11] & 255) << ((i11 & 1) << 3)) ^ sArr[i14]);
                i11++;
            }
        }

        @Override // org.bouncycastle.crypto.engines.ISAPEngine.ISAP_AEAD
        public void absorbMacBlock(byte[] bArr, int i11) {
            byteToShortXor(bArr, i11, this.macSX, ISAPEngine.this.BlockSize >> 1);
            PermuteRoundsHX(this.macSX, this.macE, this.macC);
        }

        @Override // org.bouncycastle.crypto.engines.ISAPEngine.ISAP_AEAD
        public void init() {
            this.k16 = new short[ISAPEngine.this.f33120k.length >> 1];
            byte[] bArr = ISAPEngine.this.f33120k;
            short[] sArr = this.k16;
            Pack.littleEndianToShort(bArr, 0, sArr, 0, sArr.length);
            this.iv16 = new short[ISAPEngine.this.npub.length >> 1];
            byte[] bArr2 = ISAPEngine.this.npub;
            short[] sArr2 = this.iv16;
            Pack.littleEndianToShort(bArr2, 0, sArr2, 0, sArr2.length);
        }

        public void isap_rk(short[] sArr, byte[] bArr, int i11, short[] sArr2, int i12, short[] sArr3) {
            short[] sArr4 = new short[25];
            short[] sArr5 = new short[25];
            System.arraycopy(this.k16, 0, sArr4, 0, 8);
            System.arraycopy(sArr, 0, sArr4, 8, 4);
            PermuteRoundsKX(sArr4, sArr5, sArr3);
            for (int i13 = 0; i13 < (i11 << 3) - 1; i13++) {
                sArr4[0] = (short) (sArr4[0] ^ (((bArr[i13 >> 3] >>> (7 - (i13 & 7))) & 1) << 7));
                PermuteRoundsBX(sArr4, sArr5, sArr3);
            }
            sArr4[0] = (short) (sArr4[0] ^ ((bArr[i11 - 1] & 1) << 7));
            PermuteRoundsKX(sArr4, sArr5, sArr3);
            System.arraycopy(sArr4, 0, sArr2, 0, i12 == this.ISAP_STATE_SZ_CRYPTO_NPUBBYTES ? 17 : 8);
        }

        public void prepareThetaX(short[] sArr, short[] sArr2) {
            sArr2[0] = (short) ((((sArr[0] ^ sArr[5]) ^ sArr[10]) ^ sArr[15]) ^ sArr[20]);
            sArr2[1] = (short) ((((sArr[1] ^ sArr[6]) ^ sArr[11]) ^ sArr[16]) ^ sArr[21]);
            sArr2[2] = (short) ((((sArr[2] ^ sArr[7]) ^ sArr[12]) ^ sArr[17]) ^ sArr[22]);
            sArr2[3] = (short) ((((sArr[3] ^ sArr[8]) ^ sArr[13]) ^ sArr[18]) ^ sArr[23]);
            sArr2[4] = (short) (sArr[24] ^ (((sArr[4] ^ sArr[9]) ^ sArr[14]) ^ sArr[19]));
        }

        @Override // org.bouncycastle.crypto.engines.ISAPEngine.ISAP_AEAD
        public void processEncBlock(byte[] bArr, int i11, byte[] bArr2, int i12) {
            int i13 = 0;
            while (true) {
                int i14 = ISAPEngine.this.BlockSize;
                short[] sArr = this.SX;
                if (i13 >= i14) {
                    PermuteRoundsKX(sArr, this.E, this.C);
                    return;
                }
                bArr2[i12] = (byte) (bArr[i11] ^ (sArr[i13 >> 1] >>> ((i13 & 1) << 3)));
                i13++;
                i12++;
                i11++;
            }
        }

        @Override // org.bouncycastle.crypto.engines.ISAPEngine.ISAP_AEAD
        public void processEncFinalBlock(byte[] bArr, int i11) {
            int i12 = 0;
            while (true) {
                ISAPEngine iSAPEngine = ISAPEngine.this;
                if (i12 >= iSAPEngine.m_bufPos) {
                    return;
                }
                bArr[i11] = (byte) (iSAPEngine.m_buf[i12] ^ (this.SX[i12 >> 1] >>> ((i12 & 1) << 3)));
                i12++;
                i11++;
            }
        }

        @Override // org.bouncycastle.crypto.engines.ISAPEngine.ISAP_AEAD
        public void processMACFinal(byte[] bArr, int i11, int i12, byte[] bArr2) {
            int i13 = 0;
            while (true) {
                short[] sArr = this.macSX;
                if (i13 >= i12) {
                    int i14 = i12 >> 1;
                    sArr[i14] = (short) (sArr[i14] ^ (128 << ((i12 & 1) << 3)));
                    PermuteRoundsHX(sArr, this.macE, this.macC);
                    Pack.shortToLittleEndian(this.macSX, 0, 8, bArr2, 0);
                    short[] sArr2 = this.ISAP_IV2_16;
                    int i15 = ISAPEngine.this.KEY_SIZE;
                    isap_rk(sArr2, bArr2, i15, this.macSX, i15, this.macC);
                    PermuteRoundsHX(this.macSX, this.macE, this.macC);
                    Pack.shortToLittleEndian(this.macSX, 0, 8, bArr2, 0);
                    return;
                }
                int i16 = i13 >> 1;
                sArr[i16] = (short) (((bArr[i11] & 255) << ((i13 & 1) << 3)) ^ sArr[i16]);
                i13++;
                i11++;
            }
        }

        @Override // org.bouncycastle.crypto.engines.ISAPEngine.ISAP_AEAD
        public void reset() {
            Arrays.fill(this.SX, (short) 0);
            isap_rk(this.ISAP_IV3_16, ISAPEngine.this.npub, ISAPEngine.this.IV_SIZE, this.SX, this.ISAP_STATE_SZ_CRYPTO_NPUBBYTES, this.C);
            System.arraycopy(this.iv16, 0, this.SX, 17, 8);
            PermuteRoundsKX(this.SX, this.E, this.C);
            Arrays.fill(this.macSX, 12, 25, (short) 0);
            System.arraycopy(this.iv16, 0, this.macSX, 0, 8);
            System.arraycopy(this.ISAP_IV1_16, 0, this.macSX, 8, 4);
            PermuteRoundsHX(this.macSX, this.macE, this.macC);
        }

        public void rounds12X(short[] sArr, short[] sArr2, short[] sArr3) {
            prepareThetaX(sArr, sArr3);
            rounds_8_18(sArr, sArr2, sArr3);
        }

        public void rounds_12_18(short[] sArr, short[] sArr2, short[] sArr3) {
            thetaRhoPiChiIotaPrepareTheta(12, sArr, sArr2, sArr3);
            thetaRhoPiChiIotaPrepareTheta(13, sArr2, sArr, sArr3);
            thetaRhoPiChiIotaPrepareTheta(14, sArr, sArr2, sArr3);
            thetaRhoPiChiIotaPrepareTheta(15, sArr2, sArr, sArr3);
            thetaRhoPiChiIotaPrepareTheta(16, sArr, sArr2, sArr3);
            thetaRhoPiChiIotaPrepareTheta(17, sArr2, sArr, sArr3);
            thetaRhoPiChiIotaPrepareTheta(18, sArr, sArr2, sArr3);
            thetaRhoPiChiIota(sArr2, sArr, sArr3);
        }

        public void rounds_4_18(short[] sArr, short[] sArr2, short[] sArr3) {
            thetaRhoPiChiIotaPrepareTheta(4, sArr, sArr2, sArr3);
            thetaRhoPiChiIotaPrepareTheta(5, sArr2, sArr, sArr3);
            thetaRhoPiChiIotaPrepareTheta(6, sArr, sArr2, sArr3);
            thetaRhoPiChiIotaPrepareTheta(7, sArr2, sArr, sArr3);
            rounds_8_18(sArr, sArr2, sArr3);
        }

        public void rounds_8_18(short[] sArr, short[] sArr2, short[] sArr3) {
            thetaRhoPiChiIotaPrepareTheta(8, sArr, sArr2, sArr3);
            thetaRhoPiChiIotaPrepareTheta(9, sArr2, sArr, sArr3);
            thetaRhoPiChiIotaPrepareTheta(10, sArr, sArr2, sArr3);
            thetaRhoPiChiIotaPrepareTheta(11, sArr2, sArr, sArr3);
            rounds_12_18(sArr, sArr2, sArr3);
        }

        public void thetaRhoPiChiIota(short[] sArr, short[] sArr2, short[] sArr3) {
            short sROL16 = (short) (sArr3[4] ^ ROL16(sArr3[1], 1));
            short sROL162 = (short) (sArr3[0] ^ ROL16(sArr3[2], 1));
            short sROL163 = (short) (sArr3[1] ^ ROL16(sArr3[3], 1));
            short sROL164 = (short) (sArr3[2] ^ ROL16(sArr3[4], 1));
            short sROL165 = (short) (sArr3[3] ^ ROL16(sArr3[0], 1));
            short s7 = (short) (sArr[0] ^ sROL16);
            sArr[0] = s7;
            short s8 = (short) (sArr[6] ^ sROL162);
            sArr[6] = s8;
            short sROL166 = ROL16(s8, 12);
            short s11 = (short) (sArr[12] ^ sROL163);
            sArr[12] = s11;
            short sROL167 = ROL16(s11, 11);
            short s12 = (short) (sArr[18] ^ sROL164);
            sArr[18] = s12;
            short sROL168 = ROL16(s12, 5);
            short s13 = (short) (sArr[24] ^ sROL165);
            sArr[24] = s13;
            short sROL169 = ROL16(s13, 14);
            sArr2[0] = (short) (this.KeccakF400RoundConstants[19] ^ (((~sROL166) & sROL167) ^ s7));
            sArr2[1] = (short) (((~sROL167) & sROL168) ^ sROL166);
            sArr2[2] = (short) (((~sROL168) & sROL169) ^ sROL167);
            sArr2[3] = (short) (((~sROL169) & s7) ^ sROL168);
            sArr2[4] = (short) (((~s7) & sROL166) ^ sROL169);
            short s14 = (short) (sArr[3] ^ sROL164);
            sArr[3] = s14;
            short sROL1610 = ROL16(s14, 12);
            short s15 = (short) (sArr[9] ^ sROL165);
            sArr[9] = s15;
            short sROL1611 = ROL16(s15, 4);
            short s16 = (short) (sArr[10] ^ sROL16);
            sArr[10] = s16;
            short sROL1612 = ROL16(s16, 3);
            short s17 = (short) (sArr[16] ^ sROL162);
            sArr[16] = s17;
            short sROL1613 = ROL16(s17, 13);
            short s18 = (short) (sArr[22] ^ sROL163);
            sArr[22] = s18;
            short sROL1614 = ROL16(s18, 13);
            sArr2[5] = (short) (((~sROL1611) & sROL1612) ^ sROL1610);
            sArr2[6] = (short) (((~sROL1612) & sROL1613) ^ sROL1611);
            sArr2[7] = (short) (sROL1612 ^ ((~sROL1613) & sROL1614));
            sArr2[8] = (short) (((~sROL1614) & sROL1610) ^ sROL1613);
            sArr2[9] = (short) (((~sROL1610) & sROL1611) ^ sROL1614);
            short s19 = (short) (sArr[1] ^ sROL162);
            sArr[1] = s19;
            short sROL1615 = ROL16(s19, 1);
            short s21 = (short) (sArr[7] ^ sROL163);
            sArr[7] = s21;
            short sROL1616 = ROL16(s21, 6);
            short s22 = (short) (sArr[13] ^ sROL164);
            sArr[13] = s22;
            short sROL1617 = ROL16(s22, 9);
            short s23 = (short) (sArr[19] ^ sROL165);
            sArr[19] = s23;
            short sROL1618 = ROL16(s23, 8);
            short s24 = (short) (sArr[20] ^ sROL16);
            sArr[20] = s24;
            short sROL1619 = ROL16(s24, 2);
            sArr2[10] = (short) (((~sROL1616) & sROL1617) ^ sROL1615);
            sArr2[11] = (short) (((~sROL1617) & sROL1618) ^ sROL1616);
            sArr2[12] = (short) (((~sROL1618) & sROL1619) ^ sROL1617);
            sArr2[13] = (short) (((~sROL1619) & sROL1615) ^ sROL1618);
            sArr2[14] = (short) (((~sROL1615) & sROL1616) ^ sROL1619);
            short s25 = (short) (sArr[4] ^ sROL165);
            sArr[4] = s25;
            short sROL1620 = ROL16(s25, 11);
            short s26 = (short) (sArr[5] ^ sROL16);
            sArr[5] = s26;
            short sROL1621 = ROL16(s26, 4);
            short s27 = (short) (sArr[11] ^ sROL162);
            sArr[11] = s27;
            short sROL1622 = ROL16(s27, 10);
            short s28 = (short) (sArr[17] ^ sROL163);
            sArr[17] = s28;
            short sROL1623 = ROL16(s28, 15);
            short s29 = (short) (sArr[23] ^ sROL164);
            sArr[23] = s29;
            short sROL1624 = ROL16(s29, 8);
            sArr2[15] = (short) (((~sROL1621) & sROL1622) ^ sROL1620);
            sArr2[16] = (short) (((~sROL1622) & sROL1623) ^ sROL1621);
            sArr2[17] = (short) (sROL1622 ^ ((~sROL1623) & sROL1624));
            sArr2[18] = (short) (((~sROL1624) & sROL1620) ^ sROL1623);
            sArr2[19] = (short) ((sROL1621 & (~sROL1620)) ^ sROL1624);
            short s31 = (short) (sArr[2] ^ sROL163);
            sArr[2] = s31;
            short sROL1625 = ROL16(s31, 14);
            short s32 = (short) (sArr[8] ^ sROL164);
            sArr[8] = s32;
            short sROL1626 = ROL16(s32, 7);
            short s33 = (short) (sArr[14] ^ sROL165);
            sArr[14] = s33;
            short sROL1627 = ROL16(s33, 7);
            short s34 = (short) (sROL16 ^ sArr[15]);
            sArr[15] = s34;
            short sROL1628 = ROL16(s34, 9);
            short s35 = (short) (sROL162 ^ sArr[21]);
            sArr[21] = s35;
            short sROL1629 = ROL16(s35, 2);
            sArr2[20] = (short) (((~sROL1626) & sROL1627) ^ sROL1625);
            sArr2[21] = (short) (((~sROL1627) & sROL1628) ^ sROL1626);
            sArr2[22] = (short) (sROL1627 ^ ((~sROL1628) & sROL1629));
            sArr2[23] = (short) (sROL1628 ^ ((~sROL1629) & sROL1625));
            sArr2[24] = (short) (((~sROL1625) & sROL1626) ^ sROL1629);
        }

        public void thetaRhoPiChiIotaPrepareTheta(int i11, short[] sArr, short[] sArr2, short[] sArr3) {
            short sROL16 = (short) (sArr3[4] ^ ROL16(sArr3[1], 1));
            short sROL162 = (short) (sArr3[0] ^ ROL16(sArr3[2], 1));
            short sROL163 = (short) (sArr3[1] ^ ROL16(sArr3[3], 1));
            short sROL164 = (short) (sArr3[2] ^ ROL16(sArr3[4], 1));
            short sROL165 = (short) (sArr3[3] ^ ROL16(sArr3[0], 1));
            short s7 = (short) (sArr[0] ^ sROL16);
            sArr[0] = s7;
            short s8 = (short) (sArr[6] ^ sROL162);
            sArr[6] = s8;
            short sROL166 = ROL16(s8, 12);
            short s11 = (short) (sArr[12] ^ sROL163);
            sArr[12] = s11;
            short sROL167 = ROL16(s11, 11);
            short s12 = (short) (sArr[18] ^ sROL164);
            sArr[18] = s12;
            short sROL168 = ROL16(s12, 5);
            short s13 = (short) (sArr[24] ^ sROL165);
            sArr[24] = s13;
            short sROL169 = ROL16(s13, 14);
            short s14 = (short) (this.KeccakF400RoundConstants[i11] ^ (((~sROL166) & sROL167) ^ s7));
            sArr2[0] = s14;
            sArr3[0] = s14;
            short s15 = (short) (((~sROL167) & sROL168) ^ sROL166);
            sArr2[1] = s15;
            sArr3[1] = s15;
            short s16 = (short) (((~sROL168) & sROL169) ^ sROL167);
            sArr2[2] = s16;
            sArr3[2] = s16;
            short s17 = (short) (((~sROL169) & s7) ^ sROL168);
            sArr2[3] = s17;
            sArr3[3] = s17;
            short s18 = (short) (((~s7) & sROL166) ^ sROL169);
            sArr2[4] = s18;
            sArr3[4] = s18;
            short s19 = (short) (sArr[3] ^ sROL164);
            sArr[3] = s19;
            short sROL1610 = ROL16(s19, 12);
            short s21 = (short) (sArr[9] ^ sROL165);
            sArr[9] = s21;
            short sROL1611 = ROL16(s21, 4);
            short s22 = (short) (sArr[10] ^ sROL16);
            sArr[10] = s22;
            short sROL1612 = ROL16(s22, 3);
            short s23 = (short) (sArr[16] ^ sROL162);
            sArr[16] = s23;
            short sROL1613 = ROL16(s23, 13);
            short s24 = (short) (sArr[22] ^ sROL163);
            sArr[22] = s24;
            short sROL1614 = ROL16(s24, 13);
            short s25 = (short) (((~sROL1611) & sROL1612) ^ sROL1610);
            sArr2[5] = s25;
            sArr3[0] = (short) (sArr3[0] ^ s25);
            short s26 = (short) (((~sROL1612) & sROL1613) ^ sROL1611);
            sArr2[6] = s26;
            sArr3[1] = (short) (sArr3[1] ^ s26);
            short s27 = (short) (((~sROL1613) & sROL1614) ^ sROL1612);
            sArr2[7] = s27;
            sArr3[2] = (short) (sArr3[2] ^ s27);
            short s28 = (short) (((~sROL1614) & sROL1610) ^ sROL1613);
            sArr2[8] = s28;
            sArr3[3] = (short) (sArr3[3] ^ s28);
            short s29 = (short) (((~sROL1610) & sROL1611) ^ sROL1614);
            sArr2[9] = s29;
            sArr3[4] = (short) (s29 ^ sArr3[4]);
            short s31 = (short) (sArr[1] ^ sROL162);
            sArr[1] = s31;
            short sROL1615 = ROL16(s31, 1);
            short s32 = (short) (sArr[7] ^ sROL163);
            sArr[7] = s32;
            short sROL1616 = ROL16(s32, 6);
            short s33 = (short) (sArr[13] ^ sROL164);
            sArr[13] = s33;
            short sROL1617 = ROL16(s33, 9);
            short s34 = (short) (sArr[19] ^ sROL165);
            sArr[19] = s34;
            short sROL1618 = ROL16(s34, 8);
            short s35 = (short) (sArr[20] ^ sROL16);
            sArr[20] = s35;
            short sROL1619 = ROL16(s35, 2);
            short s36 = (short) (((~sROL1616) & sROL1617) ^ sROL1615);
            sArr2[10] = s36;
            sArr3[0] = (short) (sArr3[0] ^ s36);
            short s37 = (short) (((~sROL1617) & sROL1618) ^ sROL1616);
            sArr2[11] = s37;
            sArr3[1] = (short) (sArr3[1] ^ s37);
            short s38 = (short) (((~sROL1618) & sROL1619) ^ sROL1617);
            sArr2[12] = s38;
            sArr3[2] = (short) (s38 ^ sArr3[2]);
            short s39 = (short) (((~sROL1619) & sROL1615) ^ sROL1618);
            sArr2[13] = s39;
            sArr3[3] = (short) (s39 ^ sArr3[3]);
            short s41 = (short) (((~sROL1615) & sROL1616) ^ sROL1619);
            sArr2[14] = s41;
            sArr3[4] = (short) (s41 ^ sArr3[4]);
            short s42 = (short) (sArr[4] ^ sROL165);
            sArr[4] = s42;
            short sROL1620 = ROL16(s42, 11);
            short s43 = (short) (sArr[5] ^ sROL16);
            sArr[5] = s43;
            short sROL1621 = ROL16(s43, 4);
            short s44 = (short) (sArr[11] ^ sROL162);
            sArr[11] = s44;
            short sROL1622 = ROL16(s44, 10);
            short s45 = (short) (sArr[17] ^ sROL163);
            sArr[17] = s45;
            short sROL1623 = ROL16(s45, 15);
            short s46 = (short) (sArr[23] ^ sROL164);
            sArr[23] = s46;
            short sROL1624 = ROL16(s46, 8);
            short s47 = (short) (((~sROL1621) & sROL1622) ^ sROL1620);
            sArr2[15] = s47;
            sArr3[0] = (short) (sArr3[0] ^ s47);
            short s48 = (short) (((~sROL1622) & sROL1623) ^ sROL1621);
            sArr2[16] = s48;
            sArr3[1] = (short) (sArr3[1] ^ s48);
            short s49 = (short) (sROL1622 ^ ((~sROL1623) & sROL1624));
            sArr2[17] = s49;
            sArr3[2] = (short) (s49 ^ sArr3[2]);
            short s50 = (short) (((~sROL1624) & sROL1620) ^ sROL1623);
            sArr2[18] = s50;
            sArr3[3] = (short) (s50 ^ sArr3[3]);
            short s51 = (short) (((~sROL1620) & sROL1621) ^ sROL1624);
            sArr2[19] = s51;
            sArr3[4] = (short) (s51 ^ sArr3[4]);
            short s52 = (short) (sArr[2] ^ sROL163);
            sArr[2] = s52;
            short sROL1625 = ROL16(s52, 14);
            short s53 = (short) (sArr[8] ^ sROL164);
            sArr[8] = s53;
            short sROL1626 = ROL16(s53, 7);
            short s54 = (short) (sArr[14] ^ sROL165);
            sArr[14] = s54;
            short sROL1627 = ROL16(s54, 7);
            short s55 = (short) (sROL16 ^ sArr[15]);
            sArr[15] = s55;
            short sROL1628 = ROL16(s55, 9);
            short s56 = (short) (sROL162 ^ sArr[21]);
            sArr[21] = s56;
            short sROL1629 = ROL16(s56, 2);
            short s57 = (short) (((~sROL1626) & sROL1627) ^ sROL1625);
            sArr2[20] = s57;
            sArr3[0] = (short) (s57 ^ sArr3[0]);
            short s58 = (short) (((~sROL1627) & sROL1628) ^ sROL1626);
            sArr2[21] = s58;
            sArr3[1] = (short) (s58 ^ sArr3[1]);
            short s59 = (short) (sROL1627 ^ ((~sROL1628) & sROL1629));
            sArr2[22] = s59;
            sArr3[2] = (short) (s59 ^ sArr3[2]);
            short s61 = (short) (sROL1628 ^ ((~sROL1629) & sROL1625));
            sArr2[23] = s61;
            sArr3[3] = (short) (s61 ^ sArr3[3]);
            short s62 = (short) (((~sROL1625) & sROL1626) ^ sROL1629);
            sArr2[24] = s62;
            sArr3[4] = (short) (s62 ^ sArr3[4]);
        }
    }

    public class ISAPAEAD_K_128 extends ISAPAEAD_K {
        public ISAPAEAD_K_128() {
            super();
            this.ISAP_IV1_16 = new short[]{-32767, 400, 3092, 3084};
            this.ISAP_IV2_16 = new short[]{-32766, 400, 3092, 3084};
            this.ISAP_IV3_16 = new short[]{-32765, 400, 3092, 3084};
        }

        @Override // org.bouncycastle.crypto.engines.ISAPEngine.ISAPAEAD_K
        public void PermuteRoundsBX(short[] sArr, short[] sArr2, short[] sArr3) {
            rounds12X(sArr, sArr2, sArr3);
        }

        @Override // org.bouncycastle.crypto.engines.ISAPEngine.ISAPAEAD_K
        public void PermuteRoundsHX(short[] sArr, short[] sArr2, short[] sArr3) {
            prepareThetaX(sArr, sArr3);
            thetaRhoPiChiIotaPrepareTheta(0, sArr, sArr2, sArr3);
            thetaRhoPiChiIotaPrepareTheta(1, sArr2, sArr, sArr3);
            thetaRhoPiChiIotaPrepareTheta(2, sArr, sArr2, sArr3);
            thetaRhoPiChiIotaPrepareTheta(3, sArr2, sArr, sArr3);
            rounds_4_18(sArr, sArr2, sArr3);
        }

        @Override // org.bouncycastle.crypto.engines.ISAPEngine.ISAPAEAD_K
        public void PermuteRoundsKX(short[] sArr, short[] sArr2, short[] sArr3) {
            rounds12X(sArr, sArr2, sArr3);
        }
    }

    public class ISAPAEAD_K_128A extends ISAPAEAD_K {
        public ISAPAEAD_K_128A() {
            super();
            this.ISAP_IV1_16 = new short[]{-32767, 400, 272, 2056};
            this.ISAP_IV2_16 = new short[]{-32766, 400, 272, 2056};
            this.ISAP_IV3_16 = new short[]{-32765, 400, 272, 2056};
        }

        @Override // org.bouncycastle.crypto.engines.ISAPEngine.ISAPAEAD_K
        public void PermuteRoundsBX(short[] sArr, short[] sArr2, short[] sArr3) {
            prepareThetaX(sArr, sArr3);
            thetaRhoPiChiIotaPrepareTheta(19, sArr, sArr2, sArr3);
            System.arraycopy(sArr2, 0, sArr, 0, sArr2.length);
        }

        @Override // org.bouncycastle.crypto.engines.ISAPEngine.ISAPAEAD_K
        public void PermuteRoundsHX(short[] sArr, short[] sArr2, short[] sArr3) {
            prepareThetaX(sArr, sArr3);
            rounds_4_18(sArr, sArr2, sArr3);
        }

        @Override // org.bouncycastle.crypto.engines.ISAPEngine.ISAPAEAD_K
        public void PermuteRoundsKX(short[] sArr, short[] sArr2, short[] sArr3) {
            prepareThetaX(sArr, sArr3);
            rounds_12_18(sArr, sArr2, sArr3);
        }
    }

    public interface ISAP_AEAD {
        void absorbFinalAADBlock();

        void absorbMacBlock(byte[] bArr, int i11);

        void init();

        void processEncBlock(byte[] bArr, int i11, byte[] bArr2, int i12);

        void processEncFinalBlock(byte[] bArr, int i11);

        void processMACFinal(byte[] bArr, int i11, int i12, byte[] bArr2);

        void reset();
    }

    public enum IsapType {
        ISAP_A_128A,
        ISAP_K_128A,
        ISAP_A_128,
        ISAP_K_128
    }

    public ISAPEngine(IsapType isapType) {
        String str;
        this.MAC_SIZE = 16;
        this.IV_SIZE = 16;
        this.KEY_SIZE = 16;
        int i11 = AnonymousClass1.$SwitchMap$org$bouncycastle$crypto$engines$ISAPEngine$IsapType[isapType.ordinal()];
        if (i11 == 1) {
            this.ISAPAEAD = new ISAPAEAD_A_128A();
            str = "ISAP-A-128A AEAD";
        } else if (i11 == 2) {
            this.ISAPAEAD = new ISAPAEAD_K_128A();
            str = "ISAP-K-128A AEAD";
        } else if (i11 == 3) {
            this.ISAPAEAD = new ISAPAEAD_A_128();
            str = "ISAP-A-128 AEAD";
        } else {
            if (i11 != 4) {
                a.f("Incorrect ISAP parameter");
                throw null;
            }
            this.ISAPAEAD = new ISAPAEAD_K_128();
            str = "ISAP-K-128 AEAD";
        }
        this.algorithmName = str;
        this.AADBufferSize = this.BlockSize;
        setInnerMembers(AEADBaseEngine.ProcessingBufferType.Immediate, AEADBaseEngine.AADOperatorType.Default, AEADBaseEngine.DataOperatorType.Counter);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ int doFinal(byte[] bArr, int i11) throws InvalidCipherTextException, IllegalStateException {
        return super.doFinal(bArr, i11);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void finishAAD(AEADBaseEngine.State state, boolean z11) {
        finishAAD3(state, z11);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ String getAlgorithmName() {
        return super.getAlgorithmName();
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public /* bridge */ /* synthetic */ int getIVBytesSize() {
        return super.getIVBytesSize();
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public /* bridge */ /* synthetic */ int getKeyBytesSize() {
        return super.getKeyBytesSize();
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ byte[] getMac() {
        return super.getMac();
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ int getOutputSize(int i11) {
        return super.getOutputSize(i11);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ int getUpdateOutputSize(int i11) {
        return super.getUpdateOutputSize(i11);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void init(byte[] bArr, byte[] bArr2) throws IllegalArgumentException {
        this.npub = bArr2;
        this.f33120k = bArr;
        this.ISAPAEAD.init();
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ void processAADByte(byte b8) {
        super.processAADByte(b8);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ void processAADBytes(byte[] bArr, int i11, int i12) {
        super.processAADBytes(bArr, i11, i12);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void processBufferAAD(byte[] bArr, int i11) {
        this.ISAPAEAD.absorbMacBlock(bArr, i11);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void processBufferDecrypt(byte[] bArr, int i11, byte[] bArr2, int i12) {
        this.ISAPAEAD.processEncBlock(bArr, i11, bArr2, i12);
        this.ISAPAEAD.absorbMacBlock(bArr, i11);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void processBufferEncrypt(byte[] bArr, int i11, byte[] bArr2, int i12) {
        this.ISAPAEAD.processEncBlock(bArr, i11, bArr2, i12);
        this.ISAPAEAD.absorbMacBlock(bArr2, i12);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ int processByte(byte b8, byte[] bArr, int i11) throws DataLengthException {
        return super.processByte(b8, bArr, i11);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ int processBytes(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) throws DataLengthException {
        return super.processBytes(bArr, i11, i12, bArr2, i13);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void processFinalAAD() {
        this.ISAPAEAD.absorbFinalAADBlock();
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void processFinalBlock(byte[] bArr, int i11) {
        this.ISAPAEAD.processEncFinalBlock(bArr, i11);
        boolean z11 = this.forEncryption;
        ISAP_AEAD isap_aead = this.ISAPAEAD;
        if (z11) {
            isap_aead.processMACFinal(bArr, i11, this.m_bufPos, this.mac);
        } else {
            isap_aead.processMACFinal(this.m_buf, 0, this.m_bufPos, this.mac);
        }
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void reset(boolean z11) {
        super.reset(z11);
        this.ISAPAEAD.reset();
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ void reset() {
        super.reset();
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ void init(boolean z11, CipherParameters cipherParameters) {
        super.init(z11, cipherParameters);
    }
}
