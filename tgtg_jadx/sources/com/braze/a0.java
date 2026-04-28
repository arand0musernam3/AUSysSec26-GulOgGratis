package com.braze;

import com.braze.storage.u3;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a0 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BrazeUser f9560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f9561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f9562c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(BrazeUser brazeUser, String str, Object obj, x70.c cVar) {
        super(2, cVar);
        this.f9560a = brazeUser;
        this.f9561b = str;
        this.f9562c = obj;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        return new a0(this.f9560a, this.f9561b, this.f9562c, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a0) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        ba0.g.M(obj);
        u3 u3Var = this.f9560a.userCache;
        String str = this.f9561b;
        Object obj2 = this.f9562c;
        synchronized (u3Var) {
            str.getClass();
            obj2.getClass();
            u3Var.a(str, obj2);
        }
        return Unit.f26487a;
    }
}
