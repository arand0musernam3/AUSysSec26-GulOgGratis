package com.braze.ui.inappmessage.factories;

import android.R;
import android.content.res.Resources;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import com.braze.enums.inappmessage.SlideFrom;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.inappmessage.InAppMessageSlideup;
import com.braze.ui.inappmessage.IInAppMessageAnimationFactory;
import com.braze.ui.support.AnimationUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/braze/ui/inappmessage/factories/DefaultInAppMessageAnimationFactory;", "Lcom/braze/ui/inappmessage/IInAppMessageAnimationFactory;", "<init>", "()V", "shortAnimationDurationMs", "", "getOpeningAnimation", "Landroid/view/animation/Animation;", "inAppMessage", "Lcom/braze/models/inappmessage/IInAppMessage;", "getClosingAnimation", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class DefaultInAppMessageAnimationFactory implements IInAppMessageAnimationFactory {
    private final long shortAnimationDurationMs = Resources.getSystem().getInteger(R.integer.config_shortAnimTime);

    @Override // com.braze.ui.inappmessage.IInAppMessageAnimationFactory
    @Nullable
    public Animation getClosingAnimation(@NotNull IInAppMessage inAppMessage) {
        inAppMessage.getClass();
        if (!(inAppMessage instanceof InAppMessageSlideup)) {
            return AnimationUtils.setAnimationParams(new AlphaAnimation(1.0f, 0.0f), this.shortAnimationDurationMs, false);
        }
        SlideFrom slideFrom = ((InAppMessageSlideup) inAppMessage).getSlideFrom();
        SlideFrom slideFrom2 = SlideFrom.TOP;
        long j9 = this.shortAnimationDurationMs;
        return slideFrom == slideFrom2 ? AnimationUtils.createVerticalAnimation(0.0f, -1.0f, j9, false) : AnimationUtils.createVerticalAnimation(0.0f, 1.0f, j9, false);
    }

    @Override // com.braze.ui.inappmessage.IInAppMessageAnimationFactory
    @Nullable
    public Animation getOpeningAnimation(@NotNull IInAppMessage inAppMessage) {
        inAppMessage.getClass();
        if (!(inAppMessage instanceof InAppMessageSlideup)) {
            return AnimationUtils.setAnimationParams(new AlphaAnimation(0.0f, 1.0f), this.shortAnimationDurationMs, true);
        }
        SlideFrom slideFrom = ((InAppMessageSlideup) inAppMessage).getSlideFrom();
        SlideFrom slideFrom2 = SlideFrom.TOP;
        long j9 = this.shortAnimationDurationMs;
        return slideFrom == slideFrom2 ? AnimationUtils.createVerticalAnimation(-1.0f, 0.0f, j9, false) : AnimationUtils.createVerticalAnimation(1.0f, 0.0f, j9, false);
    }
}
