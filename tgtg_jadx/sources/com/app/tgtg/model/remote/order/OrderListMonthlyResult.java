package com.app.tgtg.model.remote.order;

import android.os.Parcel;
import android.os.Parcelable;
import b3.i;
import i90.h;
import iu.a;
import j4.s;
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
import m90.g;
import m90.l0;
import m90.m1;
import m90.r1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.j;
import u70.l;
import u70.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\b\u0087\b\u0018\u0000 P2\u00020\u0001:\u0002QPBS\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eB]\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\r\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\"\u0010 J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003¢\u0006\u0004\b#\u0010$J\\\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u001cJ\u0010\u0010(\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b(\u0010\u0014J\u001a\u0010+\u001a\u00020\u00042\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b+\u0010,J'\u00104\u001a\u00020\u00182\u0006\u0010-\u001a\u00020\u00002\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u000200H\u0001¢\u0006\u0004\b2\u00103R*\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0003\u00105\u0012\u0004\b9\u0010:\u001a\u0004\b6\u0010\u001c\"\u0004\b7\u00108R*\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0005\u0010;\u0012\u0004\b?\u0010:\u001a\u0004\b<\u0010\u001e\"\u0004\b=\u0010>R*\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0007\u0010@\u0012\u0004\bD\u0010:\u001a\u0004\bA\u0010 \"\u0004\bB\u0010CR*\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\b\u0010@\u0012\u0004\bG\u0010:\u001a\u0004\bE\u0010 \"\u0004\bF\u0010CR*\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\t\u0010@\u0012\u0004\bJ\u0010:\u001a\u0004\bH\u0010 \"\u0004\bI\u0010CR.\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\f\u0010K\u0012\u0004\bO\u0010:\u001a\u0004\bL\u0010$\"\u0004\bM\u0010N¨\u0006R"}, d2 = {"Lcom/app/tgtg/model/remote/order/OrderListMonthlyResult;", "Landroid/os/Parcelable;", "", "currentServerTime", "", "hasMore", "", "nextPageYear", "nextPageMonth", "magicBagCount", "", "Lcom/app/tgtg/model/remote/order/MonthlyOrders;", "monthlyOrders", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;)V", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Lm90/m1;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Boolean;", "component3", "()Ljava/lang/Integer;", "component4", "component5", "component6", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;)Lcom/app/tgtg/model/remote/order/OrderListMonthlyResult;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "write$Self$app", "(Lcom/app/tgtg/model/remote/order/OrderListMonthlyResult;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getCurrentServerTime", "setCurrentServerTime", "(Ljava/lang/String;)V", "getCurrentServerTime$annotations", "()V", "Ljava/lang/Boolean;", "getHasMore", "setHasMore", "(Ljava/lang/Boolean;)V", "getHasMore$annotations", "Ljava/lang/Integer;", "getNextPageYear", "setNextPageYear", "(Ljava/lang/Integer;)V", "getNextPageYear$annotations", "getNextPageMonth", "setNextPageMonth", "getNextPageMonth$annotations", "getMagicBagCount", "setMagicBagCount", "getMagicBagCount$annotations", "Ljava/util/List;", "getMonthlyOrders", "setMonthlyOrders", "(Ljava/util/List;)V", "getMonthlyOrders$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class OrderListMonthlyResult implements Parcelable {

    @Nullable
    private String currentServerTime;

    @Nullable
    private Boolean hasMore;

    @Nullable
    private Integer magicBagCount;

    @NotNull
    private List<MonthlyOrders> monthlyOrders;

    @Nullable
    private Integer nextPageMonth;

    @Nullable
    private Integer nextPageYear;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<OrderListMonthlyResult> CREATOR = new Creator();

    @NotNull
    private static final j[] $childSerializers = {null, null, null, null, null, l.a(m.PUBLICATION, new a(2))};

    public /* synthetic */ OrderListMonthlyResult(int i11, String str, Boolean bool, Integer num, Integer num2, Integer num3, List list, m1 m1Var) {
        if ((i11 & 1) == 0) {
            this.currentServerTime = null;
        } else {
            this.currentServerTime = str;
        }
        if ((i11 & 2) == 0) {
            this.hasMore = null;
        } else {
            this.hasMore = bool;
        }
        if ((i11 & 4) == 0) {
            this.nextPageYear = null;
        } else {
            this.nextPageYear = num;
        }
        if ((i11 & 8) == 0) {
            this.nextPageMonth = null;
        } else {
            this.nextPageMonth = num2;
        }
        if ((i11 & 16) == 0) {
            this.magicBagCount = null;
        } else {
            this.magicBagCount = num3;
        }
        if ((i11 & 32) == 0) {
            this.monthlyOrders = new ArrayList();
        } else {
            this.monthlyOrders = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new d(MonthlyOrders$$serializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OrderListMonthlyResult copy$default(OrderListMonthlyResult orderListMonthlyResult, String str, Boolean bool, Integer num, Integer num2, Integer num3, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = orderListMonthlyResult.currentServerTime;
        }
        if ((i11 & 2) != 0) {
            bool = orderListMonthlyResult.hasMore;
        }
        if ((i11 & 4) != 0) {
            num = orderListMonthlyResult.nextPageYear;
        }
        if ((i11 & 8) != 0) {
            num2 = orderListMonthlyResult.nextPageMonth;
        }
        if ((i11 & 16) != 0) {
            num3 = orderListMonthlyResult.magicBagCount;
        }
        if ((i11 & 32) != 0) {
            list = orderListMonthlyResult.monthlyOrders;
        }
        Integer num4 = num3;
        List list2 = list;
        return orderListMonthlyResult.copy(str, bool, num, num2, num4, list2);
    }

    public static final /* synthetic */ void write$Self$app(OrderListMonthlyResult self, b output, SerialDescriptor serialDesc) {
        j[] jVarArr = $childSerializers;
        if (output.C(serialDesc) || self.currentServerTime != null) {
            output.r(serialDesc, 0, r1.f29848a, self.currentServerTime);
        }
        if (output.C(serialDesc) || self.hasMore != null) {
            output.r(serialDesc, 1, g.f29797a, self.hasMore);
        }
        if (output.C(serialDesc) || self.nextPageYear != null) {
            output.r(serialDesc, 2, l0.f29821a, self.nextPageYear);
        }
        if (output.C(serialDesc) || self.nextPageMonth != null) {
            output.r(serialDesc, 3, l0.f29821a, self.nextPageMonth);
        }
        if (output.C(serialDesc) || self.magicBagCount != null) {
            output.r(serialDesc, 4, l0.f29821a, self.magicBagCount);
        }
        if (!output.C(serialDesc) && Intrinsics.areEqual(self.monthlyOrders, new ArrayList())) {
            return;
        }
        output.i(serialDesc, 5, (KSerializer) jVarArr[5].getValue(), self.monthlyOrders);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCurrentServerTime() {
        return this.currentServerTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getHasMore() {
        return this.hasMore;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getNextPageYear() {
        return this.nextPageYear;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getNextPageMonth() {
        return this.nextPageMonth;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getMagicBagCount() {
        return this.magicBagCount;
    }

    @NotNull
    public final List<MonthlyOrders> component6() {
        return this.monthlyOrders;
    }

    @NotNull
    public final OrderListMonthlyResult copy(@Nullable String currentServerTime, @Nullable Boolean hasMore, @Nullable Integer nextPageYear, @Nullable Integer nextPageMonth, @Nullable Integer magicBagCount, @NotNull List<MonthlyOrders> monthlyOrders) {
        monthlyOrders.getClass();
        return new OrderListMonthlyResult(currentServerTime, hasMore, nextPageYear, nextPageMonth, magicBagCount, monthlyOrders);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderListMonthlyResult)) {
            return false;
        }
        OrderListMonthlyResult orderListMonthlyResult = (OrderListMonthlyResult) other;
        return Intrinsics.areEqual(this.currentServerTime, orderListMonthlyResult.currentServerTime) && Intrinsics.areEqual(this.hasMore, orderListMonthlyResult.hasMore) && Intrinsics.areEqual(this.nextPageYear, orderListMonthlyResult.nextPageYear) && Intrinsics.areEqual(this.nextPageMonth, orderListMonthlyResult.nextPageMonth) && Intrinsics.areEqual(this.magicBagCount, orderListMonthlyResult.magicBagCount) && Intrinsics.areEqual(this.monthlyOrders, orderListMonthlyResult.monthlyOrders);
    }

    @Nullable
    public final String getCurrentServerTime() {
        return this.currentServerTime;
    }

    @Nullable
    public final Boolean getHasMore() {
        return this.hasMore;
    }

    @Nullable
    public final Integer getMagicBagCount() {
        return this.magicBagCount;
    }

    @NotNull
    public final List<MonthlyOrders> getMonthlyOrders() {
        return this.monthlyOrders;
    }

    @Nullable
    public final Integer getNextPageMonth() {
        return this.nextPageMonth;
    }

    @Nullable
    public final Integer getNextPageYear() {
        return this.nextPageYear;
    }

    public int hashCode() {
        String str = this.currentServerTime;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.hasMore;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.nextPageYear;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.nextPageMonth;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.magicBagCount;
        return this.monthlyOrders.hashCode() + ((iHashCode4 + (num3 != null ? num3.hashCode() : 0)) * 31);
    }

    public final void setCurrentServerTime(@Nullable String str) {
        this.currentServerTime = str;
    }

    public final void setHasMore(@Nullable Boolean bool) {
        this.hasMore = bool;
    }

    public final void setMagicBagCount(@Nullable Integer num) {
        this.magicBagCount = num;
    }

    public final void setMonthlyOrders(@NotNull List<MonthlyOrders> list) {
        list.getClass();
        this.monthlyOrders = list;
    }

    public final void setNextPageMonth(@Nullable Integer num) {
        this.nextPageMonth = num;
    }

    public final void setNextPageYear(@Nullable Integer num) {
        this.nextPageYear = num;
    }

    @NotNull
    public String toString() {
        String str = this.currentServerTime;
        Boolean bool = this.hasMore;
        Integer num = this.nextPageYear;
        Integer num2 = this.nextPageMonth;
        Integer num3 = this.magicBagCount;
        List<MonthlyOrders> list = this.monthlyOrders;
        StringBuilder sb2 = new StringBuilder("OrderListMonthlyResult(currentServerTime=");
        sb2.append(str);
        sb2.append(", hasMore=");
        sb2.append(bool);
        sb2.append(", nextPageYear=");
        s.z(sb2, num, ", nextPageMonth=", num2, ", magicBagCount=");
        sb2.append(num3);
        sb2.append(", monthlyOrders=");
        sb2.append(list);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.currentServerTime);
        Boolean bool = this.hasMore;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            i.v(dest, 1, bool);
        }
        Integer num = this.nextPageYear;
        if (num == null) {
            dest.writeInt(0);
        } else {
            i.w(dest, 1, num);
        }
        Integer num2 = this.nextPageMonth;
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
        Iterator itR = i.r(this.monthlyOrders, dest);
        while (itR.hasNext()) {
            ((MonthlyOrders) itR.next()).writeToParcel(dest, flags);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/order/OrderListMonthlyResult$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/order/OrderListMonthlyResult;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return OrderListMonthlyResult$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<OrderListMonthlyResult> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OrderListMonthlyResult createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            parcel.getClass();
            String string = parcel.readString();
            int iC = 0;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf3 = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            int i11 = parcel.readInt();
            Integer num = numValueOf;
            Integer num2 = numValueOf3;
            Integer num3 = numValueOf2;
            ArrayList arrayList = new ArrayList(i11);
            while (iC != i11) {
                iC = i.c(MonthlyOrders.CREATOR, parcel, arrayList, iC, 1);
            }
            return new OrderListMonthlyResult(string, boolValueOf, num, num3, num2, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OrderListMonthlyResult[] newArray(int i11) {
            return new OrderListMonthlyResult[i11];
        }
    }

    @i90.g("current_time")
    public static /* synthetic */ void getCurrentServerTime$annotations() {
    }

    @i90.g("has_more")
    public static /* synthetic */ void getHasMore$annotations() {
    }

    @i90.g("magic_bag_count")
    public static /* synthetic */ void getMagicBagCount$annotations() {
    }

    @i90.g("orders_per_month")
    public static /* synthetic */ void getMonthlyOrders$annotations() {
    }

    @i90.g("next_page_month")
    public static /* synthetic */ void getNextPageMonth$annotations() {
    }

    @i90.g("next_page_year")
    public static /* synthetic */ void getNextPageYear$annotations() {
    }

    public OrderListMonthlyResult() {
        this((String) null, (Boolean) null, (Integer) null, (Integer) null, (Integer) null, (List) null, 63, (DefaultConstructorMarker) null);
    }

    public OrderListMonthlyResult(@Nullable String str, @Nullable Boolean bool, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @NotNull List<MonthlyOrders> list) {
        list.getClass();
        this.currentServerTime = str;
        this.hasMore = bool;
        this.nextPageYear = num;
        this.nextPageMonth = num2;
        this.magicBagCount = num3;
        this.monthlyOrders = list;
    }

    public /* synthetic */ OrderListMonthlyResult(String str, Boolean bool, Integer num, Integer num2, Integer num3, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : bool, (i11 & 4) != 0 ? null : num, (i11 & 8) != 0 ? null : num2, (i11 & 16) != 0 ? null : num3, (i11 & 32) != 0 ? new ArrayList() : list);
    }
}
