package com.braze.storage;

import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o3 f10612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.braze.events.d f10613b;

    public l1(o3 o3Var, com.braze.events.d dVar) {
        o3Var.getClass();
        dVar.getClass();
        this.f10612a = o3Var;
        this.f10613b = dVar;
    }

    public static final String b() {
        return "Failed to delete the sealed session from the storage.";
    }

    public static final String d() {
        return "Error occured while publishing exception.";
    }

    public static final String e() {
        return "Failed to upsert active session in the storage.";
    }

    public final void a(com.braze.events.d dVar, Exception exc) {
        dVar.getClass();
        exc.getClass();
        try {
            dVar.b(new com.braze.exceptions.b("A storage exception has occurred. Please view the stack trace for more details.", exc), com.braze.exceptions.b.class);
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new lw.l(12), 4, (Object) null);
        }
    }

    public final com.braze.models.p c() {
        try {
            return this.f10612a.c();
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new lw.l(11), 4, (Object) null);
            a(this.f10613b, e5);
            return null;
        }
    }

    public final void a(com.braze.models.p pVar) {
        pVar.getClass();
        try {
            this.f10612a.a(pVar);
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new lw.l(13), 4, (Object) null);
            a(this.f10613b, e5);
        }
    }

    public final void a(String str) {
        str.getClass();
        try {
            this.f10612a.a(str);
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new lw.l(10), 4, (Object) null);
            a(this.f10613b, e5);
        }
    }

    public static final String a() {
        return "Failed to get the active session from the storage.";
    }
}
