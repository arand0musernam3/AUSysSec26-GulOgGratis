package org.bouncycastle.crypto.engines;

import com.braze.h2;
import i4.a;
import j4.s;
import m0.i1;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.KeyParameter;

/* JADX INFO: loaded from: classes3.dex */
public class DESedeEngine extends DESBase implements BlockCipher {
    protected static final int BLOCK_SIZE = 8;
    private boolean forEncryption;
    private int[] workingKey1 = null;
    private int[] workingKey2 = null;
    private int[] workingKey3 = null;

    public DESedeEngine() {
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), bitsOfSecurity()));
    }

    private int bitsOfSecurity() {
        int[] iArr = this.workingKey1;
        return (iArr == null || iArr != this.workingKey3) ? 112 : 80;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "DESede";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 8;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z11, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof KeyParameter)) {
            a.f(s.n("invalid parameter passed to DESede init - ", cipherParameters));
            return;
        }
        byte[] key = ((KeyParameter) cipherParameters).getKey();
        if (key.length != 24 && key.length != 16) {
            a.f("key size must be 16 or 24 bytes.");
            return;
        }
        this.forEncryption = z11;
        byte[] bArr = new byte[8];
        System.arraycopy(key, 0, bArr, 0, 8);
        this.workingKey1 = generateWorkingKey(z11, bArr);
        byte[] bArr2 = new byte[8];
        System.arraycopy(key, 8, bArr2, 0, 8);
        this.workingKey2 = generateWorkingKey(!z11, bArr2);
        if (key.length == 24) {
            byte[] bArr3 = new byte[8];
            System.arraycopy(key, 16, bArr3, 0, 8);
            this.workingKey3 = generateWorkingKey(z11, bArr3);
        } else {
            this.workingKey3 = this.workingKey1;
        }
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), bitsOfSecurity(), cipherParameters, Utils.getPurpose(this.forEncryption)));
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i11, byte[] bArr2, int i12) {
        int[] iArr = this.workingKey1;
        if (iArr == null) {
            h2.b("DESede engine not initialised");
            return 0;
        }
        if (i11 + 8 > bArr.length) {
            i1.t("input buffer too short");
            return 0;
        }
        if (i12 + 8 > bArr2.length) {
            i1.r("output buffer too short");
            return 0;
        }
        byte[] bArr3 = new byte[8];
        if (this.forEncryption) {
            desFunc(iArr, bArr, i11, bArr3, 0);
            desFunc(this.workingKey2, bArr3, 0, bArr3, 0);
            desFunc(this.workingKey3, bArr3, 0, bArr2, i12);
        } else {
            desFunc(this.workingKey3, bArr, i11, bArr3, 0);
            desFunc(this.workingKey2, bArr3, 0, bArr3, 0);
            desFunc(this.workingKey1, bArr3, 0, bArr2, i12);
        }
        return 8;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }
}
