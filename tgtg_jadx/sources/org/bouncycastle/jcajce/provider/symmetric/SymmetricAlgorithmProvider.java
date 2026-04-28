package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.jcajce.provider.asymmetric.a;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import w.a0;

/* JADX INFO: loaded from: classes3.dex */
abstract class SymmetricAlgorithmProvider extends AlgorithmProvider {
    public void addCMacAlgorithm(ConfigurableProvider configurableProvider, String str, String str2, String str3) {
        configurableProvider.addAlgorithm("Mac." + str + "-CMAC", str2);
        StringBuilder sbL = a.l(str, "-CMAC", configurableProvider, a0.p("Alg.Alias.Mac.", str, "CMAC"), "KeyGenerator.");
        sbL.append(str);
        sbL.append("-CMAC");
        configurableProvider.addAlgorithm(sbL.toString(), str3);
        configurableProvider.addAlgorithm(a0.p("Alg.Alias.KeyGenerator.", str, "CMAC"), str + "-CMAC");
    }

    public void addGMacAlgorithm(ConfigurableProvider configurableProvider, String str, String str2, String str3) {
        configurableProvider.addAlgorithm("Mac." + str + "-GMAC", str2);
        StringBuilder sbL = a.l(str, "-GMAC", configurableProvider, a0.p("Alg.Alias.Mac.", str, "GMAC"), "KeyGenerator.");
        sbL.append(str);
        sbL.append("-GMAC");
        configurableProvider.addAlgorithm(sbL.toString(), str3);
        configurableProvider.addAlgorithm(a0.p("Alg.Alias.KeyGenerator.", str, "GMAC"), str + "-GMAC");
    }

    public void addPoly1305Algorithm(ConfigurableProvider configurableProvider, String str, String str2, String str3) {
        configurableProvider.addAlgorithm("Mac.POLY1305-" + str, str2);
        configurableProvider.addAlgorithm("Alg.Alias.Mac.POLY1305" + str, "POLY1305-" + str);
        configurableProvider.addAlgorithm("KeyGenerator.POLY1305-" + str, str3);
        configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator.POLY1305" + str, "POLY1305-" + str);
    }
}
