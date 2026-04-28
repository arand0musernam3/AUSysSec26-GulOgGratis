package ev;

import android.content.Context;
import android.os.Bundle;
import ax.a0;
import bx.m;
import bx.z;
import com.app.tgtg.model.remote.UserData;
import com.app.tgtg.model.remote.user.requests.UserAddress;
import com.app.tgtg.model.remote.user.requests.UserGender;
import cv.i;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.y;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f16491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public UserData f16492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f16493c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f16494d;

    public g(Context context) {
        this.f16491a = context;
    }

    public static Pair a(String str) {
        String str2;
        String str3;
        List listSplit$default = str != null ? StringsKt__StringsKt.split$default(str, new String[]{" "}, false, 0, 6, null) : null;
        str2 = "";
        if (listSplit$default != null && listSplit$default.size() > 1) {
            String str4 = (String) CollectionsKt.Q(0, listSplit$default);
            if (str4 == null) {
                str4 = "";
            }
            String str5 = (String) CollectionsKt.Q(1, listSplit$default);
            str3 = str5 != null ? str5 : "";
            str2 = str4;
        } else if (listSplit$default == null || listSplit$default.size() != 1 || (str3 = (String) CollectionsKt.Q(0, listSplit$default)) == null) {
            str3 = "";
        }
        Locale locale = Locale.ROOT;
        String lowerCase = str2.toLowerCase(locale);
        lowerCase.getClass();
        String lowerCase2 = str3.toLowerCase(locale);
        lowerCase2.getClass();
        return new Pair(lowerCase, lowerCase2);
    }

    public final void b(i iVar) {
        boolean z11;
        String str;
        String str2;
        UserAddress userAddress;
        UserAddress userAddress2;
        String state;
        UserAddress userAddress3;
        String city;
        iVar.getClass();
        a0 a0Var = a0.f4849a;
        synchronized (a0.class) {
            z11 = a0.f4868u;
        }
        if (!z11) {
            a0.f4868u = true;
        }
        String lowerCase = null;
        m mVar = new m(this.f16491a, (String) null);
        String strF = iVar.f();
        Bundle bundle = new Bundle();
        UserData userData = this.f16492b;
        bundle.putString("external_id", userData != null ? userData.m285getUserId8nKqa5U() : null);
        mVar.d(bundle, strF);
        if (this.f16493c) {
            UserData userData2 = this.f16492b;
            if (userData2 != null) {
                String email = userData2.getEmail();
                String str3 = (String) a(userData2.getName()).f26485a;
                String str4 = (String) a(userData2.getName()).f26486b;
                String phoneNumber = userData2.getPhoneNumber();
                String birthDate = userData2.getBirthDate();
                String strN = birthDate != null ? y.n(birthDate, "-", "", false) : null;
                UserGender gender = userData2.getGender();
                int i11 = gender == null ? -1 : f.$EnumSwitchMapping$0[gender.ordinal()];
                String str5 = i11 != 1 ? i11 != 2 ? "" : "m" : "f";
                List<UserAddress> userAddresses = userData2.getUserAddresses();
                if (userAddresses == null || (userAddress3 = (UserAddress) CollectionsKt.Q(0, userAddresses)) == null || (city = userAddress3.getCity()) == null) {
                    str = null;
                } else {
                    String lowerCase2 = city.toLowerCase(Locale.ROOT);
                    lowerCase2.getClass();
                    str = lowerCase2;
                }
                List<UserAddress> userAddresses2 = userData2.getUserAddresses();
                if (userAddresses2 == null || (userAddress2 = (UserAddress) CollectionsKt.Q(0, userAddresses2)) == null || (state = userAddress2.getState()) == null) {
                    str2 = null;
                } else {
                    String lowerCase3 = state.toLowerCase(Locale.ROOT);
                    lowerCase3.getClass();
                    str2 = lowerCase3;
                }
                List<UserAddress> userAddresses3 = userData2.getUserAddresses();
                String postalCode = (userAddresses3 == null || (userAddress = (UserAddress) CollectionsKt.Q(0, userAddresses3)) == null) ? null : userAddress.getPostalCode();
                String countryIso = userData2.getCountryIso();
                if (countryIso != null) {
                    lowerCase = countryIso.toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                }
                String str6 = lowerCase;
                z zVar = z.f6762a;
                if (!yx.a.f46339a.contains(z.class)) {
                    try {
                        z.e(email, str3, str4, phoneNumber, strN, str5, str, str2, postalCode, str6);
                    } catch (Throwable th2) {
                        yx.a.a(z.class, th2);
                    }
                }
            }
            this.f16493c = false;
        }
    }
}
