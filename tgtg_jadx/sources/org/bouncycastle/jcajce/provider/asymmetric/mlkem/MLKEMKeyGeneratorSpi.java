package org.bouncycastle.jcajce.provider.asymmetric.mlkem;

import com.braze.h2;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.KeyGeneratorSpi;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.security.auth.DestroyFailedException;
import m0.i1;
import org.bouncycastle.crypto.SecretWithEncapsulation;
import org.bouncycastle.jcajce.SecretKeyWithEncapsulation;
import org.bouncycastle.jcajce.spec.KEMExtractSpec;
import org.bouncycastle.jcajce.spec.KEMGenerateSpec;
import org.bouncycastle.jcajce.spec.MLKEMParameterSpec;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMExtractor;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMGenerator;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMParameters;
import org.bouncycastle.pqc.jcajce.provider.util.KdfUtil;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class MLKEMKeyGeneratorSpi extends KeyGeneratorSpi {
    private KEMExtractSpec extSpec;
    private KEMGenerateSpec genSpec;
    private MLKEMParameters kyberParameters;
    private SecureRandom random;

    public static class MLKEM1024 extends MLKEMKeyGeneratorSpi {
        public MLKEM1024() {
            super(MLKEMParameters.ml_kem_1024);
        }
    }

    public static class MLKEM512 extends MLKEMKeyGeneratorSpi {
        public MLKEM512() {
            super(MLKEMParameters.ml_kem_512);
        }
    }

    public static class MLKEM768 extends MLKEMKeyGeneratorSpi {
        public MLKEM768() {
            super(MLKEMParameters.ml_kem_768);
        }
    }

    public MLKEMKeyGeneratorSpi(MLKEMParameters mLKEMParameters) {
        this.kyberParameters = mLKEMParameters;
    }

    @Override // javax.crypto.KeyGeneratorSpi
    public SecretKey engineGenerateKey() {
        KEMGenerateSpec kEMGenerateSpec = this.genSpec;
        if (kEMGenerateSpec == null) {
            MLKEMExtractor mLKEMExtractor = new MLKEMExtractor(((BCMLKEMPrivateKey) this.extSpec.getPrivateKey()).getKeyParams());
            byte[] encapsulation = this.extSpec.getEncapsulation();
            byte[] bArrExtractSecret = mLKEMExtractor.extractSecret(encapsulation);
            byte[] bArrMakeKeyBytes = KdfUtil.makeKeyBytes(this.extSpec, bArrExtractSecret);
            Arrays.clear(bArrExtractSecret);
            SecretKeyWithEncapsulation secretKeyWithEncapsulation = new SecretKeyWithEncapsulation(new SecretKeySpec(bArrMakeKeyBytes, this.extSpec.getKeyAlgorithmName()), encapsulation);
            Arrays.clear(bArrMakeKeyBytes);
            return secretKeyWithEncapsulation;
        }
        SecretWithEncapsulation secretWithEncapsulationGenerateEncapsulated = new MLKEMGenerator(this.random).generateEncapsulated(((BCMLKEMPublicKey) kEMGenerateSpec.getPublicKey()).getKeyParams());
        byte[] secret = secretWithEncapsulationGenerateEncapsulated.getSecret();
        byte[] bArrMakeKeyBytes2 = KdfUtil.makeKeyBytes(this.genSpec, secret);
        Arrays.clear(secret);
        SecretKeyWithEncapsulation secretKeyWithEncapsulation2 = new SecretKeyWithEncapsulation(new SecretKeySpec(bArrMakeKeyBytes2, this.genSpec.getKeyAlgorithmName()), secretWithEncapsulationGenerateEncapsulated.getEncapsulation());
        try {
            secretWithEncapsulationGenerateEncapsulated.destroy();
            return secretKeyWithEncapsulation2;
        } catch (DestroyFailedException unused) {
            h2.b("key cleanup failed");
            return null;
        }
    }

    @Override // javax.crypto.KeyGeneratorSpi
    public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        this.random = secureRandom;
        if (algorithmParameterSpec instanceof KEMGenerateSpec) {
            this.genSpec = (KEMGenerateSpec) algorithmParameterSpec;
            this.extSpec = null;
            MLKEMParameters mLKEMParameters = this.kyberParameters;
            if (mLKEMParameters != null) {
                String name = MLKEMParameterSpec.fromName(mLKEMParameters.getName()).getName();
                if (!name.equals(this.genSpec.getPublicKey().getAlgorithm())) {
                    throw new InvalidAlgorithmParameterException("key generator locked to ".concat(name));
                }
                return;
            }
            return;
        }
        if (!(algorithmParameterSpec instanceof KEMExtractSpec)) {
            i1.v("unknown spec");
            return;
        }
        this.genSpec = null;
        this.extSpec = (KEMExtractSpec) algorithmParameterSpec;
        MLKEMParameters mLKEMParameters2 = this.kyberParameters;
        if (mLKEMParameters2 != null) {
            String name2 = MLKEMParameterSpec.fromName(mLKEMParameters2.getName()).getName();
            if (!name2.equals(this.extSpec.getPrivateKey().getAlgorithm())) {
                throw new InvalidAlgorithmParameterException("key generator locked to ".concat(name2));
            }
        }
    }

    public MLKEMKeyGeneratorSpi() {
        this(null);
    }

    @Override // javax.crypto.KeyGeneratorSpi
    public void engineInit(SecureRandom secureRandom) {
        throw new UnsupportedOperationException("Operation not supported");
    }

    @Override // javax.crypto.KeyGeneratorSpi
    public void engineInit(int i11, SecureRandom secureRandom) {
        throw new UnsupportedOperationException("Operation not supported");
    }
}
