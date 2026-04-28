package com.app.tgtg.model.remote.favorites.request;

import com.app.tgtg.model.remote.item.LatLngInfo;
import com.app.tgtg.model.remote.item.LatLngInfo$$serializer;
import i90.g;
import i90.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.m1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J(\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u0017R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010)\u0012\u0004\b+\u0010(\u001a\u0004\b*\u0010\u0019¨\u0006."}, d2 = {"Lcom/app/tgtg/model/remote/favorites/request/FavoritesRequest;", "", "Lcom/app/tgtg/model/remote/item/LatLngInfo;", "origin", "Lcom/app/tgtg/model/remote/favorites/request/FavoritesPaging;", "paging", "<init>", "(Lcom/app/tgtg/model/remote/item/LatLngInfo;Lcom/app/tgtg/model/remote/favorites/request/FavoritesPaging;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILcom/app/tgtg/model/remote/item/LatLngInfo;Lcom/app/tgtg/model/remote/favorites/request/FavoritesPaging;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/favorites/request/FavoritesRequest;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/app/tgtg/model/remote/item/LatLngInfo;", "component2", "()Lcom/app/tgtg/model/remote/favorites/request/FavoritesPaging;", "copy", "(Lcom/app/tgtg/model/remote/item/LatLngInfo;Lcom/app/tgtg/model/remote/favorites/request/FavoritesPaging;)Lcom/app/tgtg/model/remote/favorites/request/FavoritesRequest;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/app/tgtg/model/remote/item/LatLngInfo;", "getOrigin", "getOrigin$annotations", "()V", "Lcom/app/tgtg/model/remote/favorites/request/FavoritesPaging;", "getPaging", "getPaging$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class FavoritesRequest {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final LatLngInfo origin;

    @Nullable
    private final FavoritesPaging paging;

    public /* synthetic */ FavoritesRequest(int i11, LatLngInfo latLngInfo, FavoritesPaging favoritesPaging, m1 m1Var) {
        if ((i11 & 1) == 0) {
            this.origin = null;
        } else {
            this.origin = latLngInfo;
        }
        if ((i11 & 2) == 0) {
            this.paging = null;
        } else {
            this.paging = favoritesPaging;
        }
    }

    public static /* synthetic */ FavoritesRequest copy$default(FavoritesRequest favoritesRequest, LatLngInfo latLngInfo, FavoritesPaging favoritesPaging, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            latLngInfo = favoritesRequest.origin;
        }
        if ((i11 & 2) != 0) {
            favoritesPaging = favoritesRequest.paging;
        }
        return favoritesRequest.copy(latLngInfo, favoritesPaging);
    }

    public static final /* synthetic */ void write$Self$app(FavoritesRequest self, b output, SerialDescriptor serialDesc) {
        if (output.C(serialDesc) || self.origin != null) {
            output.r(serialDesc, 0, LatLngInfo$$serializer.INSTANCE, self.origin);
        }
        if (!output.C(serialDesc) && self.paging == null) {
            return;
        }
        output.r(serialDesc, 1, FavoritesPaging$$serializer.INSTANCE, self.paging);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final LatLngInfo getOrigin() {
        return this.origin;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final FavoritesPaging getPaging() {
        return this.paging;
    }

    @NotNull
    public final FavoritesRequest copy(@Nullable LatLngInfo origin, @Nullable FavoritesPaging paging) {
        return new FavoritesRequest(origin, paging);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FavoritesRequest)) {
            return false;
        }
        FavoritesRequest favoritesRequest = (FavoritesRequest) other;
        return Intrinsics.areEqual(this.origin, favoritesRequest.origin) && Intrinsics.areEqual(this.paging, favoritesRequest.paging);
    }

    @Nullable
    public final LatLngInfo getOrigin() {
        return this.origin;
    }

    @Nullable
    public final FavoritesPaging getPaging() {
        return this.paging;
    }

    public int hashCode() {
        LatLngInfo latLngInfo = this.origin;
        int iHashCode = (latLngInfo == null ? 0 : latLngInfo.hashCode()) * 31;
        FavoritesPaging favoritesPaging = this.paging;
        return iHashCode + (favoritesPaging != null ? favoritesPaging.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "FavoritesRequest(origin=" + this.origin + ", paging=" + this.paging + ")";
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/favorites/request/FavoritesRequest$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/favorites/request/FavoritesRequest;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return FavoritesRequest$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @g("origin")
    public static /* synthetic */ void getOrigin$annotations() {
    }

    @g("paging")
    public static /* synthetic */ void getPaging$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FavoritesRequest() {
        this((LatLngInfo) null, (FavoritesPaging) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public FavoritesRequest(@Nullable LatLngInfo latLngInfo, @Nullable FavoritesPaging favoritesPaging) {
        this.origin = latLngInfo;
        this.paging = favoritesPaging;
    }

    public /* synthetic */ FavoritesRequest(LatLngInfo latLngInfo, FavoritesPaging favoritesPaging, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : latLngInfo, (i11 & 2) != 0 ? null : favoritesPaging);
    }
}
