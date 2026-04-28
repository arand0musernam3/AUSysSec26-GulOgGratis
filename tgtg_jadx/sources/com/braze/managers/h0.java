package com.braze.managers;

import com.braze.storage.x1;
import com.braze.support.BrazeLogger;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x1 f9982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f9983b;

    public h0(x1 x1Var) {
        x1Var.getClass();
        this.f9982a = x1Var;
    }

    public static final String b(com.braze.models.k kVar) {
        return "Storage manager is closed. Not adding event: " + kVar;
    }

    public final void a(com.braze.events.d dVar) {
        dVar.getClass();
        if (this.f9983b) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new zv.f(3), 6, (Object) null);
            return;
        }
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new zv.f(4), 7, (Object) null);
        List listR0 = CollectionsKt.r0(this.f9982a.c());
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new cw.a(listR0, 10), 6, (Object) null);
        listR0.getClass();
        dVar.b(new com.braze.events.internal.dispatchmanager.c(com.braze.events.internal.dispatchmanager.b.ADD_BRAZE_EVENTS, listR0, null, null, 12), com.braze.events.internal.dispatchmanager.c.class);
    }

    public static final String b() {
        return "Started offline event recovery task.";
    }

    public final void a(LinkedHashSet linkedHashSet) {
        linkedHashSet.getClass();
        if (this.f9983b) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new lw.g(1, linkedHashSet), 6, (Object) null);
        } else {
            this.f9982a.a(linkedHashSet);
        }
    }

    public static final String a(Set set) {
        return "Storage manager is closed. Not deleting events: " + set;
    }

    public final void a(com.braze.models.k kVar) {
        kVar.getClass();
        if (this.f9983b) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new lw.n(kVar, 3), 6, (Object) null);
        } else {
            this.f9982a.a(kVar);
        }
    }

    public static final String a() {
        return "Storage manager is closed. Not starting offline recovery.";
    }

    public static final String a(List list) {
        return "Adding events to dispatch from storage: " + list;
    }
}
