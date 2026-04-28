package com.app.tgtg.model.remote.payment;

import android.os.Parcel;
import android.os.Parcelable;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u0000 >2\u00020\u0001:\u0002?>B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bBK\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0019\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0004¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010!J\u0010\u0010&\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b&\u0010$JB\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b)\u0010$J\u0010\u0010*\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b*\u0010\u001aJ\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010+HÖ\u0003¢\u0006\u0004\b.\u0010/R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00100\u0012\u0004\b2\u00103\u001a\u0004\b1\u0010!R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00104\u0012\u0004\b6\u00103\u001a\u0004\b5\u0010\u001aR \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00107\u0012\u0004\b9\u00103\u001a\u0004\b8\u0010$R \u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00100\u0012\u0004\b;\u00103\u001a\u0004\b:\u0010!R \u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00107\u0012\u0004\b=\u00103\u001a\u0004\b<\u0010$¨\u0006@"}, d2 = {"Lcom/app/tgtg/model/remote/payment/VoucherPaymentInformation;", "Landroid/os/Parcelable;", "Lcom/app/tgtg/model/remote/payment/Price;", "totalVoucherAmount", "", "numberOfVouchers", "", "expiryOfSoonestExpiryVoucher", "amountOnSoonestExpiryVoucher", "nameOfSoonestExpiryVoucher", "<init>", "(Lcom/app/tgtg/model/remote/payment/Price;ILjava/lang/String;Lcom/app/tgtg/model/remote/payment/Price;Ljava/lang/String;)V", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILcom/app/tgtg/model/remote/payment/Price;ILjava/lang/String;Lcom/app/tgtg/model/remote/payment/Price;Ljava/lang/String;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/payment/VoucherPaymentInformation;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/app/tgtg/model/remote/payment/Price;", "component2", "component3", "()Ljava/lang/String;", "component4", "component5", "copy", "(Lcom/app/tgtg/model/remote/payment/Price;ILjava/lang/String;Lcom/app/tgtg/model/remote/payment/Price;Ljava/lang/String;)Lcom/app/tgtg/model/remote/payment/VoucherPaymentInformation;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/app/tgtg/model/remote/payment/Price;", "getTotalVoucherAmount", "getTotalVoucherAmount$annotations", "()V", "I", "getNumberOfVouchers", "getNumberOfVouchers$annotations", "Ljava/lang/String;", "getExpiryOfSoonestExpiryVoucher", "getExpiryOfSoonestExpiryVoucher$annotations", "getAmountOnSoonestExpiryVoucher", "getAmountOnSoonestExpiryVoucher$annotations", "getNameOfSoonestExpiryVoucher", "getNameOfSoonestExpiryVoucher$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class VoucherPaymentInformation implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    private final Price amountOnSoonestExpiryVoucher;

    @NotNull
    private final String expiryOfSoonestExpiryVoucher;

    @NotNull
    private final String nameOfSoonestExpiryVoucher;
    private final int numberOfVouchers;

    @NotNull
    private final Price totalVoucherAmount;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<VoucherPaymentInformation> CREATOR = new Creator();

    public /* synthetic */ VoucherPaymentInformation(int i11, Price price, int i12, String str, Price price2, String str2, m1 m1Var) {
        if (31 != (i11 & 31)) {
            c1.j(i11, 31, VoucherPaymentInformation$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.totalVoucherAmount = price;
        this.numberOfVouchers = i12;
        this.expiryOfSoonestExpiryVoucher = str;
        this.amountOnSoonestExpiryVoucher = price2;
        this.nameOfSoonestExpiryVoucher = str2;
    }

    public static /* synthetic */ VoucherPaymentInformation copy$default(VoucherPaymentInformation voucherPaymentInformation, Price price, int i11, String str, Price price2, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            price = voucherPaymentInformation.totalVoucherAmount;
        }
        if ((i12 & 2) != 0) {
            i11 = voucherPaymentInformation.numberOfVouchers;
        }
        if ((i12 & 4) != 0) {
            str = voucherPaymentInformation.expiryOfSoonestExpiryVoucher;
        }
        if ((i12 & 8) != 0) {
            price2 = voucherPaymentInformation.amountOnSoonestExpiryVoucher;
        }
        if ((i12 & 16) != 0) {
            str2 = voucherPaymentInformation.nameOfSoonestExpiryVoucher;
        }
        String str3 = str2;
        String str4 = str;
        return voucherPaymentInformation.copy(price, i11, str4, price2, str3);
    }

    public static final /* synthetic */ void write$Self$app(VoucherPaymentInformation self, b output, SerialDescriptor serialDesc) {
        Price$$serializer price$$serializer = Price$$serializer.INSTANCE;
        output.i(serialDesc, 0, price$$serializer, self.totalVoucherAmount);
        output.m(1, self.numberOfVouchers, serialDesc);
        output.q(serialDesc, 2, self.expiryOfSoonestExpiryVoucher);
        output.i(serialDesc, 3, price$$serializer, self.amountOnSoonestExpiryVoucher);
        output.q(serialDesc, 4, self.nameOfSoonestExpiryVoucher);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Price getTotalVoucherAmount() {
        return this.totalVoucherAmount;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getNumberOfVouchers() {
        return this.numberOfVouchers;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getExpiryOfSoonestExpiryVoucher() {
        return this.expiryOfSoonestExpiryVoucher;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Price getAmountOnSoonestExpiryVoucher() {
        return this.amountOnSoonestExpiryVoucher;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getNameOfSoonestExpiryVoucher() {
        return this.nameOfSoonestExpiryVoucher;
    }

    @NotNull
    public final VoucherPaymentInformation copy(@NotNull Price totalVoucherAmount, int numberOfVouchers, @NotNull String expiryOfSoonestExpiryVoucher, @NotNull Price amountOnSoonestExpiryVoucher, @NotNull String nameOfSoonestExpiryVoucher) {
        totalVoucherAmount.getClass();
        expiryOfSoonestExpiryVoucher.getClass();
        amountOnSoonestExpiryVoucher.getClass();
        nameOfSoonestExpiryVoucher.getClass();
        return new VoucherPaymentInformation(totalVoucherAmount, numberOfVouchers, expiryOfSoonestExpiryVoucher, amountOnSoonestExpiryVoucher, nameOfSoonestExpiryVoucher);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VoucherPaymentInformation)) {
            return false;
        }
        VoucherPaymentInformation voucherPaymentInformation = (VoucherPaymentInformation) other;
        return Intrinsics.areEqual(this.totalVoucherAmount, voucherPaymentInformation.totalVoucherAmount) && this.numberOfVouchers == voucherPaymentInformation.numberOfVouchers && Intrinsics.areEqual(this.expiryOfSoonestExpiryVoucher, voucherPaymentInformation.expiryOfSoonestExpiryVoucher) && Intrinsics.areEqual(this.amountOnSoonestExpiryVoucher, voucherPaymentInformation.amountOnSoonestExpiryVoucher) && Intrinsics.areEqual(this.nameOfSoonestExpiryVoucher, voucherPaymentInformation.nameOfSoonestExpiryVoucher);
    }

    @NotNull
    public final Price getAmountOnSoonestExpiryVoucher() {
        return this.amountOnSoonestExpiryVoucher;
    }

    @NotNull
    public final String getExpiryOfSoonestExpiryVoucher() {
        return this.expiryOfSoonestExpiryVoucher;
    }

    @NotNull
    public final String getNameOfSoonestExpiryVoucher() {
        return this.nameOfSoonestExpiryVoucher;
    }

    public final int getNumberOfVouchers() {
        return this.numberOfVouchers;
    }

    @NotNull
    public final Price getTotalVoucherAmount() {
        return this.totalVoucherAmount;
    }

    public int hashCode() {
        return this.nameOfSoonestExpiryVoucher.hashCode() + ((this.amountOnSoonestExpiryVoucher.hashCode() + l1.b(k.b(this.numberOfVouchers, this.totalVoucherAmount.hashCode() * 31, 31), 31, this.expiryOfSoonestExpiryVoucher)) * 31);
    }

    @NotNull
    public String toString() {
        Price price = this.totalVoucherAmount;
        int i11 = this.numberOfVouchers;
        String str = this.expiryOfSoonestExpiryVoucher;
        Price price2 = this.amountOnSoonestExpiryVoucher;
        String str2 = this.nameOfSoonestExpiryVoucher;
        StringBuilder sb2 = new StringBuilder("VoucherPaymentInformation(totalVoucherAmount=");
        sb2.append(price);
        sb2.append(", numberOfVouchers=");
        sb2.append(i11);
        sb2.append(", expiryOfSoonestExpiryVoucher=");
        sb2.append(str);
        sb2.append(", amountOnSoonestExpiryVoucher=");
        sb2.append(price2);
        sb2.append(", nameOfSoonestExpiryVoucher=");
        return k.p(sb2, str2, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        this.totalVoucherAmount.writeToParcel(dest, flags);
        dest.writeInt(this.numberOfVouchers);
        dest.writeString(this.expiryOfSoonestExpiryVoucher);
        this.amountOnSoonestExpiryVoucher.writeToParcel(dest, flags);
        dest.writeString(this.nameOfSoonestExpiryVoucher);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/payment/VoucherPaymentInformation$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/payment/VoucherPaymentInformation;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return VoucherPaymentInformation$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<VoucherPaymentInformation> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VoucherPaymentInformation createFromParcel(Parcel parcel) {
            parcel.getClass();
            Parcelable.Creator<Price> creator = Price.CREATOR;
            return new VoucherPaymentInformation(creator.createFromParcel(parcel), parcel.readInt(), parcel.readString(), creator.createFromParcel(parcel), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VoucherPaymentInformation[] newArray(int i11) {
            return new VoucherPaymentInformation[i11];
        }
    }

    @g("amount_on_soonest_expiry_voucher")
    public static /* synthetic */ void getAmountOnSoonestExpiryVoucher$annotations() {
    }

    @g("expiry_of_soonest_expiry_voucher")
    public static /* synthetic */ void getExpiryOfSoonestExpiryVoucher$annotations() {
    }

    @g("name_of_soonest_expiry_voucher")
    public static /* synthetic */ void getNameOfSoonestExpiryVoucher$annotations() {
    }

    @g("number_of_vouchers")
    public static /* synthetic */ void getNumberOfVouchers$annotations() {
    }

    @g("total_voucher_amount")
    public static /* synthetic */ void getTotalVoucherAmount$annotations() {
    }

    public VoucherPaymentInformation(@NotNull Price price, int i11, @NotNull String str, @NotNull Price price2, @NotNull String str2) {
        price.getClass();
        str.getClass();
        price2.getClass();
        str2.getClass();
        this.totalVoucherAmount = price;
        this.numberOfVouchers = i11;
        this.expiryOfSoonestExpiryVoucher = str;
        this.amountOnSoonestExpiryVoucher = price2;
        this.nameOfSoonestExpiryVoucher = str2;
    }
}
