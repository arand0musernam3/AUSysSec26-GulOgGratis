package t1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k1 implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x1 f39473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v1 f39474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f39475c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f39476d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public o f39477e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public o f39478f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o f39479g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f39480h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public o f39481i;

    public k1(i iVar, v1 v1Var, Object obj, Object obj2, o oVar) {
        this.f39473a = iVar.a(v1Var);
        this.f39474b = v1Var;
        this.f39475c = obj2;
        this.f39476d = obj;
        this.f39477e = (o) v1Var.f39591a.invoke(obj);
        Function1 function1 = v1Var.f39591a;
        this.f39478f = (o) function1.invoke(obj2);
        this.f39479g = oVar != null ? c.e(oVar) : ((o) function1.invoke(obj)).c();
        this.f39480h = -1L;
    }

    @Override // t1.e
    public final boolean a() {
        return this.f39473a.a();
    }

    @Override // t1.e
    public final long b() {
        if (this.f39480h < 0) {
            this.f39480h = this.f39473a.b(this.f39477e, this.f39478f, this.f39479g);
        }
        return this.f39480h;
    }

    @Override // t1.e
    public final v1 c() {
        return this.f39474b;
    }

    @Override // t1.e
    public final o d(long j9) {
        if (!e(j9)) {
            return this.f39473a.m(j9, this.f39477e, this.f39478f, this.f39479g);
        }
        o oVar = this.f39481i;
        if (oVar != null) {
            return oVar;
        }
        o oVarK = this.f39473a.k(this.f39477e, this.f39478f, this.f39479g);
        this.f39481i = oVarK;
        return oVarK;
    }

    @Override // t1.e
    public final Object f(long j9) {
        if (e(j9)) {
            return this.f39475c;
        }
        o oVarE = this.f39473a.e(j9, this.f39477e, this.f39478f, this.f39479g);
        int iB = oVarE.b();
        for (int i11 = 0; i11 < iB; i11++) {
            if (Float.isNaN(oVarE.a(i11))) {
                o0.b("AnimationVector cannot contain a NaN. " + oVarE + ". Animation: " + this + ", playTimeNanos: " + j9);
            }
        }
        return this.f39474b.f39592b.invoke(oVarE);
    }

    @Override // t1.e
    public final Object g() {
        return this.f39475c;
    }

    public final void h(Object obj) {
        if (Intrinsics.areEqual(obj, this.f39476d)) {
            return;
        }
        this.f39476d = obj;
        this.f39477e = (o) this.f39474b.f39591a.invoke(obj);
        this.f39481i = null;
        this.f39480h = -1L;
    }

    public final void i(Object obj) {
        if (Intrinsics.areEqual(this.f39475c, obj)) {
            return;
        }
        this.f39475c = obj;
        this.f39478f = (o) this.f39474b.f39591a.invoke(obj);
        this.f39481i = null;
        this.f39480h = -1L;
    }

    public final String toString() {
        return "TargetBasedAnimation: " + this.f39476d + " -> " + this.f39475c + ",initial velocity: " + this.f39479g + ", duration: " + (b() / 1000000) + " ms,animationSpec: " + this.f39473a;
    }
}
