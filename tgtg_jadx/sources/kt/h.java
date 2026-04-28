package kt;

import com.app.tgtg.model.remote.mapService.GeoLocation;
import com.app.tgtg.model.remote.mapService.request.LocationRequest;
import com.app.tgtg.model.remote.mapService.response.PlaceIdResponse;
import com.app.tgtg.model.remote.mapService.response.ReverseLookupResponse;
import com.app.tgtg.model.remote.mapService.response.SearchLocationResponse;
import com.braze.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ra0.s;
import u70.q;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\b\b\u0001\u0010\u000e\u001a\u00020\rH§@¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012À\u0006\u0003"}, d2 = {"Lkt/h;", "", "Lcom/app/tgtg/model/remote/mapService/GeoLocation;", "location", "Lu70/q;", "Lcom/app/tgtg/model/remote/mapService/response/ReverseLookupResponse;", "b", "(Lcom/app/tgtg/model/remote/mapService/GeoLocation;Lx70/c;)Ljava/lang/Object;", "Lcom/app/tgtg/model/remote/mapService/request/LocationRequest;", "locationRequest", "Lcom/app/tgtg/model/remote/mapService/response/SearchLocationResponse;", "c", "(Lcom/app/tgtg/model/remote/mapService/request/LocationRequest;Lx70/c;)Ljava/lang/Object;", "", "placeId", "Lcom/app/tgtg/model/remote/mapService/response/PlaceIdResponse;", Constants.BRAZE_PUSH_CONTENT_KEY, "(Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface h {
    @ra0.o("api/location/v2/place/{placeId}")
    @Nullable
    Object a(@s("placeId") @NotNull String str, @NotNull x70.c<? super q<PlaceIdResponse>> cVar);

    @ra0.o("api/location/v2/lookup")
    @Nullable
    Object b(@NotNull @ra0.a GeoLocation geoLocation, @NotNull x70.c<? super q<ReverseLookupResponse>> cVar);

    @ra0.o("api/location/v2/search")
    @Nullable
    Object c(@NotNull @ra0.a LocationRequest locationRequest, @NotNull x70.c<? super q<SearchLocationResponse>> cVar);
}
