package com.braze;

import com.braze.support.BrazeLogger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class v extends z70.i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f10953a;

    public v(x70.c cVar) {
        super(2, cVar);
    }

    public static final String a() {
        return "Waited on previous tasks to finish!";
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        v vVar = new v(cVar);
        vVar.f10953a = obj;
        return vVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        v vVar = new v((x70.c) obj2);
        vVar.f10953a = (v80.b0) obj;
        return vVar.invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        ba0.g.M(obj);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this.f10953a, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new w1(24), 7, (Object) null);
        return Unit.f26487a;
    }
}
