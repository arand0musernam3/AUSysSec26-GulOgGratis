package com.app.tgtg.model.remote.order;

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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u0000 A2\u00020\u0001:\u0002BAB7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bBU\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0019\u001a\u00020\u0005¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0005¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0010\u0010#\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b#\u0010\u001aJ\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010!J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010!J\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010!JL\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010*\u001a\u00020)HÖ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b,\u0010\u001aJ\u001a\u00100\u001a\u00020/2\b\u0010.\u001a\u0004\u0018\u00010-HÖ\u0003¢\u0006\u0004\b0\u00101R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00102\u0012\u0004\b4\u00105\u001a\u0004\b3\u0010!R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u00102\u0012\u0004\b7\u00105\u001a\u0004\b6\u0010!R \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00108\u0012\u0004\b:\u00105\u001a\u0004\b9\u0010\u001aR \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00102\u0012\u0004\b<\u00105\u001a\u0004\b;\u0010!R \u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00102\u0012\u0004\b>\u00105\u001a\u0004\b=\u0010!R \u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00102\u0012\u0004\b@\u00105\u001a\u0004\b?\u0010!¨\u0006C"}, d2 = {"Lcom/app/tgtg/model/remote/order/OrderLine;", "Landroid/os/Parcelable;", "Lcom/app/tgtg/model/remote/payment/Price;", "itemPriceExcludingTaxes", "itemPriceIncludingTaxes", "", "quantity", "totalPrice", "totalPriceExcludingTaxes", "totalPriceIncludingTaxes", "<init>", "(Lcom/app/tgtg/model/remote/payment/Price;Lcom/app/tgtg/model/remote/payment/Price;ILcom/app/tgtg/model/remote/payment/Price;Lcom/app/tgtg/model/remote/payment/Price;Lcom/app/tgtg/model/remote/payment/Price;)V", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILcom/app/tgtg/model/remote/payment/Price;Lcom/app/tgtg/model/remote/payment/Price;ILcom/app/tgtg/model/remote/payment/Price;Lcom/app/tgtg/model/remote/payment/Price;Lcom/app/tgtg/model/remote/payment/Price;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/order/OrderLine;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/app/tgtg/model/remote/payment/Price;", "component2", "component3", "component4", "component5", "component6", "copy", "(Lcom/app/tgtg/model/remote/payment/Price;Lcom/app/tgtg/model/remote/payment/Price;ILcom/app/tgtg/model/remote/payment/Price;Lcom/app/tgtg/model/remote/payment/Price;Lcom/app/tgtg/model/remote/payment/Price;)Lcom/app/tgtg/model/remote/order/OrderLine;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/app/tgtg/model/remote/payment/Price;", "getItemPriceExcludingTaxes", "getItemPriceExcludingTaxes$annotations", "()V", "getItemPriceIncludingTaxes", "getItemPriceIncludingTaxes$annotations", "I", "getQuantity", "getQuantity$annotations", "getTotalPrice", "getTotalPrice$annotations", "getTotalPriceExcludingTaxes", "getTotalPriceExcludingTaxes$annotations", "getTotalPriceIncludingTaxes", "getTotalPriceIncludingTaxes$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class OrderLine implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    private final Price itemPriceExcludingTaxes;

    @NotNull
    private final Price itemPriceIncludingTaxes;
    private final int quantity;

    @NotNull
    private final Price totalPrice;

    @NotNull
    private final Price totalPriceExcludingTaxes;

    @NotNull
    private final Price totalPriceIncludingTaxes;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<OrderLine> CREATOR = new Creator();

    public /* synthetic */ OrderLine(int i11, Price price, Price price2, int i12, Price price3, Price price4, Price price5, m1 m1Var) {
        if (63 != (i11 & 63)) {
            c1.j(i11, 63, OrderLine$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.itemPriceExcludingTaxes = price;
        this.itemPriceIncludingTaxes = price2;
        this.quantity = i12;
        this.totalPrice = price3;
        this.totalPriceExcludingTaxes = price4;
        this.totalPriceIncludingTaxes = price5;
    }

    public static /* synthetic */ OrderLine copy$default(OrderLine orderLine, Price price, Price price2, int i11, Price price3, Price price4, Price price5, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            price = orderLine.itemPriceExcludingTaxes;
        }
        if ((i12 & 2) != 0) {
            price2 = orderLine.itemPriceIncludingTaxes;
        }
        if ((i12 & 4) != 0) {
            i11 = orderLine.quantity;
        }
        if ((i12 & 8) != 0) {
            price3 = orderLine.totalPrice;
        }
        if ((i12 & 16) != 0) {
            price4 = orderLine.totalPriceExcludingTaxes;
        }
        if ((i12 & 32) != 0) {
            price5 = orderLine.totalPriceIncludingTaxes;
        }
        Price price6 = price4;
        Price price7 = price5;
        return orderLine.copy(price, price2, i11, price3, price6, price7);
    }

    public static final /* synthetic */ void write$Self$app(OrderLine self, b output, SerialDescriptor serialDesc) {
        Price$$serializer price$$serializer = Price$$serializer.INSTANCE;
        output.i(serialDesc, 0, price$$serializer, self.itemPriceExcludingTaxes);
        output.i(serialDesc, 1, price$$serializer, self.itemPriceIncludingTaxes);
        output.m(2, self.quantity, serialDesc);
        output.i(serialDesc, 3, price$$serializer, self.totalPrice);
        output.i(serialDesc, 4, price$$serializer, self.totalPriceExcludingTaxes);
        output.i(serialDesc, 5, price$$serializer, self.totalPriceIncludingTaxes);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Price getItemPriceExcludingTaxes() {
        return this.itemPriceExcludingTaxes;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Price getItemPriceIncludingTaxes() {
        return this.itemPriceIncludingTaxes;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getQuantity() {
        return this.quantity;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Price getTotalPrice() {
        return this.totalPrice;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Price getTotalPriceExcludingTaxes() {
        return this.totalPriceExcludingTaxes;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Price getTotalPriceIncludingTaxes() {
        return this.totalPriceIncludingTaxes;
    }

    @NotNull
    public final OrderLine copy(@NotNull Price itemPriceExcludingTaxes, @NotNull Price itemPriceIncludingTaxes, int quantity, @NotNull Price totalPrice, @NotNull Price totalPriceExcludingTaxes, @NotNull Price totalPriceIncludingTaxes) {
        itemPriceExcludingTaxes.getClass();
        itemPriceIncludingTaxes.getClass();
        totalPrice.getClass();
        totalPriceExcludingTaxes.getClass();
        totalPriceIncludingTaxes.getClass();
        return new OrderLine(itemPriceExcludingTaxes, itemPriceIncludingTaxes, quantity, totalPrice, totalPriceExcludingTaxes, totalPriceIncludingTaxes);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderLine)) {
            return false;
        }
        OrderLine orderLine = (OrderLine) other;
        return Intrinsics.areEqual(this.itemPriceExcludingTaxes, orderLine.itemPriceExcludingTaxes) && Intrinsics.areEqual(this.itemPriceIncludingTaxes, orderLine.itemPriceIncludingTaxes) && this.quantity == orderLine.quantity && Intrinsics.areEqual(this.totalPrice, orderLine.totalPrice) && Intrinsics.areEqual(this.totalPriceExcludingTaxes, orderLine.totalPriceExcludingTaxes) && Intrinsics.areEqual(this.totalPriceIncludingTaxes, orderLine.totalPriceIncludingTaxes);
    }

    @NotNull
    public final Price getItemPriceExcludingTaxes() {
        return this.itemPriceExcludingTaxes;
    }

    @NotNull
    public final Price getItemPriceIncludingTaxes() {
        return this.itemPriceIncludingTaxes;
    }

    public final int getQuantity() {
        return this.quantity;
    }

    @NotNull
    public final Price getTotalPrice() {
        return this.totalPrice;
    }

    @NotNull
    public final Price getTotalPriceExcludingTaxes() {
        return this.totalPriceExcludingTaxes;
    }

    @NotNull
    public final Price getTotalPriceIncludingTaxes() {
        return this.totalPriceIncludingTaxes;
    }

    public int hashCode() {
        return this.totalPriceIncludingTaxes.hashCode() + ((this.totalPriceExcludingTaxes.hashCode() + ((this.totalPrice.hashCode() + k.b(this.quantity, (this.itemPriceIncludingTaxes.hashCode() + (this.itemPriceExcludingTaxes.hashCode() * 31)) * 31, 31)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "OrderLine(itemPriceExcludingTaxes=" + this.itemPriceExcludingTaxes + ", itemPriceIncludingTaxes=" + this.itemPriceIncludingTaxes + ", quantity=" + this.quantity + ", totalPrice=" + this.totalPrice + ", totalPriceExcludingTaxes=" + this.totalPriceExcludingTaxes + ", totalPriceIncludingTaxes=" + this.totalPriceIncludingTaxes + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        this.itemPriceExcludingTaxes.writeToParcel(dest, flags);
        this.itemPriceIncludingTaxes.writeToParcel(dest, flags);
        dest.writeInt(this.quantity);
        this.totalPrice.writeToParcel(dest, flags);
        this.totalPriceExcludingTaxes.writeToParcel(dest, flags);
        this.totalPriceIncludingTaxes.writeToParcel(dest, flags);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/order/OrderLine$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/order/OrderLine;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return OrderLine$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<OrderLine> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OrderLine createFromParcel(Parcel parcel) {
            parcel.getClass();
            Parcelable.Creator<Price> creator = Price.CREATOR;
            return new OrderLine(creator.createFromParcel(parcel), creator.createFromParcel(parcel), parcel.readInt(), creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OrderLine[] newArray(int i11) {
            return new OrderLine[i11];
        }
    }

    @g("item_price_excluding_taxes")
    public static /* synthetic */ void getItemPriceExcludingTaxes$annotations() {
    }

    @g("item_price_including_taxes")
    public static /* synthetic */ void getItemPriceIncludingTaxes$annotations() {
    }

    @g("quantity")
    public static /* synthetic */ void getQuantity$annotations() {
    }

    @g("total_price")
    public static /* synthetic */ void getTotalPrice$annotations() {
    }

    @g("total_price_excluding_taxes")
    public static /* synthetic */ void getTotalPriceExcludingTaxes$annotations() {
    }

    @g("total_price_including_taxes")
    public static /* synthetic */ void getTotalPriceIncludingTaxes$annotations() {
    }

    public OrderLine(@NotNull Price price, @NotNull Price price2, int i11, @NotNull Price price3, @NotNull Price price4, @NotNull Price price5) {
        price.getClass();
        price2.getClass();
        price3.getClass();
        price4.getClass();
        price5.getClass();
        this.itemPriceExcludingTaxes = price;
        this.itemPriceIncludingTaxes = price2;
        this.quantity = i11;
        this.totalPrice = price3;
        this.totalPriceExcludingTaxes = price4;
        this.totalPriceIncludingTaxes = price5;
    }
}
