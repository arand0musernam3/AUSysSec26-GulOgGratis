package org.bouncycastle.crypto.engines;

import com.braze.h2;
import i4.a;
import m0.i1;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Wrapper;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.crypto.params.ParametersWithRandom;

/* JADX INFO: loaded from: classes3.dex */
public class RFC3394WrapEngine implements Wrapper {
    private static final byte[] DEFAULT_IV = {-90, -90, -90, -90, -90, -90, -90, -90};
    private final BlockCipher engine;
    private boolean forWrapping;

    /* JADX INFO: renamed from: iv, reason: collision with root package name */
    private final byte[] f33127iv;
    private KeyParameter param;
    private final boolean wrapCipherMode;

    public RFC3394WrapEngine(BlockCipher blockCipher, boolean z11) {
        this.f33127iv = new byte[8];
        this.param = null;
        this.forWrapping = true;
        this.engine = blockCipher;
        this.wrapCipherMode = !z11;
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public String getAlgorithmName() {
        return this.engine.getAlgorithmName();
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public void init(boolean z11, CipherParameters cipherParameters) {
        this.forWrapping = z11;
        if (cipherParameters instanceof ParametersWithRandom) {
            cipherParameters = ((ParametersWithRandom) cipherParameters).getParameters();
        }
        if (cipherParameters instanceof KeyParameter) {
            this.param = (KeyParameter) cipherParameters;
            System.arraycopy(DEFAULT_IV, 0, this.f33127iv, 0, 8);
        } else if (cipherParameters instanceof ParametersWithIV) {
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            byte[] iv2 = parametersWithIV.getIV();
            if (iv2.length != 8) {
                a.f("IV not equal to 8");
            } else {
                this.param = (KeyParameter) parametersWithIV.getParameters();
                System.arraycopy(iv2, 0, this.f33127iv, 0, 8);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ac, code lost:
    
        if (org.bouncycastle.util.Arrays.constantTimeAreEqual(r8, r5) != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00af, code lost:
    
        m0.i1.i("checksum failed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b2, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0107, code lost:
    
        if (org.bouncycastle.util.Arrays.constantTimeAreEqual(r8, r1) != false) goto L40;
     */
    @Override // org.bouncycastle.crypto.Wrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public byte[] unwrap(byte[] r20, int r21, int r22) throws org.bouncycastle.crypto.InvalidCipherTextException {
        /*
            Method dump skipped, instruction units count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.crypto.engines.RFC3394WrapEngine.unwrap(byte[], int, int):byte[]");
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public byte[] wrap(byte[] bArr, int i11, int i12) {
        String str;
        if (!this.forWrapping) {
            h2.b("not set for wrapping");
            return null;
        }
        if (i12 >= 8) {
            int i13 = i12 / 8;
            if (i13 * 8 == i12) {
                this.engine.init(this.wrapCipherMode, this.param);
                byte[] bArr2 = this.f33127iv;
                byte[] bArr3 = new byte[bArr2.length + i12];
                System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
                System.arraycopy(bArr, i11, bArr3, this.f33127iv.length, i12);
                if (i13 == 1) {
                    this.engine.processBlock(bArr3, 0, bArr3, 0);
                    return bArr3;
                }
                byte[] bArr4 = new byte[this.f33127iv.length + 8];
                for (int i14 = 0; i14 != 6; i14++) {
                    for (int i15 = 1; i15 <= i13; i15++) {
                        System.arraycopy(bArr3, 0, bArr4, 0, this.f33127iv.length);
                        int i16 = i15 * 8;
                        System.arraycopy(bArr3, i16, bArr4, this.f33127iv.length, 8);
                        this.engine.processBlock(bArr4, 0, bArr4, 0);
                        int i17 = (i13 * i14) + i15;
                        int i18 = 1;
                        while (i17 != 0) {
                            int length = this.f33127iv.length - i18;
                            bArr4[length] = (byte) (((byte) i17) ^ bArr4[length]);
                            i17 >>>= 8;
                            i18++;
                        }
                        System.arraycopy(bArr4, 0, bArr3, 0, 8);
                        System.arraycopy(bArr4, 8, bArr3, i16, 8);
                    }
                }
                return bArr3;
            }
            str = "wrap data must be a multiple of 8 bytes";
        } else {
            str = "wrap data must be at least 8 bytes";
        }
        i1.t(str);
        return null;
    }

    public RFC3394WrapEngine(BlockCipher blockCipher) {
        this(blockCipher, false);
    }
}
