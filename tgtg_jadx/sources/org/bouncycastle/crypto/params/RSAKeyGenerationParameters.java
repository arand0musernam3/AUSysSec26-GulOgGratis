package org.bouncycastle.crypto.params;

import i4.a;
import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.KeyGenerationParameters;

/* JADX INFO: loaded from: classes3.dex */
public class RSAKeyGenerationParameters extends KeyGenerationParameters {
    private int certainty;
    private BigInteger publicExponent;

    public RSAKeyGenerationParameters(BigInteger bigInteger, SecureRandom secureRandom, int i11, int i12) {
        super(secureRandom, i11);
        if (i11 < 12) {
            a.f("key strength too small");
            throw null;
        }
        if (!bigInteger.testBit(0)) {
            a.f("public exponent cannot be even");
            throw null;
        }
        this.publicExponent = bigInteger;
        this.certainty = i12;
    }

    public int getCertainty() {
        return this.certainty;
    }

    public BigInteger getPublicExponent() {
        return this.publicExponent;
    }
}
