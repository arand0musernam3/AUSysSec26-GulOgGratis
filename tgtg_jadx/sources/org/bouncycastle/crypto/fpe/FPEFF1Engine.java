package org.bouncycastle.crypto.fpe;

import com.braze.h2;
import i4.a;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.engines.AESEngine;
import org.bouncycastle.crypto.params.FPEParameters;
import org.bouncycastle.util.Properties;

/* JADX INFO: loaded from: classes3.dex */
public class FPEFF1Engine extends FPEEngine {
    public FPEFF1Engine(BlockCipher blockCipher) {
        super(blockCipher);
        if (blockCipher.getBlockSize() != 16) {
            a.f("base cipher needs to be 128 bits");
            throw null;
        }
        if (Properties.isOverrideSet("org.bouncycastle.fpe.disable") || Properties.isOverrideSet("org.bouncycastle.fpe.disable_ff1")) {
            h2.a("FF1 encryption disabled");
            throw null;
        }
    }

    @Override // org.bouncycastle.crypto.fpe.FPEEngine
    public int decryptBlock(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) {
        int i14;
        byte[] bArrDecryptFF1;
        int radix = this.fpeParameters.getRadix();
        BlockCipher blockCipher = this.baseCipher;
        if (radix > 256) {
            bArrDecryptFF1 = FPEEngine.toByteArray(SP80038G.decryptFF1w(blockCipher, this.fpeParameters.getRadixConverter(), this.fpeParameters.getTweak(), FPEEngine.toShortArray(bArr), i11, i12 / 2));
            i14 = i12;
        } else {
            i14 = i12;
            bArrDecryptFF1 = SP80038G.decryptFF1(blockCipher, this.fpeParameters.getRadixConverter(), this.fpeParameters.getTweak(), bArr, i11, i14);
        }
        System.arraycopy(bArrDecryptFF1, 0, bArr2, i13, i14);
        return i14;
    }

    @Override // org.bouncycastle.crypto.fpe.FPEEngine
    public int encryptBlock(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) {
        int i14;
        byte[] bArrEncryptFF1;
        int radix = this.fpeParameters.getRadix();
        BlockCipher blockCipher = this.baseCipher;
        if (radix > 256) {
            bArrEncryptFF1 = FPEEngine.toByteArray(SP80038G.encryptFF1w(blockCipher, this.fpeParameters.getRadixConverter(), this.fpeParameters.getTweak(), FPEEngine.toShortArray(bArr), i11, i12 / 2));
            i14 = i12;
        } else {
            i14 = i12;
            bArrEncryptFF1 = SP80038G.encryptFF1(blockCipher, this.fpeParameters.getRadixConverter(), this.fpeParameters.getTweak(), bArr, i11, i14);
        }
        System.arraycopy(bArrEncryptFF1, 0, bArr2, i13, i14);
        return i14;
    }

    @Override // org.bouncycastle.crypto.fpe.FPEEngine
    public String getAlgorithmName() {
        return "FF1";
    }

    @Override // org.bouncycastle.crypto.fpe.FPEEngine
    public void init(boolean z11, CipherParameters cipherParameters) {
        this.forEncryption = z11;
        this.fpeParameters = (FPEParameters) cipherParameters;
        this.baseCipher.init(!r3.isUsingInverseFunction(), this.fpeParameters.getKey());
    }

    public FPEFF1Engine() {
        this(AESEngine.newInstance());
    }
}
