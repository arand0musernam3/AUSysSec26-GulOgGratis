package org.bouncycastle.crypto.engines;

import com.braze.h2;
import m0.i1;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes3.dex */
public class ChaCha7539Engine extends Salsa20Engine {
    @Override // org.bouncycastle.crypto.engines.Salsa20Engine
    public void advanceCounter(long j9) {
        int i11 = (int) (j9 >>> 32);
        int i12 = (int) j9;
        if (i11 > 0) {
            h2.b("attempt to increase counter past 2^32.");
            return;
        }
        int[] iArr = this.engineState;
        int i13 = iArr[12];
        int i14 = i12 + i13;
        iArr[12] = i14;
        if (i13 == 0 || i14 >= i13) {
            return;
        }
        h2.b("attempt to increase counter past 2^32.");
    }

    @Override // org.bouncycastle.crypto.engines.Salsa20Engine
    public void generateKeyStream(byte[] bArr) {
        ChaChaEngine.chachaCore(this.rounds, this.engineState, this.f33134x);
        Pack.intToLittleEndian(this.f33134x, bArr, 0);
    }

    @Override // org.bouncycastle.crypto.engines.Salsa20Engine, org.bouncycastle.crypto.StreamCipher
    public String getAlgorithmName() {
        return "ChaCha7539";
    }

    @Override // org.bouncycastle.crypto.engines.Salsa20Engine
    public long getCounter() {
        return ((long) this.engineState[12]) & 4294967295L;
    }

    @Override // org.bouncycastle.crypto.engines.Salsa20Engine
    public int getNonceSize() {
        return 12;
    }

    @Override // org.bouncycastle.crypto.engines.Salsa20Engine
    public void resetCounter() {
        this.engineState[12] = 0;
    }

    @Override // org.bouncycastle.crypto.engines.Salsa20Engine
    public void retreatCounter(long j9) {
        int i11 = (int) (j9 >>> 32);
        int i12 = (int) j9;
        if (i11 != 0) {
            h2.b("attempt to reduce counter past zero.");
            return;
        }
        int[] iArr = this.engineState;
        int i13 = iArr[12];
        if ((((long) i13) & 4294967295L) >= (4294967295L & ((long) i12))) {
            iArr[12] = i13 - i12;
        } else {
            h2.b("attempt to reduce counter past zero.");
        }
    }

    @Override // org.bouncycastle.crypto.engines.Salsa20Engine
    public void setKey(byte[] bArr, byte[] bArr2) {
        if (bArr != null) {
            if (bArr.length != 32) {
                i1.g(getAlgorithmName(), " requires 256 bit key");
                return;
            } else {
                packTauOrSigma(bArr.length, this.engineState, 0);
                Pack.littleEndianToInt(bArr, 0, this.engineState, 4, 8);
            }
        }
        Pack.littleEndianToInt(bArr2, 0, this.engineState, 13, 3);
    }

    @Override // org.bouncycastle.crypto.engines.Salsa20Engine
    public void advanceCounter() {
        int[] iArr = this.engineState;
        int i11 = iArr[12] + 1;
        iArr[12] = i11;
        if (i11 != 0) {
            return;
        }
        h2.b("attempt to increase counter past 2^32.");
    }

    @Override // org.bouncycastle.crypto.engines.Salsa20Engine
    public void retreatCounter() {
        int[] iArr = this.engineState;
        int i11 = iArr[12];
        if (i11 != 0) {
            iArr[12] = i11 - 1;
        } else {
            h2.b("attempt to reduce counter past zero.");
        }
    }
}
