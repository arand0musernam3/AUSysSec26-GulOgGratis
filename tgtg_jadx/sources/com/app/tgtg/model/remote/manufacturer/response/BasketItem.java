package com.app.tgtg.model.remote.manufacturer.response;

import android.os.Parcel;
import android.os.Parcelable;
import b3.i;
import com.app.tgtg.model.remote.item.Picture;
import com.app.tgtg.model.remote.item.Picture$$serializer;
import com.app.tgtg.model.remote.payment.Price;
import com.app.tgtg.model.remote.payment.Price$$serializer;
import e0.f;
import eu.a;
import i90.g;
import i90.h;
import java.util.ArrayList;
import java.util.Iterator;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import u70.j;
import u70.l;
import u70.m;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0087\b\u0018\u0000 U2\u00020\u0001:\u0002VUB[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0011\u0010\u0012Bw\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0011\u0010\u0016J\r\u0010\u0017\u001a\u00020\u000b¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u000b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010 J\u0012\u0010#\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b'\u0010&J\u0010\u0010(\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b(\u0010\u0018J\u0010\u0010)\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b)\u0010\u0018J\u0016\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003¢\u0006\u0004\b*\u0010+Jv\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b.\u0010 J\u0010\u0010/\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b/\u0010\u0018J\u001a\u00103\u001a\u0002022\b\u00101\u001a\u0004\u0018\u000100HÖ\u0003¢\u0006\u0004\b3\u00104J'\u0010<\u001a\u00020\u001c2\u0006\u00105\u001a\u00020\u00002\u0006\u00107\u001a\u0002062\u0006\u00109\u001a\u000208H\u0001¢\u0006\u0004\b:\u0010;R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010=\u0012\u0004\b?\u0010@\u001a\u0004\b>\u0010 R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010=\u0012\u0004\bB\u0010@\u001a\u0004\bA\u0010 R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010=\u0012\u0004\bD\u0010@\u001a\u0004\bC\u0010 R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010E\u0012\u0004\bG\u0010@\u001a\u0004\bF\u0010$R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010H\u0012\u0004\bJ\u0010@\u001a\u0004\bI\u0010&R\"\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010H\u0012\u0004\bL\u0010@\u001a\u0004\bK\u0010&R \u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010M\u0012\u0004\bO\u0010@\u001a\u0004\bN\u0010\u0018R \u0010\r\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010M\u0012\u0004\bQ\u0010@\u001a\u0004\bP\u0010\u0018R&\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010R\u0012\u0004\bT\u0010@\u001a\u0004\bS\u0010+¨\u0006W"}, d2 = {"Lcom/app/tgtg/model/remote/manufacturer/response/BasketItem;", "Landroid/os/Parcelable;", "", "itemId", "itemName", "itemSubtitle", "Lcom/app/tgtg/model/remote/item/Picture;", "coverPicture", "Lcom/app/tgtg/model/remote/payment/Price;", "itemValue", "subtotalPrice", "", "quantity", "maxAvailableQuantity", "", "Lcom/app/tgtg/model/remote/manufacturer/response/BasketWarningMessage;", "warnings", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/item/Picture;Lcom/app/tgtg/model/remote/payment/Price;Lcom/app/tgtg/model/remote/payment/Price;IILjava/util/List;)V", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/item/Picture;Lcom/app/tgtg/model/remote/payment/Price;Lcom/app/tgtg/model/remote/payment/Price;IILjava/util/List;Lm90/m1;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/app/tgtg/model/remote/item/Picture;", "component5", "()Lcom/app/tgtg/model/remote/payment/Price;", "component6", "component7", "component8", "component9", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/item/Picture;Lcom/app/tgtg/model/remote/payment/Price;Lcom/app/tgtg/model/remote/payment/Price;IILjava/util/List;)Lcom/app/tgtg/model/remote/manufacturer/response/BasketItem;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "write$Self$app", "(Lcom/app/tgtg/model/remote/manufacturer/response/BasketItem;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getItemId", "getItemId$annotations", "()V", "getItemName", "getItemName$annotations", "getItemSubtitle", "getItemSubtitle$annotations", "Lcom/app/tgtg/model/remote/item/Picture;", "getCoverPicture", "getCoverPicture$annotations", "Lcom/app/tgtg/model/remote/payment/Price;", "getItemValue", "getItemValue$annotations", "getSubtotalPrice", "getSubtotalPrice$annotations", "I", "getQuantity", "getQuantity$annotations", "getMaxAvailableQuantity", "getMaxAvailableQuantity$annotations", "Ljava/util/List;", "getWarnings", "getWarnings$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class BasketItem implements Parcelable {

    @Nullable
    private final Picture coverPicture;

    @NotNull
    private final String itemId;

    @NotNull
    private final String itemName;

    @NotNull
    private final String itemSubtitle;

    @Nullable
    private final Price itemValue;
    private final int maxAvailableQuantity;
    private final int quantity;

    @Nullable
    private final Price subtotalPrice;

    @NotNull
    private final List<BasketWarningMessage> warnings;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<BasketItem> CREATOR = new Creator();

    @NotNull
    private static final j[] $childSerializers = {null, null, null, null, null, null, null, null, l.a(m.PUBLICATION, new a(14))};

    public /* synthetic */ BasketItem(int i11, String str, String str2, String str3, Picture picture, Price price, Price price2, int i12, int i13, List list, m1 m1Var) {
        if (511 != (i11 & 511)) {
            c1.j(i11, 511, BasketItem$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.itemId = str;
        this.itemName = str2;
        this.itemSubtitle = str3;
        this.coverPicture = picture;
        this.itemValue = price;
        this.subtotalPrice = price2;
        this.quantity = i12;
        this.maxAvailableQuantity = i13;
        this.warnings = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new d(BasketWarningMessageSerializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BasketItem copy$default(BasketItem basketItem, String str, String str2, String str3, Picture picture, Price price, Price price2, int i11, int i12, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = basketItem.itemId;
        }
        if ((i13 & 2) != 0) {
            str2 = basketItem.itemName;
        }
        if ((i13 & 4) != 0) {
            str3 = basketItem.itemSubtitle;
        }
        if ((i13 & 8) != 0) {
            picture = basketItem.coverPicture;
        }
        if ((i13 & 16) != 0) {
            price = basketItem.itemValue;
        }
        if ((i13 & 32) != 0) {
            price2 = basketItem.subtotalPrice;
        }
        if ((i13 & 64) != 0) {
            i11 = basketItem.quantity;
        }
        if ((i13 & 128) != 0) {
            i12 = basketItem.maxAvailableQuantity;
        }
        if ((i13 & 256) != 0) {
            list = basketItem.warnings;
        }
        int i14 = i12;
        List list2 = list;
        Price price3 = price2;
        int i15 = i11;
        Price price4 = price;
        String str4 = str3;
        return basketItem.copy(str, str2, str4, picture, price4, price3, i15, i14, list2);
    }

    public static final /* synthetic */ void write$Self$app(BasketItem self, b output, SerialDescriptor serialDesc) {
        j[] jVarArr = $childSerializers;
        output.q(serialDesc, 0, self.itemId);
        output.q(serialDesc, 1, self.itemName);
        output.q(serialDesc, 2, self.itemSubtitle);
        output.r(serialDesc, 3, Picture$$serializer.INSTANCE, self.coverPicture);
        Price$$serializer price$$serializer = Price$$serializer.INSTANCE;
        output.r(serialDesc, 4, price$$serializer, self.itemValue);
        output.r(serialDesc, 5, price$$serializer, self.subtotalPrice);
        output.m(6, self.quantity, serialDesc);
        output.m(7, self.maxAvailableQuantity, serialDesc);
        output.i(serialDesc, 8, (KSerializer) jVarArr[8].getValue(), self.warnings);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getItemId() {
        return this.itemId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getItemName() {
        return this.itemName;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getItemSubtitle() {
        return this.itemSubtitle;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Picture getCoverPicture() {
        return this.coverPicture;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Price getItemValue() {
        return this.itemValue;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Price getSubtotalPrice() {
        return this.subtotalPrice;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getQuantity() {
        return this.quantity;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getMaxAvailableQuantity() {
        return this.maxAvailableQuantity;
    }

    @NotNull
    public final List<BasketWarningMessage> component9() {
        return this.warnings;
    }

    @NotNull
    public final BasketItem copy(@NotNull String itemId, @NotNull String itemName, @NotNull String itemSubtitle, @Nullable Picture coverPicture, @Nullable Price itemValue, @Nullable Price subtotalPrice, int quantity, int maxAvailableQuantity, @NotNull List<? extends BasketWarningMessage> warnings) {
        itemId.getClass();
        itemName.getClass();
        itemSubtitle.getClass();
        warnings.getClass();
        return new BasketItem(itemId, itemName, itemSubtitle, coverPicture, itemValue, subtotalPrice, quantity, maxAvailableQuantity, warnings);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BasketItem)) {
            return false;
        }
        BasketItem basketItem = (BasketItem) other;
        return Intrinsics.areEqual(this.itemId, basketItem.itemId) && Intrinsics.areEqual(this.itemName, basketItem.itemName) && Intrinsics.areEqual(this.itemSubtitle, basketItem.itemSubtitle) && Intrinsics.areEqual(this.coverPicture, basketItem.coverPicture) && Intrinsics.areEqual(this.itemValue, basketItem.itemValue) && Intrinsics.areEqual(this.subtotalPrice, basketItem.subtotalPrice) && this.quantity == basketItem.quantity && this.maxAvailableQuantity == basketItem.maxAvailableQuantity && Intrinsics.areEqual(this.warnings, basketItem.warnings);
    }

    @Nullable
    public final Picture getCoverPicture() {
        return this.coverPicture;
    }

    @NotNull
    public final String getItemId() {
        return this.itemId;
    }

    @NotNull
    public final String getItemName() {
        return this.itemName;
    }

    @NotNull
    public final String getItemSubtitle() {
        return this.itemSubtitle;
    }

    @Nullable
    public final Price getItemValue() {
        return this.itemValue;
    }

    public final int getMaxAvailableQuantity() {
        return this.maxAvailableQuantity;
    }

    public final int getQuantity() {
        return this.quantity;
    }

    @Nullable
    public final Price getSubtotalPrice() {
        return this.subtotalPrice;
    }

    @NotNull
    public final List<BasketWarningMessage> getWarnings() {
        return this.warnings;
    }

    public int hashCode() {
        int iB = l1.b(l1.b(this.itemId.hashCode() * 31, 31, this.itemName), 31, this.itemSubtitle);
        Picture picture = this.coverPicture;
        int iHashCode = (iB + (picture == null ? 0 : picture.hashCode())) * 31;
        Price price = this.itemValue;
        int iHashCode2 = (iHashCode + (price == null ? 0 : price.hashCode())) * 31;
        Price price2 = this.subtotalPrice;
        return this.warnings.hashCode() + k.b(this.maxAvailableQuantity, k.b(this.quantity, (iHashCode2 + (price2 != null ? price2.hashCode() : 0)) * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        String str = this.itemId;
        String str2 = this.itemName;
        String str3 = this.itemSubtitle;
        Picture picture = this.coverPicture;
        Price price = this.itemValue;
        Price price2 = this.subtotalPrice;
        int i11 = this.quantity;
        int i12 = this.maxAvailableQuantity;
        List<BasketWarningMessage> list = this.warnings;
        StringBuilder sbT = f.t("BasketItem(itemId=", str, ", itemName=", str2, ", itemSubtitle=");
        sbT.append(str3);
        sbT.append(", coverPicture=");
        sbT.append(picture);
        sbT.append(", itemValue=");
        sbT.append(price);
        sbT.append(", subtotalPrice=");
        sbT.append(price2);
        sbT.append(", quantity=");
        f.C(sbT, i11, ", maxAvailableQuantity=", i12, ", warnings=");
        return f.p(sbT, list, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.itemId);
        dest.writeString(this.itemName);
        dest.writeString(this.itemSubtitle);
        Picture picture = this.coverPicture;
        if (picture == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            picture.writeToParcel(dest, flags);
        }
        Price price = this.itemValue;
        if (price == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            price.writeToParcel(dest, flags);
        }
        Price price2 = this.subtotalPrice;
        if (price2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            price2.writeToParcel(dest, flags);
        }
        dest.writeInt(this.quantity);
        dest.writeInt(this.maxAvailableQuantity);
        Iterator itR = i.r(this.warnings, dest);
        while (itR.hasNext()) {
            dest.writeString(((BasketWarningMessage) itR.next()).name());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/manufacturer/response/BasketItem$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/manufacturer/response/BasketItem;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return BasketItem$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BasketItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BasketItem createFromParcel(Parcel parcel) {
            parcel.getClass();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            Picture pictureCreateFromParcel = parcel.readInt() == 0 ? null : Picture.CREATOR.createFromParcel(parcel);
            Price priceCreateFromParcel = parcel.readInt() == 0 ? null : Price.CREATOR.createFromParcel(parcel);
            Price priceCreateFromParcel2 = parcel.readInt() != 0 ? Price.CREATOR.createFromParcel(parcel) : null;
            int i11 = parcel.readInt();
            int i12 = parcel.readInt();
            int i13 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i13);
            for (int i14 = 0; i14 != i13; i14++) {
                arrayList.add(BasketWarningMessage.valueOf(parcel.readString()));
            }
            return new BasketItem(string, string2, string3, pictureCreateFromParcel, priceCreateFromParcel, priceCreateFromParcel2, i11, i12, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BasketItem[] newArray(int i11) {
            return new BasketItem[i11];
        }
    }

    @g("cover_picture")
    public static /* synthetic */ void getCoverPicture$annotations() {
    }

    @g("item_id")
    public static /* synthetic */ void getItemId$annotations() {
    }

    @g("item_name")
    public static /* synthetic */ void getItemName$annotations() {
    }

    @g("item_subtitle")
    public static /* synthetic */ void getItemSubtitle$annotations() {
    }

    @g("item_value")
    public static /* synthetic */ void getItemValue$annotations() {
    }

    @g("max_available_quantity")
    public static /* synthetic */ void getMaxAvailableQuantity$annotations() {
    }

    @g("quantity")
    public static /* synthetic */ void getQuantity$annotations() {
    }

    @g("subtotal_price")
    public static /* synthetic */ void getSubtotalPrice$annotations() {
    }

    @g("warnings")
    public static /* synthetic */ void getWarnings$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BasketItem(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable Picture picture, @Nullable Price price, @Nullable Price price2, int i11, int i12, @NotNull List<? extends BasketWarningMessage> list) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        list.getClass();
        this.itemId = str;
        this.itemName = str2;
        this.itemSubtitle = str3;
        this.coverPicture = picture;
        this.itemValue = price;
        this.subtotalPrice = price2;
        this.quantity = i11;
        this.maxAvailableQuantity = i12;
        this.warnings = list;
    }
}
