package org.bouncycastle.jcajce.provider.asymmetric.compositesignatures;

import i4.a;
import j4.s;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.bc.BCObjectIdentifiers;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.sec.SECObjectIdentifiers;
import org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x9.X962Parameters;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.internal.asn1.edec.EdECObjectIdentifiers;
import org.bouncycastle.internal.asn1.misc.MiscObjectIdentifiers;
import org.bouncycastle.jcajce.CompositePrivateKey;
import org.bouncycastle.jcajce.CompositePublicKey;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi;
import org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter;
import org.bouncycastle.jcajce.util.BCJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Exceptions;
import r8.k;

/* JADX INFO: loaded from: classes3.dex */
public class KeyFactorySpi extends BaseKeyFactorySpi implements AsymmetricKeyInfoConverter {
    private static Map<ASN1ObjectIdentifier, int[]> componentKeySizes;
    private static final AlgorithmIdentifier ecDsaBrainpoolP256r1;
    private static final AlgorithmIdentifier ecDsaBrainpoolP384r1;
    private static final AlgorithmIdentifier ecDsaP256;
    private static final AlgorithmIdentifier ecDsaP384;
    private static final AlgorithmIdentifier ed25519;
    private static final AlgorithmIdentifier ed448;
    private static final AlgorithmIdentifier falcon512Identifier;
    private static final AlgorithmIdentifier mlDsa44;
    private static final AlgorithmIdentifier mlDsa65;
    private static final AlgorithmIdentifier mlDsa87;
    private static Map<ASN1ObjectIdentifier, AlgorithmIdentifier[]> pairings;
    private static final AlgorithmIdentifier rsa;
    private JcaJceHelper helper;

