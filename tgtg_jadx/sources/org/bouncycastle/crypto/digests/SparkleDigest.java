package org.bouncycastle.crypto.digests;

import i4.a;
import kotlin.jvm.internal.ByteCompanionObject;
import org.bouncycastle.crypto.digests.BufferBaseDigest;
import org.bouncycastle.crypto.engines.SparkleEngine;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes3.dex */
public class SparkleDigest extends BufferBaseDigest {
    private static final int RATE_WORDS = 4;
    private final int SPARKLE_STEPS_BIG;
    private final int SPARKLE_STEPS_SLIM;
    private final int STATE_WORDS;
    private final int[] state;

    /* JADX INFO: renamed from: org.bouncycastle.crypto.digests.SparkleDigest$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$bouncycastle$crypto$digests$SparkleDigest$SparkleParameters;

        static {
            int[] iArr = new int[SparkleParameters.values().length];
            $SwitchMap$org$bouncycastle$crypto$digests$SparkleDigest$SparkleParameters = iArr;
            try {
                iArr[SparkleParameters.ESCH256.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$digests$SparkleDigest$SparkleParameters[SparkleParameters.ESCH384.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static class Friend {
        private static final Friend INSTANCE = new Friend();

        private Friend() {
        }
    }

    public enum SparkleParameters {
        ESCH256,
        ESCH384
    }

    public SparkleDigest(SparkleParameters sparkleParameters) {
        super(BufferBaseDigest.ProcessingBufferType.Buffered, 16);
        int i11 = AnonymousClass1.$SwitchMap$org$bouncycastle$crypto$digests$SparkleDigest$SparkleParameters[sparkleParameters.ordinal()];
        if (i11 == 1) {
            this.algorithmName = "ESCH-256";
            this.DigestSize = 32;
            this.SPARKLE_STEPS_SLIM = 7;
            this.SPARKLE_STEPS_BIG = 11;
            this.STATE_WORDS = 12;
        } else {
            if (i11 != 2) {
                a.f("Invalid definition of SCHWAEMM instance");
                throw null;
            }
            this.algorithmName = "ESCH-384";
            this.DigestSize = 48;
            this.SPARKLE_STEPS_SLIM = 8;
            this.SPARKLE_STEPS_BIG = 12;
            this.STATE_WORDS = 16;
        }
        this.state = new int[this.STATE_WORDS];
    }

    private static int ELL(int i11) {
        return (i11 & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH) ^ Integers.rotateRight(i11, 16);
    }

    private void processBlock(byte[] bArr, int i11, int i12) {
        int iLittleEndianToInt = Pack.littleEndianToInt(bArr, i11);
        int iLittleEndianToInt2 = Pack.littleEndianToInt(bArr, i11 + 4);
        int iLittleEndianToInt3 = Pack.littleEndianToInt(bArr, i11 + 8);
        int iLittleEndianToInt4 = Pack.littleEndianToInt(bArr, i11 + 12);
        int iELL = ELL(iLittleEndianToInt ^ iLittleEndianToInt3);
        int iELL2 = ELL(iLittleEndianToInt2 ^ iLittleEndianToInt4);
        int[] iArr = this.state;
        iArr[0] = (iLittleEndianToInt ^ iELL2) ^ iArr[0];
        iArr[1] = (iLittleEndianToInt2 ^ iELL) ^ iArr[1];
        iArr[2] = iArr[2] ^ (iLittleEndianToInt3 ^ iELL2);
        iArr[3] = (iLittleEndianToInt4 ^ iELL) ^ iArr[3];
        iArr[4] = iArr[4] ^ iELL2;
        iArr[5] = iArr[5] ^ iELL;
        if (this.STATE_WORDS != 16) {
            SparkleEngine.sparkle_opt12(Friend.INSTANCE, this.state, i12);
            return;
        }
        iArr[6] = iArr[6] ^ iELL2;
        iArr[7] = iELL ^ iArr[7];
        SparkleEngine.sparkle_opt16(Friend.INSTANCE, this.state, i12);
    }

    @Override // org.bouncycastle.crypto.digests.BufferBaseDigest, org.bouncycastle.crypto.Digest
    public /* bridge */ /* synthetic */ int doFinal(byte[] bArr, int i11) {
        return super.doFinal(bArr, i11);
    }

    @Override // org.bouncycastle.crypto.digests.BufferBaseDigest
    public void finish(byte[] bArr, int i11) {
        int i12 = this.m_bufPos;
        int i13 = this.BlockSize;
        int[] iArr = this.state;
        if (i12 < i13) {
            int i14 = (this.STATE_WORDS >> 1) - 1;
            iArr[i14] = iArr[i14] ^ 16777216;
            byte[] bArr2 = this.m_buf;
            int i15 = i12 + 1;
            this.m_bufPos = i15;
            bArr2[i12] = ByteCompanionObject.MIN_VALUE;
            Arrays.fill(bArr2, i15, i13, (byte) 0);
        } else {
            int i16 = (this.STATE_WORDS >> 1) - 1;
            iArr[i16] = iArr[i16] ^ 33554432;
        }
        processBlock(this.m_buf, 0, this.SPARKLE_STEPS_BIG);
        Pack.intToLittleEndian(this.state, 0, 4, bArr, i11);
        if (this.STATE_WORDS != 16) {
            SparkleEngine.sparkle_opt12(Friend.INSTANCE, this.state, this.SPARKLE_STEPS_SLIM);
            Pack.intToLittleEndian(this.state, 0, 4, bArr, i11 + 16);
        } else {
            SparkleEngine.sparkle_opt16(Friend.INSTANCE, this.state, this.SPARKLE_STEPS_SLIM);
            Pack.intToLittleEndian(this.state, 0, 4, bArr, i11 + 16);
            SparkleEngine.sparkle_opt16(Friend.INSTANCE, this.state, this.SPARKLE_STEPS_SLIM);
            Pack.intToLittleEndian(this.state, 0, 4, bArr, i11 + 32);
        }
    }

    @Override // org.bouncycastle.crypto.digests.BufferBaseDigest, org.bouncycastle.crypto.Digest
    public /* bridge */ /* synthetic */ String getAlgorithmName() {
        return super.getAlgorithmName();
    }

    @Override // org.bouncycastle.crypto.digests.BufferBaseDigest, org.bouncycastle.crypto.ExtendedDigest
    public /* bridge */ /* synthetic */ int getByteLength() {
        return super.getByteLength();
    }

    @Override // org.bouncycastle.crypto.digests.BufferBaseDigest, org.bouncycastle.crypto.Digest
    public /* bridge */ /* synthetic */ int getDigestSize() {
        return super.getDigestSize();
    }

    @Override // org.bouncycastle.crypto.digests.BufferBaseDigest
    public void processBytes(byte[] bArr, int i11) {
        processBlock(bArr, i11, this.SPARKLE_STEPS_SLIM);
    }

    @Override // org.bouncycastle.crypto.digests.BufferBaseDigest, org.bouncycastle.crypto.Digest
    public void reset() {
        super.reset();
        Arrays.fill(this.state, 0);
    }

    @Override // org.bouncycastle.crypto.digests.BufferBaseDigest, org.bouncycastle.crypto.Digest
    public /* bridge */ /* synthetic */ void update(byte b8) {
        super.update(b8);
    }

    @Override // org.bouncycastle.crypto.digests.BufferBaseDigest, org.bouncycastle.crypto.Digest
    public /* bridge */ /* synthetic */ void update(byte[] bArr, int i11, int i12) {
        super.update(bArr, i11, i12);
    }
}
