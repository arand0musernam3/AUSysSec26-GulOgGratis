package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b2 extends Transition.EpicenterCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Rect f3158b;

    public /* synthetic */ b2(int i11, Rect rect) {
        this.f3157a = i11;
        this.f3158b = rect;
    }

    @Override // android.transition.Transition.EpicenterCallback
    public final Rect onGetEpicenter(Transition transition) {
        switch (this.f3157a) {
            case 0:
                return this.f3158b;
            default:
                Rect rect = this.f3158b;
                if (rect.isEmpty()) {
                    return null;
                }
                return rect;
        }
    }
}
