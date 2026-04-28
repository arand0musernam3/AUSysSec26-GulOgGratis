package androidx.fragment.app;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d1 extends t0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FragmentManager f3169b;

    public d1(FragmentManager fragmentManager) {
        this.f3169b = fragmentManager;
    }

    @Override // androidx.fragment.app.t0
    public final Fragment a(ClassLoader classLoader, String str) {
        return Fragment.instantiate(this.f3169b.f3129x.f3357b, str, null);
    }
}
