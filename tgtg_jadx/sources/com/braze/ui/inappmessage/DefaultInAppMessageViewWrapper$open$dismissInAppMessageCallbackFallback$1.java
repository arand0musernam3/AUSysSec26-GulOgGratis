package com.braze.ui.inappmessage;

import androidx.activity.y;
import com.braze.support.BrazeLogger;
import com.braze.ui.inappmessage.utils.InAppMessageViewUtils;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/braze/ui/inappmessage/DefaultInAppMessageViewWrapper$open$dismissInAppMessageCallbackFallback$1", "Landroidx/activity/y;", "", "handleOnBackPressed", "()V", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DefaultInAppMessageViewWrapper$open$dismissInAppMessageCallbackFallback$1 extends y {
    public DefaultInAppMessageViewWrapper$open$dismissInAppMessageCallbackFallback$1() {
        super(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleOnBackPressed$lambda$0() {
        return "Fallback Back button intercepted by in-app message";
    }

    @Override // androidx.activity.y
    public void handleOnBackPressed() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new g(2), 7, (Object) null);
        InAppMessageViewUtils.closeInAppMessageOnKeycodeBack();
        remove();
    }
}
