package v1;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import z1.h3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class y1 implements h3 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final ub.a f41887j = new ub.a(28, new u60.a(7), new t1.w1(14));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m3.h1 f41888a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f41893f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m3.i0 f41895h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final m3.i0 f41896i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m3.h1 f41889b = new m3.h1(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m3.h1 f41890c = new m3.h1(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b2.l f41891d = new b2.l();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m3.h1 f41892e = new m3.h1(Integer.MAX_VALUE);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final z1.g0 f41894g = new z1.g0(new sg.c(this, 16));

    public y1(int i11) {
        this.f41888a = new m3.h1(i11);
        final int i12 = 0;
        this.f41895h = m3.i.q(new Function0(this) { // from class: v1.x1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ y1 f41879b;

            {
                this.f41879b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        y1 y1Var = this.f41879b;
                        return Boolean.valueOf(y1Var.f41888a.h() < y1Var.f41892e.h());
                    default:
                        return Boolean.valueOf(this.f41879b.f41888a.h() > 0);
                }
            }
        });
        final int i13 = 1;
        this.f41896i = m3.i.q(new Function0(this) { // from class: v1.x1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ y1 f41879b;

            {
                this.f41879b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        y1 y1Var = this.f41879b;
                        return Boolean.valueOf(y1Var.f41888a.h() < y1Var.f41892e.h());
                    default:
                        return Boolean.valueOf(this.f41879b.f41888a.h() > 0);
                }
            }
        });
    }

    @Override // z1.h3
    public final Object a(j1 j1Var, Function2 function2, z70.c cVar) {
        Object objA = this.f41894g.a(j1Var, function2, cVar);
        return objA == y70.a.COROUTINE_SUSPENDED ? objA : Unit.f26487a;
    }

    @Override // z1.h3
    public final boolean b() {
        return this.f41894g.b();
    }

    @Override // z1.h3
    public final boolean c() {
        return ((Boolean) this.f41896i.getValue()).booleanValue();
    }

    @Override // z1.h3
    public final boolean d() {
        return ((Boolean) this.f41895h.getValue()).booleanValue();
    }

    @Override // z1.h3
    public final float e(float f11) {
        return this.f41894g.e(f11);
    }

    public final void f(int i11) {
        m3.h1 h1Var = this.f41888a;
        this.f41892e.i(i11);
        z3.g gVarC = z3.v.c();
        Function1 function1E = gVarC != null ? gVarC.e() : null;
        z3.g gVarD = z3.v.d(gVarC);
        try {
            if (h1Var.h() > i11) {
                h1Var.i(i11);
            }
        } finally {
            z3.v.f(gVarC, gVarD, function1E);
        }
    }
}
