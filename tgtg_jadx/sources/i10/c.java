package i10;

import android.net.Uri;
import android.os.Bundle;
import android.util.Base64;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import kotlin.text.StringsKt__StringsKt;
import n7.q;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c extends q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f22780c;

    public c(String str, String str2, String str3, String str4, String str5, Uri uri, String str6) {
        str.getClass();
        str2.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID", str);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID_TOKEN", str2);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_DISPLAY_NAME", str3);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_FAMILY_NAME", str4);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_GIVEN_NAME", str5);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PHONE_NUMBER", str6);
        bundle.putParcelable("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PROFILE_PICTURE_URI", uri);
        super(bundle, "com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL");
        this.f22780c = str2;
        if (str.length() <= 0) {
            i4.a.f("id should not be empty");
            throw null;
        }
        if (str2.length() <= 0) {
            i4.a.f("idToken should not be empty");
            throw null;
        }
        List listSplit$default = StringsKt__StringsKt.split$default(str2, new String[]{"."}, false, 0, 6, null);
        if (listSplit$default.size() != 3) {
            i4.a.f("Invalid token format");
            throw null;
        }
        try {
            byte[] bArrDecode = Base64.decode((String) listSplit$default.get(1), 8);
            bArrDecode.getClass();
            Charset charset = StandardCharsets.UTF_8;
            charset.getClass();
            JSONObject jSONObject = new JSONObject(new String(bArrDecode, charset));
            jSONObject.optString("email").getClass();
            String strOptString = jSONObject.optString("sub");
            if ((strOptString.length() == 0 ? null : strOptString) != null) {
            } else {
                throw new IllegalArgumentException("ID token missing required field: sub");
            }
        } catch (JSONException e5) {
            throw new IllegalArgumentException(e5);
        }
    }
}
