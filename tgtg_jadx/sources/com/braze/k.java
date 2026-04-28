package com.braze;

import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.events.IValueCallback;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class k extends z70.i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IValueCallback f9888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Braze f9889c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(IValueCallback iValueCallback, Braze braze, x70.c cVar) {
        super(2, cVar);
        this.f9888b = iValueCallback;
        this.f9889c = braze;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        return new k(this.f9888b, this.f9889c, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new k(this.f9888b, this.f9889c, (x70.c) obj2).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        int i11 = this.f9887a;
        if (i11 == 0) {
            ba0.g.M(obj);
            CoroutineContext coroutineContext = BrazeCoroutineScope.INSTANCE.getCoroutineContext();
            j jVar = new j(this.f9888b, this.f9889c, null);
            this.f9887a = 1;
            if (v80.f0.K(coroutineContext, jVar, this) == aVar) {
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
