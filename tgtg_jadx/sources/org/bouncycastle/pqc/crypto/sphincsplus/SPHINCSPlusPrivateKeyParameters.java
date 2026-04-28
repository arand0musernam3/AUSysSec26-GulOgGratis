package org.bouncycastle.pqc.crypto.sphincsplus;

import i4.a;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class SPHINCSPlusPrivateKeyParameters extends SPHINCSPlusKeyParameters {

    /* JADX INFO: renamed from: pk, reason: collision with root package name */
    final PK f33640pk;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    final SK f33641sk;

    public SPHINCSPlusPrivateKeyParameters(SPHINCSPlusParameters sPHINCSPlusParameters, byte[] bArr) {
        super(true, sPHINCSPlusParameters);
        int n11 = sPHINCSPlusParameters.getN();
        int i11 = n11 * 4;
        if (bArr.length != i11) {
            a.f("private key encoding does not match parameters");
            throw null;
        }
        int i12 = n11 * 2;
        this.f33641sk = new SK(Arrays.copyOfRange(bArr, 0, n11), Arrays.copyOfRange(bArr, n11, i12));
        int i13 = n11 * 3;
        this.f33640pk = new PK(Arrays.copyOfRange(bArr, i12, i13), Arrays.copyOfRange(bArr, i13, i11));
    }

    public byte[] getEncoded() {
        SK sk2 = this.f33641sk;
        byte[] bArr = sk2.seed;
        byte[] bArr2 = sk2.prf;
        PK pk2 = this.f33640pk;
        return Arrays.concatenate(new byte[][]{bArr, bArr2, pk2.seed, pk2.root});
    }

    public byte[] getEncodedPublicKey() {
        PK pk2 = this.f33640pk;
        return Arrays.concatenate(pk2.seed, pk2.root);
    }

    public byte[] getPrf() {
        return Arrays.clone(this.f33641sk.prf);
    }

    public byte[] getPublicKey() {
        PK pk2 = this.f33640pk;
        return Arrays.concatenate(pk2.seed, pk2.root);
    }

    public byte[] getPublicSeed() {
        return Arrays.clone(this.f33640pk.seed);
    }

    public byte[] getRoot() {
        return Arrays.clone(this.f33640pk.root);
    }

    public byte[] getSeed() {
        return Arrays.clone(this.f33641sk.seed);
    }

    public SPHINCSPlusPrivateKeyParameters(SPHINCSPlusParameters sPHINCSPlusParameters, SK sk2, PK pk2) {
        super(true, sPHINCSPlusParameters);
        this.f33641sk = sk2;
        this.f33640pk = pk2;
    }

    public SPHINCSPlusPrivateKeyParameters(SPHINCSPlusParameters sPHINCSPlusParameters, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        super(true, sPHINCSPlusParameters);
        this.f33641sk = new SK(bArr, bArr2);
        this.f33640pk = new PK(bArr3, bArr4);
    }
}
