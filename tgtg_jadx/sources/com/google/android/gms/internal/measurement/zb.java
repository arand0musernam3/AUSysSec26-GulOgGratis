package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class zb extends k1 {
    private static final zb zze;
    private static volatile h2 zzf;
    private z1 zzb = z1.f12078b;

    static {
        zb zbVar = new zb();
        zze = zbVar;
        k1.o(zb.class, zbVar);
    }

    public static zb u() {
        return zze;
    }

    @Override // com.google.android.gms.internal.measurement.k1
    public final Object s(int i11) {
        h2 j1Var;
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return new l2(zze, "\u0004\u0001\u0000\u0000\u0002\u0002\u0001\u0001\u0000\u0000\u00022", new Object[]{"zzb", xb.f12036a});
        }
        if (i12 == 3) {
            return new zb();
        }
        if (i12 == 4) {
            return new yb(zze);
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
        synchronized (zb.class) {
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

    public final wb t(String str, wb wbVar) {
        str.getClass();
        wb wbVar2 = (wb) this.zzb.get(str);
        return wbVar2 != null ? wbVar2 : wbVar;
    }

    public final z1 v() {
        z1 z1Var = this.zzb;
        if (!z1Var.f12079a) {
            this.zzb = z1Var.a();
        }
        return this.zzb;
    }
}
