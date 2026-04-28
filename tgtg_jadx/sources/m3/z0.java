package m3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m2 f29492a;

    public z0(m2 m2Var) {
        this.f29492a = m2Var;
    }

    public static final void a(q2 q2Var, int i11) {
        while (q2Var.f29402v >= 0 && q2Var.f29401u <= i11) {
            q2Var.O();
            q2Var.j();
        }
    }

    public final q1.t0 b(c cVar, q1.b1 b1Var) {
        m2 m2Var;
        int i11;
        Object[] objArr = b1Var.f35721a;
        int i12 = b1Var.f35722b;
        int i13 = 0;
        while (true) {
            m2Var = this.f29492a;
            if (i13 >= i12) {
                break;
            }
            if (m2Var.h(((a1) objArr[i13]).f29202e)) {
                i13++;
            } else {
                q1.o0 o0Var = new q1.o0();
                Object[] objArr2 = b1Var.f35721a;
                int i14 = b1Var.f35722b;
                for (int i15 = 0; i15 < i14; i15++) {
                    Object obj = objArr2[i15];
                    if (m2Var.h(((a1) obj).f29202e)) {
                        o0Var.g(obj);
                    }
                }
                b1Var = o0Var;
            }
        }
        jd.a aVar = new jd.a(this, 23);
        int i16 = 1;
        if (b1Var.f35722b > 1) {
            Comparable comparable = (Comparable) aVar.invoke(b1Var.b(0));
            int i17 = b1Var.f35722b;
            int i18 = 1;
            while (true) {
                if (i18 >= i17) {
                    break;
                }
                Comparable comparable2 = (Comparable) aVar.invoke(b1Var.b(i18));
                if (comparable.compareTo(comparable2) > 0) {
                    q1.o0 o0Var2 = new q1.o0(b1Var.f35722b);
                    Object[] objArr3 = b1Var.f35721a;
                    int i19 = b1Var.f35722b;
                    for (int i21 = 0; i21 < i19; i21++) {
                        o0Var2.g(objArr3[i21]);
                    }
                    o3.b bVar = o0Var2.f35803c;
                    if (bVar == null) {
                        bVar = new o3.b(o0Var2, i16);
                        o0Var2.f35803c = bVar;
                    }
                    if (((q1.o0) bVar.f31822b).f35722b > 1) {
                        kotlin.collections.h0.r(bVar, new a3.d2(aVar, 7));
                    }
                    b1Var = o0Var2;
                } else {
                    i18++;
                    comparable = comparable2;
                }
            }
        }
        if (b1Var.d()) {
            q1.t0 t0Var = q1.g1.f35761b;
            t0Var.getClass();
            return t0Var;
        }
        long[] jArr = q1.g1.f35760a;
        q1.t0 t0Var2 = new q1.t0();
        q2 q2VarG = m2Var.g();
        try {
            Object[] objArr4 = b1Var.f35721a;
            int i22 = b1Var.f35722b;
            for (int i23 = 0; i23 < i22; i23++) {
                a1 a1Var = (a1) objArr4[i23];
                int iC = q2VarG.c(a1Var.f29202e);
                int iG = q2VarG.G(iC, q2VarG.f29383b);
                a(q2VarG, iG);
                a(q2VarG, iG);
                while (true) {
                    i11 = q2VarG.f29400t;
                    if (i11 == iG || i11 == q2VarG.f29401u) {
                        break;
                    }
                    if (iG < q2VarG.u(i11) + i11) {
                        q2VarG.R();
                    } else {
                        q2VarG.N();
                    }
                }
                if (i11 != iG) {
                    v.a("Unexpected slot table structure");
                }
                q2VarG.R();
                q2VarG.a(iC - q2VarG.f29400t);
                t0Var2.m(a1Var, v.c(a1Var.f29200c, a1Var, q2VarG, cVar));
            }
            a(q2VarG, Integer.MAX_VALUE);
            q2VarG.e(true);
            return t0Var2;
        } catch (Throwable th2) {
            q2VarG.e(false);
            throw th2;
        }
    }
}
