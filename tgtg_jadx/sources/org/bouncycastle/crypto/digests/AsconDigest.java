package org.bouncycastle.crypto.digests;

import i4.a;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes3.dex */
public class AsconDigest extends AsconBaseDigest {
    AsconParameters asconParameters;

    /* JADX INFO: renamed from: org.bouncycastle.crypto.digests.AsconDigest$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$bouncycastle$crypto$digests$AsconDigest$AsconParameters;

        static {
            int[] iArr = new int[AsconParameters.values().length];
            $SwitchMap$org$bouncycastle$crypto$digests$AsconDigest$AsconParameters = iArr;
            try {
                iArr[AsconParameters.AsconHash.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$digests$AsconDigest$AsconParameters[AsconParameters.AsconHashA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum AsconParameters {
        AsconHash,
        AsconHashA
    }

    public AsconDigest(AsconParameters asconParameters) {
        String str;
        this.asconParameters = asconParameters;
        int i11 = AnonymousClass1.$SwitchMap$org$bouncycastle$crypto$digests$AsconDigest$AsconParameters[asconParameters.ordinal()];
        if (i11 == 1) {
            this.ASCON_PB_ROUNDS = 12;
            str = "Ascon-Hash";
        } else {
            if (i11 != 2) {
                a.f("Invalid parameter settings for Ascon Hash");
                throw null;
            }
            this.ASCON_PB_ROUNDS = 8;
            str = "Ascon-HashA";
        }
        this.algorithmName = str;
        reset();
    }

    @Override // org.bouncycastle.crypto.digests.BufferBaseDigest, org.bouncycastle.crypto.Digest
    public /* bridge */ /* synthetic */ int doFinal(byte[] bArr, int i11) {
        return super.doFinal(bArr, i11);
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

    @Override // org.bouncycastle.crypto.digests.AsconBaseDigest
    public long loadBytes(byte[] bArr, int i11) {
        return Pack.bigEndianToLong(bArr, i11);
    }

    @Override // org.bouncycastle.crypto.digests.AsconBaseDigest
    public long pad(int i11) {
        return 128 << (56 - (i11 << 3));
    }

    @Override // org.bouncycastle.crypto.digests.BufferBaseDigest, org.bouncycastle.crypto.Digest
    public void reset() {
        super.reset();
        int i11 = AnonymousClass1.$SwitchMap$org$bouncycastle$crypto$digests$AsconDigest$AsconParameters[this.asconParameters.ordinal()];
        if (i11 == 1) {
            this.f33048p.set(-1255492011513352131L, -8380609354527731710L, -5437372128236807582L, 4834782570098516968L, 3787428097924915520L);
        } else {
            if (i11 != 2) {
                return;
            }
            this.f33048p.set(92044056785660070L, 8326807761760157607L, 3371194088139667532L, -2956994353054992515L, -6828509670848688761L);
        }
    }

    @Override // org.bouncycastle.crypto.digests.AsconBaseDigest
    public void setBytes(long j9, byte[] bArr, int i11) {
        Pack.longToBigEndian(j9, bArr, i11);
    }

    @Override // org.bouncycastle.crypto.digests.BufferBaseDigest, org.bouncycastle.crypto.Digest
    public /* bridge */ /* synthetic */ void update(byte b8) {
        super.update(b8);
    }

    @Override // org.bouncycastle.crypto.digests.AsconBaseDigest
    public void setBytes(long j9, byte[] bArr, int i11, int i12) {
        Pack.longToBigEndian(j9, bArr, i11, i12);
    }

    @Override // org.bouncycastle.crypto.digests.BufferBaseDigest, org.bouncycastle.crypto.Digest
    public /* bridge */ /* synthetic */ void update(byte[] bArr, int i11, int i12) {
        super.update(bArr, i11, i12);
    }

    @Override // org.bouncycastle.crypto.digests.AsconBaseDigest
    public long loadBytes(byte[] bArr, int i11, int i12) {
        return Pack.bigEndianToLong(bArr, i11, i12);
    }
}
