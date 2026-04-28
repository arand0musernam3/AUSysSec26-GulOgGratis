package org.bouncycastle.jcajce.provider.asymmetric.compositesignatures;

import com.braze.h2;
import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import m0.i1;
import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.digests.SHA512Digest;
import org.bouncycastle.internal.asn1.misc.MiscObjectIdentifiers;
import org.bouncycastle.jcajce.CompositePrivateKey;
import org.bouncycastle.jcajce.CompositePublicKey;
import org.bouncycastle.jcajce.spec.ContextParameterSpec;
import org.bouncycastle.jcajce.util.BCJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.jce.provider.a;
import org.bouncycastle.util.Exceptions;

/* JADX INFO: loaded from: classes3.dex */
public class SignatureSpi extends java.security.SignatureSpi {
    private static final String ML_DSA_44 = "ML-DSA-44";
    private static final String ML_DSA_65 = "ML-DSA-65";
    private static final String ML_DSA_87 = "ML-DSA-87";
    private static final Map<String, String> canonicalNames;
    private final ASN1ObjectIdentifier algorithm;
    private final Signature[] componentSignatures;
    private Key compositeKey;
    private ContextParameterSpec contextSpec;
    private final byte[] domain;
    private AlgorithmParameters engineParams;
    private final byte[] hashOID;
    private final JcaJceHelper helper;
    private final Digest preHashDigest;
    private boolean unprimed;

    public static final class HashMLDSA44_ECDSA_P256_SHA256 extends SignatureSpi {
        public HashMLDSA44_ECDSA_P256_SHA256() {
            super(MiscObjectIdentifiers.id_HashMLDSA44_ECDSA_P256_SHA256, new SHA256Digest(), NISTObjectIdentifiers.id_sha256);
        }
    }

    public static final class HashMLDSA44_Ed25519_SHA512 extends SignatureSpi {
        public HashMLDSA44_Ed25519_SHA512() {
            super(MiscObjectIdentifiers.id_HashMLDSA44_Ed25519_SHA512, new SHA512Digest(), NISTObjectIdentifiers.id_sha512);
        }
    }

    public static final class HashMLDSA44_RSA2048_PKCS15_SHA256 extends SignatureSpi {
        public HashMLDSA44_RSA2048_PKCS15_SHA256() {
            super(MiscObjectIdentifiers.id_HashMLDSA44_RSA2048_PKCS15_SHA256, new SHA256Digest(), NISTObjectIdentifiers.id_sha256);
        }
    }

    public static final class HashMLDSA44_RSA2048_PSS_SHA256 extends SignatureSpi {
        public HashMLDSA44_RSA2048_PSS_SHA256() {
            super(MiscObjectIdentifiers.id_HashMLDSA44_RSA2048_PSS_SHA256, new SHA256Digest(), NISTObjectIdentifiers.id_sha256);
        }
    }

    public static final class HashMLDSA65_ECDSA_P384_SHA512 extends SignatureSpi {
        public HashMLDSA65_ECDSA_P384_SHA512() {
            super(MiscObjectIdentifiers.id_HashMLDSA65_ECDSA_P384_SHA512, new SHA512Digest(), NISTObjectIdentifiers.id_sha512);
        }
    }

    public static final class HashMLDSA65_ECDSA_brainpoolP256r1_SHA512 extends SignatureSpi {
        public HashMLDSA65_ECDSA_brainpoolP256r1_SHA512() {
            super(MiscObjectIdentifiers.id_HashMLDSA65_ECDSA_brainpoolP256r1_SHA512, new SHA512Digest(), NISTObjectIdentifiers.id_sha512);
        }
    }

    public static final class HashMLDSA65_Ed25519_SHA512 extends SignatureSpi {
        public HashMLDSA65_Ed25519_SHA512() {
            super(MiscObjectIdentifiers.id_HashMLDSA65_Ed25519_SHA512, new SHA512Digest(), NISTObjectIdentifiers.id_sha512);
        }
    }

    public static final class HashMLDSA65_RSA3072_PKCS15_SHA512 extends SignatureSpi {
        public HashMLDSA65_RSA3072_PKCS15_SHA512() {
            super(MiscObjectIdentifiers.id_HashMLDSA65_RSA3072_PKCS15_SHA512, new SHA512Digest(), NISTObjectIdentifiers.id_sha512);
        }
    }

