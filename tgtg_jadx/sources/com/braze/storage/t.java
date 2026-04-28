package com.braze.storage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class t extends z70.i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f10688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h8.e f10689b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(h8.e eVar, x70.c cVar) {
        super(2, cVar);
        this.f10689b = eVar;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        t tVar = new t(this.f10689b, cVar);
        tVar.f10688a = obj;
        return tVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        t tVar = new t(this.f10689b, (x70.c) obj2);
        tVar.f10688a = (h8.a) obj;
        return tVar.invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        ba0.g.M(obj);
        ((h8.a) this.f10688a).e(this.f10689b);
        return Unit.f26487a;
    }
}
