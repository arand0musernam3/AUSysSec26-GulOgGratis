package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class ya extends k1 {
    private static final ya zzg;
    private static volatile h2 zzh;
    private int zzb;
    private int zze;
    private int zzf;

    static {
        ya yaVar = new ya();
        zzg = yaVar;
        k1.o(ya.class, yaVar);
    }

    public static xa t() {
        return (xa) zzg.j();
    }

    @Override // com.google.android.gms.internal.measurement.k1
    public final Object s(int i11) {
        h2 j1Var;
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return new l2(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i12 == 3) {
            return new ya();
        }
        if (i12 == 4) {
            return new xa(zzg);
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
        synchronized (ya.class) {
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

    public final /* synthetic */ void u(int i11) {
        this.zze = i11 - 2;
        this.zzb |= 1;
    }

    public final /* synthetic */ void v(int i11) {
        if (i11 == 1) {
            i4.a.f("Can't get the number of an unknown enum value.");
        } else {
            this.zzf = i11 - 2;
            this.zzb |= 2;
        }
    }
}
