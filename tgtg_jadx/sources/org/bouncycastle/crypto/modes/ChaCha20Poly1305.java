package org.bouncycastle.crypto.modes;

import c50.w;
import com.braze.h2;
import i4.a;
import j4.s;
import m0.i1;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.engines.ChaCha7539Engine;
import org.bouncycastle.crypto.macs.Poly1305;
import org.bouncycastle.crypto.params.AEADParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;
import qc.y;

/* JADX INFO: loaded from: classes3.dex */
public class ChaCha20Poly1305 implements AEADCipher {
    private static final long AAD_LIMIT = -1;
    private static final int BUF_SIZE = 64;
    private static final long DATA_LIMIT = 274877906880L;
    private static final int KEY_SIZE = 32;
    private static final int MAC_SIZE = 16;
    private static final int NONCE_SIZE = 12;
    private static final byte[] ZEROES = new byte[15];
    private long aadCount;
    private final byte[] buf;
    private int bufPos;
    private final ChaCha7539Engine chacha20;
    private long dataCount;
    private byte[] initialAAD;
    private final byte[] key;
    private final byte[] mac;
    private final byte[] nonce;
    private final Mac poly1305;
    private int state;

    public static final class State {
        static final int DEC_AAD = 6;
        static final int DEC_DATA = 7;
        static final int DEC_FINAL = 8;
        static final int DEC_INIT = 5;
        static final int ENC_AAD = 2;
        static final int ENC_DATA = 3;
        static final int ENC_FINAL = 4;
        static final int ENC_INIT = 1;
        static final int UNINITIALIZED = 0;

        private State() {
        }
    }

    public ChaCha20Poly1305(Mac mac) {
        this.key = new byte[32];
        this.nonce = new byte[12];
        this.buf = new byte[80];
        this.mac = new byte[16];
        this.state = 0;
        if (mac == null) {
            w.l("'poly1305' cannot be null");
            throw null;
        }
        if (16 != mac.getMacSize()) {
            a.f("'poly1305' must be a 128-bit MAC");
            throw null;
        }
        this.chacha20 = new ChaCha7539Engine();
        this.poly1305 = mac;
    }

    private void checkAAD() {
        int i11 = this.state;
        if (i11 == 1) {
            this.state = 2;
            return;
        }
        if (i11 != 2) {
            if (i11 == 4) {
                h2.b("ChaCha20Poly1305 cannot be reused for encryption");
            } else if (i11 == 5) {
                this.state = 6;
            } else {
                if (i11 == 6) {
                    return;
                }
                y.e();
            }
        }
    }

    private void checkData() {
        switch (this.state) {
            case 1:
            case 2:
                finishAAD(3);
                break;
            case 3:
            case 7:
                break;
            case 4:
                h2.b("ChaCha20Poly1305 cannot be reused for encryption");
                break;
            case 5:
            case 6:
                finishAAD(7);
                break;
            default:
                y.e();
                break;
        }
    }

    private void finishAAD(int i11) {
        padMAC(this.aadCount);
        this.state = i11;
    }

    private void finishData(int i11) {
        padMAC(this.dataCount);
        byte[] bArr = new byte[16];
        Pack.longToLittleEndian(this.aadCount, bArr, 0);
        Pack.longToLittleEndian(this.dataCount, bArr, 8);
        this.poly1305.update(bArr, 0, 16);
        this.poly1305.doFinal(this.mac, 0);
        this.state = i11;
    }

    private long incrementCount(long j9, int i11, long j11) {
        long j12 = i11;
        if (j9 - Long.MIN_VALUE <= (j11 - j12) - Long.MIN_VALUE) {
            return j9 + j12;
        }
        h2.b("Limit exceeded");
        return 0L;
    }

    private void initMAC() {
        byte[] bArr = new byte[64];
        try {
            this.chacha20.processBytes(bArr, 0, 64, bArr, 0);
            this.poly1305.init(new KeyParameter(bArr, 0, 32));
        } finally {
            Arrays.clear(bArr);
        }
    }

    private void padMAC(long j9) {
        int i11 = ((int) j9) & 15;
        if (i11 != 0) {
            this.poly1305.update(ZEROES, 0, 16 - i11);
        }
    }

    private void processData(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) {
        if (i13 > bArr2.length - i12) {
            i1.r("Output buffer too short");
        } else {
            this.chacha20.processBytes(bArr, i11, i12, bArr2, i13);
            this.dataCount = incrementCount(this.dataCount, i12, DATA_LIMIT);
        }
    }

