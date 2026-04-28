package dx;

import android.content.SharedPreferences;
import ax.a0;
import ax.c0;
import ax.k0;
import ax.m0;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tx.f0;
import tx.n0;
import zendesk.faye.internal.Bayeux;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15187a;

    public /* synthetic */ e(int i11) {
        this.f15187a = i11;
    }

    @Override // ax.c0
    public final void a(k0 k0Var) {
        switch (this.f15187a) {
            case 0:
                k0Var.getClass();
                ax.w wVar = k0Var.f4943c;
                boolean zBooleanValue = false;
                Object obj = null;
                linkedHashMap = null;
                linkedHashMap = null;
                linkedHashMap = null;
                linkedHashMap = null;
                linkedHashMap = null;
                linkedHashMap = null;
                linkedHashMap = null;
                linkedHashMap = null;
                LinkedHashMap linkedHashMap = null;
                if (wVar != null) {
                    l50.a aVar = f0.f40508d;
                    l50.a.A(m0.APP_EVENTS, "dx.f", " \n\nGraph Response Error: \n================\nResponse Error: %s\nResponse Error Exception: %s\n\n ", wVar.toString(), String.valueOf(wVar.f5026i));
                    if (!yx.a.f46339a.contains(f.class)) {
                        try {
                            SharedPreferences sharedPreferences = a0.a().getSharedPreferences("com.facebook.sdk.CloudBridgeSavedCredentials", 0);
                            if (sharedPreferences != null) {
                                y yVar = y.DATASETID;
                                String string = sharedPreferences.getString(yVar.a(), null);
                                y yVar2 = y.URL;
                                String string2 = sharedPreferences.getString(yVar2.a(), null);
                                y yVar3 = y.ACCESSKEY;
                                String string3 = sharedPreferences.getString(yVar3.a(), null);
                                if (string != null && !StringsKt.H(string) && string2 != null && !StringsKt.H(string2) && string3 != null && !StringsKt.H(string3)) {
                                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                    linkedHashMap2.put(yVar2.a(), string2);
                                    linkedHashMap2.put(yVar.a(), string);
                                    linkedHashMap2.put(yVar3.a(), string3);
                                    linkedHashMap = linkedHashMap2;
                                }
                            }
                        } catch (Throwable th2) {
                            yx.a.a(f.class, th2);
                        }
                    }
                    if (linkedHashMap != null) {
                        URL url = new URL(String.valueOf(linkedHashMap.get(y.URL.a())));
                        q.f15213c = new o(String.valueOf(linkedHashMap.get(y.DATASETID.a())), url.getProtocol() + "://" + url.getHost(), String.valueOf(linkedHashMap.get(y.ACCESSKEY.a())));
                        q.f15214d = new ArrayList();
                        f.f15188a = true;
                    }
                } else {
                    l50.a aVar2 = f0.f40508d;
                    m0 m0Var = m0.APP_EVENTS;
                    l50.a.A(m0Var, "dx.f", " \n\nGraph Response Received: \n================\n%s\n\n ", k0Var);
                    JSONObject jSONObject = k0Var.f4942b;
                    if (jSONObject != null) {
                        try {
                            obj = jSONObject.get(Bayeux.KEY_DATA);
                        } catch (NullPointerException e5) {
                            l50.a aVar3 = f0.f40508d;
                            l50.a.A(m0.APP_EVENTS, "dx.f", "CloudBridge Settings API response is not a valid json: \n%s ", u70.e.b(e5));
                            return;
                        } catch (JSONException e11) {
                            l50.a aVar4 = f0.f40508d;
                            l50.a.A(m0.APP_EVENTS, "dx.f", "CloudBridge Settings API response is not a valid json: \n%s ", u70.e.b(e11));
                            return;
                        }
                    }
                    obj.getClass();
                    HashMap mapG = n0.g(new JSONObject((String) CollectionsKt.firstOrNull(n0.f((JSONArray) obj))));
                    String str = (String) mapG.get(y.URL.a());
                    String str2 = (String) mapG.get(y.DATASETID.a());
                    String str3 = (String) mapG.get(y.ACCESSKEY.a());
                    if (str == null || str2 == null || str3 == null) {
                        l50.a.z(m0Var, "dx.f", "CloudBridge Settings API response doesn't have valid data");
                    } else {
                        try {
                            q.f15213c = new o(str2, str, str3);
                            q.f15214d = new ArrayList();
                            f.y(mapG);
                            y yVar4 = y.ENABLED;
                            if (mapG.get(yVar4.a()) != null) {
                                Object obj2 = mapG.get(yVar4.a());
                                obj2.getClass();
                                zBooleanValue = ((Boolean) obj2).booleanValue();
                            }
                            f.f15188a = zBooleanValue;
                        } catch (MalformedURLException e12) {
                            l50.a aVar5 = f0.f40508d;
                            l50.a.A(m0.APP_EVENTS, "dx.f", "CloudBridge Settings API response doesn't have valid url\n %s ", u70.e.b(e12));
                            return;
                        }
                    }
                }
                break;
            default:
                k0Var.getClass();
                l50.a aVar6 = f0.f40508d;
                l50.a.z(m0.APP_EVENTS, ex.j.a(), "App index sent to FB!");
                break;
        }
    }
}
