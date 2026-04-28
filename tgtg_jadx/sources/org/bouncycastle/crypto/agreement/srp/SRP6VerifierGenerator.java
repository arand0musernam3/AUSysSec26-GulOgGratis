package org.bouncycastle.crypto.agreement.srp;

import java.math.BigInteger;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.params.SRP6GroupParameters;

/* JADX INFO: loaded from: classes3.dex */
public class SRP6VerifierGenerator {
    protected BigInteger N;
    protected Digest digest;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected BigInteger f33047g;

    public BigInteger generateVerifier(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return this.f33047g.modPow(SRP6Util.calculateX(this.digest, this.N, bArr, bArr2, bArr3), this.N);
    }

    public void init(SRP6GroupParameters sRP6GroupParameters, Digest digest) {
        this.N = sRP6GroupParameters.getN();
        this.f33047g = sRP6GroupParameters.getG();
        this.digest = digest;
    }

    public void init(BigInteger bigInteger, BigInteger bigInteger2, Digest digest) {
        this.N = bigInteger;
        this.f33047g = bigInteger2;
        this.digest = digest;
    }
}
