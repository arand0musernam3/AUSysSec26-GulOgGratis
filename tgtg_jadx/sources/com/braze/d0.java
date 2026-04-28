package com.braze;

import com.braze.enums.NotificationSubscriptionType;
import com.braze.storage.u3;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d0 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BrazeUser f9662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NotificationSubscriptionType f9663b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(BrazeUser brazeUser, NotificationSubscriptionType notificationSubscriptionType, x70.c cVar) {
        super(2, cVar);
        this.f9662a = brazeUser;
        this.f9663b = notificationSubscriptionType;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        return new d0(this.f9662a, this.f9663b, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new d0(this.f9662a, this.f9663b, (x70.c) obj2).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        String jsonObject;
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        ba0.g.M(obj);
        u3 u3Var = this.f9662a.userCache;
        NotificationSubscriptionType notificationSubscriptionType = this.f9663b;
        synchronized (u3Var) {
            if (notificationSubscriptionType != null) {
                try {
                    jsonObject = notificationSubscriptionType.getJsonObject();
                } catch (Throwable th2) {
                    throw th2;
                }
            } else {
                jsonObject = null;
            }
            u3Var.c("email_subscribe", jsonObject);
        }
        return Unit.f26487a;
    }
}
