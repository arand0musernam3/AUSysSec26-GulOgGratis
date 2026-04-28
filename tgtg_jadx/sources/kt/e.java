package kt;

import com.app.tgtg.model.remote.invitation.Invitation;
import com.app.tgtg.model.remote.invitation.InvitationFromDeeplinkResponse;
import com.app.tgtg.model.remote.invitation.requests.FulfillmentRequest;
import com.app.tgtg.model.remote.order.OrderResult;
import com.app.tgtg.model.remote.order.request.OrderRatingRequest;
import com.braze.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q90.r0;
import ra0.s;
import u70.q;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\b\u0010\u0007J*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\t\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\nH§@¢\u0006\u0004\b\f\u0010\rJ \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\t\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000e\u0010\u0007J \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\t\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000f\u0010\u0007J \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0010\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0011\u0010\u0007J \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00042\b\b\u0001\u0010\t\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0013\u0010\u0007J \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00042\b\b\u0001\u0010\t\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0015\u0010\u0007J \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00042\b\b\u0001\u0010\u0010\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0017\u0010\u0007J*\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00140\u00042\b\b\u0001\u0010\t\u001a\u00020\u00022\b\b\u0001\u0010\u0019\u001a\u00020\u0018H§@¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001cÀ\u0006\u0003"}, d2 = {"Lkt/e;", "", "", "orderId", "Lu70/q;", "Lcom/app/tgtg/model/remote/invitation/Invitation;", "c", "(Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "h", "invitationId", "Lcom/app/tgtg/model/remote/invitation/requests/FulfillmentRequest;", "fulfillReq", "b", "(Ljava/lang/String;Lcom/app/tgtg/model/remote/invitation/requests/FulfillmentRequest;Lx70/c;)Ljava/lang/Object;", "g", "f", "invitationExternalId", "j", "Lcom/app/tgtg/model/remote/order/OrderResult;", "i", "Lq90/r0;", Constants.BRAZE_PUSH_CONTENT_KEY, "Lcom/app/tgtg/model/remote/invitation/InvitationFromDeeplinkResponse;", Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE, "Lcom/app/tgtg/model/remote/order/request/OrderRatingRequest;", "orderRating", "e", "(Ljava/lang/String;Lcom/app/tgtg/model/remote/order/request/OrderRatingRequest;Lx70/c;)Ljava/lang/Object;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface e {
    @ra0.o("api/invitation/v1/order/markNotCollected/{invitationId}")
    @Nullable
    Object a(@s(encoded = true, value = "invitationId") @NotNull String str, @NotNull x70.c<? super q<? extends r0>> cVar);

    @ra0.o("api/invitation/v1/{invitationId}/fulfill")
    @Nullable
    Object b(@s(encoded = true, value = "invitationId") @NotNull String str, @NotNull @ra0.a FulfillmentRequest fulfillmentRequest, @NotNull x70.c<? super q<Invitation>> cVar);

    @ra0.o("api/invitation/v1/order/{orderId}")
    @Nullable
    Object c(@s(encoded = true, value = "orderId") @NotNull String str, @NotNull x70.c<? super q<Invitation>> cVar);

    @ra0.o("api/invitation/v1/order/fromLink/{invitationExternalId}")
    @Nullable
    Object d(@s(encoded = true, value = "invitationExternalId") @NotNull String str, @NotNull x70.c<? super q<InvitationFromDeeplinkResponse>> cVar);

    @ra0.o("api/invitation/v1/order/{invitationId}/rateOrder")
    @Nullable
    Object e(@s(encoded = true, value = "invitationId") @NotNull String str, @NotNull @ra0.a OrderRatingRequest orderRatingRequest, @NotNull x70.c<? super q<? extends r0>> cVar);

    @ra0.o("api/invitation/v1/{invitationId}/disable")
    @Nullable
    Object f(@s(encoded = true, value = "invitationId") @NotNull String str, @NotNull x70.c<? super q<Invitation>> cVar);

    @ra0.o("api/invitation/v1/{invitationId}/regret")
    @Nullable
    Object g(@s(encoded = true, value = "invitationId") @NotNull String str, @NotNull x70.c<? super q<Invitation>> cVar);

    @ra0.o("api/invitation/v1/order/{orderId}/createOrEnable")
    @Nullable
    Object h(@s(encoded = true, value = "orderId") @NotNull String str, @NotNull x70.c<? super q<Invitation>> cVar);

    @ra0.o("api/invitation/v1/order/getOrder/{invitationId}")
    @Nullable
    Object i(@s(encoded = true, value = "invitationId") @NotNull String str, @NotNull x70.c<? super q<OrderResult>> cVar);

    @ra0.o("api/invitation/v1/{invitationExternalId}/accept")
    @Nullable
    Object j(@s(encoded = true, value = "invitationExternalId") @NotNull String str, @NotNull x70.c<? super q<Invitation>> cVar);
}
