package org.bouncycastle.jcajce.provider.asymmetric.compositesignatures;

import com.braze.h2;
import i4.a;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.internal.asn1.misc.MiscObjectIdentifiers;
import org.bouncycastle.jcajce.CompositePrivateKey;
import org.bouncycastle.jcajce.CompositePublicKey;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import r8.k;

/* JADX INFO: loaded from: classes3.dex */
public class KeyPairGeneratorSpi extends java.security.KeyPairGeneratorSpi {
    private final ASN1ObjectIdentifier algorithm;
    private final KeyPairGenerator[] generators;
    private boolean parametersInitialized = false;
    private SecureRandom secureRandom;

    public static final class HashMLDSA44_ECDSA_P256_SHA256 extends KeyPairGeneratorSpi {
        public HashMLDSA44_ECDSA_P256_SHA256() {
            super(MiscObjectIdentifiers.id_HashMLDSA44_ECDSA_P256_SHA256);
        }
    }

    public static final class HashMLDSA44_Ed25519_SHA512 extends KeyPairGeneratorSpi {
        public HashMLDSA44_Ed25519_SHA512() {
            super(MiscObjectIdentifiers.id_HashMLDSA44_Ed25519_SHA512);
        }
    }

    public static final class HashMLDSA44_RSA2048_PKCS15_SHA256 extends KeyPairGeneratorSpi {
        public HashMLDSA44_RSA2048_PKCS15_SHA256() {
            super(MiscObjectIdentifiers.id_HashMLDSA44_RSA2048_PKCS15_SHA256);
        }
    }

    public static final class HashMLDSA44_RSA2048_PSS_SHA256 extends KeyPairGeneratorSpi {
        public HashMLDSA44_RSA2048_PSS_SHA256() {
            super(MiscObjectIdentifiers.id_HashMLDSA44_RSA2048_PSS_SHA256);
        }
    }

    public static final class HashMLDSA65_ECDSA_P384_SHA512 extends KeyPairGeneratorSpi {
        public HashMLDSA65_ECDSA_P384_SHA512() {
            super(MiscObjectIdentifiers.id_HashMLDSA65_ECDSA_P384_SHA512);
        }
    }

    public static final class HashMLDSA65_ECDSA_brainpoolP256r1_SHA512 extends KeyPairGeneratorSpi {
        public HashMLDSA65_ECDSA_brainpoolP256r1_SHA512() {
            super(MiscObjectIdentifiers.id_HashMLDSA65_ECDSA_brainpoolP256r1_SHA512);
        }
    }

    public static final class HashMLDSA65_Ed25519_SHA512 extends KeyPairGeneratorSpi {
        public HashMLDSA65_Ed25519_SHA512() {
            super(MiscObjectIdentifiers.id_HashMLDSA65_Ed25519_SHA512);
        }
    }

    public static final class HashMLDSA65_RSA3072_PKCS15_SHA512 extends KeyPairGeneratorSpi {
        public HashMLDSA65_RSA3072_PKCS15_SHA512() {
            super(MiscObjectIdentifiers.id_HashMLDSA65_RSA3072_PKCS15_SHA512);
        }
    }

    public static final class HashMLDSA65_RSA3072_PSS_SHA512 extends KeyPairGeneratorSpi {
        public HashMLDSA65_RSA3072_PSS_SHA512() {
            super(MiscObjectIdentifiers.id_HashMLDSA65_RSA3072_PSS_SHA512);
        }
    }

    public static final class HashMLDSA65_RSA4096_PKCS15_SHA512 extends KeyPairGeneratorSpi {
        public HashMLDSA65_RSA4096_PKCS15_SHA512() {
            super(MiscObjectIdentifiers.id_HashMLDSA65_RSA4096_PKCS15_SHA512);
        }
    }

    public static final class HashMLDSA65_RSA4096_PSS_SHA512 extends KeyPairGeneratorSpi {
        public HashMLDSA65_RSA4096_PSS_SHA512() {
            super(MiscObjectIdentifiers.id_HashMLDSA65_RSA4096_PSS_SHA512);
        }
    }

