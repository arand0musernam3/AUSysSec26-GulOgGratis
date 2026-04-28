package px;

import android.os.Bundle;
import bx.g;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import org.json.JSONArray;
import tx.c0;
import tx.z;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f35633a = new b();

    public static final Bundle a(c cVar, String str, List list) {
        if (!yx.a.f46339a.contains(b.class)) {
            try {
                cVar.getClass();
                list.getClass();
                Bundle bundle = new Bundle();
                bundle.putString("event", cVar.toString());
                bundle.putString("app_id", str);
                if (c.CUSTOM_APP_EVENTS != cVar) {
                    return bundle;
                }
                JSONArray jSONArrayB = f35633a.b(str, list);
                if (jSONArrayB.length() != 0) {
                    bundle.putString("custom_events", jSONArrayB.toString());
                    return bundle;
                }
            } catch (Throwable th2) {
                yx.a.a(b.class, th2);
                return null;
            }
        }
        return null;
    }

    public final JSONArray b(String str, List list) {
        Set set = yx.a.f46339a;
        if (set.contains(this)) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            ArrayList<g> arrayListT0 = CollectionsKt.t0(list);
            gx.b.b(arrayListT0);
            boolean z11 = false;
            if (!set.contains(this)) {
                try {
                    z zVarK = c0.k(str, false);
                    if (zVarK != null) {
                        z11 = zVarK.f40583a;
                    }
                } catch (Throwable th2) {
                    yx.a.a(this, th2);
                }
            }
            for (g gVar : arrayListT0) {
                boolean z12 = gVar.f6720c;
                if (!z12 || (z12 && z11)) {
                    jSONArray.put(gVar.f6718a);
                }
            }
            return jSONArray;
        } catch (Throwable th3) {
            yx.a.a(this, th3);
            return null;
        }
    }
}
