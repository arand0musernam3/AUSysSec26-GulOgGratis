package z1;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function1 f46646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Function1 f46647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Function0 f46648c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public t1.i f46649d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public t1.s f46650e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m3.k1 f46652g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m3.k1 f46653h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final m3.g1 f46656k;
    public final m3.k1 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final m3.k1 f46657m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final q f46658n;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final v1.l1 f46651f = new v1.l1();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final m3.i0 f46654i = m3.i.q(new o(this, 0));

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final m3.g1 f46655j = new m3.g1(Float.NaN);

    public r(Object obj, Function1 function1) {
        this.f46646a = new yj.m(6);
        this.f46652g = m3.i.w(obj);
        this.f46653h = m3.i.w(obj);
        m3.i.r(new o(this, 1), m3.f.f29275g);
        this.f46656k = new m3.g1(0.0f);
        this.l = m3.i.w(null);
        this.f46657m = m3.i.w(new a0(kotlin.collections.n0.f26529a, new float[0]));
        this.f46658n = new q(this);
        this.f46646a = function1;
    }

    public static Object b(r rVar, i80.n nVar, z70.c cVar) {
        v1.j1 j1Var = v1.j1.Default;
        v1.l1 l1Var = rVar.f46651f;
        b0.r2 r2Var = new b0.r2(nVar, (x70.c) null, rVar);
        l1Var.getClass();
        Object objN = v80.f0.n(new b0.c2(j1Var, l1Var, r2Var, (x70.c) null), cVar);
        return objN == y70.a.COROUTINE_SUSPENDED ? objN : Unit.f26487a;
    }

    public static void k(r rVar, a0 a0Var) {
        Object value;
        m3.g1 g1Var = rVar.f46655j;
        m3.i0 i0Var = rVar.f46654i;
        if (Float.isNaN(g1Var.h()) || (value = a0Var.a(rVar.f46655j.h())) == null) {
            value = i0Var.getValue();
        }
        rVar.j(a0Var, value);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.Object r12, v1.j1 r13, i80.o r14, x70.c r15) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r15 instanceof z1.p
            if (r0 == 0) goto L13
            r0 = r15
            z1.p r0 = (z1.p) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            z1.p r0 = new z1.p
            r0.<init>(r11, r15)
        L18:
            java.lang.Object r15 = r0.f46629j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            m3.k1 r3 = r11.l
            r4 = 1
            r9 = 0
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2f
            ba0.g.M(r15)     // Catch: java.lang.Throwable -> L2b
            r6 = r11
            goto L61
        L2b:
            r0 = move-exception
            r12 = r0
            r6 = r11
            goto L6b
        L2f:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r12)
            r12 = 0
            return r12
        L36:
            ba0.g.M(r15)
            z1.g1 r15 = r11.d()
            z1.a0 r15 = (z1.a0) r15
            boolean r15 = r15.c(r12)
            if (r15 == 0) goto L6f
            v1.l1 r15 = r11.f46651f     // Catch: java.lang.Throwable -> L68
            aa.t r5 = new aa.t     // Catch: java.lang.Throwable -> L68
            r10 = 5
            r6 = r11
            r7 = r12
            r8 = r14
            r5.<init>(r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L65
            r0.l = r4     // Catch: java.lang.Throwable -> L65
            r15.getClass()     // Catch: java.lang.Throwable -> L65
            b0.c2 r12 = new b0.c2     // Catch: java.lang.Throwable -> L65
            r12.<init>(r13, r15, r5, r9)     // Catch: java.lang.Throwable -> L65
            java.lang.Object r12 = v80.f0.n(r12, r0)     // Catch: java.lang.Throwable -> L65
            if (r12 != r1) goto L61
            return r1
        L61:
            r3.setValue(r9)
            goto L87
        L65:
            r0 = move-exception
        L66:
            r12 = r0
            goto L6b
        L68:
            r0 = move-exception
            r6 = r11
            goto L66
        L6b:
            r3.setValue(r9)
            throw r12
        L6f:
            r6 = r11
            r7 = r12
            kotlin.jvm.functions.Function1 r12 = r6.f46646a
            java.lang.Object r12 = r12.invoke(r7)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L87
            m3.k1 r12 = r6.f46653h
            r12.setValue(r7)
            r11.h(r7)
        L87:
            kotlin.Unit r12 = kotlin.Unit.f26487a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.r.a(java.lang.Object, v1.j1, i80.o, x70.c):java.lang.Object");
    }

    public final float c(float f11) {
        float f12 = f(f11);
        float fG = f12 - g();
        this.f46658n.a(f12, 0.0f);
        return fG;
    }

    public final g1 d() {
        return (g1) this.f46657m.getValue();
    }

    public final boolean e() {
        return (this.f46647b == null || this.f46648c == null || this.f46649d == null || this.f46650e == null) ? false : true;
    }

    public final float f(float f11) {
        m3.g1 g1Var = this.f46655j;
        return n80.p.b((Float.isNaN(g1Var.h()) ? 0.0f : g1Var.h()) + f11, ((a0) d()).e(), ((a0) d()).d());
    }

    public final float g() {
        m3.g1 g1Var = this.f46655j;
        if (Float.isNaN(g1Var.h())) {
            c2.a.c("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        }
        return g1Var.h();
    }

    public final void h(Object obj) {
        this.f46652g.setValue(obj);
    }

    public final Object i(float f11, z70.c cVar) {
        if (!e()) {
            c2.a.a("AnchoredDraggableState was configured through a constructor without providing positional and velocity threshold. This overload of settle has been deprecated. Please refer to AnchoredDraggableState#settle(animationSpec) for more information.");
        }
        Object value = this.f46652g.getValue();
        g1 g1VarD = d();
        float fG = g();
        Function1 function1 = this.f46647b;
        Function0 function0 = null;
        if (function1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("positionalThreshold");
            function1 = null;
        }
        Function0 function02 = this.f46648c;
        if (function02 != null) {
            function0 = function02;
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("velocityThreshold");
        }
        Object objC = k.c(g1VarD, fG, f11, function1, function0);
        return ((Boolean) this.f46646a.invoke(objC)).booleanValue() ? k.h(this, objC, f11, cVar) : k.h(this, value, f11, cVar);
    }

    public final void j(g1 g1Var, Object obj) {
        if (Intrinsics.areEqual(d(), g1Var)) {
            return;
        }
        this.f46657m.setValue(g1Var);
        v1.l1 l1Var = this.f46651f;
        e90.c cVar = l1Var.f41780b;
        e90.c cVar2 = l1Var.f41780b;
        boolean zTryLock = cVar.tryLock();
        m3.k1 k1Var = this.l;
        if (zTryLock) {
            try {
                q qVar = this.f46658n;
                float f11 = ((a0) d()).f(obj);
                if (!Float.isNaN(f11)) {
                    qVar.a(f11, 0.0f);
                    k1Var.setValue(null);
                }
                h(obj);
                this.f46653h.setValue(obj);
                cVar2.e(null);
            } catch (Throwable th2) {
                cVar2.e(null);
                throw th2;
            }
        }
        if (zTryLock) {
            return;
        }
        k1Var.setValue(obj);
    }
}
