package org.bouncycastle.crypto.encodings;

import i4.a;
import java.math.BigInteger;
import kotlin.jvm.internal.ByteCompanionObject;
import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.params.RSAKeyParameters;

/* JADX INFO: loaded from: classes3.dex */
public class ISO9796d1Encoding implements AsymmetricBlockCipher {
    private int bitSize;
    private AsymmetricBlockCipher engine;
    private boolean forEncryption;
    private BigInteger modulus;
    private int padBits = 0;
    private static final BigInteger SIXTEEN = BigInteger.valueOf(16);
    private static final BigInteger SIX = BigInteger.valueOf(6);
    private static byte[] shadows = {14, 3, 5, 8, 9, 4, 2, 15, 0, 13, 11, 6, 7, 10, 12, 1};
    private static byte[] inverse = {8, 15, 6, 1, 5, 2, 11, 12, 3, 4, 13, 10, 14, 9, 0, 7};

    public ISO9796d1Encoding(AsymmetricBlockCipher asymmetricBlockCipher) {
        this.engine = asymmetricBlockCipher;
    }

    private static byte[] convertOutputDecryptOnly(BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray[0] != 0) {
            return byteArray;
        }
        int length = byteArray.length - 1;
        byte[] bArr = new byte[length];
        System.arraycopy(byteArray, 1, bArr, 0, length);
        return bArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private byte[] decodeBlock(byte[] r11, int r12, int r13) throws org.bouncycastle.crypto.InvalidCipherTextException {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.crypto.encodings.ISO9796d1Encoding.decodeBlock(byte[], int, int):byte[]");
    }

    private byte[] encodeBlock(byte[] bArr, int i11, int i12) throws InvalidCipherTextException {
        int i13 = this.bitSize;
        int i14 = (i13 + 7) / 8;
        byte[] bArr2 = new byte[i14];
        int i15 = 1;
        int i16 = this.padBits + 1;
        int i17 = (i13 + 13) / 16;
        int i18 = 0;
        while (i18 < i17) {
            if (i18 > i17 - i12) {
                int i19 = i17 - i18;
                System.arraycopy(bArr, (i11 + i12) - i19, bArr2, i14 - i17, i19);
            } else {
                System.arraycopy(bArr, i11, bArr2, i14 - (i18 + i12), i12);
            }
            i18 += i12;
        }
        for (int i21 = i14 - (i17 * 2); i21 != i14; i21 += 2) {
            byte b8 = bArr2[(i21 / 2) + (i14 - i17)];
            byte[] bArr3 = shadows;
            bArr2[i21] = (byte) (bArr3[b8 & 15] | (bArr3[(b8 & 255) >>> 4] << 4));
            bArr2[i21 + 1] = b8;
        }
        int i22 = i14 - (i12 * 2);
        bArr2[i22] = (byte) (bArr2[i22] ^ i16);
        int i23 = i14 - 1;
        bArr2[i23] = (byte) ((bArr2[i23] << 4) | 6);
        int i24 = 8 - ((this.bitSize - 1) % 8);
        if (i24 != 8) {
            byte b11 = (byte) (bArr2[0] & (255 >>> i24));
            bArr2[0] = b11;
            bArr2[0] = (byte) ((128 >>> i24) | b11);
            i15 = 0;
        } else {
            bArr2[0] = 0;
            bArr2[1] = (byte) (bArr2[1] | ByteCompanionObject.MIN_VALUE);
        }
        return this.engine.processBlock(bArr2, i15, i14 - i15);
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public int getInputBlockSize() {
        int inputBlockSize = this.engine.getInputBlockSize();
        return this.forEncryption ? (inputBlockSize + 1) / 2 : inputBlockSize;
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public int getOutputBlockSize() {
        int outputBlockSize = this.engine.getOutputBlockSize();
        return this.forEncryption ? outputBlockSize : (outputBlockSize + 1) / 2;
    }

    public int getPadBits() {
        return this.padBits;
    }

    public AsymmetricBlockCipher getUnderlyingCipher() {
        return this.engine;
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public void init(boolean z11, CipherParameters cipherParameters) {
        RSAKeyParameters rSAKeyParameters = cipherParameters instanceof ParametersWithRandom ? (RSAKeyParameters) ((ParametersWithRandom) cipherParameters).getParameters() : (RSAKeyParameters) cipherParameters;
        this.engine.init(z11, cipherParameters);
        BigInteger modulus = rSAKeyParameters.getModulus();
        this.modulus = modulus;
        this.bitSize = modulus.bitLength();
        this.forEncryption = z11;
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public byte[] processBlock(byte[] bArr, int i11, int i12) throws InvalidCipherTextException {
        return this.forEncryption ? encodeBlock(bArr, i11, i12) : decodeBlock(bArr, i11, i12);
    }

    public void setPadBits(int i11) {
        if (i11 <= 7) {
            this.padBits = i11;
        } else {
            a.f("padBits > 7");
        }
    }
}
