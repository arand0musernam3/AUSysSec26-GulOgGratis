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
import m90.c1;
import m90.d;
import m90.g;
import m90.m1;
import m90.r1;
import m90.v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import u70.j;
import u70.l;
import u70.m;
import zendesk.ui.android.conversation.composer.b;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b!\b\u0087\b\u0018\u0000 W2\u00020\u0001:\u0002XWB\u0087\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014B\u0089\u0001\b\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0013\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b&\u0010#J\u0012\u0010'\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b'\u0010#J\u0018\u0010(\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b(\u0010\u001fJ\u0012\u0010)\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0092\u0001\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00062\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b-\u0010!J\u0010\u0010.\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b.\u0010/J\u001a\u00101\u001a\u00020\u000b2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b1\u00102J'\u0010;\u001a\u0002082\u0006\u00103\u001a\u00020\u00002\u0006\u00105\u001a\u0002042\u0006\u00107\u001a\u000206H\u0001¢\u0006\u0004\b9\u0010:R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010<\u0012\u0004\b>\u0010?\u001a\u0004\b=\u0010\u001bR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010@\u0012\u0004\bB\u0010?\u001a\u0004\bA\u0010\u001dR(\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010C\u0012\u0004\bE\u0010?\u001a\u0004\bD\u0010\u001fR\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010F\u0012\u0004\bH\u0010?\u001a\u0004\bG\u0010!R\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010I\u0012\u0004\bK\u0010?\u001a\u0004\bJ\u0010#R \u0010\r\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010L\u0012\u0004\bN\u0010?\u001a\u0004\bM\u0010%R\"\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010I\u0012\u0004\bO\u0010?\u001a\u0004\b\u000e\u0010#R\"\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010I\u0012\u0004\bQ\u0010?\u001a\u0004\bP\u0010#R(\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010C\u0012\u0004\bS\u0010?\u001a\u0004\bR\u0010\u001fR\"\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010T\u0012\u0004\bV\u0010?\u001a\u0004\bU\u0010*¨\u0006Y"}, d2 = {"Lcom/app/tgtg/model/remote/discover/request/DiscoverAllBucketsRequest;", "", "Lcom/app/tgtg/model/remote/item/LatLngInfo;", "origin", "", BrazeGeofence.RADIUS_METERS, "", "Lcom/app/tgtg/model/remote/discover/request/SupportedBucket;", "supportedBuckets", "", "experimentalGroup", "", "accessibilityEnabled", "debugMode", "isGPS", "originUpdated", "quickFilters", "Lcom/app/tgtg/model/remote/discover/request/CRMCampaign;", "crmCampaign", "<init>", "(Lcom/app/tgtg/model/remote/item/LatLngInfo;Ljava/lang/Double;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;ZLjava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Lcom/app/tgtg/model/remote/discover/request/CRMCampaign;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILcom/app/tgtg/model/remote/item/LatLngInfo;Ljava/lang/Double;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;ZLjava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Lcom/app/tgtg/model/remote/discover/request/CRMCampaign;Lm90/m1;)V", "component1", "()Lcom/app/tgtg/model/remote/item/LatLngInfo;", "component2", "()Ljava/lang/Double;", "component3", "()Ljava/util/List;", "component4", "()Ljava/lang/String;", "component5", "()Ljava/lang/Boolean;", "component6", "()Z", "component7", "component8", "component9", "component10", "()Lcom/app/tgtg/model/remote/discover/request/CRMCampaign;", "copy", "(Lcom/app/tgtg/model/remote/item/LatLngInfo;Ljava/lang/Double;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;ZLjava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Lcom/app/tgtg/model/remote/discover/request/CRMCampaign;)Lcom/app/tgtg/model/remote/discover/request/DiscoverAllBucketsRequest;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/discover/request/DiscoverAllBucketsRequest;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lcom/app/tgtg/model/remote/item/LatLngInfo;", "getOrigin", "getOrigin$annotations", "()V", "Ljava/lang/Double;", "getRadius", "getRadius$annotations", "Ljava/util/List;", "getSupportedBuckets", "getSupportedBuckets$annotations", "Ljava/lang/String;", "getExperimentalGroup", "getExperimentalGroup$annotations", "Ljava/lang/Boolean;", "getAccessibilityEnabled", "getAccessibilityEnabled$annotations", "Z", "getDebugMode", "getDebugMode$annotations", "isGPS$annotations", "getOriginUpdated", "getOriginUpdated$annotations", "getQuickFilters", "getQuickFilters$annotations", "Lcom/app/tgtg/model/remote/discover/request/CRMCampaign;", "getCrmCampaign", "getCrmCampaign$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class DiscoverAllBucketsRequest {

    @NotNull
    private static final j[] $childSerializers;

    @Nullable
    private final Boolean accessibilityEnabled;

    @Nullable
    private final CRMCampaign crmCampaign;
    private final boolean debugMode;

    @Nullable
    private final String experimentalGroup;

    @Nullable
    private final Boolean isGPS;

    @Nullable
    private final LatLngInfo origin;

    @Nullable
    private final Boolean originUpdated;

    @Nullable
    private final List<String> quickFilters;

    @Nullable
    private final Double radius;

    @Nullable
    private final List<SupportedBucket> supportedBuckets;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    static {
        m mVar = m.PUBLICATION;
        $childSerializers = new j[]{null, null, l.a(mVar, new b(18)), null, null, null, null, null, l.a(mVar, new b(19)), null};
    }

    public /* synthetic */ DiscoverAllBucketsRequest(int i11, LatLngInfo latLngInfo, Double d3, List list, String str, Boolean bool, boolean z11, Boolean bool2, Boolean bool3, List list2, CRMCampaign cRMCampaign, m1 m1Var) {
        if (32 != (i11 & 32)) {
            c1.j(i11, 32, DiscoverAllBucketsRequest$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
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
            this.supportedBuckets = null;
        } else {
            this.supportedBuckets = list;
        }
        if ((i11 & 8) == 0) {
            this.experimentalGroup = null;
        } else {
            this.experimentalGroup = str;
        }
        if ((i11 & 16) == 0) {
            this.accessibilityEnabled = null;
        } else {
            this.accessibilityEnabled = bool;
        }
        this.debugMode = z11;
        if ((i11 & 64) == 0) {
            this.isGPS = null;
        } else {
            this.isGPS = bool2;
        }
        if ((i11 & 128) == 0) {
            this.originUpdated = null;
        } else {
            this.originUpdated = bool3;
        }
        if ((i11 & 256) == 0) {
            this.quickFilters = null;
        } else {
            this.quickFilters = list2;
        }
        if ((i11 & 512) == 0) {
            this.crmCampaign = null;
        } else {
            this.crmCampaign = cRMCampaign;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new d(SupportedBucket$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new d(r1.f29848a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DiscoverAllBucketsRequest copy$default(DiscoverAllBucketsRequest discoverAllBucketsRequest, LatLngInfo latLngInfo, Double d3, List list, String str, Boolean bool, boolean z11, Boolean bool2, Boolean bool3, List list2, CRMCampaign cRMCampaign, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            latLngInfo = discoverAllBucketsRequest.origin;
        }
        if ((i11 & 2) != 0) {
            d3 = discoverAllBucketsRequest.radius;
        }
        if ((i11 & 4) != 0) {
            list = discoverAllBucketsRequest.supportedBuckets;
        }
        if ((i11 & 8) != 0) {
            str = discoverAllBucketsRequest.experimentalGroup;
        }
        if ((i11 & 16) != 0) {
            bool = discoverAllBucketsRequest.accessibilityEnabled;
        }
        if ((i11 & 32) != 0) {
            z11 = discoverAllBucketsRequest.debugMode;
        }
        if ((i11 & 64) != 0) {
            bool2 = discoverAllBucketsRequest.isGPS;
        }
        if ((i11 & 128) != 0) {
            bool3 = discoverAllBucketsRequest.originUpdated;
        }
        if ((i11 & 256) != 0) {
            list2 = discoverAllBucketsRequest.quickFilters;
        }
        if ((i11 & 512) != 0) {
            cRMCampaign = discoverAllBucketsRequest.crmCampaign;
        }
        List list3 = list2;
        CRMCampaign cRMCampaign2 = cRMCampaign;
        Boolean bool4 = bool2;
        Boolean bool5 = bool3;
        Boolean bool6 = bool;
        boolean z12 = z11;
        return discoverAllBucketsRequest.copy(latLngInfo, d3, list, str, bool6, z12, bool4, bool5, list3, cRMCampaign2);
    }

    public static final /* synthetic */ void write$Self$app(DiscoverAllBucketsRequest self, l90.b output, SerialDescriptor serialDesc) {
        j[] jVarArr = $childSerializers;
        if (output.C(serialDesc) || self.origin != null) {
            output.r(serialDesc, 0, LatLngInfo$$serializer.INSTANCE, self.origin);
        }
        if (output.C(serialDesc) || self.radius != null) {
            output.r(serialDesc, 1, v.f29868a, self.radius);
        }
        if (output.C(serialDesc) || self.supportedBuckets != null) {
            output.r(serialDesc, 2, (KSerializer) jVarArr[2].getValue(), self.supportedBuckets);
        }
        if (output.C(serialDesc) || self.experimentalGroup != null) {
            output.r(serialDesc, 3, r1.f29848a, self.experimentalGroup);
        }
        if (output.C(serialDesc) || self.accessibilityEnabled != null) {
            output.r(serialDesc, 4, g.f29797a, self.accessibilityEnabled);
        }
        output.p(serialDesc, 5, self.debugMode);
        if (output.C(serialDesc) || self.isGPS != null) {
            output.r(serialDesc, 6, g.f29797a, self.isGPS);
        }
        if (output.C(serialDesc) || self.originUpdated != null) {
            output.r(serialDesc, 7, g.f29797a, self.originUpdated);
        }
        if (output.C(serialDesc) || self.quickFilters != null) {
            output.r(serialDesc, 8, (KSerializer) jVarArr[8].getValue(), self.quickFilters);
        }
        if (!output.C(serialDesc) && self.crmCampaign == null) {
            return;
        }
        output.r(serialDesc, 9, CRMCampaign$$serializer.INSTANCE, self.crmCampaign);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final LatLngInfo getOrigin() {
        return this.origin;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final CRMCampaign getCrmCampaign() {
        return this.crmCampaign;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Double getRadius() {
        return this.radius;
    }

    @Nullable
    public final List<SupportedBucket> component3() {
        return this.supportedBuckets;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getExperimentalGroup() {
        return this.experimentalGroup;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getAccessibilityEnabled() {
        return this.accessibilityEnabled;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getDebugMode() {
        return this.debugMode;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Boolean getIsGPS() {
        return this.isGPS;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Boolean getOriginUpdated() {
        return this.originUpdated;
    }

    @Nullable
    public final List<String> component9() {
        return this.quickFilters;
    }

    @NotNull
    public final DiscoverAllBucketsRequest copy(@Nullable LatLngInfo origin, @Nullable Double radius, @Nullable List<SupportedBucket> supportedBuckets, @Nullable String experimentalGroup, @Nullable Boolean accessibilityEnabled, boolean debugMode, @Nullable Boolean isGPS, @Nullable Boolean originUpdated, @Nullable List<String> quickFilters, @Nullable CRMCampaign crmCampaign) {
        return new DiscoverAllBucketsRequest(origin, radius, supportedBuckets, experimentalGroup, accessibilityEnabled, debugMode, isGPS, originUpdated, quickFilters, crmCampaign);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DiscoverAllBucketsRequest)) {
            return false;
        }
        DiscoverAllBucketsRequest discoverAllBucketsRequest = (DiscoverAllBucketsRequest) other;
        return Intrinsics.areEqual(this.origin, discoverAllBucketsRequest.origin) && Intrinsics.areEqual((Object) this.radius, (Object) discoverAllBucketsRequest.radius) && Intrinsics.areEqual(this.supportedBuckets, discoverAllBucketsRequest.supportedBuckets) && Intrinsics.areEqual(this.experimentalGroup, discoverAllBucketsRequest.experimentalGroup) && Intrinsics.areEqual(this.accessibilityEnabled, discoverAllBucketsRequest.accessibilityEnabled) && this.debugMode == discoverAllBucketsRequest.debugMode && Intrinsics.areEqual(this.isGPS, discoverAllBucketsRequest.isGPS) && Intrinsics.areEqual(this.originUpdated, discoverAllBucketsRequest.originUpdated) && Intrinsics.areEqual(this.quickFilters, discoverAllBucketsRequest.quickFilters) && Intrinsics.areEqual(this.crmCampaign, discoverAllBucketsRequest.crmCampaign);
    }

    @Nullable
    public final Boolean getAccessibilityEnabled() {
        return this.accessibilityEnabled;
    }

    @Nullable
    public final CRMCampaign getCrmCampaign() {
        return this.crmCampaign;
    }

    public final boolean getDebugMode() {
        return this.debugMode;
    }

    @Nullable
    public final String getExperimentalGroup() {
        return this.experimentalGroup;
    }

    @Nullable
    public final LatLngInfo getOrigin() {
        return this.origin;
    }

    @Nullable
    public final Boolean getOriginUpdated() {
        return this.originUpdated;
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
    public final List<SupportedBucket> getSupportedBuckets() {
        return this.supportedBuckets;
    }

    public int hashCode() {
        LatLngInfo latLngInfo = this.origin;
        int iHashCode = (latLngInfo == null ? 0 : latLngInfo.hashCode()) * 31;
        Double d3 = this.radius;
        int iHashCode2 = (iHashCode + (d3 == null ? 0 : d3.hashCode())) * 31;
        List<SupportedBucket> list = this.supportedBuckets;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.experimentalGroup;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.accessibilityEnabled;
        int iE = k.e((iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.debugMode);
        Boolean bool2 = this.isGPS;
        int iHashCode5 = (iE + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.originUpdated;
        int iHashCode6 = (iHashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        List<String> list2 = this.quickFilters;
        int iHashCode7 = (iHashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
        CRMCampaign cRMCampaign = this.crmCampaign;
        return iHashCode7 + (cRMCampaign != null ? cRMCampaign.hashCode() : 0);
    }

    @Nullable
    public final Boolean isGPS() {
        return this.isGPS;
    }

    @NotNull
    public String toString() {
        return "DiscoverAllBucketsRequest(origin=" + this.origin + ", radius=" + this.radius + ", supportedBuckets=" + this.supportedBuckets + ", experimentalGroup=" + this.experimentalGroup + ", accessibilityEnabled=" + this.accessibilityEnabled + ", debugMode=" + this.debugMode + ", isGPS=" + this.isGPS + ", originUpdated=" + this.originUpdated + ", quickFilters=" + this.quickFilters + ", crmCampaign=" + this.crmCampaign + ")";
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/discover/request/DiscoverAllBucketsRequest$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/discover/request/DiscoverAllBucketsRequest;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return DiscoverAllBucketsRequest$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @i90.g("accessibility_enabled")
    public static /* synthetic */ void getAccessibilityEnabled$annotations() {
    }

    @i90.g("crm_campaign")
    public static /* synthetic */ void getCrmCampaign$annotations() {
    }

    @i90.g("debug_mode")
    public static /* synthetic */ void getDebugMode$annotations() {
    }

    @i90.g("experimental_group")
    public static /* synthetic */ void getExperimentalGroup$annotations() {
    }

    @i90.g("origin")
    public static /* synthetic */ void getOrigin$annotations() {
    }

    @i90.g("origin_updated")
    public static /* synthetic */ void getOriginUpdated$annotations() {
    }

    @i90.g("filters")
    public static /* synthetic */ void getQuickFilters$annotations() {
    }

    @i90.g(BrazeGeofence.RADIUS_METERS)
    public static /* synthetic */ void getRadius$annotations() {
    }

    @i90.g("supported_buckets")
    public static /* synthetic */ void getSupportedBuckets$annotations() {
    }

    @i90.g("is_gps")
    public static /* synthetic */ void isGPS$annotations() {
    }

    public DiscoverAllBucketsRequest(@Nullable LatLngInfo latLngInfo, @Nullable Double d3, @Nullable List<SupportedBucket> list, @Nullable String str, @Nullable Boolean bool, boolean z11, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable List<String> list2, @Nullable CRMCampaign cRMCampaign) {
        this.origin = latLngInfo;
        this.radius = d3;
        this.supportedBuckets = list;
        this.experimentalGroup = str;
        this.accessibilityEnabled = bool;
        this.debugMode = z11;
        this.isGPS = bool2;
        this.originUpdated = bool3;
        this.quickFilters = list2;
        this.crmCampaign = cRMCampaign;
    }

    public /* synthetic */ DiscoverAllBucketsRequest(LatLngInfo latLngInfo, Double d3, List list, String str, Boolean bool, boolean z11, Boolean bool2, Boolean bool3, List list2, CRMCampaign cRMCampaign, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : latLngInfo, (i11 & 2) != 0 ? null : d3, (i11 & 4) != 0 ? null : list, (i11 & 8) != 0 ? null : str, (i11 & 16) != 0 ? null : bool, z11, (i11 & 64) != 0 ? null : bool2, (i11 & 128) != 0 ? null : bool3, (i11 & 256) != 0 ? null : list2, (i11 & 512) != 0 ? null : cRMCampaign);
    }
}
