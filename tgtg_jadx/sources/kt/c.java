package kt;

import com.app.tgtg.model.remote.discover.request.DiscoverAllBucketsRequest;
import com.app.tgtg.model.remote.discover.request.DiscoverSingleBucketRequest;
import com.app.tgtg.model.remote.discover.response.DiscoverAllBucketsResponse;
import com.app.tgtg.model.remote.discover.response.DiscoverSingleBucketResponse;
import com.app.tgtg.model.remote.mapService.request.MapClustersRequest;
import com.app.tgtg.model.remote.mapService.response.MapClustersResponse;
import com.app.tgtg.model.remote.widgets.response.FavouriteWidgetResponse;
import com.braze.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.q;
import zendesk.faye.internal.Bayeux;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J8\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0004H§@¢\u0006\u0004\b\t\u0010\nJ8\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u000b2\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0004H§@¢\u0006\u0004\b\r\u0010\u000eJ8\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00072\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0004H§@¢\u0006\u0004\b\u0012\u0010\u0013J8\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00072\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0004H§@¢\u0006\u0004\b\u0014\u0010\u0013J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0007H§@¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018À\u0006\u0003"}, d2 = {"Lkt/c;", "", "Lcom/app/tgtg/model/remote/discover/request/DiscoverAllBucketsRequest;", Bayeux.KEY_DATA, "", "timezoneOffset", "timeFormat", "Lu70/q;", "Lcom/app/tgtg/model/remote/discover/response/DiscoverAllBucketsResponse;", Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE, "(Lcom/app/tgtg/model/remote/discover/request/DiscoverAllBucketsRequest;Ljava/lang/String;Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "Lcom/app/tgtg/model/remote/discover/request/DiscoverSingleBucketRequest;", "Lcom/app/tgtg/model/remote/discover/response/DiscoverSingleBucketResponse;", "e", "(Lcom/app/tgtg/model/remote/discover/request/DiscoverSingleBucketRequest;Ljava/lang/String;Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "Lcom/app/tgtg/model/remote/mapService/request/MapClustersRequest;", "mapClustersRequest", "Lcom/app/tgtg/model/remote/mapService/response/MapClustersResponse;", Constants.BRAZE_PUSH_CONTENT_KEY, "(Lcom/app/tgtg/model/remote/mapService/request/MapClustersRequest;Ljava/lang/String;Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "b", "Lcom/app/tgtg/model/remote/widgets/response/FavouriteWidgetResponse;", "c", "(Lx70/c;)Ljava/lang/Object;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface c {
    @ra0.o("api/itemmap/v1/clusters")
    @Nullable
    Object a(@NotNull @ra0.a MapClustersRequest mapClustersRequest, @Nullable @ra0.i("X-TimezoneOffset") String str, @Nullable @ra0.i("X-24HourFormat") String str2, @NotNull x70.c<? super q<MapClustersResponse>> cVar);

    @ra0.o("api/itemmap/v2/clusters")
    @Nullable
    Object b(@NotNull @ra0.a MapClustersRequest mapClustersRequest, @Nullable @ra0.i("X-TimezoneOffset") String str, @Nullable @ra0.i("X-24HourFormat") String str2, @NotNull x70.c<? super q<MapClustersResponse>> cVar);

    @ra0.o("api/widget/v1/getfavorites")
    @Nullable
    Object c(@NotNull x70.c<? super q<FavouriteWidgetResponse>> cVar);

    @ra0.o("api/discover/v1/")
    @Nullable
    Object d(@NotNull @ra0.a DiscoverAllBucketsRequest discoverAllBucketsRequest, @Nullable @ra0.i("X-TimezoneOffset") String str, @Nullable @ra0.i("X-24HourFormat") String str2, @NotNull x70.c<? super q<DiscoverAllBucketsResponse>> cVar);

    @ra0.o("api/discover/v1/bucket")
    @Nullable
    Object e(@NotNull @ra0.a DiscoverSingleBucketRequest discoverSingleBucketRequest, @Nullable @ra0.i("X-TimezoneOffset") String str, @Nullable @ra0.i("X-24HourFormat") String str2, @NotNull x70.c<? super q<DiscoverSingleBucketResponse>> cVar);
}
