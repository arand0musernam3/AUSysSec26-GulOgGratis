package org.bouncycastle.crypto.params;

import c50.w;
import i4.a;
import org.bouncycastle.crypto.CipherParameters;

/* JADX INFO: loaded from: classes3.dex */
public class XDHUPrivateParameters implements CipherParameters {
    private AsymmetricKeyParameter ephemeralPrivateKey;
    private AsymmetricKeyParameter ephemeralPublicKey;
    private AsymmetricKeyParameter staticPrivateKey;

    public XDHUPrivateParameters(AsymmetricKeyParameter asymmetricKeyParameter, AsymmetricKeyParameter asymmetricKeyParameter2, AsymmetricKeyParameter asymmetricKeyParameter3) {
        if (asymmetricKeyParameter == null) {
            w.l("staticPrivateKey cannot be null");
            throw null;
        }
        boolean z11 = asymmetricKeyParameter instanceof X448PrivateKeyParameters;
        if (!z11 && !(asymmetricKeyParameter instanceof X25519PrivateKeyParameters)) {
            a.f("only X25519 and X448 paramaters can be used");
            throw null;
        }
        if (asymmetricKeyParameter2 == null) {
            w.l("ephemeralPrivateKey cannot be null");
            throw null;
        }
        if (!asymmetricKeyParameter.getClass().isAssignableFrom(asymmetricKeyParameter2.getClass())) {
            a.f("static and ephemeral private keys have different domain parameters");
            throw null;
        }
        if (asymmetricKeyParameter3 == null) {
            asymmetricKeyParameter3 = asymmetricKeyParameter2 instanceof X448PrivateKeyParameters ? ((X448PrivateKeyParameters) asymmetricKeyParameter2).generatePublicKey() : ((X25519PrivateKeyParameters) asymmetricKeyParameter2).generatePublicKey();
        } else {
            if ((asymmetricKeyParameter3 instanceof X448PublicKeyParameters) && !z11) {
                a.f("ephemeral public key has different domain parameters");
                throw null;
            }
            if ((asymmetricKeyParameter3 instanceof X25519PublicKeyParameters) && !(asymmetricKeyParameter instanceof X25519PrivateKeyParameters)) {
                a.f("ephemeral public key has different domain parameters");
                throw null;
            }
        }
        this.staticPrivateKey = asymmetricKeyParameter;
        this.ephemeralPrivateKey = asymmetricKeyParameter2;
        this.ephemeralPublicKey = asymmetricKeyParameter3;
    }

    public AsymmetricKeyParameter getEphemeralPrivateKey() {
        return this.ephemeralPrivateKey;
    }

    public AsymmetricKeyParameter getEphemeralPublicKey() {
        return this.ephemeralPublicKey;
    }

    public AsymmetricKeyParameter getStaticPrivateKey() {
        return this.staticPrivateKey;
    }

    public XDHUPrivateParameters(AsymmetricKeyParameter asymmetricKeyParameter, AsymmetricKeyParameter asymmetricKeyParameter2) {
        this(asymmetricKeyParameter, asymmetricKeyParameter2, null);
    }
}
