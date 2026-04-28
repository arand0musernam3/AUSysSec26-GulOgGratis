package ax;

import androidx.lifecycle.m1;
import com.braze.models.Banner;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4890b;

    public /* synthetic */ d(Object obj, int i11) {
        this.f4889a = i11;
        this.f4890b = obj;
    }

    @Override // ax.c0
    public final void a(k0 k0Var) {
        se.d dVar;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        switch (this.f4889a) {
            case 0:
                h hVar = (h) this.f4890b;
                k0Var.getClass();
                JSONObject jSONObject3 = k0Var.f4944d;
                if (jSONObject3 != null) {
                    hVar.f4910a = jSONObject3.optString("access_token");
                    hVar.f4911b = jSONObject3.optInt(Banner.EXPIRATION);
                    hVar.f4912c = jSONObject3.optInt("expires_in");
                    hVar.f4913d = Long.valueOf(jSONObject3.optLong("data_access_expiration_time"));
                    hVar.f4914e = jSONObject3.optString("graph_domain", null);
                    break;
                }
                break;
            case 1:
                a50.d dVar2 = (a50.d) this.f4890b;
                k0Var.getClass();
                if (dVar2 != null) {
                    JSONObject jSONObject4 = k0Var.f4942b;
                    dn.k kVar = (dn.k) dVar2.f825c;
                    String str = (String) dVar2.f824b;
                    try {
                        if (k0Var.f4943c == null && jSONObject4 != null && (dVar = (se.d) kVar.f15019c) != null) {
                            jSONObject4.getString("name");
                            jSONObject4.optString("email", "");
                            al.p pVar = (al.p) dVar.f39013b;
                            v80.f0.B(m1.d(pVar), null, null, new al.j(pVar, cl.e.f8445b, str, (x70.c) null), 3);
                            break;
                        }
                    } catch (JSONException e5) {
                        sa0.a.f38953a.d(e5);
                        return;
                    }
                }
                break;
            case 2:
                vx.d dVar3 = (vx.d) this.f4890b;
                k0Var.getClass();
                try {
                    if (k0Var.f4943c == null && (jSONObject = k0Var.f4944d) != null && jSONObject.getBoolean("success")) {
                        p30.b.p(dVar3.f42528a);
                        break;
                    }
                } catch (JSONException unused) {
                    return;
                }
                break;
            default:
                ArrayList arrayList = (ArrayList) this.f4890b;
                k0Var.getClass();
                try {
                    if (k0Var.f4943c == null && (jSONObject2 = k0Var.f4944d) != null && jSONObject2.getBoolean("success")) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            p30.b.p(((zx.a) it.next()).f48407a);
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
