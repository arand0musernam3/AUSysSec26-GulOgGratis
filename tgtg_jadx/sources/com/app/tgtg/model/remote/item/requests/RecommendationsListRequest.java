package com.app.tgtg.model.remote.item.requests;

import com.adyen.checkout.components.core.Address;
import com.app.tgtg.model.PickupIntervalDateObject;
import com.app.tgtg.model.PickupIntervalDateObject$$serializer;
import com.app.tgtg.model.remote.ItemId;
import com.app.tgtg.model.remote.ItemId$$serializer;
import com.app.tgtg.model.remote.item.LatLngInfo;
import com.app.tgtg.model.remote.item.LatLngInfo$$serializer;
import com.braze.models.BrazeGeofence;
import db0.c;
import i90.g;
import i90.h;
import j4.s;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.c1;
import m90.d;
import m90.l0;
import m90.m1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.j;
import u70.l;
import u70.m;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001a\b\u0087\b\u0018\u0000 N2\u00020\u0001:\u0002ONB_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013By\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0012\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019Jx\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J\u0010\u0010 \u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0004HÂ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0006HÂ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b*\u0010\u0019J\u0010\u0010+\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b+\u0010\u0019J\u0012\u0010,\u001a\u0004\u0018\u00010\u0004HÂ\u0003¢\u0006\u0004\b,\u0010'J\u0018\u0010-\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÂ\u0003¢\u0006\u0004\b-\u0010.J\u0012\u0010/\u001a\u0004\u0018\u00010\u0010HÂ\u0003¢\u0006\u0004\b/\u00100J'\u00109\u001a\u0002062\u0006\u00101\u001a\u00020\u00002\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u000204H\u0001¢\u0006\u0004\b7\u00108R(\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0003\u0010:\u0012\u0004\b>\u0010?\u001a\u0004\b;\u0010\u0019\"\u0004\b<\u0010=R\u001a\u0010\u0005\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0005\u0010@\u0012\u0004\bA\u0010?R\u001a\u0010\u0007\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0007\u0010B\u0012\u0004\bC\u0010?R*\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\t\u0010:\u0012\u0004\bF\u0010?\u001a\u0004\bD\u0010\u0019\"\u0004\bE\u0010=R\u001c\u0010\n\u001a\u00020\u00028\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\n\u0010:\u0012\u0004\bG\u0010?R\u001c\u0010\u000b\u001a\u00020\u00028\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\u000b\u0010:\u0012\u0004\bH\u0010?R\u001e\u0010\f\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\f\u0010@\u0012\u0004\bI\u0010?R$\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\u000f\u0010J\u0012\u0004\bK\u0010?R\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\u0011\u0010L\u0012\u0004\bM\u0010?¨\u0006P"}, d2 = {"Lcom/app/tgtg/model/remote/item/requests/RecommendationsListRequest;", "", "", "recommendationType", "Lcom/app/tgtg/model/remote/item/LatLngInfo;", "origin", "", BrazeGeofence.RADIUS_METERS, "Lcom/app/tgtg/model/remote/ItemId;", "itemId", "sorting", "itemStockOption", "storeLocation", "", "Lcom/app/tgtg/model/PickupIntervalDateObject;", "pickupIntervals", "", "size", "<init>", "(Ljava/lang/String;Lcom/app/tgtg/model/remote/item/LatLngInfo;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/item/LatLngInfo;Ljava/util/List;Ljava/lang/Integer;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/app/tgtg/model/remote/item/LatLngInfo;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/item/LatLngInfo;Ljava/util/List;Ljava/lang/Integer;Lm90/m1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component4-RWxzYZM", "component4", "copy-WHSrALE", "(Ljava/lang/String;Lcom/app/tgtg/model/remote/item/LatLngInfo;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/item/LatLngInfo;Ljava/util/List;Ljava/lang/Integer;)Lcom/app/tgtg/model/remote/item/requests/RecommendationsListRequest;", "copy", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "component2", "()Lcom/app/tgtg/model/remote/item/LatLngInfo;", "component3", "()D", "component5", "component6", "component7", "component8", "()Ljava/util/List;", "component9", "()Ljava/lang/Integer;", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/item/requests/RecommendationsListRequest;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getRecommendationType", "setRecommendationType", "(Ljava/lang/String;)V", "getRecommendationType$annotations", "()V", "Lcom/app/tgtg/model/remote/item/LatLngInfo;", "getOrigin$annotations", "D", "getRadius$annotations", "getItemId-RWxzYZM", "setItemId-p3vzNnc", "getItemId-RWxzYZM$annotations", "getSorting$annotations", "getItemStockOption$annotations", "getStoreLocation$annotations", "Ljava/util/List;", "getPickupIntervals$annotations", "Ljava/lang/Integer;", "getSize$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class RecommendationsListRequest {

    @Nullable
    private String itemId;

    @NotNull
    private String itemStockOption;

    @NotNull
    private final LatLngInfo origin;

    @Nullable
    private List<PickupIntervalDateObject> pickupIntervals;
    private final double radius;

    @NotNull
    private String recommendationType;

    @Nullable
    private Integer size;

    @NotNull
    private String sorting;

    @Nullable
    private LatLngInfo storeLocation;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private static final j[] $childSerializers = {null, null, null, null, null, null, null, l.a(m.PUBLICATION, new c(15)), null};

    private /* synthetic */ RecommendationsListRequest(int i11, String str, LatLngInfo latLngInfo, double d3, String str2, String str3, String str4, LatLngInfo latLngInfo2, List list, Integer num, m1 m1Var) {
        if (383 != (i11 & 383)) {
            c1.j(i11, 383, RecommendationsListRequest$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.recommendationType = str;
        this.origin = latLngInfo;
        this.radius = d3;
        this.itemId = str2;
        this.sorting = str3;
        this.itemStockOption = str4;
        this.storeLocation = latLngInfo2;
        if ((i11 & 128) == 0) {
            this.pickupIntervals = null;
        } else {
            this.pickupIntervals = list;
        }
        this.size = num;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new d(PickupIntervalDateObject$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    private final LatLngInfo getOrigin() {
        return this.origin;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    private final double getRadius() {
        return this.radius;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    private final String getSorting() {
        return this.sorting;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    private final String getItemStockOption() {
        return this.itemStockOption;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    private final LatLngInfo getStoreLocation() {
        return this.storeLocation;
    }

    private final List<PickupIntervalDateObject> component8() {
        return this.pickupIntervals;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    private final Integer getSize() {
        return this.size;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: copy-WHSrALE$default, reason: not valid java name */
    public static /* synthetic */ RecommendationsListRequest m372copyWHSrALE$default(RecommendationsListRequest recommendationsListRequest, String str, LatLngInfo latLngInfo, double d3, String str2, String str3, String str4, LatLngInfo latLngInfo2, List list, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = recommendationsListRequest.recommendationType;
        }
        if ((i11 & 2) != 0) {
            latLngInfo = recommendationsListRequest.origin;
        }
        if ((i11 & 4) != 0) {
            d3 = recommendationsListRequest.radius;
        }
        if ((i11 & 8) != 0) {
            str2 = recommendationsListRequest.itemId;
        }
        if ((i11 & 16) != 0) {
            str3 = recommendationsListRequest.sorting;
        }
        if ((i11 & 32) != 0) {
            str4 = recommendationsListRequest.itemStockOption;
        }
        if ((i11 & 64) != 0) {
            latLngInfo2 = recommendationsListRequest.storeLocation;
        }
        if ((i11 & 128) != 0) {
            list = recommendationsListRequest.pickupIntervals;
        }
        if ((i11 & 256) != 0) {
            num = recommendationsListRequest.size;
        }
        List list2 = list;
        Integer num2 = num;
        double d11 = d3;
        return recommendationsListRequest.m375copyWHSrALE(str, latLngInfo, d11, str2, str3, str4, latLngInfo2, list2, num2);
    }

    public static final /* synthetic */ void write$Self$app(RecommendationsListRequest self, b output, SerialDescriptor serialDesc) {
        j[] jVarArr = $childSerializers;
        output.q(serialDesc, 0, self.recommendationType);
        LatLngInfo$$serializer latLngInfo$$serializer = LatLngInfo$$serializer.INSTANCE;
        output.i(serialDesc, 1, latLngInfo$$serializer, self.origin);
        output.z(serialDesc, 2, self.radius);
        ItemId$$serializer itemId$$serializer = ItemId$$serializer.INSTANCE;
        String str = self.itemId;
        output.r(serialDesc, 3, itemId$$serializer, str != null ? ItemId.m197boximpl(str) : null);
        output.q(serialDesc, 4, self.sorting);
        output.q(serialDesc, 5, self.itemStockOption);
        output.r(serialDesc, 6, latLngInfo$$serializer, self.storeLocation);
        if (output.C(serialDesc) || self.pickupIntervals != null) {
            output.r(serialDesc, 7, (KSerializer) jVarArr[7].getValue(), self.pickupIntervals);
        }
        output.r(serialDesc, 8, l0.f29821a, self.size);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRecommendationType() {
        return this.recommendationType;
    }

    @Nullable
    /* JADX INFO: renamed from: component4-RWxzYZM, reason: not valid java name and from getter */
    public final String getItemId() {
        return this.itemId;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-WHSrALE, reason: not valid java name */
    public final RecommendationsListRequest m375copyWHSrALE(@NotNull String recommendationType, @NotNull LatLngInfo origin, double radius, @Nullable String itemId, @NotNull String sorting, @NotNull String itemStockOption, @Nullable LatLngInfo storeLocation, @Nullable List<PickupIntervalDateObject> pickupIntervals, @Nullable Integer size) {
        recommendationType.getClass();
        origin.getClass();
        sorting.getClass();
        itemStockOption.getClass();
        return new RecommendationsListRequest(recommendationType, origin, radius, itemId, sorting, itemStockOption, storeLocation, pickupIntervals, size, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof com.app.tgtg.model.remote.item.requests.RecommendationsListRequest
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.app.tgtg.model.remote.item.requests.RecommendationsListRequest r8 = (com.app.tgtg.model.remote.item.requests.RecommendationsListRequest) r8
            java.lang.String r1 = r7.recommendationType
            java.lang.String r3 = r8.recommendationType
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            com.app.tgtg.model.remote.item.LatLngInfo r1 = r7.origin
            com.app.tgtg.model.remote.item.LatLngInfo r3 = r8.origin
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            double r3 = r7.radius
            double r5 = r8.radius
            int r1 = java.lang.Double.compare(r3, r5)
            if (r1 == 0) goto L2d
            return r2
        L2d:
            java.lang.String r1 = r7.itemId
            java.lang.String r3 = r8.itemId
            if (r1 != 0) goto L39
            if (r3 != 0) goto L37
            r1 = r0
            goto L40
        L37:
            r1 = r2
            goto L40
        L39:
            if (r3 != 0) goto L3c
            goto L37
        L3c:
            boolean r1 = com.app.tgtg.model.remote.ItemId.m201equalsimpl0(r1, r3)
        L40:
            if (r1 != 0) goto L43
            return r2
        L43:
            java.lang.String r1 = r7.sorting
            java.lang.String r3 = r8.sorting
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L4e
            return r2
        L4e:
            java.lang.String r1 = r7.itemStockOption
            java.lang.String r3 = r8.itemStockOption
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L59
            return r2
        L59:
            com.app.tgtg.model.remote.item.LatLngInfo r1 = r7.storeLocation
            com.app.tgtg.model.remote.item.LatLngInfo r3 = r8.storeLocation
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L64
            return r2
        L64:
            java.util.List<com.app.tgtg.model.PickupIntervalDateObject> r1 = r7.pickupIntervals
            java.util.List<com.app.tgtg.model.PickupIntervalDateObject> r3 = r8.pickupIntervals
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L6f
            return r2
        L6f:
            java.lang.Integer r1 = r7.size
            java.lang.Integer r8 = r8.size
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r8)
            if (r8 != 0) goto L7a
            return r2
        L7a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.tgtg.model.remote.item.requests.RecommendationsListRequest.equals(java.lang.Object):boolean");
    }

    @Nullable
    /* JADX INFO: renamed from: getItemId-RWxzYZM, reason: not valid java name */
    public final String m376getItemIdRWxzYZM() {
        return this.itemId;
    }

    @NotNull
    public final String getRecommendationType() {
        return this.recommendationType;
    }

    public int hashCode() {
        int iB = s.b(this.radius, (this.origin.hashCode() + (this.recommendationType.hashCode() * 31)) * 31, 31);
        String str = this.itemId;
        int iB2 = l1.b(l1.b((iB + (str == null ? 0 : ItemId.m202hashCodeimpl(str))) * 31, 31, this.sorting), 31, this.itemStockOption);
        LatLngInfo latLngInfo = this.storeLocation;
        int iHashCode = (iB2 + (latLngInfo == null ? 0 : latLngInfo.hashCode())) * 31;
        List<PickupIntervalDateObject> list = this.pickupIntervals;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.size;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    /* JADX INFO: renamed from: setItemId-p3vzNnc, reason: not valid java name */
    public final void m377setItemIdp3vzNnc(@Nullable String str) {
        this.itemId = str;
    }

    public final void setRecommendationType(@NotNull String str) {
        str.getClass();
        this.recommendationType = str;
    }

    @NotNull
    public String toString() {
        String str = this.recommendationType;
        LatLngInfo latLngInfo = this.origin;
        double d3 = this.radius;
        String str2 = this.itemId;
        String strM203toStringimpl = str2 == null ? Address.ADDRESS_NULL_PLACEHOLDER : ItemId.m203toStringimpl(str2);
        String str3 = this.sorting;
        String str4 = this.itemStockOption;
        LatLngInfo latLngInfo2 = this.storeLocation;
        List<PickupIntervalDateObject> list = this.pickupIntervals;
        Integer num = this.size;
        StringBuilder sb2 = new StringBuilder("RecommendationsListRequest(recommendationType=");
        sb2.append(str);
        sb2.append(", origin=");
        sb2.append(latLngInfo);
        sb2.append(", radius=");
        sb2.append(d3);
        sb2.append(", itemId=");
        sb2.append(strM203toStringimpl);
        s.A(sb2, ", sorting=", str3, ", itemStockOption=", str4);
        sb2.append(", storeLocation=");
        sb2.append(latLngInfo2);
        sb2.append(", pickupIntervals=");
        sb2.append(list);
        sb2.append(", size=");
        sb2.append(num);
        sb2.append(")");
        return sb2.toString();
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/item/requests/RecommendationsListRequest$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/item/requests/RecommendationsListRequest;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return RecommendationsListRequest$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @g("item_id")
    /* JADX INFO: renamed from: getItemId-RWxzYZM$annotations, reason: not valid java name */
    public static /* synthetic */ void m373getItemIdRWxzYZM$annotations() {
    }

    @g("item_stock_option")
    private static /* synthetic */ void getItemStockOption$annotations() {
    }

    @g("origin")
    private static /* synthetic */ void getOrigin$annotations() {
    }

    @g("pickup_intervals")
    private static /* synthetic */ void getPickupIntervals$annotations() {
    }

    @g(BrazeGeofence.RADIUS_METERS)
    private static /* synthetic */ void getRadius$annotations() {
    }

    @g("type")
    public static /* synthetic */ void getRecommendationType$annotations() {
    }

    @g("size")
    private static /* synthetic */ void getSize$annotations() {
    }

    @g("sorting")
    private static /* synthetic */ void getSorting$annotations() {
    }

    @g("store_location")
    private static /* synthetic */ void getStoreLocation$annotations() {
    }

    public /* synthetic */ RecommendationsListRequest(String str, LatLngInfo latLngInfo, double d3, String str2, String str3, String str4, LatLngInfo latLngInfo2, List list, Integer num, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, latLngInfo, d3, str2, str3, str4, latLngInfo2, list, num);
    }

    public /* synthetic */ RecommendationsListRequest(int i11, String str, LatLngInfo latLngInfo, double d3, String str2, String str3, String str4, LatLngInfo latLngInfo2, List list, Integer num, m1 m1Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, str, latLngInfo, d3, str2, str3, str4, latLngInfo2, list, num, m1Var);
    }

    private RecommendationsListRequest(String str, LatLngInfo latLngInfo, double d3, String str2, String str3, String str4, LatLngInfo latLngInfo2, List<PickupIntervalDateObject> list, Integer num) {
        str.getClass();
        latLngInfo.getClass();
        str3.getClass();
        str4.getClass();
        this.recommendationType = str;
        this.origin = latLngInfo;
        this.radius = d3;
        this.itemId = str2;
        this.sorting = str3;
        this.itemStockOption = str4;
        this.storeLocation = latLngInfo2;
        this.pickupIntervals = list;
        this.size = num;
    }

    public /* synthetic */ RecommendationsListRequest(String str, LatLngInfo latLngInfo, double d3, String str2, String str3, String str4, LatLngInfo latLngInfo2, List list, Integer num, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, latLngInfo, d3, str2, str3, str4, latLngInfo2, (i11 & 128) != 0 ? null : list, num, null);
    }
}
