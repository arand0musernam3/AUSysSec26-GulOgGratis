package org.bouncycastle.pqc.crypto.mlkem;

import java.security.SecureRandom;
import org.bouncycastle.crypto.EncapsulatedSecretGenerator;
import org.bouncycastle.crypto.SecretWithEncapsulation;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.pqc.crypto.util.SecretWithEncapsulationImpl;

/* JADX INFO: loaded from: classes3.dex */
public class MLKEMGenerator implements EncapsulatedSecretGenerator {

    /* JADX INFO: renamed from: sr, reason: collision with root package name */
    private final SecureRandom f33550sr;

    public MLKEMGenerator(SecureRandom secureRandom) {
        this.f33550sr = secureRandom;
    }

    @Override // org.bouncycastle.crypto.EncapsulatedSecretGenerator
    public SecretWithEncapsulation generateEncapsulated(AsymmetricKeyParameter asymmetricKeyParameter) {
        MLKEMPublicKeyParameters mLKEMPublicKeyParameters = (MLKEMPublicKeyParameters) asymmetricKeyParameter;
        MLKEMEngine engine = mLKEMPublicKeyParameters.getParameters().getEngine();
        engine.init(this.f33550sr);
        byte[] bArr = new byte[32];
        engine.getRandomBytes(bArr);
        byte[][] bArrKemEncrypt = engine.kemEncrypt(mLKEMPublicKeyParameters.getEncoded(), bArr);
        return new SecretWithEncapsulationImpl(bArrKemEncrypt[0], bArrKemEncrypt[1]);
    }

    public SecretWithEncapsulation internalGenerateEncapsulated(AsymmetricKeyParameter asymmetricKeyParameter, byte[] bArr) {
        MLKEMPublicKeyParameters mLKEMPublicKeyParameters = (MLKEMPublicKeyParameters) asymmetricKeyParameter;
        MLKEMEngine engine = mLKEMPublicKeyParameters.getParameters().getEngine();
        engine.init(this.f33550sr);
        byte[][] bArrKemEncryptInternal = engine.kemEncryptInternal(mLKEMPublicKeyParameters.getEncoded(), bArr);
        return new SecretWithEncapsulationImpl(bArrKemEncryptInternal[0], bArrKemEncryptInternal[1]);
    }
}
