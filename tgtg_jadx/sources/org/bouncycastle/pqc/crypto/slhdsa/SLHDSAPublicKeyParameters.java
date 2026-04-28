package org.bouncycastle.pqc.crypto.slhdsa;

import i4.a;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class SLHDSAPublicKeyParameters extends SLHDSAKeyParameters {

    /* JADX INFO: renamed from: pk, reason: collision with root package name */
    private final PK f33610pk;

    public SLHDSAPublicKeyParameters(SLHDSAParameters sLHDSAParameters, byte[] bArr) {
        super(false, sLHDSAParameters);
        int n11 = sLHDSAParameters.getN();
        int i11 = n11 * 2;
        if (bArr.length == i11) {
            this.f33610pk = new PK(Arrays.copyOfRange(bArr, 0, n11), Arrays.copyOfRange(bArr, n11, i11));
        } else {
            a.f("public key encoding does not match parameters");
            throw null;
        }
    }

    public byte[] getEncoded() {
        PK pk2 = this.f33610pk;
        return Arrays.concatenate(pk2.seed, pk2.root);
    }

    public byte[] getRoot() {
        return Arrays.clone(this.f33610pk.root);
    }

    public byte[] getSeed() {
        return Arrays.clone(this.f33610pk.seed);
    }

    public SLHDSAPublicKeyParameters(SLHDSAParameters sLHDSAParameters, PK pk2) {
        super(false, sLHDSAParameters);
        this.f33610pk = pk2;
    }
}
