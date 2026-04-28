package com.appsflyer.internal;

import com.appsflyer.AFPurchaseDetails;
import com.appsflyer.AFPurchaseType;
import com.appsflyer.AppsFlyerInAppPurchaseValidationCallback;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.d0;
import kotlin.collections.o0;
import kotlin.collections.x0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import u70.o;
import u70.p;
import u70.q;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001:\u0001*BK\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0014\u001a\u00020\u00132\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00112\b\u0010\u0005\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\u0014\u0010\u0015JC\u0010\u0017\u001a\u000e\u0012\b\u0012\u0006*\u00020\t0\t\u0018\u00010\u00162\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00112\u0006\u0010\u0005\u001a\u00020\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\tH\u0017¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u0014\u001a\u00020\t2\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011H\u0015¢\u0006\u0004\b\u0014\u0010\u0019J\u001f\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0014\u0010\u001dR\"\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\r8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010%\u001a\u0004\u0018\u00010\u000b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u001b\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0014\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b(\u0010)"}, d2 = {"Lcom/appsflyer/internal/AFe1dSDK;", "Lcom/appsflyer/internal/AFe1hSDK;", "Lcom/appsflyer/internal/AFd1zSDK;", "p0", "Lcom/appsflyer/AppsFlyerProperties;", "p1", "Lcom/appsflyer/AFPurchaseDetails;", "p2", "", "", "p3", "Lcom/appsflyer/AppsFlyerInAppPurchaseValidationCallback;", "p4", "Lcom/appsflyer/internal/AFj1gSDK;", "p5", "<init>", "(Lcom/appsflyer/internal/AFd1zSDK;Lcom/appsflyer/AppsFlyerProperties;Lcom/appsflyer/AFPurchaseDetails;Ljava/util/Map;Lcom/appsflyer/AppsFlyerInAppPurchaseValidationCallback;Lcom/appsflyer/internal/AFj1gSDK;)V", "", "", "", "getMonetizationNetwork", "(Ljava/util/Map;Ljava/lang/String;)V", "Lcom/appsflyer/internal/AFd1fSDK;", "getCurrencyIso4217Code", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)Lcom/appsflyer/internal/AFd1fSDK;", "(Ljava/util/Map;)Ljava/lang/String;", "", "AFAdRevenueData", "(Ljava/lang/String;I)V", "()V", "equals", "Ljava/util/Map;", "copydefault", "Lcom/appsflyer/internal/AFj1gSDK;", "getRevenue", "toString", "Lcom/appsflyer/AppsFlyerInAppPurchaseValidationCallback;", "getMediationNetwork", "component2", "Lcom/appsflyer/AppsFlyerProperties;", "hashCode", "Lcom/appsflyer/AFPurchaseDetails;", "AFa1vSDK"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nManualValidationTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ManualValidationTask.kt\ncom/appsflyer/internal/components/queue/tasks/ManualValidationTask\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,156:1\n1747#2,3:157\n*S KotlinDebug\n*F\n+ 1 ManualValidationTask.kt\ncom/appsflyer/internal/components/queue/tasks/ManualValidationTask\n*L\n98#1:157,3\n*E\n"})
public final class AFe1dSDK extends AFe1hSDK {

    /* JADX INFO: renamed from: component2, reason: from kotlin metadata */
    @NotNull
    private final AppsFlyerProperties AFAdRevenueData;

    /* JADX INFO: renamed from: copydefault, reason: from kotlin metadata */
    @NotNull
    private final AFj1gSDK getRevenue;

    /* JADX INFO: renamed from: equals, reason: from kotlin metadata */
    @Nullable
    private final Map<String, String> getCurrencyIso4217Code;

    /* JADX INFO: renamed from: hashCode, reason: from kotlin metadata */
    @NotNull
    private final AFPurchaseDetails getMonetizationNetwork;