    static {
        AlgorithmIdentifier algorithmIdentifier = new AlgorithmIdentifier(NISTObjectIdentifiers.id_ml_dsa_44);
        mlDsa44 = algorithmIdentifier;
        AlgorithmIdentifier algorithmIdentifier2 = new AlgorithmIdentifier(NISTObjectIdentifiers.id_ml_dsa_65);
        mlDsa65 = algorithmIdentifier2;
        AlgorithmIdentifier algorithmIdentifier3 = new AlgorithmIdentifier(NISTObjectIdentifiers.id_ml_dsa_87);
        mlDsa87 = algorithmIdentifier3;
        falcon512Identifier = new AlgorithmIdentifier(BCObjectIdentifiers.falcon_512);
        AlgorithmIdentifier algorithmIdentifier4 = new AlgorithmIdentifier(EdECObjectIdentifiers.id_Ed25519);
        ed25519 = algorithmIdentifier4;
        ASN1ObjectIdentifier aSN1ObjectIdentifier = X9ObjectIdentifiers.id_ecPublicKey;
        AlgorithmIdentifier algorithmIdentifier5 = new AlgorithmIdentifier(aSN1ObjectIdentifier, new X962Parameters(SECObjectIdentifiers.secp256r1));
        ecDsaP256 = algorithmIdentifier5;
        AlgorithmIdentifier algorithmIdentifier6 = new AlgorithmIdentifier(aSN1ObjectIdentifier, new X962Parameters(TeleTrusTObjectIdentifiers.brainpoolP256r1));
        ecDsaBrainpoolP256r1 = algorithmIdentifier6;
        AlgorithmIdentifier algorithmIdentifier7 = new AlgorithmIdentifier(PKCSObjectIdentifiers.rsaEncryption);
        rsa = algorithmIdentifier7;
        AlgorithmIdentifier algorithmIdentifier8 = new AlgorithmIdentifier(EdECObjectIdentifiers.id_Ed448);
        ed448 = algorithmIdentifier8;
        AlgorithmIdentifier algorithmIdentifier9 = new AlgorithmIdentifier(aSN1ObjectIdentifier, new X962Parameters(SECObjectIdentifiers.secp384r1));
        ecDsaP384 = algorithmIdentifier9;
        AlgorithmIdentifier algorithmIdentifier10 = new AlgorithmIdentifier(aSN1ObjectIdentifier, new X962Parameters(TeleTrusTObjectIdentifiers.brainpoolP384r1));
        ecDsaBrainpoolP384r1 = algorithmIdentifier10;
        pairings = new HashMap();
        componentKeySizes = new HashMap();
        Map<ASN1ObjectIdentifier, AlgorithmIdentifier[]> map = pairings;
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = MiscObjectIdentifiers.id_MLDSA44_RSA2048_PSS_SHA256;
        map.put(aSN1ObjectIdentifier2, new AlgorithmIdentifier[]{algorithmIdentifier, algorithmIdentifier7});
        Map<ASN1ObjectIdentifier, AlgorithmIdentifier[]> map2 = pairings;
        ASN1ObjectIdentifier aSN1ObjectIdentifier3 = MiscObjectIdentifiers.id_MLDSA44_RSA2048_PKCS15_SHA256;
        map2.put(aSN1ObjectIdentifier3, new AlgorithmIdentifier[]{algorithmIdentifier, algorithmIdentifier7});
        Map<ASN1ObjectIdentifier, AlgorithmIdentifier[]> map3 = pairings;
        ASN1ObjectIdentifier aSN1ObjectIdentifier4 = MiscObjectIdentifiers.id_MLDSA44_Ed25519_SHA512;
        map3.put(aSN1ObjectIdentifier4, new AlgorithmIdentifier[]{algorithmIdentifier, algorithmIdentifier4});
        Map<ASN1ObjectIdentifier, AlgorithmIdentifier[]> map4 = pairings;
        ASN1ObjectIdentifier aSN1ObjectIdentifier5 = MiscObjectIdentifiers.id_MLDSA44_ECDSA_P256_SHA256;
        map4.put(aSN1ObjectIdentifier5, new AlgorithmIdentifier[]{algorithmIdentifier, algorithmIdentifier5});
        Map<ASN1ObjectIdentifier, AlgorithmIdentifier[]> map5 = pairings;
        ASN1ObjectIdentifier aSN1ObjectIdentifier6 = MiscObjectIdentifiers.id_MLDSA65_RSA3072_PSS_SHA256;
        map5.put(aSN1ObjectIdentifier6, new AlgorithmIdentifier[]{algorithmIdentifier2, algorithmIdentifier7});
        Map<ASN1ObjectIdentifier, AlgorithmIdentifier[]> map6 = pairings;
        ASN1ObjectIdentifier aSN1ObjectIdentifier7 = MiscObjectIdentifiers.id_MLDSA65_RSA3072_PKCS15_SHA256;
        map6.put(aSN1ObjectIdentifier7, new AlgorithmIdentifier[]{algorithmIdentifier2, algorithmIdentifier7});
        Map<ASN1ObjectIdentifier, AlgorithmIdentifier[]> map7 = pairings;
        ASN1ObjectIdentifier aSN1ObjectIdentifier8 = MiscObjectIdentifiers.id_MLDSA65_RSA4096_PSS_SHA384;
        map7.put(aSN1ObjectIdentifier8, new AlgorithmIdentifier[]{algorithmIdentifier2, algorithmIdentifier7});
        Map<ASN1ObjectIdentifier, AlgorithmIdentifier[]> map8 = pairings;
        ASN1ObjectIdentifier aSN1ObjectIdentifier9 = MiscObjectIdentifiers.id_MLDSA65_RSA4096_PKCS15_SHA384;
        map8.put(aSN1ObjectIdentifier9, new AlgorithmIdentifier[]{algorithmIdentifier2, algorithmIdentifier7});
        Map<ASN1ObjectIdentifier, AlgorithmIdentifier[]> map9 = pairings;
        ASN1ObjectIdentifier aSN1ObjectIdentifier10 = MiscObjectIdentifiers.id_MLDSA65_ECDSA_P384_SHA384;
        map9.put(aSN1ObjectIdentifier10, new AlgorithmIdentifier[]{algorithmIdentifier2, algorithmIdentifier9});
        Map<ASN1ObjectIdentifier, AlgorithmIdentifier[]> map10 = pairings;
        ASN1ObjectIdentifier aSN1ObjectIdentifier11 = MiscObjectIdentifiers.id_MLDSA65_ECDSA_brainpoolP256r1_SHA256;
        map10.put(aSN1ObjectIdentifier11, new AlgorithmIdentifier[]{algorithmIdentifier2, algorithmIdentifier6});
        Map<ASN1ObjectIdentifier, AlgorithmIdentifier[]> map11 = pairings;
        ASN1ObjectIdentifier aSN1ObjectIdentifier12 = MiscObjectIdentifiers.id_MLDSA65_Ed25519_SHA512;
        map11.put(aSN1ObjectIdentifier12, new AlgorithmIdentifier[]{algorithmIdentifier2, algorithmIdentifier4});
        Map<ASN1ObjectIdentifier, AlgorithmIdentifier[]> map12 = pairings;
        ASN1ObjectIdentifier aSN1ObjectIdentifier13 = MiscObjectIdentifiers.id_MLDSA87_ECDSA_P384_SHA384;
        map12.put(aSN1ObjectIdentifier13, new AlgorithmIdentifier[]{algorithmIdentifier3, algorithmIdentifier9});
        Map<ASN1ObjectIdentifier, AlgorithmIdentifier[]> map13 = pairings;
        ASN1ObjectIdentifier aSN1ObjectIdentifier14 = MiscObjectIdentifiers.id_MLDSA87_ECDSA_brainpoolP384r1_SHA384;
        map13.put(aSN1ObjectIdentifier14, new AlgorithmIdentifier[]{algorithmIdentifier3, algorithmIdentifier10});
        Map<ASN1ObjectIdentifier, AlgorithmIdentifier[]> map14 = pairings;
        ASN1ObjectIdentifier aSN1ObjectIdentifier15 = MiscObjectIdentifiers.id_MLDSA87_Ed448_SHA512;
        map14.put(aSN1ObjectIdentifier15, new AlgorithmIdentifier[]{algorithmIdentifier3, algorithmIdentifier8});
        Map<ASN1ObjectIdentifier, AlgorithmIdentifier[]> map15 = pairings;
        ASN1ObjectIdentifier aSN1ObjectIdentifier16 = MiscObjectIdentifiers.id_HashMLDSA44_RSA2048_PSS_SHA256;
        map15.put(aSN1ObjectIdentifier16, new AlgorithmIdentifier[]{algorithmIdentifier, algorithmIdentifier7});
        Map<ASN1ObjectIdentifier, AlgorithmIdentifier[]> map16 = pairings;
        ASN1ObjectIdentifier aSN1ObjectIdentifier17 = MiscObjectIdentifiers.id_HashMLDSA44_RSA2048_PKCS15_SHA256;
        map16.put(aSN1ObjectIdentifier17, new AlgorithmIdentifier[]{algorithmIdentifier, algorithmIdentifier7});
        Map<ASN1ObjectIdentifier, AlgorithmIdentifier[]> map17 = pairings;
        ASN1ObjectIdentifier aSN1ObjectIdentifier18 = MiscObjectIdentifiers.id_HashMLDSA44_Ed25519_SHA512;
        map17.put(aSN1ObjectIdentifier18, new AlgorithmIdentifier[]{algorithmIdentifier, algorithmIdentifier4});
        Map<ASN1ObjectIdentifier, AlgorithmIdentifier[]> map18 = pairings;
        ASN1ObjectIdentifier aSN1ObjectIdentifier19 = MiscObjectIdentifiers.id_HashMLDSA44_ECDSA_P256_SHA256;
        map18.put(aSN1ObjectIdentifier19, new AlgorithmIdentifier[]{algorithmIdentifier, algorithmIdentifier5});
        Map<ASN1ObjectIdentifier, AlgorithmIdentifier[]> map19 = pairings;
        ASN1ObjectIdentifier aSN1ObjectIdentifier20 = MiscObjectIdentifiers.id_HashMLDSA65_RSA3072_PSS_SHA512;
        map19.put(aSN1ObjectIdentifier20, new AlgorithmIdentifier[]{algorithmIdentifier2, algorithmIdentifier7});
        Map<ASN1ObjectIdentifier, AlgorithmIdentifier[]> map20 = pairings;
        ASN1ObjectIdentifier aSN1ObjectIdentifier21 = MiscObjectIdentifiers.id_HashMLDSA65_RSA3072_PKCS15_SHA512;
        map20.put(aSN1ObjectIdentifier21, new AlgorithmIdentifier[]{algorithmIdentifier2, algorithmIdentifier7});
        Map<ASN1ObjectIdentifier, AlgorithmIdentifier[]> map21 = pairings;
        ASN1ObjectIdentifier aSN1ObjectIdentifier22 = MiscObjectIdentifiers.id_HashMLDSA65_RSA4096_PSS_SHA512;
        map21.put(aSN1ObjectIdentifier22, new AlgorithmIdentifier[]{algorithmIdentifier2, algorithmIdentifier7});
        Map<ASN1ObjectIdentifier, AlgorithmIdentifier[]> map22 = pairings;
        ASN1ObjectIdentifier aSN1ObjectIdentifier23 = MiscObjectIdentifiers.id_HashMLDSA65_RSA4096_PKCS15_SHA512;
        map22.put(aSN1ObjectIdentifier23, new AlgorithmIdentifier[]{algorithmIdentifier2, algorithmIdentifier7});
        Map<ASN1ObjectIdentifier, AlgorithmIdentifier[]> map23 = pairings;
        ASN1ObjectIdentifier aSN1ObjectIdentifier24 = MiscObjectIdentifiers.id_HashMLDSA65_ECDSA_P384_SHA512;
        map23.put(aSN1ObjectIdentifier24, new AlgorithmIdentifier[]{algorithmIdentifier2, algorithmIdentifier9});
        Map<ASN1ObjectIdentifier, AlgorithmIdentifier[]> map24 = pairings;
        ASN1ObjectIdentifier aSN1ObjectIdentifier25 = MiscObjectIdentifiers.id_HashMLDSA65_ECDSA_brainpoolP256r1_SHA512;
        map24.put(aSN1ObjectIdentifier25, new AlgorithmIdentifier[]{algorithmIdentifier2, algorithmIdentifier6});
        Map<ASN1ObjectIdentifier, AlgorithmIdentifier[]> map25 = pairings;
        ASN1ObjectIdentifier aSN1ObjectIdentifier26 = MiscObjectIdentifiers.id_HashMLDSA65_Ed25519_SHA512;
        map25.put(aSN1ObjectIdentifier26, new AlgorithmIdentifier[]{algorithmIdentifier2, algorithmIdentifier4});
        Map<ASN1ObjectIdentifier, AlgorithmIdentifier[]> map26 = pairings;
        ASN1ObjectIdentifier aSN1ObjectIdentifier27 = MiscObjectIdentifiers.id_HashMLDSA87_ECDSA_P384_SHA512;
        map26.put(aSN1ObjectIdentifier27, new AlgorithmIdentifier[]{algorithmIdentifier3, algorithmIdentifier9});
        Map<ASN1ObjectIdentifier, AlgorithmIdentifier[]> map27 = pairings;
        ASN1ObjectIdentifier aSN1ObjectIdentifier28 = MiscObjectIdentifiers.id_HashMLDSA87_ECDSA_brainpoolP384r1_SHA512;
        map27.put(aSN1ObjectIdentifier28, new AlgorithmIdentifier[]{algorithmIdentifier3, algorithmIdentifier10});
        Map<ASN1ObjectIdentifier, AlgorithmIdentifier[]> map28 = pairings;
        ASN1ObjectIdentifier aSN1ObjectIdentifier29 = MiscObjectIdentifiers.id_HashMLDSA87_Ed448_SHA512;
        map28.put(aSN1ObjectIdentifier29, new AlgorithmIdentifier[]{algorithmIdentifier3, algorithmIdentifier8});
        componentKeySizes.put(aSN1ObjectIdentifier2, new int[]{1328, 268});
        componentKeySizes.put(aSN1ObjectIdentifier3, new int[]{1312, 284});
        componentKeySizes.put(aSN1ObjectIdentifier4, new int[]{1312, 32});
        componentKeySizes.put(aSN1ObjectIdentifier5, new int[]{1312, 76});
        componentKeySizes.put(aSN1ObjectIdentifier6, new int[]{1952, 256});
        componentKeySizes.put(aSN1ObjectIdentifier7, new int[]{1952, 256});
        componentKeySizes.put(aSN1ObjectIdentifier8, new int[]{1952, 542});
        componentKeySizes.put(aSN1ObjectIdentifier9, new int[]{1952, 542});
        componentKeySizes.put(aSN1ObjectIdentifier10, new int[]{1952, 87});
        componentKeySizes.put(aSN1ObjectIdentifier11, new int[]{1952, 76});
        componentKeySizes.put(aSN1ObjectIdentifier12, new int[]{1952, 32});
        componentKeySizes.put(aSN1ObjectIdentifier13, new int[]{2592, 87});
        componentKeySizes.put(aSN1ObjectIdentifier14, new int[]{2592, 87});
        componentKeySizes.put(aSN1ObjectIdentifier15, new int[]{2592, 57});
        componentKeySizes.put(aSN1ObjectIdentifier16, new int[]{1328, 268});
        componentKeySizes.put(aSN1ObjectIdentifier17, new int[]{1312, 284});
        componentKeySizes.put(aSN1ObjectIdentifier18, new int[]{1312, 32});
        componentKeySizes.put(aSN1ObjectIdentifier19, new int[]{1312, 76});
        componentKeySizes.put(aSN1ObjectIdentifier20, new int[]{1952, 256});
        componentKeySizes.put(aSN1ObjectIdentifier21, new int[]{1952, 256});
        componentKeySizes.put(aSN1ObjectIdentifier22, new int[]{1952, 542});
        componentKeySizes.put(aSN1ObjectIdentifier23, new int[]{1952, 542});
        componentKeySizes.put(aSN1ObjectIdentifier24, new int[]{1952, 87});
        componentKeySizes.put(aSN1ObjectIdentifier25, new int[]{1952, 76});
        componentKeySizes.put(aSN1ObjectIdentifier26, new int[]{1952, 32});
        componentKeySizes.put(aSN1ObjectIdentifier27, new int[]{2592, 87});
        componentKeySizes.put(aSN1ObjectIdentifier28, new int[]{2592, 87});
        componentKeySizes.put(aSN1ObjectIdentifier29, new int[]{2592, 57});
    }

