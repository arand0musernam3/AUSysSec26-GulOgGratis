package t1;

import m3.c3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements c3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v1 f39463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m3.k1 f39464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public o f39465c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f39466d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f39467e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f39468f;

    public j(v1 v1Var, Object obj, o oVar, long j9, long j11, boolean z11) {
        o oVarE;
        this.f39463a = v1Var;
        this.f39464b = m3.i.w(obj);
        if (oVar != null) {
            oVarE = c.e(oVar);
        } else {
            oVarE = (o) v1Var.f39591a.invoke(obj);
            oVarE.d();
        }
        this.f39465c = oVarE;
        this.f39466d = j9;
        this.f39467e = j11;
        this.f39468f = z11;
    }

    public final Object b() {
        return this.f39463a.f39592b.invoke(this.f39465c);
    }

    @Override // m3.c3
    public final Object getValue() {
        return this.f39464b.getValue();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AnimationState(value=");
        sb2.append(this.f39464b.getValue());
        sb2.append(", velocity=");
        sb2.append(b());
        sb2.append(", isRunning=");
        sb2.append(this.f39468f);
        sb2.append(", lastFrameTimeNanos=");
        sb2.append(this.f39466d);
        sb2.append(", finishedTimeNanos=");
        return w.a0.r(sb2, this.f39467e, ')');
    }

    public /* synthetic */ j(v1 v1Var, Object obj, o oVar, int i11) {
        this(v1Var, obj, (i11 & 4) != 0 ? null : oVar, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }
}
