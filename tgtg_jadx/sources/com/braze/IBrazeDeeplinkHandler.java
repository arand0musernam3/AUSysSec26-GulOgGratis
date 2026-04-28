package com.braze;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.braze.enums.Channel;
import com.braze.models.inappmessage.InAppMessageBase;
import com.braze.ui.actions.UriAction;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0018J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&J,\u0010\f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H&J*\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0019À\u0006\u0001"}, d2 = {"Lcom/braze/IBrazeDeeplinkHandler;", "", "gotoUri", "", "context", "Landroid/content/Context;", "uriAction", "Lcom/braze/ui/actions/UriAction;", "getIntentFlags", "", "intentFlagPurpose", "Lcom/braze/IBrazeDeeplinkHandler$IntentFlagPurpose;", "createUriActionFromUrlString", Constants.BRAZE_WEBVIEW_URL_EXTRA, "", InAppMessageBase.EXTRAS, "Landroid/os/Bundle;", "openInWebView", "", "channel", "Lcom/braze/enums/Channel;", "createUriActionFromUri", "uri", "Landroid/net/Uri;", "IntentFlagPurpose", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface IBrazeDeeplinkHandler {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/braze/IBrazeDeeplinkHandler$IntentFlagPurpose;", "", "<init>", "(Ljava/lang/String;I)V", "NOTIFICATION_ACTION_WITH_DEEPLINK", "NOTIFICATION_PUSH_STORY_PAGE_CLICK", "URI_ACTION_OPEN_WITH_WEBVIEW_ACTIVITY", "URI_ACTION_OPEN_WITH_ACTION_VIEW", "URI_ACTION_BACK_STACK_GET_ROOT_INTENT", "URI_ACTION_BACK_STACK_ONLY_GET_TARGET_INTENT", "URI_UTILS_GET_MAIN_ACTIVITY_INTENT", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class IntentFlagPurpose {
        private static final /* synthetic */ a80.a $ENTRIES;
        private static final /* synthetic */ IntentFlagPurpose[] $VALUES;
        public static final IntentFlagPurpose NOTIFICATION_ACTION_WITH_DEEPLINK = new IntentFlagPurpose("NOTIFICATION_ACTION_WITH_DEEPLINK", 0);
        public static final IntentFlagPurpose NOTIFICATION_PUSH_STORY_PAGE_CLICK = new IntentFlagPurpose("NOTIFICATION_PUSH_STORY_PAGE_CLICK", 1);
        public static final IntentFlagPurpose URI_ACTION_OPEN_WITH_WEBVIEW_ACTIVITY = new IntentFlagPurpose("URI_ACTION_OPEN_WITH_WEBVIEW_ACTIVITY", 2);
        public static final IntentFlagPurpose URI_ACTION_OPEN_WITH_ACTION_VIEW = new IntentFlagPurpose("URI_ACTION_OPEN_WITH_ACTION_VIEW", 3);
        public static final IntentFlagPurpose URI_ACTION_BACK_STACK_GET_ROOT_INTENT = new IntentFlagPurpose("URI_ACTION_BACK_STACK_GET_ROOT_INTENT", 4);
        public static final IntentFlagPurpose URI_ACTION_BACK_STACK_ONLY_GET_TARGET_INTENT = new IntentFlagPurpose("URI_ACTION_BACK_STACK_ONLY_GET_TARGET_INTENT", 5);
        public static final IntentFlagPurpose URI_UTILS_GET_MAIN_ACTIVITY_INTENT = new IntentFlagPurpose("URI_UTILS_GET_MAIN_ACTIVITY_INTENT", 6);

        private static final /* synthetic */ IntentFlagPurpose[] $values() {
            return new IntentFlagPurpose[]{NOTIFICATION_ACTION_WITH_DEEPLINK, NOTIFICATION_PUSH_STORY_PAGE_CLICK, URI_ACTION_OPEN_WITH_WEBVIEW_ACTIVITY, URI_ACTION_OPEN_WITH_ACTION_VIEW, URI_ACTION_BACK_STACK_GET_ROOT_INTENT, URI_ACTION_BACK_STACK_ONLY_GET_TARGET_INTENT, URI_UTILS_GET_MAIN_ACTIVITY_INTENT};
        }

        static {
            IntentFlagPurpose[] intentFlagPurposeArr$values = $values();
            $VALUES = intentFlagPurposeArr$values;
            $ENTRIES = v0.n.w(intentFlagPurposeArr$values);
        }

        private IntentFlagPurpose(String str, int i11) {
        }

        @NotNull
        public static a80.a getEntries() {
            return $ENTRIES;
        }

        public static IntentFlagPurpose valueOf(String str) {
            return (IntentFlagPurpose) Enum.valueOf(IntentFlagPurpose.class, str);
        }

        public static IntentFlagPurpose[] values() {
            return (IntentFlagPurpose[]) $VALUES.clone();
        }
    }

    @NotNull
    UriAction createUriActionFromUri(@NotNull Uri uri, @Nullable Bundle extras, boolean openInWebView, @NotNull Channel channel);

    @Nullable
    UriAction createUriActionFromUrlString(@NotNull String url, @Nullable Bundle extras, boolean openInWebView, @NotNull Channel channel);

    int getIntentFlags(@NotNull IntentFlagPurpose intentFlagPurpose);

    void gotoUri(@NotNull Context context, @NotNull UriAction uriAction);
}
