package com.braze;

import com.braze.events.IValueCallback;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class j extends z70.i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ IValueCallback f9879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Braze f9880b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(IValueCallback iValueCallback, Braze braze, x70.c cVar) {
        super(2, cVar);
        this.f9879a = iValueCallback;
        this.f9880b = braze;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        return new j(this.f9879a, this.f9880b, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new j(this.f9879a, this.f9880b, (x70.c) obj2).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        ba0.g.M(obj);
        boolean zIsSdkDisabledOrDelayed = Braze.INSTANCE.isSdkDisabledOrDelayed();
        IValueCallback iValueCallback = this.f9879a;
        if (zIsSdkDisabledOrDelayed) {
            iValueCallback.onError();
            return Unit.f26487a;
        }
        iValueCallback.onSuccess(((com.braze.managers.y) this.f9880b.getDeviceIdProvider$android_sdk_base_release()).a());
        return Unit.f26487a;
    }
}
