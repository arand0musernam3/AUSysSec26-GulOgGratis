package com.braze.storage;

import com.braze.support.BrazeLogger;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e90.e f10533a = e90.j.a(1);

    public static final String b(Object obj, boolean z11) {
        return "Tried to confirm outboundObject [" + obj + "] with success [" + z11 + "], but the cache wasn't locked, so not doing anything.";
    }

    public final synchronized Object a() {
        int i11;
        boolean z11;
        Object objC;
        try {
            e90.h hVar = (e90.h) this.f10533a;
            int i12 = hVar.f15885a;
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = e90.h.f15884g;
            while (true) {
                int i13 = atomicIntegerFieldUpdater.get(hVar);
                if (i13 > i12) {
                    do {
                        i11 = atomicIntegerFieldUpdater.get(hVar);
                        if (i11 > i12) {
                        }
                    } while (!atomicIntegerFieldUpdater.compareAndSet(hVar, i11, i12));
                } else {
                    if (i13 <= 0) {
                        z11 = false;
                        break;
                    }
                    if (atomicIntegerFieldUpdater.compareAndSet(hVar, i13, i13 - 1)) {
                        z11 = true;
                        break;
                    }
                }
            }
            if (z11) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new lw.j(this, 1), 7, (Object) null);
                objC = c();
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new lw.f(19), 7, (Object) null);
                objC = null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return objC;
    }

    public abstract Object c();

    public abstract void c(Object obj, boolean z11);

    public static final String b() {
        return "Received call to export dirty object, but the cache was already locked.";
    }

    public static final String b(b bVar) {
        return "Cache locked successfully for export: " + bVar;
    }

    public final synchronized void a(Object obj, boolean z11) {
        e90.h hVar = (e90.h) this.f10533a;
        hVar.getClass();
        if (Math.max(e90.h.f15884g.get(hVar), 0) != 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new aa.d(obj, z11, 2), 6, (Object) null);
            return;
        }
        c(obj, z11);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new lw.j(this, 0), 6, (Object) null);
        ((e90.h) this.f10533a).d();
    }

    public static final String a(b bVar) {
        return "Notifying confirmAndUnlock listeners for cache: " + bVar;
    }
}
