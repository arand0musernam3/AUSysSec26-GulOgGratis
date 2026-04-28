package com.adyen.checkout.ui.core.internal.util;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import com.adyen.checkout.core.AdyenLogLevel;
import com.adyen.checkout.core.AdyenLogger;
import com.braze.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.bouncycastle.jcajce.provider.asymmetric.a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0016\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bJ\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002¨\u0006\u000f"}, d2 = {"Lcom/adyen/checkout/ui/core/internal/util/PdfOpener;", "", "()V", "open", "", "context", "Landroid/content/Context;", "uri", "Landroid/net/Uri;", "", Constants.BRAZE_WEBVIEW_URL_EXTRA, "", "openInBrowser", "openInCustomTab", "openInExternalApp", "ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPdfOpener.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PdfOpener.kt\ncom/adyen/checkout/ui/core/internal/util/PdfOpener\n+ 2 AdyenLog.kt\ncom/adyen/checkout/core/internal/util/AdyenLogKt\n*L\n1#1,90:1\n16#2,17:91\n16#2,17:108\n21#2,12:125\n16#2,17:137\n16#2,17:154\n16#2,17:171\n21#2,12:188\n*S KotlinDebug\n*F\n+ 1 PdfOpener.kt\ncom/adyen/checkout/ui/core/internal/util/PdfOpener\n*L\n29#1:91,17\n54#1:108,17\n57#1:125,12\n66#1:137,17\n68#1:154,17\n82#1:171,17\n85#1:188,12\n*E\n"})
public final class PdfOpener {
    private final boolean openInBrowser(Context context, Uri uri) {
        try {
            Intent data = new Intent().setAction("android.intent.action.VIEW").addCategory("android.intent.category.BROWSABLE").addFlags(268435456).setData(uri);
            data.getClass();
            context.startActivity(data);
            AdyenLogLevel adyenLogLevel = AdyenLogLevel.DEBUG;
            AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
            if (!companion.getLogger().shouldLog(adyenLogLevel)) {
                return true;
            }
            String name = PdfOpener.class.getName();
            String strY = StringsKt.Y(name, '$');
            String strW = StringsKt.W('.', strY, strY);
            if (strW.length() != 0) {
                name = StringsKt.O(strW, "Kt");
            }
            companion.getLogger().log(adyenLogLevel, "CO.".concat(name), "Successfully opened pdf in browser", null);
            return true;
        } catch (ActivityNotFoundException e5) {
            AdyenLogLevel adyenLogLevel2 = AdyenLogLevel.DEBUG;
            AdyenLogger.Companion companion2 = AdyenLogger.INSTANCE;
            if (!companion2.getLogger().shouldLog(adyenLogLevel2)) {
                return false;
            }
            String name2 = PdfOpener.class.getName();
            String strY2 = StringsKt.Y(name2, '$');
            String strW2 = StringsKt.W('.', strY2, strY2);
            if (strW2.length() != 0) {
                name2 = StringsKt.O(strW2, "Kt");
            }
            companion2.getLogger().log(adyenLogLevel2, "CO.".concat(name2), "Couldn't open pdf in browser", e5);
            return false;
        }
    }

    private final boolean openInCustomTab(Context context, Uri uri) {
        boolean zLaunchCustomTab = CustomTabsLauncher.INSTANCE.launchCustomTab(context, uri);
        if (zLaunchCustomTab) {
            AdyenLogLevel adyenLogLevel = AdyenLogLevel.DEBUG;
            AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
            if (companion.getLogger().shouldLog(adyenLogLevel)) {
                String name = PdfOpener.class.getName();
                String strY = StringsKt.Y(name, '$');
                String strW = StringsKt.W('.', strY, strY);
                if (strW.length() != 0) {
                    name = StringsKt.O(strW, "Kt");
                }
                companion.getLogger().log(adyenLogLevel, "CO.".concat(name), "Successfully opened pdf in custom tab", null);
                return zLaunchCustomTab;
            }
        } else {
            AdyenLogLevel adyenLogLevel2 = AdyenLogLevel.DEBUG;
            AdyenLogger.Companion companion2 = AdyenLogger.INSTANCE;
            if (companion2.getLogger().shouldLog(adyenLogLevel2)) {
                String name2 = PdfOpener.class.getName();
                String strY2 = StringsKt.Y(name2, '$');
                String strW2 = StringsKt.W('.', strY2, strY2);
                if (strW2.length() != 0) {
                    name2 = StringsKt.O(strW2, "Kt");
                }
                companion2.getLogger().log(adyenLogLevel2, "CO.".concat(name2), "Couldn't open pdf in custom tab", null);
            }
        }
        return zLaunchCustomTab;
    }

    private final boolean openInExternalApp(Context context, Uri uri) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setDataAndType(uri, "application/pdf");
        try {
            context.startActivity(intent);
            AdyenLogLevel adyenLogLevel = AdyenLogLevel.DEBUG;
            AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
            if (!companion.getLogger().shouldLog(adyenLogLevel)) {
                return true;
            }
            String name = PdfOpener.class.getName();
            String strY = StringsKt.Y(name, '$');
            String strW = StringsKt.W('.', strY, strY);
            if (strW.length() != 0) {
                name = StringsKt.O(strW, "Kt");
            }
            companion.getLogger().log(adyenLogLevel, "CO.".concat(name), "Successfully opened pdf in external app", null);
            return true;
        } catch (ActivityNotFoundException e5) {
            AdyenLogLevel adyenLogLevel2 = AdyenLogLevel.DEBUG;
            AdyenLogger.Companion companion2 = AdyenLogger.INSTANCE;
            if (!companion2.getLogger().shouldLog(adyenLogLevel2)) {
                return false;
            }
            String name2 = PdfOpener.class.getName();
            String strY2 = StringsKt.Y(name2, '$');
            String strW2 = StringsKt.W('.', strY2, strY2);
            if (strW2.length() != 0) {
                name2 = StringsKt.O(strW2, "Kt");
            }
            companion2.getLogger().log(adyenLogLevel2, "CO.".concat(name2), "Couldn't open pdf in external app", e5);
            return false;
        }
    }

    public final void open(@NotNull Context context, @NotNull String url) throws IllegalStateException {
        context.getClass();
        url.getClass();
        Uri uri = Uri.parse(url);
        uri.getClass();
        if (open(context, uri) || openInBrowser(context, uri)) {
            return;
        }
        AdyenLogLevel adyenLogLevel = AdyenLogLevel.ERROR;
        AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
        if (companion.getLogger().shouldLog(adyenLogLevel)) {
            String name = PdfOpener.class.getName();
            String strY = StringsKt.Y(name, '$');
            String strW = StringsKt.W('.', strY, strY);
            if (strW.length() != 0) {
                name = StringsKt.O(strW, "Kt");
            }
            companion.getLogger().log(adyenLogLevel, "CO.".concat(name), a.b(uri, "Couldn't open pdf with url: "), null);
        }
        org.bouncycastle.jce.provider.a.p(uri, "Couldn't open pdf with url: ");
    }

    private final boolean open(Context context, Uri uri) {
        if (Build.VERSION.SDK_INT >= 30) {
            if (openInExternalApp(context, uri)) {
                return true;
            }
            return openInCustomTab(context, uri);
        }
        return openInCustomTab(context, uri);
    }
}
