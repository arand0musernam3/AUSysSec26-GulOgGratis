package com.app.tgtg.model.remote.mapService;

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
import m90.r1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000243B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J4\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R*\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0003\u0010%\u0012\u0004\b)\u0010*\u001a\u0004\b&\u0010\u0018\"\u0004\b'\u0010(R*\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0005\u0010+\u0012\u0004\b/\u0010*\u001a\u0004\b,\u0010\u001a\"\u0004\b-\u0010.R*\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0006\u0010%\u0012\u0004\b2\u0010*\u001a\u0004\b0\u0010\u0018\"\u0004\b1\u0010(¨\u00065"}, d2 = {"Lcom/app/tgtg/model/remote/mapService/Locations;", "", "", "displayName", "Lcom/app/tgtg/model/remote/item/LatLngInfo;", "center", "placeId", "<init>", "(Ljava/lang/String;Lcom/app/tgtg/model/remote/item/LatLngInfo;Ljava/lang/String;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/app/tgtg/model/remote/item/LatLngInfo;Ljava/lang/String;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/mapService/Locations;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/app/tgtg/model/remote/item/LatLngInfo;", "component3", "copy", "(Ljava/lang/String;Lcom/app/tgtg/model/remote/item/LatLngInfo;Ljava/lang/String;)Lcom/app/tgtg/model/remote/mapService/Locations;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDisplayName", "setDisplayName", "(Ljava/lang/String;)V", "getDisplayName$annotations", "()V", "Lcom/app/tgtg/model/remote/item/LatLngInfo;", "getCenter", "setCenter", "(Lcom/app/tgtg/model/remote/item/LatLngInfo;)V", "getCenter$annotations", "getPlaceId", "setPlaceId", "getPlaceId$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class Locations {

    @Nullable
    private LatLngInfo center;

    @Nullable
    private String displayName;

    @Nullable
    private String placeId;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ Locations(int i11, String str, LatLngInfo latLngInfo, String str2, m1 m1Var) {
        if ((i11 & 1) == 0) {
            this.displayName = null;
        } else {
            this.displayName = str;
        }
        if ((i11 & 2) == 0) {
            this.center = null;
        } else {
            this.center = latLngInfo;
        }
        if ((i11 & 4) == 0) {
            this.placeId = null;
        } else {
            this.placeId = str2;
        }
    }

    public static /* synthetic */ Locations copy$default(Locations locations, String str, LatLngInfo latLngInfo, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = locations.displayName;
        }
        if ((i11 & 2) != 0) {
            latLngInfo = locations.center;
        }
        if ((i11 & 4) != 0) {
            str2 = locations.placeId;
        }
        return locations.copy(str, latLngInfo, str2);
    }

    public static final /* synthetic */ void write$Self$app(Locations self, b output, SerialDescriptor serialDesc) {
        if (output.C(serialDesc) || self.displayName != null) {
            output.r(serialDesc, 0, r1.f29848a, self.displayName);
        }
        if (output.C(serialDesc) || self.center != null) {
            output.r(serialDesc, 1, LatLngInfo$$serializer.INSTANCE, self.center);
        }
        if (!output.C(serialDesc) && self.placeId == null) {
            return;
        }
        output.r(serialDesc, 2, r1.f29848a, self.placeId);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final LatLngInfo getCenter() {
        return this.center;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPlaceId() {
        return this.placeId;
    }

    @NotNull
    public final Locations copy(@Nullable String displayName, @Nullable LatLngInfo center, @Nullable String placeId) {
        return new Locations(displayName, center, placeId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Locations)) {
            return false;
        }
        Locations locations = (Locations) other;
        return Intrinsics.areEqual(this.displayName, locations.displayName) && Intrinsics.areEqual(this.center, locations.center) && Intrinsics.areEqual(this.placeId, locations.placeId);
    }

    @Nullable
    public final LatLngInfo getCenter() {
        return this.center;
    }

    @Nullable
    public final String getDisplayName() {
        return this.displayName;
    }

    @Nullable
    public final String getPlaceId() {
        return this.placeId;
    }

    public int hashCode() {
        String str = this.displayName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        LatLngInfo latLngInfo = this.center;
        int iHashCode2 = (iHashCode + (latLngInfo == null ? 0 : latLngInfo.hashCode())) * 31;
        String str2 = this.placeId;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setCenter(@Nullable LatLngInfo latLngInfo) {
        this.center = latLngInfo;
    }

    public final void setDisplayName(@Nullable String str) {
        this.displayName = str;
    }

    public final void setPlaceId(@Nullable String str) {
        this.placeId = str;
    }

    @NotNull
    public String toString() {
        String str = this.displayName;
        LatLngInfo latLngInfo = this.center;
        String str2 = this.placeId;
        StringBuilder sb2 = new StringBuilder("Locations(displayName=");
        sb2.append(str);
        sb2.append(", center=");
        sb2.append(latLngInfo);
        sb2.append(", placeId=");
        return k.p(sb2, str2, ")");
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/mapService/Locations$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/mapService/Locations;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return Locations$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @g("center")
    public static /* synthetic */ void getCenter$annotations() {
    }

    @g("display_name")
    public static /* synthetic */ void getDisplayName$annotations() {
    }

    @g("place_id")
    public static /* synthetic */ void getPlaceId$annotations() {
    }

    public Locations() {
        this((String) null, (LatLngInfo) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    public Locations(@Nullable String str, @Nullable LatLngInfo latLngInfo, @Nullable String str2) {
        this.displayName = str;
        this.center = latLngInfo;
        this.placeId = str2;
    }

    public /* synthetic */ Locations(String str, LatLngInfo latLngInfo, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : latLngInfo, (i11 & 4) != 0 ? null : str2);
    }
}
