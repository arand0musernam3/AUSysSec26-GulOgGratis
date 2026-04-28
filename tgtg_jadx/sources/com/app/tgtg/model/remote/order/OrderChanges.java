package com.app.tgtg.model.remote.order;

import android.os.Parcel;
import android.os.Parcelable;
import b3.i;
import i90.g;
import i90.h;
import iu.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.n0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.c1;
import m90.d;
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
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u001b\b\u0087\b\u0018\u0000 G2\u00020\u0001:\u0002HGB7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fBG\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001b\u001a\u00020\r¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010 \u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\r¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0018\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b(\u0010)JB\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b,\u0010'J\u0010\u0010-\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b-\u0010\u001cJ\u001a\u00100\u001a\u00020\t2\b\u0010/\u001a\u0004\u0018\u00010.HÖ\u0003¢\u0006\u0004\b0\u00101R(\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0003\u00102\u0012\u0004\b6\u00107\u001a\u0004\b3\u0010#\"\u0004\b4\u00105R0\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0006\u00108\u0012\u0004\b<\u00107\u001a\u0004\b9\u0010%\"\u0004\b:\u0010;R*\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\b\u0010=\u0012\u0004\bA\u00107\u001a\u0004\b>\u0010'\"\u0004\b?\u0010@R(\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\n\u0010B\u0012\u0004\bF\u00107\u001a\u0004\bC\u0010)\"\u0004\bD\u0010E¨\u0006I"}, d2 = {"Lcom/app/tgtg/model/remote/order/OrderChanges;", "Landroid/os/Parcelable;", "Lcom/app/tgtg/model/remote/order/Order;", "order", "", "Lcom/app/tgtg/model/remote/order/Changes;", "changes", "", "allergensUrl", "", "showCollectionCode", "<init>", "(Lcom/app/tgtg/model/remote/order/Order;Ljava/util/List;Ljava/lang/String;Z)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILcom/app/tgtg/model/remote/order/Order;Ljava/util/List;Ljava/lang/String;ZLm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/order/OrderChanges;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/app/tgtg/model/remote/order/Order;", "component2", "()Ljava/util/List;", "component3", "()Ljava/lang/String;", "component4", "()Z", "copy", "(Lcom/app/tgtg/model/remote/order/Order;Ljava/util/List;Ljava/lang/String;Z)Lcom/app/tgtg/model/remote/order/OrderChanges;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/app/tgtg/model/remote/order/Order;", "getOrder", "setOrder", "(Lcom/app/tgtg/model/remote/order/Order;)V", "getOrder$annotations", "()V", "Ljava/util/List;", "getChanges", "setChanges", "(Ljava/util/List;)V", "getChanges$annotations", "Ljava/lang/String;", "getAllergensUrl", "setAllergensUrl", "(Ljava/lang/String;)V", "getAllergensUrl$annotations", "Z", "getShowCollectionCode", "setShowCollectionCode", "(Z)V", "getShowCollectionCode$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class OrderChanges implements Parcelable {

    @Nullable
    private String allergensUrl;

    @Nullable
    private List<Changes> changes;

    @NotNull
    private Order order;
    private boolean showCollectionCode;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<OrderChanges> CREATOR = new Creator();

    @NotNull
    private static final j[] $childSerializers = {null, l.a(m.PUBLICATION, new a(1)), null, null};

    public OrderChanges(int i11, Order order, List list, String str, boolean z11, m1 m1Var) {
        if (1 != (i11 & 1)) {
            c1.j(i11, 1, OrderChanges$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.order = order;
        if ((i11 & 2) == 0) {
            this.changes = n0.f26529a;
        } else {
            this.changes = list;
        }
        if ((i11 & 4) == 0) {
            this.allergensUrl = null;
        } else {
            this.allergensUrl = str;
        }
        if ((i11 & 8) == 0) {
            this.showCollectionCode = false;
        } else {
            this.showCollectionCode = z11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new d(Changes$$serializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OrderChanges copy$default(OrderChanges orderChanges, Order order, List list, String str, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            order = orderChanges.order;
        }
        if ((i11 & 2) != 0) {
            list = orderChanges.changes;
        }
        if ((i11 & 4) != 0) {
            str = orderChanges.allergensUrl;
        }
        if ((i11 & 8) != 0) {
            z11 = orderChanges.showCollectionCode;
        }
        return orderChanges.copy(order, list, str, z11);
    }

    public static final void write$Self$app(OrderChanges self, b output, SerialDescriptor serialDesc) {
        j[] jVarArr = $childSerializers;
        output.i(serialDesc, 0, Order$$serializer.INSTANCE, self.order);
        if (output.C(serialDesc) || !Intrinsics.areEqual(self.changes, n0.f26529a)) {
            output.r(serialDesc, 1, (KSerializer) jVarArr[1].getValue(), self.changes);
        }
        if (output.C(serialDesc) || self.allergensUrl != null) {
            output.r(serialDesc, 2, r1.f29848a, self.allergensUrl);
        }
        if (output.C(serialDesc) || self.showCollectionCode) {
            output.p(serialDesc, 3, self.showCollectionCode);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Order getOrder() {
        return this.order;
    }

    @Nullable
    public final List<Changes> component2() {
        return this.changes;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAllergensUrl() {
        return this.allergensUrl;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getShowCollectionCode() {
        return this.showCollectionCode;
    }

    @NotNull
    public final OrderChanges copy(@NotNull Order order, @Nullable List<Changes> changes, @Nullable String allergensUrl, boolean showCollectionCode) {
        order.getClass();
        return new OrderChanges(order, changes, allergensUrl, showCollectionCode);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderChanges)) {
            return false;
        }
        OrderChanges orderChanges = (OrderChanges) other;
        return Intrinsics.areEqual(this.order, orderChanges.order) && Intrinsics.areEqual(this.changes, orderChanges.changes) && Intrinsics.areEqual(this.allergensUrl, orderChanges.allergensUrl) && this.showCollectionCode == orderChanges.showCollectionCode;
    }

    @Nullable
    public final String getAllergensUrl() {
        return this.allergensUrl;
    }

    @Nullable
    public final List<Changes> getChanges() {
        return this.changes;
    }

    @NotNull
    public final Order getOrder() {
        return this.order;
    }

    public final boolean getShowCollectionCode() {
        return this.showCollectionCode;
    }

    public int hashCode() {
        int iHashCode = this.order.hashCode() * 31;
        List<Changes> list = this.changes;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.allergensUrl;
        return Boolean.hashCode(this.showCollectionCode) + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final void setAllergensUrl(@Nullable String str) {
        this.allergensUrl = str;
    }

    public final void setChanges(@Nullable List<Changes> list) {
        this.changes = list;
    }

    public final void setOrder(@NotNull Order order) {
        order.getClass();
        this.order = order;
    }

    public final void setShowCollectionCode(boolean z11) {
        this.showCollectionCode = z11;
    }

    @NotNull
    public String toString() {
        return "OrderChanges(order=" + this.order + ", changes=" + this.changes + ", allergensUrl=" + this.allergensUrl + ", showCollectionCode=" + this.showCollectionCode + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        this.order.writeToParcel(dest, flags);
        List<Changes> list = this.changes;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = i.q(dest, 1, list);
            while (itQ.hasNext()) {
                ((Changes) itQ.next()).writeToParcel(dest, flags);
            }
        }
        dest.writeString(this.allergensUrl);
        dest.writeInt(this.showCollectionCode ? 1 : 0);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/order/OrderChanges$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/order/OrderChanges;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return OrderChanges$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<OrderChanges> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OrderChanges createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            parcel.getClass();
            Order orderCreateFromParcel = Order.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i11 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i11);
                int iC = 0;
                while (iC != i11) {
                    iC = i.c(Changes.CREATOR, parcel, arrayList2, iC, 1);
                }
                arrayList = arrayList2;
            }
            return new OrderChanges(orderCreateFromParcel, arrayList, parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OrderChanges[] newArray(int i11) {
            return new OrderChanges[i11];
        }
    }

    @g("allergens_url")
    public static /* synthetic */ void getAllergensUrl$annotations() {
    }

    @g("changes")
    public static /* synthetic */ void getChanges$annotations() {
    }

    @g("order")
    public static /* synthetic */ void getOrder$annotations() {
    }

    @g("show_collection_code")
    public static /* synthetic */ void getShowCollectionCode$annotations() {
    }

    public OrderChanges(@NotNull Order order, @Nullable List<Changes> list, @Nullable String str, boolean z11) {
        order.getClass();
        this.order = order;
        this.changes = list;
        this.allergensUrl = str;
        this.showCollectionCode = z11;
    }

    public OrderChanges(Order order, List list, String str, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(order, (i11 & 2) != 0 ? n0.f26529a : list, (i11 & 4) != 0 ? null : str, (i11 & 8) != 0 ? false : z11);
    }
}
