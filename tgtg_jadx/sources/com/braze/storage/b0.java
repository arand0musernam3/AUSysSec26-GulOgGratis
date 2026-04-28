package com.braze.storage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b0 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.braze.events.e f10534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f10535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Throwable f10536c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(com.braze.events.e eVar, String str, Throwable th2, x70.c cVar) {
        super(2, cVar);
        this.f10534a = eVar;
        this.f10535b = str;
        this.f10536c = th2;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        return new b0(this.f10534a, this.f10535b, this.f10536c, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b0) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        ba0.g.M(obj);
        ((com.braze.events.d) this.f10534a).b(new com.braze.exceptions.b(this.f10535b, this.f10536c), com.braze.exceptions.b.class);
        return Unit.f26487a;
    }
}
