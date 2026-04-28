package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class sc extends k1 {
    private static final sc zze;
    private static volatile h2 zzf;
    private t1 zzb = k2.f11555e;

    static {
        sc scVar = new sc();
        zze = scVar;
        k1.o(sc.class, scVar);
    }

    public static sc u(byte[] bArr, c1 c1Var) {
        return (sc) k1.e(zze, bArr, c1Var);
    }

    @Override // com.google.android.gms.internal.measurement.k1
    public final Object s(int i11) {
        h2 j1Var;
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return new l2(zze, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"zzb"});
        }
        if (i12 == 3) {
            return new sc();
        }
        if (i12 == 4) {
            return new k7(zze);
        }
        if (i12 == 5) {
            return zze;
        }
        if (i12 != 6) {
            throw null;
        }
        h2 h2Var = zzf;
        if (h2Var != null) {
            return h2Var;
        }
        synchronized (sc.class) {
            try {
                j1Var = zzf;
                if (j1Var == null) {
                    j1Var = new j1(zze);
                    zzf = j1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return j1Var;
    }

    public final List t() {
        return this.zzb;
    }
}
