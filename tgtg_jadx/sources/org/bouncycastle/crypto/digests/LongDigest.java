package org.bouncycastle.crypto.digests;

import kotlin.jvm.internal.ByteCompanionObject;
import org.bouncycastle.crypto.CryptoServiceProperties;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.util.Memoable;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes3.dex */
public abstract class LongDigest implements ExtendedDigest, Memoable, EncodableDigest {
    private static final int BYTE_LENGTH = 128;
    static final long[] K = {4794697086780616226L, 8158064640168781261L, -5349999486874862801L, -1606136188198331460L, 4131703408338449720L, 6480981068601479193L, -7908458776815382629L, -6116909921290321640L, -2880145864133508542L, 1334009975649890238L, 2608012711638119052L, 6128411473006802146L, 8268148722764581231L, -9160688886553864527L, -7215885187991268811L, -4495734319001033068L, -1973867731355612462L, -1171420211273849373L, 1135362057144423861L, 2597628984639134821L, 3308224258029322869L, 5365058923640841347L, 6679025012923562964L, 8573033837759648693L, -7476448914759557205L, -6327057829258317296L, -5763719355590565569L, -4658551843659510044L, -4116276920077217854L, -3051310485924567259L, 489312712824947311L, 1452737877330783856L, 2861767655752347644L, 3322285676063803686L, 5560940570517711597L, 5996557281743188959L, 7280758554555802590L, 8532644243296465576L, -9096487096722542874L, -7894198246740708037L, -6719396339535248540L, -6333637450476146687L, -4446306890439682159L, -4076793802049405392L, -3345356375505022440L, -2983346525034927856L, -860691631967231958L, 1182934255886127544L, 1847814050463011016L, 2177327727835720531L, 2830643537854262169L, 3796741975233480872L, 4115178125766777443L, 5681478168544905931L, 6601373596472566643L, 7507060721942968483L, 8399075790359081724L, 8693463985226723168L, -8878714635349349518L, -8302665154208450068L, -8016688836872298968L, -6606660893046293015L, -4685533653050689259L, -4147400797238176981L, -3880063495543823972L, -3348786107499101689L, -1523767162380948706L, -757361751448694408L, 500013540394364858L, 748580250866718886L, 1242879168328830382L, 1977374033974150939L, 2944078676154940804L, 3659926193048069267L, 4368137639120453308L, 4836135668995329356L, 5532061633213252278L, 6448918945643986474L, 6902733635092675308L, 7801388544844847127L};
    protected long H1;
    protected long H2;
    protected long H3;
    protected long H4;
    protected long H5;
    protected long H6;
    protected long H7;
    protected long H8;
    private long[] W;
    private long byteCount1;
    private long byteCount2;
    protected final CryptoServicePurpose purpose;
    private int wOff;
    private byte[] xBuf;
    private int xBufOff;

    public LongDigest(CryptoServicePurpose cryptoServicePurpose) {
        this.xBuf = new byte[8];
        this.W = new long[80];
        this.purpose = cryptoServicePurpose;
        this.xBufOff = 0;
        reset();
    }

    private long Ch(long j9, long j11, long j12) {
        return ((~j9) & j12) ^ (j11 & j9);
    }

    private long Maj(long j9, long j11, long j12) {
        return ((j9 & j12) ^ (j9 & j11)) ^ (j11 & j12);
    }

    private long Sigma0(long j9) {
        return (j9 >>> 7) ^ (((j9 << 63) | (j9 >>> 1)) ^ ((j9 << 56) | (j9 >>> 8)));
    }

    private long Sigma1(long j9) {
        return (j9 >>> 6) ^ (((j9 << 45) | (j9 >>> 19)) ^ ((j9 << 3) | (j9 >>> 61)));
    }

    private long Sum0(long j9) {
        return ((j9 >>> 39) | (j9 << 25)) ^ (((j9 << 36) | (j9 >>> 28)) ^ ((j9 << 30) | (j9 >>> 34)));
    }

    private long Sum1(long j9) {
        return ((j9 >>> 41) | (j9 << 23)) ^ (((j9 << 50) | (j9 >>> 14)) ^ ((j9 << 46) | (j9 >>> 18)));
    }

    private void adjustByteCounts() {
        long j9 = this.byteCount1;
        if (j9 > 2305843009213693951L) {
            this.byteCount2 += j9 >>> 61;
            this.byteCount1 = j9 & 2305843009213693951L;
        }
    }

    public void copyIn(LongDigest longDigest) {
        byte[] bArr = longDigest.xBuf;
        System.arraycopy(bArr, 0, this.xBuf, 0, bArr.length);
        this.xBufOff = longDigest.xBufOff;
        this.byteCount1 = longDigest.byteCount1;
        this.byteCount2 = longDigest.byteCount2;
        this.H1 = longDigest.H1;
        this.H2 = longDigest.H2;
        this.H3 = longDigest.H3;
        this.H4 = longDigest.H4;
        this.H5 = longDigest.H5;
        this.H6 = longDigest.H6;
        this.H7 = longDigest.H7;
        this.H8 = longDigest.H8;
        long[] jArr = longDigest.W;
        System.arraycopy(jArr, 0, this.W, 0, jArr.length);
        this.wOff = longDigest.wOff;
    }

