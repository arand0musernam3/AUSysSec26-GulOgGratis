package org.bouncycastle.jcajce.provider.symmetric;

import a40.d0;
import c50.w;
import e0.f;
import i4.a;
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
import m0.i1;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.cryptopro.GOST28147Parameters;
import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.engines.CryptoProWrapEngine;
import org.bouncycastle.crypto.engines.GOST28147Engine;
import org.bouncycastle.crypto.engines.GOST28147WrapEngine;
import org.bouncycastle.crypto.macs.GOST28147Mac;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.modes.GCFBBlockCipher;
import org.bouncycastle.internal.asn1.rosstandart.RosstandartObjectIdentifiers;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameterGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import org.bouncycastle.jcajce.spec.GOST28147ParameterSpec;
import org.bouncycastle.util.Strings;
import r8.k;

/* JADX INFO: loaded from: classes3.dex */
public final class GOST28147 {
    private static Map<ASN1ObjectIdentifier, String> oidMappings = new HashMap();
    private static Map<String, ASN1ObjectIdentifier> nameMappings = new HashMap();

    public static class AlgParamGen extends BaseAlgorithmParameterGenerator {

        /* JADX INFO: renamed from: iv, reason: collision with root package name */
        byte[] f33303iv = new byte[8];
        byte[] sBox = GOST28147Engine.getSBox("E-A");

        @Override // java.security.AlgorithmParameterGeneratorSpi
        public AlgorithmParameters engineGenerateParameters() {
            if (this.random == null) {
                this.random = CryptoServicesRegistrar.getSecureRandom();
            }
            this.random.nextBytes(this.f33303iv);
            try {
                AlgorithmParameters algorithmParametersCreateParametersInstance = createParametersInstance("GOST28147");
                algorithmParametersCreateParametersInstance.init(new GOST28147ParameterSpec(this.sBox, this.f33303iv));
                return algorithmParametersCreateParametersInstance;
            } catch (Exception e5) {
                d0.k(e5.getMessage());
                return null;
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            if (algorithmParameterSpec instanceof GOST28147ParameterSpec) {
                this.sBox = ((GOST28147ParameterSpec) algorithmParameterSpec).getSBox();
            } else {
                i1.v("parameter spec not supported");
            }
        }
    }

    public static class AlgParams extends BaseAlgParams {

        /* JADX INFO: renamed from: iv, reason: collision with root package name */
        private byte[] f33304iv;
        private ASN1ObjectIdentifier sBox = CryptoProObjectIdentifiers.id_Gost28147_89_CryptoPro_A_ParamSet;

        @Override // org.bouncycastle.jcajce.provider.symmetric.GOST28147.BaseAlgParams, java.security.AlgorithmParametersSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
            if (algorithmParameterSpec instanceof IvParameterSpec) {
                this.f33304iv = ((IvParameterSpec) algorithmParameterSpec).getIV();
                return;
            }
            if (!(algorithmParameterSpec instanceof GOST28147ParameterSpec)) {
                i1.u("IvParameterSpec required to initialise a IV parameters algorithm parameters object");
                return;
            }
            this.f33304iv = ((GOST28147ParameterSpec) algorithmParameterSpec).getIV();
            try {
                this.sBox = BaseAlgParams.getSBoxOID(((GOST28147ParameterSpec) algorithmParameterSpec).getSBox());
            } catch (IllegalArgumentException e5) {
                throw new InvalidParameterSpecException(e5.getMessage());
            }
        }

        @Override // java.security.AlgorithmParametersSpi
        public String engineToString() {
            return "GOST 28147 IV Parameters";
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.GOST28147.BaseAlgParams, org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters
        public AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
            if (cls == IvParameterSpec.class) {
                return new IvParameterSpec(this.f33304iv);
            }
            if (cls == GOST28147ParameterSpec.class || cls == AlgorithmParameterSpec.class) {
                return new GOST28147ParameterSpec(this.sBox, this.f33304iv);
            }
            throw new InvalidParameterSpecException("AlgorithmParameterSpec not recognized: ".concat(cls.getName()));
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.GOST28147.BaseAlgParams
        public byte[] localGetEncoded() throws IOException {
            return new GOST28147Parameters(this.f33304iv, this.sBox).getEncoded();
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.GOST28147.BaseAlgParams
        public void localInit(byte[] bArr) throws IOException {
            ASN1Primitive aSN1PrimitiveFromByteArray = ASN1Primitive.fromByteArray(bArr);
            if (aSN1PrimitiveFromByteArray instanceof ASN1OctetString) {
                this.f33304iv = ASN1OctetString.getInstance(aSN1PrimitiveFromByteArray).getOctets();
            } else {
                if (!(aSN1PrimitiveFromByteArray instanceof ASN1Sequence)) {
                    a.k("Unable to recognize parameters");
                    return;
                }
                GOST28147Parameters gOST28147Parameters = GOST28147Parameters.getInstance(aSN1PrimitiveFromByteArray);
                this.sBox = gOST28147Parameters.getEncryptionParamSet();
                this.f33304iv = gOST28147Parameters.getIV();
            }
        }
    }

    public static class CBC extends BaseBlockCipher {
        public CBC() {
            super(new CBCBlockCipher(new GOST28147Engine()), 64);
        }
    }

    public static class CryptoProWrap extends BaseWrapCipher {
        public CryptoProWrap() {
            super(new CryptoProWrapEngine());
        }
    }

    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super(new GOST28147Engine());
        }
    }

