package org.bouncycastle.pqc.crypto.sphincsplus;

import i4.a;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class SPHINCSPlusPublicKeyParameters extends SPHINCSPlusKeyParameters {

    /* JADX INFO: renamed from: pk, reason: collision with root package name */
    private final PK f33642pk;

    public SPHINCSPlusPublicKeyParameters(SPHINCSPlusParameters sPHINCSPlusParameters, byte[] bArr) {
        super(false, sPHINCSPlusParameters);
        int n11 = sPHINCSPlusParameters.getN();
        int i11 = n11 * 2;
        if (bArr.length == i11) {
            this.f33642pk = new PK(Arrays.copyOfRange(bArr, 0, n11), Arrays.copyOfRange(bArr, n11, i11));
        } else {
            a.f("public key encoding does not match parameters");
            throw null;
        }
    }

    public byte[] getEncoded() {
        PK pk2 = this.f33642pk;
        return Arrays.concatenate(pk2.seed, pk2.root);
    }

    public byte[] getRoot() {
        return Arrays.clone(this.f33642pk.root);
    }

    public byte[] getSeed() {
        return Arrays.clone(this.f33642pk.seed);
    }

    public SPHINCSPlusPublicKeyParameters(SPHINCSPlusParameters sPHINCSPlusParameters, PK pk2) {
        super(false, sPHINCSPlusParameters);
        this.f33642pk = pk2;
    }
}
