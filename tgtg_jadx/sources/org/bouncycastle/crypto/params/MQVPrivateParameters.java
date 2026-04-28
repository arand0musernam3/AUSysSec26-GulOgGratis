package org.bouncycastle.crypto.params;

import c50.w;
import i4.a;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.math.ec.FixedPointCombMultiplier;

/* JADX INFO: loaded from: classes3.dex */
public class MQVPrivateParameters implements CipherParameters {
    private ECPrivateKeyParameters ephemeralPrivateKey;
    private ECPublicKeyParameters ephemeralPublicKey;
    private ECPrivateKeyParameters staticPrivateKey;

    public MQVPrivateParameters(ECPrivateKeyParameters eCPrivateKeyParameters, ECPrivateKeyParameters eCPrivateKeyParameters2, ECPublicKeyParameters eCPublicKeyParameters) {
        if (eCPrivateKeyParameters == null) {
            w.l("staticPrivateKey cannot be null");
            throw null;
        }
        if (eCPrivateKeyParameters2 == null) {
            w.l("ephemeralPrivateKey cannot be null");
            throw null;
        }
        ECDomainParameters parameters = eCPrivateKeyParameters.getParameters();
        if (!parameters.equals(eCPrivateKeyParameters2.getParameters())) {
            a.f("Static and ephemeral private keys have different domain parameters");
            throw null;
        }
        if (eCPublicKeyParameters == null) {
            eCPublicKeyParameters = new ECPublicKeyParameters(new FixedPointCombMultiplier().multiply(parameters.getG(), eCPrivateKeyParameters2.getD()), parameters);
        } else if (!parameters.equals(eCPublicKeyParameters.getParameters())) {
            a.f("Ephemeral public key has different domain parameters");
            throw null;
        }
        this.staticPrivateKey = eCPrivateKeyParameters;
        this.ephemeralPrivateKey = eCPrivateKeyParameters2;
        this.ephemeralPublicKey = eCPublicKeyParameters;
    }

    public ECPrivateKeyParameters getEphemeralPrivateKey() {
        return this.ephemeralPrivateKey;
    }

    public ECPublicKeyParameters getEphemeralPublicKey() {
        return this.ephemeralPublicKey;
    }

    public ECPrivateKeyParameters getStaticPrivateKey() {
        return this.staticPrivateKey;
    }

    public MQVPrivateParameters(ECPrivateKeyParameters eCPrivateKeyParameters, ECPrivateKeyParameters eCPrivateKeyParameters2) {
        this(eCPrivateKeyParameters, eCPrivateKeyParameters2, null);
    }
}
