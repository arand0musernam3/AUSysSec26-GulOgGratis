package com.braze;

import com.braze.models.FeatureFlag;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class l extends z70.i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Braze f9895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f9896b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Braze braze, String str, x70.c cVar) {
        super(2, cVar);
        this.f9895a = braze;
        this.f9896b = str;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        return new l(this.f9895a, this.f9896b, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new l(this.f9895a, this.f9896b, (x70.c) obj2).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        ba0.g.M(obj);
        if (((com.braze.managers.j1) this.f9895a.getUdm$android_sdk_base_release()).f10026o.H()) {
            return (FeatureFlag) CollectionsKt.firstOrNull(((com.braze.managers.j1) this.f9895a.getUdm$android_sdk_base_release()).B.c(this.f9896b));
        }
        return null;
    }
}
