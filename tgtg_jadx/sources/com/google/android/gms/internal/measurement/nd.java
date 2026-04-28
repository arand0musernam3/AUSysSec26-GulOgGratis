package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class nd extends k1 {
    private static final nd zzh;
    private static volatile h2 zzi;
    private int zzb;
    private Object zzf;
    private int zze = 0;
    private String zzg = "";

    static {
        nd ndVar = new nd();
        zzh = ndVar;
        k1.o(nd.class, ndVar);
    }

    public static md z() {
        return (md) zzh.j();
    }

    public final /* synthetic */ void A(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzg = str;
    }

    public final /* synthetic */ void B(long j9) {
        this.zze = 2;
        this.zzf = Long.valueOf(j9);
    }

    public final /* synthetic */ void C(boolean z11) {
        this.zze = 3;
        this.zzf = Boolean.valueOf(z11);
    }

    public final /* synthetic */ void D(double d3) {
        this.zze = 4;
        this.zzf = Double.valueOf(d3);
    }

    public final /* synthetic */ void E(String str) {
        str.getClass();
        this.zze = 5;
        this.zzf = str;
    }

    public final /* synthetic */ void F(u0 u0Var) {
        u0Var.getClass();
        this.zze = 6;
        this.zzf = u0Var;
    }

    public final int G() {
        int i11 = this.zze;
        if (i11 == 0) {
            return 6;
        }
        if (i11 == 2) {
            return 1;
        }
        if (i11 == 3) {
            return 2;
        }
        if (i11 == 4) {
            return 3;
        }
        if (i11 != 5) {
            return i11 != 6 ? 0 : 5;
        }
        return 4;
    }

    @Override // com.google.android.gms.internal.measurement.k1
    public final Object s(int i11) {
        h2 j1Var;
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return new l2(zzh, "\u0004\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u00025\u0000\u0003:\u0000\u00043\u0000\u0005;\u0000\u0006=\u0000", new Object[]{"zzf", "zze", "zzb", "zzg"});
        }
        if (i12 == 3) {
            return new nd();
        }
        if (i12 == 4) {
            return new md(zzh);
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
        synchronized (nd.class) {
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
        if (this.zze == 2) {
            return ((Long) this.zzf).longValue();
        }
        return 0L;
    }

    public final boolean v() {
        if (this.zze == 3) {
            return ((Boolean) this.zzf).booleanValue();
        }
        return false;
    }

    public final double w() {
        if (this.zze == 4) {
            return ((Double) this.zzf).doubleValue();
        }
        return 0.0d;
    }

    public final String x() {
        return this.zze == 5 ? (String) this.zzf : "";
    }

    public final u0 y() {
        return this.zze == 6 ? (u0) this.zzf : u0.f11915b;
    }
}