    public static class GCFB extends BaseBlockCipher {
        public GCFB() {
            super(new BufferedBlockCipher(new GCFBBlockCipher(new GOST28147Engine())), 64);
        }
    }

    public static class GostWrap extends BaseWrapCipher {
        public GostWrap() {
            super(new GOST28147WrapEngine());
        }
    }

    public static class Mac extends BaseMac {
        public Mac() {
            super(new GOST28147Mac());
        }
    }

    public static class Mappings extends AlgorithmProvider {
        private static final String PREFIX = GOST28147.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb2 = new StringBuilder();
            String str = PREFIX;
            org.bouncycastle.jcajce.provider.asymmetric.a.w(sb2, str, "$ECB", configurableProvider, "Cipher.GOST28147");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.GOST", "GOST28147");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.GOST-28147", "GOST28147");
            StringBuilder sb3 = new StringBuilder("Cipher.");
            ASN1ObjectIdentifier aSN1ObjectIdentifier = CryptoProObjectIdentifiers.gostR28147_gcfb;
            sb3.append(aSN1ObjectIdentifier);
            configurableProvider.addAlgorithm(sb3.toString(), str + "$GCFB");
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str);
            org.bouncycastle.jcajce.provider.asymmetric.a.x(sb4, "$KeyGen", configurableProvider, "KeyGenerator.GOST28147");
            configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator.GOST", "GOST28147");
            configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator.GOST-28147", "GOST28147");
            configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator." + aSN1ObjectIdentifier, "GOST28147");
            StringBuilder sb5 = new StringBuilder();
            sb5.append(str);
            StringBuilder sbN = org.bouncycastle.jcajce.provider.asymmetric.a.n(sb5, "$AlgParams", configurableProvider, "AlgorithmParameters.GOST28147", str);
            sbN.append("$AlgParamGen");
            configurableProvider.addAlgorithm("AlgorithmParameterGenerator.GOST28147", sbN.toString());
            StringBuilder sbR = s.r(s.r(new StringBuilder("Alg.Alias.AlgorithmParameters."), aSN1ObjectIdentifier, configurableProvider, "GOST28147", "Alg.Alias.AlgorithmParameterGenerator."), aSN1ObjectIdentifier, configurableProvider, "GOST28147", "Cipher.");
            sbR.append(CryptoProObjectIdentifiers.id_Gost28147_89_CryptoPro_KeyWrap);
            StringBuilder sbL = org.bouncycastle.jcajce.provider.asymmetric.a.l(str, "$CryptoProWrap", configurableProvider, sbR.toString(), "Cipher.");
            sbL.append(CryptoProObjectIdentifiers.id_Gost28147_89_None_KeyWrap);
            configurableProvider.addAlgorithm(sbL.toString(), str + "$GostWrap");
            StringBuilder sb6 = new StringBuilder();
            sb6.append(str);
            org.bouncycastle.jcajce.provider.asymmetric.a.x(sb6, "$Mac", configurableProvider, "Mac.GOST28147MAC");
            configurableProvider.addAlgorithm("Alg.Alias.Mac.GOST28147", "GOST28147MAC");
        }
    }

    static {
        oidMappings.put(CryptoProObjectIdentifiers.id_Gost28147_89_CryptoPro_TestParamSet, "E-TEST");
        Map<ASN1ObjectIdentifier, String> map = oidMappings;
        ASN1ObjectIdentifier aSN1ObjectIdentifier = CryptoProObjectIdentifiers.id_Gost28147_89_CryptoPro_A_ParamSet;
        map.put(aSN1ObjectIdentifier, "E-A");
        Map<ASN1ObjectIdentifier, String> map2 = oidMappings;
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = CryptoProObjectIdentifiers.id_Gost28147_89_CryptoPro_B_ParamSet;
        map2.put(aSN1ObjectIdentifier2, "E-B");
        Map<ASN1ObjectIdentifier, String> map3 = oidMappings;
        ASN1ObjectIdentifier aSN1ObjectIdentifier3 = CryptoProObjectIdentifiers.id_Gost28147_89_CryptoPro_C_ParamSet;
        map3.put(aSN1ObjectIdentifier3, "E-C");
        Map<ASN1ObjectIdentifier, String> map4 = oidMappings;
        ASN1ObjectIdentifier aSN1ObjectIdentifier4 = CryptoProObjectIdentifiers.id_Gost28147_89_CryptoPro_D_ParamSet;
        map4.put(aSN1ObjectIdentifier4, "E-D");
        Map<ASN1ObjectIdentifier, String> map5 = oidMappings;
        ASN1ObjectIdentifier aSN1ObjectIdentifier5 = RosstandartObjectIdentifiers.id_tc26_gost_28147_param_Z;
        map5.put(aSN1ObjectIdentifier5, "PARAM-Z");
        nameMappings.put("E-A", aSN1ObjectIdentifier);
        nameMappings.put("E-B", aSN1ObjectIdentifier2);
        nameMappings.put("E-C", aSN1ObjectIdentifier3);
        nameMappings.put("E-D", aSN1ObjectIdentifier4);
        nameMappings.put("PARAM-Z", aSN1ObjectIdentifier5);
    }

    private GOST28147() {
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen(int i11) {
            super("GOST28147", i11, new CipherKeyGenerator());
        }

        public KeyGen() {
            this(256);
        }
    }

    public static abstract class BaseAlgParams extends BaseAlgorithmParameters {

        /* JADX INFO: renamed from: iv, reason: collision with root package name */
        private byte[] f33305iv;
        private ASN1ObjectIdentifier sBox = CryptoProObjectIdentifiers.id_Gost28147_89_CryptoPro_A_ParamSet;

        public static ASN1ObjectIdentifier getSBoxOID(String str) {
            ASN1ObjectIdentifier aSN1ObjectIdentifier = str != null ? (ASN1ObjectIdentifier) GOST28147.nameMappings.get(Strings.toUpperCase(str)) : null;
            if (aSN1ObjectIdentifier != null) {
                return aSN1ObjectIdentifier;
            }
            a.f(f.k("Unknown SBOX name: ", str));
            return null;
        }

        @Override // java.security.AlgorithmParametersSpi
        public final byte[] engineGetEncoded(String str) throws IOException {
            if (isASN1FormatString(str)) {
                return localGetEncoded();
            }
            a.k(f.k("Unknown parameter format: ", str));
            return null;
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
            if (algorithmParameterSpec instanceof IvParameterSpec) {
                this.f33305iv = ((IvParameterSpec) algorithmParameterSpec).getIV();
                return;
            }
            if (!(algorithmParameterSpec instanceof GOST28147ParameterSpec)) {
                i1.u("IvParameterSpec required to initialise a IV parameters algorithm parameters object");
                return;
            }
            this.f33305iv = ((GOST28147ParameterSpec) algorithmParameterSpec).getIV();
            try {
                this.sBox = getSBoxOID(((GOST28147ParameterSpec) algorithmParameterSpec).getSBox());
            } catch (IllegalArgumentException e5) {
                throw new InvalidParameterSpecException(e5.getMessage());
            }
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters
        public AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
            if (cls == IvParameterSpec.class) {
                return new IvParameterSpec(this.f33305iv);
            }
            if (cls == GOST28147ParameterSpec.class || cls == AlgorithmParameterSpec.class) {
                return new GOST28147ParameterSpec(this.sBox, this.f33305iv);
            }
            throw new InvalidParameterSpecException("AlgorithmParameterSpec not recognized: ".concat(cls.getName()));
        }

        public byte[] localGetEncoded() throws IOException {
            return new GOST28147Parameters(this.f33305iv, this.sBox).getEncoded();
        }

        public abstract void localInit(byte[] bArr) throws IOException;

        @Override // java.security.AlgorithmParametersSpi
        public final byte[] engineGetEncoded() throws IOException {
            return engineGetEncoded("ASN.1");
        }

        public static ASN1ObjectIdentifier getSBoxOID(byte[] bArr) {
            return getSBoxOID(GOST28147Engine.getSBoxName(bArr));
        }

        @Override // java.security.AlgorithmParametersSpi
        public final void engineInit(byte[] bArr) throws IOException {
            engineInit(bArr, "ASN.1");
        }

        @Override // java.security.AlgorithmParametersSpi
        public final void engineInit(byte[] bArr, String str) throws IOException {
            if (bArr == null) {
                w.l("Encoded parameters cannot be null");
                return;
            }
            if (isASN1FormatString(str)) {
                try {
                    localInit(bArr);
                    return;
                } catch (IOException e5) {
                    throw e5;
                } catch (Exception e11) {
                    a.k(k.j(e11, new StringBuilder("Parameter parsing failed: ")));
                    return;
                }
            }
            a.k(f.k("Unknown parameter format: ", str));
        }
    }
}
