package p6;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends q {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f34519k;

    @Override // p6.q
    public final boolean d(float f11, long j9, View view, i6.e eVar) {
        switch (this.f34519k) {
            case 0:
                view.setAlpha(b(f11, j9, view, eVar));
                break;
            case 1:
                view.setElevation(b(f11, j9, view, eVar));
                break;
            case 2:
                view.setRotation(b(f11, j9, view, eVar));
                break;
            case 3:
                view.setRotationX(b(f11, j9, view, eVar));
                break;
            case 4:
                view.setRotationY(b(f11, j9, view, eVar));
                break;
            case 5:
                view.setScaleX(b(f11, j9, view, eVar));
                break;
            case 6:
                view.setScaleY(b(f11, j9, view, eVar));
                break;
            case 7:
                view.setTranslationX(b(f11, j9, view, eVar));
                break;
            case 8:
                view.setTranslationY(b(f11, j9, view, eVar));
                break;
            default:
                view.setTranslationZ(b(f11, j9, view, eVar));
                break;
        }
        return this.f34531h;
    }
}
