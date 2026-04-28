package com.braze.ui.banners.listeners;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.braze.Braze;
import com.braze.Constants;
import com.braze.enums.Channel;
import com.braze.support.BrazeFileUtils;
import com.braze.support.BrazeLogger;
import com.braze.ui.BrazeDeeplinkHandler;
import com.braze.ui.BrazeWebViewClient;
import com.braze.ui.actions.UriAction;
import com.braze.ui.inappmessage.listeners.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import qw.e;
import vv.b;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J \u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J \u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\u000f"}, d2 = {"Lcom/braze/ui/banners/listeners/DefaultBannerWebViewClientListener;", "Lcom/braze/ui/banners/listeners/IBannerWebViewClientListener;", "<init>", "()V", "onCloseAction", "", "context", "Landroid/content/Context;", Constants.BRAZE_WEBVIEW_URL_EXTRA, "", "queryBundle", "Landroid/os/Bundle;", "onCustomEventAction", "onOtherUrlAction", "Companion", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class DefaultBannerWebViewClientListener implements IBannerWebViewClientListener {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onCloseAction$lambda$0() {
        return "Close action not available on Banners.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onCustomEventAction$lambda$1() {
        return "DefaultBannerWebViewClientListener.onCustomEventAction called.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onOtherUrlAction$lambda$2() {
        return "DefaultBannerWebViewClientListener.onOtherUrlAction called.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onOtherUrlAction$lambda$3(String str) {
        return a0.p("UriAction is null. Not passing any URI to BrazeDeeplinkHandler. Url: ", str, ".");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onOtherUrlAction$lambda$4(Uri uri, String str) {
        return "Not passing local uri to BrazeDeeplinkHandler. Got local uri: " + uri + " for url: " + str + ".";
    }

    public static final boolean parseUseWebViewFromQueryBundle(@NotNull Bundle bundle) {
        return INSTANCE.parseUseWebViewFromQueryBundle(bundle);
    }

    @Override // com.braze.ui.banners.listeners.IBannerWebViewClientListener
    public void onCloseAction(@NotNull Context context, @NotNull String url, @NotNull Bundle queryBundle) {
        context.getClass();
        url.getClass();
        queryBundle.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new b(21), 6, (Object) null);
    }

    @Override // com.braze.ui.banners.listeners.IBannerWebViewClientListener
    public void onCustomEventAction(@NotNull Context context, @NotNull String url, @NotNull Bundle queryBundle) {
        context.getClass();
        url.getClass();
        queryBundle.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new b(23), 7, (Object) null);
        BrazeWebViewClient.Companion companion = BrazeWebViewClient.INSTANCE;
        String customEventNameFromQueryBundle = companion.parseCustomEventNameFromQueryBundle(queryBundle);
        if (customEventNameFromQueryBundle == null || StringsKt.H(customEventNameFromQueryBundle)) {
            return;
        }
        Braze.INSTANCE.getInstance(context).logCustomEvent(customEventNameFromQueryBundle, companion.parsePropertiesFromQueryBundle(queryBundle));
    }

    @Override // com.braze.ui.banners.listeners.IBannerWebViewClientListener
    public void onOtherUrlAction(@NotNull Context context, @NotNull String url, @NotNull Bundle queryBundle) {
        context.getClass();
        url.getClass();
        queryBundle.getClass();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new b(22), 7, (Object) null);
        boolean useWebViewFromQueryBundle = INSTANCE.parseUseWebViewFromQueryBundle(queryBundle);
        BrazeDeeplinkHandler.Companion companion = BrazeDeeplinkHandler.INSTANCE;
        UriAction uriActionCreateUriActionFromUrlString = companion.getInstance().createUriActionFromUrlString(url, queryBundle, useWebViewFromQueryBundle, Channel.BANNER);
        if (uriActionCreateUriActionFromUrlString == null) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new e(url, 22), 6, (Object) null);
            return;
        }
        Uri uri = uriActionCreateUriActionFromUrlString.getUri();
        if (BrazeFileUtils.isLocalUri(uri)) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new a(uri, url, 2), 6, (Object) null);
        } else {
            companion.getInstance().gotoUri(context, uriActionCreateUriActionFromUrlString);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"Lcom/braze/ui/banners/listeners/DefaultBannerWebViewClientListener$Companion;", "", "<init>", "()V", "parseUseWebViewFromQueryBundle", "", "queryBundle", "Landroid/os/Bundle;", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean parseUseWebViewFromQueryBundle(@NotNull Bundle queryBundle) {
            boolean z11;
            boolean z12;
            boolean z13;
            queryBundle.getClass();
            if (queryBundle.containsKey(BrazeWebViewClient.QUERY_NAME_DEEPLINK)) {
                z11 = Boolean.parseBoolean(queryBundle.getString(BrazeWebViewClient.QUERY_NAME_DEEPLINK));
                z12 = true;
            } else {
                z11 = false;
                z12 = false;
            }
            if (queryBundle.containsKey(BrazeWebViewClient.QUERY_NAME_EXTERNAL_OPEN)) {
                z13 = Boolean.parseBoolean(queryBundle.getString(BrazeWebViewClient.QUERY_NAME_EXTERNAL_OPEN));
                z12 = true;
            } else {
                z13 = false;
            }
            if (z12) {
                return (z11 || z13) ? false : true;
            }
            return true;
        }

        private Companion() {
        }
    }
}
