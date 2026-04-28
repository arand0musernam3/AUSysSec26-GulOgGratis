package org.bouncycastle.pqc.crypto.lms;

import c50.w;
import org.bouncycastle.crypto.Digest;

/* JADX INFO: loaded from: classes3.dex */
class LmsUtils {
    public static void byteArray(byte[] bArr, Digest digest) {
        digest.update(bArr, 0, bArr.length);
    }

    public static int calculateStrength(LMSParameters lMSParameters) {
        if (lMSParameters == null) {
            w.l("lmsParameters cannot be null");
            return 0;
        }
        LMSigParameters lMSigParam = lMSParameters.getLMSigParam();
        return lMSigParam.getM() * (1 << lMSigParam.getH());
    }

    public static void u16str(short s7, Digest digest) {
        digest.update((byte) (s7 >>> 8));
        digest.update((byte) s7);
    }

    public static void u32str(int i11, Digest digest) {
        digest.update((byte) (i11 >>> 24));
        digest.update((byte) (i11 >>> 16));
        digest.update((byte) (i11 >>> 8));
        digest.update((byte) i11);
    }

    public static void byteArray(byte[] bArr, int i11, int i12, Digest digest) {
        digest.update(bArr, i11, i12);
    }
}
