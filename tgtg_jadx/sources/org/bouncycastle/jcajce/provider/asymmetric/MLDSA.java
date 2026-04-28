package org.bouncycastle.jcajce.provider.asymmetric;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.jcajce.provider.asymmetric.mldsa.MLDSAKeyFactorySpi;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;

/* JADX INFO: loaded from: classes3.dex */
public class MLDSA {
    private static final String PREFIX = "org.bouncycastle.jcajce.provider.asymmetric.mldsa.";

    public static class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm("KeyFactory.ML-DSA", "org.bouncycastle.jcajce.provider.asymmetric.mldsa.MLDSAKeyFactorySpi$Pure");
            configurableProvider.addAlgorithm("KeyPairGenerator.ML-DSA", "org.bouncycastle.jcajce.provider.asymmetric.mldsa.MLDSAKeyPairGeneratorSpi$Pure");
            configurableProvider.addAlgorithm("Alg.Alias.KeyFactory.MLDSA", "ML-DSA");
            configurableProvider.addAlgorithm("Alg.Alias.KeyPairGenerator.MLDSA", "ML-DSA");
            configurableProvider.addAlgorithm("KeyFactory.HASH-ML-DSA", "org.bouncycastle.jcajce.provider.asymmetric.mldsa.MLDSAKeyFactorySpi$Hash");
            configurableProvider.addAlgorithm("KeyPairGenerator.HASH-ML-DSA", "org.bouncycastle.jcajce.provider.asymmetric.mldsa.MLDSAKeyPairGeneratorSpi$Hash");
            configurableProvider.addAlgorithm("Alg.Alias.KeyFactory.SHA512WITHMLDSA", "HASH-ML-DSA");
            configurableProvider.addAlgorithm("Alg.Alias.KeyPairGenerator.SHA512WITHMLDSA", "HASH-ML-DSA");
            ASN1ObjectIdentifier aSN1ObjectIdentifier = NISTObjectIdentifiers.id_ml_dsa_44;
            addKeyFactoryAlgorithm(configurableProvider, "ML-DSA-44", "org.bouncycastle.jcajce.provider.asymmetric.mldsa.MLDSAKeyFactorySpi$MLDSA44", aSN1ObjectIdentifier, new MLDSAKeyFactorySpi.MLDSA44());
            ASN1ObjectIdentifier aSN1ObjectIdentifier2 = NISTObjectIdentifiers.id_ml_dsa_65;
            addKeyFactoryAlgorithm(configurableProvider, "ML-DSA-65", "org.bouncycastle.jcajce.provider.asymmetric.mldsa.MLDSAKeyFactorySpi$MLDSA65", aSN1ObjectIdentifier2, new MLDSAKeyFactorySpi.MLDSA65());
            ASN1ObjectIdentifier aSN1ObjectIdentifier3 = NISTObjectIdentifiers.id_ml_dsa_87;
            addKeyFactoryAlgorithm(configurableProvider, "ML-DSA-87", "org.bouncycastle.jcajce.provider.asymmetric.mldsa.MLDSAKeyFactorySpi$MLDSA87", aSN1ObjectIdentifier3, new MLDSAKeyFactorySpi.MLDSA87());
            ASN1ObjectIdentifier aSN1ObjectIdentifier4 = NISTObjectIdentifiers.id_hash_ml_dsa_44_with_sha512;
            addKeyFactoryAlgorithm(configurableProvider, "ML-DSA-44-WITH-SHA512", "org.bouncycastle.jcajce.provider.asymmetric.mldsa.MLDSAKeyFactorySpi$HashMLDSA44", aSN1ObjectIdentifier4, new MLDSAKeyFactorySpi.HashMLDSA44());
            ASN1ObjectIdentifier aSN1ObjectIdentifier5 = NISTObjectIdentifiers.id_hash_ml_dsa_65_with_sha512;
            addKeyFactoryAlgorithm(configurableProvider, "ML-DSA-65-WITH-SHA512", "org.bouncycastle.jcajce.provider.asymmetric.mldsa.MLDSAKeyFactorySpi$HashMLDSA65", aSN1ObjectIdentifier5, new MLDSAKeyFactorySpi.HashMLDSA65());
            ASN1ObjectIdentifier aSN1ObjectIdentifier6 = NISTObjectIdentifiers.id_hash_ml_dsa_87_with_sha512;
            addKeyFactoryAlgorithm(configurableProvider, "ML-DSA-87-WITH-SHA512", "org.bouncycastle.jcajce.provider.asymmetric.mldsa.MLDSAKeyFactorySpi$HashMLDSA87", aSN1ObjectIdentifier6, new MLDSAKeyFactorySpi.HashMLDSA87());
            addKeyPairGeneratorAlgorithm(configurableProvider, "ML-DSA-44", "org.bouncycastle.jcajce.provider.asymmetric.mldsa.MLDSAKeyPairGeneratorSpi$MLDSA44", aSN1ObjectIdentifier);
            addKeyPairGeneratorAlgorithm(configurableProvider, "ML-DSA-65", "org.bouncycastle.jcajce.provider.asymmetric.mldsa.MLDSAKeyPairGeneratorSpi$MLDSA65", aSN1ObjectIdentifier2);
            addKeyPairGeneratorAlgorithm(configurableProvider, "ML-DSA-87", "org.bouncycastle.jcajce.provider.asymmetric.mldsa.MLDSAKeyPairGeneratorSpi$MLDSA87", aSN1ObjectIdentifier3);
            addKeyPairGeneratorAlgorithm(configurableProvider, "ML-DSA-44-WITH-SHA512", "org.bouncycastle.jcajce.provider.asymmetric.mldsa.MLDSAKeyPairGeneratorSpi$MLDSA44withSHA512", aSN1ObjectIdentifier4);
            addKeyPairGeneratorAlgorithm(configurableProvider, "ML-DSA-65-WITH-SHA512", "org.bouncycastle.jcajce.provider.asymmetric.mldsa.MLDSAKeyPairGeneratorSpi$MLDSA65withSHA512", aSN1ObjectIdentifier5);
            addKeyPairGeneratorAlgorithm(configurableProvider, "ML-DSA-87-WITH-SHA512", "org.bouncycastle.jcajce.provider.asymmetric.mldsa.MLDSAKeyPairGeneratorSpi$MLDSA87withSHA512", aSN1ObjectIdentifier6);
            addSignatureAlgorithm(configurableProvider, "ML-DSA", "org.bouncycastle.jcajce.provider.asymmetric.mldsa.SignatureSpi$MLDSA", (ASN1ObjectIdentifier) null);
            addSignatureAlgorithm(configurableProvider, "ML-DSA-44", "org.bouncycastle.jcajce.provider.asymmetric.mldsa.SignatureSpi$MLDSA44", aSN1ObjectIdentifier);
            addSignatureAlgorithm(configurableProvider, "ML-DSA-65", "org.bouncycastle.jcajce.provider.asymmetric.mldsa.SignatureSpi$MLDSA65", aSN1ObjectIdentifier2);
            addSignatureAlgorithm(configurableProvider, "ML-DSA-87", "org.bouncycastle.jcajce.provider.asymmetric.mldsa.SignatureSpi$MLDSA87", aSN1ObjectIdentifier3);
            configurableProvider.addAlgorithm("Alg.Alias.Signature.MLDSA", "ML-DSA");
            addSignatureAlgorithm(configurableProvider, "ML-DSA-CALCULATE-MU", "org.bouncycastle.jcajce.provider.asymmetric.mldsa.SignatureSpi$MLDSACalcMu", (ASN1ObjectIdentifier) null);
            configurableProvider.addAlgorithm("Alg.Alias.Signature.MLDSA-CALCULATE-MU", "ML-DSA-CALCULATE-MU");
            addSignatureAlgorithm(configurableProvider, "ML-DSA-EXTERNAL-MU", "org.bouncycastle.jcajce.provider.asymmetric.mldsa.SignatureSpi$MLDSAExtMu", (ASN1ObjectIdentifier) null);
            configurableProvider.addAlgorithm("Alg.Alias.Signature.MLDSA-EXTERNAL-MU", "ML-DSA-EXTERNAL-MU");
            addSignatureAlgorithm(configurableProvider, "HASH-ML-DSA", "org.bouncycastle.jcajce.provider.asymmetric.mldsa.HashSignatureSpi$MLDSA", (ASN1ObjectIdentifier) null);
            addSignatureAlgorithm(configurableProvider, "ML-DSA-44-WITH-SHA512", "org.bouncycastle.jcajce.provider.asymmetric.mldsa.HashSignatureSpi$MLDSA44", aSN1ObjectIdentifier4);
            addSignatureAlgorithm(configurableProvider, "ML-DSA-65-WITH-SHA512", "org.bouncycastle.jcajce.provider.asymmetric.mldsa.HashSignatureSpi$MLDSA65", aSN1ObjectIdentifier5);
            addSignatureAlgorithm(configurableProvider, "ML-DSA-87-WITH-SHA512", "org.bouncycastle.jcajce.provider.asymmetric.mldsa.HashSignatureSpi$MLDSA87", aSN1ObjectIdentifier6);
            configurableProvider.addAlgorithm("Alg.Alias.Signature.SHA512WITHMLDSA", "HASH-ML-DSA");
            configurableProvider.addAlgorithm("Alg.Alias.Signature.SHA512WITHMLDSA44", "ML-DSA-44-WITH-SHA512");
            configurableProvider.addAlgorithm("Alg.Alias.Signature.SHA512WITHMLDSA65", "ML-DSA-65-WITH-SHA512");
            configurableProvider.addAlgorithm("Alg.Alias.Signature.SHA512WITHMLDSA87", "ML-DSA-87-WITH-SHA512");
            MLDSAKeyFactorySpi.Hash hash = new MLDSAKeyFactorySpi.Hash();
            configurableProvider.addKeyInfoConverter(aSN1ObjectIdentifier, hash);
            configurableProvider.addKeyInfoConverter(aSN1ObjectIdentifier2, hash);
            configurableProvider.addKeyInfoConverter(aSN1ObjectIdentifier3, hash);
            configurableProvider.addKeyInfoConverter(aSN1ObjectIdentifier4, hash);
            configurableProvider.addKeyInfoConverter(aSN1ObjectIdentifier5, hash);
            configurableProvider.addKeyInfoConverter(aSN1ObjectIdentifier6, hash);
        }
    }
}
