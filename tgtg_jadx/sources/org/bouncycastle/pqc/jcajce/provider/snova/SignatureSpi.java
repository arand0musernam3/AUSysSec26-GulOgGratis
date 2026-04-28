package org.bouncycastle.pqc.jcajce.provider.snova;

import java.io.ByteArrayOutputStream;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.jce.provider.a;
import org.bouncycastle.pqc.crypto.snova.SnovaParameters;
import org.bouncycastle.pqc.crypto.snova.SnovaPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.snova.SnovaSigner;
import org.bouncycastle.util.Strings;
import r8.k;

/* JADX INFO: loaded from: classes3.dex */
public class SignatureSpi extends Signature {
    private final ByteArrayOutputStream bOut;
    private final SnovaParameters parameters;
    private SecureRandom random;
    private final SnovaSigner signer;

    public static class Base extends SignatureSpi {
        public Base() {
            super(new SnovaSigner());
        }
    }

    public static class SNOVA_24_5_4_ESK extends SignatureSpi {
        public SNOVA_24_5_4_ESK() {
            super(new SnovaSigner(), SnovaParameters.SNOVA_24_5_4_ESK);
        }
    }

    public static class SNOVA_24_5_4_SHAKE_ESK extends SignatureSpi {
        public SNOVA_24_5_4_SHAKE_ESK() {
            super(new SnovaSigner(), SnovaParameters.SNOVA_24_5_4_SHAKE_ESK);
        }
    }

    public static class SNOVA_24_5_4_SHAKE_SSK extends SignatureSpi {
        public SNOVA_24_5_4_SHAKE_SSK() {
            super(new SnovaSigner(), SnovaParameters.SNOVA_24_5_4_SHAKE_SSK);
        }
    }

    public static class SNOVA_24_5_4_SSK extends SignatureSpi {
        public SNOVA_24_5_4_SSK() {
            super(new SnovaSigner(), SnovaParameters.SNOVA_24_5_4_SSK);
        }
    }

    public static class SNOVA_24_5_5_ESK extends SignatureSpi {
        public SNOVA_24_5_5_ESK() {
            super(new SnovaSigner(), SnovaParameters.SNOVA_24_5_5_ESK);
        }
    }

    public static class SNOVA_24_5_5_SHAKE_ESK extends SignatureSpi {
        public SNOVA_24_5_5_SHAKE_ESK() {
            super(new SnovaSigner(), SnovaParameters.SNOVA_24_5_5_SHAKE_ESK);
        }
    }

    public static class SNOVA_24_5_5_SHAKE_SSK extends SignatureSpi {
        public SNOVA_24_5_5_SHAKE_SSK() {
            super(new SnovaSigner(), SnovaParameters.SNOVA_24_5_5_SHAKE_SSK);
        }
    }

    public static class SNOVA_24_5_5_SSK extends SignatureSpi {
        public SNOVA_24_5_5_SSK() {
            super(new SnovaSigner(), SnovaParameters.SNOVA_24_5_5_SSK);
        }
    }

    public static class SNOVA_25_8_3_ESK extends SignatureSpi {
        public SNOVA_25_8_3_ESK() {
            super(new SnovaSigner(), SnovaParameters.SNOVA_25_8_3_ESK);
        }
    }

    public static class SNOVA_25_8_3_SHAKE_ESK extends SignatureSpi {
        public SNOVA_25_8_3_SHAKE_ESK() {
            super(new SnovaSigner(), SnovaParameters.SNOVA_25_8_3_SHAKE_ESK);
        }
    }

    public static class SNOVA_25_8_3_SHAKE_SSK extends SignatureSpi {
        public SNOVA_25_8_3_SHAKE_SSK() {
            super(new SnovaSigner(), SnovaParameters.SNOVA_25_8_3_SHAKE_SSK);
        }
    }

    public static class SNOVA_25_8_3_SSK extends SignatureSpi {
        public SNOVA_25_8_3_SSK() {
            super(new SnovaSigner(), SnovaParameters.SNOVA_25_8_3_SSK);
        }
    }

