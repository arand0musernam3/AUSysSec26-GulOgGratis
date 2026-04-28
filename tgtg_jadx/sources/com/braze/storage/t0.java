package com.braze.storage;

import android.content.Context;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DelayedInitializationAnalyticsBehavior;
import com.braze.support.BrazeLogger;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s0 f10690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f10691b;

    public t0(Context context) {
        context.getClass();
        this.f10690a = new s0(context);
        this.f10691b = new CopyOnWriteArrayList();
    }

    public final void a(com.braze.managers.r rVar) {
        rVar.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new jt.g(this, 23), 6, (Object) null);
        Iterator it = this.f10691b.iterator();
        it.getClass();
        while (it.hasNext()) {
            com.braze.models.k kVar = (com.braze.models.k) it.next();
            kVar.getClass();
            rVar.a(kVar);
        }
        this.f10691b.clear();
    }

    public final void b(DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) {
        delayedInitializationAnalyticsBehavior.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new lw.l(26), 6, (Object) null);
        b(true);
        this.f10690a.writeData(DataStoreKey.DELAYED_INIT_SET_DURING_RUNTIME_FLAG, Boolean.TRUE);
        c(delayedInitializationAnalyticsBehavior);
    }

    public final void c(DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) {
        delayedInitializationAnalyticsBehavior.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new jt.g(delayedInitializationAnalyticsBehavior, 22), 6, (Object) null);
        this.f10690a.writeData(DataStoreKey.DELAYED_INIT_ANALYTICS_BEHAVIOR_FLAG, delayedInitializationAnalyticsBehavior.getValue());
    }

    public final boolean c() {
        return Intrinsics.areEqual(this.f10690a.readBoolean(DataStoreKey.DELAYED_INIT_ENABLED, Boolean.FALSE), Boolean.TRUE);
    }

    public static final String b() {
        return "Enqueuing push analytics event";
    }

    public final void b(boolean z11) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new com.braze.o0(z11, 8), 6, (Object) null);
        this.f10690a.writeData(DataStoreKey.DELAYED_INIT_ENABLED, Boolean.valueOf(z11));
    }

    public static final String a(DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) {
        return e0.f.k("Setting delayed initialization analytics behavior to: ", delayedInitializationAnalyticsBehavior.getValue());
    }

    public final void a(com.braze.models.k kVar) {
        kVar.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new lw.l(27), 6, (Object) null);
        if (DelayedInitializationAnalyticsBehavior.INSTANCE.fromString(this.f10690a.readString(DataStoreKey.DELAYED_INIT_ANALYTICS_BEHAVIOR_FLAG, "")) == DelayedInitializationAnalyticsBehavior.QUEUE) {
            this.f10691b.add(kVar);
        }
    }

    public static final String a() {
        return "enableDelayedInitialization invoked";
    }

    public static final String a(boolean z11) {
        return "Setting delayed initialization enabled to: " + z11;
    }

    public static final String a(t0 t0Var) {
        return r8.k.h(t0Var.f10691b.size(), "Flushing push analytics queue with ", " events");
    }
}
