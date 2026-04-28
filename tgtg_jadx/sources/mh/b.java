package mh;

import com.app.tgtg.model.remote.discover.request.DiscoverSingleBucketRequest;
import com.app.tgtg.model.remote.discover.response.DiscoverSingleBucketResponse;
import com.app.tgtg.model.remote.item.requests.SetFavoriteRequest;
import com.braze.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q90.r0;
import ra0.i;
import ra0.o;
import ra0.s;
import x70.c;
import zendesk.faye.internal.Bayeux;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J2\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0004H§@¢\u0006\u0004\b\b\u0010\tJ$\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\u0003\u001a\u00020\fH§@¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lmh/b;", "", "Lcom/app/tgtg/model/remote/discover/request/DiscoverSingleBucketRequest;", Bayeux.KEY_DATA, "", "timezoneOffset", "timeFormat", "Lcom/app/tgtg/model/remote/discover/response/DiscoverSingleBucketResponse;", "b", "(Lcom/app/tgtg/model/remote/discover/request/DiscoverSingleBucketRequest;Ljava/lang/String;Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "Lcom/app/tgtg/model/remote/ItemId;", "itemId", "Lcom/app/tgtg/model/remote/item/requests/SetFavoriteRequest;", "Lq90/r0;", Constants.BRAZE_PUSH_CONTENT_KEY, "(Ljava/lang/String;Lcom/app/tgtg/model/remote/item/requests/SetFavoriteRequest;Lx70/c;)Ljava/lang/Object;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface b {
    @o("api/user/favorite/v1/{itemId}/update")
    @Nullable
    Object a(@s(encoded = true, value = "itemId") @NotNull String str, @NotNull @ra0.a SetFavoriteRequest setFavoriteRequest, @NotNull c<? super r0> cVar);

    @o("api/discover/v1/bucket")
    @Nullable
    Object b(@NotNull @ra0.a DiscoverSingleBucketRequest discoverSingleBucketRequest, @Nullable @i("X-TimezoneOffset") String str, @Nullable @i("X-24HourFormat") String str2, @NotNull c<? super DiscoverSingleBucketResponse> cVar);
}
