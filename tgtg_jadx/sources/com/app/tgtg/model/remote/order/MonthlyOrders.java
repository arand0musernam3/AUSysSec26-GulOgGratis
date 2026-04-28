package com.app.tgtg.model.remote.order;

import android.os.Parcel;
import android.os.Parcelable;
import b3.i;
import hw.f;
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
import m90.d;
import m90.l0;
import m90.m1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.j;
import u70.l;
import u70.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0087\b\u0018\u0000 A2\u00020\u0001:\u0002BAB;\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nBI\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJD\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u0010J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'J'\u0010/\u001a\u00020\u00142\u0006\u0010(\u001a\u00020\u00002\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+H\u0001¢\u0006\u0004\b-\u0010.R*\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0003\u00100\u0012\u0004\b4\u00105\u001a\u0004\b1\u0010\u0018\"\u0004\b2\u00103R*\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0004\u00100\u0012\u0004\b8\u00105\u001a\u0004\b6\u0010\u0018\"\u0004\b7\u00103R*\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0005\u00100\u0012\u0004\b;\u00105\u001a\u0004\b9\u0010\u0018\"\u0004\b:\u00103R.\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\b\u0010<\u0012\u0004\b@\u00105\u001a\u0004\b=\u0010\u001c\"\u0004\b>\u0010?¨\u0006C"}, d2 = {"Lcom/app/tgtg/model/remote/order/MonthlyOrders;", "Landroid/os/Parcelable;", "", "year", "month", "magicBagCount", "", "Lcom/app/tgtg/model/remote/order/Order;", "orderList", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;)V", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Lm90/m1;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/Integer;", "component2", "component3", "component4", "()Ljava/util/List;", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;)Lcom/app/tgtg/model/remote/order/MonthlyOrders;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "write$Self$app", "(Lcom/app/tgtg/model/remote/order/MonthlyOrders;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/Integer;", "getYear", "setYear", "(Ljava/lang/Integer;)V", "getYear$annotations", "()V", "getMonth", "setMonth", "getMonth$annotations", "getMagicBagCount", "setMagicBagCount", "getMagicBagCount$annotations", "Ljava/util/List;", "getOrderList", "setOrderList", "(Ljava/util/List;)V", "getOrderList$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class MonthlyOrders implements Parcelable {

    @Nullable
    private Integer magicBagCount;

    @Nullable
    private Integer month;

    @NotNull
    private List<Order> orderList;

    @Nullable
    private Integer year;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<MonthlyOrders> CREATOR = new Creator();

    @NotNull
    private static final j[] $childSerializers = {null, null, null, l.a(m.PUBLICATION, new f(27))};

    public /* synthetic */ MonthlyOrders(int i11, Integer num, Integer num2, Integer num3, List list, m1 m1Var) {
        if ((i11 & 1) == 0) {
            this.year = null;
        } else {
            this.year = num;
        }
        if ((i11 & 2) == 0) {
            this.month = null;
        } else {
            this.month = num2;
        }
        if ((i11 & 4) == 0) {
            this.magicBagCount = null;
        } else {
            this.magicBagCount = num3;
        }
        if ((i11 & 8) == 0) {
            this.orderList = new ArrayList();
        } else {
            this.orderList = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new d(Order$$serializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MonthlyOrders copy$default(MonthlyOrders monthlyOrders, Integer num, Integer num2, Integer num3, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = monthlyOrders.year;
        }
        if ((i11 & 2) != 0) {
            num2 = monthlyOrders.month;
        }
        if ((i11 & 4) != 0) {
            num3 = monthlyOrders.magicBagCount;
        }
        if ((i11 & 8) != 0) {
            list = monthlyOrders.orderList;
        }
        return monthlyOrders.copy(num, num2, num3, list);
    }

    public static final /* synthetic */ void write$Self$app(MonthlyOrders self, b output, SerialDescriptor serialDesc) {
        j[] jVarArr = $childSerializers;
        if (output.C(serialDesc) || self.year != null) {
            output.r(serialDesc, 0, l0.f29821a, self.year);
        }
        if (output.C(serialDesc) || self.month != null) {
            output.r(serialDesc, 1, l0.f29821a, self.month);
        }
        if (output.C(serialDesc) || self.magicBagCount != null) {
            output.r(serialDesc, 2, l0.f29821a, self.magicBagCount);
        }
        if (!output.C(serialDesc) && Intrinsics.areEqual(self.orderList, new ArrayList())) {
            return;
        }
        output.i(serialDesc, 3, (KSerializer) jVarArr[3].getValue(), self.orderList);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getYear() {
        return this.year;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getMonth() {
        return this.month;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getMagicBagCount() {
        return this.magicBagCount;
    }

    @NotNull
    public final List<Order> component4() {
        return this.orderList;
    }

    @NotNull
    public final MonthlyOrders copy(@Nullable Integer year, @Nullable Integer month, @Nullable Integer magicBagCount, @NotNull List<Order> orderList) {
        orderList.getClass();
        return new MonthlyOrders(year, month, magicBagCount, orderList);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MonthlyOrders)) {
            return false;
        }
        MonthlyOrders monthlyOrders = (MonthlyOrders) other;
        return Intrinsics.areEqual(this.year, monthlyOrders.year) && Intrinsics.areEqual(this.month, monthlyOrders.month) && Intrinsics.areEqual(this.magicBagCount, monthlyOrders.magicBagCount) && Intrinsics.areEqual(this.orderList, monthlyOrders.orderList);
    }

    @Nullable
    public final Integer getMagicBagCount() {
        return this.magicBagCount;
    }

    @Nullable
    public final Integer getMonth() {
        return this.month;
    }

    @NotNull
    public final List<Order> getOrderList() {
        return this.orderList;
    }

    @Nullable
    public final Integer getYear() {
        return this.year;
    }

    public int hashCode() {
        Integer num = this.year;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.month;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.magicBagCount;
        return this.orderList.hashCode() + ((iHashCode2 + (num3 != null ? num3.hashCode() : 0)) * 31);
    }

    public final void setMagicBagCount(@Nullable Integer num) {
        this.magicBagCount = num;
    }

    public final void setMonth(@Nullable Integer num) {
        this.month = num;
    }

    public final void setOrderList(@NotNull List<Order> list) {
        list.getClass();
        this.orderList = list;
    }

    public final void setYear(@Nullable Integer num) {
        this.year = num;
    }

    @NotNull
    public String toString() {
        return "MonthlyOrders(year=" + this.year + ", month=" + this.month + ", magicBagCount=" + this.magicBagCount + ", orderList=" + this.orderList + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        Integer num = this.year;
        if (num == null) {
            dest.writeInt(0);
        } else {
            i.w(dest, 1, num);
        }
        Integer num2 = this.month;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            i.w(dest, 1, num2);
        }
        Integer num3 = this.magicBagCount;
        if (num3 == null) {
            dest.writeInt(0);
        } else {
            i.w(dest, 1, num3);
        }
        Iterator itR = i.r(this.orderList, dest);
        while (itR.hasNext()) {
            ((Order) itR.next()).writeToParcel(dest, flags);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/order/MonthlyOrders$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/order/MonthlyOrders;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return MonthlyOrders$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<MonthlyOrders> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MonthlyOrders createFromParcel(Parcel parcel) {
            parcel.getClass();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf3 = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            int i11 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i11);
            int iC = 0;
            while (iC != i11) {
                iC = i.c(Order.CREATOR, parcel, arrayList, iC, 1);
            }
            return new MonthlyOrders(numValueOf, numValueOf2, numValueOf3, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MonthlyOrders[] newArray(int i11) {
            return new MonthlyOrders[i11];
        }
    }

    @g("magic_bag_count")
    public static /* synthetic */ void getMagicBagCount$annotations() {
    }

    @g("month")
    public static /* synthetic */ void getMonth$annotations() {
    }

    @g("orders")
    public static /* synthetic */ void getOrderList$annotations() {
    }

    @g("year")
    public static /* synthetic */ void getYear$annotations() {
    }

    public MonthlyOrders() {
        this((Integer) null, (Integer) null, (Integer) null, (List) null, 15, (DefaultConstructorMarker) null);
    }

    public MonthlyOrders(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @NotNull List<Order> list) {
        list.getClass();
        this.year = num;
        this.month = num2;
        this.magicBagCount = num3;
        this.orderList = list;
    }

    public /* synthetic */ MonthlyOrders(Integer num, Integer num2, Integer num3, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : num, (i11 & 2) != 0 ? null : num2, (i11 & 4) != 0 ? null : num3, (i11 & 8) != 0 ? new ArrayList() : list);
    }
}