    public static final class HashMLDSA65_RSA3072_PSS_SHA512 extends SignatureSpi {
        public HashMLDSA65_RSA3072_PSS_SHA512() {
            super(MiscObjectIdentifiers.id_HashMLDSA65_RSA3072_PSS_SHA512, new SHA512Digest(), NISTObjectIdentifiers.id_sha512);
        }
    }

    public static final class HashMLDSA65_RSA4096_PKCS15_SHA512 extends SignatureSpi {
        public HashMLDSA65_RSA4096_PKCS15_SHA512() {
            super(MiscObjectIdentifiers.id_HashMLDSA65_RSA4096_PKCS15_SHA512, new SHA512Digest(), NISTObjectIdentifiers.id_sha512);
        }
    }

    public static final class HashMLDSA65_RSA4096_PSS_SHA512 extends SignatureSpi {
        public HashMLDSA65_RSA4096_PSS_SHA512() {
            super(MiscObjectIdentifiers.id_HashMLDSA65_RSA4096_PSS_SHA512, new SHA512Digest(), NISTObjectIdentifiers.id_sha512);
        }
    }

    public static final class HashMLDSA87_ECDSA_P384_SHA512 extends SignatureSpi {
        public HashMLDSA87_ECDSA_P384_SHA512() {
            super(MiscObjectIdentifiers.id_HashMLDSA87_ECDSA_P384_SHA512, new SHA512Digest(), NISTObjectIdentifiers.id_sha512);
        }
    }

    public static final class HashMLDSA87_ECDSA_brainpoolP384r1_SHA512 extends SignatureSpi {
        public HashMLDSA87_ECDSA_brainpoolP384r1_SHA512() {
            super(MiscObjectIdentifiers.id_HashMLDSA87_ECDSA_brainpoolP384r1_SHA512, new SHA512Digest(), NISTObjectIdentifiers.id_sha512);
        }
    }

    public static final class HashMLDSA87_Ed448_SHA512 extends SignatureSpi {
        public HashMLDSA87_Ed448_SHA512() {
            super(MiscObjectIdentifiers.id_HashMLDSA87_Ed448_SHA512, new SHA512Digest(), NISTObjectIdentifiers.id_sha512);
        }
    }

    public static final class MLDSA44_ECDSA_P256_SHA256 extends SignatureSpi {
        public MLDSA44_ECDSA_P256_SHA256() {
            super(MiscObjectIdentifiers.id_MLDSA44_ECDSA_P256_SHA256);
        }
    }

    public static final class MLDSA44_Ed25519_SHA512 extends SignatureSpi {
        public MLDSA44_Ed25519_SHA512() {
            super(MiscObjectIdentifiers.id_MLDSA44_Ed25519_SHA512);
        }
    }

    public static final class MLDSA44_RSA2048_PKCS15_SHA256 extends SignatureSpi {
        public MLDSA44_RSA2048_PKCS15_SHA256() {
            super(MiscObjectIdentifiers.id_MLDSA44_RSA2048_PKCS15_SHA256);
        }
    }

    public static final class MLDSA44_RSA2048_PSS_SHA256 extends SignatureSpi {
        public MLDSA44_RSA2048_PSS_SHA256() {
            super(MiscObjectIdentifiers.id_MLDSA44_RSA2048_PSS_SHA256);
        }
    }

    public static final class MLDSA65_ECDSA_P384_SHA384 extends SignatureSpi {
        public MLDSA65_ECDSA_P384_SHA384() {
            super(MiscObjectIdentifiers.id_MLDSA65_ECDSA_P384_SHA384);
        }
    }

    public static final class MLDSA65_ECDSA_brainpoolP256r1_SHA256 extends SignatureSpi {
        public MLDSA65_ECDSA_brainpoolP256r1_SHA256() {
            super(MiscObjectIdentifiers.id_MLDSA65_ECDSA_brainpoolP256r1_SHA256);
        }
    }

    public static final class MLDSA65_Ed25519_SHA512 extends SignatureSpi {
        public MLDSA65_Ed25519_SHA512() {
            super(MiscObjectIdentifiers.id_MLDSA65_Ed25519_SHA512);
        }
    }

