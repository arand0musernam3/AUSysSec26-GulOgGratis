package com.braze.managers;

import com.braze.support.BrazeLogger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c0 extends z70.i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g0 f9954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f9955b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(g0 g0Var, long j9, x70.c cVar) {
        super(1, cVar);
        this.f9954a = g0Var;
        this.f9955b = j9;
    }

    public static final String a(long j9) {
        return l1.e("TTL of ", j9, " expired, reconnecting");
    }

    @Override // z70.a
    public final x70.c create(x70.c cVar) {
        return new c0(this.f9954a, this.f9955b, cVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new c0(this.f9954a, this.f9955b, (x70.c) obj).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        ba0.g.M(obj);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this.f9954a, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new dw.b(this.f9955b, 5), 7, (Object) null);
        ((com.braze.communication.dust.i) this.f9954a.f9973c).b();
        this.f9954a.a(false);
        return Unit.f26487a;
    }
}
