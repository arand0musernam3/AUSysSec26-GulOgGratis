package com.adyen.checkout.ui.core.internal;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import com.adyen.checkout.core.AdyenLogLevel;
import com.adyen.checkout.core.AdyenLogger;
import com.adyen.checkout.core.exception.CheckoutException;
import com.adyen.checkout.core.exception.ComponentException;
import com.adyen.checkout.ui.core.internal.util.CustomTabsLauncher;
import com.braze.Constants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.bouncycastle.jcajce.provider.asymmetric.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import zendesk.faye.internal.Bayeux;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0018\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u001a\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0003J\u0018\u0010\u000f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u001a\u0010\u0010\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u0018\u0010\u0013\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010\u0017\u001a\u00020\u0006H\u0016J\u0016\u0010\u0018\u001a\u00020\u00062\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016R\u001c\u0010\u0003\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/adyen/checkout/ui/core/internal/DefaultRedirectHandler;", "Lcom/adyen/checkout/ui/core/internal/RedirectHandler;", "()V", "onRedirectListener", "Ljava/lang/ref/WeakReference;", "Lkotlin/Function0;", "", "launchBrowser", "", "context", "Landroid/content/Context;", "uri", "Landroid/net/Uri;", "launchNative", "launchNativeApi30", "launchNativeBeforeApi30", "launchUriRedirect", Constants.BRAZE_WEBVIEW_URL_EXTRA, "", "launchWithCustomTabs", "parseRedirectResult", "Lorg/json/JSONObject;", Bayeux.KEY_DATA, "removeOnRedirectListener", "setOnRedirectListener", "listener", "Companion", "ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDefaultRedirectHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultRedirectHandler.kt\ncom/adyen/checkout/ui/core/internal/DefaultRedirectHandler\n+ 2 AdyenLog.kt\ncom/adyen/checkout/core/internal/util/AdyenLogKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,202:1\n16#2,17:203\n16#2,17:223\n16#2,17:248\n16#2,17:265\n16#2,17:282\n16#2,17:299\n16#2,17:316\n16#2,17:333\n16#2,17:350\n16#2,17:367\n16#2,17:384\n1#3:220\n216#4,2:221\n1557#5:240\n1628#5,3:241\n1557#5:244\n1628#5,3:245\n*S KotlinDebug\n*F\n+ 1 DefaultRedirectHandler.kt\ncom/adyen/checkout/ui/core/internal/DefaultRedirectHandler\n*L\n32#1:203,17\n78#1:223,17\n115#1:248,17\n125#1:265,17\n128#1:282,17\n144#1:299,17\n147#1:316,17\n156#1:333,17\n158#1:350,17\n177#1:367,17\n180#1:384,17\n57#1:221,2\n98#1:240\n98#1:241,3\n105#1:244\n105#1:245,3\n*E\n"})
public final class DefaultRedirectHandler implements RedirectHandler {

    @NotNull
    private static final String MD_PARAMETER = "MD";

    @NotNull
    private static final String PAYLOAD_PARAMETER = "payload";

    @NotNull
    private static final String PAYMENT_RESULT_PARAMETER = "PaRes";

    @NotNull
    private static final String QUERY_STRING_RESULT = "returnUrlQueryString";

    @NotNull
    private static final String REDIRECT_RESULT_PARAMETER = "redirectResult";

    @Nullable
    private WeakReference<Function0<Unit>> onRedirectListener;

