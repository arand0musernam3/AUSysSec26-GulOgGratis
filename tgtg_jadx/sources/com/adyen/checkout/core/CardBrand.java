package com.adyen.checkout.core;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\n\u001a\u00020\u0006HÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\t\u0010\f\u001a\u00020\rHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0006HÖ\u0001J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u001a"}, d2 = {"Lcom/adyen/checkout/core/CardBrand;", "Landroid/os/Parcelable;", "cardType", "Lcom/adyen/checkout/core/CardType;", "(Lcom/adyen/checkout/core/CardType;)V", "txVariant", "", "(Ljava/lang/String;)V", "getTxVariant", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "checkout-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class CardBrand implements Parcelable {

    @NotNull
    private final String txVariant;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<CardBrand> CREATOR = new Creator();

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardBrand(@NotNull CardType cardType) {
        this(cardType.getTxVariant());
        cardType.getClass();
    }

    public static /* synthetic */ CardBrand copy$default(CardBrand cardBrand, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = cardBrand.txVariant;
        }
        return cardBrand.copy(str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTxVariant() {
        return this.txVariant;
    }

    @NotNull
    public final CardBrand copy(@NotNull String txVariant) {
        txVariant.getClass();
        return new CardBrand(txVariant);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CardBrand) && Intrinsics.areEqual(this.txVariant, ((CardBrand) other).txVariant);
    }

    @NotNull
    public final String getTxVariant() {
        return this.txVariant;
    }

    public int hashCode() {
        return this.txVariant.hashCode();
    }

    @NotNull
    public String toString() {
        return a0.p("CardBrand(txVariant=", this.txVariant, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.getClass();
        parcel.writeString(this.txVariant);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/adyen/checkout/core/CardBrand$Companion;", "", "()V", "estimate", "", "Lcom/adyen/checkout/core/CardBrand;", "cardNumber", "", "checkout-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nCardBrand.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardBrand.kt\ncom/adyen/checkout/core/CardBrand$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,39:1\n3829#2:40\n4344#2,2:41\n1557#3:43\n1628#3,3:44\n*S KotlinDebug\n*F\n+ 1 CardBrand.kt\ncom/adyen/checkout/core/CardBrand$Companion\n*L\n35#1:40\n35#1:41,2\n35#1:43\n35#1:44,3\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final List<CardBrand> estimate(@NotNull String cardNumber) {
            cardNumber.getClass();
            CardType[] cardTypeArrValues = CardType.values();
            ArrayList arrayList = new ArrayList();
            for (CardType cardType : cardTypeArrValues) {
                if (cardType.isEstimateFor$checkout_core_release(cardNumber)) {
                    arrayList.add(cardType);
                }
            }
            ArrayList arrayList2 = new ArrayList(e0.o(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(new CardBrand((CardType) it.next()));
            }
            return arrayList2;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CardBrand> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final CardBrand createFromParcel(@NotNull Parcel parcel) {
            parcel.getClass();
            return new CardBrand(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final CardBrand[] newArray(int i11) {
            return new CardBrand[i11];
        }
    }

    public CardBrand(@NotNull String str) {
        str.getClass();
        this.txVariant = str;
    }
}
