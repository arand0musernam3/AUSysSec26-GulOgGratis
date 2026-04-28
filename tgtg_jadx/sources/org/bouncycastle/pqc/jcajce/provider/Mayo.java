package org.bouncycastle.pqc.jcajce.provider;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.bc.BCObjectIdentifiers;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;
import org.bouncycastle.pqc.jcajce.provider.mayo.MayoKeyFactorySpi;

/* JADX INFO: loaded from: classes3.dex */
public class Mayo {
    private static final String PREFIX = "org.bouncycastle.pqc.jcajce.provider.mayo.";

    public static class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm("KeyFactory.Mayo", "org.bouncycastle.pqc.jcajce.provider.mayo.MayoKeyFactorySpi");
            ASN1ObjectIdentifier aSN1ObjectIdentifier = BCObjectIdentifiers.mayo1;
            addKeyFactoryAlgorithm(configurableProvider, "MAYO_1", "org.bouncycastle.pqc.jcajce.provider.mayo.MayoKeyFactorySpi$Mayo1", aSN1ObjectIdentifier, new MayoKeyFactorySpi.Mayo1());
            ASN1ObjectIdentifier aSN1ObjectIdentifier2 = BCObjectIdentifiers.mayo2;
            addKeyFactoryAlgorithm(configurableProvider, "MAYO_2", "org.bouncycastle.pqc.jcajce.provider.mayo.MayoKeyFactorySpi$Mayo2", aSN1ObjectIdentifier2, new MayoKeyFactorySpi.Mayo2());
            ASN1ObjectIdentifier aSN1ObjectIdentifier3 = BCObjectIdentifiers.mayo3;
            addKeyFactoryAlgorithm(configurableProvider, "MAYO_3", "org.bouncycastle.pqc.jcajce.provider.mayo.MayoKeyFactorySpi$Mayo3", aSN1ObjectIdentifier3, new MayoKeyFactorySpi.Mayo3());
            ASN1ObjectIdentifier aSN1ObjectIdentifier4 = BCObjectIdentifiers.mayo5;
            addKeyFactoryAlgorithm(configurableProvider, "MAYO_5", "org.bouncycastle.pqc.jcajce.provider.mayo.MayoKeyFactorySpi$Mayo5", aSN1ObjectIdentifier4, new MayoKeyFactorySpi.Mayo5());
            configurableProvider.addAlgorithm("KeyPairGenerator.Mayo", "org.bouncycastle.pqc.jcajce.provider.mayo.MayoKeyPairGeneratorSpi");
            addKeyPairGeneratorAlgorithm(configurableProvider, "MAYO_1", "org.bouncycastle.pqc.jcajce.provider.mayo.MayoKeyPairGeneratorSpi$Mayo1", aSN1ObjectIdentifier);
            addKeyPairGeneratorAlgorithm(configurableProvider, "MAYO_2", "org.bouncycastle.pqc.jcajce.provider.mayo.MayoKeyPairGeneratorSpi$Mayo2", aSN1ObjectIdentifier2);
            addKeyPairGeneratorAlgorithm(configurableProvider, "MAYO_3", "org.bouncycastle.pqc.jcajce.provider.mayo.MayoKeyPairGeneratorSpi$Mayo3", aSN1ObjectIdentifier3);
            addKeyPairGeneratorAlgorithm(configurableProvider, "MAYO_5", "org.bouncycastle.pqc.jcajce.provider.mayo.MayoKeyPairGeneratorSpi$Mayo5", aSN1ObjectIdentifier4);
            addSignatureAlgorithm(configurableProvider, "Mayo", "org.bouncycastle.pqc.jcajce.provider.mayo.SignatureSpi$Base", BCObjectIdentifiers.mayo);
            addSignatureAlgorithm(configurableProvider, "MAYO_1", "org.bouncycastle.pqc.jcajce.provider.mayo.SignatureSpi$Mayo1", aSN1ObjectIdentifier);
            addSignatureAlgorithm(configurableProvider, "MAYO_2", "org.bouncycastle.pqc.jcajce.provider.mayo.SignatureSpi$Mayo2", aSN1ObjectIdentifier2);
            addSignatureAlgorithm(configurableProvider, "MAYO_3", "org.bouncycastle.pqc.jcajce.provider.mayo.SignatureSpi$Mayo3", aSN1ObjectIdentifier3);
            addSignatureAlgorithm(configurableProvider, "MAYO_5", "org.bouncycastle.pqc.jcajce.provider.mayo.SignatureSpi$Mayo5", aSN1ObjectIdentifier4);
        }
    }
}
