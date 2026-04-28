package org.bouncycastle.pqc.crypto.util;

import i4.a;
import j4.d;
import j4.s;
import java.io.ByteArrayInputStream;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.bc.BCObjectIdentifiers;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.digests.SHA512Digest;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.internal.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.pqc.asn1.PQCObjectIdentifiers;
import org.bouncycastle.pqc.asn1.SPHINCS256KeyParams;
import org.bouncycastle.pqc.crypto.bike.BIKEParameters;
import org.bouncycastle.pqc.crypto.cmce.CMCEParameters;
import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumParameters;
import org.bouncycastle.pqc.crypto.falcon.FalconParameters;
import org.bouncycastle.pqc.crypto.frodo.FrodoParameters;
import org.bouncycastle.pqc.crypto.hqc.HQCParameters;
import org.bouncycastle.pqc.crypto.mayo.MayoParameters;
import org.bouncycastle.pqc.crypto.mldsa.MLDSAParameters;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMParameters;
import org.bouncycastle.pqc.crypto.ntru.NTRUParameters;
import org.bouncycastle.pqc.crypto.ntruprime.NTRULPRimeParameters;
import org.bouncycastle.pqc.crypto.ntruprime.SNTRUPrimeParameters;
import org.bouncycastle.pqc.crypto.picnic.PicnicParameters;
import org.bouncycastle.pqc.crypto.rainbow.RainbowParameters;
import org.bouncycastle.pqc.crypto.saber.SABERParameters;
import org.bouncycastle.pqc.crypto.slhdsa.SLHDSAParameters;
import org.bouncycastle.pqc.crypto.snova.SnovaParameters;
import org.bouncycastle.pqc.crypto.sphincs.SPHINCSKeyParameters;
import org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusParameters;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;
import org.bouncycastle.util.Integers;

/* JADX INFO: loaded from: classes3.dex */
class Utils {
    static final AlgorithmIdentifier AlgID_qTESLA_p_I;
    static final AlgorithmIdentifier AlgID_qTESLA_p_III;
    static final AlgorithmIdentifier SPHINCS_SHA3_256;
    static final AlgorithmIdentifier SPHINCS_SHA512_256;
    static final AlgorithmIdentifier XMSS_SHA256;
    static final AlgorithmIdentifier XMSS_SHA512;
    static final AlgorithmIdentifier XMSS_SHAKE128;
    static final AlgorithmIdentifier XMSS_SHAKE256;
    static final Map bikeOids;
    static final Map bikeParams;
    static final Map categories;
    static final Map dilithiumOids;
    static final Map dilithiumParams;
    static final Map falconOids;
    static final Map falconParams;
    static final Map frodoOids;
    static final Map frodoParams;
    static final Map hqcOids;
    static final Map hqcParams;
    static final Map mayoOids;
    static final Map mayoParams;
    static final Map mcElieceOids;
    static final Map mcElieceParams;
    static final Map mldsaOids;
    static final Map mldsaParams;
    static final Map mlkemOids;
    static final Map mlkemParams;
    static final Map ntruOids;
    static final Map ntruParams;
    static final Map ntruprimeOids;
    static final Map ntruprimeParams;
    static final Map picnicOids;
    static final Map picnicParams;
    static final Map rainbowOids;
    static final Map rainbowParams;
    static final Map saberOids;
    static final Map saberParams;
    static final Map sikeOids;
    static final Map sikeParams;
    static final Map slhdsaOids;
    static final Map slhdsaParams;
    static final Map snovaOids;
    static final Map snovaParams;
    static final Map sntruprimeOids;
    static final Map sntruprimeParams;
    static final Map sphincsPlusOids;
    static final Map sphincsPlusParams;

