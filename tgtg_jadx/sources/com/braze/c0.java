package com.braze;

import com.braze.storage.u3;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c0 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BrazeUser f9580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f9581b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(BrazeUser brazeUser, String str, x70.c cVar) {
        super(2, cVar);
        this.f9580a = brazeUser;
        this.f9581b = str;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        return new c0(this.f9580a, this.f9581b, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new c0(this.f9580a, this.f9581b, (x70.c) obj2).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        ba0.g.M(obj);
        u3 u3Var = this.f9580a.userCache;
        String str = this.f9581b;
        synchronized (u3Var) {
            u3Var.c("email", str);
        }
        return Unit.f26487a;
    }
}
