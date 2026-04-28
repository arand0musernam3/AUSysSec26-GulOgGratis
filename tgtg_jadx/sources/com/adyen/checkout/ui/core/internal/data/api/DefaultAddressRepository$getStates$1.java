package com.adyen.checkout.ui.core.internal.data.api;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.q;
import y70.a;
import z70.c;
import z70.e;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@e(c = "com.adyen.checkout.ui.core.internal.data.api.DefaultAddressRepository", f = "DefaultAddressRepository.kt", l = {127}, m = "getStates-0E7RQCE")
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
public final class DefaultAddressRepository$getStates$1 extends c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DefaultAddressRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultAddressRepository$getStates$1(DefaultAddressRepository defaultAddressRepository, x70.c<? super DefaultAddressRepository$getStates$1> cVar) {
        super(cVar);
        this.this$0 = defaultAddressRepository;
    }

    @Override // z70.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM115getStates0E7RQCE = this.this$0.m115getStates0E7RQCE(null, null, this);
        return objM115getStates0E7RQCE == a.COROUTINE_SUSPENDED ? objM115getStates0E7RQCE : new q(objM115getStates0E7RQCE);
    }
}
