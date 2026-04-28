package com.braze;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class p extends z70.i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f10307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f10308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f10309c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Braze f10310d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function0 f10311e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Function0 f10312f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(boolean z11, boolean z12, boolean z13, Braze braze, Function0 function0, Function0 function02, x70.c cVar) {
        super(2, cVar);
        this.f10307a = z11;
        this.f10308b = z12;
        this.f10309c = z13;
        this.f10310d = braze;
        this.f10311e = function0;
        this.f10312f = function02;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        return new p(this.f10307a, this.f10308b, this.f10309c, this.f10310d, this.f10311e, this.f10312f, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        ba0.g.M(obj);
        v80.f0.E(kotlin.coroutines.g.f26549a, new o(this.f10307a, this.f10308b, this.f10309c, this.f10310d, this.f10311e, this.f10312f, null));
        return Unit.f26487a;
    }
}