    public abstract CryptoServiceProperties cryptoServiceProperties();

    public void finish() {
        adjustByteCounts();
        long j9 = this.byteCount1 << 3;
        long j11 = this.byteCount2;
        byte b8 = ByteCompanionObject.MIN_VALUE;
        while (true) {
            update(b8);
            if (this.xBufOff == 0) {
                processLength(j9, j11);
                processBlock();
                return;
            }
            b8 = 0;
        }
    }

    @Override // org.bouncycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return 128;
    }

    public int getEncodedStateSize() {
        return (this.wOff * 8) + 96;
    }

    public void populateState(byte[] bArr) {
        System.arraycopy(this.xBuf, 0, bArr, 0, this.xBufOff);
        Pack.intToBigEndian(this.xBufOff, bArr, 8);
        Pack.longToBigEndian(this.byteCount1, bArr, 12);
        Pack.longToBigEndian(this.byteCount2, bArr, 20);
        Pack.longToBigEndian(this.H1, bArr, 28);
        Pack.longToBigEndian(this.H2, bArr, 36);
        Pack.longToBigEndian(this.H3, bArr, 44);
        Pack.longToBigEndian(this.H4, bArr, 52);
        Pack.longToBigEndian(this.H5, bArr, 60);
        Pack.longToBigEndian(this.H6, bArr, 68);
        Pack.longToBigEndian(this.H7, bArr, 76);
        Pack.longToBigEndian(this.H8, bArr, 84);
        Pack.intToBigEndian(this.wOff, bArr, 92);
        for (int i11 = 0; i11 < this.wOff; i11++) {
            Pack.longToBigEndian(this.W[i11], bArr, (i11 * 8) + 96);
        }
    }

    public void processBlock() {
        adjustByteCounts();
        for (int i11 = 16; i11 <= 79; i11++) {
            long[] jArr = this.W;
            long jSigma1 = Sigma1(jArr[i11 - 2]);
            long[] jArr2 = this.W;
            jArr[i11] = jSigma1 + jArr2[i11 - 7] + Sigma0(jArr2[i11 - 15]) + this.W[i11 - 16];
        }
        long j9 = this.H1;
        long j11 = this.H2;
        long j12 = this.H3;
        long j13 = this.H4;
        long j14 = this.H5;
        long j15 = j13;
        long j16 = this.H6;
        int i12 = 0;
        int i13 = 0;
        long j17 = j12;
        long j18 = this.H7;
        long j19 = this.H8;
        long j21 = j9;
        long j22 = j14;
        long j23 = j11;
        while (i12 < 10) {
            long j24 = j16;
            long j25 = j22;
            long j26 = j18;
            long jSum1 = Sum1(j22) + Ch(j22, j24, j18);
            long[] jArr3 = K;
            int i14 = i13 + 1;
            long j27 = jSum1 + jArr3[i13] + this.W[i13] + j19;
            long j28 = j15 + j27;
            long j29 = j21;
            long j31 = j23;
            long j32 = j17;
            long jSum0 = Sum0(j21) + Maj(j29, j31, j32) + j27;
            long jSum12 = Sum1(j28) + Ch(j28, j25, j24) + jArr3[i14];
            int i15 = i13 + 2;
            long j33 = jSum12 + this.W[i14] + j26;
            long j34 = j32 + j33;
            long jSum02 = Sum0(jSum0) + Maj(jSum0, j29, j31) + j33;
            int i16 = i13 + 3;
            long jSum13 = Sum1(j34) + Ch(j34, j28, j25) + jArr3[i15] + this.W[i15] + j24;
            long j35 = j31 + jSum13;
            long jSum03 = Sum0(jSum02) + Maj(jSum02, jSum0, j29) + jSum13;
            long jSum14 = Sum1(j35) + Ch(j35, j34, j28) + jArr3[i16];
            int i17 = i13 + 4;
            long j36 = jSum14 + this.W[i16] + j25;
            long j37 = j29 + j36;
            long jSum04 = Sum0(jSum03) + Maj(jSum03, jSum02, jSum0) + j36;
            long jSum15 = Sum1(j37) + Ch(j37, j35, j34) + jArr3[i17];
            int i18 = i13 + 5;
            long j38 = jSum15 + this.W[i17] + j28;
            long j39 = jSum0 + j38;
            long jSum05 = Sum0(jSum04) + Maj(jSum04, jSum03, jSum02) + j38;
            long jSum16 = Sum1(j39) + Ch(j39, j37, j35) + jArr3[i18];
            int i19 = i13 + 6;
            long j41 = jSum16 + this.W[i18] + j34;
            long j42 = jSum02 + j41;
            long jSum06 = Sum0(jSum05) + Maj(jSum05, jSum04, jSum03) + j41;
            int i21 = i13 + 7;
            long jSum17 = Sum1(j42) + Ch(j42, j39, j37) + jArr3[i19] + this.W[i19] + j35;
            long j43 = jSum03 + jSum17;
            long jSum07 = Sum0(jSum06) + Maj(jSum06, jSum05, jSum04) + jSum17;
            i13 += 8;
            long jSum18 = Sum1(j43) + Ch(j43, j42, j39) + jArr3[i21] + this.W[i21] + j37;
            long jSum08 = Sum0(jSum07) + Maj(jSum07, jSum06, jSum05) + jSum18;
            i12++;
            j23 = jSum07;
            j17 = jSum06;
            j22 = jSum04 + jSum18;
            j19 = j39;
            j16 = j43;
            j15 = jSum05;
            j21 = jSum08;
            j18 = j42;
        }
        this.H1 += j21;
        this.H2 += j23;
        this.H3 += j17;
        this.H4 += j15;
        this.H5 += j22;
        this.H6 += j16;
        this.H7 += j18;
        this.H8 += j19;
        this.wOff = 0;
        for (int i22 = 0; i22 < 16; i22++) {
            this.W[i22] = 0;
        }
    }

    public void processLength(long j9, long j11) {
        if (this.wOff > 14) {
            processBlock();
        }
        long[] jArr = this.W;
        jArr[14] = j11;
        jArr[15] = j9;
    }

    public void processWord(byte[] bArr, int i11) {
        this.W[this.wOff] = Pack.bigEndianToLong(bArr, i11);
        int i12 = this.wOff + 1;
        this.wOff = i12;
        if (i12 == 16) {
            processBlock();
        }
    }

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
        this.byteCount1 = 0L;
        this.byteCount2 = 0L;
        int i11 = 0;
        this.xBufOff = 0;
        int i12 = 0;
        while (true) {
            byte[] bArr = this.xBuf;
            if (i12 >= bArr.length) {
                break;
            }
            bArr[i12] = 0;
            i12++;
        }
        this.wOff = 0;
        while (true) {
            long[] jArr = this.W;
            if (i11 == jArr.length) {
                return;
            }
            jArr[i11] = 0;
            i11++;
        }
    }

    public void restoreState(byte[] bArr) {
        int iBigEndianToInt = Pack.bigEndianToInt(bArr, 8);
        this.xBufOff = iBigEndianToInt;
        System.arraycopy(bArr, 0, this.xBuf, 0, iBigEndianToInt);
        this.byteCount1 = Pack.bigEndianToLong(bArr, 12);
        this.byteCount2 = Pack.bigEndianToLong(bArr, 20);
        this.H1 = Pack.bigEndianToLong(bArr, 28);
        this.H2 = Pack.bigEndianToLong(bArr, 36);
        this.H3 = Pack.bigEndianToLong(bArr, 44);
        this.H4 = Pack.bigEndianToLong(bArr, 52);
        this.H5 = Pack.bigEndianToLong(bArr, 60);
        this.H6 = Pack.bigEndianToLong(bArr, 68);
        this.H7 = Pack.bigEndianToLong(bArr, 76);
        this.H8 = Pack.bigEndianToLong(bArr, 84);
        this.wOff = Pack.bigEndianToInt(bArr, 92);
        for (int i11 = 0; i11 < this.wOff; i11++) {
            this.W[i11] = Pack.bigEndianToLong(bArr, (i11 * 8) + 96);
        }
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i11, int i12) {
        while (this.xBufOff != 0 && i12 > 0) {
            update(bArr[i11]);
            i11++;
            i12--;
        }
        while (i12 >= this.xBuf.length) {
            processWord(bArr, i11);
            byte[] bArr2 = this.xBuf;
            i11 += bArr2.length;
            i12 -= bArr2.length;
            this.byteCount1 += (long) bArr2.length;
        }
        while (i12 > 0) {
            update(bArr[i11]);
            i11++;
            i12--;
        }
    }

    public LongDigest() {
        this(CryptoServicePurpose.ANY);
    }

    public LongDigest(LongDigest longDigest) {
        this.xBuf = new byte[8];
        this.W = new long[80];
        this.purpose = longDigest.purpose;
        copyIn(longDigest);
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b8) {
        byte[] bArr = this.xBuf;
        int i11 = this.xBufOff;
        int i12 = i11 + 1;
        this.xBufOff = i12;
        bArr[i11] = b8;
        if (i12 == bArr.length) {
            processWord(bArr, 0);
            this.xBufOff = 0;
        }
        this.byteCount1++;
    }
}
