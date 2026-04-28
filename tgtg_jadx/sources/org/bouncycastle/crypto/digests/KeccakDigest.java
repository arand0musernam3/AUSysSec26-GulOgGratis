package org.bouncycastle.crypto.digests;

import com.braze.h2;
import i4.a;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.crypto.CryptoServiceProperties;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes3.dex */
public class KeccakDigest implements ExtendedDigest {
    private static long[] KeccakRoundConstants = {1, 32898, -9223372036854742902L, -9223372034707259392L, 32907, 2147483649L, -9223372034707259263L, -9223372036854743031L, 138, 136, 2147516425L, 2147483658L, 2147516555L, -9223372036854775669L, -9223372036854742903L, -9223372036854743037L, -9223372036854743038L, -9223372036854775680L, 32778, -9223372034707292150L, -9223372034707259263L, -9223372036854742912L, 2147483649L, -9223372034707259384L};
    protected int bitsInQueue;
    protected byte[] dataQueue;
    protected int fixedOutputLength;
    protected final CryptoServicePurpose purpose;
    protected int rate;
    protected boolean squeezing;
    protected long[] state;

    public KeccakDigest(KeccakDigest keccakDigest) {
        long[] jArr = new long[25];
        this.state = jArr;
        this.dataQueue = new byte[BERTags.PRIVATE];
        this.purpose = keccakDigest.purpose;
        long[] jArr2 = keccakDigest.state;
        System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
        byte[] bArr = keccakDigest.dataQueue;
        System.arraycopy(bArr, 0, this.dataQueue, 0, bArr.length);
        this.rate = keccakDigest.rate;
        this.bitsInQueue = keccakDigest.bitsInQueue;
        this.fixedOutputLength = keccakDigest.fixedOutputLength;
        this.squeezing = keccakDigest.squeezing;
        CryptoServicesRegistrar.checkConstraints(cryptoServiceProperties());
    }

    private void KeccakAbsorb(byte[] bArr, int i11) {
        int i12 = this.rate >>> 6;
        for (int i13 = 0; i13 < i12; i13++) {
            long[] jArr = this.state;
            jArr[i13] = jArr[i13] ^ Pack.littleEndianToLong(bArr, i11);
            i11 += 8;
        }
        KeccakPermutation();
    }

    private void KeccakExtract() {
        KeccakPermutation();
        Pack.longToLittleEndian(this.state, 0, this.rate >>> 6, this.dataQueue, 0);
        this.bitsInQueue = this.rate;
    }