    /* JADX INFO: renamed from: toString, reason: from kotlin metadata */
    @Nullable
    private final AppsFlyerInAppPurchaseValidationCallback getMediationNetwork;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public /* synthetic */ class AFa1uSDK {
        public static final /* synthetic */ int[] getMediationNetwork;

        static {
            int[] iArr = new int[AFPurchaseType.values().length];
            try {
                iArr[AFPurchaseType.SUBSCRIPTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AFPurchaseType.ONE_TIME_PURCHASE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            getMediationNetwork = iArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static final class AFa1vSDK extends RuntimeException {
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private AFe1dSDK(@NotNull AFd1zSDK aFd1zSDK, @NotNull AppsFlyerProperties appsFlyerProperties, @NotNull AFPurchaseDetails aFPurchaseDetails, @Nullable Map<String, String> map, @Nullable AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback, @NotNull AFj1gSDK aFj1gSDK) {
        aFd1zSDK.getClass();
        appsFlyerProperties.getClass();
        aFPurchaseDetails.getClass();
        aFj1gSDK.getClass();
        AFe1lSDK aFe1lSDK = AFe1lSDK.MANUAL_PURCHASE_VALIDATION;
        AFe1lSDK[] aFe1lSDKArr = {AFe1lSDK.RC_CDN, AFe1lSDK.FETCH_ADVERTISING_ID};
        o0 o0Var = o0.f26530a;
        o0Var.getClass();
        super(aFe1lSDK, aFe1lSDKArr, aFd1zSDK, null, o0Var);
        this.AFAdRevenueData = appsFlyerProperties;
        this.getMonetizationNetwork = aFPurchaseDetails;
        this.getCurrencyIso4217Code = map;
        this.getMediationNetwork = appsFlyerInAppPurchaseValidationCallback;
        this.getRevenue = aFj1gSDK;
        this.getMediationNetwork.add(AFe1lSDK.CONVERSION);
    }

    private final void AFAdRevenueData(String p02, int p12) {
        AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback = this.getMediationNetwork;
        if (appsFlyerInAppPurchaseValidationCallback != null) {
            appsFlyerInAppPurchaseValidationCallback.onInAppPurchaseValidationError(x0.e(new Pair("error_code", Integer.valueOf(p12)), new Pair("error_message", p02)));
        }
    }

    @Override // com.appsflyer.internal.AFe1hSDK
    @Nullable
    public final AFd1fSDK<String> getCurrencyIso4217Code(@NotNull Map<String, Object> p02, @NotNull String p12, @Nullable String p22) {
        p02.getClass();
        p12.getClass();
        int i11 = AFa1uSDK.getMediationNetwork[this.getMonetizationNetwork.getPurchaseType().ordinal()];
        if (i11 == 1) {
            return ((AFe1bSDK) this).component3.getMediationNetwork(p02, p12);
        }
        if (i11 == 2) {
            return ((AFe1bSDK) this).component3.getRevenue(p02, p12);
        }
        e40.a.f();
        return null;
    }

    @Override // com.appsflyer.internal.AFe1hSDK
    public final void getMonetizationNetwork(@NotNull Map<String, Object> p02, @Nullable String p12) throws JSONException {
        Object monetizationNetwork;
        p02.getClass();
        super.getMonetizationNetwork(p02, p12);
        List listH = d0.h(this.getMonetizationNetwork.getPurchaseToken(), this.getMonetizationNetwork.getProductId());
        if (listH == null || !listH.isEmpty()) {
            Iterator it = listH.iterator();
            while (it.hasNext()) {
                if (((String) it.next()).length() == 0) {
                    throw new AFa1vSDK();
                }
            }
        }
        p02.put("purchase_token", this.getMonetizationNetwork.getPurchaseToken());
        p02.put("product_id", this.getMonetizationNetwork.getProductId());
        p02.put("purchase_type", this.getMonetizationNetwork.getPurchaseType().getValue());
        Map<String, String> map = this.getCurrencyIso4217Code;
        if (map != null && !map.isEmpty()) {
            p02.put("purchase_additional_details", this.getCurrencyIso4217Code);
        }
        String string = this.AFAdRevenueData.getString(AppsFlyerProperties.ADDITIONAL_CUSTOM_DATA);
        if (string == null || string.length() == 0) {
            monetizationNetwork = o0.f26530a;
            monetizationNetwork.getClass();
        } else {
            monetizationNetwork = AFj1eSDK.getMonetizationNetwork(new JSONObject(string));
        }
        p02.put("custom_data", monetizationNetwork);
    }

    public /* synthetic */ AFe1dSDK(AFd1zSDK aFd1zSDK, AppsFlyerProperties appsFlyerProperties, AFPurchaseDetails aFPurchaseDetails, Map map, AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback, AFj1gSDK aFj1gSDK, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(aFd1zSDK, appsFlyerProperties, aFPurchaseDetails, map, appsFlyerInAppPurchaseValidationCallback, (i11 & 32) != 0 ? new AFj1iSDK() : aFj1gSDK);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AFe1dSDK(@NotNull AFd1zSDK aFd1zSDK, @NotNull AppsFlyerProperties appsFlyerProperties, @NotNull AFPurchaseDetails aFPurchaseDetails, @Nullable Map<String, String> map, @Nullable AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback) {
        this(aFd1zSDK, appsFlyerProperties, aFPurchaseDetails, map, appsFlyerInAppPurchaseValidationCallback, null, 32, null);
        aFd1zSDK.getClass();
        appsFlyerProperties.getClass();
        aFPurchaseDetails.getClass();
    }

    @Override // com.appsflyer.internal.AFe1bSDK, com.appsflyer.internal.AFe1uSDK
    public final void getMonetizationNetwork() {
        Object pVar;
        super.getMonetizationNetwork();
        Throwable thComponent2 = component2();
        if (thComponent2 != null && !(thComponent2 instanceof AFe1nSDK)) {
            if (thComponent2 instanceof AFe1pSDK) {
                AFAdRevenueData("No dev key", -1);
            } else if (thComponent2 instanceof AFa1vSDK) {
                AFAdRevenueData("One or more of provided arguments is empty", -1);
            } else {
                AFAdRevenueData("Error while sending request to server", -1);
            }
        }
        ResponseNetwork responseNetwork = ((AFe1bSDK) this).component4;
        if (responseNetwork != null) {
            if (responseNetwork.getStatusCode() == 200) {
                try {
                    o oVar = q.f40850b;
                    AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback = this.getMediationNetwork;
                    if (appsFlyerInAppPurchaseValidationCallback != null) {
                        appsFlyerInAppPurchaseValidationCallback.onInAppPurchaseValidationFinished(AFj1eSDK.getMonetizationNetwork(new JSONObject((String) responseNetwork.getBody())));
                        pVar = Unit.f26487a;
                    } else {
                        pVar = null;
                    }
                } catch (Throwable th2) {
                    o oVar2 = q.f40850b;
                    pVar = new p(th2);
                }
                if (q.a(pVar) != null) {
                    AFAdRevenueData("Error while trying to parse JSON response", responseNetwork.getStatusCode());
                    return;
                }
                return;
            }
            AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback2 = this.getMediationNetwork;
            if (appsFlyerInAppPurchaseValidationCallback2 != null) {
                appsFlyerInAppPurchaseValidationCallback2.onInAppPurchaseValidationError(x0.e(new Pair("error_code", Integer.valueOf(responseNetwork.getStatusCode())), new Pair("error_message", responseNetwork.getBody())));
            }
        }
    }

    @Override // com.appsflyer.internal.AFe1hSDK
    @NotNull
    public final String getMonetizationNetwork(@NotNull Map<String, Object> p02) {
        p02.getClass();
        return this.getRevenue.getRevenue();
    }
}
