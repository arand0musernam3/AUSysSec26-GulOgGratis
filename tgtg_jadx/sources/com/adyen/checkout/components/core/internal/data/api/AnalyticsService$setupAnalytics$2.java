package com.adyen.checkout.components.core.internal.data.api;

import ba0.g;
import com.adyen.checkout.components.core.internal.data.model.AnalyticsSetupRequest;
import com.adyen.checkout.components.core.internal.data.model.AnalyticsSetupResponse;
import com.adyen.checkout.core.internal.data.api.HttpClient;
import com.adyen.checkout.core.internal.data.api.HttpClientExtKt;
import com.adyen.checkout.core.internal.data.model.ModelObject;
import com.braze.h2;
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
@e(c = "com.adyen.checkout.components.core.internal.data.api.AnalyticsService$setupAnalytics$2", f = "AnalyticsService.kt", l = {32}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "Lcom/adyen/checkout/components/core/internal/data/model/AnalyticsSetupResponse;", "<anonymous>", "(Lv80/b0;)Lcom/adyen/checkout/components/core/internal/data/model/AnalyticsSetupResponse;"}, k = 3, mv = {1, 9, 0})
public final class AnalyticsService$setupAnalytics$2 extends i implements Function2<b0, c<? super AnalyticsSetupResponse>, Object> {
    final /* synthetic */ String $clientKey;
    final /* synthetic */ AnalyticsSetupRequest $request;
    int label;
    final /* synthetic */ AnalyticsService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnalyticsService$setupAnalytics$2(AnalyticsService analyticsService, String str, AnalyticsSetupRequest analyticsSetupRequest, c<? super AnalyticsService$setupAnalytics$2> cVar) {
        super(2, cVar);
        this.this$0 = analyticsService;
        this.$clientKey = str;
        this.$request = analyticsSetupRequest;
    }

    @Override // z70.a
    @NotNull
    public final c<Unit> create(@Nullable Object obj, @NotNull c<?> cVar) {
        return new AnalyticsService$setupAnalytics$2(this.this$0, this.$clientKey, this.$request, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull b0 b0Var, @Nullable c<? super AnalyticsSetupResponse> cVar) {
        return ((AnalyticsService$setupAnalytics$2) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
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
        Map mapB = w0.b(new Pair("clientKey", this.$clientKey));
        ModelObject.Serializer<AnalyticsSetupRequest> serializer = AnalyticsSetupRequest.SERIALIZER;
        ModelObject.Serializer<AnalyticsSetupResponse> serializer2 = AnalyticsSetupResponse.SERIALIZER;
        AnalyticsSetupRequest analyticsSetupRequest = this.$request;
        this.label = 1;
        Object objPost = HttpClientExtKt.post(httpClient, "v3/analytics", analyticsSetupRequest, serializer, serializer2, mapB, this);
        return objPost == aVar ? aVar : objPost;
    }
}
