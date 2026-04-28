package com.app.tgtg.model.remote.user.response;

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
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0087\b\u0018\u0000 I2\u00020\u0001:\u0002JIBC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bBQ\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0011J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0011J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0011J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJR\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u0011J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)J'\u00101\u001a\u00020\u00152\u0006\u0010*\u001a\u00020\u00002\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-H\u0001¢\u0006\u0004\b/\u00100R(\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0003\u00102\u0012\u0004\b6\u00107\u001a\u0004\b3\u0010\u0011\"\u0004\b4\u00105R(\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0004\u00102\u0012\u0004\b:\u00107\u001a\u0004\b8\u0010\u0011\"\u0004\b9\u00105R(\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0005\u00102\u0012\u0004\b=\u00107\u001a\u0004\b;\u0010\u0011\"\u0004\b<\u00105R*\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0007\u0010>\u0012\u0004\bB\u00107\u001a\u0004\b?\u0010\u001c\"\u0004\b@\u0010AR*\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\b\u0010>\u0012\u0004\bE\u00107\u001a\u0004\bC\u0010\u001c\"\u0004\bD\u0010AR*\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\t\u0010>\u0012\u0004\bH\u00107\u001a\u0004\bF\u0010\u001c\"\u0004\bG\u0010A¨\u0006K"}, d2 = {"Lcom/app/tgtg/model/remote/user/response/MonthlyMoneySaved;", "Landroid/os/Parcelable;", "", "year", "month", "magicBagCount", "Lcom/app/tgtg/model/remote/payment/Price;", "moneySpent", "originalPrice", "moneySaved", "<init>", "(IIILcom/app/tgtg/model/remote/payment/Price;Lcom/app/tgtg/model/remote/payment/Price;Lcom/app/tgtg/model/remote/payment/Price;)V", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(IIIILcom/app/tgtg/model/remote/payment/Price;Lcom/app/tgtg/model/remote/payment/Price;Lcom/app/tgtg/model/remote/payment/Price;Lm90/m1;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "component2", "component3", "component4", "()Lcom/app/tgtg/model/remote/payment/Price;", "component5", "component6", "copy", "(IIILcom/app/tgtg/model/remote/payment/Price;Lcom/app/tgtg/model/remote/payment/Price;Lcom/app/tgtg/model/remote/payment/Price;)Lcom/app/tgtg/model/remote/user/response/MonthlyMoneySaved;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "write$Self$app", "(Lcom/app/tgtg/model/remote/user/response/MonthlyMoneySaved;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "I", "getYear", "setYear", "(I)V", "getYear$annotations", "()V", "getMonth", "setMonth", "getMonth$annotations", "getMagicBagCount", "setMagicBagCount", "getMagicBagCount$annotations", "Lcom/app/tgtg/model/remote/payment/Price;", "getMoneySpent", "setMoneySpent", "(Lcom/app/tgtg/model/remote/payment/Price;)V", "getMoneySpent$annotations", "getOriginalPrice", "setOriginalPrice", "getOriginalPrice$annotations", "getMoneySaved", "setMoneySaved", "getMoneySaved$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class MonthlyMoneySaved implements Parcelable {
    private int magicBagCount;

    @Nullable
    private Price moneySaved;

    @Nullable
    private Price moneySpent;
    private int month;

    @Nullable
    private Price originalPrice;
    private int year;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<MonthlyMoneySaved> CREATOR = new Creator();

    public /* synthetic */ MonthlyMoneySaved(int i11, int i12, int i13, int i14, Price price, Price price2, Price price3, m1 m1Var) {
        if (7 != (i11 & 7)) {
            c1.j(i11, 7, MonthlyMoneySaved$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.year = i12;
        this.month = i13;
        this.magicBagCount = i14;
        if ((i11 & 8) == 0) {
            this.moneySpent = null;
        } else {
            this.moneySpent = price;
        }
        if ((i11 & 16) == 0) {
            this.originalPrice = null;
        } else {
            this.originalPrice = price2;
        }
        if ((i11 & 32) == 0) {
            this.moneySaved = null;
        } else {
            this.moneySaved = price3;
        }
    }

    public static /* synthetic */ MonthlyMoneySaved copy$default(MonthlyMoneySaved monthlyMoneySaved, int i11, int i12, int i13, Price price, Price price2, Price price3, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i11 = monthlyMoneySaved.year;
        }
        if ((i14 & 2) != 0) {
            i12 = monthlyMoneySaved.month;
        }
        if ((i14 & 4) != 0) {
            i13 = monthlyMoneySaved.magicBagCount;
        }
        if ((i14 & 8) != 0) {
            price = monthlyMoneySaved.moneySpent;
        }
        if ((i14 & 16) != 0) {
            price2 = monthlyMoneySaved.originalPrice;
        }
        if ((i14 & 32) != 0) {
            price3 = monthlyMoneySaved.moneySaved;
        }
        Price price4 = price2;
        Price price5 = price3;
        return monthlyMoneySaved.copy(i11, i12, i13, price, price4, price5);
    }

    public static final /* synthetic */ void write$Self$app(MonthlyMoneySaved self, b output, SerialDescriptor serialDesc) {
        output.m(0, self.year, serialDesc);
        output.m(1, self.month, serialDesc);
        output.m(2, self.magicBagCount, serialDesc);
        if (output.C(serialDesc) || self.moneySpent != null) {
            output.r(serialDesc, 3, Price$$serializer.INSTANCE, self.moneySpent);
        }
        if (output.C(serialDesc) || self.originalPrice != null) {
            output.r(serialDesc, 4, Price$$serializer.INSTANCE, self.originalPrice);
        }
        if (!output.C(serialDesc) && self.moneySaved == null) {
            return;
        }
        output.r(serialDesc, 5, Price$$serializer.INSTANCE, self.moneySaved);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getYear() {
        return this.year;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getMonth() {
        return this.month;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getMagicBagCount() {
        return this.magicBagCount;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Price getMoneySpent() {
        return this.moneySpent;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Price getOriginalPrice() {
        return this.originalPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Price getMoneySaved() {
        return this.moneySaved;
    }

    @NotNull
    public final MonthlyMoneySaved copy(int year, int month, int magicBagCount, @Nullable Price moneySpent, @Nullable Price originalPrice, @Nullable Price moneySaved) {
        return new MonthlyMoneySaved(year, month, magicBagCount, moneySpent, originalPrice, moneySaved);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MonthlyMoneySaved)) {
            return false;
        }
        MonthlyMoneySaved monthlyMoneySaved = (MonthlyMoneySaved) other;
        return this.year == monthlyMoneySaved.year && this.month == monthlyMoneySaved.month && this.magicBagCount == monthlyMoneySaved.magicBagCount && Intrinsics.areEqual(this.moneySpent, monthlyMoneySaved.moneySpent) && Intrinsics.areEqual(this.originalPrice, monthlyMoneySaved.originalPrice) && Intrinsics.areEqual(this.moneySaved, monthlyMoneySaved.moneySaved);
    }

    public final int getMagicBagCount() {
        return this.magicBagCount;
    }

    @Nullable
    public final Price getMoneySaved() {
        return this.moneySaved;
    }

    @Nullable
    public final Price getMoneySpent() {
        return this.moneySpent;
    }

    public final int getMonth() {
        return this.month;
    }

    @Nullable
    public final Price getOriginalPrice() {
        return this.originalPrice;
    }

    public final int getYear() {
        return this.year;
    }

    public int hashCode() {
        int iB = k.b(this.magicBagCount, k.b(this.month, Integer.hashCode(this.year) * 31, 31), 31);
        Price price = this.moneySpent;
        int iHashCode = (iB + (price == null ? 0 : price.hashCode())) * 31;
        Price price2 = this.originalPrice;
        int iHashCode2 = (iHashCode + (price2 == null ? 0 : price2.hashCode())) * 31;
        Price price3 = this.moneySaved;
        return iHashCode2 + (price3 != null ? price3.hashCode() : 0);
    }

    public final void setMagicBagCount(int i11) {
        this.magicBagCount = i11;
    }

    public final void setMoneySaved(@Nullable Price price) {
        this.moneySaved = price;
    }

    public final void setMoneySpent(@Nullable Price price) {
        this.moneySpent = price;
    }

    public final void setMonth(int i11) {
        this.month = i11;
    }

    public final void setOriginalPrice(@Nullable Price price) {
        this.originalPrice = price;
    }

    public final void setYear(int i11) {
        this.year = i11;
    }

    @NotNull
    public String toString() {
        int i11 = this.year;
        int i12 = this.month;
        int i13 = this.magicBagCount;
        Price price = this.moneySpent;
        Price price2 = this.originalPrice;
        Price price3 = this.moneySaved;
        StringBuilder sbR = k.r(i11, i12, "MonthlyMoneySaved(year=", ", month=", ", magicBagCount=");
        sbR.append(i13);
        sbR.append(", moneySpent=");
        sbR.append(price);
        sbR.append(", originalPrice=");
        sbR.append(price2);
        sbR.append(", moneySaved=");
        sbR.append(price3);
        sbR.append(")");
        return sbR.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeInt(this.year);
        dest.writeInt(this.month);
        dest.writeInt(this.magicBagCount);
        Price price = this.moneySpent;
        if (price == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            price.writeToParcel(dest, flags);
        }
        Price price2 = this.originalPrice;
        if (price2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            price2.writeToParcel(dest, flags);
        }
        Price price3 = this.moneySaved;
        if (price3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            price3.writeToParcel(dest, flags);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/user/response/MonthlyMoneySaved$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/user/response/MonthlyMoneySaved;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return MonthlyMoneySaved$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<MonthlyMoneySaved> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MonthlyMoneySaved createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new MonthlyMoneySaved(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() == 0 ? null : Price.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Price.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Price.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MonthlyMoneySaved[] newArray(int i11) {
            return new MonthlyMoneySaved[i11];
        }
    }

    @g("magic_bag_count")
    public static /* synthetic */ void getMagicBagCount$annotations() {
    }

    @g("money_saved")
    public static /* synthetic */ void getMoneySaved$annotations() {
    }

    @g("money_spent")
    public static /* synthetic */ void getMoneySpent$annotations() {
    }

    @g("month")
    public static /* synthetic */ void getMonth$annotations() {
    }

    @g("original_price")
    public static /* synthetic */ void getOriginalPrice$annotations() {
    }

    @g("year")
    public static /* synthetic */ void getYear$annotations() {
    }

    public MonthlyMoneySaved(int i11, int i12, int i13, @Nullable Price price, @Nullable Price price2, @Nullable Price price3) {
        this.year = i11;
        this.month = i12;
        this.magicBagCount = i13;
        this.moneySpent = price;
        this.originalPrice = price2;
        this.moneySaved = price3;
    }

    public /* synthetic */ MonthlyMoneySaved(int i11, int i12, int i13, Price price, Price price2, Price price3, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, i12, i13, (i14 & 8) != 0 ? null : price, (i14 & 16) != 0 ? null : price2, (i14 & 32) != 0 ? null : price3);
    }
}