    public static class SNOVA_29_6_5_ESK extends SignatureSpi {
        public SNOVA_29_6_5_ESK() {
            super(new SnovaSigner(), SnovaParameters.SNOVA_29_6_5_ESK);
        }
    }

    public static class SNOVA_29_6_5_SHAKE_ESK extends SignatureSpi {
        public SNOVA_29_6_5_SHAKE_ESK() {
            super(new SnovaSigner(), SnovaParameters.SNOVA_29_6_5_SHAKE_ESK);
        }
    }

    public static class SNOVA_29_6_5_SHAKE_SSK extends SignatureSpi {
        public SNOVA_29_6_5_SHAKE_SSK() {
            super(new SnovaSigner(), SnovaParameters.SNOVA_29_6_5_SHAKE_SSK);
        }
    }

    public static class SNOVA_29_6_5_SSK extends SignatureSpi {
        public SNOVA_29_6_5_SSK() {
            super(new SnovaSigner(), SnovaParameters.SNOVA_29_6_5_SSK);
        }
    }

    public static class SNOVA_37_17_2_ESK extends SignatureSpi {
        public SNOVA_37_17_2_ESK() {
            super(new SnovaSigner(), SnovaParameters.SNOVA_37_17_2_ESK);
        }
    }

    public static class SNOVA_37_17_2_SHAKE_ESK extends SignatureSpi {
        public SNOVA_37_17_2_SHAKE_ESK() {
            super(new SnovaSigner(), SnovaParameters.SNOVA_37_17_2_SHAKE_ESK);
        }
    }

    public static class SNOVA_37_17_2_SHAKE_SSK extends SignatureSpi {
        public SNOVA_37_17_2_SHAKE_SSK() {
            super(new SnovaSigner(), SnovaParameters.SNOVA_37_17_2_SHAKE_SSK);
        }
    }

    public static class SNOVA_37_17_2_SSK extends SignatureSpi {
        public SNOVA_37_17_2_SSK() {
            super(new SnovaSigner(), SnovaParameters.SNOVA_37_17_2_SSK);
        }
    }

    public static class SNOVA_37_8_4_ESK extends SignatureSpi {
        public SNOVA_37_8_4_ESK() {
            super(new SnovaSigner(), SnovaParameters.SNOVA_37_8_4_ESK);
        }
    }

    public static class SNOVA_37_8_4_SHAKE_ESK extends SignatureSpi {
        public SNOVA_37_8_4_SHAKE_ESK() {
            super(new SnovaSigner(), SnovaParameters.SNOVA_37_8_4_SHAKE_ESK);
        }
    }

    public static class SNOVA_37_8_4_SHAKE_SSK extends SignatureSpi {
        public SNOVA_37_8_4_SHAKE_SSK() {
            super(new SnovaSigner(), SnovaParameters.SNOVA_37_8_4_SHAKE_SSK);
        }
    }

    public static class SNOVA_37_8_4_SSK extends SignatureSpi {
        public SNOVA_37_8_4_SSK() {
            super(new SnovaSigner(), SnovaParameters.SNOVA_37_8_4_SSK);
        }
    }

    public static class SNOVA_49_11_3_ESK extends SignatureSpi {
        public SNOVA_49_11_3_ESK() {
            super(new SnovaSigner(), SnovaParameters.SNOVA_49_11_3_ESK);
        }
    }

    public static class SNOVA_49_11_3_SHAKE_ESK extends SignatureSpi {
        public SNOVA_49_11_3_SHAKE_ESK() {
            super(new SnovaSigner(), SnovaParameters.SNOVA_49_11_3_SHAKE_ESK);
        }
    }

    public static class SNOVA_49_11_3_SHAKE_SSK extends SignatureSpi {
        public SNOVA_49_11_3_SHAKE_SSK() {
            super(new SnovaSigner(), SnovaParameters.SNOVA_49_11_3_SHAKE_SSK);
        }
    }

    public static class SNOVA_49_11_3_SSK extends SignatureSpi {
        public SNOVA_49_11_3_SSK() {
            super(new SnovaSigner(), SnovaParameters.SNOVA_49_11_3_SSK);
        }
    }