    static {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = PQCObjectIdentifiers.qTESLA_p_I;
        AlgID_qTESLA_p_I = new AlgorithmIdentifier(aSN1ObjectIdentifier);
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = PQCObjectIdentifiers.qTESLA_p_III;
        AlgID_qTESLA_p_III = new AlgorithmIdentifier(aSN1ObjectIdentifier2);
        SPHINCS_SHA3_256 = new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha3_256);
        SPHINCS_SHA512_256 = new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha512_256);
        XMSS_SHA256 = new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha256);
        XMSS_SHA512 = new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha512);
        XMSS_SHAKE128 = new AlgorithmIdentifier(NISTObjectIdentifiers.id_shake128);
        XMSS_SHAKE256 = new AlgorithmIdentifier(NISTObjectIdentifiers.id_shake256);
        HashMap map = new HashMap();
        categories = map;
        HashMap map2 = new HashMap();
        picnicOids = map2;
        HashMap map3 = new HashMap();
        picnicParams = map3;
        HashMap map4 = new HashMap();
        frodoOids = map4;
        HashMap map5 = new HashMap();
        frodoParams = map5;
        HashMap map6 = new HashMap();
        saberOids = map6;
        HashMap map7 = new HashMap();
        saberParams = map7;
        HashMap map8 = new HashMap();
        mcElieceOids = map8;
        HashMap map9 = new HashMap();
        mcElieceParams = map9;
        HashMap map10 = new HashMap();
        sphincsPlusOids = map10;
        HashMap map11 = new HashMap();
        sphincsPlusParams = map11;
        sikeOids = new HashMap();
        sikeParams = new HashMap();
        HashMap map12 = new HashMap();
        ntruOids = map12;
        HashMap map13 = new HashMap();
        ntruParams = map13;
        HashMap map14 = new HashMap();
        falconOids = map14;
        HashMap map15 = new HashMap();
        falconParams = map15;
        HashMap map16 = new HashMap();
        ntruprimeOids = map16;
        HashMap map17 = new HashMap();
        ntruprimeParams = map17;
        HashMap map18 = new HashMap();
        sntruprimeOids = map18;
        HashMap map19 = new HashMap();
        sntruprimeParams = map19;
        HashMap map20 = new HashMap();
        dilithiumOids = map20;
        HashMap map21 = new HashMap();
        dilithiumParams = map21;
        HashMap map22 = new HashMap();
        bikeOids = map22;
        HashMap map23 = new HashMap();
        bikeParams = map23;
        HashMap map24 = new HashMap();
        hqcOids = map24;
        HashMap map25 = new HashMap();
        hqcParams = map25;
        HashMap map26 = new HashMap();
        rainbowOids = map26;
        HashMap map27 = new HashMap();
        rainbowParams = map27;
        HashMap map28 = new HashMap();
        mlkemOids = map28;
        HashMap map29 = new HashMap();
        mlkemParams = map29;
        HashMap map30 = new HashMap();
        mldsaOids = map30;
        HashMap map31 = new HashMap();
        mldsaParams = map31;
        HashMap map32 = new HashMap();
        slhdsaOids = map32;
        HashMap map33 = new HashMap();
        slhdsaParams = map33;
        HashMap map34 = new HashMap();
        mayoOids = map34;
        HashMap map35 = new HashMap();
        mayoParams = map35;
        HashMap map36 = new HashMap();
        snovaOids = map36;
        HashMap map37 = new HashMap();
        snovaParams = map37;
        map.put(aSN1ObjectIdentifier, Integers.valueOf(5));
        map.put(aSN1ObjectIdentifier2, Integers.valueOf(6));
        CMCEParameters cMCEParameters = CMCEParameters.mceliece348864r3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier3 = BCObjectIdentifiers.mceliece348864_r3;
        map8.put(cMCEParameters, aSN1ObjectIdentifier3);
        CMCEParameters cMCEParameters2 = CMCEParameters.mceliece348864fr3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier4 = BCObjectIdentifiers.mceliece348864f_r3;
        map8.put(cMCEParameters2, aSN1ObjectIdentifier4);
        CMCEParameters cMCEParameters3 = CMCEParameters.mceliece460896r3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier5 = BCObjectIdentifiers.mceliece460896_r3;
        map8.put(cMCEParameters3, aSN1ObjectIdentifier5);
        CMCEParameters cMCEParameters4 = CMCEParameters.mceliece460896fr3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier6 = BCObjectIdentifiers.mceliece460896f_r3;
        map8.put(cMCEParameters4, aSN1ObjectIdentifier6);
        CMCEParameters cMCEParameters5 = CMCEParameters.mceliece6688128r3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier7 = BCObjectIdentifiers.mceliece6688128_r3;
        map8.put(cMCEParameters5, aSN1ObjectIdentifier7);
        CMCEParameters cMCEParameters6 = CMCEParameters.mceliece6688128fr3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier8 = BCObjectIdentifiers.mceliece6688128f_r3;
        map8.put(cMCEParameters6, aSN1ObjectIdentifier8);
        CMCEParameters cMCEParameters7 = CMCEParameters.mceliece6960119r3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier9 = BCObjectIdentifiers.mceliece6960119_r3;
        map8.put(cMCEParameters7, aSN1ObjectIdentifier9);
        CMCEParameters cMCEParameters8 = CMCEParameters.mceliece6960119fr3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier10 = BCObjectIdentifiers.mceliece6960119f_r3;
        map8.put(cMCEParameters8, aSN1ObjectIdentifier10);
        CMCEParameters cMCEParameters9 = CMCEParameters.mceliece8192128r3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier11 = BCObjectIdentifiers.mceliece8192128_r3;
        map8.put(cMCEParameters9, aSN1ObjectIdentifier11);
        CMCEParameters cMCEParameters10 = CMCEParameters.mceliece8192128fr3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier12 = BCObjectIdentifiers.mceliece8192128f_r3;
        map8.put(cMCEParameters10, aSN1ObjectIdentifier12);
        map9.put(aSN1ObjectIdentifier3, cMCEParameters);
        map9.put(aSN1ObjectIdentifier4, cMCEParameters2);
        map9.put(aSN1ObjectIdentifier5, cMCEParameters3);
        map9.put(aSN1ObjectIdentifier6, cMCEParameters4);
        map9.put(aSN1ObjectIdentifier7, cMCEParameters5);
        map9.put(aSN1ObjectIdentifier8, cMCEParameters6);
        map9.put(aSN1ObjectIdentifier9, cMCEParameters7);
        map9.put(aSN1ObjectIdentifier10, cMCEParameters8);
        map9.put(aSN1ObjectIdentifier11, cMCEParameters9);
        map9.put(aSN1ObjectIdentifier12, cMCEParameters10);
        FrodoParameters frodoParameters = FrodoParameters.frodokem640aes;
        ASN1ObjectIdentifier aSN1ObjectIdentifier13 = BCObjectIdentifiers.frodokem640aes;
        map4.put(frodoParameters, aSN1ObjectIdentifier13);
        FrodoParameters frodoParameters2 = FrodoParameters.frodokem640shake;
        ASN1ObjectIdentifier aSN1ObjectIdentifier14 = BCObjectIdentifiers.frodokem640shake;
        map4.put(frodoParameters2, aSN1ObjectIdentifier14);
        FrodoParameters frodoParameters3 = FrodoParameters.frodokem976aes;
        ASN1ObjectIdentifier aSN1ObjectIdentifier15 = BCObjectIdentifiers.frodokem976aes;
        map4.put(frodoParameters3, aSN1ObjectIdentifier15);
        FrodoParameters frodoParameters4 = FrodoParameters.frodokem976shake;
        ASN1ObjectIdentifier aSN1ObjectIdentifier16 = BCObjectIdentifiers.frodokem976shake;
        map4.put(frodoParameters4, aSN1ObjectIdentifier16);
        FrodoParameters frodoParameters5 = FrodoParameters.frodokem1344aes;
        ASN1ObjectIdentifier aSN1ObjectIdentifier17 = BCObjectIdentifiers.frodokem1344aes;
        map4.put(frodoParameters5, aSN1ObjectIdentifier17);
        FrodoParameters frodoParameters6 = FrodoParameters.frodokem1344shake;
        ASN1ObjectIdentifier aSN1ObjectIdentifier18 = BCObjectIdentifiers.frodokem1344shake;
        map4.put(frodoParameters6, aSN1ObjectIdentifier18);
        map5.put(aSN1ObjectIdentifier13, frodoParameters);
        map5.put(aSN1ObjectIdentifier14, frodoParameters2);
        map5.put(aSN1ObjectIdentifier15, frodoParameters3);
        map5.put(aSN1ObjectIdentifier16, frodoParameters4);
        map5.put(aSN1ObjectIdentifier17, frodoParameters5);
        map5.put(aSN1ObjectIdentifier18, frodoParameters6);
        SABERParameters sABERParameters = SABERParameters.lightsaberkem128r3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier19 = BCObjectIdentifiers.lightsaberkem128r3;
        map6.put(sABERParameters, aSN1ObjectIdentifier19);
        SABERParameters sABERParameters2 = SABERParameters.saberkem128r3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier20 = BCObjectIdentifiers.saberkem128r3;
        map6.put(sABERParameters2, aSN1ObjectIdentifier20);
        SABERParameters sABERParameters3 = SABERParameters.firesaberkem128r3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier21 = BCObjectIdentifiers.firesaberkem128r3;
        map6.put(sABERParameters3, aSN1ObjectIdentifier21);
        SABERParameters sABERParameters4 = SABERParameters.lightsaberkem192r3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier22 = BCObjectIdentifiers.lightsaberkem192r3;
        map6.put(sABERParameters4, aSN1ObjectIdentifier22);
        SABERParameters sABERParameters5 = SABERParameters.saberkem192r3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier23 = BCObjectIdentifiers.saberkem192r3;
        map6.put(sABERParameters5, aSN1ObjectIdentifier23);
        SABERParameters sABERParameters6 = SABERParameters.firesaberkem192r3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier24 = BCObjectIdentifiers.firesaberkem192r3;
        map6.put(sABERParameters6, aSN1ObjectIdentifier24);
        SABERParameters sABERParameters7 = SABERParameters.lightsaberkem256r3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier25 = BCObjectIdentifiers.lightsaberkem256r3;
        map6.put(sABERParameters7, aSN1ObjectIdentifier25);
        SABERParameters sABERParameters8 = SABERParameters.saberkem256r3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier26 = BCObjectIdentifiers.saberkem256r3;
        map6.put(sABERParameters8, aSN1ObjectIdentifier26);
        SABERParameters sABERParameters9 = SABERParameters.firesaberkem256r3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier27 = BCObjectIdentifiers.firesaberkem256r3;
        map6.put(sABERParameters9, aSN1ObjectIdentifier27);
        SABERParameters sABERParameters10 = SABERParameters.ulightsaberkemr3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier28 = BCObjectIdentifiers.ulightsaberkemr3;
        map6.put(sABERParameters10, aSN1ObjectIdentifier28);
        SABERParameters sABERParameters11 = SABERParameters.usaberkemr3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier29 = BCObjectIdentifiers.usaberkemr3;
        map6.put(sABERParameters11, aSN1ObjectIdentifier29);
        SABERParameters sABERParameters12 = SABERParameters.ufiresaberkemr3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier30 = BCObjectIdentifiers.ufiresaberkemr3;
        map6.put(sABERParameters12, aSN1ObjectIdentifier30);
        SABERParameters sABERParameters13 = SABERParameters.lightsaberkem90sr3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier31 = BCObjectIdentifiers.lightsaberkem90sr3;
        map6.put(sABERParameters13, aSN1ObjectIdentifier31);
        SABERParameters sABERParameters14 = SABERParameters.saberkem90sr3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier32 = BCObjectIdentifiers.saberkem90sr3;
        map6.put(sABERParameters14, aSN1ObjectIdentifier32);
        SABERParameters sABERParameters15 = SABERParameters.firesaberkem90sr3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier33 = BCObjectIdentifiers.firesaberkem90sr3;
        map6.put(sABERParameters15, aSN1ObjectIdentifier33);
        SABERParameters sABERParameters16 = SABERParameters.ulightsaberkem90sr3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier34 = BCObjectIdentifiers.ulightsaberkem90sr3;
        map6.put(sABERParameters16, aSN1ObjectIdentifier34);
        SABERParameters sABERParameters17 = SABERParameters.usaberkem90sr3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier35 = BCObjectIdentifiers.usaberkem90sr3;
        map6.put(sABERParameters17, aSN1ObjectIdentifier35);
        SABERParameters sABERParameters18 = SABERParameters.ufiresaberkem90sr3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier36 = BCObjectIdentifiers.ufiresaberkem90sr3;
        map6.put(sABERParameters18, aSN1ObjectIdentifier36);
        map7.put(aSN1ObjectIdentifier19, sABERParameters);
        map7.put(aSN1ObjectIdentifier20, sABERParameters2);
        map7.put(aSN1ObjectIdentifier21, sABERParameters3);
        map7.put(aSN1ObjectIdentifier22, sABERParameters4);
        map7.put(aSN1ObjectIdentifier23, sABERParameters5);
        map7.put(aSN1ObjectIdentifier24, sABERParameters6);
        map7.put(aSN1ObjectIdentifier25, sABERParameters7);
        map7.put(aSN1ObjectIdentifier26, sABERParameters8);
        map7.put(aSN1ObjectIdentifier27, sABERParameters9);
        map7.put(aSN1ObjectIdentifier28, sABERParameters10);
        map7.put(aSN1ObjectIdentifier29, sABERParameters11);
        map7.put(aSN1ObjectIdentifier30, sABERParameters12);
        map7.put(aSN1ObjectIdentifier31, sABERParameters13);
        map7.put(aSN1ObjectIdentifier32, sABERParameters14);
        map7.put(aSN1ObjectIdentifier33, sABERParameters15);
        map7.put(aSN1ObjectIdentifier34, sABERParameters16);
        map7.put(aSN1ObjectIdentifier35, sABERParameters17);
        map7.put(aSN1ObjectIdentifier36, sABERParameters18);
        PicnicParameters picnicParameters = PicnicParameters.picnicl1fs;
        ASN1ObjectIdentifier aSN1ObjectIdentifier37 = BCObjectIdentifiers.picnicl1fs;
        map2.put(picnicParameters, aSN1ObjectIdentifier37);
        PicnicParameters picnicParameters2 = PicnicParameters.picnicl1ur;
        ASN1ObjectIdentifier aSN1ObjectIdentifier38 = BCObjectIdentifiers.picnicl1ur;
        map2.put(picnicParameters2, aSN1ObjectIdentifier38);
        PicnicParameters picnicParameters3 = PicnicParameters.picnicl3fs;
        ASN1ObjectIdentifier aSN1ObjectIdentifier39 = BCObjectIdentifiers.picnicl3fs;
        map2.put(picnicParameters3, aSN1ObjectIdentifier39);
        PicnicParameters picnicParameters4 = PicnicParameters.picnicl3ur;
        ASN1ObjectIdentifier aSN1ObjectIdentifier40 = BCObjectIdentifiers.picnicl3ur;
        map2.put(picnicParameters4, aSN1ObjectIdentifier40);
        PicnicParameters picnicParameters5 = PicnicParameters.picnicl5fs;
        ASN1ObjectIdentifier aSN1ObjectIdentifier41 = BCObjectIdentifiers.picnicl5fs;
        map2.put(picnicParameters5, aSN1ObjectIdentifier41);
        PicnicParameters picnicParameters6 = PicnicParameters.picnicl5ur;
        ASN1ObjectIdentifier aSN1ObjectIdentifier42 = BCObjectIdentifiers.picnicl5ur;
        map2.put(picnicParameters6, aSN1ObjectIdentifier42);
        PicnicParameters picnicParameters7 = PicnicParameters.picnic3l1;
        ASN1ObjectIdentifier aSN1ObjectIdentifier43 = BCObjectIdentifiers.picnic3l1;
        map2.put(picnicParameters7, aSN1ObjectIdentifier43);
        PicnicParameters picnicParameters8 = PicnicParameters.picnic3l3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier44 = BCObjectIdentifiers.picnic3l3;
        map2.put(picnicParameters8, aSN1ObjectIdentifier44);
        PicnicParameters picnicParameters9 = PicnicParameters.picnic3l5;
        ASN1ObjectIdentifier aSN1ObjectIdentifier45 = BCObjectIdentifiers.picnic3l5;
        map2.put(picnicParameters9, aSN1ObjectIdentifier45);
        PicnicParameters picnicParameters10 = PicnicParameters.picnicl1full;
        ASN1ObjectIdentifier aSN1ObjectIdentifier46 = BCObjectIdentifiers.picnicl1full;
        map2.put(picnicParameters10, aSN1ObjectIdentifier46);
        PicnicParameters picnicParameters11 = PicnicParameters.picnicl3full;
        ASN1ObjectIdentifier aSN1ObjectIdentifier47 = BCObjectIdentifiers.picnicl3full;
        map2.put(picnicParameters11, aSN1ObjectIdentifier47);
        PicnicParameters picnicParameters12 = PicnicParameters.picnicl5full;
        ASN1ObjectIdentifier aSN1ObjectIdentifier48 = BCObjectIdentifiers.picnicl5full;
        map2.put(picnicParameters12, aSN1ObjectIdentifier48);
        map3.put(aSN1ObjectIdentifier37, picnicParameters);
        map3.put(aSN1ObjectIdentifier38, picnicParameters2);
        map3.put(aSN1ObjectIdentifier39, picnicParameters3);
        map3.put(aSN1ObjectIdentifier40, picnicParameters4);
        map3.put(aSN1ObjectIdentifier41, picnicParameters5);
        map3.put(aSN1ObjectIdentifier42, picnicParameters6);
        map3.put(aSN1ObjectIdentifier43, picnicParameters7);
        map3.put(aSN1ObjectIdentifier44, picnicParameters8);
        map3.put(aSN1ObjectIdentifier45, picnicParameters9);
        map3.put(aSN1ObjectIdentifier46, picnicParameters10);
        map3.put(aSN1ObjectIdentifier47, picnicParameters11);
        map3.put(aSN1ObjectIdentifier48, picnicParameters12);
        NTRUParameters nTRUParameters = NTRUParameters.ntruhps2048509;
        ASN1ObjectIdentifier aSN1ObjectIdentifier49 = BCObjectIdentifiers.ntruhps2048509;
        map12.put(nTRUParameters, aSN1ObjectIdentifier49);
        NTRUParameters nTRUParameters2 = NTRUParameters.ntruhps2048677;
        ASN1ObjectIdentifier aSN1ObjectIdentifier50 = BCObjectIdentifiers.ntruhps2048677;
        map12.put(nTRUParameters2, aSN1ObjectIdentifier50);
        NTRUParameters nTRUParameters3 = NTRUParameters.ntruhps4096821;
        ASN1ObjectIdentifier aSN1ObjectIdentifier51 = BCObjectIdentifiers.ntruhps4096821;
        map12.put(nTRUParameters3, aSN1ObjectIdentifier51);
        NTRUParameters nTRUParameters4 = NTRUParameters.ntruhps40961229;
        ASN1ObjectIdentifier aSN1ObjectIdentifier52 = BCObjectIdentifiers.ntruhps40961229;
        map12.put(nTRUParameters4, aSN1ObjectIdentifier52);
        NTRUParameters nTRUParameters5 = NTRUParameters.ntruhrss701;
        ASN1ObjectIdentifier aSN1ObjectIdentifier53 = BCObjectIdentifiers.ntruhrss701;
        map12.put(nTRUParameters5, aSN1ObjectIdentifier53);
        NTRUParameters nTRUParameters6 = NTRUParameters.ntruhrss1373;
        ASN1ObjectIdentifier aSN1ObjectIdentifier54 = BCObjectIdentifiers.ntruhrss1373;
        map12.put(nTRUParameters6, aSN1ObjectIdentifier54);
        map13.put(aSN1ObjectIdentifier49, nTRUParameters);
        map13.put(aSN1ObjectIdentifier50, nTRUParameters2);
        map13.put(aSN1ObjectIdentifier51, nTRUParameters3);
        map13.put(aSN1ObjectIdentifier52, nTRUParameters4);
        map13.put(aSN1ObjectIdentifier53, nTRUParameters5);
        map13.put(aSN1ObjectIdentifier54, nTRUParameters6);
        FalconParameters falconParameters = FalconParameters.falcon_512;
        ASN1ObjectIdentifier aSN1ObjectIdentifier55 = BCObjectIdentifiers.falcon_512;
        map14.put(falconParameters, aSN1ObjectIdentifier55);
        FalconParameters falconParameters2 = FalconParameters.falcon_1024;
        ASN1ObjectIdentifier aSN1ObjectIdentifier56 = BCObjectIdentifiers.falcon_1024;
        map14.put(falconParameters2, aSN1ObjectIdentifier56);
        map15.put(aSN1ObjectIdentifier55, falconParameters);
        map15.put(aSN1ObjectIdentifier56, falconParameters2);
        MLKEMParameters mLKEMParameters = MLKEMParameters.ml_kem_512;
        ASN1ObjectIdentifier aSN1ObjectIdentifier57 = NISTObjectIdentifiers.id_alg_ml_kem_512;
        map28.put(mLKEMParameters, aSN1ObjectIdentifier57);
        MLKEMParameters mLKEMParameters2 = MLKEMParameters.ml_kem_768;
        ASN1ObjectIdentifier aSN1ObjectIdentifier58 = NISTObjectIdentifiers.id_alg_ml_kem_768;
        map28.put(mLKEMParameters2, aSN1ObjectIdentifier58);
        MLKEMParameters mLKEMParameters3 = MLKEMParameters.ml_kem_1024;
        ASN1ObjectIdentifier aSN1ObjectIdentifier59 = NISTObjectIdentifiers.id_alg_ml_kem_1024;
        map28.put(mLKEMParameters3, aSN1ObjectIdentifier59);
        map29.put(aSN1ObjectIdentifier57, mLKEMParameters);
        map29.put(aSN1ObjectIdentifier58, mLKEMParameters2);
        map29.put(aSN1ObjectIdentifier59, mLKEMParameters3);
        NTRULPRimeParameters nTRULPRimeParameters = NTRULPRimeParameters.ntrulpr653;
        ASN1ObjectIdentifier aSN1ObjectIdentifier60 = BCObjectIdentifiers.ntrulpr653;
        map16.put(nTRULPRimeParameters, aSN1ObjectIdentifier60);
        NTRULPRimeParameters nTRULPRimeParameters2 = NTRULPRimeParameters.ntrulpr761;
        ASN1ObjectIdentifier aSN1ObjectIdentifier61 = BCObjectIdentifiers.ntrulpr761;
        map16.put(nTRULPRimeParameters2, aSN1ObjectIdentifier61);
        NTRULPRimeParameters nTRULPRimeParameters3 = NTRULPRimeParameters.ntrulpr857;
        ASN1ObjectIdentifier aSN1ObjectIdentifier62 = BCObjectIdentifiers.ntrulpr857;
        map16.put(nTRULPRimeParameters3, aSN1ObjectIdentifier62);
        NTRULPRimeParameters nTRULPRimeParameters4 = NTRULPRimeParameters.ntrulpr953;
        ASN1ObjectIdentifier aSN1ObjectIdentifier63 = BCObjectIdentifiers.ntrulpr953;
        map16.put(nTRULPRimeParameters4, aSN1ObjectIdentifier63);
        NTRULPRimeParameters nTRULPRimeParameters5 = NTRULPRimeParameters.ntrulpr1013;
        ASN1ObjectIdentifier aSN1ObjectIdentifier64 = BCObjectIdentifiers.ntrulpr1013;
        map16.put(nTRULPRimeParameters5, aSN1ObjectIdentifier64);
        NTRULPRimeParameters nTRULPRimeParameters6 = NTRULPRimeParameters.ntrulpr1277;
        ASN1ObjectIdentifier aSN1ObjectIdentifier65 = BCObjectIdentifiers.ntrulpr1277;
        map16.put(nTRULPRimeParameters6, aSN1ObjectIdentifier65);
        map17.put(aSN1ObjectIdentifier60, nTRULPRimeParameters);
        map17.put(aSN1ObjectIdentifier61, nTRULPRimeParameters2);
        map17.put(aSN1ObjectIdentifier62, nTRULPRimeParameters3);
        map17.put(aSN1ObjectIdentifier63, nTRULPRimeParameters4);
        map17.put(aSN1ObjectIdentifier64, nTRULPRimeParameters5);
        map17.put(aSN1ObjectIdentifier65, nTRULPRimeParameters6);
        SNTRUPrimeParameters sNTRUPrimeParameters = SNTRUPrimeParameters.sntrup653;
        ASN1ObjectIdentifier aSN1ObjectIdentifier66 = BCObjectIdentifiers.sntrup653;
        map18.put(sNTRUPrimeParameters, aSN1ObjectIdentifier66);
        SNTRUPrimeParameters sNTRUPrimeParameters2 = SNTRUPrimeParameters.sntrup761;
        ASN1ObjectIdentifier aSN1ObjectIdentifier67 = BCObjectIdentifiers.sntrup761;
        map18.put(sNTRUPrimeParameters2, aSN1ObjectIdentifier67);
        SNTRUPrimeParameters sNTRUPrimeParameters3 = SNTRUPrimeParameters.sntrup857;
        ASN1ObjectIdentifier aSN1ObjectIdentifier68 = BCObjectIdentifiers.sntrup857;
        map18.put(sNTRUPrimeParameters3, aSN1ObjectIdentifier68);
        SNTRUPrimeParameters sNTRUPrimeParameters4 = SNTRUPrimeParameters.sntrup953;
        ASN1ObjectIdentifier aSN1ObjectIdentifier69 = BCObjectIdentifiers.sntrup953;
        map18.put(sNTRUPrimeParameters4, aSN1ObjectIdentifier69);
        SNTRUPrimeParameters sNTRUPrimeParameters5 = SNTRUPrimeParameters.sntrup1013;
        ASN1ObjectIdentifier aSN1ObjectIdentifier70 = BCObjectIdentifiers.sntrup1013;
        map18.put(sNTRUPrimeParameters5, aSN1ObjectIdentifier70);
        SNTRUPrimeParameters sNTRUPrimeParameters6 = SNTRUPrimeParameters.sntrup1277;
        ASN1ObjectIdentifier aSN1ObjectIdentifier71 = BCObjectIdentifiers.sntrup1277;
        map18.put(sNTRUPrimeParameters6, aSN1ObjectIdentifier71);
        map19.put(aSN1ObjectIdentifier66, sNTRUPrimeParameters);
        map19.put(aSN1ObjectIdentifier67, sNTRUPrimeParameters2);
        map19.put(aSN1ObjectIdentifier68, sNTRUPrimeParameters3);
        map19.put(aSN1ObjectIdentifier69, sNTRUPrimeParameters4);
        map19.put(aSN1ObjectIdentifier70, sNTRUPrimeParameters5);
        map19.put(aSN1ObjectIdentifier71, sNTRUPrimeParameters6);
        MLDSAParameters mLDSAParameters = MLDSAParameters.ml_dsa_44;
        ASN1ObjectIdentifier aSN1ObjectIdentifier72 = NISTObjectIdentifiers.id_ml_dsa_44;
        map30.put(mLDSAParameters, aSN1ObjectIdentifier72);
        MLDSAParameters mLDSAParameters2 = MLDSAParameters.ml_dsa_65;
        ASN1ObjectIdentifier aSN1ObjectIdentifier73 = NISTObjectIdentifiers.id_ml_dsa_65;
        map30.put(mLDSAParameters2, aSN1ObjectIdentifier73);
        MLDSAParameters mLDSAParameters3 = MLDSAParameters.ml_dsa_87;
        ASN1ObjectIdentifier aSN1ObjectIdentifier74 = NISTObjectIdentifiers.id_ml_dsa_87;
        map30.put(mLDSAParameters3, aSN1ObjectIdentifier74);
        MLDSAParameters mLDSAParameters4 = MLDSAParameters.ml_dsa_44_with_sha512;
        ASN1ObjectIdentifier aSN1ObjectIdentifier75 = NISTObjectIdentifiers.id_hash_ml_dsa_44_with_sha512;
        map30.put(mLDSAParameters4, aSN1ObjectIdentifier75);
        MLDSAParameters mLDSAParameters5 = MLDSAParameters.ml_dsa_65_with_sha512;
        ASN1ObjectIdentifier aSN1ObjectIdentifier76 = NISTObjectIdentifiers.id_hash_ml_dsa_65_with_sha512;
        map30.put(mLDSAParameters5, aSN1ObjectIdentifier76);
        MLDSAParameters mLDSAParameters6 = MLDSAParameters.ml_dsa_87_with_sha512;
        ASN1ObjectIdentifier aSN1ObjectIdentifier77 = NISTObjectIdentifiers.id_hash_ml_dsa_87_with_sha512;
        map30.put(mLDSAParameters6, aSN1ObjectIdentifier77);
        map31.put(aSN1ObjectIdentifier72, mLDSAParameters);
        map31.put(aSN1ObjectIdentifier73, mLDSAParameters2);
        map31.put(aSN1ObjectIdentifier74, mLDSAParameters3);
        map31.put(aSN1ObjectIdentifier75, mLDSAParameters4);
        map31.put(aSN1ObjectIdentifier76, mLDSAParameters5);
        map31.put(aSN1ObjectIdentifier77, mLDSAParameters6);
        DilithiumParameters dilithiumParameters = DilithiumParameters.dilithium2;
        ASN1ObjectIdentifier aSN1ObjectIdentifier78 = BCObjectIdentifiers.dilithium2;
        map20.put(dilithiumParameters, aSN1ObjectIdentifier78);
        DilithiumParameters dilithiumParameters2 = DilithiumParameters.dilithium3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier79 = BCObjectIdentifiers.dilithium3;
        map20.put(dilithiumParameters2, aSN1ObjectIdentifier79);
        DilithiumParameters dilithiumParameters3 = DilithiumParameters.dilithium5;
        ASN1ObjectIdentifier aSN1ObjectIdentifier80 = BCObjectIdentifiers.dilithium5;
        map20.put(dilithiumParameters3, aSN1ObjectIdentifier80);
        map21.put(aSN1ObjectIdentifier78, dilithiumParameters);
        map21.put(aSN1ObjectIdentifier79, dilithiumParameters2);
        map21.put(aSN1ObjectIdentifier80, dilithiumParameters3);
        ASN1ObjectIdentifier aSN1ObjectIdentifier81 = BCObjectIdentifiers.bike128;
        BIKEParameters bIKEParameters = BIKEParameters.bike128;
        map23.put(aSN1ObjectIdentifier81, bIKEParameters);
        ASN1ObjectIdentifier aSN1ObjectIdentifier82 = BCObjectIdentifiers.bike192;
        BIKEParameters bIKEParameters2 = BIKEParameters.bike192;
        map23.put(aSN1ObjectIdentifier82, bIKEParameters2);
        ASN1ObjectIdentifier aSN1ObjectIdentifier83 = BCObjectIdentifiers.bike256;
        BIKEParameters bIKEParameters3 = BIKEParameters.bike256;
        map23.put(aSN1ObjectIdentifier83, bIKEParameters3);
        map22.put(bIKEParameters, aSN1ObjectIdentifier81);
        map22.put(bIKEParameters2, aSN1ObjectIdentifier82);
        map22.put(bIKEParameters3, aSN1ObjectIdentifier83);
        ASN1ObjectIdentifier aSN1ObjectIdentifier84 = BCObjectIdentifiers.hqc128;
        HQCParameters hQCParameters = HQCParameters.hqc128;
        map25.put(aSN1ObjectIdentifier84, hQCParameters);
        ASN1ObjectIdentifier aSN1ObjectIdentifier85 = BCObjectIdentifiers.hqc192;
        HQCParameters hQCParameters2 = HQCParameters.hqc192;
        map25.put(aSN1ObjectIdentifier85, hQCParameters2);
        ASN1ObjectIdentifier aSN1ObjectIdentifier86 = BCObjectIdentifiers.hqc256;
        HQCParameters hQCParameters3 = HQCParameters.hqc256;
        map25.put(aSN1ObjectIdentifier86, hQCParameters3);
        map24.put(hQCParameters, aSN1ObjectIdentifier84);
        map24.put(hQCParameters2, aSN1ObjectIdentifier85);
        map24.put(hQCParameters3, aSN1ObjectIdentifier86);
        ASN1ObjectIdentifier aSN1ObjectIdentifier87 = BCObjectIdentifiers.rainbow_III_classic;
        RainbowParameters rainbowParameters = RainbowParameters.rainbowIIIclassic;
        map27.put(aSN1ObjectIdentifier87, rainbowParameters);
        ASN1ObjectIdentifier aSN1ObjectIdentifier88 = BCObjectIdentifiers.rainbow_III_circumzenithal;
        RainbowParameters rainbowParameters2 = RainbowParameters.rainbowIIIcircumzenithal;
        map27.put(aSN1ObjectIdentifier88, rainbowParameters2);
        ASN1ObjectIdentifier aSN1ObjectIdentifier89 = BCObjectIdentifiers.rainbow_III_compressed;
        RainbowParameters rainbowParameters3 = RainbowParameters.rainbowIIIcompressed;
        map27.put(aSN1ObjectIdentifier89, rainbowParameters3);
        ASN1ObjectIdentifier aSN1ObjectIdentifier90 = BCObjectIdentifiers.rainbow_V_classic;
        RainbowParameters rainbowParameters4 = RainbowParameters.rainbowVclassic;
        map27.put(aSN1ObjectIdentifier90, rainbowParameters4);
        ASN1ObjectIdentifier aSN1ObjectIdentifier91 = BCObjectIdentifiers.rainbow_V_circumzenithal;
        RainbowParameters rainbowParameters5 = RainbowParameters.rainbowVcircumzenithal;
        map27.put(aSN1ObjectIdentifier91, rainbowParameters5);
        ASN1ObjectIdentifier aSN1ObjectIdentifier92 = BCObjectIdentifiers.rainbow_V_compressed;
        RainbowParameters rainbowParameters6 = RainbowParameters.rainbowVcompressed;
        map27.put(aSN1ObjectIdentifier92, rainbowParameters6);
        map26.put(rainbowParameters, aSN1ObjectIdentifier87);
        map26.put(rainbowParameters2, aSN1ObjectIdentifier88);
        map26.put(rainbowParameters3, aSN1ObjectIdentifier89);
        map26.put(rainbowParameters4, aSN1ObjectIdentifier90);
        map26.put(rainbowParameters5, aSN1ObjectIdentifier91);
        map26.put(rainbowParameters6, aSN1ObjectIdentifier92);
        SLHDSAParameters sLHDSAParameters = SLHDSAParameters.sha2_128s;
        ASN1ObjectIdentifier aSN1ObjectIdentifier93 = NISTObjectIdentifiers.id_slh_dsa_sha2_128s;
        map32.put(sLHDSAParameters, aSN1ObjectIdentifier93);
        SLHDSAParameters sLHDSAParameters2 = SLHDSAParameters.sha2_128f;
        ASN1ObjectIdentifier aSN1ObjectIdentifier94 = NISTObjectIdentifiers.id_slh_dsa_sha2_128f;
        map32.put(sLHDSAParameters2, aSN1ObjectIdentifier94);
        SLHDSAParameters sLHDSAParameters3 = SLHDSAParameters.sha2_192s;
        ASN1ObjectIdentifier aSN1ObjectIdentifier95 = NISTObjectIdentifiers.id_slh_dsa_sha2_192s;
        map32.put(sLHDSAParameters3, aSN1ObjectIdentifier95);
        SLHDSAParameters sLHDSAParameters4 = SLHDSAParameters.sha2_192f;
        ASN1ObjectIdentifier aSN1ObjectIdentifier96 = NISTObjectIdentifiers.id_slh_dsa_sha2_192f;
        map32.put(sLHDSAParameters4, aSN1ObjectIdentifier96);
        SLHDSAParameters sLHDSAParameters5 = SLHDSAParameters.sha2_256s;
        ASN1ObjectIdentifier aSN1ObjectIdentifier97 = NISTObjectIdentifiers.id_slh_dsa_sha2_256s;
        map32.put(sLHDSAParameters5, aSN1ObjectIdentifier97);
        SLHDSAParameters sLHDSAParameters6 = SLHDSAParameters.sha2_256f;
        ASN1ObjectIdentifier aSN1ObjectIdentifier98 = NISTObjectIdentifiers.id_slh_dsa_sha2_256f;
        map32.put(sLHDSAParameters6, aSN1ObjectIdentifier98);
        SLHDSAParameters sLHDSAParameters7 = SLHDSAParameters.shake_128s;
        ASN1ObjectIdentifier aSN1ObjectIdentifier99 = NISTObjectIdentifiers.id_slh_dsa_shake_128s;
        map32.put(sLHDSAParameters7, aSN1ObjectIdentifier99);
        SLHDSAParameters sLHDSAParameters8 = SLHDSAParameters.shake_128f;
        ASN1ObjectIdentifier aSN1ObjectIdentifier100 = NISTObjectIdentifiers.id_slh_dsa_shake_128f;
        map32.put(sLHDSAParameters8, aSN1ObjectIdentifier100);
        SLHDSAParameters sLHDSAParameters9 = SLHDSAParameters.shake_192s;
        ASN1ObjectIdentifier aSN1ObjectIdentifier101 = NISTObjectIdentifiers.id_slh_dsa_shake_192s;
        map32.put(sLHDSAParameters9, aSN1ObjectIdentifier101);
        SLHDSAParameters sLHDSAParameters10 = SLHDSAParameters.shake_192f;
        ASN1ObjectIdentifier aSN1ObjectIdentifier102 = NISTObjectIdentifiers.id_slh_dsa_shake_192f;
        map32.put(sLHDSAParameters10, aSN1ObjectIdentifier102);
        SLHDSAParameters sLHDSAParameters11 = SLHDSAParameters.shake_256s;
        ASN1ObjectIdentifier aSN1ObjectIdentifier103 = NISTObjectIdentifiers.id_slh_dsa_shake_256s;
        map32.put(sLHDSAParameters11, aSN1ObjectIdentifier103);
        SLHDSAParameters sLHDSAParameters12 = SLHDSAParameters.shake_256f;
        ASN1ObjectIdentifier aSN1ObjectIdentifier104 = NISTObjectIdentifiers.id_slh_dsa_shake_256f;
        map32.put(sLHDSAParameters12, aSN1ObjectIdentifier104);
        SLHDSAParameters sLHDSAParameters13 = SLHDSAParameters.sha2_128s_with_sha256;
        ASN1ObjectIdentifier aSN1ObjectIdentifier105 = NISTObjectIdentifiers.id_hash_slh_dsa_sha2_128s_with_sha256;
        map32.put(sLHDSAParameters13, aSN1ObjectIdentifier105);
        SLHDSAParameters sLHDSAParameters14 = SLHDSAParameters.sha2_128f_with_sha256;
        ASN1ObjectIdentifier aSN1ObjectIdentifier106 = NISTObjectIdentifiers.id_hash_slh_dsa_sha2_128f_with_sha256;
        map32.put(sLHDSAParameters14, aSN1ObjectIdentifier106);
        SLHDSAParameters sLHDSAParameters15 = SLHDSAParameters.sha2_192s_with_sha512;
        ASN1ObjectIdentifier aSN1ObjectIdentifier107 = NISTObjectIdentifiers.id_hash_slh_dsa_sha2_192s_with_sha512;
        map32.put(sLHDSAParameters15, aSN1ObjectIdentifier107);
        SLHDSAParameters sLHDSAParameters16 = SLHDSAParameters.sha2_192f_with_sha512;
        ASN1ObjectIdentifier aSN1ObjectIdentifier108 = NISTObjectIdentifiers.id_hash_slh_dsa_sha2_192f_with_sha512;
        map32.put(sLHDSAParameters16, aSN1ObjectIdentifier108);
        SLHDSAParameters sLHDSAParameters17 = SLHDSAParameters.sha2_256s_with_sha512;
        ASN1ObjectIdentifier aSN1ObjectIdentifier109 = NISTObjectIdentifiers.id_hash_slh_dsa_sha2_256s_with_sha512;
        map32.put(sLHDSAParameters17, aSN1ObjectIdentifier109);
        SLHDSAParameters sLHDSAParameters18 = SLHDSAParameters.sha2_256f_with_sha512;
        ASN1ObjectIdentifier aSN1ObjectIdentifier110 = NISTObjectIdentifiers.id_hash_slh_dsa_sha2_256f_with_sha512;
        map32.put(sLHDSAParameters18, aSN1ObjectIdentifier110);
        SLHDSAParameters sLHDSAParameters19 = SLHDSAParameters.shake_128s_with_shake128;
        ASN1ObjectIdentifier aSN1ObjectIdentifier111 = NISTObjectIdentifiers.id_hash_slh_dsa_shake_128s_with_shake128;
        map32.put(sLHDSAParameters19, aSN1ObjectIdentifier111);
        SLHDSAParameters sLHDSAParameters20 = SLHDSAParameters.shake_128f_with_shake128;
        ASN1ObjectIdentifier aSN1ObjectIdentifier112 = NISTObjectIdentifiers.id_hash_slh_dsa_shake_128f_with_shake128;
        map32.put(sLHDSAParameters20, aSN1ObjectIdentifier112);
        SLHDSAParameters sLHDSAParameters21 = SLHDSAParameters.shake_192s_with_shake256;
        ASN1ObjectIdentifier aSN1ObjectIdentifier113 = NISTObjectIdentifiers.id_hash_slh_dsa_shake_192s_with_shake256;
        map32.put(sLHDSAParameters21, aSN1ObjectIdentifier113);
        SLHDSAParameters sLHDSAParameters22 = SLHDSAParameters.shake_192f_with_shake256;
        ASN1ObjectIdentifier aSN1ObjectIdentifier114 = NISTObjectIdentifiers.id_hash_slh_dsa_shake_192f_with_shake256;
        map32.put(sLHDSAParameters22, aSN1ObjectIdentifier114);
        SLHDSAParameters sLHDSAParameters23 = SLHDSAParameters.shake_256s_with_shake256;
        ASN1ObjectIdentifier aSN1ObjectIdentifier115 = NISTObjectIdentifiers.id_hash_slh_dsa_shake_256s_with_shake256;
        map32.put(sLHDSAParameters23, aSN1ObjectIdentifier115);
        SLHDSAParameters sLHDSAParameters24 = SLHDSAParameters.shake_256f_with_shake256;
        ASN1ObjectIdentifier aSN1ObjectIdentifier116 = NISTObjectIdentifiers.id_hash_slh_dsa_shake_256f_with_shake256;
        map32.put(sLHDSAParameters24, aSN1ObjectIdentifier116);
        map33.put(aSN1ObjectIdentifier93, sLHDSAParameters);
        map33.put(aSN1ObjectIdentifier94, sLHDSAParameters2);
        map33.put(aSN1ObjectIdentifier95, sLHDSAParameters3);
        map33.put(aSN1ObjectIdentifier96, sLHDSAParameters4);
        map33.put(aSN1ObjectIdentifier97, sLHDSAParameters5);
        map33.put(aSN1ObjectIdentifier98, sLHDSAParameters6);
        map33.put(aSN1ObjectIdentifier99, sLHDSAParameters7);
        map33.put(aSN1ObjectIdentifier100, sLHDSAParameters8);
        map33.put(aSN1ObjectIdentifier101, sLHDSAParameters9);
        map33.put(aSN1ObjectIdentifier102, sLHDSAParameters10);
        map33.put(aSN1ObjectIdentifier103, sLHDSAParameters11);
        map33.put(aSN1ObjectIdentifier104, sLHDSAParameters12);
        map33.put(aSN1ObjectIdentifier105, sLHDSAParameters13);
        map33.put(aSN1ObjectIdentifier106, sLHDSAParameters14);
        map33.put(aSN1ObjectIdentifier107, sLHDSAParameters15);
        map33.put(aSN1ObjectIdentifier108, sLHDSAParameters16);
        map33.put(aSN1ObjectIdentifier109, sLHDSAParameters17);
        map33.put(aSN1ObjectIdentifier110, sLHDSAParameters18);
        map33.put(aSN1ObjectIdentifier111, sLHDSAParameters19);
        map33.put(aSN1ObjectIdentifier112, sLHDSAParameters20);
        map33.put(aSN1ObjectIdentifier113, sLHDSAParameters21);
        map33.put(aSN1ObjectIdentifier114, sLHDSAParameters22);
        map33.put(aSN1ObjectIdentifier115, sLHDSAParameters23);
        map33.put(aSN1ObjectIdentifier116, sLHDSAParameters24);
        ASN1ObjectIdentifier aSN1ObjectIdentifier117 = BCObjectIdentifiers.sphincsPlus_sha2_128s;
        map10.put(sLHDSAParameters, aSN1ObjectIdentifier117);
        ASN1ObjectIdentifier aSN1ObjectIdentifier118 = BCObjectIdentifiers.sphincsPlus_sha2_128f;
        map10.put(sLHDSAParameters2, aSN1ObjectIdentifier118);
        ASN1ObjectIdentifier aSN1ObjectIdentifier119 = BCObjectIdentifiers.sphincsPlus_sha2_192s;
        map10.put(sLHDSAParameters3, aSN1ObjectIdentifier119);
        ASN1ObjectIdentifier aSN1ObjectIdentifier120 = BCObjectIdentifiers.sphincsPlus_sha2_192f;
        map10.put(sLHDSAParameters4, aSN1ObjectIdentifier120);
        ASN1ObjectIdentifier aSN1ObjectIdentifier121 = BCObjectIdentifiers.sphincsPlus_sha2_256s;
        map10.put(sLHDSAParameters5, aSN1ObjectIdentifier121);
        ASN1ObjectIdentifier aSN1ObjectIdentifier122 = BCObjectIdentifiers.sphincsPlus_sha2_256f;
        map10.put(sLHDSAParameters6, aSN1ObjectIdentifier122);
        ASN1ObjectIdentifier aSN1ObjectIdentifier123 = BCObjectIdentifiers.sphincsPlus_shake_128s;
        map10.put(sLHDSAParameters7, aSN1ObjectIdentifier123);
        ASN1ObjectIdentifier aSN1ObjectIdentifier124 = BCObjectIdentifiers.sphincsPlus_shake_128f;
        map10.put(sLHDSAParameters8, aSN1ObjectIdentifier124);
        ASN1ObjectIdentifier aSN1ObjectIdentifier125 = BCObjectIdentifiers.sphincsPlus_shake_192s;
        map10.put(sLHDSAParameters9, aSN1ObjectIdentifier125);
        ASN1ObjectIdentifier aSN1ObjectIdentifier126 = BCObjectIdentifiers.sphincsPlus_shake_192f;
        map10.put(sLHDSAParameters10, aSN1ObjectIdentifier126);
        ASN1ObjectIdentifier aSN1ObjectIdentifier127 = BCObjectIdentifiers.sphincsPlus_shake_256s;
        map10.put(sLHDSAParameters11, aSN1ObjectIdentifier127);
        ASN1ObjectIdentifier aSN1ObjectIdentifier128 = BCObjectIdentifiers.sphincsPlus_shake_256f;
        map10.put(sLHDSAParameters12, aSN1ObjectIdentifier128);
        SPHINCSPlusParameters sPHINCSPlusParameters = SPHINCSPlusParameters.sha2_128s_robust;
        ASN1ObjectIdentifier aSN1ObjectIdentifier129 = BCObjectIdentifiers.sphincsPlus_sha2_128s_r3;
        map10.put(sPHINCSPlusParameters, aSN1ObjectIdentifier129);
        SPHINCSPlusParameters sPHINCSPlusParameters2 = SPHINCSPlusParameters.sha2_128f_robust;
        ASN1ObjectIdentifier aSN1ObjectIdentifier130 = BCObjectIdentifiers.sphincsPlus_sha2_128f_r3;
        map10.put(sPHINCSPlusParameters2, aSN1ObjectIdentifier130);
        SPHINCSPlusParameters sPHINCSPlusParameters3 = SPHINCSPlusParameters.shake_128s_robust;
        ASN1ObjectIdentifier aSN1ObjectIdentifier131 = BCObjectIdentifiers.sphincsPlus_shake_128s_r3;
        map10.put(sPHINCSPlusParameters3, aSN1ObjectIdentifier131);
        SPHINCSPlusParameters sPHINCSPlusParameters4 = SPHINCSPlusParameters.shake_128f_robust;
        ASN1ObjectIdentifier aSN1ObjectIdentifier132 = BCObjectIdentifiers.sphincsPlus_shake_128f_r3;
        map10.put(sPHINCSPlusParameters4, aSN1ObjectIdentifier132);
        SPHINCSPlusParameters sPHINCSPlusParameters5 = SPHINCSPlusParameters.haraka_128s;
        ASN1ObjectIdentifier aSN1ObjectIdentifier133 = BCObjectIdentifiers.sphincsPlus_haraka_128s_r3;
        map10.put(sPHINCSPlusParameters5, aSN1ObjectIdentifier133);
        SPHINCSPlusParameters sPHINCSPlusParameters6 = SPHINCSPlusParameters.haraka_128f;
        ASN1ObjectIdentifier aSN1ObjectIdentifier134 = BCObjectIdentifiers.sphincsPlus_haraka_128f_r3;
        map10.put(sPHINCSPlusParameters6, aSN1ObjectIdentifier134);
        SPHINCSPlusParameters sPHINCSPlusParameters7 = SPHINCSPlusParameters.sha2_192s_robust;
        ASN1ObjectIdentifier aSN1ObjectIdentifier135 = BCObjectIdentifiers.sphincsPlus_sha2_192s_r3;
        map10.put(sPHINCSPlusParameters7, aSN1ObjectIdentifier135);
        SPHINCSPlusParameters sPHINCSPlusParameters8 = SPHINCSPlusParameters.sha2_192f_robust;
        ASN1ObjectIdentifier aSN1ObjectIdentifier136 = BCObjectIdentifiers.sphincsPlus_sha2_192f_r3;
        map10.put(sPHINCSPlusParameters8, aSN1ObjectIdentifier136);
        SPHINCSPlusParameters sPHINCSPlusParameters9 = SPHINCSPlusParameters.shake_192s_robust;
        ASN1ObjectIdentifier aSN1ObjectIdentifier137 = BCObjectIdentifiers.sphincsPlus_shake_192s_r3;
        map10.put(sPHINCSPlusParameters9, aSN1ObjectIdentifier137);
        SPHINCSPlusParameters sPHINCSPlusParameters10 = SPHINCSPlusParameters.shake_192f_robust;
        ASN1ObjectIdentifier aSN1ObjectIdentifier138 = BCObjectIdentifiers.sphincsPlus_shake_192f_r3;
        map10.put(sPHINCSPlusParameters10, aSN1ObjectIdentifier138);
        SPHINCSPlusParameters sPHINCSPlusParameters11 = SPHINCSPlusParameters.haraka_192s;
        ASN1ObjectIdentifier aSN1ObjectIdentifier139 = BCObjectIdentifiers.sphincsPlus_haraka_192s_r3;
        map10.put(sPHINCSPlusParameters11, aSN1ObjectIdentifier139);
        SPHINCSPlusParameters sPHINCSPlusParameters12 = SPHINCSPlusParameters.haraka_192f;
        ASN1ObjectIdentifier aSN1ObjectIdentifier140 = BCObjectIdentifiers.sphincsPlus_haraka_192f_r3;
        map10.put(sPHINCSPlusParameters12, aSN1ObjectIdentifier140);
        SPHINCSPlusParameters sPHINCSPlusParameters13 = SPHINCSPlusParameters.sha2_256s_robust;
        ASN1ObjectIdentifier aSN1ObjectIdentifier141 = BCObjectIdentifiers.sphincsPlus_sha2_256s_r3;
        map10.put(sPHINCSPlusParameters13, aSN1ObjectIdentifier141);
        SPHINCSPlusParameters sPHINCSPlusParameters14 = SPHINCSPlusParameters.sha2_256f_robust;
        ASN1ObjectIdentifier aSN1ObjectIdentifier142 = BCObjectIdentifiers.sphincsPlus_sha2_256f_r3;
        map10.put(sPHINCSPlusParameters14, aSN1ObjectIdentifier142);
        SPHINCSPlusParameters sPHINCSPlusParameters15 = SPHINCSPlusParameters.shake_256s_robust;
        ASN1ObjectIdentifier aSN1ObjectIdentifier143 = BCObjectIdentifiers.sphincsPlus_shake_256s_r3;
        map10.put(sPHINCSPlusParameters15, aSN1ObjectIdentifier143);
        SPHINCSPlusParameters sPHINCSPlusParameters16 = SPHINCSPlusParameters.shake_256f_robust;
        ASN1ObjectIdentifier aSN1ObjectIdentifier144 = BCObjectIdentifiers.sphincsPlus_shake_256f_r3;
        map10.put(sPHINCSPlusParameters16, aSN1ObjectIdentifier144);
        SPHINCSPlusParameters sPHINCSPlusParameters17 = SPHINCSPlusParameters.haraka_256s;
        ASN1ObjectIdentifier aSN1ObjectIdentifier145 = BCObjectIdentifiers.sphincsPlus_haraka_256s_r3;
        map10.put(sPHINCSPlusParameters17, aSN1ObjectIdentifier145);
        SPHINCSPlusParameters sPHINCSPlusParameters18 = SPHINCSPlusParameters.haraka_256f;
        ASN1ObjectIdentifier aSN1ObjectIdentifier146 = BCObjectIdentifiers.sphincsPlus_haraka_256f_r3;
        map10.put(sPHINCSPlusParameters18, aSN1ObjectIdentifier146);
        SPHINCSPlusParameters sPHINCSPlusParameters19 = SPHINCSPlusParameters.haraka_128s_simple;
        ASN1ObjectIdentifier aSN1ObjectIdentifier147 = BCObjectIdentifiers.sphincsPlus_haraka_128s_r3_simple;
        map10.put(sPHINCSPlusParameters19, aSN1ObjectIdentifier147);
        SPHINCSPlusParameters sPHINCSPlusParameters20 = SPHINCSPlusParameters.haraka_128f_simple;
        ASN1ObjectIdentifier aSN1ObjectIdentifier148 = BCObjectIdentifiers.sphincsPlus_haraka_128f_r3_simple;
        map10.put(sPHINCSPlusParameters20, aSN1ObjectIdentifier148);
        SPHINCSPlusParameters sPHINCSPlusParameters21 = SPHINCSPlusParameters.haraka_192s_simple;
        ASN1ObjectIdentifier aSN1ObjectIdentifier149 = BCObjectIdentifiers.sphincsPlus_haraka_192s_r3_simple;
        map10.put(sPHINCSPlusParameters21, aSN1ObjectIdentifier149);
        SPHINCSPlusParameters sPHINCSPlusParameters22 = SPHINCSPlusParameters.haraka_192f_simple;
        ASN1ObjectIdentifier aSN1ObjectIdentifier150 = BCObjectIdentifiers.sphincsPlus_haraka_192f_r3_simple;
        map10.put(sPHINCSPlusParameters22, aSN1ObjectIdentifier150);
        SPHINCSPlusParameters sPHINCSPlusParameters23 = SPHINCSPlusParameters.haraka_256s_simple;
        ASN1ObjectIdentifier aSN1ObjectIdentifier151 = BCObjectIdentifiers.sphincsPlus_haraka_256s_r3_simple;
        map10.put(sPHINCSPlusParameters23, aSN1ObjectIdentifier151);
        SPHINCSPlusParameters sPHINCSPlusParameters24 = SPHINCSPlusParameters.haraka_256f_simple;
        ASN1ObjectIdentifier aSN1ObjectIdentifier152 = BCObjectIdentifiers.sphincsPlus_haraka_256f_r3_simple;
        map10.put(sPHINCSPlusParameters24, aSN1ObjectIdentifier152);
        SPHINCSPlusParameters sPHINCSPlusParameters25 = SPHINCSPlusParameters.sha2_128s;
        map10.put(sPHINCSPlusParameters25, aSN1ObjectIdentifier117);
        SPHINCSPlusParameters sPHINCSPlusParameters26 = SPHINCSPlusParameters.sha2_128f;
        map10.put(sPHINCSPlusParameters26, aSN1ObjectIdentifier118);
        SPHINCSPlusParameters sPHINCSPlusParameters27 = SPHINCSPlusParameters.sha2_192s;
        map10.put(sPHINCSPlusParameters27, aSN1ObjectIdentifier119);
        SPHINCSPlusParameters sPHINCSPlusParameters28 = SPHINCSPlusParameters.sha2_192f;
        map10.put(sPHINCSPlusParameters28, aSN1ObjectIdentifier120);
        SPHINCSPlusParameters sPHINCSPlusParameters29 = SPHINCSPlusParameters.sha2_256s;
        map10.put(sPHINCSPlusParameters29, aSN1ObjectIdentifier121);
        SPHINCSPlusParameters sPHINCSPlusParameters30 = SPHINCSPlusParameters.sha2_256f;
        map10.put(sPHINCSPlusParameters30, aSN1ObjectIdentifier122);
        SPHINCSPlusParameters sPHINCSPlusParameters31 = SPHINCSPlusParameters.shake_128s;
        map10.put(sPHINCSPlusParameters31, aSN1ObjectIdentifier123);
        SPHINCSPlusParameters sPHINCSPlusParameters32 = SPHINCSPlusParameters.shake_128f;
        map10.put(sPHINCSPlusParameters32, aSN1ObjectIdentifier124);
        SPHINCSPlusParameters sPHINCSPlusParameters33 = SPHINCSPlusParameters.shake_192s;
        map10.put(sPHINCSPlusParameters33, aSN1ObjectIdentifier125);
        SPHINCSPlusParameters sPHINCSPlusParameters34 = SPHINCSPlusParameters.shake_192f;
        map10.put(sPHINCSPlusParameters34, aSN1ObjectIdentifier126);
        SPHINCSPlusParameters sPHINCSPlusParameters35 = SPHINCSPlusParameters.shake_256s;
        map10.put(sPHINCSPlusParameters35, aSN1ObjectIdentifier127);
        SPHINCSPlusParameters sPHINCSPlusParameters36 = SPHINCSPlusParameters.shake_256f;
        map10.put(sPHINCSPlusParameters36, aSN1ObjectIdentifier128);
        map11.put(aSN1ObjectIdentifier117, sPHINCSPlusParameters25);
        map11.put(aSN1ObjectIdentifier118, sPHINCSPlusParameters26);
        map11.put(aSN1ObjectIdentifier123, sPHINCSPlusParameters31);
        map11.put(aSN1ObjectIdentifier124, sPHINCSPlusParameters32);
        map11.put(aSN1ObjectIdentifier119, sPHINCSPlusParameters27);
        map11.put(aSN1ObjectIdentifier120, sPHINCSPlusParameters28);
        map11.put(aSN1ObjectIdentifier125, sPHINCSPlusParameters33);
        map11.put(aSN1ObjectIdentifier126, sPHINCSPlusParameters34);
        map11.put(aSN1ObjectIdentifier121, sPHINCSPlusParameters29);
        map11.put(aSN1ObjectIdentifier122, sPHINCSPlusParameters30);
        map11.put(aSN1ObjectIdentifier127, sPHINCSPlusParameters35);
        map11.put(aSN1ObjectIdentifier128, sPHINCSPlusParameters36);
        map11.put(aSN1ObjectIdentifier129, sPHINCSPlusParameters);
        map11.put(aSN1ObjectIdentifier130, sPHINCSPlusParameters2);
        map11.put(aSN1ObjectIdentifier131, sPHINCSPlusParameters3);
        map11.put(aSN1ObjectIdentifier132, sPHINCSPlusParameters4);
        map11.put(aSN1ObjectIdentifier133, sPHINCSPlusParameters5);
        map11.put(aSN1ObjectIdentifier134, sPHINCSPlusParameters6);
        map11.put(aSN1ObjectIdentifier135, sPHINCSPlusParameters7);
        map11.put(aSN1ObjectIdentifier136, sPHINCSPlusParameters8);
        map11.put(aSN1ObjectIdentifier137, sPHINCSPlusParameters9);
        map11.put(aSN1ObjectIdentifier138, sPHINCSPlusParameters10);
        map11.put(aSN1ObjectIdentifier139, sPHINCSPlusParameters11);
        map11.put(aSN1ObjectIdentifier140, sPHINCSPlusParameters12);
        map11.put(aSN1ObjectIdentifier141, sPHINCSPlusParameters13);
        map11.put(aSN1ObjectIdentifier142, sPHINCSPlusParameters14);
        map11.put(aSN1ObjectIdentifier143, sPHINCSPlusParameters15);
        map11.put(aSN1ObjectIdentifier144, sPHINCSPlusParameters16);
        map11.put(aSN1ObjectIdentifier145, sPHINCSPlusParameters17);
        map11.put(aSN1ObjectIdentifier146, sPHINCSPlusParameters18);
        map11.put(BCObjectIdentifiers.sphincsPlus_sha2_128s_r3_simple, sPHINCSPlusParameters25);
        map11.put(BCObjectIdentifiers.sphincsPlus_sha2_128f_r3_simple, sPHINCSPlusParameters26);
        map11.put(BCObjectIdentifiers.sphincsPlus_shake_128s_r3_simple, sPHINCSPlusParameters31);
        map11.put(BCObjectIdentifiers.sphincsPlus_shake_128f_r3_simple, sPHINCSPlusParameters32);
        map11.put(aSN1ObjectIdentifier147, sPHINCSPlusParameters19);
        map11.put(aSN1ObjectIdentifier148, sPHINCSPlusParameters20);
        map11.put(BCObjectIdentifiers.sphincsPlus_sha2_192s_r3_simple, sPHINCSPlusParameters27);
        map11.put(BCObjectIdentifiers.sphincsPlus_sha2_192f_r3_simple, sPHINCSPlusParameters28);
        map11.put(BCObjectIdentifiers.sphincsPlus_shake_192s_r3_simple, sPHINCSPlusParameters33);
        map11.put(BCObjectIdentifiers.sphincsPlus_shake_192f_r3_simple, sPHINCSPlusParameters34);
        map11.put(aSN1ObjectIdentifier149, sPHINCSPlusParameters21);
        map11.put(aSN1ObjectIdentifier150, sPHINCSPlusParameters22);
        map11.put(BCObjectIdentifiers.sphincsPlus_sha2_256s_r3_simple, sPHINCSPlusParameters29);
        map11.put(BCObjectIdentifiers.sphincsPlus_sha2_256f_r3_simple, sPHINCSPlusParameters30);
        map11.put(BCObjectIdentifiers.sphincsPlus_shake_256s_r3_simple, sPHINCSPlusParameters35);
        map11.put(BCObjectIdentifiers.sphincsPlus_shake_256f_r3_simple, sPHINCSPlusParameters36);
        map11.put(aSN1ObjectIdentifier151, sPHINCSPlusParameters23);
        map11.put(aSN1ObjectIdentifier152, sPHINCSPlusParameters24);
        MayoParameters mayoParameters = MayoParameters.mayo1;
        ASN1ObjectIdentifier aSN1ObjectIdentifier153 = BCObjectIdentifiers.mayo1;
        map34.put(mayoParameters, aSN1ObjectIdentifier153);
        MayoParameters mayoParameters2 = MayoParameters.mayo2;
        ASN1ObjectIdentifier aSN1ObjectIdentifier154 = BCObjectIdentifiers.mayo2;
        map34.put(mayoParameters2, aSN1ObjectIdentifier154);
        MayoParameters mayoParameters3 = MayoParameters.mayo3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier155 = BCObjectIdentifiers.mayo3;
        map34.put(mayoParameters3, aSN1ObjectIdentifier155);
        MayoParameters mayoParameters4 = MayoParameters.mayo5;
        ASN1ObjectIdentifier aSN1ObjectIdentifier156 = BCObjectIdentifiers.mayo5;
        map34.put(mayoParameters4, aSN1ObjectIdentifier156);
        map35.put(aSN1ObjectIdentifier153, mayoParameters);
        map35.put(aSN1ObjectIdentifier154, mayoParameters2);
        map35.put(aSN1ObjectIdentifier155, mayoParameters3);
        map35.put(aSN1ObjectIdentifier156, mayoParameters4);
        SnovaParameters snovaParameters = SnovaParameters.SNOVA_24_5_4_SSK;
        ASN1ObjectIdentifier aSN1ObjectIdentifier157 = BCObjectIdentifiers.snova_24_5_4_ssk;
        map36.put(snovaParameters, aSN1ObjectIdentifier157);
        SnovaParameters snovaParameters2 = SnovaParameters.SNOVA_24_5_4_ESK;
        ASN1ObjectIdentifier aSN1ObjectIdentifier158 = BCObjectIdentifiers.snova_24_5_4_esk;
        map36.put(snovaParameters2, aSN1ObjectIdentifier158);
        SnovaParameters snovaParameters3 = SnovaParameters.SNOVA_24_5_4_SHAKE_SSK;
        ASN1ObjectIdentifier aSN1ObjectIdentifier159 = BCObjectIdentifiers.snova_24_5_4_shake_ssk;
        map36.put(snovaParameters3, aSN1ObjectIdentifier159);
        SnovaParameters snovaParameters4 = SnovaParameters.SNOVA_24_5_4_SHAKE_ESK;
        ASN1ObjectIdentifier aSN1ObjectIdentifier160 = BCObjectIdentifiers.snova_24_5_4_shake_esk;
        map36.put(snovaParameters4, aSN1ObjectIdentifier160);
        SnovaParameters snovaParameters5 = SnovaParameters.SNOVA_24_5_5_SSK;
        ASN1ObjectIdentifier aSN1ObjectIdentifier161 = BCObjectIdentifiers.snova_24_5_5_ssk;
        map36.put(snovaParameters5, aSN1ObjectIdentifier161);
        SnovaParameters snovaParameters6 = SnovaParameters.SNOVA_24_5_5_ESK;
        ASN1ObjectIdentifier aSN1ObjectIdentifier162 = BCObjectIdentifiers.snova_24_5_5_esk;
        map36.put(snovaParameters6, aSN1ObjectIdentifier162);
        SnovaParameters snovaParameters7 = SnovaParameters.SNOVA_24_5_5_SHAKE_SSK;
        ASN1ObjectIdentifier aSN1ObjectIdentifier163 = BCObjectIdentifiers.snova_24_5_5_shake_ssk;
        map36.put(snovaParameters7, aSN1ObjectIdentifier163);
        SnovaParameters snovaParameters8 = SnovaParameters.SNOVA_24_5_5_SHAKE_ESK;
        ASN1ObjectIdentifier aSN1ObjectIdentifier164 = BCObjectIdentifiers.snova_24_5_5_shake_esk;
        map36.put(snovaParameters8, aSN1ObjectIdentifier164);
        SnovaParameters snovaParameters9 = SnovaParameters.SNOVA_25_8_3_SSK;
        ASN1ObjectIdentifier aSN1ObjectIdentifier165 = BCObjectIdentifiers.snova_25_8_3_ssk;
        map36.put(snovaParameters9, aSN1ObjectIdentifier165);
        SnovaParameters snovaParameters10 = SnovaParameters.SNOVA_25_8_3_ESK;
        ASN1ObjectIdentifier aSN1ObjectIdentifier166 = BCObjectIdentifiers.snova_25_8_3_esk;
        map36.put(snovaParameters10, aSN1ObjectIdentifier166);
        SnovaParameters snovaParameters11 = SnovaParameters.SNOVA_25_8_3_SHAKE_SSK;
        ASN1ObjectIdentifier aSN1ObjectIdentifier167 = BCObjectIdentifiers.snova_25_8_3_shake_ssk;
        map36.put(snovaParameters11, aSN1ObjectIdentifier167);
        SnovaParameters snovaParameters12 = SnovaParameters.SNOVA_25_8_3_SHAKE_ESK;
        ASN1ObjectIdentifier aSN1ObjectIdentifier168 = BCObjectIdentifiers.snova_25_8_3_shake_esk;
        map36.put(snovaParameters12, aSN1ObjectIdentifier168);
        SnovaParameters snovaParameters13 = SnovaParameters.SNOVA_29_6_5_SSK;
        ASN1ObjectIdentifier aSN1ObjectIdentifier169 = BCObjectIdentifiers.snova_29_6_5_ssk;
        map36.put(snovaParameters13, aSN1ObjectIdentifier169);
        SnovaParameters snovaParameters14 = SnovaParameters.SNOVA_29_6_5_ESK;
        ASN1ObjectIdentifier aSN1ObjectIdentifier170 = BCObjectIdentifiers.snova_29_6_5_esk;
        map36.put(snovaParameters14, aSN1ObjectIdentifier170);
        SnovaParameters snovaParameters15 = SnovaParameters.SNOVA_29_6_5_SHAKE_SSK;
        ASN1ObjectIdentifier aSN1ObjectIdentifier171 = BCObjectIdentifiers.snova_29_6_5_shake_ssk;
        map36.put(snovaParameters15, aSN1ObjectIdentifier171);
        SnovaParameters snovaParameters16 = SnovaParameters.SNOVA_29_6_5_SHAKE_ESK;
        ASN1ObjectIdentifier aSN1ObjectIdentifier172 = BCObjectIdentifiers.snova_29_6_5_shake_esk;
        map36.put(snovaParameters16, aSN1ObjectIdentifier172);
        SnovaParameters snovaParameters17 = SnovaParameters.SNOVA_37_8_4_SSK;
        ASN1ObjectIdentifier aSN1ObjectIdentifier173 = BCObjectIdentifiers.snova_37_8_4_ssk;
        map36.put(snovaParameters17, aSN1ObjectIdentifier173);
        SnovaParameters snovaParameters18 = SnovaParameters.SNOVA_37_8_4_ESK;
        ASN1ObjectIdentifier aSN1ObjectIdentifier174 = BCObjectIdentifiers.snova_37_8_4_esk;
        map36.put(snovaParameters18, aSN1ObjectIdentifier174);
        SnovaParameters snovaParameters19 = SnovaParameters.SNOVA_37_8_4_SHAKE_SSK;
        ASN1ObjectIdentifier aSN1ObjectIdentifier175 = BCObjectIdentifiers.snova_37_8_4_shake_ssk;
        map36.put(snovaParameters19, aSN1ObjectIdentifier175);
        SnovaParameters snovaParameters20 = SnovaParameters.SNOVA_37_8_4_SHAKE_ESK;
        ASN1ObjectIdentifier aSN1ObjectIdentifier176 = BCObjectIdentifiers.snova_37_8_4_shake_esk;
        map36.put(snovaParameters20, aSN1ObjectIdentifier176);
        SnovaParameters snovaParameters21 = SnovaParameters.SNOVA_37_17_2_SSK;
        ASN1ObjectIdentifier aSN1ObjectIdentifier177 = BCObjectIdentifiers.snova_37_17_2_ssk;
        map36.put(snovaParameters21, aSN1ObjectIdentifier177);
        SnovaParameters snovaParameters22 = SnovaParameters.SNOVA_37_17_2_ESK;
        ASN1ObjectIdentifier aSN1ObjectIdentifier178 = BCObjectIdentifiers.snova_37_17_2_esk;
        map36.put(snovaParameters22, aSN1ObjectIdentifier178);
        SnovaParameters snovaParameters23 = SnovaParameters.SNOVA_37_17_2_SHAKE_SSK;
        ASN1ObjectIdentifier aSN1ObjectIdentifier179 = BCObjectIdentifiers.snova_37_17_2_shake_ssk;
        map36.put(snovaParameters23, aSN1ObjectIdentifier179);
        SnovaParameters snovaParameters24 = SnovaParameters.SNOVA_37_17_2_SHAKE_ESK;
        ASN1ObjectIdentifier aSN1ObjectIdentifier180 = BCObjectIdentifiers.snova_37_17_2_shake_esk;
        map36.put(snovaParameters24, aSN1ObjectIdentifier180);
        SnovaParameters snovaParameters25 = SnovaParameters.SNOVA_49_11_3_SSK;
        ASN1ObjectIdentifier aSN1ObjectIdentifier181 = BCObjectIdentifiers.snova_49_11_3_ssk;
        map36.put(snovaParameters25, aSN1ObjectIdentifier181);
        SnovaParameters snovaParameters26 = SnovaParameters.SNOVA_49_11_3_ESK;
        ASN1ObjectIdentifier aSN1ObjectIdentifier182 = BCObjectIdentifiers.snova_49_11_3_esk;
        map36.put(snovaParameters26, aSN1ObjectIdentifier182);
        SnovaParameters snovaParameters27 = SnovaParameters.SNOVA_49_11_3_SHAKE_SSK;
        ASN1ObjectIdentifier aSN1ObjectIdentifier183 = BCObjectIdentifiers.snova_49_11_3_shake_ssk;
        map36.put(snovaParameters27, aSN1ObjectIdentifier183);
        SnovaParameters snovaParameters28 = SnovaParameters.SNOVA_49_11_3_SHAKE_ESK;
        ASN1ObjectIdentifier aSN1ObjectIdentifier184 = BCObjectIdentifiers.snova_49_11_3_shake_esk;
        map36.put(snovaParameters28, aSN1ObjectIdentifier184);
        SnovaParameters snovaParameters29 = SnovaParameters.SNOVA_56_25_2_SSK;
        ASN1ObjectIdentifier aSN1ObjectIdentifier185 = BCObjectIdentifiers.snova_56_25_2_ssk;
        map36.put(snovaParameters29, aSN1ObjectIdentifier185);
        SnovaParameters snovaParameters30 = SnovaParameters.SNOVA_56_25_2_ESK;
        ASN1ObjectIdentifier aSN1ObjectIdentifier186 = BCObjectIdentifiers.snova_56_25_2_esk;
        map36.put(snovaParameters30, aSN1ObjectIdentifier186);
        SnovaParameters snovaParameters31 = SnovaParameters.SNOVA_56_25_2_SHAKE_SSK;
        ASN1ObjectIdentifier aSN1ObjectIdentifier187 = BCObjectIdentifiers.snova_56_25_2_shake_ssk;
        map36.put(snovaParameters31, aSN1ObjectIdentifier187);
        SnovaParameters snovaParameters32 = SnovaParameters.SNOVA_56_25_2_SHAKE_ESK;
        ASN1ObjectIdentifier aSN1ObjectIdentifier188 = BCObjectIdentifiers.snova_56_25_2_shake_esk;
        map36.put(snovaParameters32, aSN1ObjectIdentifier188);
        SnovaParameters snovaParameters33 = SnovaParameters.SNOVA_60_10_4_SSK;
        ASN1ObjectIdentifier aSN1ObjectIdentifier189 = BCObjectIdentifiers.snova_60_10_4_ssk;
        map36.put(snovaParameters33, aSN1ObjectIdentifier189);
        SnovaParameters snovaParameters34 = SnovaParameters.SNOVA_60_10_4_ESK;
        ASN1ObjectIdentifier aSN1ObjectIdentifier190 = BCObjectIdentifiers.snova_60_10_4_esk;
        map36.put(snovaParameters34, aSN1ObjectIdentifier190);
        SnovaParameters snovaParameters35 = SnovaParameters.SNOVA_60_10_4_SHAKE_SSK;
        ASN1ObjectIdentifier aSN1ObjectIdentifier191 = BCObjectIdentifiers.snova_60_10_4_shake_ssk;
        map36.put(snovaParameters35, aSN1ObjectIdentifier191);
        SnovaParameters snovaParameters36 = SnovaParameters.SNOVA_60_10_4_SHAKE_ESK;
        ASN1ObjectIdentifier aSN1ObjectIdentifier192 = BCObjectIdentifiers.snova_60_10_4_shake_esk;
        map36.put(snovaParameters36, aSN1ObjectIdentifier192);
        SnovaParameters snovaParameters37 = SnovaParameters.SNOVA_66_15_3_SSK;
        ASN1ObjectIdentifier aSN1ObjectIdentifier193 = BCObjectIdentifiers.snova_66_15_3_ssk;
        map36.put(snovaParameters37, aSN1ObjectIdentifier193);
        SnovaParameters snovaParameters38 = SnovaParameters.SNOVA_66_15_3_ESK;
        ASN1ObjectIdentifier aSN1ObjectIdentifier194 = BCObjectIdentifiers.snova_66_15_3_esk;
        map36.put(snovaParameters38, aSN1ObjectIdentifier194);
        SnovaParameters snovaParameters39 = SnovaParameters.SNOVA_66_15_3_SHAKE_SSK;
        ASN1ObjectIdentifier aSN1ObjectIdentifier195 = BCObjectIdentifiers.snova_66_15_3_shake_ssk;
        map36.put(snovaParameters39, aSN1ObjectIdentifier195);
        SnovaParameters snovaParameters40 = SnovaParameters.SNOVA_66_15_3_SHAKE_ESK;
        ASN1ObjectIdentifier aSN1ObjectIdentifier196 = BCObjectIdentifiers.snova_66_15_3_shake_esk;
        map36.put(snovaParameters40, aSN1ObjectIdentifier196);
        SnovaParameters snovaParameters41 = SnovaParameters.SNOVA_75_33_2_SSK;
        ASN1ObjectIdentifier aSN1ObjectIdentifier197 = BCObjectIdentifiers.snova_75_33_2_ssk;
        map36.put(snovaParameters41, aSN1ObjectIdentifier197);
        SnovaParameters snovaParameters42 = SnovaParameters.SNOVA_75_33_2_ESK;
        ASN1ObjectIdentifier aSN1ObjectIdentifier198 = BCObjectIdentifiers.snova_75_33_2_esk;
        map36.put(snovaParameters42, aSN1ObjectIdentifier198);
        SnovaParameters snovaParameters43 = SnovaParameters.SNOVA_75_33_2_SHAKE_SSK;
        ASN1ObjectIdentifier aSN1ObjectIdentifier199 = BCObjectIdentifiers.snova_75_33_2_shake_ssk;
        map36.put(snovaParameters43, aSN1ObjectIdentifier199);
        SnovaParameters snovaParameters44 = SnovaParameters.SNOVA_75_33_2_SHAKE_ESK;
        ASN1ObjectIdentifier aSN1ObjectIdentifier200 = BCObjectIdentifiers.snova_75_33_2_shake_esk;
        map36.put(snovaParameters44, aSN1ObjectIdentifier200);
        map37.put(aSN1ObjectIdentifier157, snovaParameters);
        map37.put(aSN1ObjectIdentifier158, snovaParameters2);
        map37.put(aSN1ObjectIdentifier159, snovaParameters3);
        map37.put(aSN1ObjectIdentifier160, snovaParameters4);
        map37.put(aSN1ObjectIdentifier161, snovaParameters5);
        map37.put(aSN1ObjectIdentifier162, snovaParameters6);
        map37.put(aSN1ObjectIdentifier163, snovaParameters7);
        map37.put(aSN1ObjectIdentifier164, snovaParameters8);
        map37.put(aSN1ObjectIdentifier165, snovaParameters9);
        map37.put(aSN1ObjectIdentifier166, snovaParameters10);
        map37.put(aSN1ObjectIdentifier167, snovaParameters11);
        map37.put(aSN1ObjectIdentifier168, snovaParameters12);
        map37.put(aSN1ObjectIdentifier169, snovaParameters13);
        map37.put(aSN1ObjectIdentifier170, snovaParameters14);
        map37.put(aSN1ObjectIdentifier171, snovaParameters15);
        map37.put(aSN1ObjectIdentifier172, snovaParameters16);
        map37.put(aSN1ObjectIdentifier173, snovaParameters17);
        map37.put(aSN1ObjectIdentifier174, snovaParameters18);
        map37.put(aSN1ObjectIdentifier175, snovaParameters19);
        map37.put(aSN1ObjectIdentifier176, snovaParameters20);
        map37.put(aSN1ObjectIdentifier177, snovaParameters21);
        map37.put(aSN1ObjectIdentifier178, snovaParameters22);
        map37.put(aSN1ObjectIdentifier179, snovaParameters23);
        map37.put(aSN1ObjectIdentifier180, snovaParameters24);
        map37.put(aSN1ObjectIdentifier181, snovaParameters25);
        map37.put(aSN1ObjectIdentifier182, snovaParameters26);
        map37.put(aSN1ObjectIdentifier183, snovaParameters27);
        map37.put(aSN1ObjectIdentifier184, snovaParameters28);
        map37.put(aSN1ObjectIdentifier185, snovaParameters29);
        map37.put(aSN1ObjectIdentifier186, snovaParameters30);
        map37.put(aSN1ObjectIdentifier187, snovaParameters31);
        map37.put(aSN1ObjectIdentifier188, snovaParameters32);
        map37.put(aSN1ObjectIdentifier189, snovaParameters33);
        map37.put(aSN1ObjectIdentifier190, snovaParameters34);
        map37.put(aSN1ObjectIdentifier191, snovaParameters35);
        map37.put(aSN1ObjectIdentifier192, snovaParameters36);
        map37.put(aSN1ObjectIdentifier193, snovaParameters37);
        map37.put(aSN1ObjectIdentifier194, snovaParameters38);
        map37.put(aSN1ObjectIdentifier195, snovaParameters39);
        map37.put(aSN1ObjectIdentifier196, snovaParameters40);
        map37.put(aSN1ObjectIdentifier197, snovaParameters41);
        map37.put(aSN1ObjectIdentifier198, snovaParameters42);
        map37.put(aSN1ObjectIdentifier199, snovaParameters43);
        map37.put(aSN1ObjectIdentifier200, snovaParameters44);
    }

    public static ASN1ObjectIdentifier bikeOidLookup(BIKEParameters bIKEParameters) {
        return (ASN1ObjectIdentifier) bikeOids.get(bIKEParameters);
    }

    public static BIKEParameters bikeParamsLookup(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (BIKEParameters) bikeParams.get(aSN1ObjectIdentifier);
    }

    public static ASN1ObjectIdentifier dilithiumOidLookup(DilithiumParameters dilithiumParameters) {
        return (ASN1ObjectIdentifier) dilithiumOids.get(dilithiumParameters);
    }

    public static DilithiumParameters dilithiumParamsLookup(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (DilithiumParameters) dilithiumParams.get(aSN1ObjectIdentifier);
    }

    public static ASN1ObjectIdentifier falconOidLookup(FalconParameters falconParameters) {
        return (ASN1ObjectIdentifier) falconOids.get(falconParameters);
    }

    public static FalconParameters falconParamsLookup(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (FalconParameters) falconParams.get(aSN1ObjectIdentifier);
    }

    public static ASN1ObjectIdentifier frodoOidLookup(FrodoParameters frodoParameters) {
        return (ASN1ObjectIdentifier) frodoOids.get(frodoParameters);
    }

    public static FrodoParameters frodoParamsLookup(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (FrodoParameters) frodoParams.get(aSN1ObjectIdentifier);
    }

    public static AlgorithmIdentifier getAlgorithmIdentifier(String str) {
        if (str.equals(McElieceCCA2KeyGenParameterSpec.SHA1)) {
            return new AlgorithmIdentifier(OIWObjectIdentifiers.idSHA1, DERNull.INSTANCE);
        }
        if (str.equals(McElieceCCA2KeyGenParameterSpec.SHA224)) {
            return new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha224);
        }
        if (str.equals("SHA-256")) {
            return new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha256);
        }
        if (str.equals(McElieceCCA2KeyGenParameterSpec.SHA384)) {
            return new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha384);
        }
        if (str.equals("SHA-512")) {
            return new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha512);
        }
        a.f("unrecognised digest algorithm: ".concat(str));
        return null;
    }

    public static Digest getDigest(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        if (aSN1ObjectIdentifier.equals((ASN1Primitive) NISTObjectIdentifiers.id_sha256)) {
            return new SHA256Digest();
        }
        if (aSN1ObjectIdentifier.equals((ASN1Primitive) NISTObjectIdentifiers.id_sha512)) {
            return new SHA512Digest();
        }
        if (aSN1ObjectIdentifier.equals((ASN1Primitive) NISTObjectIdentifiers.id_shake128)) {
            return new SHAKEDigest(128);
        }
        if (aSN1ObjectIdentifier.equals((ASN1Primitive) NISTObjectIdentifiers.id_shake256)) {
            return new SHAKEDigest(256);
        }
        a.f(s.l("unrecognized digest OID: ", aSN1ObjectIdentifier));
        return null;
    }

    public static String getDigestName(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        if (aSN1ObjectIdentifier.equals((ASN1Primitive) OIWObjectIdentifiers.idSHA1)) {
            return McElieceCCA2KeyGenParameterSpec.SHA1;
        }
        if (aSN1ObjectIdentifier.equals((ASN1Primitive) NISTObjectIdentifiers.id_sha224)) {
            return McElieceCCA2KeyGenParameterSpec.SHA224;
        }
        if (aSN1ObjectIdentifier.equals((ASN1Primitive) NISTObjectIdentifiers.id_sha256)) {
            return "SHA-256";
        }
        if (aSN1ObjectIdentifier.equals((ASN1Primitive) NISTObjectIdentifiers.id_sha384)) {
            return McElieceCCA2KeyGenParameterSpec.SHA384;
        }
        if (aSN1ObjectIdentifier.equals((ASN1Primitive) NISTObjectIdentifiers.id_sha512)) {
            return "SHA-512";
        }
        a.f(s.l("unrecognised digest algorithm: ", aSN1ObjectIdentifier));
        return null;
    }

    public static ASN1ObjectIdentifier hqcOidLookup(HQCParameters hQCParameters) {
        return (ASN1ObjectIdentifier) hqcOids.get(hQCParameters);
    }

    public static HQCParameters hqcParamsLookup(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (HQCParameters) hqcParams.get(aSN1ObjectIdentifier);
    }

    private static boolean isRaw(byte[] bArr) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        byteArrayInputStream.read();
        return readLen(byteArrayInputStream) != byteArrayInputStream.available();
    }

    public static ASN1ObjectIdentifier mayoOidLookup(MayoParameters mayoParameters) {
        return (ASN1ObjectIdentifier) mayoOids.get(mayoParameters);
    }

    public static MayoParameters mayoParamsLookup(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (MayoParameters) mayoParams.get(aSN1ObjectIdentifier);
    }

    public static ASN1ObjectIdentifier mcElieceOidLookup(CMCEParameters cMCEParameters) {
        return (ASN1ObjectIdentifier) mcElieceOids.get(cMCEParameters);
    }

    public static CMCEParameters mcElieceParamsLookup(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (CMCEParameters) mcElieceParams.get(aSN1ObjectIdentifier);
    }

    public static ASN1ObjectIdentifier mldsaOidLookup(MLDSAParameters mLDSAParameters) {
        return (ASN1ObjectIdentifier) mldsaOids.get(mLDSAParameters);
    }

    public static MLDSAParameters mldsaParamsLookup(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (MLDSAParameters) mldsaParams.get(aSN1ObjectIdentifier);
    }

    public static ASN1ObjectIdentifier mlkemOidLookup(MLKEMParameters mLKEMParameters) {
        return (ASN1ObjectIdentifier) mlkemOids.get(mLKEMParameters);
    }

    public static MLKEMParameters mlkemParamsLookup(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (MLKEMParameters) mlkemParams.get(aSN1ObjectIdentifier);
    }

    public static ASN1ObjectIdentifier ntruOidLookup(NTRUParameters nTRUParameters) {
        return (ASN1ObjectIdentifier) ntruOids.get(nTRUParameters);
    }

    public static NTRUParameters ntruParamsLookup(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (NTRUParameters) ntruParams.get(aSN1ObjectIdentifier);
    }

    public static ASN1ObjectIdentifier ntrulprimeOidLookup(NTRULPRimeParameters nTRULPRimeParameters) {
        return (ASN1ObjectIdentifier) ntruprimeOids.get(nTRULPRimeParameters);
    }

    public static NTRULPRimeParameters ntrulprimeParamsLookup(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (NTRULPRimeParameters) ntruprimeParams.get(aSN1ObjectIdentifier);
    }

    public static ASN1Primitive parseData(byte[] bArr) {
        if (isRaw(bArr)) {
            return null;
        }
        byte b8 = bArr[0];
        if (b8 == 48) {
            return ASN1Sequence.getInstance(bArr);
        }
        if (b8 == 4) {
            return ASN1OctetString.getInstance(bArr);
        }
        if ((b8 & 255) == 128) {
            return ASN1OctetString.getInstance(ASN1TaggedObject.getInstance(bArr), false);
        }
        return null;
    }

    public static ASN1OctetString parseOctetData(byte[] bArr) {
        if (isRaw(bArr) || bArr[0] != 4) {
            return null;
        }
        return ASN1OctetString.getInstance(bArr);
    }

    public static ASN1ObjectIdentifier picnicOidLookup(PicnicParameters picnicParameters) {
        return (ASN1ObjectIdentifier) picnicOids.get(picnicParameters);
    }

    public static PicnicParameters picnicParamsLookup(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (PicnicParameters) picnicParams.get(aSN1ObjectIdentifier);
    }

    public static AlgorithmIdentifier qTeslaLookupAlgID(int i11) {
        if (i11 == 5) {
            return AlgID_qTESLA_p_I;
        }
        if (i11 == 6) {
            return AlgID_qTESLA_p_III;
        }
        a.f(s.f(i11, "unknown security category: "));
        return null;
    }

    public static int qTeslaLookupSecurityCategory(AlgorithmIdentifier algorithmIdentifier) {
        return ((Integer) categories.get(algorithmIdentifier.getAlgorithm())).intValue();
    }

    public static ASN1ObjectIdentifier rainbowOidLookup(RainbowParameters rainbowParameters) {
        return (ASN1ObjectIdentifier) rainbowOids.get(rainbowParameters);
    }

    public static RainbowParameters rainbowParamsLookup(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (RainbowParameters) rainbowParams.get(aSN1ObjectIdentifier);
    }

    public static int readLen(ByteArrayInputStream byteArrayInputStream) {
        int i11 = byteArrayInputStream.read();
        if (i11 < 0) {
            return -1;
        }
        int i12 = i11 & 127;
        if (i11 != i12) {
            i11 = 0;
            while (true) {
                int i13 = i12 - 1;
                if (i12 == 0) {
                    break;
                }
                i11 = (i11 << 8) + byteArrayInputStream.read();
                i12 = i13;
            }
        }
        return i11;
    }

    public static ASN1ObjectIdentifier saberOidLookup(SABERParameters sABERParameters) {
        return (ASN1ObjectIdentifier) saberOids.get(sABERParameters);
    }

    public static SABERParameters saberParamsLookup(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (SABERParameters) saberParams.get(aSN1ObjectIdentifier);
    }

    public static ASN1ObjectIdentifier slhdsaOidLookup(SLHDSAParameters sLHDSAParameters) {
        return (ASN1ObjectIdentifier) slhdsaOids.get(sLHDSAParameters);
    }

    public static SLHDSAParameters slhdsaParamsLookup(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (SLHDSAParameters) slhdsaParams.get(aSN1ObjectIdentifier);
    }

    public static ASN1ObjectIdentifier snovaOidLookup(SnovaParameters snovaParameters) {
        return (ASN1ObjectIdentifier) snovaOids.get(snovaParameters);
    }

    public static SnovaParameters snovaParamsLookup(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (SnovaParameters) snovaParams.get(aSN1ObjectIdentifier);
    }

    public static ASN1ObjectIdentifier sntruprimeOidLookup(SNTRUPrimeParameters sNTRUPrimeParameters) {
        return (ASN1ObjectIdentifier) sntruprimeOids.get(sNTRUPrimeParameters);
    }

    public static SNTRUPrimeParameters sntruprimeParamsLookup(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (SNTRUPrimeParameters) sntruprimeParams.get(aSN1ObjectIdentifier);
    }

    public static AlgorithmIdentifier sphincs256LookupTreeAlgID(String str) {
        if (str.equals("SHA3-256")) {
            return SPHINCS_SHA3_256;
        }
        if (str.equals(SPHINCSKeyParameters.SHA512_256)) {
            return SPHINCS_SHA512_256;
        }
        a.f("unknown tree digest: ".concat(str));
        return null;
    }

    public static String sphincs256LookupTreeAlgName(SPHINCS256KeyParams sPHINCS256KeyParams) {
        AlgorithmIdentifier treeDigest = sPHINCS256KeyParams.getTreeDigest();
        if (treeDigest.getAlgorithm().equals((ASN1Primitive) SPHINCS_SHA3_256.getAlgorithm())) {
            return "SHA3-256";
        }
        if (treeDigest.getAlgorithm().equals((ASN1Primitive) SPHINCS_SHA512_256.getAlgorithm())) {
            return SPHINCSKeyParameters.SHA512_256;
        }
        d.t(treeDigest.getAlgorithm(), "unknown tree digest: ");
        return null;
    }

    public static ASN1ObjectIdentifier sphincsPlusOidLookup(SPHINCSPlusParameters sPHINCSPlusParameters) {
        return (ASN1ObjectIdentifier) sphincsPlusOids.get(sPHINCSPlusParameters);
    }

    public static SPHINCSPlusParameters sphincsPlusParamsLookup(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (SPHINCSPlusParameters) sphincsPlusParams.get(aSN1ObjectIdentifier);
    }

    public static AlgorithmIdentifier xmssLookupTreeAlgID(String str) {
        if (str.equals("SHA-256")) {
            return XMSS_SHA256;
        }
        if (str.equals("SHA-512")) {
            return XMSS_SHA512;
        }
        if (str.equals("SHAKE128")) {
            return XMSS_SHAKE128;
        }
        if (str.equals("SHAKE256")) {
            return XMSS_SHAKE256;
        }
        a.f("unknown tree digest: ".concat(str));
        return null;
    }
}
