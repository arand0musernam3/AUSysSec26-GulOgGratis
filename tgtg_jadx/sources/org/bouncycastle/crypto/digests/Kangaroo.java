package org.bouncycastle.crypto.digests;

import com.braze.h2;
import i4.a;
import kotlin.jvm.internal.ByteCompanionObject;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.crypto.Xof;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes3.dex */
public final class Kangaroo {
    private static final int DIGESTLEN = 32;

    public static class KangarooParameters implements CipherParameters {
        private byte[] thePersonal;

        public static class Builder {
            private byte[] thePersonal;

            public KangarooParameters build() {
                KangarooParameters kangarooParameters = new KangarooParameters();
                byte[] bArr = this.thePersonal;
                if (bArr != null) {
                    kangarooParameters.thePersonal = bArr;
                }
                return kangarooParameters;
            }

            public Builder setPersonalisation(byte[] bArr) {
                this.thePersonal = Arrays.clone(bArr);
                return this;
            }
        }

        public byte[] getPersonalisation() {
            return Arrays.clone(this.thePersonal);
        }
    }

    public static class KangarooSponge {
        private static long[] KeccakRoundConstants = {1, 32898, -9223372036854742902L, -9223372034707259392L, 32907, 2147483649L, -9223372034707259263L, -9223372036854743031L, 138, 136, 2147516425L, 2147483658L, 2147516555L, -9223372036854775669L, -9223372036854742903L, -9223372036854743037L, -9223372036854743038L, -9223372036854775680L, 32778, -9223372034707292150L, -9223372034707259263L, -9223372036854742912L, 2147483649L, -9223372034707259384L};
        private int bytesInQueue;
        private boolean squeezing;
        private final byte[] theQueue;
        private final int theRateBytes;
        private final int theRounds;
        private final long[] theState = new long[25];

        public KangarooSponge(int i11, int i12) {
            int i13 = (1600 - (i11 << 1)) >> 3;
            this.theRateBytes = i13;
            this.theRounds = i12;
            this.theQueue = new byte[i13];
            initSponge();
        }

        private void KangarooAbsorb(byte[] bArr, int i11) {
            int i12 = this.theRateBytes >> 3;
            for (int i13 = 0; i13 < i12; i13++) {
                long[] jArr = this.theState;
                jArr[i13] = jArr[i13] ^ Pack.littleEndianToLong(bArr, i11);
                i11 += 8;
            }
            KangarooPermutation();
        }

        private void KangarooExtract() {
            Pack.longToLittleEndian(this.theState, 0, this.theRateBytes >> 3, this.theQueue, 0);
        }

