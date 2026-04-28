package qz;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.SparseIntArray;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.measurement.w5;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import zendesk.messaging.android.internal.conversationscreen.ConversationTypingEvents;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class g implements Handler.Callback {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Status f37332p = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Status f37333q = new Status(4, "The user must be signed in to make this API call.", null, null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Object f37334r = new Object();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static g f37335s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f37336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f37337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.google.android.gms.common.internal.t f37338c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public sz.b f37339d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f37340e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final GoogleApiAvailability f37341f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w2.z f37342g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicInteger f37343h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicInteger f37344i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ConcurrentHashMap f37345j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public w f37346k;
    public final q1.f l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final q1.f f37347m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final w5 f37348n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public volatile boolean f37349o;

    public g(Context context, Looper looper) {
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.f11044d;
        this.f37336a = ConversationTypingEvents.TIME_INTERVAL_IN_MILLIS;
        this.f37337b = false;
        this.f37343h = new AtomicInteger(1);
        this.f37344i = new AtomicInteger(0);
        this.f37345j = new ConcurrentHashMap(5, 0.75f, 1);
        this.f37346k = null;
        this.l = new q1.f(0);
        this.f37347m = new q1.f(0);
        this.f37349o = true;
        this.f37340e = context;
        w5 w5Var = new w5(looper, this);
        Looper.getMainLooper();
        this.f37348n = w5Var;
        this.f37341f = googleApiAvailability;
        this.f37342g = new w2.z(23);
        PackageManager packageManager = context.getPackageManager();
        if (vz.c.f42628f == null) {
            vz.c.f42628f = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (vz.c.f42628f.booleanValue()) {
            this.f37349o = false;
        }
        w5Var.sendMessage(w5Var.obtainMessage(6));
    }

    public static void a() {
        synchronized (f37334r) {
            try {
                g gVar = f37335s;
                if (gVar != null) {
                    gVar.f37344i.incrementAndGet();
                    w5 w5Var = gVar.f37348n;
                    w5Var.sendMessageAtFrontOfQueue(w5Var.obtainMessage(10));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static Status d(a aVar, pz.b bVar) {
        String str = aVar.f37309b.f11065b;
        String strValueOf = String.valueOf(bVar);
        return new Status(17, e0.f.o(new StringBuilder(String.valueOf(str).length() + 63 + strValueOf.length()), "API: ", str, " is not available on this device. Connection failed with: ", strValueOf), bVar.f35645c, bVar);
    }

    public static g e(Context context) {
        g gVar;
        HandlerThread handlerThread;
        synchronized (f37334r) {
            if (f37335s == null) {
                synchronized (com.google.android.gms.common.internal.m.f11152a) {
                    try {
                        handlerThread = com.google.android.gms.common.internal.m.f11154c;
                        if (handlerThread == null) {
                            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                            com.google.android.gms.common.internal.m.f11154c = handlerThread2;
                            handlerThread2.start();
                            handlerThread = com.google.android.gms.common.internal.m.f11154c;
                        }
                    } finally {
                    }
                }
                Looper looper = handlerThread.getLooper();
                Context applicationContext = context.getApplicationContext();
                Object obj = GoogleApiAvailability.f11043c;
                f37335s = new g(applicationContext, looper);
            }
            gVar = f37335s;
        }
        return gVar;
    }

    public final z b(com.google.android.gms.common.api.l lVar) {
        a apiKey = lVar.getApiKey();
        ConcurrentHashMap concurrentHashMap = this.f37345j;
        z zVar = (z) concurrentHashMap.get(apiKey);
        if (zVar == null) {
            zVar = new z(this, lVar);
            concurrentHashMap.put(apiKey, zVar);
        }
        if (zVar.f37403h.requiresSignIn()) {
            this.f37347m.add(apiKey);
        }
        zVar.r();
        return zVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(d10.g r9, int r10, com.google.android.gms.common.api.l r11) {
        /*
            r8 = this;
            if (r10 == 0) goto L7c
            qz.a r3 = r11.getApiKey()
            boolean r11 = r8.g()
            if (r11 != 0) goto Ld
            goto L4c
        Ld:
            com.google.android.gms.common.internal.r r11 = com.google.android.gms.common.internal.r.e()
            java.lang.Object r11 = r11.f11181a
            com.google.android.gms.common.internal.s r11 = (com.google.android.gms.common.internal.s) r11
            r0 = 1
            if (r11 == 0) goto L4f
            boolean r1 = r11.f11190b
            if (r1 == 0) goto L4c
            boolean r11 = r11.f11191c
            java.util.concurrent.ConcurrentHashMap r1 = r8.f37345j
            java.lang.Object r1 = r1.get(r3)
            qz.z r1 = (qz.z) r1
            if (r1 == 0) goto L4a
            com.google.android.gms.common.api.f r2 = r1.f37403h
            boolean r4 = r2 instanceof com.google.android.gms.common.internal.f
            if (r4 == 0) goto L4c
            com.google.android.gms.common.internal.f r2 = (com.google.android.gms.common.internal.f) r2
            boolean r4 = r2.hasConnectionInfo()
            if (r4 == 0) goto L4a
            boolean r4 = r2.isConnecting()
            if (r4 != 0) goto L4a
            com.google.android.gms.common.internal.j r11 = qz.c0.a(r1, r2, r10)
            if (r11 == 0) goto L4c
            int r2 = r1.f37412r
            int r2 = r2 + r0
            r1.f37412r = r2
            boolean r0 = r11.f11129c
            goto L4f
        L4a:
            r0 = r11
            goto L4f
        L4c:
            r10 = 0
            r1 = r8
            goto L69
        L4f:
            qz.c0 r11 = new qz.c0
            r1 = 0
            if (r0 == 0) goto L5a
            long r4 = java.lang.System.currentTimeMillis()
            goto L5b
        L5a:
            r4 = r1
        L5b:
            if (r0 == 0) goto L61
            long r1 = android.os.SystemClock.elapsedRealtime()
        L61:
            r0 = r11
            r6 = r1
            r1 = r8
            r2 = r10
            r0.<init>(r1, r2, r3, r4, r6)
            r10 = r0
        L69:
            if (r10 == 0) goto L7d
            d10.o r9 = r9.f13697a
            com.google.android.gms.internal.measurement.w5 r11 = r1.f37348n
            java.util.Objects.requireNonNull(r11)
            d7.e r0 = new d7.e
            r2 = 4
            r0.<init>(r11, r2)
            r9.c(r0, r10)
            return
        L7c:
            r1 = r8
        L7d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qz.g.c(d10.g, int, com.google.android.gms.common.api.l):void");
    }

    public final void f(w wVar) {
        synchronized (f37334r) {
            try {
                if (this.f37346k != wVar) {
                    this.f37346k = wVar;
                    this.l.clear();
                }
                this.l.addAll(wVar.f37397f);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean g() {
        int i11;
        if (this.f37337b) {
            return false;
        }
        com.google.android.gms.common.internal.s sVar = (com.google.android.gms.common.internal.s) com.google.android.gms.common.internal.r.e().f11181a;
        if (sVar != null && !sVar.f11190b) {
            return false;
        }
        SparseIntArray sparseIntArray = (SparseIntArray) this.f37342g.f43083b;
        synchronized (sparseIntArray) {
            i11 = sparseIntArray.get(203400000, -1);
        }
        return i11 == -1 || i11 == 0;
    }

    public final d10.o h(com.google.android.gms.common.api.l lVar, o oVar, v vVar, Runnable runnable) {
        d10.g gVar = new d10.g();
        c(gVar, oVar.f37378d, lVar);
        f0 f0Var = new f0(new m0(new g0(oVar, vVar, runnable), gVar), this.f37344i.get(), lVar);
        w5 w5Var = this.f37348n;
        w5Var.sendMessage(w5Var.obtainMessage(8, f0Var));
        return gVar.f13697a;
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x02f8  */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean handleMessage(android.os.Message r19) {
        /*
            Method dump skipped, instruction units count: 1098
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qz.g.handleMessage(android.os.Message):boolean");
    }

    public final boolean i(pz.b bVar, int i11) {
        GoogleApiAvailability googleApiAvailability = this.f37341f;
        googleApiAvailability.getClass();
        Context context = this.f37340e;
        if (!xz.b.E(context)) {
            int i12 = bVar.f35644b;
            PendingIntent activity = bVar.f35645c;
            if (!((i12 == 0 || activity == null) ? false : true)) {
                activity = null;
                Intent intentA = googleApiAvailability.a(context, null, i12);
                if (intentA != null) {
                    activity = PendingIntent.getActivity(context, 0, intentA, 201326592);
                }
            }
            if (activity != null) {
                int i13 = GoogleApiActivity.f11050b;
                Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
                intent.putExtra("pending_intent", activity);
                intent.putExtra("failing_client_id", i11);
                intent.putExtra("notify_manager", true);
                googleApiAvailability.f(context, i12, PendingIntent.getActivity(context, 0, intent, h00.c.f20995a | 134217728));
                return true;
            }
        }
        return false;
    }

    public final void j(pz.b bVar, int i11) {
        if (i(bVar, i11)) {
            return;
        }
        w5 w5Var = this.f37348n;
        w5Var.sendMessage(w5Var.obtainMessage(5, i11, 0, bVar));
    }
}
