package y00;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class s3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f45132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f45133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ub.a f45134c;

    public s3(ub.a aVar, long j9, long j11) {
        Objects.requireNonNull(aVar);
        this.f45134c = aVar;
        this.f45132a = j9;
        this.f45133b = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        l1 l1Var = ((n1) ((u3) this.f45134c.f40982c).f21216b).f44988g;
        n1.m(l1Var);
        l1Var.y(new a8.f(this, 26));
    }
}
