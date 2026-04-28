package mx;

import android.os.Bundle;
import java.util.HashSet;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f30232b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f30231a = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static HashSet f30233c = new HashSet();

    public static final void a(Bundle bundle) {
        if (yx.a.f46339a.contains(a.class)) {
            return;
        }
        try {
            if (f30232b && bundle != null) {
                JSONArray jSONArray = new JSONArray();
                for (String str : f30233c) {
                    if (bundle.containsKey(str)) {
                        bundle.remove(str);
                        jSONArray.put(str);
                    }
                }
                if (jSONArray.length() > 0) {
                    bundle.putString("_bannedParams", jSONArray.toString());
                }
            }
        } catch (Throwable th2) {
            yx.a.a(a.class, th2);
        }
    }
}
