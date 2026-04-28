package com.app.tgtg.model.remote.user.response;

import com.app.tgtg.model.remote.order.Order;
import com.app.tgtg.model.remote.order.Order$$serializer;
import i90.h;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
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
import u70.j;
import u70.l;
import u70.m;
import uu.a;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b$\b\u0087\b\u0018\u0000 82\u00020\u0001:\u000298B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b¢\u0006\u0004\b\n\u0010\u000bB?\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ \u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJB\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0018\b\u0002\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bHÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001bJ\u0010\u0010#\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010&\u001a\u00020\u00042\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R*\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0003\u0010(\u0012\u0004\b,\u0010-\u001a\u0004\b)\u0010\u001b\"\u0004\b*\u0010+R*\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0005\u0010.\u0012\u0004\b2\u0010-\u001a\u0004\b/\u0010\u001d\"\u0004\b0\u00101R8\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\t\u00103\u0012\u0004\b7\u0010-\u001a\u0004\b4\u0010\u001f\"\u0004\b5\u00106¨\u0006:"}, d2 = {"Lcom/app/tgtg/model/remote/user/response/ListOrders;", "", "", "currentTime", "", "hasMore", "Ljava/util/ArrayList;", "Lcom/app/tgtg/model/remote/order/Order;", "Lkotlin/collections/ArrayList;", "orders", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/ArrayList;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Boolean;Ljava/util/ArrayList;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/user/response/ListOrders;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Boolean;", "component3", "()Ljava/util/ArrayList;", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/ArrayList;)Lcom/app/tgtg/model/remote/user/response/ListOrders;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCurrentTime", "setCurrentTime", "(Ljava/lang/String;)V", "getCurrentTime$annotations", "()V", "Ljava/lang/Boolean;", "getHasMore", "setHasMore", "(Ljava/lang/Boolean;)V", "getHasMore$annotations", "Ljava/util/ArrayList;", "getOrders", "setOrders", "(Ljava/util/ArrayList;)V", "getOrders$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class ListOrders {

    @Nullable
    private String currentTime;

    @Nullable
    private Boolean hasMore;

    @NotNull
    private ArrayList<Order> orders;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private static final j[] $childSerializers = {null, null, l.a(m.PUBLICATION, new a(15))};

    public /* synthetic */ ListOrders(int i11, String str, Boolean bool, ArrayList arrayList, m1 m1Var) {
        if (4 != (i11 & 4)) {
            c1.j(i11, 4, ListOrders$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i11 & 1) == 0) {
            this.currentTime = null;
        } else {
            this.currentTime = str;
        }
        if ((i11 & 2) == 0) {
            this.hasMore = null;
        } else {
            this.hasMore = bool;
        }
        this.orders = arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new d(Order$$serializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ListOrders copy$default(ListOrders listOrders, String str, Boolean bool, ArrayList arrayList, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = listOrders.currentTime;
        }
        if ((i11 & 2) != 0) {
            bool = listOrders.hasMore;
        }
        if ((i11 & 4) != 0) {
            arrayList = listOrders.orders;
        }
        return listOrders.copy(str, bool, arrayList);
    }

    public static final /* synthetic */ void write$Self$app(ListOrders self, b output, SerialDescriptor serialDesc) {
        j[] jVarArr = $childSerializers;
        if (output.C(serialDesc) || self.currentTime != null) {
            output.r(serialDesc, 0, r1.f29848a, self.currentTime);
        }
        if (output.C(serialDesc) || self.hasMore != null) {
            output.r(serialDesc, 1, g.f29797a, self.hasMore);
        }
        output.i(serialDesc, 2, (KSerializer) jVarArr[2].getValue(), self.orders);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCurrentTime() {
        return this.currentTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getHasMore() {
        return this.hasMore;
    }

    @NotNull
    public final ArrayList<Order> component3() {
        return this.orders;
    }

    @NotNull
    public final ListOrders copy(@Nullable String currentTime, @Nullable Boolean hasMore, @NotNull ArrayList<Order> orders) {
        orders.getClass();
        return new ListOrders(currentTime, hasMore, orders);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ListOrders)) {
            return false;
        }
        ListOrders listOrders = (ListOrders) other;
        return Intrinsics.areEqual(this.currentTime, listOrders.currentTime) && Intrinsics.areEqual(this.hasMore, listOrders.hasMore) && Intrinsics.areEqual(this.orders, listOrders.orders);
    }

    @Nullable
    public final String getCurrentTime() {
        return this.currentTime;
    }

    @Nullable
    public final Boolean getHasMore() {
        return this.hasMore;
    }

    @NotNull
    public final ArrayList<Order> getOrders() {
        return this.orders;
    }

    public int hashCode() {
        String str = this.currentTime;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.hasMore;
        return this.orders.hashCode() + ((iHashCode + (bool != null ? bool.hashCode() : 0)) * 31);
    }

    public final void setCurrentTime(@Nullable String str) {
        this.currentTime = str;
    }

    public final void setHasMore(@Nullable Boolean bool) {
        this.hasMore = bool;
    }

    public final void setOrders(@NotNull ArrayList<Order> arrayList) {
        arrayList.getClass();
        this.orders = arrayList;
    }

    @NotNull
    public String toString() {
        return "ListOrders(currentTime=" + this.currentTime + ", hasMore=" + this.hasMore + ", orders=" + this.orders + ")";
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/user/response/ListOrders$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/user/response/ListOrders;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return ListOrders$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @i90.g("current_time")
    public static /* synthetic */ void getCurrentTime$annotations() {
    }

    @i90.g("has_more")
    public static /* synthetic */ void getHasMore$annotations() {
    }

    @i90.g("orders")
    public static /* synthetic */ void getOrders$annotations() {
    }

    public ListOrders(@Nullable String str, @Nullable Boolean bool, @NotNull ArrayList<Order> arrayList) {
        arrayList.getClass();
        this.currentTime = str;
        this.hasMore = bool;
        this.orders = arrayList;
    }

    public /* synthetic */ ListOrders(String str, Boolean bool, ArrayList arrayList, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : bool, arrayList);
    }
}
