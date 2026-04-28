package m3;

import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public x1 f29473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f29474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f29475c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Function2 f29476d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f29477e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public q1.n0 f29478f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public q1.t0 f29479g;

    public w1(x1 x1Var) {
        this.f29473a = x1Var;
    }

    public final boolean a() {
        if (this.f29473a != null) {
            a aVar = this.f29475c;
            if (aVar != null ? aVar.a() : false) {
                return true;
            }
        }
        return false;
    }

    public final void b() {
        x1 x1Var = this.f29473a;
        if (x1Var != null) {
            x1Var.c(this, null);
        }
    }

    public final s0 c(Object obj) {
        s0 s0VarC;
        x1 x1Var = this.f29473a;
        return (x1Var == null || (s0VarC = x1Var.c(this, obj)) == null) ? s0.IGNORED : s0VarC;
    }

    public final void d() {
        x1 x1Var = this.f29473a;
        if (x1Var != null) {
            x1Var.a();
        }
        this.f29473a = null;
        this.f29478f = null;
        this.f29479g = null;
        this.f29476d = null;
    }

    public final void e(boolean z11) {
        int i11 = this.f29474b;
        this.f29474b = z11 ? i11 | 32 : i11 & (-33);
    }
}
