package com.adyen.checkout.components.core.internal.data.api;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.q;
import y70.a;
import z70.c;
import z70.e;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@e(c = "com.adyen.checkout.components.core.internal.data.api.OrderStatusRepository", f = "OrderStatusRepository.kt", l = {30}, m = "getOrderStatus-0E7RQCE")
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
public final class OrderStatusRepository$getOrderStatus$1 extends c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OrderStatusRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderStatusRepository$getOrderStatus$1(OrderStatusRepository orderStatusRepository, x70.c<? super OrderStatusRepository$getOrderStatus$1> cVar) {
        super(cVar);
        this.this$0 = orderStatusRepository;
    }

    @Override // z70.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM88getOrderStatus0E7RQCE = this.this$0.m88getOrderStatus0E7RQCE(null, null, this);
        return objM88getOrderStatus0E7RQCE == a.COROUTINE_SUSPENDED ? objM88getOrderStatus0E7RQCE : new q(objM88getOrderStatus0E7RQCE);
    }
}
