package m3;

import kotlin.Pair;
import kotlin.collections.CollectionsKt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class u implements x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g0 f29449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a1 f29450b;

    public u(g0 g0Var, a1 a1Var) {
        this.f29449a = g0Var;
        this.f29450b = a1Var;
    }

    @Override // m3.x1
    public final s0 c(w1 w1Var, Object obj) {
        s0 s0VarC;
        g0 g0Var = this.f29449a;
        x1 x1Var = g0Var instanceof x1 ? (x1) g0Var : null;
        if (x1Var == null || (s0VarC = x1Var.c(w1Var, obj)) == null) {
            s0VarC = s0.IGNORED;
        }
        if (s0VarC != s0.IGNORED) {
            return s0VarC;
        }
        a1 a1Var = this.f29450b;
        a1Var.f29203f = CollectionsKt.e0(a1Var.f29203f, new Pair(w1Var, obj));
        return s0.SCHEDULED;
    }

    @Override // m3.x1
    public final void a() {
    }

    @Override // m3.x1
    public final void b(Object obj) {
    }
}
