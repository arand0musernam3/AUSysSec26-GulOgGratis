package com.adyen.checkout.sessions.core.internal.data.api;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.q;
import y70.a;
import z70.c;
import z70.e;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@e(c = "com.adyen.checkout.sessions.core.internal.data.api.SessionRepository", f = "SessionRepository.kt", l = {98}, m = "createOrder-gIAlu-s")
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
public final class SessionRepository$createOrder$1 extends c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SessionRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionRepository$createOrder$1(SessionRepository sessionRepository, x70.c<? super SessionRepository$createOrder$1> cVar) {
        super(cVar);
        this.this$0 = sessionRepository;
    }

    @Override // z70.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM107createOrdergIAlus = this.this$0.m107createOrdergIAlus(null, this);
        return objM107createOrdergIAlus == a.COROUTINE_SUSPENDED ? objM107createOrdergIAlus : new q(objM107createOrdergIAlus);
    }
}
