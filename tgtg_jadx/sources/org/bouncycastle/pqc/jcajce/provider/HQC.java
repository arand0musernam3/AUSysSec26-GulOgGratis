package org.bouncycastle.pqc.jcajce.provider;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.bc.BCObjectIdentifiers;
import org.bouncycastle.jcajce.provider.asymmetric.a;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;
import org.bouncycastle.pqc.jcajce.provider.hqc.HQCKeyFactorySpi;

/* JADX INFO: loaded from: classes3.dex */
public class HQC {
    private static final String PREFIX = "org.bouncycastle.pqc.jcajce.provider.hqc.";

    public static class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm("KeyFactory.HQC", "org.bouncycastle.pqc.jcajce.provider.hqc.HQCKeyFactorySpi");
            configurableProvider.addAlgorithm("Alg.Alias.KeyFactory.HQC", "HQC");
            ASN1ObjectIdentifier aSN1ObjectIdentifier = BCObjectIdentifiers.hqc128;
            addKeyFactoryAlgorithm(configurableProvider, "HQC128", "org.bouncycastle.pqc.jcajce.provider.hqc.HQCKeyFactorySpi$HQC128", aSN1ObjectIdentifier, new HQCKeyFactorySpi.HQC128());
            ASN1ObjectIdentifier aSN1ObjectIdentifier2 = BCObjectIdentifiers.hqc192;
            addKeyFactoryAlgorithm(configurableProvider, "HQC192", "org.bouncycastle.pqc.jcajce.provider.hqc.HQCKeyFactorySpi$HQC192", aSN1ObjectIdentifier2, new HQCKeyFactorySpi.HQC192());
            ASN1ObjectIdentifier aSN1ObjectIdentifier3 = BCObjectIdentifiers.hqc256;
            addKeyFactoryAlgorithm(configurableProvider, "HQC256", "org.bouncycastle.pqc.jcajce.provider.hqc.HQCKeyFactorySpi$HQC256", aSN1ObjectIdentifier3, new HQCKeyFactorySpi.HQC256());
            configurableProvider.addAlgorithm("KeyPairGenerator.HQC", "org.bouncycastle.pqc.jcajce.provider.hqc.HQCKeyPairGeneratorSpi");
            configurableProvider.addAlgorithm("Alg.Alias.KeyPairGenerator.HQC", "HQC");
            addKeyPairGeneratorAlgorithm(configurableProvider, "HQC128", "org.bouncycastle.pqc.jcajce.provider.hqc.HQCKeyPairGeneratorSpi$HQC128", aSN1ObjectIdentifier);
            addKeyPairGeneratorAlgorithm(configurableProvider, "HQC192", "org.bouncycastle.pqc.jcajce.provider.hqc.HQCKeyPairGeneratorSpi$HQC192", aSN1ObjectIdentifier2);
            addKeyPairGeneratorAlgorithm(configurableProvider, "HQC256", "org.bouncycastle.pqc.jcajce.provider.hqc.HQCKeyPairGeneratorSpi$HQC256", aSN1ObjectIdentifier3);
            configurableProvider.addAlgorithm("KeyGenerator.HQC", "org.bouncycastle.pqc.jcajce.provider.hqc.HQCKeyGeneratorSpi");
            addKeyGeneratorAlgorithm(configurableProvider, "HQC128", "org.bouncycastle.pqc.jcajce.provider.hqc.HQCKeyGeneratorSpi$HQC128", aSN1ObjectIdentifier);
            addKeyGeneratorAlgorithm(configurableProvider, "HQC192", "org.bouncycastle.pqc.jcajce.provider.hqc.HQCKeyGeneratorSpi$HQC192", aSN1ObjectIdentifier2);
            addKeyGeneratorAlgorithm(configurableProvider, "HQC256", "org.bouncycastle.pqc.jcajce.provider.hqc.HQCKeyGeneratorSpi$HQC256", aSN1ObjectIdentifier3);
            HQCKeyFactorySpi hQCKeyFactorySpi = new HQCKeyFactorySpi();
            configurableProvider.addAlgorithm("Cipher.HQC", "org.bouncycastle.pqc.jcajce.provider.hqc.HQCCipherSpi$Base");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.HQC", "HQC");
            StringBuilder sb2 = new StringBuilder("Alg.Alias.Cipher.");
            ASN1ObjectIdentifier aSN1ObjectIdentifier4 = BCObjectIdentifiers.pqc_kem_hqc;
            a.y(sb2, aSN1ObjectIdentifier4, configurableProvider, "HQC");
            addCipherAlgorithm(configurableProvider, "HQC128", "org.bouncycastle.pqc.jcajce.provider.hqc.HQCCipherSpi$HQC128", aSN1ObjectIdentifier);
            addCipherAlgorithm(configurableProvider, "HQC192", "org.bouncycastle.pqc.jcajce.provider.hqc.HQCCipherSpi$HQC192", aSN1ObjectIdentifier2);
            addCipherAlgorithm(configurableProvider, "HQC256", "org.bouncycastle.pqc.jcajce.provider.hqc.HQCCipherSpi$HQC256", aSN1ObjectIdentifier3);
            registerOid(configurableProvider, aSN1ObjectIdentifier4, "HQC", hQCKeyFactorySpi);
            configurableProvider.addKeyInfoConverter(aSN1ObjectIdentifier, hQCKeyFactorySpi);
            configurableProvider.addKeyInfoConverter(aSN1ObjectIdentifier2, hQCKeyFactorySpi);
            configurableProvider.addKeyInfoConverter(aSN1ObjectIdentifier3, hQCKeyFactorySpi);
        }
    }
}
