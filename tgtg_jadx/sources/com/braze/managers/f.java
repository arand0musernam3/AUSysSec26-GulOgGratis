package com.braze.managers;

import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f extends z70.i implements Function1 {
    public f(x70.c cVar) {
        super(1, cVar);
    }

    public static final String a(d dVar) {
        return e0.f.k("Removing banner from monitor list ", dVar.a());
    }

    public static final String b(d dVar) {
        return w.a0.p("Error checking banner visibility for ", dVar.a(), ".Removing banner from visibility monitoring.");
    }

    @Override // z70.a
    public final x70.c create(x70.c cVar) {
        return new f(cVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new f((x70.c) obj).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        ba0.g.M(obj);
        ReentrantLock reentrantLock = j.f10002k;
        reentrantLock.lock();
        try {
            j.f10001j = null;
            Iterator it = j.l.iterator();
            while (it.hasNext()) {
                d dVar = (d) it.next();
                try {
                    if (!dVar.f9958c) {
                        g gVar = j.f9999h;
                        if (gVar.a(dVar)) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) gVar, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new zv.d(dVar, 0), 7, (Object) null);
                            it.remove();
                        }
                    }
                } catch (Exception e5) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) j.f9999h, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new zv.d(dVar, 1), 4, (Object) null);
                    it.remove();
                }
            }
            ArrayList arrayList = j.l;
            if (arrayList == null || !arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (!((d) it2.next()).f9958c) {
                        g gVar2 = j.f9999h;
                        g.d();
                        break;
                    }
                }
            }
            return Unit.f26487a;
        } finally {
            reentrantLock.unlock();
        }
    }
}
