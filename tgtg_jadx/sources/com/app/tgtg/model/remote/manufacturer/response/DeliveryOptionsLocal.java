package com.app.tgtg.model.remote.manufacturer.response;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0006HÖ\u0081\u0004R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/app/tgtg/model/remote/manufacturer/response/DeliveryOptionsLocal;", "", "parcelMdoCategories", "", "Lcom/app/tgtg/model/remote/manufacturer/response/ParcelMdoCategory;", "preselectedDeliveryOptionId", "", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "getParcelMdoCategories", "()Ljava/util/List;", "getPreselectedDeliveryOptionId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class DeliveryOptionsLocal {
    public static final int $stable = 8;

    @Nullable
    private final List<ParcelMdoCategory> parcelMdoCategories;

    @Nullable
    private final String preselectedDeliveryOptionId;

    public /* synthetic */ DeliveryOptionsLocal(List list, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : list, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeliveryOptionsLocal copy$default(DeliveryOptionsLocal deliveryOptionsLocal, List list, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = deliveryOptionsLocal.parcelMdoCategories;
        }
        if ((i11 & 2) != 0) {
            str = deliveryOptionsLocal.preselectedDeliveryOptionId;
        }
        return deliveryOptionsLocal.copy(list, str);
    }

    @Nullable
    public final List<ParcelMdoCategory> component1() {
        return this.parcelMdoCategories;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPreselectedDeliveryOptionId() {
        return this.preselectedDeliveryOptionId;
    }

    @NotNull
    public final DeliveryOptionsLocal copy(@Nullable List<ParcelMdoCategory> parcelMdoCategories, @Nullable String preselectedDeliveryOptionId) {
        return new DeliveryOptionsLocal(parcelMdoCategories, preselectedDeliveryOptionId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeliveryOptionsLocal)) {
            return false;
        }
        DeliveryOptionsLocal deliveryOptionsLocal = (DeliveryOptionsLocal) other;
        return Intrinsics.areEqual(this.parcelMdoCategories, deliveryOptionsLocal.parcelMdoCategories) && Intrinsics.areEqual(this.preselectedDeliveryOptionId, deliveryOptionsLocal.preselectedDeliveryOptionId);
    }

    @Nullable
    public final List<ParcelMdoCategory> getParcelMdoCategories() {
        return this.parcelMdoCategories;
    }

    @Nullable
    public final String getPreselectedDeliveryOptionId() {
        return this.preselectedDeliveryOptionId;
    }

    public int hashCode() {
        List<ParcelMdoCategory> list = this.parcelMdoCategories;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.preselectedDeliveryOptionId;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "DeliveryOptionsLocal(parcelMdoCategories=" + this.parcelMdoCategories + ", preselectedDeliveryOptionId=" + this.preselectedDeliveryOptionId + ")";
    }

    public DeliveryOptionsLocal(@Nullable List<ParcelMdoCategory> list, @Nullable String str) {
        this.parcelMdoCategories = list;
        this.preselectedDeliveryOptionId = str;
    }
}
