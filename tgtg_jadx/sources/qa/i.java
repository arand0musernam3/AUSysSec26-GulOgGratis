package qa;

import android.graphics.Rect;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends s {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f36676k;
    public final /* synthetic */ Rect l;

    public /* synthetic */ i(int i11, Rect rect) {
        this.f36676k = i11;
        this.l = rect;
    }

    @Override // qa.s
    public final Rect e() {
        switch (this.f36676k) {
            case 0:
                return this.l;
            default:
                Rect rect = this.l;
                if (rect.isEmpty()) {
                    return null;
                }
                return rect;
        }
    }
}