    private final boolean launchBrowser(Context context, Uri uri) {
        try {
            Intent data = new Intent().setAction("android.intent.action.VIEW").addCategory("android.intent.category.BROWSABLE").addFlags(268435456).setData(uri);
            data.getClass();
            context.startActivity(data);
            AdyenLogLevel adyenLogLevel = AdyenLogLevel.DEBUG;
            AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
            if (!companion.getLogger().shouldLog(adyenLogLevel)) {
                return true;
            }
            String name = DefaultRedirectHandler.class.getName();
            String strY = StringsKt.Y(name, '$');
            String strW = StringsKt.W('.', strY, strY);
            if (strW.length() != 0) {
                name = StringsKt.O(strW, "Kt");
            }
            companion.getLogger().log(adyenLogLevel, "CO.".concat(name), "launchBrowser - redirect successful with browser", null);
            return true;
        } catch (ActivityNotFoundException unused) {
            AdyenLogLevel adyenLogLevel2 = AdyenLogLevel.DEBUG;
            AdyenLogger.Companion companion2 = AdyenLogger.INSTANCE;
            if (!companion2.getLogger().shouldLog(adyenLogLevel2)) {
                return false;
            }
            String name2 = DefaultRedirectHandler.class.getName();
            String strY2 = StringsKt.Y(name2, '$');
            String strW2 = StringsKt.W('.', strY2, strY2);
            if (strW2.length() != 0) {
                name2 = StringsKt.O(strW2, "Kt");
            }
            companion2.getLogger().log(adyenLogLevel2, "CO.".concat(name2), "launchBrowser - could not do redirect on browser or there's no browser", null);
            return false;
        }
    }

    private final boolean launchNative(Context context, Uri uri) {
        return Build.VERSION.SDK_INT >= 30 ? launchNativeApi30(context, uri) : launchNativeBeforeApi30(context, uri);
    }

    private final boolean launchNativeApi30(Context context, Uri uri) {
        Intent intentAddFlags = new Intent("android.intent.action.VIEW", uri).addCategory("android.intent.category.BROWSABLE").addFlags(268436480);
        intentAddFlags.getClass();
        try {
            context.startActivity(intentAddFlags);
            AdyenLogLevel adyenLogLevel = AdyenLogLevel.DEBUG;
            AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
            if (!companion.getLogger().shouldLog(adyenLogLevel)) {
                return true;
            }
            String name = DefaultRedirectHandler.class.getName();
            String strY = StringsKt.Y(name, '$');
            String strW = StringsKt.W('.', strY, strY);
            if (strW.length() != 0) {
                name = StringsKt.O(strW, "Kt");
            }
            companion.getLogger().log(adyenLogLevel, "CO.".concat(name), "launchNativeApi30 - redirect successful with native app", null);
            return true;
        } catch (ActivityNotFoundException unused) {
            AdyenLogLevel adyenLogLevel2 = AdyenLogLevel.DEBUG;
            AdyenLogger.Companion companion2 = AdyenLogger.INSTANCE;
            if (!companion2.getLogger().shouldLog(adyenLogLevel2)) {
                return false;
            }
            String name2 = DefaultRedirectHandler.class.getName();
            String strY2 = StringsKt.Y(name2, '$');
            String strW2 = StringsKt.W('.', strY2, strY2);
            if (strW2.length() != 0) {
                name2 = StringsKt.O(strW2, "Kt");
            }
            companion2.getLogger().log(adyenLogLevel2, "CO.".concat(name2), "launchNativeApi30 - could not find native app to redirect with", null);
            return false;
        }
    }

