package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f7 extends k1 {
    private static final f7 zzj;
    private static volatile h2 zzk;
    private int zzb;
    private int zze;
    private t1 zzf;
    private t1 zzg;
    private boolean zzh;
    private boolean zzi;

    static {
        f7 f7Var = new f7();
        zzj = f7Var;
        k1.o(f7.class, f7Var);
    }

    public f7() {
        k2 k2Var = k2.f11555e;
        this.zzf = k2Var;
        this.zzg = k2Var;
    }

    public final h7 A(int i11) {
        return (h7) this.zzg.get(i11);
    }

    public final void B(int i11, n7 n7Var) {
        t1 t1Var = this.zzf;
        if (!((o0) t1Var).f11682a) {
            this.zzf = b3.i.h(t1Var);
        }
        this.zzf.set(i11, n7Var);
    }

    public final void C(int i11, h7 h7Var) {
        t1 t1Var = this.zzg;
        if (!((o0) t1Var).f11682a) {
            this.zzg = b3.i.h(t1Var);
        }
        this.zzg.set(i11, h7Var);
    }

    @Override // com.google.android.gms.internal.measurement.k1
    public final Object s(int i11) {
        h2 j1Var;
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return new l2(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zzb", "zze", "zzf", n7.class, "zzg", h7.class, "zzh", "zzi"});
        }
        if (i12 == 3) {
            return new f7();
        }
        if (i12 == 4) {
            return new e7(zzj);
        }
        if (i12 == 5) {
            return zzj;
        }
        if (i12 != 6) {
            throw null;
        }
        h2 h2Var = zzk;
        if (h2Var != null) {
            return h2Var;
        }
        synchronized (f7.class) {
            try {
                j1Var = zzk;
                if (j1Var == null) {
                    j1Var = new j1(zzj);
                    zzk = j1Var;
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

    public final List v() {
        return this.zzf;
    }

    public final int w() {
        return this.zzf.size();
    }

    public final n7 x(int i11) {
        return (n7) this.zzf.get(i11);
    }

    public final t1 y() {
        return this.zzg;
    }

    public final int z() {
        return this.zzg.size();
    }
}