    public static class SNOVA_56_25_2_ESK extends SignatureSpi {
        public SNOVA_56_25_2_ESK() {
            super(new SnovaSigner(), SnovaParameters.SNOVA_56_25_2_ESK);
        }
    }

    public static class SNOVA_56_25_2_SHAKE_ESK extends SignatureSpi {
        public SNOVA_56_25_2_SHAKE_ESK() {
            super(new SnovaSigner(), SnovaParameters.SNOVA_56_25_2_SHAKE_ESK);
        }
    }

    public static class SNOVA_56_25_2_SHAKE_SSK extends SignatureSpi {
        public SNOVA_56_25_2_SHAKE_SSK() {
            super(new SnovaSigner(), SnovaParameters.SNOVA_56_25_2_SHAKE_SSK);
        }
    }

    public static class SNOVA_56_25_2_SSK extends SignatureSpi {
        public SNOVA_56_25_2_SSK() {
            super(new SnovaSigner(), SnovaParameters.SNOVA_56_25_2_SSK);
        }
    }

    public static class SNOVA_60_10_4_ESK extends SignatureSpi {
        public SNOVA_60_10_4_ESK() {
            super(new SnovaSigner(), SnovaParameters.SNOVA_60_10_4_ESK);
        }
    }

    public static class SNOVA_60_10_4_SHAKE_ESK extends SignatureSpi {
        public SNOVA_60_10_4_SHAKE_ESK() {
            super(new SnovaSigner(), SnovaParameters.SNOVA_60_10_4_SHAKE_ESK);
        }
    }

    public static class SNOVA_60_10_4_SHAKE_SSK extends SignatureSpi {
        public SNOVA_60_10_4_SHAKE_SSK() {
            super(new SnovaSigner(), SnovaParameters.SNOVA_60_10_4_SHAKE_SSK);
        }
    }

    public static class SNOVA_60_10_4_SSK extends SignatureSpi {
        public SNOVA_60_10_4_SSK() {
            super(new SnovaSigner(), SnovaParameters.SNOVA_60_10_4_SSK);
        }
    }

    public static class SNOVA_66_15_3_ESK extends SignatureSpi {
        public SNOVA_66_15_3_ESK() {
            super(new SnovaSigner(), SnovaParameters.SNOVA_66_15_3_ESK);
        }
    }

    public static class SNOVA_66_15_3_SHAKE_ESK extends SignatureSpi {
        public SNOVA_66_15_3_SHAKE_ESK() {
            super(new SnovaSigner(), SnovaParameters.SNOVA_66_15_3_SHAKE_ESK);
        }
    }

    public static class SNOVA_66_15_3_SHAKE_SSK extends SignatureSpi {
        public SNOVA_66_15_3_SHAKE_SSK() {
            super(new SnovaSigner(), SnovaParameters.SNOVA_66_15_3_SHAKE_SSK);
        }
    }

    public static class SNOVA_66_15_3_SSK extends SignatureSpi {
        public SNOVA_66_15_3_SSK() {
            super(new SnovaSigner(), SnovaParameters.SNOVA_66_15_3_SSK);
        }
    }

    public static class SNOVA_75_33_2_ESK extends SignatureSpi {
        public SNOVA_75_33_2_ESK() {
            super(new SnovaSigner(), SnovaParameters.SNOVA_75_33_2_ESK);
        }
    }

    public static class SNOVA_75_33_2_SHAKE_ESK extends SignatureSpi {
        public SNOVA_75_33_2_SHAKE_ESK() {
            super(new SnovaSigner(), SnovaParameters.SNOVA_75_33_2_SHAKE_ESK);
        }
    }

    public static class SNOVA_75_33_2_SHAKE_SSK extends SignatureSpi {
        public SNOVA_75_33_2_SHAKE_SSK() {
            super(new SnovaSigner(), SnovaParameters.SNOVA_75_33_2_SHAKE_SSK);
        }
    }

