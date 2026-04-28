package com.braze;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends z70.i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Braze f9570a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Braze braze, x70.c cVar) {
        super(2, cVar);
        this.f9570a = braze;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        return new b(this.f9570a, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new b(this.f9570a, (x70.c) obj2).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        ba0.g.M(obj);
        BrazeUser brazeUser = this.f9570a.brazeUser;
        if (brazeUser != null) {
            return brazeUser;
        }
        Intrinsics.throwUninitializedPropertyAccessException("brazeUser");
        return null;
    }
}
