package com.app.tgtg.model.remote.manufacturer.response;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/app/tgtg/model/remote/manufacturer/response/ParcelMdoCategory;", "", "mdoCategoryType", "Lcom/app/tgtg/model/remote/manufacturer/response/DeliveryOptionMethod;", "mdoPickupOptions", "", "Lcom/app/tgtg/model/remote/manufacturer/response/PickupOptionLocal;", "<init>", "(Lcom/app/tgtg/model/remote/manufacturer/response/DeliveryOptionMethod;Ljava/util/List;)V", "getMdoCategoryType", "()Lcom/app/tgtg/model/remote/manufacturer/response/DeliveryOptionMethod;", "getMdoPickupOptions", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class ParcelMdoCategory {
    public static final int $stable = 8;

    @Nullable
    private final DeliveryOptionMethod mdoCategoryType;

    @NotNull
    private final List<PickupOptionLocal> mdoPickupOptions;

    public ParcelMdoCategory(@Nullable DeliveryOptionMethod deliveryOptionMethod, @NotNull List<PickupOptionLocal> list) {
        list.getClass();
        this.mdoCategoryType = deliveryOptionMethod;
        this.mdoPickupOptions = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ParcelMdoCategory copy$default(ParcelMdoCategory parcelMdoCategory, DeliveryOptionMethod deliveryOptionMethod, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            deliveryOptionMethod = parcelMdoCategory.mdoCategoryType;
        }
        if ((i11 & 2) != 0) {
            list = parcelMdoCategory.mdoPickupOptions;
        }
        return parcelMdoCategory.copy(deliveryOptionMethod, list);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DeliveryOptionMethod getMdoCategoryType() {
        return this.mdoCategoryType;
    }

    @NotNull
    public final List<PickupOptionLocal> component2() {
        return this.mdoPickupOptions;
    }

    @NotNull
    public final ParcelMdoCategory copy(@Nullable DeliveryOptionMethod mdoCategoryType, @NotNull List<PickupOptionLocal> mdoPickupOptions) {
        mdoPickupOptions.getClass();
        return new ParcelMdoCategory(mdoCategoryType, mdoPickupOptions);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ParcelMdoCategory)) {
            return false;
        }
        ParcelMdoCategory parcelMdoCategory = (ParcelMdoCategory) other;
        return this.mdoCategoryType == parcelMdoCategory.mdoCategoryType && Intrinsics.areEqual(this.mdoPickupOptions, parcelMdoCategory.mdoPickupOptions);
    }

    @Nullable
    public final DeliveryOptionMethod getMdoCategoryType() {
        return this.mdoCategoryType;
    }

    @NotNull
    public final List<PickupOptionLocal> getMdoPickupOptions() {
        return this.mdoPickupOptions;
    }

    public int hashCode() {
        DeliveryOptionMethod deliveryOptionMethod = this.mdoCategoryType;
        return this.mdoPickupOptions.hashCode() + ((deliveryOptionMethod == null ? 0 : deliveryOptionMethod.hashCode()) * 31);
    }

    @NotNull
    public String toString() {
        return "ParcelMdoCategory(mdoCategoryType=" + this.mdoCategoryType + ", mdoPickupOptions=" + this.mdoPickupOptions + ")";
    }

    public /* synthetic */ ParcelMdoCategory(DeliveryOptionMethod deliveryOptionMethod, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : deliveryOptionMethod, list);
    }
}
