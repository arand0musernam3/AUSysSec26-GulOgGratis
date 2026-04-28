package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BottomSheetBehavior f12344a;

    public a(BottomSheetBehavior bottomSheetBehavior) {
        this.f12344a = bottomSheetBehavior;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        n20.j jVar = this.f12344a.f12322i;
        if (jVar != null) {
            jVar.u(fFloatValue);
        }
    }
}
