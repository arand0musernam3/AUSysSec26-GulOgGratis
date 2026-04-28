package com.appsflyer.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.n0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import u70.o;
import u70.p;
import u70.q;
import zendesk.faye.internal.Bayeux;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class AFh1aSDK {

    @Nullable
    public AFi1zSDK AFAdRevenueData;

    @Nullable
    public final AFh1bSDK getCurrencyIso4217Code;

    @Nullable
    public final AFh1dSDK getMonetizationNetwork;

    public AFh1aSDK(@NotNull JSONObject jSONObject) {
        jSONObject.getClass();
        this.AFAdRevenueData = getCurrencyIso4217Code(jSONObject);
        this.getCurrencyIso4217Code = getMonetizationNetwork(jSONObject);
        this.getMonetizationNetwork = getMediationNetwork(jSONObject);
    }

    private static AFi1zSDK getCurrencyIso4217Code(JSONObject jSONObject) {
        Object pVar;
        List arrayList;
        try {
            o oVar = q.f40850b;
            JSONObject mediationNetwork = getMediationNetwork(jSONObject, "r_debugger");
            if (mediationNetwork != null) {
                long j9 = mediationNetwork.getLong("ttl");
                int i11 = mediationNetwork.getInt("counter");
                String strOptString = mediationNetwork.optString("app_ver", "");
                String strOptString2 = mediationNetwork.optString("sdk_ver", "");
                float fOptDouble = (float) mediationNetwork.optDouble("ratio", 1.0d);
                JSONArray jSONArrayOptJSONArray = mediationNetwork.optJSONArray("tags");
                if (jSONArrayOptJSONArray != null) {
                    arrayList = new ArrayList();
                    int length = jSONArrayOptJSONArray.length();
                    for (int i12 = 0; i12 < length; i12++) {
                        String string = jSONArrayOptJSONArray.getString(i12);
                        string.getClass();
                        arrayList.add(string);
                    }
                } else {
                    arrayList = n0.f26529a;
                }
                List list = arrayList;
                strOptString.getClass();
                strOptString2.getClass();
                pVar = new AFi1zSDK(j9, fOptDouble, list, i11, strOptString, strOptString2);
            } else {
                pVar = null;
            }
        } catch (Throwable th2) {
            o oVar2 = q.f40850b;
            pVar = new p(th2);
        }
        o oVar3 = q.f40850b;
        return (AFi1zSDK) (pVar instanceof p ? null : pVar);
    }

    private static AFh1dSDK getMediationNetwork(JSONObject jSONObject) {
        Object pVar;
        try {
            o oVar = q.f40850b;
            JSONObject mediationNetwork = getMediationNetwork(jSONObject, "meta_data");
            pVar = mediationNetwork != null ? new AFh1dSDK(mediationNetwork.optDouble("send_rate", 1.0d)) : null;
        } catch (Throwable th2) {
            o oVar2 = q.f40850b;
            pVar = new p(th2);
        }
        return (AFh1dSDK) (pVar instanceof p ? null : pVar);
    }

    private static AFh1bSDK getMonetizationNetwork(JSONObject jSONObject) {
        Object pVar;
        try {
            o oVar = q.f40850b;
            JSONObject mediationNetwork = getMediationNetwork(jSONObject, "exc_mngr");
            pVar = mediationNetwork != null ? new AFh1bSDK(mediationNetwork.getString("sdk_ver"), mediationNetwork.optInt("min", -1), mediationNetwork.optInt("expire", -1), mediationNetwork.optLong("ttl", -1L)) : null;
        } catch (Throwable th2) {
            o oVar2 = q.f40850b;
            pVar = new p(th2);
        }
        return (AFh1bSDK) (pVar instanceof p ? null : pVar);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(AFh1aSDK.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        AFh1aSDK aFh1aSDK = (AFh1aSDK) obj;
        return Intrinsics.areEqual(this.getCurrencyIso4217Code, aFh1aSDK.getCurrencyIso4217Code) && Intrinsics.areEqual(this.getMonetizationNetwork, aFh1aSDK.getMonetizationNetwork) && Intrinsics.areEqual(this.AFAdRevenueData, aFh1aSDK.AFAdRevenueData);
    }

    public final int hashCode() {
        AFh1bSDK aFh1bSDK = this.getCurrencyIso4217Code;
        int iHashCode = (aFh1bSDK != null ? aFh1bSDK.hashCode() : 0) * 31;
        AFh1dSDK aFh1dSDK = this.getMonetizationNetwork;
        int iHashCode2 = (iHashCode + (aFh1dSDK != null ? aFh1dSDK.hashCode() : 0)) * 31;
        AFi1zSDK aFi1zSDK = this.AFAdRevenueData;
        return iHashCode2 + (aFi1zSDK != null ? aFi1zSDK.hashCode() : 0);
    }

    private static JSONObject getMediationNetwork(JSONObject jSONObject, String str) throws JSONException, NullPointerException {
        JSONObject jSONObjectOptJSONObject;
        if (!jSONObject.has(str) || (jSONObjectOptJSONObject = jSONObject.getJSONArray(str).optJSONObject(0).optJSONObject(Bayeux.KEY_DATA)) == null) {
            return null;
        }
        return jSONObjectOptJSONObject.optJSONObject("v1");
    }
}
