package com.braze.models.inappmessage;

import com.braze.managers.m0;
import com.braze.managers.r;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import v80.b0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c extends z70.i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f10161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InAppMessageBase f10162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m0 f10163c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String str, InAppMessageBase inAppMessageBase, m0 m0Var, x70.c cVar) {
        super(2, cVar);
        this.f10161a = str;
        this.f10162b = inAppMessageBase;
        this.f10163c = m0Var;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        return new c(this.f10161a, this.f10162b, this.f10163c, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        ba0.g.M(obj);
        com.braze.models.k kVarM = com.braze.models.outgoing.event.b.f10176g.m(this.f10161a, this.f10162b.getMessageExtras());
        if (kVarM != null) {
            ((r) this.f10163c).a(kVarM);
        }
        return Unit.f26487a;
    }
}
