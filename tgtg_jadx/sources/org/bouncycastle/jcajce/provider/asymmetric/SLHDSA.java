package org.bouncycastle.jcajce.provider.asymmetric;

import j4.s;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyFactorySpi;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;

/* JADX INFO: loaded from: classes3.dex */
public class SLHDSA {
    private static final String PREFIX = "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.";

    public static class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm("KeyFactory.SLH-DSA", "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyFactorySpi$Pure");
            configurableProvider.addAlgorithm("KeyPairGenerator.SLH-DSA", "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyPairGeneratorSpi$Pure");
            configurableProvider.addAlgorithm("KeyFactory.HASH-SLH-DSA", "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyFactorySpi$Hash");
            configurableProvider.addAlgorithm("KeyPairGenerator.HASH-SLH-DSA", "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyPairGeneratorSpi$Hash");
            SLHDSAKeyFactorySpi.Hash hash = new SLHDSAKeyFactorySpi.Hash();
            ASN1ObjectIdentifier aSN1ObjectIdentifier = NISTObjectIdentifiers.id_slh_dsa_sha2_128s;
            addKeyFactoryAlgorithm(configurableProvider, "SLH-DSA-SHA2-128S", "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyFactorySpi$Sha2_128s", aSN1ObjectIdentifier, hash);
            ASN1ObjectIdentifier aSN1ObjectIdentifier2 = NISTObjectIdentifiers.id_slh_dsa_sha2_128f;
            addKeyFactoryAlgorithm(configurableProvider, "SLH-DSA-SHA2-128F", "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyFactorySpi$Sha2_128f", aSN1ObjectIdentifier2, hash);
            ASN1ObjectIdentifier aSN1ObjectIdentifier3 = NISTObjectIdentifiers.id_slh_dsa_sha2_192s;
            addKeyFactoryAlgorithm(configurableProvider, "SLH-DSA-SHA2-192S", "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyFactorySpi$Sha2_192s", aSN1ObjectIdentifier3, hash);
            ASN1ObjectIdentifier aSN1ObjectIdentifier4 = NISTObjectIdentifiers.id_slh_dsa_sha2_192f;
            addKeyFactoryAlgorithm(configurableProvider, "SLH-DSA-SHA2-192F", "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyFactorySpi$Sha2_192f", aSN1ObjectIdentifier4, hash);
            ASN1ObjectIdentifier aSN1ObjectIdentifier5 = NISTObjectIdentifiers.id_slh_dsa_sha2_256s;
            addKeyFactoryAlgorithm(configurableProvider, "SLH-DSA-SHA2-256S", "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyFactorySpi$Sha2_256s", aSN1ObjectIdentifier5, hash);
            ASN1ObjectIdentifier aSN1ObjectIdentifier6 = NISTObjectIdentifiers.id_slh_dsa_sha2_256f;
            addKeyFactoryAlgorithm(configurableProvider, "SLH-DSA-SHA2-256F", "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyFactorySpi$Sha2_256f", aSN1ObjectIdentifier6, hash);
            ASN1ObjectIdentifier aSN1ObjectIdentifier7 = NISTObjectIdentifiers.id_slh_dsa_shake_128s;
            addKeyFactoryAlgorithm(configurableProvider, "SLH-DSA-SHAKE-128S", "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyFactorySpi$Shake_128s", aSN1ObjectIdentifier7, hash);
            ASN1ObjectIdentifier aSN1ObjectIdentifier8 = NISTObjectIdentifiers.id_slh_dsa_shake_128f;
            addKeyFactoryAlgorithm(configurableProvider, "SLH-DSA-SHAKE-128F", "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyFactorySpi$Shake_128f", aSN1ObjectIdentifier8, hash);
            ASN1ObjectIdentifier aSN1ObjectIdentifier9 = NISTObjectIdentifiers.id_slh_dsa_shake_192s;
            addKeyFactoryAlgorithm(configurableProvider, "SLH-DSA-SHAKE-192S", "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyFactorySpi$Shake_192s", aSN1ObjectIdentifier9, hash);
            ASN1ObjectIdentifier aSN1ObjectIdentifier10 = NISTObjectIdentifiers.id_slh_dsa_shake_192f;
            addKeyFactoryAlgorithm(configurableProvider, "SLH-DSA-SHAKE-192F", "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyFactorySpi$Shake_192f", aSN1ObjectIdentifier10, hash);
            ASN1ObjectIdentifier aSN1ObjectIdentifier11 = NISTObjectIdentifiers.id_slh_dsa_shake_256s;
            addKeyFactoryAlgorithm(configurableProvider, "SLH-DSA-SHAKE-256S", "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyFactorySpi$Shake_256s", aSN1ObjectIdentifier11, hash);
            ASN1ObjectIdentifier aSN1ObjectIdentifier12 = NISTObjectIdentifiers.id_slh_dsa_shake_256f;
            addKeyFactoryAlgorithm(configurableProvider, "SLH-DSA-SHAKE-256F", "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyFactorySpi$Shake_256f", aSN1ObjectIdentifier12, hash);
            ASN1ObjectIdentifier aSN1ObjectIdentifier13 = NISTObjectIdentifiers.id_hash_slh_dsa_sha2_128s_with_sha256;
            addKeyFactoryAlgorithm(configurableProvider, "SLH-DSA-SHA2-128S-WITH-SHA256", "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyFactorySpi$HashSha2_128s", aSN1ObjectIdentifier13, hash);
            ASN1ObjectIdentifier aSN1ObjectIdentifier14 = NISTObjectIdentifiers.id_hash_slh_dsa_sha2_128f_with_sha256;
            addKeyFactoryAlgorithm(configurableProvider, "SLH-DSA-SHA2-128F-WITH-SHA256", "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyFactorySpi$HashSha2_128f", aSN1ObjectIdentifier14, hash);
            ASN1ObjectIdentifier aSN1ObjectIdentifier15 = NISTObjectIdentifiers.id_hash_slh_dsa_sha2_192s_with_sha512;
            addKeyFactoryAlgorithm(configurableProvider, "SLH-DSA-SHA2-192S-WITH-SHA512", "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyFactorySpi$HashSha2_192s", aSN1ObjectIdentifier15, hash);
            ASN1ObjectIdentifier aSN1ObjectIdentifier16 = NISTObjectIdentifiers.id_hash_slh_dsa_sha2_192f_with_sha512;
            addKeyFactoryAlgorithm(configurableProvider, "SLH-DSA-SHA2-192F-WITH-SHA512", "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyFactorySpi$HashSha2_192f", aSN1ObjectIdentifier16, hash);
            ASN1ObjectIdentifier aSN1ObjectIdentifier17 = NISTObjectIdentifiers.id_hash_slh_dsa_sha2_256s_with_sha512;
            addKeyFactoryAlgorithm(configurableProvider, "SLH-DSA-SHA2-256S-WITH-SHA512", "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyFactorySpi$HashSha2_256s", aSN1ObjectIdentifier17, hash);
            ASN1ObjectIdentifier aSN1ObjectIdentifier18 = NISTObjectIdentifiers.id_hash_slh_dsa_sha2_256f_with_sha512;
            addKeyFactoryAlgorithm(configurableProvider, "SLH-DSA-SHA2-256F-WITH-SHA512", "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyFactorySpi$HashSha2_256f", aSN1ObjectIdentifier18, hash);
            ASN1ObjectIdentifier aSN1ObjectIdentifier19 = NISTObjectIdentifiers.id_hash_slh_dsa_shake_128s_with_shake128;
            addKeyFactoryAlgorithm(configurableProvider, "SLH-DSA-SHAKE-128S-WITH-SHAKE128", "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyFactorySpi$HashShake_128s", aSN1ObjectIdentifier19, hash);
            ASN1ObjectIdentifier aSN1ObjectIdentifier20 = NISTObjectIdentifiers.id_hash_slh_dsa_shake_128f_with_shake128;
            addKeyFactoryAlgorithm(configurableProvider, "SLH-DSA-SHAKE-128F-WITH-SHAKE128", "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyFactorySpi$HashShake_128f", aSN1ObjectIdentifier20, hash);
            ASN1ObjectIdentifier aSN1ObjectIdentifier21 = NISTObjectIdentifiers.id_hash_slh_dsa_shake_192s_with_shake256;
            addKeyFactoryAlgorithm(configurableProvider, "SLH-DSA-SHAKE-192S-WITH-SHAKE256", "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyFactorySpi$HashShake_192s", aSN1ObjectIdentifier21, hash);
            ASN1ObjectIdentifier aSN1ObjectIdentifier22 = NISTObjectIdentifiers.id_hash_slh_dsa_shake_192f_with_shake256;
            addKeyFactoryAlgorithm(configurableProvider, "SLH-DSA-SHAKE-192F-WITH-SHAKE256", "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyFactorySpi$HashShake_192f", aSN1ObjectIdentifier22, hash);
            ASN1ObjectIdentifier aSN1ObjectIdentifier23 = NISTObjectIdentifiers.id_hash_slh_dsa_shake_256s_with_shake256;
            addKeyFactoryAlgorithm(configurableProvider, "SLH-DSA-SHAKE-256S-WITH-SHAKE256", "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyFactorySpi$HashShake_256s", aSN1ObjectIdentifier23, hash);
            ASN1ObjectIdentifier aSN1ObjectIdentifier24 = NISTObjectIdentifiers.id_hash_slh_dsa_shake_256f_with_shake256;
            addKeyFactoryAlgorithm(configurableProvider, "SLH-DSA-SHAKE-256F-WITH-SHAKE256", "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyFactorySpi$HashShake_256f", aSN1ObjectIdentifier24, hash);
            addKeyPairGeneratorAlgorithm(configurableProvider, "SLH-DSA-SHA2-128S", "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyPairGeneratorSpi$Sha2_128s", aSN1ObjectIdentifier);
            addKeyPairGeneratorAlgorithm(configurableProvider, "SLH-DSA-SHA2-128F", "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyPairGeneratorSpi$Sha2_128f", aSN1ObjectIdentifier2);
            addKeyPairGeneratorAlgorithm(configurableProvider, "SLH-DSA-SHA2-192S", "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyPairGeneratorSpi$Sha2_192s", aSN1ObjectIdentifier3);
            addKeyPairGeneratorAlgorithm(configurableProvider, "SLH-DSA-SHA2-192F", "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyPairGeneratorSpi$Sha2_192f", aSN1ObjectIdentifier4);
            addKeyPairGeneratorAlgorithm(configurableProvider, "SLH-DSA-SHA2-256S", "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyPairGeneratorSpi$Sha2_256s", aSN1ObjectIdentifier5);
            addKeyPairGeneratorAlgorithm(configurableProvider, "SLH-DSA-SHA2-256F", "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyPairGeneratorSpi$Sha2_256f", aSN1ObjectIdentifier6);
            addKeyPairGeneratorAlgorithm(configurableProvider, "SLH-DSA-SHAKE-128S", "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyPairGeneratorSpi$Shake_128s", aSN1ObjectIdentifier7);
            addKeyPairGeneratorAlgorithm(configurableProvider, "SLH-DSA-SHAKE-128F", "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyPairGeneratorSpi$Shake_128f", aSN1ObjectIdentifier8);
            addKeyPairGeneratorAlgorithm(configurableProvider, "SLH-DSA-SHAKE-192S", "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyPairGeneratorSpi$Shake_192s", aSN1ObjectIdentifier9);
            addKeyPairGeneratorAlgorithm(configurableProvider, "SLH-DSA-SHAKE-192F", "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyPairGeneratorSpi$Shake_192f", aSN1ObjectIdentifier10);
            addKeyPairGeneratorAlgorithm(configurableProvider, "SLH-DSA-SHAKE-256S", "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyPairGeneratorSpi$Shake_256s", aSN1ObjectIdentifier11);
            addKeyPairGeneratorAlgorithm(configurableProvider, "SLH-DSA-SHAKE-256F", "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyPairGeneratorSpi$Shake_256f", aSN1ObjectIdentifier12);
            addKeyPairGeneratorAlgorithm(configurableProvider, "SLH-DSA-SHA2-128S-WITH-SHA256", "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyPairGeneratorSpi$HashSha2_128s", aSN1ObjectIdentifier13);
            addKeyPairGeneratorAlgorithm(configurableProvider, "SLH-DSA-SHA2-128F-WITH-SHA256", "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyPairGeneratorSpi$HashSha2_128f", aSN1ObjectIdentifier14);
            addKeyPairGeneratorAlgorithm(configurableProvider, "SLH-DSA-SHA2-192S-WITH-SHA512", "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyPairGeneratorSpi$HashSha2_192s", aSN1ObjectIdentifier15);
            addKeyPairGeneratorAlgorithm(configurableProvider, "SLH-DSA-SHA2-192F-WITH-SHA512", "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyPairGeneratorSpi$HashSha2_192f", aSN1ObjectIdentifier16);
            addKeyPairGeneratorAlgorithm(configurableProvider, "SLH-DSA-SHA2-256S-WITH-SHA512", "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyPairGeneratorSpi$HashSha2_256s", aSN1ObjectIdentifier17);
            addKeyPairGeneratorAlgorithm(configurableProvider, "SLH-DSA-SHA2-256F-WITH-SHA512", "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyPairGeneratorSpi$HashSha2_256f", aSN1ObjectIdentifier18);
            addKeyPairGeneratorAlgorithm(configurableProvider, "SLH-DSA-SHAKE-128S-WITH-SHAKE128", "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyPairGeneratorSpi$HashShake_128s", aSN1ObjectIdentifier19);
            addKeyPairGeneratorAlgorithm(configurableProvider, "SLH-DSA-SHAKE-128F-WITH-SHAKE128", "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyPairGeneratorSpi$HashShake_128f", aSN1ObjectIdentifier20);
            addKeyPairGeneratorAlgorithm(configurableProvider, "SLH-DSA-SHAKE-192S-WITH-SHAKE256", "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyPairGeneratorSpi$HashShake_192s", aSN1ObjectIdentifier21);
            addKeyPairGeneratorAlgorithm(configurableProvider, "SLH-DSA-SHAKE-192F-WITH-SHAKE256", "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyPairGeneratorSpi$HashShake_192f", aSN1ObjectIdentifier22);
            addKeyPairGeneratorAlgorithm(configurableProvider, "SLH-DSA-SHAKE-256S-WITH-SHAKE256", "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyPairGeneratorSpi$HashShake_256s", aSN1ObjectIdentifier23);
            addKeyPairGeneratorAlgorithm(configurableProvider, "SLH-DSA-SHAKE-256F-WITH-SHAKE256", "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyPairGeneratorSpi$HashShake_256f", aSN1ObjectIdentifier24);
            String[] strArr = {"SLH-DSA-SHA2-128S", "SLH-DSA-SHA2-128F", "SLH-DSA-SHA2-192S", "SLH-DSA-SHA2-192F", "SLH-DSA-SHA2-256S", "SLH-DSA-SHA2-256F", "SLH-DSA-SHAKE-128S", "SLH-DSA-SHAKE-128F", "SLH-DSA-SHAKE-192S", "SLH-DSA-SHAKE-192F", "SLH-DSA-SHAKE-256S", "SLH-DSA-SHAKE-256F"};
            String[] strArr2 = {"SLH-DSA-SHA2-128S-WITH-SHA256", "SLH-DSA-SHA2-128F-WITH-SHA256", "SLH-DSA-SHA2-192S-WITH-SHA512", "SLH-DSA-SHA2-192F-WITH-SHA512", "SLH-DSA-SHA2-256S-WITH-SHA512", "SLH-DSA-SHA2-256F-WITH-SHA512", "SLH-DSA-SHAKE-128S-WITH-SHAKE128", "SLH-DSA-SHAKE-128F-WITH-SHAKE128", "SLH-DSA-SHAKE-192S-WITH-SHAKE256", "SLH-DSA-SHAKE-192F-WITH-SHAKE256", "SLH-DSA-SHAKE-256S-WITH-SHAKE256", "SLH-DSA-SHAKE-256F-WITH-SHAKE256"};
            addSignatureAlgorithm(configurableProvider, "SLH-DSA", "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SignatureSpi$Direct", (ASN1ObjectIdentifier) null);
            configurableProvider.addAlgorithm("Alg.Alias.Signature.SLHDSA", "SLH-DSA");
            addSignatureAlgorithm(configurableProvider, "HASH-SLH-DSA", "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.HashSignatureSpi$Direct", (ASN1ObjectIdentifier) null);
            configurableProvider.addAlgorithm("Alg.Alias.Signature.HASHWITHSLHDSA", "HASH-SLH-DSA");
            for (int i11 = 0; i11 != 12; i11++) {
                configurableProvider.addAlgorithm("Alg.Alias.Signature." + strArr[i11], "SLH-DSA");
            }
            for (int i12 = 0; i12 != 12; i12++) {
                configurableProvider.addAlgorithm("Alg.Alias.Signature." + strArr2[i12], "HASH-SLH-DSA");
            }
            ASN1ObjectIdentifier[] aSN1ObjectIdentifierArr = {NISTObjectIdentifiers.id_slh_dsa_sha2_128s, NISTObjectIdentifiers.id_slh_dsa_sha2_128f, NISTObjectIdentifiers.id_slh_dsa_sha2_192s, NISTObjectIdentifiers.id_slh_dsa_sha2_192f, NISTObjectIdentifiers.id_slh_dsa_sha2_256s, NISTObjectIdentifiers.id_slh_dsa_sha2_256f, NISTObjectIdentifiers.id_slh_dsa_shake_128s, NISTObjectIdentifiers.id_slh_dsa_shake_128f, NISTObjectIdentifiers.id_slh_dsa_shake_192s, NISTObjectIdentifiers.id_slh_dsa_shake_192f, NISTObjectIdentifiers.id_slh_dsa_shake_256s, NISTObjectIdentifiers.id_slh_dsa_shake_256f};
            for (int i13 = 0; i13 != 12; i13++) {
                StringBuilder sbR = s.r(new StringBuilder("Alg.Alias.Signature."), aSN1ObjectIdentifierArr[i13], configurableProvider, "SLH-DSA", "Alg.Alias.Signature.OID.");
                sbR.append(aSN1ObjectIdentifierArr[i13]);
                configurableProvider.addAlgorithm(sbR.toString(), "SLH-DSA");
            }
            ASN1ObjectIdentifier[] aSN1ObjectIdentifierArr2 = {NISTObjectIdentifiers.id_hash_slh_dsa_sha2_128s_with_sha256, NISTObjectIdentifiers.id_hash_slh_dsa_sha2_128f_with_sha256, NISTObjectIdentifiers.id_hash_slh_dsa_shake_128s_with_shake128, NISTObjectIdentifiers.id_hash_slh_dsa_shake_128f_with_shake128, NISTObjectIdentifiers.id_hash_slh_dsa_sha2_192s_with_sha512, NISTObjectIdentifiers.id_hash_slh_dsa_sha2_192f_with_sha512, NISTObjectIdentifiers.id_hash_slh_dsa_shake_192s_with_shake256, NISTObjectIdentifiers.id_hash_slh_dsa_shake_192f_with_shake256, NISTObjectIdentifiers.id_hash_slh_dsa_sha2_256s_with_sha512, NISTObjectIdentifiers.id_hash_slh_dsa_sha2_256f_with_sha512, NISTObjectIdentifiers.id_hash_slh_dsa_shake_256s_with_shake256, NISTObjectIdentifiers.id_hash_slh_dsa_shake_256f_with_shake256};
            for (int i14 = 0; i14 != 12; i14++) {
                StringBuilder sbR2 = s.r(new StringBuilder("Alg.Alias.Signature."), aSN1ObjectIdentifierArr2[i14], configurableProvider, "HASH-SLH-DSA", "Alg.Alias.Signature.OID.");
                sbR2.append(aSN1ObjectIdentifierArr2[i14]);
                configurableProvider.addAlgorithm(sbR2.toString(), "HASH-SLH-DSA");
            }
        }
    }
}