    private void KeccakPermutation() {
        long[] jArr = this.state;
        long j9 = jArr[0];
        long j11 = jArr[1];
        char c3 = 2;
        long j12 = jArr[2];
        char c7 = 3;
        long j13 = jArr[3];
        char c8 = 4;
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
        int i11 = 24;
        long j36 = jArr[24];
        int i12 = 0;
        while (i12 < i11) {
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
            char c11 = c3;
            long j77 = (j55 << 44) | (j55 >>> 20);
            char c12 = c7;
            long j78 = (j72 << 20) | (j72 >>> 44);
            char c13 = c8;
            long j79 = (j64 << 61) | (j64 >>> c12);
            int i13 = i11;
            long j81 = (j73 << 39) | (j73 >>> 25);
            long j82 = (j53 << 18) | (j53 >>> 46);
            int i14 = i12;
            long j83 = (j59 << 62) | (j59 >>> c11);
            long j84 = (j62 << 43) | (j62 >>> 21);
            long j85 = (j67 << 25) | (j67 >>> 39);
            long j86 = (j74 << 8) | (j74 >>> 56);
            long j87 = (j69 << 56) | (j69 >>> 8);
            long j88 = (j52 << 41) | (j52 >>> 23);
            long j89 = (j71 << 27) | (j71 >>> 37);
            long j90 = (j75 << 14) | (j75 >>> 50);
            long j91 = (j58 << c11) | (j58 >>> 62);
            long j92 = (j66 << 55) | (j66 >>> 9);
            long j93 = (j57 << 45) | (j57 >>> 19);
            long j94 = (j49 << 36) | (j49 >>> 28);
            long j95 = (j65 << 28) | (j65 >>> 36);
            long j96 = (j68 << 21) | (j68 >>> 43);
            long j97 = (j63 << 15) | (j63 >>> 49);
            long j98 = (j56 << 10) | (j56 >>> 54);
            long j99 = (j61 << 6) | (j61 >>> 58);
            long j100 = (j51 << c12) | (j51 >>> 61);
            long j101 = j48 ^ ((~j77) & j84);
            j11 = ((~j84) & j96) ^ j77;
            long j102 = j84 ^ ((~j96) & j90);
            long j103 = j96 ^ ((~j90) & j48);
            long j104 = j90 ^ ((~j48) & j77);
            long j105 = j95 ^ ((~j78) & j100);
            long j106 = ((~j100) & j93) ^ j78;
            long j107 = ((~j93) & j79) ^ j100;
            long j108 = j93 ^ ((~j79) & j95);
            long j109 = ((~j95) & j78) ^ j79;
            j21 = j76 ^ ((~j99) & j85);
            long j110 = ((~j85) & j86) ^ j99;
            long j111 = ((~j86) & j82) ^ j85;
            long j112 = j86 ^ ((~j82) & j76);
            j25 = j82 ^ ((~j76) & j99);
            long j113 = j89 ^ ((~j94) & j98);
            long j114 = j94 ^ ((~j98) & j97);
            long j115 = ((~j97) & j87) ^ j98;
            long j116 = j97 ^ ((~j87) & j89);
            long j117 = ((~j89) & j94) ^ j87;
            long j118 = j83 ^ ((~j92) & j81);
            long j119 = ((~j81) & j88) ^ j92;
            long j120 = j81 ^ ((~j88) & j91);
            j35 = j88 ^ ((~j91) & j83);
            j27 = j114;
            j17 = j107;
            j33 = j119;
            j32 = j118;
            j34 = j120;
            j19 = j109;
            j18 = j108;
            j28 = j115;
            j24 = j112;
            j31 = j117;
            j15 = j105;
            j23 = j111;
            j16 = j106;
            c8 = c13;
            c3 = c11;
            j36 = j91 ^ ((~j83) & j92);
            jArr = jArr;
            i12 = i14 + 1;
            j9 = j101 ^ KeccakRoundConstants[i14];
            j13 = j103;
            j14 = j104;
            j22 = j110;
            i11 = i13;
            j29 = j116;
            j26 = j113;
            c7 = c12;
            j12 = j102;
        }
        long[] jArr2 = jArr;
        jArr2[0] = j9;
        jArr2[1] = j11;
        jArr2[c3] = j12;
        jArr2[c7] = j13;
        jArr2[c8] = j14;
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
        jArr2[i11] = j36;
    }

    private void init(int i11) {
        if (i11 == 128 || i11 == 224 || i11 == 256 || i11 == 288 || i11 == 384 || i11 == 512) {
            initSponge(1600 - (i11 << 1));
        } else {
            a.f("bitLength must be one of 128, 224, 256, 288, 384, or 512.");
        }
    }

    private void initSponge(int i11) {
        if (i11 <= 0 || i11 >= 1600 || i11 % 64 != 0) {
            h2.b("invalid rate value");
            return;
        }
        this.rate = i11;
        int i12 = 0;
        while (true) {
            long[] jArr = this.state;
            if (i12 >= jArr.length) {
                Arrays.fill(this.dataQueue, (byte) 0);
                this.bitsInQueue = 0;
                this.squeezing = false;
                this.fixedOutputLength = (1600 - i11) / 2;
                return;
            }
            jArr[i12] = 0;
            i12++;
        }
    }

    private void padAndSwitchToSqueezingPhase() {
        byte[] bArr = this.dataQueue;
        int i11 = this.bitsInQueue;
        int i12 = i11 >>> 3;
        bArr[i12] = (byte) (bArr[i12] | ((byte) (1 << (i11 & 7))));
        int i13 = i11 + 1;
        this.bitsInQueue = i13;
        if (i13 == this.rate) {
            KeccakAbsorb(bArr, 0);
        } else {
            int i14 = i13 >>> 6;
            int i15 = i13 & 63;
            int i16 = 0;
            for (int i17 = 0; i17 < i14; i17++) {
                long[] jArr = this.state;
                jArr[i17] = jArr[i17] ^ Pack.littleEndianToLong(this.dataQueue, i16);
                i16 += 8;
            }
            if (i15 > 0) {
                long[] jArr2 = this.state;
                jArr2[i14] = (((1 << i15) - 1) & Pack.littleEndianToLong(this.dataQueue, i16)) ^ jArr2[i14];
            }
        }
        long[] jArr3 = this.state;
        int i18 = (this.rate - 1) >>> 6;
        jArr3[i18] = jArr3[i18] ^ Long.MIN_VALUE;
        this.bitsInQueue = 0;
        this.squeezing = true;
    }

