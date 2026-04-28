package com.adyen.checkout.ui.core.internal;

import android.content.Context;
import android.net.Uri;
import com.adyen.checkout.core.exception.CheckoutException;
import com.braze.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import zendesk.faye.internal.Bayeux;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH&J\b\u0010\f\u001a\u00020\u0003H&J\u0016\u0010\r\u001a\u00020\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000fH&¨\u0006\u0010"}, d2 = {"Lcom/adyen/checkout/ui/core/internal/RedirectHandler;", "", "launchUriRedirect", "", "context", "Landroid/content/Context;", Constants.BRAZE_WEBVIEW_URL_EXTRA, "", "parseRedirectResult", "Lorg/json/JSONObject;", Bayeux.KEY_DATA, "Landroid/net/Uri;", "removeOnRedirectListener", "setOnRedirectListener", "listener", "Lkotlin/Function0;", "ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface RedirectHandler {
    void launchUriRedirect(@NotNull Context context, @Nullable String url);

    @NotNull
    JSONObject parseRedirectResult(@Nullable Uri data) throws CheckoutException;

    void removeOnRedirectListener();

    void setOnRedirectListener(@NotNull Function0<Unit> listener);
}
