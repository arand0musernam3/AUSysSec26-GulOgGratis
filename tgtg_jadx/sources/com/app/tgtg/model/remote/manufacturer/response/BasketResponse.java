package com.app.tgtg.model.remote.manufacturer.response;

import android.os.Parcel;
import android.os.Parcelable;
import b3.i;
import com.app.tgtg.model.remote.payment.Price;
import com.app.tgtg.model.remote.payment.Price$$serializer;
import eu.a;
import i90.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
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
import r8.k;
import u70.j;
import u70.l;
import u70.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0087\b\u0018\u0000 [2\u00020\u0001:\u0002\\[Bc\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0010\u0010\u0011By\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0010\u0010\u0016J!\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0012¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0012¢\u0006\u0004\b \u0010!J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b&\u0010%J\u0010\u0010'\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b)\u0010%J\u0012\u0010*\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b,\u0010%J\u0012\u0010-\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b-\u0010.J\u0012\u0010/\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b/\u0010+J~\u00100\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b2\u0010.J\u0010\u00103\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b3\u0010\u001bJ\u001a\u00106\u001a\u00020\b2\b\u00105\u001a\u0004\u0018\u000104HÖ\u0003¢\u0006\u0004\b6\u00107J\u0017\u00109\u001a\u00020\u00122\u0006\u00108\u001a\u00020\u0012H\u0002¢\u0006\u0004\b9\u0010:J'\u0010B\u001a\u00020\u001f2\u0006\u0010;\u001a\u00020\u00002\u0006\u0010=\u001a\u00020<2\u0006\u0010?\u001a\u00020>H\u0001¢\u0006\u0004\b@\u0010AR&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010C\u0012\u0004\bE\u0010F\u001a\u0004\bD\u0010#R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010G\u0012\u0004\bI\u0010F\u001a\u0004\bH\u0010%R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010G\u0012\u0004\bK\u0010F\u001a\u0004\bJ\u0010%R \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010L\u0012\u0004\bN\u0010F\u001a\u0004\bM\u0010(R\"\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010G\u0012\u0004\bP\u0010F\u001a\u0004\bO\u0010%R\"\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010Q\u0012\u0004\bS\u0010F\u001a\u0004\bR\u0010+R\"\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010G\u0012\u0004\bU\u0010F\u001a\u0004\bT\u0010%R\"\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010V\u0012\u0004\bX\u0010F\u001a\u0004\bW\u0010.R\"\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010Q\u0012\u0004\bZ\u0010F\u001a\u0004\bY\u0010+¨\u0006]"}, d2 = {"Lcom/app/tgtg/model/remote/manufacturer/response/BasketResponse;", "Landroid/os/Parcelable;", "", "Lcom/app/tgtg/model/remote/manufacturer/response/BasketItem;", "basketItems", "Lcom/app/tgtg/model/remote/payment/Price;", "basketSubtotalPrice", "basketValue", "", "canCheckout", "requiredAmountToCheckout", "freeDelivery", "requiredAmountToFreeDelivery", "", "estimatedDelivery", "hasNonEdibleItem", "<init>", "(Ljava/util/List;Lcom/app/tgtg/model/remote/payment/Price;Lcom/app/tgtg/model/remote/payment/Price;ZLcom/app/tgtg/model/remote/payment/Price;Ljava/lang/Boolean;Lcom/app/tgtg/model/remote/payment/Price;Ljava/lang/String;Ljava/lang/Boolean;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/util/List;Lcom/app/tgtg/model/remote/payment/Price;Lcom/app/tgtg/model/remote/payment/Price;ZLcom/app/tgtg/model/remote/payment/Price;Ljava/lang/Boolean;Lcom/app/tgtg/model/remote/payment/Price;Ljava/lang/String;Ljava/lang/Boolean;Lm90/m1;)V", "Ldv/b;", "getTrackingItem", "(Ljava/util/List;)Ljava/util/List;", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/util/List;", "component2", "()Lcom/app/tgtg/model/remote/payment/Price;", "component3", "component4", "()Z", "component5", "component6", "()Ljava/lang/Boolean;", "component7", "component8", "()Ljava/lang/String;", "component9", "copy", "(Ljava/util/List;Lcom/app/tgtg/model/remote/payment/Price;Lcom/app/tgtg/model/remote/payment/Price;ZLcom/app/tgtg/model/remote/payment/Price;Ljava/lang/Boolean;Lcom/app/tgtg/model/remote/payment/Price;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/app/tgtg/model/remote/manufacturer/response/BasketResponse;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "quantity", "getQuantity", "(I)I", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "write$Self$app", "(Lcom/app/tgtg/model/remote/manufacturer/response/BasketResponse;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/util/List;", "getBasketItems", "getBasketItems$annotations", "()V", "Lcom/app/tgtg/model/remote/payment/Price;", "getBasketSubtotalPrice", "getBasketSubtotalPrice$annotations", "getBasketValue", "getBasketValue$annotations", "Z", "getCanCheckout", "getCanCheckout$annotations", "getRequiredAmountToCheckout", "getRequiredAmountToCheckout$annotations", "Ljava/lang/Boolean;", "getFreeDelivery", "getFreeDelivery$annotations", "getRequiredAmountToFreeDelivery", "getRequiredAmountToFreeDelivery$annotations", "Ljava/lang/String;", "getEstimatedDelivery", "getEstimatedDelivery$annotations", "getHasNonEdibleItem", "getHasNonEdibleItem$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBasket.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Basket.kt\ncom/app/tgtg/model/remote/manufacturer/response/BasketResponse\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,85:1\n1586#2:86\n1661#2,3:87\n*S KotlinDebug\n*F\n+ 1 Basket.kt\ncom/app/tgtg/model/remote/manufacturer/response/BasketResponse\n*L\n30#1:86\n30#1:87,3\n*E\n"})
public final /* data */ class BasketResponse implements Parcelable {

    @NotNull
    private final List<BasketItem> basketItems;

    @Nullable
    private final Price basketSubtotalPrice;

    @Nullable
    private final Price basketValue;
    private final boolean canCheckout;

    @Nullable
    private final String estimatedDelivery;

    @Nullable
    private final Boolean freeDelivery;

    @Nullable
    private final Boolean hasNonEdibleItem;

    @Nullable
    private final Price requiredAmountToCheckout;

    @Nullable
    private final Price requiredAmountToFreeDelivery;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<BasketResponse> CREATOR = new Creator();

    @NotNull
    private static final j[] $childSerializers = {l.a(m.PUBLICATION, new a(18)), null, null, null, null, null, null, null, null};

    public /* synthetic */ BasketResponse(int i11, List list, Price price, Price price2, boolean z11, Price price3, Boolean bool, Price price4, String str, Boolean bool2, m1 m1Var) {
        if (511 != (i11 & 511)) {
            c1.j(i11, 511, BasketResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.basketItems = list;
        this.basketSubtotalPrice = price;
        this.basketValue = price2;
        this.canCheckout = z11;
        this.requiredAmountToCheckout = price3;
        this.freeDelivery = bool;
        this.requiredAmountToFreeDelivery = price4;
        this.estimatedDelivery = str;
        this.hasNonEdibleItem = bool2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new d(BasketItem$$serializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BasketResponse copy$default(BasketResponse basketResponse, List list, Price price, Price price2, boolean z11, Price price3, Boolean bool, Price price4, String str, Boolean bool2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = basketResponse.basketItems;
        }
        if ((i11 & 2) != 0) {
            price = basketResponse.basketSubtotalPrice;
        }
        if ((i11 & 4) != 0) {
            price2 = basketResponse.basketValue;
        }
        if ((i11 & 8) != 0) {
            z11 = basketResponse.canCheckout;
        }
        if ((i11 & 16) != 0) {
            price3 = basketResponse.requiredAmountToCheckout;
        }
        if ((i11 & 32) != 0) {
            bool = basketResponse.freeDelivery;
        }
        if ((i11 & 64) != 0) {
            price4 = basketResponse.requiredAmountToFreeDelivery;
        }
        if ((i11 & 128) != 0) {
            str = basketResponse.estimatedDelivery;
        }
        if ((i11 & 256) != 0) {
            bool2 = basketResponse.hasNonEdibleItem;
        }
        String str2 = str;
        Boolean bool3 = bool2;
        Boolean bool4 = bool;
        Price price5 = price4;
        Price price6 = price3;
        Price price7 = price2;
        return basketResponse.copy(list, price, price7, z11, price6, bool4, price5, str2, bool3);
    }

    private final int getQuantity(int quantity) {
        if (quantity <= 0) {
            return 100;
        }
        return quantity;
    }

    public static final /* synthetic */ void write$Self$app(BasketResponse self, b output, SerialDescriptor serialDesc) {
        output.i(serialDesc, 0, (KSerializer) $childSerializers[0].getValue(), self.basketItems);
        Price$$serializer price$$serializer = Price$$serializer.INSTANCE;
        output.r(serialDesc, 1, price$$serializer, self.basketSubtotalPrice);
        output.r(serialDesc, 2, price$$serializer, self.basketValue);
        output.p(serialDesc, 3, self.canCheckout);
        output.r(serialDesc, 4, price$$serializer, self.requiredAmountToCheckout);
        g gVar = g.f29797a;
        output.r(serialDesc, 5, gVar, self.freeDelivery);
        output.r(serialDesc, 6, price$$serializer, self.requiredAmountToFreeDelivery);
        output.r(serialDesc, 7, r1.f29848a, self.estimatedDelivery);
        output.r(serialDesc, 8, gVar, self.hasNonEdibleItem);
    }

    @NotNull
    public final List<BasketItem> component1() {
        return this.basketItems;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Price getBasketSubtotalPrice() {
        return this.basketSubtotalPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Price getBasketValue() {
        return this.basketValue;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getCanCheckout() {
        return this.canCheckout;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Price getRequiredAmountToCheckout() {
        return this.requiredAmountToCheckout;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Boolean getFreeDelivery() {
        return this.freeDelivery;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Price getRequiredAmountToFreeDelivery() {
        return this.requiredAmountToFreeDelivery;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getEstimatedDelivery() {
        return this.estimatedDelivery;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Boolean getHasNonEdibleItem() {
        return this.hasNonEdibleItem;
    }

    @NotNull
    public final BasketResponse copy(@NotNull List<BasketItem> basketItems, @Nullable Price basketSubtotalPrice, @Nullable Price basketValue, boolean canCheckout, @Nullable Price requiredAmountToCheckout, @Nullable Boolean freeDelivery, @Nullable Price requiredAmountToFreeDelivery, @Nullable String estimatedDelivery, @Nullable Boolean hasNonEdibleItem) {
        basketItems.getClass();
        return new BasketResponse(basketItems, basketSubtotalPrice, basketValue, canCheckout, requiredAmountToCheckout, freeDelivery, requiredAmountToFreeDelivery, estimatedDelivery, hasNonEdibleItem);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BasketResponse)) {
            return false;
        }
        BasketResponse basketResponse = (BasketResponse) other;
        return Intrinsics.areEqual(this.basketItems, basketResponse.basketItems) && Intrinsics.areEqual(this.basketSubtotalPrice, basketResponse.basketSubtotalPrice) && Intrinsics.areEqual(this.basketValue, basketResponse.basketValue) && this.canCheckout == basketResponse.canCheckout && Intrinsics.areEqual(this.requiredAmountToCheckout, basketResponse.requiredAmountToCheckout) && Intrinsics.areEqual(this.freeDelivery, basketResponse.freeDelivery) && Intrinsics.areEqual(this.requiredAmountToFreeDelivery, basketResponse.requiredAmountToFreeDelivery) && Intrinsics.areEqual(this.estimatedDelivery, basketResponse.estimatedDelivery) && Intrinsics.areEqual(this.hasNonEdibleItem, basketResponse.hasNonEdibleItem);
    }

    @NotNull
    public final List<BasketItem> getBasketItems() {
        return this.basketItems;
    }

    @Nullable
    public final Price getBasketSubtotalPrice() {
        return this.basketSubtotalPrice;
    }

    @Nullable
    public final Price getBasketValue() {
        return this.basketValue;
    }

    public final boolean getCanCheckout() {
        return this.canCheckout;
    }

    @Nullable
    public final String getEstimatedDelivery() {
        return this.estimatedDelivery;
    }

    @Nullable
    public final Boolean getFreeDelivery() {
        return this.freeDelivery;
    }

    @Nullable
    public final Boolean getHasNonEdibleItem() {
        return this.hasNonEdibleItem;
    }

    @Nullable
    public final Price getRequiredAmountToCheckout() {
        return this.requiredAmountToCheckout;
    }

    @Nullable
    public final Price getRequiredAmountToFreeDelivery() {
        return this.requiredAmountToFreeDelivery;
    }

    @NotNull
    public final List<dv.b> getTrackingItem(@NotNull List<BasketItem> basketItems) {
        basketItems.getClass();
        ArrayList arrayList = new ArrayList(e0.o(basketItems, 10));
        for (BasketItem basketItem : basketItems) {
            String itemId = basketItem.getItemId();
            int quantity = basketItem.getQuantity();
            Price subtotalPrice = basketItem.getSubtotalPrice();
            double value = (subtotalPrice != null ? subtotalPrice.getValue() : 1.0d) / ((double) getQuantity(basketItem.getQuantity()));
            Price subtotalPrice2 = basketItem.getSubtotalPrice();
            arrayList.add(new TrackingBasketItem(itemId, quantity, value, subtotalPrice2 != null ? subtotalPrice2.getValue() : 0.0d, basketItem.getWarnings()).parameters());
        }
        return arrayList;
    }

    public int hashCode() {
        int iHashCode = this.basketItems.hashCode() * 31;
        Price price = this.basketSubtotalPrice;
        int iHashCode2 = (iHashCode + (price == null ? 0 : price.hashCode())) * 31;
        Price price2 = this.basketValue;
        int iE = k.e((iHashCode2 + (price2 == null ? 0 : price2.hashCode())) * 31, 31, this.canCheckout);
        Price price3 = this.requiredAmountToCheckout;
        int iHashCode3 = (iE + (price3 == null ? 0 : price3.hashCode())) * 31;
        Boolean bool = this.freeDelivery;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Price price4 = this.requiredAmountToFreeDelivery;
        int iHashCode5 = (iHashCode4 + (price4 == null ? 0 : price4.hashCode())) * 31;
        String str = this.estimatedDelivery;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool2 = this.hasNonEdibleItem;
        return iHashCode6 + (bool2 != null ? bool2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "BasketResponse(basketItems=" + this.basketItems + ", basketSubtotalPrice=" + this.basketSubtotalPrice + ", basketValue=" + this.basketValue + ", canCheckout=" + this.canCheckout + ", requiredAmountToCheckout=" + this.requiredAmountToCheckout + ", freeDelivery=" + this.freeDelivery + ", requiredAmountToFreeDelivery=" + this.requiredAmountToFreeDelivery + ", estimatedDelivery=" + this.estimatedDelivery + ", hasNonEdibleItem=" + this.hasNonEdibleItem + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        Iterator itR = i.r(this.basketItems, dest);
        while (itR.hasNext()) {
            ((BasketItem) itR.next()).writeToParcel(dest, flags);
        }
        Price price = this.basketSubtotalPrice;
        if (price == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            price.writeToParcel(dest, flags);
        }
        Price price2 = this.basketValue;
        if (price2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            price2.writeToParcel(dest, flags);
        }
        dest.writeInt(this.canCheckout ? 1 : 0);
        Price price3 = this.requiredAmountToCheckout;
        if (price3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            price3.writeToParcel(dest, flags);
        }
        Boolean bool = this.freeDelivery;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            i.v(dest, 1, bool);
        }
        Price price4 = this.requiredAmountToFreeDelivery;
        if (price4 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            price4.writeToParcel(dest, flags);
        }
        dest.writeString(this.estimatedDelivery);
        Boolean bool2 = this.hasNonEdibleItem;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            i.v(dest, 1, bool2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/manufacturer/response/BasketResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/manufacturer/response/BasketResponse;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return BasketResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BasketResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BasketResponse createFromParcel(Parcel parcel) {
            boolean z11;
            Price price;
            boolean z12;
            Boolean boolValueOf;
            parcel.getClass();
            int i11 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i11);
            int iC = 0;
            while (iC != i11) {
                iC = i.c(BasketItem.CREATOR, parcel, arrayList, iC, 1);
            }
            Boolean boolValueOf2 = null;
            Price priceCreateFromParcel = parcel.readInt() == 0 ? null : Price.CREATOR.createFromParcel(parcel);
            Price priceCreateFromParcel2 = parcel.readInt() == 0 ? null : Price.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                z11 = true;
                price = priceCreateFromParcel2;
                z12 = true;
            } else {
                z11 = true;
                price = priceCreateFromParcel2;
                z12 = false;
            }
            Price priceCreateFromParcel3 = parcel.readInt() == 0 ? null : Price.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0 ? z11 : false);
            }
            Price priceCreateFromParcel4 = parcel.readInt() == 0 ? null : Price.CREATOR.createFromParcel(parcel);
            boolean z13 = z11;
            Boolean bool = boolValueOf;
            String string = parcel.readString();
            if (parcel.readInt() != 0) {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0 ? z13 : false);
            }
            return new BasketResponse(arrayList, priceCreateFromParcel, price, z12, priceCreateFromParcel3, bool, priceCreateFromParcel4, string, boolValueOf2);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BasketResponse[] newArray(int i11) {
            return new BasketResponse[i11];
        }
    }

    @i90.g("items_in_basket_list")
    public static /* synthetic */ void getBasketItems$annotations() {
    }

    @i90.g("basket_subtotal_price")
    public static /* synthetic */ void getBasketSubtotalPrice$annotations() {
    }

    @i90.g("basket_value")
    public static /* synthetic */ void getBasketValue$annotations() {
    }

    @i90.g("can_checkout")
    public static /* synthetic */ void getCanCheckout$annotations() {
    }

    @i90.g("estimated_delivery")
    public static /* synthetic */ void getEstimatedDelivery$annotations() {
    }

    @i90.g("free_delivery")
    public static /* synthetic */ void getFreeDelivery$annotations() {
    }

    @i90.g("has_non_edible_item")
    public static /* synthetic */ void getHasNonEdibleItem$annotations() {
    }

    @i90.g("required_amount_to_checkout")
    public static /* synthetic */ void getRequiredAmountToCheckout$annotations() {
    }

    @i90.g("required_amount_to_free_delivery")
    public static /* synthetic */ void getRequiredAmountToFreeDelivery$annotations() {
    }

    public BasketResponse(@NotNull List<BasketItem> list, @Nullable Price price, @Nullable Price price2, boolean z11, @Nullable Price price3, @Nullable Boolean bool, @Nullable Price price4, @Nullable String str, @Nullable Boolean bool2) {
        list.getClass();
        this.basketItems = list;
        this.basketSubtotalPrice = price;
        this.basketValue = price2;
        this.canCheckout = z11;
        this.requiredAmountToCheckout = price3;
        this.freeDelivery = bool;
        this.requiredAmountToFreeDelivery = price4;
        this.estimatedDelivery = str;
        this.hasNonEdibleItem = bool2;
    }
}
