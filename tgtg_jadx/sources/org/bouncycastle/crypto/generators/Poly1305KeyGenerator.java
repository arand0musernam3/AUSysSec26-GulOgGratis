package org.bouncycastle.crypto.generators;

import i4.a;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.KeyGenerationParameters;

/* JADX INFO: loaded from: classes3.dex */
public class Poly1305KeyGenerator extends CipherKeyGenerator {
    private static final byte R_MASK_HIGH_4 = 15;
    private static final byte R_MASK_LOW_2 = -4;

    public static void checkKey(byte[] bArr) {
        if (bArr.length != 32) {
            a.f("Poly1305 key must be 256 bits.");
            return;
        }
        checkMask(bArr[3], R_MASK_HIGH_4);
        checkMask(bArr[7], R_MASK_HIGH_4);
        checkMask(bArr[11], R_MASK_HIGH_4);
        checkMask(bArr[15], R_MASK_HIGH_4);
        checkMask(bArr[4], R_MASK_LOW_2);
        checkMask(bArr[8], R_MASK_LOW_2);
        checkMask(bArr[12], R_MASK_LOW_2);
    }

    private static void checkMask(byte b8, byte b11) {
        if ((b8 & (~b11)) == 0) {
            return;
        }
        a.f("Invalid format for r portion of Poly1305 key.");
    }

    public static void clamp(byte[] bArr) {
        if (bArr.length != 32) {
            a.f("Poly1305 key must be 256 bits.");
            return;
        }
        bArr[3] = (byte) (bArr[3] & R_MASK_HIGH_4);
        bArr[7] = (byte) (bArr[7] & R_MASK_HIGH_4);
        bArr[11] = (byte) (bArr[11] & R_MASK_HIGH_4);
        bArr[15] = (byte) (bArr[15] & R_MASK_HIGH_4);
        bArr[4] = (byte) (bArr[4] & R_MASK_LOW_2);
        bArr[8] = (byte) (bArr[8] & R_MASK_LOW_2);
        bArr[12] = (byte) (bArr[12] & R_MASK_LOW_2);
    }

    @Override // org.bouncycastle.crypto.CipherKeyGenerator
    public byte[] generateKey() {
        byte[] bArrGenerateKey = super.generateKey();
        clamp(bArrGenerateKey);
        return bArrGenerateKey;
    }

    @Override // org.bouncycastle.crypto.CipherKeyGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        super.init(new KeyGenerationParameters(keyGenerationParameters.getRandom(), 256));
    }
}
