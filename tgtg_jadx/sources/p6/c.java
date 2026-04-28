package p6;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends g {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f34500g;

    @Override // p6.g
    public final void d(View view, float f11) {
        switch (this.f34500g) {
            case 0:
                view.setAlpha(a(f11));
                break;
            case 1:
                view.setElevation(a(f11));
                break;
            case 2:
                view.setRotation(a(f11));
                break;
            case 3:
                view.setRotationX(a(f11));
                break;
            case 4:
                view.setRotationY(a(f11));
                break;
            case 5:
                view.setScaleX(a(f11));
                break;
            case 6:
                view.setScaleY(a(f11));
                break;
            case 7:
                view.setTranslationX(a(f11));
                break;
            case 8:
                view.setTranslationY(a(f11));
                break;
            default:
                view.setTranslationZ(a(f11));
                break;
        }
    }
}
