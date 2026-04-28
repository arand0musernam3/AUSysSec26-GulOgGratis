package com.adyen.checkout.components.core.internal.data.api;

import ba0.g;
import com.adyen.checkout.components.core.internal.data.model.PublicKeyResponse;
import com.adyen.checkout.core.internal.data.api.HttpClient;
import com.adyen.checkout.core.internal.data.api.HttpClientExtKt;
import com.adyen.checkout.core.internal.data.model.ModelObject;
import com.braze.h2;
import e0.f;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v80.b0;
import x70.c;
import y70.a;
import z70.e;
import z70.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@e(c = "com.adyen.checkout.components.core.internal.data.api.PublicKeyService$getPublicKey$2", f = "PublicKeyService.kt", l = {28}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "Lcom/adyen/checkout/components/core/internal/data/model/PublicKeyResponse;", "<anonymous>", "(Lv80/b0;)Lcom/adyen/checkout/components/core/internal/data/model/PublicKeyResponse;"}, k = 3, mv = {1, 9, 0})
public final class PublicKeyService$getPublicKey$2 extends i implements Function2<b0, c<? super PublicKeyResponse>, Object> {
    final /* synthetic */ String $clientKey;
    int label;
    final /* synthetic */ PublicKeyService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PublicKeyService$getPublicKey$2(PublicKeyService publicKeyService, String str, c<? super PublicKeyService$getPublicKey$2> cVar) {
        super(2, cVar);
        this.this$0 = publicKeyService;
        this.$clientKey = str;
    }

    @Override // z70.a
    @NotNull
    public final c<Unit> create(@Nullable Object obj, @NotNull c<?> cVar) {
        return new PublicKeyService$getPublicKey$2(this.this$0, this.$clientKey, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull b0 b0Var, @Nullable c<? super PublicKeyResponse> cVar) {
        return ((PublicKeyService$getPublicKey$2) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                g.M(obj);
                return obj;
            }
            h2.b("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        g.M(obj);
        HttpClient httpClient = this.this$0.httpClient;
        String strK = f.k("v1/clientKeys/", this.$clientKey);
        ModelObject.Serializer<PublicKeyResponse> serializer = PublicKeyResponse.SERIALIZER;
        this.label = 1;
        Object obj2 = HttpClientExtKt.get$default(httpClient, strK, serializer, null, this, 4, null);
        return obj2 == aVar ? aVar : obj2;
    }
}
