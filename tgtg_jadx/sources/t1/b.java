package t1;

import f0.o2;
import f0.p2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v1 f39357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f39358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f39359c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m3.k1 f39360d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m3.k1 f39361e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n0 f39362f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b1 f39363g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final o f39364h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final o f39365i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final o f39366j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final o f39367k;

    public b(Object obj, v1 v1Var, Object obj2) {
        this.f39357a = v1Var;
        this.f39358b = obj2;
        j jVar = new j(v1Var, obj, null, 60);
        this.f39359c = jVar;
        this.f39360d = m3.i.w(Boolean.FALSE);
        this.f39361e = m3.i.w(obj);
        this.f39362f = new n0();
        this.f39363g = new b1(obj2, 3);
        o oVar = jVar.f39465c;
        boolean z11 = oVar instanceof k;
        o oVar2 = z11 ? c.f39384e : oVar instanceof l ? c.f39385f : oVar instanceof m ? c.f39386g : c.f39387h;
        this.f39364h = oVar2;
        o oVar3 = z11 ? c.f39380a : oVar instanceof l ? c.f39381b : oVar instanceof m ? c.f39382c : c.f39383d;
        this.f39365i = oVar3;
        this.f39366j = oVar2;
        this.f39367k = oVar3;
    }

    public static final Object a(b bVar, Object obj) {
        v1 v1Var = bVar.f39357a;
        o oVar = bVar.f39367k;
        o oVar2 = bVar.f39366j;
        if (!Intrinsics.areEqual(oVar2, bVar.f39364h) || !Intrinsics.areEqual(oVar, bVar.f39365i)) {
            o oVar3 = (o) v1Var.f39591a.invoke(obj);
            int iB = oVar3.b();
            boolean z11 = false;
            for (int i11 = 0; i11 < iB; i11++) {
                if (oVar3.a(i11) < oVar2.a(i11) || oVar3.a(i11) > oVar.a(i11)) {
                    oVar3.e(n80.p.b(oVar3.a(i11), oVar2.a(i11), oVar.a(i11)), i11);
                    z11 = true;
                }
            }
            if (z11) {
                return v1Var.f39592b.invoke(oVar3);
            }
        }
        return obj;
    }

    public static final void b(b bVar) {
        j jVar = bVar.f39359c;
        jVar.f39465c.d();
        jVar.f39466d = Long.MIN_VALUE;
        bVar.f39360d.setValue(Boolean.FALSE);
    }

    public static Object c(b bVar, Object obj, i iVar, Function1 function1, x70.c cVar, int i11) {
        if ((i11 & 2) != 0) {
            iVar = bVar.f39363g;
        }
        i iVar2 = iVar;
        Object objInvoke = bVar.f39357a.f39592b.invoke(bVar.f39359c.f39465c);
        if ((i11 & 8) != 0) {
            function1 = null;
        }
        Function1 function12 = function1;
        Object objD = bVar.d();
        v1 v1Var = bVar.f39357a;
        return n0.a(bVar.f39362f, new a(bVar, objInvoke, new k1(iVar2, v1Var, objD, obj, (o) v1Var.f39591a.invoke(objInvoke)), bVar.f39359c.f39466d, function12, null), cVar);
    }

    public final Object d() {
        return this.f39359c.f39464b.getValue();
    }

    public final boolean e() {
        return ((Boolean) this.f39360d.getValue()).booleanValue();
    }

    public final Object f(Object obj, x70.c cVar) {
        Object objA = n0.a(this.f39362f, new o2(this, obj, null, 2), cVar);
        return objA == y70.a.COROUTINE_SUSPENDED ? objA : Unit.f26487a;
    }

    public final Object g(z70.i iVar) {
        Object objA = n0.a(this.f39362f, new p2(this, null, 1), iVar);
        return objA == y70.a.COROUTINE_SUSPENDED ? objA : Unit.f26487a;
    }

    public /* synthetic */ b(Object obj, v1 v1Var, Object obj2, int i11) {
        this(obj, v1Var, (i11 & 4) != 0 ? null : obj2);
    }
}
