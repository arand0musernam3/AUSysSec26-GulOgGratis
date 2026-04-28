package mx;

import ax.a0;
import java.util.HashMap;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONObject;
import tx.c0;
import tx.n0;
import tx.z;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f30250b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f30249a = new g();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static HashMap f30251c = new HashMap();

    public final void a() {
        HashSet hashSetE;
        if (yx.a.f46339a.contains(this)) {
            return;
        }
        try {
            z zVarK = c0.k(a0.b(), false);
            if (zVarK == null) {
                return;
            }
            try {
                f30251c = new HashMap();
                JSONArray jSONArray = zVarK.f40599r;
                if (jSONArray == null || jSONArray.length() == 0) {
                    return;
                }
                int length = jSONArray.length();
                for (int i11 = 0; i11 < length; i11++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i11);
                    boolean zHas = jSONObject.has("key");
                    boolean zHas2 = jSONObject.has("value");
                    if (zHas && zHas2) {
                        String string = jSONObject.getString("key");
                        JSONArray jSONArray2 = jSONObject.getJSONArray("value");
                        if (string != null && (hashSetE = n0.e(jSONArray2)) != null) {
                            f30251c.put(string, hashSetE);
                        }
                    }
                }
            } catch (Exception unused) {
            }
        } catch (Throwable th2) {
            yx.a.a(this, th2);
        }
    }
}
