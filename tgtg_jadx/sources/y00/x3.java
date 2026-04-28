package y00;

import android.content.SharedPreferences;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class x3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k30.x f45300a;

    static {
        k30.d dVar = k30.h.f25901b;
        Object[] objArr = new Object[24];
        objArr[0] = "Version";
        objArr[1] = "GoogleConsent";
        objArr[2] = "VendorConsent";
        objArr[3] = "VendorLegitimateInterest";
        objArr[4] = "gdprApplies";
        objArr[5] = "EnableAdvertiserConsentMode";
        objArr[6] = "PolicyVersion";
        objArr[7] = "PurposeConsents";
        objArr[8] = "PurposeOneTreatment";
        objArr[9] = "Purpose1";
        objArr[10] = "Purpose3";
        objArr[11] = "Purpose4";
        System.arraycopy(new String[]{"Purpose7", "CmpSdkID", "PublisherCC", "PublisherRestrictions1", "PublisherRestrictions3", "PublisherRestrictions4", "PublisherRestrictions7", "AuthorizePurpose1", "AuthorizePurpose3", "AuthorizePurpose4", "AuthorizePurpose7", "PurposeDiagnostics"}, 0, objArr, 12, 12);
        m0.c.T(24, objArr);
        f45300a = k30.h.j(24, objArr);
    }

    public static String a(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getString(str, "");
        } catch (ClassCastException unused) {
            return "";
        }
    }

    public static final boolean b(com.google.android.gms.internal.measurement.i0 i0Var, k30.c0 c0Var, k30.c0 c0Var2, k30.f0 f0Var, char[] cArr, int i11, int i12, int i13, String str, String str2, String str3, boolean z11, boolean z12) {
        w3 w3Var;
        char c3;
        int iC = c(i0Var);
        if (iC > 0 && (i12 != 1 || i11 != 1)) {
            cArr[iC] = '2';
        }
        if (g(i0Var, c0Var2) == com.google.android.gms.internal.measurement.j0.PURPOSE_RESTRICTION_NOT_ALLOWED) {
            c3 = '3';
        } else {
            if (i0Var == com.google.android.gms.internal.measurement.i0.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE && i13 == 1 && f0Var.f25897d.equals(str)) {
                if (iC > 0 && cArr[iC] != '2') {
                    cArr[iC] = '1';
                }
                return true;
            }
            if (c0Var.containsKey(i0Var) && (w3Var = (w3) c0Var.get(i0Var)) != null) {
                int iOrdinal = w3Var.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        if (iOrdinal == 2) {
                            return g(i0Var, c0Var2) == com.google.android.gms.internal.measurement.j0.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST ? f(i0Var, cArr, str3, z12) : e(i0Var, cArr, str2, z11);
                        }
                        if (iOrdinal == 3) {
                            return g(i0Var, c0Var2) == com.google.android.gms.internal.measurement.j0.PURPOSE_RESTRICTION_REQUIRE_CONSENT ? e(i0Var, cArr, str2, z11) : f(i0Var, cArr, str3, z12);
                        }
                        c3 = '0';
                    } else if (g(i0Var, c0Var2) != com.google.android.gms.internal.measurement.j0.PURPOSE_RESTRICTION_REQUIRE_CONSENT) {
                        return f(i0Var, cArr, str3, z12);
                    }
                } else if (g(i0Var, c0Var2) != com.google.android.gms.internal.measurement.j0.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST) {
                    return e(i0Var, cArr, str2, z11);
                }
                c3 = '8';
            } else {
                c3 = '0';
            }
        }
        if (iC <= 0 || cArr[iC] == '2') {
            return false;
        }
        cArr[iC] = c3;
        return false;
    }

    public static final int c(com.google.android.gms.internal.measurement.i0 i0Var) {
        if (i0Var == com.google.android.gms.internal.measurement.i0.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE) {
            return 1;
        }
        if (i0Var == com.google.android.gms.internal.measurement.i0.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE) {
            return 2;
        }
        if (i0Var == com.google.android.gms.internal.measurement.i0.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS) {
            return 3;
        }
        return i0Var == com.google.android.gms.internal.measurement.i0.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE ? 4 : -1;
    }

    public static final String d(com.google.android.gms.internal.measurement.i0 i0Var, String str, String str2) {
        String strValueOf = "0";
        String strValueOf2 = (TextUtils.isEmpty(str) || str.length() < i0Var.a()) ? "0" : String.valueOf(str.charAt(i0Var.a() - 1));
        if (!TextUtils.isEmpty(str2) && str2.length() >= i0Var.a()) {
            strValueOf = String.valueOf(str2.charAt(i0Var.a() - 1));
        }
        return String.valueOf(strValueOf2).concat(String.valueOf(strValueOf));
    }

    public static final boolean e(com.google.android.gms.internal.measurement.i0 i0Var, char[] cArr, String str, boolean z11) {
        char c3;
        int iC = c(i0Var);
        if (!z11) {
            c3 = '4';
        } else {
            if (str.length() >= i0Var.a()) {
                char cCharAt = str.charAt(i0Var.a() - 1);
                boolean z12 = cCharAt == '1';
                if (iC > 0 && cArr[iC] != '2') {
                    cArr[iC] = cCharAt != '1' ? '6' : '1';
                }
                return z12;
            }
            c3 = '0';
        }
        if (iC > 0 && cArr[iC] != '2') {
            cArr[iC] = c3;
        }
        return false;
    }

    public static final boolean f(com.google.android.gms.internal.measurement.i0 i0Var, char[] cArr, String str, boolean z11) {
        char c3;
        int iC = c(i0Var);
        if (!z11) {
            c3 = '5';
        } else {
            if (str.length() >= i0Var.a()) {
                char cCharAt = str.charAt(i0Var.a() - 1);
                boolean z12 = cCharAt == '1';
                if (iC > 0 && cArr[iC] != '2') {
                    cArr[iC] = cCharAt != '1' ? '7' : '1';
                }
                return z12;
            }
            c3 = '0';
        }
        if (iC > 0 && cArr[iC] != '2') {
            cArr[iC] = c3;
        }
        return false;
    }

    public static final com.google.android.gms.internal.measurement.j0 g(com.google.android.gms.internal.measurement.i0 i0Var, k30.c0 c0Var) {
        Object obj = com.google.android.gms.internal.measurement.j0.PURPOSE_RESTRICTION_UNDEFINED;
        Object obj2 = c0Var.get(i0Var);
        if (obj2 != null) {
            obj = obj2;
        }
        return (com.google.android.gms.internal.measurement.j0) obj;
    }
}
