package y00;

import android.app.Application;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import zendesk.messaging.android.internal.conversationscreen.ConversationTypingEvents;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class t2 extends i0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.google.firebase.messaging.j f45149d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ub.a f45150e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CopyOnWriteArraySet f45151f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f45152g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicReference f45153h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f45154i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f45155j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f45156k;
    public g2 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public g2 f45157m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public PriorityQueue f45158n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public b2 f45159o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final AtomicLong f45160p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f45161q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final m1 f45162r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f45163s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public g2 f45164t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public s2 f45165u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public g2 f45166v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final u6.f f45167w;

    public t2(n1 n1Var) {
        super(n1Var);
        this.f45151f = new CopyOnWriteArraySet();
        this.f45154i = new Object();
        this.f45155j = false;
        this.f45156k = 1;
        this.f45163s = true;
        this.f45167w = new u6.f(this);
        this.f45153h = new AtomicReference();
        this.f45159o = b2.f44615c;
        this.f45161q = -1L;
        this.f45160p = new AtomicLong(0L);
        this.f45162r = new m1(n1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A(long r20, java.lang.Object r22, java.lang.String r23, java.lang.String r24) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y00.t2.A(long, java.lang.Object, java.lang.String, java.lang.String):void");
    }

    public final void B() {
        p();
        q();
        n1 n1Var = (n1) this.f21216b;
        if (n1Var.h()) {
            g gVar = n1Var.f44985d;
            ((n1) gVar.f21216b).getClass();
            Boolean boolC = gVar.C("google_analytics_deferred_deep_link_enabled");
            if (boolC != null && boolC.booleanValue()) {
                w0 w0Var = n1Var.f44987f;
                n1.m(w0Var);
                w0Var.f45266n.a("Deferred Deep Link feature enabled.");
                l1 l1Var = n1Var.f44988g;
                n1.m(l1Var);
                l1Var.y(new f2(this, 2));
            }
            m3 m3VarP = n1Var.p();
            m3VarP.p();
            m3VarP.q();
            t4 t4VarF = m3VarP.F(true);
            m3VarP.B();
            n1 n1Var2 = (n1) m3VarP.f21216b;
            n1Var2.f44985d.A(null, g0.W0);
            n1Var2.o().w(3, new byte[0]);
            m3VarP.D(new i3(m3VarP, t4VarF, 0));
            this.f45163s = false;
            e1 e1Var = n1Var.f44986e;
            n1.k(e1Var);
            e1Var.p();
            String string = e1Var.t().getString("previous_os_version", null);
            ((n1) e1Var.f21216b).q().r();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor editorEdit = e1Var.t().edit();
                editorEdit.putString("previous_os_version", str);
                editorEdit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            n1Var.q().r();
            if (string.equals(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            w("auto", "_ou", bundle);
        }
    }

    public final void C(Bundle bundle, long j9) {
        n1 n1Var = (n1) this.f21216b;
        com.google.android.gms.common.internal.i0.h(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            w0 w0Var = n1Var.f44987f;
            n1.m(w0Var);
            w0Var.f45263j.a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        c2.e(bundle2, "app_id", String.class, null);
        c2.e(bundle2, "origin", String.class, null);
        c2.e(bundle2, "name", String.class, null);
        c2.e(bundle2, "value", Object.class, null);
        c2.e(bundle2, "trigger_event_name", String.class, null);
        c2.e(bundle2, "trigger_timeout", Long.class, 0L);
        c2.e(bundle2, "timed_out_event_name", String.class, null);
        c2.e(bundle2, "timed_out_event_params", Bundle.class, null);
        c2.e(bundle2, "triggered_event_name", String.class, null);
        c2.e(bundle2, "triggered_event_params", Bundle.class, null);
        c2.e(bundle2, "time_to_live", Long.class, 0L);
        c2.e(bundle2, "expired_event_name", String.class, null);
        c2.e(bundle2, "expired_event_params", Bundle.class, null);
        com.google.android.gms.common.internal.i0.e(bundle2.getString("name"));
        com.google.android.gms.common.internal.i0.e(bundle2.getString("origin"));
        com.google.android.gms.common.internal.i0.h(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j9);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        r4 r4Var = n1Var.f44990i;
        r0 r0Var = n1Var.f44991j;
        w0 w0Var2 = n1Var.f44987f;
        n1.k(r4Var);
        if (r4Var.z0(string) != 0) {
            n1.m(w0Var2);
            w0Var2.f45260g.b(r0Var.c(string), "Invalid conditional user property name");
            return;
        }
        n1.k(r4Var);
        if (r4Var.E(obj, string) != 0) {
            n1.m(w0Var2);
            w0Var2.f45260g.c("Invalid conditional user property value", r0Var.c(string), obj);
            return;
        }
        Object objF = r4Var.F(obj, string);
        if (objF == null) {
            n1.m(w0Var2);
            w0Var2.f45260g.c("Unable to normalize conditional user property value", r0Var.c(string), obj);
            return;
        }
        c2.c(bundle2, objF);
        long j11 = bundle2.getLong("trigger_timeout");
        if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name")) && (j11 > 15552000000L || j11 < 1)) {
            n1.m(w0Var2);
            w0Var2.f45260g.c("Invalid conditional user property timeout", r0Var.c(string), Long.valueOf(j11));
            return;
        }
        long j12 = bundle2.getLong("time_to_live");
        if (j12 > 15552000000L || j12 < 1) {
            n1.m(w0Var2);
            w0Var2.f45260g.c("Invalid conditional user property time to live", r0Var.c(string), Long.valueOf(j12));
        } else {
            l1 l1Var = n1Var.f44988g;
            n1.m(l1Var);
            l1Var.y(new o30.m0(this, bundle2, false, 20));
        }
    }

    public final void D(String str, String str2, Bundle bundle) {
        n1 n1Var = (n1) this.f21216b;
        n1Var.f44992k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        com.google.android.gms.common.internal.i0.e(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", jCurrentTimeMillis);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        l1 l1Var = n1Var.f44988g;
        n1.m(l1Var);
        l1Var.y(new m2(this, bundle2, 0));
    }

    public final String E() {
        n1 n1Var = (n1) this.f21216b;
        try {
            return c2.b(n1Var.f44982a, n1Var.f44996p);
        } catch (IllegalStateException e5) {
            w0 w0Var = n1Var.f44987f;
            n1.m(w0Var);
            w0Var.f45260g.b(e5, "getGoogleAppId failed with exception");
            return null;
        }
    }

    public final void F(b2 b2Var, long j9, boolean z11) {
        int i11 = b2Var.f44617b;
        p();
        q();
        n1 n1Var = (n1) this.f21216b;
        e1 e1Var = n1Var.f44986e;
        w0 w0Var = n1Var.f44987f;
        n1.k(e1Var);
        b2 b2VarW = e1Var.w();
        if (j9 <= this.f45161q && b2.l(b2VarW.f44617b, i11)) {
            n1.m(w0Var);
            w0Var.f45265m.b(b2Var, "Dropped out-of-date consent setting, proposed settings");
            return;
        }
        e1 e1Var2 = n1Var.f44986e;
        n1.k(e1Var2);
        e1Var2.p();
        if (!b2.l(i11, e1Var2.t().getInt("consent_source", 100))) {
            n1.m(w0Var);
            w0Var.f45265m.b(Integer.valueOf(i11), "Lower precedence consent source ignored, proposed source");
            return;
        }
        SharedPreferences.Editor editorEdit = e1Var2.t().edit();
        editorEdit.putString("consent_settings", b2Var.g());
        editorEdit.putInt("consent_source", i11);
        editorEdit.apply();
        n1.m(w0Var);
        w0Var.f45267o.b(b2Var, "Setting storage consent(FE)");
        this.f45161q = j9;
        if (n1Var.p().z()) {
            m3 m3VarP = n1Var.p();
            m3VarP.p();
            m3VarP.q();
            m3VarP.D(new k3(m3VarP, 2));
        } else {
            m3 m3VarP2 = n1Var.p();
            m3VarP2.p();
            m3VarP2.q();
            if (m3VarP2.y()) {
                m3VarP2.D(new i3(m3VarP2, m3VarP2.F(false), 1));
            }
        }
        if (z11) {
            n1Var.p().t(new AtomicReference());
        }
    }

    public final void G(Boolean bool, boolean z11) {
        p();
        q();
        n1 n1Var = (n1) this.f21216b;
        w0 w0Var = n1Var.f44987f;
        n1.m(w0Var);
        w0Var.f45266n.b(bool, "Setting app measurement enabled (FE)");
        e1 e1Var = n1Var.f44986e;
        n1.k(e1Var);
        e1Var.p();
        SharedPreferences.Editor editorEdit = e1Var.t().edit();
        if (bool != null) {
            editorEdit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            editorEdit.remove("measurement_enabled");
        }
        editorEdit.apply();
        if (z11) {
            e1Var.p();
            SharedPreferences.Editor editorEdit2 = e1Var.t().edit();
            if (bool != null) {
                editorEdit2.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                editorEdit2.remove("measurement_enabled_from_api");
            }
            editorEdit2.apply();
        }
        l1 l1Var = n1Var.f44988g;
        n1.m(l1Var);
        l1Var.p();
        if (n1Var.f45006z || !(bool == null || bool.booleanValue())) {
            H();
        }
    }

    public final void H() {
        p();
        n1 n1Var = (n1) this.f21216b;
        e1 e1Var = n1Var.f44986e;
        w0 w0Var = n1Var.f44987f;
        vz.b bVar = n1Var.f44992k;
        n1.k(e1Var);
        String strI = e1Var.f44717n.i();
        if (strI != null) {
            if ("unset".equals(strI)) {
                bVar.getClass();
                A(System.currentTimeMillis(), null, "app", "_npa");
            } else {
                Long lValueOf = Long.valueOf(true != "true".equals(strI) ? 0L : 1L);
                bVar.getClass();
                A(System.currentTimeMillis(), lValueOf, "app", "_npa");
            }
        }
        if (!n1Var.e() || !this.f45163s) {
            n1.m(w0Var);
            w0Var.f45266n.a("Updating Scion state (FE)");
            m3 m3VarP = n1Var.p();
            m3VarP.p();
            m3VarP.q();
            m3VarP.D(new h3(m3VarP, m3VarP.F(true), 2));
            return;
        }
        n1.m(w0Var);
        w0Var.f45266n.a("Recording app launch after enabling measurement for the first time (FE)");
        B();
        u3 u3Var = n1Var.f44989h;
        n1.l(u3Var);
        u3Var.f45212f.r();
        l1 l1Var = n1Var.f44988g;
        n1.m(l1Var);
        l1Var.y(new f2(this, 1));
    }

    public final void I() {
        n1 n1Var = (n1) this.f21216b;
        if (!(n1Var.f44982a.getApplicationContext() instanceof Application) || this.f45149d == null) {
            return;
        }
        ((Application) n1Var.f44982a.getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f45149d);
    }

    public final void J(Bundle bundle, int i11, long j9) throws Throwable {
        Object obj;
        String string;
        n1 n1Var = (n1) this.f21216b;
        q();
        b2 b2Var = b2.f44615c;
        a2[] a2VarArrC = z1.STORAGE.c();
        int length = a2VarArrC.length;
        int i12 = 0;
        while (true) {
            obj = null;
            if (i12 >= length) {
                break;
            }
            String str = a2VarArrC[i12].zze;
            if (bundle.containsKey(str) && (string = bundle.getString(str)) != null) {
                if (string.equals("granted")) {
                    obj = Boolean.TRUE;
                } else if (string.equals("denied")) {
                    obj = Boolean.FALSE;
                }
                if (obj == null) {
                    obj = string;
                    break;
                }
            }
            i12++;
        }
        if (obj != null) {
            w0 w0Var = n1Var.f44987f;
            n1.m(w0Var);
            w0Var.l.b(obj, "Ignoring invalid consent setting");
            w0 w0Var2 = n1Var.f44987f;
            n1.m(w0Var2);
            w0Var2.l.a("Valid consent values are 'granted', 'denied'");
        }
        l1 l1Var = n1Var.f44988g;
        n1.m(l1Var);
        boolean zV = l1Var.v();
        b2 b2VarB = b2.b(i11, bundle);
        Iterator it = b2VarB.f44616a.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (((y1) it.next()) != y1.UNINITIALIZED) {
                L(b2VarB, zV);
                break;
            }
        }
        o oVarC = o.c(i11, bundle);
        Iterator it2 = oVarC.f45020e.values().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            } else if (((y1) it2.next()) != y1.UNINITIALIZED) {
                K(oVarC, zV);
                break;
            }
        }
        Boolean boolD = o.d(bundle);
        if (boolD != null) {
            String str2 = i11 == -30 ? "tcf" : "app";
            if (zV) {
                A(j9, boolD.toString(), str2, "allow_personalized_ads");
            } else {
                z(str2, "allow_personalized_ads", boolD.toString(), false, j9);
            }
        }
    }

    public final void K(o oVar, boolean z11) throws Throwable {
        o30.m0 m0Var = new o30.m0(this, oVar, false, 22);
        if (z11) {
            p();
            m0Var.run();
        } else {
            l1 l1Var = ((n1) this.f21216b).f44988g;
            n1.m(l1Var);
            l1Var.y(m0Var);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:69:0x0115
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public final void L(y00.b2 r14, boolean r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y00.t2.L(y00.b2, boolean):void");
    }

    public final void M() {
        com.google.android.gms.internal.measurement.f4.a();
        n1 n1Var = (n1) this.f21216b;
        g gVar = n1Var.f44985d;
        l1 l1Var = n1Var.f44988g;
        w0 w0Var = n1Var.f44987f;
        if (gVar.A(null, g0.P0)) {
            n1.m(l1Var);
            if (l1Var.v()) {
                n1.m(w0Var);
                w0Var.f45260g.a("Cannot get trigger URIs from analytics worker thread");
                return;
            }
            if (ky.p.v()) {
                n1.m(w0Var);
                w0Var.f45260g.a("Cannot get trigger URIs from main thread");
                return;
            }
            q();
            n1.m(w0Var);
            w0Var.f45267o.a("Getting trigger URIs (FE)");
            AtomicReference atomicReference = new AtomicReference();
            n1.m(l1Var);
            l1Var.z(atomicReference, ConversationTypingEvents.TIME_INTERVAL_IN_MILLIS, "get trigger URIs", new n2(this, atomicReference, 2));
            final List list = (List) atomicReference.get();
            if (list == null) {
                n1.m(w0Var);
                w0Var.f45262i.a("Timed out waiting for get trigger URIs");
            } else {
                n1.m(l1Var);
                l1Var.y(new Runnable() { // from class: y00.p2
                    @Override // java.lang.Runnable
                    public final void run() {
                        t2 t2Var = this.f45066a;
                        t2Var.p();
                        if (Build.VERSION.SDK_INT < 30) {
                            return;
                        }
                        e1 e1Var = ((n1) t2Var.f21216b).f44986e;
                        n1.k(e1Var);
                        SparseArray sparseArrayV = e1Var.v();
                        for (y3 y3Var : list) {
                            int i11 = y3Var.f45328c;
                            if (!sparseArrayV.contains(i11) || ((Long) sparseArrayV.get(i11)).longValue() < y3Var.f45327b) {
                                t2Var.N().add(y3Var);
                            }
                        }
                        t2Var.O();
                    }
                });
            }
        }
    }

    public final PriorityQueue N() {
        if (this.f45158n == null) {
            this.f45158n = new PriorityQueue(Comparator.comparing(q2.f45086a, r2.f45112b));
        }
        return this.f45158n;
    }

    public final void O() {
        y3 y3Var;
        p();
        if (N().isEmpty() || this.f45155j || (y3Var = (y3) N().poll()) == null) {
            return;
        }
        n1 n1Var = (n1) this.f21216b;
        r4 r4Var = n1Var.f44990i;
        n1.k(r4Var);
        u9.a aVarL = r4Var.L();
        if (aVarL != null) {
            this.f45155j = true;
            w0 w0Var = n1Var.f44987f;
            n1.m(w0Var);
            u0 u0Var = w0Var.f45267o;
            String str = y3Var.f45326a;
            u0Var.b(str, "Registering trigger URI");
            ListenableFuture listenableFutureE = aVarL.e(Uri.parse(str));
            if (listenableFutureE != null) {
                listenableFutureE.a(new o30.m0(0, listenableFutureE, new ub.a(this, y3Var, false, 24)), new w0.d(this, 5));
            } else {
                this.f45155j = false;
                N().add(y3Var);
            }
        }
    }

    public final void P(b2 b2Var) {
        p();
        boolean z11 = (b2Var.i(a2.ANALYTICS_STORAGE) && b2Var.i(a2.AD_STORAGE)) || ((n1) this.f21216b).p().y();
        n1 n1Var = (n1) this.f21216b;
        l1 l1Var = n1Var.f44988g;
        n1.m(l1Var);
        l1Var.p();
        if (z11 != n1Var.f45006z) {
            l1 l1Var2 = n1Var.f44988g;
            n1.m(l1Var2);
            l1Var2.p();
            n1Var.f45006z = z11;
            e1 e1Var = ((n1) this.f21216b).f44986e;
            n1.k(e1Var);
            e1Var.p();
            Boolean boolValueOf = e1Var.t().contains("measurement_enabled_from_api") ? Boolean.valueOf(e1Var.t().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z11 || boolValueOf == null || boolValueOf.booleanValue()) {
                G(Boolean.valueOf(z11), false);
            }
        }
    }

    @Override // y00.i0
    public final boolean s() {
        return false;
    }

    public final void t(String str, String str2, Bundle bundle) {
        long jElapsedRealtime;
        n1 n1Var = (n1) this.f21216b;
        n1Var.f44992k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (n1Var.f44985d.A(null, g0.f44776e1)) {
            n1Var.f44992k.getClass();
            jElapsedRealtime = SystemClock.elapsedRealtime();
        } else {
            jElapsedRealtime = 0;
        }
        u(str, str2, bundle, true, true, jCurrentTimeMillis, jElapsedRealtime);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006c, code lost:
    
        if (r6 > 500) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a3, code lost:
    
        if (r7 > 500) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u(java.lang.String r20, java.lang.String r21, android.os.Bundle r22, boolean r23, boolean r24, long r25, long r27) {
        /*
            Method dump skipped, instruction units count: 516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y00.t2.u(java.lang.String, java.lang.String, android.os.Bundle, boolean, boolean, long, long):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public final void v() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y00.t2.v():void");
    }

    public final void w(String str, String str2, Bundle bundle) {
        long jElapsedRealtime;
        p();
        n1 n1Var = (n1) this.f21216b;
        n1Var.f44992k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (n1Var.f44985d.A(null, g0.f44776e1)) {
            n1Var.f44992k.getClass();
            jElapsedRealtime = SystemClock.elapsedRealtime();
        } else {
            jElapsedRealtime = 0;
        }
        x(jCurrentTimeMillis, jElapsedRealtime, bundle, str, str2);
    }

    public final void x(long j9, long j11, Bundle bundle, String str, String str2) {
        p();
        boolean z11 = true;
        if (this.f45150e != null && !r4.U(str2)) {
            z11 = false;
        }
        y(str, str2, j9, j11, bundle, true, z11, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x013c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y(java.lang.String r27, java.lang.String r28, long r29, long r31, android.os.Bundle r33, boolean r34, boolean r35, boolean r36) {
        /*
            Method dump skipped, instruction units count: 1299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y00.t2.y(java.lang.String, java.lang.String, long, long, android.os.Bundle, boolean, boolean, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z(java.lang.String r12, java.lang.String r13, java.lang.Object r14, boolean r15, long r16) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y00.t2.z(java.lang.String, java.lang.String, java.lang.Object, boolean, long):void");
    }
}
