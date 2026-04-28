package lx;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;
import ax.a0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f28339a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Boolean f28340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Boolean f28341c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static b f28342d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static c f28343e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Intent f28344f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Object f28345g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static s f28346h;

    public static final void a(Context context, ArrayList arrayList, boolean z11) {
        if (arrayList.isEmpty()) {
            return;
        }
        HashMap map = new HashMap();
        ArrayList<String> arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                String string = new JSONObject(str).getString("productId");
                string.getClass();
                str.getClass();
                map.put(string, str);
                arrayList2.add(string);
            } catch (JSONException e5) {
                Log.e("lx.d", "Error parsing in-app purchase data.", e5);
            }
        }
        Object obj = f28345g;
        n nVar = n.f28403a;
        LinkedHashMap linkedHashMap = null;
        if (!yx.a.f46339a.contains(n.class)) {
            try {
                context.getClass();
                LinkedHashMap linkedHashMapJ = nVar.j(arrayList2);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : arrayList2) {
                    if (!linkedHashMapJ.containsKey(str2)) {
                        arrayList3.add(str2);
                    }
                }
                linkedHashMapJ.putAll(nVar.g(context, arrayList3, obj, z11));
                linkedHashMap = linkedHashMapJ;
            } catch (Throwable th2) {
                yx.a.a(n.class, th2);
            }
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str3 = (String) entry.getKey();
            String str4 = (String) entry.getValue();
            String str5 = (String) map.get(str3);
            if (str5 != null) {
                nx.j.d(str5, str4, z11, f28346h, false);
            }
        }
    }

    public static final void b(s sVar) {
        sVar.getClass();
        if (f28340b == null) {
            Boolean boolValueOf = Boolean.valueOf(u.E("com.android.vending.billing.IInAppBillingService$Stub") != null);
            f28340b = boolValueOf;
            if (!Intrinsics.areEqual(boolValueOf, Boolean.FALSE)) {
                f28341c = Boolean.valueOf(u.E("com.android.billingclient.api.ProxyBillingActivity") != null);
                n nVar = n.f28403a;
                if (!yx.a.f46339a.contains(n.class)) {
                    try {
                        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
                        SharedPreferences sharedPreferences = n.f28407e;
                        long j9 = sharedPreferences.getLong("LAST_CLEARED_TIME", 0L);
                        if (j9 == 0) {
                            sharedPreferences.edit().putLong("LAST_CLEARED_TIME", jCurrentTimeMillis).apply();
                        } else if (jCurrentTimeMillis - j9 > 604800) {
                            sharedPreferences.edit().clear().putLong("LAST_CLEARED_TIME", jCurrentTimeMillis).apply();
                        }
                    } catch (Throwable th2) {
                        yx.a.a(n.class, th2);
                    }
                }
                Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND").setPackage("com.android.vending");
                intent.getClass();
                f28344f = intent;
                f28342d = new b();
                f28343e = new c();
            }
        }
        if (!Intrinsics.areEqual(f28340b, Boolean.FALSE) && nx.j.c()) {
            f28346h = sVar;
            if (f28339a.compareAndSet(false, true)) {
                Context contextA = a0.a();
                if (contextA instanceof Application) {
                    Application application = (Application) contextA;
                    c cVar = f28343e;
                    b bVar = null;
                    if (cVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("callbacks");
                        cVar = null;
                    }
                    application.registerActivityLifecycleCallbacks(cVar);
                    Intent intent2 = f28344f;
                    if (intent2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("intent");
                        intent2 = null;
                    }
                    b bVar2 = f28342d;
                    if (bVar2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("serviceConnection");
                    } else {
                        bVar = bVar2;
                    }
                    contextA.bindService(intent2, bVar, 1);
                }
            }
        }
    }
}
