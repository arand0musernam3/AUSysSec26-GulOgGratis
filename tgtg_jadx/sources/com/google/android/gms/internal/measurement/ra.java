package com.google.android.gms.internal.measurement;

import java.util.concurrent.TimeUnit;
import zendesk.messaging.android.internal.conversationscreen.ConversationTypingEvents;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ra implements j30.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j30.l f11828b;

    public /* synthetic */ ra(j30.l lVar, int i11) {
        this.f11827a = i11;
        this.f11828b = lVar;
    }

    @Override // j30.l
    public final Object get() {
        int i11 = this.f11827a;
        j30.l lVar = this.f11828b;
        switch (i11) {
            case 0:
                Object obj = oa.f11698j;
                return (gd) ((j30.h) lVar.get()).c();
            default:
                o30.x0 x0Var = (o30.x0) lVar.get();
                x0Var.getClass();
                o30.d1 d1Var = new o30.d1(u6.f11923c);
                return new o30.v0(d1Var, x0Var.f31937b.schedule(d1Var, ConversationTypingEvents.TIME_INTERVAL_IN_MILLIS, TimeUnit.MILLISECONDS));
        }
    }
}
