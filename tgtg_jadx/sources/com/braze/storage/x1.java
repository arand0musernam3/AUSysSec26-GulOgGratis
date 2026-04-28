package com.braze.storage;

import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.support.BrazeLogger;
import java.util.Collection;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f10738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.braze.events.d f10739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f10740c;

    public x1(j jVar, com.braze.events.d dVar) {
        jVar.getClass();
        dVar.getClass();
        this.f10738a = jVar;
        this.f10739b = dVar;
    }

    public static final String b() {
        return "Failed to get all events from storage.";
    }

    public static final String d() {
        return "Failed to log storage exception";
    }

    public final void a(String str, Function0 function0) {
        if (this.f10740c) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new lw.m(str, 24), 6, (Object) null);
        } else {
            v80.f0.B(BrazeCoroutineScope.INSTANCE, null, null, new w1(function0, this, str, null), 3);
        }
    }

    public final Collection c() {
        if (this.f10740c) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new lw.p(18), 6, (Object) null);
            return kotlin.collections.p0.f26531a;
        }
        try {
            return this.f10738a.b();
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new lw.p(19), 4, (Object) null);
            a(e5);
            return kotlin.collections.p0.f26531a;
        }
    }

    public final void a(com.braze.models.k kVar) {
        kVar.getClass();
        a("add event " + kVar, new lw.b(22, this, kVar));
    }

    public static final Unit a(x1 x1Var, com.braze.models.k kVar) {
        x1Var.f10738a.a(kVar);
        return Unit.f26487a;
    }

    public final void a(Set set) {
        set.getClass();
        a("delete events " + set, new lw.b(23, this, set));
    }

    public static final Unit a(x1 x1Var, Set set) {
        x1Var.f10738a.a(set);
        return Unit.f26487a;
    }

    public final void a(Exception exc) {
        try {
            this.f10739b.b(new com.braze.exceptions.b("A storage exception has occurred!", exc), com.braze.exceptions.b.class);
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new lw.p(20), 4, (Object) null);
        }
    }

    public static final String a() {
        return "Storage provider is closed. Not getting all events.";
    }

    public static final String a(String str) {
        return e0.f.k("Storage provider is closed. Failed to ", str);
    }
}