    private void reset(boolean z11, boolean z12) {
        Arrays.clear(this.buf);
        if (z11) {
            Arrays.clear(this.mac);
        }
        this.aadCount = 0L;
        this.dataCount = 0L;
        this.bufPos = 0;
        switch (this.state) {
            case 1:
            case 5:
                break;
            case 2:
            case 3:
            case 4:
                this.state = 4;
                return;
            case 6:
            case 7:
            case 8:
                this.state = 5;
                break;
            default:
                y.e();
                return;
        }
        if (z12) {
            this.chacha20.reset();
        }
        initMAC();
        byte[] bArr = this.initialAAD;
        if (bArr != null) {
            processAADBytes(bArr, 0, bArr.length);
        }
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int doFinal(byte[] bArr, int i11) throws InvalidCipherTextException, IllegalStateException {
        int i12;
        int i13;
        if (bArr == null) {
            w.l("'out' cannot be null");
            return 0;
        }
        if (i11 < 0) {
            a.f("'outOff' cannot be negative");
            return 0;
        }
        checkData();
        Arrays.clear(this.mac);
        int i14 = this.state;
        if (i14 == 3) {
            int i15 = this.bufPos;
            int i16 = i15 + 16;
            if (i11 > bArr.length - i16) {
                i1.r("Output buffer too short");
                return 0;
            }
            if (i15 > 0) {
                processData(this.buf, 0, i15, bArr, i11);
                this.poly1305.update(bArr, i11, this.bufPos);
            }
            finishData(4);
            System.arraycopy(this.mac, 0, bArr, this.bufPos + i11, 16);
            i12 = i16;
        } else {
            if (i14 != 7) {
                y.e();
                return 0;
            }
            int i17 = this.bufPos;
            if (i17 < 16) {
                i1.i("data too short");
                return 0;
            }
            int i18 = i17 - 16;
            if (i11 > bArr.length - i18) {
                i1.r("Output buffer too short");
                return 0;
            }
            if (i18 > 0) {
                this.poly1305.update(this.buf, 0, i18);
                i13 = i18;
                processData(this.buf, 0, i13, bArr, i11);
            } else {
                i13 = i18;
            }
            finishData(8);
            if (!Arrays.constantTimeAreEqual(16, this.mac, 0, this.buf, i13)) {
                i1.i("mac check in ChaCha20Poly1305 failed");
                return 0;
            }
            i12 = i13;
        }
        reset(false, true);
        return i12;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public String getAlgorithmName() {
        return "ChaCha20Poly1305";
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public byte[] getMac() {
        return Arrays.clone(this.mac);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getOutputSize(int i11) {
        int iMax = Math.max(0, i11) + this.bufPos;
        int i12 = this.state;
        if (i12 == 1 || i12 == 2 || i12 == 3) {
            return iMax + 16;
        }
        if (i12 == 5 || i12 == 6 || i12 == 7) {
            return Math.max(0, iMax - 16);
        }
        y.e();
        return 0;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getUpdateOutputSize(int i11) {
        int iMax = Math.max(0, i11) + this.bufPos;
        int i12 = this.state;
        if (i12 != 1 && i12 != 2 && i12 != 3) {
            if (i12 != 5 && i12 != 6 && i12 != 7) {
                y.e();
                return 0;
            }
            iMax = Math.max(0, iMax - 16);
        }
        return iMax - (iMax % 64);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void init(boolean z11, CipherParameters cipherParameters) throws IllegalArgumentException {
        ParametersWithIV parametersWithIV;
        KeyParameter key;
        byte[] iv2;
        if (cipherParameters instanceof AEADParameters) {
            AEADParameters aEADParameters = (AEADParameters) cipherParameters;
            int macSize = aEADParameters.getMacSize();
            if (128 != macSize) {
                a.f(s.f(macSize, "Invalid value for MAC size: "));
                return;
            }
            key = aEADParameters.getKey();
            iv2 = aEADParameters.getNonce();
            parametersWithIV = new ParametersWithIV(key, iv2);
            this.initialAAD = aEADParameters.getAssociatedText();
        } else {
            if (!(cipherParameters instanceof ParametersWithIV)) {
                a.f("invalid parameters passed to ChaCha20Poly1305");
                return;
            }
            parametersWithIV = (ParametersWithIV) cipherParameters;
            key = (KeyParameter) parametersWithIV.getParameters();
            iv2 = parametersWithIV.getIV();
            this.initialAAD = null;
        }
        if (key == null) {
            if (this.state == 0) {
                a.f("Key must be specified in initial init");
                return;
            }
        } else if (32 != key.getKeyLength()) {
            a.f("Key must be 256 bits");
            return;
        }
        if (iv2 == null || 12 != iv2.length) {
            a.f("Nonce must be 96 bits");
            return;
        }
        if (this.state != 0 && z11 && Arrays.areEqual(this.nonce, iv2) && (key == null || Arrays.areEqual(this.key, key.getKey()))) {
            a.f("cannot reuse nonce for ChaCha20Poly1305 encryption");
            return;
        }
        if (key != null) {
            key.copyTo(this.key, 0, 32);
        }
        System.arraycopy(iv2, 0, this.nonce, 0, 12);
        this.chacha20.init(true, parametersWithIV);
        this.state = z11 ? 1 : 5;
        reset(true, false);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADByte(byte b8) {
        checkAAD();
        this.aadCount = incrementCount(this.aadCount, 1, -1L);
        this.poly1305.update(b8);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADBytes(byte[] bArr, int i11, int i12) {
        if (bArr == null) {
            w.l("'in' cannot be null");
            return;
        }
        if (i11 < 0) {
            a.f("'inOff' cannot be negative");
            return;
        }
        if (i12 < 0) {
            a.f("'len' cannot be negative");
            return;
        }
        if (i11 > bArr.length - i12) {
            i1.t("Input buffer too short");
            return;
        }
        checkAAD();
        if (i12 > 0) {
            this.aadCount = incrementCount(this.aadCount, i12, -1L);
            this.poly1305.update(bArr, i11, i12);
        }
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processByte(byte b8, byte[] bArr, int i11) throws DataLengthException {
        checkData();
        int i12 = this.state;
        if (i12 == 3) {
            byte[] bArr2 = this.buf;
            int i13 = this.bufPos;
            bArr2[i13] = b8;
            int i14 = i13 + 1;
            this.bufPos = i14;
            if (i14 != 64) {
                return 0;
            }
            processData(bArr2, 0, 64, bArr, i11);
            this.poly1305.update(bArr, i11, 64);
            this.bufPos = 0;
            return 64;
        }
        if (i12 != 7) {
            y.e();
            return 0;
        }
        byte[] bArr3 = this.buf;
        int i15 = this.bufPos;
        bArr3[i15] = b8;
        int i16 = i15 + 1;
        this.bufPos = i16;
        if (i16 != bArr3.length) {
            return 0;
        }
        this.poly1305.update(bArr3, 0, 64);
        processData(this.buf, 0, 64, bArr, i11);
        byte[] bArr4 = this.buf;
        System.arraycopy(bArr4, 64, bArr4, 0, 16);
        this.bufPos = 16;
        return 64;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processBytes(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) throws DataLengthException {
        String str;
        byte[] bArr3;
        int i14;
        int i15;
        int i16 = i11;
        int i17 = i12;
        if (bArr == null) {
            w.l("'in' cannot be null");
            return 0;
        }
        if (i16 < 0) {
            str = "'inOff' cannot be negative";
        } else if (i17 < 0) {
            str = "'len' cannot be negative";
        } else {
            if (i16 > bArr.length - i17) {
                i1.t("Input buffer too short");
                return 0;
            }
            if (i13 >= 0) {
                if (bArr == bArr2 && Arrays.segmentsOverlap(i11, i17, i13, getUpdateOutputSize(i17))) {
                    bArr = new byte[i17];
                    System.arraycopy(bArr2, i11, bArr, 0, i17);
                    i16 = 0;
                }
                checkData();
                int i18 = this.state;
                if (i18 != 3) {
                    if (i18 != 7) {
                        y.e();
                        return 0;
                    }
                    int i19 = 0;
                    for (int i21 = 0; i21 < i17; i21++) {
                        byte[] bArr4 = this.buf;
                        int i22 = this.bufPos;
                        bArr4[i22] = bArr[i16 + i21];
                        int i23 = i22 + 1;
                        this.bufPos = i23;
                        if (i23 == bArr4.length) {
                            this.poly1305.update(bArr4, 0, 64);
                            processData(this.buf, 0, 64, bArr2, i13 + i19);
                            byte[] bArr5 = this.buf;
                            System.arraycopy(bArr5, 64, bArr5, 0, 16);
                            this.bufPos = 16;
                            i19 += 64;
                        }
                    }
                    return i19;
                }
                if (this.bufPos != 0) {
                    while (i17 > 0) {
                        i14 = i17 - 1;
                        byte[] bArr6 = this.buf;
                        int i24 = this.bufPos;
                        int i25 = i16 + 1;
                        bArr6[i24] = bArr[i16];
                        int i26 = i24 + 1;
                        this.bufPos = i26;
                        if (i26 == 64) {
                            bArr3 = bArr2;
                            processData(bArr6, 0, 64, bArr3, i13);
                            this.poly1305.update(bArr3, i13, 64);
                            this.bufPos = 0;
                            i16 = i25;
                            i15 = 64;
                            break;
                        }
                        i17 = i14;
                        i16 = i25;
                    }
                    bArr3 = bArr2;
                    i14 = i17;
                    i15 = 0;
                } else {
                    bArr3 = bArr2;
                    i14 = i17;
                    i15 = 0;
                }
                while (i14 >= 64) {
                    int i27 = i13 + i15;
                    byte[] bArr7 = bArr;
                    int i28 = i16;
                    processData(bArr7, i28, 64, bArr3, i27);
                    this.poly1305.update(bArr3, i27, 64);
                    i16 = i28 + 64;
                    i14 -= 64;
                    i15 += 64;
                    bArr = bArr7;
                }
                byte[] bArr8 = bArr;
                if (i14 > 0) {
                    System.arraycopy(bArr8, i16, this.buf, 0, i14);
                    this.bufPos = i14;
                }
                return i15;
            }
            str = "'outOff' cannot be negative";
        }
        a.f(str);
        return 0;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void reset() {
        reset(true, true);
    }

    public ChaCha20Poly1305() {
        this(new Poly1305());
    }
}
