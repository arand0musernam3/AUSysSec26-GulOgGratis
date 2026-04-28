package t1;

import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v1 f39443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f39444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f39445c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Function0 f39446d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m3.k1 f39447e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public o f39448f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f39449g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f39450h = Long.MIN_VALUE;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final m3.k1 f39451i = m3.i.w(Boolean.TRUE);

    public h(Object obj, v1 v1Var, o oVar, long j9, Object obj2, long j11, Function0 function0) {
        this.f39443a = v1Var;
        this.f39444b = obj2;
        this.f39445c = j11;
        this.f39446d = function0;
        this.f39447e = m3.i.w(obj);
        this.f39448f = c.e(oVar);
        this.f39449g = j9;
    }

    public final void a() {
        this.f39451i.setValue(Boolean.FALSE);
        this.f39446d.invoke();
    }

    public final Object b() {
        return this.f39443a.f39592b.invoke(this.f39448f);
    }
}
