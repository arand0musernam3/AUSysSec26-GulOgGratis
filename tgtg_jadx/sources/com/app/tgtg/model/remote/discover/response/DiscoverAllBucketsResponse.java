package com.app.tgtg.model.remote.discover.response;

import atd.g.d;
import com.app.tgtg.model.remote.item.response.HeroComponentResponse;
import com.app.tgtg.model.remote.item.response.HeroComponentResponse$$serializer;
import i90.g;
import i90.h;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.c1;
import m90.m1;
import m90.r1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.j;
import u70.l;
import u70.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u0000 92\u00020\u0001:\u0002:9B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bB?\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ \u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJB\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0018\b\u0002\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001bJ\u0010\u0010#\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R*\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0003\u0010)\u0012\u0004\b-\u0010.\u001a\u0004\b*\u0010\u001b\"\u0004\b+\u0010,R8\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0007\u0010/\u0012\u0004\b3\u0010.\u001a\u0004\b0\u0010\u001d\"\u0004\b1\u00102R*\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\t\u00104\u0012\u0004\b8\u0010.\u001a\u0004\b5\u0010\u001f\"\u0004\b6\u00107¨\u0006;"}, d2 = {"Lcom/app/tgtg/model/remote/discover/response/DiscoverAllBucketsResponse;", "", "", "itemAvailabilityStatus", "Ljava/util/ArrayList;", "Lcom/app/tgtg/model/remote/discover/response/DiscoverBucket;", "Lkotlin/collections/ArrayList;", "discoverBuckets", "Lcom/app/tgtg/model/remote/item/response/HeroComponentResponse;", "heroComponent", "<init>", "(Ljava/lang/String;Ljava/util/ArrayList;Lcom/app/tgtg/model/remote/item/response/HeroComponentResponse;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/ArrayList;Lcom/app/tgtg/model/remote/item/response/HeroComponentResponse;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/discover/response/DiscoverAllBucketsResponse;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/ArrayList;", "component3", "()Lcom/app/tgtg/model/remote/item/response/HeroComponentResponse;", "copy", "(Ljava/lang/String;Ljava/util/ArrayList;Lcom/app/tgtg/model/remote/item/response/HeroComponentResponse;)Lcom/app/tgtg/model/remote/discover/response/DiscoverAllBucketsResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getItemAvailabilityStatus", "setItemAvailabilityStatus", "(Ljava/lang/String;)V", "getItemAvailabilityStatus$annotations", "()V", "Ljava/util/ArrayList;", "getDiscoverBuckets", "setDiscoverBuckets", "(Ljava/util/ArrayList;)V", "getDiscoverBuckets$annotations", "Lcom/app/tgtg/model/remote/item/response/HeroComponentResponse;", "getHeroComponent", "setHeroComponent", "(Lcom/app/tgtg/model/remote/item/response/HeroComponentResponse;)V", "getHeroComponent$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class DiscoverAllBucketsResponse {

    @NotNull
    private ArrayList<DiscoverBucket> discoverBuckets;

    @Nullable
    private HeroComponentResponse heroComponent;

    @Nullable
    private String itemAvailabilityStatus;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private static final j[] $childSerializers = {null, l.a(m.PUBLICATION, new d(26)), null};

    public /* synthetic */ DiscoverAllBucketsResponse(int i11, String str, ArrayList arrayList, HeroComponentResponse heroComponentResponse, m1 m1Var) {
        if (2 != (i11 & 2)) {
            c1.j(i11, 2, DiscoverAllBucketsResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i11 & 1) == 0) {
            this.itemAvailabilityStatus = null;
        } else {
            this.itemAvailabilityStatus = str;
        }
        this.discoverBuckets = arrayList;
        if ((i11 & 4) == 0) {
            this.heroComponent = null;
        } else {
            this.heroComponent = heroComponentResponse;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new m90.d(DiscoverBucket$$serializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DiscoverAllBucketsResponse copy$default(DiscoverAllBucketsResponse discoverAllBucketsResponse, String str, ArrayList arrayList, HeroComponentResponse heroComponentResponse, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = discoverAllBucketsResponse.itemAvailabilityStatus;
        }
        if ((i11 & 2) != 0) {
            arrayList = discoverAllBucketsResponse.discoverBuckets;
        }
        if ((i11 & 4) != 0) {
            heroComponentResponse = discoverAllBucketsResponse.heroComponent;
        }
        return discoverAllBucketsResponse.copy(str, arrayList, heroComponentResponse);
    }

    public static final /* synthetic */ void write$Self$app(DiscoverAllBucketsResponse self, b output, SerialDescriptor serialDesc) {
        j[] jVarArr = $childSerializers;
        if (output.C(serialDesc) || self.itemAvailabilityStatus != null) {
            output.r(serialDesc, 0, r1.f29848a, self.itemAvailabilityStatus);
        }
        output.i(serialDesc, 1, (KSerializer) jVarArr[1].getValue(), self.discoverBuckets);
        if (!output.C(serialDesc) && self.heroComponent == null) {
            return;
        }
        output.r(serialDesc, 2, HeroComponentResponse$$serializer.INSTANCE, self.heroComponent);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getItemAvailabilityStatus() {
        return this.itemAvailabilityStatus;
    }

    @NotNull
    public final ArrayList<DiscoverBucket> component2() {
        return this.discoverBuckets;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final HeroComponentResponse getHeroComponent() {
        return this.heroComponent;
    }

    @NotNull
    public final DiscoverAllBucketsResponse copy(@Nullable String itemAvailabilityStatus, @NotNull ArrayList<DiscoverBucket> discoverBuckets, @Nullable HeroComponentResponse heroComponent) {
        discoverBuckets.getClass();
        return new DiscoverAllBucketsResponse(itemAvailabilityStatus, discoverBuckets, heroComponent);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DiscoverAllBucketsResponse)) {
            return false;
        }
        DiscoverAllBucketsResponse discoverAllBucketsResponse = (DiscoverAllBucketsResponse) other;
        return Intrinsics.areEqual(this.itemAvailabilityStatus, discoverAllBucketsResponse.itemAvailabilityStatus) && Intrinsics.areEqual(this.discoverBuckets, discoverAllBucketsResponse.discoverBuckets) && Intrinsics.areEqual(this.heroComponent, discoverAllBucketsResponse.heroComponent);
    }

    @NotNull
    public final ArrayList<DiscoverBucket> getDiscoverBuckets() {
        return this.discoverBuckets;
    }

    @Nullable
    public final HeroComponentResponse getHeroComponent() {
        return this.heroComponent;
    }

    @Nullable
    public final String getItemAvailabilityStatus() {
        return this.itemAvailabilityStatus;
    }

    public int hashCode() {
        String str = this.itemAvailabilityStatus;
        int iHashCode = (this.discoverBuckets.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        HeroComponentResponse heroComponentResponse = this.heroComponent;
        return iHashCode + (heroComponentResponse != null ? heroComponentResponse.hashCode() : 0);
    }

    public final void setDiscoverBuckets(@NotNull ArrayList<DiscoverBucket> arrayList) {
        arrayList.getClass();
        this.discoverBuckets = arrayList;
    }

    public final void setHeroComponent(@Nullable HeroComponentResponse heroComponentResponse) {
        this.heroComponent = heroComponentResponse;
    }

    public final void setItemAvailabilityStatus(@Nullable String str) {
        this.itemAvailabilityStatus = str;
    }

    @NotNull
    public String toString() {
        return "DiscoverAllBucketsResponse(itemAvailabilityStatus=" + this.itemAvailabilityStatus + ", discoverBuckets=" + this.discoverBuckets + ", heroComponent=" + this.heroComponent + ")";
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/discover/response/DiscoverAllBucketsResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/discover/response/DiscoverAllBucketsResponse;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return DiscoverAllBucketsResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @g("buckets")
    public static /* synthetic */ void getDiscoverBuckets$annotations() {
    }

    @g("hero_component")
    public static /* synthetic */ void getHeroComponent$annotations() {
    }

    @g("item_availability_status")
    public static /* synthetic */ void getItemAvailabilityStatus$annotations() {
    }

    public DiscoverAllBucketsResponse(@Nullable String str, @NotNull ArrayList<DiscoverBucket> arrayList, @Nullable HeroComponentResponse heroComponentResponse) {
        arrayList.getClass();
        this.itemAvailabilityStatus = str;
        this.discoverBuckets = arrayList;
        this.heroComponent = heroComponentResponse;
    }

    public /* synthetic */ DiscoverAllBucketsResponse(String str, ArrayList arrayList, HeroComponentResponse heroComponentResponse, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, arrayList, (i11 & 4) != 0 ? null : heroComponentResponse);
    }
}
