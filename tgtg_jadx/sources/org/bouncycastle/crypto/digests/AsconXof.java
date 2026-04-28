package org.bouncycastle.crypto.digests;

import i4.a;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes3.dex */
public class AsconXof extends AsconXofBase {
    AsconParameters asconParameters;

    /* JADX INFO: renamed from: org.bouncycastle.crypto.digests.AsconXof$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$bouncycastle$crypto$digests$AsconXof$AsconParameters;

        static {
            int[] iArr = new int[AsconParameters.values().length];
            $SwitchMap$org$bouncycastle$crypto$digests$AsconXof$AsconParameters = iArr;
            try {
                iArr[AsconParameters.AsconXof.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$digests$AsconXof$AsconParameters[AsconParameters.AsconXofA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum AsconParameters {
        AsconXof,
        AsconXofA
    }

    public AsconXof(AsconParameters asconParameters) {
        String str;
        this.BlockSize = 8;
        this.asconParameters = asconParameters;
        int i11 = AnonymousClass1.$SwitchMap$org$bouncycastle$crypto$digests$AsconXof$AsconParameters[asconParameters.ordinal()];
        if (i11 == 1) {
            this.ASCON_PB_ROUNDS = 12;
            str = "Ascon-Xof";
        } else {
            if (i11 != 2) {
                a.f("Invalid parameter settings for Ascon Hash");
                throw null;
            }
            this.ASCON_PB_ROUNDS = 8;
            str = "Ascon-XofA";
        }
        this.algorithmName = str;
        reset();
    }

    @Override // org.bouncycastle.crypto.digests.BufferBaseDigest, org.bouncycastle.crypto.Digest
    public /* bridge */ /* synthetic */ int doFinal(byte[] bArr, int i11) {
        return super.doFinal(bArr, i11);
    }

    @Override // org.bouncycastle.crypto.digests.AsconXofBase, org.bouncycastle.crypto.Xof
    public /* bridge */ /* synthetic */ int doOutput(byte[] bArr, int i11, int i12) {
        return super.doOutput(bArr, i11, i12);
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

    @Override // org.bouncycastle.crypto.digests.AsconXofBase, org.bouncycastle.crypto.digests.BufferBaseDigest, org.bouncycastle.crypto.Digest
    public void reset() {
        super.reset();
        int i11 = AnonymousClass1.$SwitchMap$org$bouncycastle$crypto$digests$AsconXof$AsconParameters[this.asconParameters.ordinal()];
        if (i11 == 1) {
            this.f33048p.set(-5368810569253202922L, 3121280575360345120L, 7395939140700676632L, 6533890155656471820L, 5710016986865767350L);
        } else {
            if (i11 != 2) {
                return;
            }
            this.f33048p.set(4940560291654768690L, -3635129828240960206L, -597534922722107095L, 2623493988082852443L, -6283826724160825537L);
        }
    }

    @Override // org.bouncycastle.crypto.digests.AsconBaseDigest
    public void setBytes(long j9, byte[] bArr, int i11) {
        Pack.longToBigEndian(j9, bArr, i11);
    }

    @Override // org.bouncycastle.crypto.digests.AsconXofBase, org.bouncycastle.crypto.digests.BufferBaseDigest, org.bouncycastle.crypto.Digest
    public /* bridge */ /* synthetic */ void update(byte b8) {
        super.update(b8);
    }

    @Override // org.bouncycastle.crypto.digests.AsconBaseDigest
    public void setBytes(long j9, byte[] bArr, int i11, int i12) {
        Pack.longToBigEndian(j9, bArr, i11, i12);
    }

    @Override // org.bouncycastle.crypto.digests.AsconXofBase, org.bouncycastle.crypto.digests.BufferBaseDigest, org.bouncycastle.crypto.Digest
    public /* bridge */ /* synthetic */ void update(byte[] bArr, int i11, int i12) {
        super.update(bArr, i11, i12);
    }

    @Override // org.bouncycastle.crypto.digests.AsconXofBase, org.bouncycastle.crypto.Xof
    public /* bridge */ /* synthetic */ int doFinal(byte[] bArr, int i11, int i12) {
        return super.doFinal(bArr, i11, i12);
    }

    @Override // org.bouncycastle.crypto.digests.AsconBaseDigest
    public long loadBytes(byte[] bArr, int i11, int i12) {
        return Pack.bigEndianToLong(bArr, i11, i12);
    }
}
