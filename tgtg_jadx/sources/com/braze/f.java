package com.braze;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f extends z70.i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Braze f9828a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Braze braze, x70.c cVar) {
        super(2, cVar);
        this.f9828a = braze;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        return new f(this.f9828a, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new f(this.f9828a, (x70.c) obj2).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        ba0.g.M(obj);
        return ((com.braze.managers.j1) this.f9828a.getUdm$android_sdk_base_release()).f10026o.H() ? ((com.braze.managers.j1) this.f9828a.getUdm$android_sdk_base_release()).B.c(null) : kotlin.collections.n0.f26529a;
    }
}