    public void absorb(byte[] bArr, int i11, int i12) {
        int i13 = this.bitsInQueue;
        if (i13 % 8 != 0) {
            h2.b("attempt to absorb with odd length queue");
            return;
        }
        if (this.squeezing) {
            h2.b("attempt to absorb while squeezing");
            return;
        }
        int i14 = i13 >>> 3;
        int i15 = this.rate >>> 3;
        int i16 = i15 - i14;
        if (i12 < i16) {
            System.arraycopy(bArr, i11, this.dataQueue, i14, i12);
            this.bitsInQueue += i12 << 3;
            return;
        }
        if (i14 > 0) {
            System.arraycopy(bArr, i11, this.dataQueue, i14, i16);
            KeccakAbsorb(this.dataQueue, 0);
        } else {
            i16 = 0;
        }
        while (true) {
            int i17 = i12 - i16;
            if (i17 < i15) {
                System.arraycopy(bArr, i11 + i16, this.dataQueue, 0, i17);
                this.bitsInQueue = i17 << 3;
                return;
            } else {
                KeccakAbsorb(bArr, i11 + i16);
                i16 += i15;
            }
        }
    }

    public void absorbBits(int i11, int i12) {
        if (i12 < 1 || i12 > 7) {
            a.f("'bits' must be in the range 1 to 7");
            return;
        }
        int i13 = this.bitsInQueue;
        if (i13 % 8 != 0) {
            h2.b("attempt to absorb with odd length queue");
        } else if (this.squeezing) {
            h2.b("attempt to absorb while squeezing");
        } else {
            this.dataQueue[i13 >>> 3] = (byte) (i11 & ((1 << i12) - 1));
            this.bitsInQueue = i13 + i12;
        }
    }

    public CryptoServiceProperties cryptoServiceProperties() {
        return Utils.getDefaultProperties(this, getDigestSize() * 8, this.purpose);
    }

    public int doFinal(byte[] bArr, int i11, byte b8, int i12) {
        if (i12 > 0) {
            absorbBits(b8, i12);
        }
        squeeze(bArr, i11, this.fixedOutputLength);
        reset();
        return getDigestSize();
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "Keccak-" + this.fixedOutputLength;
    }

    @Override // org.bouncycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return this.rate / 8;
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return this.fixedOutputLength / 8;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
        init(this.fixedOutputLength);
    }

    public void squeeze(byte[] bArr, int i11, long j9) {
        if (!this.squeezing) {
            padAndSwitchToSqueezingPhase();
        }
        long j11 = 0;
        if (j9 % 8 != 0) {
            h2.b("outputLength not a multiple of 8");
            return;
        }
        while (j11 < j9) {
            if (this.bitsInQueue == 0) {
                KeccakExtract();
            }
            int iMin = (int) Math.min(this.bitsInQueue, j9 - j11);
            System.arraycopy(this.dataQueue, (this.rate - this.bitsInQueue) / 8, bArr, ((int) (j11 / 8)) + i11, iMin / 8);
            this.bitsInQueue -= iMin;
            j11 += (long) iMin;
        }
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b8) {
        absorb(b8);
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i11, int i12) {
        absorb(bArr, i11, i12);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i11) {
        squeeze(bArr, i11, this.fixedOutputLength);
        reset();
        return getDigestSize();
    }

    public KeccakDigest(int i11) {
        this(i11, CryptoServicePurpose.ANY);
    }

    public KeccakDigest(int i11, CryptoServicePurpose cryptoServicePurpose) {
        this.state = new long[25];
        this.dataQueue = new byte[BERTags.PRIVATE];
        this.purpose = cryptoServicePurpose;
        init(i11);
        CryptoServicesRegistrar.checkConstraints(cryptoServiceProperties());
    }

    public KeccakDigest(CryptoServicePurpose cryptoServicePurpose) {
        this(288, cryptoServicePurpose);
    }

    public KeccakDigest() {
        this(288, CryptoServicePurpose.ANY);
    }

    public void absorb(byte b8) {
        int i11 = this.bitsInQueue;
        if (i11 % 8 != 0) {
            h2.b("attempt to absorb with odd length queue");
            return;
        }
        if (this.squeezing) {
            h2.b("attempt to absorb while squeezing");
            return;
        }
        byte[] bArr = this.dataQueue;
        bArr[i11 >>> 3] = b8;
        int i12 = i11 + 8;
        this.bitsInQueue = i12;
        if (i12 == this.rate) {
            KeccakAbsorb(bArr, 0);
            this.bitsInQueue = 0;
        }
    }
}
