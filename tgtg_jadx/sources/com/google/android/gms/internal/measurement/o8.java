package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class o8 extends k1 {
    private static final o8 zzg;
    private static volatile h2 zzh;
    private int zzb;
    private int zze;
    private int zzf;

    static {
        o8 o8Var = new o8();
        zzg = o8Var;
        k1.o(o8.class, o8Var);
    }

    public static n8 t() {
        return (n8) zzg.j();
    }

    @Override // com.google.android.gms.internal.measurement.k1
    public final Object s(int i11) {
        h2 j1Var;
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return new l2(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzb", "zze", k0.f11546i, "zzf", k0.f11547j});
        }
        if (i12 == 3) {
            return new o8();
        }
        if (i12 == 4) {
            return new n8(zzg);
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
        synchronized (o8.class) {
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

    public final int u() {
        int i11;
        int i12 = this.zze;
        if (i12 != 0) {
            i11 = 2;
            if (i12 != 1) {
                if (i12 != 2) {
                    i11 = 4;
                    if (i12 != 3) {
                        i11 = i12 != 4 ? 0 : 5;
                    }
                } else {
                    i11 = 3;
                }
            }
        } else {
            i11 = 1;
        }
        if (i11 == 0) {
            return 1;
        }
        return i11;
    }

    public final int v() {
        int i11;
        int i12 = this.zzf;
        if (i12 != 0) {
            i11 = 2;
            if (i12 != 1) {
                i11 = i12 != 2 ? 0 : 3;
            }
        } else {
            i11 = 1;
        }
        if (i11 == 0) {
            return 1;
        }
        return i11;
    }

    public final /* synthetic */ void w(int i11) {
        this.zze = i11 - 1;
        this.zzb |= 1;
    }

    public final /* synthetic */ void x(int i11) {
        this.zzf = i11 - 1;
        this.zzb |= 2;
    }
}
