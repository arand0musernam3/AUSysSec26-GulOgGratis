package y00;

import java.lang.Thread;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class i1 implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l1 f44852b;

    public i1(l1 l1Var, String str) {
        this.f44852b = l1Var;
        this.f44851a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th2) {
        w0 w0Var = ((n1) this.f44852b.f21216b).f44987f;
        n1.m(w0Var);
        w0Var.f45260g.b(th2, this.f44851a);
    }
}
