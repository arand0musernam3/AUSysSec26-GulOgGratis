package org.bouncycastle.crypto.engines;

import com.braze.h2;
import i4.a;
import j4.s;
import java.security.SecureRandom;
import m0.i1;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.Wrapper;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.util.DigestFactory;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class DESedeWrapEngine implements Wrapper {
    private static final byte[] IV2 = {74, -35, -94, 44, 121, -24, 33, 5};
    private CBCBlockCipher engine;
    private boolean forWrapping;

    /* JADX INFO: renamed from: iv, reason: collision with root package name */
    private byte[] f33107iv;
    private KeyParameter param;
    private ParametersWithIV paramPlusIV;
    Digest sha1 = DigestFactory.createSHA1();
    byte[] digest = new byte[20];

    private byte[] calculateCMSKeyChecksum(byte[] bArr) {
        byte[] bArr2 = new byte[8];
        this.sha1.update(bArr, 0, bArr.length);
        this.sha1.doFinal(this.digest, 0);
        System.arraycopy(this.digest, 0, bArr2, 0, 8);
        return bArr2;
    }

    private boolean checkCMSKeyChecksum(byte[] bArr, byte[] bArr2) {
        return Arrays.constantTimeAreEqual(calculateCMSKeyChecksum(bArr), bArr2);
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public String getAlgorithmName() {
        return "DESede";
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public void init(boolean z11, CipherParameters cipherParameters) {
        SecureRandom secureRandom;
        this.forWrapping = z11;
        this.engine = new CBCBlockCipher(new DESedeEngine());
        if (cipherParameters instanceof ParametersWithRandom) {
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
            CipherParameters parameters = parametersWithRandom.getParameters();
            SecureRandom random = parametersWithRandom.getRandom();
            cipherParameters = parameters;
            secureRandom = random;
        } else {
            secureRandom = CryptoServicesRegistrar.getSecureRandom();
        }
        if (cipherParameters instanceof KeyParameter) {
            this.param = (KeyParameter) cipherParameters;
            if (this.forWrapping) {
                byte[] bArr = new byte[8];
                this.f33107iv = bArr;
                secureRandom.nextBytes(bArr);
                this.paramPlusIV = new ParametersWithIV(this.param, this.f33107iv);
                return;
            }
            return;
        }
        if (cipherParameters instanceof ParametersWithIV) {
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            this.paramPlusIV = parametersWithIV;
            this.f33107iv = parametersWithIV.getIV();
            this.param = (KeyParameter) this.paramPlusIV.getParameters();
            if (!this.forWrapping) {
                a.f("You should not supply an IV for unwrapping");
                return;
            }
            byte[] bArr2 = this.f33107iv;
            if (bArr2 == null || bArr2.length != 8) {
                a.f("IV is not 8 octets");
            }
        }
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public byte[] unwrap(byte[] bArr, int i11, int i12) throws InvalidCipherTextException {
        if (this.forWrapping) {
            h2.b("Not set for unwrapping");
            return null;
        }
        if (bArr == null) {
            i1.i("Null pointer as ciphertext");
            return null;
        }
        int blockSize = this.engine.getBlockSize();
        if (i12 % blockSize != 0) {
            throw new InvalidCipherTextException(s.f(blockSize, "Ciphertext not multiple of "));
        }
        this.engine.init(false, new ParametersWithIV(this.param, IV2));
        byte[] bArr2 = new byte[i12];
        for (int i13 = 0; i13 != i12; i13 += blockSize) {
            this.engine.processBlock(bArr, i11 + i13, bArr2, i13);
        }
        Arrays.reverseInPlace(bArr2);
        byte[] bArr3 = new byte[8];
        this.f33107iv = bArr3;
        int i14 = i12 - 8;
        byte[] bArr4 = new byte[i14];
        System.arraycopy(bArr2, 0, bArr3, 0, 8);
        System.arraycopy(bArr2, 8, bArr4, 0, i14);
        ParametersWithIV parametersWithIV = new ParametersWithIV(this.param, this.f33107iv);
        this.paramPlusIV = parametersWithIV;
        this.engine.init(false, parametersWithIV);
        byte[] bArr5 = new byte[i14];
        for (int i15 = 0; i15 != i14; i15 += blockSize) {
            this.engine.processBlock(bArr4, i15, bArr5, i15);
        }
        int i16 = i12 - 16;
        byte[] bArr6 = new byte[i16];
        byte[] bArr7 = new byte[8];
        System.arraycopy(bArr5, 0, bArr6, 0, i16);
        System.arraycopy(bArr5, i16, bArr7, 0, 8);
        if (checkCMSKeyChecksum(bArr6, bArr7)) {
            return bArr6;
        }
        i1.i("Checksum inside ciphertext is corrupted");
        return null;
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public byte[] wrap(byte[] bArr, int i11, int i12) {
        String str;
        if (this.forWrapping) {
            byte[] bArr2 = new byte[i12];
            System.arraycopy(bArr, i11, bArr2, 0, i12);
            byte[] bArrCalculateCMSKeyChecksum = calculateCMSKeyChecksum(bArr2);
            int length = bArrCalculateCMSKeyChecksum.length + i12;
            byte[] bArr3 = new byte[length];
            System.arraycopy(bArr2, 0, bArr3, 0, i12);
            System.arraycopy(bArrCalculateCMSKeyChecksum, 0, bArr3, i12, bArrCalculateCMSKeyChecksum.length);
            int blockSize = this.engine.getBlockSize();
            if (length % blockSize == 0) {
                this.engine.init(true, this.paramPlusIV);
                byte[] bArr4 = new byte[length];
                for (int i13 = 0; i13 != length; i13 += blockSize) {
                    this.engine.processBlock(bArr3, i13, bArr4, i13);
                }
                byte[] bArr5 = this.f33107iv;
                int length2 = bArr5.length + length;
                byte[] bArr6 = new byte[length2];
                System.arraycopy(bArr5, 0, bArr6, 0, bArr5.length);
                System.arraycopy(bArr4, 0, bArr6, this.f33107iv.length, length);
                Arrays.reverseInPlace(bArr6);
                this.engine.init(true, new ParametersWithIV(this.param, IV2));
                for (int i14 = 0; i14 != length2; i14 += blockSize) {
                    this.engine.processBlock(bArr6, i14, bArr6, i14);
                }
                return bArr6;
            }
            str = "Not multiple of block length";
        } else {
            str = "Not initialized for wrapping";
        }
        h2.b(str);
        return null;
    }
}
