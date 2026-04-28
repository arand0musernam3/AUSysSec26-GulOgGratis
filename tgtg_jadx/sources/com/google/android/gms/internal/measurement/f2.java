package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f2 implements m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0 f11402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h1 f11403b;

    public f2(h1 h1Var, n0 n0Var) {
        h1 h1Var2 = d1.f11333a;
        this.f11403b = h1Var;
        this.f11402a = n0Var;
    }

    @Override // com.google.android.gms.internal.measurement.m2
    public final k1 a() {
        n0 n0Var = this.f11402a;
        if (n0Var instanceof k1) {
            return ((k1) n0Var).i();
        }
        i1 i1Var = (i1) ((k1) n0Var).s(5);
        boolean zG = i1Var.f11483b.g();
        k1 k1Var = i1Var.f11483b;
        if (!zG) {
            return k1Var;
        }
        k1Var.getClass();
        j2.f11503c.a(k1Var.getClass()).f(k1Var);
        k1Var.h();
        return i1Var.f11483b;
    }

    @Override // com.google.android.gms.internal.measurement.m2
    public final int b(n0 n0Var) {
        r2 r2Var = ((k1) n0Var).zzc;
        int i11 = r2Var.f11813d;
        if (i11 != -1) {
            return i11;
        }
        int iC = 0;
        for (int i12 = 0; i12 < r2Var.f11810a; i12++) {
            int i13 = r2Var.f11811b[i12] >>> 3;
            u0 u0Var = (u0) r2Var.f11812c[i12];
            int iA = b1.a(8);
            int iA2 = b1.a(i13) + b1.a(16);
            int iA3 = b1.a(24);
            int iC2 = u0Var.c();
            iC = org.bouncycastle.jcajce.provider.asymmetric.a.C(iA + iA, iA2, b3.i.a(iC2, iC2, iA3), iC);
        }
        r2Var.f11813d = iC;
        return iC;
    }

    @Override // com.google.android.gms.internal.measurement.m2
    public final void c(Object obj, a60.s sVar, c1 c1Var) {
        this.f11403b.getClass();
        h1.f(obj);
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // com.google.android.gms.internal.measurement.m2
    public final void d(Object obj, Object obj2) {
        n2.b(obj, obj2);
    }

    @Override // com.google.android.gms.internal.measurement.m2
    public final boolean e(Object obj) {
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // com.google.android.gms.internal.measurement.m2
    public final void f(Object obj) {
        this.f11403b.getClass();
        r2 r2Var = ((k1) obj).zzc;
        if (r2Var.f11814e) {
            r2Var.f11814e = false;
        }
        h1 h1Var = d1.f11333a;
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // com.google.android.gms.internal.measurement.m2
    public final boolean g(k1 k1Var, k1 k1Var2) {
        return k1Var.zzc.equals(k1Var2.zzc);
    }

    @Override // com.google.android.gms.internal.measurement.m2
    public final void h(Object obj, byte[] bArr, int i11, int i12, q0 q0Var) {
        k1 k1Var = (k1) obj;
        if (k1Var.zzc == r2.f11809f) {
            k1Var.zzc = r2.a();
        }
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // com.google.android.gms.internal.measurement.m2
    public final void i(Object obj, s5 s5Var) {
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // com.google.android.gms.internal.measurement.m2
    public final int j(k1 k1Var) {
        return k1Var.zzc.hashCode();
    }
}
