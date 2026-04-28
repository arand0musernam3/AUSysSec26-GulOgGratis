package g3;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class w6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f19702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function0 f19703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function0 f19704c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Function1 f19705d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final z1.r f19706e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public t1.x f19707f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public t1.x f19708g;

    public w6(boolean z11, Function0 function0, Function0 function02, x6 x6Var, Function1 function1) {
        this.f19702a = z11;
        this.f19703b = function0;
        this.f19704c = function02;
        this.f19705d = function1;
        if (z11 && x6Var == x6.PartiallyExpanded) {
            i4.a.f("The initial value must not be set to PartiallyExpanded if skipPartiallyExpanded is set to true.");
            throw null;
        }
        float f11 = s6.f19476a;
        this.f19706e = new z1.r(x6Var, function1);
        this.f19707f = t1.c.i();
        this.f19708g = t1.c.i();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(z1.l1 r11, float r12, z70.c r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof g3.t6
            if (r0 == 0) goto L13
            r0 = r13
            g3.t6 r0 = (g3.t6) r0
            int r1 = r0.f19530m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19530m = r1
            goto L18
        L13:
            g3.t6 r0 = new g3.t6
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.f19529k
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f19530m
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L2a
            kotlin.jvm.internal.Ref$FloatRef r11 = r0.f19528j
            ba0.g.M(r13)
            r7 = r10
            goto L50
        L2a:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r11)
            r11 = 0
            return r11
        L31:
            ba0.g.M(r13)
            kotlin.jvm.internal.Ref$FloatRef r5 = new kotlin.jvm.internal.Ref$FloatRef
            r5.<init>()
            g3.v6 r4 = new g3.v6
            r9 = 0
            r7 = r10
            r6 = r11
            r8 = r12
            r4.<init>(r5, r6, r7, r8, r9)
            r0.f19528j = r5
            r0.f19530m = r3
            z1.r r11 = r7.f19706e
            java.lang.Object r11 = z1.r.b(r11, r4, r0)
            if (r11 != r1) goto L4f
            return r1
        L4f:
            r11 = r5
        L50:
            float r11 = r11.element
            java.lang.Float r12 = new java.lang.Float
            r12.<init>(r11)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: g3.w6.a(z1.l1, float, z70.c):java.lang.Object");
    }

    public final Object b(x6 x6Var, t1.x xVar, x70.c cVar) {
        Object objF = z1.k.f(this.f19706e, x6Var, xVar, cVar);
        return objF == y70.a.COROUTINE_SUSPENDED ? objF : Unit.f26487a;
    }

    public final Object c(z70.i iVar) {
        x6 x6Var = x6.Expanded;
        if (!((Boolean) this.f19705d.invoke(x6Var)).booleanValue()) {
            return Unit.f26487a;
        }
        Object objB = b(x6Var, this.f19707f, iVar);
        return objB == y70.a.COROUTINE_SUSPENDED ? objB : Unit.f26487a;
    }

    public final x6 d() {
        return (x6) this.f19706e.f46653h.getValue();
    }

    public final Object e(x70.c cVar) {
        x6 x6Var = x6.Hidden;
        if (!((Boolean) this.f19705d.invoke(x6Var)).booleanValue()) {
            return Unit.f26487a;
        }
        Object objB = b(x6Var, this.f19708g, cVar);
        return objB == y70.a.COROUTINE_SUSPENDED ? objB : Unit.f26487a;
    }

    public final boolean f() {
        return this.f19706e.f46652g.getValue() != x6.Hidden;
    }

    public final Object g(z70.i iVar) {
        if (this.f19702a) {
            com.braze.h2.b("Attempted to animate to partial expanded when skipPartiallyExpanded was enabled. Set skipPartiallyExpanded to false to use this function.");
            return null;
        }
        x6 x6Var = x6.PartiallyExpanded;
        if (!((Boolean) this.f19705d.invoke(x6Var)).booleanValue()) {
            return Unit.f26487a;
        }
        Object objB = b(x6Var, this.f19708g, iVar);
        return objB == y70.a.COROUTINE_SUSPENDED ? objB : Unit.f26487a;
    }

    public final Object h(z70.i iVar) {
        z1.g1 g1VarD = this.f19706e.d();
        x6 x6Var = x6.PartiallyExpanded;
        if (!((z1.a0) g1VarD).c(x6Var)) {
            x6Var = x6.Expanded;
        }
        if (!((Boolean) this.f19705d.invoke(x6Var)).booleanValue()) {
            return Unit.f26487a;
        }
        Object objB = b(x6Var, this.f19707f, iVar);
        return objB == y70.a.COROUTINE_SUSPENDED ? objB : Unit.f26487a;
    }
}
