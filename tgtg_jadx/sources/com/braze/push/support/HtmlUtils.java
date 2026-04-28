package com.braze.push.support;

import android.text.Html;
import android.text.Spanned;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.support.BrazeLogger;
import g60.d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0002\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"TAG", "", "getHtmlSpannedTextIfEnabled", "", "configurationProvider", "Lcom/braze/configuration/BrazeConfigurationProvider;", "android-sdk-ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class HtmlUtils {

    @NotNull
    private static final String TAG = BrazeLogger.INSTANCE.getBrazeLogTag("HtmlUtils");

    @NotNull
    public static final CharSequence getHtmlSpannedTextIfEnabled(@NotNull String str, @NotNull BrazeConfigurationProvider brazeConfigurationProvider) {
        str.getClass();
        brazeConfigurationProvider.getClass();
        if (StringsKt.H(str)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new d(28), 14, (Object) null);
            return str;
        }
        if (!brazeConfigurationProvider.isPushNotificationHtmlRenderingEnabled()) {
            return str;
        }
        Spanned spannedFromHtml = Html.fromHtml(str, 0);
        spannedFromHtml.getClass();
        return spannedFromHtml;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getHtmlSpannedTextIfEnabled$lambda$0() {
        return "Cannot create html spanned text on blank text. Returning blank string.";
    }
}
