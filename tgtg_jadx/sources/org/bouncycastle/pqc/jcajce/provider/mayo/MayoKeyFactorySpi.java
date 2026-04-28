package org.bouncycastle.pqc.jcajce.provider.mayo;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashSet;
import java.util.Set;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.bc.BCObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.jcajce.provider.asymmetric.a;
import org.bouncycastle.pqc.jcajce.provider.util.BaseKeyFactorySpi;
import w.a0;

/* JADX INFO: loaded from: classes3.dex */
public class MayoKeyFactorySpi extends BaseKeyFactorySpi {
    private static final Set<ASN1ObjectIdentifier> keyOids;

    public static class Mayo1 extends MayoKeyFactorySpi {
        public Mayo1() {
            super(BCObjectIdentifiers.mayo1);
        }
    }

    public static class Mayo2 extends MayoKeyFactorySpi {
        public Mayo2() {
            super(BCObjectIdentifiers.mayo2);
        }
    }

    public static class Mayo3 extends MayoKeyFactorySpi {
        public Mayo3() {
            super(BCObjectIdentifiers.mayo3);
        }
    }

    public static class Mayo5 extends MayoKeyFactorySpi {
        public Mayo5() {
            super(BCObjectIdentifiers.mayo5);
        }
    }

    static {
        HashSet hashSet = new HashSet();
        keyOids = hashSet;
        hashSet.add(BCObjectIdentifiers.mayo1);
        hashSet.add(BCObjectIdentifiers.mayo2);
        hashSet.add(BCObjectIdentifiers.mayo3);
        hashSet.add(BCObjectIdentifiers.mayo5);
    }

    public MayoKeyFactorySpi() {
        super(keyOids);
    }

    @Override // java.security.KeyFactorySpi
    public final KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        if (key instanceof BCMayoPrivateKey) {
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new PKCS8EncodedKeySpec(key.getEncoded());
            }
        } else {
            if (!(key instanceof BCMayoPublicKey)) {
                throw new InvalidKeySpecException(a.h(key, new StringBuilder("Unsupported key type: "), "."));
            }
            if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new X509EncodedKeySpec(key.getEncoded());
            }
        }
        throw new InvalidKeySpecException(a0.n("Unknown key specification: ", cls, "."));
    }

    @Override // java.security.KeyFactorySpi
    public final Key engineTranslateKey(Key key) throws InvalidKeyException {
        if ((key instanceof BCMayoPrivateKey) || (key instanceof BCMayoPublicKey)) {
            return key;
        }
        org.bouncycastle.jce.provider.a.i("Unsupported key type");
        return null;
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public PrivateKey generatePrivate(PrivateKeyInfo privateKeyInfo) throws IOException {
        return new BCMayoPrivateKey(privateKeyInfo);
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public PublicKey generatePublic(SubjectPublicKeyInfo subjectPublicKeyInfo) throws IOException {
        return new BCMayoPublicKey(subjectPublicKeyInfo);
    }

    public MayoKeyFactorySpi(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        super(aSN1ObjectIdentifier);
    }
}
