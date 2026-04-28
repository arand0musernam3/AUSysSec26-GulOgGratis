package com.braze.managers;

import android.content.Context;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.enums.DataStoreKey;
import com.braze.events.IEventSubscriber;
import com.braze.events.internal.a0;
import com.braze.events.internal.b0;
import com.braze.managers.g0;
import com.braze.storage.i3;
import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class g0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final long f9970i = 3000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i3 f9971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.braze.events.d f9972b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.braze.communication.dust.j f9973c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.braze.requests.util.c f9974d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.braze.storage.b1 f9975e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public v80.i1 f9976f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public v80.i1 f9977g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f9978h;

    public g0(Context context, String str, String str2, i3 i3Var, com.braze.events.d dVar, com.braze.communication.dust.j jVar, com.braze.requests.util.c cVar) {
        context.getClass();
        str2.getClass();
        i3Var.getClass();
        dVar.getClass();
        jVar.getClass();
        cVar.getClass();
        this.f9971a = i3Var;
        this.f9972b = dVar;
        this.f9973c = jVar;
        this.f9974d = cVar;
        this.f9975e = new com.braze.storage.b1(context, str, str2);
        final int i11 = 0;
        dVar.c(com.braze.events.internal.a0.class, new IEventSubscriber(this) { // from class: zv.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g0 f48117b;

            {
                this.f48117b = this;
            }

            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                switch (i11) {
                    case 0:
                        g0.a(this.f48117b, (a0) obj);
                        break;
                    case 1:
                        g0.a(this.f48117b, (b0) obj);
                        break;
                    case 2:
                        g0.a(this.f48117b, (com.braze.events.internal.o) obj);
                        break;
                    default:
                        g0.a(this.f48117b, (com.braze.events.internal.h) obj);
                        break;
                }
            }
        });
        final int i12 = 1;
        dVar.c(com.braze.events.internal.b0.class, new IEventSubscriber(this) { // from class: zv.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g0 f48117b;

            {
                this.f48117b = this;
            }

            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                switch (i12) {
                    case 0:
                        g0.a(this.f48117b, (a0) obj);
                        break;
                    case 1:
                        g0.a(this.f48117b, (b0) obj);
                        break;
                    case 2:
                        g0.a(this.f48117b, (com.braze.events.internal.o) obj);
                        break;
                    default:
                        g0.a(this.f48117b, (com.braze.events.internal.h) obj);
                        break;
                }
            }
        });
        final int i13 = 2;
        dVar.c(com.braze.events.internal.o.class, new IEventSubscriber(this) { // from class: zv.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g0 f48117b;

            {
                this.f48117b = this;
            }

            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                switch (i13) {
                    case 0:
                        g0.a(this.f48117b, (a0) obj);
                        break;
                    case 1:
                        g0.a(this.f48117b, (b0) obj);
                        break;
                    case 2:
                        g0.a(this.f48117b, (com.braze.events.internal.o) obj);
                        break;
                    default:
                        g0.a(this.f48117b, (com.braze.events.internal.h) obj);
                        break;
                }
            }
        });
        final int i14 = 3;
        dVar.c(com.braze.events.internal.h.class, new IEventSubscriber(this) { // from class: zv.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g0 f48117b;

            {
                this.f48117b = this;
            }

            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                switch (i14) {
                    case 0:
                        g0.a(this.f48117b, (a0) obj);
                        break;
                    case 1:
                        g0.a(this.f48117b, (b0) obj);
                        break;
                    case 2:
                        g0.a(this.f48117b, (com.braze.events.internal.o) obj);
                        break;
                    default:
                        g0.a(this.f48117b, (com.braze.events.internal.h) obj);
                        break;
                }
            }
        });
    }

    public static final String c(long j9) {
        return l1.e("Scheduling stream reconnection in ", j9, " ms");
    }

    public static final String d() {
        return "Cancelling ending of DUST subscription on delay and resuming stream";
    }

    public static final String e() {
        return "Ending DUST subscription on a delay";
    }

    public static final String f() {
        return "Received dust config. Starting/resuming a new subscription";
    }

    public static final String h() {
        return "Connection attempt succeeded. Resetting attempts to 0";
    }

    public static final String i() {
        return "Max reconnect attempts reached. Not starting DUST subscription.";
    }

    public final void a(boolean z11) {
        v80.i1 i1Var = this.f9977g;
        String str = null;
        if (i1Var != null) {
            i1Var.a(null);
        }
        if (this.f9978h > 10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new zv.b(27), 7, (Object) null);
            return;
        }
        String string = this.f9975e.readString(DataStoreKey.MITE_KEY, "");
        if (string == null || string.length() == 0) {
            string = null;
        }
        String string2 = this.f9975e.readString(DataStoreKey.DUST_HOST, "");
        if (string2 == null || string2.length() == 0) {
            string2 = null;
        }
        String string3 = this.f9975e.readString(DataStoreKey.DUST_AUTH, "");
        if (string3 == null || string3.length() == 0) {
            string3 = null;
        }
        String string4 = this.f9975e.readString(DataStoreKey.DUST_RCS, "");
        if (string4 != null && string4.length() != 0) {
            str = string4;
        }
        if (string == null || string2 == null || string3 == null || !this.f9971a.F()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new yi.f(2, string, string2, string3, this), 7, (Object) null);
            return;
        }
        String strA = a0.a(string2, string, string3, str, this.f9978h);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new bg.b(z11, string, strA, 7), 7, (Object) null);
        ((com.braze.communication.dust.i) this.f9973c).a(strA, new d0(this), new e0(this), new f0(this), z11);
    }

    public final void b(long j9) {
        v80.i1 i1Var = this.f9977g;
        if (i1Var != null) {
            i1Var.a(null);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new dw.b(j9, 7), 6, (Object) null);
        this.f9977g = BrazeCoroutineScope.launchDelayed$default(BrazeCoroutineScope.INSTANCE, Long.valueOf(j9), null, new c0(this, j9, null), 2, null);
    }

    public final void g() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new zv.f(1), 7, (Object) null);
        this.f9978h = 0;
        ((com.braze.requests.util.b) this.f9974d).f10478f = 0;
    }

    public static final String c() {
        return "Saving rcs value from TTL message";
    }

    public static final String b(com.braze.models.dust.g gVar) {
        return "Ingesting DUST message of type " + gVar.a() + "\n" + gVar;
    }

    public static final String b() {
        return "Ending DUST subscription";
    }

    public static final String b(Integer num) {
        return "Not scheduling dust reconnect for non-retriable response code: " + num;
    }

    public final void a(com.braze.models.dust.c cVar) {
        if (cVar == null) {
            return;
        }
        String str = cVar.f10142b;
        if (str != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new zv.b(29), 7, (Object) null);
            this.f9975e.writeData(DataStoreKey.DUST_RCS, str);
        }
        Long l = cVar.f10141a;
        if (l != null) {
            long jLongValue = l.longValue();
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new dw.b(jLongValue, 6), 7, (Object) null);
            b(jLongValue);
        }
    }

    public static final void a(g0 g0Var, com.braze.events.internal.a0 a0Var) {
        a0Var.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) g0Var, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new zv.f(2), 7, (Object) null);
        v80.i1 i1Var = g0Var.f9976f;
        if (i1Var != null) {
            i1Var.a(null);
        }
        g0Var.a(true);
    }

    public static final void a(g0 g0Var, com.braze.events.internal.b0 b0Var) {
        b0Var.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) g0Var, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new zv.b(28), 7, (Object) null);
        g0Var.f9976f = BrazeCoroutineScope.launchDelayed$default(BrazeCoroutineScope.INSTANCE, Long.valueOf(f9970i), null, new z(g0Var, null), 2, null);
    }

    public static final void a(g0 g0Var, com.braze.events.internal.o oVar) {
        oVar.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) g0Var, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new iw.f(oVar, 1), 7, (Object) null);
        com.braze.enums.e eVar = oVar.f9818b;
        com.braze.enums.e eVar2 = com.braze.enums.e.NONE;
        if (eVar == eVar2) {
            g0Var.a();
        } else if (oVar.f9817a == eVar2) {
            g0Var.a(true);
        }
    }

    public static final String a(com.braze.events.internal.o oVar) {
        return "Got network change event: " + oVar;
    }

    public static final void a(g0 g0Var, com.braze.events.internal.h hVar) {
        hVar.getClass();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) g0Var, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new zv.f(0), 7, (Object) null);
        com.braze.storage.b1 b1Var = g0Var.f9975e;
        DataStoreKey dataStoreKey = DataStoreKey.MITE_KEY;
        String string = b1Var.readString(dataStoreKey, "");
        if (string == null || string.length() == 0) {
            string = null;
        }
        BrazeLogger.brazelog$default(brazeLogger, (Object) g0Var, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new zendesk.ui.android.conversation.textcell.c(hVar, 5), 7, (Object) null);
        String str = hVar.f9805a;
        if (str != null) {
            g0Var.f9975e.writeData(dataStoreKey, str);
        }
        String str2 = hVar.f9806b;
        if (str2 != null) {
            g0Var.f9975e.writeData(DataStoreKey.DUST_HOST, str2);
        }
        String str3 = hVar.f9807c;
        if (str3 != null) {
            g0Var.f9975e.writeData(DataStoreKey.DUST_AUTH, str3);
        }
        g0Var.a(Intrinsics.areEqual(string, hVar.f9805a));
    }

    public static final String a(com.braze.events.internal.h hVar) {
        return j4.s.k("Setting dust config: mite=", hVar.b(), ", host=", hVar.a());
    }

    public final void a(com.braze.models.dust.b bVar) {
        g0 g0Var;
        if (bVar == null) {
            return;
        }
        String str = bVar.f10139b;
        if (str != null) {
            g0Var = this;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) g0Var, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new xv.a(str, 5), 6, (Object) null);
        } else {
            g0Var = this;
        }
        ((com.braze.communication.dust.i) g0Var.f9973c).b();
        v80.i1 i1Var = g0Var.f9977g;
        if (i1Var != null) {
            i1Var.a(null);
        }
        BrazeCoroutineScope brazeCoroutineScope = BrazeCoroutineScope.INSTANCE;
        long j9 = bVar.f10138a;
        com.braze.requests.util.b bVar2 = (com.braze.requests.util.b) g0Var.f9974d;
        g0Var.f9977g = BrazeCoroutineScope.launchDelayed$default(brazeCoroutineScope, Long.valueOf(j9 + ((long) bVar2.a(bVar2.f10474b))), null, new b0(this, null), 2, null);
    }

    public static final String a(String str, String str2, String str3, g0 g0Var) {
        boolean z11 = str3 != null;
        boolean zF = g0Var.f9971a.F();
        StringBuilder sbT = e0.f.t("Cannot start dust subscription: mite=", str, ", host=", str2, ", auth=");
        sbT.append(z11);
        sbT.append(", enabled=");
        sbT.append(zF);
        return sbT.toString();
    }

    public static final String a(boolean z11, String str, String str2) {
        return "Starting (resume = " + z11 + ") DUST subscription for mite: " + str + " to url: " + str2;
    }

    public final void a() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new zv.b(26), 7, (Object) null);
        v80.i1 i1Var = this.f9977g;
        if (i1Var != null) {
            i1Var.a(null);
        }
        this.f9977g = null;
        ((com.braze.communication.dust.i) this.f9973c).b();
    }

    public final void a(com.braze.models.dust.g gVar) {
        gVar.getClass();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new zendesk.ui.android.conversation.textcell.c(gVar, 6), 7, (Object) null);
        com.braze.models.dust.f fVarA = gVar.a();
        int iOrdinal = fVarA.ordinal();
        if (iOrdinal == 1) {
            com.braze.events.d dVar = this.f9972b;
            com.braze.requests.c cVar = com.braze.requests.c.SESSION_START;
            dVar.b(new com.braze.events.internal.e(), com.braze.events.internal.e.class);
            return;
        }
        if (iOrdinal == 2) {
            a(gVar instanceof com.braze.models.dust.c ? (com.braze.models.dust.c) gVar : null);
        } else if (iOrdinal != 3) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new zendesk.ui.android.conversation.textcell.c(fVarA, 7), 6, (Object) null);
        } else {
            a(gVar instanceof com.braze.models.dust.b ? (com.braze.models.dust.b) gVar : null);
        }
    }

    public static final String a(com.braze.models.dust.f fVar) {
        return "Lacked logic to ingest message! Type: " + fVar;
    }

    public static final String a(long j9) {
        return l1.e("Scheduling reconnection in ", j9, "ms");
    }

    public static final String a(String str) {
        return e0.f.k("Received disconnect and retry request. Reason: ", str);
    }

    public final void a(Integer num) {
        int iIntValue;
        this.f9978h++;
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new yl.e(15, this, num), 7, (Object) null);
        v80.i1 i1Var = this.f9977g;
        if (i1Var != null) {
            i1Var.a(null);
        }
        IntRange intRange = com.braze.communication.dust.i.f9630g;
        if (num != null && intRange.f26553a <= (iIntValue = num.intValue()) && iIntValue <= intRange.f26554b) {
            com.braze.requests.util.b bVar = (com.braze.requests.util.b) this.f9974d;
            b(bVar.a(bVar.f10474b));
        } else {
            IntRange intRange2 = com.braze.communication.dust.i.f9629f;
            if (num != null) {
                intRange2.getClass();
            }
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new com.braze.ui.inappmessage.c(num, 1), 7, (Object) null);
        }
    }

    public static final String a(g0 g0Var, Integer num) {
        return "Connection attempt failed. Attempts now at: " + g0Var.f9978h + ". Response code: " + num;
    }
}