    public static final class HashMLDSA87_ECDSA_P384_SHA512 extends KeyPairGeneratorSpi {
        public HashMLDSA87_ECDSA_P384_SHA512() {
            super(MiscObjectIdentifiers.id_HashMLDSA87_ECDSA_P384_SHA512);
        }
    }

    public static final class HashMLDSA87_ECDSA_brainpoolP384r1_SHA512 extends KeyPairGeneratorSpi {
        public HashMLDSA87_ECDSA_brainpoolP384r1_SHA512() {
            super(MiscObjectIdentifiers.id_HashMLDSA87_ECDSA_brainpoolP384r1_SHA512);
        }
    }

    public static final class HashMLDSA87_Ed448_SHA512 extends KeyPairGeneratorSpi {
        public HashMLDSA87_Ed448_SHA512() {
            super(MiscObjectIdentifiers.id_HashMLDSA87_Ed448_SHA512);
        }
    }

    public static final class MLDSA44_ECDSA_P256_SHA256 extends KeyPairGeneratorSpi {
        public MLDSA44_ECDSA_P256_SHA256() {
            super(MiscObjectIdentifiers.id_MLDSA44_ECDSA_P256_SHA256);
        }
    }

    public static final class MLDSA44_Ed25519_SHA512 extends KeyPairGeneratorSpi {
        public MLDSA44_Ed25519_SHA512() {
            super(MiscObjectIdentifiers.id_MLDSA44_Ed25519_SHA512);
        }
    }

    public static final class MLDSA44_RSA2048_PKCS15_SHA256 extends KeyPairGeneratorSpi {
        public MLDSA44_RSA2048_PKCS15_SHA256() {
            super(MiscObjectIdentifiers.id_MLDSA44_RSA2048_PKCS15_SHA256);
        }
    }

    public static final class MLDSA44_RSA2048_PSS_SHA256 extends KeyPairGeneratorSpi {
        public MLDSA44_RSA2048_PSS_SHA256() {
            super(MiscObjectIdentifiers.id_MLDSA44_RSA2048_PSS_SHA256);
        }
    }

    public static final class MLDSA65_ECDSA_P384_SHA384 extends KeyPairGeneratorSpi {
        public MLDSA65_ECDSA_P384_SHA384() {
            super(MiscObjectIdentifiers.id_MLDSA65_ECDSA_P384_SHA384);
        }
    }

    public static final class MLDSA65_ECDSA_brainpoolP256r1_SHA256 extends KeyPairGeneratorSpi {
        public MLDSA65_ECDSA_brainpoolP256r1_SHA256() {
            super(MiscObjectIdentifiers.id_MLDSA65_ECDSA_brainpoolP256r1_SHA256);
        }
    }

    public static final class MLDSA65_Ed25519_SHA512 extends KeyPairGeneratorSpi {
        public MLDSA65_Ed25519_SHA512() {
            super(MiscObjectIdentifiers.id_MLDSA65_Ed25519_SHA512);
        }
    }

    public static final class MLDSA65_RSA3072_PKCS15_SHA256 extends KeyPairGeneratorSpi {
        public MLDSA65_RSA3072_PKCS15_SHA256() {
            super(MiscObjectIdentifiers.id_MLDSA65_RSA3072_PKCS15_SHA256);
        }
    }

    public static final class MLDSA65_RSA3072_PSS_SHA256 extends KeyPairGeneratorSpi {
        public MLDSA65_RSA3072_PSS_SHA256() {
            super(MiscObjectIdentifiers.id_MLDSA65_RSA3072_PSS_SHA256);
        }
    }

    public static final class MLDSA65_RSA4096_PKCS15_SHA384 extends KeyPairGeneratorSpi {
        public MLDSA65_RSA4096_PKCS15_SHA384() {
            super(MiscObjectIdentifiers.id_MLDSA65_RSA4096_PKCS15_SHA384);
        }
    }

