package com.braze.dispatch;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build;
import com.braze.Braze;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.dispatch.f;
import com.braze.events.IEventSubscriber;
import com.braze.events.internal.b0;
import com.braze.events.internal.o;
import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import v80.f0;
import v80.i1;
import w.a0;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f9683m = BrazeLogger.getBrazeLogTag((Class<?>) f.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f9684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.braze.events.d f9685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f9686c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f9687d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f9688e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public com.braze.enums.f f9689f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f9690g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile boolean f9691h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ConnectivityManager f9692i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public com.braze.enums.e f9693j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public i1 f9694k;
    public boolean l;

    public f(Context context, com.braze.events.d dVar, a aVar) {
        context.getClass();
        dVar.getClass();
        aVar.getClass();
        this.f9684a = context;
        this.f9685b = dVar;
        this.f9686c = aVar;
        this.f9689f = com.braze.enums.f.NO_SESSION;
        this.f9690g = -1L;
        Object systemService = context.getSystemService("connectivity");
        systemService.getClass();
        this.f9692i = (ConnectivityManager) systemService;
        this.f9693j = com.braze.enums.e.GOOD;
        if (Build.VERSION.SDK_INT >= 30) {
            this.f9688e = new b(this);
        } else {
            this.f9687d = new d(this);
        }
        a(dVar);
    }

    public static final String d(f fVar) {
        return l1.e("Flush interval was too low (", fVar.f9690g, "), moving to minimum of 1000 ms");
    }

    public static final String e() {
        return "Data sync started";
    }

    public static final String g() {
        return "The data sync policy is not running. Ignoring request.";
    }

    public static final String h() {
        return "Data sync stopped";
    }

    public static final String j() {
        return "Failed to unregister Connectivity callback";
    }

    public final i1 a(long j9) {
        if (this.f9690g >= 1000) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new tv.b(j9, this, 0), 6, (Object) null);
            return f0.B(BrazeCoroutineScope.INSTANCE, null, null, new e(this, j9, null), 3);
        }
        Braze.INSTANCE.getInstance(this.f9684a).requestImmediateDataFlush();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new tv.c(this, 0), 7, (Object) null);
        return null;
    }

    public final void b() {
        long j9;
        int intValue;
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.V;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) new tv.c(this, 1), 6, (Object) null);
        long j11 = this.f9690g;
        if (this.f9689f == com.braze.enums.f.NO_SESSION || this.l) {
            this.f9690g = -1L;
        } else {
            int iOrdinal = this.f9693j.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    a aVar = this.f9686c;
                    aVar.getClass();
                    com.braze.configuration.b bVar = com.braze.configuration.b.DEVICE_OBJECT_ALLOWLIST_VALUE;
                    intValue = aVar.getIntValue("com_braze_data_flush_interval_bad_network", 60);
                } else if (iOrdinal == 2) {
                    a aVar2 = this.f9686c;
                    aVar2.getClass();
                    com.braze.configuration.b bVar2 = com.braze.configuration.b.DEVICE_OBJECT_ALLOWLIST_VALUE;
                    intValue = aVar2.getIntValue("com_braze_data_flush_interval_good_network", 30);
                } else {
                    if (iOrdinal != 3) {
                        e40.a.f();
                        return;
                    }
                    a aVar3 = this.f9686c;
                    aVar3.getClass();
                    com.braze.configuration.b bVar3 = com.braze.configuration.b.DEVICE_OBJECT_ALLOWLIST_VALUE;
                    intValue = aVar3.getIntValue("com_braze_data_flush_interval_great_network", 10);
                }
                j9 = ((long) intValue) * 1000;
            } else {
                j9 = -1;
            }
            this.f9690g = j9;
            if (j9 != -1 && j9 < 1000) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new tv.c(this, 2), 6, (Object) null);
                this.f9690g = 1000L;
            }
        }
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) new tv.c(this, 3), 6, (Object) null);
        if (j11 != this.f9690g) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new tv.b(j11, this, 1), 7, (Object) null);
            b(this.f9690g);
        }
    }

    public final synchronized void c() {
        if (this.f9691h) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new tr.e(10), 7, (Object) null);
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new tr.e(11), 7, (Object) null);
        if (Build.VERSION.SDK_INT >= 30) {
            ConnectivityManager connectivityManager = this.f9692i;
            b bVar = this.f9688e;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("connectivityNetworkCallback");
                bVar = null;
            }
            connectivityManager.registerDefaultNetworkCallback(bVar);
            a(this.f9692i.getNetworkCapabilities(this.f9692i.getActiveNetwork()));
        } else {
            this.f9684a.registerReceiver(this.f9687d, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
        b(this.f9690g);
        this.f9691h = true;
    }

    public final synchronized void f() {
        if (!this.f9691h) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new tr.e(12), 7, (Object) null);
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new tr.e(13), 7, (Object) null);
        i1 i1Var = this.f9694k;
        if (i1Var != null) {
            i1Var.a(null);
        }
        this.f9694k = null;
        i();
        this.f9691h = false;
    }

    public final void i() {
        try {
            if (Build.VERSION.SDK_INT < 30) {
                this.f9684a.unregisterReceiver(this.f9687d);
                return;
            }
            ConnectivityManager connectivityManager = this.f9692i;
            b bVar = this.f9688e;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("connectivityNetworkCallback");
                bVar = null;
            }
            connectivityManager.unregisterNetworkCallback(bVar);
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new tr.e(9), 4, (Object) null);
        }
    }

    public static final String d() {
        return "The data sync policy is already running. Ignoring request.";
    }

    public static final String a(long j9, f fVar) {
        return a0.j(fVar.f9690g, " ms", l1.g("Kicking off the Sync Job. initialDelaysMs: ", j9, ": currentIntervalMs "));
    }

    public static final String a(f fVar) {
        return l1.e("Data flush interval is ", fVar.f9690g, " ms. Not scheduling a proceeding data flush.");
    }

    public final void a(com.braze.events.d dVar, Exception exc) {
        try {
            dVar.b(exc, Throwable.class);
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new tr.e(8), 4, (Object) null);
        }
    }

    public static final String a() {
        return "Failed to log throwable.";
    }

    public final void a(NetworkCapabilities networkCapabilities) {
        com.braze.enums.e eVar = this.f9693j;
        com.braze.enums.e eVarA = com.braze.support.c.a(networkCapabilities);
        this.f9693j = eVarA;
        if (eVar != eVarA) {
            this.f9685b.b(new o(eVar, eVarA), o.class);
        }
        b();
    }

    public final void a(com.braze.events.d dVar) {
        dVar.getClass();
        final int i11 = 1;
        dVar.c(com.braze.events.internal.a0.class, new IEventSubscriber(this) { // from class: tv.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f40476b;

            {
                this.f40476b = this;
            }

            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                switch (i11) {
                    case 0:
                        f.a(this.f40476b, (b0) obj);
                        break;
                    default:
                        f.a(this.f40476b, (com.braze.events.internal.a0) obj);
                        break;
                }
            }
        });
        final int i12 = 0;
        dVar.c(b0.class, new IEventSubscriber(this) { // from class: tv.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f40476b;

            {
                this.f40476b = this;
            }

            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                switch (i12) {
                    case 0:
                        f.a(this.f40476b, (b0) obj);
                        break;
                    default:
                        f.a(this.f40476b, (com.braze.events.internal.a0) obj);
                        break;
                }
            }
        });
    }

    public static final void a(f fVar, com.braze.events.internal.a0 a0Var) {
        a0Var.getClass();
        fVar.f9689f = com.braze.enums.f.OPEN_SESSION;
        fVar.b();
    }

    public static final void a(f fVar, b0 b0Var) {
        b0Var.getClass();
        fVar.f9689f = com.braze.enums.f.NO_SESSION;
        fVar.b();
    }

    public static final String c(long j9) {
        return l1.e("Posting new sync runnable with delay ", j9, " ms");
    }

    public static final String c(f fVar) {
        return "recalculateDispatchState called with session state: " + fVar.f9689f + " lastNetworkLevel: " + fVar.f9693j;
    }

    public final void b(long j9) {
        i1 i1Var = this.f9694k;
        if (i1Var != null) {
            i1Var.a(null);
        }
        this.f9694k = null;
        if (this.f9690g >= 1000) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new dw.b(j9, 3), 7, (Object) null);
            this.f9694k = a(j9);
        }
    }

    public static final String b(f fVar) {
        return e0.f.i(fVar.f9690g, "currentIntervalMs: ");
    }

    public static final String b(long j9, f fVar) {
        long j11 = fVar.f9690g;
        com.braze.enums.e eVar = fVar.f9693j;
        com.braze.enums.f fVar2 = fVar.f9689f;
        StringBuilder sbG = l1.g("Data flush interval has changed from ", j9, " ms to ");
        sbG.append(j11);
        sbG.append(" ms after connectivity state change to: ");
        sbG.append(eVar);
        sbG.append(" and session state: ");
        sbG.append(fVar2);
        return sbG.toString();
    }
}
