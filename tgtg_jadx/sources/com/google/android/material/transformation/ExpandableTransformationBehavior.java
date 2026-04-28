package com.google.android.material.transformation;

import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.vectordrawable.graphics.drawable.e;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AnimatorSet f12730b;

    public ExpandableTransformationBehavior() {
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior
    public void w(View view, View view2, boolean z11, boolean z12) {
        AnimatorSet animatorSet = this.f12730b;
        boolean z13 = animatorSet != null;
        if (z13) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSetX = x(view, view2, z11, z13);
        this.f12730b = animatorSetX;
        animatorSetX.addListener(new e(this, 15));
        this.f12730b.start();
        if (z12) {
            return;
        }
        this.f12730b.end();
    }

    public abstract AnimatorSet x(View view, View view2, boolean z11, boolean z12);

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
