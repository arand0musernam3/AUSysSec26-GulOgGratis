package com.adyen.checkout.card.internal.data.api;

import ba0.g;
import com.adyen.checkout.card.internal.data.model.BinLookupRequest;
import com.adyen.checkout.card.internal.data.model.BinLookupResponse;
import com.adyen.checkout.core.DispatcherProvider;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v80.b0;
import v80.f0;
import v80.x;
import x70.c;
import y70.a;
import z70.e;
import z70.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0086@¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/adyen/checkout/card/internal/data/api/BinLookupService;", "", "Lcom/adyen/checkout/core/internal/data/api/HttpClient;", "httpClient", "Lv80/x;", "coroutineDispatcher", "<init>", "(Lcom/adyen/checkout/core/internal/data/api/HttpClient;Lv80/x;)V", "Lcom/adyen/checkout/card/internal/data/model/BinLookupRequest;", "request", "", "clientKey", "Lcom/adyen/checkout/card/internal/data/model/BinLookupResponse;", "makeBinLookup", "(Lcom/adyen/checkout/card/internal/data/model/BinLookupRequest;Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "Lcom/adyen/checkout/core/internal/data/api/HttpClient;", "Lv80/x;", "card_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class BinLookupService {

    @NotNull
    private final x coroutineDispatcher;

    @NotNull
    private final HttpClient httpClient;

    /* JADX INFO: renamed from: com.adyen.checkout.card.internal.data.api.BinLookupService$makeBinLookup$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "com.adyen.checkout.card.internal.data.api.BinLookupService$makeBinLookup$2", f = "BinLookupService.kt", l = {30}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "Lcom/adyen/checkout/card/internal/data/model/BinLookupResponse;", "<anonymous>", "(Lv80/b0;)Lcom/adyen/checkout/card/internal/data/model/BinLookupResponse;"}, k = 3, mv = {1, 9, 0})
    public static final class AnonymousClass2 extends i implements Function2<b0, c<? super BinLookupResponse>, Object> {
        final /* synthetic */ String $clientKey;
        final /* synthetic */ BinLookupRequest $request;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, BinLookupRequest binLookupRequest, c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$clientKey = str;
            this.$request = binLookupRequest;
        }

        @Override // z70.a
        @NotNull
        public final c<Unit> create(@Nullable Object obj, @NotNull c<?> cVar) {
            return BinLookupService.this.new AnonymousClass2(this.$clientKey, this.$request, cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull b0 b0Var, @Nullable c<? super BinLookupResponse> cVar) {
            return ((AnonymousClass2) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
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
            HttpClient httpClient = BinLookupService.this.httpClient;
            Map mapB = w0.b(new Pair("clientKey", this.$clientKey));
            ModelObject.Serializer<BinLookupRequest> serializer = BinLookupRequest.SERIALIZER;
            ModelObject.Serializer<BinLookupResponse> serializer2 = BinLookupResponse.SERIALIZER;
            BinLookupRequest binLookupRequest = this.$request;
            this.label = 1;
            Object objPost = HttpClientExtKt.post(httpClient, "v2/bin/binLookup", binLookupRequest, serializer, serializer2, mapB, this);
            return objPost == aVar ? aVar : objPost;
        }
    }

    public BinLookupService(@NotNull HttpClient httpClient, @NotNull x xVar) {
        httpClient.getClass();
        xVar.getClass();
        this.httpClient = httpClient;
        this.coroutineDispatcher = xVar;
    }

    @Nullable
    public final Object makeBinLookup(@NotNull BinLookupRequest binLookupRequest, @NotNull String str, @NotNull c<? super BinLookupResponse> cVar) {
        return f0.K(this.coroutineDispatcher, new AnonymousClass2(str, binLookupRequest, null), cVar);
    }

    public /* synthetic */ BinLookupService(HttpClient httpClient, x xVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(httpClient, (i11 & 2) != 0 ? DispatcherProvider.INSTANCE.getIO() : xVar);
    }
}
