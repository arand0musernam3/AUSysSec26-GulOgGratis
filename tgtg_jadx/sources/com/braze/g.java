package com.braze;

import com.braze.support.BrazeLogger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class g extends z70.i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f9837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Braze f9838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f9839c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Braze braze, String str, x70.c cVar) {
        super(2, cVar);
        this.f9838b = braze;
        this.f9839c = str;
    }

    public static final String a(String str) {
        return e0.f.k("Getting Banner for ", str);
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        g gVar = new g(this.f9838b, this.f9839c, cVar);
        gVar.f9837a = obj;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        ba0.g.M(obj);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this.f9837a, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new e2(this.f9839c, 19), 7, (Object) null);
        return ((com.braze.managers.j1) this.f9838b.getUdm$android_sdk_base_release()).C.a(this.f9839c);
    }
}
