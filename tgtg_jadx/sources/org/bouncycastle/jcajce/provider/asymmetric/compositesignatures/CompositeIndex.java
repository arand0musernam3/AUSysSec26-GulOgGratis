package org.bouncycastle.jcajce.provider.asymmetric.compositesignatures;

import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.RSAKeyGenParameterSpec;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.internal.asn1.misc.MiscObjectIdentifiers;
import org.bouncycastle.jcajce.spec.EdDSAParameterSpec;
import org.bouncycastle.jce.spec.ECNamedCurveGenParameterSpec;
import org.bouncycastle.pqc.crypto.newhope.NewHope;

/* JADX INFO: loaded from: classes3.dex */
public class CompositeIndex {
    private static Map<ASN1ObjectIdentifier, String[]> pairings = new HashMap();
    private static Map<ASN1ObjectIdentifier, AlgorithmParameterSpec[]> kpgInitSpecs = new HashMap();
    private static Map<ASN1ObjectIdentifier, String> algorithmNames = new HashMap();

    static {
        Map<ASN1ObjectIdentifier, String[]> map = pairings;
        ASN1ObjectIdentifier aSN1ObjectIdentifier = MiscObjectIdentifiers.id_MLDSA44_RSA2048_PSS_SHA256;
        map.put(aSN1ObjectIdentifier, new String[]{"ML-DSA-44", "SHA256withRSAandMGF1"});
        Map<ASN1ObjectIdentifier, String[]> map2 = pairings;
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = MiscObjectIdentifiers.id_MLDSA44_RSA2048_PKCS15_SHA256;
        map2.put(aSN1ObjectIdentifier2, new String[]{"ML-DSA-44", "SHA256withRSA"});
        Map<ASN1ObjectIdentifier, String[]> map3 = pairings;
        ASN1ObjectIdentifier aSN1ObjectIdentifier3 = MiscObjectIdentifiers.id_MLDSA44_Ed25519_SHA512;
        map3.put(aSN1ObjectIdentifier3, new String[]{"ML-DSA-44", EdDSAParameterSpec.Ed25519});
        Map<ASN1ObjectIdentifier, String[]> map4 = pairings;
        ASN1ObjectIdentifier aSN1ObjectIdentifier4 = MiscObjectIdentifiers.id_MLDSA44_ECDSA_P256_SHA256;
        map4.put(aSN1ObjectIdentifier4, new String[]{"ML-DSA-44", "SHA256withECDSA"});
        Map<ASN1ObjectIdentifier, String[]> map5 = pairings;
        ASN1ObjectIdentifier aSN1ObjectIdentifier5 = MiscObjectIdentifiers.id_MLDSA65_RSA3072_PSS_SHA256;
        map5.put(aSN1ObjectIdentifier5, new String[]{"ML-DSA-65", "SHA256withRSAandMGF1"});
        Map<ASN1ObjectIdentifier, String[]> map6 = pairings;
        ASN1ObjectIdentifier aSN1ObjectIdentifier6 = MiscObjectIdentifiers.id_MLDSA65_RSA3072_PKCS15_SHA256;
        map6.put(aSN1ObjectIdentifier6, new String[]{"ML-DSA-65", "SHA256withRSA"});
        Map<ASN1ObjectIdentifier, String[]> map7 = pairings;
        ASN1ObjectIdentifier aSN1ObjectIdentifier7 = MiscObjectIdentifiers.id_MLDSA65_RSA4096_PSS_SHA384;
        map7.put(aSN1ObjectIdentifier7, new String[]{"ML-DSA-65", "SHA384withRSAandMGF1"});
        Map<ASN1ObjectIdentifier, String[]> map8 = pairings;
        ASN1ObjectIdentifier aSN1ObjectIdentifier8 = MiscObjectIdentifiers.id_MLDSA65_RSA4096_PKCS15_SHA384;
        map8.put(aSN1ObjectIdentifier8, new String[]{"ML-DSA-65", "SHA384withRSA"});
        Map<ASN1ObjectIdentifier, String[]> map9 = pairings;
        ASN1ObjectIdentifier aSN1ObjectIdentifier9 = MiscObjectIdentifiers.id_MLDSA65_ECDSA_P384_SHA384;
        map9.put(aSN1ObjectIdentifier9, new String[]{"ML-DSA-65", "SHA384withECDSA"});
        Map<ASN1ObjectIdentifier, String[]> map10 = pairings;
        ASN1ObjectIdentifier aSN1ObjectIdentifier10 = MiscObjectIdentifiers.id_MLDSA65_ECDSA_brainpoolP256r1_SHA256;
        map10.put(aSN1ObjectIdentifier10, new String[]{"ML-DSA-65", "SHA256withECDSA"});
        Map<ASN1ObjectIdentifier, String[]> map11 = pairings;
        ASN1ObjectIdentifier aSN1ObjectIdentifier11 = MiscObjectIdentifiers.id_MLDSA65_Ed25519_SHA512;
        map11.put(aSN1ObjectIdentifier11, new String[]{"ML-DSA-65", EdDSAParameterSpec.Ed25519});
        Map<ASN1ObjectIdentifier, String[]> map12 = pairings;
        ASN1ObjectIdentifier aSN1ObjectIdentifier12 = MiscObjectIdentifiers.id_MLDSA87_ECDSA_P384_SHA384;
        map12.put(aSN1ObjectIdentifier12, new String[]{"ML-DSA-87", "SHA384withECDSA"});
        Map<ASN1ObjectIdentifier, String[]> map13 = pairings;
        ASN1ObjectIdentifier aSN1ObjectIdentifier13 = MiscObjectIdentifiers.id_MLDSA87_ECDSA_brainpoolP384r1_SHA384;
        map13.put(aSN1ObjectIdentifier13, new String[]{"ML-DSA-87", "SHA384withECDSA"});
        Map<ASN1ObjectIdentifier, String[]> map14 = pairings;
        ASN1ObjectIdentifier aSN1ObjectIdentifier14 = MiscObjectIdentifiers.id_MLDSA87_Ed448_SHA512;
        map14.put(aSN1ObjectIdentifier14, new String[]{"ML-DSA-87", EdDSAParameterSpec.Ed448});
        Map<ASN1ObjectIdentifier, String[]> map15 = pairings;
        ASN1ObjectIdentifier aSN1ObjectIdentifier15 = MiscObjectIdentifiers.id_HashMLDSA44_RSA2048_PSS_SHA256;
        map15.put(aSN1ObjectIdentifier15, new String[]{"ML-DSA-44", "SHA256withRSAandMGF1"});
        Map<ASN1ObjectIdentifier, String[]> map16 = pairings;
        ASN1ObjectIdentifier aSN1ObjectIdentifier16 = MiscObjectIdentifiers.id_HashMLDSA44_RSA2048_PKCS15_SHA256;
        map16.put(aSN1ObjectIdentifier16, new String[]{"ML-DSA-44", "SHA256withRSA"});
        Map<ASN1ObjectIdentifier, String[]> map17 = pairings;
        ASN1ObjectIdentifier aSN1ObjectIdentifier17 = MiscObjectIdentifiers.id_HashMLDSA44_Ed25519_SHA512;
        map17.put(aSN1ObjectIdentifier17, new String[]{"ML-DSA-44", EdDSAParameterSpec.Ed25519});
        Map<ASN1ObjectIdentifier, String[]> map18 = pairings;
        ASN1ObjectIdentifier aSN1ObjectIdentifier18 = MiscObjectIdentifiers.id_HashMLDSA44_ECDSA_P256_SHA256;
        map18.put(aSN1ObjectIdentifier18, new String[]{"ML-DSA-44", "SHA256withECDSA"});
        Map<ASN1ObjectIdentifier, String[]> map19 = pairings;
        ASN1ObjectIdentifier aSN1ObjectIdentifier19 = MiscObjectIdentifiers.id_HashMLDSA65_RSA3072_PSS_SHA512;
        map19.put(aSN1ObjectIdentifier19, new String[]{"ML-DSA-65", "SHA256withRSAandMGF1"});
        Map<ASN1ObjectIdentifier, String[]> map20 = pairings;
        ASN1ObjectIdentifier aSN1ObjectIdentifier20 = MiscObjectIdentifiers.id_HashMLDSA65_RSA3072_PKCS15_SHA512;
        map20.put(aSN1ObjectIdentifier20, new String[]{"ML-DSA-65", "SHA256withRSA"});
        Map<ASN1ObjectIdentifier, String[]> map21 = pairings;
        ASN1ObjectIdentifier aSN1ObjectIdentifier21 = MiscObjectIdentifiers.id_HashMLDSA65_RSA4096_PSS_SHA512;
        map21.put(aSN1ObjectIdentifier21, new String[]{"ML-DSA-65", "SHA384withRSAandMGF1"});
        Map<ASN1ObjectIdentifier, String[]> map22 = pairings;
        ASN1ObjectIdentifier aSN1ObjectIdentifier22 = MiscObjectIdentifiers.id_HashMLDSA65_RSA4096_PKCS15_SHA512;
        map22.put(aSN1ObjectIdentifier22, new String[]{"ML-DSA-65", "SHA384withRSA"});
        Map<ASN1ObjectIdentifier, String[]> map23 = pairings;
        ASN1ObjectIdentifier aSN1ObjectIdentifier23 = MiscObjectIdentifiers.id_HashMLDSA65_ECDSA_P384_SHA512;
        map23.put(aSN1ObjectIdentifier23, new String[]{"ML-DSA-65", "SHA384withECDSA"});
        Map<ASN1ObjectIdentifier, String[]> map24 = pairings;
        ASN1ObjectIdentifier aSN1ObjectIdentifier24 = MiscObjectIdentifiers.id_HashMLDSA65_ECDSA_brainpoolP256r1_SHA512;
        map24.put(aSN1ObjectIdentifier24, new String[]{"ML-DSA-65", "SHA256withECDSA"});
        Map<ASN1ObjectIdentifier, String[]> map25 = pairings;
        ASN1ObjectIdentifier aSN1ObjectIdentifier25 = MiscObjectIdentifiers.id_HashMLDSA65_Ed25519_SHA512;
        map25.put(aSN1ObjectIdentifier25, new String[]{"ML-DSA-65", EdDSAParameterSpec.Ed25519});
        Map<ASN1ObjectIdentifier, String[]> map26 = pairings;
        ASN1ObjectIdentifier aSN1ObjectIdentifier26 = MiscObjectIdentifiers.id_HashMLDSA87_ECDSA_P384_SHA512;
        map26.put(aSN1ObjectIdentifier26, new String[]{"ML-DSA-87", "SHA384withECDSA"});
        Map<ASN1ObjectIdentifier, String[]> map27 = pairings;
        ASN1ObjectIdentifier aSN1ObjectIdentifier27 = MiscObjectIdentifiers.id_HashMLDSA87_ECDSA_brainpoolP384r1_SHA512;
        map27.put(aSN1ObjectIdentifier27, new String[]{"ML-DSA-87", "SHA384withECDSA"});
        Map<ASN1ObjectIdentifier, String[]> map28 = pairings;
        ASN1ObjectIdentifier aSN1ObjectIdentifier28 = MiscObjectIdentifiers.id_HashMLDSA87_Ed448_SHA512;
        map28.put(aSN1ObjectIdentifier28, new String[]{"ML-DSA-87", EdDSAParameterSpec.Ed448});
        Map<ASN1ObjectIdentifier, AlgorithmParameterSpec[]> map29 = kpgInitSpecs;
        BigInteger bigInteger = RSAKeyGenParameterSpec.F4;
        map29.put(aSN1ObjectIdentifier, new AlgorithmParameterSpec[]{null, new RSAKeyGenParameterSpec(NewHope.SENDB_BYTES, bigInteger)});
        kpgInitSpecs.put(aSN1ObjectIdentifier2, new AlgorithmParameterSpec[]{null, new RSAKeyGenParameterSpec(NewHope.SENDB_BYTES, bigInteger)});
        kpgInitSpecs.put(aSN1ObjectIdentifier3, new AlgorithmParameterSpec[]{null, null});
        kpgInitSpecs.put(aSN1ObjectIdentifier4, new AlgorithmParameterSpec[]{null, new ECNamedCurveGenParameterSpec("P-256")});
        kpgInitSpecs.put(aSN1ObjectIdentifier5, new AlgorithmParameterSpec[]{null, new RSAKeyGenParameterSpec(3072, bigInteger)});
        kpgInitSpecs.put(aSN1ObjectIdentifier6, new AlgorithmParameterSpec[]{null, new RSAKeyGenParameterSpec(3072, bigInteger)});
        kpgInitSpecs.put(aSN1ObjectIdentifier7, new AlgorithmParameterSpec[]{null, new RSAKeyGenParameterSpec(4096, bigInteger)});
        kpgInitSpecs.put(aSN1ObjectIdentifier8, new AlgorithmParameterSpec[]{null, new RSAKeyGenParameterSpec(4096, bigInteger)});
        kpgInitSpecs.put(aSN1ObjectIdentifier9, new AlgorithmParameterSpec[]{null, new ECNamedCurveGenParameterSpec("P-384")});
        kpgInitSpecs.put(aSN1ObjectIdentifier10, new AlgorithmParameterSpec[]{null, new ECNamedCurveGenParameterSpec("brainpoolP256r1")});
        kpgInitSpecs.put(aSN1ObjectIdentifier11, new AlgorithmParameterSpec[]{null, null});
        kpgInitSpecs.put(aSN1ObjectIdentifier12, new AlgorithmParameterSpec[]{null, new ECNamedCurveGenParameterSpec("P-384")});
        kpgInitSpecs.put(aSN1ObjectIdentifier13, new AlgorithmParameterSpec[]{null, new ECNamedCurveGenParameterSpec("brainpoolP384r1")});
        kpgInitSpecs.put(aSN1ObjectIdentifier14, new AlgorithmParameterSpec[]{null, null});
        kpgInitSpecs.put(aSN1ObjectIdentifier15, new AlgorithmParameterSpec[]{null, new RSAKeyGenParameterSpec(NewHope.SENDB_BYTES, bigInteger)});
        kpgInitSpecs.put(aSN1ObjectIdentifier16, new AlgorithmParameterSpec[]{null, new RSAKeyGenParameterSpec(NewHope.SENDB_BYTES, bigInteger)});
        kpgInitSpecs.put(aSN1ObjectIdentifier17, new AlgorithmParameterSpec[]{null, null});
        kpgInitSpecs.put(aSN1ObjectIdentifier18, new AlgorithmParameterSpec[]{null, new ECNamedCurveGenParameterSpec("P-256")});
        kpgInitSpecs.put(aSN1ObjectIdentifier19, new AlgorithmParameterSpec[]{null, new RSAKeyGenParameterSpec(3072, bigInteger)});
        kpgInitSpecs.put(aSN1ObjectIdentifier20, new AlgorithmParameterSpec[]{null, new RSAKeyGenParameterSpec(3072, bigInteger)});
        kpgInitSpecs.put(aSN1ObjectIdentifier21, new AlgorithmParameterSpec[]{null, new RSAKeyGenParameterSpec(4096, bigInteger)});
        kpgInitSpecs.put(aSN1ObjectIdentifier22, new AlgorithmParameterSpec[]{null, new RSAKeyGenParameterSpec(4096, bigInteger)});
        kpgInitSpecs.put(aSN1ObjectIdentifier23, new AlgorithmParameterSpec[]{null, new ECNamedCurveGenParameterSpec("P-384")});
        kpgInitSpecs.put(aSN1ObjectIdentifier24, new AlgorithmParameterSpec[]{null, new ECNamedCurveGenParameterSpec("brainpoolP256r1")});
        kpgInitSpecs.put(aSN1ObjectIdentifier25, new AlgorithmParameterSpec[]{null, null});
        kpgInitSpecs.put(aSN1ObjectIdentifier26, new AlgorithmParameterSpec[]{null, new ECNamedCurveGenParameterSpec("P-384")});
        kpgInitSpecs.put(aSN1ObjectIdentifier27, new AlgorithmParameterSpec[]{null, new ECNamedCurveGenParameterSpec("brainpoolP384r1")});
        kpgInitSpecs.put(aSN1ObjectIdentifier28, new AlgorithmParameterSpec[]{null, null});
        algorithmNames.put(aSN1ObjectIdentifier, "MLDSA44-RSA2048-PSS-SHA256");
        algorithmNames.put(aSN1ObjectIdentifier2, "MLDSA44-RSA2048-PKCS15-SHA256");
        algorithmNames.put(aSN1ObjectIdentifier3, "MLDSA44-Ed25519-SHA512");
        algorithmNames.put(aSN1ObjectIdentifier4, "MLDSA44-ECDSA-P256-SHA256");
        algorithmNames.put(aSN1ObjectIdentifier5, "MLDSA65-RSA3072-PSS-SHA256");
        algorithmNames.put(aSN1ObjectIdentifier6, "MLDSA65-RSA3072-PKCS15-SHA256");
        algorithmNames.put(aSN1ObjectIdentifier7, "MLDSA65-RSA4096-PSS-SHA384");
        algorithmNames.put(aSN1ObjectIdentifier8, "MLDSA65-RSA4096-PKCS15-SHA384");
        algorithmNames.put(aSN1ObjectIdentifier9, "MLDSA65-ECDSA-P384-SHA384");
        algorithmNames.put(aSN1ObjectIdentifier10, "MLDSA65-ECDSA-brainpoolP256r1-SHA256");
        algorithmNames.put(aSN1ObjectIdentifier11, "MLDSA65-Ed25519-SHA512");
        algorithmNames.put(aSN1ObjectIdentifier12, "MLDSA87-ECDSA-P384-SHA384");
        algorithmNames.put(aSN1ObjectIdentifier13, "MLDSA87-ECDSA-brainpoolP384r1-SHA384");
        algorithmNames.put(aSN1ObjectIdentifier14, "MLDSA87-Ed448-SHA512");
        algorithmNames.put(aSN1ObjectIdentifier15, "HashMLDSA44-RSA2048-PSS-SHA256");
        algorithmNames.put(aSN1ObjectIdentifier16, "HashMLDSA44-RSA2048-PKCS15-SHA256");
        algorithmNames.put(aSN1ObjectIdentifier17, "HashMLDSA44-Ed25519-SHA512");
        algorithmNames.put(aSN1ObjectIdentifier18, "HashMLDSA44-ECDSA-P256-SHA256");
        algorithmNames.put(aSN1ObjectIdentifier19, "HashMLDSA65-RSA3072-PSS-SHA512");
        algorithmNames.put(aSN1ObjectIdentifier20, "HashMLDSA65-RSA3072-PKCS15-SHA512");
        algorithmNames.put(aSN1ObjectIdentifier21, "HashMLDSA65-RSA4096-PSS-SHA512");
        algorithmNames.put(aSN1ObjectIdentifier22, "HashMLDSA65-RSA4096-PKCS15-SHA512");
        algorithmNames.put(aSN1ObjectIdentifier23, "HashMLDSA65-ECDSA-P384-SHA512");
        algorithmNames.put(aSN1ObjectIdentifier24, "HashMLDSA65-ECDSA-brainpoolP256r1-SHA512");
        algorithmNames.put(aSN1ObjectIdentifier25, "HashMLDSA65-Ed25519-SHA512");
        algorithmNames.put(aSN1ObjectIdentifier26, "HashMLDSA87-ECDSA-P384-SHA512");
        algorithmNames.put(aSN1ObjectIdentifier27, "HashMLDSA87-ECDSA-brainpoolP384r1-SHA512");
        algorithmNames.put(aSN1ObjectIdentifier28, "HashMLDSA87-Ed448-SHA512");
    }

    public static String getAlgorithmName(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return algorithmNames.get(aSN1ObjectIdentifier);
    }

    public static String getBaseName(String str) {
        return str.indexOf("RSA") >= 0 ? "RSA" : str.indexOf("ECDSA") >= 0 ? "EC" : str;
    }

    public static AlgorithmParameterSpec[] getKeyPairSpecs(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return kpgInitSpecs.get(aSN1ObjectIdentifier);
    }

    public static String[] getPairing(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return pairings.get(aSN1ObjectIdentifier);
    }

    public static Set<ASN1ObjectIdentifier> getSupportedIdentifiers() {
        return pairings.keySet();
    }

    public static boolean isAlgorithmSupported(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return pairings.containsKey(aSN1ObjectIdentifier);
    }
}
