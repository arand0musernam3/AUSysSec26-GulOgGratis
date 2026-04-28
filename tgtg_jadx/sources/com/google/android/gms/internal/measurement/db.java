package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class db extends k1 {
    private static final db zzh;
    private static volatile h2 zzi;
    private int zzb;
    private Object zzf;
    private int zze = 0;
    private String zzg = "";

    static {
        db dbVar = new db();
        zzh = dbVar;
        k1.o(db.class, dbVar);
    }

    public static db A() {
        return zzh;
    }

    public static cb z() {
        return (cb) zzh.j();
    }

    public final /* synthetic */ void B(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzg = str;
    }

    public final /* synthetic */ void C(long j9) {
        this.zze = 1;
        this.zzf = Long.valueOf(j9);
    }

    public final /* synthetic */ void D(boolean z11) {
        this.zze = 2;
        this.zzf = Boolean.valueOf(z11);
    }

    public final /* synthetic */ void E(double d3) {
        this.zze = 3;
        this.zzf = Double.valueOf(d3);
    }

    public final /* synthetic */ void F(String str) {
        str.getClass();
        this.zze = 4;
        this.zzf = str;
    }

    public final /* synthetic */ void G(t0 t0Var) {
        t0Var.getClass();
        this.zze = 5;
        this.zzf = t0Var;
    }

    public final int H() {
        int i11 = this.zze;
        if (i11 == 0) {
            return 6;
        }
        int i12 = 1;
        if (i11 != 1) {
            i12 = 2;
            if (i11 != 2) {
                i12 = 3;
                if (i11 != 3) {
                    i12 = 4;
                    if (i11 != 4) {
                        i12 = 5;
                        if (i11 != 5) {
                            return 0;
                        }
                    }
                }
            }
        }
        return i12;
    }

    @Override // com.google.android.gms.internal.measurement.k1
    public final Object s(int i11) {
        h2 j1Var;
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return new l2(zzh, "\u0004\u0006\u0001\u0001\u0001\n\u0006\u0000\u0000\u0000\u00018\u0000\u0002:\u0000\u00033\u0000\u0004;\u0000\u0005=\u0000\nဈ\u0000", new Object[]{"zzf", "zze", "zzb", "zzg"});
        }
        if (i12 == 3) {
            return new db();
        }
        if (i12 == 4) {
            return new cb(zzh);
        }
        if (i12 == 5) {
            return zzh;
        }
        if (i12 != 6) {
            throw null;
        }
        h2 h2Var = zzi;
        if (h2Var != null) {
            return h2Var;
        }
        synchronized (db.class) {
            try {
                j1Var = zzi;
                if (j1Var == null) {
                    j1Var = new j1(zzh);
                    zzi = j1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return j1Var;
    }

    public final String t() {
        return this.zzg;
    }

    public final long u() {
        if (this.zze == 1) {
            return ((Long) this.zzf).longValue();
        }
        return 0L;
    }

    public final boolean v() {
        if (this.zze == 2) {
            return ((Boolean) this.zzf).booleanValue();
        }
        return false;
    }

    public final double w() {
        if (this.zze == 3) {
            return ((Double) this.zzf).doubleValue();
        }
        return 0.0d;
    }

    public final String x() {
        return this.zze == 4 ? (String) this.zzf : "";
    }

    public final u0 y() {
        return this.zze == 5 ? (u0) this.zzf : u0.f11915b;
    }
}
