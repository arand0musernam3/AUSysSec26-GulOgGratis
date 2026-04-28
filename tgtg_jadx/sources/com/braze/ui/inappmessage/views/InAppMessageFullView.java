package com.braze.ui.inappmessage.views;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.WindowInsetsCompat;
import bg.n0;
import com.braze.enums.inappmessage.ImageStyle;
import com.braze.models.inappmessage.IInAppMessageImmersive;
import com.braze.support.BrazeLogger;
import com.braze.ui.R;
import com.braze.ui.inappmessage.config.BrazeInAppMessageParams;
import com.braze.ui.inappmessage.utils.InAppMessageViewUtils;
import com.braze.ui.support.ViewUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ \u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010/\u001a\u00020*2\u0006\u00100\u001a\u00020$H\u0016J\u0016\u00101\u001a\b\u0012\u0004\u0012\u00020\u0014022\u0006\u00103\u001a\u00020$H\u0016J\u0010\u00104\u001a\u00020*2\u0006\u00105\u001a\u00020\fH\u0016J\u0010\u00106\u001a\u00020*2\u0006\u00107\u001a\u000208H\u0016J \u00109\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010\t\u001a\u00020:H\u0002J\u0018\u0010;\u001a\u00020*2\u0006\u0010<\u001a\u0002082\u0006\u0010=\u001a\u00020\u0014H\u0002J\u0018\u0010>\u001a\u00020*2\u0006\u0010<\u001a\u0002082\u0006\u0010?\u001a\u00020\u0014H\u0002R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\u0004\u0018\u00010\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0016R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u0010R\u0016\u0010!\u001a\u0004\u0018\u00010\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u0016R\u0014\u0010#\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010&¨\u0006@"}, d2 = {"Lcom/braze/ui/inappmessage/views/InAppMessageFullView;", "Lcom/braze/ui/inappmessage/views/InAppMessageImmersiveBaseView;", "Lcom/braze/ui/inappmessage/views/IInAppMessageBackEventListener;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "inAppMessageImageView", "Lcom/braze/ui/inappmessage/views/InAppMessageImageView;", "isGraphic", "", "messageTextView", "Landroid/widget/TextView;", "getMessageTextView", "()Landroid/widget/TextView;", "messageHeaderTextView", "getMessageHeaderTextView", "frameView", "Landroid/view/View;", "getFrameView", "()Landroid/view/View;", "messageCloseButtonView", "getMessageCloseButtonView", "messageClickableView", "getMessageClickableView", "messageImageView", "Landroid/widget/ImageView;", "getMessageImageView", "()Landroid/widget/ImageView;", "messageIconView", "getMessageIconView", "messageBackgroundObject", "getMessageBackgroundObject", "longEdge", "", "getLongEdge", "()I", "shortEdge", "getShortEdge", "createAppropriateViews", "", "activity", "Landroid/app/Activity;", "inAppMessage", "Lcom/braze/models/inappmessage/IInAppMessageImmersive;", "setMessageBackgroundColor", "color", "getMessageButtonViews", "", "numButtons", "resetMessageMargins", "imageRetrievalSuccessful", "applyWindowInsets", "insets", "Landroidx/core/view/WindowInsetsCompat;", "setInAppMessageImageViewAttributes", "Lcom/braze/ui/inappmessage/views/IInAppMessageImageView;", "applyDisplayCutoutMarginsToCloseButton", "windowInsets", "closeButtonView", "applyDisplayCutoutMarginsToContentArea", "contentAreaView", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nInAppMessageFullView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InAppMessageFullView.kt\ncom/braze/ui/inappmessage/views/InAppMessageFullView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,254:1\n1#2:255\n*E\n"})
public class InAppMessageFullView extends InAppMessageImmersiveBaseView implements IInAppMessageBackEventListener {

    @Nullable
    private InAppMessageImageView inAppMessageImageView;
    private boolean isGraphic;

