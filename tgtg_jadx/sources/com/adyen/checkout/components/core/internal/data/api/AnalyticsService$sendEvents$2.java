package com.adyen.checkout.components.core.internal.data.api;

import ba0.g;
import com.adyen.checkout.components.core.internal.data.model.AnalyticsTrackRequest;
import com.adyen.checkout.core.internal.data.api.HttpClient;
import com.adyen.checkout.core.internal.data.api.HttpClientExtKt;
import com.adyen.checkout.core.internal.data.model.EmptyResponse;
import com.adyen.checkout.core.internal.data.model.ModelObject;
import com.braze.h2;
import e0.f;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.w0;
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
@e(c = "com.adyen.checkout.components.core.internal.data.api.AnalyticsService$sendEvents$2", f = "AnalyticsService.kt", l = {46}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "Lcom/adyen/checkout/core/internal/data/model/EmptyResponse;", "<anonymous>", "(Lv80/b0;)Lcom/adyen/checkout/core/internal/data/model/EmptyResponse;"}, k = 3, mv = {1, 9, 0})
public final class AnalyticsService$sendEvents$2 extends i implements Function2<b0, c<? super EmptyResponse>, Object> {
    final /* synthetic */ String $checkoutAttemptId;
    final /* synthetic */ String $clientKey;
    final /* synthetic */ AnalyticsTrackRequest $request;
    int label;
    final /* synthetic */ AnalyticsService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnalyticsService$sendEvents$2(AnalyticsService analyticsService, String str, String str2, AnalyticsTrackRequest analyticsTrackRequest, c<? super AnalyticsService$sendEvents$2> cVar) {
        super(2, cVar);
        this.this$0 = analyticsService;
        this.$checkoutAttemptId = str;
        this.$clientKey = str2;
        this.$request = analyticsTrackRequest;
    }

    @Override // z70.a
    @NotNull
    public final c<Unit> create(@Nullable Object obj, @NotNull c<?> cVar) {
        return new AnalyticsService$sendEvents$2(this.this$0, this.$checkoutAttemptId, this.$clientKey, this.$request, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull b0 b0Var, @Nullable c<? super EmptyResponse> cVar) {
        return ((AnalyticsService$sendEvents$2) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
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
        String strK = f.k("v3/analytics/", this.$checkoutAttemptId);
        Map mapB = w0.b(new Pair("clientKey", this.$clientKey));
        ModelObject.Serializer<AnalyticsTrackRequest> serializer = AnalyticsTrackRequest.SERIALIZER;
        ModelObject.Serializer<EmptyResponse> serializer2 = EmptyResponse.SERIALIZER;
        AnalyticsTrackRequest analyticsTrackRequest = this.$request;
        this.label = 1;
        Object objPost = HttpClientExtKt.post(httpClient, strK, analyticsTrackRequest, serializer, serializer2, mapB, this);
        return objPost == aVar ? aVar : objPost;
    }
}
