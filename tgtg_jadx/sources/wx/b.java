package wx;

import ax.c0;
import ax.k0;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import vx.d;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f43539b;

    public /* synthetic */ b(List list, int i11) {
        this.f43538a = i11;
        this.f43539b = list;
    }

    @Override // ax.c0
    public final void a(k0 k0Var) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        switch (this.f43538a) {
            case 0:
                List list = this.f43539b;
                if (!yx.a.f46339a.contains(c.class)) {
                    try {
                        k0Var.getClass();
                        try {
                            if (k0Var.f4943c == null && (jSONObject = k0Var.f4944d) != null && jSONObject.getBoolean("success")) {
                                Iterator it = list.iterator();
                                while (it.hasNext()) {
                                    p30.b.p(((d) it.next()).f42528a);
                                    break;
                                }
                                break;
                            }
                        } catch (JSONException unused) {
                            return;
                        }
                    } catch (Throwable th2) {
                        yx.a.a(c.class, th2);
                        return;
                    }
                }
                break;
            default:
                List list2 = this.f43539b;
                k0Var.getClass();
                try {
                    if (k0Var.f4943c == null && (jSONObject2 = k0Var.f4944d) != null && jSONObject2.getBoolean("success")) {
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            p30.b.p(((d) it2.next()).f42528a);
                            break;
                        }
                        break;
                    }
                } catch (JSONException unused2) {
                    return;
                }
                break;
        }
    }
}
