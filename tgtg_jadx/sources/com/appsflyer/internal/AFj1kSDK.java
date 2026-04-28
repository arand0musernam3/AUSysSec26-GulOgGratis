package com.appsflyer.internal;

import android.net.Uri;
import com.appsflyer.AFLogger;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zendesk.messaging.android.internal.di.MessagingComponentKt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001:B\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\nJ\u000f\u0010\u000e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\nJ\u000f\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\nJ\u000f\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\nJ\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0015\u0010\nJ\u000f\u0010\u0016\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0016\u0010\nJ\u000f\u0010\u0017\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0017\u0010\nJ\u000f\u0010\u0018\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0018\u0010\nJ\u000f\u0010\u0019\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0019\u0010\nJ\u0017\u0010\u001b\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001f\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010!\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b!\u0010\u0014J\r\u0010\"\u001a\u00020\b¢\u0006\u0004\b\"\u0010\nJ\r\u0010#\u001a\u00020\b¢\u0006\u0004\b#\u0010\nJ\r\u0010$\u001a\u00020\b¢\u0006\u0004\b$\u0010\nJ\r\u0010%\u001a\u00020\b¢\u0006\u0004\b%\u0010\nJ\r\u0010&\u001a\u00020\b¢\u0006\u0004\b&\u0010\nJ\r\u0010'\u001a\u00020\b¢\u0006\u0004\b'\u0010\nJ\r\u0010(\u001a\u00020\b¢\u0006\u0004\b(\u0010\nJ\u0017\u0010)\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b)\u0010\u001cJ\u000f\u0010*\u001a\u00020\bH\u0002¢\u0006\u0004\b*\u0010\nJ\u000f\u0010+\u001a\u00020\bH\u0002¢\u0006\u0004\b+\u0010\nJ\u000f\u0010,\u001a\u00020\bH\u0002¢\u0006\u0004\b,\u0010\nJ\u000f\u0010-\u001a\u00020\bH\u0002¢\u0006\u0004\b-\u0010\nJ\u001d\u00100\u001a\u00020\b*\u00020\b2\b\b\u0002\u0010/\u001a\u00020.H\u0002¢\u0006\u0004\b0\u00101J\u001d\u00103\u001a\u00020\b*\u00020\b2\b\b\u0002\u00102\u001a\u00020.H\u0002¢\u0006\u0004\b3\u00101J\u0013\u00104\u001a\u00020\b*\u00020\bH\u0002¢\u0006\u0004\b4\u0010\u001cJ'\u00106\u001a\u000205*\u0002052\b\u0010\u001d\u001a\u0004\u0018\u00010\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b6\u00107R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00108R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00109¨\u0006;"}, d2 = {"Lcom/appsflyer/internal/util/EventUrlResolver;", "", "Lcom/appsflyer/internal/components/IdProvider;", MessagingComponentKt.ID_PROVIDER, "Lcom/appsflyer/internal/util/ServerConfigUrlFormatter;", "serverConfigUrlFormatter", "<init>", "(Lcom/appsflyer/internal/components/IdProvider;Lcom/appsflyer/internal/util/ServerConfigUrlFormatter;)V", "", "getAdRevenueUrl", "()Ljava/lang/String;", "getAppsTrackingUrl", "getArsBilling4", "getArsBilling5", "getDdlUrl", "getEventsTrackingUrl", "getFirstLaunchUrl", "Lcom/appsflyer/internal/model/event/AFEvent;", "event", "getLaunchUrl", "(Lcom/appsflyer/internal/model/event/AFEvent;)Ljava/lang/String;", "getManualValidateOneTimePurchaseUrl", "getManualValidateSubscriptionPurchaseUrl", "getPlayIntegrityUrl", "getReferrerTrackingUrl", "getRegisterUrl", "billingVersion", "getUrlForArs", "(Ljava/lang/String;)Ljava/lang/String;", "devKey", "timestamp", "getUrlForDdlEvent", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "getUrlForEvent", "getUrlForManualOneTimePurchaseValidation", "getUrlForManualSubscriptionPurchaseValidation", "getUrlForPlayIntegrityReporting", "getUrlForRdMonitor", "getUrlForRegister", "getUrlForValidatePurchase", "getUrlForValidatePurchaseWithWebHandler", "getUrlForViap", "getValidatePurchaseUrl", "getValidatePurchaseWithWebHandlerUrl", "getViapBilling4", "getViapBilling5", "", "isAdRevenueEvent", "appendBuildNumber", "(Ljava/lang/String;Z)Ljava/lang/String;", "isRegisterEvent", "appendConfiguredChannel", "appendPackageName", "Landroid/net/Uri$Builder;", "appendSigQueryParam", "(Landroid/net/Uri$Builder;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;", "Lcom/appsflyer/internal/components/IdProvider;", "Lcom/appsflyer/internal/util/ServerConfigUrlFormatter;", "Companion", "SDK_prodRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nEventUrlResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventUrlResolver.kt\ncom/appsflyer/internal/util/EventUrlResolver\n+ 2 StringExtensions.kt\ncom/appsflyer/internal/util/StringExtensionsKt\n*L\n1#1,340:1\n39#2:341\n*S KotlinDebug\n*F\n+ 1 EventUrlResolver.kt\ncom/appsflyer/internal/util/EventUrlResolver\n*L\n186#1:341\n*E\n"})
public final class AFj1kSDK {

