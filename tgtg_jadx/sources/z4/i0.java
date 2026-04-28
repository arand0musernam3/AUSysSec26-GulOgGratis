package z4;

import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 implements z1, w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l0 f47144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q0 f47145b;

    public i0(q0 q0Var) {
        this.f47145b = q0Var;
        this.f47144a = q0Var.f47207h;
    }

    @Override // z5.c
    public final long I(float f11) {
        return this.f47144a.I(f11);
    }

    @Override // z5.c
    public final float O(int i11) {
        return this.f47144a.O(i11);
    }

    @Override // z5.c
    public final float R(float f11) {
        return f11 / this.f47144a.a();
    }

    @Override // z5.c
    public final float X() {
        return this.f47144a.f47175c;
    }

    @Override // z4.u
    public final boolean Z() {
        return this.f47144a.Z();
    }

    @Override // z5.c
    public final float a() {
        return this.f47144a.f47174b;
    }

    @Override // z5.c
    public final float c0(float f11) {
        return this.f47144a.a() * f11;
    }

    @Override // z4.u
    public final z5.m getLayoutDirection() {
        return this.f47144a.f47173a;
    }

    @Override // z4.z1
    public final List i(Object obj, Function2 function2) {
        q0 q0Var = this.f47145b;
        q1.t0 t0Var = q0Var.f47209j;
        q1.t0 t0Var2 = q0Var.l;
        b5.m0 m0Var = q0Var.f47200a;
        q1.t0 t0Var3 = q0Var.f47206g;
        b5.m0 m0Var2 = (b5.m0) t0Var3.d(obj);
        if (m0Var2 != null && ((o3.e) ((o3.b) m0Var.o()).f31822b).i(m0Var2) < q0Var.f47203d) {
            return m0Var2.m();
        }
        o3.e eVar = q0Var.f47211m;
        if (eVar.f31832c < q0Var.f47204e) {
            y4.a.a("Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list.");
        }
        b5.m0 m0Var3 = (b5.m0) t0Var3.d(obj);
        int i11 = eVar.f31832c;
        int i12 = q0Var.f47204e;
        if (i11 == i12) {
            eVar.b(obj);
        } else {
            Object[] objArr = eVar.f31830a;
            Object obj2 = objArr[i12];
            objArr[i12] = obj;
        }
        q0Var.f47204e++;
        boolean zA = t0Var.a(obj);
        if (zA || m0Var3 != null) {
            if (!zA && m0Var3 != null) {
                q0Var.i(((o3.e) ((o3.b) m0Var.o()).f31822b).i(m0Var3), ((o3.e) ((o3.b) m0Var.o()).f31822b).f31832c);
                q0Var.f47213o++;
                t0Var3.k(obj);
                t0Var.m(obj, m0Var3);
                t0Var2.m(obj, q0Var.e(obj));
                if (m0Var.I()) {
                    q0Var.g();
                }
            }
            b5.m0 m0Var4 = (b5.m0) t0Var.d(obj);
            j0 j0Var = m0Var4 != null ? (j0) q0Var.f47205f.d(m0Var4) : null;
            if (j0Var != null && j0Var.f47152d) {
                q0Var.k(m0Var4, obj, false, function2);
            }
            if ((j0Var != null ? j0Var.f47154f : null) != null) {
                q0Var.c(j0Var, true);
            }
        } else {
            if (m0Var.I()) {
                q0Var.g();
                if (!t0Var3.b(obj)) {
                    t0Var2.k(obj);
                    Object objD = t0Var.d(obj);
                    if (objD == null) {
                        objD = q0Var.l(obj);
                        if (objD != null) {
                            q0Var.i(((o3.e) ((o3.b) m0Var.o()).f31822b).i(objD), ((o3.e) ((o3.b) m0Var.o()).f31822b).f31832c);
                            q0Var.f47213o++;
                        } else {
                            int i13 = ((o3.e) ((o3.b) m0Var.o()).f31822b).f31832c;
                            b5.m0 m0Var5 = new b5.m0(2);
                            m0Var.f5881r = true;
                            m0Var.C(i13, m0Var5);
                            m0Var.f5881r = false;
                            q0Var.f47213o++;
                            objD = m0Var5;
                        }
                        t0Var.m(obj, objD);
                    }
                    q0Var.k((b5.m0) objD, obj, false, function2);
                }
            }
            t0Var2.m(obj, q0Var.e(obj));
        }
        b5.m0 m0Var6 = (b5.m0) t0Var.d(obj);
        if (m0Var6 == null) {
            return kotlin.collections.n0.f26529a;
        }
        List listU0 = m0Var6.H.f5942p.u0();
        o3.b bVar = (o3.b) listU0;
        int i14 = ((o3.e) bVar.f31822b).f31832c;
        for (int i15 = 0; i15 < i14; i15++) {
            ((b5.f1) bVar.get(i15)).f5799f.f5929b = true;
        }
        return listU0;
    }

    @Override // z5.c
    public final int j0(long j9) {
        return this.f47144a.j0(j9);
    }

    @Override // z5.c
    public final long l(float f11) {
        return this.f47144a.l(f11);
    }

    @Override // z5.c
    public final long m(long j9) {
        return this.f47144a.m(j9);
    }

    @Override // z4.w0
    public final v0 m0(int i11, int i12, Map map, Function1 function1, Function1 function12) {
        return this.f47144a.m0(i11, i12, map, function1, function12);
    }

    @Override // z5.c
    public final int q0(float f11) {
        return this.f47144a.q0(f11);
    }

    @Override // z4.w0
    public final v0 r(int i11, int i12, Map map, Function1 function1) {
        return this.f47144a.m0(i11, i12, map, null, function1);
    }

    @Override // z5.c
    public final float t(long j9) {
        return this.f47144a.t(j9);
    }

    @Override // z5.c
    public final long x0(long j9) {
        return this.f47144a.x0(j9);
    }

    @Override // z5.c
    public final float z0(long j9) {
        return this.f47144a.z0(j9);
    }
}
