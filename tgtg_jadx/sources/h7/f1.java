package h7;

import android.view.WindowInsetsAnimation;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x6.d f21536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x6.d f21537b;

    public f1(WindowInsetsAnimation.Bounds bounds) {
        this.f21536a = m1.g(bounds);
        this.f21537b = m1.f(bounds);
    }

    public final String toString() {
        return "Bounds{lower=" + this.f21536a + " upper=" + this.f21537b + "}";
    }

    public f1(x6.d dVar, x6.d dVar2) {
        this.f21536a = dVar;
        this.f21537b = dVar2;
    }
}
