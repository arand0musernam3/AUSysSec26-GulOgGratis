package com.app.tgtg.model.remote.voucher;

import android.os.Parcel;
import android.os.Parcelable;
import com.app.tgtg.model.remote.payment.Price;
import com.app.tgtg.model.remote.payment.Price$$serializer;
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
import r8.k;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u0000 E2\u00020\u0001:\u0002FEB?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rBU\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\f\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001b\u001a\u00020\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010 \u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0007¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010#J\u0010\u0010'\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b'\u0010\u001cJ\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010#J\u0012\u0010)\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b)\u0010*JP\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b-\u0010#J\u0010\u0010.\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b.\u0010\u001cJ\u001a\u00102\u001a\u0002012\b\u00100\u001a\u0004\u0018\u00010/HÖ\u0003¢\u0006\u0004\b2\u00103R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00104\u0012\u0004\b6\u00107\u001a\u0004\b5\u0010#R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00108\u0012\u0004\b:\u00107\u001a\u0004\b9\u0010%R \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00104\u0012\u0004\b<\u00107\u001a\u0004\b;\u0010#R \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010=\u0012\u0004\b?\u00107\u001a\u0004\b>\u0010\u001cR\"\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00104\u0012\u0004\bA\u00107\u001a\u0004\b@\u0010#R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010B\u0012\u0004\bD\u00107\u001a\u0004\bC\u0010*¨\u0006G"}, d2 = {"Lcom/app/tgtg/model/remote/voucher/VoucherUsageDetails;", "Landroid/os/Parcelable;", "", "storeName", "Lcom/app/tgtg/model/remote/voucher/UsageDetailsType;", "type", "usedAtUtc", "", "numberOfItems", "storeLogoUrl", "Lcom/app/tgtg/model/remote/payment/Price;", "price", "<init>", "(Ljava/lang/String;Lcom/app/tgtg/model/remote/voucher/UsageDetailsType;Ljava/lang/String;ILjava/lang/String;Lcom/app/tgtg/model/remote/payment/Price;)V", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/app/tgtg/model/remote/voucher/UsageDetailsType;Ljava/lang/String;ILjava/lang/String;Lcom/app/tgtg/model/remote/payment/Price;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/voucher/VoucherUsageDetails;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/app/tgtg/model/remote/voucher/UsageDetailsType;", "component3", "component4", "component5", "component6", "()Lcom/app/tgtg/model/remote/payment/Price;", "copy", "(Ljava/lang/String;Lcom/app/tgtg/model/remote/voucher/UsageDetailsType;Ljava/lang/String;ILjava/lang/String;Lcom/app/tgtg/model/remote/payment/Price;)Lcom/app/tgtg/model/remote/voucher/VoucherUsageDetails;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getStoreName", "getStoreName$annotations", "()V", "Lcom/app/tgtg/model/remote/voucher/UsageDetailsType;", "getType", "getType$annotations", "getUsedAtUtc", "getUsedAtUtc$annotations", "I", "getNumberOfItems", "getNumberOfItems$annotations", "getStoreLogoUrl", "getStoreLogoUrl$annotations", "Lcom/app/tgtg/model/remote/payment/Price;", "getPrice", "getPrice$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class VoucherUsageDetails implements Parcelable {
    public static final int $stable = 0;
    private final int numberOfItems;

    @Nullable
    private final Price price;

    @Nullable
    private final String storeLogoUrl;

    @NotNull
    private final String storeName;

    @NotNull
    private final UsageDetailsType type;

    @NotNull
    private final String usedAtUtc;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<VoucherUsageDetails> CREATOR = new Creator();

    public /* synthetic */ VoucherUsageDetails(int i11, String str, UsageDetailsType usageDetailsType, String str2, int i12, String str3, Price price, m1 m1Var) {
        if (53 != (i11 & 53)) {
            c1.j(i11, 53, VoucherUsageDetails$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.storeName = str;
        if ((i11 & 2) == 0) {
            this.type = UsageDetailsType.PAYMENT;
        } else {
            this.type = usageDetailsType;
        }
        this.usedAtUtc = str2;
        if ((i11 & 8) == 0) {
            this.numberOfItems = 1;
        } else {
            this.numberOfItems = i12;
        }
        this.storeLogoUrl = str3;
        this.price = price;
    }

    public static /* synthetic */ VoucherUsageDetails copy$default(VoucherUsageDetails voucherUsageDetails, String str, UsageDetailsType usageDetailsType, String str2, int i11, String str3, Price price, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = voucherUsageDetails.storeName;
        }
        if ((i12 & 2) != 0) {
            usageDetailsType = voucherUsageDetails.type;
        }
        if ((i12 & 4) != 0) {
            str2 = voucherUsageDetails.usedAtUtc;
        }
        if ((i12 & 8) != 0) {
            i11 = voucherUsageDetails.numberOfItems;
        }
        if ((i12 & 16) != 0) {
            str3 = voucherUsageDetails.storeLogoUrl;
        }
        if ((i12 & 32) != 0) {
            price = voucherUsageDetails.price;
        }
        String str4 = str3;
        Price price2 = price;
        return voucherUsageDetails.copy(str, usageDetailsType, str2, i11, str4, price2);
    }

    public static final /* synthetic */ void write$Self$app(VoucherUsageDetails self, b output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.storeName);
        if (output.C(serialDesc) || self.type != UsageDetailsType.PAYMENT) {
            output.i(serialDesc, 1, UsageDetailsTypeSerializer.INSTANCE, self.type);
        }
        output.q(serialDesc, 2, self.usedAtUtc);
        if (output.C(serialDesc) || self.numberOfItems != 1) {
            output.m(3, self.numberOfItems, serialDesc);
        }
        output.r(serialDesc, 4, r1.f29848a, self.storeLogoUrl);
        output.r(serialDesc, 5, Price$$serializer.INSTANCE, self.price);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getStoreName() {
        return this.storeName;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final UsageDetailsType getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUsedAtUtc() {
        return this.usedAtUtc;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getNumberOfItems() {
        return this.numberOfItems;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getStoreLogoUrl() {
        return this.storeLogoUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Price getPrice() {
        return this.price;
    }

    @NotNull
    public final VoucherUsageDetails copy(@NotNull String storeName, @NotNull UsageDetailsType type, @NotNull String usedAtUtc, int numberOfItems, @Nullable String storeLogoUrl, @Nullable Price price) {
        storeName.getClass();
        type.getClass();
        usedAtUtc.getClass();
        return new VoucherUsageDetails(storeName, type, usedAtUtc, numberOfItems, storeLogoUrl, price);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VoucherUsageDetails)) {
            return false;
        }
        VoucherUsageDetails voucherUsageDetails = (VoucherUsageDetails) other;
        return Intrinsics.areEqual(this.storeName, voucherUsageDetails.storeName) && this.type == voucherUsageDetails.type && Intrinsics.areEqual(this.usedAtUtc, voucherUsageDetails.usedAtUtc) && this.numberOfItems == voucherUsageDetails.numberOfItems && Intrinsics.areEqual(this.storeLogoUrl, voucherUsageDetails.storeLogoUrl) && Intrinsics.areEqual(this.price, voucherUsageDetails.price);
    }

    public final int getNumberOfItems() {
        return this.numberOfItems;
    }

    @Nullable
    public final Price getPrice() {
        return this.price;
    }

    @Nullable
    public final String getStoreLogoUrl() {
        return this.storeLogoUrl;
    }

    @NotNull
    public final String getStoreName() {
        return this.storeName;
    }

    @NotNull
    public final UsageDetailsType getType() {
        return this.type;
    }

    @NotNull
    public final String getUsedAtUtc() {
        return this.usedAtUtc;
    }

    public int hashCode() {
        int iB = k.b(this.numberOfItems, l1.b((this.type.hashCode() + (this.storeName.hashCode() * 31)) * 31, 31, this.usedAtUtc), 31);
        String str = this.storeLogoUrl;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        Price price = this.price;
        return iHashCode + (price != null ? price.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "VoucherUsageDetails(storeName=" + this.storeName + ", type=" + this.type + ", usedAtUtc=" + this.usedAtUtc + ", numberOfItems=" + this.numberOfItems + ", storeLogoUrl=" + this.storeLogoUrl + ", price=" + this.price + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.storeName);
        dest.writeString(this.type.name());
        dest.writeString(this.usedAtUtc);
        dest.writeInt(this.numberOfItems);
        dest.writeString(this.storeLogoUrl);
        Price price = this.price;
        if (price == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            price.writeToParcel(dest, flags);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/voucher/VoucherUsageDetails$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/voucher/VoucherUsageDetails;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return VoucherUsageDetails$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<VoucherUsageDetails> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VoucherUsageDetails createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new VoucherUsageDetails(parcel.readString(), UsageDetailsType.valueOf(parcel.readString()), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt() == 0 ? null : Price.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VoucherUsageDetails[] newArray(int i11) {
            return new VoucherUsageDetails[i11];
        }
    }

    @g("num_of_items")
    public static /* synthetic */ void getNumberOfItems$annotations() {
    }

    @g("amount")
    public static /* synthetic */ void getPrice$annotations() {
    }

    @g("store_logo_url")
    public static /* synthetic */ void getStoreLogoUrl$annotations() {
    }

    @g("store_name")
    public static /* synthetic */ void getStoreName$annotations() {
    }

    @g("type")
    public static /* synthetic */ void getType$annotations() {
    }

    @g("created_at_utc")
    public static /* synthetic */ void getUsedAtUtc$annotations() {
    }

    public VoucherUsageDetails(@NotNull String str, @NotNull UsageDetailsType usageDetailsType, @NotNull String str2, int i11, @Nullable String str3, @Nullable Price price) {
        str.getClass();
        usageDetailsType.getClass();
        str2.getClass();
        this.storeName = str;
        this.type = usageDetailsType;
        this.usedAtUtc = str2;
        this.numberOfItems = i11;
        this.storeLogoUrl = str3;
        this.price = price;
    }

    public /* synthetic */ VoucherUsageDetails(String str, UsageDetailsType usageDetailsType, String str2, int i11, String str3, Price price, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i12 & 2) != 0 ? UsageDetailsType.PAYMENT : usageDetailsType, str2, (i12 & 8) != 0 ? 1 : i11, str3, price);
    }
}
