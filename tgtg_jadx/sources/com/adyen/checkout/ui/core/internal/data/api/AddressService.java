package com.adyen.checkout.ui.core.internal.data.api;

import ba0.g;
import com.adyen.checkout.core.DispatcherProvider;
import com.adyen.checkout.core.internal.data.api.HttpClient;
import com.adyen.checkout.core.internal.data.api.HttpClientExtKt;
import com.adyen.checkout.core.internal.data.model.ModelObject;
import com.adyen.checkout.ui.core.internal.data.model.AddressItem;
import com.adyen.checkout.ui.core.internal.ui.view.ExpiryDateInput;
import com.braze.h2;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v80.b0;
import v80.f0;
import v80.x;
import w.a0;
import x70.c;
import y70.a;
import z70.e;
import z70.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\f\u0010\rJ&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/adyen/checkout/ui/core/internal/data/api/AddressService;", "", "Lcom/adyen/checkout/core/internal/data/api/HttpClient;", "httpClient", "Lv80/x;", "coroutineDispatcher", "<init>", "(Lcom/adyen/checkout/core/internal/data/api/HttpClient;Lv80/x;)V", "", "shopperLocale", "", "Lcom/adyen/checkout/ui/core/internal/data/model/AddressItem;", "getCountries", "(Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "countryCode", "getStates", "(Ljava/lang/String;Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "Lcom/adyen/checkout/core/internal/data/api/HttpClient;", "Lv80/x;", "ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AddressService {

    @NotNull
    private final x coroutineDispatcher;

    @NotNull
    private final HttpClient httpClient;

    /* JADX INFO: renamed from: com.adyen.checkout.ui.core.internal.data.api.AddressService$getCountries$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "com.adyen.checkout.ui.core.internal.data.api.AddressService$getCountries$2", f = "AddressService.kt", l = {27}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lv80/b0;", "", "Lcom/adyen/checkout/ui/core/internal/data/model/AddressItem;", "<anonymous>", "(Lv80/b0;)Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
    public static final class AnonymousClass2 extends i implements Function2<b0, c<? super List<? extends AddressItem>>, Object> {
        final /* synthetic */ String $shopperLocale;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$shopperLocale = str;
        }

        @Override // z70.a
        @NotNull
        public final c<Unit> create(@Nullable Object obj, @NotNull c<?> cVar) {
            return AddressService.this.new AnonymousClass2(this.$shopperLocale, cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull b0 b0Var, @Nullable c<? super List<AddressItem>> cVar) {
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
            HttpClient httpClient = AddressService.this.httpClient;
            String strP = a0.p("datasets/countries/", this.$shopperLocale, ".json");
            ModelObject.Serializer<AddressItem> serializer = AddressItem.SERIALIZER;
            this.label = 1;
            Object list$default = HttpClientExtKt.getList$default(httpClient, strP, serializer, null, this, 4, null);
            return list$default == aVar ? aVar : list$default;
        }
    }

    /* JADX INFO: renamed from: com.adyen.checkout.ui.core.internal.data.api.AddressService$getStates$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "com.adyen.checkout.ui.core.internal.data.api.AddressService$getStates$2", f = "AddressService.kt", l = {37}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lv80/b0;", "", "Lcom/adyen/checkout/ui/core/internal/data/model/AddressItem;", "<anonymous>", "(Lv80/b0;)Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
    public static final class C01372 extends i implements Function2<b0, c<? super List<? extends AddressItem>>, Object> {
        final /* synthetic */ String $countryCode;
        final /* synthetic */ String $shopperLocale;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01372(String str, String str2, c<? super C01372> cVar) {
            super(2, cVar);
            this.$countryCode = str;
            this.$shopperLocale = str2;
        }

        @Override // z70.a
        @NotNull
        public final c<Unit> create(@Nullable Object obj, @NotNull c<?> cVar) {
            return AddressService.this.new C01372(this.$countryCode, this.$shopperLocale, cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull b0 b0Var, @Nullable c<? super List<AddressItem>> cVar) {
            return ((C01372) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
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
            HttpClient httpClient = AddressService.this.httpClient;
            String strD = org.bouncycastle.jcajce.provider.asymmetric.a.d("datasets/states/", this.$countryCode, ExpiryDateInput.SEPARATOR, this.$shopperLocale, ".json");
            ModelObject.Serializer<AddressItem> serializer = AddressItem.SERIALIZER;
            this.label = 1;
            Object list$default = HttpClientExtKt.getList$default(httpClient, strD, serializer, null, this, 4, null);
            return list$default == aVar ? aVar : list$default;
        }
    }

    public AddressService(@NotNull HttpClient httpClient, @NotNull x xVar) {
        httpClient.getClass();
        xVar.getClass();
        this.httpClient = httpClient;
        this.coroutineDispatcher = xVar;
    }

    @Nullable
    public final Object getCountries(@NotNull String str, @NotNull c<? super List<AddressItem>> cVar) {
        return f0.K(this.coroutineDispatcher, new AnonymousClass2(str, null), cVar);
    }

    @Nullable
    public final Object getStates(@NotNull String str, @NotNull String str2, @NotNull c<? super List<AddressItem>> cVar) {
        return f0.K(this.coroutineDispatcher, new C01372(str2, str, null), cVar);
    }

    public /* synthetic */ AddressService(HttpClient httpClient, x xVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(httpClient, (i11 & 2) != 0 ? DispatcherProvider.INSTANCE.getIO() : xVar);
    }
}
