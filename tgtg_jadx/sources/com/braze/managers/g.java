package com.braze.managers;

import android.graphics.Rect;
import android.view.View;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.support.BrazeLogger;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class g {
    public static void a(String str, View view, boolean z11) {
        str.getClass();
        view.getClass();
        ReentrantLock reentrantLock = j.f10002k;
        reentrantLock.lock();
        try {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) j.f9999h, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new yl.e(13, str, view), 7, (Object) null);
            Iterator it = j.l.iterator();
            while (it.hasNext()) {
                BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                g gVar = j.f9999h;
                BrazeLogger.Priority priority = BrazeLogger.Priority.V;
                BrazeLogger.brazelog$default(brazeLogger, (Object) gVar, priority, (Throwable) null, false, (Function0) new zv.b(25), 6, (Object) null);
                d dVar = (d) it.next();
                if (Intrinsics.areEqual(dVar.f9957b.get(), view)) {
                    BrazeLogger.brazelog$default(brazeLogger, (Object) gVar, priority, (Throwable) null, false, (Function0) new yl.e(14, dVar, str), 6, (Object) null);
                    it.remove();
                }
            }
            j.l.add(new d(str, new WeakReference(view), z11));
            d();
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public static void b() {
        ReentrantLock reentrantLock = j.f10002k;
        reentrantLock.lock();
        try {
            for (d dVar : j.l) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) j.f9999h, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new zv.d(dVar, 2), 6, (Object) null);
                dVar.f9958c = false;
            }
            reentrantLock.unlock();
            d();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public static void c() {
        j.f10000i.clear();
        ReentrantLock reentrantLock = j.f10002k;
        reentrantLock.lock();
        try {
            j.l.clear();
            reentrantLock.unlock();
            ReentrantLock reentrantLock2 = j.f10003m;
            reentrantLock2.lock();
            try {
                j.f10004n.clear();
                reentrantLock2.unlock();
                v80.i1 i1Var = j.f10001j;
                if (i1Var != null) {
                    i1Var.a(null);
                }
                j.f10001j = null;
            } catch (Throwable th2) {
                reentrantLock2.unlock();
                throw th2;
            }
        } catch (Throwable th3) {
            reentrantLock.unlock();
            throw th3;
        }
    }

    public static void d() {
        if (j.f10001j != null) {
            return;
        }
        j.f10001j = BrazeCoroutineScope.launchDelayed$default(BrazeCoroutineScope.INSTANCE, 200L, null, new f(null), 2, null);
    }

    public static final String c(d dVar) {
        return e0.f.k("Resetting impression for ", dVar.a());
    }

    public static final String b(List list) {
        return "Setting banner placement list to " + list;
    }

    public static final String b(d dVar) {
        return w.a0.p("Banner is not shown ", dVar.a(), " because view is null");
    }

    public final boolean a(d dVar) {
        View view = (View) dVar.f9957b.get();
        if (view == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new zv.d(dVar, 3), 7, (Object) null);
            return true;
        }
        String str = dVar.f9956a;
        if (view.isShown()) {
            Rect rect = new Rect();
            if (view.getGlobalVisibleRect(rect) && rect.width() != 0 && rect.height() != 0) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new xv.a(str, 4), 7, (Object) null);
                v80.f0.B(BrazeCoroutineScope.INSTANCE, null, null, new e(view, str, dVar, null), 3);
            }
        }
        return false;
    }

    public final void a(List list) {
        list.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new cw.a(list, 9), 7, (Object) null);
        ReentrantLock reentrantLock = j.f10003m;
        reentrantLock.lock();
        try {
            ArrayList arrayList = j.f10004n;
            arrayList.clear();
            arrayList.addAll(list);
        } finally {
            reentrantLock.unlock();
        }
    }

    public static final String a(String str, View view) {
        return "Adding monitor for " + str + " for BannerView " + view;
    }

    public static final String a() {
        return "Checking existing monitor list for view reuse.";
    }

    public static final String a(d dVar, String str) {
        return j4.s.k("Removing banner from monitor list ", dVar.a(), " because view is now used by ", str);
    }

    public static final String a(String str) {
        return w.a0.p("Banner is shown ", str, ".");
    }
}
