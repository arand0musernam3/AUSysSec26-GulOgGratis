package com.braze;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends z70.i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Braze f9559a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Braze braze, x70.c cVar) {
        super(2, cVar);
        this.f9559a = braze;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        return new a(this.f9559a, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new a(this.f9559a, (x70.c) obj2).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        ba0.g.M(obj);
        if (((com.braze.managers.j1) this.f9559a.getUdm$android_sdk_base_release()).f10026o.E()) {
            return ((com.braze.managers.j1) this.f9559a.getUdm$android_sdk_base_release()).D.a(true, (Long) null);
        }
        return null;
    }
}
