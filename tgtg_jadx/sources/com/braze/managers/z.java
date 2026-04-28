package com.braze.managers;

import com.braze.support.BrazeLogger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class z extends z70.i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g0 f10128a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(g0 g0Var, x70.c cVar) {
        super(1, cVar);
        this.f10128a = g0Var;
    }

    public static final String a() {
        return "Ending subscription after delay";
    }

    @Override // z70.a
    public final x70.c create(x70.c cVar) {
        return new z(this.f10128a, cVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new z(this.f10128a, (x70.c) obj).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        ba0.g.M(obj);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this.f10128a, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new zv.r(20), 7, (Object) null);
        this.f10128a.a();
        return Unit.f26487a;
    }
}
