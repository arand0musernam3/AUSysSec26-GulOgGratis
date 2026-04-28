package org.bouncycastle.pqc.crypto.hqc;

import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* JADX INFO: loaded from: classes3.dex */
public class HQCKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
    private int N_BYTE;
    private int delta;
    private HQCKeyGenerationParameters hqcKeyGenerationParameters;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f33507k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f33508n;
    private SecureRandom random;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f33509w;

    /* JADX INFO: renamed from: we, reason: collision with root package name */
    private int f33510we;

    /* JADX INFO: renamed from: wr, reason: collision with root package name */
    private int f33511wr;

    private AsymmetricCipherKeyPair genKeyPair(byte[] bArr) {
        HQCEngine engine = this.hqcKeyGenerationParameters.getParameters().getEngine();
        int i11 = this.N_BYTE;
        byte[] bArr2 = new byte[i11 + 40];
        byte[] bArr3 = new byte[this.f33507k + 80 + i11];
        engine.genKeyPair(bArr2, bArr3, bArr);
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) new HQCPublicKeyParameters(this.hqcKeyGenerationParameters.getParameters(), bArr2), (AsymmetricKeyParameter) new HQCPrivateKeyParameters(this.hqcKeyGenerationParameters.getParameters(), bArr3));
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() {
        byte[] bArr = new byte[48];
        this.random.nextBytes(bArr);
        return genKeyPair(bArr);
    }

    public AsymmetricCipherKeyPair generateKeyPairWithSeed(byte[] bArr) {
        return genKeyPair(bArr);
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        this.hqcKeyGenerationParameters = (HQCKeyGenerationParameters) keyGenerationParameters;
        this.random = keyGenerationParameters.getRandom();
        this.f33508n = this.hqcKeyGenerationParameters.getParameters().getN();
        this.f33507k = this.hqcKeyGenerationParameters.getParameters().getK();
        this.delta = this.hqcKeyGenerationParameters.getParameters().getDelta();
        this.f33509w = this.hqcKeyGenerationParameters.getParameters().getW();
        this.f33511wr = this.hqcKeyGenerationParameters.getParameters().getWr();
        this.f33510we = this.hqcKeyGenerationParameters.getParameters().getWe();
        this.N_BYTE = (this.f33508n + 7) / 8;
    }
}
