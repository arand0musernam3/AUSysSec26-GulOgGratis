package org.bouncycastle.crypto.params;

import c50.w;
import i4.a;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.ec.FixedPointCombMultiplier;

/* JADX INFO: loaded from: classes3.dex */
public class SM2KeyExchangePrivateParameters implements CipherParameters {
    private final ECPrivateKeyParameters ephemeralPrivateKey;
    private final ECPoint ephemeralPublicPoint;
    private final boolean initiator;
    private final ECPrivateKeyParameters staticPrivateKey;
    private final ECPoint staticPublicPoint;

    public SM2KeyExchangePrivateParameters(boolean z11, ECPrivateKeyParameters eCPrivateKeyParameters, ECPrivateKeyParameters eCPrivateKeyParameters2) {
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
        FixedPointCombMultiplier fixedPointCombMultiplier = new FixedPointCombMultiplier();
        this.initiator = z11;
        this.staticPrivateKey = eCPrivateKeyParameters;
        this.staticPublicPoint = fixedPointCombMultiplier.multiply(parameters.getG(), eCPrivateKeyParameters.getD()).normalize();
        this.ephemeralPrivateKey = eCPrivateKeyParameters2;
        this.ephemeralPublicPoint = fixedPointCombMultiplier.multiply(parameters.getG(), eCPrivateKeyParameters2.getD()).normalize();
    }

    public ECPrivateKeyParameters getEphemeralPrivateKey() {
        return this.ephemeralPrivateKey;
    }

    public ECPoint getEphemeralPublicPoint() {
        return this.ephemeralPublicPoint;
    }

    public ECPrivateKeyParameters getStaticPrivateKey() {
        return this.staticPrivateKey;
    }

    public ECPoint getStaticPublicPoint() {
        return this.staticPublicPoint;
    }

    public boolean isInitiator() {
        return this.initiator;
    }
}
