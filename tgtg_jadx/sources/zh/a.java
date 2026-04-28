package zh;

import ai.f;
import com.app.tgtg.model.remote.order.OrderChanges;
import com.app.tgtg.model.remote.order.request.CancelOrderRequest;
import com.app.tgtg.model.remote.order.response.CancelOrderResponse;
import com.app.tgtg.model.remote.order.response.CharityOrderHistoryResponse;
import com.app.tgtg.model.remote.order.response.CharityVerificationResponse;
import com.app.tgtg.model.remote.user.requests.CharityScheduleRequest;
import com.app.tgtg.model.remote.user.response.charity.CharityBulkCancelOrder;
import com.app.tgtg.model.remote.user.response.charity.CharityGeneralSchedule;
import com.app.tgtg.model.remote.user.response.charity.CharityHomeResponse;
import com.app.tgtg.model.remote.user.response.charity.CharityOrderHistory;
import com.app.tgtg.model.remote.user.response.charity.CharityProductsResponse;
import com.app.tgtg.model.remote.user.response.charity.CharityScheduleResponse;
import com.app.tgtg.model.remote.user.response.charity.CharityUpdateGeneralSchedule;
import com.braze.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q90.r0;
import ra0.o;
import ra0.s;
import u70.q;
import x70.c;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\t\u0010\nJ \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00022\b\b\u0001\u0010\f\u001a\u00020\u000bH§@¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00022\b\b\u0001\u0010\u0011\u001a\u00020\u0010H§@¢\u0006\u0004\b\u0013\u0010\u000fJ*\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00022\b\b\u0001\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u0015\u001a\u00020\u0014H§@¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0002H§@¢\u0006\u0004\b\u001a\u0010\u0005J \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00022\b\b\u0001\u0010\u001b\u001a\u00020\u0019H§@¢\u0006\u0004\b\u001d\u0010\u001eJ \u0010!\u001a\b\u0012\u0004\u0012\u00020\u00160\u00022\b\b\u0001\u0010 \u001a\u00020\u001fH§@¢\u0006\u0004\b!\u0010\"J \u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u00022\b\b\u0001\u0010$\u001a\u00020#H§@¢\u0006\u0004\b&\u0010'J \u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u00022\b\b\u0001\u0010(\u001a\u00020\u000bH§@¢\u0006\u0004\b*\u0010\u000fJ\u0016\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u0002H§@¢\u0006\u0004\b,\u0010\u0005J \u00100\u001a\b\u0012\u0004\u0012\u00020/0\u00022\b\b\u0001\u0010.\u001a\u00020-H§@¢\u0006\u0004\b0\u00101¨\u00062À\u0006\u0003"}, d2 = {"Lzh/a;", "", "Lu70/q;", "Lcom/app/tgtg/model/remote/user/response/charity/CharityHomeResponse;", "i", "(Lx70/c;)Ljava/lang/Object;", "Lcom/app/tgtg/model/remote/user/requests/CharityScheduleRequest;", "request", "Lcom/app/tgtg/model/remote/user/response/charity/CharityScheduleResponse;", Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE, "(Lcom/app/tgtg/model/remote/user/requests/CharityScheduleRequest;Lx70/c;)Ljava/lang/Object;", "", "orderId", "Lcom/app/tgtg/model/remote/order/OrderChanges;", "l", "(Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "Lcom/app/tgtg/model/remote/ItemId;", "itemId", "Lcom/app/tgtg/model/remote/user/response/charity/CharityProductsResponse;", "b", "Lcom/app/tgtg/model/remote/order/request/CancelOrderRequest;", "cancelOrderRequest", "Lcom/app/tgtg/model/remote/order/response/CancelOrderResponse;", "e", "(Ljava/lang/String;Lcom/app/tgtg/model/remote/order/request/CancelOrderRequest;Lx70/c;)Ljava/lang/Object;", "Lcom/app/tgtg/model/remote/user/response/charity/CharityGeneralSchedule;", "c", "charityGeneralScheduleRequest", "Lcom/app/tgtg/model/remote/user/response/charity/CharityUpdateGeneralSchedule;", "f", "(Lcom/app/tgtg/model/remote/user/response/charity/CharityGeneralSchedule;Lx70/c;)Ljava/lang/Object;", "Lcom/app/tgtg/model/remote/user/response/charity/CharityBulkCancelOrder;", "bulkCancelOrder", "j", "(Lcom/app/tgtg/model/remote/user/response/charity/CharityBulkCancelOrder;Lx70/c;)Ljava/lang/Object;", "Lcom/app/tgtg/model/remote/user/response/charity/CharityOrderHistory;", "charityOrderHistoryRequest", "Lcom/app/tgtg/model/remote/order/response/CharityOrderHistoryResponse;", "k", "(Lcom/app/tgtg/model/remote/user/response/charity/CharityOrderHistory;Lx70/c;)Ljava/lang/Object;", "charityCode", "Lcom/app/tgtg/model/remote/order/response/CharityVerificationResponse;", "g", "Lai/f;", Constants.BRAZE_PUSH_CONTENT_KEY, "Lai/c;", "settings", "Lq90/r0;", "h", "(Lai/c;Lx70/c;)Ljava/lang/Object;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface a {
    @o("/api/charity/userdetails/v1/")
    @Nullable
    Object a(@NotNull c<? super q<f>> cVar);

    @o("api/charity/v1/products/{itemId}")
    @Nullable
    Object b(@s(encoded = true, value = "itemId") @NotNull String str, @NotNull c<? super q<CharityProductsResponse>> cVar);

    @o("api/charityschedule/v1/general")
    @Nullable
    Object c(@NotNull c<? super q<CharityGeneralSchedule>> cVar);

    @o("api/charityschedule/v1/")
    @Nullable
    Object d(@NotNull @ra0.a CharityScheduleRequest charityScheduleRequest, @NotNull c<? super q<CharityScheduleResponse>> cVar);

    @o("api/charity/v1/orders/{orderId}/cancel")
    @Nullable
    Object e(@s(encoded = true, value = "orderId") @NotNull String str, @NotNull @ra0.a CancelOrderRequest cancelOrderRequest, @NotNull c<? super q<CancelOrderResponse>> cVar);

    @o("api/charityschedule/v1/general/update")
    @Nullable
    Object f(@NotNull @ra0.a CharityGeneralSchedule charityGeneralSchedule, @NotNull c<? super q<CharityUpdateGeneralSchedule>> cVar);

    @o("/api/auth/charity/v1/verification/verify/{charityCode}")
    @Nullable
    Object g(@s("charityCode") @NotNull String str, @NotNull c<? super q<CharityVerificationResponse>> cVar);

    @o("/api/charity/userdetails/v1/update")
    @Nullable
    Object h(@NotNull @ra0.a ai.c cVar, @NotNull c<? super q<? extends r0>> cVar2);

    @o("/api/charity/v3/home")
    @Nullable
    Object i(@NotNull c<? super q<CharityHomeResponse>> cVar);

    @o("api/charity/v1/orders/bulk/cancel")
    @Nullable
    Object j(@NotNull @ra0.a CharityBulkCancelOrder charityBulkCancelOrder, @NotNull c<? super q<CancelOrderResponse>> cVar);

    @o("api/charity/v1/orders/history")
    @Nullable
    Object k(@NotNull @ra0.a CharityOrderHistory charityOrderHistory, @NotNull c<? super q<CharityOrderHistoryResponse>> cVar);

    @o("api/charity/v1/orders/{orderId}")
    @Nullable
    Object l(@s(encoded = true, value = "orderId") @NotNull String str, @NotNull c<? super q<OrderChanges>> cVar);
}
