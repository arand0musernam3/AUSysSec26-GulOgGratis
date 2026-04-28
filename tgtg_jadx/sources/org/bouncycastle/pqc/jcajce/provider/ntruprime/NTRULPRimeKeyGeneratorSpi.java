package org.bouncycastle.pqc.jcajce.provider.ntruprime;

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
import org.bouncycastle.pqc.crypto.ntruprime.NTRULPRimeKEMExtractor;
import org.bouncycastle.pqc.crypto.ntruprime.NTRULPRimeKEMGenerator;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class NTRULPRimeKeyGeneratorSpi extends KeyGeneratorSpi {
    private KEMExtractSpec extSpec;
    private KEMGenerateSpec genSpec;
    private SecureRandom random;

    @Override // javax.crypto.KeyGeneratorSpi
    public SecretKey engineGenerateKey() {
        KEMGenerateSpec kEMGenerateSpec = this.genSpec;
        if (kEMGenerateSpec == null) {
            NTRULPRimeKEMExtractor nTRULPRimeKEMExtractor = new NTRULPRimeKEMExtractor(((BCNTRULPRimePrivateKey) this.extSpec.getPrivateKey()).getKeyParams());
            byte[] encapsulation = this.extSpec.getEncapsulation();
            byte[] bArrExtractSecret = nTRULPRimeKEMExtractor.extractSecret(encapsulation);
            SecretKeyWithEncapsulation secretKeyWithEncapsulation = new SecretKeyWithEncapsulation(new SecretKeySpec(bArrExtractSecret, this.extSpec.getKeyAlgorithmName()), encapsulation);
            Arrays.clear(bArrExtractSecret);
            return secretKeyWithEncapsulation;
        }
        SecretWithEncapsulation secretWithEncapsulationGenerateEncapsulated = new NTRULPRimeKEMGenerator(this.random).generateEncapsulated(((BCNTRULPRimePublicKey) kEMGenerateSpec.getPublicKey()).getKeyParams());
        SecretKeyWithEncapsulation secretKeyWithEncapsulation2 = new SecretKeyWithEncapsulation(new SecretKeySpec(secretWithEncapsulationGenerateEncapsulated.getSecret(), this.genSpec.getKeyAlgorithmName()), secretWithEncapsulationGenerateEncapsulated.getEncapsulation());
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
        } else if (!(algorithmParameterSpec instanceof KEMExtractSpec)) {
            i1.v("unknown spec");
        } else {
            this.genSpec = null;
            this.extSpec = (KEMExtractSpec) algorithmParameterSpec;
        }
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
