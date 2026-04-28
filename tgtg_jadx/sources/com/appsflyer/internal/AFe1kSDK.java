package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import com.appsflyer.share.LinkGenerator;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class AFe1kSDK extends AFe1bSDK<String> {
    private final String component2;
    private final String copy;
    private final LinkGenerator.ResponseListener copydefault;

    @NonNull
    private final LinkGenerator equals;
    private final Map<String, String> hashCode;

    @NonNull
    private final UUID toString;

    public AFe1kSDK(@NonNull AFd1zSDK aFd1zSDK, @NonNull UUID uuid, @NonNull String str, @NonNull Map<String, String> map, String str2, LinkGenerator.ResponseListener responseListener, @NonNull LinkGenerator linkGenerator) {
        super(AFe1lSDK.ONELINK, new AFe1lSDK[]{AFe1lSDK.RC_CDN}, aFd1zSDK, uuid.toString());
        this.toString = uuid;
        this.component2 = str;
        this.hashCode = new HashMap(map);
        this.copydefault = responseListener;
        this.copy = str2;
        this.equals = linkGenerator;
    }

    @Override // com.appsflyer.internal.AFe1bSDK
    public final boolean a_() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1bSDK
    public final AppsFlyerRequestListener component1() {
        return null;
    }

    @Override // com.appsflyer.internal.AFe1bSDK
    public final boolean copy() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1bSDK, com.appsflyer.internal.AFe1uSDK
    public final void getMonetizationNetwork() {
        ResponseNetwork responseNetwork;
        super.getMonetizationNetwork();
        LinkGenerator.ResponseListener responseListener = this.copydefault;
        if (responseListener != null) {
            if (this.AFAdRevenueData == AFe1rSDK.SUCCESS && (responseNetwork = ((AFe1bSDK) this).component4) != null) {
                responseListener.onResponse((String) responseNetwork.getBody());
                return;
            }
            Throwable thComponent2 = component2();
            if (!(thComponent2 instanceof ParsingException)) {
                responseListener.onResponse(this.equals.generateLink());
            } else if (((ParsingException) thComponent2).getRawResponse().isSuccessful()) {
                responseListener.onResponseError("Can't parse one link data");
            } else {
                responseListener.onResponse(this.equals.generateLink());
            }
        }
    }

    @Override // com.appsflyer.internal.AFe1bSDK
    public final AFd1fSDK<String> getRevenue(@NonNull String str) {
        return ((AFe1bSDK) this).component3.getCurrencyIso4217Code(this.component2, this.hashCode, this.copy, this.toString, str);
    }

    @Override // com.appsflyer.internal.AFe1bSDK, com.appsflyer.internal.AFe1uSDK
    public final long getRevenue() {
        return 3000L;
    }
}
