package com.braze;

import com.braze.storage.u3;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b0 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BrazeUser f9571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f9572b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(BrazeUser brazeUser, String str, x70.c cVar) {
        super(2, cVar);
        this.f9571a = brazeUser;
        this.f9572b = str;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        return new b0(this.f9571a, this.f9572b, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new b0(this.f9571a, this.f9572b, (x70.c) obj2).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        ba0.g.M(obj);
        u3 u3Var = this.f9571a.userCache;
        String str = this.f9572b;
        synchronized (u3Var) {
            str.getClass();
            u3Var.c("dob", str);
        }
        return Unit.f26487a;
    }
}
