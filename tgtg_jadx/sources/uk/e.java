package uk;

import android.animation.ValueAnimator;
import com.app.tgtg.feature.locationpicker.LocationPickerOverlay;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LocationPickerOverlay f41325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ValueAnimator f41326c;

    public /* synthetic */ e(LocationPickerOverlay locationPickerOverlay, ValueAnimator valueAnimator, int i11) {
        this.f41324a = i11;
        this.f41325b = locationPickerOverlay;
        this.f41326c = valueAnimator;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i11 = this.f41324a;
        ValueAnimator valueAnimator2 = this.f41326c;
        LocationPickerOverlay locationPickerOverlay = this.f41325b;
        switch (i11) {
            case 0:
                int i12 = LocationPickerOverlay.f9016n;
                valueAnimator.getClass();
                Object animatedValue = valueAnimator2.getAnimatedValue();
                animatedValue.getClass();
                locationPickerOverlay.f9020d = ((Float) animatedValue).floatValue();
                locationPickerOverlay.invalidate();
                break;
            case 1:
                int i13 = LocationPickerOverlay.f9016n;
                valueAnimator.getClass();
                Object animatedValue2 = valueAnimator2.getAnimatedValue();
                animatedValue2.getClass();
                locationPickerOverlay.f9020d = ((Float) animatedValue2).floatValue();
                locationPickerOverlay.invalidate();
                break;
            case 2:
                int i14 = LocationPickerOverlay.f9016n;
                valueAnimator.getClass();
                Object animatedValue3 = valueAnimator2.getAnimatedValue();
                animatedValue3.getClass();
                locationPickerOverlay.f9020d = ((Float) animatedValue3).floatValue();
                locationPickerOverlay.f9025i = true;
                locationPickerOverlay.invalidate();
                break;
            default:
                int i15 = LocationPickerOverlay.f9016n;
                valueAnimator.getClass();
                Object animatedValue4 = valueAnimator2.getAnimatedValue();
                animatedValue4.getClass();
                locationPickerOverlay.f9020d = ((Float) animatedValue4).floatValue();
                locationPickerOverlay.f9025i = true;
                locationPickerOverlay.invalidate();
                break;
        }
    }
}
