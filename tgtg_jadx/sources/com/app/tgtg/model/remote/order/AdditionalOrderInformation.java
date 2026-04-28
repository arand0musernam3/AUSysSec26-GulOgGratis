package com.app.tgtg.model.remote.order;

import android.os.Parcel;
import android.os.Parcelable;
import b3.i;
import com.app.tgtg.model.remote.item.DeliveryMethod;
import com.app.tgtg.model.remote.item.DeliveryMethodSerializer;
import com.app.tgtg.model.remote.manufacturer.response.DeliveryOptionMethod;
import com.app.tgtg.model.remote.manufacturer.response.DeliveryOptionMethodSerializer;
import com.app.tgtg.model.remote.user.requests.UserAddress;
import com.app.tgtg.model.remote.user.requests.UserAddress$$serializer;
import hw.f;
import i90.h;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.c1;
import m90.d;
import m90.g;
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
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b4\b\u0007\u0018\u0000 Z2\u00020\u0001:\u0002[ZB©\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0006\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0016\u0010\u0017B«\u0001\b\u0010\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u0016\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0018¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0018¢\u0006\u0004\b#\u0010$J'\u0010,\u001a\u00020\"2\u0006\u0010%\u001a\u00020\u00002\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(H\u0001¢\u0006\u0004\b*\u0010+R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010-\u0012\u0004\b0\u00101\u001a\u0004\b.\u0010/R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010-\u0012\u0004\b3\u00101\u001a\u0004\b2\u0010/R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010-\u0012\u0004\b5\u00101\u001a\u0004\b4\u0010/R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00106\u0012\u0004\b9\u00101\u001a\u0004\b7\u00108R\"\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010-\u0012\u0004\b;\u00101\u001a\u0004\b:\u0010/R*\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\n\u0010<\u0012\u0004\bA\u00101\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R(\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010B\u0012\u0004\bE\u00101\u001a\u0004\bC\u0010DR\"\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010-\u0012\u0004\bG\u00101\u001a\u0004\bF\u0010/R\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010H\u0012\u0004\bK\u00101\u001a\u0004\bI\u0010JR \u0010\u0010\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010L\u0012\u0004\bO\u00101\u001a\u0004\bM\u0010NR\"\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010P\u0012\u0004\bS\u00101\u001a\u0004\bQ\u0010RR\"\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010-\u0012\u0004\bU\u00101\u001a\u0004\bT\u0010/R\"\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010-\u0012\u0004\bW\u00101\u001a\u0004\bV\u0010/R\"\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010-\u0012\u0004\bY\u00101\u001a\u0004\bX\u0010/¨\u0006\\"}, d2 = {"Lcom/app/tgtg/model/remote/order/AdditionalOrderInformation;", "Landroid/os/Parcelable;", "", "charityItemDescription", "manifestUrl", "nameOfRedeemer", "", "pickupDocumentHasBeenGenerated", "redeemedAt", "Lcom/app/tgtg/model/remote/user/requests/UserAddress;", "userAddress", "", "trackAndTraceUrls", "estimatedDelivery", "Lcom/app/tgtg/model/remote/item/DeliveryMethod;", "deliveryMethod", "hasProducts", "Lcom/app/tgtg/model/remote/manufacturer/response/DeliveryOptionMethod;", "orderDeliveryMethod", "deliveryOptionTitle", "deliveryOptionAddress", "expectedDeliveryUtc", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/app/tgtg/model/remote/user/requests/UserAddress;Ljava/util/List;Ljava/lang/String;Lcom/app/tgtg/model/remote/item/DeliveryMethod;ZLcom/app/tgtg/model/remote/manufacturer/response/DeliveryOptionMethod;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/app/tgtg/model/remote/user/requests/UserAddress;Ljava/util/List;Ljava/lang/String;Lcom/app/tgtg/model/remote/item/DeliveryMethod;ZLcom/app/tgtg/model/remote/manufacturer/response/DeliveryOptionMethod;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm90/m1;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "write$Self$app", "(Lcom/app/tgtg/model/remote/order/AdditionalOrderInformation;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getCharityItemDescription", "()Ljava/lang/String;", "getCharityItemDescription$annotations", "()V", "getManifestUrl", "getManifestUrl$annotations", "getNameOfRedeemer", "getNameOfRedeemer$annotations", "Ljava/lang/Boolean;", "getPickupDocumentHasBeenGenerated", "()Ljava/lang/Boolean;", "getPickupDocumentHasBeenGenerated$annotations", "getRedeemedAt", "getRedeemedAt$annotations", "Lcom/app/tgtg/model/remote/user/requests/UserAddress;", "getUserAddress", "()Lcom/app/tgtg/model/remote/user/requests/UserAddress;", "setUserAddress", "(Lcom/app/tgtg/model/remote/user/requests/UserAddress;)V", "getUserAddress$annotations", "Ljava/util/List;", "getTrackAndTraceUrls", "()Ljava/util/List;", "getTrackAndTraceUrls$annotations", "getEstimatedDelivery", "getEstimatedDelivery$annotations", "Lcom/app/tgtg/model/remote/item/DeliveryMethod;", "getDeliveryMethod", "()Lcom/app/tgtg/model/remote/item/DeliveryMethod;", "getDeliveryMethod$annotations", "Z", "getHasProducts", "()Z", "getHasProducts$annotations", "Lcom/app/tgtg/model/remote/manufacturer/response/DeliveryOptionMethod;", "getOrderDeliveryMethod", "()Lcom/app/tgtg/model/remote/manufacturer/response/DeliveryOptionMethod;", "getOrderDeliveryMethod$annotations", "getDeliveryOptionTitle", "getDeliveryOptionTitle$annotations", "getDeliveryOptionAddress", "getDeliveryOptionAddress$annotations", "getExpectedDeliveryUtc", "getExpectedDeliveryUtc$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class AdditionalOrderInformation implements Parcelable {

    @Nullable
    private final String charityItemDescription;

    @Nullable
    private final DeliveryMethod deliveryMethod;

    @Nullable
    private final String deliveryOptionAddress;

    @Nullable
    private final String deliveryOptionTitle;

    @Nullable
    private final String estimatedDelivery;

    @Nullable
    private final String expectedDeliveryUtc;
    private final boolean hasProducts;

    @Nullable
    private final String manifestUrl;

    @Nullable
    private final String nameOfRedeemer;

    @Nullable
    private final DeliveryOptionMethod orderDeliveryMethod;

    @Nullable
    private final Boolean pickupDocumentHasBeenGenerated;

    @Nullable
    private final String redeemedAt;

    @Nullable
    private final List<String> trackAndTraceUrls;

    @Nullable
    private UserAddress userAddress;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<AdditionalOrderInformation> CREATOR = new Creator();

    @NotNull
    private static final j[] $childSerializers = {null, null, null, null, null, null, l.a(m.PUBLICATION, new f(26)), null, null, null, null, null, null, null};

    public /* synthetic */ AdditionalOrderInformation(int i11, String str, String str2, String str3, Boolean bool, String str4, UserAddress userAddress, List list, String str5, DeliveryMethod deliveryMethod, boolean z11, DeliveryOptionMethod deliveryOptionMethod, String str6, String str7, String str8, m1 m1Var) {
        if (15616 != (i11 & 15616)) {
            c1.j(i11, 15616, AdditionalOrderInformation$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i11 & 1) == 0) {
            this.charityItemDescription = null;
        } else {
            this.charityItemDescription = str;
        }
        if ((i11 & 2) == 0) {
            this.manifestUrl = null;
        } else {
            this.manifestUrl = str2;
        }
        if ((i11 & 4) == 0) {
            this.nameOfRedeemer = null;
        } else {
            this.nameOfRedeemer = str3;
        }
        if ((i11 & 8) == 0) {
            this.pickupDocumentHasBeenGenerated = Boolean.FALSE;
        } else {
            this.pickupDocumentHasBeenGenerated = bool;
        }
        if ((i11 & 16) == 0) {
            this.redeemedAt = null;
        } else {
            this.redeemedAt = str4;
        }
        if ((i11 & 32) == 0) {
            this.userAddress = null;
        } else {
            this.userAddress = userAddress;
        }
        if ((i11 & 64) == 0) {
            this.trackAndTraceUrls = null;
        } else {
            this.trackAndTraceUrls = list;
        }
        if ((i11 & 128) == 0) {
            this.estimatedDelivery = null;
        } else {
            this.estimatedDelivery = str5;
        }
        this.deliveryMethod = deliveryMethod;
        if ((i11 & 512) == 0) {
            this.hasProducts = false;
        } else {
            this.hasProducts = z11;
        }
        this.orderDeliveryMethod = deliveryOptionMethod;
        this.deliveryOptionTitle = str6;
        this.deliveryOptionAddress = str7;
        this.expectedDeliveryUtc = str8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new d(r1.f29848a, 0);
    }

    public static final /* synthetic */ void write$Self$app(AdditionalOrderInformation self, b output, SerialDescriptor serialDesc) {
        j[] jVarArr = $childSerializers;
        if (output.C(serialDesc) || self.charityItemDescription != null) {
            output.r(serialDesc, 0, r1.f29848a, self.charityItemDescription);
        }
        if (output.C(serialDesc) || self.manifestUrl != null) {
            output.r(serialDesc, 1, r1.f29848a, self.manifestUrl);
        }
        if (output.C(serialDesc) || self.nameOfRedeemer != null) {
            output.r(serialDesc, 2, r1.f29848a, self.nameOfRedeemer);
        }
        if (output.C(serialDesc) || !Intrinsics.areEqual(self.pickupDocumentHasBeenGenerated, Boolean.FALSE)) {
            output.r(serialDesc, 3, g.f29797a, self.pickupDocumentHasBeenGenerated);
        }
        if (output.C(serialDesc) || self.redeemedAt != null) {
            output.r(serialDesc, 4, r1.f29848a, self.redeemedAt);
        }
        if (output.C(serialDesc) || self.userAddress != null) {
            output.r(serialDesc, 5, UserAddress$$serializer.INSTANCE, self.userAddress);
        }
        if (output.C(serialDesc) || self.trackAndTraceUrls != null) {
            output.r(serialDesc, 6, (KSerializer) jVarArr[6].getValue(), self.trackAndTraceUrls);
        }
        if (output.C(serialDesc) || self.estimatedDelivery != null) {
            output.r(serialDesc, 7, r1.f29848a, self.estimatedDelivery);
        }
        output.r(serialDesc, 8, DeliveryMethodSerializer.INSTANCE, self.deliveryMethod);
        if (output.C(serialDesc) || self.hasProducts) {
            output.p(serialDesc, 9, self.hasProducts);
        }
        output.r(serialDesc, 10, DeliveryOptionMethodSerializer.INSTANCE, self.orderDeliveryMethod);
        r1 r1Var = r1.f29848a;
        output.r(serialDesc, 11, r1Var, self.deliveryOptionTitle);
        output.r(serialDesc, 12, r1Var, self.deliveryOptionAddress);
        output.r(serialDesc, 13, r1Var, self.expectedDeliveryUtc);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Nullable
    public final String getCharityItemDescription() {
        return this.charityItemDescription;
    }

    @Nullable
    public final DeliveryMethod getDeliveryMethod() {
        return this.deliveryMethod;
    }

    @Nullable
    public final String getDeliveryOptionAddress() {
        return this.deliveryOptionAddress;
    }

    @Nullable
    public final String getDeliveryOptionTitle() {
        return this.deliveryOptionTitle;
    }

    @Nullable
    public final String getEstimatedDelivery() {
        return this.estimatedDelivery;
    }

    @Nullable
    public final String getExpectedDeliveryUtc() {
        return this.expectedDeliveryUtc;
    }

    public final boolean getHasProducts() {
        return this.hasProducts;
    }

    @Nullable
    public final String getManifestUrl() {
        return this.manifestUrl;
    }

    @Nullable
    public final String getNameOfRedeemer() {
        return this.nameOfRedeemer;
    }

    @Nullable
    public final DeliveryOptionMethod getOrderDeliveryMethod() {
        return this.orderDeliveryMethod;
    }

    @Nullable
    public final Boolean getPickupDocumentHasBeenGenerated() {
        return this.pickupDocumentHasBeenGenerated;
    }

    @Nullable
    public final String getRedeemedAt() {
        return this.redeemedAt;
    }

    @Nullable
    public final List<String> getTrackAndTraceUrls() {
        return this.trackAndTraceUrls;
    }

    @Nullable
    public final UserAddress getUserAddress() {
        return this.userAddress;
    }

    public final void setUserAddress(@Nullable UserAddress userAddress) {
        this.userAddress = userAddress;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.charityItemDescription);
        dest.writeString(this.manifestUrl);
        dest.writeString(this.nameOfRedeemer);
        Boolean bool = this.pickupDocumentHasBeenGenerated;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            i.v(dest, 1, bool);
        }
        dest.writeString(this.redeemedAt);
        UserAddress userAddress = this.userAddress;
        if (userAddress == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            userAddress.writeToParcel(dest, flags);
        }
        dest.writeStringList(this.trackAndTraceUrls);
        dest.writeString(this.estimatedDelivery);
        DeliveryMethod deliveryMethod = this.deliveryMethod;
        if (deliveryMethod == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(deliveryMethod.name());
        }
        dest.writeInt(this.hasProducts ? 1 : 0);
        DeliveryOptionMethod deliveryOptionMethod = this.orderDeliveryMethod;
        if (deliveryOptionMethod == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(deliveryOptionMethod.name());
        }
        dest.writeString(this.deliveryOptionTitle);
        dest.writeString(this.deliveryOptionAddress);
        dest.writeString(this.expectedDeliveryUtc);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/order/AdditionalOrderInformation$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/order/AdditionalOrderInformation;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return AdditionalOrderInformation$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public AdditionalOrderInformation(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Boolean bool, @Nullable String str4, @Nullable UserAddress userAddress, @Nullable List<String> list, @Nullable String str5, @Nullable DeliveryMethod deliveryMethod, boolean z11, @Nullable DeliveryOptionMethod deliveryOptionMethod, @Nullable String str6, @Nullable String str7, @Nullable String str8) {
        this.charityItemDescription = str;
        this.manifestUrl = str2;
        this.nameOfRedeemer = str3;
        this.pickupDocumentHasBeenGenerated = bool;
        this.redeemedAt = str4;
        this.userAddress = userAddress;
        this.trackAndTraceUrls = list;
        this.estimatedDelivery = str5;
        this.deliveryMethod = deliveryMethod;
        this.hasProducts = z11;
        this.orderDeliveryMethod = deliveryOptionMethod;
        this.deliveryOptionTitle = str6;
        this.deliveryOptionAddress = str7;
        this.expectedDeliveryUtc = str8;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AdditionalOrderInformation> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AdditionalOrderInformation createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Parcel parcel2;
            UserAddress userAddressCreateFromParcel;
            parcel.getClass();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                parcel2 = parcel;
                userAddressCreateFromParcel = null;
            } else {
                parcel2 = parcel;
                userAddressCreateFromParcel = UserAddress.CREATOR.createFromParcel(parcel2);
            }
            UserAddress userAddress = userAddressCreateFromParcel;
            DeliveryOptionMethod deliveryOptionMethodValueOf = null;
            ArrayList<String> arrayListCreateStringArrayList = parcel2.createStringArrayList();
            String string5 = parcel2.readString();
            DeliveryMethod deliveryMethodValueOf = parcel2.readInt() == 0 ? null : DeliveryMethod.valueOf(parcel2.readString());
            boolean z11 = parcel2.readInt() != 0;
            if (parcel2.readInt() != 0) {
                deliveryOptionMethodValueOf = DeliveryOptionMethod.valueOf(parcel2.readString());
            }
            return new AdditionalOrderInformation(string, string2, string3, boolValueOf, string4, userAddress, arrayListCreateStringArrayList, string5, deliveryMethodValueOf, z11, deliveryOptionMethodValueOf, parcel2.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AdditionalOrderInformation[] newArray(int i11) {
            return new AdditionalOrderInformation[i11];
        }
    }

    @i90.g("charity_item_description")
    public static /* synthetic */ void getCharityItemDescription$annotations() {
    }

    @i90.g("delivery_method")
    public static /* synthetic */ void getDeliveryMethod$annotations() {
    }

    @i90.g("delivery_option_address")
    public static /* synthetic */ void getDeliveryOptionAddress$annotations() {
    }

    @i90.g("delivery_option_title")
    public static /* synthetic */ void getDeliveryOptionTitle$annotations() {
    }

    @i90.g("estimated_delivery")
    public static /* synthetic */ void getEstimatedDelivery$annotations() {
    }

    @i90.g("expected_delivery_utc")
    public static /* synthetic */ void getExpectedDeliveryUtc$annotations() {
    }

    @i90.g("has_products")
    public static /* synthetic */ void getHasProducts$annotations() {
    }

    @i90.g("manifest_url")
    public static /* synthetic */ void getManifestUrl$annotations() {
    }

    @i90.g("redeeming_user_name")
    public static /* synthetic */ void getNameOfRedeemer$annotations() {
    }

    @i90.g("order_delivery_method")
    public static /* synthetic */ void getOrderDeliveryMethod$annotations() {
    }

    @i90.g("pickup_document_has_been_generated")
    public static /* synthetic */ void getPickupDocumentHasBeenGenerated$annotations() {
    }

    @i90.g("redeemed_at")
    public static /* synthetic */ void getRedeemedAt$annotations() {
    }

    @i90.g("track_and_trace_urls")
    public static /* synthetic */ void getTrackAndTraceUrls$annotations() {
    }

    @i90.g("shipping_address")
    public static /* synthetic */ void getUserAddress$annotations() {
    }

    public /* synthetic */ AdditionalOrderInformation(String str, String str2, String str3, Boolean bool, String str4, UserAddress userAddress, List list, String str5, DeliveryMethod deliveryMethod, boolean z11, DeliveryOptionMethod deliveryOptionMethod, String str6, String str7, String str8, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? Boolean.FALSE : bool, (i11 & 16) != 0 ? null : str4, (i11 & 32) != 0 ? null : userAddress, (i11 & 64) != 0 ? null : list, (i11 & 128) != 0 ? null : str5, deliveryMethod, (i11 & 512) != 0 ? false : z11, deliveryOptionMethod, str6, str7, str8);
    }
}
