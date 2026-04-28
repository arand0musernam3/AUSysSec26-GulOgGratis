package com.braze.storage;

import android.content.Context;
import com.adyen.checkout.components.core.Address;
import com.braze.Constants;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DataStoreValueType;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;
import zendesk.messaging.android.internal.conversationscreen.ConversationTypingEvents;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class i3 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f10585f = (int) ConversationTypingEvents.TIME_INTERVAL_IN_MILLIS;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f10586g = (int) 300000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.braze.events.d f10587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h3 f10588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ReentrantLock f10589c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e90.a f10590d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public com.braze.models.response.m f10591e;

    public i3(Context context, String str, com.braze.events.d dVar) {
        i3 i3Var;
        context.getClass();
        str.getClass();
        dVar.getClass();
        this.f10587a = dVar;
        h3 h3Var = new h3(context, str);
        this.f10588b = h3Var;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f10589c = reentrantLock;
        this.f10590d = e90.d.a();
        DataStoreKey dataStoreKey = DataStoreKey.LAST_ACCESSED_SDK_VERSION;
        String string = h3Var.readString(dataStoreKey, "");
        if (Intrinsics.areEqual(Constants.BRAZE_SDK_VERSION, string)) {
            i3Var = this;
        } else {
            i3Var = this;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) i3Var, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new dw.d(string, 29), 6, (Object) null);
            h3Var.writeData(DataStoreKey.CONFIG_TIME, 0L);
            h3Var.writeData(dataStoreKey, Constants.BRAZE_SDK_VERSION);
        }
        com.braze.models.response.m mVar = new com.braze.models.response.m();
        mVar.f10258c = e();
        mVar.f10257b = f();
        mVar.f10259d = g();
        mVar.f10256a = i();
        mVar.f10266k = r();
        mVar.f10260e = t();
        mVar.f10261f = s();
        mVar.f10262g = q();
        mVar.f10264i = I();
        mVar.f10263h = J();
        mVar.f10265j = E();
        mVar.l = G();
        mVar.f10267m = H();
        mVar.f10268n = m();
        mVar.f10269o = L();
        mVar.f10270p = u();
        mVar.f10274t = F();
        mVar.f10275u = D();
        mVar.f10271q = K();
        mVar.f10272r = o();
        mVar.f10273s = n();
        mVar.f10276v = v();
        mVar.f10279y = l();
        mVar.f10277w = k();
        mVar.f10278x = j();
        mVar.f10280z = M();
        mVar.A = y();
        mVar.C = A();
        mVar.D = B();
        mVar.E = C();
        mVar.B = Long.valueOf(z());
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar2 = i3Var.f10591e;
            Map mapW = (mVar2 == null || (mapW = mVar2.F) == null) ? w() : mapW;
            reentrantLock.unlock();
            mVar.F = mapW;
            mVar.G = d();
            mVar.H = p();
            reentrantLock.lock();
            try {
                i3Var.f10591e = mVar;
            } finally {
                reentrantLock.unlock();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static final String O() {
        return "Attempting to unlock server config info";
    }

    public static final String P() {
        return "Unlocking config info lock.";
    }

    public static final String Q() {
        return "Tried to unlock server config info when not locked.";
    }

    public static final String R() {
        return "Could not persist server config to DataStore.";
    }

    public static final String S() {
        return "Could not persist server config to DataStore.";
    }

    public static final String T() {
        return "Server config is older than previous config time. Not sending out ConfigChangeEvent.";
    }

    public static final String b(com.braze.models.response.m mVar) {
        return "Finishing updating server config to " + mVar;
    }

    public static final String c() {
        return "Not allowing server config info unlock. Returning null.";
    }

    public static final String h() {
        return "Experienced exception retrieving blocklisted strings from local storage. Returning empty set.";
    }

    public static final String x() {
        return "Failed to parse endpoint override from storage";
    }

    public final long A() {
        long j9;
        long jLongValue;
        ReentrantLock reentrantLock = this.f10589c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.f10591e;
            if (mVar == null) {
                j9 = 0;
                Long l = this.f10588b.readLong(DataStoreKey.SDK_DEBUGGER_FLUSH_INTERVAL_BYTES, 0L);
                if (l != null) {
                    jLongValue = l.longValue();
                }
                reentrantLock.unlock();
                return j9;
            }
            jLongValue = mVar.C;
            j9 = jLongValue;
            reentrantLock.unlock();
            return j9;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final long B() {
        long j9;
        long jLongValue;
        ReentrantLock reentrantLock = this.f10589c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.f10591e;
            if (mVar == null) {
                j9 = 0;
                Long l = this.f10588b.readLong(DataStoreKey.SDK_DEBUGGER_FLUSH_INTERVAL_SECONDS, 0L);
                if (l != null) {
                    jLongValue = l.longValue();
                }
                reentrantLock.unlock();
                return j9;
            }
            jLongValue = mVar.D;
            j9 = jLongValue;
            reentrantLock.unlock();
            return j9;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final long C() {
        long j9;
        long jLongValue;
        ReentrantLock reentrantLock = this.f10589c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.f10591e;
            if (mVar == null) {
                j9 = 0;
                Long l = this.f10588b.readLong(DataStoreKey.SDK_DEBUGGER_MAX_PAYLOAD_BYTES, 0L);
                if (l != null) {
                    jLongValue = l.longValue();
                }
                reentrantLock.unlock();
                return j9;
            }
            jLongValue = mVar.E;
            j9 = jLongValue;
            reentrantLock.unlock();
            return j9;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final boolean D() {
        boolean zBooleanValue;
        ReentrantLock reentrantLock = this.f10589c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.f10591e;
            if (mVar != null) {
                zBooleanValue = mVar.f10275u;
            } else {
                Boolean bool = this.f10588b.readBoolean(DataStoreKey.DUST_SHOULD_BLOCK_CC_REFRESH, Boolean.FALSE);
                zBooleanValue = bool != null ? bool.booleanValue() : false;
            }
            reentrantLock.unlock();
            return zBooleanValue;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final boolean E() {
        boolean zBooleanValue;
        ReentrantLock reentrantLock = this.f10589c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.f10591e;
            if (mVar != null) {
                zBooleanValue = mVar.f10265j;
            } else {
                Boolean bool = this.f10588b.readBoolean(DataStoreKey.CONTENT_CARDS_ENABLED, Boolean.FALSE);
                zBooleanValue = bool != null ? bool.booleanValue() : false;
            }
            reentrantLock.unlock();
            return zBooleanValue;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final boolean F() {
        boolean zBooleanValue;
        ReentrantLock reentrantLock = this.f10589c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.f10591e;
            if (mVar != null) {
                zBooleanValue = mVar.f10274t;
            } else {
                Boolean bool = this.f10588b.readBoolean(DataStoreKey.DUST_ENABLED, Boolean.FALSE);
                zBooleanValue = bool != null ? bool.booleanValue() : false;
            }
            reentrantLock.unlock();
            return zBooleanValue;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final boolean G() {
        boolean zBooleanValue;
        ReentrantLock reentrantLock = this.f10589c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.f10591e;
            if (mVar != null) {
                zBooleanValue = mVar.l;
            } else {
                Boolean bool = this.f10588b.readBoolean(DataStoreKey.EPHEMERAL_EVENTS_ENABLED, Boolean.FALSE);
                zBooleanValue = bool != null ? bool.booleanValue() : false;
            }
            reentrantLock.unlock();
            return zBooleanValue;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final boolean H() {
        boolean zBooleanValue;
        ReentrantLock reentrantLock = this.f10589c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.f10591e;
            if (mVar != null) {
                zBooleanValue = mVar.f10267m;
            } else {
                Boolean bool = this.f10588b.readBoolean(DataStoreKey.FEATURE_FLAGS_ENABLED, Boolean.FALSE);
                zBooleanValue = bool != null ? bool.booleanValue() : false;
            }
            reentrantLock.unlock();
            return zBooleanValue;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final boolean I() {
        boolean zBooleanValue;
        ReentrantLock reentrantLock = this.f10589c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.f10591e;
            if (mVar != null) {
                zBooleanValue = mVar.f10264i;
            } else {
                Boolean bool = this.f10588b.readBoolean(DataStoreKey.GEOFENCES_ENABLED, Boolean.FALSE);
                zBooleanValue = bool != null ? bool.booleanValue() : false;
            }
            reentrantLock.unlock();
            return zBooleanValue;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final boolean J() {
        boolean zBooleanValue;
        ReentrantLock reentrantLock = this.f10589c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.f10591e;
            if (mVar != null) {
                zBooleanValue = mVar.f10263h;
            } else {
                Boolean bool = this.f10588b.readBoolean(DataStoreKey.GEOFENCES_ENABLED_SET, Boolean.FALSE);
                zBooleanValue = bool != null ? bool.booleanValue() : false;
            }
            reentrantLock.unlock();
            return zBooleanValue;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final boolean K() {
        boolean zBooleanValue;
        ReentrantLock reentrantLock = this.f10589c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.f10591e;
            if (mVar != null) {
                zBooleanValue = mVar.f10271q;
            } else {
                Boolean bool = this.f10588b.readBoolean(DataStoreKey.GLOBAL_REQUEST_RATE_LIMITING_ENABLED, Boolean.TRUE);
                zBooleanValue = bool != null ? bool.booleanValue() : true;
            }
            reentrantLock.unlock();
            return zBooleanValue;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final boolean L() {
        boolean zBooleanValue;
        ReentrantLock reentrantLock = this.f10589c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.f10591e;
            if (mVar != null) {
                zBooleanValue = mVar.f10269o;
            } else {
                Boolean bool = this.f10588b.readBoolean(DataStoreKey.PUSH_MAX_ENABLED, Boolean.FALSE);
                zBooleanValue = bool != null ? bool.booleanValue() : false;
            }
            reentrantLock.unlock();
            return zBooleanValue;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final boolean M() {
        boolean zBooleanValue;
        ReentrantLock reentrantLock = this.f10589c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.f10591e;
            if (mVar != null) {
                zBooleanValue = mVar.f10280z;
            } else {
                Boolean bool = this.f10588b.readBoolean(DataStoreKey.SDK_DEBUGGER_ENABLED, Boolean.FALSE);
                zBooleanValue = bool != null ? bool.booleanValue() : false;
            }
            reentrantLock.unlock();
            return zBooleanValue;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final void N() {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new lw.l(3), 6, (Object) null);
        if (this.f10590d.a()) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new lw.l(4), 7, (Object) null);
            try {
                this.f10590d.e(null);
            } catch (IllegalStateException e5) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new lw.l(5), 4, (Object) null);
            }
        }
    }

    public final void a(com.braze.models.response.m mVar) throws Throwable {
        String strC;
        String strC2;
        mVar.getClass();
        ReentrantLock reentrantLock = this.f10589c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar2 = this.f10591e;
            this.f10591e = mVar;
            try {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Set set = mVar.f10257b;
                String strC3 = "[]";
                if (set != null) {
                    String key = DataStoreKey.BLOCKLISTED_EVENTS.getKey();
                    DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                    List listR0 = CollectionsKt.r0(set);
                    try {
                        n90.b bVar = n90.c.f30748d;
                        bVar.getClass();
                        strC2 = bVar.c(new m90.d(m90.r1.f29848a, 0), listR0);
                    } catch (Exception e5) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) com.braze.support.i.f10761a, 4, (Object) null);
                        strC2 = ((listR0 instanceof Map) || listR0 == null) ? "{}" : "[]";
                    }
                    linkedHashMap.put(key, strC2);
                }
                Set set2 = mVar.f10258c;
                if (set2 != null) {
                    String key2 = DataStoreKey.BLOCKLISTED_ATTRIBUTES.getKey();
                    DataStoreUtils dataStoreUtils2 = DataStoreUtils.INSTANCE;
                    List listR02 = CollectionsKt.r0(set2);
                    try {
                        n90.b bVar2 = n90.c.f30748d;
                        bVar2.getClass();
                        strC = bVar2.c(new m90.d(m90.r1.f29848a, 0), listR02);
                    } catch (Exception e11) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils2, BrazeLogger.Priority.E, (Throwable) e11, false, (Function0) com.braze.support.i.f10761a, 4, (Object) null);
                        strC = ((listR02 instanceof Map) || listR02 == null) ? "{}" : "[]";
                    }
                    linkedHashMap.put(key2, strC);
                }
                Set set3 = mVar.f10259d;
                if (set3 != null) {
                    String key3 = DataStoreKey.BLOCKLISTED_PURCHASES.getKey();
                    DataStoreUtils dataStoreUtils3 = DataStoreUtils.INSTANCE;
                    List listR03 = CollectionsKt.r0(set3);
                    try {
                        n90.b bVar3 = n90.c.f30748d;
                        bVar3.getClass();
                        strC3 = bVar3.c(new m90.d(m90.r1.f29848a, 0), listR03);
                    } catch (Exception e12) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils3, BrazeLogger.Priority.E, (Throwable) e12, false, (Function0) com.braze.support.i.f10761a, 4, (Object) null);
                        if ((listR03 instanceof Map) || listR03 == null) {
                            strC3 = "{}";
                        }
                    }
                    linkedHashMap.put(key3, strC3);
                }
                Map map = mVar.F;
                if (map != null) {
                    JSONObject jSONObject = new JSONObject();
                    for (com.braze.requests.n nVar : map.keySet()) {
                        com.braze.models.response.j jVar = (com.braze.models.response.j) map.get(nVar);
                        if (jVar != null) {
                            jSONObject.put(nVar.name(), new JSONObject().put("refill", jVar.f10253b).put("capacity", jVar.f10252a));
                        }
                    }
                    linkedHashMap.put(DataStoreKey.GLOBAL_REQUEST_RATE_LIMIT_ENDPOINT_OVERRIDES.getKey(), jSONObject.toString());
                }
                linkedHashMap.put(DataStoreKey.CONFIG_TIME.getKey(), Long.valueOf(mVar.f10256a));
                linkedHashMap.put(DataStoreKey.EPHEMERAL_EVENTS_ENABLED.getKey(), Boolean.valueOf(mVar.l));
                linkedHashMap.put(DataStoreKey.GEOFENCES_ENABLED_SET.getKey(), Boolean.valueOf(mVar.f10263h));
                linkedHashMap.put(DataStoreKey.GEOFENCES_ENABLED.getKey(), Boolean.valueOf(mVar.f10264i));
                linkedHashMap.put(DataStoreKey.GEOFENCES_MIN_TIME_REQUEST.getKey(), Integer.valueOf(mVar.f10260e));
                linkedHashMap.put(DataStoreKey.GEOFENCES_MIN_TIME_REPORT.getKey(), Integer.valueOf(mVar.f10261f));
                linkedHashMap.put(DataStoreKey.GEOFENCES_MAX_NUM_TO_REGISTER.getKey(), Integer.valueOf(mVar.f10262g));
                linkedHashMap.put(DataStoreKey.MESSAGING_SESSION_TIMEOUT.getKey(), Long.valueOf(mVar.f10266k));
                linkedHashMap.put(DataStoreKey.DUST_ENABLED.getKey(), Boolean.valueOf(mVar.f10274t));
                linkedHashMap.put(DataStoreKey.DUST_SHOULD_BLOCK_CC_REFRESH.getKey(), Boolean.valueOf(mVar.f10275u));
                linkedHashMap.put(DataStoreKey.CONTENT_CARDS_ENABLED.getKey(), Boolean.valueOf(mVar.f10265j));
                linkedHashMap.put(DataStoreKey.FEATURE_FLAGS_ENABLED.getKey(), Boolean.valueOf(mVar.f10267m));
                linkedHashMap.put(DataStoreKey.FEATURE_FLAGS_RATE_REFRESH_RATE_LIMIT.getKey(), Integer.valueOf(mVar.f10268n));
                linkedHashMap.put(DataStoreKey.PUSH_MAX_ENABLED.getKey(), Boolean.valueOf(mVar.f10269o));
                linkedHashMap.put(DataStoreKey.PUSH_MAX_REDELIVER_BUFFER.getKey(), Long.valueOf(mVar.f10270p));
                linkedHashMap.put(DataStoreKey.PUSH_MAX_REDELIVER_DEDUPE_BUFFER.getKey(), Long.valueOf(mVar.f10276v));
                linkedHashMap.put(DataStoreKey.GLOBAL_REQUEST_RATE_LIMITING_ENABLED.getKey(), Boolean.valueOf(mVar.f10271q));
                linkedHashMap.put(DataStoreKey.GLOBAL_REQUEST_RATE_LIMITING_CAPACITY.getKey(), Integer.valueOf(mVar.f10273s));
                linkedHashMap.put(DataStoreKey.GLOBAL_REQUEST_RATE_LIMITING_REFILL_RATE.getKey(), Integer.valueOf(mVar.f10272r));
                linkedHashMap.put(DataStoreKey.DEFAULT_REQUEST_BACKOFF_MIN_SLEEP_DURATION_MS.getKey(), Integer.valueOf(mVar.f10277w));
                linkedHashMap.put(DataStoreKey.DEFAULT_REQUEST_BACKOFF_MAX_SLEEP_DURATION_MS.getKey(), Integer.valueOf(mVar.f10278x));
                linkedHashMap.put(DataStoreKey.DEFAULT_REQUEST_BACKOFF_SCALE_FACTOR.getKey(), Integer.valueOf(mVar.f10279y));
                linkedHashMap.put(DataStoreKey.SDK_DEBUGGER_ENABLED.getKey(), Boolean.valueOf(mVar.f10280z));
                Long l = mVar.B;
                if (l != null) {
                    linkedHashMap.put(DataStoreKey.SDK_DEBUGGER_EXPIRATION_TIME.getKey(), Long.valueOf(l.longValue()));
                }
                String str = mVar.A;
                if (str != null) {
                    linkedHashMap.put(DataStoreKey.SDK_DEBUGGER_AUTHORIZATION_CODE.getKey(), str);
                }
                linkedHashMap.put(DataStoreKey.SDK_DEBUGGER_FLUSH_INTERVAL_BYTES.getKey(), Long.valueOf(mVar.C));
                linkedHashMap.put(DataStoreKey.SDK_DEBUGGER_FLUSH_INTERVAL_SECONDS.getKey(), Long.valueOf(mVar.D));
                linkedHashMap.put(DataStoreKey.SDK_DEBUGGER_MAX_PAYLOAD_BYTES.getKey(), Long.valueOf(mVar.E));
                linkedHashMap.put(DataStoreKey.BANNERS_ENABLED.getKey(), Boolean.valueOf(mVar.G));
                linkedHashMap.put(DataStoreKey.MAX_BANNER_PLACEMENTS.getKey(), Integer.valueOf(mVar.H));
                this.f10588b.batchUpdate(linkedHashMap, kotlin.collections.p0.f26531a);
            } catch (Exception e13) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e13, false, (Function0) new lw.l(9), 4, (Object) null);
            }
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new fw.c(mVar, 1), 6, (Object) null);
            if (mVar2 != null) {
                if (mVar.f10256a > mVar2.f10256a) {
                    this.f10587a.b(new com.braze.events.internal.d(mVar2, mVar), com.braze.events.internal.d.class);
                } else {
                    BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new lw.l(1), 7, (Object) null);
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean d() {
        boolean zBooleanValue;
        ReentrantLock reentrantLock = this.f10589c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.f10591e;
            if (mVar != null) {
                zBooleanValue = mVar.G;
            } else {
                Boolean bool = this.f10588b.readBoolean(DataStoreKey.BANNERS_ENABLED, Boolean.FALSE);
                zBooleanValue = bool != null ? bool.booleanValue() : false;
            }
            reentrantLock.unlock();
            return zBooleanValue;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final Set e() {
        Set setA;
        ReentrantLock reentrantLock = this.f10589c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.f10591e;
            if (mVar == null || (setA = mVar.f10258c) == null) {
                setA = a(DataStoreKey.BLOCKLISTED_ATTRIBUTES);
            }
            reentrantLock.unlock();
            return setA;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final Set f() {
        Set setA;
        ReentrantLock reentrantLock = this.f10589c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.f10591e;
            if (mVar == null || (setA = mVar.f10257b) == null) {
                setA = a(DataStoreKey.BLOCKLISTED_EVENTS);
            }
            reentrantLock.unlock();
            return setA;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final Set g() {
        Set setA;
        ReentrantLock reentrantLock = this.f10589c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.f10591e;
            if (mVar == null || (setA = mVar.f10259d) == null) {
                setA = a(DataStoreKey.BLOCKLISTED_PURCHASES);
            }
            reentrantLock.unlock();
            return setA;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final long i() {
        long j9;
        long jLongValue;
        ReentrantLock reentrantLock = this.f10589c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.f10591e;
            if (mVar == null) {
                j9 = 0;
                Long l = this.f10588b.readLong(DataStoreKey.CONFIG_TIME, 0L);
                if (l != null) {
                    jLongValue = l.longValue();
                }
                reentrantLock.unlock();
                return j9;
            }
            jLongValue = mVar.f10256a;
            j9 = jLongValue;
            reentrantLock.unlock();
            return j9;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final int j() {
        int i11;
        int iIntValue;
        ReentrantLock reentrantLock = this.f10589c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.f10591e;
            if (mVar == null) {
                h3 h3Var = this.f10588b;
                DataStoreKey dataStoreKey = DataStoreKey.DEFAULT_REQUEST_BACKOFF_MAX_SLEEP_DURATION_MS;
                i11 = f10586g;
                Integer num = h3Var.readInt(dataStoreKey, Integer.valueOf(i11));
                if (num != null) {
                    iIntValue = num.intValue();
                }
                reentrantLock.unlock();
                return i11;
            }
            iIntValue = mVar.f10278x;
            i11 = iIntValue;
            reentrantLock.unlock();
            return i11;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final int k() {
        int i11;
        int iIntValue;
        ReentrantLock reentrantLock = this.f10589c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.f10591e;
            if (mVar == null) {
                h3 h3Var = this.f10588b;
                DataStoreKey dataStoreKey = DataStoreKey.DEFAULT_REQUEST_BACKOFF_MIN_SLEEP_DURATION_MS;
                i11 = f10585f;
                Integer num = h3Var.readInt(dataStoreKey, Integer.valueOf(i11));
                if (num != null) {
                    iIntValue = num.intValue();
                }
                reentrantLock.unlock();
                return i11;
            }
            iIntValue = mVar.f10277w;
            i11 = iIntValue;
            reentrantLock.unlock();
            return i11;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final int l() {
        int i11;
        int iIntValue;
        ReentrantLock reentrantLock = this.f10589c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.f10591e;
            if (mVar == null) {
                i11 = 3;
                Integer num = this.f10588b.readInt(DataStoreKey.DEFAULT_REQUEST_BACKOFF_SCALE_FACTOR, 3);
                if (num != null) {
                    iIntValue = num.intValue();
                }
                reentrantLock.unlock();
                return i11;
            }
            iIntValue = mVar.f10279y;
            i11 = iIntValue;
            reentrantLock.unlock();
            return i11;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final int m() {
        int i11;
        int iIntValue;
        ReentrantLock reentrantLock = this.f10589c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.f10591e;
            if (mVar == null) {
                i11 = -1;
                Integer num = this.f10588b.readInt(DataStoreKey.FEATURE_FLAGS_RATE_REFRESH_RATE_LIMIT, -1);
                if (num != null) {
                    iIntValue = num.intValue();
                }
                reentrantLock.unlock();
                return i11;
            }
            iIntValue = mVar.f10268n;
            i11 = iIntValue;
            reentrantLock.unlock();
            return i11;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final int n() {
        int i11;
        int iIntValue;
        ReentrantLock reentrantLock = this.f10589c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.f10591e;
            if (mVar == null) {
                i11 = 30;
                Integer num = this.f10588b.readInt(DataStoreKey.GLOBAL_REQUEST_RATE_LIMITING_CAPACITY, 30);
                if (num != null) {
                    iIntValue = num.intValue();
                }
                reentrantLock.unlock();
                return i11;
            }
            iIntValue = mVar.f10273s;
            i11 = iIntValue;
            reentrantLock.unlock();
            return i11;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final int o() {
        int i11;
        int iIntValue;
        ReentrantLock reentrantLock = this.f10589c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.f10591e;
            if (mVar == null) {
                i11 = 30;
                Integer num = this.f10588b.readInt(DataStoreKey.GLOBAL_REQUEST_RATE_LIMITING_REFILL_RATE, 30);
                if (num != null) {
                    iIntValue = num.intValue();
                }
                reentrantLock.unlock();
                return i11;
            }
            iIntValue = mVar.f10272r;
            i11 = iIntValue;
            reentrantLock.unlock();
            return i11;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final int p() {
        int i11;
        int iIntValue;
        ReentrantLock reentrantLock = this.f10589c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.f10591e;
            if (mVar == null) {
                i11 = 0;
                Integer num = this.f10588b.readInt(DataStoreKey.MAX_BANNER_PLACEMENTS, 0);
                if (num != null) {
                    iIntValue = num.intValue();
                }
                reentrantLock.unlock();
                return i11;
            }
            iIntValue = mVar.H;
            i11 = iIntValue;
            reentrantLock.unlock();
            return i11;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final int q() {
        int i11;
        int iIntValue;
        ReentrantLock reentrantLock = this.f10589c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.f10591e;
            if (mVar == null) {
                i11 = -1;
                Integer num = this.f10588b.readInt(DataStoreKey.GEOFENCES_MAX_NUM_TO_REGISTER, -1);
                if (num != null) {
                    iIntValue = num.intValue();
                }
                reentrantLock.unlock();
                return i11;
            }
            iIntValue = mVar.f10262g;
            i11 = iIntValue;
            reentrantLock.unlock();
            return i11;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final long r() {
        long j9;
        long jLongValue;
        ReentrantLock reentrantLock = this.f10589c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.f10591e;
            if (mVar == null) {
                j9 = -1;
                Long l = this.f10588b.readLong(DataStoreKey.MESSAGING_SESSION_TIMEOUT, -1L);
                if (l != null) {
                    jLongValue = l.longValue();
                }
                reentrantLock.unlock();
                return j9;
            }
            jLongValue = mVar.f10266k;
            j9 = jLongValue;
            reentrantLock.unlock();
            return j9;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final int s() {
        int i11;
        int iIntValue;
        ReentrantLock reentrantLock = this.f10589c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.f10591e;
            if (mVar == null) {
                i11 = -1;
                Integer num = this.f10588b.readInt(DataStoreKey.GEOFENCES_MIN_TIME_REPORT, -1);
                if (num != null) {
                    iIntValue = num.intValue();
                }
                reentrantLock.unlock();
                return i11;
            }
            iIntValue = mVar.f10261f;
            i11 = iIntValue;
            reentrantLock.unlock();
            return i11;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final int t() {
        int i11;
        int iIntValue;
        ReentrantLock reentrantLock = this.f10589c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.f10591e;
            if (mVar == null) {
                i11 = -1;
                Integer num = this.f10588b.readInt(DataStoreKey.GEOFENCES_MIN_TIME_REQUEST, -1);
                if (num != null) {
                    iIntValue = num.intValue();
                }
                reentrantLock.unlock();
                return i11;
            }
            iIntValue = mVar.f10260e;
            i11 = iIntValue;
            reentrantLock.unlock();
            return i11;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final long u() {
        long j9;
        long jLongValue;
        ReentrantLock reentrantLock = this.f10589c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.f10591e;
            if (mVar == null) {
                j9 = 86400;
                Long l = this.f10588b.readLong(DataStoreKey.PUSH_MAX_REDELIVER_BUFFER, 86400L);
                if (l != null) {
                    jLongValue = l.longValue();
                }
                reentrantLock.unlock();
                return j9;
            }
            jLongValue = mVar.f10270p;
            j9 = jLongValue;
            reentrantLock.unlock();
            return j9;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final long v() {
        long j9;
        long jLongValue;
        ReentrantLock reentrantLock = this.f10589c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.f10591e;
            if (mVar == null) {
                j9 = -1;
                Long l = this.f10588b.readLong(DataStoreKey.PUSH_MAX_REDELIVER_DEDUPE_BUFFER, -1L);
                if (l != null) {
                    jLongValue = l.longValue();
                }
                reentrantLock.unlock();
                return j9;
            }
            jLongValue = mVar.f10276v;
            j9 = jLongValue;
            reentrantLock.unlock();
            return j9;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final LinkedHashMap w() {
        String str = "";
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            String string = this.f10588b.readString(DataStoreKey.GLOBAL_REQUEST_RATE_LIMIT_ENDPOINT_OVERRIDES, "");
            if (string != null) {
                str = string;
            }
            if (str.length() != 0) {
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> itKeys = jSONObject.keys();
                itKeys.getClass();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    com.braze.requests.m mVar = com.braze.requests.n.f10447b;
                    next.getClass();
                    com.braze.requests.n nVarA = mVar.a(next);
                    if (nVarA != null) {
                        JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                        linkedHashMap.put(nVarA, new com.braze.models.response.j(jSONObject2.getInt("capacity"), jSONObject2.getInt("refill")));
                    }
                }
            }
            return linkedHashMap;
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new lw.l(0), 4, (Object) null);
            return linkedHashMap;
        }
    }

    public final String y() {
        String string;
        ReentrantLock reentrantLock = this.f10589c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.f10591e;
            if (mVar == null || (string = mVar.A) == null) {
                string = this.f10588b.readString(DataStoreKey.SDK_DEBUGGER_AUTHORIZATION_CODE, null);
            }
            reentrantLock.unlock();
            return string;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final long z() {
        long j9;
        long jLongValue;
        Long l;
        ReentrantLock reentrantLock = this.f10589c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.f10591e;
            if (mVar == null || (l = mVar.B) == null) {
                j9 = -1;
                Long l7 = this.f10588b.readLong(DataStoreKey.SDK_DEBUGGER_EXPIRATION_TIME, -1L);
                if (l7 != null) {
                    jLongValue = l7.longValue();
                }
                reentrantLock.unlock();
                return j9;
            }
            jLongValue = l.longValue();
            j9 = jLongValue;
            reentrantLock.unlock();
            return j9;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public static final String b() {
        return "Attempting to acquire server config lock";
    }

    public static final String a(String str, String str2) {
        return org.bouncycastle.jcajce.provider.asymmetric.a.d("Detected SDK update from '", str, "' -> '", str2, "'. Clearing config update time.");
    }

    public final void a(com.braze.managers.d1 d1Var) throws Throwable {
        d1Var.getClass();
        ReentrantLock reentrantLock = this.f10589c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.f10591e;
            if (mVar != null) {
                mVar.f10280z = d1Var.f9959a;
            }
            if (mVar != null) {
                mVar.C = d1Var.f9962d;
            }
            if (mVar != null) {
                mVar.D = d1Var.f9963e;
            }
            if (mVar != null) {
                mVar.E = d1Var.f9964f;
            }
            String str = d1Var.f9961c;
            if (str != null && mVar != null) {
                mVar.A = str;
            }
            Long l = d1Var.f9960b;
            if (l != null) {
                long jLongValue = l.longValue();
                com.braze.models.response.m mVar2 = this.f10591e;
                if (mVar2 != null) {
                    mVar2.B = Long.valueOf(jLongValue);
                }
            }
            reentrantLock.unlock();
            try {
                com.braze.models.response.m mVar3 = this.f10591e;
                if (mVar3 != null) {
                    LinkedHashMap linkedHashMapF = kotlin.collections.x0.f(new Pair(DataStoreKey.SDK_DEBUGGER_ENABLED.getKey(), Boolean.valueOf(mVar3.f10280z)), new Pair(DataStoreKey.SDK_DEBUGGER_FLUSH_INTERVAL_BYTES.getKey(), Long.valueOf(mVar3.C)), new Pair(DataStoreKey.SDK_DEBUGGER_FLUSH_INTERVAL_SECONDS.getKey(), Long.valueOf(mVar3.D)), new Pair(DataStoreKey.SDK_DEBUGGER_MAX_PAYLOAD_BYTES.getKey(), Long.valueOf(mVar3.E)));
                    Long l7 = mVar3.B;
                    if (l7 != null) {
                        linkedHashMapF.put(DataStoreKey.SDK_DEBUGGER_EXPIRATION_TIME.getKey(), Long.valueOf(l7.longValue()));
                    }
                    String str2 = mVar3.A;
                    if (str2 != null) {
                        linkedHashMapF.put(DataStoreKey.SDK_DEBUGGER_AUTHORIZATION_CODE.getKey(), str2);
                    }
                    this.f10588b.batchUpdate(linkedHashMapF, kotlin.collections.p0.f26531a);
                }
            } catch (Exception e5) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new lw.l(2), 4, (Object) null);
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new jt.g(this, 20), 6, (Object) null);
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public static final String a(i3 i3Var) {
        return "Finishing updating server config to " + i3Var.f10591e;
    }

    public final Pair a() {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.V;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) new lw.l(7), 6, (Object) null);
        if (!this.f10590d.tryLock()) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) new lw.l(8), 6, (Object) null);
            return null;
        }
        return new Pair(Long.valueOf(i()), Boolean.valueOf(i() <= 0));
    }

    public final HashSet a(DataStoreKey dataStoreKey) {
        ArrayList arrayList;
        Collection collection;
        try {
            h3 h3Var = this.f10588b;
            if (dataStoreKey.getType() != DataStoreValueType.LIST) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new h0(dataStoreKey), 12, (Object) null);
                arrayList = new ArrayList();
            } else {
                try {
                    Object data = h3Var.readData(dataStoreKey, "");
                    data.getClass();
                    String str = (String) data;
                    if (StringsKt.H(str)) {
                        arrayList = new ArrayList();
                    } else {
                        DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                        if (StringsKt.H(str) || Intrinsics.areEqual(StringsKt.e0(str).toString(), Address.ADDRESS_NULL_PLACEHOLDER)) {
                            collection = kotlin.collections.n0.f26529a;
                        } else {
                            try {
                                n90.b bVar = n90.c.f30748d;
                                bVar.getClass();
                                collection = (List) bVar.b(new m90.d(m90.r1.f29848a, 0), str);
                            } catch (Exception e5) {
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new com.braze.support.e(str), 4, (Object) null);
                                collection = kotlin.collections.n0.f26529a;
                            }
                        }
                        arrayList = CollectionsKt.t0(collection);
                    }
                } catch (Exception e11) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e11, false, (Function0) new i0(dataStoreKey), 8, (Object) null);
                    arrayList = new ArrayList();
                }
            }
            return CollectionsKt.p0(arrayList);
        } catch (Exception e12) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e12, false, (Function0) new lw.l(6), 4, (Object) null);
            return new HashSet();
        }
    }
}
