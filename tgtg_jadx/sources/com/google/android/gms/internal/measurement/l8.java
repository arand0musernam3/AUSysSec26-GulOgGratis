package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class l8 extends k1 {
    private static final l8 zzi;
    private static volatile h2 zzj;
    private int zzb;
    private int zze;
    private e9 zzf;
    private e9 zzg;
    private boolean zzh;

    static {
        l8 l8Var = new l8();
        zzi = l8Var;
        k1.o(l8.class, l8Var);
    }

    public static k8 A() {
        return (k8) zzi.j();
    }

    public final /* synthetic */ void B(int i11) {
        this.zzb |= 1;
        this.zze = i11;
    }

    public final /* synthetic */ void C(e9 e9Var) {
        this.zzf = e9Var;
        this.zzb |= 2;
    }

    public final /* synthetic */ void D(e9 e9Var) {
        this.zzg = e9Var;
        this.zzb |= 4;
    }

    public final /* synthetic */ void E(boolean z11) {
        this.zzb |= 8;
        this.zzh = z11;
    }

    @Override // com.google.android.gms.internal.measurement.k1
    public final Object s(int i11) {
        h2 j1Var;
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return new l2(zzi, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        if (i12 == 3) {
            return new l8();
        }
        if (i12 == 4) {
            return new k8(zzi);
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
        synchronized (l8.class) {
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

    public final int u() {
        return this.zze;
    }

    public final e9 v() {
        e9 e9Var = this.zzf;
        return e9Var == null ? e9.C() : e9Var;
    }

    public final boolean w() {
        return (this.zzb & 4) != 0;
    }

    public final e9 x() {
        e9 e9Var = this.zzg;
        return e9Var == null ? e9.C() : e9Var;
    }

    public final boolean y() {
        return (this.zzb & 8) != 0;
    }

    public final boolean z() {
        return this.zzh;
    }
}
