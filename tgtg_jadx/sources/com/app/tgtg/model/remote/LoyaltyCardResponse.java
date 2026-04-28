package com.app.tgtg.model.remote;

import android.os.Parcel;
import android.os.Parcelable;
import com.app.tgtg.model.remote.payment.Price;
import com.app.tgtg.model.remote.payment.Price$$serializer;
import i90.g;
import i90.h;
import j4.s;
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
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0087\b\u0018\u0000 I2\u00020\u0001:\u0002JIB=\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fBG\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000b\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0012J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b \u0010\u001bJF\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b#\u0010\u001fJ\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u0012J\u001a\u0010'\u001a\u00020\u00042\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b'\u0010(J'\u00100\u001a\u00020\u00162\u0006\u0010)\u001a\u00020\u00002\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,H\u0001¢\u0006\u0004\b.\u0010/R(\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0003\u00101\u0012\u0004\b5\u00106\u001a\u0004\b2\u0010\u0012\"\u0004\b3\u00104R(\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0005\u00107\u0012\u0004\b;\u00106\u001a\u0004\b8\u0010\u001b\"\u0004\b9\u0010:R*\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0007\u0010<\u0012\u0004\b@\u00106\u001a\u0004\b=\u0010\u001d\"\u0004\b>\u0010?R*\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\t\u0010A\u0012\u0004\bE\u00106\u001a\u0004\bB\u0010\u001f\"\u0004\bC\u0010DR(\u0010\n\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\n\u00107\u0012\u0004\bH\u00106\u001a\u0004\bF\u0010\u001b\"\u0004\bG\u0010:¨\u0006K"}, d2 = {"Lcom/app/tgtg/model/remote/LoyaltyCardResponse;", "Landroid/os/Parcelable;", "", "loyaltyStamps", "", "hasActiveVoucher", "Lcom/app/tgtg/model/remote/payment/Price;", "voucherRewardAmount", "", "expiryDate", "hasParcelsEnabled", "<init>", "(IZLcom/app/tgtg/model/remote/payment/Price;Ljava/lang/String;Z)V", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(IIZLcom/app/tgtg/model/remote/payment/Price;Ljava/lang/String;ZLm90/m1;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "component2", "()Z", "component3", "()Lcom/app/tgtg/model/remote/payment/Price;", "component4", "()Ljava/lang/String;", "component5", "copy", "(IZLcom/app/tgtg/model/remote/payment/Price;Ljava/lang/String;Z)Lcom/app/tgtg/model/remote/LoyaltyCardResponse;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "write$Self$app", "(Lcom/app/tgtg/model/remote/LoyaltyCardResponse;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "I", "getLoyaltyStamps", "setLoyaltyStamps", "(I)V", "getLoyaltyStamps$annotations", "()V", "Z", "getHasActiveVoucher", "setHasActiveVoucher", "(Z)V", "getHasActiveVoucher$annotations", "Lcom/app/tgtg/model/remote/payment/Price;", "getVoucherRewardAmount", "setVoucherRewardAmount", "(Lcom/app/tgtg/model/remote/payment/Price;)V", "getVoucherRewardAmount$annotations", "Ljava/lang/String;", "getExpiryDate", "setExpiryDate", "(Ljava/lang/String;)V", "getExpiryDate$annotations", "getHasParcelsEnabled", "setHasParcelsEnabled", "getHasParcelsEnabled$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class LoyaltyCardResponse implements Parcelable {

    @Nullable
    private String expiryDate;
    private boolean hasActiveVoucher;
    private boolean hasParcelsEnabled;
    private int loyaltyStamps;

    @Nullable
    private Price voucherRewardAmount;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<LoyaltyCardResponse> CREATOR = new Creator();

    public /* synthetic */ LoyaltyCardResponse(int i11, int i12, boolean z11, Price price, String str, boolean z12, m1 m1Var) {
        if ((i11 & 1) == 0) {
            this.loyaltyStamps = 0;
        } else {
            this.loyaltyStamps = i12;
        }
        if ((i11 & 2) == 0) {
            this.hasActiveVoucher = false;
        } else {
            this.hasActiveVoucher = z11;
        }
        if ((i11 & 4) == 0) {
            this.voucherRewardAmount = null;
        } else {
            this.voucherRewardAmount = price;
        }
        if ((i11 & 8) == 0) {
            this.expiryDate = null;
        } else {
            this.expiryDate = str;
        }
        if ((i11 & 16) == 0) {
            this.hasParcelsEnabled = false;
        } else {
            this.hasParcelsEnabled = z12;
        }
    }

    public static /* synthetic */ LoyaltyCardResponse copy$default(LoyaltyCardResponse loyaltyCardResponse, int i11, boolean z11, Price price, String str, boolean z12, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = loyaltyCardResponse.loyaltyStamps;
        }
        if ((i12 & 2) != 0) {
            z11 = loyaltyCardResponse.hasActiveVoucher;
        }
        if ((i12 & 4) != 0) {
            price = loyaltyCardResponse.voucherRewardAmount;
        }
        if ((i12 & 8) != 0) {
            str = loyaltyCardResponse.expiryDate;
        }
        if ((i12 & 16) != 0) {
            z12 = loyaltyCardResponse.hasParcelsEnabled;
        }
        boolean z13 = z12;
        Price price2 = price;
        return loyaltyCardResponse.copy(i11, z11, price2, str, z13);
    }

    public static final /* synthetic */ void write$Self$app(LoyaltyCardResponse self, b output, SerialDescriptor serialDesc) {
        if (output.C(serialDesc) || self.loyaltyStamps != 0) {
            output.m(0, self.loyaltyStamps, serialDesc);
        }
        if (output.C(serialDesc) || self.hasActiveVoucher) {
            output.p(serialDesc, 1, self.hasActiveVoucher);
        }
        if (output.C(serialDesc) || self.voucherRewardAmount != null) {
            output.r(serialDesc, 2, Price$$serializer.INSTANCE, self.voucherRewardAmount);
        }
        if (output.C(serialDesc) || self.expiryDate != null) {
            output.r(serialDesc, 3, r1.f29848a, self.expiryDate);
        }
        if (output.C(serialDesc) || self.hasParcelsEnabled) {
            output.p(serialDesc, 4, self.hasParcelsEnabled);
        }
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getLoyaltyStamps() {
        return this.loyaltyStamps;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getHasActiveVoucher() {
        return this.hasActiveVoucher;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Price getVoucherRewardAmount() {
        return this.voucherRewardAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getExpiryDate() {
        return this.expiryDate;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getHasParcelsEnabled() {
        return this.hasParcelsEnabled;
    }

    @NotNull
    public final LoyaltyCardResponse copy(int loyaltyStamps, boolean hasActiveVoucher, @Nullable Price voucherRewardAmount, @Nullable String expiryDate, boolean hasParcelsEnabled) {
        return new LoyaltyCardResponse(loyaltyStamps, hasActiveVoucher, voucherRewardAmount, expiryDate, hasParcelsEnabled);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoyaltyCardResponse)) {
            return false;
        }
        LoyaltyCardResponse loyaltyCardResponse = (LoyaltyCardResponse) other;
        return this.loyaltyStamps == loyaltyCardResponse.loyaltyStamps && this.hasActiveVoucher == loyaltyCardResponse.hasActiveVoucher && Intrinsics.areEqual(this.voucherRewardAmount, loyaltyCardResponse.voucherRewardAmount) && Intrinsics.areEqual(this.expiryDate, loyaltyCardResponse.expiryDate) && this.hasParcelsEnabled == loyaltyCardResponse.hasParcelsEnabled;
    }

    @Nullable
    public final String getExpiryDate() {
        return this.expiryDate;
    }

    public final boolean getHasActiveVoucher() {
        return this.hasActiveVoucher;
    }

    public final boolean getHasParcelsEnabled() {
        return this.hasParcelsEnabled;
    }

    public final int getLoyaltyStamps() {
        return this.loyaltyStamps;
    }

    @Nullable
    public final Price getVoucherRewardAmount() {
        return this.voucherRewardAmount;
    }

    public int hashCode() {
        int iE = k.e(Integer.hashCode(this.loyaltyStamps) * 31, 31, this.hasActiveVoucher);
        Price price = this.voucherRewardAmount;
        int iHashCode = (iE + (price == null ? 0 : price.hashCode())) * 31;
        String str = this.expiryDate;
        return Boolean.hashCode(this.hasParcelsEnabled) + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final void setExpiryDate(@Nullable String str) {
        this.expiryDate = str;
    }

    public final void setHasActiveVoucher(boolean z11) {
        this.hasActiveVoucher = z11;
    }

    public final void setHasParcelsEnabled(boolean z11) {
        this.hasParcelsEnabled = z11;
    }

    public final void setLoyaltyStamps(int i11) {
        this.loyaltyStamps = i11;
    }

    public final void setVoucherRewardAmount(@Nullable Price price) {
        this.voucherRewardAmount = price;
    }

    @NotNull
    public String toString() {
        int i11 = this.loyaltyStamps;
        boolean z11 = this.hasActiveVoucher;
        Price price = this.voucherRewardAmount;
        String str = this.expiryDate;
        boolean z12 = this.hasParcelsEnabled;
        StringBuilder sb2 = new StringBuilder("LoyaltyCardResponse(loyaltyStamps=");
        sb2.append(i11);
        sb2.append(", hasActiveVoucher=");
        sb2.append(z11);
        sb2.append(", voucherRewardAmount=");
        sb2.append(price);
        sb2.append(", expiryDate=");
        sb2.append(str);
        sb2.append(", hasParcelsEnabled=");
        return s.o(sb2, z12, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeInt(this.loyaltyStamps);
        dest.writeInt(this.hasActiveVoucher ? 1 : 0);
        Price price = this.voucherRewardAmount;
        if (price == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            price.writeToParcel(dest, flags);
        }
        dest.writeString(this.expiryDate);
        dest.writeInt(this.hasParcelsEnabled ? 1 : 0);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/LoyaltyCardResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/LoyaltyCardResponse;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return LoyaltyCardResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<LoyaltyCardResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LoyaltyCardResponse createFromParcel(Parcel parcel) {
            boolean z11;
            Price price;
            parcel.getClass();
            int i11 = parcel.readInt();
            boolean z12 = parcel.readInt() != 0;
            Price priceCreateFromParcel = parcel.readInt() == 0 ? null : Price.CREATOR.createFromParcel(parcel);
            String string = parcel.readString();
            if (parcel.readInt() != 0) {
                price = priceCreateFromParcel;
                z11 = true;
            } else {
                z11 = false;
                price = priceCreateFromParcel;
            }
            return new LoyaltyCardResponse(i11, z12, price, string, z11);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LoyaltyCardResponse[] newArray(int i11) {
            return new LoyaltyCardResponse[i11];
        }
    }

    @g("expiry")
    public static /* synthetic */ void getExpiryDate$annotations() {
    }

    @g("has_active_voucher")
    public static /* synthetic */ void getHasActiveVoucher$annotations() {
    }

    @g("has_parcels_enabled")
    public static /* synthetic */ void getHasParcelsEnabled$annotations() {
    }

    @g("order_count")
    public static /* synthetic */ void getLoyaltyStamps$annotations() {
    }

    @g("voucher_reward_amount")
    public static /* synthetic */ void getVoucherRewardAmount$annotations() {
    }

    public LoyaltyCardResponse() {
        this(0, false, (Price) null, (String) null, false, 31, (DefaultConstructorMarker) null);
    }

    public LoyaltyCardResponse(int i11, boolean z11, @Nullable Price price, @Nullable String str, boolean z12) {
        this.loyaltyStamps = i11;
        this.hasActiveVoucher = z11;
        this.voucherRewardAmount = price;
        this.expiryDate = str;
        this.hasParcelsEnabled = z12;
    }

    public /* synthetic */ LoyaltyCardResponse(int i11, boolean z11, Price price, String str, boolean z12, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0 : i11, (i12 & 2) != 0 ? false : z11, (i12 & 4) != 0 ? null : price, (i12 & 8) != 0 ? null : str, (i12 & 16) != 0 ? false : z12);
    }
}