    private final boolean launchNativeBeforeApi30(Context context, Uri uri) {
        PackageManager packageManager = context.getPackageManager();
        Intent data = new Intent().setAction("android.intent.action.VIEW").addCategory("android.intent.category.BROWSABLE").setData(Uri.fromParts("http", "", null));
        data.getClass();
        List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(data, 0);
        listQueryIntentActivities.getClass();
        ArrayList arrayList = new ArrayList(e0.o(listQueryIntentActivities, 10));
        Iterator<T> it = listQueryIntentActivities.iterator();
        while (it.hasNext()) {
            arrayList.add(((ResolveInfo) it.next()).resolvePackageName);
        }
        Set setV0 = CollectionsKt.v0(arrayList);
        Intent intentAddCategory = new Intent("android.intent.action.VIEW", uri).addCategory("android.intent.category.BROWSABLE");
        intentAddCategory.getClass();
        List<ResolveInfo> listQueryIntentActivities2 = packageManager.queryIntentActivities(intentAddCategory, 0);
        listQueryIntentActivities2.getClass();
        ArrayList arrayList2 = new ArrayList(e0.o(listQueryIntentActivities2, 10));
        Iterator<T> it2 = listQueryIntentActivities2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((ResolveInfo) it2.next()).resolvePackageName);
        }
        LinkedHashSet linkedHashSetU0 = CollectionsKt.u0(arrayList2);
        linkedHashSetU0.removeAll(setV0);
        if (linkedHashSetU0.isEmpty()) {
            AdyenLogLevel adyenLogLevel = AdyenLogLevel.DEBUG;
            AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
            if (companion.getLogger().shouldLog(adyenLogLevel)) {
                String name = DefaultRedirectHandler.class.getName();
                String strY = StringsKt.Y(name, '$');
                String strW = StringsKt.W('.', strY, strY);
                if (strW.length() != 0) {
                    name = StringsKt.O(strW, "Kt");
                }
                companion.getLogger().log(adyenLogLevel, "CO.".concat(name), "launchNativeBeforeApi30 - could not find native app to redirect with", null);
                return false;
            }
        } else {
            intentAddCategory.addFlags(268435456);
            try {
                context.startActivity(intentAddCategory);
                AdyenLogLevel adyenLogLevel2 = AdyenLogLevel.DEBUG;
                AdyenLogger.Companion companion2 = AdyenLogger.INSTANCE;
                if (!companion2.getLogger().shouldLog(adyenLogLevel2)) {
                    return true;
                }
                String name2 = DefaultRedirectHandler.class.getName();
                String strY2 = StringsKt.Y(name2, '$');
                String strW2 = StringsKt.W('.', strY2, strY2);
                if (strW2.length() != 0) {
                    name2 = StringsKt.O(strW2, "Kt");
                }
                companion2.getLogger().log(adyenLogLevel2, "CO." + name2, "launchNativeBeforeApi30 - redirect successful with native app", null);
                return true;
            } catch (ActivityNotFoundException unused) {
                AdyenLogLevel adyenLogLevel3 = AdyenLogLevel.DEBUG;
                AdyenLogger.Companion companion3 = AdyenLogger.INSTANCE;
                if (companion3.getLogger().shouldLog(adyenLogLevel3)) {
                    String name3 = DefaultRedirectHandler.class.getName();
                    String strY3 = StringsKt.Y(name3, '$');
                    String strW3 = StringsKt.W('.', strY3, strY3);
                    if (strW3.length() != 0) {
                        name3 = StringsKt.O(strW3, "Kt");
                    }
                    companion3.getLogger().log(adyenLogLevel3, "CO.".concat(name3), "launchNativeBeforeApi30 - could not find native app to redirect with", null);
                }
            }
        }
        return false;
    }

    private final boolean launchWithCustomTabs(Context context, Uri uri) {
        boolean zLaunchCustomTab = CustomTabsLauncher.INSTANCE.launchCustomTab(context, uri);
        if (zLaunchCustomTab) {
            AdyenLogLevel adyenLogLevel = AdyenLogLevel.DEBUG;
            AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
            if (companion.getLogger().shouldLog(adyenLogLevel)) {
                String name = DefaultRedirectHandler.class.getName();
                String strY = StringsKt.Y(name, '$');
                String strW = StringsKt.W('.', strY, strY);
                if (strW.length() != 0) {
                    name = StringsKt.O(strW, "Kt");
                }
                companion.getLogger().log(adyenLogLevel, "CO.".concat(name), "launchWithCustomTabs - redirect successful with custom tabs", null);
                return zLaunchCustomTab;
            }
        } else {
            AdyenLogLevel adyenLogLevel2 = AdyenLogLevel.DEBUG;
            AdyenLogger.Companion companion2 = AdyenLogger.INSTANCE;
            if (companion2.getLogger().shouldLog(adyenLogLevel2)) {
                String name2 = DefaultRedirectHandler.class.getName();
                String strY2 = StringsKt.Y(name2, '$');
                String strW2 = StringsKt.W('.', strY2, strY2);
                if (strW2.length() != 0) {
                    name2 = StringsKt.O(strW2, "Kt");
                }
                companion2.getLogger().log(adyenLogLevel2, "CO.".concat(name2), "launchWithCustomTabs - device doesn't support custom tabs or chrome is disabled", null);
            }
        }
        return zLaunchCustomTab;
    }

    @Override // com.adyen.checkout.ui.core.internal.RedirectHandler
    public void launchUriRedirect(@NotNull Context context, @Nullable String url) {
        Function0<Unit> function0;
        context.getClass();
        if (url == null || url.length() == 0) {
            throw new ComponentException("Redirect URL is empty.", null, 2, null);
        }
        Uri uri = Uri.parse(url);
        uri.getClass();
        if (launchNative(context, uri) || launchWithCustomTabs(context, uri) || launchBrowser(context, uri)) {
            WeakReference<Function0<Unit>> weakReference = this.onRedirectListener;
            if (weakReference == null || (function0 = weakReference.get()) == null) {
                return;
            }
            function0.invoke();
            return;
        }
        AdyenLogLevel adyenLogLevel = AdyenLogLevel.ERROR;
        AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
        if (companion.getLogger().shouldLog(adyenLogLevel)) {
            String name = DefaultRedirectHandler.class.getName();
            String strY = StringsKt.Y(name, '$');
            String strW = StringsKt.W('.', strY, strY);
            if (strW.length() != 0) {
                name = StringsKt.O(strW, "Kt");
            }
            companion.getLogger().log(adyenLogLevel, "CO.".concat(name), "Could not launch url", null);
        }
        throw new ComponentException("Launching redirect failed.", null, 2, null);
    }

    @Override // com.adyen.checkout.ui.core.internal.RedirectHandler
    @NotNull
    public JSONObject parseRedirectResult(@Nullable Uri data) {
        String encodedQuery;
        String queryParameter;
        AdyenLogLevel adyenLogLevel = AdyenLogLevel.DEBUG;
        AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
        if (companion.getLogger().shouldLog(adyenLogLevel)) {
            String name = DefaultRedirectHandler.class.getName();
            String strY = StringsKt.Y(name, '$');
            String strW = StringsKt.W('.', strY, strY);
            if (strW.length() != 0) {
                name = StringsKt.O(strW, "Kt");
            }
            companion.getLogger().log(adyenLogLevel, "CO.".concat(name), a.b(data, "parseRedirectResult - "), null);
        }
        if (data == null) {
            throw new CheckoutException("Received a null redirect Uri", null, 2, null);
        }
        HashMap map = new HashMap();
        String queryParameter2 = data.getQueryParameter("payload");
        if (queryParameter2 != null) {
        }
        String queryParameter3 = data.getQueryParameter(REDIRECT_RESULT_PARAMETER);
        if (queryParameter3 != null) {
        }
        String queryParameter4 = data.getQueryParameter(PAYMENT_RESULT_PARAMETER);
        if (queryParameter4 != null && (queryParameter = data.getQueryParameter(MD_PARAMETER)) != null) {
            map.put(PAYMENT_RESULT_PARAMETER, queryParameter4);
            map.put(MD_PARAMETER, queryParameter);
        }
        if (map.isEmpty() && (encodedQuery = data.getEncodedQuery()) != null) {
        }
        if (map.isEmpty()) {
            throw new CheckoutException("Error parsing redirect result, could not find any query parameters", null, 2, null);
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : map.entrySet()) {
                jSONObject.put((String) entry.getKey(), entry.getValue());
            }
            return jSONObject;
        } catch (JSONException e5) {
            throw new CheckoutException("Error creating redirect result.", e5);
        }
    }

    @Override // com.adyen.checkout.ui.core.internal.RedirectHandler
    public void removeOnRedirectListener() {
        WeakReference<Function0<Unit>> weakReference = this.onRedirectListener;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.onRedirectListener = null;
    }

    @Override // com.adyen.checkout.ui.core.internal.RedirectHandler
    public void setOnRedirectListener(@NotNull Function0<Unit> listener) {
        listener.getClass();
        this.onRedirectListener = new WeakReference<>(listener);
    }
}
