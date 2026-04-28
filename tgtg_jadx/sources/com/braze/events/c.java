package com.braze.events;

import ba0.g;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import z70.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c extends i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ IEventSubscriber f9768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9769b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(IEventSubscriber iEventSubscriber, Object obj, x70.c cVar) {
        super(2, cVar);
        this.f9768a = iEventSubscriber;
        this.f9769b = obj;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        return new c(this.f9768a, this.f9769b, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new c(this.f9768a, this.f9769b, (x70.c) obj2).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        g.M(obj);
        this.f9768a.trigger(this.f9769b);
        return Unit.f26487a;
    }
}
