package com.app.tgtg.model.remote.order;

import android.os.Parcel;
import android.os.Parcelable;
import com.adyen.checkout.components.core.Address;
import com.app.tgtg.model.remote.ItemId;
import com.app.tgtg.model.remote.ItemId$$serializer;
import com.app.tgtg.model.remote.item.Picture;
import com.app.tgtg.model.remote.item.Picture$$serializer;
import com.app.tgtg.model.remote.payment.Price;
import com.app.tgtg.model.remote.payment.Price$$serializer;
import i90.g;
import i90.h;
import j4.s;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.c1;
import m90.m1;
import m90.r1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0087\b\u0018\u0000 L2\u00020\u0001:\u0002MLBM\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fB_\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u000e\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0015J\u0012\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0012\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b#\u0010\u001dJ\u0012\u0010$\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b$\u0010\u001dJ\u0012\u0010%\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b%\u0010&Jb\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010*\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b*\u0010\u001dJ\u0010\u0010+\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b+\u0010\u0015J\u001a\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b/\u00100J'\u00108\u001a\u00020\u00192\u0006\u00101\u001a\u00020\u00002\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u000204H\u0001¢\u0006\u0004\b6\u00107R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00109\u0012\u0004\b;\u0010<\u001a\u0004\b:\u0010\u001dR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010=\u0012\u0004\b?\u0010<\u001a\u0004\b>\u0010\u0015R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010@\u0012\u0004\bB\u0010<\u001a\u0004\bA\u0010!R\"\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010@\u0012\u0004\bD\u0010<\u001a\u0004\bC\u0010!R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00109\u0012\u0004\bF\u0010<\u001a\u0004\bE\u0010\u001dR\"\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00109\u0012\u0004\bH\u0010<\u001a\u0004\bG\u0010\u001dR\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010I\u0012\u0004\bK\u0010<\u001a\u0004\bJ\u0010&¨\u0006N"}, d2 = {"Lcom/app/tgtg/model/remote/order/OrderItem;", "Landroid/os/Parcelable;", "Lcom/app/tgtg/model/remote/ItemId;", "itemId", "", "quantity", "Lcom/app/tgtg/model/remote/payment/Price;", "itemPrice", "totalPrice", "", "itemName", "itemSubtitle", "Lcom/app/tgtg/model/remote/item/Picture;", "itemCoverImage", "<init>", "(Ljava/lang/String;ILcom/app/tgtg/model/remote/payment/Price;Lcom/app/tgtg/model/remote/payment/Price;Ljava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/item/Picture;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;ILcom/app/tgtg/model/remote/payment/Price;Lcom/app/tgtg/model/remote/payment/Price;Ljava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/item/Picture;Lm90/m1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1-RWxzYZM", "()Ljava/lang/String;", "component1", "component2", "component3", "()Lcom/app/tgtg/model/remote/payment/Price;", "component4", "component5", "component6", "component7", "()Lcom/app/tgtg/model/remote/item/Picture;", "copy-vsgkF6o", "(Ljava/lang/String;ILcom/app/tgtg/model/remote/payment/Price;Lcom/app/tgtg/model/remote/payment/Price;Ljava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/item/Picture;)Lcom/app/tgtg/model/remote/order/OrderItem;", "copy", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "write$Self$app", "(Lcom/app/tgtg/model/remote/order/OrderItem;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getItemId-RWxzYZM", "getItemId-RWxzYZM$annotations", "()V", "I", "getQuantity", "getQuantity$annotations", "Lcom/app/tgtg/model/remote/payment/Price;", "getItemPrice", "getItemPrice$annotations", "getTotalPrice", "getTotalPrice$annotations", "getItemName", "getItemName$annotations", "getItemSubtitle", "getItemSubtitle$annotations", "Lcom/app/tgtg/model/remote/item/Picture;", "getItemCoverImage", "getItemCoverImage$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class OrderItem implements Parcelable {

    @Nullable
    private final Picture itemCoverImage;

    @Nullable
    private final String itemId;

    @Nullable
    private final String itemName;

    @Nullable
    private final Price itemPrice;

    @Nullable
    private final String itemSubtitle;
    private final int quantity;

    @Nullable
    private final Price totalPrice;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<OrderItem> CREATOR = new Creator();

    private /* synthetic */ OrderItem(int i11, String str, int i12, Price price, Price price2, String str2, String str3, Picture picture, m1 m1Var) {
        if (119 != (i11 & 119)) {
            c1.j(i11, 119, OrderItem$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.itemId = str;
        this.quantity = i12;
        this.itemPrice = price;
        if ((i11 & 8) == 0) {
            this.totalPrice = null;
        } else {
            this.totalPrice = price2;
        }
        this.itemName = str2;
        this.itemSubtitle = str3;
        this.itemCoverImage = picture;
    }

    /* JADX INFO: renamed from: copy-vsgkF6o$default, reason: not valid java name */
    public static /* synthetic */ OrderItem m443copyvsgkF6o$default(OrderItem orderItem, String str, int i11, Price price, Price price2, String str2, String str3, Picture picture, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = orderItem.itemId;
        }
        if ((i12 & 2) != 0) {
            i11 = orderItem.quantity;
        }
        if ((i12 & 4) != 0) {
            price = orderItem.itemPrice;
        }
        if ((i12 & 8) != 0) {
            price2 = orderItem.totalPrice;
        }
        if ((i12 & 16) != 0) {
            str2 = orderItem.itemName;
        }
        if ((i12 & 32) != 0) {
            str3 = orderItem.itemSubtitle;
        }
        if ((i12 & 64) != 0) {
            picture = orderItem.itemCoverImage;
        }
        String str4 = str3;
        Picture picture2 = picture;
        String str5 = str2;
        Price price3 = price;
        return orderItem.m446copyvsgkF6o(str, i11, price3, price2, str5, str4, picture2);
    }

    public static final /* synthetic */ void write$Self$app(OrderItem self, b output, SerialDescriptor serialDesc) {
        ItemId$$serializer itemId$$serializer = ItemId$$serializer.INSTANCE;
        String str = self.itemId;
        output.r(serialDesc, 0, itemId$$serializer, str != null ? ItemId.m197boximpl(str) : null);
        output.m(1, self.quantity, serialDesc);
        Price$$serializer price$$serializer = Price$$serializer.INSTANCE;
        output.r(serialDesc, 2, price$$serializer, self.itemPrice);
        if (output.C(serialDesc) || self.totalPrice != null) {
            output.r(serialDesc, 3, price$$serializer, self.totalPrice);
        }
        r1 r1Var = r1.f29848a;
        output.r(serialDesc, 4, r1Var, self.itemName);
        output.r(serialDesc, 5, r1Var, self.itemSubtitle);
        output.r(serialDesc, 6, Picture$$serializer.INSTANCE, self.itemCoverImage);
    }

    @Nullable
    /* JADX INFO: renamed from: component1-RWxzYZM, reason: not valid java name and from getter */
    public final String getItemId() {
        return this.itemId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getQuantity() {
        return this.quantity;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Price getItemPrice() {
        return this.itemPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Price getTotalPrice() {
        return this.totalPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getItemName() {
        return this.itemName;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getItemSubtitle() {
        return this.itemSubtitle;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Picture getItemCoverImage() {
        return this.itemCoverImage;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-vsgkF6o, reason: not valid java name */
    public final OrderItem m446copyvsgkF6o(@Nullable String itemId, int quantity, @Nullable Price itemPrice, @Nullable Price totalPrice, @Nullable String itemName, @Nullable String itemSubtitle, @Nullable Picture itemCoverImage) {
        return new OrderItem(itemId, quantity, itemPrice, totalPrice, itemName, itemSubtitle, itemCoverImage, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.app.tgtg.model.remote.order.OrderItem
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.app.tgtg.model.remote.order.OrderItem r5 = (com.app.tgtg.model.remote.order.OrderItem) r5
            java.lang.String r1 = r4.itemId
            java.lang.String r3 = r5.itemId
            if (r1 != 0) goto L18
            if (r3 != 0) goto L16
            r1 = r0
            goto L1f
        L16:
            r1 = r2
            goto L1f
        L18:
            if (r3 != 0) goto L1b
            goto L16
        L1b:
            boolean r1 = com.app.tgtg.model.remote.ItemId.m201equalsimpl0(r1, r3)
        L1f:
            if (r1 != 0) goto L22
            return r2
        L22:
            int r1 = r4.quantity
            int r3 = r5.quantity
            if (r1 == r3) goto L29
            return r2
        L29:
            com.app.tgtg.model.remote.payment.Price r1 = r4.itemPrice
            com.app.tgtg.model.remote.payment.Price r3 = r5.itemPrice
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L34
            return r2
        L34:
            com.app.tgtg.model.remote.payment.Price r1 = r4.totalPrice
            com.app.tgtg.model.remote.payment.Price r3 = r5.totalPrice
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L3f
            return r2
        L3f:
            java.lang.String r1 = r4.itemName
            java.lang.String r3 = r5.itemName
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L4a
            return r2
        L4a:
            java.lang.String r1 = r4.itemSubtitle
            java.lang.String r3 = r5.itemSubtitle
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L55
            return r2
        L55:
            com.app.tgtg.model.remote.item.Picture r1 = r4.itemCoverImage
            com.app.tgtg.model.remote.item.Picture r5 = r5.itemCoverImage
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r5)
            if (r5 != 0) goto L60
            return r2
        L60:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.tgtg.model.remote.order.OrderItem.equals(java.lang.Object):boolean");
    }

    @Nullable
    public final Picture getItemCoverImage() {
        return this.itemCoverImage;
    }

    @Nullable
    /* JADX INFO: renamed from: getItemId-RWxzYZM, reason: not valid java name */
    public final String m447getItemIdRWxzYZM() {
        return this.itemId;
    }

    @Nullable
    public final String getItemName() {
        return this.itemName;
    }

    @Nullable
    public final Price getItemPrice() {
        return this.itemPrice;
    }

    @Nullable
    public final String getItemSubtitle() {
        return this.itemSubtitle;
    }

    public final int getQuantity() {
        return this.quantity;
    }

    @Nullable
    public final Price getTotalPrice() {
        return this.totalPrice;
    }

    public int hashCode() {
        String str = this.itemId;
        int iB = k.b(this.quantity, (str == null ? 0 : ItemId.m202hashCodeimpl(str)) * 31, 31);
        Price price = this.itemPrice;
        int iHashCode = (iB + (price == null ? 0 : price.hashCode())) * 31;
        Price price2 = this.totalPrice;
        int iHashCode2 = (iHashCode + (price2 == null ? 0 : price2.hashCode())) * 31;
        String str2 = this.itemName;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.itemSubtitle;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Picture picture = this.itemCoverImage;
        return iHashCode4 + (picture != null ? picture.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.itemId;
        String strM203toStringimpl = str == null ? Address.ADDRESS_NULL_PLACEHOLDER : ItemId.m203toStringimpl(str);
        int i11 = this.quantity;
        Price price = this.itemPrice;
        Price price2 = this.totalPrice;
        String str2 = this.itemName;
        String str3 = this.itemSubtitle;
        Picture picture = this.itemCoverImage;
        StringBuilder sb2 = new StringBuilder("OrderItem(itemId=");
        sb2.append(strM203toStringimpl);
        sb2.append(", quantity=");
        sb2.append(i11);
        sb2.append(", itemPrice=");
        sb2.append(price);
        sb2.append(", totalPrice=");
        sb2.append(price2);
        sb2.append(", itemName=");
        s.A(sb2, str2, ", itemSubtitle=", str3, ", itemCoverImage=");
        sb2.append(picture);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        String str = this.itemId;
        if (str == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            ItemId.m204writeToParcelimpl(str, dest, flags);
        }
        dest.writeInt(this.quantity);
        Price price = this.itemPrice;
        if (price == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            price.writeToParcel(dest, flags);
        }
        Price price2 = this.totalPrice;
        if (price2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            price2.writeToParcel(dest, flags);
        }
        dest.writeString(this.itemName);
        dest.writeString(this.itemSubtitle);
        Picture picture = this.itemCoverImage;
        if (picture == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            picture.writeToParcel(dest, flags);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/order/OrderItem$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/order/OrderItem;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return OrderItem$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<OrderItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OrderItem createFromParcel(Parcel parcel) {
            String strM205unboximpl;
            Parcelable parcelable;
            parcel.getClass();
            ItemId itemIdCreateFromParcel = parcel.readInt() == 0 ? null : ItemId.CREATOR.createFromParcel(parcel);
            if (itemIdCreateFromParcel != null) {
                strM205unboximpl = itemIdCreateFromParcel.m205unboximpl();
                parcelable = null;
            } else {
                strM205unboximpl = null;
                parcelable = null;
            }
            return new OrderItem(strM205unboximpl, parcel.readInt(), (Price) (parcel.readInt() == 0 ? parcelable : Price.CREATOR.createFromParcel(parcel)), (Price) (parcel.readInt() == 0 ? parcelable : Price.CREATOR.createFromParcel(parcel)), parcel.readString(), parcel.readString(), (Picture) (parcel.readInt() == 0 ? parcelable : Picture.CREATOR.createFromParcel(parcel)), null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OrderItem[] newArray(int i11) {
            return new OrderItem[i11];
        }
    }

    @g("item_cover_image")
    public static /* synthetic */ void getItemCoverImage$annotations() {
    }

    @g("item_id")
    /* JADX INFO: renamed from: getItemId-RWxzYZM$annotations, reason: not valid java name */
    public static /* synthetic */ void m444getItemIdRWxzYZM$annotations() {
    }

    @g("item_name")
    public static /* synthetic */ void getItemName$annotations() {
    }

    @g("item_price")
    public static /* synthetic */ void getItemPrice$annotations() {
    }

    @g("item_subtitle")
    public static /* synthetic */ void getItemSubtitle$annotations() {
    }

    @g("quantity")
    public static /* synthetic */ void getQuantity$annotations() {
    }

    @g("total_price")
    public static /* synthetic */ void getTotalPrice$annotations() {
    }

    public /* synthetic */ OrderItem(String str, int i11, Price price, Price price2, String str2, String str3, Picture picture, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i11, price, price2, str2, str3, picture);
    }

    public /* synthetic */ OrderItem(int i11, String str, int i12, Price price, Price price2, String str2, String str3, Picture picture, m1 m1Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, str, i12, price, price2, str2, str3, picture, m1Var);
    }

    private OrderItem(String str, int i11, Price price, Price price2, String str2, String str3, Picture picture) {
        this.itemId = str;
        this.quantity = i11;
        this.itemPrice = price;
        this.totalPrice = price2;
        this.itemName = str2;
        this.itemSubtitle = str3;
        this.itemCoverImage = picture;
    }

    public /* synthetic */ OrderItem(String str, int i11, Price price, Price price2, String str2, String str3, Picture picture, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i11, price, (i12 & 8) != 0 ? null : price2, str2, str3, picture, null);
    }
}
