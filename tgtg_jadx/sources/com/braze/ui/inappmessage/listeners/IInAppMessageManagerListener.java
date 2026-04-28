package com.braze.ui.inappmessage.listeners;

import android.view.View;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.inappmessage.MessageButton;
import com.braze.ui.inappmessage.InAppMessageOperation;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0013À\u0006\u0001"}, d2 = {"Lcom/braze/ui/inappmessage/listeners/IInAppMessageManagerListener;", "", "beforeInAppMessageDisplayed", "Lcom/braze/ui/inappmessage/InAppMessageOperation;", "inAppMessage", "Lcom/braze/models/inappmessage/IInAppMessage;", "onInAppMessageClicked", "", "onInAppMessageButtonClicked", "button", "Lcom/braze/models/inappmessage/MessageButton;", "onInAppMessageDismissed", "", "beforeInAppMessageViewOpened", "inAppMessageView", "Landroid/view/View;", "afterInAppMessageViewOpened", "beforeInAppMessageViewClosed", "afterInAppMessageViewClosed", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface IInAppMessageManagerListener {
    default void afterInAppMessageViewClosed(@NotNull IInAppMessage inAppMessage) {
        inAppMessage.getClass();
    }

    default void afterInAppMessageViewOpened(@NotNull View inAppMessageView, @NotNull IInAppMessage inAppMessage) {
        inAppMessageView.getClass();
        inAppMessage.getClass();
    }

    @NotNull
    default InAppMessageOperation beforeInAppMessageDisplayed(@NotNull IInAppMessage inAppMessage) {
        inAppMessage.getClass();
        return InAppMessageOperation.DISPLAY_NOW;
    }

    default void beforeInAppMessageViewClosed(@NotNull View inAppMessageView, @NotNull IInAppMessage inAppMessage) {
        inAppMessageView.getClass();
        inAppMessage.getClass();
    }

    default void beforeInAppMessageViewOpened(@NotNull View inAppMessageView, @NotNull IInAppMessage inAppMessage) {
        inAppMessageView.getClass();
        inAppMessage.getClass();
    }

    default boolean onInAppMessageButtonClicked(@NotNull IInAppMessage inAppMessage, @NotNull MessageButton button) {
        inAppMessage.getClass();
        button.getClass();
        return false;
    }

    default boolean onInAppMessageClicked(@NotNull IInAppMessage inAppMessage) {
        inAppMessage.getClass();
        return false;
    }

    default void onInAppMessageDismissed(@NotNull IInAppMessage inAppMessage) {
        inAppMessage.getClass();
    }
}
