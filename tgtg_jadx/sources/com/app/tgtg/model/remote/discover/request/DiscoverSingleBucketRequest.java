package com.app.tgtg.model.remote.discover.request;

import com.app.tgtg.model.remote.item.LatLngInfo;
import com.app.tgtg.model.remote.item.LatLngInfo$$serializer;
import com.braze.models.BrazeGeofence;
import i90.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import m90.d;
import m90.g;
import m90.m1;
import m90.r1;
import m90.v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.j;
import u70.l;
import u70.m;
import zendesk.ui.android.conversation.composer.b;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0019\b\u0087\b\u0018\u0000 G2\u00020\u0001:\u0002HGBU\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010B]\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010 \u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b \u0010!J^\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010)\u001a\u00020\n2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*J'\u00103\u001a\u0002002\u0006\u0010+\u001a\u00020\u00002\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.H\u0001¢\u0006\u0004\b1\u00102R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00104\u0012\u0004\b6\u00107\u001a\u0004\b5\u0010\u0017R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00108\u0012\u0004\b:\u00107\u001a\u0004\b9\u0010\u0019R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010;\u0012\u0004\b=\u00107\u001a\u0004\b<\u0010\u001bR\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010>\u0012\u0004\b@\u00107\u001a\u0004\b?\u0010\u001dR\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010A\u0012\u0004\bC\u00107\u001a\u0004\bB\u0010\u001fR(\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010D\u0012\u0004\bF\u00107\u001a\u0004\bE\u0010!¨\u0006I"}, d2 = {"Lcom/app/tgtg/model/remote/discover/request/DiscoverSingleBucketRequest;", "", "Lcom/app/tgtg/model/remote/item/LatLngInfo;", "origin", "", BrazeGeofence.RADIUS_METERS, "Lcom/app/tgtg/model/remote/discover/request/SingleBucketPaging;", "paging", "Lcom/app/tgtg/model/remote/discover/request/BucketFillerType;", "bucketType", "", "showAllItems", "", "", "quickFilters", "<init>", "(Lcom/app/tgtg/model/remote/item/LatLngInfo;Ljava/lang/Double;Lcom/app/tgtg/model/remote/discover/request/SingleBucketPaging;Lcom/app/tgtg/model/remote/discover/request/BucketFillerType;Ljava/lang/Boolean;Ljava/util/List;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILcom/app/tgtg/model/remote/item/LatLngInfo;Ljava/lang/Double;Lcom/app/tgtg/model/remote/discover/request/SingleBucketPaging;Lcom/app/tgtg/model/remote/discover/request/BucketFillerType;Ljava/lang/Boolean;Ljava/util/List;Lm90/m1;)V", "component1", "()Lcom/app/tgtg/model/remote/item/LatLngInfo;", "component2", "()Ljava/lang/Double;", "component3", "()Lcom/app/tgtg/model/remote/discover/request/SingleBucketPaging;", "component4", "()Lcom/app/tgtg/model/remote/discover/request/BucketFillerType;", "component5", "()Ljava/lang/Boolean;", "component6", "()Ljava/util/List;", "copy", "(Lcom/app/tgtg/model/remote/item/LatLngInfo;Ljava/lang/Double;Lcom/app/tgtg/model/remote/discover/request/SingleBucketPaging;Lcom/app/tgtg/model/remote/discover/request/BucketFillerType;Ljava/lang/Boolean;Ljava/util/List;)Lcom/app/tgtg/model/remote/discover/request/DiscoverSingleBucketRequest;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/discover/request/DiscoverSingleBucketRequest;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lcom/app/tgtg/model/remote/item/LatLngInfo;", "getOrigin", "getOrigin$annotations", "()V", "Ljava/lang/Double;", "getRadius", "getRadius$annotations", "Lcom/app/tgtg/model/remote/discover/request/SingleBucketPaging;", "getPaging", "getPaging$annotations", "Lcom/app/tgtg/model/remote/discover/request/BucketFillerType;", "getBucketType", "getBucketType$annotations", "Ljava/lang/Boolean;", "getShowAllItems", "getShowAllItems$annotations", "Ljava/util/List;", "getQuickFilters", "getQuickFilters$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class DiscoverSingleBucketRequest {

    @Nullable
    private final BucketFillerType bucketType;

    @Nullable
    private final LatLngInfo origin;

    @Nullable
    private final SingleBucketPaging paging;

    @Nullable
    private final List<String> quickFilters;

    @Nullable
    private final Double radius;

    @Nullable
    private final Boolean showAllItems;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private static final j[] $childSerializers = {null, null, null, null, null, l.a(m.PUBLICATION, new b(20))};

    public /* synthetic */ DiscoverSingleBucketRequest(int i11, LatLngInfo latLngInfo, Double d3, SingleBucketPaging singleBucketPaging, BucketFillerType bucketFillerType, Boolean bool, List list, m1 m1Var) {
        if ((i11 & 1) == 0) {
            this.origin = null;
        } else {
            this.origin = latLngInfo;
        }
        if ((i11 & 2) == 0) {
            this.radius = null;
        } else {
            this.radius = d3;
        }
        if ((i11 & 4) == 0) {
            this.paging = null;
        } else {
            this.paging = singleBucketPaging;
        }
        if ((i11 & 8) == 0) {
            this.bucketType = null;
        } else {
            this.bucketType = bucketFillerType;
        }
        if ((i11 & 16) == 0) {
            this.showAllItems = null;
        } else {
            this.showAllItems = bool;
        }
        if ((i11 & 32) == 0) {
            this.quickFilters = null;
        } else {
            this.quickFilters = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new d(r1.f29848a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DiscoverSingleBucketRequest copy$default(DiscoverSingleBucketRequest discoverSingleBucketRequest, LatLngInfo latLngInfo, Double d3, SingleBucketPaging singleBucketPaging, BucketFillerType bucketFillerType, Boolean bool, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            latLngInfo = discoverSingleBucketRequest.origin;
        }
        if ((i11 & 2) != 0) {
            d3 = discoverSingleBucketRequest.radius;
        }
        if ((i11 & 4) != 0) {
            singleBucketPaging = discoverSingleBucketRequest.paging;
        }
        if ((i11 & 8) != 0) {
            bucketFillerType = discoverSingleBucketRequest.bucketType;
        }
        if ((i11 & 16) != 0) {
            bool = discoverSingleBucketRequest.showAllItems;
        }
        if ((i11 & 32) != 0) {
            list = discoverSingleBucketRequest.quickFilters;
        }
        Boolean bool2 = bool;
        List list2 = list;
        return discoverSingleBucketRequest.copy(latLngInfo, d3, singleBucketPaging, bucketFillerType, bool2, list2);
    }

    public static final /* synthetic */ void write$Self$app(DiscoverSingleBucketRequest self, l90.b output, SerialDescriptor serialDesc) {
        j[] jVarArr = $childSerializers;
        if (output.C(serialDesc) || self.origin != null) {
            output.r(serialDesc, 0, LatLngInfo$$serializer.INSTANCE, self.origin);
        }
        if (output.C(serialDesc) || self.radius != null) {
            output.r(serialDesc, 1, v.f29868a, self.radius);
        }
        if (output.C(serialDesc) || self.paging != null) {
            output.r(serialDesc, 2, SingleBucketPaging$$serializer.INSTANCE, self.paging);
        }
        if (output.C(serialDesc) || self.bucketType != null) {
            output.r(serialDesc, 3, BucketFillerType$$serializer.INSTANCE, self.bucketType);
        }
        if (output.C(serialDesc) || self.showAllItems != null) {
            output.r(serialDesc, 4, g.f29797a, self.showAllItems);
        }
        if (!output.C(serialDesc) && self.quickFilters == null) {
            return;
        }
        output.r(serialDesc, 5, (KSerializer) jVarArr[5].getValue(), self.quickFilters);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final LatLngInfo getOrigin() {
        return this.origin;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Double getRadius() {
        return this.radius;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final SingleBucketPaging getPaging() {
        return this.paging;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BucketFillerType getBucketType() {
        return this.bucketType;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getShowAllItems() {
        return this.showAllItems;
    }

    @Nullable
    public final List<String> component6() {
        return this.quickFilters;
    }

    @NotNull
    public final DiscoverSingleBucketRequest copy(@Nullable LatLngInfo origin, @Nullable Double radius, @Nullable SingleBucketPaging paging, @Nullable BucketFillerType bucketType, @Nullable Boolean showAllItems, @Nullable List<String> quickFilters) {
        return new DiscoverSingleBucketRequest(origin, radius, paging, bucketType, showAllItems, quickFilters);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DiscoverSingleBucketRequest)) {
            return false;
        }
        DiscoverSingleBucketRequest discoverSingleBucketRequest = (DiscoverSingleBucketRequest) other;
        return Intrinsics.areEqual(this.origin, discoverSingleBucketRequest.origin) && Intrinsics.areEqual((Object) this.radius, (Object) discoverSingleBucketRequest.radius) && Intrinsics.areEqual(this.paging, discoverSingleBucketRequest.paging) && Intrinsics.areEqual(this.bucketType, discoverSingleBucketRequest.bucketType) && Intrinsics.areEqual(this.showAllItems, discoverSingleBucketRequest.showAllItems) && Intrinsics.areEqual(this.quickFilters, discoverSingleBucketRequest.quickFilters);
    }

    @Nullable
    public final BucketFillerType getBucketType() {
        return this.bucketType;
    }

    @Nullable
    public final LatLngInfo getOrigin() {
        return this.origin;
    }

    @Nullable
    public final SingleBucketPaging getPaging() {
        return this.paging;
    }

    @Nullable
    public final List<String> getQuickFilters() {
        return this.quickFilters;
    }

    @Nullable
    public final Double getRadius() {
        return this.radius;
    }

    @Nullable
    public final Boolean getShowAllItems() {
        return this.showAllItems;
    }

    public int hashCode() {
        LatLngInfo latLngInfo = this.origin;
        int iHashCode = (latLngInfo == null ? 0 : latLngInfo.hashCode()) * 31;
        Double d3 = this.radius;
        int iHashCode2 = (iHashCode + (d3 == null ? 0 : d3.hashCode())) * 31;
        SingleBucketPaging singleBucketPaging = this.paging;
        int iHashCode3 = (iHashCode2 + (singleBucketPaging == null ? 0 : singleBucketPaging.hashCode())) * 31;
        BucketFillerType bucketFillerType = this.bucketType;
        int iHashCode4 = (iHashCode3 + (bucketFillerType == null ? 0 : bucketFillerType.hashCode())) * 31;
        Boolean bool = this.showAllItems;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<String> list = this.quickFilters;
        return iHashCode5 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "DiscoverSingleBucketRequest(origin=" + this.origin + ", radius=" + this.radius + ", paging=" + this.paging + ", bucketType=" + this.bucketType + ", showAllItems=" + this.showAllItems + ", quickFilters=" + this.quickFilters + ")";
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/discover/request/DiscoverSingleBucketRequest$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/discover/request/DiscoverSingleBucketRequest;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return DiscoverSingleBucketRequest$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @i90.g("bucket")
    public static /* synthetic */ void getBucketType$annotations() {
    }

    @i90.g("origin")
    public static /* synthetic */ void getOrigin$annotations() {
    }

    @i90.g("paging")
    public static /* synthetic */ void getPaging$annotations() {
    }

    @i90.g("filters")
    public static /* synthetic */ void getQuickFilters$annotations() {
    }

    @i90.g(BrazeGeofence.RADIUS_METERS)
    public static /* synthetic */ void getRadius$annotations() {
    }

    @i90.g("show_all_items")
    public static /* synthetic */ void getShowAllItems$annotations() {
    }

    public DiscoverSingleBucketRequest() {
        this((LatLngInfo) null, (Double) null, (SingleBucketPaging) null, (BucketFillerType) null, (Boolean) null, (List) null, 63, (DefaultConstructorMarker) null);
    }

    public DiscoverSingleBucketRequest(@Nullable LatLngInfo latLngInfo, @Nullable Double d3, @Nullable SingleBucketPaging singleBucketPaging, @Nullable BucketFillerType bucketFillerType, @Nullable Boolean bool, @Nullable List<String> list) {
        this.origin = latLngInfo;
        this.radius = d3;
        this.paging = singleBucketPaging;
        this.bucketType = bucketFillerType;
        this.showAllItems = bool;
        this.quickFilters = list;
    }

    public /* synthetic */ DiscoverSingleBucketRequest(LatLngInfo latLngInfo, Double d3, SingleBucketPaging singleBucketPaging, BucketFillerType bucketFillerType, Boolean bool, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : latLngInfo, (i11 & 2) != 0 ? null : d3, (i11 & 4) != 0 ? null : singleBucketPaging, (i11 & 8) != 0 ? null : bucketFillerType, (i11 & 16) != 0 ? null : bool, (i11 & 32) != 0 ? null : list);
    }
}
