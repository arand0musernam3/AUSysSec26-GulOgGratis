package com.braze.triggers.managers;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import z70.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e extends i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.braze.triggers.actions.a f10861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f10862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.braze.triggers.events.b f10863c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f10864d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.braze.triggers.actions.a aVar, f fVar, com.braze.triggers.events.b bVar, long j9, x70.c cVar) {
        super(1, cVar);
        this.f10861a = aVar;
        this.f10862b = fVar;
        this.f10863c = bVar;
        this.f10864d = j9;
    }

    @Override // z70.a
    public final x70.c create(x70.c cVar) {
        return new e(this.f10861a, this.f10862b, this.f10863c, this.f10864d, cVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((e) create((x70.c) obj)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        ba0.g.M(obj);
        com.braze.triggers.actions.a aVar2 = this.f10861a;
        f fVar = this.f10862b;
        aVar2.a(fVar.f10867a, fVar.f10869c, this.f10863c, this.f10864d);
        return Unit.f26487a;
    }
}
