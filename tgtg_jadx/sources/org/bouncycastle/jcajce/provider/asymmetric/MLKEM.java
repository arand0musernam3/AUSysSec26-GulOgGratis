package org.bouncycastle.jcajce.provider.asymmetric;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.jcajce.provider.asymmetric.mlkem.MLKEMKeyFactorySpi;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;

/* JADX INFO: loaded from: classes3.dex */
public class MLKEM {
    private static final String PREFIX = "org.bouncycastle.jcajce.provider.asymmetric.mlkem.";

    public static class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm("KeyFactory.ML-KEM", "org.bouncycastle.jcajce.provider.asymmetric.mlkem.MLKEMKeyFactorySpi");
            configurableProvider.addAlgorithm("Alg.Alias.KeyFactory.MLKEM", "ML-KEM");
            ASN1ObjectIdentifier aSN1ObjectIdentifier = NISTObjectIdentifiers.id_alg_ml_kem_512;
            addKeyFactoryAlgorithm(configurableProvider, "ML-KEM-512", "org.bouncycastle.jcajce.provider.asymmetric.mlkem.MLKEMKeyFactorySpi$MLKEM512", aSN1ObjectIdentifier, new MLKEMKeyFactorySpi.MLKEM512());
            ASN1ObjectIdentifier aSN1ObjectIdentifier2 = NISTObjectIdentifiers.id_alg_ml_kem_768;
            addKeyFactoryAlgorithm(configurableProvider, "ML-KEM-768", "org.bouncycastle.jcajce.provider.asymmetric.mlkem.MLKEMKeyFactorySpi$MLKEM768", aSN1ObjectIdentifier2, new MLKEMKeyFactorySpi.MLKEM768());
            ASN1ObjectIdentifier aSN1ObjectIdentifier3 = NISTObjectIdentifiers.id_alg_ml_kem_1024;
            addKeyFactoryAlgorithm(configurableProvider, "ML-KEM-1024", "org.bouncycastle.jcajce.provider.asymmetric.mlkem.MLKEMKeyFactorySpi$MLKEM1024", aSN1ObjectIdentifier3, new MLKEMKeyFactorySpi.MLKEM1024());
            configurableProvider.addAlgorithm("KeyPairGenerator.ML-KEM", "org.bouncycastle.jcajce.provider.asymmetric.mlkem.MLKEMKeyPairGeneratorSpi");
            configurableProvider.addAlgorithm("Alg.Alias.KeyPairGenerator.MLKEM", "ML-KEM");
            addKeyPairGeneratorAlgorithm(configurableProvider, "ML-KEM-512", "org.bouncycastle.jcajce.provider.asymmetric.mlkem.MLKEMKeyPairGeneratorSpi$MLKEM512", aSN1ObjectIdentifier);
            addKeyPairGeneratorAlgorithm(configurableProvider, "ML-KEM-768", "org.bouncycastle.jcajce.provider.asymmetric.mlkem.MLKEMKeyPairGeneratorSpi$MLKEM768", aSN1ObjectIdentifier2);
            addKeyPairGeneratorAlgorithm(configurableProvider, "ML-KEM-1024", "org.bouncycastle.jcajce.provider.asymmetric.mlkem.MLKEMKeyPairGeneratorSpi$MLKEM1024", aSN1ObjectIdentifier3);
            configurableProvider.addAlgorithm("KeyGenerator.ML-KEM", "org.bouncycastle.jcajce.provider.asymmetric.mlkem.MLKEMKeyGeneratorSpi");
            addKeyGeneratorAlgorithm(configurableProvider, "ML-KEM-512", "org.bouncycastle.jcajce.provider.asymmetric.mlkem.MLKEMKeyGeneratorSpi$MLKEM512", aSN1ObjectIdentifier);
            addKeyGeneratorAlgorithm(configurableProvider, "ML-KEM-768", "org.bouncycastle.jcajce.provider.asymmetric.mlkem.MLKEMKeyGeneratorSpi$MLKEM768", aSN1ObjectIdentifier2);
            addKeyGeneratorAlgorithm(configurableProvider, "ML-KEM-1024", "org.bouncycastle.jcajce.provider.asymmetric.mlkem.MLKEMKeyGeneratorSpi$MLKEM1024", aSN1ObjectIdentifier3);
            MLKEMKeyFactorySpi mLKEMKeyFactorySpi = new MLKEMKeyFactorySpi();
            configurableProvider.addAlgorithm("Cipher.ML-KEM", "org.bouncycastle.jcajce.provider.asymmetric.mlkem.MLKEMCipherSpi$Base");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.MLKEM", "ML-KEM");
            addCipherAlgorithm(configurableProvider, "ML-KEM-512", "org.bouncycastle.jcajce.provider.asymmetric.mlkem.MLKEMCipherSpi$MLKEM512", aSN1ObjectIdentifier);
            addCipherAlgorithm(configurableProvider, "ML-KEM-768", "org.bouncycastle.jcajce.provider.asymmetric.mlkem.MLKEMCipherSpi$MLKEM768", aSN1ObjectIdentifier2);
            addCipherAlgorithm(configurableProvider, "ML-KEM-1024", "org.bouncycastle.jcajce.provider.asymmetric.mlkem.MLKEMCipherSpi$MLKEM1024", aSN1ObjectIdentifier3);
            configurableProvider.addKeyInfoConverter(aSN1ObjectIdentifier, mLKEMKeyFactorySpi);
            configurableProvider.addKeyInfoConverter(aSN1ObjectIdentifier2, mLKEMKeyFactorySpi);
            configurableProvider.addKeyInfoConverter(aSN1ObjectIdentifier3, mLKEMKeyFactorySpi);
        }
    }
}
