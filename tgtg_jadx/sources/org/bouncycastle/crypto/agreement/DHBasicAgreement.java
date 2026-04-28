package org.bouncycastle.crypto.agreement;

import com.braze.h2;
import i4.a;
import java.math.BigInteger;
import org.bouncycastle.crypto.BasicAgreement;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.crypto.params.DHPrivateKeyParameters;
import org.bouncycastle.crypto.params.DHPublicKeyParameters;
import org.bouncycastle.crypto.params.ParametersWithRandom;

/* JADX INFO: loaded from: classes3.dex */
public class DHBasicAgreement implements BasicAgreement {
    private static final BigInteger ONE = BigInteger.valueOf(1);
    private DHParameters dhParams;
    private DHPrivateKeyParameters key;

    @Override // org.bouncycastle.crypto.BasicAgreement
    public BigInteger calculateAgreement(CipherParameters cipherParameters) {
        String str;
        DHPublicKeyParameters dHPublicKeyParameters = (DHPublicKeyParameters) cipherParameters;
        if (dHPublicKeyParameters.getParameters().equals(this.dhParams)) {
            BigInteger p7 = this.dhParams.getP();
            BigInteger y5 = dHPublicKeyParameters.getY();
            if (y5 != null) {
                BigInteger bigInteger = ONE;
                if (y5.compareTo(bigInteger) > 0 && y5.compareTo(p7.subtract(bigInteger)) < 0) {
                    BigInteger bigIntegerModPow = y5.modPow(this.key.getX(), p7);
                    if (!bigIntegerModPow.equals(bigInteger)) {
                        return bigIntegerModPow;
                    }
                    h2.b("Shared key can't be 1");
                    return null;
                }
            }
            str = "Diffie-Hellman public key is weak";
        } else {
            str = "Diffie-Hellman public key has wrong parameters.";
        }
        a.f(str);
        return null;
    }

    @Override // org.bouncycastle.crypto.BasicAgreement
    public int getFieldSize() {
        return (this.key.getParameters().getP().bitLength() + 7) / 8;
    }

    @Override // org.bouncycastle.crypto.BasicAgreement
    public void init(CipherParameters cipherParameters) {
        if (cipherParameters instanceof ParametersWithRandom) {
            cipherParameters = ((ParametersWithRandom) cipherParameters).getParameters();
        }
        AsymmetricKeyParameter asymmetricKeyParameter = (AsymmetricKeyParameter) cipherParameters;
        if (!(asymmetricKeyParameter instanceof DHPrivateKeyParameters)) {
            a.f("DHEngine expects DHPrivateKeyParameters");
            return;
        }
        DHPrivateKeyParameters dHPrivateKeyParameters = (DHPrivateKeyParameters) asymmetricKeyParameter;
        this.key = dHPrivateKeyParameters;
        this.dhParams = dHPrivateKeyParameters.getParameters();
        CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties("DHB", this.key));
    }
}
