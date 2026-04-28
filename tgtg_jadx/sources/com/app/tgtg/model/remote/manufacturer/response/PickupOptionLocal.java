package com.app.tgtg.model.remote.manufacturer.response;

import com.app.tgtg.model.remote.ParcelDeliveryOptionId;
import com.app.tgtg.model.remote.item.Picture;
import com.app.tgtg.model.remote.payment.Price;
import e0.f;
import j4.s;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.MessageBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\u0010\u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010!\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\"\u0010\u0014J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0013\u0010*\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u000fHÆ\u0003J\u0082\u0001\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\u0012\b\u0002\u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b,\u0010-J\u0014\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u00101\u001a\u000202HÖ\u0081\u0004J\n\u00103\u001a\u00020\u0005HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014R\u001b\u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u00064"}, d2 = {"Lcom/app/tgtg/model/remote/manufacturer/response/PickupOptionLocal;", "", "deliveryOptionId", "Lcom/app/tgtg/model/remote/ParcelDeliveryOptionId;", MessageBundle.TITLE_ENTRY, "", "carrierIcon", "Lcom/app/tgtg/model/remote/item/Picture;", "deliveryPrice", "Lcom/app/tgtg/model/remote/payment/Price;", "expectedDeliveryTime", "cutOffTime", "distance", "address", "openingHourPeriod", "", "Lcom/app/tgtg/model/remote/manufacturer/response/OpeningHourPeriod;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/item/Picture;Lcom/app/tgtg/model/remote/payment/Price;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getDeliveryOptionId-Viwp_pU", "()Ljava/lang/String;", "Ljava/lang/String;", "getTitle", "getCarrierIcon", "()Lcom/app/tgtg/model/remote/item/Picture;", "getDeliveryPrice", "()Lcom/app/tgtg/model/remote/payment/Price;", "getExpectedDeliveryTime", "getCutOffTime", "getDistance", "getAddress", "getOpeningHourPeriod", "()Ljava/util/List;", "component1", "component1-Viwp_pU", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "copy-1WYfV3w", "(Ljava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/item/Picture;Lcom/app/tgtg/model/remote/payment/Price;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/app/tgtg/model/remote/manufacturer/response/PickupOptionLocal;", "equals", "", "other", "hashCode", "", "toString", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class PickupOptionLocal {
    public static final int $stable = 8;

    @Nullable
    private final String address;

    @Nullable
    private final Picture carrierIcon;

    @Nullable
    private final String cutOffTime;

    @NotNull
    private final String deliveryOptionId;

    @Nullable
    private final Price deliveryPrice;

    @Nullable
    private final String distance;

    @Nullable
    private final String expectedDeliveryTime;

    @Nullable
    private final List<OpeningHourPeriod> openingHourPeriod;

    @Nullable
    private final String title;

    private PickupOptionLocal(String str, String str2, Picture picture, Price price, String str3, String str4, String str5, String str6, List<OpeningHourPeriod> list) {
        str.getClass();
        this.deliveryOptionId = str;
        this.title = str2;
        this.carrierIcon = picture;
        this.deliveryPrice = price;
        this.expectedDeliveryTime = str3;
        this.cutOffTime = str4;
        this.distance = str5;
        this.address = str6;
        this.openingHourPeriod = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: copy-1WYfV3w$default, reason: not valid java name */
    public static /* synthetic */ PickupOptionLocal m400copy1WYfV3w$default(PickupOptionLocal pickupOptionLocal, String str, String str2, Picture picture, Price price, String str3, String str4, String str5, String str6, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = pickupOptionLocal.deliveryOptionId;
        }
        if ((i11 & 2) != 0) {
            str2 = pickupOptionLocal.title;
        }
        if ((i11 & 4) != 0) {
            picture = pickupOptionLocal.carrierIcon;
        }
        if ((i11 & 8) != 0) {
            price = pickupOptionLocal.deliveryPrice;
        }
        if ((i11 & 16) != 0) {
            str3 = pickupOptionLocal.expectedDeliveryTime;
        }
        if ((i11 & 32) != 0) {
            str4 = pickupOptionLocal.cutOffTime;
        }
        if ((i11 & 64) != 0) {
            str5 = pickupOptionLocal.distance;
        }
        if ((i11 & 128) != 0) {
            str6 = pickupOptionLocal.address;
        }
        if ((i11 & 256) != 0) {
            list = pickupOptionLocal.openingHourPeriod;
        }
        String str7 = str6;
        List list2 = list;
        String str8 = str4;
        String str9 = str5;
        String str10 = str3;
        Picture picture2 = picture;
        return pickupOptionLocal.m402copy1WYfV3w(str, str2, picture2, price, str10, str8, str9, str7, list2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1-Viwp_pU, reason: not valid java name and from getter */
    public final String getDeliveryOptionId() {
        return this.deliveryOptionId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Picture getCarrierIcon() {
        return this.carrierIcon;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Price getDeliveryPrice() {
        return this.deliveryPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getExpectedDeliveryTime() {
        return this.expectedDeliveryTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCutOffTime() {
        return this.cutOffTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getDistance() {
        return this.distance;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    @Nullable
    public final List<OpeningHourPeriod> component9() {
        return this.openingHourPeriod;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-1WYfV3w, reason: not valid java name */
    public final PickupOptionLocal m402copy1WYfV3w(@NotNull String deliveryOptionId, @Nullable String title, @Nullable Picture carrierIcon, @Nullable Price deliveryPrice, @Nullable String expectedDeliveryTime, @Nullable String cutOffTime, @Nullable String distance, @Nullable String address, @Nullable List<OpeningHourPeriod> openingHourPeriod) {
        deliveryOptionId.getClass();
        return new PickupOptionLocal(deliveryOptionId, title, carrierIcon, deliveryPrice, expectedDeliveryTime, cutOffTime, distance, address, openingHourPeriod, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PickupOptionLocal)) {
            return false;
        }
        PickupOptionLocal pickupOptionLocal = (PickupOptionLocal) other;
        return ParcelDeliveryOptionId.m225equalsimpl0(this.deliveryOptionId, pickupOptionLocal.deliveryOptionId) && Intrinsics.areEqual(this.title, pickupOptionLocal.title) && Intrinsics.areEqual(this.carrierIcon, pickupOptionLocal.carrierIcon) && Intrinsics.areEqual(this.deliveryPrice, pickupOptionLocal.deliveryPrice) && Intrinsics.areEqual(this.expectedDeliveryTime, pickupOptionLocal.expectedDeliveryTime) && Intrinsics.areEqual(this.cutOffTime, pickupOptionLocal.cutOffTime) && Intrinsics.areEqual(this.distance, pickupOptionLocal.distance) && Intrinsics.areEqual(this.address, pickupOptionLocal.address) && Intrinsics.areEqual(this.openingHourPeriod, pickupOptionLocal.openingHourPeriod);
    }

    @Nullable
    public final String getAddress() {
        return this.address;
    }

    @Nullable
    public final Picture getCarrierIcon() {
        return this.carrierIcon;
    }

    @Nullable
    public final String getCutOffTime() {
        return this.cutOffTime;
    }

    @NotNull
    /* JADX INFO: renamed from: getDeliveryOptionId-Viwp_pU, reason: not valid java name */
    public final String m403getDeliveryOptionIdViwp_pU() {
        return this.deliveryOptionId;
    }

    @Nullable
    public final Price getDeliveryPrice() {
        return this.deliveryPrice;
    }

    @Nullable
    public final String getDistance() {
        return this.distance;
    }

    @Nullable
    public final String getExpectedDeliveryTime() {
        return this.expectedDeliveryTime;
    }

    @Nullable
    public final List<OpeningHourPeriod> getOpeningHourPeriod() {
        return this.openingHourPeriod;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iM226hashCodeimpl = ParcelDeliveryOptionId.m226hashCodeimpl(this.deliveryOptionId) * 31;
        String str = this.title;
        int iHashCode = (iM226hashCodeimpl + (str == null ? 0 : str.hashCode())) * 31;
        Picture picture = this.carrierIcon;
        int iHashCode2 = (iHashCode + (picture == null ? 0 : picture.hashCode())) * 31;
        Price price = this.deliveryPrice;
        int iHashCode3 = (iHashCode2 + (price == null ? 0 : price.hashCode())) * 31;
        String str2 = this.expectedDeliveryTime;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.cutOffTime;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.distance;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.address;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<OpeningHourPeriod> list = this.openingHourPeriod;
        return iHashCode7 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String strM227toStringimpl = ParcelDeliveryOptionId.m227toStringimpl(this.deliveryOptionId);
        String str = this.title;
        Picture picture = this.carrierIcon;
        Price price = this.deliveryPrice;
        String str2 = this.expectedDeliveryTime;
        String str3 = this.cutOffTime;
        String str4 = this.distance;
        String str5 = this.address;
        List<OpeningHourPeriod> list = this.openingHourPeriod;
        StringBuilder sbT = f.t("PickupOptionLocal(deliveryOptionId=", strM227toStringimpl, ", title=", str, ", carrierIcon=");
        sbT.append(picture);
        sbT.append(", deliveryPrice=");
        sbT.append(price);
        sbT.append(", expectedDeliveryTime=");
        s.A(sbT, str2, ", cutOffTime=", str3, ", distance=");
        s.A(sbT, str4, ", address=", str5, ", openingHourPeriod=");
        return f.p(sbT, list, ")");
    }

    public /* synthetic */ PickupOptionLocal(String str, String str2, Picture picture, Price price, String str3, String str4, String str5, String str6, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, picture, price, str3, str4, str5, str6, list);
    }
}