    public KeyFactorySpi(JcaJceHelper jcaJceHelper) {
        this.helper = jcaJceHelper;
    }

    private List<KeyFactory> getKeyFactoriesFromIdentifier(ASN1ObjectIdentifier aSN1ObjectIdentifier) throws NoSuchAlgorithmException, NoSuchProviderException {
        ArrayList arrayList = new ArrayList();
        new ArrayList();
        String[] pairing = CompositeIndex.getPairing(aSN1ObjectIdentifier);
        if (pairing == null) {
            throw new NoSuchAlgorithmException("Cannot create KeyFactories. Unsupported algorithm identifier.");
        }
        arrayList.add(this.helper.createKeyFactory(CompositeIndex.getBaseName(pairing[0])));
        arrayList.add(this.helper.createKeyFactory(CompositeIndex.getBaseName(pairing[1])));
        return Collections.unmodifiableList(arrayList);
    }

    private X509EncodedKeySpec[] getKeysSpecs(ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1BitString[] aSN1BitStringArr) throws IOException {
        X509EncodedKeySpec[] x509EncodedKeySpecArr = new X509EncodedKeySpec[aSN1BitStringArr.length];
        SubjectPublicKeyInfo[] subjectPublicKeyInfoArr = new SubjectPublicKeyInfo[aSN1BitStringArr.length];
        AlgorithmIdentifier[] algorithmIdentifierArr = pairings.get(aSN1ObjectIdentifier);
        if (algorithmIdentifierArr == null) {
            a.k("Cannot create key specs. Unsupported algorithm identifier.");
            return null;
        }
        subjectPublicKeyInfoArr[0] = new SubjectPublicKeyInfo(algorithmIdentifierArr[0], aSN1BitStringArr[0]);
        subjectPublicKeyInfoArr[1] = new SubjectPublicKeyInfo(algorithmIdentifierArr[1], aSN1BitStringArr[1]);
        x509EncodedKeySpecArr[0] = new X509EncodedKeySpec(subjectPublicKeyInfoArr[0].getEncoded());
        x509EncodedKeySpecArr[1] = new X509EncodedKeySpec(subjectPublicKeyInfoArr[1].getEncoded());
        return x509EncodedKeySpecArr;
    }

