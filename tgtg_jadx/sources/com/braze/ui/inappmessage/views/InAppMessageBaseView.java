package com.braze.ui.inappmessage.views;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.window.BackEvent;
import androidx.core.view.WindowInsetsCompat;
import com.braze.enums.inappmessage.TextAlign;
import com.braze.models.inappmessage.IInAppMessageWithImage;
import com.braze.models.inappmessage.InAppMessageBase;
import com.braze.models.inappmessage.n;
import com.braze.support.BrazeLogger;
import com.braze.ui.inappmessage.utils.InAppMessageViewUtils;
import com.braze.ui.support.ViewUtils;
import e0.f;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000 =2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001=B\u001b\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0016J\u0010\u0010&\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0016J\u0010\u0010'\u001a\u00020#2\u0006\u0010(\u001a\u00020)H\u0016J\u0010\u0010*\u001a\u00020#2\u0006\u0010+\u001a\u00020,H\u0016J\u0010\u0010-\u001a\u00020#2\u0006\u0010.\u001a\u00020/H\u0016J \u00100\u001a\u00020#2\u0006\u00101\u001a\u00020,2\u0006\u00102\u001a\u00020%2\u0006\u00103\u001a\u00020%H\u0016J\u0010\u00104\u001a\u00020#2\u0006\u00105\u001a\u00020\u000fH\u0016J\u0010\u00106\u001a\u00020#2\u0006\u00107\u001a\u000208H\u0016J\u0010\u00109\u001a\u00020#2\u0006\u0010:\u001a\u00020;H\u0016J\b\u0010<\u001a\u00020#H\u0016R\u0016\u0010\n\u001a\u0004\u0018\u00010\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u0015X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u0004\u0018\u00010\u0019X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u0004\u0018\u00010\u0015X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0017R\u0014\u0010\u001e\u001a\u0004\u0018\u00010\u001fX¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006>"}, d2 = {"Lcom/braze/ui/inappmessage/views/InAppMessageBaseView;", "Landroid/widget/RelativeLayout;", "Lcom/braze/ui/inappmessage/views/IInAppMessageView;", "Lcom/braze/ui/inappmessage/views/IInAppMessageBackEventListener;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "messageClickableView", "Landroid/view/View;", "getMessageClickableView", "()Landroid/view/View;", "hasAppliedWindowInsets", "", "getHasAppliedWindowInsets", "()Z", "setHasAppliedWindowInsets", "(Z)V", "messageTextView", "Landroid/widget/TextView;", "getMessageTextView", "()Landroid/widget/TextView;", "messageImageView", "Landroid/widget/ImageView;", "getMessageImageView", "()Landroid/widget/ImageView;", "messageIconView", "getMessageIconView", "messageBackgroundObject", "", "getMessageBackgroundObject", "()Ljava/lang/Object;", "setMessageBackgroundColor", "", "color", "", "setMessageTextColor", "setMessageTextAlign", "textAlign", "Lcom/braze/enums/inappmessage/TextAlign;", "setMessage", TextBundle.TEXT_ENTRY, "", "setMessageImageView", "bitmap", "Landroid/graphics/Bitmap;", "setMessageIcon", InAppMessageBase.ICON, "iconColor", "iconBackgroundColor", "resetMessageMargins", "imageRetrievalSuccessful", "applyWindowInsets", "insets", "Landroidx/core/view/WindowInsetsCompat;", "onBackProgressed", "backEvent", "Landroid/window/BackEvent;", "onBackCancelled", "Companion", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nInAppMessageBaseView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InAppMessageBaseView.kt\ncom/braze/ui/inappmessage/views/InAppMessageBaseView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,170:1\n1#2:171\n*E\n"})
public abstract class InAppMessageBaseView extends RelativeLayout implements IInAppMessageView, IInAppMessageBackEventListener {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final float PREDICTIVE_BACK_MAX_SCALE_FACTOR = 0.85f;
    private static final int TRANSLATE_X_FACTOR = 2;
    private static final int TRANSLATE_Y_FACTOR = 8;
    private boolean hasAppliedWindowInsets;

    public InAppMessageBaseView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Nullable
    public static final String getAppropriateImageUrl(@NotNull IInAppMessageWithImage iInAppMessageWithImage) {
        return INSTANCE.getAppropriateImageUrl(iInAppMessageWithImage);
    }

    @Override // com.braze.ui.inappmessage.views.IInAppMessageView
    public void applyWindowInsets(@NotNull WindowInsetsCompat insets) {
        insets.getClass();
        setHasAppliedWindowInsets(true);
    }

    @Override // com.braze.ui.inappmessage.views.IInAppMessageView
    public boolean getHasAppliedWindowInsets() {
        return this.hasAppliedWindowInsets;
    }

    @Nullable
    public abstract Object getMessageBackgroundObject();

    @Nullable
    public abstract TextView getMessageIconView();

    @Nullable
    public abstract ImageView getMessageImageView();

    @Nullable
    public abstract TextView getMessageTextView();

