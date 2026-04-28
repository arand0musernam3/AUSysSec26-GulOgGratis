package org.bouncycastle.jcajce.provider.symmetric;

import a40.d0;
import j4.s;
import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.spec.IvParameterSpec;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.asn1.bc.BCObjectIdentifiers;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.DefaultBufferedBlockCipher;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.engines.AESEngine;
import org.bouncycastle.crypto.engines.AESWrapEngine;
import org.bouncycastle.crypto.engines.AESWrapPadEngine;
import org.bouncycastle.crypto.engines.RFC3211WrapEngine;
import org.bouncycastle.crypto.engines.RFC5649WrapEngine;
import org.bouncycastle.crypto.generators.Poly1305KeyGenerator;
import org.bouncycastle.crypto.macs.CMac;
import org.bouncycastle.crypto.macs.GMac;
import org.bouncycastle.crypto.modes.AEADBlockCipher;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.modes.CCMBlockCipher;
import org.bouncycastle.crypto.modes.CCMModeCipher;
import org.bouncycastle.crypto.modes.CFBBlockCipher;
import org.bouncycastle.crypto.modes.GCMBlockCipher;
import org.bouncycastle.crypto.modes.OFBBlockCipher;
import org.bouncycastle.internal.asn1.cms.CCMParameters;
import org.bouncycastle.internal.asn1.cms.GCMParameters;
import org.bouncycastle.jcajce.provider.asymmetric.a;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameterGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.GcmSpecUtil;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory;
import org.bouncycastle.jcajce.spec.AEADParameterSpec;
import r8.k;

/* JADX INFO: loaded from: classes3.dex */
public final class AES {
    private static final Map<String, String> generalAesAttributes;

    public static class AESCCMMAC extends BaseMac {
        public AESCCMMAC() {
            super(new CCMMac());
        }
    }

    public static class AESCCMMAC128 extends BaseMac {
        public AESCCMMAC128() {
            super(128, new CCMMac());
        }
    }

    public static class AESCCMMAC192 extends BaseMac {
        public AESCCMMAC192() {
            super(BERTags.PRIVATE, new CCMMac());
        }
    }

    public static class AESCCMMAC256 extends BaseMac {
        public AESCCMMAC256() {
            super(256, new CCMMac());
        }
    }

    public static class AESCMAC extends BaseMac {
        public AESCMAC() {
            super(new CMac(AESEngine.newInstance()));
        }
    }

    public static class AESGMAC extends BaseMac {
        public AESGMAC() {
            super(new GMac(GCMBlockCipher.newInstance(AESEngine.newInstance())));
        }
    }

    public static class AlgParamGen extends BaseAlgorithmParameterGenerator {
        @Override // java.security.AlgorithmParameterGeneratorSpi
        public AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[16];
            if (this.random == null) {
                this.random = CryptoServicesRegistrar.getSecureRandom();
            }
            this.random.nextBytes(bArr);
            try {
                AlgorithmParameters algorithmParametersCreateParametersInstance = createParametersInstance("AES");
                algorithmParametersCreateParametersInstance.init(new IvParameterSpec(bArr));
                return algorithmParametersCreateParametersInstance;
            } catch (Exception e5) {
                d0.k(e5.getMessage());
                return null;
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for AES parameter generation.");
        }
    }

    public static class AlgParamGenCCM extends BaseAlgorithmParameterGenerator {
        @Override // java.security.AlgorithmParameterGeneratorSpi
        public AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[12];
            if (this.random == null) {
                this.random = new SecureRandom();
            }
            this.random.nextBytes(bArr);
            try {
                AlgorithmParameters algorithmParametersCreateParametersInstance = createParametersInstance("CCM");
                algorithmParametersCreateParametersInstance.init(new CCMParameters(bArr, 12).getEncoded());
                return algorithmParametersCreateParametersInstance;
            } catch (Exception e5) {
                d0.k(e5.getMessage());
                return null;
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for AES parameter generation.");
        }
    }

    public static class AlgParamGenGCM extends BaseAlgorithmParameterGenerator {
        @Override // java.security.AlgorithmParameterGeneratorSpi
        public AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[12];
            if (this.random == null) {
                this.random = new SecureRandom();
            }
            this.random.nextBytes(bArr);
            try {
                AlgorithmParameters algorithmParametersCreateParametersInstance = createParametersInstance("GCM");
                algorithmParametersCreateParametersInstance.init(new GCMParameters(bArr, 16).getEncoded());
                return algorithmParametersCreateParametersInstance;
            } catch (Exception e5) {
                d0.k(e5.getMessage());
                return null;
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for AES parameter generation.");
        }
    }

