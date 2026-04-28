package kt;

import com.app.tgtg.model.remote.manufacturer.request.BasketPriceSpecificationsRequest;
import com.app.tgtg.model.remote.manufacturer.request.BasketRequest;
import com.app.tgtg.model.remote.manufacturer.request.ManufacturerItemsV2Request;
import com.app.tgtg.model.remote.manufacturer.request.MnuRecommendationsRequest;
import com.app.tgtg.model.remote.manufacturer.response.BasketPriceSpecificationsResponse;
import com.app.tgtg.model.remote.manufacturer.response.BasketResponse;
import com.app.tgtg.model.remote.manufacturer.response.ManufacturerItemsV2Response;
import com.app.tgtg.model.remote.manufacturer.response.MnuRecommendationsResponse;
import com.braze.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.q;
import zendesk.faye.internal.Bayeux;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH§@¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\fH§@¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00042\b\b\u0001\u0010\u0011\u001a\u00020\u0010H§@¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015À\u0006\u0003"}, d2 = {"Lkt/i;", "", "Lcom/app/tgtg/model/remote/manufacturer/request/ManufacturerItemsV2Request;", Bayeux.KEY_DATA, "Lu70/q;", "Lcom/app/tgtg/model/remote/manufacturer/response/ManufacturerItemsV2Response;", Constants.BRAZE_PUSH_CONTENT_KEY, "(Lcom/app/tgtg/model/remote/manufacturer/request/ManufacturerItemsV2Request;Lx70/c;)Ljava/lang/Object;", "Lcom/app/tgtg/model/remote/manufacturer/request/BasketRequest;", "Lcom/app/tgtg/model/remote/manufacturer/response/BasketResponse;", Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE, "(Lcom/app/tgtg/model/remote/manufacturer/request/BasketRequest;Lx70/c;)Ljava/lang/Object;", "Lcom/app/tgtg/model/remote/manufacturer/request/MnuRecommendationsRequest;", "Lcom/app/tgtg/model/remote/manufacturer/response/MnuRecommendationsResponse;", "c", "(Lcom/app/tgtg/model/remote/manufacturer/request/MnuRecommendationsRequest;Lx70/c;)Ljava/lang/Object;", "Lcom/app/tgtg/model/remote/manufacturer/request/BasketPriceSpecificationsRequest;", "request", "Lcom/app/tgtg/model/remote/manufacturer/response/BasketPriceSpecificationsResponse;", "b", "(Lcom/app/tgtg/model/remote/manufacturer/request/BasketPriceSpecificationsRequest;Lx70/c;)Ljava/lang/Object;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface i {
    @ra0.o("api/manufactureritem/v2/")
    @Nullable
    Object a(@NotNull @ra0.a ManufacturerItemsV2Request manufacturerItemsV2Request, @NotNull x70.c<? super q<ManufacturerItemsV2Response>> cVar);

    @ra0.o("api/manufactureritem/basket/v1/priceSpecifications")
    @Nullable
    Object b(@NotNull @ra0.a BasketPriceSpecificationsRequest basketPriceSpecificationsRequest, @NotNull x70.c<? super q<BasketPriceSpecificationsResponse>> cVar);

    @ra0.o("api/manufactureritem/v2/recommendations/")
    @Nullable
    Object c(@NotNull @ra0.a MnuRecommendationsRequest mnuRecommendationsRequest, @NotNull x70.c<? super q<MnuRecommendationsResponse>> cVar);

    @ra0.o("api/manufactureritem/basket/v1")
    @Nullable
    Object d(@NotNull @ra0.a BasketRequest basketRequest, @NotNull x70.c<? super q<BasketResponse>> cVar);
}
