package z4;

import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l1 implements z5.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f47177a;

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(l1 l1Var, m1 m1Var) {
        l1Var.getClass();
        if (m1Var instanceof b5.i1) {
            ((b5.i1) m1Var).L(l1Var.f47177a);
        }
    }

    public static void n(l1 l1Var, m1 m1Var, long j9) {
        l1Var.getClass();
        b(l1Var, m1Var);
        m1Var.h0(z5.j.d(j9, m1Var.f47187e), 0.0f, null);
    }

    public static void o(l1 l1Var, m1 m1Var, int i11, int i12) {
        long j9 = (((long) i11) << 32) | (((long) i12) & 4294967295L);
        if (l1Var.e() == z5.m.Ltr || l1Var.g() == 0) {
            b(l1Var, m1Var);
            m1Var.h0(z5.j.d(j9, m1Var.f47187e), 0.0f, null);
        } else {
            int iG = (l1Var.g() - m1Var.f47183a) - ((int) (j9 >> 32));
            b(l1Var, m1Var);
            m1Var.h0(z5.j.d((((long) iG) << 32) | (((long) ((int) (j9 & 4294967295L))) & 4294967295L), m1Var.f47187e), 0.0f, null);
        }
    }

    public static void p(l1 l1Var, m1 m1Var, int i11, int i12) {
        f0 f0Var = n1.f47190a;
        long j9 = (((long) i11) << 32) | (((long) i12) & 4294967295L);
        if (l1Var.e() == z5.m.Ltr || l1Var.g() == 0) {
            b(l1Var, m1Var);
            m1Var.h0(z5.j.d(j9, m1Var.f47187e), 0.0f, f0Var);
        } else {
            int iG = (l1Var.g() - m1Var.f47183a) - ((int) (j9 >> 32));
            b(l1Var, m1Var);
            m1Var.h0(z5.j.d((((long) iG) << 32) | (((long) ((int) (j9 & 4294967295L))) & 4294967295L), m1Var.f47187e), 0.0f, f0Var);
        }
    }

    public static void q(l1 l1Var, m1 m1Var, long j9) {
        f0 f0Var = n1.f47190a;
        if (l1Var.e() == z5.m.Ltr || l1Var.g() == 0) {
            b(l1Var, m1Var);
            m1Var.h0(z5.j.d(j9, m1Var.f47187e), 0.0f, f0Var);
        } else {
            int iG = (l1Var.g() - m1Var.f47183a) - ((int) (j9 >> 32));
            b(l1Var, m1Var);
            m1Var.h0(z5.j.d((((long) ((int) (j9 & 4294967295L))) & 4294967295L) | (((long) iG) << 32), m1Var.f47187e), 0.0f, f0Var);
        }
    }

    public static /* synthetic */ void v(l1 l1Var, m1 m1Var, int i11, int i12, Function1 function1, int i13) {
        if ((i13 & 8) != 0) {
            function1 = n1.f47190a;
        }
        l1Var.u(m1Var, i11, i12, 0.0f, function1);
    }

    public static void w(l1 l1Var, m1 m1Var, long j9) {
        f0 f0Var = n1.f47190a;
        l1Var.getClass();
        b(l1Var, m1Var);
        m1Var.h0(z5.j.d(j9, m1Var.f47187e), 0.0f, f0Var);
    }

    public abstract z5.m e();

    public abstract int g();

    public final void j(m1 m1Var, int i11, int i12, float f11) {
        b(this, m1Var);
        m1Var.h0(z5.j.d((((long) i12) & 4294967295L) | (((long) i11) << 32), m1Var.f47187e), f11, null);
    }

    public final void u(m1 m1Var, int i11, int i12, float f11, Function1 function1) {
        b(this, m1Var);
        m1Var.h0(z5.j.d((((long) i12) & 4294967295L) | (((long) i11) << 32), m1Var.f47187e), f11, function1);
    }

    public float c(q qVar, float f11) {
        return f11;
    }
}