    public static final class MLDSA65_RSA3072_PKCS15_SHA256 extends SignatureSpi {
        public MLDSA65_RSA3072_PKCS15_SHA256() {
            super(MiscObjectIdentifiers.id_MLDSA65_RSA3072_PKCS15_SHA256);
        }
    }

    public static final class MLDSA65_RSA3072_PSS_SHA256 extends SignatureSpi {
        public MLDSA65_RSA3072_PSS_SHA256() {
            super(MiscObjectIdentifiers.id_MLDSA65_RSA3072_PSS_SHA256);
        }
    }

    public static final class MLDSA65_RSA4096_PKCS15_SHA384 extends SignatureSpi {
        public MLDSA65_RSA4096_PKCS15_SHA384() {
            super(MiscObjectIdentifiers.id_MLDSA65_RSA4096_PKCS15_SHA384);
        }
    }

    public static final class MLDSA65_RSA4096_PSS_SHA384 extends SignatureSpi {
        public MLDSA65_RSA4096_PSS_SHA384() {
            super(MiscObjectIdentifiers.id_MLDSA65_RSA4096_PSS_SHA384);
        }
    }

    public static final class MLDSA87_ECDSA_P384_SHA384 extends SignatureSpi {
        public MLDSA87_ECDSA_P384_SHA384() {
            super(MiscObjectIdentifiers.id_MLDSA87_ECDSA_P384_SHA384);
        }
    }

    public static final class MLDSA87_ECDSA_brainpoolP384r1_SHA384 extends SignatureSpi {
        public MLDSA87_ECDSA_brainpoolP384r1_SHA384() {
            super(MiscObjectIdentifiers.id_MLDSA87_ECDSA_brainpoolP384r1_SHA384);
        }
    }

    public static final class MLDSA87_Ed448_SHA512 extends SignatureSpi {
        public MLDSA87_Ed448_SHA512() {
            super(MiscObjectIdentifiers.id_MLDSA87_Ed448_SHA512);
        }
    }

    static {
        HashMap map = new HashMap();
        canonicalNames = map;
        map.put("MLDSA44", ML_DSA_44);
        map.put("MLDSA65", ML_DSA_65);
        map.put("MLDSA87", ML_DSA_87);
        map.put(NISTObjectIdentifiers.id_ml_dsa_44.getId(), ML_DSA_44);
        map.put(NISTObjectIdentifiers.id_ml_dsa_65.getId(), ML_DSA_65);
        map.put(NISTObjectIdentifiers.id_ml_dsa_87.getId(), ML_DSA_87);
    }

    public SignatureSpi(ASN1ObjectIdentifier aSN1ObjectIdentifier, Digest digest, ASN1ObjectIdentifier aSN1ObjectIdentifier2) {
        this.helper = new BCJcaJceHelper();
        this.engineParams = null;
        this.unprimed = true;
        this.algorithm = aSN1ObjectIdentifier;
        this.preHashDigest = digest;
        String[] pairing = CompositeIndex.getPairing(aSN1ObjectIdentifier);
        if (digest != null) {
            try {
                this.hashOID = aSN1ObjectIdentifier2.getEncoded();
            } catch (IOException unused) {
                h2.b("unable to encode domain value");
                throw null;
            }
        } else {
            this.hashOID = null;
        }
        try {
            this.domain = aSN1ObjectIdentifier.getEncoded();
            this.componentSignatures = new Signature[pairing.length];
            int i11 = 0;
            while (true) {
                try {
                    Signature[] signatureArr = this.componentSignatures;
                    if (i11 == signatureArr.length) {
                        return;
                    }
                    signatureArr[i11] = Signature.getInstance(pairing[i11], BouncyCastleProvider.PROVIDER_NAME);
                    i11++;
                } catch (GeneralSecurityException e5) {
                    throw Exceptions.illegalStateException(e5.getMessage(), e5);
                }
            }
        } catch (IOException unused2) {
            h2.b("unable to encode domain value");
            throw null;
        }
    }

