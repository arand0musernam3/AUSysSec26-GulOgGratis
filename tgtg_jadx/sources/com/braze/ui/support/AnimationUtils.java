package com.braze.ui.support;

import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.TranslateAnimation;
import com.braze.models.inappmessage.InAppMessageBase;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b\u001a&\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b\u001a\u001e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"accelerateInterpolator", "Landroid/view/animation/Interpolator;", "decelerateInterpolator", "createVerticalAnimation", "Landroid/view/animation/Animation;", "fromY", "", "toY", InAppMessageBase.DURATION, "", "accelerate", "", "createHorizontalAnimation", "fromX", "toX", "setAnimationParams", "animation", "android-sdk-ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class AnimationUtils {

    @NotNull
    private static final Interpolator accelerateInterpolator = new AccelerateInterpolator();

    @NotNull
    private static final Interpolator decelerateInterpolator = new DecelerateInterpolator();

    @NotNull
    public static final Animation createHorizontalAnimation(float f11, float f12, long j9, boolean z11) {
        return setAnimationParams(new TranslateAnimation(1, f11, 1, f12, 2, 0.0f, 2, 0.0f), j9, z11);
    }

    @NotNull
    public static final Animation createVerticalAnimation(float f11, float f12, long j9, boolean z11) {
        return setAnimationParams(new TranslateAnimation(2, 0.0f, 2, 0.0f, 1, f11, 1, f12), j9, z11);
    }

    @NotNull
    public static final Animation setAnimationParams(@NotNull Animation animation, long j9, boolean z11) {
        animation.getClass();
        animation.setDuration(j9);
        if (z11) {
            animation.setInterpolator(accelerateInterpolator);
            return animation;
        }
        animation.setInterpolator(decelerateInterpolator);
        return animation;
    }
}
