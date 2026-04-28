package com.adyen.checkout.card.internal.ui.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.adyen.checkout.core.AdyenLogLevel;
import com.adyen.checkout.core.AdyenLogger;
import com.adyen.checkout.core.internal.util.BuildUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u0012\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\u0014\u0010\u0004\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0000¨\u0006\t"}, d2 = {"getActivity", "Landroid/app/Activity;", "context", "Landroid/content/Context;", "setFlagSecureOnRootView", "", "Landroid/view/View;", "enable", "", "card_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCardViewExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardViewExt.kt\ncom/adyen/checkout/card/internal/ui/view/CardViewExtKt\n+ 2 AdyenLog.kt\ncom/adyen/checkout/core/internal/util/AdyenLogKt\n*L\n1#1,56:1\n21#2,12:57\n*S KotlinDebug\n*F\n+ 1 CardViewExt.kt\ncom/adyen/checkout/card/internal/ui/view/CardViewExtKt\n*L\n43#1:57,12\n*E\n"})
public final class CardViewExtKt {
    private static final Activity getActivity(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        Context baseContext = ((ContextWrapper) context).getBaseContext();
        baseContext.getClass();
        return getActivity(baseContext);
    }

    public static final void setFlagSecureOnRootView(@NotNull View view, boolean z11) {
        view.getClass();
        BuildUtils buildUtils = BuildUtils.INSTANCE;
        Context context = view.getContext();
        context.getClass();
        if (buildUtils.isDebugBuild(context)) {
            return;
        }
        View rootView = view.getRootView();
        Context context2 = view.getContext();
        context2.getClass();
        Activity activity = getActivity(context2);
        Window window = activity != null ? activity.getWindow() : null;
        if (window != null && Intrinsics.areEqual(rootView, window.getDecorView())) {
            if (z11) {
                window.addFlags(8192);
                return;
            } else {
                window.clearFlags(8192);
                return;
            }
        }
        Object systemService = view.getContext().getSystemService("window");
        WindowManager windowManager = systemService instanceof WindowManager ? (WindowManager) systemService : null;
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if (windowManager == null || !(layoutParams instanceof WindowManager.LayoutParams)) {
            return;
        }
        if (z11) {
            WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) layoutParams;
            layoutParams2.flags = 8192 | layoutParams2.flags;
        } else {
            ((WindowManager.LayoutParams) layoutParams).flags &= -8193;
        }
        try {
            windowManager.updateViewLayout(rootView, layoutParams);
        } catch (IllegalArgumentException e5) {
            AdyenLogLevel adyenLogLevel = AdyenLogLevel.WARN;
            if (AdyenLogger.INSTANCE.getLogger().shouldLog(adyenLogLevel)) {
                String name = view.getClass().getName();
                String strY = StringsKt.Y(name, '$');
                String strW = StringsKt.W('.', strY, strY);
                if (strW.length() != 0) {
                    name = StringsKt.O(strW, "Kt");
                }
                AdyenLogger.INSTANCE.getLogger().log(adyenLogLevel, "CO.".concat(name), "Failed to update view layout with secure flag", e5);
            }
        }
    }
}
