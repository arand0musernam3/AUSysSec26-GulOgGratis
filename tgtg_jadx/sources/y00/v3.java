package y00;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class v3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f45252a;

    public v3(Map map) {
        HashMap map2 = new HashMap();
        this.f45252a = map2;
        map2.putAll(map);
    }

    public final String a() {
        StringBuilder sb2 = new StringBuilder();
        k30.x xVar = x3.f45300a;
        int i11 = xVar.f25928d;
        for (int i12 = 0; i12 < i11; i12++) {
            String str = (String) xVar.get(i12);
            HashMap map = this.f45252a;
            if (map.containsKey(str)) {
                if (sb2.length() > 0) {
                    sb2.append(";");
                }
                sb2.append(str);
                sb2.append("=");
                sb2.append((String) map.get(str));
            }
        }
        return sb2.toString();
    }

    public final Bundle b() {
        HashMap map = this.f45252a;
        if ("1".equals(map.get("gdprApplies")) && "1".equals(map.get("EnableAdvertiserConsentMode"))) {
            String str = "denied";
            if (map.get("Version") == null) {
                if (!"1".equals(map.get("GoogleConsent"))) {
                    return Bundle.EMPTY;
                }
                int iC = c();
                if (iC < 0) {
                    return Bundle.EMPTY;
                }
                String str2 = (String) map.get("PurposeConsents");
                if (TextUtils.isEmpty(str2)) {
                    return Bundle.EMPTY;
                }
                Bundle bundle = new Bundle();
                if (str2.length() > 0) {
                    bundle.putString(a2.AD_STORAGE.zze, str2.charAt(0) == '1' ? "granted" : "denied");
                }
                if (str2.length() > 3) {
                    bundle.putString(a2.AD_PERSONALIZATION.zze, (str2.charAt(2) == '1' && str2.charAt(3) == '1') ? "granted" : "denied");
                }
                if (str2.length() > 6 && iC >= 4) {
                    String str3 = a2.AD_USER_DATA.zze;
                    if (str2.charAt(0) == '1' && str2.charAt(6) == '1') {
                        str = "granted";
                    }
                    bundle.putString(str3, str);
                }
                return bundle;
            }
            if (c() >= 0) {
                Bundle bundle2 = new Bundle();
                bundle2.putString(a2.AD_STORAGE.zze, true != Objects.equals(map.get("AuthorizePurpose1"), "1") ? "denied" : "granted");
                bundle2.putString(a2.AD_PERSONALIZATION.zze, (Objects.equals(map.get("AuthorizePurpose3"), "1") && Objects.equals(map.get("AuthorizePurpose4"), "1")) ? "granted" : "denied");
                if (c() >= 4) {
                    String str4 = a2.AD_USER_DATA.zze;
                    if (Objects.equals(map.get("AuthorizePurpose1"), "1") && Objects.equals(map.get("AuthorizePurpose7"), "1")) {
                        str = "granted";
                    }
                    bundle2.putString(str4, str);
                }
                return bundle2;
            }
        }
        return Bundle.EMPTY;
    }

    public final int c() {
        try {
            String str = (String) this.f45252a.get("PolicyVersion");
            if (TextUtils.isEmpty(str)) {
                return -1;
            }
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof v3) {
            return a().equalsIgnoreCase(((v3) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return a();
    }
}
