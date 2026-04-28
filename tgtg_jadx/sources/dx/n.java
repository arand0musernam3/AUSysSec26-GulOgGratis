package dx;

import ax.m0;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.x0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tx.f0;
import tx.n0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f15203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f15204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f15205c;

    static {
        d dVar = d.ANON_ID;
        t tVar = t.USER_DATA;
        Pair pair = new Pair(dVar, new j(tVar, u.ANON_ID));
        Pair pair2 = new Pair(d.APP_USER_ID, new j(tVar, u.FB_LOGIN_ID));
        Pair pair3 = new Pair(d.ADVERTISER_ID, new j(tVar, u.MAD_ID));
        Pair pair4 = new Pair(d.PAGE_ID, new j(tVar, u.PAGE_ID));
        Pair pair5 = new Pair(d.PAGE_SCOPED_USER_ID, new j(tVar, u.PAGE_SCOPED_USER_ID));
        d dVar2 = d.ADV_TE;
        t tVar2 = t.APP_DATA;
        f15203a = x0.e(pair, pair2, pair3, pair4, pair5, new Pair(dVar2, new j(tVar2, u.ADV_TE)), new Pair(d.APP_TE, new j(tVar2, u.APP_TE)), new Pair(d.CONSIDER_VIEWS, new j(tVar2, u.CONSIDER_VIEWS)), new Pair(d.DEVICE_TOKEN, new j(tVar2, u.DEVICE_TOKEN)), new Pair(d.EXT_INFO, new j(tVar2, u.EXT_INFO)), new Pair(d.INCLUDE_DWELL_DATA, new j(tVar2, u.INCLUDE_DWELL_DATA)), new Pair(d.INCLUDE_VIDEO_DATA, new j(tVar2, u.INCLUDE_VIDEO_DATA)), new Pair(d.INSTALL_REFERRER, new j(tVar2, u.INSTALL_REFERRER)), new Pair(d.INSTALLER_PACKAGE, new j(tVar2, u.INSTALLER_PACKAGE)), new Pair(d.RECEIPT_DATA, new j(tVar2, u.RECEIPT_DATA)), new Pair(d.URL_SCHEMES, new j(tVar2, u.URL_SCHEMES)), new Pair(d.USER_DATA, new j(tVar, null)));
        Pair pair6 = new Pair(w.EVENT_TIME, new i(null, r.EVENT_TIME));
        Pair pair7 = new Pair(w.EVENT_NAME, new i(null, r.EVENT_NAME));
        w wVar = w.VALUE_TO_SUM;
        t tVar3 = t.CUSTOM_DATA;
        f15204b = x0.e(pair6, pair7, new Pair(wVar, new i(tVar3, r.VALUE_TO_SUM)), new Pair(w.CONTENT_IDS, new i(tVar3, r.CONTENT_IDS)), new Pair(w.CONTENTS, new i(tVar3, r.CONTENTS)), new Pair(w.CONTENT_TYPE, new i(tVar3, r.CONTENT_TYPE)), new Pair(w.CURRENCY, new i(tVar3, r.CURRENCY)), new Pair(w.DESCRIPTION, new i(tVar3, r.DESCRIPTION)), new Pair(w.LEVEL, new i(tVar3, r.LEVEL)), new Pair(w.MAX_RATING_VALUE, new i(tVar3, r.MAX_RATING_VALUE)), new Pair(w.NUM_ITEMS, new i(tVar3, r.NUM_ITEMS)), new Pair(w.PAYMENT_INFO_AVAILABLE, new i(tVar3, r.PAYMENT_INFO_AVAILABLE)), new Pair(w.REGISTRATION_METHOD, new i(tVar3, r.REGISTRATION_METHOD)), new Pair(w.SEARCH_STRING, new i(tVar3, r.SEARCH_STRING)), new Pair(w.SUCCESS, new i(tVar3, r.SUCCESS)), new Pair(w.ORDER_ID, new i(tVar3, r.ORDER_ID)), new Pair(w.AD_TYPE, new i(tVar3, r.AD_TYPE)));
        f15205c = x0.e(new Pair("fb_mobile_achievement_unlocked", s.UNLOCKED_ACHIEVEMENT), new Pair("fb_mobile_activate_app", s.ACTIVATED_APP), new Pair("fb_mobile_add_payment_info", s.ADDED_PAYMENT_INFO), new Pair("fb_mobile_add_to_cart", s.ADDED_TO_CART), new Pair("fb_mobile_add_to_wishlist", s.ADDED_TO_WISHLIST), new Pair("fb_mobile_complete_registration", s.COMPLETED_REGISTRATION), new Pair("fb_mobile_content_view", s.VIEWED_CONTENT), new Pair("fb_mobile_initiated_checkout", s.INITIATED_CHECKOUT), new Pair("fb_mobile_level_achieved", s.ACHIEVED_LEVEL), new Pair("fb_mobile_purchase", s.PURCHASED), new Pair("fb_mobile_rate", s.RATED), new Pair("fb_mobile_search", s.SEARCHED), new Pair("fb_mobile_spent_credits", s.SPENT_CREDITS), new Pair("fb_mobile_tutorial_completion", s.COMPLETED_TUTORIAL));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.HashMap] */
    public static final Object a(Object obj, String str) {
        obj.getClass();
        l.Companion.getClass();
        l lVar = (Intrinsics.areEqual(str, d.EXT_INFO.a()) || Intrinsics.areEqual(str, d.URL_SCHEMES.a()) || Intrinsics.areEqual(str, w.CONTENT_IDS.a()) || Intrinsics.areEqual(str, w.CONTENTS.a()) || Intrinsics.areEqual(str, h.OPTIONS.a())) ? l.ARRAY : (Intrinsics.areEqual(str, d.ADV_TE.a()) || Intrinsics.areEqual(str, d.APP_TE.a())) ? l.BOOL : Intrinsics.areEqual(str, w.EVENT_TIME.a()) ? l.INT : null;
        String str2 = obj instanceof String ? (String) obj : null;
        if (lVar == null || str2 == null) {
            return obj;
        }
        int i11 = m.$EnumSwitchMapping$0[lVar.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    return StringsKt.toIntOrNull(obj.toString());
                }
                e40.a.f();
                return null;
            }
            Integer intOrNull = StringsKt.toIntOrNull(str2.toString());
            if (intOrNull != null) {
                return Boolean.valueOf(intOrNull.intValue() != 0);
            }
            return null;
        }
        try {
            ArrayList<??> arrayListF = n0.f(new JSONArray(str2));
            ArrayList arrayList = new ArrayList();
            for (?? F : arrayListF) {
                try {
                    try {
                        F = n0.g(new JSONObject((String) F));
                    } catch (JSONException unused) {
                    }
                } catch (JSONException unused2) {
                    F = n0.f(new JSONArray((String) F));
                }
                arrayList.add(F);
            }
            return arrayList;
        } catch (JSONException e5) {
            l50.a aVar = f0.f40508d;
            l50.a.A(m0.APP_EVENTS, "AppEventsConversionsAPITransformer", "\n transformEvents JSONException: \n%s\n%s", obj, e5);
            return Unit.f26487a;
        }
    }
}
