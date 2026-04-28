package com.braze.requests;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import v80.b0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class u extends z70.i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f10468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.braze.requests.framework.h f10469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.braze.requests.framework.c f10470c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(v vVar, com.braze.requests.framework.h hVar, com.braze.requests.framework.c cVar, x70.c cVar2) {
        super(2, cVar2);
        this.f10468a = vVar;
        this.f10469b = hVar;
        this.f10470c = cVar;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        return new u(this.f10468a, this.f10469b, this.f10470c, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((u) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        ba0.g.M(obj);
        v vVar = this.f10468a;
        new e(this.f10469b, vVar.f10489a, vVar.f10490b, vVar.f10491c, vVar.f10494f, vVar.f10492d, vVar.f10493e, vVar.f10495g, this.f10470c).c();
        return Unit.f26487a;
    }
}
