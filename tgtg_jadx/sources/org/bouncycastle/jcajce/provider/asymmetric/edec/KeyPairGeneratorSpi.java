package org.bouncycastle.jcajce.provider.asymmetric.edec;

import com.braze.h2;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.ECGenParameterSpec;
import m0.i1;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.generators.Ed25519KeyPairGenerator;
import org.bouncycastle.crypto.generators.Ed448KeyPairGenerator;
import org.bouncycastle.crypto.generators.X25519KeyPairGenerator;
import org.bouncycastle.crypto.generators.X448KeyPairGenerator;
import org.bouncycastle.crypto.params.Ed25519KeyGenerationParameters;
import org.bouncycastle.crypto.params.Ed448KeyGenerationParameters;
import org.bouncycastle.crypto.params.X25519KeyGenerationParameters;
import org.bouncycastle.crypto.params.X448KeyGenerationParameters;
import org.bouncycastle.internal.asn1.edec.EdECObjectIdentifiers;
import org.bouncycastle.jcajce.provider.asymmetric.a;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jcajce.spec.EdDSAParameterSpec;
import org.bouncycastle.jcajce.spec.XDHParameterSpec;
import org.bouncycastle.jce.spec.ECNamedCurveGenParameterSpec;

/* JADX INFO: loaded from: classes3.dex */
public class KeyPairGeneratorSpi extends java.security.KeyPairGeneratorSpi {
    private static final int Ed25519 = 1;
    private static final int Ed448 = 2;
    private static final int EdDSA = -1;
    private static final int X25519 = 3;
    private static final int X448 = 4;
    private static final int XDH = -2;
    private final int algorithmDeclared;
    private int algorithmInitialized;
    private AsymmetricCipherKeyPairGenerator generator;
    private SecureRandom secureRandom;

    public static final class Ed25519 extends KeyPairGeneratorSpi {
        public Ed25519() {
            super(1);
        }
    }

    public static final class Ed448 extends KeyPairGeneratorSpi {
        public Ed448() {
            super(2);
        }
    }

    public static final class EdDSA extends KeyPairGeneratorSpi {
        public EdDSA() {
            super(-1);
        }
    }

    public static final class X25519 extends KeyPairGeneratorSpi {
        public X25519() {
            super(3);
        }
    }

    public static final class X448 extends KeyPairGeneratorSpi {
        public X448() {
            super(4);
        }
    }

    public static final class XDH extends KeyPairGeneratorSpi {
        public XDH() {
            super(KeyPairGeneratorSpi.XDH);
        }
    }

    public KeyPairGeneratorSpi(int i11) {
        this.algorithmDeclared = i11;
        if (getAlgorithmFamily(i11) != i11) {
            this.algorithmInitialized = i11;
        }
    }

    private static int getAlgorithmFamily(int i11) {
        if (i11 == 1 || i11 == 2) {
            return -1;
        }
        return (i11 == 3 || i11 == 4) ? XDH : i11;
    }

