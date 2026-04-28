package com.braze;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class t extends z70.i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f10778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f10779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f10780c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f10781d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f10782e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Braze f10783f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Function2 f10784g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Function0 f10785h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(boolean z11, Object obj, boolean z12, boolean z13, Braze braze, Function2 function2, Function0 function0, x70.c cVar) {
        super(2, cVar);
        this.f10779b = z11;
        this.f10780c = obj;
        this.f10781d = z12;
        this.f10782e = z13;
        this.f10783f = braze;
        this.f10784g = function2;
        this.f10785h = function0;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        return new t(this.f10779b, this.f10780c, this.f10781d, this.f10782e, this.f10783f, this.f10784g, this.f10785h, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((t) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        int i11 = this.f10778a;
        if (i11 != 0) {
            if (i11 == 1) {
                ba0.g.M(obj);
                return obj;
            }
            h2.b("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ba0.g.M(obj);
        v80.j0 j0VarF = v80.f0.f(com.braze.coroutine.f.f9657a, null, null, new s(this.f10779b, this.f10780c, this.f10781d, this.f10782e, this.f10783f, this.f10784g, this.f10785h, null), 3);
        this.f10778a = 1;
        Object objM = j0VarF.m(this);
        return objM == aVar ? aVar : objM;
    }
}
