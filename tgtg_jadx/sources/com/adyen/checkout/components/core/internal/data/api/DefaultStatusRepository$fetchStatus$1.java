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
@e(c = "com.adyen.checkout.components.core.internal.data.api.DefaultStatusRepository", f = "StatusRepository.kt", l = {107}, m = "fetchStatus-gIAlu-s")
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
public final class DefaultStatusRepository$fetchStatus$1 extends c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DefaultStatusRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultStatusRepository$fetchStatus$1(DefaultStatusRepository defaultStatusRepository, x70.c<? super DefaultStatusRepository$fetchStatus$1> cVar) {
        super(cVar);
        this.this$0 = defaultStatusRepository;
    }

    @Override // z70.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM87fetchStatusgIAlus = this.this$0.m87fetchStatusgIAlus(null, this);
        return objM87fetchStatusgIAlus == a.COROUTINE_SUSPENDED ? objM87fetchStatusgIAlus : new q(objM87fetchStatusgIAlus);
    }
}
