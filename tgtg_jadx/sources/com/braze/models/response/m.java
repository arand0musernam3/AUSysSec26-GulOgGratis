package com.braze.models.response;

import com.braze.managers.d1;
import com.braze.managers.h1;
import com.braze.models.FeatureFlag;
import com.braze.storage.i3;
import com.braze.support.BrazeLogger;
import h7.h0;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.m0;
import kotlin.collections.n0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import n80.p;
import o80.r;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class m {
    public String A;
    public Long B;
    public long C;
    public long D;
    public long E;
    public Map F;
    public boolean G;
    public int H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f10256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Set f10257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Set f10258c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Set f10259d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f10260e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f10261f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f10262g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f10263h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f10264i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f10265j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f10266k;
    public boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f10267m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f10268n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f10269o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f10270p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f10271q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f10272r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f10273s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f10274t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f10275u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f10276v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f10277w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f10278x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f10279y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f10280z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m(JSONObject jSONObject) {
        this();
        jSONObject.getClass();
        this.f10256a = jSONObject.optLong("time", 0L);
        this.f10266k = jSONObject.optLong("messaging_session_timeout", -1L);
        this.f10257b = a(jSONObject, "events_blacklist");
        this.f10258c = a(jSONObject, "attributes_blacklist");
        this.f10259d = a(jSONObject, "purchases_blacklist");
        b(jSONObject);
        f(jSONObject);
        d(jSONObject);
        e(jSONObject);
        i(jSONObject);
        h(jSONObject);
        c(jSONObject);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("request_backoff");
        if (jSONObjectOptJSONObject != null) {
            this.f10277w = jSONObjectOptJSONObject.optInt("min_sleep_duration_ms", this.f10277w);
            this.f10278x = jSONObjectOptJSONObject.optInt("max_sleep_duration_ms", this.f10278x);
            this.f10279y = jSONObjectOptJSONObject.optInt("scale_factor", this.f10279y);
        }
        j(jSONObject);
        a(jSONObject);
    }

    public static HashSet a(JSONObject jSONObject, String str) {
        Iterator h0Var;
        HashSet hashSet = new HashSet();
        if (jSONObject.has(str)) {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
            if (jSONArrayOptJSONArray == null) {
                n0.f26529a.getClass();
                h0Var = m0.f26528a;
            } else {
                h0Var = new h0(r.m(r.h(CollectionsKt.F(p.j(0, jSONArrayOptJSONArray.length())), new k(jSONArrayOptJSONArray)), new l(jSONArrayOptJSONArray)));
            }
            while (h0Var.hasNext()) {
                hashSet.add((String) h0Var.next());
            }
        }
        return hashSet;
    }

    public static final String k(JSONObject jSONObject) {
        return "sdkDebuggerObject contains invalid values. Disabling SDK debugging. " + jSONObject;
    }

    public final void b(JSONObject jSONObject) {
        m mVar;
        boolean z11;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("content_cards");
        if (jSONObjectOptJSONObject != null) {
            try {
                z11 = jSONObjectOptJSONObject.getBoolean(FeatureFlag.ENABLED);
                mVar = this;
            } catch (JSONException e5) {
                mVar = this;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) mVar, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new fw.b(5), 4, (Object) null);
                z11 = false;
            }
            mVar.f10265j = z11;
        }
    }

    public final void c(JSONObject jSONObject) {
        m mVar;
        boolean z11;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("dust");
        if (jSONObjectOptJSONObject != null) {
            try {
                z11 = jSONObjectOptJSONObject.getBoolean(FeatureFlag.ENABLED);
                mVar = this;
            } catch (JSONException e5) {
                mVar = this;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) mVar, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new fw.b(6), 4, (Object) null);
                z11 = false;
            }
            mVar.f10274t = z11;
            mVar.f10275u = jSONObjectOptJSONObject.optBoolean("should_block_cc_refresh", false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(JSONObject jSONObject) {
        boolean z11;
        m mVar;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("ephemeral_events");
        if (jSONObjectOptJSONObject != null) {
            try {
                z11 = jSONObjectOptJSONObject.getBoolean(FeatureFlag.ENABLED);
                mVar = this;
            } catch (JSONException e5) {
                z11 = false;
                mVar = this;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) mVar, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new fw.b(0 == true ? 1 : 0), 4, (Object) null);
            }
            mVar.l = z11;
        }
    }

    public final void e(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("feature_flags");
        if (jSONObjectOptJSONObject != null) {
            try {
                this.f10267m = jSONObjectOptJSONObject.optBoolean(FeatureFlag.ENABLED);
                this.f10268n = jSONObjectOptJSONObject.getInt("refresh_rate_limit");
            } catch (JSONException e5) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new fw.b(4), 4, (Object) null);
                this.f10267m = false;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f10256a == mVar.f10256a && Intrinsics.areEqual(this.f10257b, mVar.f10257b) && Intrinsics.areEqual(this.f10258c, mVar.f10258c) && Intrinsics.areEqual(this.f10259d, mVar.f10259d) && this.f10260e == mVar.f10260e && this.f10261f == mVar.f10261f && this.f10262g == mVar.f10262g && this.f10263h == mVar.f10263h && this.f10264i == mVar.f10264i && this.f10265j == mVar.f10265j && this.f10266k == mVar.f10266k && this.l == mVar.l && this.f10267m == mVar.f10267m && this.f10268n == mVar.f10268n && this.f10269o == mVar.f10269o && this.f10270p == mVar.f10270p && this.f10271q == mVar.f10271q && this.f10272r == mVar.f10272r && this.f10273s == mVar.f10273s && this.f10274t == mVar.f10274t && this.f10275u == mVar.f10275u && this.f10276v == mVar.f10276v && this.f10277w == mVar.f10277w && this.f10278x == mVar.f10278x && this.f10279y == mVar.f10279y && this.f10280z == mVar.f10280z && Intrinsics.areEqual(this.A, mVar.A) && Intrinsics.areEqual(this.B, mVar.B) && this.C == mVar.C && this.D == mVar.D && this.E == mVar.E && Intrinsics.areEqual(this.F, mVar.F) && this.G == mVar.G && this.H == mVar.H;
    }

    public final void f(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("geofences");
        if (jSONObjectOptJSONObject != null) {
            try {
                this.f10260e = jSONObjectOptJSONObject.getInt("min_time_since_last_request");
                this.f10261f = jSONObjectOptJSONObject.getInt("min_time_since_last_report");
                this.f10264i = jSONObjectOptJSONObject.getBoolean(FeatureFlag.ENABLED);
                this.f10263h = true;
                this.f10262g = jSONObjectOptJSONObject.optInt("max_num_to_register", 20);
            } catch (JSONException e5) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new fw.b(3), 4, (Object) null);
                this.f10260e = -1;
                this.f10261f = -1;
                this.f10262g = -1;
                this.f10264i = false;
                this.f10263h = false;
            }
        }
    }

    public final void g(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("endpoint_overrides");
        if (jSONObjectOptJSONObject != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
            itKeys.getClass();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                com.braze.requests.m mVar = com.braze.requests.n.f10447b;
                next.getClass();
                mVar.getClass();
                next.getClass();
                com.braze.requests.n nVar = (com.braze.requests.n) com.braze.requests.n.f10448c.get(next);
                if (nVar != null) {
                    JSONObject jSONObject2 = jSONObjectOptJSONObject.getJSONObject(next);
                    int i11 = jSONObject2.getInt("capacity");
                    int i12 = jSONObject2.getInt("refill_rate");
                    if (i11 > 0 && i12 > 0) {
                        linkedHashMap.put(nVar, new j(i11, i12));
                    }
                }
            }
            if (linkedHashMap.isEmpty()) {
                return;
            }
            this.F = linkedHashMap;
        }
    }

    public final void h(JSONObject jSONObject) {
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("global_request_rate_limit");
            if (jSONObjectOptJSONObject != null) {
                if (!jSONObjectOptJSONObject.getBoolean(FeatureFlag.ENABLED)) {
                    this.f10271q = false;
                    return;
                }
                int i11 = jSONObjectOptJSONObject.getInt("refill_rate");
                int i12 = jSONObjectOptJSONObject.getInt("capacity");
                if (i12 < 10) {
                    this.f10271q = false;
                } else {
                    if (i11 <= 0) {
                        return;
                    }
                    this.f10271q = true;
                    this.f10273s = i12;
                    this.f10272r = i11;
                    g(jSONObjectOptJSONObject);
                }
            }
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new fw.b(8), 4, (Object) null);
            this.f10271q = false;
            this.F = null;
        }
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f10256a) * 31;
        Set set = this.f10257b;
        int iHashCode2 = (iHashCode + (set == null ? 0 : set.hashCode())) * 31;
        Set set2 = this.f10258c;
        int iHashCode3 = (iHashCode2 + (set2 == null ? 0 : set2.hashCode())) * 31;
        Set set3 = this.f10259d;
        int iE = r8.k.e(r8.k.b(this.f10279y, r8.k.b(this.f10278x, r8.k.b(this.f10277w, e0.f.b(r8.k.e(r8.k.e(r8.k.b(this.f10273s, r8.k.b(this.f10272r, r8.k.e(e0.f.b(r8.k.e(r8.k.b(this.f10268n, r8.k.e(r8.k.e(e0.f.b(r8.k.e(r8.k.e(r8.k.e(r8.k.b(this.f10262g, r8.k.b(this.f10261f, r8.k.b(this.f10260e, (iHashCode3 + (set3 == null ? 0 : set3.hashCode())) * 31, 31), 31), 31), 31, this.f10263h), 31, this.f10264i), 31, this.f10265j), 31, this.f10266k), 31, this.l), 31, this.f10267m), 31), 31, this.f10269o), 31, this.f10270p), 31, this.f10271q), 31), 31), 31, this.f10274t), 31, this.f10275u), 31, this.f10276v), 31), 31), 31), 31, this.f10280z);
        String str = this.A;
        int iHashCode4 = (iE + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.B;
        int iB = e0.f.b(e0.f.b(e0.f.b((iHashCode4 + (l == null ? 0 : l.hashCode())) * 31, 31, this.C), 31, this.D), 31, this.E);
        Map map = this.F;
        return Integer.hashCode(this.H) + r8.k.e((iB + (map != null ? map.hashCode() : 0)) * 31, 31, this.G);
    }

    public final void i(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("push_max");
        if (jSONObjectOptJSONObject != null) {
            try {
                this.f10269o = jSONObjectOptJSONObject.optBoolean(FeatureFlag.ENABLED);
                this.f10270p = jSONObjectOptJSONObject.optLong("redeliver_buffer", 86400L);
                this.f10276v = jSONObjectOptJSONObject.optLong("redeliver_dedupe_buffer", -1L);
            } catch (JSONException e5) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new fw.b(2), 4, (Object) null);
                this.f10269o = false;
                this.f10270p = 0L;
                this.f10276v = -1L;
            }
        }
    }

    public final void j(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("sdk_debugger");
        if (jSONObjectOptJSONObject == null) {
            return;
        }
        try {
            d1 d1VarA = h1.f9984k.a(jSONObjectOptJSONObject, false);
            if (d1VarA.f9959a) {
                this.f10280z = true;
                this.A = d1VarA.f9961c;
                Long l = d1VarA.f9960b;
                if (l != null) {
                    this.B = Long.valueOf(l.longValue());
                }
                this.C = d1VarA.f9962d;
                this.D = d1VarA.f9963e;
                this.E = d1VarA.f9964f;
            }
            String str = this.A;
            if (str != null && !StringsKt.H(str) && this.C > 0 && this.D > 0 && this.E > 0) {
                return;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new bw.a(jSONObjectOptJSONObject, 4), 7, (Object) null);
        } catch (JSONException e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new fw.b(1), 4, (Object) null);
        }
        this.f10280z = false;
        this.A = null;
        this.C = 0L;
        this.D = 0L;
        this.E = 0L;
    }

    public final String toString() {
        long j9 = this.f10256a;
        Set set = this.f10257b;
        Set set2 = this.f10258c;
        Set set3 = this.f10259d;
        int i11 = this.f10260e;
        int i12 = this.f10261f;
        int i13 = this.f10262g;
        boolean z11 = this.f10263h;
        boolean z12 = this.f10264i;
        boolean z13 = this.f10265j;
        long j11 = this.f10266k;
        boolean z14 = this.l;
        boolean z15 = this.f10267m;
        int i14 = this.f10268n;
        boolean z16 = this.f10269o;
        long j12 = this.f10270p;
        boolean z17 = this.f10271q;
        int i15 = this.f10272r;
        int i16 = this.f10273s;
        boolean z18 = this.f10274t;
        boolean z19 = this.f10275u;
        long j13 = this.f10276v;
        int i17 = this.f10277w;
        int i18 = this.f10278x;
        int i19 = this.f10279y;
        boolean z21 = this.f10280z;
        String str = this.A;
        Long l = this.B;
        long j14 = this.C;
        long j15 = this.D;
        long j16 = this.E;
        Map map = this.F;
        boolean z22 = this.G;
        int i21 = this.H;
        StringBuilder sb2 = new StringBuilder("ServerConfig(configTime=");
        sb2.append(j9);
        sb2.append(", blocklistedEvents=");
        sb2.append(set);
        sb2.append(", blocklistedAttributes=");
        sb2.append(set2);
        sb2.append(", blocklistedPurchases=");
        sb2.append(set3);
        sb2.append(", minTimeSinceLastRequest=");
        sb2.append(i11);
        sb2.append(", minTimeSinceLastReport=");
        sb2.append(i12);
        sb2.append(", maxNumToRegister=");
        sb2.append(i13);
        sb2.append(", geofencesEnabledSet=");
        sb2.append(z11);
        sb2.append(", geofencesEnabled=");
        sb2.append(z12);
        sb2.append(", isContentCardsFeatureEnabled=");
        sb2.append(z13);
        org.bouncycastle.jcajce.provider.asymmetric.a.v(sb2, ", messagingSessionTimeout=", j11, ", ephemeralEventsEnabled=");
        b3.i.C(sb2, z14, ", featureFlagsEnabled=", z15, ", featureFlagsRefreshRateLimit=");
        sb2.append(i14);
        sb2.append(", pushMaxEnabled=");
        sb2.append(z16);
        sb2.append(", pushMaxRedeliverBuffer=");
        sb2.append(j12);
        sb2.append(", globalRequestRateLimitEnabled=");
        sb2.append(z17);
        sb2.append(", globalRequestRateLimitBucketRefillRate=");
        sb2.append(i15);
        sb2.append(", globalRequestRateLimitBucketCapacity=");
        sb2.append(i16);
        sb2.append(", isDustFeatureEnabled=");
        sb2.append(z18);
        sb2.append(", dustShouldBlockCcRefresh=");
        sb2.append(z19);
        org.bouncycastle.jcajce.provider.asymmetric.a.v(sb2, ", pushMaxRedeliverDedupeBuffer=", j13, ", defaultBackoffMinSleepMs=");
        e0.f.C(sb2, i17, ", defaultBackoffMaxSleepMs=", i18, ", defaultBackoffScaleFactor=");
        sb2.append(i19);
        sb2.append(", sdkDebuggerEnabled=");
        sb2.append(z21);
        sb2.append(", sdkDebuggerAuthCode=");
        sb2.append(str);
        sb2.append(", sdkDebuggerExpirationTime=");
        sb2.append(l);
        sb2.append(", sdkDebuggerFlushIntervalBytes=");
        sb2.append(j14);
        org.bouncycastle.jcajce.provider.asymmetric.a.v(sb2, ", sdkDebuggerFlushIntervalSeconds=", j15, ", sdkDebuggerMaxPayloadBytes=");
        sb2.append(j16);
        sb2.append(", globalRequestRateLimitOverrides=");
        sb2.append(map);
        sb2.append(", bannersEnabled=");
        sb2.append(z22);
        sb2.append(", maxBannerPlacements=");
        sb2.append(i21);
        sb2.append(")");
        return sb2.toString();
    }

    public static final String d() {
        return "Error getting required ephemeral events fields. Using defaults.";
    }

    public static final String b() {
        return "Error getting required content cards fields. Using defaults.";
    }

    public static final String c() {
        return "Error getting required DUST enabled field. Using default of false.";
    }

    public static final String e() {
        return "Error getting required feature flag fields. Disabling feature flags.";
    }

    public static final String i() {
        return "Error getting required SDK debugging fields. Disabling SDK debugging.";
    }

    public static final String a(m mVar) {
        return r8.k.h(mVar.H, "Banners enabled but maxBannerPlacement is ", ". Not enabling banners.");
    }

    public static final String a() {
        return "Error getting required banner configuration fields. Disabling banners.";
    }

    public static final String f() {
        return "Error getting required geofence fields. Using defaults.";
    }

    public static final String h() {
        return "Error getting required push max fields. Disabling push max.";
    }

    public final void a(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("banners");
        if (jSONObjectOptJSONObject != null) {
            try {
                this.G = jSONObjectOptJSONObject.getBoolean(FeatureFlag.ENABLED);
                int i11 = jSONObjectOptJSONObject.getInt("max_placements");
                this.H = i11;
                if (!this.G || i11 > 0) {
                    return;
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new fw.c(this, 0), 7, (Object) null);
                }
            } catch (JSONException e5) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new fw.b(7), 4, (Object) null);
            }
            this.G = false;
            this.H = 0;
        }
    }

    public static final String g() {
        return "Caught error parsing global rate limit config.";
    }

    public m() {
        int i11 = i3.f10585f;
        int i12 = i3.f10586g;
        this.f10256a = 0L;
        this.f10257b = null;
        this.f10258c = null;
        this.f10259d = null;
        this.f10260e = -1;
        this.f10261f = -1;
        this.f10262g = -1;
        this.f10263h = false;
        this.f10264i = false;
        this.f10265j = false;
        this.f10266k = -1L;
        this.l = false;
        this.f10267m = false;
        this.f10268n = -1;
        this.f10269o = false;
        this.f10270p = 86400L;
        this.f10271q = true;
        this.f10272r = 30;
        this.f10273s = 30;
        this.f10274t = false;
        this.f10275u = false;
        this.f10276v = -1L;
        this.f10277w = i11;
        this.f10278x = i12;
        this.f10279y = 3;
        this.f10280z = false;
        this.A = null;
        this.B = null;
        this.C = 0L;
        this.D = 0L;
        this.E = 0L;
        this.F = null;
        this.G = false;
        this.H = 0;
    }
}
