package com.google.firebase.messaging;

import a3.i3;
import a3.y0;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.SparseArray;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.l1;
import androidx.lifecycle.m1;
import androidx.lifecycle.q1;
import androidx.lifecycle.r1;
import androidx.lifecycle.viewmodel.CreationExtras;
import b5.s1;
import com.app.tgtg.feature.main.MainActivity;
import com.app.tgtg.model.local.BasketManager;
import com.app.tgtg.model.local.LatestBasketInteraction;
import com.app.tgtg.model.local.LatestInteractionOrigin;
import com.app.tgtg.model.remote.ItemId;
import com.braze.Constants;
import com.braze.h2;
import com.google.android.gms.internal.measurement.cg;
import com.google.android.gms.internal.measurement.f4;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.x0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import pg.u1;
import q1.k1;
import s0.p0;
import t1.a2;
import v80.i1;
import y00.e1;
import y00.n1;
import y00.w0;
import z1.g1;
import z1.h1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 implements c4.h, um.u, ym.z, ia0.i0, a2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static a0 f12776f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static a0 f12777g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f12779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f12780c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f12781d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f12782e;

    public a0(int i11) {
        this.f12778a = i11;
        switch (i11) {
            case 10:
                this.f12779b = new CopyOnWriteArrayList();
                this.f12780c = new CopyOnWriteArrayList();
                this.f12781d = new CopyOnWriteArrayList();
                this.f12782e = new CopyOnWriteArrayList();
                break;
            case 18:
                this.f12781d = new ArrayList();
                this.f12782e = new ArrayList();
                break;
            case 21:
                this.f12779b = new Object();
                this.f12780c = new Handler(Looper.getMainLooper(), new oz.k(this, 1));
                break;
            case 22:
                this.f12782e = new ArrayDeque();
                this.f12780c = new ArrayDeque();
                this.f12781d = new ArrayDeque();
                break;
            case 23:
                this.f12779b = new q1.e(0);
                this.f12780c = new SparseArray();
                this.f12781d = new q1.z((Object) null);
                this.f12782e = new q1.e(0);
                break;
            case 24:
                this.f12779b = new g6.e(10);
                this.f12780c = new k1(0);
                this.f12781d = new ArrayList();
                this.f12782e = new HashSet();
                break;
            case 27:
                this.f12779b = new ReentrantReadWriteLock(true);
                this.f12780c = new xe.b((String) null, (String) null, 7);
                this.f12781d = new Object();
                this.f12782e = new LinkedHashSet();
                break;
            default:
                this.f12779b = null;
                this.f12780c = null;
                this.f12781d = null;
                this.f12782e = new ArrayDeque();
                break;
        }
    }

    public static synchronized a0 J() {
        try {
            if (f12776f == null) {
                f12776f = new a0(0);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f12776f;
    }

    public static a0 K() {
        if (f12777g == null) {
            f12777g = new a0(21);
        }
        return f12777g;
    }

    public static void T(a0 a0Var, u90.k kVar, u90.n nVar, u90.k kVar2, int i11) {
        jd.f fVar;
        u90.k kVarH;
        if ((i11 & 1) != 0) {
            kVar = null;
        }
        if ((i11 & 2) != 0) {
            nVar = null;
        }
        if ((i11 & 4) != 0) {
            kVar2 = null;
        }
        a0Var.getClass();
        TimeZone timeZone = r90.g.f37815a;
        boolean zIsShutdown = ((ThreadPoolExecutor) a0Var.F()).isShutdown();
        synchronized (a0Var) {
            if (nVar != null) {
                try {
                    if (!((ArrayDeque) a0Var.f12781d).remove(nVar)) {
                        throw new IllegalStateException("Call wasn't in-flight!");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (kVar2 != null) {
                kVar2.f40919b.decrementAndGet();
                if (!((ArrayDeque) a0Var.f12780c).remove(kVar2)) {
                    throw new IllegalStateException("Call wasn't in-flight!");
                }
            }
            if (kVar != null) {
                ((ArrayDeque) a0Var.f12782e).add(kVar);
                u90.n nVar2 = kVar.f40920c;
                if (!nVar2.f40925c && (kVarH = a0Var.H(nVar2.f40924b.f36505a.f36626d)) != null) {
                    kVar.f40919b = kVarH.f40919b;
                }
            }
            if ((nVar != null || kVar2 != null) && (zIsShutdown || ((ArrayDeque) a0Var.f12780c).isEmpty())) {
                ((ArrayDeque) a0Var.f12781d).isEmpty();
            }
            if (zIsShutdown) {
                List listR0 = CollectionsKt.r0((ArrayDeque) a0Var.f12782e);
                ((ArrayDeque) a0Var.f12782e).clear();
                fVar = new jd.f(listR0);
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = ((ArrayDeque) a0Var.f12782e).iterator();
                it.getClass();
                while (it.hasNext()) {
                    u90.k kVar3 = (u90.k) it.next();
                    if (((ArrayDeque) a0Var.f12780c).size() >= 64) {
                        break;
                    }
                    if (kVar3.f40919b.get() < 5) {
                        it.remove();
                        kVar3.f40919b.incrementAndGet();
                        arrayList.add(kVar3);
                        ((ArrayDeque) a0Var.f12780c).add(kVar3);
                    }
                }
                fVar = new jd.f(arrayList);
            }
        }
        int size = ((List) fVar.f24983b).size();
        for (int i12 = 0; i12 < size; i12++) {
            u90.k kVar4 = (u90.k) ((List) fVar.f24983b).get(i12);
            if (kVar4 != kVar) {
                u90.n nVar3 = kVar4.f40920c;
            }
            if (zIsShutdown) {
                kVar4.getClass();
                InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                interruptedIOException.initCause(null);
                u90.n nVar4 = kVar4.f40920c;
                nVar4.k(interruptedIOException);
                kVar4.f40918a.e(nVar4, interruptedIOException);
            } else {
                ExecutorService executorServiceF = a0Var.F();
                kVar4.getClass();
                u90.n nVar5 = kVar4.f40920c;
                nVar5.f40923a.f36463a.getClass();
                try {
                    try {
                        ((ThreadPoolExecutor) executorServiceF).execute(kVar4);
                    } catch (Throwable th3) {
                        a0 a0Var2 = nVar5.f40923a.f36463a;
                        a0Var2.getClass();
                        T(a0Var2, null, null, kVar4, 3);
                        throw th3;
                    }
                } catch (RejectedExecutionException e5) {
                    InterruptedIOException interruptedIOException2 = new InterruptedIOException("executor rejected");
                    interruptedIOException2.initCause(e5);
                    u90.n nVar6 = kVar4.f40920c;
                    nVar6.k(interruptedIOException2);
                    kVar4.f40918a.e(nVar6, interruptedIOException2);
                    a0 a0Var3 = nVar5.f40923a.f36463a;
                    a0Var3.getClass();
                    T(a0Var3, null, null, kVar4, 3);
                }
            }
        }
    }

    public boolean A(q20.i iVar, int i11) {
        q20.e eVar = (q20.e) iVar.f35949a.get();
        if (eVar == null) {
            return false;
        }
        ((Handler) this.f12780c).removeCallbacksAndMessages(iVar);
        Handler handler = q20.g.f35927x;
        handler.sendMessage(handler.obtainMessage(1, i11, 0, eVar.f35912a));
        return true;
    }

    public void B(q90.d0 d0Var) {
        Objects.requireNonNull(d0Var, "client == null");
        this.f12779b = d0Var;
    }

    public void C(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            a40.d0.k("This graph contains cyclic dependencies");
            return;
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((k1) this.f12780c).get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i11 = 0; i11 < size; i11++) {
                C(arrayList2.get(i11), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    public void D(w4.n nVar, boolean z11) {
        w4.b0 b0Var = (w4.b0) this.f12782e;
        List list = nVar.f43165a;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (((w4.v) list.get(i11)).b()) {
                Z(nVar);
                return;
            }
        }
        s1 s1Var = (s1) this.f12779b;
        if (s1Var == null) {
            h2.b("layoutCoordinates not set");
            return;
        }
        w4.u.i(nVar, s1Var.S(0L), new b4.x(16, this, b0Var), false);
        if (((w4.z) this.f12780c) == w4.z.Dispatching) {
            if (z11) {
                int size2 = list.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    ((w4.v) list.get(i12)).a();
                }
            }
            i3 i3Var = nVar.f43166b;
            if (i3Var != null) {
                i3Var.f394a = !b0Var.f43104c;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0059, code lost:
    
        if (r7 == r2) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0066, code lost:
    
        if (r7 == r2) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object E(z70.c r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f12782e
            d8.y r0 = (d8.y) r0
            boolean r1 = r7 instanceof d8.h
            if (r1 == 0) goto L17
            r1 = r7
            d8.h r1 = (d8.h) r1
            int r2 = r1.l
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.l = r2
            goto L1c
        L17:
            d8.h r1 = new d8.h
            r1.<init>(r6, r7)
        L1c:
            java.lang.Object r7 = r1.f14622j
            y70.a r2 = y70.a.COROUTINE_SUSPENDED
            int r3 = r1.l
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L39
            if (r3 == r5) goto L35
            if (r3 != r4) goto L2e
            ba0.g.M(r7)
            goto L5c
        L2e:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r7)
            r7 = 0
            return r7
        L35:
            ba0.g.M(r7)
            goto L69
        L39:
            ba0.g.M(r7)
            java.lang.Object r7 = r6.f12781d
            java.util.List r7 = (java.util.List) r7
            if (r7 == 0) goto L5f
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L49
            goto L5f
        L49:
            d8.k0 r7 = r0.h()
            d8.k r3 = new d8.k
            r5 = 0
            r3.<init>(r0, r6, r5)
            r1.l = r4
            java.lang.Object r7 = r7.d(r3, r1)
            if (r7 != r2) goto L5c
            goto L68
        L5c:
            d8.b r7 = (d8.b) r7
            goto L6b
        L5f:
            r1.l = r5
            r7 = 0
            java.lang.Object r7 = d8.y.g(r0, r7, r1)
            if (r7 != r2) goto L69
        L68:
            return r2
        L69:
            d8.b r7 = (d8.b) r7
        L6b:
            d8.z r0 = r0.f14742h
            r0.c(r7)
            kotlin.Unit r7 = kotlin.Unit.f26487a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.a0.E(z70.c):java.lang.Object");
    }

    public synchronized ExecutorService F() {
        ThreadPoolExecutor threadPoolExecutor;
        try {
            if (((ThreadPoolExecutor) this.f12779b) == null) {
                this.f12779b = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new r90.f(r90.g.f37816b + " Dispatcher", false));
            }
            threadPoolExecutor = (ThreadPoolExecutor) this.f12779b;
            threadPoolExecutor.getClass();
        } catch (Throwable th2) {
            throw th2;
        }
        return threadPoolExecutor;
    }

    public Object G(z70.i iVar) {
        z1.r rVar = (z1.r) this.f12782e;
        g1 g1VarD = rVar.d();
        pm.j jVar = pm.j.Expanded;
        if (!((z1.a0) g1VarD).c(jVar)) {
            return Unit.f26487a;
        }
        Object objF = z1.k.f(rVar, jVar, pm.b.f35490a, iVar);
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        if (objF != aVar) {
            objF = Unit.f26487a;
        }
        return objF == aVar ? objF : Unit.f26487a;
    }

    public u90.k H(String str) {
        Iterator it = ((ArrayDeque) this.f12780c).iterator();
        it.getClass();
        while (it.hasNext()) {
            u90.k kVar = (u90.k) it.next();
            if (Intrinsics.areEqual(kVar.f40920c.f40924b.f36505a.f36626d, str)) {
                return kVar;
            }
        }
        Iterator it2 = ((ArrayDeque) this.f12782e).iterator();
        it2.getClass();
        while (it2.hasNext()) {
            u90.k kVar2 = (u90.k) it2.next();
            if (Intrinsics.areEqual(kVar2.f40920c.f40924b.f36505a.f36626d, str)) {
                return kVar2;
            }
        }
        return null;
    }

    public pm.j I() {
        return (pm.j) ((z1.r) this.f12782e).f46652g.getValue();
    }

    public k8.d L(String str) {
        if (!((ConcurrentHashMap) this.f12782e).containsKey(str)) {
            synchronized (this) {
                try {
                    if (!((ConcurrentHashMap) this.f12782e).containsKey(str)) {
                        try {
                            ((k50.a) this.f12779b).getClass();
                            InputStream inputStreamA = k50.a.a(str);
                            ((k50.b) this.f12780c).getClass();
                            for (h50.f fVar : k50.b.a(inputStreamA)) {
                                k8.d dVar = (k8.d) this.f12781d;
                                k8.d dVar2 = (k8.d) dVar.f26135c;
                                if (((String) ((l50.b) dVar2.f26135c).d(fVar)).equals("001")) {
                                    ((k8.d) dVar.f26134b).s(fVar);
                                } else {
                                    dVar2.s(fVar);
                                }
                            }
                            ((ConcurrentHashMap) this.f12782e).put(str, str);
                        } catch (IllegalArgumentException | IllegalStateException e5) {
                            throw new IllegalStateException("Failed to read file ".concat(str), e5);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return (k8.d) this.f12781d;
    }

    public l1 M(String str, KClass kClass) {
        l1 l1Var;
        l1 l1VarCreate;
        kClass.getClass();
        synchronized (((a9.c) this.f12782e)) {
            try {
                ViewModelStore viewModelStore = (ViewModelStore) this.f12779b;
                viewModelStore.getClass();
                l1Var = (l1) viewModelStore.f3412a.get(str);
                if (kClass.isInstance(l1Var)) {
                    Object obj = (ViewModelProvider$Factory) this.f12780c;
                    if (obj instanceof q1) {
                        l1Var.getClass();
                        ((q1) obj).onRequery(l1Var);
                    }
                    l1Var.getClass();
                } else {
                    y8.d dVar = new y8.d((CreationExtras) this.f12781d);
                    dVar.f3543a.put(r1.f3508b, str);
                    ViewModelProvider$Factory viewModelProvider$Factory = (ViewModelProvider$Factory) this.f12780c;
                    viewModelProvider$Factory.getClass();
                    try {
                        try {
                            l1VarCreate = viewModelProvider$Factory.create(kClass, dVar);
                        } catch (AbstractMethodError unused) {
                            l1VarCreate = viewModelProvider$Factory.create(y9.w.v(kClass));
                        }
                    } catch (AbstractMethodError unused2) {
                        l1VarCreate = viewModelProvider$Factory.create(y9.w.v(kClass), dVar);
                    }
                    l1Var = l1VarCreate;
                    ViewModelStore viewModelStore2 = (ViewModelStore) this.f12779b;
                    viewModelStore2.getClass();
                    l1Var.getClass();
                    l1 l1Var2 = (l1) viewModelStore2.f3412a.put(str, l1Var);
                    if (l1Var2 != null) {
                        l1Var2.clear$lifecycle_viewmodel();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return l1Var;
    }

    public Object N(z70.i iVar) {
        z1.r rVar = (z1.r) this.f12782e;
        g1 g1VarD = rVar.d();
        pm.j jVar = pm.j.HalfExpanded;
        if (!((z1.a0) g1VarD).c(jVar)) {
            return Unit.f26487a;
        }
        Object objF = z1.k.f(rVar, jVar, pm.b.f35490a, iVar);
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        if (objF != aVar) {
            objF = Unit.f26487a;
        }
        return objF == aVar ? objF : Unit.f26487a;
    }

    public boolean O(Context context) {
        if (((Boolean) this.f12781d) == null) {
            this.f12781d = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!((Boolean) this.f12780c).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.f12781d).booleanValue();
    }

    public boolean P(Context context) {
        if (((Boolean) this.f12780c) == null) {
            this.f12780c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!((Boolean) this.f12780c).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.f12780c).booleanValue();
    }

    public Object Q(z70.i iVar) {
        Object objF = z1.k.f((z1.r) this.f12782e, pm.j.Hidden, pm.b.f35491b, iVar);
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        if (objF != aVar) {
            objF = Unit.f26487a;
        }
        return objF == aVar ? objF : Unit.f26487a;
    }

    public boolean R(q20.e eVar) {
        q20.i iVar = (q20.i) this.f12781d;
        return (iVar == null || eVar == null || iVar.f35949a.get() != eVar) ? false : true;
    }

    public void S(q20.e eVar) {
        synchronized (this.f12779b) {
            try {
                if (R(eVar)) {
                    q20.i iVar = (q20.i) this.f12781d;
                    if (!iVar.f35951c) {
                        iVar.f35951c = true;
                        ((Handler) this.f12780c).removeCallbacksAndMessages(iVar);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void U(q20.e eVar) {
        synchronized (this.f12779b) {
            try {
                if (R(eVar)) {
                    q20.i iVar = (q20.i) this.f12781d;
                    if (iVar.f35951c) {
                        iVar.f35951c = false;
                        W(iVar);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object V(z70.c r8) throws java.lang.Throwable {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f12780c
            v80.q r0 = (v80.q) r0
            boolean r1 = r8 instanceof d8.w0
            if (r1 == 0) goto L17
            r1 = r8
            d8.w0 r1 = (d8.w0) r1
            int r2 = r1.f14728m
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f14728m = r2
            goto L1c
        L17:
            d8.w0 r1 = new d8.w0
            r1.<init>(r7, r8)
        L1c:
            java.lang.Object r8 = r1.f14727k
            y70.a r2 = y70.a.COROUTINE_SUSPENDED
            int r3 = r1.f14728m
            r4 = 2
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L41
            if (r3 == r5) goto L3a
            if (r3 != r4) goto L33
            e90.a r1 = r1.f14726j
            ba0.g.M(r8)     // Catch: java.lang.Throwable -> L31
            goto L78
        L31:
            r8 = move-exception
            goto L81
        L33:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r8)
            r8 = 0
            return r8
        L3a:
            e90.a r3 = r1.f14726j
            ba0.g.M(r8)
            r8 = r3
            goto L5c
        L41:
            ba0.g.M(r8)
            boolean r8 = r0.a0()
            if (r8 == 0) goto L4d
            kotlin.Unit r8 = kotlin.Unit.f26487a
            return r8
        L4d:
            java.lang.Object r8 = r7.f12779b
            e90.c r8 = (e90.c) r8
            r1.f14726j = r8
            r1.f14728m = r5
            java.lang.Object r3 = r8.g(r1)
            if (r3 != r2) goto L5c
            goto L76
        L5c:
            boolean r3 = r0.a0()     // Catch: java.lang.Throwable -> L68
            if (r3 == 0) goto L6c
            kotlin.Unit r0 = kotlin.Unit.f26487a     // Catch: java.lang.Throwable -> L68
            r8.e(r6)
            return r0
        L68:
            r0 = move-exception
            r1 = r8
            r8 = r0
            goto L81
        L6c:
            r1.f14726j = r8     // Catch: java.lang.Throwable -> L68
            r1.f14728m = r4     // Catch: java.lang.Throwable -> L68
            java.lang.Object r1 = r7.E(r1)     // Catch: java.lang.Throwable -> L68
            if (r1 != r2) goto L77
        L76:
            return r2
        L77:
            r1 = r8
        L78:
            kotlin.Unit r8 = kotlin.Unit.f26487a     // Catch: java.lang.Throwable -> L31
            r0.R(r8)     // Catch: java.lang.Throwable -> L31
            r1.e(r6)
            return r8
        L81:
            r1.e(r6)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.a0.V(z70.c):java.lang.Object");
    }

    public void W(q20.i iVar) {
        Handler handler = (Handler) this.f12780c;
        int i11 = iVar.f35950b;
        if (i11 == -2) {
            return;
        }
        if (i11 <= 0) {
            i11 = i11 == -1 ? 1500 : 2750;
        }
        handler.removeCallbacksAndMessages(iVar);
        handler.sendMessageDelayed(Message.obtain(handler, 0, iVar), i11);
    }

    /* JADX WARN: Finally extract failed */
    public void X(xe.b bVar) {
        Set setV0;
        ReentrantReadWriteLock.ReadLock lock = ((ReentrantReadWriteLock) this.f12779b).readLock();
        lock.lock();
        try {
            xe.b bVar2 = (xe.b) this.f12780c;
            lock.unlock();
            ReentrantReadWriteLock reentrantReadWriteLock = (ReentrantReadWriteLock) this.f12779b;
            ReentrantReadWriteLock.ReadLock lock2 = reentrantReadWriteLock.readLock();
            int i11 = 0;
            int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
            for (int i12 = 0; i12 < readHoldCount; i12++) {
                lock2.unlock();
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                this.f12780c = bVar;
                while (i11 < readHoldCount) {
                    lock2.lock();
                    i11++;
                }
                writeLock.unlock();
                if (Intrinsics.areEqual(bVar, bVar2)) {
                    return;
                }
                synchronized (this.f12781d) {
                    setV0 = CollectionsKt.v0((LinkedHashSet) this.f12782e);
                }
                Iterator it = setV0.iterator();
                while (it.hasNext()) {
                    ((Function1) it.next()).invoke(bVar);
                }
            } catch (Throwable th2) {
                while (i11 < readHoldCount) {
                    lock2.lock();
                    i11++;
                }
                writeLock.unlock();
                throw th2;
            }
        } catch (Throwable th3) {
            lock.unlock();
            throw th3;
        }
    }

    public void Y() {
        q20.i iVar = (q20.i) this.f12782e;
        if (iVar != null) {
            this.f12781d = iVar;
            this.f12782e = null;
            q20.e eVar = (q20.e) iVar.f35949a.get();
            if (eVar == null) {
                this.f12781d = null;
            } else {
                Handler handler = q20.g.f35927x;
                handler.sendMessage(handler.obtainMessage(0, eVar.f35912a));
            }
        }
    }

    public void Z(w4.n nVar) {
        if (((w4.z) this.f12780c) == w4.z.Dispatching) {
            s1 s1Var = (s1) this.f12779b;
            if (s1Var == null) {
                h2.b("layoutCoordinates not set");
                return;
            }
            w4.u.i(nVar, s1Var.S(0L), new w4.a0((w4.b0) this.f12782e, 1), true);
        }
        this.f12780c = w4.z.NotDispatching;
    }

    public void a0(jb.k kVar) {
        kVar.getClass();
        r rVar = new r(25, this, kVar);
        synchronized (this.f12781d) {
        }
        ((Handler) ((jb.b) this.f12779b).f24851a).postDelayed(rVar, 5400000L);
    }

    @Override // t1.x1
    public long b(t1.o oVar, t1.o oVar2, t1.o oVar3) {
        int iB = oVar.b();
        long jMax = 0;
        for (int i11 = 0; i11 < iB; i11++) {
            jMax = Math.max(jMax, ((t1.p) this.f12779b).get(i11).c(oVar.a(i11), oVar2.a(i11), oVar3.a(i11)));
        }
        return jMax;
    }

    public void b0(final int i11, final int i12, int i13, final boolean z11) {
        final int i14 = i11 - i13;
        z1.r.k((z1.r) this.f12782e, z1.k.a(new Function1() { // from class: pm.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                float f11;
                h1 h1Var = (h1) obj;
                h1Var.getClass();
                for (j jVar : j.d()) {
                    if (jVar != j.Hidden || jVar.a() != null) {
                        float fC = jVar.c() * i14;
                        j jVar2 = j.Expanded;
                        int i15 = i11;
                        if (jVar != jVar2 || z11) {
                            f11 = i15;
                            fC = Float.min(fC, i12);
                        } else {
                            f11 = i15;
                        }
                        h1Var.a(jVar, f11 - fC);
                    }
                }
                return Unit.f26487a;
            }
        }));
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00fe A[Catch: NumberFormatException | JSONException -> 0x010b, NumberFormatException | JSONException -> 0x010b, TRY_LEAVE, TryCatch #0 {NumberFormatException | JSONException -> 0x010b, blocks: (B:10:0x0031, B:24:0x0065, B:24:0x0065, B:26:0x0072, B:26:0x0072, B:28:0x0084, B:28:0x0084, B:29:0x008d, B:29:0x008d, B:51:0x00fe, B:51:0x00fe, B:33:0x009a, B:33:0x009a, B:35:0x00a7, B:35:0x00a7, B:37:0x00b9, B:37:0x00b9, B:38:0x00c2, B:38:0x00c2, B:42:0x00ce, B:42:0x00ce, B:46:0x00de, B:46:0x00de, B:50:0x00f2, B:50:0x00f2), top: B:63:0x0031, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.os.Bundle c0() {
        /*
            Method dump skipped, instruction units count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.a0.c0():android.os.Bundle");
    }

    @Override // ia0.i0
    public void cancel() throws IOException {
        ((Socket) this.f12779b).close();
    }

    @Override // ym.z
    public y80.a2 d() {
        return ((en.o) this.f12780c).f16187w;
    }

    public void d0(Bundle bundle) {
        e1 e1Var = (e1) this.f12782e;
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        SharedPreferences sharedPreferencesT = e1Var.t();
        n1 n1Var = (n1) e1Var.f21216b;
        SharedPreferences.Editor editorEdit = sharedPreferencesT.edit();
        int size = bundle2.size();
        String str = (String) this.f12779b;
        if (size == 0) {
            editorEdit.remove(str);
        } else {
            JSONArray jSONArray = new JSONArray();
            for (String str2 : bundle2.keySet()) {
                Object obj = bundle2.get(str2);
                if (obj != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(Constants.BRAZE_PUSH_CUSTOM_NOTIFICATION_ID, str2);
                        f4.a();
                        if (n1Var.f44985d.A(null, y00.g0.P0)) {
                            if (obj instanceof String) {
                                jSONObject.put("v", obj.toString());
                                jSONObject.put(Constants.BRAZE_PUSH_TITLE_KEY, Constants.BRAZE_PUSH_SUMMARY_TEXT_KEY);
                            } else if (obj instanceof Long) {
                                jSONObject.put("v", obj.toString());
                                jSONObject.put(Constants.BRAZE_PUSH_TITLE_KEY, "l");
                            } else if (obj instanceof int[]) {
                                jSONObject.put("v", Arrays.toString((int[]) obj));
                                jSONObject.put(Constants.BRAZE_PUSH_TITLE_KEY, "ia");
                            } else if (obj instanceof long[]) {
                                jSONObject.put("v", Arrays.toString((long[]) obj));
                                jSONObject.put(Constants.BRAZE_PUSH_TITLE_KEY, "la");
                            } else if (obj instanceof Double) {
                                jSONObject.put("v", obj.toString());
                                jSONObject.put(Constants.BRAZE_PUSH_TITLE_KEY, Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE);
                            } else {
                                w0 w0Var = n1Var.f44987f;
                                n1.m(w0Var);
                                w0Var.f45260g.b(obj.getClass(), "Cannot serialize bundle value to SharedPreferences. Type");
                            }
                            jSONArray.put(jSONObject);
                        } else {
                            jSONObject.put("v", obj.toString());
                            if (obj instanceof String) {
                                jSONObject.put(Constants.BRAZE_PUSH_TITLE_KEY, Constants.BRAZE_PUSH_SUMMARY_TEXT_KEY);
                            } else if (obj instanceof Long) {
                                jSONObject.put(Constants.BRAZE_PUSH_TITLE_KEY, "l");
                            } else if (obj instanceof Double) {
                                jSONObject.put(Constants.BRAZE_PUSH_TITLE_KEY, Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE);
                            } else {
                                w0 w0Var2 = n1Var.f44987f;
                                n1.m(w0Var2);
                                w0Var2.f45260g.b(obj.getClass(), "Cannot serialize bundle value to SharedPreferences. Type");
                            }
                            jSONArray.put(jSONObject);
                        }
                    } catch (JSONException e5) {
                        w0 w0Var3 = n1Var.f44987f;
                        n1.m(w0Var3);
                        w0Var3.f45260g.b(e5, "Cannot serialize bundle value to SharedPreferences");
                    }
                }
            }
            editorEdit.putString(str, jSONArray.toString());
        }
        editorEdit.apply();
        this.f12781d = bundle2;
    }

    @Override // t1.x1
    public t1.o e(long j9, t1.o oVar, t1.o oVar2, t1.o oVar3) {
        t1.o oVar4;
        if (((t1.o) this.f12780c) == null) {
            this.f12780c = oVar.c();
        }
        t1.o oVar5 = (t1.o) this.f12780c;
        if (oVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("valueVector");
            oVar5 = null;
        }
        int iB = oVar5.b();
        int i11 = 0;
        while (true) {
            oVar4 = (t1.o) this.f12780c;
            if (i11 >= iB) {
                break;
            }
            if (oVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("valueVector");
                oVar4 = null;
            }
            oVar4.e(((t1.p) this.f12779b).get(i11).b(oVar.a(i11), oVar2.a(i11), j9, oVar3.a(i11)), i11);
            i11++;
        }
        if (oVar4 != null) {
            return oVar4;
        }
        Intrinsics.throwUninitializedPropertyAccessException("valueVector");
        return null;
    }

    @Override // ym.z
    public BasketManager g() {
        return ((en.o) this.f12780c).f16175j;
    }

    @Override // ia0.i0
    public ia0.j0 getSource() {
        return (ja0.g) this.f12781d;
    }

    @Override // um.u
    public void h(dn.o oVar) {
        dn.n nVar = oVar.f15034a;
        if (nVar != null) {
            ((en.o) this.f12780c).f29971a.f29975c.a(mv.e0.c((mv.e0) this.f12781d, nVar, cv.g.DETAIL, oVar.f15038e, oVar.f15036c, oVar.f15037d));
        }
    }

    @Override // ym.z
    public void i(String str, int i11, boolean z11) {
        Object value;
        BasketManager basketManager;
        str.getClass();
        en.o oVar = (en.o) this.f12780c;
        oVar.getClass();
        BasketManager basketManager2 = oVar.f16175j;
        int quantity = basketManager2 != null ? basketManager2.getQuantity(str) : 0;
        if (quantity != i11 && (basketManager = oVar.f16175j) != null) {
            basketManager.setQuantity(str, i11, i11 > quantity ? LatestBasketInteraction.ADD : LatestBasketInteraction.REMOVE, LatestInteractionOrigin.SCREEN_RECOMMENDATION);
        }
        y80.a2 a2Var = oVar.f16186v;
        do {
            value = a2Var.getValue();
        } while (!a2Var.g(value, x0.h((Map) value, new Pair(ItemId.m197boximpl(str), Integer.valueOf(i11)))));
        if (z11) {
            BasketManager basketManager3 = oVar.f16175j;
            x70.c cVar = null;
            if (basketManager3 != null) {
                v80.f0.B(m1.d(oVar), null, null, new d8.c(oVar, basketManager3, cVar, 8), 3);
            } else {
                v80.f0.B(m1.d(oVar), null, null, new a3.y(oVar, cVar, 5), 3);
            }
        }
    }

    @Override // um.u
    public void j(String str, f70.i iVar) {
        str.getClass();
        iVar.getClass();
        ((br.h) this.f12782e).invoke(ItemId.m197boximpl(str), iVar);
    }

    @Override // t1.x1
    public t1.o k(t1.o oVar, t1.o oVar2, t1.o oVar3) {
        t1.o oVar4;
        if (((t1.o) this.f12782e) == null) {
            this.f12782e = oVar3.c();
        }
        t1.o oVar5 = (t1.o) this.f12782e;
        if (oVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("endVelocityVector");
            oVar5 = null;
        }
        int iB = oVar5.b();
        int i11 = 0;
        while (true) {
            oVar4 = (t1.o) this.f12782e;
            if (i11 >= iB) {
                break;
            }
            if (oVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("endVelocityVector");
                oVar4 = null;
            }
            oVar4.e(((t1.p) this.f12779b).get(i11).d(oVar.a(i11), oVar2.a(i11), oVar3.a(i11)), i11);
            i11++;
        }
        if (oVar4 != null) {
            return oVar4;
        }
        Intrinsics.throwUninitializedPropertyAccessException("endVelocityVector");
        return null;
    }

    @Override // um.u
    public void l(um.g gVar) {
        gVar.getClass();
    }

    @Override // t1.x1
    public t1.o m(long j9, t1.o oVar, t1.o oVar2, t1.o oVar3) {
        t1.o oVar4;
        if (((t1.o) this.f12781d) == null) {
            this.f12781d = oVar3.c();
        }
        t1.o oVar5 = (t1.o) this.f12781d;
        if (oVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
            oVar5 = null;
        }
        int iB = oVar5.b();
        int i11 = 0;
        while (true) {
            oVar4 = (t1.o) this.f12781d;
            if (i11 >= iB) {
                break;
            }
            if (oVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
                oVar4 = null;
            }
            oVar4.e(((t1.p) this.f12779b).get(i11).e(oVar.a(i11), oVar2.a(i11), j9, oVar3.a(i11)), i11);
            i11++;
        }
        if (oVar4 != null) {
            return oVar4;
        }
        Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
        return null;
    }

    @Override // ia0.i0
    public ia0.h0 n() {
        return (ja0.f) this.f12782e;
    }

    @Override // um.u
    public void o(String str) {
        str.getClass();
    }

    @Override // um.u
    public void r() {
        BasketManager basketManager;
        en.o oVar = (en.o) this.f12780c;
        oVar.f16168c.f4432q = 0L;
        Integer num = oVar.f16176k;
        if ((num != null && num.intValue() == 0) || ((basketManager = oVar.f16175j) != null && basketManager.getTotalBasketItems() == 0)) {
            oVar.h();
        }
    }

    @Override // um.u
    public void s(um.g gVar) {
        gVar.getClass();
        if (gVar == um.g.MAX_ITEM_COUNT) {
            ((en.o) this.f12780c).i();
        }
    }

    public String toString() {
        switch (this.f12778a) {
            case 12:
                String string = ((Socket) this.f12779b).toString();
                string.getClass();
                return string;
            default:
                return super.toString();
        }
    }

    public void u(oa0.j jVar) {
        ArrayList arrayList = (ArrayList) this.f12781d;
        Objects.requireNonNull(jVar, "factory == null");
        arrayList.add(jVar);
    }

    public void v(String str, String str2) {
        this.f12782e = ((String) this.f12782e) + (((String) this.f12782e).length() == 0 ? "?" : "&") + str + '=' + str2;
    }

    public void w(String str) {
        Objects.requireNonNull(str, "baseUrl == null");
        q90.u uVar = new q90.u();
        uVar.e(null, str);
        q90.v vVarB = uVar.b();
        if ("".equals(vVarB.f36628f.get(r0.size() - 1))) {
            this.f12780c = vVarB;
        } else {
            j4.d.o(vVarB, "baseUrl must end in /: ");
        }
    }

    public fd.t x() {
        fd.e eVar;
        Context context = (Context) this.f12779b;
        td.f fVar = (td.f) this.f12780c;
        fd.i iVar = (fd.i) this.f12782e;
        iVar.getClass();
        td.f fVar2 = new td.f(fVar.f39974a, fVar.f39975b, fVar.f39976c, fVar.f39977d, fVar.f39978e, fVar.f39979f, fVar.f39980g, fVar.f39981h, fVar.f39982i, fVar.f39983j, fVar.f39984k, fVar.l, fVar.f39985m, new fd.k(android.support.v4.media.session.a.M(iVar.f17566a)));
        u70.t tVarB = u70.l.b(new fd.n(0));
        u70.t tVarB2 = u70.l.b(new cw.b(this, 14));
        u70.t tVarB3 = u70.l.b(new fd.n(1));
        fd.e eVar2 = (fd.e) this.f12781d;
        if (eVar2 == null) {
            kotlin.collections.n0 n0Var = kotlin.collections.n0.f26529a;
            eVar = new fd.e(n0Var, n0Var, n0Var, n0Var, n0Var);
        } else {
            eVar = eVar2;
        }
        return new fd.t(new fd.q(context, fVar2, tVarB, tVarB2, tVarB3, eVar));
    }

    public oa0.o0 y() {
        ArrayList arrayList = (ArrayList) this.f12781d;
        if (((q90.v) this.f12780c) == null) {
            h2.b("Base URL required.");
            return null;
        }
        q90.d0 d0Var = (q90.d0) this.f12779b;
        if (d0Var == null) {
            d0Var = new q90.d0();
        }
        q90.d0 d0Var2 = d0Var;
        d7.e eVar = oa0.h0.f32291a;
        oa0.a aVar = oa0.h0.f32293c;
        ArrayList arrayList2 = new ArrayList((ArrayList) this.f12782e);
        List listA = aVar.a(eVar);
        arrayList2.addAll(listA);
        List listB = aVar.b();
        ArrayList arrayList3 = new ArrayList(arrayList.size() + 1 + listB.size());
        arrayList3.add(new oa0.b(0));
        arrayList3.addAll(arrayList);
        arrayList3.addAll(listB);
        q90.v vVar = (q90.v) this.f12780c;
        List listUnmodifiableList = Collections.unmodifiableList(arrayList3);
        List listUnmodifiableList2 = Collections.unmodifiableList(arrayList2);
        listA.size();
        return new oa0.o0(d0Var2, vVar, listUnmodifiableList, listUnmodifiableList2, eVar);
    }

    public void z(jb.k kVar) {
        Runnable runnable;
        kVar.getClass();
        synchronized (this.f12781d) {
            runnable = (Runnable) ((LinkedHashMap) this.f12782e).remove(kVar);
        }
        if (runnable != null) {
            ((Handler) ((jb.b) this.f12779b).f24851a).removeCallbacks(runnable);
        }
    }

    @Override // um.u
    public void c() {
    }

    @Override // ym.z
    public void f() {
    }

    @Override // um.u
    public void p() {
    }

    public a0(jb.b bVar, dn.k kVar) {
        this.f12778a = 13;
        bVar.getClass();
        this.f12779b = bVar;
        this.f12780c = kVar;
        this.f12781d = new Object();
        this.f12782e = new LinkedHashMap();
    }

    public a0(e1 e1Var, String str) {
        this.f12778a = 29;
        this.f12782e = e1Var;
        com.google.android.gms.common.internal.i0.e(str);
        this.f12779b = str;
        this.f12780c = new Bundle();
    }

    public a0(pg.a2 a2Var, en.o oVar, mv.e0 e0Var, br.h hVar) {
        this.f12778a = 7;
        a2Var.getClass();
        oVar.getClass();
        e0Var.getClass();
        this.f12779b = a2Var;
        this.f12780c = oVar;
        this.f12781d = e0Var;
        this.f12782e = hVar;
    }

    public a0(v80.b0 b0Var, c50.p pVar, cn.u uVar, d8.c cVar) {
        this.f12778a = 5;
        this.f12779b = b0Var;
        this.f12780c = cVar;
        this.f12781d = cg.a(Integer.MAX_VALUE, null, null, 6);
        this.f12782e = new se.b(14);
        i1 i1Var = (i1) b0Var.getCoroutineContext().get(v80.h1.f42106a);
        if (i1Var != null) {
            i1Var.J(new y0(pVar, this, uVar, 8));
        }
    }

    public a0(bo.d dVar, hm.v vVar, u1 u1Var, MainActivity mainActivity) {
        this.f12778a = 28;
        vVar.getClass();
        u1Var.getClass();
        this.f12779b = dVar;
        this.f12780c = vVar;
        this.f12781d = u1Var;
        this.f12782e = mainActivity;
    }

    public a0(ViewModelStore viewModelStore, ViewModelProvider$Factory viewModelProvider$Factory, CreationExtras creationExtras) {
        this.f12778a = 1;
        viewModelStore.getClass();
        viewModelProvider$Factory.getClass();
        creationExtras.getClass();
        this.f12779b = viewModelStore;
        this.f12780c = viewModelProvider$Factory;
        this.f12781d = creationExtras;
        this.f12782e = new a9.c();
    }

    public a0(Socket socket) {
        this.f12778a = 12;
        this.f12779b = socket;
        this.f12780c = new AtomicInteger();
        this.f12781d = new ja0.g(this);
        this.f12782e = new ja0.f(this);
    }

    public a0(c5.y yVar, c4.l lVar) {
        this.f12778a = 2;
        this.f12779b = yVar;
        this.f12780c = lVar;
        AutofillManager autofillManager = (AutofillManager) yVar.getContext().getSystemService(AutofillManager.class);
        if (autofillManager != null) {
            this.f12781d = autofillManager;
            yVar.setImportantForAutofill(1);
            AutofillId autofillId = yVar.getAutofillId();
            if (autofillId != null) {
                this.f12782e = autofillId;
                return;
            }
            throw b3.i.D("Required value was null.");
        }
        h2.b("Autofill service could not be located.");
        throw null;
    }

    public a0(KSerializer kSerializer) {
        this.f12778a = 17;
        this.f12781d = "";
        this.f12782e = "";
        this.f12780c = kSerializer;
        this.f12779b = kSerializer.getDescriptor().a();
    }

    public a0(k50.a aVar, k50.b bVar, k8.d dVar) {
        this.f12778a = 14;
        this.f12779b = aVar;
        this.f12780c = bVar;
        this.f12781d = dVar;
        this.f12782e = new ConcurrentHashMap();
    }

    public a0(w4.b0 b0Var) {
        this.f12778a = 26;
        this.f12782e = b0Var;
        this.f12780c = w4.z.Unknown;
    }

    public a0(pm.j jVar, Function0 function0, Function1 function1, Function1 function12, t1.i iVar, t1.s sVar, Function1 function13) {
        this.f12778a = 20;
        function0.getClass();
        function1.getClass();
        function12.getClass();
        iVar.getClass();
        sVar.getClass();
        function13.getClass();
        this.f12779b = function0;
        this.f12780c = function1;
        this.f12781d = function12;
        nv.a aVar = pm.b.f35492c;
        p9.a aVar2 = pm.b.f35493d;
        z1.r rVar = new z1.r(jVar, new defpackage.d(function13, 27));
        rVar.f46647b = aVar;
        rVar.f46648c = aVar2;
        rVar.f46649d = iVar;
        rVar.f46650e = sVar;
        this.f12782e = rVar;
    }

    public a0(p0 p0Var, w.e eVar, w.v vVar, ub.a aVar) {
        this.f12778a = 16;
        p0Var.getClass();
        eVar.getClass();
        vVar.getClass();
        aVar.getClass();
        this.f12779b = p0Var;
        this.f12780c = eVar;
        this.f12781d = vVar;
        this.f12782e = aVar;
    }

    public a0(Typeface typeface, m8.b bVar) {
        int i11;
        int i12;
        int i13;
        int i14;
        this.f12778a = 15;
        this.f12782e = typeface;
        this.f12779b = bVar;
        this.f12781d = new l8.t(1024);
        int iA = bVar.a(6);
        if (iA != 0) {
            int i15 = iA + bVar.f21598a;
            i11 = ((ByteBuffer) bVar.f21601d).getInt(((ByteBuffer) bVar.f21601d).getInt(i15) + i15);
        } else {
            i11 = 0;
        }
        this.f12780c = new char[i11 * 2];
        int iA2 = bVar.a(6);
        if (iA2 != 0) {
            int i16 = iA2 + bVar.f21598a;
            i12 = ((ByteBuffer) bVar.f21601d).getInt(((ByteBuffer) bVar.f21601d).getInt(i16) + i16);
        } else {
            i12 = 0;
        }
        for (int i17 = 0; i17 < i12; i17++) {
            l8.w wVar = new l8.w(this, i17);
            m8.a aVarB = wVar.b();
            int iA3 = aVarB.a(4);
            Character.toChars(iA3 != 0 ? ((ByteBuffer) aVarB.f21601d).getInt(iA3 + aVarB.f21598a) : 0, (char[]) this.f12780c, i17 * 2);
            m8.a aVarB2 = wVar.b();
            int iA4 = aVarB2.a(16);
            if (iA4 != 0) {
                int i18 = iA4 + aVarB2.f21598a;
                i13 = ((ByteBuffer) aVarB2.f21601d).getInt(((ByteBuffer) aVarB2.f21601d).getInt(i18) + i18);
            } else {
                i13 = 0;
            }
            pd.g.i("invalid metadata codepoint length", i13 > 0);
            l8.t tVar = (l8.t) this.f12781d;
            m8.a aVarB3 = wVar.b();
            int iA5 = aVarB3.a(16);
            if (iA5 != 0) {
                int i19 = iA5 + aVarB3.f21598a;
                i14 = ((ByteBuffer) aVarB3.f21601d).getInt(((ByteBuffer) aVarB3.f21601d).getInt(i19) + i19);
            } else {
                i14 = 0;
            }
            tVar.a(wVar, 0, i14 - 1);
        }
    }

    public a0(Context context) {
        this.f12778a = 9;
        this.f12779b = context.getApplicationContext();
        this.f12780c = td.f.f39973o;
        this.f12781d = null;
        this.f12782e = new fd.i();
    }

    public /* synthetic */ a0(int i11, Object obj, Object obj2, Object obj3, Object obj4) {
        this.f12778a = i11;
        this.f12779b = obj;
        this.f12780c = obj2;
        this.f12781d = obj3;
        this.f12782e = obj4;
    }

    public a0(t70.a aVar, h0.n nVar, i1 i1Var) {
        this.f12778a = 8;
        aVar.getClass();
        nVar.getClass();
        i1Var.getClass();
        this.f12779b = aVar;
        this.f12780c = nVar;
        this.f12781d = i1Var;
        this.f12782e = y80.r.f(new d8.c(this, (x70.c) null, 15));
    }

    public a0(d8.y yVar, List list) {
        this.f12778a = 4;
        list.getClass();
        this.f12782e = yVar;
        this.f12779b = e90.d.a();
        this.f12780c = new v80.q();
        this.f12781d = CollectionsKt.r0(list);
    }

    public a0(t1.p pVar) {
        this.f12778a = 25;
        this.f12779b = pVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a0(t1.y yVar) {
        this(new jd.f(yVar, 27));
        this.f12778a = 25;
    }
}
