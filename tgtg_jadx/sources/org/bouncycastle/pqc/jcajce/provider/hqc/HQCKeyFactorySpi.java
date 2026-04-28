package org.bouncycastle.pqc.jcajce.provider.hqc;

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
import m0.i1;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.bc.BCObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.jcajce.provider.asymmetric.a;
import org.bouncycastle.pqc.jcajce.provider.util.BaseKeyFactorySpi;
import w.a0;

/* JADX INFO: loaded from: classes3.dex */
public class HQCKeyFactorySpi extends BaseKeyFactorySpi {
    private static final Set<ASN1ObjectIdentifier> keyOids;

    public static class HQC128 extends HQCKeyFactorySpi {
        public HQC128() {
            super(BCObjectIdentifiers.hqc128);
        }
    }

    public static class HQC192 extends HQCKeyFactorySpi {
        public HQC192() {
            super(BCObjectIdentifiers.hqc192);
        }
    }

    public static class HQC256 extends HQCKeyFactorySpi {
        public HQC256() {
            super(BCObjectIdentifiers.hqc256);
        }
    }

    static {
        HashSet hashSet = new HashSet();
        keyOids = hashSet;
        hashSet.add(BCObjectIdentifiers.hqc128);
        hashSet.add(BCObjectIdentifiers.hqc192);
        hashSet.add(BCObjectIdentifiers.hqc256);
    }

    public HQCKeyFactorySpi() {
        super(keyOids);
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        if (!(keySpec instanceof PKCS8EncodedKeySpec)) {
            throw new InvalidKeySpecException(a.i(keySpec, new StringBuilder("Unsupported key specification: "), "."));
        }
        try {
            return generatePrivate(PrivateKeyInfo.getInstance(ASN1Primitive.fromByteArray(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
        } catch (Exception e5) {
            i1.p(e5);
            return null;
        }
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    public PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        if (!(keySpec instanceof X509EncodedKeySpec)) {
            org.bouncycastle.jce.provider.a.h(keySpec, "Unknown key specification: ");
            return null;
        }
        try {
            return generatePublic(SubjectPublicKeyInfo.getInstance(((X509EncodedKeySpec) keySpec).getEncoded()));
        } catch (Exception e5) {
            i1.p(e5);
            return null;
        }
    }

    @Override // java.security.KeyFactorySpi
    public final KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        if (key instanceof BCHQCPrivateKey) {
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new PKCS8EncodedKeySpec(key.getEncoded());
            }
        } else {
            if (!(key instanceof BCHQCPublicKey)) {
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
        if ((key instanceof BCHQCPrivateKey) || (key instanceof BCHQCPublicKey)) {
            return key;
        }
        org.bouncycastle.jce.provider.a.i("Unsupported key type");
        return null;
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public PrivateKey generatePrivate(PrivateKeyInfo privateKeyInfo) throws IOException {
        return new BCHQCPrivateKey(privateKeyInfo);
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public PublicKey generatePublic(SubjectPublicKeyInfo subjectPublicKeyInfo) throws IOException {
        return new BCHQCPublicKey(subjectPublicKeyInfo);
    }

    public HQCKeyFactorySpi(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        super(aSN1ObjectIdentifier);
    }
}
