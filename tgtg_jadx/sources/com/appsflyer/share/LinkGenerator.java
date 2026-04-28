package com.appsflyer.share;

import android.content.Context;
import com.adyen.checkout.ui.core.internal.ui.view.ExpiryDateInput;
import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.CreateOneLinkHttpTask;
import com.appsflyer.internal.AFa1tSDK;
import com.appsflyer.internal.AFd1zSDK;
import com.appsflyer.internal.AFe1kSDK;
import com.appsflyer.internal.AFe1qSDK;
import com.appsflyer.internal.AFe1qSDK.AnonymousClass1;
import com.appsflyer.internal.AFj1dSDK;
import com.appsflyer.internal.AFk1wSDK;
import j4.s;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public class LinkGenerator {
    private String AFAdRevenueData;
    private String areAllFieldsValid;
    private String component1;
    private String component2;
    private String component3;
    private String component4;
    private String copy;
    private final Map<String, String> equals = new HashMap();
    private final String getCurrencyIso4217Code;
    String getMediationNetwork;
    private String getMonetizationNetwork;
    String getRevenue;
    private String hashCode;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public interface ResponseListener {
        void onResponse(String str);

        void onResponseError(String str);
    }

    public LinkGenerator(String str) {
        this.getCurrencyIso4217Code = str;
    }

    private Map<String, String> getCurrencyIso4217Code() {
        HashMap map = new HashMap();
        map.put("pid", this.getCurrencyIso4217Code);
        String str = this.component2;
        if (str != null) {
            map.put("af_referrer_uid", str);
        }
        String str2 = this.getMonetizationNetwork;
        if (str2 != null) {
            map.put(AFInAppEventParameterName.AF_CHANNEL, str2);
        }
        String str3 = this.areAllFieldsValid;
        if (str3 != null) {
            map.put("af_referrer_customer_id", str3);
        }
        String str4 = this.AFAdRevenueData;
        if (str4 != null) {
            map.put("c", str4);
        }
        String str5 = this.component1;
        if (str5 != null) {
            map.put("af_referrer_name", str5);
        }
        String str6 = this.component4;
        if (str6 != null) {
            map.put("af_referrer_image_url", str6);
        }
        if (this.copy != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.copy);
            String str7 = this.component3;
            if (str7 != null) {
                this.component3 = str7.replaceFirst("^[/]", "");
                sb2.append(this.copy.endsWith(ExpiryDateInput.SEPARATOR) ? "" : ExpiryDateInput.SEPARATOR);
                sb2.append(this.component3);
            }
            map.put("af_dp", sb2.toString());
        }
        for (Map.Entry<String, String> entry : this.equals.entrySet()) {
            map.put(entry.getKey(), entry.getValue());
        }
        return AFj1dSDK.getCurrencyIso4217Code(map);
    }

    public LinkGenerator addParameter(String str, String str2) {
        this.equals.put(str, str2);
        return this;
    }

    public LinkGenerator addParameters(Map<String, String> map) {
        if (map != null) {
            this.equals.putAll(map);
        }
        return this;
    }

    public String generateLink() {
        StringBuilder sb2 = new StringBuilder();
        String str = this.getMediationNetwork;
        if (str == null || !str.startsWith("http")) {
            sb2.append(String.format(AFk1wSDK.getCurrencyIso4217Code, AppsFlyerLib.getInstance().getHostPrefix(), AFa1tSDK.getMediationNetwork().getHostName()));
        } else {
            sb2.append(this.getMediationNetwork);
        }
        if (this.getRevenue != null) {
            sb2.append('/');
            sb2.append(this.getRevenue);
        }
        Map<String, String> currencyIso4217Code = getCurrencyIso4217Code();
        StringBuilder sb3 = new StringBuilder();
        for (Map.Entry<String, String> entry : currencyIso4217Code.entrySet()) {
            if (sb3.length() == 0) {
                sb3.append('?');
            } else {
                sb3.append('&');
            }
            sb3.append(entry.getKey());
            sb3.append('=');
            sb3.append(entry.getValue());
        }
        sb2.append(sb3.toString());
        return sb2.toString();
    }

    public String getBrandDomain() {
        return this.hashCode;
    }

    public String getCampaign() {
        return this.AFAdRevenueData;
    }

    public String getChannel() {
        return this.getMonetizationNetwork;
    }

    public String getMediaSource() {
        return this.getCurrencyIso4217Code;
    }

    public Map<String, String> getUserParams() {
        return new HashMap(this.equals);
    }

    public LinkGenerator setBaseDeeplink(String str) {
        this.copy = str;
        return this;
    }

    public LinkGenerator setBaseURL(String str, String str2, String str3) {
        if (str == null || str.length() <= 0) {
            this.getMediationNetwork = s.k("https://", k.m(AppsFlyerLib.getInstance().getHostPrefix(), "app.", AFa1tSDK.getMediationNetwork().getHostName()), ExpiryDateInput.SEPARATOR, str3);
            return this;
        }
        if (str2 == null || str2.length() < 5) {
            str2 = "go.onelink.me";
        }
        this.getMediationNetwork = s.k("https://", str2, ExpiryDateInput.SEPARATOR, str);
        return this;
    }

    public LinkGenerator setBrandDomain(String str) {
        this.hashCode = str;
        return this;
    }

    public LinkGenerator setCampaign(String str) {
        this.AFAdRevenueData = str;
        return this;
    }

    public LinkGenerator setChannel(String str) {
        this.getMonetizationNetwork = str;
        return this;
    }

    public LinkGenerator setDeeplinkPath(String str) {
        this.component3 = str;
        return this;
    }

    public LinkGenerator setReferrerCustomerId(String str) {
        this.areAllFieldsValid = str;
        return this;
    }

    public LinkGenerator setReferrerImageURL(String str) {
        this.component4 = str;
        return this;
    }

    public LinkGenerator setReferrerName(String str) {
        this.component1 = str;
        return this;
    }

    public LinkGenerator setReferrerUID(String str) {
        this.component2 = str;
        return this;
    }

    public void generateLink(Context context, ResponseListener responseListener) {
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_ID);
        String str = this.hashCode;
        Map<String, String> currencyIso4217Code = getCurrencyIso4217Code();
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
            AFLogger.afInfoLog("CustomerUserId not set, generate User Invite Link is disabled", true);
            return;
        }
        AFa1tSDK.getMediationNetwork().getMonetizationNetwork(context);
        AFd1zSDK revenue = AFa1tSDK.getMediationNetwork().getRevenue();
        AFe1kSDK aFe1kSDK = new AFe1kSDK(revenue, UUID.randomUUID(), string, currencyIso4217Code, str, responseListener, this);
        AFe1qSDK aFe1qSDKEquals = revenue.equals();
        aFe1qSDKEquals.getMonetizationNetwork.execute(aFe1qSDKEquals.new AnonymousClass1(aFe1kSDK));
    }

    @Deprecated
    public void generateLink(Context context, final CreateOneLinkHttpTask.ResponseListener responseListener) {
        generateLink(context, new ResponseListener() { // from class: com.appsflyer.share.LinkGenerator.1
            @Override // com.appsflyer.share.LinkGenerator.ResponseListener
            public final void onResponse(String str) {
                responseListener.onResponse(str);
            }

            @Override // com.appsflyer.share.LinkGenerator.ResponseListener
            public final void onResponseError(String str) {
                responseListener.onResponseError(str);
            }
        });
    }
}
