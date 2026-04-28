package com.braze.managers;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.events.SessionStateChangedEvent;
import com.braze.storage.l1;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.IntentUtils;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.functions.Function0;
import zendesk.messaging.android.internal.conversationscreen.ConversationTypingEvents;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class w {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f10102n = BrazeLogger.getBrazeLogTag((Class<?>) w.class);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final long f10103o = ConversationTypingEvents.TIME_INTERVAL_IN_MILLIS;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final long f10104p = ConversationTypingEvents.TIME_INTERVAL_IN_MILLIS;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f10105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l1 f10106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.braze.events.d f10107c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.braze.events.e f10108d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AlarmManager f10109e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f10110f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f10111g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ReentrantLock f10112h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f10113i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final u f10114j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public v80.i1 f10115k;
    public com.braze.models.n l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final LinkedHashMap f10116m;

    public w(Context context, l1 l1Var, com.braze.events.d dVar, com.braze.events.e eVar, AlarmManager alarmManager, int i11, boolean z11) {
        context.getClass();
        l1Var.getClass();
        dVar.getClass();
        eVar.getClass();
        alarmManager.getClass();
        this.f10105a = context;
        this.f10106b = l1Var;
        this.f10107c = dVar;
        this.f10108d = eVar;
        this.f10109e = alarmManager;
        this.f10110f = i11;
        this.f10111g = z11;
        this.f10112h = new ReentrantLock();
        this.f10115k = v80.f0.c();
        this.f10116m = new LinkedHashMap();
        u uVar = new u(this);
        this.f10114j = uVar;
        String strL = r8.k.l(context.getPackageName(), ".intent.BRAZE_SESSION_SHOULD_SEAL");
        this.f10113i = strL;
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver(uVar, new IntentFilter(strL), 2);
            } else {
                context.registerReceiver(uVar, new IntentFilter(strL));
            }
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new zv.s(1, this), 4, (Object) null);
            this.f10114j = null;
        }
    }

    public static final String d(com.braze.models.n nVar) {
        return "Session [" + nVar.f() + "] being sealed because its end time is over the grace period. Session: " + nVar;
    }

    public static final String f(com.braze.models.n nVar) {
        return "Closed session with id " + nVar.f();
    }

    public static final String k() {
        return "Getting the stored open session";
    }

    public static final String n() {
        return "Failed to unregister session seal receiver.";
    }

    public static final String q() {
        return "At least one session context is open. Calling startSession.";
    }

    public static final String r() {
        return "No session contexts are open. Calling stopSession.";
    }

    public final void a(String str, boolean z11) {
        str.getClass();
        ReentrantLock reentrantLock = this.f10112h;
        reentrantLock.lock();
        int i11 = z11 ? 1 : -1;
        try {
            Object obj = this.f10116m.get(str);
            int iIntValue = 0;
            if (obj == null) {
                obj = 0;
            }
            this.f10116m.put(str, Integer.valueOf(((Number) obj).intValue() + i11));
            Collection collectionValues = this.f10116m.values();
            collectionValues.getClass();
            Iterator it = collectionValues.iterator();
            while (it.hasNext()) {
                iIntValue += ((Number) it.next()).intValue();
            }
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.Priority priority = BrazeLogger.Priority.V;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) new a3.l0(iIntValue, this, 13), 6, (Object) null);
            if (iIntValue > 0) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) new zv.r(12), 6, (Object) null);
                o();
            } else {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) new zv.r(13), 6, (Object) null);
                p();
            }
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final void b() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new zv.r(15), 7, (Object) null);
        try {
            Intent intent = new Intent(this.f10113i);
            intent.putExtra("session_id", String.valueOf(this.l));
            this.f10109e.cancel(PendingIntent.getBroadcast(this.f10105a, 0, intent, IntentUtils.getImmutablePendingIntentFlags() | 1073741824));
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new zv.r(8), 4, (Object) null);
        }
    }

    public final void c(String str) {
        if (str != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new xv.a(str, 22), 6, (Object) null);
            a(str, true);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new zv.r(9), 6, (Object) null);
            a("$/! global session context sentinel", true);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new zv.s(0, this), 6, (Object) null);
    }

    public final void e() {
        com.braze.models.n nVar = this.l;
        if (nVar != null) {
            int i11 = this.f10110f;
            boolean z11 = this.f10111g;
            long j9 = i11;
            TimeUnit timeUnit = TimeUnit.SECONDS;
            long millis = timeUnit.toMillis(j9);
            if (z11) {
                millis = Math.max(f10104p, (timeUnit.toMillis((long) nVar.f10212b) + millis) - DateTimeUtils.nowInMilliseconds());
            }
            long j11 = millis;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new dw.b(j11, 14), 7, (Object) null);
            try {
                Intent intent = new Intent(this.f10113i);
                intent.putExtra("session_id", nVar.toString());
                this.f10109e.set(1, DateTimeUtils.nowInMilliseconds() + j11, PendingIntent.getBroadcast(this.f10105a, 0, intent, IntentUtils.getImmutablePendingIntentFlags() | 1073741824));
            } catch (Exception e5) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new zv.r(14), 4, (Object) null);
            }
        }
    }

    public final boolean g() throws Throwable {
        ReentrantLock reentrantLock = this.f10112h;
        reentrantLock.lock();
        try {
            j();
            com.braze.models.n nVar = this.l;
            boolean z11 = true;
            if (nVar == null || nVar.f10214d) {
                i();
                if (nVar != null && nVar.f10214d) {
                    try {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new zv.t(nVar, 4), 7, (Object) null);
                        this.f10106b.a(nVar.f10211a.f10216b);
                    } catch (Throwable th2) {
                        th = th2;
                        reentrantLock.unlock();
                        throw th;
                    }
                }
                reentrantLock.unlock();
                return z11;
            }
            if (nVar.f10213c != null) {
                nVar.f10213c = null;
            } else {
                z11 = false;
            }
            reentrantLock.unlock();
            return z11;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final com.braze.models.q h() {
        ReentrantLock reentrantLock = this.f10112h;
        reentrantLock.lock();
        try {
            j();
            com.braze.models.n nVar = this.l;
            return nVar != null ? nVar.f10211a : null;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void i() {
        com.braze.models.n nVar = new com.braze.models.n();
        this.l = nVar;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new zv.t(nVar, 0), 6, (Object) null);
        this.f10107c.b(new com.braze.events.internal.y(nVar), com.braze.events.internal.y.class);
        ((com.braze.events.d) this.f10108d).b(new SessionStateChangedEvent(nVar.f10211a.f10216b, SessionStateChangedEvent.ChangeType.SESSION_STARTED), SessionStateChangedEvent.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x009e A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:3:0x0007, B:5:0x000c, B:7:0x0025, B:11:0x0039, B:12:0x003b, B:14:0x003f, B:16:0x0053, B:18:0x0057, B:20:0x006e, B:25:0x0086, B:27:0x009e, B:29:0x00a2, B:23:0x007c), top: B:34:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j() {
        /*
            r16 = this;
            r1 = r16
            java.util.concurrent.locks.ReentrantLock r8 = r1.f10112h
            r8.lock()
            com.braze.models.n r0 = r1.l     // Catch: java.lang.Throwable -> L35
            r9 = 0
            if (r0 != 0) goto L3b
            com.braze.support.BrazeLogger r0 = com.braze.support.BrazeLogger.INSTANCE     // Catch: java.lang.Throwable -> L35
            zv.r r5 = new zv.r     // Catch: java.lang.Throwable -> L35
            r2 = 10
            r5.<init>(r2)     // Catch: java.lang.Throwable -> L35
            r6 = 7
            r7 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            com.braze.support.BrazeLogger.brazelog$default(r0, r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L35
            com.braze.storage.l1 r0 = r1.f10106b     // Catch: java.lang.Throwable -> L35
            com.braze.models.p r0 = r0.c()     // Catch: java.lang.Throwable -> L35
            if (r0 == 0) goto L38
            com.braze.models.n r2 = new com.braze.models.n     // Catch: java.lang.Throwable -> L35
            com.braze.models.q r3 = r0.f10211a     // Catch: java.lang.Throwable -> L35
            double r4 = r0.f10212b     // Catch: java.lang.Throwable -> L35
            java.lang.Double r6 = r0.e()     // Catch: java.lang.Throwable -> L35
            boolean r7 = r0.f10214d     // Catch: java.lang.Throwable -> L35
            r2.<init>(r3, r4, r6, r7)     // Catch: java.lang.Throwable -> L35
            goto L39
        L35:
            r0 = move-exception
            goto Laf
        L38:
            r2 = r9
        L39:
            r1.l = r2     // Catch: java.lang.Throwable -> L35
        L3b:
            com.braze.models.n r10 = r1.l     // Catch: java.lang.Throwable -> L35
            if (r10 == 0) goto Lab
            com.braze.support.BrazeLogger r0 = com.braze.support.BrazeLogger.INSTANCE     // Catch: java.lang.Throwable -> L35
            zv.t r5 = new zv.t     // Catch: java.lang.Throwable -> L35
            r2 = 1
            r5.<init>(r10, r2)     // Catch: java.lang.Throwable -> L35
            r6 = 7
            r7 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            com.braze.support.BrazeLogger.brazelog$default(r0, r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L35
            java.lang.Double r2 = r10.f10213c     // Catch: java.lang.Throwable -> L35
            if (r2 == 0) goto Lab
            boolean r3 = r10.f10214d     // Catch: java.lang.Throwable -> L35
            if (r3 != 0) goto Lab
            double r3 = r10.f10212b     // Catch: java.lang.Throwable -> L35
            double r5 = r2.doubleValue()     // Catch: java.lang.Throwable -> L35
            int r2 = r1.f10110f     // Catch: java.lang.Throwable -> L35
            boolean r7 = r1.f10111g     // Catch: java.lang.Throwable -> L35
            long r11 = com.braze.support.DateTimeUtils.nowInMilliseconds()     // Catch: java.lang.Throwable -> L35
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L35
            long r14 = (long) r2     // Catch: java.lang.Throwable -> L35
            long r14 = r13.toMillis(r14)     // Catch: java.lang.Throwable -> L35
            if (r7 == 0) goto L7c
            long r2 = (long) r3     // Catch: java.lang.Throwable -> L35
            long r2 = r13.toMillis(r2)     // Catch: java.lang.Throwable -> L35
            long r2 = r2 + r14
            long r4 = com.braze.managers.w.f10104p     // Catch: java.lang.Throwable -> L35
            long r2 = r2 + r4
            int r2 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r2 > 0) goto Lab
            goto L86
        L7c:
            long r2 = (long) r5     // Catch: java.lang.Throwable -> L35
            long r2 = r13.toMillis(r2)     // Catch: java.lang.Throwable -> L35
            long r2 = r2 + r14
            int r2 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r2 > 0) goto Lab
        L86:
            com.braze.support.BrazeLogger$Priority r2 = com.braze.support.BrazeLogger.Priority.I     // Catch: java.lang.Throwable -> L35
            zv.t r5 = new zv.t     // Catch: java.lang.Throwable -> L35
            r3 = 2
            r5.<init>(r10, r3)     // Catch: java.lang.Throwable -> L35
            r6 = 6
            r7 = 0
            r3 = 0
            r4 = 0
            com.braze.support.BrazeLogger.brazelog$default(r0, r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L35
            r1.l()     // Catch: java.lang.Throwable -> L35
            com.braze.storage.l1 r0 = r1.f10106b     // Catch: java.lang.Throwable -> L35
            com.braze.models.n r2 = r1.l     // Catch: java.lang.Throwable -> L35
            if (r2 == 0) goto La1
            com.braze.models.q r2 = r2.f10211a     // Catch: java.lang.Throwable -> L35
            goto La2
        La1:
            r2 = r9
        La2:
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> L35
            r0.a(r2)     // Catch: java.lang.Throwable -> L35
            r1.l = r9     // Catch: java.lang.Throwable -> L35
        Lab:
            r8.unlock()
            return
        Laf:
            r8.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.managers.w.j():void");
    }

    public final void l() {
        com.braze.models.n nVar = this.l;
        if (nVar != null) {
            ReentrantLock reentrantLock = this.f10112h;
            reentrantLock.lock();
            try {
                nVar.f10214d = true;
                nVar.f10213c = Double.valueOf(DateTimeUtils.nowInSecondsPrecise());
                this.f10106b.a(nVar);
                this.f10107c.b(new com.braze.events.internal.z(nVar), com.braze.events.internal.z.class);
                ((com.braze.events.d) this.f10108d).b(new SessionStateChangedEvent(nVar.f10211a.f10216b, SessionStateChangedEvent.ChangeType.SESSION_ENDED), SessionStateChangedEvent.class);
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new zv.t(nVar, 5), 6, (Object) null);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final void m() {
        try {
            u uVar = this.f10114j;
            if (uVar != null) {
                this.f10105a.unregisterReceiver(uVar);
            }
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new zv.r(11), 4, (Object) null);
        }
    }

    public final void o() {
        com.braze.models.n nVar;
        ReentrantLock reentrantLock = this.f10112h;
        reentrantLock.lock();
        try {
            if (g() && (nVar = this.l) != null) {
                this.f10106b.a(nVar);
            }
            this.f10115k.a(null);
            b();
            this.f10107c.b(com.braze.events.internal.a0.f9781a, com.braze.events.internal.a0.class);
            reentrantLock.unlock();
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new zv.s(4, this), 6, (Object) null);
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final void p() {
        ReentrantLock reentrantLock = this.f10112h;
        reentrantLock.lock();
        try {
            g();
            com.braze.models.n nVar = this.l;
            if (nVar != null) {
                nVar.f10213c = Double.valueOf(DateTimeUtils.nowInSecondsPrecise());
                this.f10106b.a(nVar);
                this.f10115k.a(null);
                this.f10115k = v80.f0.B(BrazeCoroutineScope.INSTANCE, null, null, new v(this, null), 3);
                e();
                this.f10107c.b(com.braze.events.internal.b0.f9782a, com.braze.events.internal.b0.class);
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new zv.t(nVar, 3), 7, (Object) null);
            }
            reentrantLock.unlock();
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new zv.s(3, this), 6, (Object) null);
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public static final String f() {
        return "Failed to create session seal alarm";
    }

    public static final String d(w wVar) {
        return "Completed the startSession call. Current session: " + wVar.h();
    }

    public static final String d(String str) {
        return e0.f.k("Attempting to open session with context: ", str);
    }

    public static final String d() {
        return "Failed to cancel session seal alarm";
    }

    public static final String c(w wVar) {
        return "Completed the attemptToOpenSession call. Current session: " + wVar.h();
    }

    public static final String c(com.braze.models.n nVar) {
        return "Checking if this session needs to be sealed: " + nVar.f();
    }

    public static final String c() {
        return "Cancelling session seal alarm";
    }

    public static final String b(w wVar) {
        return "Completed the attemptToCloseSession call. Current session: " + wVar.h();
    }

    public static final String b(com.braze.models.n nVar) {
        return "New session created with ID: " + nVar.f();
    }

    public static final String b(String str) {
        return e0.f.k("Attempting to close session with context: ", str);
    }

    public static final String e(com.braze.models.n nVar) {
        return "Sealed session with id " + nVar.f();
    }

    public static final String e(w wVar) {
        return "Completed the stopSession call. Current session: " + wVar.h();
    }

    public static final String a() {
        return "Opening a session with a global context identifier.";
    }

    public final void a(String str) {
        str.getClass();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.V;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) new xv.a(str, 21), 6, (Object) null);
        a(str, false);
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) new zv.s(2, this), 6, (Object) null);
    }

    public static final String a(w wVar) {
        return e0.f.k("Failed to register dynamic receiver for ", wVar.f10113i);
    }

    public static final String a(int i11, w wVar) {
        return "Session context identifier map updated. sum: " + i11 + " map: " + wVar.f10116m;
    }

    public static final String a(com.braze.models.n nVar) {
        return "Clearing completely dispatched sealed session " + nVar.f();
    }

    public static final String a(long j9) {
        return w2.l1.e("Creating a session seal alarm with a delay of ", j9, " ms");
    }
}
