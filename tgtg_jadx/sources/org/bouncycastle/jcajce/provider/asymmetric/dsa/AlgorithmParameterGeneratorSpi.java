package org.bouncycastle.jcajce.provider.asymmetric.dsa;

import a40.d0;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.DSAParameterSpec;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.generators.DSAParametersGenerator;
import org.bouncycastle.crypto.params.DSAParameterGenerationParameters;
import org.bouncycastle.crypto.params.DSAParameters;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseAlgorithmParameterGeneratorSpi;
import org.bouncycastle.jcajce.provider.asymmetric.util.PrimeCertaintyCalculator;
import org.bouncycastle.jce.provider.a;
import org.bouncycastle.pqc.crypto.newhope.NewHope;

/* JADX INFO: loaded from: classes3.dex */
public class AlgorithmParameterGeneratorSpi extends BaseAlgorithmParameterGeneratorSpi {
    protected DSAParameterGenerationParameters params;
    protected SecureRandom random;
    protected int strength = NewHope.SENDB_BYTES;

    @Override // java.security.AlgorithmParameterGeneratorSpi
    public AlgorithmParameters engineGenerateParameters() {
        DSAParametersGenerator dSAParametersGenerator = this.strength <= 1024 ? new DSAParametersGenerator() : new DSAParametersGenerator(SHA256Digest.newInstance());
        if (this.random == null) {
            this.random = CryptoServicesRegistrar.getSecureRandom();
        }
        int defaultCertainty = PrimeCertaintyCalculator.getDefaultCertainty(this.strength);
        int i11 = this.strength;
        if (i11 == 1024) {
            DSAParameterGenerationParameters dSAParameterGenerationParameters = new DSAParameterGenerationParameters(1024, 160, defaultCertainty, this.random);
            this.params = dSAParameterGenerationParameters;
            dSAParametersGenerator.init(dSAParameterGenerationParameters);
        } else {
            SecureRandom secureRandom = this.random;
            if (i11 > 1024) {
                DSAParameterGenerationParameters dSAParameterGenerationParameters2 = new DSAParameterGenerationParameters(i11, 256, defaultCertainty, secureRandom);
                this.params = dSAParameterGenerationParameters2;
                dSAParametersGenerator.init(dSAParameterGenerationParameters2);
            } else {
                dSAParametersGenerator.init(i11, defaultCertainty, secureRandom);
            }
        }
        DSAParameters dSAParametersGenerateParameters = dSAParametersGenerator.generateParameters();
        try {
            AlgorithmParameters algorithmParametersCreateParametersInstance = createParametersInstance("DSA");
            algorithmParametersCreateParametersInstance.init(new DSAParameterSpec(dSAParametersGenerateParameters.getP(), dSAParametersGenerateParameters.getQ(), dSAParametersGenerateParameters.getG()));
            return algorithmParametersCreateParametersInstance;
        } catch (Exception e5) {
            d0.k(e5.getMessage());
            return null;
        }
    }

    @Override // java.security.AlgorithmParameterGeneratorSpi
    public void engineInit(int i11, SecureRandom secureRandom) {
        if (i11 < 512 || i11 > 3072) {
            a.t("strength must be from 512 - 3072");
            return;
        }
        if (i11 <= 1024 && i11 % 64 != 0) {
            a.t("strength must be a multiple of 64 below 1024 bits.");
        } else if (i11 > 1024 && i11 % 1024 != 0) {
            a.t("strength must be a multiple of 1024 above 1024 bits.");
        } else {
            this.strength = i11;
            this.random = secureRandom;
        }
    }

    @Override // java.security.AlgorithmParameterGeneratorSpi
    public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for DSA parameter generation.");
    }
}