    public static class SNOVA_75_33_2_SSK extends SignatureSpi {
        public SNOVA_75_33_2_SSK() {
            super(new SnovaSigner(), SnovaParameters.SNOVA_75_33_2_SSK);
        }
    }

    public SignatureSpi(SnovaSigner snovaSigner, SnovaParameters snovaParameters) {
        super(Strings.toUpperCase(snovaParameters.getName()));
        this.parameters = snovaParameters;
        this.bOut = new ByteArrayOutputStream();
        this.signer = snovaSigner;
    }

    @Override // java.security.SignatureSpi
    public Object engineGetParameter(String str) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    public void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
        if (!(privateKey instanceof BCSnovaPrivateKey)) {
            a.i("unknown private key passed to Snova");
            return;
        }
        BCSnovaPrivateKey bCSnovaPrivateKey = (BCSnovaPrivateKey) privateKey;
        SnovaPrivateKeyParameters keyParams = bCSnovaPrivateKey.getKeyParams();
        SnovaParameters snovaParameters = this.parameters;
        if (snovaParameters != null) {
            String upperCase = Strings.toUpperCase(snovaParameters.getName());
            if (!upperCase.equals(bCSnovaPrivateKey.getAlgorithm())) {
                throw new InvalidKeyException("signature configured for ".concat(upperCase));
            }
        }
        SecureRandom secureRandom = this.random;
        SnovaSigner snovaSigner = this.signer;
        if (secureRandom != null) {
            snovaSigner.init(true, new ParametersWithRandom(keyParams, secureRandom));
        } else {
            snovaSigner.init(true, keyParams);
        }
    }

    @Override // java.security.SignatureSpi
    public void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
        if (!(publicKey instanceof BCSnovaPublicKey)) {
            try {
                publicKey = new BCSnovaPublicKey(SubjectPublicKeyInfo.getInstance(publicKey.getEncoded()));
            } catch (Exception e5) {
                throw new InvalidKeyException(k.j(e5, new StringBuilder("unknown public key passed to Snova: ")));
            }
        }
        BCSnovaPublicKey bCSnovaPublicKey = (BCSnovaPublicKey) publicKey;
        SnovaParameters snovaParameters = this.parameters;
        if (snovaParameters != null) {
            String upperCase = Strings.toUpperCase(snovaParameters.getName());
            if (!upperCase.equals(bCSnovaPublicKey.getAlgorithm())) {
                throw new InvalidKeyException("signature configured for ".concat(upperCase));
            }
        }
        this.signer.init(false, bCSnovaPublicKey.getKeyParams());
    }

    @Override // java.security.SignatureSpi
    public void engineSetParameter(String str, Object obj) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    public byte[] engineSign() throws SignatureException {
        try {
            byte[] byteArray = this.bOut.toByteArray();
            this.bOut.reset();
            return this.signer.generateSignature(byteArray);
        } catch (Exception e5) {
            a.f(e5);
            return null;
        }
    }

    @Override // java.security.SignatureSpi
    public void engineUpdate(byte b8) throws SignatureException {
        this.bOut.write(b8);
    }

    @Override // java.security.SignatureSpi
    public boolean engineVerify(byte[] bArr) throws SignatureException {
        byte[] byteArray = this.bOut.toByteArray();
        this.bOut.reset();
        return this.signer.verifySignature(byteArray, bArr);
    }

    @Override // java.security.SignatureSpi
    public void engineUpdate(byte[] bArr, int i11, int i12) throws SignatureException {
        this.bOut.write(bArr, i11, i12);
    }

    @Override // java.security.SignatureSpi
    public void engineSetParameter(AlgorithmParameterSpec algorithmParameterSpec) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    public SignatureSpi(SnovaSigner snovaSigner) {
        super("Snova");
        this.bOut = new ByteArrayOutputStream();
        this.signer = snovaSigner;
        this.parameters = null;
    }

    @Override // java.security.SignatureSpi
    public void engineInitSign(PrivateKey privateKey, SecureRandom secureRandom) throws InvalidKeyException {
        this.random = secureRandom;
        engineInitSign(privateKey);
    }
}
