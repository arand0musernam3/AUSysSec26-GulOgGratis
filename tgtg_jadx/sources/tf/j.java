package tf;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.collections.i0;
import kotlin.collections.o0;
import kotlin.collections.x0;
import kotlin.text.StringsKt;
import org.json.JSONObject;
import q1.h1;
import v80.b0;
import v80.f0;
import v80.x;
import zendesk.messaging.android.internal.analytics.AnalyticsProcessor;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nf.d f40133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b0 f40134c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x f40135d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x f40136e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final hf.g f40137f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ub.a f40138g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final kf.b f40139h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ConcurrentHashMap f40140i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f40141j;

    public j(String str, nf.d dVar, b0 b0Var, x xVar, x xVar2, hf.g gVar, ub.a aVar, kf.b bVar) {
        dVar.getClass();
        gVar.getClass();
        bVar.getClass();
        this.f40132a = str;
        this.f40133b = dVar;
        this.f40134c = b0Var;
        this.f40135d = xVar;
        this.f40136e = xVar2;
        this.f40137f = gVar;
        this.f40138g = aVar;
        this.f40139h = bVar;
        this.f40140i = new ConcurrentHashMap();
    }

    public static final v70.i a(j jVar) {
        v70.i iVarB;
        v70.i iVar;
        JSONObject jSONObjectOptJSONObject;
        String str = jVar.f40132a;
        kf.b bVar = jVar.f40139h;
        jVar.c();
        String str2 = f.$EnumSwitchMapping$0[jVar.f40133b.ordinal()] == 1 ? "https://sr-client-cfg.eu.amplitude.com" : "https://sr-client-cfg.amplitude.com";
        vf.e eVarG = jVar.f40138g.G(new vf.d(str2 + "/config?api_key=" + str + '&' + CollectionsKt.U(a.a(), "&", null, null, g.f40123b, 30), vf.c.GET, x0.e(new Pair("Authorization", "Bearer ".concat(str)), new Pair("X-Client-Platform", AnalyticsProcessor.CHANNEL_NAME), new Pair("X-Client-Version", String.valueOf(2)), new Pair("X-Client-Library", "amplitude-kotlin/0.0.1")), null, false, 120));
        String str3 = eVarG.f42314d;
        int i11 = eVarG.f42311a;
        if (200 > i11 || i11 >= 300) {
            if (400 > i11 || i11 >= 500) {
                bVar.d("Failed to fetch remote config: " + i11 + ": " + str3);
                return null;
            }
            bVar.a("Client error on fetch remote config: " + i11 + ": " + str3);
            return null;
        }
        String str4 = eVarG.f42312b;
        if (str4 != null) {
            try {
                JSONObject jSONObject = new JSONObject(str4);
                iVar = new v70.i();
                jSONObjectOptJSONObject = jSONObject.optJSONObject("configs");
            } catch (Exception e5) {
                bVar.a("Failed to parse configs from response: " + e5.getMessage());
                iVarB = null;
            }
            if (jSONObjectOptJSONObject == null) {
                bVar.d("No 'configs' key found in response");
                return null;
            }
            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
            itKeys.getClass();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject(next);
                if (jSONObjectOptJSONObject2 != null) {
                    Iterator<String> itKeys2 = jSONObjectOptJSONObject2.keys();
                    itKeys2.getClass();
                    while (itKeys2.hasNext()) {
                        String next2 = itKeys2.next();
                        String str5 = next + '.' + next2;
                        JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject(next2);
                        if (jSONObjectOptJSONObject3 != null) {
                            iVar.put(str5, d(ex.i.P(jSONObjectOptJSONObject3)));
                            bVar.b("Successfully parsed config: " + str5);
                        } else {
                            bVar.b("Config " + str5 + " has no nested object, using empty map");
                            o0 o0Var = o0.f26530a;
                            o0Var.getClass();
                            iVar.put(str5, o0Var);
                        }
                    }
                } else {
                    bVar.b("Skipping non-object top-level key: " + next);
                }
            }
            iVarB = iVar.b();
            if (!iVarB.isEmpty()) {
                r3.i iVar2 = (r3.i) iVarB.values();
                if (!((v70.i) iVar2.f37597b).isEmpty()) {
                    Object it = iVar2.iterator();
                    while (((h7.o0) it).hasNext()) {
                        if (!((Map) ((v70.g) it).next()).isEmpty()) {
                            bVar.b("Successfully parsed " + iVarB.f42051i + " config entries");
                            if (iVarB != null) {
                                return iVarB;
                            }
                        }
                    }
                }
            }
            bVar.d("No valid configs found in response");
            return null;
        }
        bVar.d("Response body is null, returning null config map");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(tf.j r6, z70.c r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof tf.h
            if (r0 == 0) goto L13
            r0 = r7
            tf.h r0 = (tf.h) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            tf.h r0 = new tf.h
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f40126j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            ba0.g.M(r7)
            goto L44
        L27:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r6)
            r6 = 0
            return r6
        L2e:
            ba0.g.M(r7)
            v80.x r7 = r6.f40136e
            a3.y r2 = new a3.y
            r4 = 0
            r5 = 26
            r2.<init>(r6, r4, r5)
            r0.l = r3
            java.lang.Object r7 = v80.f0.K(r7, r2, r0)
            if (r7 != r1) goto L44
            return r1
        L44:
            java.lang.String r7 = (java.lang.String) r7
            r0 = 0
            if (r7 == 0) goto L55
            java.lang.Long r6 = kotlin.text.StringsKt.d0(r7)
            if (r6 == 0) goto L55
            long r6 = r6.longValue()
            goto L56
        L55:
            r6 = r0
        L56:
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 > 0) goto L5d
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        L5d:
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r6
            r6 = 300000(0x493e0, double:1.482197E-318)
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 >= 0) goto L6a
            goto L6b
        L6a:
            r3 = 0
        L6b:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: tf.j.b(tf.j, z70.c):java.lang.Object");
    }

    public static LinkedHashMap d(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getValue() != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public final void c() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ConcurrentHashMap concurrentHashMap = this.f40140i;
        int size = 0;
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            String str = (String) entry.getKey();
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) entry.getValue();
            int size2 = copyOnWriteArrayList.size();
            i0.v(copyOnWriteArrayList, g.f40124c);
            size += size2 - copyOnWriteArrayList.size();
            if (copyOnWriteArrayList.isEmpty()) {
                linkedHashSet.add(str);
            }
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            concurrentHashMap.remove((String) it.next());
        }
        if (size > 0) {
            StringBuilder sbK = org.bouncycastle.jcajce.provider.asymmetric.a.k(size, "Removed ", " dead references and ");
            sbK.append(linkedHashSet.size());
            sbK.append(" empty lists");
            this.f40139h.b(sbK.toString());
        }
    }

    public final Map e() {
        kf.b bVar = this.f40139h;
        try {
            String strA = this.f40137f.a(nf.e.REMOTE_CONFIG);
            if (strA != null && !StringsKt.H(strA)) {
                LinkedHashMap linkedHashMapP = ex.i.P(new JSONObject(strA));
                v70.i iVar = new v70.i();
                for (Map.Entry entry : linkedHashMapP.entrySet()) {
                    String str = (String) entry.getKey();
                    Object value = entry.getValue();
                    if (value instanceof Map) {
                        LinkedHashMap linkedHashMapD = d((Map) value);
                        if (!linkedHashMapD.isEmpty()) {
                            iVar.put(str, linkedHashMapD);
                            bVar.b("Successfully loaded stored config for key: " + str);
                        }
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Skipping non-map value for key ");
                        sb2.append(str);
                        sb2.append(": ");
                        sb2.append(value != null ? value.getClass().getSimpleName() : null);
                        bVar.b(sb2.toString());
                    }
                }
                v70.i iVarB = iVar.b();
                bVar.b("Successfully loaded " + iVarB.f42051i + " stored configs from storage");
                return iVarB;
            }
            bVar.b("No stored config found in storage");
            o0 o0Var = o0.f26530a;
            o0Var.getClass();
            return o0Var;
        } catch (Exception e5) {
            bVar.a("Failed to parse all stored configs: " + e5.getMessage());
            o0 o0Var2 = o0.f26530a;
            o0Var2.getClass();
            return o0Var2;
        }
    }

    public final void f(a aVar, of.a aVar2) {
        d dVar;
        Map mapE;
        Long lD0;
        Object objPutIfAbsent;
        b0 b0Var = this.f40134c;
        aVar.getClass();
        c();
        String strC = aVar.c();
        ConcurrentHashMap concurrentHashMap = this.f40140i;
        Object copyOnWriteArrayList = concurrentHashMap.get(strC);
        if (copyOnWriteArrayList == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(strC, (copyOnWriteArrayList = new CopyOnWriteArrayList()))) != null) {
            copyOnWriteArrayList = objPutIfAbsent;
        }
        CopyOnWriteArrayList copyOnWriteArrayList2 = (CopyOnWriteArrayList) copyOnWriteArrayList;
        e eVar = new e(this, aVar2);
        copyOnWriteArrayList2.add(eVar);
        concurrentHashMap.put(aVar.c(), copyOnWriteArrayList2);
        StringBuilder sb2 = new StringBuilder("Added subscriber for key: ");
        sb2.append(aVar.c());
        sb2.append(". Total subscribers: ");
        CopyOnWriteArrayList copyOnWriteArrayList3 = (CopyOnWriteArrayList) concurrentHashMap.get(aVar.c());
        x70.c cVar = null;
        sb2.append(copyOnWriteArrayList3 != null ? Integer.valueOf(copyOnWriteArrayList3.size()) : null);
        String string = sb2.toString();
        kf.b bVar = this.f40139h;
        bVar.b(string);
        String strC2 = aVar.c();
        try {
            mapE = e();
        } catch (Exception e5) {
            StringBuilder sbS = e0.f.s("Failed to retrieve stored config data for ", strC2, ": ");
            sbS.append(e5.getMessage());
            bVar.a(sbS.toString());
        }
        if (mapE.isEmpty()) {
            dVar = null;
        } else {
            a80.a aVarA = a.a();
            ArrayList arrayList = new ArrayList(e0.o(aVarA, 10));
            Iterator<E> it = aVarA.iterator();
            while (it.hasNext()) {
                arrayList.add(((a) it.next()).c());
            }
            Set setV0 = CollectionsKt.v0(arrayList);
            Set setKeySet = mapE.keySet();
            if (!setKeySet.containsAll(setV0)) {
                bVar.b("Storage inconsistent keys. Expected: " + setV0 + ", Found: " + setKeySet);
                Set set = setKeySet;
                if (!(set instanceof Collection) || !set.isEmpty()) {
                    Iterator it2 = set.iterator();
                    while (it2.hasNext()) {
                        if (setV0.contains((String) it2.next())) {
                        }
                    }
                }
                f0.B(b0Var, this.f40136e, null, new sf.a(this, cVar, 3), 2);
                dVar = null;
            }
            Map map = (Map) mapE.get(strC2);
            if (map == null) {
                map = o0.f26530a;
                map.getClass();
            }
            String strA = this.f40137f.a(nf.e.REMOTE_CONFIG_TIMESTAMP);
            long jLongValue = (strA == null || (lD0 = StringsKt.d0(strA)) == null) ? 0L : lD0.longValue();
            bVar.b("Retrieved stored config for " + strC2 + " with " + map.size() + " properties");
            dVar = new d(map, jLongValue);
        }
        if (dVar != null) {
            eVar.a(new h1(dVar, 6));
        }
        f0.B(b0Var, this.f40135d, null, new i(this, null), 2);
    }
}