    public static class AlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        public String engineToString() {
            return "AES IV";
        }
    }

    public static class CBC extends BaseBlockCipher {
        public CBC() {
            super(CBCBlockCipher.newInstance(AESEngine.newInstance()), 128);
        }
    }

    public static class CBC128 extends BaseBlockCipher {
        public CBC128() {
            super(128, CBCBlockCipher.newInstance(AESEngine.newInstance()), 128);
        }
    }

    public static class CBC192 extends BaseBlockCipher {
        public CBC192() {
            super(BERTags.PRIVATE, CBCBlockCipher.newInstance(AESEngine.newInstance()), 128);
        }
    }

    public static class CBC256 extends BaseBlockCipher {
        public CBC256() {
            super(BERTags.PRIVATE, CBCBlockCipher.newInstance(AESEngine.newInstance()), 128);
        }
    }

    public static class CCM extends BaseBlockCipher {
        public CCM() {
            super((AEADBlockCipher) CCMBlockCipher.newInstance(AESEngine.newInstance()), false, 12);
        }
    }

    public static class CCM128 extends BaseBlockCipher {
        public CCM128() {
            super(128, CCMBlockCipher.newInstance(AESEngine.newInstance()), false, 12);
        }
    }

    public static class CCM192 extends BaseBlockCipher {
        public CCM192() {
            super(BERTags.PRIVATE, CCMBlockCipher.newInstance(AESEngine.newInstance()), false, 12);
        }
    }

    public static class CCM256 extends BaseBlockCipher {
        public CCM256() {
            super(256, CCMBlockCipher.newInstance(AESEngine.newInstance()), false, 12);
        }
    }

    public static class CFB extends BaseBlockCipher {
        public CFB() {
            super(new DefaultBufferedBlockCipher(CFBBlockCipher.newInstance(AESEngine.newInstance(), 128)), 128);
        }
    }

    public static class CFB128 extends BaseBlockCipher {
        public CFB128() {
            super(128, new DefaultBufferedBlockCipher(CFBBlockCipher.newInstance(AESEngine.newInstance(), 128)), 128);
        }
    }

    public static class CFB192 extends BaseBlockCipher {
        public CFB192() {
            super(BERTags.PRIVATE, new DefaultBufferedBlockCipher(CFBBlockCipher.newInstance(AESEngine.newInstance(), 128)), 128);
        }
    }

    public static class CFB256 extends BaseBlockCipher {
        public CFB256() {
            super(256, new DefaultBufferedBlockCipher(CFBBlockCipher.newInstance(AESEngine.newInstance(), 128)), 128);
        }
    }

    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super(new BlockCipherProvider() { // from class: org.bouncycastle.jcajce.provider.symmetric.AES.ECB.1
                @Override // org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider
                public BlockCipher get() {
                    return AESEngine.newInstance();
                }
            });
        }
    }

    public static class ECB128 extends BaseBlockCipher {
        public ECB128() {
            super(128, new BlockCipherProvider() { // from class: org.bouncycastle.jcajce.provider.symmetric.AES.ECB128.1
                @Override // org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider
                public BlockCipher get() {
                    return AESEngine.newInstance();
                }
            });
        }
    }

    public static class ECB192 extends BaseBlockCipher {
        public ECB192() {
            super(BERTags.PRIVATE, new BlockCipherProvider() { // from class: org.bouncycastle.jcajce.provider.symmetric.AES.ECB192.1
                @Override // org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider
                public BlockCipher get() {
                    return AESEngine.newInstance();
                }
            });
        }
    }

    public static class ECB256 extends BaseBlockCipher {
        public ECB256() {
            super(256, new BlockCipherProvider() { // from class: org.bouncycastle.jcajce.provider.symmetric.AES.ECB256.1
                @Override // org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider
                public BlockCipher get() {
                    return AESEngine.newInstance();
                }
            });
        }
    }

    public static class GCM extends BaseBlockCipher {
        public GCM() {
            super(GCMBlockCipher.newInstance(AESEngine.newInstance()));
        }
    }

    public static class GCM128 extends BaseBlockCipher {
        public GCM128() {
            super(128, GCMBlockCipher.newInstance(AESEngine.newInstance()));
        }
    }

    public static class GCM192 extends BaseBlockCipher {
        public GCM192() {
            super(BERTags.PRIVATE, GCMBlockCipher.newInstance(AESEngine.newInstance()));
        }
    }

    public static class GCM256 extends BaseBlockCipher {
        public GCM256() {
            super(256, GCMBlockCipher.newInstance(AESEngine.newInstance()));
        }
    }

    public static class KeyFactory extends BaseSecretKeyFactory {
        public KeyFactory() {
            super("AES", null);
        }
    }

    public static class KeyGen128 extends KeyGen {
        public KeyGen128() {
            super(128);
        }
    }

    public static class KeyGen192 extends KeyGen {
        public KeyGen192() {
            super(BERTags.PRIVATE);
        }
    }

    public static class KeyGen256 extends KeyGen {
        public KeyGen256() {
            super(256);
        }
    }

    public static class Mappings extends SymmetricAlgorithmProvider {
        private static final String PREFIX = AES.class.getName();
        private static final String wrongAES128 = "2.16.840.1.101.3.4.2";
        private static final String wrongAES192 = "2.16.840.1.101.3.4.22";
        private static final String wrongAES256 = "2.16.840.1.101.3.4.42";

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb2 = new StringBuilder();
            String str = PREFIX;
            a.w(sb2, str, "$AlgParams", configurableProvider, "AlgorithmParameters.AES");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.2.16.840.1.101.3.4.2", "AES");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.2.16.840.1.101.3.4.22", "AES");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.2.16.840.1.101.3.4.42", "AES");
            StringBuilder sb3 = new StringBuilder("Alg.Alias.AlgorithmParameters.");
            ASN1ObjectIdentifier aSN1ObjectIdentifier = NISTObjectIdentifiers.id_aes128_CBC;
            StringBuilder sbR = s.r(sb3, aSN1ObjectIdentifier, configurableProvider, "AES", "Alg.Alias.AlgorithmParameters.");
            ASN1ObjectIdentifier aSN1ObjectIdentifier2 = NISTObjectIdentifiers.id_aes192_CBC;
            StringBuilder sbR2 = s.r(sbR, aSN1ObjectIdentifier2, configurableProvider, "AES", "Alg.Alias.AlgorithmParameters.");
            ASN1ObjectIdentifier aSN1ObjectIdentifier3 = NISTObjectIdentifiers.id_aes256_CBC;
            StringBuilder sbP = a.p(sbR2, aSN1ObjectIdentifier3, configurableProvider, "AES", str);
            sbP.append("$AlgParamsGCM");
            configurableProvider.addAlgorithm("AlgorithmParameters.GCM", sbP.toString());
            StringBuilder sb4 = new StringBuilder("Alg.Alias.AlgorithmParameters.");
            ASN1ObjectIdentifier aSN1ObjectIdentifier4 = NISTObjectIdentifiers.id_aes128_GCM;
            StringBuilder sbR3 = s.r(sb4, aSN1ObjectIdentifier4, configurableProvider, "GCM", "Alg.Alias.AlgorithmParameters.");
            ASN1ObjectIdentifier aSN1ObjectIdentifier5 = NISTObjectIdentifiers.id_aes192_GCM;
            StringBuilder sbR4 = s.r(sbR3, aSN1ObjectIdentifier5, configurableProvider, "GCM", "Alg.Alias.AlgorithmParameters.");
            ASN1ObjectIdentifier aSN1ObjectIdentifier6 = NISTObjectIdentifiers.id_aes256_GCM;
            StringBuilder sbP2 = a.p(sbR4, aSN1ObjectIdentifier6, configurableProvider, "GCM", str);
            sbP2.append("$AlgParamsCCM");
            configurableProvider.addAlgorithm("AlgorithmParameters.CCM", sbP2.toString());
            StringBuilder sb5 = new StringBuilder("Alg.Alias.AlgorithmParameters.");
            ASN1ObjectIdentifier aSN1ObjectIdentifier7 = NISTObjectIdentifiers.id_aes128_CCM;
            StringBuilder sbR5 = s.r(sb5, aSN1ObjectIdentifier7, configurableProvider, "CCM", "Alg.Alias.AlgorithmParameters.");
            ASN1ObjectIdentifier aSN1ObjectIdentifier8 = NISTObjectIdentifiers.id_aes192_CCM;
            StringBuilder sbR6 = s.r(sbR5, aSN1ObjectIdentifier8, configurableProvider, "CCM", "Alg.Alias.AlgorithmParameters.");
            ASN1ObjectIdentifier aSN1ObjectIdentifier9 = NISTObjectIdentifiers.id_aes256_CCM;
            a.x(a.p(sbR6, aSN1ObjectIdentifier9, configurableProvider, "CCM", str), "$AlgParamGen", configurableProvider, "AlgorithmParameterGenerator.AES");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator.2.16.840.1.101.3.4.2", "AES");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator.2.16.840.1.101.3.4.22", "AES");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator.2.16.840.1.101.3.4.42", "AES");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator." + aSN1ObjectIdentifier, "AES");
            StringBuilder sbR7 = s.r(new StringBuilder("Alg.Alias.AlgorithmParameterGenerator."), aSN1ObjectIdentifier2, configurableProvider, "AES", "Alg.Alias.AlgorithmParameterGenerator.");
            sbR7.append(aSN1ObjectIdentifier3);
            configurableProvider.addAlgorithm(sbR7.toString(), "AES");
            configurableProvider.addAttributes("Cipher.AES", AES.generalAesAttributes);
            a.w(new StringBuilder(), str, "$ECB", configurableProvider, "Cipher.AES");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.2.16.840.1.101.3.4.2", "AES");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.2.16.840.1.101.3.4.22", "AES");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.2.16.840.1.101.3.4.42", "AES");
            ASN1ObjectIdentifier aSN1ObjectIdentifier10 = NISTObjectIdentifiers.id_aes128_ECB;
            a.z(configurableProvider, str, "$ECB128", "Cipher", aSN1ObjectIdentifier10);
            ASN1ObjectIdentifier aSN1ObjectIdentifier11 = NISTObjectIdentifiers.id_aes192_ECB;
            a.z(configurableProvider, str, "$ECB192", "Cipher", aSN1ObjectIdentifier11);
            ASN1ObjectIdentifier aSN1ObjectIdentifier12 = NISTObjectIdentifiers.id_aes256_ECB;
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier12, str + "$ECB256");
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier3, k.p(a.o(a.r(configurableProvider, "Cipher", k.p(new StringBuilder(), str, "$CBC128"), str, aSN1ObjectIdentifier), "$CBC192", configurableProvider, "Cipher", aSN1ObjectIdentifier2), str, "$CBC256"));
            ASN1ObjectIdentifier aSN1ObjectIdentifier13 = NISTObjectIdentifiers.id_aes128_OFB;
            a.z(configurableProvider, str, "$OFB128", "Cipher", aSN1ObjectIdentifier13);
            ASN1ObjectIdentifier aSN1ObjectIdentifier14 = NISTObjectIdentifiers.id_aes192_OFB;
            a.z(configurableProvider, str, "$OFB192", "Cipher", aSN1ObjectIdentifier14);
            ASN1ObjectIdentifier aSN1ObjectIdentifier15 = NISTObjectIdentifiers.id_aes256_OFB;
            a.z(configurableProvider, str, "$OFB256", "Cipher", aSN1ObjectIdentifier15);
            ASN1ObjectIdentifier aSN1ObjectIdentifier16 = NISTObjectIdentifiers.id_aes128_CFB;
            a.z(configurableProvider, str, "$CFB128", "Cipher", aSN1ObjectIdentifier16);
            ASN1ObjectIdentifier aSN1ObjectIdentifier17 = NISTObjectIdentifiers.id_aes192_CFB;
            a.z(configurableProvider, str, "$CFB192", "Cipher", aSN1ObjectIdentifier17);
            ASN1ObjectIdentifier aSN1ObjectIdentifier18 = NISTObjectIdentifiers.id_aes256_CFB;
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier18, str + "$CFB256");
            configurableProvider.addAttributes("Cipher.AESWRAP", AES.generalAesAttributes);
            configurableProvider.addAlgorithm("Cipher.AESWRAP", str + "$Wrap");
            ASN1ObjectIdentifier aSN1ObjectIdentifier19 = NISTObjectIdentifiers.id_aes128_wrap;
            a.z(configurableProvider, str, "$Wrap128", "Cipher", aSN1ObjectIdentifier19);
            ASN1ObjectIdentifier aSN1ObjectIdentifier20 = NISTObjectIdentifiers.id_aes192_wrap;
            a.z(configurableProvider, str, "$Wrap192", "Cipher", aSN1ObjectIdentifier20);
            ASN1ObjectIdentifier aSN1ObjectIdentifier21 = NISTObjectIdentifiers.id_aes256_wrap;
            a.z(configurableProvider, str, "$Wrap256", "Cipher", aSN1ObjectIdentifier21);
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.AESKW", "AESWRAP");
            configurableProvider.addAttributes("Cipher.AESWRAPPAD", AES.generalAesAttributes);
            StringBuilder sb6 = new StringBuilder();
            sb6.append(str);
            a.x(sb6, "$WrapPad", configurableProvider, "Cipher.AESWRAPPAD");
            ASN1ObjectIdentifier aSN1ObjectIdentifier22 = NISTObjectIdentifiers.id_aes128_wrap_pad;
            a.z(configurableProvider, str, "$WrapPad128", "Cipher", aSN1ObjectIdentifier22);
            ASN1ObjectIdentifier aSN1ObjectIdentifier23 = NISTObjectIdentifiers.id_aes192_wrap_pad;
            a.z(configurableProvider, str, "$WrapPad192", "Cipher", aSN1ObjectIdentifier23);
            ASN1ObjectIdentifier aSN1ObjectIdentifier24 = NISTObjectIdentifiers.id_aes256_wrap_pad;
            a.z(configurableProvider, str, "$WrapPad256", "Cipher", aSN1ObjectIdentifier24);
            configurableProvider.addAlgorithm(a.j(configurableProvider, a.j(configurableProvider, a.j(configurableProvider, "AlgorithmParameterGenerator.CCM", a.e("Cipher.AESRFC5649WRAP", a.e("Cipher.AESRFC3211WRAP", a.e("Alg.Alias.Cipher.AESKWP", "AESWRAPPAD", configurableProvider, str, "$RFC3211Wrap"), configurableProvider, str, "$RFC5649Wrap"), configurableProvider, str, "$AlgParamGenCCM"), "Alg.Alias.AlgorithmParameterGenerator.", aSN1ObjectIdentifier7), "CCM", "Alg.Alias.AlgorithmParameterGenerator.", aSN1ObjectIdentifier8), "CCM", "Alg.Alias.AlgorithmParameterGenerator.", aSN1ObjectIdentifier9), "CCM");
            configurableProvider.addAttributes("Cipher.CCM", AES.generalAesAttributes);
            StringBuilder sb7 = new StringBuilder();
            sb7.append(str);
            StringBuilder sbO = a.o(a.r(configurableProvider, "Cipher", k.p(a.o(a.n(sb7, "$CCM", configurableProvider, "Cipher.CCM", str), "$CCM128", configurableProvider, "Cipher", aSN1ObjectIdentifier7), str, "$CCM192"), str, aSN1ObjectIdentifier8), "$CCM256", configurableProvider, "Cipher", aSN1ObjectIdentifier9);
            sbO.append(str);
            sbO.append("$AlgParamGenGCM");
            configurableProvider.addAlgorithm("AlgorithmParameterGenerator.GCM", sbO.toString());
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator." + aSN1ObjectIdentifier4, "GCM");
            StringBuilder sbR8 = s.r(new StringBuilder("Alg.Alias.AlgorithmParameterGenerator."), aSN1ObjectIdentifier5, configurableProvider, "GCM", "Alg.Alias.AlgorithmParameterGenerator.");
            sbR8.append(aSN1ObjectIdentifier6);
            configurableProvider.addAlgorithm(sbR8.toString(), "GCM");
            configurableProvider.addAttributes("Cipher.GCM", AES.generalAesAttributes);
            StringBuilder sbN = a.n(a.r(configurableProvider, "KeyGenerator", k.p(a.o(a.r(configurableProvider, "KeyGenerator", k.p(a.m(a.o(a.r(configurableProvider, "KeyGenerator", k.p(a.o(a.r(configurableProvider, "KeyGenerator", k.p(a.o(a.r(configurableProvider, "KeyGenerator", k.p(a.o(a.r(configurableProvider, "KeyGenerator", k.p(a.o(a.n(a.r(configurableProvider, "KeyGenerator", k.p(a.o(a.r(configurableProvider, "KeyGenerator", k.p(a.o(a.r(configurableProvider, "KeyGenerator", k.p(a.o(a.r(configurableProvider, "KeyGenerator", k.p(a.o(a.r(configurableProvider, "KeyGenerator", k.p(a.o(a.r(configurableProvider, "KeyGenerator", k.p(a.o(a.n(a.n(a.n(a.n(a.r(configurableProvider, "Cipher", k.p(a.o(a.r(configurableProvider, "Cipher", k.p(a.m(new StringBuilder(), str, "$GCM", configurableProvider, "Cipher.GCM"), str, "$GCM128"), str, aSN1ObjectIdentifier4), "$GCM192", configurableProvider, "Cipher", aSN1ObjectIdentifier5), str, "$GCM256"), str, aSN1ObjectIdentifier6), "$KeyGen", configurableProvider, "KeyGenerator.AES", str), "$KeyGen128", configurableProvider, "KeyGenerator.2.16.840.1.101.3.4.2", str), "$KeyGen192", configurableProvider, "KeyGenerator.2.16.840.1.101.3.4.22", str), "$KeyGen256", configurableProvider, "KeyGenerator.2.16.840.1.101.3.4.42", str), "$KeyGen128", configurableProvider, "KeyGenerator", aSN1ObjectIdentifier10), str, "$KeyGen128"), str, aSN1ObjectIdentifier), "$KeyGen128", configurableProvider, "KeyGenerator", aSN1ObjectIdentifier13), str, "$KeyGen128"), str, aSN1ObjectIdentifier16), "$KeyGen192", configurableProvider, "KeyGenerator", aSN1ObjectIdentifier11), str, "$KeyGen192"), str, aSN1ObjectIdentifier2), "$KeyGen192", configurableProvider, "KeyGenerator", aSN1ObjectIdentifier14), str, "$KeyGen192"), str, aSN1ObjectIdentifier17), "$KeyGen256", configurableProvider, "KeyGenerator", aSN1ObjectIdentifier12), str, "$KeyGen256"), str, aSN1ObjectIdentifier3), "$KeyGen256", configurableProvider, "KeyGenerator", aSN1ObjectIdentifier15), str, "$KeyGen256"), str, aSN1ObjectIdentifier18), "$KeyGen", configurableProvider, "KeyGenerator.AESWRAP", str), "$KeyGen128", configurableProvider, "KeyGenerator", aSN1ObjectIdentifier19), str, "$KeyGen192"), str, aSN1ObjectIdentifier20), "$KeyGen256", configurableProvider, "KeyGenerator", aSN1ObjectIdentifier21), str, "$KeyGen128"), str, aSN1ObjectIdentifier4), "$KeyGen192", configurableProvider, "KeyGenerator", aSN1ObjectIdentifier5), str, "$KeyGen256"), str, aSN1ObjectIdentifier6), "$KeyGen128", configurableProvider, "KeyGenerator", aSN1ObjectIdentifier7), str, "$KeyGen192"), str, aSN1ObjectIdentifier8), "$KeyGen256", configurableProvider, "KeyGenerator", aSN1ObjectIdentifier9), str, "$KeyGen", configurableProvider, "KeyGenerator.AESWRAPPAD"), str, "$KeyGen128"), str, aSN1ObjectIdentifier22), "$KeyGen192", configurableProvider, "KeyGenerator", aSN1ObjectIdentifier23), str, "$KeyGen256"), str, aSN1ObjectIdentifier24), "$AESCMAC", configurableProvider, "Mac.AESCMAC", str);
            sbN.append("$AESCCMMAC");
            configurableProvider.addAlgorithm("Mac.AESCCMMAC", sbN.toString());
            StringBuilder sbL = a.l(str, "$AESCCMMAC128", configurableProvider, "Mac." + aSN1ObjectIdentifier7.getId(), "Mac.");
            sbL.append(aSN1ObjectIdentifier8.getId());
            StringBuilder sbL2 = a.l(str, "$AESCCMMAC192", configurableProvider, sbL.toString(), "Mac.");
            sbL2.append(aSN1ObjectIdentifier9.getId());
            configurableProvider.addAlgorithm(sbL2.toString(), str + "$AESCCMMAC256");
            ASN1ObjectIdentifier aSN1ObjectIdentifier25 = BCObjectIdentifiers.bc_pbe_sha1_pkcs12_aes128_cbc;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", aSN1ObjectIdentifier25, "PBEWITHSHAAND128BITAES-CBC-BC");
            ASN1ObjectIdentifier aSN1ObjectIdentifier26 = BCObjectIdentifiers.bc_pbe_sha1_pkcs12_aes192_cbc;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", aSN1ObjectIdentifier26, "PBEWITHSHAAND192BITAES-CBC-BC");
            ASN1ObjectIdentifier aSN1ObjectIdentifier27 = BCObjectIdentifiers.bc_pbe_sha1_pkcs12_aes256_cbc;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", aSN1ObjectIdentifier27, "PBEWITHSHAAND256BITAES-CBC-BC");
            ASN1ObjectIdentifier aSN1ObjectIdentifier28 = BCObjectIdentifiers.bc_pbe_sha256_pkcs12_aes128_cbc;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", aSN1ObjectIdentifier28, "PBEWITHSHA256AND128BITAES-CBC-BC");
            ASN1ObjectIdentifier aSN1ObjectIdentifier29 = BCObjectIdentifiers.bc_pbe_sha256_pkcs12_aes192_cbc;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", aSN1ObjectIdentifier29, "PBEWITHSHA256AND192BITAES-CBC-BC");
            ASN1ObjectIdentifier aSN1ObjectIdentifier30 = BCObjectIdentifiers.bc_pbe_sha256_pkcs12_aes256_cbc;
            a.x(a.n(a.n(a.n(a.n(a.n(a.r(configurableProvider, "Alg.Alias.Cipher", "PBEWITHSHA256AND256BITAES-CBC-BC", str, aSN1ObjectIdentifier30), "$PBEWithSHA1AESCBC128", configurableProvider, "Cipher.PBEWITHSHAAND128BITAES-CBC-BC", str), "$PBEWithSHA1AESCBC192", configurableProvider, "Cipher.PBEWITHSHAAND192BITAES-CBC-BC", str), "$PBEWithSHA1AESCBC256", configurableProvider, "Cipher.PBEWITHSHAAND256BITAES-CBC-BC", str), "$PBEWithSHA256AESCBC128", configurableProvider, "Cipher.PBEWITHSHA256AND128BITAES-CBC-BC", str), "$PBEWithSHA256AESCBC192", configurableProvider, "Cipher.PBEWITHSHA256AND192BITAES-CBC-BC", str), "$PBEWithSHA256AESCBC256", configurableProvider, "Cipher.PBEWITHSHA256AND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1AND128BITAES-CBC-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1AND192BITAES-CBC-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1AND256BITAES-CBC-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-1AND128BITAES-CBC-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-1AND192BITAES-CBC-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-1AND256BITAES-CBC-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHAAND128BITAES-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHAAND192BITAES-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHAAND256BITAES-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1AND128BITAES-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1AND192BITAES-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1AND256BITAES-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-1AND128BITAES-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-1AND192BITAES-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-1AND256BITAES-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-256AND128BITAES-CBC-BC", "PBEWITHSHA256AND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-256AND192BITAES-CBC-BC", "PBEWITHSHA256AND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-256AND256BITAES-CBC-BC", "PBEWITHSHA256AND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA256AND128BITAES-BC", "PBEWITHSHA256AND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA256AND192BITAES-BC", "PBEWITHSHA256AND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA256AND256BITAES-BC", "PBEWITHSHA256AND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-256AND128BITAES-BC", "PBEWITHSHA256AND128BITAES-CBC-BC");
            a.w(a.m(a.m(a.m(a.q(configurableProvider, "Alg.Alias.Cipher.PBEWITHSHA-256AND192BITAES-BC", "PBEWITHSHA256AND192BITAES-CBC-BC", "Alg.Alias.Cipher.PBEWITHSHA-256AND256BITAES-BC", "PBEWITHSHA256AND256BITAES-CBC-BC"), str, "$PBEWithAESCBC", configurableProvider, "Cipher.PBEWITHMD5AND128BITAES-CBC-OPENSSL"), str, "$PBEWithAESCBC", configurableProvider, "Cipher.PBEWITHMD5AND192BITAES-CBC-OPENSSL"), str, "$PBEWithAESCBC", configurableProvider, "Cipher.PBEWITHMD5AND256BITAES-CBC-OPENSSL"), str, "$KeyFactory", configurableProvider, "SecretKeyFactory.AES");
            configurableProvider.addAlgorithm("SecretKeyFactory", NISTObjectIdentifiers.aes, str + "$KeyFactory");
            a.w(a.m(a.m(a.m(a.m(a.m(a.m(a.m(a.m(new StringBuilder(), str, "$PBEWithMD5And128BitAESCBCOpenSSL", configurableProvider, "SecretKeyFactory.PBEWITHMD5AND128BITAES-CBC-OPENSSL"), str, "$PBEWithMD5And192BitAESCBCOpenSSL", configurableProvider, "SecretKeyFactory.PBEWITHMD5AND192BITAES-CBC-OPENSSL"), str, "$PBEWithMD5And256BitAESCBCOpenSSL", configurableProvider, "SecretKeyFactory.PBEWITHMD5AND256BITAES-CBC-OPENSSL"), str, "$PBEWithSHAAnd128BitAESBC", configurableProvider, "SecretKeyFactory.PBEWITHSHAAND128BITAES-CBC-BC"), str, "$PBEWithSHAAnd192BitAESBC", configurableProvider, "SecretKeyFactory.PBEWITHSHAAND192BITAES-CBC-BC"), str, "$PBEWithSHAAnd256BitAESBC", configurableProvider, "SecretKeyFactory.PBEWITHSHAAND256BITAES-CBC-BC"), str, "$PBEWithSHA256And128BitAESBC", configurableProvider, "SecretKeyFactory.PBEWITHSHA256AND128BITAES-CBC-BC"), str, "$PBEWithSHA256And192BitAESBC", configurableProvider, "SecretKeyFactory.PBEWITHSHA256AND192BITAES-CBC-BC"), str, "$PBEWithSHA256And256BitAESBC", configurableProvider, "SecretKeyFactory.PBEWITHSHA256AND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA1AND128BITAES-CBC-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA1AND192BITAES-CBC-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA1AND256BITAES-CBC-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA-1AND128BITAES-CBC-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA-1AND192BITAES-CBC-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA-1AND256BITAES-CBC-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND128BITAES-CBC-BC", "PBEWITHSHA256AND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND192BITAES-CBC-BC", "PBEWITHSHA256AND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND256BITAES-CBC-BC", "PBEWITHSHA256AND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND128BITAES-BC", "PBEWITHSHA256AND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND192BITAES-BC", "PBEWITHSHA256AND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND256BITAES-BC", "PBEWITHSHA256AND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory", aSN1ObjectIdentifier25, "PBEWITHSHAAND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory", aSN1ObjectIdentifier26, "PBEWITHSHAAND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory", aSN1ObjectIdentifier27, "PBEWITHSHAAND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory", aSN1ObjectIdentifier28, "PBEWITHSHA256AND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory", aSN1ObjectIdentifier29, "PBEWITHSHA256AND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory", aSN1ObjectIdentifier30, "PBEWITHSHA256AND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND128BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND192BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND256BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA256AND128BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA256AND192BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA256AND256BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA1AND128BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA1AND192BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA1AND256BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA-1AND128BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA-1AND192BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA-1AND256BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA-256AND128BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA-256AND192BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA-256AND256BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters." + aSN1ObjectIdentifier25.getId(), "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters." + aSN1ObjectIdentifier26.getId(), "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters." + aSN1ObjectIdentifier27.getId(), "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters." + aSN1ObjectIdentifier28.getId(), "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters." + aSN1ObjectIdentifier29.getId(), "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters." + aSN1ObjectIdentifier30.getId(), "PKCS12PBE");
            addGMacAlgorithm(configurableProvider, "AES", str + "$AESGMAC", k.l(str, "$KeyGen128"));
            addPoly1305Algorithm(configurableProvider, "AES", k.l(str, "$Poly1305"), k.l(str, "$Poly1305KeyGen"));
        }
    }

    public static class OFB extends BaseBlockCipher {
        public OFB() {
            super(new DefaultBufferedBlockCipher(new OFBBlockCipher(AESEngine.newInstance(), 128)), 128);
        }
    }

    public static class OFB128 extends BaseBlockCipher {
        public OFB128() {
            super(128, new DefaultBufferedBlockCipher(new OFBBlockCipher(AESEngine.newInstance(), 128)), 128);
        }
    }

    public static class OFB192 extends BaseBlockCipher {
        public OFB192() {
            super(BERTags.PRIVATE, new DefaultBufferedBlockCipher(new OFBBlockCipher(AESEngine.newInstance(), 128)), 128);
        }
    }

    public static class OFB256 extends BaseBlockCipher {
        public OFB256() {
            super(256, new DefaultBufferedBlockCipher(new OFBBlockCipher(AESEngine.newInstance(), 128)), 128);
        }
    }

    public static class PBEWithAESCBC extends BaseBlockCipher {
        public PBEWithAESCBC() {
            super(CBCBlockCipher.newInstance(AESEngine.newInstance()));
        }
    }

    public static class PBEWithMD5And128BitAESCBCOpenSSL extends PBESecretKeyFactory {
        public PBEWithMD5And128BitAESCBCOpenSSL() {
            super("PBEWithMD5And128BitAES-CBC-OpenSSL", null, true, 3, 0, 128, 128);
        }
    }

    public static class PBEWithMD5And192BitAESCBCOpenSSL extends PBESecretKeyFactory {
        public PBEWithMD5And192BitAESCBCOpenSSL() {
            super("PBEWithMD5And192BitAES-CBC-OpenSSL", null, true, 3, 0, BERTags.PRIVATE, 128);
        }
    }

    public static class PBEWithMD5And256BitAESCBCOpenSSL extends PBESecretKeyFactory {
        public PBEWithMD5And256BitAESCBCOpenSSL() {
            super("PBEWithMD5And256BitAES-CBC-OpenSSL", null, true, 3, 0, 256, 128);
        }
    }

    public static class PBEWithSHA1AESCBC128 extends BaseBlockCipher {
        public PBEWithSHA1AESCBC128() {
            super(CBCBlockCipher.newInstance(AESEngine.newInstance()), 2, 1, 128, 16);
        }
    }

    public static class PBEWithSHA1AESCBC192 extends BaseBlockCipher {
        public PBEWithSHA1AESCBC192() {
            super(CBCBlockCipher.newInstance(AESEngine.newInstance()), 2, 1, BERTags.PRIVATE, 16);
        }
    }

    public static class PBEWithSHA1AESCBC256 extends BaseBlockCipher {
        public PBEWithSHA1AESCBC256() {
            super(CBCBlockCipher.newInstance(AESEngine.newInstance()), 2, 1, 256, 16);
        }
    }

    public static class PBEWithSHA256AESCBC128 extends BaseBlockCipher {
        public PBEWithSHA256AESCBC128() {
            super(CBCBlockCipher.newInstance(AESEngine.newInstance()), 2, 4, 128, 16);
        }
    }

    public static class PBEWithSHA256AESCBC192 extends BaseBlockCipher {
        public PBEWithSHA256AESCBC192() {
            super(CBCBlockCipher.newInstance(AESEngine.newInstance()), 2, 4, BERTags.PRIVATE, 16);
        }
    }

    public static class PBEWithSHA256AESCBC256 extends BaseBlockCipher {
        public PBEWithSHA256AESCBC256() {
            super(CBCBlockCipher.newInstance(AESEngine.newInstance()), 2, 4, 256, 16);
        }
    }

    public static class PBEWithSHA256And128BitAESBC extends PBESecretKeyFactory {
        public PBEWithSHA256And128BitAESBC() {
            super("PBEWithSHA256And128BitAES-CBC-BC", null, true, 2, 4, 128, 128);
        }
    }

    public static class PBEWithSHA256And192BitAESBC extends PBESecretKeyFactory {
        public PBEWithSHA256And192BitAESBC() {
            super("PBEWithSHA256And192BitAES-CBC-BC", null, true, 2, 4, BERTags.PRIVATE, 128);
        }
    }

    public static class PBEWithSHA256And256BitAESBC extends PBESecretKeyFactory {
        public PBEWithSHA256And256BitAESBC() {
            super("PBEWithSHA256And256BitAES-CBC-BC", null, true, 2, 4, 256, 128);
        }
    }

    public static class PBEWithSHAAnd128BitAESBC extends PBESecretKeyFactory {
        public PBEWithSHAAnd128BitAESBC() {
            super("PBEWithSHA1And128BitAES-CBC-BC", null, true, 2, 1, 128, 128);
        }
    }

    public static class PBEWithSHAAnd192BitAESBC extends PBESecretKeyFactory {
        public PBEWithSHAAnd192BitAESBC() {
            super("PBEWithSHA1And192BitAES-CBC-BC", null, true, 2, 1, BERTags.PRIVATE, 128);
        }
    }

    public static class PBEWithSHAAnd256BitAESBC extends PBESecretKeyFactory {
        public PBEWithSHAAnd256BitAESBC() {
            super("PBEWithSHA1And256BitAES-CBC-BC", null, true, 2, 1, 256, 128);
        }
    }

    public static class Poly1305 extends BaseMac {
        public Poly1305() {
            super(new org.bouncycastle.crypto.macs.Poly1305(AESEngine.newInstance()));
        }
    }

    public static class Poly1305KeyGen extends BaseKeyGenerator {
        public Poly1305KeyGen() {
            super("Poly1305-AES", 256, new Poly1305KeyGenerator());
        }
    }

    public static class RFC3211Wrap extends BaseWrapCipher {
        public RFC3211Wrap() {
            super(new RFC3211WrapEngine(AESEngine.newInstance()), 16);
        }
    }

    public static class RFC5649Wrap extends BaseWrapCipher {
        public RFC5649Wrap() {
            super(new RFC5649WrapEngine(AESEngine.newInstance()));
        }
    }

    public static class Wrap extends BaseWrapCipher {
        public Wrap() {
            super(new AESWrapEngine());
        }
    }

    public static class Wrap128 extends BaseWrapCipher {
        public Wrap128() {
            super(new AESWrapEngine());
        }
    }

    public static class Wrap192 extends BaseWrapCipher {
        public Wrap192() {
            super(new AESWrapEngine());
        }
    }

    public static class Wrap256 extends BaseWrapCipher {
        public Wrap256() {
            super(new AESWrapEngine());
        }
    }

    public static class WrapPad extends BaseWrapCipher {
        public WrapPad() {
            super(new AESWrapPadEngine());
        }
    }

    public static class WrapPad128 extends BaseWrapCipher {
        public WrapPad128() {
            super(new AESWrapPadEngine());
        }
    }

    public static class WrapPad192 extends BaseWrapCipher {
        public WrapPad192() {
            super(new AESWrapPadEngine());
        }
    }

    public static class WrapPad256 extends BaseWrapCipher {
        public WrapPad256() {
            super(new AESWrapPadEngine());
        }
    }

    static {
        HashMap map = new HashMap();
        generalAesAttributes = map;
        map.put("SupportedKeyClasses", "javax.crypto.SecretKey");
        map.put("SupportedKeyFormats", "RAW");
    }

    private AES() {
    }

    public static class CCMMac implements Mac {
        private final CCMModeCipher ccm = CCMBlockCipher.newInstance(AESEngine.newInstance());
        private int macLength = 8;

        @Override // org.bouncycastle.crypto.Mac
        public int doFinal(byte[] bArr, int i11) throws IllegalStateException, DataLengthException {
            try {
                return this.ccm.doFinal(bArr, 0);
            } catch (InvalidCipherTextException e5) {
                throw new IllegalStateException("exception on doFinal(): " + e5.toString());
            }
        }

        @Override // org.bouncycastle.crypto.Mac
        public String getAlgorithmName() {
            return this.ccm.getAlgorithmName() + "Mac";
        }

        @Override // org.bouncycastle.crypto.Mac
        public int getMacSize() {
            return this.macLength;
        }

        @Override // org.bouncycastle.crypto.Mac
        public void init(CipherParameters cipherParameters) throws IllegalArgumentException {
            this.ccm.init(true, cipherParameters);
            this.macLength = this.ccm.getMac().length;
        }

        @Override // org.bouncycastle.crypto.Mac
        public void reset() {
            this.ccm.reset();
        }

        @Override // org.bouncycastle.crypto.Mac
        public void update(byte b8) throws IllegalStateException {
            this.ccm.processAADByte(b8);
        }

        @Override // org.bouncycastle.crypto.Mac
        public void update(byte[] bArr, int i11, int i12) throws IllegalStateException, DataLengthException {
            this.ccm.processAADBytes(bArr, i11, i12);
        }
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen(int i11) {
            super("AES", i11, new CipherKeyGenerator());
        }

        public KeyGen() {
            this(BERTags.PRIVATE);
        }
    }

    public static class AlgParamsCCM extends BaseAlgorithmParameters {
        private CCMParameters ccmParams;

        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded(String str) throws IOException {
            if (isASN1FormatString(str)) {
                return this.ccmParams.getEncoded();
            }
            i4.a.k("unknown format specified");
            return null;
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
            if (GcmSpecUtil.isGcmSpec(algorithmParameterSpec)) {
                this.ccmParams = CCMParameters.getInstance(GcmSpecUtil.extractGcmParameters(algorithmParameterSpec));
            } else {
                if (!(algorithmParameterSpec instanceof AEADParameterSpec)) {
                    throw new InvalidParameterSpecException("AlgorithmParameterSpec class not recognized: ".concat(algorithmParameterSpec.getClass().getName()));
                }
                AEADParameterSpec aEADParameterSpec = (AEADParameterSpec) algorithmParameterSpec;
                this.ccmParams = new CCMParameters(aEADParameterSpec.getNonce(), aEADParameterSpec.getMacSizeInBits() / 8);
            }
        }

        @Override // java.security.AlgorithmParametersSpi
        public String engineToString() {
            return "CCM";
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters
        public AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
            if (cls == AlgorithmParameterSpec.class || GcmSpecUtil.isGcmSpec(cls)) {
                return GcmSpecUtil.gcmSpecExtractable() ? GcmSpecUtil.extractGcmSpec(this.ccmParams.toASN1Primitive()) : new AEADParameterSpec(this.ccmParams.getNonce(), this.ccmParams.getIcvLen() * 8);
            }
            if (cls == AEADParameterSpec.class) {
                return new AEADParameterSpec(this.ccmParams.getNonce(), this.ccmParams.getIcvLen() * 8);
            }
            if (cls == IvParameterSpec.class) {
                return new IvParameterSpec(this.ccmParams.getNonce());
            }
            throw new InvalidParameterSpecException("AlgorithmParameterSpec not recognized: ".concat(cls.getName()));
        }

        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded() throws IOException {
            return this.ccmParams.getEncoded();
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] bArr) throws IOException {
            this.ccmParams = CCMParameters.getInstance(bArr);
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] bArr, String str) throws IOException {
            if (isASN1FormatString(str)) {
                this.ccmParams = CCMParameters.getInstance(bArr);
            } else {
                i4.a.k("unknown format specified");
            }
        }
    }

    public static class AlgParamsGCM extends BaseAlgorithmParameters {
        private GCMParameters gcmParams;

        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded(String str) throws IOException {
            if (isASN1FormatString(str)) {
                return this.gcmParams.getEncoded();
            }
            i4.a.k("unknown format specified");
            return null;
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
            if (GcmSpecUtil.isGcmSpec(algorithmParameterSpec)) {
                this.gcmParams = GcmSpecUtil.extractGcmParameters(algorithmParameterSpec);
            } else {
                if (!(algorithmParameterSpec instanceof AEADParameterSpec)) {
                    throw new InvalidParameterSpecException("AlgorithmParameterSpec class not recognized: ".concat(algorithmParameterSpec.getClass().getName()));
                }
                AEADParameterSpec aEADParameterSpec = (AEADParameterSpec) algorithmParameterSpec;
                this.gcmParams = new GCMParameters(aEADParameterSpec.getNonce(), aEADParameterSpec.getMacSizeInBits() / 8);
            }
        }

        @Override // java.security.AlgorithmParametersSpi
        public String engineToString() {
            return "GCM";
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters
        public AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
            if (cls == AlgorithmParameterSpec.class || GcmSpecUtil.isGcmSpec(cls)) {
                return GcmSpecUtil.gcmSpecExtractable() ? GcmSpecUtil.extractGcmSpec(this.gcmParams.toASN1Primitive()) : new AEADParameterSpec(this.gcmParams.getNonce(), this.gcmParams.getIcvLen() * 8);
            }
            if (cls == AEADParameterSpec.class) {
                return new AEADParameterSpec(this.gcmParams.getNonce(), this.gcmParams.getIcvLen() * 8);
            }
            if (cls == IvParameterSpec.class) {
                return new IvParameterSpec(this.gcmParams.getNonce());
            }
            throw new InvalidParameterSpecException("AlgorithmParameterSpec not recognized: ".concat(cls.getName()));
        }

        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded() throws IOException {
            return this.gcmParams.getEncoded();
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] bArr) throws IOException {
            this.gcmParams = GCMParameters.getInstance(bArr);
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] bArr, String str) throws IOException {
            if (isASN1FormatString(str)) {
                this.gcmParams = GCMParameters.getInstance(bArr);
            } else {
                i4.a.k("unknown format specified");
            }
        }
    }
}