    private void baseSigInit() throws SignatureException {
        try {
            this.componentSignatures[0].setParameter(new ContextParameterSpec(this.domain));
            if (this.preHashDigest == null) {
                int i11 = 0;
                while (true) {
                    Signature[] signatureArr = this.componentSignatures;
                    if (i11 >= signatureArr.length) {
                        break;
                    }
                    Signature signature = signatureArr[i11];
                    signature.update(this.domain);
                    ContextParameterSpec contextParameterSpec = this.contextSpec;
                    if (contextParameterSpec == null) {
                        signature.update((byte) 0);
                    } else {
                        byte[] context = contextParameterSpec.getContext();
                        signature.update((byte) context.length);
                        signature.update(context);
                    }
                    i11++;
                }
            }
            this.unprimed = false;
        } catch (InvalidAlgorithmParameterException unused) {
            h2.b("unable to set context on ML-DSA");
        }
    }

    private String getCanonicalName(String str) {
        String str2 = canonicalNames.get(str);
        return str2 != null ? str2 : str;
    }

    private void processPreHashedMessage() throws SignatureException {
        int digestSize = this.preHashDigest.getDigestSize();
        byte[] bArr = new byte[digestSize];
        this.preHashDigest.doFinal(bArr, 0);
        int i11 = 0;
        while (true) {
            Signature[] signatureArr = this.componentSignatures;
            if (i11 >= signatureArr.length) {
                return;
            }
            Signature signature = signatureArr[i11];
            byte[] bArr2 = this.domain;
            signature.update(bArr2, 0, bArr2.length);
            ContextParameterSpec contextParameterSpec = this.contextSpec;
            if (contextParameterSpec == null) {
                signature.update((byte) 0);
            } else {
                byte[] context = contextParameterSpec.getContext();
                signature.update((byte) context.length);
                signature.update(context);
            }
            byte[] bArr3 = this.hashOID;
            signature.update(bArr3, 0, bArr3.length);
            signature.update(bArr, 0, digestSize);
            i11++;
        }
    }

    private void setSigParameter(Signature signature, String str, List<String> list, List<AlgorithmParameterSpec> list2) throws InvalidAlgorithmParameterException {
        for (int i11 = 0; i11 != list.size(); i11++) {
            getCanonicalName(list.get(i11));
            if (list.get(i11).equals(str)) {
                signature.setParameter(list2.get(i11));
            }
        }
    }

    private void sigInitSign() throws InvalidKeyException {
        CompositePrivateKey compositePrivateKey = (CompositePrivateKey) this.compositeKey;
        int i11 = 0;
        while (true) {
            Signature[] signatureArr = this.componentSignatures;
            if (i11 >= signatureArr.length) {
                this.unprimed = true;
                return;
            } else {
                signatureArr[i11].initSign(compositePrivateKey.getPrivateKeys().get(i11));
                i11++;
            }
        }
    }

    private void sigInitVerify() throws InvalidKeyException {
        CompositePublicKey compositePublicKey = (CompositePublicKey) this.compositeKey;
        int i11 = 0;
        while (true) {
            Signature[] signatureArr = this.componentSignatures;
            if (i11 >= signatureArr.length) {
                this.unprimed = true;
                return;
            } else {
                signatureArr[i11].initVerify(compositePublicKey.getPublicKeys().get(i11));
                i11++;
            }
        }
    }

    @Override // java.security.SignatureSpi
    public Object engineGetParameter(String str) throws InvalidParameterException {
        throw new UnsupportedOperationException("engineGetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    public final AlgorithmParameters engineGetParameters() {
        if (this.engineParams == null && this.contextSpec != null) {
            try {
                AlgorithmParameters algorithmParametersCreateAlgorithmParameters = this.helper.createAlgorithmParameters("CONTEXT");
                this.engineParams = algorithmParametersCreateAlgorithmParameters;
                algorithmParametersCreateAlgorithmParameters.init(this.contextSpec);
            } catch (Exception e5) {
                throw Exceptions.illegalStateException(e5.toString(), e5);
            }
        }
        return this.engineParams;
    }

    @Override // java.security.SignatureSpi
    public void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
        String str;
        if (privateKey instanceof CompositePrivateKey) {
            this.compositeKey = privateKey;
            if (((CompositePrivateKey) privateKey).getAlgorithmIdentifier().equals((ASN1Primitive) this.algorithm)) {
                sigInitSign();
                return;
            }
            str = "Provided composite private key cannot be used with the composite signature algorithm.";
        } else {
            str = "Private key is not composite.";
        }
        a.i(str);
    }