    public InAppMessageFullView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private final void applyDisplayCutoutMarginsToCloseButton(WindowInsetsCompat windowInsets, View closeButtonView) {
        if (closeButtonView.getLayoutParams() == null || !(closeButtonView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new a(1), 7, (Object) null);
            return;
        }
        ViewGroup.LayoutParams layoutParams = closeButtonView.getLayoutParams();
        layoutParams.getClass();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(ViewUtils.getMaxSafeLeftInset(windowInsets) + marginLayoutParams.leftMargin, ViewUtils.getMaxSafeTopInset(windowInsets) + marginLayoutParams.topMargin, ViewUtils.getMaxSafeRightInset(windowInsets) + marginLayoutParams.rightMargin, ViewUtils.getMaxSafeBottomInset(windowInsets) + marginLayoutParams.bottomMargin);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String applyDisplayCutoutMarginsToCloseButton$lambda$6() {
        return "Close button layout params are null or not of the expected class. Not applying window insets.";
    }

    private final void applyDisplayCutoutMarginsToContentArea(WindowInsetsCompat windowInsets, View contentAreaView) {
        if (!(contentAreaView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new a(3), 7, (Object) null);
            return;
        }
        ViewGroup.LayoutParams layoutParams = contentAreaView.getLayoutParams();
        layoutParams.getClass();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(ViewUtils.getMaxSafeLeftInset(windowInsets) + marginLayoutParams.leftMargin, marginLayoutParams.topMargin, ViewUtils.getMaxSafeRightInset(windowInsets) + marginLayoutParams.rightMargin, ViewUtils.getMaxSafeBottomInset(windowInsets) + marginLayoutParams.bottomMargin);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String applyDisplayCutoutMarginsToContentArea$lambda$7() {
        return "Content area layout params are null or not of the expected class. Not applying window insets.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void resetMessageMargins$lambda$3$lambda$2(InAppMessageFullView inAppMessageFullView, View view, View view2) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) inAppMessageFullView, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new a(2), 7, (Object) null);
        view.performClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String resetMessageMargins$lambda$3$lambda$2$lambda$1() {
        return "Passing scrollView click event to message clickable view.";
    }

    private final void setInAppMessageImageViewAttributes(Activity activity, IInAppMessageImmersive inAppMessage, IInAppMessageImageView inAppMessageImageView) {
        inAppMessageImageView.setInAppMessageImageCropType(inAppMessage.getCropType());
        inAppMessageImageView.setAltImageText(inAppMessage.getAltImageText());
        if (!ViewUtils.isRunningOnTablet(activity)) {
            inAppMessageImageView.setCornersRadiusPx(0.0f);
            return;
        }
        float fConvertDpToPixels = (float) ViewUtils.convertDpToPixels(activity, BrazeInAppMessageParams.getModalizedImageRadiusDp());
        if (inAppMessage.getImageStyle() == ImageStyle.GRAPHIC) {
            inAppMessageImageView.setCornersRadiusPx(fConvertDpToPixels);
        } else {
            inAppMessageImageView.setCornersRadiiPx(fConvertDpToPixels, fConvertDpToPixels, 0.0f, 0.0f);
        }
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView, com.braze.ui.inappmessage.views.IInAppMessageView
    public void applyWindowInsets(@NotNull WindowInsetsCompat insets) {
        insets.getClass();
        super.applyWindowInsets(insets);
        View messageCloseButtonView = getMessageCloseButtonView();
        if (messageCloseButtonView != null) {
            applyDisplayCutoutMarginsToCloseButton(insets, messageCloseButtonView);
        }
        if (!this.isGraphic) {
            View viewFindViewById = findViewById(R.id.com_braze_inappmessage_full_text_and_button_content_parent);
            if (viewFindViewById != null) {
                applyDisplayCutoutMarginsToContentArea(insets, viewFindViewById);
                return;
            }
            return;
        }
        View viewFindViewById2 = findViewById(R.id.com_braze_inappmessage_full_button_layout_single);
        if (viewFindViewById2 != null && viewFindViewById2.getVisibility() == 0) {
            applyDisplayCutoutMarginsToContentArea(insets, viewFindViewById2);
            return;
        }
        View viewFindViewById3 = findViewById(R.id.com_braze_inappmessage_full_button_layout_dual);
        if (viewFindViewById3 == null || viewFindViewById3.getVisibility() != 0) {
            return;
        }
        applyDisplayCutoutMarginsToContentArea(insets, viewFindViewById3);
    }

    public void createAppropriateViews(@NotNull Activity activity, @NotNull IInAppMessageImmersive inAppMessage, boolean isGraphic) {
        activity.getClass();
        inAppMessage.getClass();
        InAppMessageImageView inAppMessageImageView = (InAppMessageImageView) findViewById(R.id.com_braze_inappmessage_full_imageview);
        this.inAppMessageImageView = inAppMessageImageView;
        if (inAppMessageImageView != null) {
            setInAppMessageImageViewAttributes(activity, inAppMessage, inAppMessageImageView);
        }
        this.isGraphic = isGraphic;
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageImmersiveBaseView
    @Nullable
    public View getFrameView() {
        return findViewById(R.id.com_braze_inappmessage_full_frame);
    }

    public int getLongEdge() {
        return findViewById(R.id.com_braze_inappmessage_full).getLayoutParams().height;
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView
    @Nullable
    public View getMessageBackgroundObject() {
        return findViewById(R.id.com_braze_inappmessage_full);
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageImmersiveBaseView, com.braze.ui.inappmessage.views.IInAppMessageImmersiveView
    @NotNull
    public List<View> getMessageButtonViews(int numButtons) {
        ArrayList arrayList = new ArrayList();
        if (numButtons == 1) {
            View viewFindViewById = findViewById(R.id.com_braze_inappmessage_full_button_layout_single);
            if (viewFindViewById != null) {
                viewFindViewById.setVisibility(0);
            }
            View viewFindViewById2 = findViewById(R.id.com_braze_inappmessage_full_button_single_one);
            if (viewFindViewById2 != null) {
                arrayList.add(viewFindViewById2);
            }
        } else if (numButtons == 2) {
            View viewFindViewById3 = findViewById(R.id.com_braze_inappmessage_full_button_layout_dual);
            if (viewFindViewById3 != null) {
                viewFindViewById3.setVisibility(0);
            }
            View viewFindViewById4 = findViewById(R.id.com_braze_inappmessage_full_button_dual_one);
            View viewFindViewById5 = findViewById(R.id.com_braze_inappmessage_full_button_dual_two);
            if (viewFindViewById4 != null) {
                arrayList.add(viewFindViewById4);
            }
            if (viewFindViewById5 != null) {
                arrayList.add(viewFindViewById5);
                return arrayList;
            }
        }
        return arrayList;
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView, com.braze.ui.inappmessage.views.IInAppMessageView
    @Nullable
    public View getMessageClickableView() {
        return findViewById(R.id.com_braze_inappmessage_full);
    }

    @Override // com.braze.ui.inappmessage.views.IInAppMessageImmersiveView
    @Nullable
    public View getMessageCloseButtonView() {
        return findViewById(R.id.com_braze_inappmessage_full_close_button);
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageImmersiveBaseView
    @Nullable
    public TextView getMessageHeaderTextView() {
        return (TextView) findViewById(R.id.com_braze_inappmessage_full_header_text);
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView
    @Nullable
    public TextView getMessageIconView() {
        return null;
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView
    @Nullable
    public ImageView getMessageImageView() {
        return this.inAppMessageImageView;
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageImmersiveBaseView, com.braze.ui.inappmessage.views.InAppMessageBaseView
    @Nullable
    public TextView getMessageTextView() {
        return (TextView) findViewById(R.id.com_braze_inappmessage_full_message);
    }

    public int getShortEdge() {
        return findViewById(R.id.com_braze_inappmessage_full).getLayoutParams().width;
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageImmersiveBaseView, com.braze.ui.inappmessage.views.InAppMessageBaseView
    public void resetMessageMargins(boolean imageRetrievalSuccessful) {
        super.resetMessageMargins(imageRetrievalSuccessful);
        View messageClickableView = getMessageClickableView();
        if (messageClickableView != null) {
            findViewById(R.id.com_braze_inappmessage_full_text_layout).setOnClickListener(new n0(12, this, messageClickableView));
        }
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView
    public void setMessageBackgroundColor(int color) {
        View messageBackgroundObject = getMessageBackgroundObject();
        if ((messageBackgroundObject != null ? messageBackgroundObject.getBackground() : null) instanceof GradientDrawable) {
            InAppMessageViewUtils.setViewBackgroundColorFilter(messageBackgroundObject, color);
            return;
        }
        if (this.isGraphic) {
            super.setMessageBackgroundColor(color);
            return;
        }
        View viewFindViewById = findViewById(R.id.com_braze_inappmessage_full_all_content_parent);
        viewFindViewById.getClass();
        InAppMessageViewUtils.setViewBackgroundColor(viewFindViewById, color);
        View viewFindViewById2 = findViewById(R.id.com_braze_inappmessage_full_text_and_button_content_parent);
        viewFindViewById2.getClass();
        InAppMessageViewUtils.setViewBackgroundColor(viewFindViewById2, color);
    }
}
