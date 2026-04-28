package androidx.fragment.app;

import androidx.lifecycle.Lifecycle;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Fragment f3383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f3384c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3385d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3386e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f3387f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f3388g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Lifecycle.State f3389h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Lifecycle.State f3390i;

    public y1(Fragment fragment, int i11) {
        this.f3382a = i11;
        this.f3383b = fragment;
        Lifecycle.State state = Lifecycle.State.RESUMED;
        this.f3389h = state;
        this.f3390i = state;
    }

    public y1(int i11, Fragment fragment, int i12) {
        this.f3382a = i11;
        this.f3383b = fragment;
        Lifecycle.State state = Lifecycle.State.RESUMED;
        this.f3389h = state;
        this.f3390i = state;
    }
}
