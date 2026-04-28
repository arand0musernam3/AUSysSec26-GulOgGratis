package com.braze.models.inappmessage;

import com.braze.events.internal.f0;
import com.braze.managers.m0;
import com.braze.managers.r;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d extends z70.i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InAppMessageBase f10164a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(InAppMessageBase inAppMessageBase, x70.c cVar) {
        super(2, cVar);
        this.f10164a = inAppMessageBase;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        return new d(this.f10164a, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new d(this.f10164a, (x70.c) obj2).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        m0 brazeManager;
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        ba0.g.M(obj);
        if (this.f10164a.clickLogged.get() && (brazeManager = this.f10164a.getBrazeManager()) != null) {
            ((com.braze.events.d) ((r) brazeManager).f10070d).b(new f0(new com.braze.triggers.events.d(this.f10164a.getTriggerId())), f0.class);
        }
        return Unit.f26487a;
    }
}
