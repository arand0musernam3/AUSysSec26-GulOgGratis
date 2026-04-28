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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J(\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R*\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0003\u0010#\u0012\u0004\b'\u0010(\u001a\u0004\b$\u0010\u0016\"\u0004\b%\u0010&R*\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0004\u0010#\u0012\u0004\b+\u0010(\u001a\u0004\b)\u0010\u0016\"\u0004\b*\u0010&¨\u0006."}, d2 = {"Lcom/app/tgtg/model/remote/mapService/MapBoundingBox;", "", "Lcom/app/tgtg/model/remote/item/LatLngInfo;", "mapTopLeft", "mapBottomRight", "<init>", "(Lcom/app/tgtg/model/remote/item/LatLngInfo;Lcom/app/tgtg/model/remote/item/LatLngInfo;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILcom/app/tgtg/model/remote/item/LatLngInfo;Lcom/app/tgtg/model/remote/item/LatLngInfo;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/mapService/MapBoundingBox;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/app/tgtg/model/remote/item/LatLngInfo;", "component2", "copy", "(Lcom/app/tgtg/model/remote/item/LatLngInfo;Lcom/app/tgtg/model/remote/item/LatLngInfo;)Lcom/app/tgtg/model/remote/mapService/MapBoundingBox;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/app/tgtg/model/remote/item/LatLngInfo;", "getMapTopLeft", "setMapTopLeft", "(Lcom/app/tgtg/model/remote/item/LatLngInfo;)V", "getMapTopLeft$annotations", "()V", "getMapBottomRight", "setMapBottomRight", "getMapBottomRight$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class MapBoundingBox {

    @Nullable
    private LatLngInfo mapBottomRight;

    @Nullable
    private LatLngInfo mapTopLeft;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ MapBoundingBox(int i11, LatLngInfo latLngInfo, LatLngInfo latLngInfo2, m1 m1Var) {
        if ((i11 & 1) == 0) {
            this.mapTopLeft = null;
        } else {
            this.mapTopLeft = latLngInfo;
        }
        if ((i11 & 2) == 0) {
            this.mapBottomRight = null;
        } else {
            this.mapBottomRight = latLngInfo2;
        }
    }

    public static /* synthetic */ MapBoundingBox copy$default(MapBoundingBox mapBoundingBox, LatLngInfo latLngInfo, LatLngInfo latLngInfo2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            latLngInfo = mapBoundingBox.mapTopLeft;
        }
        if ((i11 & 2) != 0) {
            latLngInfo2 = mapBoundingBox.mapBottomRight;
        }
        return mapBoundingBox.copy(latLngInfo, latLngInfo2);
    }

    public static final /* synthetic */ void write$Self$app(MapBoundingBox self, b output, SerialDescriptor serialDesc) {
        if (output.C(serialDesc) || self.mapTopLeft != null) {
            output.r(serialDesc, 0, LatLngInfo$$serializer.INSTANCE, self.mapTopLeft);
        }
        if (!output.C(serialDesc) && self.mapBottomRight == null) {
            return;
        }
        output.r(serialDesc, 1, LatLngInfo$$serializer.INSTANCE, self.mapBottomRight);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final LatLngInfo getMapTopLeft() {
        return this.mapTopLeft;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final LatLngInfo getMapBottomRight() {
        return this.mapBottomRight;
    }

    @NotNull
    public final MapBoundingBox copy(@Nullable LatLngInfo mapTopLeft, @Nullable LatLngInfo mapBottomRight) {
        return new MapBoundingBox(mapTopLeft, mapBottomRight);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MapBoundingBox)) {
            return false;
        }
        MapBoundingBox mapBoundingBox = (MapBoundingBox) other;
        return Intrinsics.areEqual(this.mapTopLeft, mapBoundingBox.mapTopLeft) && Intrinsics.areEqual(this.mapBottomRight, mapBoundingBox.mapBottomRight);
    }

    @Nullable
    public final LatLngInfo getMapBottomRight() {
        return this.mapBottomRight;
    }

    @Nullable
    public final LatLngInfo getMapTopLeft() {
        return this.mapTopLeft;
    }

    public int hashCode() {
        LatLngInfo latLngInfo = this.mapTopLeft;
        int iHashCode = (latLngInfo == null ? 0 : latLngInfo.hashCode()) * 31;
        LatLngInfo latLngInfo2 = this.mapBottomRight;
        return iHashCode + (latLngInfo2 != null ? latLngInfo2.hashCode() : 0);
    }

    public final void setMapBottomRight(@Nullable LatLngInfo latLngInfo) {
        this.mapBottomRight = latLngInfo;
    }

    public final void setMapTopLeft(@Nullable LatLngInfo latLngInfo) {
        this.mapTopLeft = latLngInfo;
    }

    @NotNull
    public String toString() {
        return "MapBoundingBox(mapTopLeft=" + this.mapTopLeft + ", mapBottomRight=" + this.mapBottomRight + ")";
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/mapService/MapBoundingBox$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/mapService/MapBoundingBox;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return MapBoundingBox$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @g("bottom_right")
    public static /* synthetic */ void getMapBottomRight$annotations() {
    }

    @g("top_left")
    public static /* synthetic */ void getMapTopLeft$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MapBoundingBox() {
        this((LatLngInfo) null, (LatLngInfo) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public MapBoundingBox(@Nullable LatLngInfo latLngInfo, @Nullable LatLngInfo latLngInfo2) {
        this.mapTopLeft = latLngInfo;
        this.mapBottomRight = latLngInfo2;
    }

    public /* synthetic */ MapBoundingBox(LatLngInfo latLngInfo, LatLngInfo latLngInfo2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : latLngInfo, (i11 & 2) != 0 ? null : latLngInfo2);
    }
}
