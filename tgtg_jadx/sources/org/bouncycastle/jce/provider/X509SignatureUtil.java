package org.bouncycastle.jce.provider;

import com.braze.h2;
import j4.s;
import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.PSSParameterSpec;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.RSASSAPSSparams;
import org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.Extensions;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.internal.asn1.oiw.OIWObjectIdentifiers;
import r8.k;

/* JADX INFO: loaded from: classes3.dex */
class X509SignatureUtil {
    private static String getDigestAlgName(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return PKCSObjectIdentifiers.md5.equals((ASN1Primitive) aSN1ObjectIdentifier) ? "MD5" : OIWObjectIdentifiers.idSHA1.equals((ASN1Primitive) aSN1ObjectIdentifier) ? "SHA1" : NISTObjectIdentifiers.id_sha224.equals((ASN1Primitive) aSN1ObjectIdentifier) ? "SHA224" : NISTObjectIdentifiers.id_sha256.equals((ASN1Primitive) aSN1ObjectIdentifier) ? "SHA256" : NISTObjectIdentifiers.id_sha384.equals((ASN1Primitive) aSN1ObjectIdentifier) ? "SHA384" : NISTObjectIdentifiers.id_sha512.equals((ASN1Primitive) aSN1ObjectIdentifier) ? "SHA512" : TeleTrusTObjectIdentifiers.ripemd128.equals((ASN1Primitive) aSN1ObjectIdentifier) ? "RIPEMD128" : TeleTrusTObjectIdentifiers.ripemd160.equals((ASN1Primitive) aSN1ObjectIdentifier) ? "RIPEMD160" : TeleTrusTObjectIdentifiers.ripemd256.equals((ASN1Primitive) aSN1ObjectIdentifier) ? "RIPEMD256" : CryptoProObjectIdentifiers.gostR3411.equals((ASN1Primitive) aSN1ObjectIdentifier) ? "GOST3411" : aSN1ObjectIdentifier.getId();
    }

    public static byte[] getExtensionValue(Extensions extensions, String str) {
        ASN1ObjectIdentifier aSN1ObjectIdentifierTryFromID;
        ASN1OctetString extensionValue;
        if (str == null || (aSN1ObjectIdentifierTryFromID = ASN1ObjectIdentifier.tryFromID(str)) == null || (extensionValue = Extensions.getExtensionValue(extensions, aSN1ObjectIdentifierTryFromID)) == null) {
            return null;
        }
        try {
            return extensionValue.getEncoded();
        } catch (Exception e5) {
            h2.b(s.i(e5, new StringBuilder("error parsing ")));
            return null;
        }
    }

    public static String getSignatureName(AlgorithmIdentifier algorithmIdentifier) {
        StringBuilder sb2;
        String digestAlgName;
        String str;
        ASN1ObjectIdentifier algorithm = algorithmIdentifier.getAlgorithm();
        ASN1Encodable parameters = algorithmIdentifier.getParameters();
        if (!isAbsentOrEmptyParameters(parameters)) {
            if (PKCSObjectIdentifiers.id_RSASSA_PSS.equals((ASN1Primitive) algorithm)) {
                RSASSAPSSparams rSASSAPSSparams = RSASSAPSSparams.getInstance(parameters);
                sb2 = new StringBuilder();
                digestAlgName = getDigestAlgName(rSASSAPSSparams.getHashAlgorithm().getAlgorithm());
                str = "withRSAandMGF1";
            } else if (X9ObjectIdentifiers.ecdsa_with_SHA2.equals((ASN1Primitive) algorithm)) {
                AlgorithmIdentifier algorithmIdentifier2 = AlgorithmIdentifier.getInstance(parameters);
                sb2 = new StringBuilder();
                digestAlgName = getDigestAlgName(algorithmIdentifier2.getAlgorithm());
                str = "withECDSA";
            }
            return k.p(sb2, digestAlgName, str);
        }
        return algorithm.getId();
    }

    private static boolean isAbsentOrEmptyParameters(ASN1Encodable aSN1Encodable) {
        return aSN1Encodable == null || DERNull.INSTANCE.equals(aSN1Encodable);
    }

    public static void setSignatureParameters(Signature signature, ASN1Encodable aSN1Encodable) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        if (isAbsentOrEmptyParameters(aSN1Encodable)) {
            return;
        }
        String algorithm = signature.getAlgorithm();
        AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance(algorithm, signature.getProvider());
        try {
            algorithmParameters.init(aSN1Encodable.toASN1Primitive().getEncoded());
            if (algorithm.endsWith("MGF1")) {
                try {
                    signature.setParameter(algorithmParameters.getParameterSpec(PSSParameterSpec.class));
                } catch (GeneralSecurityException e5) {
                    throw new SignatureException("Exception extracting parameters: " + e5.getMessage());
                }
            }
        } catch (IOException e11) {
            throw new SignatureException(s.g(e11, new StringBuilder("IOException decoding parameters: ")));
        }
    }
}
