package com.braze.events;

import b3.i;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.events.internal.g;
import com.braze.events.internal.q;
import com.braze.events.internal.r;
import com.braze.events.internal.u;
import com.braze.events.internal.v;
import com.braze.requests.o;
import com.braze.storage.c3;
import com.braze.storage.t0;
import com.braze.support.BrazeLogger;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.d0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import v80.f0;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d implements e {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final b f9770j = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c3 f9771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t0 f9772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConcurrentHashMap f9773c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ConcurrentHashMap f9774d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ConcurrentHashMap f9775e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ReentrantLock f9776f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ReentrantLock f9777g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ReentrantLock f9778h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f9779i;

    public d(c3 c3Var, t0 t0Var, boolean z11) {
        c3Var.getClass();
        t0Var.getClass();
        this.f9771a = c3Var;
        this.f9772b = t0Var;
        this.f9773c = new ConcurrentHashMap();
        this.f9774d = new ConcurrentHashMap();
        this.f9775e = new ConcurrentHashMap();
        this.f9776f = new ReentrantLock();
        this.f9777g = new ReentrantLock();
        this.f9778h = new ReentrantLock();
        this.f9779i = !z11;
    }

    public final void a(Class cls) {
        if (!this.f9779i) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new vv.c(cls, 1), 7, (Object) null);
            return;
        }
        ReentrantLock reentrantLock = this.f9778h;
        reentrantLock.lock();
        try {
            if (this.f9775e.containsKey(cls)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new vv.c(cls, 2), 6, (Object) null);
                Object objRemove = this.f9775e.remove(cls);
                objRemove.getClass();
                Iterator it = ((List) objRemove).iterator();
                while (it.hasNext()) {
                    b(it.next(), cls);
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void b(final Object obj, final Class cls) {
        o oVar;
        cls.getClass();
        boolean z11 = true;
        if (!(obj instanceof u) && !(obj instanceof v) && ((!(obj instanceof com.braze.events.internal.dispatchmanager.c) || (oVar = ((com.braze.events.internal.dispatchmanager.c) obj).f9797d) == null || !((com.braze.requests.b) oVar).e().f10482d) && ((!(obj instanceof r) || !((r) obj).f9821a.e().f10482d) && ((!(obj instanceof q) || !((q) obj).f9820a.e().f10482d) && (!(obj instanceof g) || !((com.braze.requests.b) ((g) obj).f9802a).e().f10482d))))) {
            z11 = false;
        }
        boolean z12 = z11;
        if (this.f9771a.a() || this.f9772b.c()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, z12, new lw.o(this, cls, obj, 28), 3, (Object) null);
            return;
        }
        if (obj == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, z12, new vv.c(cls, 0), 3, (Object) null);
            return;
        }
        if (!this.f9779i) {
            final int i11 = 0;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, z12, new Function0() { // from class: vv.d
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i11) {
                        case 0:
                            return com.braze.events.d.a(cls, obj);
                        default:
                            return com.braze.events.d.b(cls, obj);
                    }
                }
            }, 3, (Object) null);
            a(obj, cls);
            return;
        }
        final int i12 = 1;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, z12, new Function0() { // from class: vv.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        return com.braze.events.d.a(cls, obj);
                    default:
                        return com.braze.events.d.b(cls, obj);
                }
            }
        }, 3, (Object) null);
        b bVar = f9770j;
        HashSet hashSetA = b.a(this.f9773c, cls, this.f9776f);
        Iterator it = bVar.a(cls, hashSetA).iterator();
        while (it.hasNext()) {
            f0.B(BrazeCoroutineScope.INSTANCE, null, null, new c((IEventSubscriber) it.next(), obj, null), 3);
        }
        b bVar2 = f9770j;
        HashSet hashSetA2 = b.a(this.f9774d, cls, this.f9777g);
        Iterator it2 = bVar2.a(cls, hashSetA2).iterator();
        while (it2.hasNext()) {
            ((IEventSubscriber) it2.next()).trigger(obj);
        }
        if (hashSetA2.isEmpty() && hashSetA.isEmpty()) {
            if (Intrinsics.areEqual(cls, NoMatchingTriggerEvent.class)) {
                final int i13 = 0;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, z12, new Function0() { // from class: vv.e
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i13) {
                            case 0:
                                return com.braze.events.d.a(cls, this);
                            default:
                                return com.braze.events.d.b(cls, this);
                        }
                    }
                }, 2, (Object) null);
            } else {
                final int i14 = 1;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, z12, new Function0() { // from class: vv.e
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i14) {
                            case 0:
                                return com.braze.events.d.a(cls, this);
                            default:
                                return com.braze.events.d.b(cls, this);
                        }
                    }
                }, 2, (Object) null);
                a(obj, cls);
            }
        }
    }

    public final boolean c(Class cls, IEventSubscriber iEventSubscriber) {
        cls.getClass();
        iEventSubscriber.getClass();
        ReentrantLock reentrantLock = this.f9777g;
        reentrantLock.lock();
        try {
            ConcurrentHashMap concurrentHashMap = this.f9774d;
            CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) concurrentHashMap.get(cls);
            if (copyOnWriteArraySet == null) {
                copyOnWriteArraySet = new CopyOnWriteArraySet();
                CopyOnWriteArraySet copyOnWriteArraySet2 = (CopyOnWriteArraySet) concurrentHashMap.putIfAbsent(cls, copyOnWriteArraySet);
                if (copyOnWriteArraySet2 != null) {
                    copyOnWriteArraySet = copyOnWriteArraySet2;
                }
            }
            boolean zAdd = copyOnWriteArraySet.add(iEventSubscriber);
            a(cls);
            reentrantLock.unlock();
            return zAdd;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final void d(Class cls, IEventSubscriber iEventSubscriber) {
        cls.getClass();
        iEventSubscriber.getClass();
        ReentrantLock reentrantLock = this.f9776f;
        reentrantLock.lock();
        try {
            ConcurrentHashMap concurrentHashMap = this.f9773c;
            CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) concurrentHashMap.get(cls);
            if (copyOnWriteArraySet == null) {
                copyOnWriteArraySet = new CopyOnWriteArraySet();
                CopyOnWriteArraySet copyOnWriteArraySet2 = (CopyOnWriteArraySet) concurrentHashMap.putIfAbsent(cls, copyOnWriteArraySet);
                if (copyOnWriteArraySet2 != null) {
                    copyOnWriteArraySet = copyOnWriteArraySet2;
                }
            }
            copyOnWriteArraySet.add(iEventSubscriber);
            a(cls);
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public static final String d(Class cls) {
        return "Not publishing null message to event class ".concat(cls.getName());
    }

    public final void c() {
        ReentrantLock reentrantLock = this.f9776f;
        reentrantLock.lock();
        try {
            this.f9773c.clear();
            reentrantLock.unlock();
            ReentrantLock reentrantLock2 = this.f9777g;
            reentrantLock2.lock();
            try {
                this.f9774d.clear();
            } finally {
                reentrantLock2.unlock();
            }
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public static final String c(Class cls) {
        return a0.k(cls, "Publishing cached event for class: ");
    }

    public final boolean a(Class cls, IEventSubscriber iEventSubscriber) {
        cls.getClass();
        iEventSubscriber.getClass();
        ReentrantLock reentrantLock = this.f9776f;
        reentrantLock.lock();
        try {
            CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) this.f9773c.get(cls);
            if (copyOnWriteArraySet != null) {
                return copyOnWriteArraySet.remove(iEventSubscriber);
            }
            reentrantLock.unlock();
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    public static final String a(d dVar, Class cls, Object obj) {
        boolean zC = dVar.f9772b.c();
        boolean zA = dVar.f9771a.a();
        String name = cls.getName();
        StringBuilder sbP = i.p("SDK delayed initialization mode: ", zC, " and GDPR disabled mode: ", zA, ". Not publishing event class: ");
        sbP.append(name);
        sbP.append(" and message: ");
        sbP.append(obj);
        return sbP.toString();
    }

    public static final String a(Class cls, Object obj) {
        return "Not publishing event class: " + cls.getName() + " and message: " + obj + " because events are not allowed to send yet. Adding to replay cache.";
    }

    public static final String a(Class cls, d dVar) {
        return "Event was published, but no subscribers were found. But not saving event for publishing later. Event class: " + cls + " " + dVar;
    }

    public final void a(Object obj, Class cls) {
        ReentrantLock reentrantLock = this.f9778h;
        reentrantLock.lock();
        if (obj == null) {
            reentrantLock.unlock();
            return;
        }
        try {
            boolean zContainsKey = this.f9775e.containsKey(cls);
            ConcurrentHashMap concurrentHashMap = this.f9775e;
            if (zContainsKey) {
                List list = (List) concurrentHashMap.get(cls);
                if (list != null) {
                    list.add(obj);
                } else {
                    this.f9775e.put(cls, d0.j(obj));
                }
            } else {
                concurrentHashMap.put(cls, d0.j(obj));
            }
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final void a() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new vv.b(20), 7, (Object) null);
        this.f9779i = true;
        ReentrantLock reentrantLock = this.f9778h;
        reentrantLock.lock();
        try {
            for (Class cls : this.f9775e.keySet()) {
                cls.getClass();
                a(cls);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean b(Class cls, IEventSubscriber iEventSubscriber) {
        cls.getClass();
        iEventSubscriber.getClass();
        ReentrantLock reentrantLock = this.f9777g;
        reentrantLock.lock();
        try {
            CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) this.f9774d.get(cls);
            if (copyOnWriteArraySet != null) {
                return copyOnWriteArraySet.remove(iEventSubscriber);
            }
            reentrantLock.unlock();
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    public static final String b() {
        return "Now allowing events to send";
    }

    public static final String b(Class cls, Object obj) {
        return cls.getName() + " fired:\n" + obj;
    }

    public static final String b(Class cls, d dVar) {
        return "Event was published, but no subscribers were found. Saving event for later publishing to a matching subscriber. Event class: " + cls + " this " + dVar;
    }

    public static final String b(Class cls) {
        return a0.n("Not publishing cached event for class: ", cls, " because events are not allowed to send yet.");
    }
}
