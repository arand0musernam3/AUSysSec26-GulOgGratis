package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class wb extends k1 {
    private static final wb zzg;
    private static volatile h2 zzh;
    private int zzb;
    private t1 zze = k2.f11555e;
    private String zzf = "";

    static {
        wb wbVar = new wb();
        zzg = wbVar;
        k1.o(wb.class, wbVar);
    }

    public static wb u() {
        return zzg;
    }

    @Override // com.google.android.gms.internal.measurement.k1
    public final Object s(int i11) {
        h2 j1Var;
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return new l2(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002ဈ\u0000", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i12 == 3) {
            return new wb();
        }
        if (i12 == 4) {
            return new vb(zzg);
        }
        if (i12 == 5) {
            return zzg;
        }
        if (i12 != 6) {
            throw null;
        }
        h2 h2Var = zzh;
        if (h2Var != null) {
            return h2Var;
        }
        synchronized (wb.class) {
            try {
                j1Var = zzh;
                if (j1Var == null) {
                    j1Var = new j1(zzg);
                    zzh = j1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return j1Var;
    }

    public final List t() {
        return this.zze;
    }

    public final void v(String str) {
        t1 t1Var = this.zze;
        if (!((o0) t1Var).f11682a) {
            this.zze = b3.i.h(t1Var);
        }
        this.zze.add("");
    }

    public final /* synthetic */ void w(String str) {
        this.zzb |= 1;
        this.zzf = "";
    }
}