    private static int getAlgorithmForName(String str) throws InvalidAlgorithmParameterException {
        if (str.equalsIgnoreCase(XDHParameterSpec.X25519) || str.equals(EdECObjectIdentifiers.id_X25519.getId())) {
            return 3;
        }
        if (str.equalsIgnoreCase(EdDSAParameterSpec.Ed25519) || str.equals(EdECObjectIdentifiers.id_Ed25519.getId())) {
            return 1;
        }
        if (str.equalsIgnoreCase(XDHParameterSpec.X448) || str.equals(EdECObjectIdentifiers.id_X448.getId())) {
            return 4;
        }
        if (str.equalsIgnoreCase(EdDSAParameterSpec.Ed448) || str.equals(EdECObjectIdentifiers.id_Ed448.getId())) {
            return 2;
        }
        throw new InvalidAlgorithmParameterException("invalid parameterSpec name: ".concat(str));
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001a, code lost:
    
        if (r5 == 4) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0034, code lost:
    
        if (r5 == 3) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int getAlgorithmForStrength(int r5) {
        /*
            r4 = this;
            r0 = 255(0xff, float:3.57E-43)
            java.lang.String r1 = "key size not configurable"
            r2 = -1
            r3 = -2
            if (r5 == r0) goto L2a
            r0 = 256(0x100, float:3.59E-43)
            if (r5 == r0) goto L2a
            r0 = 448(0x1c0, float:6.28E-43)
            if (r5 != r0) goto L24
            int r5 = r4.algorithmDeclared
            r0 = 4
            if (r5 == r3) goto L23
            r3 = 2
            if (r5 == r2) goto L22
            if (r5 == r3) goto L22
            if (r5 != r0) goto L1d
            goto L23
        L1d:
            org.bouncycastle.jce.provider.a.t(r1)
        L20:
            r5 = 0
            return r5
        L22:
            return r3
        L23:
            return r0
        L24:
            java.lang.String r5 = "unknown key size"
            org.bouncycastle.jce.provider.a.t(r5)
            goto L20
        L2a:
            int r5 = r4.algorithmDeclared
            r0 = 3
            if (r5 == r3) goto L38
            r3 = 1
            if (r5 == r2) goto L37
            if (r5 == r3) goto L37
            if (r5 != r0) goto L1d
            goto L38
        L37:
            return r3
        L38:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jcajce.provider.asymmetric.edec.KeyPairGeneratorSpi.getAlgorithmForStrength(int):int");
    }

    private static String getNameFromParams(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
        return algorithmParameterSpec instanceof ECGenParameterSpec ? ((ECGenParameterSpec) algorithmParameterSpec).getName() : algorithmParameterSpec instanceof ECNamedCurveGenParameterSpec ? ((ECNamedCurveGenParameterSpec) algorithmParameterSpec).getName() : algorithmParameterSpec instanceof EdDSAParameterSpec ? ((EdDSAParameterSpec) algorithmParameterSpec).getCurveName() : algorithmParameterSpec instanceof XDHParameterSpec ? ((XDHParameterSpec) algorithmParameterSpec).getCurveName() : ECUtil.getNameFrom(algorithmParameterSpec);
    }

    private AsymmetricCipherKeyPairGenerator setupGenerator() {
        if (this.secureRandom == null) {
            this.secureRandom = CryptoServicesRegistrar.getSecureRandom();
        }
        int i11 = this.algorithmInitialized;
        if (i11 == 1) {
            Ed25519KeyPairGenerator ed25519KeyPairGenerator = new Ed25519KeyPairGenerator();
            ed25519KeyPairGenerator.init(new Ed25519KeyGenerationParameters(this.secureRandom));
            return ed25519KeyPairGenerator;
        }
        if (i11 == 2) {
            Ed448KeyPairGenerator ed448KeyPairGenerator = new Ed448KeyPairGenerator();
            ed448KeyPairGenerator.init(new Ed448KeyGenerationParameters(this.secureRandom));
            return ed448KeyPairGenerator;
        }
        if (i11 == 3) {
            X25519KeyPairGenerator x25519KeyPairGenerator = new X25519KeyPairGenerator();
            x25519KeyPairGenerator.init(new X25519KeyGenerationParameters(this.secureRandom));
            return x25519KeyPairGenerator;
        }
        if (i11 != 4) {
            h2.b("generator not correctly initialized");
            return null;
        }
        X448KeyPairGenerator x448KeyPairGenerator = new X448KeyPairGenerator();
        x448KeyPairGenerator.init(new X448KeyGenerationParameters(this.secureRandom));
        return x448KeyPairGenerator;
    }

    @Override // java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        if (this.algorithmInitialized != 0) {
            if (this.generator == null) {
                this.generator = setupGenerator();
            }
            AsymmetricCipherKeyPair asymmetricCipherKeyPairGenerateKeyPair = this.generator.generateKeyPair();
            int i11 = this.algorithmInitialized;
            if (i11 == 1 || i11 == 2) {
                return new KeyPair(new BCEdDSAPublicKey(asymmetricCipherKeyPairGenerateKeyPair.getPublic()), new BCEdDSAPrivateKey(asymmetricCipherKeyPairGenerateKeyPair.getPrivate()));
            }
            if (i11 == 3 || i11 == 4) {
                return new KeyPair(new BCXDHPublicKey(asymmetricCipherKeyPairGenerateKeyPair.getPublic()), new BCXDHPrivateKey(asymmetricCipherKeyPairGenerateKeyPair.getPrivate()));
            }
        }
        h2.b("generator not correctly initialized");
        return null;
    }

    @Override // java.security.KeyPairGeneratorSpi
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        String nameFromParams = getNameFromParams(algorithmParameterSpec);
        if (nameFromParams == null) {
            throw new InvalidAlgorithmParameterException(a.g("invalid parameterSpec: ", algorithmParameterSpec));
        }
        int algorithmForName = getAlgorithmForName(nameFromParams);
        int i11 = this.algorithmDeclared;
        if (i11 != algorithmForName && i11 != getAlgorithmFamily(algorithmForName)) {
            i1.v("parameterSpec for wrong curve type");
            return;
        }
        this.algorithmInitialized = algorithmForName;
        this.secureRandom = secureRandom;
        this.generator = null;
    }

    @Override // java.security.KeyPairGeneratorSpi
    public void initialize(int i11, SecureRandom secureRandom) {
        this.algorithmInitialized = getAlgorithmForStrength(i11);
        this.secureRandom = secureRandom;
        this.generator = null;
    }
}
