package n7;

import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends c5.b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(int i11, Bundle bundle, String str) {
        super(bundle, "androidx.credentials.TYPE_DIGITAL_CREDENTIAL");
        switch (i11) {
            case 1:
                super(bundle, "android.credentials.TYPE_PASSWORD_CREDENTIAL");
                if (str.length() > 0) {
                    return;
                }
                i4.a.f("password should not be empty");
                throw null;
            case 2:
                super(bundle, "androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL");
                str.getClass();
                if (str.length() != 0) {
                    try {
                        new JSONObject(str);
                        return;
                    } catch (Exception unused) {
                    }
                }
                i4.a.f("authenticationResponseJson must not be empty, and must be a valid JSON");
                throw null;
            default:
                str.getClass();
                if (str.length() != 0) {
                    try {
                        new JSONObject(str);
                        return;
                    } catch (Exception unused2) {
                    }
                }
                i4.a.f("credentialJson must not be empty, and must be a valid JSON");
                throw null;
        }
    }
}
