package kt;

import com.app.tgtg.model.remote.manufacturer.request.BasketPaymentMethodsRequest;
import com.app.tgtg.model.remote.order.AdditionalAuthRequest;
import com.app.tgtg.model.remote.order.Payments;
import com.app.tgtg.model.remote.order.response.PaymentResponse;
import com.app.tgtg.model.remote.payment.SavedPaymentMethodsResponse;
import com.app.tgtg.model.remote.payment.request.DeleteCardRequest;
import com.app.tgtg.model.remote.payment.request.PaymentMethodsRequest;
import com.app.tgtg.model.remote.payment.response.BiometricsResponse;
import com.app.tgtg.model.remote.payment.response.DeleteCardResponse;
import com.app.tgtg.model.remote.payment.response.PaymentMethodsResponse;
import com.braze.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ra0.s;
import u70.q;
import zendesk.faye.internal.Bayeux;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J,\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\tJ \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0005\u001a\u00020\nH§@¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\b\b\u0001\u0010\u000e\u001a\u00020\rH§@¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00062\b\b\u0001\u0010\u0012\u001a\u00020\rH§@¢\u0006\u0004\b\u0014\u0010\u0011J*\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u00062\b\b\u0001\u0010\u0012\u001a\u00020\r2\b\b\u0001\u0010\u0016\u001a\u00020\u0015H§@¢\u0006\u0004\b\u0017\u0010\u0018J \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00062\b\b\u0001\u0010\u0012\u001a\u00020\rH§@¢\u0006\u0004\b\u001a\u0010\u0011J \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00062\b\b\u0001\u0010\u001c\u001a\u00020\u001bH§@¢\u0006\u0004\b\u001e\u0010\u001fJ\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u0006H§@¢\u0006\u0004\b!\u0010\"¨\u0006#À\u0006\u0003"}, d2 = {"Lkt/k;", "", "Lcom/app/tgtg/model/remote/ItemId;", "itemId", "Lcom/app/tgtg/model/remote/payment/request/PaymentMethodsRequest;", Bayeux.KEY_DATA, "Lu70/q;", "Lcom/app/tgtg/model/remote/payment/response/PaymentMethodsResponse;", Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE, "(Ljava/lang/String;Lcom/app/tgtg/model/remote/payment/request/PaymentMethodsRequest;Lx70/c;)Ljava/lang/Object;", "Lcom/app/tgtg/model/remote/manufacturer/request/BasketPaymentMethodsRequest;", Constants.BRAZE_PUSH_CONTENT_KEY, "(Lcom/app/tgtg/model/remote/manufacturer/request/BasketPaymentMethodsRequest;Lx70/c;)Ljava/lang/Object;", "", "orderId", "Lcom/app/tgtg/model/remote/order/response/PaymentResponse;", "b", "(Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "paymentId", "Lcom/app/tgtg/model/remote/order/Payments;", "c", "Lcom/app/tgtg/model/remote/order/AdditionalAuthRequest;", "extraAuth", "e", "(Ljava/lang/String;Lcom/app/tgtg/model/remote/order/AdditionalAuthRequest;Lx70/c;)Ljava/lang/Object;", "Lcom/app/tgtg/model/remote/payment/response/BiometricsResponse;", "g", "Lcom/app/tgtg/model/remote/payment/request/DeleteCardRequest;", "deleteCardRequest", "Lcom/app/tgtg/model/remote/payment/response/DeleteCardResponse;", "h", "(Lcom/app/tgtg/model/remote/payment/request/DeleteCardRequest;Lx70/c;)Ljava/lang/Object;", "Lcom/app/tgtg/model/remote/payment/SavedPaymentMethodsResponse;", "f", "(Lx70/c;)Ljava/lang/Object;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface k {
    @ra0.o("api/paymentMethod/v2/basket")
    @Nullable
    Object a(@NotNull @ra0.a BasketPaymentMethodsRequest basketPaymentMethodsRequest, @NotNull x70.c<? super q<PaymentMethodsResponse>> cVar);

    @ra0.o("api/payment/v4/order/{orderId}")
    @Nullable
    Object b(@s(encoded = true, value = "orderId") @NotNull String str, @NotNull x70.c<? super q<PaymentResponse>> cVar);

    @ra0.o("api/payment/v4/{paymentId}")
    @Nullable
    Object c(@s(encoded = true, value = "paymentId") @NotNull String str, @NotNull x70.c<? super q<Payments>> cVar);

    @ra0.o("api/paymentMethod/v2/item/{itemId}")
    @Nullable
    Object d(@s(encoded = true, value = "itemId") @Nullable String str, @NotNull @ra0.a PaymentMethodsRequest paymentMethodsRequest, @NotNull x70.c<? super q<PaymentMethodsResponse>> cVar);

    @ra0.o("api/payment/v4/{paymentId}/additionalAuthorization")
    @Nullable
    Object e(@s(encoded = true, value = "paymentId") @NotNull String str, @NotNull @ra0.a AdditionalAuthRequest additionalAuthRequest, @NotNull x70.c<? super q<Payments>> cVar);

    @ra0.o("api/paymentMethod/v2")
    @Nullable
    Object f(@NotNull x70.c<? super q<SavedPaymentMethodsResponse>> cVar);

    @ra0.o("api/payment/v4/{paymentId}/biometrics")
    @Nullable
    Object g(@s(encoded = true, value = "paymentId") @NotNull String str, @NotNull x70.c<? super q<BiometricsResponse>> cVar);

    @ra0.o("api/paymentMethod/v2/savedpaymentmethod/delete")
    @Nullable
    Object h(@NotNull @ra0.a DeleteCardRequest deleteCardRequest, @NotNull x70.c<? super q<DeleteCardResponse>> cVar);
}
