package ft;

import android.content.SharedPreferences;
import com.app.tgtg.model.local.AppConstants;
import com.app.tgtg.model.local.BasketManager;
import com.app.tgtg.model.local.DeeplinkC2CReferralData;
import com.app.tgtg.model.remote.UserId;
import com.app.tgtg.model.remote.item.LatLngInfo;
import com.app.tgtg.model.remote.payment.Price;
import com.app.tgtg.model.remote.user.response.UserImpactResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.collections.p0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import zendesk.messaging.android.internal.conversationscreen.messagelog.MessageLogView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c {
    public static String A() {
        d dVar = e.f17923d;
        if (dVar.l == null) {
            dVar.l = x().getString(d(), "");
        }
        return e.f17923d.l;
    }

    public static op.l B() {
        SharedPreferences sharedPreferencesX = x();
        String strY = y();
        if (strY == null) {
            strY = null;
        }
        String string = sharedPreferencesX.getString(strY + "_selectedStation", null);
        if (string == null || string.length() == 0) {
            return null;
        }
        op.k kVar = op.l.Companion;
        kVar.getClass();
        return (op.l) n90.c.f30748d.b(kVar.serializer(), string);
    }

    public static boolean C() {
        d dVar = e.f17923d;
        if (dVar.f17909e == null) {
            SharedPreferences sharedPreferences = e.f17920a;
            if (sharedPreferences == null) {
                Intrinsics.throwUninitializedPropertyAccessException("currentLoginData");
                sharedPreferences = null;
            }
            dVar.f17909e = Boolean.valueOf(sharedPreferences.getBoolean("isBusinessMode", false));
        }
        return Intrinsics.areEqual(e.f17923d.f17909e, Boolean.TRUE);
    }

    public static boolean D() {
        d dVar = e.f17923d;
        if (dVar.f17905a == null) {
            SharedPreferences sharedPreferences = e.f17922c;
            if (sharedPreferences == null) {
                Intrinsics.throwUninitializedPropertyAccessException("appDataStorage");
                sharedPreferences = null;
            }
            dVar.f17905a = Boolean.valueOf(sharedPreferences.getBoolean("calendarPermissionPermanentlyDenied", false));
        }
        return Intrinsics.areEqual(e.f17923d.f17905a, Boolean.TRUE);
    }

    public static boolean E() {
        SharedPreferences sharedPreferences = e.f17922c;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appDataStorage");
            sharedPreferences = null;
        }
        return sharedPreferences.getBoolean("notificationPermissionPermanentlyDenied", false);
    }

    public static void F(String str) {
        SharedPreferences.Editor editorEdit = x().edit();
        String strY = y();
        if (strY == null) {
            strY = null;
        }
        editorEdit.putString(strY + "_badgeBannerHistory", str);
        editorEdit.apply();
    }

    public static void G(BasketManager basketManager) {
        e.f17923d.f17917n = basketManager;
        if (basketManager != null) {
            SharedPreferences.Editor editorEdit = x().edit();
            String strY = y();
            editorEdit.putString(r8.k.l(strY != null ? strY : null, "_basketManager"), basketManager.toJson());
            editorEdit.apply();
            return;
        }
        SharedPreferences.Editor editorEdit2 = x().edit();
        String strY2 = y();
        editorEdit2.putString((strY2 != null ? strY2 : null) + "_basketManager", "");
        editorEdit2.apply();
    }

    public static void H(int i11) {
        SharedPreferences.Editor editorEdit = x().edit();
        String strY = y();
        if (strY == null) {
            strY = null;
        }
        editorEdit.putInt(strY + "_browseStartPage", i11);
        editorEdit.apply();
    }

    public static void I(String str) {
        SharedPreferences.Editor editorEdit = x().edit();
        String strY = y();
        if (strY == null) {
            strY = null;
        }
        editorEdit.putString(strY + "_browseStartSheetStatus", str);
        editorEdit.apply();
    }

    public static void J(boolean z11) {
        e.f17923d.f17909e = Boolean.valueOf(z11);
        SharedPreferences sharedPreferences = e.f17920a;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("currentLoginData");
            sharedPreferences = null;
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putBoolean("isBusinessMode", z11);
        editorEdit.apply();
    }

    public static void K() {
        e.f17923d.f17905a = Boolean.TRUE;
        SharedPreferences sharedPreferences = e.f17922c;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appDataStorage");
            sharedPreferences = null;
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putBoolean("calendarPermissionPermanentlyDenied", true);
        editorEdit.apply();
    }

    public static void L(String str) {
        SharedPreferences sharedPreferences = e.f17922c;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appDataStorage");
            sharedPreferences = null;
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putString("currentPollingId", str);
        editorEdit.apply();
    }

    public static void M(DeeplinkC2CReferralData deeplinkC2CReferralData) {
        SharedPreferences sharedPreferences = null;
        if (deeplinkC2CReferralData != null) {
            SharedPreferences sharedPreferences2 = e.f17922c;
            if (sharedPreferences2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("appDataStorage");
            } else {
                sharedPreferences = sharedPreferences2;
            }
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putString("deeplink_referral_code", deeplinkC2CReferralData.getCode());
            editorEdit.putString("deeplink_referral_type", deeplinkC2CReferralData.getType());
            editorEdit.putString("deeplink_referral_device_id_a", deeplinkC2CReferralData.getDeviceIdPersonA());
            editorEdit.apply();
            return;
        }
        SharedPreferences sharedPreferences3 = e.f17922c;
        if (sharedPreferences3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appDataStorage");
        } else {
            sharedPreferences = sharedPreferences3;
        }
        SharedPreferences.Editor editorEdit2 = sharedPreferences.edit();
        editorEdit2.remove("deeplink_referral_code");
        editorEdit2.remove("deeplink_referral_type");
        editorEdit2.remove("deeplink_referral_device_id_a");
        editorEdit2.apply();
    }

    public static void N(LinkedHashSet linkedHashSet) {
        SharedPreferences.Editor editorEdit = x().edit();
        String strY = y();
        if (strY == null) {
            strY = null;
        }
        editorEdit.putStringSet(strY + "_dismissedRecentOrderIds", linkedHashSet);
        editorEdit.apply();
    }

    public static void O(boolean z11) {
        SharedPreferences sharedPreferences = e.f17922c;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appDataStorage");
            sharedPreferences = null;
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putBoolean("emailSignupOngoing", z11);
        editorEdit.apply();
    }

    public static void P(int i11) {
        SharedPreferences.Editor editorEdit = x().edit();
        String strY = y();
        if (strY == null) {
            strY = null;
        }
        editorEdit.putInt(strY + "_favoritesRecentOrdersImpressionCount", i11);
        editorEdit.apply();
    }

    public static void Q() {
        SharedPreferences sharedPreferences = e.f17922c;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appDataStorage");
            sharedPreferences = null;
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putBoolean("hasAskedForLocation", true);
        editorEdit.apply();
    }

    public static void R() {
        e.f17923d.f17908d = Boolean.FALSE;
        SharedPreferences.Editor editorEdit = x().edit();
        String strY = y();
        if (strY == null) {
            strY = null;
        }
        editorEdit.putBoolean(strY + "_orderToolTipHasBeenSeen", false);
        editorEdit.apply();
    }

    public static void S(boolean z11) {
        SharedPreferences.Editor editorEdit = x().edit();
        String strY = y();
        if (strY == null) {
            strY = null;
        }
        editorEdit.putBoolean(strY + "_hasUserNewVouchers", z11);
        editorEdit.apply();
    }

    public static void T(UserImpactResponse userImpactResponse) {
        SharedPreferences.Editor editorEdit = x().edit();
        String strY = y();
        if (strY == null) {
            strY = null;
        }
        editorEdit.putInt(r8.k.l(strY, "_magicBagCount"), userImpactResponse.getMagicBagCount());
        String strY2 = y();
        if (strY2 == null) {
            strY2 = null;
        }
        editorEdit.putInt(r8.k.l(strY2, "_co2eSaved"), userImpactResponse.getCo2eSaved());
        String strY3 = y();
        if (strY3 == null) {
            strY3 = null;
        }
        String strL = r8.k.l(strY3, "_moneySaved");
        Price moneySaved = userImpactResponse.getMoneySaved();
        editorEdit.putString(strL, moneySaved != null ? moneySaved.toJson() : null);
        String strY4 = y();
        editorEdit.putBoolean(r8.k.l(strY4 != null ? strY4 : null, "_hasClickedOnImpactPrompt"), userImpactResponse.getHasClickedOnImpactPrompt());
        editorEdit.apply();
    }

    public static void U(String str) {
        SharedPreferences sharedPreferences = e.f17922c;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appDataStorage");
            sharedPreferences = null;
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putString("incentivized_always_on_profile_card_state", str);
        editorEdit.apply();
    }

    public static void V(String str) {
        SharedPreferences.Editor editorEdit = x().edit();
        String strY = y();
        if (strY == null) {
            strY = null;
        }
        editorEdit.putString(strY + "_itemDescriptionTranslationPreference", str);
        editorEdit.apply();
    }

    public static void W(long j9) {
        SharedPreferences.Editor editorEdit = x().edit();
        String strY = y();
        if (strY == null) {
            strY = null;
        }
        editorEdit.putLong(strY + "_mailOptInTimestamp", j9);
        editorEdit.apply();
    }

    public static void X(st.b bVar) {
        e.f17923d.f17910f = bVar;
        SharedPreferences.Editor editorEdit = x().edit();
        String strY = y();
        if (strY == null) {
            strY = null;
        }
        editorEdit.putLong(r8.k.l(strY, "lat_browse"), Double.doubleToRawLongBits(bVar.f39278a));
        String strY2 = y();
        editorEdit.putLong(r8.k.l(strY2 != null ? strY2 : null, "lng_browse"), Double.doubleToRawLongBits(bVar.f39279b));
        editorEdit.apply();
    }

    public static void Y() {
        SharedPreferences sharedPreferences = e.f17922c;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appDataStorage");
            sharedPreferences = null;
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putBoolean("notificationPermissionPermanentlyDenied", true);
        editorEdit.apply();
    }

    public static void Z(String str) {
        SharedPreferences sharedPreferences = e.f17922c;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appDataStorage");
            sharedPreferences = null;
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        SharedPreferences sharedPreferences2 = e.f17922c;
        if (sharedPreferences2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appDataStorage");
            sharedPreferences2 = null;
        }
        String string = sharedPreferences2.getString("_orderratingdismissed", "DismissedOrderList");
        if (str == null) {
            str = null;
        }
        editorEdit.putString("_orderratingdismissed", String.format("%s;%s", Arrays.copyOf(new Object[]{string, str}, 2)));
        editorEdit.apply();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.app.tgtg.model.local.SearchFilter a() {
        /*
            Method dump skipped, instruction units count: 419
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ft.c.a():com.app.tgtg.model.local.SearchFilter");
    }

    public static void a0(boolean z11) {
        SharedPreferences sharedPreferences = e.f17922c;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appDataStorage");
            sharedPreferences = null;
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putBoolean("partnerLoginOngoing", z11);
        editorEdit.apply();
    }

    public static int b() {
        SharedPreferences sharedPreferencesX = x();
        String strY = y();
        if (strY == null) {
            strY = null;
        }
        return sharedPreferencesX.getInt(strY + "_actionLeaveDeliveryCount", 0);
    }

    public static void b0(long j9) {
        SharedPreferences.Editor editorEdit = x().edit();
        String strY = y();
        if (strY == null) {
            strY = null;
        }
        editorEdit.putLong(strY + "_pushOptInTimestamp", j9);
        editorEdit.apply();
    }

    public static long c() {
        SharedPreferences sharedPreferences = e.f17922c;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appDataStorage");
            sharedPreferences = null;
        }
        String strY = y();
        return sharedPreferences.getLong((strY != null ? strY : null) + "_brazeChangeUserLatestCall", 0L);
    }

    public static void c0(String str) {
        str.getClass();
        e.f17923d.f17911g = str;
        SharedPreferences sharedPreferences = e.f17922c;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appDataStorage");
            sharedPreferences = null;
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putString("pushToken", str);
        editorEdit.apply();
    }

    public static String d() {
        String strY = y();
        if (strY == null) {
            strY = null;
        }
        return r8.k.l(strY, "_yourlocation");
    }

    public static void d0() {
        SharedPreferences.Editor editorEdit = x().edit();
        String strY = y();
        if (strY == null) {
            strY = null;
        }
        editorEdit.putBoolean(strY + "_reOptInEmailSeen", true);
        editorEdit.apply();
    }

    public static ArrayList e() {
        SharedPreferences sharedPreferences = e.f17920a;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("currentLoginData");
            sharedPreferences = null;
        }
        String strY = y();
        String string = sharedPreferences.getString((strY != null ? strY : null) + "_storeCurrentCardWithBio", "");
        if (string == null || string.length() == 0) {
            return new ArrayList();
        }
        List listSplit$default = StringsKt__StringsKt.split$default(string, new String[]{MessageLogView.COMMA_SEPARATOR}, false, 0, 6, null);
        ArrayList arrayList = new ArrayList(e0.o(listSplit$default, 10));
        Iterator it = listSplit$default.iterator();
        while (it.hasNext()) {
            arrayList.add(StringsKt.e0((String) it.next()).toString());
        }
        return new ArrayList(arrayList);
    }

    public static void e0(int i11) {
        SharedPreferences.Editor editorEdit = x().edit();
        String strY = y();
        if (strY == null) {
            strY = null;
        }
        editorEdit.putInt(strY + "_recipeGeneratorPromoCardDismissCount", i11);
        editorEdit.apply();
    }

    public static String f() {
        SharedPreferences sharedPreferences = e.f17922c;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appDataStorage");
            sharedPreferences = null;
        }
        return sharedPreferences.getString("currentPollingId", null);
    }

    public static void f0(long j9) {
        SharedPreferences.Editor editorEdit = x().edit();
        String strY = y();
        if (strY == null) {
            strY = null;
        }
        editorEdit.putLong(strY + "_recipeGeneratorPromoCardLastDismissedAtMillis", j9);
        editorEdit.apply();
    }

    public static DeeplinkC2CReferralData g() {
        SharedPreferences sharedPreferences = e.f17922c;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appDataStorage");
            sharedPreferences = null;
        }
        String string = sharedPreferences.getString("deeplink_referral_code", null);
        SharedPreferences sharedPreferences2 = e.f17922c;
        if (sharedPreferences2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appDataStorage");
            sharedPreferences2 = null;
        }
        String string2 = sharedPreferences2.getString("deeplink_referral_type", null);
        SharedPreferences sharedPreferences3 = e.f17922c;
        if (sharedPreferences3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appDataStorage");
            sharedPreferences3 = null;
        }
        return new DeeplinkC2CReferralData(string, string2, sharedPreferences3.getString("deeplink_referral_device_id_a", null));
    }

    public static void g0(String str) {
        e.f17923d.f17912h = str;
        SharedPreferences.Editor editorEdit = x().edit();
        String strY = y();
        if (strY == null) {
            strY = null;
        }
        editorEdit.putString(strY + "_searchMode", str);
        editorEdit.apply();
    }

    public static ArrayList h() {
        SharedPreferences sharedPreferencesX = x();
        String strY = y();
        if (strY == null) {
            strY = null;
        }
        String string = sharedPreferencesX.getString(strY + "_dismissedOrderChanges", "");
        if (string == null || string.length() == 0) {
            return new ArrayList();
        }
        List listSplit$default = StringsKt__StringsKt.split$default(string, new String[]{MessageLogView.COMMA_SEPARATOR}, false, 0, 6, null);
        ArrayList arrayList = new ArrayList(e0.o(listSplit$default, 10));
        Iterator it = listSplit$default.iterator();
        while (it.hasNext()) {
            arrayList.add(StringsKt.e0((String) it.next()).toString());
        }
        return new ArrayList(arrayList);
    }

    public static void h0(String str) {
        e.f17923d.f17919p = str;
        SharedPreferences.Editor editorEdit = x().edit();
        String strY = y();
        if (strY == null) {
            strY = null;
        }
        editorEdit.putString(strY + "_selectedLocation", str);
        editorEdit.apply();
    }

    public static Set i() {
        SharedPreferences sharedPreferencesX = x();
        String strY = y();
        if (strY == null) {
            strY = null;
        }
        String strL = r8.k.l(strY, "_dismissedRecentOrderIds");
        p0 p0Var = p0.f26531a;
        Set<String> stringSet = sharedPreferencesX.getStringSet(strL, p0Var);
        return stringSet == null ? p0Var : stringSet;
    }

    public static void i0(jl.b bVar) {
        bVar.getClass();
        e.f17923d.f17918o = bVar.name();
        SharedPreferences.Editor editorEdit = x().edit();
        String strY = y();
        if (strY == null) {
            strY = null;
        }
        editorEdit.putString(r8.k.l(strY, "_selectedLocationType"), bVar.name());
        editorEdit.apply();
    }

    public static double j() {
        d dVar = e.f17923d;
        if (dVar.f17906b == null) {
            SharedPreferences sharedPreferencesX = x();
            String strY = y();
            if (strY == null) {
                strY = null;
            }
            dVar.f17906b = Double.valueOf(Double.longBitsToDouble(sharedPreferencesX.getLong(r8.k.l(strY, "_customSelectedRadiusLong"), Double.doubleToRawLongBits(0.0d))));
        }
        Double d3 = e.f17923d.f17906b;
        if (d3 != null) {
            return d3.doubleValue();
        }
        return 0.0d;
    }

    public static void j0(String str) {
        e.f17923d.f17914j = str;
        SharedPreferences sharedPreferences = e.f17920a;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("currentLoginData");
            sharedPreferences = null;
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        if (str == null) {
            str = null;
        }
        editorEdit.putString("currentUserId", str);
        editorEdit.apply();
    }

    public static boolean k() {
        SharedPreferences sharedPreferences = e.f17922c;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appDataStorage");
            sharedPreferences = null;
        }
        return sharedPreferences.getBoolean("emailSignupOngoing", false);
    }

    public static void k0(LatLngInfo latLngInfo) {
        latLngInfo.getClass();
        e.f17923d.f17915k = latLngInfo;
        SharedPreferences.Editor editorEdit = x().edit();
        String strY = y();
        if (strY == null) {
            strY = null;
        }
        editorEdit.putLong(r8.k.l(strY, "_lat"), Double.doubleToRawLongBits(latLngInfo.getLatitude()));
        String strY2 = y();
        editorEdit.putLong(r8.k.l(strY2 != null ? strY2 : null, "_lng"), Double.doubleToRawLongBits(latLngInfo.getLongitude()));
        editorEdit.apply();
    }

    public static int l() {
        SharedPreferences sharedPreferencesX = x();
        String strY = y();
        if (strY == null) {
            strY = null;
        }
        return sharedPreferencesX.getInt(strY + "_favoritesRecentOrdersImpressionCount", 0);
    }

    public static void l0(String str) {
        e.f17923d.l = str;
        SharedPreferences.Editor editorEdit = x().edit();
        editorEdit.putString(d(), str);
        editorEdit.apply();
    }

    public static boolean m() {
        SharedPreferences sharedPreferences = e.f17922c;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appDataStorage");
            sharedPreferences = null;
        }
        return sharedPreferences.getBoolean("hasAskedForLocation", false);
    }

    public static void m0(op.l lVar) {
        SharedPreferences.Editor editorEdit = x().edit();
        String strY = y();
        if (strY == null) {
            strY = null;
        }
        editorEdit.putString(r8.k.l(strY, "_selectedStation"), lVar != null ? n90.c.f30748d.c(op.l.Companion.serializer(), lVar) : null);
        editorEdit.apply();
    }

    public static boolean n() {
        SharedPreferences sharedPreferencesX = x();
        String strY = y();
        if (strY == null) {
            strY = null;
        }
        return sharedPreferencesX.getBoolean(strY + "_hasUserNewVouchers", false);
    }

    public static boolean n0(String str) {
        str.getClass();
        SharedPreferences sharedPreferencesX = x();
        String strY = y();
        if (strY == null) {
            strY = null;
        }
        String string = sharedPreferencesX.getString(strY + "_blockedIntroBanners", "");
        if (string == null || string.length() == 0) {
            return true;
        }
        List listSplit$default = StringsKt__StringsKt.split$default(StringsKt.P(string, "[", "]"), new String[]{MessageLogView.COMMA_SEPARATOR}, false, 0, 6, null);
        ArrayList arrayList = new ArrayList(e0.o(listSplit$default, 10));
        Iterator it = listSplit$default.iterator();
        while (it.hasNext()) {
            arrayList.add(StringsKt.e0((String) it.next()).toString());
        }
        return !CollectionsKt.r0(arrayList).contains(str);
    }

    public static UserImpactResponse o() {
        SharedPreferences sharedPreferencesX = x();
        String strY = y();
        if (strY == null) {
            strY = null;
        }
        String string = sharedPreferencesX.getString(strY + "_moneySaved", "");
        string.getClass();
        Price price = (string.length() == 0 || Intrinsics.areEqual(string, "{}")) ? new Price("", 0, 0, 6, (DefaultConstructorMarker) null) : Price.INSTANCE.fromJson(string);
        SharedPreferences sharedPreferencesX2 = x();
        String strY2 = y();
        if (strY2 == null) {
            strY2 = null;
        }
        int i11 = sharedPreferencesX2.getInt(strY2 + "_magicBagCount", 0);
        SharedPreferences sharedPreferencesX3 = x();
        String strY3 = y();
        if (strY3 == null) {
            strY3 = null;
        }
        int i12 = sharedPreferencesX3.getInt(strY3 + "_co2eSaved", 0);
        SharedPreferences sharedPreferencesX4 = x();
        String strY4 = y();
        return new UserImpactResponse(i11, i12, price, sharedPreferencesX4.getBoolean((strY4 != null ? strY4 : null) + "_hasClickedOnImpactPrompt", false));
    }

    public static int p() {
        SharedPreferences sharedPreferencesX = x();
        String strY = y();
        if (strY == null) {
            strY = null;
        }
        return sharedPreferencesX.getInt(strY + "_localHeroViewCount", 0);
    }

    public static int q() {
        SharedPreferences sharedPreferencesX = x();
        String strY = y();
        if (strY == null) {
            strY = null;
        }
        return sharedPreferencesX.getInt(strY + "_recipeGeneratorPromoCardDismissCount", 0);
    }

    public static String r() {
        d dVar = e.f17923d;
        if (dVar.f17912h == null) {
            SharedPreferences sharedPreferencesX = x();
            String strY = y();
            if (strY == null) {
                strY = null;
            }
            dVar.f17912h = sharedPreferencesX.getString(strY + "_searchMode", AppConstants.LOCATION_PICKER_NO_SELECTED_LOCATION);
        }
        String str = e.f17923d.f17912h;
        str.getClass();
        return str;
    }

    public static String s() {
        d dVar = e.f17923d;
        if (dVar.f17919p == null) {
            SharedPreferences sharedPreferencesX = x();
            String strY = y();
            if (strY == null) {
                strY = null;
            }
            dVar.f17919p = sharedPreferencesX.getString(strY + "_selectedLocation", null);
        }
        return e.f17923d.f17919p;
    }

    public static jl.b t() {
        d dVar = e.f17923d;
        if (dVar.f17918o == null) {
            SharedPreferences sharedPreferencesX = x();
            String strY = y();
            if (strY == null) {
                strY = null;
            }
            dVar.f17918o = sharedPreferencesX.getString(strY + "_selectedLocationType", "NONE");
        }
        String str = e.f17923d.f17918o;
        str.getClass();
        return jl.b.valueOf(str);
    }

    public static boolean u() {
        SharedPreferences sharedPreferencesX = x();
        String strY = y();
        if (strY == null) {
            strY = null;
        }
        return sharedPreferencesX.getBoolean(strY + "_showBasketIntroBanner", true);
    }

    public static ArrayList v() {
        SharedPreferences sharedPreferencesX = x();
        String strY = y();
        if (strY == null) {
            strY = null;
        }
        String string = sharedPreferencesX.getString(strY + "_storeCardNoBio", "");
        if (string == null || string.length() == 0) {
            return new ArrayList();
        }
        List listSplit$default = StringsKt__StringsKt.split$default(string, new String[]{MessageLogView.COMMA_SEPARATOR}, false, 0, 6, null);
        ArrayList arrayList = new ArrayList(e0.o(listSplit$default, 10));
        Iterator it = listSplit$default.iterator();
        while (it.hasNext()) {
            arrayList.add(StringsKt.e0((String) it.next()).toString());
        }
        return new ArrayList(arrayList);
    }

    public static ArrayList w() {
        SharedPreferences sharedPreferencesX = x();
        String strY = y();
        if (strY == null) {
            strY = null;
        }
        String string = sharedPreferencesX.getString(strY + "_storeCardWithBio", "");
        if (string == null || string.length() == 0) {
            return new ArrayList();
        }
        List listSplit$default = StringsKt__StringsKt.split$default(string, new String[]{MessageLogView.COMMA_SEPARATOR}, false, 0, 6, null);
        ArrayList arrayList = new ArrayList(e0.o(listSplit$default, 10));
        Iterator it = listSplit$default.iterator();
        while (it.hasNext()) {
            arrayList.add(StringsKt.e0((String) it.next()).toString());
        }
        return new ArrayList(arrayList);
    }

    public static SharedPreferences x() {
        SharedPreferences sharedPreferences = e.f17921b;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userDataStorage");
        return null;
    }

    public static String y() {
        d dVar = e.f17923d;
        if (dVar.f17914j == null) {
            SharedPreferences sharedPreferences = e.f17920a;
            if (sharedPreferences == null) {
                Intrinsics.throwUninitializedPropertyAccessException("currentLoginData");
                sharedPreferences = null;
            }
            String string = sharedPreferences.getString("currentUserId", null);
            dVar.f17914j = string != null ? UserId.m287constructorimpl(string) : null;
        }
        return e.f17923d.f17914j;
    }

    public static LatLngInfo z() {
        d dVar = e.f17923d;
        if (dVar.f17915k == null) {
            SharedPreferences sharedPreferencesX = x();
            String strY = y();
            if (strY == null) {
                strY = null;
            }
            double dLongBitsToDouble = Double.longBitsToDouble(sharedPreferencesX.getLong(r8.k.l(strY, "_lat"), Double.doubleToRawLongBits(0.0d)));
            SharedPreferences sharedPreferencesX2 = x();
            String strY2 = y();
            dVar.f17915k = new LatLngInfo(dLongBitsToDouble, Double.longBitsToDouble(sharedPreferencesX2.getLong(r8.k.l(strY2 != null ? strY2 : null, "_lng"), Double.doubleToRawLongBits(0.0d))));
        }
        LatLngInfo latLngInfo = e.f17923d.f17915k;
        return latLngInfo == null ? new LatLngInfo(0.0d, 0.0d) : latLngInfo;
    }
}
