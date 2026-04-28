package org.bouncycastle.pqc.crypto.newhope;

import org.bouncycastle.crypto.hpke.HPKE;

/* JADX INFO: loaded from: classes3.dex */
class Reduce {
    static final int QInv = 12287;
    static final int RLog = 18;
    static final int RMask = 262143;

    public static short barrett(short s7) {
        int i11 = s7 & HPKE.aead_EXPORT_ONLY;
        return (short) (i11 - (((i11 * 5) >>> 16) * 12289));
    }

    public static short montgomery(int i11) {
        return (short) (((((i11 * QInv) & RMask) * 12289) + i11) >>> 18);
    }
}
