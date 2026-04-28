package com.app.tgtg.model.remote.item.response;

import com.app.tgtg.model.remote.payment.Price;
import com.app.tgtg.model.remote.payment.Price$$serializer;
import com.app.tgtg.model.remote.payment.VoucherPaymentInformation;
import com.app.tgtg.model.remote.payment.VoucherPaymentInformation$$serializer;
import com.app.tgtg.model.remote.voucher.DiscountVoucher;
import com.app.tgtg.model.remote.voucher.DiscountVoucher$$serializer;
import e0.f;
import i90.g;
import i90.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.n0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.d;
import m90.m1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.j;
import u70.l;
import u70.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 92\u00020\u0001:\u0002:9B?\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\u000b\u0010\fBO\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\t0\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\u001eJH\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010-\u0012\u0004\b/\u00100\u001a\u0004\b.\u0010\u001cR&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00101\u0012\u0004\b3\u00100\u001a\u0004\b2\u0010\u001eR\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00104\u0012\u0004\b6\u00100\u001a\u0004\b5\u0010 R&\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00101\u0012\u0004\b8\u00100\u001a\u0004\b7\u0010\u001e¨\u0006;"}, d2 = {"Lcom/app/tgtg/model/remote/item/response/ItemDiscountResponse;", "", "Lcom/app/tgtg/model/remote/payment/VoucherPaymentInformation;", "vouchers", "", "Lcom/app/tgtg/model/remote/voucher/DiscountVoucher;", "availableDiscounts", "Lcom/app/tgtg/model/remote/payment/Price;", "discountedItemPriceUsingVouchers", "Lcom/app/tgtg/model/remote/item/response/DiscountedItemPrice;", "discountedItemPriceUsingDiscounts", "<init>", "(Lcom/app/tgtg/model/remote/payment/VoucherPaymentInformation;Ljava/util/List;Lcom/app/tgtg/model/remote/payment/Price;Ljava/util/List;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILcom/app/tgtg/model/remote/payment/VoucherPaymentInformation;Ljava/util/List;Lcom/app/tgtg/model/remote/payment/Price;Ljava/util/List;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/item/response/ItemDiscountResponse;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/app/tgtg/model/remote/payment/VoucherPaymentInformation;", "component2", "()Ljava/util/List;", "component3", "()Lcom/app/tgtg/model/remote/payment/Price;", "component4", "copy", "(Lcom/app/tgtg/model/remote/payment/VoucherPaymentInformation;Ljava/util/List;Lcom/app/tgtg/model/remote/payment/Price;Ljava/util/List;)Lcom/app/tgtg/model/remote/item/response/ItemDiscountResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/app/tgtg/model/remote/payment/VoucherPaymentInformation;", "getVouchers", "getVouchers$annotations", "()V", "Ljava/util/List;", "getAvailableDiscounts", "getAvailableDiscounts$annotations", "Lcom/app/tgtg/model/remote/payment/Price;", "getDiscountedItemPriceUsingVouchers", "getDiscountedItemPriceUsingVouchers$annotations", "getDiscountedItemPriceUsingDiscounts", "getDiscountedItemPriceUsingDiscounts$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class ItemDiscountResponse {

    @NotNull
    private static final j[] $childSerializers;

    @NotNull
    private final List<DiscountVoucher> availableDiscounts;

    @NotNull
    private final List<DiscountedItemPrice> discountedItemPriceUsingDiscounts;

    @Nullable
    private final Price discountedItemPriceUsingVouchers;

    @Nullable
    private final VoucherPaymentInformation vouchers;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    static {
        m mVar = m.PUBLICATION;
        $childSerializers = new j[]{null, l.a(mVar, new a(0)), null, l.a(mVar, new a(1))};
    }

    public ItemDiscountResponse(int i11, VoucherPaymentInformation voucherPaymentInformation, List list, Price price, List list2, m1 m1Var) {
        if ((i11 & 1) == 0) {
            this.vouchers = null;
        } else {
            this.vouchers = voucherPaymentInformation;
        }
        if ((i11 & 2) == 0) {
            this.availableDiscounts = n0.f26529a;
        } else {
            this.availableDiscounts = list;
        }
        if ((i11 & 4) == 0) {
            this.discountedItemPriceUsingVouchers = null;
        } else {
            this.discountedItemPriceUsingVouchers = price;
        }
        if ((i11 & 8) == 0) {
            this.discountedItemPriceUsingDiscounts = n0.f26529a;
        } else {
            this.discountedItemPriceUsingDiscounts = list2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new d(DiscountVoucher$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new d(DiscountedItemPrice$$serializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ItemDiscountResponse copy$default(ItemDiscountResponse itemDiscountResponse, VoucherPaymentInformation voucherPaymentInformation, List list, Price price, List list2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            voucherPaymentInformation = itemDiscountResponse.vouchers;
        }
        if ((i11 & 2) != 0) {
            list = itemDiscountResponse.availableDiscounts;
        }
        if ((i11 & 4) != 0) {
            price = itemDiscountResponse.discountedItemPriceUsingVouchers;
        }
        if ((i11 & 8) != 0) {
            list2 = itemDiscountResponse.discountedItemPriceUsingDiscounts;
        }
        return itemDiscountResponse.copy(voucherPaymentInformation, list, price, list2);
    }

    public static final void write$Self$app(ItemDiscountResponse self, b output, SerialDescriptor serialDesc) {
        j[] jVarArr = $childSerializers;
        if (output.C(serialDesc) || self.vouchers != null) {
            output.r(serialDesc, 0, VoucherPaymentInformation$$serializer.INSTANCE, self.vouchers);
        }
        if (output.C(serialDesc) || !Intrinsics.areEqual(self.availableDiscounts, n0.f26529a)) {
            output.i(serialDesc, 1, (KSerializer) jVarArr[1].getValue(), self.availableDiscounts);
        }
        if (output.C(serialDesc) || self.discountedItemPriceUsingVouchers != null) {
            output.r(serialDesc, 2, Price$$serializer.INSTANCE, self.discountedItemPriceUsingVouchers);
        }
        if (!output.C(serialDesc) && Intrinsics.areEqual(self.discountedItemPriceUsingDiscounts, n0.f26529a)) {
            return;
        }
        output.i(serialDesc, 3, (KSerializer) jVarArr[3].getValue(), self.discountedItemPriceUsingDiscounts);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final VoucherPaymentInformation getVouchers() {
        return this.vouchers;
    }

    @NotNull
    public final List<DiscountVoucher> component2() {
        return this.availableDiscounts;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Price getDiscountedItemPriceUsingVouchers() {
        return this.discountedItemPriceUsingVouchers;
    }

    @NotNull
    public final List<DiscountedItemPrice> component4() {
        return this.discountedItemPriceUsingDiscounts;
    }

    @NotNull
    public final ItemDiscountResponse copy(@Nullable VoucherPaymentInformation vouchers, @NotNull List<DiscountVoucher> availableDiscounts, @Nullable Price discountedItemPriceUsingVouchers, @NotNull List<DiscountedItemPrice> discountedItemPriceUsingDiscounts) {
        availableDiscounts.getClass();
        discountedItemPriceUsingDiscounts.getClass();
        return new ItemDiscountResponse(vouchers, availableDiscounts, discountedItemPriceUsingVouchers, discountedItemPriceUsingDiscounts);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ItemDiscountResponse)) {
            return false;
        }
        ItemDiscountResponse itemDiscountResponse = (ItemDiscountResponse) other;
        return Intrinsics.areEqual(this.vouchers, itemDiscountResponse.vouchers) && Intrinsics.areEqual(this.availableDiscounts, itemDiscountResponse.availableDiscounts) && Intrinsics.areEqual(this.discountedItemPriceUsingVouchers, itemDiscountResponse.discountedItemPriceUsingVouchers) && Intrinsics.areEqual(this.discountedItemPriceUsingDiscounts, itemDiscountResponse.discountedItemPriceUsingDiscounts);
    }

    @NotNull
    public final List<DiscountVoucher> getAvailableDiscounts() {
        return this.availableDiscounts;
    }

    @NotNull
    public final List<DiscountedItemPrice> getDiscountedItemPriceUsingDiscounts() {
        return this.discountedItemPriceUsingDiscounts;
    }

    @Nullable
    public final Price getDiscountedItemPriceUsingVouchers() {
        return this.discountedItemPriceUsingVouchers;
    }

    @Nullable
    public final VoucherPaymentInformation getVouchers() {
        return this.vouchers;
    }

    public int hashCode() {
        VoucherPaymentInformation voucherPaymentInformation = this.vouchers;
        int iC = f.c(this.availableDiscounts, (voucherPaymentInformation == null ? 0 : voucherPaymentInformation.hashCode()) * 31, 31);
        Price price = this.discountedItemPriceUsingVouchers;
        return this.discountedItemPriceUsingDiscounts.hashCode() + ((iC + (price != null ? price.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        return "ItemDiscountResponse(vouchers=" + this.vouchers + ", availableDiscounts=" + this.availableDiscounts + ", discountedItemPriceUsingVouchers=" + this.discountedItemPriceUsingVouchers + ", discountedItemPriceUsingDiscounts=" + this.discountedItemPriceUsingDiscounts + ")";
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/item/response/ItemDiscountResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/item/response/ItemDiscountResponse;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return ItemDiscountResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @g("user_discounts")
    public static /* synthetic */ void getAvailableDiscounts$annotations() {
    }

    @g("discounted_item_price_using_discounts")
    public static /* synthetic */ void getDiscountedItemPriceUsingDiscounts$annotations() {
    }

    @g("discounted_item_price_using_vouchers")
    public static /* synthetic */ void getDiscountedItemPriceUsingVouchers$annotations() {
    }

    @g("vouchers")
    public static /* synthetic */ void getVouchers$annotations() {
    }

    public ItemDiscountResponse() {
        this((VoucherPaymentInformation) null, (List) null, (Price) null, (List) null, 15, (DefaultConstructorMarker) null);
    }

    public ItemDiscountResponse(@Nullable VoucherPaymentInformation voucherPaymentInformation, @NotNull List<DiscountVoucher> list, @Nullable Price price, @NotNull List<DiscountedItemPrice> list2) {
        list.getClass();
        list2.getClass();
        this.vouchers = voucherPaymentInformation;
        this.availableDiscounts = list;
        this.discountedItemPriceUsingVouchers = price;
        this.discountedItemPriceUsingDiscounts = list2;
    }

    public ItemDiscountResponse(VoucherPaymentInformation voucherPaymentInformation, List list, Price price, List list2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : voucherPaymentInformation, (i11 & 2) != 0 ? n0.f26529a : list, (i11 & 4) != 0 ? null : price, (i11 & 8) != 0 ? n0.f26529a : list2);
    }
}
