package com.braze.communication.dust;

import com.braze.h2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f extends z70.i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f9616b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i iVar, x70.c cVar) {
        super(2, cVar);
        this.f9616b = iVar;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        return new f(this.f9616b, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new f(this.f9616b, (x70.c) obj2).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        int i11 = this.f9615a;
        if (i11 == 0) {
            ba0.g.M(obj);
            i iVar = this.f9616b;
            this.f9615a = 1;
            String str = i.f9627d;
            if (iVar.a(this) == aVar) {
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