        private void KangarooPermutation() {
            KangarooSponge kangarooSponge = this;
            long[] jArr = kangarooSponge.theState;
            long j9 = jArr[0];
            long j11 = jArr[1];
            long j12 = jArr[2];
            char c3 = 3;
            long j13 = jArr[3];
            char c7 = 4;
            long j14 = jArr[4];
            long j15 = jArr[5];
            long j16 = jArr[6];
            long j17 = jArr[7];
            long j18 = jArr[8];
            long j19 = jArr[9];
            long j21 = jArr[10];
            long j22 = jArr[11];
            long j23 = jArr[12];
            long j24 = jArr[13];
            long j25 = jArr[14];
            long j26 = jArr[15];
            long j27 = jArr[16];
            long j28 = jArr[17];
            long j29 = jArr[18];
            long j31 = jArr[19];
            long j32 = jArr[20];
            long j33 = jArr[21];
            long j34 = jArr[22];
            long j35 = jArr[23];
            long j36 = jArr[24];
            int length = KeccakRoundConstants.length - kangarooSponge.theRounds;
            int i11 = 0;
            while (i11 < kangarooSponge.theRounds) {
                long j37 = (((j9 ^ j15) ^ j21) ^ j26) ^ j32;
                long j38 = (((j11 ^ j16) ^ j22) ^ j27) ^ j33;
                long j39 = (((j12 ^ j17) ^ j23) ^ j28) ^ j34;
                long j41 = (((j13 ^ j18) ^ j24) ^ j29) ^ j35;
                long j42 = (((j14 ^ j19) ^ j25) ^ j31) ^ j36;
                long j43 = ((j38 << 1) | (j38 >>> (-1))) ^ j42;
                long j44 = ((j39 << 1) | (j39 >>> (-1))) ^ j37;
                long j45 = ((j41 << 1) | (j41 >>> (-1))) ^ j38;
                long j46 = ((j42 << 1) | (j42 >>> (-1))) ^ j39;
                long j47 = ((j37 << 1) | (j37 >>> (-1))) ^ j41;
                long j48 = j9 ^ j43;
                long j49 = j15 ^ j43;
                long j51 = j21 ^ j43;
                long j52 = j26 ^ j43;
                long j53 = j32 ^ j43;
                long j54 = j11 ^ j44;
                long j55 = j16 ^ j44;
                long j56 = j22 ^ j44;
                long j57 = j27 ^ j44;
                long j58 = j33 ^ j44;
                long j59 = j12 ^ j45;
                long j61 = j17 ^ j45;
                long j62 = j23 ^ j45;
                long j63 = j28 ^ j45;
                long j64 = j34 ^ j45;
                long j65 = j13 ^ j46;
                long j66 = j18 ^ j46;
                long j67 = j24 ^ j46;
                long j68 = j29 ^ j46;
                long j69 = j35 ^ j46;
                long j71 = j14 ^ j47;
                long j72 = j19 ^ j47;
                long j73 = j25 ^ j47;
                long j74 = j31 ^ j47;
                long j75 = j36 ^ j47;
                long j76 = (j54 << 1) | (j54 >>> 63);
                char c8 = c3;
                long j77 = (j55 << 44) | (j55 >>> 20);
                char c11 = c7;
                long j78 = (j72 << 20) | (j72 >>> 44);
                long j79 = (j64 << 61) | (j64 >>> c8);
                long j81 = (j73 << 39) | (j73 >>> 25);
                long j82 = (j53 << 18) | (j53 >>> 46);
                int i12 = i11;
                long j83 = (j59 << 62) | (j59 >>> 2);
                long j84 = (j62 << 43) | (j62 >>> 21);
                long j85 = (j67 << 25) | (j67 >>> 39);
                long j86 = (j74 << 8) | (j74 >>> 56);
                long j87 = (j69 << 56) | (j69 >>> 8);
                long j88 = (j52 << 41) | (j52 >>> 23);
                long j89 = (j71 << 27) | (j71 >>> 37);
                long j90 = (j75 << 14) | (j75 >>> 50);
                long j91 = (j58 << 2) | (j58 >>> 62);
                long j92 = (j66 << 55) | (j66 >>> 9);
                long j93 = (j57 << 45) | (j57 >>> 19);
                long j94 = (j49 << 36) | (j49 >>> 28);
                long j95 = (j65 << 28) | (j65 >>> 36);
                long j96 = (j68 << 21) | (j68 >>> 43);
                long j97 = (j63 << 15) | (j63 >>> 49);
                long j98 = (j56 << 10) | (j56 >>> 54);
                long j99 = (j61 << 6) | (j61 >>> 58);
                long j100 = (j51 << c8) | (j51 >>> 61);
                long j101 = ((~j77) & j84) ^ j48;
                long j102 = ((~j84) & j96) ^ j77;
                long j103 = j84 ^ ((~j96) & j90);
                long j104 = j96 ^ ((~j90) & j48);
                long j105 = ((~j48) & j77) ^ j90;
                long j106 = j95 ^ ((~j78) & j100);
                long j107 = ((~j100) & j93) ^ j78;
                int i13 = length;
                long j108 = ((~j93) & j79) ^ j100;
                j18 = j93 ^ ((~j79) & j95);
                long j109 = ((~j95) & j78) ^ j79;
                j21 = j76 ^ ((~j99) & j85);
                long j110 = ((~j85) & j86) ^ j99;
                long j111 = ((~j86) & j82) ^ j85;
                j24 = j86 ^ ((~j82) & j76);
                long j112 = ((~j76) & j99) ^ j82;
                long j113 = j89 ^ ((~j94) & j98);
                long j114 = ((~j98) & j97) ^ j94;
                long j115 = j98 ^ ((~j97) & j87);
                long j116 = j97 ^ ((~j87) & j89);
                long j117 = j87 ^ ((~j89) & j94);
                long j118 = j83 ^ ((~j92) & j81);
                long j119 = ((~j81) & j88) ^ j92;
                long j120 = j81 ^ ((~j88) & j91);
                j35 = j88 ^ ((~j91) & j83);
                j36 = j91 ^ ((~j83) & j92);
                j9 = j101 ^ KeccakRoundConstants[i13 + i12];
                j23 = j111;
                j17 = j108;
                jArr = jArr;
                c3 = c8;
                j16 = j107;
                length = i13;
                j31 = j117;
                j27 = j114;
                j22 = j110;
                j29 = j116;
                j25 = j112;
                j32 = j118;
                j33 = j119;
                j34 = j120;
                j19 = j109;
                j14 = j105;
                j28 = j115;
                j26 = j113;
                j13 = j104;
                c7 = c11;
                j15 = j106;
                j12 = j103;
                j11 = j102;
                i11 = i12 + 1;
                kangarooSponge = this;
            }
            long[] jArr2 = jArr;
            jArr2[0] = j9;
            jArr2[1] = j11;
            jArr2[2] = j12;
            jArr2[c3] = j13;
            jArr2[c7] = j14;
            jArr2[5] = j15;
            jArr2[6] = j16;
            jArr2[7] = j17;
            jArr2[8] = j18;
            jArr2[9] = j19;
            jArr2[10] = j21;
            jArr2[11] = j22;
            jArr2[12] = j23;
            jArr2[13] = j24;
            jArr2[14] = j25;
            jArr2[15] = j26;
            jArr2[16] = j27;
            jArr2[17] = j28;
            jArr2[18] = j29;
            jArr2[19] = j31;
            jArr2[20] = j32;
            jArr2[21] = j33;
            jArr2[22] = j34;
            jArr2[23] = j35;
            jArr2[24] = j36;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void absorb(byte[] bArr, int i11, int i12) {
            int i13;
            if (this.squeezing) {
                h2.b("attempt to absorb while squeezing");
                return;
            }
            int i14 = 0;
            while (i14 < i12) {
                int i15 = this.bytesInQueue;
                if (i15 != 0 || i14 > i12 - this.theRateBytes) {
                    int iMin = Math.min(this.theRateBytes - i15, i12 - i14);
                    System.arraycopy(bArr, i11 + i14, this.theQueue, this.bytesInQueue, iMin);
                    int i16 = this.bytesInQueue + iMin;
                    this.bytesInQueue = i16;
                    i14 += iMin;
                    if (i16 == this.theRateBytes) {
                        KangarooAbsorb(this.theQueue, 0);
                        this.bytesInQueue = 0;
                    }
                } else {
                    do {
                        KangarooAbsorb(bArr, i11 + i14);
                        i13 = this.theRateBytes;
                        i14 += i13;
                    } while (i14 <= i12 - i13);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void initSponge() {
            Arrays.fill(this.theState, 0L);
            Arrays.fill(this.theQueue, (byte) 0);
            this.bytesInQueue = 0;
            this.squeezing = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void padAndSwitchToSqueezingPhase() {
            int i11 = this.bytesInQueue;
            while (true) {
                int i12 = this.theRateBytes;
                byte[] bArr = this.theQueue;
                if (i11 >= i12) {
                    int i13 = i12 - 1;
                    bArr[i13] = (byte) (bArr[i13] ^ ByteCompanionObject.MIN_VALUE);
                    KangarooAbsorb(bArr, 0);
                    KangarooExtract();
                    this.bytesInQueue = this.theRateBytes;
                    this.squeezing = true;
                    return;
                }
                bArr[i11] = 0;
                i11++;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void squeeze(byte[] bArr, int i11, int i12) {
            if (!this.squeezing) {
                padAndSwitchToSqueezingPhase();
            }
            int i13 = 0;
            while (i13 < i12) {
                if (this.bytesInQueue == 0) {
                    KangarooPermutation();
                    KangarooExtract();
                    this.bytesInQueue = this.theRateBytes;
                }
                int iMin = Math.min(this.bytesInQueue, i12 - i13);
                System.arraycopy(this.theQueue, this.theRateBytes - this.bytesInQueue, bArr, i11 + i13, iMin);
                this.bytesInQueue -= iMin;
                i13 += iMin;
            }
        }
    }

    public static class KangarooTwelve extends KangarooBase {
        public KangarooTwelve() {
            this(32, CryptoServicePurpose.ANY);
        }

        @Override // org.bouncycastle.crypto.digests.Kangaroo.KangarooBase, org.bouncycastle.crypto.Digest
        public /* bridge */ /* synthetic */ int doFinal(byte[] bArr, int i11) {
            return super.doFinal(bArr, i11);
        }

        @Override // org.bouncycastle.crypto.digests.Kangaroo.KangarooBase, org.bouncycastle.crypto.Xof
        public /* bridge */ /* synthetic */ int doOutput(byte[] bArr, int i11, int i12) {
            return super.doOutput(bArr, i11, i12);
        }

        @Override // org.bouncycastle.crypto.Digest
        public String getAlgorithmName() {
            return "KangarooTwelve";
        }

        @Override // org.bouncycastle.crypto.digests.Kangaroo.KangarooBase, org.bouncycastle.crypto.ExtendedDigest
        public /* bridge */ /* synthetic */ int getByteLength() {
            return super.getByteLength();
        }

        @Override // org.bouncycastle.crypto.digests.Kangaroo.KangarooBase, org.bouncycastle.crypto.Digest
        public /* bridge */ /* synthetic */ int getDigestSize() {
            return super.getDigestSize();
        }

        @Override // org.bouncycastle.crypto.digests.Kangaroo.KangarooBase
        public /* bridge */ /* synthetic */ void init(KangarooParameters kangarooParameters) {
            super.init(kangarooParameters);
        }

        @Override // org.bouncycastle.crypto.digests.Kangaroo.KangarooBase, org.bouncycastle.crypto.Digest
        public /* bridge */ /* synthetic */ void reset() {
            super.reset();
        }

        @Override // org.bouncycastle.crypto.digests.Kangaroo.KangarooBase, org.bouncycastle.crypto.Digest
        public /* bridge */ /* synthetic */ void update(byte b8) {
            super.update(b8);
        }

        @Override // org.bouncycastle.crypto.digests.Kangaroo.KangarooBase, org.bouncycastle.crypto.Digest
        public /* bridge */ /* synthetic */ void update(byte[] bArr, int i11, int i12) {
            super.update(bArr, i11, i12);
        }

        @Override // org.bouncycastle.crypto.digests.Kangaroo.KangarooBase, org.bouncycastle.crypto.Xof
        public /* bridge */ /* synthetic */ int doFinal(byte[] bArr, int i11, int i12) {
            return super.doFinal(bArr, i11, i12);
        }

        public KangarooTwelve(int i11, CryptoServicePurpose cryptoServicePurpose) {
            super(128, 12, i11, cryptoServicePurpose);
        }

        public KangarooTwelve(CryptoServicePurpose cryptoServicePurpose) {
            this(32, cryptoServicePurpose);
        }
    }

    public static class MarsupilamiFourteen extends KangarooBase {
        public MarsupilamiFourteen() {
            this(32, CryptoServicePurpose.ANY);
        }

        @Override // org.bouncycastle.crypto.digests.Kangaroo.KangarooBase, org.bouncycastle.crypto.Digest
        public /* bridge */ /* synthetic */ int doFinal(byte[] bArr, int i11) {
            return super.doFinal(bArr, i11);
        }

        @Override // org.bouncycastle.crypto.digests.Kangaroo.KangarooBase, org.bouncycastle.crypto.Xof
        public /* bridge */ /* synthetic */ int doOutput(byte[] bArr, int i11, int i12) {
            return super.doOutput(bArr, i11, i12);
        }

        @Override // org.bouncycastle.crypto.Digest
        public String getAlgorithmName() {
            return "MarsupilamiFourteen";
        }

        @Override // org.bouncycastle.crypto.digests.Kangaroo.KangarooBase, org.bouncycastle.crypto.ExtendedDigest
        public /* bridge */ /* synthetic */ int getByteLength() {
            return super.getByteLength();
        }

        @Override // org.bouncycastle.crypto.digests.Kangaroo.KangarooBase, org.bouncycastle.crypto.Digest
        public /* bridge */ /* synthetic */ int getDigestSize() {
            return super.getDigestSize();
        }

        @Override // org.bouncycastle.crypto.digests.Kangaroo.KangarooBase
        public /* bridge */ /* synthetic */ void init(KangarooParameters kangarooParameters) {
            super.init(kangarooParameters);
        }

        @Override // org.bouncycastle.crypto.digests.Kangaroo.KangarooBase, org.bouncycastle.crypto.Digest
        public /* bridge */ /* synthetic */ void reset() {
            super.reset();
        }

        @Override // org.bouncycastle.crypto.digests.Kangaroo.KangarooBase, org.bouncycastle.crypto.Digest
        public /* bridge */ /* synthetic */ void update(byte b8) {
            super.update(b8);
        }

        @Override // org.bouncycastle.crypto.digests.Kangaroo.KangarooBase, org.bouncycastle.crypto.Digest
        public /* bridge */ /* synthetic */ void update(byte[] bArr, int i11, int i12) {
            super.update(bArr, i11, i12);
        }

        @Override // org.bouncycastle.crypto.digests.Kangaroo.KangarooBase, org.bouncycastle.crypto.Xof
        public /* bridge */ /* synthetic */ int doFinal(byte[] bArr, int i11, int i12) {
            return super.doFinal(bArr, i11, i12);
        }

        public MarsupilamiFourteen(int i11, CryptoServicePurpose cryptoServicePurpose) {
            super(256, 14, i11, cryptoServicePurpose);
        }

        public MarsupilamiFourteen(CryptoServicePurpose cryptoServicePurpose) {
            this(32, cryptoServicePurpose);
        }
    }

    public static abstract class KangarooBase implements ExtendedDigest, Xof {
        private static final int BLKSIZE = 8192;
        private final CryptoServicePurpose purpose;
        private final byte[] singleByte = new byte[1];
        private boolean squeezing;
        private final int theChainLen;
        private int theCurrNode;
        private final KangarooSponge theLeaf;
        private byte[] thePersonal;
        private int theProcessed;
        private final KangarooSponge theTree;
        private static final byte[] SINGLE = {7};
        private static final byte[] INTERMEDIATE = {11};
        private static final byte[] FINAL = {-1, -1, 6};
        private static final byte[] FIRST = {3, 0, 0, 0, 0, 0, 0, 0};

        public KangarooBase(int i11, int i12, int i13, CryptoServicePurpose cryptoServicePurpose) {
            this.theTree = new KangarooSponge(i11, i12);
            this.theLeaf = new KangarooSponge(i11, i12);
            this.theChainLen = i11 >> 2;
            buildPersonal(null);
            this.purpose = cryptoServicePurpose;
            CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties(this, i11, cryptoServicePurpose));
        }

        private void buildPersonal(byte[] bArr) {
            int length = bArr == null ? 0 : bArr.length;
            byte[] bArrLengthEncode = lengthEncode(length);
            byte[] bArrCopyOf = bArr == null ? new byte[bArrLengthEncode.length + length] : Arrays.copyOf(bArr, bArrLengthEncode.length + length);
            this.thePersonal = bArrCopyOf;
            System.arraycopy(bArrLengthEncode, 0, bArrCopyOf, length, bArrLengthEncode.length);
        }

        private static byte[] lengthEncode(long j9) {
            byte b8;
            if (j9 != 0) {
                long j11 = j9;
                b8 = 1;
                while (true) {
                    j11 >>= 8;
                    if (j11 == 0) {
                        break;
                    }
                    b8 = (byte) (b8 + 1);
                }
            } else {
                b8 = 0;
            }
            byte[] bArr = new byte[b8 + 1];
            bArr[b8] = b8;
            for (int i11 = 0; i11 < b8; i11++) {
                bArr[i11] = (byte) (j9 >> (((b8 - i11) - 1) * 8));
            }
            return bArr;
        }

        private void processData(byte[] bArr, int i11, int i12) {
            if (this.squeezing) {
                h2.b("attempt to absorb while squeezing");
                return;
            }
            KangarooSponge kangarooSponge = this.theCurrNode == 0 ? this.theTree : this.theLeaf;
            int i13 = 8192 - this.theProcessed;
            if (i13 >= i12) {
                kangarooSponge.absorb(bArr, i11, i12);
                this.theProcessed += i12;
                return;
            }
            if (i13 > 0) {
                kangarooSponge.absorb(bArr, i11, i13);
                this.theProcessed += i13;
            }
            while (i13 < i12) {
                if (this.theProcessed == BLKSIZE) {
                    switchLeaf(true);
                }
                int iMin = Math.min(i12 - i13, BLKSIZE);
                this.theLeaf.absorb(bArr, i11 + i13, iMin);
                this.theProcessed += iMin;
                i13 += iMin;
            }
        }

        private void switchFinal() {
            switchLeaf(false);
            byte[] bArrLengthEncode = lengthEncode(this.theCurrNode);
            this.theTree.absorb(bArrLengthEncode, 0, bArrLengthEncode.length);
            KangarooSponge kangarooSponge = this.theTree;
            byte[] bArr = FINAL;
            kangarooSponge.absorb(bArr, 0, bArr.length);
            this.theTree.padAndSwitchToSqueezingPhase();
        }

        private void switchLeaf(boolean z11) {
            if (this.theCurrNode == 0) {
                KangarooSponge kangarooSponge = this.theTree;
                byte[] bArr = FIRST;
                kangarooSponge.absorb(bArr, 0, bArr.length);
            } else {
                KangarooSponge kangarooSponge2 = this.theLeaf;
                byte[] bArr2 = INTERMEDIATE;
                kangarooSponge2.absorb(bArr2, 0, bArr2.length);
                int i11 = this.theChainLen;
                byte[] bArr3 = new byte[i11];
                this.theLeaf.squeeze(bArr3, 0, i11);
                this.theTree.absorb(bArr3, 0, this.theChainLen);
                this.theLeaf.initSponge();
            }
            if (z11) {
                this.theCurrNode++;
            }
            this.theProcessed = 0;
        }

        private void switchSingle() {
            this.theTree.absorb(SINGLE, 0, 1);
            this.theTree.padAndSwitchToSqueezingPhase();
        }

        private void switchToSqueezing() {
            byte[] bArr = this.thePersonal;
            processData(bArr, 0, bArr.length);
            if (this.theCurrNode == 0) {
                switchSingle();
            } else {
                switchFinal();
            }
        }

        @Override // org.bouncycastle.crypto.Xof
        public int doFinal(byte[] bArr, int i11, int i12) {
            if (this.squeezing) {
                h2.b("Already outputting");
                return 0;
            }
            int iDoOutput = doOutput(bArr, i11, i12);
            reset();
            return iDoOutput;
        }

        @Override // org.bouncycastle.crypto.Xof
        public int doOutput(byte[] bArr, int i11, int i12) {
            if (!this.squeezing) {
                switchToSqueezing();
            }
            if (i12 >= 0) {
                this.theTree.squeeze(bArr, i11, i12);
                return i12;
            }
            a.f("Invalid output length");
            return 0;
        }

        @Override // org.bouncycastle.crypto.ExtendedDigest
        public int getByteLength() {
            return this.theTree.theRateBytes;
        }

        @Override // org.bouncycastle.crypto.Digest
        public int getDigestSize() {
            return this.theChainLen >> 1;
        }

        public void init(KangarooParameters kangarooParameters) {
            buildPersonal(kangarooParameters.getPersonalisation());
            reset();
        }

        @Override // org.bouncycastle.crypto.Digest
        public void reset() {
            this.theTree.initSponge();
            this.theLeaf.initSponge();
            this.theCurrNode = 0;
            this.theProcessed = 0;
            this.squeezing = false;
        }

        @Override // org.bouncycastle.crypto.Digest
        public void update(byte b8) {
            byte[] bArr = this.singleByte;
            bArr[0] = b8;
            update(bArr, 0, 1);
        }

        @Override // org.bouncycastle.crypto.Digest
        public void update(byte[] bArr, int i11, int i12) {
            processData(bArr, i11, i12);
        }

        @Override // org.bouncycastle.crypto.Digest
        public int doFinal(byte[] bArr, int i11) {
            return doFinal(bArr, i11, getDigestSize());
        }
    }
}
