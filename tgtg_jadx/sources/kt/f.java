package kt;

import com.app.tgtg.model.remote.item.requests.ExtendedPriceSpecificationsRequest;
import com.app.tgtg.model.remote.item.requests.ItemRequest;
import com.app.tgtg.model.remote.item.requests.ListItemRequest;
import com.app.tgtg.model.remote.item.requests.RecommendationsListRequest;
import com.app.tgtg.model.remote.item.response.AlternateRecommendedItemResponse;
import com.app.tgtg.model.remote.item.response.BasicItem;
import com.app.tgtg.model.remote.item.response.ItemDiscountResponse;
import com.app.tgtg.model.remote.item.response.ListItemResponse;
import com.app.tgtg.model.remote.item.response.SameTimeCloseByResponse;
import com.app.tgtg.model.remote.payment.ExtendedPriceSpecification;
import com.app.tgtg.model.remote.user.requests.CharitySupportMessageRequest;
import com.braze.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q90.r0;
import ra0.s;
import u70.q;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J8\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0004H§@¢\u0006\u0004\b\t\u0010\nJD\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\r2\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0004H§@¢\u0006\u0004\b\u000f\u0010\u0010J8\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00112\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0004H§@¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\b\b\u0001\u0010\f\u001a\u00020\u000bH§@¢\u0006\u0004\b\u0015\u0010\u0016J,\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\u0017H§@¢\u0006\u0004\b\u0019\u0010\u001aJ \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00072\b\b\u0001\u0010\f\u001a\u00020\u000bH§@¢\u0006\u0004\b\u001c\u0010\u0016J \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00072\b\b\u0001\u0010\f\u001a\u00020\u000bH§@¢\u0006\u0004\b\u001e\u0010\u0016J \u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u001fH§@¢\u0006\u0004\b \u0010!J \u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00072\b\b\u0001\u0010\f\u001a\u00020\u000bH§@¢\u0006\u0004\b#\u0010\u0016¨\u0006$À\u0006\u0003"}, d2 = {"Lkt/f;", "", "Lcom/app/tgtg/model/remote/item/requests/ListItemRequest;", "request", "", "timezoneOffset", "timeFormat", "Lu70/q;", "Lcom/app/tgtg/model/remote/item/response/ListItemResponse;", "f", "(Lcom/app/tgtg/model/remote/item/requests/ListItemRequest;Ljava/lang/String;Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "Lcom/app/tgtg/model/remote/ItemId;", "itemId", "Lcom/app/tgtg/model/remote/item/requests/ItemRequest;", "Lcom/app/tgtg/model/remote/item/response/BasicItem;", "e", "(Ljava/lang/String;Lcom/app/tgtg/model/remote/item/requests/ItemRequest;Ljava/lang/String;Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "Lcom/app/tgtg/model/remote/item/requests/RecommendationsListRequest;", "g", "(Lcom/app/tgtg/model/remote/item/requests/RecommendationsListRequest;Ljava/lang/String;Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "Lcom/app/tgtg/model/remote/item/response/AlternateRecommendedItemResponse;", "b", "(Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "Lcom/app/tgtg/model/remote/item/requests/ExtendedPriceSpecificationsRequest;", "Lcom/app/tgtg/model/remote/payment/ExtendedPriceSpecification;", "h", "(Ljava/lang/String;Lcom/app/tgtg/model/remote/item/requests/ExtendedPriceSpecificationsRequest;Lx70/c;)Ljava/lang/Object;", "Lcom/app/tgtg/model/remote/item/response/SameTimeCloseByResponse;", "c", "Lq90/r0;", Constants.BRAZE_PUSH_CONTENT_KEY, "Lcom/app/tgtg/model/remote/user/requests/CharitySupportMessageRequest;", "i", "(Lcom/app/tgtg/model/remote/user/requests/CharitySupportMessageRequest;Lx70/c;)Ljava/lang/Object;", "Lcom/app/tgtg/model/remote/item/response/ItemDiscountResponse;", Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE, "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface f {
    @ra0.o("/api/charity/v1/{itemId}/passOn")
    @Nullable
    Object a(@s("itemId") @NotNull String str, @NotNull x70.c<? super q<? extends r0>> cVar);

    @ra0.o("api/item/v9/recommendations/{itemId}")
    @Nullable
    Object b(@s(encoded = true, value = "itemId") @NotNull String str, @NotNull x70.c<? super q<AlternateRecommendedItemResponse>> cVar);

    @ra0.o("/api/item/v9/{itemId}/sameTimeCloseBy")
    @Nullable
    Object c(@s(encoded = true, value = "itemId") @NotNull String str, @NotNull x70.c<? super q<SameTimeCloseByResponse>> cVar);

    @ra0.o("api/item/v9/discount/{itemId}")
    @Nullable
    Object d(@s(encoded = true, value = "itemId") @NotNull String str, @NotNull x70.c<? super q<ItemDiscountResponse>> cVar);

    @ra0.o("api/item/v9/{itemId}")
    @Nullable
    Object e(@s(encoded = true, value = "itemId") @Nullable String str, @NotNull @ra0.a ItemRequest itemRequest, @Nullable @ra0.i("X-TimezoneOffset") String str2, @Nullable @ra0.i("X-24HourFormat") String str3, @NotNull x70.c<? super q<? extends BasicItem>> cVar);

    @ra0.o("api/item/v9/")
    @Nullable
    Object f(@NotNull @ra0.a ListItemRequest listItemRequest, @Nullable @ra0.i("X-TimezoneOffset") String str, @Nullable @ra0.i("X-24HourFormat") String str2, @NotNull x70.c<? super q<ListItemResponse>> cVar);

    @ra0.o("api/item/v9/recommendations")
    @Nullable
    Object g(@NotNull @ra0.a RecommendationsListRequest recommendationsListRequest, @Nullable @ra0.i("X-TimezoneOffset") String str, @Nullable @ra0.i("X-24HourFormat") String str2, @NotNull x70.c<? super q<ListItemResponse>> cVar);

    @ra0.o("api/item/v9/{itemId}/getExtendedPriceSpecifications")
    @Nullable
    Object h(@s(encoded = true, value = "itemId") @Nullable String str, @NotNull @ra0.a ExtendedPriceSpecificationsRequest extendedPriceSpecificationsRequest, @NotNull x70.c<? super q<ExtendedPriceSpecification>> cVar);

    @ra0.o("api/charity/v1/support")
    @Nullable
    Object i(@NotNull @ra0.a CharitySupportMessageRequest charitySupportMessageRequest, @NotNull x70.c<? super q<? extends r0>> cVar);
}
