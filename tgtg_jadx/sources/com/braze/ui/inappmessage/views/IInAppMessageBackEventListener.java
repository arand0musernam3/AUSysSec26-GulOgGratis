package com.braze.ui.inappmessage.views;

import android.window.BackEvent;
import com.braze.support.BrazeLogger;
import com.braze.ui.inappmessage.g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lcom/braze/ui/inappmessage/views/IInAppMessageBackEventListener;", "", "onBackStarted", "", "backEvent", "Landroid/window/BackEvent;", "onBackProgressed", "onBackCancelled", "onBackInvoked", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface IInAppMessageBackEventListener {
    /* JADX INFO: Access modifiers changed from: private */
    static String onBackCancelled$lambda$1() {
        return "IInAppMessageBackEventListener: onBackCancelled() called.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    static String onBackInvoked$lambda$2() {
        return "IInAppMessageBackEventListener: onBackInvoked() called.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    static String onBackStarted$lambda$0() {
        return "IInAppMessageBackEventListener: onBackStarted() called.";
    }

    default void onBackCancelled() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new a(0), 6, (Object) null);
    }

    default void onBackInvoked() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new g(29), 6, (Object) null);
    }

    void onBackProgressed(@NotNull BackEvent backEvent);

    default void onBackStarted(@NotNull BackEvent backEvent) {
        backEvent.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new g(28), 6, (Object) null);
    }
}
