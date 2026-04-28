package org.bouncycastle.jcajce.provider.asymmetric;

import android.net.Uri;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.KeySpec;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.pqc.crypto.lms.LMSigParameters;
import org.bouncycastle.pqc.crypto.xmss.XMSSMTParameters;
import org.bouncycastle.pqc.jcajce.provider.snova.SnovaKeyFactorySpi;
import org.bouncycastle.pqc.jcajce.provider.sphincsplus.SPHINCSPlusKeyFactorySpi;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class a {
    public static void A(BouncyCastleProvider bouncyCastleProvider, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        bouncyCastleProvider.addKeyInfoConverter(aSN1ObjectIdentifier, new SnovaKeyFactorySpi());
    }

    public static void B(LMSigParameters lMSigParameters, LMSigParameters.AnonymousClass1 anonymousClass1, LMSigParameters lMSigParameters2) {
        anonymousClass1.put(Integer.valueOf(lMSigParameters.type), lMSigParameters2);
    }

    public static int C(int i11, int i12, int i13, int i14) {
        return i11 + i12 + i13 + i14;
    }

    public static void D(BouncyCastleProvider bouncyCastleProvider, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        bouncyCastleProvider.addKeyInfoConverter(aSN1ObjectIdentifier, new SPHINCSPlusKeyFactorySpi());
    }

    public static int a(int i11, int i12, int i13, int i14) {
        return ((i11 - i12) / i13) + i14;
    }

    public static String b(Uri uri, String str) {
        return str + uri;
    }

    public static String c(Object obj, String str, String str2) {
        return str + obj + str2;
    }

    public static String d(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    public static String e(String str, String str2, ConfigurableProvider configurableProvider, String str3, String str4) {
        configurableProvider.addAlgorithm(str, str2);
        return str3 + str4;
    }

    public static String f(String str, String str2, boolean z11) {
        return str + z11 + str2;
    }

    public static String g(String str, AlgorithmParameterSpec algorithmParameterSpec) {
        return str + algorithmParameterSpec;
    }

    public static String h(Key key, StringBuilder sb2, String str) {
        sb2.append(key.getClass());
        sb2.append(str);
        return sb2.toString();
    }

    public static String i(KeySpec keySpec, StringBuilder sb2, String str) {
        sb2.append(keySpec.getClass());
        sb2.append(str);
        return sb2.toString();
    }

    public static String j(ConfigurableProvider configurableProvider, String str, String str2, String str3, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        configurableProvider.addAlgorithm(str, str2);
        return str3 + aSN1ObjectIdentifier;
    }

    public static StringBuilder k(int i11, String str, String str2) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(i11);
        sb2.append(str2);
        return sb2;
    }

    public static StringBuilder l(String str, String str2, ConfigurableProvider configurableProvider, String str3, String str4) {
        configurableProvider.addAlgorithm(str3, str + str2);
        return new StringBuilder(str4);
    }

    public static StringBuilder m(StringBuilder sb2, String str, String str2, ConfigurableProvider configurableProvider, String str3) {
        sb2.append(str);
        sb2.append(str2);
        configurableProvider.addAlgorithm(str3, sb2.toString());
        return new StringBuilder();
    }

    public static StringBuilder n(StringBuilder sb2, String str, ConfigurableProvider configurableProvider, String str2, String str3) {
        sb2.append(str);
        configurableProvider.addAlgorithm(str2, sb2.toString());
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str3);
        return sb3;
    }

    public static StringBuilder o(StringBuilder sb2, String str, ConfigurableProvider configurableProvider, String str2, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        sb2.append(str);
        configurableProvider.addAlgorithm(str2, aSN1ObjectIdentifier, sb2.toString());
        return new StringBuilder();
    }

    public static StringBuilder p(StringBuilder sb2, ASN1ObjectIdentifier aSN1ObjectIdentifier, ConfigurableProvider configurableProvider, String str, String str2) {
        sb2.append(aSN1ObjectIdentifier);
        configurableProvider.addAlgorithm(sb2.toString(), str);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str2);
        return sb3;
    }

    public static StringBuilder q(ConfigurableProvider configurableProvider, String str, String str2, String str3, String str4) {
        configurableProvider.addAlgorithm(str, str2);
        configurableProvider.addAlgorithm(str3, str4);
        return new StringBuilder();
    }

    public static StringBuilder r(ConfigurableProvider configurableProvider, String str, String str2, String str3, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        configurableProvider.addAlgorithm(str, aSN1ObjectIdentifier, str2);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str3);
        return sb2;
    }

    public static Map s(String str, String str2, ConfigurableProvider configurableProvider, String str3, String str4) {
        configurableProvider.addAlgorithm(str, str2, EC.generalEcAttributes);
        configurableProvider.addAlgorithm(str3, str4, EC.generalEcAttributes);
        return EC.generalEcAttributes;
    }

    public static ECFieldElement t(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
        return eCFieldElement.square().add(eCFieldElement2).add(eCFieldElement3);
    }

    public static void u(int i11, int i12, ASN1ObjectIdentifier aSN1ObjectIdentifier, HashMap map, Integer num) {
        map.put(num, new XMSSMTParameters(i11, i12, aSN1ObjectIdentifier));
    }

    public static void v(StringBuilder sb2, String str, long j9, String str2) {
        sb2.append(str);
        sb2.append(j9);
        sb2.append(str2);
    }

    public static void w(StringBuilder sb2, String str, String str2, ConfigurableProvider configurableProvider, String str3) {
        sb2.append(str);
        sb2.append(str2);
        configurableProvider.addAlgorithm(str3, sb2.toString());
    }

    public static void x(StringBuilder sb2, String str, ConfigurableProvider configurableProvider, String str2) {
        sb2.append(str);
        configurableProvider.addAlgorithm(str2, sb2.toString());
    }

    public static void y(StringBuilder sb2, ASN1ObjectIdentifier aSN1ObjectIdentifier, ConfigurableProvider configurableProvider, String str) {
        sb2.append(aSN1ObjectIdentifier);
        configurableProvider.addAlgorithm(sb2.toString(), str);
    }

    public static void z(ConfigurableProvider configurableProvider, String str, String str2, String str3, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        configurableProvider.addAlgorithm(str3, aSN1ObjectIdentifier, str + str2);
    }
}
