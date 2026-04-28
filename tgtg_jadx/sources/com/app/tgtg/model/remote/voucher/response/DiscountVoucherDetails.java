package com.app.tgtg.model.remote.voucher.response;

import android.os.Parcel;
import android.os.Parcelable;
import b3.i;
import com.app.tgtg.model.remote.item.response.ItemType;
import com.app.tgtg.model.remote.item.response.ItemTypeSerializer;
import com.app.tgtg.model.remote.payment.Price;
import com.app.tgtg.model.remote.payment.Price$$serializer;
import com.app.tgtg.model.remote.voucher.DiscountVoucher;
import com.app.tgtg.model.remote.voucher.DiscountVoucher$$serializer;
import com.app.tgtg.model.remote.voucher.VoucherFilterType;
import com.app.tgtg.model.remote.voucher.VoucherFilterTypeSerializer;
import com.app.tgtg.model.remote.voucher.VoucherUsageDetails;
import com.app.tgtg.model.remote.voucher.VoucherUsageDetails$$serializer;
import e0.f;
import i90.g;
import i90.h;
import j4.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.n0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.c1;
import m90.d;
import m90.m1;
import m90.r1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.j;
import u70.l;
import u70.m;
import w2.l1;
import xw.a;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0087\b\u0018\u0000 S2\u00020\u0001:\u0002TSBU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\t¢\u0006\u0004\b\u0010\u0010\u0011Bm\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\t\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0010\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0012¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0012¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b(\u0010'J\u0018\u0010)\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b+\u0010,J\u0016\u0010-\u001a\b\u0012\u0004\u0012\u00020\u000e0\tHÆ\u0003¢\u0006\u0004\b-\u0010*Jj\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\tHÆ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b0\u0010'J\u0010\u00101\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b1\u0010\u001bJ\u001a\u00105\u001a\u0002042\b\u00103\u001a\u0004\u0018\u000102HÖ\u0003¢\u0006\u0004\b5\u00106J'\u0010>\u001a\u00020\u001f2\u0006\u00107\u001a\u00020\u00002\u0006\u00109\u001a\u0002082\u0006\u0010;\u001a\u00020:H\u0001¢\u0006\u0004\b<\u0010=R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010?\u0012\u0004\bA\u0010B\u001a\u0004\b@\u0010#R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010C\u0012\u0004\bE\u0010B\u001a\u0004\bD\u0010%R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010F\u0012\u0004\bH\u0010B\u001a\u0004\bG\u0010'R \u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010F\u0012\u0004\bJ\u0010B\u001a\u0004\bI\u0010'R(\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010K\u0012\u0004\bM\u0010B\u001a\u0004\bL\u0010*R\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010N\u0012\u0004\bP\u0010B\u001a\u0004\bO\u0010,R&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010K\u0012\u0004\bR\u0010B\u001a\u0004\bQ\u0010*¨\u0006U"}, d2 = {"Lcom/app/tgtg/model/remote/voucher/response/DiscountVoucherDetails;", "Landroid/os/Parcelable;", "Lcom/app/tgtg/model/remote/voucher/DiscountVoucher;", "userDiscount", "Lcom/app/tgtg/model/remote/payment/Price;", "maxDiscountAmount", "", "countryId", "currency", "", "Lcom/app/tgtg/model/remote/item/response/ItemType;", "applicableItemTypes", "Lcom/app/tgtg/model/remote/voucher/VoucherFilterType;", "storeVoucherFilterType", "Lcom/app/tgtg/model/remote/voucher/VoucherUsageDetails;", "orders", "<init>", "(Lcom/app/tgtg/model/remote/voucher/DiscountVoucher;Lcom/app/tgtg/model/remote/payment/Price;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/app/tgtg/model/remote/voucher/VoucherFilterType;Ljava/util/List;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILcom/app/tgtg/model/remote/voucher/DiscountVoucher;Lcom/app/tgtg/model/remote/payment/Price;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/app/tgtg/model/remote/voucher/VoucherFilterType;Ljava/util/List;Lm90/m1;)V", "Lcom/app/tgtg/model/remote/voucher/response/VoucherDetails;", "toVoucherDetailsResponse", "()Lcom/app/tgtg/model/remote/voucher/response/VoucherDetails;", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/app/tgtg/model/remote/voucher/DiscountVoucher;", "component2", "()Lcom/app/tgtg/model/remote/payment/Price;", "component3", "()Ljava/lang/String;", "component4", "component5", "()Ljava/util/List;", "component6", "()Lcom/app/tgtg/model/remote/voucher/VoucherFilterType;", "component7", "copy", "(Lcom/app/tgtg/model/remote/voucher/DiscountVoucher;Lcom/app/tgtg/model/remote/payment/Price;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/app/tgtg/model/remote/voucher/VoucherFilterType;Ljava/util/List;)Lcom/app/tgtg/model/remote/voucher/response/DiscountVoucherDetails;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "write$Self$app", "(Lcom/app/tgtg/model/remote/voucher/response/DiscountVoucherDetails;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lcom/app/tgtg/model/remote/voucher/DiscountVoucher;", "getUserDiscount", "getUserDiscount$annotations", "()V", "Lcom/app/tgtg/model/remote/payment/Price;", "getMaxDiscountAmount", "getMaxDiscountAmount$annotations", "Ljava/lang/String;", "getCountryId", "getCountryId$annotations", "getCurrency", "getCurrency$annotations", "Ljava/util/List;", "getApplicableItemTypes", "getApplicableItemTypes$annotations", "Lcom/app/tgtg/model/remote/voucher/VoucherFilterType;", "getStoreVoucherFilterType", "getStoreVoucherFilterType$annotations", "getOrders", "getOrders$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class DiscountVoucherDetails implements Parcelable {

    @NotNull
    private static final j[] $childSerializers;

    @Nullable
    private final List<ItemType> applicableItemTypes;

    @Nullable
    private final String countryId;

    @NotNull
    private final String currency;

    @Nullable
    private final Price maxDiscountAmount;

    @NotNull
    private final List<VoucherUsageDetails> orders;

    @Nullable
    private final VoucherFilterType storeVoucherFilterType;

    @NotNull
    private final DiscountVoucher userDiscount;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<DiscountVoucherDetails> CREATOR = new Creator();

    static {
        m mVar = m.PUBLICATION;
        $childSerializers = new j[]{null, null, null, null, l.a(mVar, new a(28)), null, l.a(mVar, new a(29))};
    }

    public DiscountVoucherDetails(int i11, DiscountVoucher discountVoucher, Price price, String str, String str2, List list, VoucherFilterType voucherFilterType, List list2, m1 m1Var) {
        if (63 != (i11 & 63)) {
            c1.j(i11, 63, DiscountVoucherDetails$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.userDiscount = discountVoucher;
        this.maxDiscountAmount = price;
        this.countryId = str;
        this.currency = str2;
        this.applicableItemTypes = list;
        this.storeVoucherFilterType = voucherFilterType;
        if ((i11 & 64) == 0) {
            this.orders = n0.f26529a;
        } else {
            this.orders = list2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new d(ItemTypeSerializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new d(VoucherUsageDetails$$serializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DiscountVoucherDetails copy$default(DiscountVoucherDetails discountVoucherDetails, DiscountVoucher discountVoucher, Price price, String str, String str2, List list, VoucherFilterType voucherFilterType, List list2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            discountVoucher = discountVoucherDetails.userDiscount;
        }
        if ((i11 & 2) != 0) {
            price = discountVoucherDetails.maxDiscountAmount;
        }
        if ((i11 & 4) != 0) {
            str = discountVoucherDetails.countryId;
        }
        if ((i11 & 8) != 0) {
            str2 = discountVoucherDetails.currency;
        }
        if ((i11 & 16) != 0) {
            list = discountVoucherDetails.applicableItemTypes;
        }
        if ((i11 & 32) != 0) {
            voucherFilterType = discountVoucherDetails.storeVoucherFilterType;
        }
        if ((i11 & 64) != 0) {
            list2 = discountVoucherDetails.orders;
        }
        VoucherFilterType voucherFilterType2 = voucherFilterType;
        List list3 = list2;
        List list4 = list;
        String str3 = str;
        return discountVoucherDetails.copy(discountVoucher, price, str3, str2, list4, voucherFilterType2, list3);
    }

    public static final void write$Self$app(DiscountVoucherDetails self, b output, SerialDescriptor serialDesc) {
        j[] jVarArr = $childSerializers;
        output.i(serialDesc, 0, DiscountVoucher$$serializer.INSTANCE, self.userDiscount);
        output.r(serialDesc, 1, Price$$serializer.INSTANCE, self.maxDiscountAmount);
        output.r(serialDesc, 2, r1.f29848a, self.countryId);
        output.q(serialDesc, 3, self.currency);
        output.r(serialDesc, 4, (KSerializer) jVarArr[4].getValue(), self.applicableItemTypes);
        output.r(serialDesc, 5, VoucherFilterTypeSerializer.INSTANCE, self.storeVoucherFilterType);
        if (!output.C(serialDesc) && Intrinsics.areEqual(self.orders, n0.f26529a)) {
            return;
        }
        output.i(serialDesc, 6, (KSerializer) jVarArr[6].getValue(), self.orders);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DiscountVoucher getUserDiscount() {
        return this.userDiscount;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Price getMaxDiscountAmount() {
        return this.maxDiscountAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCountryId() {
        return this.countryId;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final List<ItemType> component5() {
        return this.applicableItemTypes;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final VoucherFilterType getStoreVoucherFilterType() {
        return this.storeVoucherFilterType;
    }

    @NotNull
    public final List<VoucherUsageDetails> component7() {
        return this.orders;
    }

    @NotNull
    public final DiscountVoucherDetails copy(@NotNull DiscountVoucher userDiscount, @Nullable Price maxDiscountAmount, @Nullable String countryId, @NotNull String currency, @Nullable List<? extends ItemType> applicableItemTypes, @Nullable VoucherFilterType storeVoucherFilterType, @NotNull List<VoucherUsageDetails> orders) {
        userDiscount.getClass();
        currency.getClass();
        orders.getClass();
        return new DiscountVoucherDetails(userDiscount, maxDiscountAmount, countryId, currency, applicableItemTypes, storeVoucherFilterType, orders);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DiscountVoucherDetails)) {
            return false;
        }
        DiscountVoucherDetails discountVoucherDetails = (DiscountVoucherDetails) other;
        return Intrinsics.areEqual(this.userDiscount, discountVoucherDetails.userDiscount) && Intrinsics.areEqual(this.maxDiscountAmount, discountVoucherDetails.maxDiscountAmount) && Intrinsics.areEqual(this.countryId, discountVoucherDetails.countryId) && Intrinsics.areEqual(this.currency, discountVoucherDetails.currency) && Intrinsics.areEqual(this.applicableItemTypes, discountVoucherDetails.applicableItemTypes) && this.storeVoucherFilterType == discountVoucherDetails.storeVoucherFilterType && Intrinsics.areEqual(this.orders, discountVoucherDetails.orders);
    }

    @Nullable
    public final List<ItemType> getApplicableItemTypes() {
        return this.applicableItemTypes;
    }

    @Nullable
    public final String getCountryId() {
        return this.countryId;
    }

    @NotNull
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final Price getMaxDiscountAmount() {
        return this.maxDiscountAmount;
    }

    @NotNull
    public final List<VoucherUsageDetails> getOrders() {
        return this.orders;
    }

    @Nullable
    public final VoucherFilterType getStoreVoucherFilterType() {
        return this.storeVoucherFilterType;
    }

    @NotNull
    public final DiscountVoucher getUserDiscount() {
        return this.userDiscount;
    }

    public int hashCode() {
        int iHashCode = this.userDiscount.hashCode() * 31;
        Price price = this.maxDiscountAmount;
        int iHashCode2 = (iHashCode + (price == null ? 0 : price.hashCode())) * 31;
        String str = this.countryId;
        int iB = l1.b((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.currency);
        List<ItemType> list = this.applicableItemTypes;
        int iHashCode3 = (iB + (list == null ? 0 : list.hashCode())) * 31;
        VoucherFilterType voucherFilterType = this.storeVoucherFilterType;
        return this.orders.hashCode() + ((iHashCode3 + (voucherFilterType != null ? voucherFilterType.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        DiscountVoucher discountVoucher = this.userDiscount;
        Price price = this.maxDiscountAmount;
        String str = this.countryId;
        String str2 = this.currency;
        List<ItemType> list = this.applicableItemTypes;
        VoucherFilterType voucherFilterType = this.storeVoucherFilterType;
        List<VoucherUsageDetails> list2 = this.orders;
        StringBuilder sb2 = new StringBuilder("DiscountVoucherDetails(userDiscount=");
        sb2.append(discountVoucher);
        sb2.append(", maxDiscountAmount=");
        sb2.append(price);
        sb2.append(", countryId=");
        s.A(sb2, str, ", currency=", str2, ", applicableItemTypes=");
        sb2.append(list);
        sb2.append(", storeVoucherFilterType=");
        sb2.append(voucherFilterType);
        sb2.append(", orders=");
        return f.p(sb2, list2, ")");
    }

    @NotNull
    public final VoucherDetails toVoucherDetailsResponse() {
        return new VoucherDetails(DiscountVoucher.m538copydWnhSKQ$default(this.userDiscount, null, 0, 0, null, null, null, null, null, null, null, null, this.maxDiscountAmount, null, this.countryId, this.storeVoucherFilterType, this.currency, null, null, null, this.applicableItemTypes, null, 1513471, null), this.orders);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        this.userDiscount.writeToParcel(dest, flags);
        Price price = this.maxDiscountAmount;
        if (price == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            price.writeToParcel(dest, flags);
        }
        dest.writeString(this.countryId);
        dest.writeString(this.currency);
        List<ItemType> list = this.applicableItemTypes;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = i.q(dest, 1, list);
            while (itQ.hasNext()) {
                dest.writeString(((ItemType) itQ.next()).name());
            }
        }
        VoucherFilterType voucherFilterType = this.storeVoucherFilterType;
        if (voucherFilterType == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(voucherFilterType.name());
        }
        Iterator itR = i.r(this.orders, dest);
        while (itR.hasNext()) {
            ((VoucherUsageDetails) itR.next()).writeToParcel(dest, flags);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/voucher/response/DiscountVoucherDetails$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/voucher/response/DiscountVoucherDetails;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return DiscountVoucherDetails$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DiscountVoucherDetails> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DiscountVoucherDetails createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            parcel.getClass();
            DiscountVoucher discountVoucherCreateFromParcel = DiscountVoucher.CREATOR.createFromParcel(parcel);
            Price priceCreateFromParcel = parcel.readInt() == 0 ? null : Price.CREATOR.createFromParcel(parcel);
            String string = parcel.readString();
            String string2 = parcel.readString();
            int iC = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i11 = parcel.readInt();
                arrayList = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList.add(ItemType.valueOf(parcel.readString()));
                }
            }
            VoucherFilterType voucherFilterTypeValueOf = parcel.readInt() != 0 ? VoucherFilterType.valueOf(parcel.readString()) : null;
            int i13 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i13);
            while (iC != i13) {
                iC = i.c(VoucherUsageDetails.CREATOR, parcel, arrayList2, iC, 1);
            }
            return new DiscountVoucherDetails(discountVoucherCreateFromParcel, priceCreateFromParcel, string, string2, arrayList, voucherFilterTypeValueOf, arrayList2);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DiscountVoucherDetails[] newArray(int i11) {
            return new DiscountVoucherDetails[i11];
        }
    }

    @g("applicable_item_types")
    public static /* synthetic */ void getApplicableItemTypes$annotations() {
    }

    @g("country_id")
    public static /* synthetic */ void getCountryId$annotations() {
    }

    @g("currency")
    public static /* synthetic */ void getCurrency$annotations() {
    }

    @g("max_discount_amount")
    public static /* synthetic */ void getMaxDiscountAmount$annotations() {
    }

    @g("orders")
    public static /* synthetic */ void getOrders$annotations() {
    }

    @g("store_filter_type")
    public static /* synthetic */ void getStoreVoucherFilterType$annotations() {
    }

    @g("user_discount")
    public static /* synthetic */ void getUserDiscount$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DiscountVoucherDetails(@NotNull DiscountVoucher discountVoucher, @Nullable Price price, @Nullable String str, @NotNull String str2, @Nullable List<? extends ItemType> list, @Nullable VoucherFilterType voucherFilterType, @NotNull List<VoucherUsageDetails> list2) {
        discountVoucher.getClass();
        str2.getClass();
        list2.getClass();
        this.userDiscount = discountVoucher;
        this.maxDiscountAmount = price;
        this.countryId = str;
        this.currency = str2;
        this.applicableItemTypes = list;
        this.storeVoucherFilterType = voucherFilterType;
        this.orders = list2;
    }

    public DiscountVoucherDetails(DiscountVoucher discountVoucher, Price price, String str, String str2, List list, VoucherFilterType voucherFilterType, List list2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(discountVoucher, price, str, str2, list, voucherFilterType, (i11 & 64) != 0 ? n0.f26529a : list2);
    }
}
