package kt;

import com.app.tgtg.model.remote.manufacturer.request.BasketDeliveryOptionsRequest;
import com.app.tgtg.model.remote.manufacturer.request.CreateMultipleItemsOrderRequestV8;
import com.app.tgtg.model.remote.manufacturer.request.DeliveryOptionsRequest;
import com.app.tgtg.model.remote.manufacturer.response.DeliveryOptionsResponse;
import com.app.tgtg.model.remote.order.OrderListMonthlyResult;
import com.app.tgtg.model.remote.order.OrderListResult;
import com.app.tgtg.model.remote.order.OrderRatingItem;
import com.app.tgtg.model.remote.order.OrderResult;
import com.app.tgtg.model.remote.order.RedeemResponse;
import com.app.tgtg.model.remote.order.request.CancelOrderRequest;
import com.app.tgtg.model.remote.order.request.CreateMultiPaymentRequest;
import com.app.tgtg.model.remote.order.request.CreateOrderRequestV8;
import com.app.tgtg.model.remote.order.request.ListOrdersRequest;
import com.app.tgtg.model.remote.order.request.OrderConfirmedEmailRequest;
import com.app.tgtg.model.remote.order.request.OrderRatingRequest;
import com.app.tgtg.model.remote.order.request.WouldBuyAgainRequest;
import com.app.tgtg.model.remote.order.response.AbortOrderResponse;
import com.app.tgtg.model.remote.order.response.CancelOrderResponse;
import com.app.tgtg.model.remote.order.response.CreateOrderResponse;
import com.app.tgtg.model.remote.order.response.PaymentResponse;
import com.app.tgtg.model.remote.user.requests.RedeemOrderRequest;
import com.braze.Constants;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q90.a0;
import q90.r0;
import ra0.s;
import u70.q;
import zendesk.faye.internal.Bayeux;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\tJ \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u000b\u001a\u00020\nH§@¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0006H§@¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00062\b\b\u0001\u0010\u000b\u001a\u00020\u0011H§@¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00062\b\b\u0001\u0010\u0016\u001a\u00020\u0015H§@¢\u0006\u0004\b\u0018\u0010\u0019J*\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00062\b\b\u0001\u0010\u0016\u001a\u00020\u00152\b\b\u0001\u0010\u001b\u001a\u00020\u001aH§@¢\u0006\u0004\b\u001d\u0010\u001eJ*\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00062\b\b\u0001\u0010\u0016\u001a\u00020\u00152\b\b\u0001\u0010 \u001a\u00020\u001fH§@¢\u0006\u0004\b\"\u0010#J*\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u00062\b\b\u0001\u0010\u0016\u001a\u00020\u00152\b\b\u0001\u0010 \u001a\u00020\u001fH§@¢\u0006\u0004\b%\u0010#J*\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u00062\b\b\u0001\u0010\u0016\u001a\u00020\u00152\b\b\u0001\u0010'\u001a\u00020&H§@¢\u0006\u0004\b)\u0010*J\"\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010+0\u00062\b\b\u0001\u0010\u0016\u001a\u00020\u0015H§@¢\u0006\u0004\b,\u0010\u0019J*\u0010/\u001a\b\u0012\u0004\u0012\u00020+0\u00062\b\b\u0001\u0010\u0016\u001a\u00020\u00152\b\b\u0001\u0010.\u001a\u00020-H§@¢\u0006\u0004\b/\u00100J*\u00101\u001a\b\u0012\u0004\u0012\u00020+0\u00062\b\b\u0001\u0010\u0016\u001a\u00020\u00152\b\b\u0001\u0010.\u001a\u00020-H§@¢\u0006\u0004\b1\u00100J*\u00103\u001a\b\u0012\u0004\u0012\u00020+0\u00062\b\b\u0001\u0010\u0016\u001a\u00020\u00152\b\b\u0001\u0010.\u001a\u000202H§@¢\u0006\u0004\b3\u00104J2\u00108\u001a\b\u0012\u0004\u0012\u00020+0\u00062\b\b\u0001\u0010\u0016\u001a\u00020\u00152\u0010\b\u0001\u00107\u001a\n\u0012\u0004\u0012\u000206\u0018\u000105H§@¢\u0006\u0004\b8\u00109J,\u0010<\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010+0\u00062\b\b\u0001\u0010\u0016\u001a\u00020\u00152\b\b\u0001\u0010;\u001a\u00020:H§@¢\u0006\u0004\b<\u0010=J,\u0010A\u001a\b\u0012\u0004\u0012\u00020+0\u00062\n\b\u0001\u0010>\u001a\u0004\u0018\u00010\u00152\b\b\u0001\u0010@\u001a\u00020?H§@¢\u0006\u0004\bA\u0010BJ \u0010E\u001a\b\u0012\u0004\u0012\u00020D0\u00062\b\b\u0001\u0010@\u001a\u00020CH§@¢\u0006\u0004\bE\u0010FJ \u0010H\u001a\b\u0012\u0004\u0012\u00020D0\u00062\b\b\u0001\u0010@\u001a\u00020GH§@¢\u0006\u0004\bH\u0010I¨\u0006JÀ\u0006\u0003"}, d2 = {"Lkt/j;", "", "Lcom/app/tgtg/model/remote/ItemId;", "itemId", "Lcom/app/tgtg/model/remote/order/request/CreateOrderRequestV8;", "createOrder", "Lu70/q;", "Lcom/app/tgtg/model/remote/order/response/CreateOrderResponse;", "m", "(Ljava/lang/String;Lcom/app/tgtg/model/remote/order/request/CreateOrderRequestV8;Lx70/c;)Ljava/lang/Object;", "Lcom/app/tgtg/model/remote/manufacturer/request/CreateMultipleItemsOrderRequestV8;", "request", "b", "(Lcom/app/tgtg/model/remote/manufacturer/request/CreateMultipleItemsOrderRequestV8;Lx70/c;)Ljava/lang/Object;", "Lcom/app/tgtg/model/remote/order/OrderListResult;", Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE, "(Lx70/c;)Ljava/lang/Object;", "Lcom/app/tgtg/model/remote/order/request/ListOrdersRequest;", "Lcom/app/tgtg/model/remote/order/OrderListMonthlyResult;", "f", "(Lcom/app/tgtg/model/remote/order/request/ListOrdersRequest;Lx70/c;)Ljava/lang/Object;", "", "orderId", "Lcom/app/tgtg/model/remote/order/OrderResult;", Constants.BRAZE_PUSH_CONTENT_KEY, "(Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "Lcom/app/tgtg/model/remote/order/request/CreateMultiPaymentRequest;", "createPayment", "Lcom/app/tgtg/model/remote/order/response/PaymentResponse;", "o", "(Ljava/lang/String;Lcom/app/tgtg/model/remote/order/request/CreateMultiPaymentRequest;Lx70/c;)Ljava/lang/Object;", "Lcom/app/tgtg/model/remote/order/request/CancelOrderRequest;", "cancelOrderRequest", "Lcom/app/tgtg/model/remote/order/response/CancelOrderResponse;", "q", "(Ljava/lang/String;Lcom/app/tgtg/model/remote/order/request/CancelOrderRequest;Lx70/c;)Ljava/lang/Object;", "Lcom/app/tgtg/model/remote/order/response/AbortOrderResponse;", "r", "Lcom/app/tgtg/model/remote/user/requests/RedeemOrderRequest;", "redeemOrderRequest", "Lcom/app/tgtg/model/remote/order/RedeemResponse;", "e", "(Ljava/lang/String;Lcom/app/tgtg/model/remote/user/requests/RedeemOrderRequest;Lx70/c;)Ljava/lang/Object;", "Lq90/r0;", "h", "Lcom/app/tgtg/model/remote/order/OrderRatingItem;", "orderRating", "i", "(Ljava/lang/String;Lcom/app/tgtg/model/remote/order/OrderRatingItem;Lx70/c;)Ljava/lang/Object;", "g", "Lcom/app/tgtg/model/remote/order/request/OrderRatingRequest;", Constants.BRAZE_PUSH_CUSTOM_NOTIFICATION_ID, "(Ljava/lang/String;Lcom/app/tgtg/model/remote/order/request/OrderRatingRequest;Lx70/c;)Ljava/lang/Object;", "", "Lq90/a0;", "imageFile", "j", "(Ljava/lang/String;Ljava/util/List;Lx70/c;)Ljava/lang/Object;", "Lcom/app/tgtg/model/remote/order/request/WouldBuyAgainRequest;", "wouldBuyAgainRequest", "k", "(Ljava/lang/String;Lcom/app/tgtg/model/remote/order/request/WouldBuyAgainRequest;Lx70/c;)Ljava/lang/Object;", "receiptId", "Lcom/app/tgtg/model/remote/order/request/OrderConfirmedEmailRequest;", Bayeux.KEY_DATA, "l", "(Ljava/lang/String;Lcom/app/tgtg/model/remote/order/request/OrderConfirmedEmailRequest;Lx70/c;)Ljava/lang/Object;", "Lcom/app/tgtg/model/remote/manufacturer/request/DeliveryOptionsRequest;", "Lcom/app/tgtg/model/remote/manufacturer/response/DeliveryOptionsResponse;", "c", "(Lcom/app/tgtg/model/remote/manufacturer/request/DeliveryOptionsRequest;Lx70/c;)Ljava/lang/Object;", "Lcom/app/tgtg/model/remote/manufacturer/request/BasketDeliveryOptionsRequest;", Constants.BRAZE_PUSH_PRIORITY_KEY, "(Lcom/app/tgtg/model/remote/manufacturer/request/BasketDeliveryOptionsRequest;Lx70/c;)Ljava/lang/Object;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface j {
    @ra0.o("api/order/v8/{orderId}")
    @Nullable
    Object a(@s(encoded = true, value = "orderId") @NotNull String str, @NotNull x70.c<? super q<OrderResult>> cVar);

    @ra0.o("api/order/v8/createMultipleItemsOrder")
    @Nullable
    Object b(@NotNull @ra0.a CreateMultipleItemsOrderRequestV8 createMultipleItemsOrderRequestV8, @NotNull x70.c<? super q<CreateOrderResponse>> cVar);

    @ra0.o("api/order/v8/getDeliveryOptions")
    @Nullable
    Object c(@NotNull @ra0.a DeliveryOptionsRequest deliveryOptionsRequest, @NotNull x70.c<? super q<DeliveryOptionsResponse>> cVar);

    @ra0.o("api/order/v8/active")
    @Nullable
    Object d(@NotNull x70.c<? super q<OrderListResult>> cVar);

    @ra0.o("api/order/v8/{orderId}/redeem")
    @Nullable
    Object e(@s(encoded = true, value = "orderId") @NotNull String str, @NotNull @ra0.a RedeemOrderRequest redeemOrderRequest, @NotNull x70.c<? super q<RedeemResponse>> cVar);

    @ra0.o("api/order/v8/")
    @Nullable
    Object f(@NotNull @ra0.a ListOrdersRequest listOrdersRequest, @NotNull x70.c<? super q<OrderListMonthlyResult>> cVar);

    @ra0.o("api/manufacturer/order/{orderId}/rate")
    @Nullable
    Object g(@s(encoded = true, value = "orderId") @NotNull String str, @NotNull @ra0.a OrderRatingItem orderRatingItem, @NotNull x70.c<? super q<? extends r0>> cVar);

    @ra0.o("api/order/v8/{orderId}/markNotCollected")
    @Nullable
    Object h(@s(encoded = true, value = "orderId") @NotNull String str, @NotNull x70.c<? super q<? extends r0>> cVar);

    @ra0.o("api/order/v8/{orderId}/rate")
    @Nullable
    Object i(@s(encoded = true, value = "orderId") @NotNull String str, @NotNull @ra0.a OrderRatingItem orderRatingItem, @NotNull x70.c<? super q<? extends r0>> cVar);

    @ra0.o("api/order/v8/{orderId}/ratingPictureUpload")
    @ra0.l
    @Nullable
    Object j(@s(encoded = true, value = "orderId") @NotNull String str, @Nullable @ra0.q List<a0> list, @NotNull x70.c<? super q<? extends r0>> cVar);

    @ra0.o("api/order/v8/{orderId}/wouldBuyAgain")
    @Nullable
    Object k(@s(encoded = true, value = "orderId") @NotNull String str, @NotNull @ra0.a WouldBuyAgainRequest wouldBuyAgainRequest, @NotNull x70.c<? super q<? extends r0>> cVar);

    @ra0.o("api/order/v8/{receiptId}/sendOrderConfirmedEmail")
    @Nullable
    Object l(@s(encoded = true, value = "receiptId") @Nullable String str, @NotNull @ra0.a OrderConfirmedEmailRequest orderConfirmedEmailRequest, @NotNull x70.c<? super q<? extends r0>> cVar);

    @ra0.o("api/order/v8/create/{itemId}")
    @Nullable
    Object m(@s(encoded = true, value = "itemId") @NotNull String str, @NotNull @ra0.a CreateOrderRequestV8 createOrderRequestV8, @NotNull x70.c<? super q<CreateOrderResponse>> cVar);

    @ra0.o("api/order/v8/{orderId}/rateOrder")
    @Nullable
    Object n(@s(encoded = true, value = "orderId") @NotNull String str, @NotNull @ra0.a OrderRatingRequest orderRatingRequest, @NotNull x70.c<? super q<? extends r0>> cVar);

    @ra0.o("api/order/v8/{orderId}/pay")
    @Nullable
    Object o(@s(encoded = true, value = "orderId") @NotNull String str, @NotNull @ra0.a CreateMultiPaymentRequest createMultiPaymentRequest, @NotNull x70.c<? super q<PaymentResponse>> cVar);

    @ra0.o("api/order/v8/getBasketDeliveryOptions")
    @Nullable
    Object p(@NotNull @ra0.a BasketDeliveryOptionsRequest basketDeliveryOptionsRequest, @NotNull x70.c<? super q<DeliveryOptionsResponse>> cVar);

    @ra0.o("api/order/v8/{orderId}/cancel")
    @Nullable
    Object q(@s(encoded = true, value = "orderId") @NotNull String str, @NotNull @ra0.a CancelOrderRequest cancelOrderRequest, @NotNull x70.c<? super q<CancelOrderResponse>> cVar);

    @ra0.o("api/order/v8/{orderId}/abort")
    @Nullable
    Object r(@s(encoded = true, value = "orderId") @NotNull String str, @NotNull @ra0.a CancelOrderRequest cancelOrderRequest, @NotNull x70.c<? super q<AbortOrderResponse>> cVar);
}
