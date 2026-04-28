package com.braze.managers;

import android.content.Context;
import com.braze.Constants;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.events.IEventSubscriber;
import com.braze.managers.h1;
import com.braze.storage.i3;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class h1 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final c1 f9984k = new c1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i3 f9985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.braze.events.d f9986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d1 f9987c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f9988d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f9989e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f9990f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f9991g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ReentrantLock f9992h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public v80.i1 f9993i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AtomicInteger f9994j;

    public h1(i3 i3Var, com.braze.events.d dVar, Context context) {
        i3Var.getClass();
        dVar.getClass();
        context.getClass();
        this.f9985a = i3Var;
        this.f9986b = dVar;
        this.f9987c = new d1();
        this.f9988d = DateTimeUtils.nowInSeconds();
        this.f9990f = new ArrayList();
        this.f9992h = new ReentrantLock();
        this.f9994j = new AtomicInteger(0);
        if (g()) {
            c();
        }
        final int i11 = 0;
        dVar.c(com.braze.events.internal.q.class, new IEventSubscriber(this) { // from class: zv.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h1 f48120b;

            {
                this.f48120b = this;
            }

            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) throws Throwable {
                switch (i11) {
                    case 0:
                        h1.a(this.f48120b, (com.braze.events.internal.q) obj);
                        break;
                    default:
                        h1.a(this.f48120b, (com.braze.events.internal.t) obj);
                        break;
                }
            }
        });
        final int i12 = 1;
        dVar.c(com.braze.events.internal.t.class, new IEventSubscriber(this) { // from class: zv.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h1 f48120b;

            {
                this.f48120b = this;
            }

            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) throws Throwable {
                switch (i12) {
                    case 0:
                        h1.a(this.f48120b, (com.braze.events.internal.q) obj);
                        break;
                    default:
                        h1.a(this.f48120b, (com.braze.events.internal.t) obj);
                        break;
                }
            }
        });
    }

    public static final String b() {
        return "Shutting down SDK Debugger due to being past expiration time";
    }

    public static final String d() {
        return "Initializing SDK Debugger";
    }

    public static final String e() {
        return "SDK Debugger transitioned from disabled to enabled. Initializing SDK Debugger.";
    }

    public static final String f() {
        return "SDK Debugger transitioned from enabled to disabled. Shutting down SDK Debugger.";
    }

    public static final String h() {
        return "Debugging session has expired. Disabling SDK Debugger.";
    }

    public static final String j() {
        return "Shutting down SDK Debugger";
    }

    public final Unit a() {
        Long lB;
        if (!this.f9987c.f() || this.f9987c.a() == null || this.f9987c.b() == null || (((lB = this.f9987c.b()) != null && lB.longValue() == 0) || this.f9994j.get() > 0)) {
            return Unit.f26487a;
        }
        Long lB2 = this.f9987c.b();
        if (lB2 != null) {
            if (DateTimeUtils.nowInSeconds() > lB2.longValue()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new zv.f(9), 7, (Object) null);
                i();
                return Unit.f26487a;
            }
        }
        if (DateTimeUtils.nowInSeconds() > this.f9987c.d() + this.f9988d || this.f9991g > this.f9987c.c()) {
            ArrayList arrayList = new ArrayList();
            ReentrantLock reentrantLock = this.f9992h;
            reentrantLock.lock();
            try {
                int length = 0;
                int length2 = 0;
                for (com.braze.models.o oVar : this.f9990f) {
                    int i11 = this.f9989e;
                    if (i11 != 0) {
                        String str = "Removed " + i11 + " logs due to buffer overflow";
                        arrayList.add(new com.braze.models.o(str));
                        this.f9989e = 0;
                        length2 += str.length();
                    }
                    int length3 = oVar.c().length() + length2;
                    if (length3 <= this.f9987c.e()) {
                        arrayList.add(oVar);
                        length2 = length3;
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    this.f9990f.remove((com.braze.models.o) it.next());
                }
                Iterator it2 = this.f9990f.iterator();
                while (it2.hasNext()) {
                    length += ((com.braze.models.o) it2.next()).c().length();
                }
                this.f9991g = length;
                this.f9988d = DateTimeUtils.nowInSeconds();
                reentrantLock.unlock();
                v80.i1 i1Var = this.f9993i;
                if (i1Var != null) {
                    i1Var.a(null);
                }
                this.f9993i = null;
                if (!arrayList.isEmpty()) {
                    this.f9994j.incrementAndGet();
                    this.f9986b.b(new com.braze.events.internal.v(arrayList), com.braze.events.internal.v.class);
                }
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        } else if (this.f9993i == null) {
            this.f9993i = BrazeCoroutineScope.launchDelayed$default(BrazeCoroutineScope.INSTANCE, new Long(TimeUnit.SECONDS.toMillis((this.f9987c.d() + this.f9988d) - DateTimeUtils.nowInSeconds())), null, new e1(this, null), 2, null);
        }
        return Unit.f26487a;
    }

    public final void c() {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new zv.f(8), 7, (Object) null);
        brazeLogger.setSdkDebuggerCallback$android_sdk_base_release(new f1(this));
        this.f9986b.b(new com.braze.events.internal.u(), com.braze.events.internal.u.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g() {
        /*
            r9 = this;
            com.braze.managers.d1 r0 = r9.f9987c
            com.braze.storage.i3 r1 = r9.f9985a
            boolean r1 = r1.M()
            r0.f9959a = r1
            com.braze.managers.d1 r0 = r9.f9987c
            boolean r1 = r0.f9959a
            if (r1 == 0) goto L44
            com.braze.storage.i3 r1 = r9.f9985a
            java.lang.String r1 = r1.y()
            r0.f9961c = r1
            com.braze.managers.d1 r0 = r9.f9987c
            com.braze.storage.i3 r1 = r9.f9985a
            long r1 = r1.A()
            r0.f9962d = r1
            com.braze.managers.d1 r0 = r9.f9987c
            com.braze.storage.i3 r1 = r9.f9985a
            long r1 = r1.B()
            r0.f9963e = r1
            com.braze.managers.d1 r0 = r9.f9987c
            com.braze.storage.i3 r1 = r9.f9985a
            long r1 = r1.C()
            r0.f9964f = r1
            com.braze.managers.d1 r0 = r9.f9987c
            com.braze.storage.i3 r1 = r9.f9985a
            long r1 = r1.z()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r0.f9960b = r1
        L44:
            com.braze.managers.d1 r0 = r9.f9987c
            java.lang.Long r0 = r0.f9960b
            if (r0 == 0) goto L70
            long r0 = r0.longValue()
            long r2 = com.braze.support.DateTimeUtils.nowInSeconds()
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L70
            com.braze.support.BrazeLogger r1 = com.braze.support.BrazeLogger.INSTANCE
            zv.f r6 = new zv.f
            r0 = 10
            r6.<init>(r0)
            r7 = 7
            r8 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r2 = r9
            com.braze.support.BrazeLogger.brazelog$default(r1, r2, r3, r4, r5, r6, r7, r8)
            com.braze.managers.d1 r0 = new com.braze.managers.d1
            r0.<init>()
            r2.f9987c = r0
            goto L71
        L70:
            r2 = r9
        L71:
            com.braze.managers.d1 r0 = r2.f9987c
            boolean r0 = r0.f9959a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.managers.h1.g():boolean");
    }

    public final void i() {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new zv.f(5), 7, (Object) null);
        brazeLogger.setSdkDebuggerCallback$android_sdk_base_release(null);
        this.f9987c = new d1();
        ReentrantLock reentrantLock = this.f9992h;
        reentrantLock.lock();
        try {
            this.f9990f.clear();
            this.f9991g = 0;
        } finally {
            reentrantLock.unlock();
        }
    }

    public static final void a(h1 h1Var, com.braze.events.internal.t tVar) throws Throwable {
        tVar.getClass();
        d1 d1Var = h1Var.f9987c;
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) h1Var, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new yl.e(16, tVar, d1Var), 7, (Object) null);
        if (tVar.f9822a.f9960b == null) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) h1Var, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new zendesk.ui.android.conversation.textcell.c(d1Var, 8), 7, (Object) null);
            tVar.f9822a.f9960b = d1Var.f9960b;
        }
        d1 d1Var2 = tVar.f9822a;
        if (d1Var2.f9961c == null) {
            d1Var2.f9961c = d1Var.f9961c;
        }
        h1Var.f9987c = d1Var2;
        BrazeLogger.Priority priority = BrazeLogger.Priority.V;
        BrazeLogger.brazelog$default(brazeLogger, (Object) h1Var, priority, (Throwable) null, false, (Function0) new zendesk.ui.android.conversation.textcell.c(tVar, 9), 6, (Object) null);
        h1Var.f9985a.a(tVar.f9822a);
        boolean z11 = d1Var.f9959a;
        if (!z11 && h1Var.f9987c.f9959a) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) h1Var, priority, (Throwable) null, false, (Function0) new zv.f(6), 6, (Object) null);
            h1Var.c();
        } else {
            if (!z11 || h1Var.f9987c.f9959a) {
                return;
            }
            BrazeLogger.brazelog$default(brazeLogger, (Object) h1Var, priority, (Throwable) null, false, (Function0) new zv.f(7), 6, (Object) null);
            h1Var.i();
        }
    }

    public static final String a(com.braze.events.internal.t tVar, d1 d1Var) {
        return "Received SdkDebuggerConfigUpdateEvent. Updating SDK Debugger config with " + tVar.a() + ".\nOld config " + d1Var;
    }

    public static final String a(d1 d1Var) {
        return "updating expiration time to " + d1Var.b();
    }

    public static final String a(com.braze.events.internal.t tVar) {
        return "Updating SDK Debugger config with " + tVar.a();
    }

    public final void a(String str, BrazeLogger.Priority priority, String str2, Throwable th2) {
        str.getClass();
        priority.getClass();
        str2.getClass();
        if (!this.f9987c.f() || StringsKt.z(str2, Constants.LOG_TAG_PREFIX, false)) {
            return;
        }
        String str3 = "";
        Object obj = th2;
        if (th2 == null) {
            obj = "";
        }
        for (String str4 : StringsKt__StringsKt.split$default(priority + " " + str + ": " + str2 + " " + obj, new String[]{"\n"}, false, 0, 6, null)) {
            if (str4.length() + str3.length() > this.f9987c.e()) {
                a(priority + ": " + ((Object) str3));
                str3 = str4;
            } else {
                str3 = ((Object) str3) + "\n" + str4;
            }
        }
        if (str3.length() > 0) {
            a(str3);
        }
        v80.f0.B(BrazeCoroutineScope.INSTANCE, null, null, new g1(this, null), 3);
    }

    public final void a(String str) {
        com.braze.models.o oVar = new com.braze.models.o(str);
        ReentrantLock reentrantLock = this.f9992h;
        reentrantLock.lock();
        try {
            this.f9990f.add(oVar);
            int length = this.f9991g + oVar.f10173a.length();
            this.f9991g = length;
            if (length > 1048576) {
                while (this.f9991g > 838860) {
                    this.f9991g -= ((com.braze.models.o) this.f9990f.remove(0)).f10173a.length();
                    this.f9989e++;
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public static final void a(h1 h1Var, com.braze.events.internal.q qVar) {
        qVar.getClass();
        if (qVar.f9820a instanceof com.braze.requests.x) {
            h1Var.f9994j.decrementAndGet();
            v80.f0.B(BrazeCoroutineScope.INSTANCE, null, null, new b1(h1Var, null), 3);
        }
    }
}
