package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class j7 extends k1 {
    private static final j7 zzi;
    private static volatile h2 zzj;
    private int zzb;
    private o7 zze;
    private l7 zzf;
    private boolean zzg;
    private String zzh = "";

    static {
        j7 j7Var = new j7();
        zzi = j7Var;
        k1.o(j7.class, j7Var);
    }

    public static j7 B() {
        return zzi;
    }

    public final String A() {
        return this.zzh;
    }

    public final /* synthetic */ void C(String str) {
        this.zzb |= 8;
        this.zzh = str;
    }

    @Override // com.google.android.gms.internal.measurement.k1
    public final Object s(int i11) {
        h2 j1Var;
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return new l2(zzi, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        if (i12 == 3) {
            return new j7();
        }
        if (i12 == 4) {
            return new i7(zzi);
        }
        if (i12 == 5) {
            return zzi;
        }
        if (i12 != 6) {
            throw null;
        }
        h2 h2Var = zzj;
        if (h2Var != null) {
            return h2Var;
        }
        synchronized (j7.class) {
            try {
                j1Var = zzj;
                if (j1Var == null) {
                    j1Var = new j1(zzi);
                    zzj = j1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return j1Var;
    }

    public final boolean t() {
        return (this.zzb & 1) != 0;
    }

    public final o7 u() {
        o7 o7Var = this.zze;
        return o7Var == null ? o7.A() : o7Var;
    }

    public final boolean v() {
        return (this.zzb & 2) != 0;
    }

    public final l7 w() {
        l7 l7Var = this.zzf;
        return l7Var == null ? l7.C() : l7Var;
    }

    public final boolean x() {
        return (this.zzb & 4) != 0;
    }

    public final boolean y() {
        return this.zzg;
    }

    public final boolean z() {
        return (this.zzb & 8) != 0;
    }
}
