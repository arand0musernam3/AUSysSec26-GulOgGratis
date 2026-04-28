package k8;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26145a;

    @Override // k8.h
    public final float a(Object obj) {
        switch (this.f26145a) {
            case 0:
                return ((View) obj).getAlpha();
            case 1:
                return ((View) obj).getScaleX();
            case 2:
                return ((View) obj).getScaleY();
            case 3:
                return ((View) obj).getRotation();
            case 4:
                return ((View) obj).getRotationX();
            default:
                return ((View) obj).getRotationY();
        }
    }

    @Override // k8.h
    public final void b(float f11, Object obj) {
        switch (this.f26145a) {
            case 0:
                ((View) obj).setAlpha(f11);
                break;
            case 1:
                ((View) obj).setScaleX(f11);
                break;
            case 2:
                ((View) obj).setScaleY(f11);
                break;
            case 3:
                ((View) obj).setRotation(f11);
                break;
            case 4:
                ((View) obj).setRotationX(f11);
                break;
            default:
                ((View) obj).setRotationY(f11);
                break;
        }
    }
}