    @Override // java.security.KeyFactorySpi
    public Key engineTranslateKey(Key key) throws InvalidKeyException {
        if (this.helper == null) {
            this.helper = new BCJcaJceHelper();
        }
        try {
            if (key instanceof PrivateKey) {
                return generatePrivate(PrivateKeyInfo.getInstance(key.getEncoded()));
            }
            if (key instanceof PublicKey) {
                return generatePublic(SubjectPublicKeyInfo.getInstance(key.getEncoded()));
            }
            org.bouncycastle.jce.provider.a.i("Key not recognized");
            return null;
        } catch (IOException e5) {
            throw new InvalidKeyException(s.g(e5, new StringBuilder("Key could not be parsed: ")));
        }
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public PrivateKey generatePrivate(PrivateKeyInfo privateKeyInfo) throws IOException {
        ASN1Sequence dERSequence;
        if (this.helper == null) {
            this.helper = new BCJcaJceHelper();
        }
        ASN1ObjectIdentifier algorithm = privateKeyInfo.getPrivateKeyAlgorithm().getAlgorithm();
        int i11 = 0;
        if (!MiscObjectIdentifiers.id_alg_composite.equals((ASN1Primitive) algorithm)) {
            try {
                if (!MiscObjectIdentifiers.id_composite_key.equals((ASN1Primitive) algorithm)) {
                    try {
                        Object privateKey = privateKeyInfo.parsePrivateKey();
                        if (privateKey instanceof ASN1OctetString) {
                            privateKey = ASN1OctetString.getInstance(privateKey).getOctets();
                        }
                        dERSequence = ASN1Sequence.getInstance(privateKey);
                    } catch (Exception unused) {
                        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
                        byte[] octets = privateKeyInfo.getPrivateKey().getOctets();
                        aSN1EncodableVector.add(new DEROctetString(Arrays.copyOfRange(octets, 0, 32)));
                        aSN1EncodableVector.add(new DEROctetString(Arrays.copyOfRange(octets, 32, octets.length)));
                        dERSequence = new DERSequence(aSN1EncodableVector);
                    }
                    List<KeyFactory> keyFactoriesFromIdentifier = getKeyFactoriesFromIdentifier(algorithm);
                    PrivateKey[] privateKeyArr = new PrivateKey[dERSequence.size()];
                    AlgorithmIdentifier[] algorithmIdentifierArr = pairings.get(algorithm);
                    while (i11 < dERSequence.size()) {
                        if (dERSequence.getObjectAt(i11) instanceof ASN1OctetString) {
                            ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector(3);
                            aSN1EncodableVector2.add(privateKeyInfo.getVersion());
                            aSN1EncodableVector2.add(algorithmIdentifierArr[i11]);
                            aSN1EncodableVector2.add(dERSequence.getObjectAt(i11));
                            privateKeyArr[i11] = keyFactoriesFromIdentifier.get(i11).generatePrivate(new PKCS8EncodedKeySpec(PrivateKeyInfo.getInstance(new DERSequence(aSN1EncodableVector2)).getEncoded()));
                        } else {
                            privateKeyArr[i11] = keyFactoriesFromIdentifier.get(i11).generatePrivate(new PKCS8EncodedKeySpec(PrivateKeyInfo.getInstance(ASN1Sequence.getInstance(dERSequence.getObjectAt(i11))).getEncoded()));
                        }
                        i11++;
                    }
                    return new CompositePrivateKey(algorithm, privateKeyArr);
                }
            } catch (GeneralSecurityException e5) {
                throw Exceptions.ioException(e5.getMessage(), e5);
            }
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(privateKeyInfo.parsePrivateKey());
        PrivateKey[] privateKeyArr2 = new PrivateKey[aSN1Sequence.size()];
        while (i11 != aSN1Sequence.size()) {
            PrivateKeyInfo privateKeyInfo2 = PrivateKeyInfo.getInstance(ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(i11)));
            try {
                privateKeyArr2[i11] = this.helper.createKeyFactory(privateKeyInfo2.getPrivateKeyAlgorithm().getAlgorithm().getId()).generatePrivate(new PKCS8EncodedKeySpec(privateKeyInfo2.getEncoded()));
                i11++;
            } catch (Exception e11) {
                throw new IOException(k.j(e11, new StringBuilder("cannot decode generic composite: ")), e11);
            }
        }
        return new CompositePrivateKey(privateKeyArr2);
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public PublicKey generatePublic(SubjectPublicKeyInfo subjectPublicKeyInfo) throws IOException {
        ASN1Sequence aSN1Sequence;
        if (this.helper == null) {
            this.helper = new BCJcaJceHelper();
        }
        ASN1ObjectIdentifier algorithm = subjectPublicKeyInfo.getAlgorithm().getAlgorithm();
        byte[][] bArrSplit = new byte[2][];
        try {
            aSN1Sequence = ASN1Sequence.getInstance(subjectPublicKeyInfo.getPublicKeyData().getBytes());
        } catch (Exception unused) {
            bArrSplit = split(algorithm, subjectPublicKeyInfo.getPublicKeyData());
            aSN1Sequence = null;
        }
        int i11 = 0;
        if (MiscObjectIdentifiers.id_alg_composite.equals((ASN1Primitive) algorithm) || MiscObjectIdentifiers.id_composite_key.equals((ASN1Primitive) algorithm)) {
            ASN1Sequence aSN1Sequence2 = ASN1Sequence.getInstance(subjectPublicKeyInfo.getPublicKeyData().getBytes());
            PublicKey[] publicKeyArr = new PublicKey[aSN1Sequence2.size()];
            while (i11 != aSN1Sequence2.size()) {
                SubjectPublicKeyInfo subjectPublicKeyInfo2 = SubjectPublicKeyInfo.getInstance(aSN1Sequence2.getObjectAt(i11));
                try {
                    publicKeyArr[i11] = this.helper.createKeyFactory(subjectPublicKeyInfo2.getAlgorithm().getAlgorithm().getId()).generatePublic(new X509EncodedKeySpec(subjectPublicKeyInfo2.getEncoded()));
                    i11++;
                } catch (Exception e5) {
                    throw new IOException(k.j(e5, new StringBuilder("cannot decode generic composite: ")), e5);
                }
            }
            return new CompositePublicKey(publicKeyArr);
        }
        try {
            int length = aSN1Sequence == null ? bArrSplit.length : aSN1Sequence.size();
            List<KeyFactory> keyFactoriesFromIdentifier = getKeyFactoriesFromIdentifier(algorithm);
            ASN1BitString[] aSN1BitStringArr = new ASN1BitString[length];
            for (int i12 = 0; i12 < length; i12++) {
                if (aSN1Sequence == null) {
                    aSN1BitStringArr[i12] = new DERBitString(bArrSplit[i12]);
                } else if (aSN1Sequence.getObjectAt(i12) instanceof DEROctetString) {
                    aSN1BitStringArr[i12] = new DERBitString(((DEROctetString) aSN1Sequence.getObjectAt(i12)).getOctets());
                } else {
                    aSN1BitStringArr[i12] = (DERBitString) aSN1Sequence.getObjectAt(i12);
                }
            }
            X509EncodedKeySpec[] keysSpecs = getKeysSpecs(algorithm, aSN1BitStringArr);
            PublicKey[] publicKeyArr2 = new PublicKey[length];
            while (i11 < length) {
                publicKeyArr2[i11] = keyFactoriesFromIdentifier.get(i11).generatePublic(keysSpecs[i11]);
                i11++;
            }
            return new CompositePublicKey(algorithm, publicKeyArr2);
        } catch (GeneralSecurityException e11) {
            throw Exceptions.ioException(e11.getMessage(), e11);
        }
    }

    public byte[][] split(ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1BitString aSN1BitString) {
        int[] iArr = componentKeySizes.get(aSN1ObjectIdentifier);
        aSN1BitString.getOctets();
        return new byte[][]{new byte[iArr[0]], new byte[iArr[1]]};
    }

    public KeyFactorySpi() {
        this(null);
    }
}
