package com.appsflyer.internal;

import android.os.Build;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.x0;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AFe1hSDK extends AFe1bSDK<String> {

    @NotNull
    private final AFe1lSDK component2;

    @NotNull
    private final Map<String, Object> copy;

    @NotNull
    private final AFg1vSDK copydefault;

    @NotNull
    private final AFc1jSDK equals;

    @NotNull
    private final AFc1kSDK hashCode;

    @NotNull
    private final AFf1gSDK toString;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFe1hSDK(@NotNull AFe1lSDK aFe1lSDK, @NotNull AFe1lSDK[] aFe1lSDKArr, @NotNull AFd1zSDK aFd1zSDK, @Nullable String str, @NotNull Map<String, ? extends Object> map) {
        super(aFe1lSDK, aFe1lSDKArr, aFd1zSDK, null);
        aFe1lSDK.getClass();
        aFe1lSDKArr.getClass();
        aFd1zSDK.getClass();
        map.getClass();
        this.component2 = aFe1lSDK;
        this.copy = map;
        AFc1kSDK aFc1kSDKAFAdRevenueData = aFd1zSDK.AFAdRevenueData();
        aFc1kSDKAFAdRevenueData.getClass();
        this.hashCode = aFc1kSDKAFAdRevenueData;
        AFc1jSDK mediationNetwork = aFd1zSDK.getMediationNetwork();
        mediationNetwork.getClass();
        this.equals = mediationNetwork;
        AFg1vSDK aFg1vSDKAreAllFieldsValid = aFd1zSDK.areAllFieldsValid();
        aFg1vSDKAreAllFieldsValid.getClass();
        this.copydefault = aFg1vSDKAreAllFieldsValid;
        AFf1gSDK aFf1gSDKForce = aFd1zSDK.force();
        aFf1gSDKForce.getClass();
        this.toString = aFf1gSDKForce;
    }

    public boolean areAllFieldsValid() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1bSDK
    @Nullable
    public final AppsFlyerRequestListener component1() {
        return null;
    }

    @Override // com.appsflyer.internal.AFe1bSDK
    public final boolean copy() {
        return true;
    }

    @Nullable
    public abstract AFd1fSDK<String> getCurrencyIso4217Code(@NotNull Map<String, Object> map, @NotNull String str, @Nullable String str2);

    @Nullable
    public String getCurrencyIso4217Code(@NotNull Map<String, Object> map) {
        map.getClass();
        return null;
    }

    public void getMonetizationNetwork(@NotNull Map<String, Object> map, @Nullable String str) {
        map.getClass();
        map.put("app_id", this.hashCode.getRevenue.getCurrencyIso4217Code.getPackageName());
        String currencyIso4217Code = AFc1kSDK.getCurrencyIso4217Code();
        if (currencyIso4217Code != null) {
            map.put("cuid", currencyIso4217Code);
        }
        map.put("app_version_name", this.hashCode.n_().versionName);
        if (areAllFieldsValid()) {
            map.put("event_timestamp", Long.valueOf(this.copydefault.getCurrencyIso4217Code()));
        }
        if (str != null) {
            map.put("billing_lib_version", str);
        }
    }

    @Override // com.appsflyer.internal.AFe1bSDK
    @Nullable
    public final AFd1fSDK<String> getRevenue(@NotNull String str) {
        AFd1cSDK aFd1cSDK;
        str.getClass();
        Map<String, Object> mapM = x0.m(this.copy);
        String monetizationNetwork = getMonetizationNetwork(mapM);
        String currencyIso4217Code = getCurrencyIso4217Code(mapM);
        Map<String, Object> linkedHashMap = new LinkedHashMap<>(mapM);
        getMonetizationNetwork(linkedHashMap, monetizationNetwork);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        String monetizationNetwork2 = this.hashCode.getMonetizationNetwork();
        if (monetizationNetwork2 != null && !StringsKt.H(monetizationNetwork2)) {
            linkedHashMap2.put("advertising_id", monetizationNetwork2);
        }
        AFb1mSDK revenue = AFb1jSDK.getRevenue(this.hashCode.getRevenue.getCurrencyIso4217Code);
        String str2 = null;
        String str3 = revenue != null ? revenue.getRevenue : null;
        if (str3 != null && !StringsKt.H(str3)) {
            linkedHashMap2.put("oaid", str3);
        }
        AFb1mSDK aFb1mSDKL_ = AFb1jSDK.l_(this.hashCode.getRevenue.getCurrencyIso4217Code.getContentResolver());
        String str4 = aFb1mSDKL_ != null ? aFb1mSDKL_.getRevenue : null;
        if (str4 != null && !StringsKt.H(str4)) {
            linkedHashMap2.put("amazon_aid", str4);
        }
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false)) {
            linkedHashMap.put(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, "true");
        } else {
            String revenue2 = ((AFe1bSDK) this).component1.getRevenue(this.equals);
            if (revenue2 != null && !StringsKt.H(revenue2)) {
                linkedHashMap2.put("imei", revenue2);
            }
        }
        String currencyIso4217Code2 = AFb1iSDK.getCurrencyIso4217Code(this.hashCode.getCurrencyIso4217Code);
        if (currencyIso4217Code2 == null) {
            currencyIso4217Code2 = "";
        }
        linkedHashMap2.put("appsflyer_id", currencyIso4217Code2);
        linkedHashMap2.put("os_version", String.valueOf(Build.VERSION.SDK_INT));
        linkedHashMap2.put("sdk_version", "6.18.0");
        if (currencyIso4217Code != null && !StringsKt.H(currencyIso4217Code)) {
            linkedHashMap2.put("sdk_connector_version", currencyIso4217Code);
        }
        this.copydefault.getRevenue(linkedHashMap2, this.component2);
        linkedHashMap.put("device_data", linkedHashMap2);
        this.toString.getCurrencyIso4217Code(linkedHashMap, this.component2);
        AFd1fSDK<String> currencyIso4217Code3 = getCurrencyIso4217Code(linkedHashMap, str, monetizationNetwork);
        if (currencyIso4217Code3 != null && (aFd1cSDK = currencyIso4217Code3.getMediationNetwork) != null) {
            str2 = aFd1cSDK.AFAdRevenueData;
        }
        if (str2 != null) {
            JSONObject jSONObject = new JSONObject(linkedHashMap);
            AFg1fSDK.AFAdRevenueData(toString() + ": preparing data: ", jSONObject);
            AFd1lSDK aFd1lSDK = ((AFe1bSDK) this).areAllFieldsValid;
            String string = jSONObject.toString();
            string.getClass();
            aFd1lSDK.getMonetizationNetwork(str2, string);
        }
        return currencyIso4217Code3;
    }

    @Nullable
    public String getMonetizationNetwork(@NotNull Map<String, Object> map) {
        map.getClass();
        return null;
    }
}
