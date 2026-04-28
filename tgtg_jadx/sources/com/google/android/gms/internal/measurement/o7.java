package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class o7 extends k1 {
    private static final o7 zzi;
    private static volatile h2 zzj;
    private int zzb;
    private int zze;
    private boolean zzg;
    private String zzf = "";
    private t1 zzh = k2.f11555e;

    static {
        o7 o7Var = new o7();
        zzi = o7Var;
        k1.o(o7.class, o7Var);
    }

    public static o7 A() {
        return zzi;
    }

    public final int B() {
        int i11;
        switch (this.zze) {
            case 0:
                i11 = 1;
                break;
            case 1:
                i11 = 2;
                break;
            case 2:
                i11 = 3;
                break;
            case 3:
                i11 = 4;
                break;
            case 4:
                i11 = 5;
                break;
            case 5:
                i11 = 6;
                break;
            case 6:
                i11 = 7;
                break;
            default:
                i11 = 0;
                break;
        }
        if (i11 == 0) {
            return 1;
        }
        return i11;
    }

    @Override // com.google.android.gms.internal.measurement.k1
    public final Object s(int i11) {
        h2 j1Var;
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return new l2(zzi, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zzb", "zze", k0.f11541d, "zzf", "zzg", "zzh"});
        }
        if (i12 == 3) {
            return new o7();
        }
        if (i12 == 4) {
            return new k7(zzi);
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
        synchronized (o7.class) {
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

    public final boolean u() {
        return (this.zzb & 2) != 0;
    }

    public final String v() {
        return this.zzf;
    }

    public final boolean w() {
        return (this.zzb & 4) != 0;
    }

    public final boolean x() {
        return this.zzg;
    }

    public final t1 y() {
        return this.zzh;
    }

    public final int z() {
        return this.zzh.size();
    }
}
