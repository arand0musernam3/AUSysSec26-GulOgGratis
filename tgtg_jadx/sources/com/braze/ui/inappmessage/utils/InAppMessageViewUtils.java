package com.braze.ui.inappmessage.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.braze.enums.inappmessage.TextAlign;
import com.braze.models.inappmessage.InAppMessageBase;
import com.braze.support.BrazeLogger;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J2\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J\u001f\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0002\u0010\u0018J\u0018\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0010H\u0007J\u0018\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0010H\u0007J\u001a\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00162\b\b\u0001\u0010\u0017\u001a\u00020\u0010H\u0007J\u001a\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001e2\b\b\u0001\u0010\u0017\u001a\u00020\u0010H\u0007J\u001c\u0010\u001f\u001a\u00020\u00052\b\u0010 \u001a\u0004\u0018\u00010\u00132\b\u0010!\u001a\u0004\u0018\u00010\u0013H\u0007J\b\u0010\"\u001a\u00020\u0005H\u0007J\u0018\u0010#\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010$\u001a\u00020%H\u0007J\u001a\u0010&\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001e2\b\b\u0001\u0010\u0017\u001a\u00020\u0010H\u0002¨\u0006'"}, d2 = {"Lcom/braze/ui/inappmessage/utils/InAppMessageViewUtils;", "", "<init>", "()V", "setImage", "", "bitmap", "Landroid/graphics/Bitmap;", "imageView", "Landroid/widget/ImageView;", "setIcon", "context", "Landroid/content/Context;", InAppMessageBase.ICON, "", "iconColor", "", "iconBackgroundColor", "textView", "Landroid/widget/TextView;", "setFrameColor", "view", "Landroid/view/View;", "color", "(Landroid/view/View;Ljava/lang/Integer;)V", "setTextViewColor", "setViewBackgroundColor", "setViewBackgroundColorFilter", "setDrawableColor", "drawable", "Landroid/graphics/drawable/Drawable;", "resetMessageMarginsIfNecessary", "messageView", "headerView", "closeInAppMessageOnKeycodeBack", "setTextAlignment", "textAlign", "Lcom/braze/enums/inappmessage/TextAlign;", "setDrawableColorFilter", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nInAppMessageViewUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InAppMessageViewUtils.kt\ncom/braze/ui/inappmessage/utils/InAppMessageViewUtils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,139:1\n1#2:140\n*E\n"})
public final class InAppMessageViewUtils {

    @NotNull
    public static final InAppMessageViewUtils INSTANCE = new InAppMessageViewUtils();

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TextAlign.values().length];
            try {
                iArr[TextAlign.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextAlign.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TextAlign.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private InAppMessageViewUtils() {
    }

    public static final void closeInAppMessageOnKeycodeBack() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new a(16), 7, (Object) null);
        BrazeInAppMessageManager.INSTANCE.getInstance().hideCurrentlyDisplayingInAppMessage(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String closeInAppMessageOnKeycodeBack$lambda$3() {
        return "Back button intercepted by in-app message view, closing in-app message.";
    }

    public static final void resetMessageMarginsIfNecessary(@Nullable TextView messageView, @Nullable TextView headerView) {
        if (headerView != null || messageView == null) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(messageView.getLayoutParams().width, messageView.getLayoutParams().height);
        layoutParams.setMargins(0, 0, 0, 0);
        messageView.setLayoutParams(layoutParams);
    }

    public static final void setDrawableColor(@NotNull Drawable drawable, int color) {
        drawable.getClass();
        if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            if (layerDrawable.getNumberOfLayers() <= 0 || !(layerDrawable.getDrawable(0) instanceof GradientDrawable)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new a(18), 7, (Object) null);
            } else {
                Drawable drawable2 = layerDrawable.getDrawable(0);
                drawable2.getClass();
                setDrawableColor(drawable2, color);
            }
        }
        if (drawable instanceof GradientDrawable) {
            ((GradientDrawable) drawable).setColor(color);
        } else {
            INSTANCE.setDrawableColorFilter(drawable, color);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setDrawableColor$lambda$2() {
        return "LayerDrawable for button background did not have the expected number of layers or the 0th layer was not a GradientDrawable.";
    }

    private final void setDrawableColorFilter(Drawable drawable, int color) {
        if (Build.VERSION.SDK_INT >= 29) {
            drawable.setColorFilter(new BlendModeColorFilter(color, BlendMode.SRC_ATOP));
        } else {
            drawable.setColorFilter(color, PorterDuff.Mode.SRC_ATOP);
        }
    }

    public static final void setFrameColor(@NotNull View view, @Nullable Integer color) {
        view.getClass();
        if (color != null) {
            view.setBackgroundColor(color.intValue());
        }
    }

    public static final void setIcon(@NotNull Context context, @Nullable String icon, int iconColor, int iconBackgroundColor, @NotNull TextView textView) {
        context.getClass();
        textView.getClass();
        if (icon != null) {
            try {
                textView.setTypeface(Typeface.createFromAsset(context.getAssets(), "fontawesome-webfont.ttf"));
                textView.setText(icon);
                setTextViewColor(textView, iconColor);
                if (textView.getBackground() == null) {
                    setViewBackgroundColor(textView, iconBackgroundColor);
                    return;
                }
                Drawable background = textView.getBackground();
                background.getClass();
                setDrawableColor(background, iconBackgroundColor);
            } catch (Exception e5) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new a(17), 4, (Object) null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setIcon$lambda$0() {
        return "Caught exception setting icon typeface. Not rendering icon.";
    }

    public static final void setImage(@Nullable Bitmap bitmap, @NotNull ImageView imageView) {
        imageView.getClass();
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
        }
    }

    public static final void setTextAlignment(@NotNull TextView textView, @NotNull TextAlign textAlign) {
        int i11;
        textView.getClass();
        textAlign.getClass();
        int i12 = WhenMappings.$EnumSwitchMapping$0[textAlign.ordinal()];
        if (i12 == 1) {
            i11 = 8388611;
        } else if (i12 == 2) {
            i11 = 8388613;
        } else {
            if (i12 != 3) {
                e40.a.f();
                return;
            }
            i11 = 17;
        }
        textView.setGravity(i11);
    }

    public static final void setTextViewColor(@NotNull TextView textView, int color) {
        textView.getClass();
        textView.setTextColor(color);
    }

    public static final void setViewBackgroundColor(@NotNull View view, int color) {
        view.getClass();
        view.setBackgroundColor(color);
    }

    public static final void setViewBackgroundColorFilter(@NotNull View view, int color) {
        view.getClass();
        InAppMessageViewUtils inAppMessageViewUtils = INSTANCE;
        Drawable background = view.getBackground();
        background.getClass();
        inAppMessageViewUtils.setDrawableColorFilter(background, color);
        view.getBackground().setAlpha(Color.alpha(color));
    }
}
