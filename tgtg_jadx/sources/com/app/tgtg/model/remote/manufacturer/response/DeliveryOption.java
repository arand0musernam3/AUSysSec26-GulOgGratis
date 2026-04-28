package com.app.tgtg.model.remote.manufacturer.response;

import com.app.tgtg.model.remote.item.Picture;
import com.app.tgtg.model.remote.item.Picture$$serializer;
import com.app.tgtg.model.remote.payment.Price;
import com.app.tgtg.model.remote.payment.Price$$serializer;
import eu.a;
import i90.g;
import i90.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.c1;
import m90.d;
import m90.m1;
import m90.r1;
import m90.v;
import o30.f0;
import org.bouncycastle.i18n.MessageBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.j;
import u70.l;
import u70.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b!\b\u0087\b\u0018\u0000 W2\u00020\u0001:\u0002XWBs\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\u0010\u0010\u0012\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014B\u0087\u0001\b\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\u0010\u0010\u0012\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u0010\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0013\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b#\u0010\u001dJ\u0012\u0010$\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b$\u0010\u001dJ\u0012\u0010%\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b'\u0010\u001dJ\u001a\u0010(\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0090\u0001\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0012\b\u0002\u0010\u0012\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b,\u0010\u001dJ\u0010\u0010-\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b-\u0010.J\u001a\u00101\u001a\u0002002\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b1\u00102J'\u0010;\u001a\u0002082\u0006\u00103\u001a\u00020\u00002\u0006\u00105\u001a\u0002042\u0006\u00107\u001a\u000206H\u0001¢\u0006\u0004\b9\u0010:R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010<\u0012\u0004\b>\u0010?\u001a\u0004\b=\u0010\u001bR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010@\u0012\u0004\bB\u0010?\u001a\u0004\bA\u0010\u001dR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010@\u0012\u0004\bD\u0010?\u001a\u0004\bC\u0010\u001dR\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010E\u0012\u0004\bG\u0010?\u001a\u0004\bF\u0010 R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010H\u0012\u0004\bJ\u0010?\u001a\u0004\bI\u0010\"R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010@\u0012\u0004\bL\u0010?\u001a\u0004\bK\u0010\u001dR\"\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010@\u0012\u0004\bN\u0010?\u001a\u0004\bM\u0010\u001dR\"\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010O\u0012\u0004\bQ\u0010?\u001a\u0004\bP\u0010&R\"\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010@\u0012\u0004\bS\u0010?\u001a\u0004\bR\u0010\u001dR*\u0010\u0012\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010T\u0012\u0004\bV\u0010?\u001a\u0004\bU\u0010)¨\u0006Y"}, d2 = {"Lcom/app/tgtg/model/remote/manufacturer/response/DeliveryOption;", "", "Lcom/app/tgtg/model/remote/manufacturer/response/DeliveryOptionMethod;", "deliveryMethod", "", "deliveryOptionId", MessageBundle.TITLE_ENTRY, "Lcom/app/tgtg/model/remote/item/Picture;", "carrierIcon", "Lcom/app/tgtg/model/remote/payment/Price;", "price", "expectedDeliveryTime", "cutOffTime", "", "distance", "address", "", "Lcom/app/tgtg/model/remote/manufacturer/response/OpeningHourPeriod;", "openingHourPeriod", "<init>", "(Lcom/app/tgtg/model/remote/manufacturer/response/DeliveryOptionMethod;Ljava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/item/Picture;Lcom/app/tgtg/model/remote/payment/Price;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILcom/app/tgtg/model/remote/manufacturer/response/DeliveryOptionMethod;Ljava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/item/Picture;Lcom/app/tgtg/model/remote/payment/Price;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/util/List;Lm90/m1;)V", "component1", "()Lcom/app/tgtg/model/remote/manufacturer/response/DeliveryOptionMethod;", "component2", "()Ljava/lang/String;", "component3", "component4", "()Lcom/app/tgtg/model/remote/item/Picture;", "component5", "()Lcom/app/tgtg/model/remote/payment/Price;", "component6", "component7", "component8", "()Ljava/lang/Double;", "component9", "component10", "()Ljava/util/List;", "copy", "(Lcom/app/tgtg/model/remote/manufacturer/response/DeliveryOptionMethod;Ljava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/item/Picture;Lcom/app/tgtg/model/remote/payment/Price;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/util/List;)Lcom/app/tgtg/model/remote/manufacturer/response/DeliveryOption;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/manufacturer/response/DeliveryOption;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lcom/app/tgtg/model/remote/manufacturer/response/DeliveryOptionMethod;", "getDeliveryMethod", "getDeliveryMethod$annotations", "()V", "Ljava/lang/String;", "getDeliveryOptionId", "getDeliveryOptionId$annotations", "getTitle", "getTitle$annotations", "Lcom/app/tgtg/model/remote/item/Picture;", "getCarrierIcon", "getCarrierIcon$annotations", "Lcom/app/tgtg/model/remote/payment/Price;", "getPrice", "getPrice$annotations", "getExpectedDeliveryTime", "getExpectedDeliveryTime$annotations", "getCutOffTime", "getCutOffTime$annotations", "Ljava/lang/Double;", "getDistance", "getDistance$annotations", "getAddress", "getAddress$annotations", "Ljava/util/List;", "getOpeningHourPeriod", "getOpeningHourPeriod$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class DeliveryOption {

    @Nullable
    private final String address;

    @Nullable
    private final Picture carrierIcon;

    @Nullable
    private final String cutOffTime;

    @Nullable
    private final DeliveryOptionMethod deliveryMethod;

    @Nullable
    private final String deliveryOptionId;

    @Nullable
    private final Double distance;

    @Nullable
    private final String expectedDeliveryTime;

    @Nullable
    private final List<OpeningHourPeriod> openingHourPeriod;

    @Nullable
    private final Price price;

    @Nullable
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private static final j[] $childSerializers = {null, null, null, null, null, null, null, null, null, l.a(m.PUBLICATION, new a(20))};

    public /* synthetic */ DeliveryOption(int i11, DeliveryOptionMethod deliveryOptionMethod, String str, String str2, Picture picture, Price price, String str3, String str4, Double d3, String str5, List list, m1 m1Var) {
        if (1023 != (i11 & 1023)) {
            c1.j(i11, 1023, DeliveryOption$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.deliveryMethod = deliveryOptionMethod;
        this.deliveryOptionId = str;
        this.title = str2;
        this.carrierIcon = picture;
        this.price = price;
        this.expectedDeliveryTime = str3;
        this.cutOffTime = str4;
        this.distance = d3;
        this.address = str5;
        this.openingHourPeriod = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new d(f0.B(OpeningHourPeriod$$serializer.INSTANCE), 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeliveryOption copy$default(DeliveryOption deliveryOption, DeliveryOptionMethod deliveryOptionMethod, String str, String str2, Picture picture, Price price, String str3, String str4, Double d3, String str5, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            deliveryOptionMethod = deliveryOption.deliveryMethod;
        }
        if ((i11 & 2) != 0) {
            str = deliveryOption.deliveryOptionId;
        }
        if ((i11 & 4) != 0) {
            str2 = deliveryOption.title;
        }
        if ((i11 & 8) != 0) {
            picture = deliveryOption.carrierIcon;
        }
        if ((i11 & 16) != 0) {
            price = deliveryOption.price;
        }
        if ((i11 & 32) != 0) {
            str3 = deliveryOption.expectedDeliveryTime;
        }
        if ((i11 & 64) != 0) {
            str4 = deliveryOption.cutOffTime;
        }
        if ((i11 & 128) != 0) {
            d3 = deliveryOption.distance;
        }
        if ((i11 & 256) != 0) {
            str5 = deliveryOption.address;
        }
        if ((i11 & 512) != 0) {
            list = deliveryOption.openingHourPeriod;
        }
        String str6 = str5;
        List list2 = list;
        String str7 = str4;
        Double d11 = d3;
        Price price2 = price;
        String str8 = str3;
        return deliveryOption.copy(deliveryOptionMethod, str, str2, picture, price2, str8, str7, d11, str6, list2);
    }

    public static final /* synthetic */ void write$Self$app(DeliveryOption self, b output, SerialDescriptor serialDesc) {
        j[] jVarArr = $childSerializers;
        output.r(serialDesc, 0, DeliveryOptionMethodSerializer.INSTANCE, self.deliveryMethod);
        r1 r1Var = r1.f29848a;
        output.r(serialDesc, 1, r1Var, self.deliveryOptionId);
        output.r(serialDesc, 2, r1Var, self.title);
        output.r(serialDesc, 3, Picture$$serializer.INSTANCE, self.carrierIcon);
        output.r(serialDesc, 4, Price$$serializer.INSTANCE, self.price);
        output.r(serialDesc, 5, r1Var, self.expectedDeliveryTime);
        output.r(serialDesc, 6, r1Var, self.cutOffTime);
        output.r(serialDesc, 7, v.f29868a, self.distance);
        output.r(serialDesc, 8, r1Var, self.address);
        output.r(serialDesc, 9, (KSerializer) jVarArr[9].getValue(), self.openingHourPeriod);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DeliveryOptionMethod getDeliveryMethod() {
        return this.deliveryMethod;
    }

    @Nullable
    public final List<OpeningHourPeriod> component10() {
        return this.openingHourPeriod;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDeliveryOptionId() {
        return this.deliveryOptionId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Picture getCarrierIcon() {
        return this.carrierIcon;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Price getPrice() {
        return this.price;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getExpectedDeliveryTime() {
        return this.expectedDeliveryTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getCutOffTime() {
        return this.cutOffTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Double getDistance() {
        return this.distance;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    @NotNull
    public final DeliveryOption copy(@Nullable DeliveryOptionMethod deliveryMethod, @Nullable String deliveryOptionId, @Nullable String title, @Nullable Picture carrierIcon, @Nullable Price price, @Nullable String expectedDeliveryTime, @Nullable String cutOffTime, @Nullable Double distance, @Nullable String address, @Nullable List<OpeningHourPeriod> openingHourPeriod) {
        return new DeliveryOption(deliveryMethod, deliveryOptionId, title, carrierIcon, price, expectedDeliveryTime, cutOffTime, distance, address, openingHourPeriod);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeliveryOption)) {
            return false;
        }
        DeliveryOption deliveryOption = (DeliveryOption) other;
        return this.deliveryMethod == deliveryOption.deliveryMethod && Intrinsics.areEqual(this.deliveryOptionId, deliveryOption.deliveryOptionId) && Intrinsics.areEqual(this.title, deliveryOption.title) && Intrinsics.areEqual(this.carrierIcon, deliveryOption.carrierIcon) && Intrinsics.areEqual(this.price, deliveryOption.price) && Intrinsics.areEqual(this.expectedDeliveryTime, deliveryOption.expectedDeliveryTime) && Intrinsics.areEqual(this.cutOffTime, deliveryOption.cutOffTime) && Intrinsics.areEqual((Object) this.distance, (Object) deliveryOption.distance) && Intrinsics.areEqual(this.address, deliveryOption.address) && Intrinsics.areEqual(this.openingHourPeriod, deliveryOption.openingHourPeriod);
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

    @Nullable
    public final DeliveryOptionMethod getDeliveryMethod() {
        return this.deliveryMethod;
    }

    @Nullable
    public final String getDeliveryOptionId() {
        return this.deliveryOptionId;
    }

    @Nullable
    public final Double getDistance() {
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
    public final Price getPrice() {
        return this.price;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        DeliveryOptionMethod deliveryOptionMethod = this.deliveryMethod;
        int iHashCode = (deliveryOptionMethod == null ? 0 : deliveryOptionMethod.hashCode()) * 31;
        String str = this.deliveryOptionId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.title;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Picture picture = this.carrierIcon;
        int iHashCode4 = (iHashCode3 + (picture == null ? 0 : picture.hashCode())) * 31;
        Price price = this.price;
        int iHashCode5 = (iHashCode4 + (price == null ? 0 : price.hashCode())) * 31;
        String str3 = this.expectedDeliveryTime;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.cutOffTime;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Double d3 = this.distance;
        int iHashCode8 = (iHashCode7 + (d3 == null ? 0 : d3.hashCode())) * 31;
        String str5 = this.address;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<OpeningHourPeriod> list = this.openingHourPeriod;
        return iHashCode9 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "DeliveryOption(deliveryMethod=" + this.deliveryMethod + ", deliveryOptionId=" + this.deliveryOptionId + ", title=" + this.title + ", carrierIcon=" + this.carrierIcon + ", price=" + this.price + ", expectedDeliveryTime=" + this.expectedDeliveryTime + ", cutOffTime=" + this.cutOffTime + ", distance=" + this.distance + ", address=" + this.address + ", openingHourPeriod=" + this.openingHourPeriod + ")";
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/manufacturer/response/DeliveryOption$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/manufacturer/response/DeliveryOption;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return DeliveryOption$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @g("address")
    public static /* synthetic */ void getAddress$annotations() {
    }

    @g("carrier_icon")
    public static /* synthetic */ void getCarrierIcon$annotations() {
    }

    @g("cutoff_time")
    public static /* synthetic */ void getCutOffTime$annotations() {
    }

    @g("delivery_method")
    public static /* synthetic */ void getDeliveryMethod$annotations() {
    }

    @g("delivery_option_id")
    public static /* synthetic */ void getDeliveryOptionId$annotations() {
    }

    @g("distance")
    public static /* synthetic */ void getDistance$annotations() {
    }

    @g("expected_delivery_time")
    public static /* synthetic */ void getExpectedDeliveryTime$annotations() {
    }

    @g("opening_hour_periods")
    public static /* synthetic */ void getOpeningHourPeriod$annotations() {
    }

    @g("price")
    public static /* synthetic */ void getPrice$annotations() {
    }

    @g(MessageBundle.TITLE_ENTRY)
    public static /* synthetic */ void getTitle$annotations() {
    }

    public DeliveryOption(@Nullable DeliveryOptionMethod deliveryOptionMethod, @Nullable String str, @Nullable String str2, @Nullable Picture picture, @Nullable Price price, @Nullable String str3, @Nullable String str4, @Nullable Double d3, @Nullable String str5, @Nullable List<OpeningHourPeriod> list) {
        this.deliveryMethod = deliveryOptionMethod;
        this.deliveryOptionId = str;
        this.title = str2;
        this.carrierIcon = picture;
        this.price = price;
        this.expectedDeliveryTime = str3;
        this.cutOffTime = str4;
        this.distance = d3;
        this.address = str5;
        this.openingHourPeriod = list;
    }
}
