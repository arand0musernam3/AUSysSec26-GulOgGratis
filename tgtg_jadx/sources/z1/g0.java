package z1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 implements h3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function1 f46514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f0 f46515b = new f0(this);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v1.l1 f46516c = new v1.l1();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m3.k1 f46517d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m3.k1 f46518e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m3.k1 f46519f;

    public g0(Function1 function1) {
        this.f46514a = function1;
        Boolean bool = Boolean.FALSE;
        this.f46517d = m3.i.w(bool);
        this.f46518e = m3.i.w(bool);
        this.f46519f = m3.i.w(bool);
    }

    @Override // z1.h3
    public final Object a(v1.j1 j1Var, Function2 function2, z70.c cVar) {
        Object objN = v80.f0.n(new tg.g(this, j1Var, function2, null, 27), cVar);
        return objN == y70.a.COROUTINE_SUSPENDED ? objN : Unit.f26487a;
    }

    @Override // z1.h3
    public final boolean b() {
        return ((Boolean) this.f46517d.getValue()).booleanValue();
    }

    @Override // z1.h3
    public final float e(float f11) {
        return ((Number) this.f46514a.invoke(Float.valueOf(f11))).floatValue();
    }
}
