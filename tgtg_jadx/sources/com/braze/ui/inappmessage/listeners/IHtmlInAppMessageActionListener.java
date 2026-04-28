package com.braze.ui.inappmessage.listeners;

import android.os.Bundle;
import com.braze.Constants;
import com.braze.models.inappmessage.IInAppMessage;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J \u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J \u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Lcom/braze/ui/inappmessage/listeners/IHtmlInAppMessageActionListener;", "", "onCloseClicked", "", "inAppMessage", "Lcom/braze/models/inappmessage/IInAppMessage;", Constants.BRAZE_WEBVIEW_URL_EXTRA, "", "queryBundle", "Landroid/os/Bundle;", "onCustomEventFired", "", "onOtherUrlAction", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface IHtmlInAppMessageActionListener {
    default void onCloseClicked(@NotNull IInAppMessage inAppMessage, @NotNull String url, @NotNull Bundle queryBundle) {
        inAppMessage.getClass();
        url.getClass();
        queryBundle.getClass();
    }

    default boolean onCustomEventFired(@NotNull IInAppMessage inAppMessage, @NotNull String url, @NotNull Bundle queryBundle) {
        inAppMessage.getClass();
        url.getClass();
        queryBundle.getClass();
        return false;
    }

    default boolean onOtherUrlAction(@NotNull IInAppMessage inAppMessage, @NotNull String url, @NotNull Bundle queryBundle) {
        inAppMessage.getClass();
        url.getClass();
        queryBundle.getClass();
        return false;
    }
}
