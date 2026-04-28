package com.braze.managers;

import com.braze.storage.u3;
import com.braze.support.BrazeLogger;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class i1 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f9997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j1 f9998b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(j1 j1Var, x70.c cVar) {
        super(2, cVar);
        this.f9998b = j1Var;
    }

    public static final String a() {
        return "User cache was locked, waiting.";
    }

    public static final String b() {
        return "User cache notified. Continuing UserDependencyManager shutdown";
    }

    public static final String c() {
        return "Device cache was locked, waiting.";
    }

    public static final String d() {
        return "Device cache notified. Continuing UserDependencyManager shutdown";
    }

    public static final String e() {
        return "Exception while shutting down dispatch manager. Continuing.";
    }

    public static final String f() {
        return "Exception while stopping data sync. Continuing.";
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        i1 i1Var = new i1(this.f9998b, cVar);
        i1Var.f9997a = obj;
        return i1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        i1 i1Var = new i1(this.f9998b, (x70.c) obj2);
        i1Var.f9997a = (v80.b0) obj;
        return i1Var.invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        ba0.g.M(obj);
        v80.b0 b0Var = (v80.b0) this.f9997a;
        try {
            e90.h hVar = (e90.h) this.f9998b.d().f10533a;
            hVar.getClass();
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = e90.h.f15884g;
            if (Math.max(atomicIntegerFieldUpdater.get(hVar), 0) == 0) {
                BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                BrazeLogger.brazelog$default(brazeLogger, (Object) b0Var, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new zv.f(11), 6, (Object) null);
                u3 u3VarD = this.f9998b.d();
                u3VarD.getClass();
                v80.f0.E(kotlin.coroutines.g.f26549a, new com.braze.storage.a(u3VarD, null));
                BrazeLogger.brazelog$default(brazeLogger, (Object) b0Var, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new zv.f(12), 7, (Object) null);
            }
            com.braze.storage.v0 v0Var = this.f9998b.f10024m;
            if (v0Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("deviceCache");
                v0Var = null;
            }
            e90.h hVar2 = (e90.h) v0Var.f10533a;
            hVar2.getClass();
            if (Math.max(atomicIntegerFieldUpdater.get(hVar2), 0) == 0) {
                BrazeLogger brazeLogger2 = BrazeLogger.INSTANCE;
                BrazeLogger.brazelog$default(brazeLogger2, (Object) b0Var, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new zv.f(13), 6, (Object) null);
                com.braze.storage.v0 v0Var2 = this.f9998b.f10024m;
                if (v0Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("deviceCache");
                    v0Var2 = null;
                }
                v0Var2.getClass();
                v80.f0.E(kotlin.coroutines.g.f26549a, new com.braze.storage.a(v0Var2, null));
                BrazeLogger.brazelog$default(brazeLogger2, (Object) b0Var, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new zv.f(14), 7, (Object) null);
            }
            this.f9998b.F.g();
            this.f9998b.f10025n.c();
            this.f9998b.f10030s.m();
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) b0Var, BrazeLogger.Priority.W, (Throwable) e5, false, (Function0) new zv.f(15), 4, (Object) null);
        }
        try {
            this.f9998b.f10029r.f();
        } catch (Exception e11) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) b0Var, BrazeLogger.Priority.W, (Throwable) e11, false, (Function0) new zv.f(16), 4, (Object) null);
        }
        return Unit.f26487a;
    }
}
