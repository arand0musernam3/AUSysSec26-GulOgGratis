package com.braze.triggers.managers;

import com.braze.support.BrazeLogger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import w2.l1;
import z70.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d extends i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f10856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.braze.triggers.actions.a f10857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.braze.triggers.events.b f10858c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f10859d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f10860e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, com.braze.triggers.actions.a aVar, com.braze.triggers.events.b bVar, long j9, long j11, x70.c cVar) {
        super(1, cVar);
        this.f10856a = fVar;
        this.f10857b = aVar;
        this.f10858c = bVar;
        this.f10859d = j9;
        this.f10860e = j11;
    }

    public static final String a(long j9) {
        return l1.e("Performing triggered action after a delay of ", j9, " ms.");
    }

    @Override // z70.a
    public final x70.c create(x70.c cVar) {
        return new d(this.f10856a, this.f10857b, this.f10858c, this.f10859d, this.f10860e, cVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((d) create((x70.c) obj)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        ba0.g.M(obj);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this.f10856a, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new dw.b(this.f10860e, 1), 7, (Object) null);
        com.braze.triggers.actions.a aVar2 = this.f10857b;
        f fVar = this.f10856a;
        aVar2.a(fVar.f10867a, fVar.f10869c, this.f10858c, this.f10859d);
        return Unit.f26487a;
    }
}
