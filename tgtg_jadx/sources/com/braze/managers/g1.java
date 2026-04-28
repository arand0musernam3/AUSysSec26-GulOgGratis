package com.braze.managers;

import com.braze.h2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class g1 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h1 f9980b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(h1 h1Var, x70.c cVar) {
        super(2, cVar);
        this.f9980b = h1Var;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        return new g1(this.f9980b, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new g1(this.f9980b, (x70.c) obj2).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        int i11 = this.f9979a;
        if (i11 == 0) {
            ba0.g.M(obj);
            h1 h1Var = this.f9980b;
            this.f9979a = 1;
            if (h1Var.a() == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ba0.g.M(obj);
        }
        return Unit.f26487a;
    }
}
