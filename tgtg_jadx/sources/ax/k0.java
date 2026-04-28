package ax;

import com.adyen.checkout.components.core.PaymentMethodTypes;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class k0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f4940e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HttpURLConnection f4941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JSONObject f4942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f4943c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final JSONObject f4944d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k0(h0 h0Var, HttpURLConnection httpURLConnection, String str, JSONObject jSONObject) {
        this(h0Var, httpURLConnection, jSONObject, null, null);
        h0Var.getClass();
        str.getClass();
    }

    public final String toString() {
        String str;
        try {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            Locale locale = Locale.US;
            HttpURLConnection httpURLConnection = this.f4941a;
            str = String.format(locale, "%d", Arrays.copyOf(new Object[]{Integer.valueOf(httpURLConnection != null ? httpURLConnection.getResponseCode() : 200)}, 1));
        } catch (IOException unused) {
            str = PaymentMethodTypes.UNKNOWN;
        }
        StringBuilder sbS = e0.f.s("{Response:  responseCode: ", str, ", graphObject: ");
        sbS.append(this.f4942b);
        sbS.append(", error: ");
        sbS.append(this.f4943c);
        sbS.append("}");
        return sbS.toString();
    }

    public k0(h0 h0Var, HttpURLConnection httpURLConnection, JSONObject jSONObject, JSONArray jSONArray, w wVar) {
        h0Var.getClass();
        this.f4941a = httpURLConnection;
        this.f4942b = jSONObject;
        this.f4943c = wVar;
        this.f4944d = jSONObject;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k0(h0 h0Var, HttpURLConnection httpURLConnection, w wVar) {
        this(h0Var, httpURLConnection, null, null, wVar);
        h0Var.getClass();
    }
}
