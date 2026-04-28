package org.bouncycastle.pqc.legacy.math.linearalgebra;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes3.dex */
public class RandUtils {
    public static int nextInt(SecureRandom secureRandom, int i11) {
        int iNextInt;
        int i12;
        if (((-i11) & i11) == i11) {
            return (int) ((((long) i11) * ((long) (secureRandom.nextInt() >>> 1))) >> 31);
        }
        do {
            iNextInt = secureRandom.nextInt() >>> 1;
            i12 = iNextInt % i11;
        } while ((i11 - 1) + (iNextInt - i12) < 0);
        return i12;
    }
}
