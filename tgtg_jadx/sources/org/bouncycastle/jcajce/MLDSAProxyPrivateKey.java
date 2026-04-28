package org.bouncycastle.jcajce;

import i4.a;
import java.security.PublicKey;
import org.bouncycastle.jcajce.interfaces.MLDSAPrivateKey;
import org.bouncycastle.jcajce.interfaces.MLDSAPublicKey;
import org.bouncycastle.jcajce.spec.MLDSAParameterSpec;

/* JADX INFO: loaded from: classes3.dex */
public class MLDSAProxyPrivateKey implements MLDSAPrivateKey {
    private final MLDSAPublicKey publicKey;

    public MLDSAProxyPrivateKey(PublicKey publicKey) {
        if (publicKey instanceof MLDSAPublicKey) {
            this.publicKey = (MLDSAPublicKey) publicKey;
        } else {
            a.f("public key must be an ML-DSA public key");
            throw null;
        }
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return this.publicKey.getAlgorithm();
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        return new byte[0];
    }

    @Override // java.security.Key
    public String getFormat() {
        return null;
    }

    @Override // org.bouncycastle.jcajce.interfaces.MLDSAKey
    public MLDSAParameterSpec getParameterSpec() {
        return this.publicKey.getParameterSpec();
    }

    @Override // org.bouncycastle.jcajce.interfaces.MLDSAPrivateKey
    public byte[] getPrivateData() {
        return new byte[0];
    }

    @Override // org.bouncycastle.jcajce.interfaces.MLDSAPrivateKey
    public MLDSAPrivateKey getPrivateKey(boolean z11) {
        return null;
    }

    @Override // org.bouncycastle.jcajce.interfaces.MLDSAPrivateKey
    public MLDSAPublicKey getPublicKey() {
        return this.publicKey;
    }

    @Override // org.bouncycastle.jcajce.interfaces.MLDSAPrivateKey
    public byte[] getSeed() {
        return new byte[0];
    }
}