    @Override // com.braze.ui.inappmessage.views.IInAppMessageBackEventListener
    public void onBackCancelled() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, "scaleX", 1.0f), ObjectAnimator.ofFloat(this, "scaleY", 1.0f), ObjectAnimator.ofFloat(this, "translationX", 0.0f));
        animatorSet.start();
    }

    @Override // com.braze.ui.inappmessage.views.IInAppMessageBackEventListener
    public void onBackProgressed(@NotNull BackEvent backEvent) {
        backEvent.getClass();
        if (Build.VERSION.SDK_INT >= 34) {
            float width = getWidth();
            float height = getHeight();
            float f11 = width * PREDICTIVE_BACK_MAX_SCALE_FACTOR;
            float f12 = height * PREDICTIVE_BACK_MAX_SCALE_FACTOR;
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ObjectAnimator.ofFloat(this, "scaleX", PREDICTIVE_BACK_MAX_SCALE_FACTOR), ObjectAnimator.ofFloat(this, "scaleY", PREDICTIVE_BACK_MAX_SCALE_FACTOR), ObjectAnimator.ofFloat(this, "translationX", (width - f11) / 2), ObjectAnimator.ofFloat(this, "translationY", (height - f12) / 8));
            animatorSet.start();
        }
    }

    public void resetMessageMargins(boolean imageRetrievalSuccessful) {
        CharSequence text;
        String string;
        ImageView messageImageView = getMessageImageView();
        if (messageImageView != null) {
            if (imageRetrievalSuccessful) {
                ViewUtils.removeViewFromParent(getMessageIconView());
            } else {
                ViewUtils.removeViewFromParent(messageImageView);
            }
        }
        TextView messageIconView = getMessageIconView();
        if (messageIconView == null || (text = messageIconView.getText()) == null || (string = text.toString()) == null || !StringsKt.H(string)) {
            return;
        }
        ViewUtils.removeViewFromParent(getMessageIconView());
    }

    @Override // com.braze.ui.inappmessage.views.IInAppMessageView
    public void setHasAppliedWindowInsets(boolean z11) {
        this.hasAppliedWindowInsets = z11;
    }

    public void setMessage(@NotNull String text) {
        text.getClass();
        TextView messageTextView = getMessageTextView();
        if (messageTextView != null) {
            messageTextView.setText(text);
        }
    }

    public void setMessageBackgroundColor(int color) {
        Object messageBackgroundObject = getMessageBackgroundObject();
        messageBackgroundObject.getClass();
        InAppMessageViewUtils.setViewBackgroundColor((View) messageBackgroundObject, color);
    }

    public void setMessageIcon(@NotNull String icon, int iconColor, int iconBackgroundColor) {
        icon.getClass();
        TextView messageIconView = getMessageIconView();
        if (messageIconView != null) {
            Context context = getContext();
            context.getClass();
            InAppMessageViewUtils.setIcon(context, icon, iconColor, iconBackgroundColor, messageIconView);
        }
    }

    public void setMessageImageView(@NotNull Bitmap bitmap) {
        bitmap.getClass();
        ImageView messageImageView = getMessageImageView();
        if (messageImageView != null) {
            InAppMessageViewUtils.setImage(bitmap, messageImageView);
        }
    }

    public void setMessageTextAlign(@NotNull TextAlign textAlign) {
        textAlign.getClass();
        TextView messageTextView = getMessageTextView();
        if (messageTextView != null) {
            InAppMessageViewUtils.setTextAlignment(messageTextView, textAlign);
        }
    }

    public void setMessageTextColor(int color) {
        TextView messageTextView = getMessageTextView();
        if (messageTextView != null) {
            InAppMessageViewUtils.setTextViewColor(messageTextView, color);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/braze/ui/inappmessage/views/InAppMessageBaseView$Companion;", "", "<init>", "()V", "PREDICTIVE_BACK_MAX_SCALE_FACTOR", "", "TRANSLATE_X_FACTOR", "", "TRANSLATE_Y_FACTOR", "getAppropriateImageUrl", "", "inAppMessage", "Lcom/braze/models/inappmessage/IInAppMessageWithImage;", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getAppropriateImageUrl$lambda$0(String str) {
            return f.k("Local bitmap file does not exist. Using remote url instead. Local path: ", str);
        }

        @Nullable
        public final String getAppropriateImageUrl(@NotNull IInAppMessageWithImage inAppMessage) {
            inAppMessage.getClass();
            String localImageUrl = inAppMessage.getLocalImageUrl();
            if (localImageUrl != null && !StringsKt.H(localImageUrl)) {
                if (new File(localImageUrl).exists()) {
                    return localImageUrl;
                }
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.D, (Throwable) null, false, (Function0) new n(localImageUrl, 26), 6, (Object) null);
            }
            return inAppMessage.getRemoteImageUrl();
        }

        private Companion() {
        }
    }

    @Override // com.braze.ui.inappmessage.views.IInAppMessageView
    @Nullable
    public View getMessageClickableView() {
        return this;
    }
}
