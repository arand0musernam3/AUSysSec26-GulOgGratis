package bx;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashSet;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class g implements Serializable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final HashSet f6717f = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JSONObject f6718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JSONObject f6719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f6720c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f6721d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f6722e;

    /* JADX WARN: Removed duplicated region for block: B:32:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b4 A[PHI: r10
      0x00b4: PHI (r10v21 java.lang.String) = (r10v1 java.lang.String), (r10v1 java.lang.String), (r10v20 java.lang.String) binds: [B:37:0x00b2, B:57:0x00f5, B:54:0x00f1] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public g(java.lang.String r6, java.lang.String r7, java.lang.Double r8, android.os.Bundle r9, boolean r10, boolean r11, java.util.UUID r12, bx.s r13) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 806
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bx.g.<init>(java.lang.String, java.lang.String, java.lang.Double, android.os.Bundle, boolean, boolean, java.util.UUID, bx.s):void");
    }

    private final Object writeReplace() throws ObjectStreamException {
        String string = this.f6718a.toString();
        string.getClass();
        String string2 = this.f6719b.toString();
        string2.getClass();
        return new f(string, this.f6720c, string2, this.f6721d);
    }

    public final String toString() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        JSONObject jSONObject = this.f6718a;
        return String.format("\"%s\", implicit: %b, json: %s", Arrays.copyOf(new Object[]{jSONObject.optString("_eventName"), Boolean.valueOf(this.f6720c), jSONObject.toString()}, 3));
    }

    public g(String str, boolean z11, String str2, boolean z12) {
        JSONObject jSONObject = new JSONObject(str);
        this.f6718a = jSONObject;
        this.f6719b = new JSONObject(str2);
        this.f6720c = z11;
        String strOptString = jSONObject.optString("_eventName");
        strOptString.getClass();
        this.f6722e = strOptString;
        this.f6721d = z12;
    }
}
