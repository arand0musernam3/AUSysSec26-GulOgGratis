package org.bouncycastle.crypto.macs;

import e40.a;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.modes.GCMModeCipher;
import org.bouncycastle.crypto.params.AEADParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;

/* JADX INFO: loaded from: classes3.dex */
public class GMac implements Mac {
    private final GCMModeCipher cipher;
    private final int macSizeBits;

    public GMac(GCMModeCipher gCMModeCipher) {
        this.cipher = gCMModeCipher;
        this.macSizeBits = 128;
    }

    @Override // org.bouncycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i11) throws IllegalStateException, DataLengthException {
        try {
            return this.cipher.doFinal(bArr, i11);
        } catch (InvalidCipherTextException e5) {
            a.g(e5);
            return 0;
        }
    }

    @Override // org.bouncycastle.crypto.Mac
    public String getAlgorithmName() {
        return this.cipher.getUnderlyingCipher().getAlgorithmName() + "-GMAC";
    }

    @Override // org.bouncycastle.crypto.Mac
    public int getMacSize() {
        return this.macSizeBits / 8;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void init(CipherParameters cipherParameters) throws IllegalArgumentException {
        if (!(cipherParameters instanceof ParametersWithIV)) {
            i4.a.f("GMAC requires ParametersWithIV");
            return;
        }
        ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
        byte[] iv2 = parametersWithIV.getIV();
        this.cipher.init(true, new AEADParameters((KeyParameter) parametersWithIV.getParameters(), this.macSizeBits, iv2));
    }

    @Override // org.bouncycastle.crypto.Mac
    public void reset() {
        this.cipher.reset();
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte b8) throws IllegalStateException {
        this.cipher.processAADByte(b8);
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte[] bArr, int i11, int i12) throws IllegalStateException, DataLengthException {
        this.cipher.processAADBytes(bArr, i11, i12);
    }

    public GMac(GCMModeCipher gCMModeCipher, int i11) {
        this.cipher = gCMModeCipher;
        this.macSizeBits = i11;
    }
}
