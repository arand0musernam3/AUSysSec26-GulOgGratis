package com.app.tgtg.model.remote.mapService.response;

import com.app.tgtg.model.remote.item.response.BasicItem;
import com.app.tgtg.model.remote.mapService.ItemDetailLevel;
import com.app.tgtg.model.remote.mapService.ItemDetailLevelSerializer;
import hp.f0;
import i90.g;
import i90.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.c1;
import m90.d;
import m90.m1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.j;
import u70.l;
import u70.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0018\b\u0087\b\u0018\u0000 E2\u00020\u0001:\u0002FEB[\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0002¢\u0006\u0004\b\u000f\u0010\u0010Bo\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0017J\u0018\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0017J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0017Jl\u0010\u001f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00022\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)J'\u00102\u001a\u00020/2\u0006\u0010*\u001a\u00020\u00002\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-H\u0001¢\u0006\u0004\b0\u00101R&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u00103\u0012\u0004\b5\u00106\u001a\u0004\b4\u0010\u0017R \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00107\u0012\u0004\b9\u00106\u001a\u0004\b8\u0010\u0019R(\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00103\u0012\u0004\b;\u00106\u001a\u0004\b:\u0010\u0017R0\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\n\u00103\u0012\u0004\b?\u00106\u001a\u0004\b<\u0010\u0017\"\u0004\b=\u0010>R\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010@\u0012\u0004\bB\u00106\u001a\u0004\bA\u0010\u001dR(\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u00103\u0012\u0004\bD\u00106\u001a\u0004\bC\u0010\u0017¨\u0006G"}, d2 = {"Lcom/app/tgtg/model/remote/mapService/response/MapClustersResponse;", "", "", "Lcom/app/tgtg/model/remote/mapService/response/Clusters;", "clusters", "Lcom/app/tgtg/model/remote/mapService/ItemDetailLevel;", "itemDetailLevel", "Lcom/app/tgtg/model/remote/mapService/response/LocationDetailItem;", "locationDetailItems", "Lcom/app/tgtg/model/remote/item/response/BasicItem;", "fullDetailItems", "Lcom/app/tgtg/model/remote/mapService/response/MapFilters;", "filters", "Lcom/app/tgtg/model/remote/mapService/response/SortingOption;", "sorting", "<init>", "(Ljava/util/List;Lcom/app/tgtg/model/remote/mapService/ItemDetailLevel;Ljava/util/List;Ljava/util/List;Lcom/app/tgtg/model/remote/mapService/response/MapFilters;Ljava/util/List;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/util/List;Lcom/app/tgtg/model/remote/mapService/ItemDetailLevel;Ljava/util/List;Ljava/util/List;Lcom/app/tgtg/model/remote/mapService/response/MapFilters;Ljava/util/List;Lm90/m1;)V", "component1", "()Ljava/util/List;", "component2", "()Lcom/app/tgtg/model/remote/mapService/ItemDetailLevel;", "component3", "component4", "component5", "()Lcom/app/tgtg/model/remote/mapService/response/MapFilters;", "component6", "copy", "(Ljava/util/List;Lcom/app/tgtg/model/remote/mapService/ItemDetailLevel;Ljava/util/List;Ljava/util/List;Lcom/app/tgtg/model/remote/mapService/response/MapFilters;Ljava/util/List;)Lcom/app/tgtg/model/remote/mapService/response/MapClustersResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/mapService/response/MapClustersResponse;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/util/List;", "getClusters", "getClusters$annotations", "()V", "Lcom/app/tgtg/model/remote/mapService/ItemDetailLevel;", "getItemDetailLevel", "getItemDetailLevel$annotations", "getLocationDetailItems", "getLocationDetailItems$annotations", "getFullDetailItems", "setFullDetailItems", "(Ljava/util/List;)V", "getFullDetailItems$annotations", "Lcom/app/tgtg/model/remote/mapService/response/MapFilters;", "getFilters", "getFilters$annotations", "getSorting", "getSorting$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class MapClustersResponse {

    @NotNull
    private static final j[] $childSerializers;

    @NotNull
    private final List<Clusters> clusters;

    @Nullable
    private final MapFilters filters;

    @Nullable
    private List<? extends BasicItem> fullDetailItems;

    @NotNull
    private final ItemDetailLevel itemDetailLevel;

    @Nullable
    private final List<LocationDetailItem> locationDetailItems;

    @Nullable
    private final List<SortingOption> sorting;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    static {
        m mVar = m.PUBLICATION;
        $childSerializers = new j[]{l.a(mVar, new f0(10)), null, l.a(mVar, new f0(11)), l.a(mVar, new f0(12)), null, l.a(mVar, new f0(13))};
    }

    public /* synthetic */ MapClustersResponse(int i11, List list, ItemDetailLevel itemDetailLevel, List list2, List list3, MapFilters mapFilters, List list4, m1 m1Var) {
        if (15 != (i11 & 15)) {
            c1.j(i11, 15, MapClustersResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.clusters = list;
        this.itemDetailLevel = itemDetailLevel;
        this.locationDetailItems = list2;
        this.fullDetailItems = list3;
        if ((i11 & 16) == 0) {
            this.filters = null;
        } else {
            this.filters = mapFilters;
        }
        if ((i11 & 32) == 0) {
            this.sorting = null;
        } else {
            this.sorting = list4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new d(Clusters$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new d(LocationDetailItem$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return new d(BasicItem.INSTANCE.serializer(), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$2() {
        return new d(SortingOption$$serializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MapClustersResponse copy$default(MapClustersResponse mapClustersResponse, List list, ItemDetailLevel itemDetailLevel, List list2, List list3, MapFilters mapFilters, List list4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = mapClustersResponse.clusters;
        }
        if ((i11 & 2) != 0) {
            itemDetailLevel = mapClustersResponse.itemDetailLevel;
        }
        if ((i11 & 4) != 0) {
            list2 = mapClustersResponse.locationDetailItems;
        }
        if ((i11 & 8) != 0) {
            list3 = mapClustersResponse.fullDetailItems;
        }
        if ((i11 & 16) != 0) {
            mapFilters = mapClustersResponse.filters;
        }
        if ((i11 & 32) != 0) {
            list4 = mapClustersResponse.sorting;
        }
        MapFilters mapFilters2 = mapFilters;
        List list5 = list4;
        return mapClustersResponse.copy(list, itemDetailLevel, list2, list3, mapFilters2, list5);
    }

    public static final /* synthetic */ void write$Self$app(MapClustersResponse self, b output, SerialDescriptor serialDesc) {
        j[] jVarArr = $childSerializers;
        output.i(serialDesc, 0, (KSerializer) jVarArr[0].getValue(), self.clusters);
        output.i(serialDesc, 1, ItemDetailLevelSerializer.INSTANCE, self.itemDetailLevel);
        output.r(serialDesc, 2, (KSerializer) jVarArr[2].getValue(), self.locationDetailItems);
        output.r(serialDesc, 3, (KSerializer) jVarArr[3].getValue(), self.fullDetailItems);
        if (output.C(serialDesc) || self.filters != null) {
            output.r(serialDesc, 4, MapFilters$$serializer.INSTANCE, self.filters);
        }
        if (!output.C(serialDesc) && self.sorting == null) {
            return;
        }
        output.r(serialDesc, 5, (KSerializer) jVarArr[5].getValue(), self.sorting);
    }

    @NotNull
    public final List<Clusters> component1() {
        return this.clusters;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ItemDetailLevel getItemDetailLevel() {
        return this.itemDetailLevel;
    }

    @Nullable
    public final List<LocationDetailItem> component3() {
        return this.locationDetailItems;
    }

    @Nullable
    public final List<BasicItem> component4() {
        return this.fullDetailItems;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final MapFilters getFilters() {
        return this.filters;
    }

    @Nullable
    public final List<SortingOption> component6() {
        return this.sorting;
    }

    @NotNull
    public final MapClustersResponse copy(@NotNull List<Clusters> clusters, @NotNull ItemDetailLevel itemDetailLevel, @Nullable List<LocationDetailItem> locationDetailItems, @Nullable List<? extends BasicItem> fullDetailItems, @Nullable MapFilters filters, @Nullable List<SortingOption> sorting) {
        clusters.getClass();
        itemDetailLevel.getClass();
        return new MapClustersResponse(clusters, itemDetailLevel, locationDetailItems, fullDetailItems, filters, sorting);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MapClustersResponse)) {
            return false;
        }
        MapClustersResponse mapClustersResponse = (MapClustersResponse) other;
        return Intrinsics.areEqual(this.clusters, mapClustersResponse.clusters) && this.itemDetailLevel == mapClustersResponse.itemDetailLevel && Intrinsics.areEqual(this.locationDetailItems, mapClustersResponse.locationDetailItems) && Intrinsics.areEqual(this.fullDetailItems, mapClustersResponse.fullDetailItems) && Intrinsics.areEqual(this.filters, mapClustersResponse.filters) && Intrinsics.areEqual(this.sorting, mapClustersResponse.sorting);
    }

    @NotNull
    public final List<Clusters> getClusters() {
        return this.clusters;
    }

    @Nullable
    public final MapFilters getFilters() {
        return this.filters;
    }

    @Nullable
    public final List<BasicItem> getFullDetailItems() {
        return this.fullDetailItems;
    }

    @NotNull
    public final ItemDetailLevel getItemDetailLevel() {
        return this.itemDetailLevel;
    }

    @Nullable
    public final List<LocationDetailItem> getLocationDetailItems() {
        return this.locationDetailItems;
    }

    @Nullable
    public final List<SortingOption> getSorting() {
        return this.sorting;
    }

    public int hashCode() {
        int iHashCode = (this.itemDetailLevel.hashCode() + (this.clusters.hashCode() * 31)) * 31;
        List<LocationDetailItem> list = this.locationDetailItems;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<? extends BasicItem> list2 = this.fullDetailItems;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        MapFilters mapFilters = this.filters;
        int iHashCode4 = (iHashCode3 + (mapFilters == null ? 0 : mapFilters.hashCode())) * 31;
        List<SortingOption> list3 = this.sorting;
        return iHashCode4 + (list3 != null ? list3.hashCode() : 0);
    }

    public final void setFullDetailItems(@Nullable List<? extends BasicItem> list) {
        this.fullDetailItems = list;
    }

    @NotNull
    public String toString() {
        return "MapClustersResponse(clusters=" + this.clusters + ", itemDetailLevel=" + this.itemDetailLevel + ", locationDetailItems=" + this.locationDetailItems + ", fullDetailItems=" + this.fullDetailItems + ", filters=" + this.filters + ", sorting=" + this.sorting + ")";
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/mapService/response/MapClustersResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/mapService/response/MapClustersResponse;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return MapClustersResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @g("clusters")
    public static /* synthetic */ void getClusters$annotations() {
    }

    @g("filters")
    public static /* synthetic */ void getFilters$annotations() {
    }

    @g("full_detail_items")
    public static /* synthetic */ void getFullDetailItems$annotations() {
    }

    @g("item_detail_level")
    public static /* synthetic */ void getItemDetailLevel$annotations() {
    }

    @g("location_detail_items")
    public static /* synthetic */ void getLocationDetailItems$annotations() {
    }

    @g("sorting")
    public static /* synthetic */ void getSorting$annotations() {
    }

    public MapClustersResponse(@NotNull List<Clusters> list, @NotNull ItemDetailLevel itemDetailLevel, @Nullable List<LocationDetailItem> list2, @Nullable List<? extends BasicItem> list3, @Nullable MapFilters mapFilters, @Nullable List<SortingOption> list4) {
        list.getClass();
        itemDetailLevel.getClass();
        this.clusters = list;
        this.itemDetailLevel = itemDetailLevel;
        this.locationDetailItems = list2;
        this.fullDetailItems = list3;
        this.filters = mapFilters;
        this.sorting = list4;
    }

    public /* synthetic */ MapClustersResponse(List list, ItemDetailLevel itemDetailLevel, List list2, List list3, MapFilters mapFilters, List list4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, itemDetailLevel, list2, list3, (i11 & 16) != 0 ? null : mapFilters, (i11 & 32) != 0 ? null : list4);
    }
}
