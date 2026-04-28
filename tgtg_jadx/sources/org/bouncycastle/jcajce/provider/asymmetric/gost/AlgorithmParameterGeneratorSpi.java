package org.bouncycastle.jcajce.provider.asymmetric.gost;

import a40.d0;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.generators.GOST3410ParametersGenerator;
import org.bouncycastle.crypto.params.GOST3410Parameters;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseAlgorithmParameterGeneratorSpi;
import org.bouncycastle.jce.spec.GOST3410ParameterSpec;
import org.bouncycastle.jce.spec.GOST3410PublicKeyParameterSetSpec;

/* JADX INFO: loaded from: classes3.dex */
public class AlgorithmParameterGeneratorSpi extends BaseAlgorithmParameterGeneratorSpi {
    protected SecureRandom random;
    protected int strength = 1024;

    @Override // java.security.AlgorithmParameterGeneratorSpi
    public AlgorithmParameters engineGenerateParameters() {
        GOST3410ParametersGenerator gOST3410ParametersGenerator = new GOST3410ParametersGenerator();
        SecureRandom secureRandom = this.random;
        int i11 = this.strength;
        if (secureRandom == null) {
            secureRandom = CryptoServicesRegistrar.getSecureRandom();
        }
        gOST3410ParametersGenerator.init(i11, 2, secureRandom);
        GOST3410Parameters gOST3410ParametersGenerateParameters = gOST3410ParametersGenerator.generateParameters();
        try {
            AlgorithmParameters algorithmParametersCreateParametersInstance = createParametersInstance("GOST3410");
            algorithmParametersCreateParametersInstance.init(new GOST3410ParameterSpec(new GOST3410PublicKeyParameterSetSpec(gOST3410ParametersGenerateParameters.getP(), gOST3410ParametersGenerateParameters.getQ(), gOST3410ParametersGenerateParameters.getA())));
            return algorithmParametersCreateParametersInstance;
        } catch (Exception e5) {
            d0.k(e5.getMessage());
            return null;
        }
    }

    @Override // java.security.AlgorithmParameterGeneratorSpi
    public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for GOST3410 parameter generation.");
    }

    @Override // java.security.AlgorithmParameterGeneratorSpi
    public void engineInit(int i11, SecureRandom secureRandom) {
        this.strength = i11;
        this.random = secureRandom;
    }
}
