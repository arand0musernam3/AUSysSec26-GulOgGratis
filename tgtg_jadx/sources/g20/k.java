package g20;

import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.util.Property;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import com.app.tgtg.R;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class k extends a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f18296g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f18297h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f18298i;

    public k(View view) {
        super(view);
        Resources resources = view.getResources();
        this.f18296g = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
        this.f18297h = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
        this.f18298i = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_y_distance);
    }

    public final void b() {
        if (a() == null) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        View view = this.f18275b;
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f));
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i11), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setDuration(this.f18278e);
        animatorSet.start();
    }

    public final void c(androidx.activity.b bVar, int i11, AnimatorListenerAdapter animatorListenerAdapter, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        int i12;
        boolean z11 = bVar.b() == 0;
        View view = this.f18275b;
        boolean z12 = (Gravity.getAbsoluteGravity(i11, view.getLayoutDirection()) & 3) == 3;
        float scaleX = view.getScaleX() * view.getWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            i12 = z12 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
        } else {
            i12 = 0;
        }
        float f11 = scaleX + i12;
        Property property = View.TRANSLATION_X;
        if (z12) {
            f11 = -f11;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, f11);
        if (animatorUpdateListener != null) {
            objectAnimatorOfFloat.addUpdateListener(animatorUpdateListener);
        }
        objectAnimatorOfFloat.setInterpolator(new u8.a(1));
        objectAnimatorOfFloat.setDuration(k10.a.c(this.f18276c, bVar.a(), this.f18277d));
        objectAnimatorOfFloat.addListener(new j(this, z11, i11));
        objectAnimatorOfFloat.addListener(animatorListenerAdapter);
        objectAnimatorOfFloat.start();
    }

    public final void d(int i11, float f11, boolean z11) {
        float interpolation = this.f18274a.getInterpolation(f11);
        View view = this.f18275b;
        boolean z12 = (Gravity.getAbsoluteGravity(i11, view.getLayoutDirection()) & 3) == 3;
        boolean z13 = z11 == z12;
        int width = view.getWidth();
        int height = view.getHeight();
        float f12 = width;
        if (f12 > 0.0f) {
            float f13 = height;
            if (f13 <= 0.0f) {
                return;
            }
            float f14 = this.f18296g / f12;
            float f15 = this.f18297h / f12;
            float f16 = this.f18298i / f13;
            if (z12) {
                f12 = 0.0f;
            }
            view.setPivotX(f12);
            if (!z13) {
                f15 = -f14;
            }
            float fA = k10.a.a(0.0f, f15, interpolation);
            float f17 = fA + 1.0f;
            float fA2 = 1.0f - k10.a.a(0.0f, f16, interpolation);
            if (Float.isNaN(f17) || Float.isNaN(fA2)) {
                return;
            }
            view.setScaleX(f17);
            view.setScaleY(fA2);
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i12 = 0; i12 < viewGroup.getChildCount(); i12++) {
                    View childAt = viewGroup.getChildAt(i12);
                    childAt.setPivotX(z12 ? childAt.getWidth() + (width - childAt.getRight()) : -childAt.getLeft());
                    childAt.setPivotY(-childAt.getTop());
                    float f18 = z13 ? 1.0f - fA : 1.0f;
                    float f19 = fA2 != 0.0f ? (f17 / fA2) * f18 : 1.0f;
                    if (!Float.isNaN(f18) && !Float.isNaN(f19)) {
                        childAt.setScaleX(f18);
                        childAt.setScaleY(f19);
                    }
                }
            }
        }
    }
}
