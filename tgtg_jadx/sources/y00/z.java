package y00;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class z implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f45329a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f45330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b0 f45331c;

    public z(a0 a0Var, long j9) {
        this.f45330b = j9;
        Objects.requireNonNull(a0Var);
        this.f45331c = a0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f45329a) {
            case 0:
                ((a0) this.f45331c).v(this.f45330b);
                break;
            default:
                d3 d3Var = (d3) this.f45331c;
                a0 a0Var = ((n1) d3Var.f21216b).f44994n;
                n1.j(a0Var);
                a0Var.s(this.f45330b);
                d3Var.f44681f = null;
                break;
        }
    }

    public z(d3 d3Var, long j9) {
        this.f45330b = j9;
        Objects.requireNonNull(d3Var);
        this.f45331c = d3Var;
    }
}
