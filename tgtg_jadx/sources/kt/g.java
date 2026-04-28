package kt;

import com.app.tgtg.model.remote.manufacturer.request.FindAddressMatchRequest;
import com.app.tgtg.model.remote.manufacturer.request.MatchAddressRequest;
import com.app.tgtg.model.remote.manufacturer.response.AddressSearchFetchResponse;
import com.app.tgtg.model.remote.manufacturer.response.FindAddressMatchResponse;
import com.braze.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.q;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH§@¢\u0006\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lkt/g;", "", "Lcom/app/tgtg/model/remote/manufacturer/request/FindAddressMatchRequest;", "findAddressMatchRequest", "Lu70/q;", "Lcom/app/tgtg/model/remote/manufacturer/response/FindAddressMatchResponse;", Constants.BRAZE_PUSH_CONTENT_KEY, "(Lcom/app/tgtg/model/remote/manufacturer/request/FindAddressMatchRequest;Lx70/c;)Ljava/lang/Object;", "Lcom/app/tgtg/model/remote/manufacturer/request/MatchAddressRequest;", "Lcom/app/tgtg/model/remote/manufacturer/response/AddressSearchFetchResponse;", "b", "(Lcom/app/tgtg/model/remote/manufacturer/request/MatchAddressRequest;Lx70/c;)Ljava/lang/Object;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface g {
    @ra0.o("api/location-address/v1/find")
    @Nullable
    Object a(@NotNull @ra0.a FindAddressMatchRequest findAddressMatchRequest, @NotNull x70.c<? super q<FindAddressMatchResponse>> cVar);

    @ra0.o("api/location-address/v1/fetch")
    @Nullable
    Object b(@NotNull @ra0.a MatchAddressRequest matchAddressRequest, @NotNull x70.c<? super q<AddressSearchFetchResponse>> cVar);
}
