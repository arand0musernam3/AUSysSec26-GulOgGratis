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
@e(c = "com.adyen.checkout.components.core.internal.data.api.DefaultPublicKeyRepository", f = "DefaultPublicKeyRepository.kt", l = {29}, m = "fetchPublicKey-0E7RQCE")
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
public final class DefaultPublicKeyRepository$fetchPublicKey$1 extends c {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DefaultPublicKeyRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultPublicKeyRepository$fetchPublicKey$1(DefaultPublicKeyRepository defaultPublicKeyRepository, x70.c<? super DefaultPublicKeyRepository$fetchPublicKey$1> cVar) {
        super(cVar);
        this.this$0 = defaultPublicKeyRepository;
    }

    @Override // z70.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objMo85fetchPublicKey0E7RQCE = this.this$0.mo85fetchPublicKey0E7RQCE(null, null, this);
        return objMo85fetchPublicKey0E7RQCE == a.COROUTINE_SUSPENDED ? objMo85fetchPublicKey0E7RQCE : new q(objMo85fetchPublicKey0E7RQCE);
    }
}
