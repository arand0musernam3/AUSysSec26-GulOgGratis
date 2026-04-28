package o5;

import android.text.SegmentFinder;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends SegmentFinder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k8.d f31988a;

    public a(k8.d dVar) {
        this.f31988a = dVar;
    }

    public final int nextEndBoundary(int i11) {
        return this.f31988a.o(i11);
    }

    public final int nextStartBoundary(int i11) {
        return this.f31988a.d(i11);
    }

    public final int previousEndBoundary(int i11) {
        return this.f31988a.f(i11);
    }

    public final int previousStartBoundary(int i11) {
        return this.f31988a.n(i11);
    }
}
