package kt;

import com.app.tgtg.model.remote.favorites.request.FavoritesRequest;
import com.app.tgtg.model.remote.favorites.response.FavoriteStatusResponse;
import com.app.tgtg.model.remote.favorites.response.FavoritesResponse;
import com.app.tgtg.model.remote.item.requests.SetFavoriteRequest;
import com.braze.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q90.r0;
import ra0.s;
import u70.q;
import zendesk.faye.internal.Bayeux;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J.\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\u000b\u001a\u00020\n2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\r\u001a\u00020\n2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\r\u0010\fJ\"\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00062\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u000f\u0010\fJ,\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00062\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0011\u001a\u00020\u0010H§@¢\u0006\u0004\b\u0012\u0010\u0013J\"\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00062\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0015\u0010\fJ8\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u00162\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u0017H§@¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001dÀ\u0006\u0003"}, d2 = {"Lkt/d;", "", "Lcom/app/tgtg/model/remote/ItemId;", "itemId", "Lcom/app/tgtg/model/remote/item/requests/SetFavoriteRequest;", Bayeux.KEY_DATA, "Lu70/q;", "Lq90/r0;", "c", "(Ljava/lang/String;Lcom/app/tgtg/model/remote/item/requests/SetFavoriteRequest;Lx70/c;)Ljava/lang/Object;", "", "f", "(Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", Constants.BRAZE_PUSH_CONTENT_KEY, "Lvj/c;", "g", "Lvj/i;", "request", Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE, "(Ljava/lang/String;Lvj/i;Lx70/c;)Ljava/lang/Object;", "Lcom/app/tgtg/model/remote/favorites/response/FavoriteStatusResponse;", "e", "Lcom/app/tgtg/model/remote/favorites/request/FavoritesRequest;", "", "timezoneOffset", "timeFormat", "Lcom/app/tgtg/model/remote/favorites/response/FavoritesResponse;", "b", "(Lcom/app/tgtg/model/remote/favorites/request/FavoritesRequest;Ljava/lang/String;Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface d {
    @ra0.o("api/user/favorite/v1/{itemId}/createOneTimeNotification")
    @Nullable
    Object a(@s(encoded = true, value = "itemId") @Nullable String str, @NotNull x70.c<? super Unit> cVar);

    @ra0.o("api/item/v9/favorites")
    @Nullable
    Object b(@NotNull @ra0.a FavoritesRequest favoritesRequest, @Nullable @ra0.i("X-TimezoneOffset") String str, @Nullable @ra0.i("X-24HourFormat") String str2, @NotNull x70.c<? super q<FavoritesResponse>> cVar);

    @ra0.o("api/user/favorite/v1/{itemId}/update")
    @Nullable
    Object c(@s(encoded = true, value = "itemId") @Nullable String str, @NotNull @ra0.a SetFavoriteRequest setFavoriteRequest, @NotNull x70.c<? super q<? extends r0>> cVar);

    @ra0.o("api/user/favorite/v1/{itemId}/createScheduledNotification")
    @Nullable
    Object d(@s(encoded = true, value = "itemId") @Nullable String str, @NotNull @ra0.a vj.i iVar, @NotNull x70.c<? super q<vj.c>> cVar);

    @ra0.o("api/user/favorite/v1/{itemId}/status")
    @Nullable
    Object e(@s(encoded = true, value = "itemId") @Nullable String str, @NotNull x70.c<? super q<FavoriteStatusResponse>> cVar);

    @ra0.o("api/user/favorite/v1/{itemId}/unsubscribeNotification")
    @Nullable
    Object f(@s(encoded = true, value = "itemId") @Nullable String str, @NotNull x70.c<? super Unit> cVar);

    @ra0.o("api/user/favorite/v1/{itemId}/getNotificationSettings")
    @Nullable
    Object g(@s(encoded = true, value = "itemId") @Nullable String str, @NotNull x70.c<? super q<vj.c>> cVar);
}
