package uk;

import android.animation.Animator;
import com.app.tgtg.feature.locationpicker.LocationPickerOverlay;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LocationPickerOverlay f41328b;

    public /* synthetic */ f(LocationPickerOverlay locationPickerOverlay, int i11) {
        this.f41327a = i11;
        this.f41328b = locationPickerOverlay;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i11 = this.f41327a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41327a) {
            case 0:
                LocationPickerOverlay locationPickerOverlay = this.f41328b;
                locationPickerOverlay.f9021e = 0.0f;
                locationPickerOverlay.f9025i = true;
                break;
            case 1:
                this.f41328b.setChangingDistance(false);
                break;
            default:
                LocationPickerOverlay locationPickerOverlay2 = this.f41328b;
                locationPickerOverlay2.f9021e = 0.0f;
                locationPickerOverlay2.f9025i = false;
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        int i11 = this.f41327a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i11 = this.f41327a;
    }

    private final void a(Animator animator) {
    }

    private final void b(Animator animator) {
    }

    private final void c(Animator animator) {
    }

    private final void d(Animator animator) {
    }

    private final void e(Animator animator) {
    }

    private final void f(Animator animator) {
    }

    private final void g(Animator animator) {
    }

    private final void h(Animator animator) {
    }

    private final void i(Animator animator) {
    }
}
