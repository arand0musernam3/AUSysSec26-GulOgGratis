package qa;

import android.R;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f36719a = {R.attr.interpolator, R.attr.duration, R.attr.startDelay, R.attr.matchOrder};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f36720b = {R.attr.resizeClip};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f36721c = {R.attr.transitionVisibilityMode};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f36722d = {R.attr.fadingMode};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f36723e = {R.attr.slideEdge};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f36724f = {R.attr.transitionOrdering};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static boolean f36725g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static boolean f36726h = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static Field f36727i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static boolean f36728j;

    public static ObjectAnimator a(View view, h0 h0Var, int i11, int i12, float f11, float f12, float f13, float f14, TimeInterpolator timeInterpolator, r rVar) {
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        if (((int[]) h0Var.f36674b.getTag(com.app.tgtg.R.id.transition_position)) != null) {
            f11 = (r2[0] - i11) + translationX;
            f12 = (r2[1] - i12) + translationY;
        }
        view.setTranslationX(f11);
        view.setTranslationY(f12);
        if (f11 == f13 && f12 == f14) {
            return null;
        }
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, f11, f13), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, f12, f14));
        i0 i0Var = new i0(view, h0Var.f36674b, translationX, translationY);
        rVar.a(i0Var);
        objectAnimatorOfPropertyValuesHolder.addListener(i0Var);
        objectAnimatorOfPropertyValuesHolder.setInterpolator(timeInterpolator);
        return objectAnimatorOfPropertyValuesHolder;
    }

    public static void g(ViewGroup viewGroup, boolean z11) {
        if (Build.VERSION.SDK_INT >= 29) {
            j0.e(viewGroup, z11);
        } else if (f36725g) {
            try {
                j0.e(viewGroup, z11);
            } catch (NoSuchMethodError unused) {
                f36725g = false;
            }
        }
    }

    public float b(View view, ViewGroup viewGroup) {
        return view.getTranslationX();
    }

    public float c(View view, ViewGroup viewGroup) {
        return view.getTranslationY();
    }

    public float d(View view) {
        if (f36726h) {
            try {
                return j0.a(view);
            } catch (NoSuchMethodError unused) {
                f36726h = false;
            }
        }
        return view.getAlpha();
    }

    public abstract Rect e();

    public void f(View view, float f11) {
        if (f36726h) {
            try {
                j0.c(view, f11);
                return;
            } catch (NoSuchMethodError unused) {
                f36726h = false;
            }
        }
        view.setAlpha(f11);
    }
}
