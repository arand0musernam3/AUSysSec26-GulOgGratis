package t1;

import kotlin.jvm.internal.Intrinsics;
import m3.c3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class p1 implements c3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v1 f39504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m3.k1 f39505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m3.k1 f39506c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m3.k1 f39507d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public r0 f39508e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public k1 f39509f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m3.k1 f39510g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m3.g1 f39511h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f39512i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final m3.k1 f39513j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public o f39514k;
    public final m3.i1 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f39515m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final b1 f39516n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ q1 f39517o;

    /* JADX WARN: Type inference failed for: r10v9, types: [java.lang.Object, java.util.Map] */
    public p1(q1 q1Var, Object obj, o oVar, v1 v1Var) {
        this.f39517o = q1Var;
        this.f39504a = v1Var;
        m3.k1 k1VarW = m3.i.w(obj);
        this.f39505b = k1VarW;
        Object objInvoke = null;
        m3.k1 k1VarW2 = m3.i.w(c.j(0.0f, 0.0f, null, 7));
        this.f39506c = k1VarW2;
        this.f39507d = m3.i.w(new k1((x) k1VarW2.getValue(), v1Var, obj, k1VarW.getValue(), oVar));
        this.f39510g = m3.i.w(Boolean.TRUE);
        this.f39511h = new m3.g1(-1.0f);
        this.f39513j = m3.i.w(obj);
        this.f39514k = oVar;
        this.l = new m3.i1(b().b());
        Float f11 = (Float) d2.f39417a.get(v1Var);
        if (f11 != null) {
            float fFloatValue = f11.floatValue();
            o oVar2 = (o) v1Var.f39591a.invoke(obj);
            int iB = oVar2.b();
            for (int i11 = 0; i11 < iB; i11++) {
                oVar2.e(fFloatValue, i11);
            }
            objInvoke = this.f39504a.f39592b.invoke(oVar2);
        }
        this.f39516n = c.j(0.0f, 0.0f, objInvoke, 3);
    }

    public final k1 b() {
        return (k1) this.f39507d.getValue();
    }

    public final void d(long j9) {
        if (this.f39511h.h() == -1.0f) {
            this.f39515m = true;
            if (Intrinsics.areEqual(b().f39475c, b().f39476d)) {
                e(b().f39475c);
            } else {
                e(b().f(j9));
                this.f39514k = b().d(j9);
            }
        }
    }

    public final void e(Object obj) {
        this.f39513j.setValue(obj);
    }

    public final void f(Object obj, boolean z11) {
        k1 k1Var = this.f39509f;
        Object obj2 = k1Var != null ? k1Var.f39475c : null;
        m3.k1 k1Var2 = this.f39505b;
        boolean zAreEqual = Intrinsics.areEqual(obj2, k1Var2.getValue());
        m3.i1 i1Var = this.l;
        m3.k1 k1Var3 = this.f39507d;
        x xVar = this.f39516n;
        if (zAreEqual) {
            k1Var3.setValue(new k1(xVar, this.f39504a, obj, obj, this.f39514k.c()));
            this.f39512i = true;
            i1Var.i(b().b());
            return;
        }
        m3.k1 k1Var4 = this.f39506c;
        if (!z11 || this.f39515m || (((x) k1Var4.getValue()) instanceof b1)) {
            xVar = (x) k1Var4.getValue();
        }
        q1 q1Var = this.f39517o;
        long jE = q1Var.e();
        m3.k1 k1Var5 = q1Var.f39544h;
        k1Var3.setValue(new k1(jE <= 0 ? xVar : new c1(xVar, q1Var.e()), this.f39504a, obj, k1Var2.getValue(), this.f39514k));
        i1Var.i(b().b());
        this.f39512i = false;
        k1Var5.setValue(Boolean.TRUE);
        if (q1Var.h()) {
            z3.r rVar = q1Var.f39545i;
            int size = rVar.size();
            long jMax = 0;
            for (int i11 = 0; i11 < size; i11++) {
                p1 p1Var = (p1) rVar.get(i11);
                jMax = Math.max(jMax, p1Var.l.h());
                p1Var.d(0L);
            }
            k1Var5.setValue(Boolean.FALSE);
        }
    }

    public final void g(Object obj, Object obj2, x xVar) {
        this.f39505b.setValue(obj2);
        this.f39506c.setValue(xVar);
        if (Intrinsics.areEqual(b().f39476d, obj) && Intrinsics.areEqual(b().f39475c, obj2)) {
            return;
        }
        f(obj, false);
    }

    @Override // m3.c3
    public final Object getValue() {
        return this.f39513j.getValue();
    }

    public final void h(Object obj, x xVar) {
        if (this.f39512i) {
            k1 k1Var = this.f39509f;
            if (Intrinsics.areEqual(obj, k1Var != null ? k1Var.f39475c : null)) {
                return;
            }
        }
        m3.k1 k1Var2 = this.f39505b;
        boolean zAreEqual = Intrinsics.areEqual(k1Var2.getValue(), obj);
        m3.g1 g1Var = this.f39511h;
        if (zAreEqual && g1Var.h() == -1.0f) {
            return;
        }
        k1Var2.setValue(obj);
        this.f39506c.setValue(xVar);
        Object value = g1Var.h() == -3.0f ? obj : this.f39513j.getValue();
        m3.k1 k1Var3 = this.f39510g;
        f(value, !((Boolean) k1Var3.getValue()).booleanValue());
        k1Var3.setValue(Boolean.valueOf(g1Var.h() == -3.0f));
        if (g1Var.h() >= 0.0f) {
            e(b().f((long) (g1Var.h() * b().b())));
        } else if (g1Var.h() == -3.0f) {
            e(obj);
        }
        this.f39512i = false;
        g1Var.i(-1.0f);
    }

    public final String toString() {
        return "current value: " + this.f39513j.getValue() + ", target: " + this.f39505b.getValue() + ", spec: " + ((x) this.f39506c.getValue());
    }
}
