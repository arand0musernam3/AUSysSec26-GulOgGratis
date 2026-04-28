package org.bouncycastle.crypto.params;

import c50.w;
import i4.a;
import org.bouncycastle.crypto.CipherParameters;

/* JADX INFO: loaded from: classes3.dex */
public class SM2KeyExchangePublicParameters implements CipherParameters {
    private final ECPublicKeyParameters ephemeralPublicKey;
    private final ECPublicKeyParameters staticPublicKey;

    public SM2KeyExchangePublicParameters(ECPublicKeyParameters eCPublicKeyParameters, ECPublicKeyParameters eCPublicKeyParameters2) {
        if (eCPublicKeyParameters == null) {
            w.l("staticPublicKey cannot be null");
            throw null;
        }
        if (eCPublicKeyParameters2 == null) {
            w.l("ephemeralPublicKey cannot be null");
            throw null;
        }
        if (!eCPublicKeyParameters.getParameters().equals(eCPublicKeyParameters2.getParameters())) {
            a.f("Static and ephemeral public keys have different domain parameters");
            throw null;
        }
        this.staticPublicKey = eCPublicKeyParameters;
        this.ephemeralPublicKey = eCPublicKeyParameters2;
    }

    public ECPublicKeyParameters getEphemeralPublicKey() {
        return this.ephemeralPublicKey;
    }

    public ECPublicKeyParameters getStaticPublicKey() {
        return this.staticPublicKey;
    }
}
