package org.bouncycastle.crypto.params;

import com.braze.h2;
import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.util.BigIntegers;

/* JADX INFO: loaded from: classes3.dex */
public class SAKKEPrivateKeyParameters extends AsymmetricKeyParameter {
    private static final BigInteger qMinOne = SAKKEPublicKeyParameters.f33263q.subtract(BigInteger.ONE);
    private final SAKKEPublicKeyParameters publicParams;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final BigInteger f33259z;

    public SAKKEPrivateKeyParameters(BigInteger bigInteger, SAKKEPublicKeyParameters sAKKEPublicKeyParameters) {
        super(true);
        this.f33259z = bigInteger;
        this.publicParams = sAKKEPublicKeyParameters;
        if (sAKKEPublicKeyParameters.getPoint().multiply(bigInteger).normalize().equals(sAKKEPublicKeyParameters.getZ())) {
            return;
        }
        h2.b("public key and private key of SAKKE do not match");
        throw null;
    }

    public BigInteger getMasterSecret() {
        return this.f33259z;
    }

    public SAKKEPublicKeyParameters getPublicParams() {
        return this.publicParams;
    }

    public SAKKEPrivateKeyParameters(SecureRandom secureRandom) {
        super(true);
        BigInteger bigInteger = BigIntegers.TWO;
        BigInteger bigInteger2 = qMinOne;
        BigInteger bigIntegerCreateRandomInRange = BigIntegers.createRandomInRange(bigInteger, bigInteger2, secureRandom);
        this.f33259z = bigIntegerCreateRandomInRange;
        this.publicParams = new SAKKEPublicKeyParameters(BigIntegers.createRandomInRange(bigInteger, bigInteger2, secureRandom), SAKKEPublicKeyParameters.P.multiply(bigIntegerCreateRandomInRange).normalize());
    }
}