    public static final class MLDSA65_RSA4096_PSS_SHA384 extends KeyPairGeneratorSpi {
        public MLDSA65_RSA4096_PSS_SHA384() {
            super(MiscObjectIdentifiers.id_MLDSA65_RSA4096_PSS_SHA384);
        }
    }

    public static final class MLDSA87_ECDSA_P384_SHA384 extends KeyPairGeneratorSpi {
        public MLDSA87_ECDSA_P384_SHA384() {
            super(MiscObjectIdentifiers.id_MLDSA87_ECDSA_P384_SHA384);
        }
    }

    public static final class MLDSA87_ECDSA_brainpoolP384r1_SHA384 extends KeyPairGeneratorSpi {
        public MLDSA87_ECDSA_brainpoolP384r1_SHA384() {
            super(MiscObjectIdentifiers.id_MLDSA87_ECDSA_brainpoolP384r1_SHA384);
        }
    }

    public static final class MLDSA87_Ed448_SHA512 extends KeyPairGeneratorSpi {
        public MLDSA87_Ed448_SHA512() {
            super(MiscObjectIdentifiers.id_MLDSA87_Ed448_SHA512);
        }
    }

    public KeyPairGeneratorSpi(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.algorithm = aSN1ObjectIdentifier;
        String[] pairing = CompositeIndex.getPairing(aSN1ObjectIdentifier);
        AlgorithmParameterSpec[] keyPairSpecs = CompositeIndex.getKeyPairSpecs(aSN1ObjectIdentifier);
        this.generators = new KeyPairGenerator[pairing.length];
        for (int i11 = 0; i11 != pairing.length; i11++) {
            try {
                this.generators[i11] = KeyPairGenerator.getInstance(CompositeIndex.getBaseName(pairing[i11]), BouncyCastleProvider.PROVIDER_NAME);
                AlgorithmParameterSpec algorithmParameterSpec = keyPairSpecs[i11];
                if (algorithmParameterSpec != null) {
                    this.generators[i11].initialize(algorithmParameterSpec);
                }
            } catch (Exception e5) {
                h2.b(k.j(e5, new StringBuilder("unable to create base generator: ")));
                throw null;
            }
        }
    }

    private KeyPair getCompositeKeyPair() {
        KeyPairGenerator[] keyPairGeneratorArr = this.generators;
        PublicKey[] publicKeyArr = new PublicKey[keyPairGeneratorArr.length];
        PrivateKey[] privateKeyArr = new PrivateKey[keyPairGeneratorArr.length];
        int i11 = 0;
        while (true) {
            KeyPairGenerator[] keyPairGeneratorArr2 = this.generators;
            if (i11 >= keyPairGeneratorArr2.length) {
                return new KeyPair(new CompositePublicKey(this.algorithm, publicKeyArr), new CompositePrivateKey(this.algorithm, privateKeyArr));
            }
            KeyPair keyPairGenerateKeyPair = keyPairGeneratorArr2[i11].generateKeyPair();
            publicKeyArr[i11] = keyPairGenerateKeyPair.getPublic();
            privateKeyArr[i11] = keyPairGenerateKeyPair.getPrivate();
            i11++;
        }
    }

    @Override // java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        return getCompositeKeyPair();
    }

    @Override // java.security.KeyPairGeneratorSpi
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        if (algorithmParameterSpec != null) {
            a.f("Use initialize only for custom SecureRandom. AlgorithmParameterSpec must be null because it is determined by algorithm name.");
            return;
        }
        AlgorithmParameterSpec[] keyPairSpecs = CompositeIndex.getKeyPairSpecs(this.algorithm);
        for (int i11 = 0; i11 != keyPairSpecs.length; i11++) {
            AlgorithmParameterSpec algorithmParameterSpec2 = keyPairSpecs[i11];
            if (algorithmParameterSpec2 != null) {
                this.generators[i11].initialize(algorithmParameterSpec2, secureRandom);
            }
        }
    }

    @Override // java.security.KeyPairGeneratorSpi
    public void initialize(int i11, SecureRandom secureRandom) {
        throw new IllegalArgumentException("use AlgorithmParameterSpec");
    }
}
