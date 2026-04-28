package a40;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.a2;
import androidx.fragment.app.m2;
import androidx.lifecycle.k0;
import androidx.lifecycle.p0;
import androidx.work.impl.WorkDatabase;
import atd.d.BuildConfig;
import com.appsflyer.internal.AFa1tSDK;
import com.appsflyer.internal.AFd1wSDK;
import com.appsflyer.internal.AFi1aSDK;
import com.appsflyer.internal.AFj1rSDK;
import com.braze.ui.inappmessage.views.InAppMessageImmersiveBaseView;
import com.facebook.FacebookException;
import com.facebook.FacebookServiceException;
import cy.g0;
import e0.k1;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o00.x0;
import oa0.n0;
import org.bouncycastle.iana.AEADAlgorithm;
import v80.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f768c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f769d;

    public /* synthetic */ q(d1.d dVar, m0.c0 c0Var, e6.i iVar) {
        this.f766a = 16;
        Map map = Collections.EMPTY_MAP;
        this.f767b = dVar;
        this.f768c = c0Var;
        this.f769d = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zBooleanValue;
        boolean z11;
        Object next;
        k0 k0VarJ;
        switch (this.f766a) {
            case 0:
                u uVar = (u) this.f767b;
                String str = (String) this.f768c;
                String str2 = (String) this.f769d;
                o oVar = uVar.f783g;
                oVar.getClass();
                try {
                    ((c40.q) oVar.f750d.f20003d).h(str, str2);
                    return;
                } catch (IllegalArgumentException e5) {
                    Context context = oVar.f747a;
                    if (context != null && (context.getApplicationInfo().flags & 2) != 0) {
                        throw e5;
                    }
                    Log.e("FirebaseCrashlytics", "Attempting to set custom attribute with null key, ignoring.", null);
                    return;
                }
            case 1:
                ViewGroup viewGroup = (ViewGroup) this.f767b;
                View view = (View) this.f768c;
                androidx.fragment.app.f fVar = (androidx.fragment.app.f) this.f769d;
                viewGroup.getClass();
                viewGroup.endViewTransition(view);
                fVar.f3184c.f3254a.c(fVar);
                return;
            case 2:
                m2 m2Var = (m2) this.f767b;
                m2 m2Var2 = (m2) this.f768c;
                androidx.fragment.app.p pVar = (androidx.fragment.app.p) this.f769d;
                a2.a(m2Var.f3269c, m2Var2.f3269c, pVar.f3306o, pVar.f3305n);
                return;
            case 3:
                ((BuildConfig) this.f767b).getSDKTransactionID((String) this.f768c, (WeakReference) this.f769d);
                return;
            case 4:
                ((s0.p) this.f767b).b(b0.j.c((k1) this.f768c), (w.y) this.f769d);
                return;
            case 5:
                ((s0.p) this.f767b).c(b0.j.c((k1) this.f768c), (ky.p) this.f769d);
                return;
            case 6:
                c1.e eVar = (c1.e) this.f767b;
                Runnable runnable = (Runnable) this.f768c;
                Runnable runnable2 = (Runnable) this.f769d;
                if (eVar.f6861j) {
                    runnable.run();
                    return;
                } else {
                    runnable2.run();
                    return;
                }
            case 7:
                c1.e eVar2 = (c1.e) this.f767b;
                m0.c0 c0Var = (m0.c0) this.f768c;
                Map map = Collections.EMPTY_MAP;
                e6.i iVar = (e6.i) this.f769d;
                try {
                    eVar2.f6852a.j(c0Var);
                    iVar.b(null);
                    return;
                } catch (RuntimeException e11) {
                    iVar.d(e11);
                    return;
                }
            case 8:
                ((a8.h) this.f767b).j((c1.n) this.f768c, (Map.Entry) this.f769d);
                return;
            case 9:
                ((AFa1tSDK) this.f767b).e_((Context) this.f768c, (Intent) this.f769d);
                return;
            case 10:
                AFd1wSDK.AFAdRevenueData((AFd1wSDK) this.f767b, (Throwable) this.f769d, (String) this.f768c);
                return;
            case 11:
                ((AFj1rSDK) this.f767b).getMediationNetwork((AFi1aSDK) this.f768c, (Runnable) this.f769d);
                return;
            case 12:
                InAppMessageImmersiveBaseView.setLargerCloseButtonClickArea$lambda$8((View) this.f767b, (InAppMessageImmersiveBaseView) this.f768c, (ViewParent) this.f769d);
                return;
            case 13:
                com.google.firebase.messaging.f fVar2 = (com.google.firebase.messaging.f) this.f767b;
                Intent intent = (Intent) this.f768c;
                d10.g gVar = (d10.g) this.f769d;
                try {
                    fVar2.handleIntent(intent);
                    return;
                } finally {
                    gVar.b(null);
                }
            case 14:
                cy.c cVar = (cy.c) this.f767b;
                cy.r rVar = (cy.r) this.f768c;
                Bundle bundle = (Bundle) this.f769d;
                try {
                    cVar.i(bundle, rVar);
                    cVar.s(rVar, bundle, null);
                    return;
                } catch (FacebookException e12) {
                    cVar.s(rVar, null, e12);
                    return;
                }
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                g0 g0Var = (g0) this.f767b;
                cy.r rVar2 = (cy.r) this.f768c;
                Bundle bundle2 = (Bundle) this.f769d;
                try {
                    g0Var.i(bundle2, rVar2);
                    g0Var.r(bundle2, rVar2);
                    return;
                } catch (FacebookServiceException e13) {
                    ax.w wVar = e13.f10987b;
                    g0Var.q(rVar2, wVar.f5021d, wVar.a(), String.valueOf(wVar.f5019b));
                    return;
                } catch (FacebookException e14) {
                    g0Var.q(rVar2, null, e14.getMessage(), null);
                    return;
                }
            case 16:
                d1.d dVar = (d1.d) this.f767b;
                m0.c0 c0Var2 = (m0.c0) this.f768c;
                Map map2 = Collections.EMPTY_MAP;
                e6.i iVar2 = (e6.i) this.f769d;
                try {
                    dVar.f13677a.j(c0Var2);
                    iVar2.b(null);
                    return;
                } catch (RuntimeException e15) {
                    iVar2.d(e15);
                    return;
                }
            case 17:
                d1.d dVar2 = (d1.d) this.f767b;
                Runnable runnable3 = (Runnable) this.f768c;
                Runnable runnable4 = (Runnable) this.f769d;
                if (dVar2.f13682f) {
                    runnable3.run();
                    return;
                } else {
                    runnable4.run();
                    return;
                }
            case 18:
                jb.f fVar3 = (jb.f) this.f767b;
                e6.l lVar = (e6.l) this.f768c;
                jb.d0 d0Var = (jb.d0) this.f769d;
                fVar3.getClass();
                try {
                    zBooleanValue = ((Boolean) lVar.f15782b.get()).booleanValue();
                    break;
                } catch (InterruptedException | ExecutionException unused) {
                    zBooleanValue = true;
                }
                synchronized (fVar3.f24893k) {
                    try {
                        qb.h hVarV = wd.a.v(d0Var.f24866a);
                        String str3 = hVarV.f36799a;
                        if (fVar3.c(str3) == d0Var) {
                            fVar3.b(str3);
                        }
                        ib.w.d().a(jb.f.l, jb.f.class.getSimpleName() + " " + str3 + " executed; reschedule = " + zBooleanValue);
                        Iterator it = fVar3.f24892j.iterator();
                        while (it.hasNext()) {
                            ((jb.c) it.next()).c(hVarV, zBooleanValue);
                        }
                    } finally {
                    }
                    break;
                }
                return;
            case 19:
                dn.k kVar = (dn.k) this.f767b;
                jb.k kVar2 = (jb.k) this.f768c;
                jb.f fVar4 = (jb.f) kVar.f15018b;
                fVar4.getClass();
                qb.h hVar = kVar2.f24901a;
                String str4 = hVar.f36799a;
                ArrayList arrayList = new ArrayList();
                qb.o oVar2 = (qb.o) fVar4.f24887e.p(new y.a(new jb.e(fVar4, arrayList, str4, 0), 6));
                if (oVar2 == null) {
                    ib.w.d().g(jb.f.l, "Didn't find WorkSpec for id " + hVar);
                    fVar4.f24886d.f38959d.execute(new com.google.firebase.messaging.r(23, fVar4, hVar));
                    return;
                }
                synchronized (fVar4.f24893k) {
                    try {
                        synchronized (fVar4.f24893k) {
                            z11 = fVar4.c(str4) != null;
                            break;
                        }
                        if (z11) {
                            Set set = (Set) fVar4.f24890h.get(str4);
                            if (((jb.k) set.iterator().next()).f24901a.f36800b == hVar.f36800b) {
                                set.add(kVar2);
                                ib.w.d().a(jb.f.l, "Work " + hVar + " is already enqueued for processing");
                            } else {
                                fVar4.f24886d.f38959d.execute(new com.google.firebase.messaging.r(23, fVar4, hVar));
                            }
                            return;
                        }
                        if (oVar2.f36846t != hVar.f36800b) {
                            fVar4.f24886d.f38959d.execute(new com.google.firebase.messaging.r(23, fVar4, hVar));
                            return;
                        }
                        Context context2 = fVar4.f24884b;
                        ib.b bVar = fVar4.f24885c;
                        sb.a aVar = fVar4.f24886d;
                        WorkDatabase workDatabase = fVar4.f24887e;
                        context2.getClass();
                        fVar4.getClass();
                        g40.b bVar2 = new g40.b();
                        bVar2.f20000a = bVar;
                        bVar2.f20001b = aVar;
                        bVar2.f20002c = fVar4;
                        bVar2.f20003d = workDatabase;
                        bVar2.f20004e = oVar2;
                        bVar2.f20005f = arrayList;
                        Context applicationContext = context2.getApplicationContext();
                        applicationContext.getClass();
                        bVar2.f20006g = applicationContext;
                        new dn.k(19);
                        jb.d0 d0Var2 = new jb.d0(bVar2);
                        e6.l lVarY = h0.g.y(d0Var2.f24869d.f38957b.plus(f0.c()), new jb.b0(d0Var2, null, 1));
                        lVarY.f15782b.a(new q(fVar4, lVarY, d0Var2, 18), fVar4.f24886d.f38959d);
                        fVar4.f24889g.put(str4, d0Var2);
                        HashSet hashSet = new HashSet();
                        hashSet.add(kVar2);
                        fVar4.f24890h.put(str4, hashSet);
                        ib.w.d().a(jb.f.l, jb.f.class.getSimpleName() + ": processing " + hVar);
                        return;
                    } finally {
                    }
                }
            case 20:
                l8.m mVar = (l8.m) this.f767b;
                h0.g gVar2 = (h0.g) this.f768c;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.f769d;
                try {
                    l8.s sVarN = ex.i.n(mVar.f27469a);
                    if (sVarN == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    l8.r rVar3 = (l8.r) ((l8.i) sVarN.f27453b);
                    synchronized (rVar3.f27478d) {
                        rVar3.f27480f = threadPoolExecutor;
                        break;
                    }
                    ((l8.i) sVarN.f27453b).a(new l8.l(gVar2, threadPoolExecutor));
                    return;
                } catch (Throwable th2) {
                    gVar2.B(th2);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 21:
                Ref.ObjectRef objectRef = (Ref.ObjectRef) this.f767b;
                lx.s sVar = (lx.s) this.f768c;
                Context context3 = (Context) this.f769d;
                if (yx.a.f46339a.contains(lx.f.class)) {
                    return;
                }
                try {
                    context3.getClass();
                    ((lx.g) objectRef.element).a(lx.t.SUBS, new lx.e(sVar, context3, 1));
                    return;
                } catch (Throwable th3) {
                    yx.a.a(lx.f.class, th3);
                    return;
                }
            case 22:
                lx.k kVar3 = (lx.k) this.f767b;
                lx.t tVar = (lx.t) this.f768c;
                Runnable runnable5 = (Runnable) this.f769d;
                if (yx.a.f46339a.contains(lx.k.class)) {
                    return;
                }
                try {
                    Class cls = kVar3.f28368f;
                    tVar.getClass();
                    lx.u.I(kVar3.f28364b, kVar3.d(), kVar3.f28372j, tVar.a(), Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new lx.i(kVar3, tVar, runnable5)));
                    return;
                } catch (Throwable th4) {
                    yx.a.a(lx.k.class, th4);
                    return;
                }
            case 23:
                lx.l lVar2 = (lx.l) this.f767b;
                lx.t tVar2 = (lx.t) this.f768c;
                Runnable runnable6 = (Runnable) this.f769d;
                if (yx.a.f46339a.contains(lx.l.class)) {
                    return;
                }
                try {
                    Class cls2 = lVar2.f28387o;
                    tVar2.getClass();
                    lx.u.I(lVar2.f28375b, lVar2.d(), lVar2.f28389q, lVar2.g(tVar2), Proxy.newProxyInstance(cls2.getClassLoader(), new Class[]{cls2}, new ab.d(lVar2, new Object[]{tVar2, runnable6}, 2)));
                    return;
                } catch (Throwable th5) {
                    yx.a.a(lx.l.class, th5);
                    return;
                }
            case 24:
                k8.d dVar3 = (k8.d) this.f767b;
                oa0.g gVar3 = (oa0.g) this.f768c;
                n0 n0Var = (n0) this.f769d;
                oa0.l lVar3 = (oa0.l) dVar3.f26135c;
                if (lVar3.f32311b.p()) {
                    gVar3.p(lVar3, new IOException("Canceled"));
                    return;
                } else {
                    gVar3.m(lVar3, n0Var);
                    return;
                }
            case 25:
                ((oa0.g) this.f768c).p((oa0.l) ((k8.d) this.f767b).f26135c, (Throwable) this.f769d);
                return;
            case 26:
                r2.f fVar5 = (r2.f) this.f767b;
                r2.k kVar4 = (r2.k) this.f768c;
                r2.e eVar3 = (r2.e) this.f769d;
                ActionMode actionModeStartActionMode = fVar5.f37550a.startActionMode(new r2.i(kVar4), 1);
                Intrinsics.areEqual(fVar5.f37557h, actionModeStartActionMode);
                if (actionModeStartActionMode == null) {
                    eVar3.close();
                    return;
                }
                return;
            case 27:
                WorkDatabase workDatabase2 = (WorkDatabase) this.f767b;
                String str5 = (String) this.f768c;
                jb.s sVar2 = (jb.s) this.f769d;
                qb.w wVarX = workDatabase2.x();
                wVarX.getClass();
                str5.getClass();
                Iterator it2 = ((List) x0.A(wVarX.f36870a, true, false, new qb.s(str5, 0))).iterator();
                while (it2.hasNext()) {
                    rb.g.a(sVar2, (String) it2.next());
                }
                return;
            case 28:
                Throwable th6 = (Throwable) this.f767b;
                s0.a aVar2 = (s0.a) this.f768c;
                List list = (List) this.f769d;
                if (th6 != null) {
                    aVar2.f38277b.onError(th6);
                    return;
                } else {
                    aVar2.f38277b.j(list);
                    return;
                }
            default:
                ArrayList arrayList2 = (ArrayList) this.f767b;
                p0 p0Var = (p0) this.f769d;
                String str6 = (String) this.f768c;
                try {
                    Iterator it3 = arrayList2.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            next = it3.next();
                            if (Intrinsics.areEqual(((s0.g0) next).d(), str6)) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    s0.g0 g0Var2 = (s0.g0) next;
                    if (g0Var2 == null || (k0VarJ = g0Var2.j()) == null) {
                        return;
                    }
                    k0VarJ.j(p0Var);
                    return;
                } catch (IllegalArgumentException unused2) {
                    return;
                }
        }
    }

    public /* synthetic */ q(c1.e eVar, m0.c0 c0Var, e6.i iVar) {
        this.f766a = 7;
        Map map = Collections.EMPTY_MAP;
        this.f767b = eVar;
        this.f768c = c0Var;
        this.f769d = iVar;
    }

    public /* synthetic */ q(Object obj, Object obj2, Object obj3, int i11) {
        this.f766a = i11;
        this.f767b = obj;
        this.f768c = obj2;
        this.f769d = obj3;
    }

    public /* synthetic */ q(Object obj, Object obj2, String str, int i11) {
        this.f766a = i11;
        this.f767b = obj;
        this.f769d = obj2;
        this.f768c = str;
    }

    public /* synthetic */ q(s0.p pVar, b0.j jVar, k1 k1Var, Object obj, int i11) {
        this.f766a = i11;
        this.f767b = pVar;
        this.f768c = k1Var;
        this.f769d = obj;
    }
}
