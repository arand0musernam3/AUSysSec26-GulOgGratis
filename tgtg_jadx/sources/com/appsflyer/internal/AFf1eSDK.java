package com.appsflyer.internal;

import com.appsflyer.AppsFlyerConsent;
import com.appsflyer.AppsFlyerProperties;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.w0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class AFf1eSDK implements AFf1gSDK {

    @NotNull
    private final AFc1gSDK AFAdRevenueData;

    @NotNull
    private final AFf1cSDK getCurrencyIso4217Code;

    @NotNull
    private final AppsFlyerProperties getMonetizationNetwork;

    public AFf1eSDK(@NotNull AFf1cSDK aFf1cSDK, @NotNull AFc1gSDK aFc1gSDK, @NotNull AppsFlyerProperties appsFlyerProperties) {
        aFf1cSDK.getClass();
        aFc1gSDK.getClass();
        appsFlyerProperties.getClass();
        this.getCurrencyIso4217Code = aFf1cSDK;
        this.AFAdRevenueData = aFc1gSDK;
        this.getMonetizationNetwork = appsFlyerProperties;
    }

    @Override // com.appsflyer.internal.AFf1gSDK
    public final void getCurrencyIso4217Code(@NotNull Map<String, Object> map, @NotNull AFe1lSDK aFe1lSDK) {
        map.getClass();
        aFe1lSDK.getClass();
        AFf1fSDK mediationNetwork = this.getCurrencyIso4217Code.getMediationNetwork();
        AppsFlyerConsent appsFlyerConsent = this.AFAdRevenueData.areAllFieldsValid;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (appsFlyerConsent != null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            Boolean boolIsUserSubjectToGDPR = appsFlyerConsent.isUserSubjectToGDPR();
            if (boolIsUserSubjectToGDPR != null) {
                linkedHashMap2.put("gdpr_applies", boolIsUserSubjectToGDPR);
            }
            Boolean hasConsentForDataUsage = appsFlyerConsent.getHasConsentForDataUsage();
            if (hasConsentForDataUsage != null) {
                linkedHashMap2.put("ad_user_data_enabled", hasConsentForDataUsage);
            }
            Boolean hasConsentForAdsPersonalization = appsFlyerConsent.getHasConsentForAdsPersonalization();
            if (hasConsentForAdsPersonalization != null) {
                linkedHashMap2.put("ad_personalization_enabled", hasConsentForAdsPersonalization);
            }
            Boolean hasConsentForAdStorage = appsFlyerConsent.getHasConsentForAdStorage();
            if (hasConsentForAdStorage != null) {
                linkedHashMap2.put("ad_storage_enabled", hasConsentForAdStorage);
            }
            linkedHashMap.put("manual", linkedHashMap2);
        }
        if (mediationNetwork != null) {
            boolean z11 = appsFlyerConsent != null;
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            linkedHashMap3.put("policy_version", Integer.valueOf(mediationNetwork.getCurrencyIso4217Code));
            linkedHashMap3.put("cmp_sdk_id", Integer.valueOf(mediationNetwork.getMonetizationNetwork));
            linkedHashMap3.put("cmp_sdk_version", Integer.valueOf(mediationNetwork.AFAdRevenueData));
            if (z11) {
                linkedHashMap3.put("gdpr_applies", -1);
                linkedHashMap3.put("tcstring", "");
            } else {
                linkedHashMap3.put("gdpr_applies", Integer.valueOf(mediationNetwork.getMediationNetwork));
                linkedHashMap3.put("tcstring", mediationNetwork.getRevenue);
            }
            linkedHashMap.put("tcf", linkedHashMap3);
        }
        if (!linkedHashMap.isEmpty()) {
            map.put("consent_data", linkedHashMap);
        }
        if (aFe1lSDK != AFe1lSDK.CONVERSION || this.getMonetizationNetwork.getString(AppsFlyerProperties.ENABLE_TCF_DATA_COLLECTION) == null) {
            return;
        }
        Map<String, Object> monetizationNetwork = AFa1tSDK.getMonetizationNetwork(map);
        monetizationNetwork.getClass();
        monetizationNetwork.put("api", w0.b(new Pair(AppsFlyerProperties.ENABLE_TCF_DATA_COLLECTION, this.getMonetizationNetwork.getString(AppsFlyerProperties.ENABLE_TCF_DATA_COLLECTION))));
    }
}
