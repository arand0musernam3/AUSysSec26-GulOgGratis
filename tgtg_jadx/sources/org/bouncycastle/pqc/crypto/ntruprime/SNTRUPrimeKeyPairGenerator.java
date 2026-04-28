package org.bouncycastle.pqc.crypto.ntruprime;

import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class SNTRUPrimeKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
    private SNTRUPrimeKeyGenerationParameters params;

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() {
        int p7 = this.params.getSntrupParams().getP();
        int q7 = this.params.getSntrupParams().getQ();
        int w10 = this.params.getSntrupParams().getW();
        byte[] bArr = new byte[p7];
        byte[] bArr2 = new byte[p7];
        do {
            Utils.getRandomSmallPolynomial(this.params.getRandom(), bArr);
        } while (!Utils.isInvertiblePolynomialInR3(bArr, bArr2, p7));
        byte[] bArr3 = new byte[p7];
        Utils.getRandomShortPolynomial(this.params.getRandom(), bArr3, p7, w10);
        short[] sArr = new short[p7];
        Utils.getOneThirdInverseInRQ(sArr, bArr3, p7, q7);
        short[] sArr2 = new short[p7];
        Utils.multiplicationInRQ(sArr2, sArr, bArr, p7, q7);
        byte[] bArr4 = new byte[this.params.getSntrupParams().getPublicKeyBytes()];
        Utils.getEncodedPolynomial(bArr4, sArr2, p7, q7);
        SNTRUPrimePublicKeyParameters sNTRUPrimePublicKeyParameters = new SNTRUPrimePublicKeyParameters(this.params.getSntrupParams(), bArr4);
        int i11 = (p7 + 3) / 4;
        byte[] bArr5 = new byte[i11];
        Utils.getEncodedSmallPolynomial(bArr5, bArr3, p7);
        byte[] bArr6 = new byte[i11];
        Utils.getEncodedSmallPolynomial(bArr6, bArr2, p7);
        byte[] bArr7 = new byte[i11];
        this.params.getRandom().nextBytes(bArr7);
        byte[] hashWithPrefix = Utils.getHashWithPrefix(new byte[]{4}, bArr4);
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) sNTRUPrimePublicKeyParameters, (AsymmetricKeyParameter) new SNTRUPrimePrivateKeyParameters(this.params.getSntrupParams(), bArr5, bArr6, bArr4, bArr7, Arrays.copyOfRange(hashWithPrefix, 0, hashWithPrefix.length / 2)));
    }

    public SNTRUPrimeKeyGenerationParameters getParams() {
        return this.params;
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        this.params = (SNTRUPrimeKeyGenerationParameters) keyGenerationParameters;
    }
}
