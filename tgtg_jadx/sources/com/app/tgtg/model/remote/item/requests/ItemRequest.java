package com.app.tgtg.model.remote.item.requests;

import com.app.tgtg.model.remote.item.LatLngInfo;
import com.app.tgtg.model.remote.item.LatLngInfo$$serializer;
import com.google.android.gms.maps.model.LatLng;
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
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002('B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÂ\u0003¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0017\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0017\u0010\u0019J\u001c\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\u0003\u0010$\u0012\u0004\b%\u0010&¨\u0006)"}, d2 = {"Lcom/app/tgtg/model/remote/item/requests/ItemRequest;", "", "Lcom/app/tgtg/model/remote/item/LatLngInfo;", "origin", "<init>", "(Lcom/app/tgtg/model/remote/item/LatLngInfo;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILcom/app/tgtg/model/remote/item/LatLngInfo;Lm90/m1;)V", "component1", "()Lcom/app/tgtg/model/remote/item/LatLngInfo;", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/item/requests/ItemRequest;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lcom/google/android/gms/maps/model/LatLng;", "setOrigin", "(Lcom/google/android/gms/maps/model/LatLng;)Lcom/app/tgtg/model/remote/item/requests/ItemRequest;", "(Lcom/app/tgtg/model/remote/item/LatLngInfo;)Lcom/app/tgtg/model/remote/item/requests/ItemRequest;", "copy", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/app/tgtg/model/remote/item/LatLngInfo;", "getOrigin$annotations", "()V", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class ItemRequest {

    @Nullable
    private LatLngInfo origin;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ ItemRequest(int i11, LatLngInfo latLngInfo, m1 m1Var) {
        if ((i11 & 1) == 0) {
            this.origin = null;
        } else {
            this.origin = latLngInfo;
        }
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    private final LatLngInfo getOrigin() {
        return this.origin;
    }

    public static /* synthetic */ ItemRequest copy$default(ItemRequest itemRequest, LatLngInfo latLngInfo, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            latLngInfo = itemRequest.origin;
        }
        return itemRequest.copy(latLngInfo);
    }

    public static final /* synthetic */ void write$Self$app(ItemRequest self, b output, SerialDescriptor serialDesc) {
        if (!output.C(serialDesc) && self.origin == null) {
            return;
        }
        output.r(serialDesc, 0, LatLngInfo$$serializer.INSTANCE, self.origin);
    }

    @NotNull
    public final ItemRequest copy(@Nullable LatLngInfo origin) {
        return new ItemRequest(origin);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ItemRequest) && Intrinsics.areEqual(this.origin, ((ItemRequest) other).origin);
    }

    public int hashCode() {
        LatLngInfo latLngInfo = this.origin;
        if (latLngInfo == null) {
            return 0;
        }
        return latLngInfo.hashCode();
    }

    @NotNull
    public final ItemRequest setOrigin(@NotNull LatLng origin) {
        origin.getClass();
        this.origin = new LatLngInfo(origin.f12145a, origin.f12146b);
        return this;
    }

    @NotNull
    public String toString() {
        return "ItemRequest(origin=" + this.origin + ")";
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/item/requests/ItemRequest$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/item/requests/ItemRequest;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return ItemRequest$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ItemRequest() {
        this((LatLngInfo) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public ItemRequest(@Nullable LatLngInfo latLngInfo) {
        this.origin = latLngInfo;
    }

    @g("origin")
    private static /* synthetic */ void getOrigin$annotations() {
    }

    @NotNull
    public final ItemRequest setOrigin(@Nullable LatLngInfo origin) {
        this.origin = origin;
        return this;
    }

    public /* synthetic */ ItemRequest(LatLngInfo latLngInfo, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : latLngInfo);
    }
}
