package com.app.tgtg.model.remote.mapService.request;

import com.app.tgtg.model.remote.item.LatLngInfo;
import com.app.tgtg.model.remote.item.LatLngInfo$$serializer;
import com.app.tgtg.model.remote.mapService.ItemDetailLevel;
import com.app.tgtg.model.remote.mapService.ItemDetailLevelSerializer;
import com.app.tgtg.model.remote.mapService.MapBoundingBox;
import com.app.tgtg.model.remote.mapService.MapBoundingBox$$serializer;
import i90.g;
import i90.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.c1;
import m90.m1;
import m90.r1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001b\b\u0007\u0018\u0000 12\u00020\u0001:\u000221B;\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rBM\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001c\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001eR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010!\u0012\u0004\b$\u0010 \u001a\u0004\b\"\u0010#R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010%\u0012\u0004\b(\u0010 \u001a\u0004\b&\u0010'R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010)\u0012\u0004\b,\u0010 \u001a\u0004\b*\u0010+R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010-\u0012\u0004\b0\u0010 \u001a\u0004\b.\u0010/¨\u00063"}, d2 = {"Lcom/app/tgtg/model/remote/mapService/request/MapClustersRequest;", "", "Lcom/app/tgtg/model/remote/item/LatLngInfo;", "origin", "Lcom/app/tgtg/model/remote/mapService/MapBoundingBox;", "boundingBox", "Lcom/app/tgtg/model/remote/mapService/ItemDetailLevel;", "itemDetailLevel", "Lcom/app/tgtg/model/remote/mapService/request/FilteredBy;", "filteredBy", "", "sortOption", "<init>", "(Lcom/app/tgtg/model/remote/item/LatLngInfo;Lcom/app/tgtg/model/remote/mapService/MapBoundingBox;Lcom/app/tgtg/model/remote/mapService/ItemDetailLevel;Lcom/app/tgtg/model/remote/mapService/request/FilteredBy;Ljava/lang/String;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILcom/app/tgtg/model/remote/item/LatLngInfo;Lcom/app/tgtg/model/remote/mapService/MapBoundingBox;Lcom/app/tgtg/model/remote/mapService/ItemDetailLevel;Lcom/app/tgtg/model/remote/mapService/request/FilteredBy;Ljava/lang/String;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/mapService/request/MapClustersRequest;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lcom/app/tgtg/model/remote/item/LatLngInfo;", "getOrigin", "()Lcom/app/tgtg/model/remote/item/LatLngInfo;", "getOrigin$annotations", "()V", "Lcom/app/tgtg/model/remote/mapService/MapBoundingBox;", "getBoundingBox", "()Lcom/app/tgtg/model/remote/mapService/MapBoundingBox;", "getBoundingBox$annotations", "Lcom/app/tgtg/model/remote/mapService/ItemDetailLevel;", "getItemDetailLevel", "()Lcom/app/tgtg/model/remote/mapService/ItemDetailLevel;", "getItemDetailLevel$annotations", "Lcom/app/tgtg/model/remote/mapService/request/FilteredBy;", "getFilteredBy", "()Lcom/app/tgtg/model/remote/mapService/request/FilteredBy;", "getFilteredBy$annotations", "Ljava/lang/String;", "getSortOption", "()Ljava/lang/String;", "getSortOption$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class MapClustersRequest {

    @NotNull
    private final MapBoundingBox boundingBox;

    @Nullable
    private final FilteredBy filteredBy;

    @NotNull
    private final ItemDetailLevel itemDetailLevel;

    @Nullable
    private final LatLngInfo origin;

    @Nullable
    private final String sortOption;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ MapClustersRequest(int i11, LatLngInfo latLngInfo, MapBoundingBox mapBoundingBox, ItemDetailLevel itemDetailLevel, FilteredBy filteredBy, String str, m1 m1Var) {
        if (6 != (i11 & 6)) {
            c1.j(i11, 6, MapClustersRequest$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i11 & 1) == 0) {
            this.origin = null;
        } else {
            this.origin = latLngInfo;
        }
        this.boundingBox = mapBoundingBox;
        this.itemDetailLevel = itemDetailLevel;
        if ((i11 & 8) == 0) {
            this.filteredBy = null;
        } else {
            this.filteredBy = filteredBy;
        }
        if ((i11 & 16) == 0) {
            this.sortOption = null;
        } else {
            this.sortOption = str;
        }
    }

    public static final /* synthetic */ void write$Self$app(MapClustersRequest self, b output, SerialDescriptor serialDesc) {
        if (output.C(serialDesc) || self.origin != null) {
            output.r(serialDesc, 0, LatLngInfo$$serializer.INSTANCE, self.origin);
        }
        output.i(serialDesc, 1, MapBoundingBox$$serializer.INSTANCE, self.boundingBox);
        output.i(serialDesc, 2, ItemDetailLevelSerializer.INSTANCE, self.itemDetailLevel);
        if (output.C(serialDesc) || self.filteredBy != null) {
            output.r(serialDesc, 3, FilteredBy$$serializer.INSTANCE, self.filteredBy);
        }
        if (!output.C(serialDesc) && self.sortOption == null) {
            return;
        }
        output.r(serialDesc, 4, r1.f29848a, self.sortOption);
    }

    @NotNull
    public final MapBoundingBox getBoundingBox() {
        return this.boundingBox;
    }

    @Nullable
    public final FilteredBy getFilteredBy() {
        return this.filteredBy;
    }

    @NotNull
    public final ItemDetailLevel getItemDetailLevel() {
        return this.itemDetailLevel;
    }

    @Nullable
    public final LatLngInfo getOrigin() {
        return this.origin;
    }

    @Nullable
    public final String getSortOption() {
        return this.sortOption;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/mapService/request/MapClustersRequest$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/mapService/request/MapClustersRequest;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return MapClustersRequest$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @g("bounding_box")
    public static /* synthetic */ void getBoundingBox$annotations() {
    }

    @g("filtered_by")
    public static /* synthetic */ void getFilteredBy$annotations() {
    }

    @g("item_detail_level")
    public static /* synthetic */ void getItemDetailLevel$annotations() {
    }

    @g("origin")
    public static /* synthetic */ void getOrigin$annotations() {
    }

    @g("sort_option")
    public static /* synthetic */ void getSortOption$annotations() {
    }

    public MapClustersRequest(@Nullable LatLngInfo latLngInfo, @NotNull MapBoundingBox mapBoundingBox, @NotNull ItemDetailLevel itemDetailLevel, @Nullable FilteredBy filteredBy, @Nullable String str) {
        mapBoundingBox.getClass();
        itemDetailLevel.getClass();
        this.origin = latLngInfo;
        this.boundingBox = mapBoundingBox;
        this.itemDetailLevel = itemDetailLevel;
        this.filteredBy = filteredBy;
        this.sortOption = str;
    }

    public /* synthetic */ MapClustersRequest(LatLngInfo latLngInfo, MapBoundingBox mapBoundingBox, ItemDetailLevel itemDetailLevel, FilteredBy filteredBy, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : latLngInfo, mapBoundingBox, itemDetailLevel, (i11 & 8) != 0 ? null : filteredBy, (i11 & 16) != 0 ? null : str);
    }
}
