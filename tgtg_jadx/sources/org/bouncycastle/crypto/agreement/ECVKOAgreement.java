package org.bouncycastle.crypto.agreement;

import com.braze.h2;
import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.crypto.params.ParametersWithUKM;
import org.bouncycastle.math.ec.ECAlgorithms;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class ECVKOAgreement {
    private final Digest digest;
    private ECPrivateKeyParameters key;
    private BigInteger ukm;

    public ECVKOAgreement(Digest digest) {
        this.digest = digest;
    }

    public byte[] calculateAgreement(CipherParameters cipherParameters) {
        String str;
        ECPublicKeyParameters eCPublicKeyParameters = (ECPublicKeyParameters) cipherParameters;
        ECDomainParameters parameters = this.key.getParameters();
        if (parameters.equals(eCPublicKeyParameters.getParameters())) {
            BigInteger bigIntegerMod = parameters.getH().multiply(this.ukm).multiply(this.key.getD()).mod(parameters.getN());
            ECPoint eCPointCleanPoint = ECAlgorithms.cleanPoint(parameters.getCurve(), eCPublicKeyParameters.getQ());
            if (eCPointCleanPoint.isInfinity()) {
                str = "Infinity is not a valid public key for ECVKO";
            } else {
                ECPoint eCPointNormalize = eCPointCleanPoint.multiply(bigIntegerMod).normalize();
                if (!eCPointNormalize.isInfinity()) {
                    byte[] encoded = eCPointNormalize.getEncoded(false);
                    int length = encoded.length;
                    int i11 = length / 2;
                    int i12 = i11 * 2;
                    int i13 = length - i12;
                    Arrays.reverseInPlace(encoded, i13, i11);
                    Arrays.reverseInPlace(encoded, length - i11, i11);
                    byte[] bArr = new byte[this.digest.getDigestSize()];
                    this.digest.update(encoded, i13, i12);
                    this.digest.doFinal(bArr, 0);
                    return bArr;
                }
                str = "Infinity is not a valid agreement value for ECVKO";
            }
        } else {
            str = "ECVKO public key has wrong domain parameters";
        }
        h2.b(str);
        return null;
    }

    public int getAgreementSize() {
        return this.digest.getDigestSize();
    }

    public int getFieldSize() {
        return this.key.getParameters().getCurve().getFieldElementEncodingLength();
    }

    public void init(CipherParameters cipherParameters) {
        ParametersWithUKM parametersWithUKM = (ParametersWithUKM) cipherParameters;
        this.key = (ECPrivateKeyParameters) parametersWithUKM.getParameters();
        this.ukm = new BigInteger(1, Arrays.reverse(parametersWithUKM.getUKM()));
        CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties("ECVKO", this.key));
    }
}
