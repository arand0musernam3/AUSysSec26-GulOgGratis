package androidx.fragment.app;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Fragment f3155b;

    public /* synthetic */ b0(Fragment fragment, int i11) {
        this.f3154a = i11;
        this.f3155b = fragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3154a) {
            case 0:
                this.f3155b.startPostponedEnterTransition();
                break;
            default:
                this.f3155b.callStartTransitionListener(false);
                break;
        }
    }
}