    @NotNull
    public static final String AFAdRevenueData;

    @NotNull
    public static final String areAllFieldsValid;

    @NotNull
    public static final String component1;

    @NotNull
    public static final String component2;

    @NotNull
    public static final String component3;

    @NotNull
    public static final String component4;

    @NotNull
    private static final String copy;

    @NotNull
    public static final String getCurrencyIso4217Code;

    @NotNull
    public static final AFa1uSDK getMediationNetwork = new AFa1uSDK(null);

    @NotNull
    public static final String getRevenue;

    @NotNull
    private final AFc1kSDK copydefault;

    @NotNull
    public final AFj1bSDK getMonetizationNetwork;

    static {
        String strL = r8.k.l(AFa1tSDK.AFAdRevenueData, "/androidevent?app_id=");
        copy = strL;
        getCurrencyIso4217Code = "https://%sattr.%s/api/v".concat(strL);
        AFAdRevenueData = "https://%sadrevenue.%s/api/v2/generic/v6.18.0/android?app_id=";
        getRevenue = e0.f.k("https://%sconversions.%s/api/v", strL);
        component2 = e0.f.k("https://%slaunches.%s/api/v", strL);
        component4 = e0.f.k("https://%sinapps.%s/api/v", strL);
        component3 = e0.f.k("https://%sregister.%s/api/v", strL);
        component1 = e0.f.k("https://%svalidate.%s/api/v", strL);
        areAllFieldsValid = "https://%smonitorsdk.%s/api/remote-debug/v2.0?app_id=";
    }

    private AFj1kSDK(@NotNull AFc1kSDK aFc1kSDK, @NotNull AFj1bSDK aFj1bSDK) {
        aFc1kSDK.getClass();
        aFj1bSDK.getClass();
        this.copydefault = aFc1kSDK;
        this.getMonetizationNetwork = aFj1bSDK;
    }

    public static String getMediationNetwork(String str, boolean z11) {
        return r8.k.l(str, !z11 ? "&buildnumber=6.18.0" : "");
    }

    public final String AFAdRevenueData(String str) {
        return r8.k.l(str, this.copydefault.getRevenue.getCurrencyIso4217Code.getPackageName());
    }

    @NotNull
    public final String getCurrencyIso4217Code(@Nullable String str, @Nullable String str2) {
        String packageName = this.copydefault.getRevenue.getCurrencyIso4217Code.getPackageName();
        packageName.getClass();
        String strComponent1 = this.copydefault.component1();
        if (strComponent1 != null && !StringsKt.H(strComponent1)) {
            strComponent1 = e0.f.k("-", StringsKt.e0(strComponent1).toString());
        }
        if (strComponent1 == null) {
            strComponent1 = "";
        }
        String string = StringsKt.e0(strComponent1).toString();
        Uri.Builder builderAppendPath = Uri.parse(this.getMonetizationNetwork.getRevenue("https://%sdlsdk.%s/v1.0/android/")).buildUpon().appendPath(packageName + string);
        builderAppendPath.getClass();
        if (str == null || str2 == null) {
            String str3 = str == null ? "devKey" : "timestamp";
            AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, str3.concat(" is null at attempt to generate ddl event url"), new IllegalStateException(str3.concat(" is null")), true, false, false, true);
        } else {
            builderAppendPath.appendQueryParameter("af_sig", AFj1jSDK.getCurrencyIso4217Code(str2.concat(str), str));
        }
        String string2 = builderAppendPath.appendQueryParameter("sdk_version", AFa1tSDK.AFAdRevenueData).build().toString();
        string2.getClass();
        return string2;
    }

    public final String getRevenue(String str, boolean z11) {
        if (z11) {
            return str;
        }
        String strComponent1 = this.copydefault.component1();
        String strConcat = strComponent1 != null ? "&channel=".concat(strComponent1) : null;
        if (strConcat == null) {
            strConcat = "";
        }
        return r8.k.l(str, strConcat);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0087D¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0087D¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006"}, d2 = {"Lcom/appsflyer/internal/AFj1kSDK$AFa1uSDK;", "", "<init>", "()V", "", "copy", "Ljava/lang/String;", "getMediationNetwork", "AFAdRevenueData", "getRevenue", "getCurrencyIso4217Code", "component4", "component2", "getMonetizationNetwork", "areAllFieldsValid", "component1", "component3"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AFa1uSDK {
        private AFa1uSDK() {
        }

        public /* synthetic */ AFa1uSDK(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ AFj1kSDK(AFc1kSDK aFc1kSDK, AFj1bSDK aFj1bSDK, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(aFc1kSDK, (i11 & 2) != 0 ? new AFj1fSDK() : aFj1bSDK);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AFj1kSDK(@NotNull AFc1kSDK aFc1kSDK) {
        this(aFc1kSDK, null, 2, 0 == true ? 1 : 0);
        aFc1kSDK.getClass();
    }
}
