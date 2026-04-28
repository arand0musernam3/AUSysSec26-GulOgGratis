package org.bouncycastle.crypto.agreement;

import com.braze.h2;
import i4.a;
import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.generators.DHKeyPairGenerator;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.DHKeyGenerationParameters;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.crypto.params.DHPrivateKeyParameters;
import org.bouncycastle.crypto.params.DHPublicKeyParameters;
import org.bouncycastle.crypto.params.ParametersWithRandom;

/* JADX INFO: loaded from: classes3.dex */
public class DHAgreement {
    private static final BigInteger ONE = BigInteger.valueOf(1);
    private DHParameters dhParams;
    private DHPrivateKeyParameters key;
    private BigInteger privateValue;
    private SecureRandom random;

    public BigInteger calculateAgreement(DHPublicKeyParameters dHPublicKeyParameters, BigInteger bigInteger) {
        if (!dHPublicKeyParameters.getParameters().equals(this.dhParams)) {
            a.f("Diffie-Hellman public key has wrong parameters.");
            return null;
        }
        BigInteger p7 = this.dhParams.getP();
        BigInteger y5 = dHPublicKeyParameters.getY();
        if (y5 != null) {
            BigInteger bigInteger2 = ONE;
            if (y5.compareTo(bigInteger2) > 0 && y5.compareTo(p7.subtract(bigInteger2)) < 0) {
                BigInteger bigIntegerModPow = y5.modPow(this.privateValue, p7);
                if (!bigIntegerModPow.equals(bigInteger2)) {
                    return bigInteger.modPow(this.key.getX(), p7).multiply(bigIntegerModPow).mod(p7);
                }
                h2.b("Shared key can't be 1");
                return null;
            }
        }
        a.f("Diffie-Hellman public key is weak");
        return null;
    }

    public BigInteger calculateMessage() {
        DHKeyPairGenerator dHKeyPairGenerator = new DHKeyPairGenerator();
        dHKeyPairGenerator.init(new DHKeyGenerationParameters(this.random, this.dhParams));
        AsymmetricCipherKeyPair asymmetricCipherKeyPairGenerateKeyPair = dHKeyPairGenerator.generateKeyPair();
        this.privateValue = ((DHPrivateKeyParameters) asymmetricCipherKeyPairGenerateKeyPair.getPrivate()).getX();
        return ((DHPublicKeyParameters) asymmetricCipherKeyPairGenerateKeyPair.getPublic()).getY();
    }

    public void init(CipherParameters cipherParameters) {
        if (cipherParameters instanceof ParametersWithRandom) {
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
            this.random = parametersWithRandom.getRandom();
            cipherParameters = parametersWithRandom.getParameters();
        } else {
            this.random = CryptoServicesRegistrar.getSecureRandom();
        }
        AsymmetricKeyParameter asymmetricKeyParameter = (AsymmetricKeyParameter) cipherParameters;
        if (!(asymmetricKeyParameter instanceof DHPrivateKeyParameters)) {
            a.f("DHEngine expects DHPrivateKeyParameters");
            return;
        }
        DHPrivateKeyParameters dHPrivateKeyParameters = (DHPrivateKeyParameters) asymmetricKeyParameter;
        this.key = dHPrivateKeyParameters;
        this.dhParams = dHPrivateKeyParameters.getParameters();
        CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties("DH", this.key));
    }
}
