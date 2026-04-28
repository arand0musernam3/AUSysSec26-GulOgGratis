package org.bouncycastle.jcajce.provider.digest;

import e0.f;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.jcajce.provider.asymmetric.a;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

/* JADX INFO: loaded from: classes3.dex */
abstract class DigestAlgorithmProvider extends AlgorithmProvider {
    public void addHMACAlgorithm(ConfigurableProvider configurableProvider, String str, String str2, String str3) {
        String strK = f.k("HMAC", str);
        configurableProvider.addAlgorithm("Mac.".concat(strK), str2);
        configurableProvider.addAlgorithm("Alg.Alias.Mac.HMAC-" + str, strK);
        configurableProvider.addAlgorithm("Alg.Alias.Mac.HMAC/" + str, strK);
        configurableProvider.addAlgorithm("KeyGenerator.".concat(strK), str3);
        configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator.HMAC-" + str, strK);
        configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator.HMAC/" + str, strK);
    }

    public void addHMACAlias(ConfigurableProvider configurableProvider, String str, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        String strK = f.k("HMAC", str);
        configurableProvider.addAlgorithm("Alg.Alias.Mac." + aSN1ObjectIdentifier, strK);
        a.y(new StringBuilder("Alg.Alias.KeyGenerator."), aSN1ObjectIdentifier, configurableProvider, strK);
    }

    public void addKMACAlgorithm(ConfigurableProvider configurableProvider, String str, String str2, String str3) {
        String strK = f.k("KMAC", str);
        configurableProvider.addAlgorithm("Mac.".concat(strK), str2);
        configurableProvider.addAlgorithm("KeyGenerator.".concat(strK), str3);
        configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator.KMAC" + str, strK);
    }
}
