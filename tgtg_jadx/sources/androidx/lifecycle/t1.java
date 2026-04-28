package androidx.lifecycle;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class t1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Lifecycle f3521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v1 f3522b;

    public t1(Lifecycle lifecycle, v1 v1Var) {
        this.f3521a = lifecycle;
        this.f3522b = v1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f3521a.a(this.f3522b);
    }
}
