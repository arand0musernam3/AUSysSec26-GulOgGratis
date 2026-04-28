package com.app.tgtg.model.remote.order;

import android.os.Parcel;
import android.os.Parcelable;
import b3.i;
import e0.f;
import i90.h;
import iu.a;
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
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\u0016\b\u0087\b\u0018\u0000 >2\u00020\u0001:\u0002?>B/\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nB?\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0019\u001a\u00020\u000b¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u000b¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b$\u0010%J8\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010!J\u0010\u0010)\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b)\u0010\u001aJ\u001a\u0010,\u001a\u00020\u00042\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b,\u0010-R*\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0003\u0010.\u0012\u0004\b2\u00103\u001a\u0004\b/\u0010!\"\u0004\b0\u00101R*\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0005\u00104\u0012\u0004\b8\u00103\u001a\u0004\b5\u0010#\"\u0004\b6\u00107R.\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\b\u00109\u0012\u0004\b=\u00103\u001a\u0004\b:\u0010%\"\u0004\b;\u0010<¨\u0006@"}, d2 = {"Lcom/app/tgtg/model/remote/order/OrderListResult;", "Landroid/os/Parcelable;", "", "currentServerTime", "", "hasMore", "", "Lcom/app/tgtg/model/remote/order/Order;", "orderList", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/order/OrderListResult;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Boolean;", "component3", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;)Lcom/app/tgtg/model/remote/order/OrderListResult;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCurrentServerTime", "setCurrentServerTime", "(Ljava/lang/String;)V", "getCurrentServerTime$annotations", "()V", "Ljava/lang/Boolean;", "getHasMore", "setHasMore", "(Ljava/lang/Boolean;)V", "getHasMore$annotations", "Ljava/util/List;", "getOrderList", "setOrderList", "(Ljava/util/List;)V", "getOrderList$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class OrderListResult implements Parcelable {

    @Nullable
    private String currentServerTime;

    @Nullable
    private Boolean hasMore;

    @NotNull
    private List<Order> orderList;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<OrderListResult> CREATOR = new Creator();

    @NotNull
    private static final j[] $childSerializers = {null, null, l.a(m.PUBLICATION, new a(3))};

    public /* synthetic */ OrderListResult(int i11, String str, Boolean bool, List list, m1 m1Var) {
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
    public static /* synthetic */ OrderListResult copy$default(OrderListResult orderListResult, String str, Boolean bool, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = orderListResult.currentServerTime;
        }
        if ((i11 & 2) != 0) {
            bool = orderListResult.hasMore;
        }
        if ((i11 & 4) != 0) {
            list = orderListResult.orderList;
        }
        return orderListResult.copy(str, bool, list);
    }

    public static final /* synthetic */ void write$Self$app(OrderListResult self, b output, SerialDescriptor serialDesc) {
        j[] jVarArr = $childSerializers;
        if (output.C(serialDesc) || self.currentServerTime != null) {
            output.r(serialDesc, 0, r1.f29848a, self.currentServerTime);
        }
        if (output.C(serialDesc) || self.hasMore != null) {
            output.r(serialDesc, 1, g.f29797a, self.hasMore);
        }
        if (!output.C(serialDesc) && Intrinsics.areEqual(self.orderList, new ArrayList())) {
            return;
        }
        output.i(serialDesc, 2, (KSerializer) jVarArr[2].getValue(), self.orderList);
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

    @NotNull
    public final List<Order> component3() {
        return this.orderList;
    }

    @NotNull
    public final OrderListResult copy(@Nullable String currentServerTime, @Nullable Boolean hasMore, @NotNull List<Order> orderList) {
        orderList.getClass();
        return new OrderListResult(currentServerTime, hasMore, orderList);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderListResult)) {
            return false;
        }
        OrderListResult orderListResult = (OrderListResult) other;
        return Intrinsics.areEqual(this.currentServerTime, orderListResult.currentServerTime) && Intrinsics.areEqual(this.hasMore, orderListResult.hasMore) && Intrinsics.areEqual(this.orderList, orderListResult.orderList);
    }

    @Nullable
    public final String getCurrentServerTime() {
        return this.currentServerTime;
    }

    @Nullable
    public final Boolean getHasMore() {
        return this.hasMore;
    }

    @NotNull
    public final List<Order> getOrderList() {
        return this.orderList;
    }

    public int hashCode() {
        String str = this.currentServerTime;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.hasMore;
        return this.orderList.hashCode() + ((iHashCode + (bool != null ? bool.hashCode() : 0)) * 31);
    }

    public final void setCurrentServerTime(@Nullable String str) {
        this.currentServerTime = str;
    }

    public final void setHasMore(@Nullable Boolean bool) {
        this.hasMore = bool;
    }

    public final void setOrderList(@NotNull List<Order> list) {
        list.getClass();
        this.orderList = list;
    }

    @NotNull
    public String toString() {
        String str = this.currentServerTime;
        Boolean bool = this.hasMore;
        List<Order> list = this.orderList;
        StringBuilder sb2 = new StringBuilder("OrderListResult(currentServerTime=");
        sb2.append(str);
        sb2.append(", hasMore=");
        sb2.append(bool);
        sb2.append(", orderList=");
        return f.p(sb2, list, ")");
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
        Iterator itR = i.r(this.orderList, dest);
        while (itR.hasNext()) {
            ((Order) itR.next()).writeToParcel(dest, flags);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/order/OrderListResult$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/order/OrderListResult;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return OrderListResult$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<OrderListResult> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OrderListResult createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            parcel.getClass();
            String string = parcel.readString();
            int iC = 0;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            int i11 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i11);
            while (iC != i11) {
                iC = i.c(Order.CREATOR, parcel, arrayList, iC, 1);
            }
            return new OrderListResult(string, boolValueOf, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OrderListResult[] newArray(int i11) {
            return new OrderListResult[i11];
        }
    }

    @i90.g("current_time")
    public static /* synthetic */ void getCurrentServerTime$annotations() {
    }

    @i90.g("has_more")
    public static /* synthetic */ void getHasMore$annotations() {
    }

    @i90.g("orders")
    public static /* synthetic */ void getOrderList$annotations() {
    }

    public OrderListResult() {
        this((String) null, (Boolean) null, (List) null, 7, (DefaultConstructorMarker) null);
    }

    public OrderListResult(@Nullable String str, @Nullable Boolean bool, @NotNull List<Order> list) {
        list.getClass();
        this.currentServerTime = str;
        this.hasMore = bool;
        this.orderList = list;
    }

    public /* synthetic */ OrderListResult(String str, Boolean bool, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : bool, (i11 & 4) != 0 ? new ArrayList() : list);
    }
}
