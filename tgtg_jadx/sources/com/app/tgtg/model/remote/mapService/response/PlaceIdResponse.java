package com.app.tgtg.model.remote.mapService.response;

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
import m90.c1;
import m90.m1;
import m90.r1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J(\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010#\u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\u0017R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010'\u0012\u0004\b)\u0010&\u001a\u0004\b(\u0010\u0019¨\u0006,"}, d2 = {"Lcom/app/tgtg/model/remote/mapService/response/PlaceIdResponse;", "", "", "displayName", "Lcom/app/tgtg/model/remote/item/LatLngInfo;", "center", "<init>", "(Ljava/lang/String;Lcom/app/tgtg/model/remote/item/LatLngInfo;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/app/tgtg/model/remote/item/LatLngInfo;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/mapService/response/PlaceIdResponse;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/app/tgtg/model/remote/item/LatLngInfo;", "copy", "(Ljava/lang/String;Lcom/app/tgtg/model/remote/item/LatLngInfo;)Lcom/app/tgtg/model/remote/mapService/response/PlaceIdResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDisplayName", "getDisplayName$annotations", "()V", "Lcom/app/tgtg/model/remote/item/LatLngInfo;", "getCenter", "getCenter$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class PlaceIdResponse {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final LatLngInfo center;

    @Nullable
    private final String displayName;

    public /* synthetic */ PlaceIdResponse(int i11, String str, LatLngInfo latLngInfo, m1 m1Var) {
        if (3 != (i11 & 3)) {
            c1.j(i11, 3, PlaceIdResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.displayName = str;
        this.center = latLngInfo;
    }

    public static /* synthetic */ PlaceIdResponse copy$default(PlaceIdResponse placeIdResponse, String str, LatLngInfo latLngInfo, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = placeIdResponse.displayName;
        }
        if ((i11 & 2) != 0) {
            latLngInfo = placeIdResponse.center;
        }
        return placeIdResponse.copy(str, latLngInfo);
    }

    public static final /* synthetic */ void write$Self$app(PlaceIdResponse self, b output, SerialDescriptor serialDesc) {
        output.r(serialDesc, 0, r1.f29848a, self.displayName);
        output.r(serialDesc, 1, LatLngInfo$$serializer.INSTANCE, self.center);
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

    @NotNull
    public final PlaceIdResponse copy(@Nullable String displayName, @Nullable LatLngInfo center) {
        return new PlaceIdResponse(displayName, center);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlaceIdResponse)) {
            return false;
        }
        PlaceIdResponse placeIdResponse = (PlaceIdResponse) other;
        return Intrinsics.areEqual(this.displayName, placeIdResponse.displayName) && Intrinsics.areEqual(this.center, placeIdResponse.center);
    }

    @Nullable
    public final LatLngInfo getCenter() {
        return this.center;
    }

    @Nullable
    public final String getDisplayName() {
        return this.displayName;
    }

    public int hashCode() {
        String str = this.displayName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        LatLngInfo latLngInfo = this.center;
        return iHashCode + (latLngInfo != null ? latLngInfo.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "PlaceIdResponse(displayName=" + this.displayName + ", center=" + this.center + ")";
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/mapService/response/PlaceIdResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/mapService/response/PlaceIdResponse;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return PlaceIdResponse$$serializer.INSTANCE;
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

    public PlaceIdResponse(@Nullable String str, @Nullable LatLngInfo latLngInfo) {
        this.displayName = str;
        this.center = latLngInfo;
    }
}
