package of;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.internal.measurement.cg;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.w0;
import kotlin.collections.x0;
import v80.b0;
import v80.f0;
import zendesk.messaging.android.internal.analytics.AnalyticsProcessor;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nf.d f32501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kf.b f32502c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b0 f32503d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v80.x f32504e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final v80.x f32505f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ub.a f32506g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ky.b f32507h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f32508i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final v f32509j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f32510k;
    public double l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f32511m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f32512n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f32513o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Long f32514p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Long f32515q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final x80.i f32516r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final androidx.core.app.n f32517s;

    public l(String str, nf.d dVar, String str2, File file, kf.b bVar, b0 b0Var, v80.x xVar, v80.x xVar2, tf.c cVar, ub.a aVar, ky.b bVar2, boolean z11) {
        dVar.getClass();
        str2.getClass();
        file.getClass();
        bVar.getClass();
        this.f32500a = str;
        this.f32501b = dVar;
        this.f32502c = bVar;
        this.f32503d = b0Var;
        this.f32504e = xVar;
        this.f32505f = xVar2;
        this.f32506g = aVar;
        this.f32507h = bVar2;
        this.f32508i = z11;
        String strValueOf = String.valueOf(System.currentTimeMillis() / 1000.0d);
        this.f32510k = strValueOf;
        double dA = n80.p.a(0.0d, 0.0d, 1.0d);
        this.l = dA;
        this.f32511m = this.f32508i && lx.u.J(strValueOf, dA);
        x70.c cVar2 = null;
        x80.i iVarA = cg.a(Integer.MAX_VALUE, null, null, 6);
        this.f32516r = iVarA;
        this.f32517s = new androidx.core.app.n();
        a aVar2 = cVar != null ? new a(this, 0) : null;
        f0.B(b0Var, null, null, new mn.g(this, cVar2, 11), 3);
        this.f32509j = new v(file, str2, strValueOf, bVar, b0Var, xVar2);
        if (aVar2 != null && cVar != null) {
            ((tf.j) cVar).f(tf.a.DIAGNOSTICS, aVar2);
        }
        iVarA.h(d.f32486a);
        try {
            Runtime.getRuntime().addShutdownHook(new k(new WeakReference(this), 0));
        } catch (Exception unused) {
        }
    }

    public static final void a(l lVar) {
        LinkedHashMap linkedHashMap;
        v vVar = lVar.f32509j;
        androidx.core.app.n nVar = lVar.f32517s;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Long l = lVar.f32515q;
        boolean z11 = l != null && l.longValue() <= jCurrentTimeMillis;
        Long l7 = lVar.f32514p;
        boolean z12 = l7 != null ? l7.longValue() <= jCurrentTimeMillis : false;
        if (z11) {
            lVar.f32515q = null;
            if (lVar.f32511m) {
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) nVar.f2637d;
                kotlin.collections.t tVar = (kotlin.collections.t) nVar.f2639f;
                LinkedHashMap linkedHashMap3 = (LinkedHashMap) nVar.f2638e;
                if (!linkedHashMap2.isEmpty() || !linkedHashMap3.isEmpty() || !tVar.isEmpty()) {
                    LinkedHashMap linkedHashMap4 = (LinkedHashMap) nVar.f2637d;
                    LinkedHashMap linkedHashMap5 = (LinkedHashMap) nVar.f2636c;
                    Map mapK = !linkedHashMap5.isEmpty() ? x0.k(linkedHashMap5) : null;
                    Map mapK2 = !linkedHashMap4.isEmpty() ? x0.k(linkedHashMap4) : null;
                    if (linkedHashMap3.isEmpty()) {
                        linkedHashMap = null;
                    } else {
                        linkedHashMap = new LinkedHashMap(w0.a(linkedHashMap3.size()));
                        for (Map.Entry entry : linkedHashMap3.entrySet()) {
                            Object key = entry.getKey();
                            ((y) entry.getValue()).getClass();
                            linkedHashMap.put(key, new x(0L, 0.0d, 0.0d, 0.0d));
                        }
                    }
                    p pVar = new p(mapK, mapK2, linkedHashMap, !tVar.isEmpty() ? CollectionsKt.r0(tVar) : null);
                    linkedHashMap4.clear();
                    linkedHashMap3.clear();
                    tVar.clear();
                    ((kotlin.collections.t) nVar.f2640g).clear();
                    nVar.f2635b = false;
                    nVar.f2634a = false;
                    vVar.f32538g.h(s.f32530a);
                    f0.B(lVar.f32503d, lVar.f32504e, null, new i(lVar, pVar, lVar.l, null, 0), 2);
                }
            }
        }
        if (z12) {
            lVar.f32514p = null;
            if (lVar.f32511m) {
                boolean z13 = nVar.f2634a;
                kotlin.collections.t tVar2 = (kotlin.collections.t) nVar.f2640g;
                if (z13 || nVar.f2635b || !tVar2.isEmpty()) {
                    p pVar2 = new p(nVar.f2634a ? x0.k((LinkedHashMap) nVar.f2636c) : null, nVar.f2635b ? x0.k((LinkedHashMap) nVar.f2637d) : null, null, !tVar2.isEmpty() ? CollectionsKt.r0(tVar2) : null);
                    tVar2.clear();
                    nVar.f2634a = false;
                    nVar.f2635b = false;
                    vVar.getClass();
                    vVar.f32538g.h(new t(pVar2));
                }
            }
        }
    }

    public static final void b(l lVar, h hVar) {
        x80.i iVar = lVar.f32516r;
        androidx.core.app.n nVar = lVar.f32517s;
        if (hVar instanceof e) {
            e eVar = (e) hVar;
            ((LinkedHashMap) nVar.f2636c).put(eVar.f32487a, eVar.f32488b);
            nVar.f2634a = true;
            lVar.f();
            lVar.e();
            return;
        }
        if (hVar instanceof f) {
            ((LinkedHashMap) nVar.f2636c).putAll(((f) hVar).f32489a);
            nVar.f2634a = true;
            lVar.f();
            lVar.e();
            return;
        }
        if (hVar instanceof c) {
            LinkedHashMap linkedHashMap = (LinkedHashMap) nVar.f2637d;
            c cVar = (c) hVar;
            String str = cVar.f32484a;
            Long l = (Long) linkedHashMap.get(str);
            linkedHashMap.put(str, Long.valueOf((l != null ? l.longValue() : 0L) + cVar.f32485b));
            nVar.f2635b = true;
            lVar.f();
            lVar.e();
            return;
        }
        if (hVar instanceof b) {
            kotlin.collections.t tVar = (kotlin.collections.t) nVar.f2639f;
            if (tVar.f26542c < 10) {
                n nVar2 = ((b) hVar).f32483a;
                tVar.addLast(nVar2);
                ((kotlin.collections.t) nVar.f2640g).addLast(nVar2);
                lVar.f();
                lVar.e();
                return;
            }
            return;
        }
        String str2 = null;
        if (hVar instanceof g) {
            boolean z11 = lVar.f32508i;
            boolean z12 = lVar.f32511m;
            g gVar = (g) hVar;
            Boolean bool = gVar.f32490a;
            lVar.f32508i = bool != null ? bool.booleanValue() : z11;
            Double d3 = gVar.f32491b;
            double dA = d3 != null ? n80.p.a(d3.doubleValue(), 0.0d, 1.0d) : lVar.l;
            lVar.l = dA;
            lVar.f32511m = lVar.f32508i && lx.u.J(lVar.f32510k, dA);
            if (!z11 && lVar.f32508i) {
                lVar.g();
            }
            if (!z12 && lVar.f32511m) {
                lVar.f();
                lVar.e();
                return;
            } else {
                if (!z12 || lVar.f32511m) {
                    return;
                }
                lVar.f32514p = null;
                lVar.f32515q = null;
                return;
            }
        }
        if (hVar instanceof d) {
            lVar.g();
            if (lVar.f32512n) {
                return;
            }
            lVar.f32512n = true;
            if (lVar.f32511m) {
                iVar.h(new c("sampled.in.and.enabled", 1L));
            }
            ky.b bVar = lVar.f32507h;
            Build.MANUFACTURER.getClass();
            Build.MODEL.getClass();
            Build.VERSION.RELEASE.getClass();
            Context context = bVar.f26684a;
            try {
                str2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            } catch (Exception unused) {
            }
            String str3 = Build.MANUFACTURER;
            String str4 = Build.MODEL;
            String str5 = Build.VERSION.RELEASE;
            str3.getClass();
            str4.getClass();
            str5.getClass();
            v70.i iVar2 = new v70.i();
            if (str2 == null) {
                str2 = "";
            }
            iVar2.put("version_name", str2);
            String str6 = Build.MANUFACTURER;
            if (str6 == null) {
                str6 = "";
            }
            iVar2.put("device_manufacturer", str6);
            String str7 = Build.MODEL;
            if (str7 == null) {
                str7 = "";
            }
            iVar2.put("device_model", str7);
            iVar2.put("os_name", AnalyticsProcessor.CHANNEL_NAME);
            String str8 = Build.VERSION.RELEASE;
            iVar2.put("os_version", str8 != null ? str8 : "");
            iVar2.put("platform", AnalyticsProcessor.CHANNEL_NAME);
            iVar2.put("sdk.amplitude-kotlin.version", "0.0.1");
            iVar.h(new f(iVar2.b()));
        }
    }

    public static final Long c(l lVar, long j9) {
        Long l = lVar.f32514p;
        Long lValueOf = l != null ? Long.valueOf(Math.max(0L, l.longValue() - j9)) : null;
        Long l7 = lVar.f32515q;
        Long lValueOf2 = l7 != null ? Long.valueOf(Math.max(0L, l7.longValue() - j9)) : null;
        if (lValueOf == null && lValueOf2 == null) {
            return null;
        }
        return lValueOf == null ? lValueOf2 : lValueOf2 == null ? lValueOf : Long.valueOf(Math.min(lValueOf.longValue(), lValueOf2.longValue()));
    }

    public static final Unit d(l lVar, p pVar, double d3) {
        LinkedHashMap linkedHashMap;
        String strA;
        vf.e eVarG;
        int i11;
        boolean z11;
        double d11;
        double d12;
        kf.b bVar = lVar.f32502c;
        Map map = pVar.f32525a;
        Map map2 = pVar.f32526b;
        Map map3 = pVar.f32527c;
        if (map3 != null) {
            linkedHashMap = new LinkedHashMap(w0.a(map3.size()));
            for (Map.Entry entry : map3.entrySet()) {
                Object key = entry.getKey();
                x xVar = (x) entry.getValue();
                long j9 = xVar.f32543a;
                double d13 = xVar.f32544b;
                double d14 = xVar.f32545c;
                if (j9 > 0) {
                    d11 = d14;
                    d12 = xVar.f32546d / j9;
                } else {
                    d11 = d14;
                    d12 = 0.0d;
                }
                linkedHashMap.put(key, new w(j9, d13, d11, d12));
            }
        } else {
            linkedHashMap = null;
        }
        try {
            strA = new o(map, map2, linkedHashMap, pVar.f32528d).a();
            eVarG = lVar.f32506g.G(new vf.d(lVar.f32501b == nf.d.EU ? "https://diagnostics.prod.eu-central-1.amplitude.com/v1/capture" : "https://diagnostics.prod.us-west-2.amplitude.com/v1/capture", vf.c.POST, x0.e(new Pair("X-ApiKey", lVar.f32500a), new Pair("X-Client-Sample-Rate", String.valueOf(d3))), strA, false, 112));
            i11 = eVarG.f42311a;
            z11 = false;
            if (200 <= i11 && i11 < 300) {
                z11 = true;
            }
        } catch (Exception e5) {
            bVar.a("DiagnosticsClient: Failed to upload diagnostics: " + e5.getMessage());
        }
        if (z11) {
            bVar.b("DiagnosticsClient: Uploaded diagnostics : " + strA);
            return Unit.f26487a;
        }
        String str = eVarG.f42312b;
        if (str == null || str.length() == 0) {
            bVar.a("DiagnosticsClient: Failed to upload diagnostics: " + i11);
        } else {
            bVar.a("DiagnosticsClient: Failed to upload diagnostics: " + i11 + ": " + str);
        }
        return Unit.f26487a;
    }

    public final void e() {
        if (this.f32511m && this.f32515q == null) {
            this.f32515q = Long.valueOf(System.currentTimeMillis() + 300000);
        }
    }

    public final void f() {
        if (this.f32511m && this.f32514p == null) {
            this.f32514p = Long.valueOf(System.currentTimeMillis() + 1000);
        }
    }

    public final void g() {
        if (!this.f32508i || this.f32513o) {
            return;
        }
        this.f32513o = true;
        f0.B(this.f32503d, this.f32505f, null, new j(this, this.l, (x70.c) null), 2);
    }

    public final void h(String str, String str2) {
        str2.getClass();
        this.f32516r.h(new e(str, str2));
    }
}