    @Override // java.security.SignatureSpi
    public void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
        String str;
        if (publicKey instanceof CompositePublicKey) {
            this.compositeKey = publicKey;
            if (((CompositePublicKey) publicKey).getAlgorithmIdentifier().equals((ASN1Primitive) this.algorithm)) {
                sigInitVerify();
                return;
            }
            str = "Provided composite public key cannot be used with the composite signature algorithm.";
        } else {
            str = "Public key is not composite.";
        }
        a.i(str);
    }

    @Override // java.security.SignatureSpi
    public void engineSetParameter(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
        String str;
        if (!this.unprimed) {
            str = "attempt to set parameter after update";
        } else {
            if (algorithmParameterSpec instanceof ContextParameterSpec) {
                this.contextSpec = (ContextParameterSpec) algorithmParameterSpec;
                try {
                    if (this.compositeKey instanceof PublicKey) {
                        sigInitVerify();
                        return;
                    } else {
                        sigInitSign();
                        return;
                    }
                } catch (InvalidKeyException e5) {
                    throw new InvalidAlgorithmParameterException("keys invalid on reset: " + e5.getMessage(), e5);
                }
            }
            str = "unknown parameterSpec passed to composite signature";
        }
        i1.v(str);
    }

    @Override // java.security.SignatureSpi
    public byte[] engineSign() throws SignatureException {
        if (this.preHashDigest != null) {
            processPreHashedMessage();
        }
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        int i11 = 0;
        while (true) {
            try {
                Signature[] signatureArr = this.componentSignatures;
                if (i11 >= signatureArr.length) {
                    return new DERSequence(aSN1EncodableVector).getEncoded(ASN1Encoding.DER);
                }
                aSN1EncodableVector.add(new DERBitString(signatureArr[i11].sign()));
                i11++;
            } catch (IOException e5) {
                throw new SignatureException(e5.getMessage());
            }
        }
    }

    @Override // java.security.SignatureSpi
    public void engineUpdate(byte b8) throws SignatureException {
        if (this.unprimed) {
            baseSigInit();
        }
        Digest digest = this.preHashDigest;
        if (digest != null) {
            digest.update(b8);
            return;
        }
        int i11 = 0;
        while (true) {
            Signature[] signatureArr = this.componentSignatures;
            if (i11 >= signatureArr.length) {
                return;
            }
            signatureArr[i11].update(b8);
            i11++;
        }
    }

    @Override // java.security.SignatureSpi
    public boolean engineVerify(byte[] bArr) throws SignatureException {
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(bArr);
        int i11 = 0;
        if (aSN1Sequence.size() != this.componentSignatures.length) {
            return false;
        }
        Digest digest = this.preHashDigest;
        if (digest != null && digest != null) {
            processPreHashedMessage();
        }
        boolean z11 = false;
        while (true) {
            Signature[] signatureArr = this.componentSignatures;
            if (i11 >= signatureArr.length) {
                return !z11;
            }
            if (!signatureArr[i11].verify(ASN1BitString.getInstance(aSN1Sequence.getObjectAt(i11)).getOctets())) {
                z11 = true;
            }
            i11++;
        }
    }

    @Override // java.security.SignatureSpi
    public void engineUpdate(byte[] bArr, int i11, int i12) throws SignatureException {
        if (this.unprimed) {
            baseSigInit();
        }
        Digest digest = this.preHashDigest;
        if (digest != null) {
            digest.update(bArr, i11, i12);
            return;
        }
        int i13 = 0;
        while (true) {
            Signature[] signatureArr = this.componentSignatures;
            if (i13 >= signatureArr.length) {
                return;
            }
            signatureArr[i13].update(bArr, i11, i12);
            i13++;
        }
    }

    @Override // java.security.SignatureSpi
    public void engineSetParameter(String str, Object obj) throws InvalidParameterException {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    public SignatureSpi(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this(aSN1ObjectIdentifier, null, null);
    }
}
