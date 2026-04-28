package com.braze.ui.support;

import a3.l0;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.WindowInsetsCompat;
import com.adyen.checkout.components.core.internal.analytics.AnalyticsPlatformParams;
import com.braze.enums.inappmessage.Orientation;
import com.braze.support.BrazeLogger;
import h7.h2;
import h7.j;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import yl.e;
import yu.a;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\f\u0010\u0004\u001a\u00020\u0005*\u0004\u0018\u00010\u0006\u001a\n\u0010\u0007\u001a\u00020\u0005*\u00020\u0006\u001a\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\t\u001a\n\u0010\r\u001a\u00020\u000e*\u00020\u000f\u001a\u0012\u0010\u0010\u001a\u00020\u0005*\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0003\u001a\u0016\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0003\u001a\u000e\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000b\u001a\u0016\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0019\u001a\u000e\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001c\u001a\u000e\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001c\u001a\u000e\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001c\u001a\u000e\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001c\u001a\u000e\u0010 \u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0006\u001a\u000e\u0010!\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"TAG", "", "TABLET_SMALLEST_WIDTH_DP", "", "removeViewFromParent", "", "Landroid/view/View;", "setFocusableInTouchModeAndRequestFocus", "convertDpToPixels", "", "context", "Landroid/content/Context;", "valueInDp", "isRunningOnTablet", "", "Landroid/app/Activity;", "setActivityRequestedOrientation", "requestedOrientation", "setHeightOnViewLayoutParams", "view", "height", "isDeviceInNightMode", "isCurrentOrientationValid", "currentScreenOrientation", "preferredOrientation", "Lcom/braze/enums/inappmessage/Orientation;", "getMaxSafeLeftInset", "windowInsets", "Landroidx/core/view/WindowInsetsCompat;", "getMaxSafeRightInset", "getMaxSafeTopInset", "getMaxSafeBottomInset", "isDeviceNotInTouchMode", "getStatusBarHeight", "android-sdk-ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ViewUtils {
    private static final int TABLET_SMALLEST_WIDTH_DP = 600;

    @NotNull
    private static final String TAG = BrazeLogger.INSTANCE.getBrazeLogTag("ViewUtils");

    public static final double convertDpToPixels(@NotNull Context context, double d3) {
        context.getClass();
        return d3 * ((double) context.getResources().getDisplayMetrics().density);
    }

    public static final int getMaxSafeBottomInset(@NotNull WindowInsetsCompat windowInsetsCompat) {
        windowInsetsCompat.getClass();
        j jVarD = windowInsetsCompat.d();
        return Math.max(jVarD != null ? jVarD.b() : 0, windowInsetsCompat.e(h2.h()).f43876d);
    }

    public static final int getMaxSafeLeftInset(@NotNull WindowInsetsCompat windowInsetsCompat) {
        windowInsetsCompat.getClass();
        j jVarD = windowInsetsCompat.d();
        return Math.max(jVarD != null ? jVarD.c() : 0, windowInsetsCompat.e(h2.h()).f43873a);
    }

    public static final int getMaxSafeRightInset(@NotNull WindowInsetsCompat windowInsetsCompat) {
        windowInsetsCompat.getClass();
        j jVarD = windowInsetsCompat.d();
        return Math.max(jVarD != null ? jVarD.d() : 0, windowInsetsCompat.e(h2.h()).f43875c);
    }

    public static final int getMaxSafeTopInset(@NotNull WindowInsetsCompat windowInsetsCompat) {
        windowInsetsCompat.getClass();
        j jVarD = windowInsetsCompat.d();
        return Math.max(jVarD != null ? jVarD.e() : 0, windowInsetsCompat.e(h2.h()).f43874b);
    }

    public static final int getStatusBarHeight(@NotNull Context context) {
        context.getClass();
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", AnalyticsPlatformParams.channel);
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static final boolean isCurrentOrientationValid(int i11, @NotNull Orientation orientation) {
        orientation.getClass();
        if (i11 == 2 && orientation == Orientation.LANDSCAPE) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.D, (Throwable) null, false, (Function0) new a(5), 12, (Object) null);
            return true;
        }
        if (i11 == 1 && orientation == Orientation.PORTRAIT) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.D, (Throwable) null, false, (Function0) new a(6), 12, (Object) null);
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.D, (Throwable) null, false, (Function0) new l0(i11, orientation, 10), 12, (Object) null);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isCurrentOrientationValid$lambda$5() {
        return "Current and preferred orientation are landscape.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isCurrentOrientationValid$lambda$6() {
        return "Current and preferred orientation are portrait.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isCurrentOrientationValid$lambda$7(int i11, Orientation orientation) {
        return "Current orientation " + i11 + " and preferred orientation " + orientation + " don't match";
    }

    public static final boolean isDeviceInNightMode(@NotNull Context context) {
        context.getClass();
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    public static final boolean isDeviceNotInTouchMode(@NotNull View view) {
        view.getClass();
        return !view.isInTouchMode();
    }

    public static final boolean isRunningOnTablet(@NotNull Activity activity) {
        activity.getClass();
        return activity.getResources().getConfiguration().smallestScreenWidthDp >= TABLET_SMALLEST_WIDTH_DP;
    }

    public static final void removeViewFromParent(@Nullable View view) {
        if (view == null) {
            try {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.D, (Throwable) null, false, (Function0) new a(7), 12, (Object) null);
            } catch (Exception e5) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new a(8), 8, (Object) null);
                return;
            }
        }
        if ((view != null ? view.getParent() : null) instanceof ViewGroup) {
            ViewParent parent = view.getParent();
            parent.getClass();
            ViewGroup viewGroup = (ViewGroup) parent;
            viewGroup.removeView(view);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.D, (Throwable) null, false, (Function0) new e(1, view, viewGroup), 12, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String removeViewFromParent$lambda$0() {
        return "View passed in is null. Not removing from parent.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String removeViewFromParent$lambda$1(View view, ViewGroup viewGroup) {
        return "Removed view: " + view + "\nfrom parent: " + viewGroup;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String removeViewFromParent$lambda$2() {
        return "Caught exception while removing view from parent.";
    }

    public static final void setActivityRequestedOrientation(@NotNull Activity activity, int i11) {
        activity.getClass();
        try {
            activity.setRequestedOrientation(i11);
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new l0(i11, activity, 9), 8, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setActivityRequestedOrientation$lambda$4(int i11, Activity activity) {
        return "Failed to set requested orientation " + i11 + " for activity class: " + activity.getLocalClassName();
    }

    public static final void setFocusableInTouchModeAndRequestFocus(@NotNull View view) {
        view.getClass();
        try {
            view.setFocusableInTouchMode(true);
            view.requestFocus();
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new a(4), 8, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setFocusableInTouchModeAndRequestFocus$lambda$3() {
        return "Caught exception while setting view to focusable in touch mode and requesting focus.";
    }

    public static final void setHeightOnViewLayoutParams(@NotNull View view, int i11) {
        view.getClass();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i11;
        view.setLayoutParams(layoutParams);
    }
}
