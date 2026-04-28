package com.braze;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class s extends z70.i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f10505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f10507c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f10508d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Braze f10509e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Function2 f10510f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Function0 f10511g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(boolean z11, Object obj, boolean z12, boolean z13, Braze braze, Function2 function2, Function0 function0, x70.c cVar) {
        super(2, cVar);
        this.f10505a = z11;
        this.f10506b = obj;
        this.f10507c = z12;
        this.f10508d = z13;
        this.f10509e = braze;
        this.f10510f = function2;
        this.f10511g = function0;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        return new s(this.f10505a, this.f10506b, this.f10507c, this.f10508d, this.f10509e, this.f10510f, this.f10511g, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((s) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        ba0.g.M(obj);
        if (this.f10505a && Braze.INSTANCE.isDisabled()) {
            return this.f10506b;
        }
        if (this.f10507c && Braze.INSTANCE.isDelayedInitializationEnabled()) {
            return this.f10506b;
        }
        return v80.f0.E(kotlin.coroutines.g.f26549a, new q(this.f10508d, this.f10509e, this.f10506b, this.f10510f, this.f10511g, null));
    }
}
