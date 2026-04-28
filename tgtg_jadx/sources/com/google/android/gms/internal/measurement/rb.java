package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class rb extends k1 {
    private static final rb zzo;
    private static volatile h2 zzp;
    private int zzb;
    private boolean zzf;
    private t1 zzh;
    private t1 zzi;
    private o1 zzj;
    private sb zzk;
    private boolean zzl;
    private boolean zzm;
    private ob zzn;
    private u0 zze = u0.f11915b;
    private String zzg = "";

    static {
        rb rbVar = new rb();
        zzo = rbVar;
        k1.o(rb.class, rbVar);
    }

    public rb() {
        k2 k2Var = k2.f11555e;
        this.zzh = k2Var;
        this.zzi = k2Var;
        this.zzj = l1.f11581e;
    }

    public static rb t() {
        return zzo;
    }

    @Override // com.google.android.gms.internal.measurement.k1
    public final Object s(int i11) {
        h2 j1Var;
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return new l2(zzo, "\u0004\n\u0000\u0001\u0001\f\n\u0000\u0003\u0000\u0001ည\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004\u001a\u0005\u001a\u0007ࠬ\bဉ\u0003\nဇ\u0004\u000bဇ\u0005\fဉ\u0006", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", k0.f11539b, "zzk", "zzl", "zzm", "zzn"});
        }
        if (i12 == 3) {
            return new rb();
        }
        if (i12 == 4) {
            return new k7(zzo);
        }
        if (i12 == 5) {
            return zzo;
        }
        if (i12 != 6) {
            throw null;
        }
        h2 h2Var = zzp;
        if (h2Var != null) {
            return h2Var;
        }
        synchronized (rb.class) {
            try {
                j1Var = zzp;
                if (j1Var == null) {
                    j1Var = new j1(zzo);
                    zzp = j1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return j1Var;
    }
}
