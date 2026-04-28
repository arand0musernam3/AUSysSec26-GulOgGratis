package nx;

import android.os.Bundle;
import ax.a0;
import ax.s0;
import bx.s;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Currency;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.d0;
import kotlin.jvm.internal.Intrinsics;
import lx.t;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tx.c0;
import tx.z;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final se.d f31441a = new se.d(a0.a());

    public static i a(String str, Bundle bundle, s sVar, JSONObject jSONObject, JSONObject jSONObject2) {
        if (Intrinsics.areEqual(str, t.SUBS.a())) {
            Map map = s.f6750b;
            bx.t tVar = bx.t.IAPParameters;
            String string = Boolean.toString(jSONObject.optBoolean("autoRenewing", false));
            string.getClass();
            p30.b.j(tVar, "fb_iap_subs_auto_renewing", string, bundle, sVar);
            String strOptString = jSONObject2.optString("subscriptionPeriod");
            strOptString.getClass();
            p30.b.j(tVar, "fb_iap_subs_period", strOptString, bundle, sVar);
            String strOptString2 = jSONObject2.optString("freeTrialPeriod");
            strOptString2.getClass();
            p30.b.j(tVar, "fb_free_trial_period", strOptString2, bundle, sVar);
            String strOptString3 = jSONObject2.optString("introductoryPriceCycles");
            strOptString3.getClass();
            if (strOptString3.length() > 0) {
                p30.b.j(tVar, "fb_intro_price_cycles", strOptString3, bundle, sVar);
            }
            String strOptString4 = jSONObject2.optString("introductoryPricePeriod");
            strOptString4.getClass();
            if (strOptString4.length() > 0) {
                p30.b.j(tVar, "fb_intro_period", strOptString4, bundle, sVar);
            }
            String strOptString5 = jSONObject2.optString("introductoryPriceAmountMicros");
            strOptString5.getClass();
            if (strOptString5.length() > 0) {
                p30.b.j(tVar, "fb_intro_price_amount_micros", strOptString5, bundle, sVar);
            }
        }
        BigDecimal bigDecimal = new BigDecimal(jSONObject2.getLong("price_amount_micros") / 1000000.0d);
        Currency currency = Currency.getInstance(jSONObject2.getString("price_currency_code"));
        currency.getClass();
        return new i(bigDecimal, currency, bundle, sVar);
    }

    public static ArrayList b(String str, Bundle bundle, s sVar, JSONObject jSONObject) throws JSONException {
        if (!Intrinsics.areEqual(str, t.SUBS.a())) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("oneTimePurchaseOfferDetails");
            if (jSONObject2 == null) {
                return null;
            }
            BigDecimal bigDecimal = new BigDecimal(jSONObject2.getLong("priceAmountMicros") / 1000000.0d);
            Currency currency = Currency.getInstance(jSONObject2.getString("priceCurrencyCode"));
            currency.getClass();
            return d0.j(new i(bigDecimal, currency, bundle, sVar));
        }
        ArrayList arrayList = new ArrayList();
        String str2 = "subscriptionOfferDetails";
        JSONArray jSONArray = jSONObject.getJSONArray("subscriptionOfferDetails");
        if (jSONArray == null) {
            return null;
        }
        int length = jSONArray.length();
        int i11 = 0;
        while (i11 < length) {
            JSONObject jSONObject3 = jSONObject.getJSONArray(str2).getJSONObject(i11);
            if (jSONObject3 == null) {
                return null;
            }
            Bundle bundle2 = new Bundle(bundle);
            s sVar2 = new s();
            LinkedHashMap linkedHashMap = sVar.f6751a;
            for (bx.t tVar : linkedHashMap.keySet()) {
                Map map = (Map) linkedHashMap.get(tVar);
                if (map != null) {
                    for (String str3 : map.keySet()) {
                        String str4 = str2;
                        int i12 = length;
                        Object obj = map.get(str3);
                        if (obj != null) {
                            sVar2.a(tVar, str3, obj);
                        }
                        str2 = str4;
                        length = i12;
                    }
                }
            }
            String str5 = str2;
            int i13 = length;
            String string = jSONObject3.getString("basePlanId");
            Map map2 = s.f6750b;
            bx.t tVar2 = bx.t.IAPParameters;
            string.getClass();
            p30.b.j(tVar2, "fb_iap_base_plan", string, bundle2, sVar2);
            JSONObject jSONObject4 = jSONObject3.getJSONArray("pricingPhases").getJSONObject(r5.length() - 1);
            if (jSONObject4 == null) {
                return null;
            }
            String strOptString = jSONObject4.optString("billingPeriod");
            strOptString.getClass();
            p30.b.j(tVar2, "fb_iap_subs_period", strOptString, bundle2, sVar2);
            if (!jSONObject4.has("recurrenceMode") || jSONObject4.getInt("recurrenceMode") == 3) {
                p30.b.j(tVar2, "fb_iap_subs_auto_renewing", "false", bundle2, sVar2);
            } else {
                p30.b.j(tVar2, "fb_iap_subs_auto_renewing", "true", bundle2, sVar2);
            }
            BigDecimal bigDecimal2 = new BigDecimal(jSONObject4.getLong("priceAmountMicros") / 1000000.0d);
            Currency currency2 = Currency.getInstance(jSONObject4.getString("priceCurrencyCode"));
            currency2.getClass();
            arrayList.add(new i(bigDecimal2, currency2, bundle2, sVar2));
            i11++;
            str2 = str5;
            length = i13;
        }
        return arrayList;
    }

    public static final boolean c() {
        z zVarB = c0.b(a0.b());
        return zVarB != null && s0.c() && zVarB.f40590h;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00d0 A[Catch: Exception -> 0x003b, JSONException -> 0x003f, TryCatch #9 {JSONException -> 0x003f, Exception -> 0x003b, blocks: (B:6:0x0019, B:8:0x002f, B:13:0x0043, B:21:0x00d0, B:22:0x00d9, B:23:0x00e1, B:25:0x00e7, B:26:0x0101, B:28:0x0109, B:29:0x0116, B:31:0x011e, B:33:0x0126, B:19:0x00ca, B:16:0x00c6), top: B:130:0x0019, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e7 A[Catch: Exception -> 0x003b, JSONException -> 0x003f, LOOP:0: B:23:0x00e1->B:25:0x00e7, LOOP_END, TryCatch #9 {JSONException -> 0x003f, Exception -> 0x003b, blocks: (B:6:0x0019, B:8:0x002f, B:13:0x0043, B:21:0x00d0, B:22:0x00d9, B:23:0x00e1, B:25:0x00e7, B:26:0x0101, B:28:0x0109, B:29:0x0116, B:31:0x011e, B:33:0x0126, B:19:0x00ca, B:16:0x00c6), top: B:130:0x0019, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0109 A[Catch: Exception -> 0x003b, JSONException -> 0x003f, TryCatch #9 {JSONException -> 0x003f, Exception -> 0x003b, blocks: (B:6:0x0019, B:8:0x002f, B:13:0x0043, B:21:0x00d0, B:22:0x00d9, B:23:0x00e1, B:25:0x00e7, B:26:0x0101, B:28:0x0109, B:29:0x0116, B:31:0x011e, B:33:0x0126, B:19:0x00ca, B:16:0x00c6), top: B:130:0x0019, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0116 A[Catch: Exception -> 0x003b, JSONException -> 0x003f, TryCatch #9 {JSONException -> 0x003f, Exception -> 0x003b, blocks: (B:6:0x0019, B:8:0x002f, B:13:0x0043, B:21:0x00d0, B:22:0x00d9, B:23:0x00e1, B:25:0x00e7, B:26:0x0101, B:28:0x0109, B:29:0x0116, B:31:0x011e, B:33:0x0126, B:19:0x00ca, B:16:0x00c6), top: B:130:0x0019, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x017f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(java.lang.String r12, java.lang.String r13, boolean r14, lx.s r15, boolean r16) {
        /*
            Method dump skipped, instruction units count: 762
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nx.j.d(java.lang.String, java.lang.String, boolean, lx.s, boolean):void");
    }
}
