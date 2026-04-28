package com.braze.ui.inappmessage.views;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.WindowInsetsCompat;
import com.braze.enums.inappmessage.ClickAction;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.support.BrazeLogger;
import com.braze.ui.R;
import com.braze.ui.inappmessage.utils.InAppMessageViewUtils;
import com.braze.ui.support.ViewUtils;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dJ\u0016\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"J\u0010\u0010#\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0010\u0010$\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020&H\u0016J\u0010\u0010'\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020)H\u0016R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\u0004\u0018\u00010\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\rR\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0011¨\u0006*"}, d2 = {"Lcom/braze/ui/inappmessage/views/InAppMessageSlideupView;", "Lcom/braze/ui/inappmessage/views/InAppMessageBaseView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "inAppMessageImageView", "Lcom/braze/ui/inappmessage/views/InAppMessageImageView;", "messageTextView", "Landroid/widget/TextView;", "getMessageTextView", "()Landroid/widget/TextView;", "messageBackgroundObject", "Landroid/view/View;", "getMessageBackgroundObject", "()Landroid/view/View;", "messageImageView", "Landroid/widget/ImageView;", "getMessageImageView", "()Landroid/widget/ImageView;", "messageIconView", "getMessageIconView", "messageChevronView", "getMessageChevronView", "applyInAppMessageParameters", "", "inAppMessage", "Lcom/braze/models/inappmessage/IInAppMessage;", "setMessageChevron", "color", "", "clickAction", "Lcom/braze/enums/inappmessage/ClickAction;", "setMessageBackgroundColor", "resetMessageMargins", "imageRetrievalSuccessful", "", "applyWindowInsets", "insets", "Landroidx/core/view/WindowInsetsCompat;", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nInAppMessageSlideupView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InAppMessageSlideupView.kt\ncom/braze/ui/inappmessage/views/InAppMessageSlideupView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,102:1\n1#2:103\n*E\n"})
public class InAppMessageSlideupView extends InAppMessageBaseView {

    @Nullable
    private InAppMessageImageView inAppMessageImageView;

    public InAppMessageSlideupView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String applyWindowInsets$lambda$2() {
        return "Close button view is null or not of the expected class. Not applying window insets.";
    }

    private final View getMessageChevronView() {
        return findViewById(R.id.com_braze_inappmessage_slideup_chevron);
    }

    public final void applyInAppMessageParameters(@NotNull IInAppMessage inAppMessage) {
        inAppMessage.getClass();
        InAppMessageImageView inAppMessageImageView = (InAppMessageImageView) findViewById(R.id.com_braze_inappmessage_slideup_imageview);
        this.inAppMessageImageView = inAppMessageImageView;
        if (inAppMessageImageView != null) {
            inAppMessageImageView.setInAppMessageImageCropType(inAppMessage.getCropType());
        }
        InAppMessageImageView inAppMessageImageView2 = this.inAppMessageImageView;
        if (inAppMessageImageView2 != null) {
            inAppMessageImageView2.setAltImageText(inAppMessage.getAltImageText());
        }
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView, com.braze.ui.inappmessage.views.IInAppMessageView
    public void applyWindowInsets(@NotNull WindowInsetsCompat insets) {
        insets.getClass();
        super.applyWindowInsets(insets);
        if (getLayoutParams() == null || !(getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new a(17), 7, (Object) null);
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.getClass();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(ViewUtils.getMaxSafeLeftInset(insets) + marginLayoutParams.leftMargin, ViewUtils.getMaxSafeTopInset(insets) + marginLayoutParams.topMargin, ViewUtils.getMaxSafeRightInset(insets) + marginLayoutParams.rightMargin, ViewUtils.getMaxSafeBottomInset(insets) + marginLayoutParams.bottomMargin);
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView
    @Nullable
    public View getMessageBackgroundObject() {
        return findViewById(R.id.com_braze_inappmessage_slideup_container);
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView
    @Nullable
    public TextView getMessageIconView() {
        return (TextView) findViewById(R.id.com_braze_inappmessage_slideup_icon);
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView
    @Nullable
    public ImageView getMessageImageView() {
        return this.inAppMessageImageView;
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView
    @Nullable
    public TextView getMessageTextView() {
        return (TextView) findViewById(R.id.com_braze_inappmessage_slideup_message);
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView
    public void resetMessageMargins(boolean imageRetrievalSuccessful) {
        CharSequence text;
        super.resetMessageMargins(imageRetrievalSuccessful);
        TextView messageIconView = getMessageIconView();
        boolean z11 = false;
        if (messageIconView != null && (text = messageIconView.getText()) != null && text.length() != 0) {
            z11 = true;
        }
        if (imageRetrievalSuccessful || z11) {
            return;
        }
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.com_braze_inappmessage_slideup_image_layout);
        if (relativeLayout != null) {
            ViewUtils.removeViewFromParent(relativeLayout);
        }
        TextView textView = (TextView) findViewById(R.id.com_braze_inappmessage_slideup_message);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) (textView != null ? textView.getLayoutParams() : null);
        if (layoutParams != null) {
            layoutParams.leftMargin = getContext().getResources().getDimensionPixelSize(R.dimen.com_braze_inappmessage_slideup_left_message_margin_no_image);
        }
        textView.setLayoutParams(layoutParams);
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView
    public void setMessageBackgroundColor(int color) {
        View messageBackgroundObject = getMessageBackgroundObject();
        if (!((messageBackgroundObject != null ? messageBackgroundObject.getBackground() : null) instanceof GradientDrawable)) {
            super.setMessageBackgroundColor(color);
            return;
        }
        View messageBackgroundObject2 = getMessageBackgroundObject();
        if (messageBackgroundObject2 != null) {
            InAppMessageViewUtils.setViewBackgroundColorFilter(messageBackgroundObject2, color);
        }
    }

    public final void setMessageChevron(int color, @NotNull ClickAction clickAction) {
        clickAction.getClass();
        if (clickAction == ClickAction.NONE) {
            View messageChevronView = getMessageChevronView();
            if (messageChevronView != null) {
                messageChevronView.setVisibility(8);
                return;
            }
            return;
        }
        View messageChevronView2 = getMessageChevronView();
        if (messageChevronView2 != null) {
            InAppMessageViewUtils.setViewBackgroundColorFilter(messageChevronView2, color);
        }
    }
}
