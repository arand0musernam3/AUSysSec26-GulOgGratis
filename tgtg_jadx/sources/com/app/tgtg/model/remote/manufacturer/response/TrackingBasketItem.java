package com.app.tgtg.model.remote.manufacturer.response;

import dv.a;
import dv.b;
import dv.c;
import e0.f;
import h0.g;
import j4.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019JH\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0012J\u0010\u0010\u001d\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0014J\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010\u0016R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b(\u0010\u0016R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b*\u0010\u0019¨\u0006+"}, d2 = {"Lcom/app/tgtg/model/remote/manufacturer/response/TrackingBasketItem;", "", "", "itemId", "", "quantity", "", "price", "totalPrice", "", "Lcom/app/tgtg/model/remote/manufacturer/response/BasketWarningMessage;", "warnings", "<init>", "(Ljava/lang/String;IDDLjava/util/List;)V", "Ldv/b;", "parameters", "()Ldv/b;", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "()D", "component4", "component5", "()Ljava/util/List;", "copy", "(Ljava/lang/String;IDDLjava/util/List;)Lcom/app/tgtg/model/remote/manufacturer/response/TrackingBasketItem;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getItemId", "I", "getQuantity", "D", "getPrice", "getTotalPrice", "Ljava/util/List;", "getWarnings", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBasket.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Basket.kt\ncom/app/tgtg/model/remote/manufacturer/response/TrackingBasketItem\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,85:1\n1586#2:86\n1661#2,3:87\n*S KotlinDebug\n*F\n+ 1 Basket.kt\ncom/app/tgtg/model/remote/manufacturer/response/TrackingBasketItem\n*L\n72#1:86\n72#1:87,3\n*E\n"})
public final /* data */ class TrackingBasketItem {
    public static final int $stable = 8;

    @NotNull
    private final String itemId;
    private final double price;
    private final int quantity;
    private final double totalPrice;

    @NotNull
    private final List<BasketWarningMessage> warnings;

    /* JADX WARN: Multi-variable type inference failed */
    public TrackingBasketItem(@NotNull String str, int i11, double d3, double d11, @NotNull List<? extends BasketWarningMessage> list) {
        str.getClass();
        list.getClass();
        this.itemId = str;
        this.quantity = i11;
        this.price = d3;
        this.totalPrice = d11;
        this.warnings = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TrackingBasketItem copy$default(TrackingBasketItem trackingBasketItem, String str, int i11, double d3, double d11, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = trackingBasketItem.itemId;
        }
        if ((i12 & 2) != 0) {
            i11 = trackingBasketItem.quantity;
        }
        if ((i12 & 4) != 0) {
            d3 = trackingBasketItem.price;
        }
        if ((i12 & 8) != 0) {
            d11 = trackingBasketItem.totalPrice;
        }
        if ((i12 & 16) != 0) {
            list = trackingBasketItem.warnings;
        }
        List list2 = list;
        double d12 = d11;
        return trackingBasketItem.copy(str, i11, d3, d12, list2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getItemId() {
        return this.itemId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getQuantity() {
        return this.quantity;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getPrice() {
        return this.price;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final double getTotalPrice() {
        return this.totalPrice;
    }

    @NotNull
    public final List<BasketWarningMessage> component5() {
        return this.warnings;
    }

    @NotNull
    public final TrackingBasketItem copy(@NotNull String itemId, int quantity, double price, double totalPrice, @NotNull List<? extends BasketWarningMessage> warnings) {
        itemId.getClass();
        warnings.getClass();
        return new TrackingBasketItem(itemId, quantity, price, totalPrice, warnings);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrackingBasketItem)) {
            return false;
        }
        TrackingBasketItem trackingBasketItem = (TrackingBasketItem) other;
        return Intrinsics.areEqual(this.itemId, trackingBasketItem.itemId) && this.quantity == trackingBasketItem.quantity && Double.compare(this.price, trackingBasketItem.price) == 0 && Double.compare(this.totalPrice, trackingBasketItem.totalPrice) == 0 && Intrinsics.areEqual(this.warnings, trackingBasketItem.warnings);
    }

    @NotNull
    public final String getItemId() {
        return this.itemId;
    }

    public final double getPrice() {
        return this.price;
    }

    public final int getQuantity() {
        return this.quantity;
    }

    public final double getTotalPrice() {
        return this.totalPrice;
    }

    @NotNull
    public final List<BasketWarningMessage> getWarnings() {
        return this.warnings;
    }

    public int hashCode() {
        return this.warnings.hashCode() + s.b(this.totalPrice, s.b(this.price, k.b(this.quantity, this.itemId.hashCode() * 31, 31), 31), 31);
    }

    @NotNull
    public final b parameters() {
        Pair pair = new Pair(a.ITEM_ID, new c(this.itemId));
        Pair pair2 = new Pair(a.QUANTITY, new c(Integer.valueOf(this.quantity)));
        Pair pair3 = new Pair(a.PRICE, new c(Double.valueOf(this.price)));
        Pair pair4 = new Pair(a.TOTAL_PRICE, new c(Double.valueOf(this.totalPrice)));
        a aVar = a.WARNING;
        List<BasketWarningMessage> list = this.warnings;
        ArrayList arrayList = new ArrayList(e0.o(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((BasketWarningMessage) it.next()).name());
        }
        return g.E(pair, pair2, pair3, pair4, new Pair(aVar, new c(arrayList)));
    }

    @NotNull
    public String toString() {
        String str = this.itemId;
        int i11 = this.quantity;
        double d3 = this.price;
        double d11 = this.totalPrice;
        List<BasketWarningMessage> list = this.warnings;
        StringBuilder sb2 = new StringBuilder("TrackingBasketItem(itemId=");
        sb2.append(str);
        sb2.append(", quantity=");
        sb2.append(i11);
        sb2.append(", price=");
        sb2.append(d3);
        sb2.append(", totalPrice=");
        sb2.append(d11);
        sb2.append(", warnings=");
        return f.p(sb2, list, ")");
    }
}
