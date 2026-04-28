package y00;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Pair;
import android.util.SparseArray;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e1 extends w1 {
    public static final Pair A = new Pair("", 0L);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SharedPreferences f44708d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public SharedPreferences f44709e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public u90.j f44710f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d1 f44711g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c40.q f44712h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f44713i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f44714j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f44715k;
    public final d1 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final g9.i f44716m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final c40.q f44717n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final com.google.firebase.messaging.a0 f44718o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final g9.i f44719p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final d1 f44720q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final d1 f44721r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f44722s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final g9.i f44723t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final g9.i f44724u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final d1 f44725v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final c40.q f44726w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final c40.q f44727x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final d1 f44728y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final com.google.firebase.messaging.a0 f44729z;

    public e1(n1 n1Var) {
        super(n1Var);
        this.l = new d1(this, "session_timeout", 1800000L);
        this.f44716m = new g9.i(this, "start_new_session", true);
        this.f44720q = new d1(this, "last_pause_time", 0L);
        this.f44721r = new d1(this, "session_id", 0L);
        this.f44717n = new c40.q(this, "non_personalized_ads");
        this.f44718o = new com.google.firebase.messaging.a0(this, "last_received_uri_timestamps_by_source");
        this.f44719p = new g9.i(this, "allow_remote_dynamite", false);
        this.f44711g = new d1(this, "first_open_time", 0L);
        com.google.android.gms.common.internal.i0.e("app_install_time");
        this.f44712h = new c40.q(this, "app_instance_id");
        this.f44723t = new g9.i(this, "app_backgrounded", false);
        this.f44724u = new g9.i(this, "deep_link_retrieval_complete", false);
        this.f44725v = new d1(this, "deep_link_retrieval_attempts", 0L);
        this.f44726w = new c40.q(this, "firebase_feature_rollouts");
        this.f44727x = new c40.q(this, "deferred_attribution_cache");
        this.f44728y = new d1(this, "deferred_attribution_cache_timestamp", 0L);
        this.f44729z = new com.google.firebase.messaging.a0(this, "default_event_parameters");
    }

    @Override // y00.w1
    public final boolean q() {
        return true;
    }

    public final SharedPreferences t() {
        p();
        r();
        com.google.android.gms.common.internal.i0.h(this.f44708d);
        return this.f44708d;
    }

    public final SharedPreferences u() {
        p();
        r();
        if (this.f44709e == null) {
            n1 n1Var = (n1) this.f21216b;
            String strValueOf = String.valueOf(n1Var.f44982a.getPackageName());
            w0 w0Var = n1Var.f44987f;
            n1.m(w0Var);
            u0 u0Var = w0Var.f45267o;
            String strConcat = strValueOf.concat("_preferences");
            u0Var.b(strConcat, "Default prefs file");
            this.f44709e = n1Var.f44982a.getSharedPreferences(strConcat, 0);
        }
        return this.f44709e;
    }

    public final SparseArray v() {
        Bundle bundleC0 = this.f44718o.c0();
        int[] intArray = bundleC0.getIntArray("uriSources");
        long[] longArray = bundleC0.getLongArray("uriTimestamps");
        if (intArray == null || longArray == null) {
            return new SparseArray();
        }
        if (intArray.length != longArray.length) {
            w0 w0Var = ((n1) this.f21216b).f44987f;
            n1.m(w0Var);
            w0Var.f45260g.a("Trigger URI source and timestamp array lengths do not match");
            return new SparseArray();
        }
        SparseArray sparseArray = new SparseArray();
        for (int i11 = 0; i11 < intArray.length; i11++) {
            sparseArray.put(intArray[i11], Long.valueOf(longArray[i11]));
        }
        return sparseArray;
    }

    public final b2 w() {
        p();
        return b2.c(t().getInt("consent_source", 100), t().getString("consent_settings", "G1"));
    }

    public final void x(boolean z11) {
        p();
        w0 w0Var = ((n1) this.f21216b).f44987f;
        n1.m(w0Var);
        w0Var.f45267o.b(Boolean.valueOf(z11), "App measurement setting deferred collection");
        SharedPreferences.Editor editorEdit = t().edit();
        editorEdit.putBoolean("deferred_analytics_collection", z11);
        editorEdit.apply();
    }

    public final boolean y(long j9) {
        return j9 - this.l.a() > this.f44720q.a();
    }
}
