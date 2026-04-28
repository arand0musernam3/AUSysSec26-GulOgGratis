package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class z8 extends k1 {
    private static final z8 zzi;
    private static volatile h2 zzj;
    private int zzb;
    private t1 zze = k2.f11555e;
    private String zzf = "";
    private String zzg = "";
    private int zzh;

    static {
        z8 z8Var = new z8();
        zzi = z8Var;
        k1.o(z8.class, z8Var);
    }

    public static y8 A() {
        return (y8) zzi.j();
    }

    public static y8 B(z8 z8Var) {
        i1 i1VarJ = zzi.j();
        i1VarJ.f(z8Var);
        return (y8) i1VarJ;
    }

    public final /* synthetic */ void C(int i11, b9 b9Var) {
        I();
        this.zze.set(i11, b9Var);
    }

    public final /* synthetic */ void D(b9 b9Var) {
        I();
        this.zze.add(b9Var);
    }

    public final /* synthetic */ void E(ArrayList arrayList) {
        I();
        n0.d(arrayList, this.zze);
    }

    public final void F() {
        this.zze = k2.f11555e;
    }

    public final /* synthetic */ void G(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzf = str;
    }

    public final /* synthetic */ void H(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zzg = str;
    }

    public final void I() {
        t1 t1Var = this.zze;
        if (((o0) t1Var).f11682a) {
            return;
        }
        this.zze = b3.i.h(t1Var);
    }

    @Override // com.google.android.gms.internal.measurement.k1
    public final Object s(int i11) {
        h2 j1Var;
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return new l2(zzi, "\u0004\u0004\u0000\u0001\u0001\t\u0004\u0000\u0001\u0000\u0001\u001b\u0007ဈ\u0000\bဈ\u0001\t᠌\u0002", new Object[]{"zzb", "zze", b9.class, "zzf", "zzg", "zzh", k0.f11548k});
        }
        if (i12 == 3) {
            return new z8();
        }
        if (i12 == 4) {
            return new y8(zzi);
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
        synchronized (z8.class) {
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

    public final List t() {
        return this.zze;
    }

    public final int u() {
        return this.zze.size();
    }

    public final b9 v(int i11) {
        return (b9) this.zze.get(i11);
    }

    public final boolean w() {
        return (this.zzb & 1) != 0;
    }

    public final String x() {
        return this.zzf;
    }

    public final boolean y() {
        return (this.zzb & 2) != 0;
    }

    public final String z() {
        return this.zzg;
    }
}
