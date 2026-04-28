package com.braze;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d extends z70.i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f9660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Braze f9661b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(String str, Braze braze, x70.c cVar) {
        super(2, cVar);
        this.f9660a = str;
        this.f9661b = braze;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        return new d(this.f9660a, this.f9661b, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new d(this.f9660a, this.f9661b, (x70.c) obj2).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        ba0.g.M(obj);
        String str = this.f9660a;
        if (str == null) {
            return null;
        }
        return com.braze.support.s.a(str, ((com.braze.managers.j1) this.f9661b.getUdm$android_sdk_base_release()).f10036y);
    }
}
