package com.braze.storage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class m0 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f10625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h8.e f10626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f10627c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(h8.e eVar, Object obj, x70.c cVar) {
        super(2, cVar);
        this.f10626b = eVar;
        this.f10627c = obj;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        m0 m0Var = new m0(this.f10626b, this.f10627c, cVar);
        m0Var.f10625a = obj;
        return m0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((m0) create((h8.a) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        ba0.g.M(obj);
        ((h8.a) this.f10625a).f(this.f10626b, this.f10627c);
        return Unit.f26487a;
    }
}
