package com.app.tgtg.model.remote.user.response.charity;

import com.app.tgtg.model.remote.item.response.CharityItem;
import com.app.tgtg.model.remote.item.response.CharityItem$$serializer;
import com.app.tgtg.model.remote.order.OrderChanges;
import com.app.tgtg.model.remote.order.OrderChanges$$serializer;
import com.app.tgtg.model.remote.order.response.OrdersData;
import com.app.tgtg.model.remote.order.response.OrdersData$$serializer;
import e0.f;
import i90.g;
import i90.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.n0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.d;
import m90.m1;
import m90.r1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import u70.j;
import u70.l;
import u70.m;
import wt.a;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u0002;:BS\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eBe\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0015J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0015J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\\\u0010\u001b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00022\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#J'\u0010,\u001a\u00020)2\u0006\u0010$\u001a\u00020\u00002\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'H\u0001¢\u0006\u0004\b*\u0010+R&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010-\u0012\u0004\b/\u00100\u001a\u0004\b.\u0010\u0015R&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010-\u0012\u0004\b2\u00100\u001a\u0004\b1\u0010\u0015R&\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010-\u0012\u0004\b4\u00100\u001a\u0004\b3\u0010\u0015R&\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010-\u0012\u0004\b6\u00100\u001a\u0004\b5\u0010\u0015R\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00107\u0012\u0004\b9\u00100\u001a\u0004\b8\u0010\u001a¨\u0006<"}, d2 = {"Lcom/app/tgtg/model/remote/user/response/charity/CharityHomeResponse;", "", "", "Lcom/app/tgtg/model/remote/item/response/CharityItem;", "charityItems", "Lcom/app/tgtg/model/remote/user/response/charity/CharityHomePartnerStore;", "partnerStores", "Lcom/app/tgtg/model/remote/order/response/OrdersData;", "charityOrderHistory", "Lcom/app/tgtg/model/remote/order/OrderChanges;", "charityActiveOrders", "", "charityName", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lm90/m1;)V", "component1", "()Ljava/util/List;", "component2", "component3", "component4", "component5", "()Ljava/lang/String;", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)Lcom/app/tgtg/model/remote/user/response/charity/CharityHomeResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/user/response/charity/CharityHomeResponse;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/util/List;", "getCharityItems", "getCharityItems$annotations", "()V", "getPartnerStores", "getPartnerStores$annotations", "getCharityOrderHistory", "getCharityOrderHistory$annotations", "getCharityActiveOrders", "getCharityActiveOrders$annotations", "Ljava/lang/String;", "getCharityName", "getCharityName$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class CharityHomeResponse {

    @NotNull
    private static final j[] $childSerializers;

    @NotNull
    private final List<OrderChanges> charityActiveOrders;

    @NotNull
    private final List<CharityItem> charityItems;

    @Nullable
    private final String charityName;

    @NotNull
    private final List<OrdersData> charityOrderHistory;

    @NotNull
    private final List<CharityHomePartnerStore> partnerStores;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    static {
        m mVar = m.PUBLICATION;
        $childSerializers = new j[]{l.a(mVar, new a(16)), l.a(mVar, new a(17)), l.a(mVar, new a(18)), l.a(mVar, new a(19)), null};
    }

    public CharityHomeResponse(int i11, List list, List list2, List list3, List list4, String str, m1 m1Var) {
        this.charityItems = (i11 & 1) == 0 ? n0.f26529a : list;
        if ((i11 & 2) == 0) {
            this.partnerStores = n0.f26529a;
        } else {
            this.partnerStores = list2;
        }
        if ((i11 & 4) == 0) {
            this.charityOrderHistory = n0.f26529a;
        } else {
            this.charityOrderHistory = list3;
        }
        if ((i11 & 8) == 0) {
            this.charityActiveOrders = n0.f26529a;
        } else {
            this.charityActiveOrders = list4;
        }
        if ((i11 & 16) == 0) {
            this.charityName = null;
        } else {
            this.charityName = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new d(CharityItem$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new d(CharityHomePartnerStore$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return new d(OrdersData$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$2() {
        return new d(OrderChanges$$serializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CharityHomeResponse copy$default(CharityHomeResponse charityHomeResponse, List list, List list2, List list3, List list4, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = charityHomeResponse.charityItems;
        }
        if ((i11 & 2) != 0) {
            list2 = charityHomeResponse.partnerStores;
        }
        if ((i11 & 4) != 0) {
            list3 = charityHomeResponse.charityOrderHistory;
        }
        if ((i11 & 8) != 0) {
            list4 = charityHomeResponse.charityActiveOrders;
        }
        if ((i11 & 16) != 0) {
            str = charityHomeResponse.charityName;
        }
        String str2 = str;
        List list5 = list3;
        return charityHomeResponse.copy(list, list2, list5, list4, str2);
    }

    public static final void write$Self$app(CharityHomeResponse self, b output, SerialDescriptor serialDesc) {
        j[] jVarArr = $childSerializers;
        if (output.C(serialDesc) || !Intrinsics.areEqual(self.charityItems, n0.f26529a)) {
            output.i(serialDesc, 0, (KSerializer) jVarArr[0].getValue(), self.charityItems);
        }
        if (output.C(serialDesc) || !Intrinsics.areEqual(self.partnerStores, n0.f26529a)) {
            output.i(serialDesc, 1, (KSerializer) jVarArr[1].getValue(), self.partnerStores);
        }
        if (output.C(serialDesc) || !Intrinsics.areEqual(self.charityOrderHistory, n0.f26529a)) {
            output.i(serialDesc, 2, (KSerializer) jVarArr[2].getValue(), self.charityOrderHistory);
        }
        if (output.C(serialDesc) || !Intrinsics.areEqual(self.charityActiveOrders, n0.f26529a)) {
            output.i(serialDesc, 3, (KSerializer) jVarArr[3].getValue(), self.charityActiveOrders);
        }
        if (!output.C(serialDesc) && self.charityName == null) {
            return;
        }
        output.r(serialDesc, 4, r1.f29848a, self.charityName);
    }

    @NotNull
    public final List<CharityItem> component1() {
        return this.charityItems;
    }

    @NotNull
    public final List<CharityHomePartnerStore> component2() {
        return this.partnerStores;
    }

    @NotNull
    public final List<OrdersData> component3() {
        return this.charityOrderHistory;
    }

    @NotNull
    public final List<OrderChanges> component4() {
        return this.charityActiveOrders;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCharityName() {
        return this.charityName;
    }

    @NotNull
    public final CharityHomeResponse copy(@NotNull List<CharityItem> charityItems, @NotNull List<CharityHomePartnerStore> partnerStores, @NotNull List<OrdersData> charityOrderHistory, @NotNull List<OrderChanges> charityActiveOrders, @Nullable String charityName) {
        charityItems.getClass();
        partnerStores.getClass();
        charityOrderHistory.getClass();
        charityActiveOrders.getClass();
        return new CharityHomeResponse(charityItems, partnerStores, charityOrderHistory, charityActiveOrders, charityName);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CharityHomeResponse)) {
            return false;
        }
        CharityHomeResponse charityHomeResponse = (CharityHomeResponse) other;
        return Intrinsics.areEqual(this.charityItems, charityHomeResponse.charityItems) && Intrinsics.areEqual(this.partnerStores, charityHomeResponse.partnerStores) && Intrinsics.areEqual(this.charityOrderHistory, charityHomeResponse.charityOrderHistory) && Intrinsics.areEqual(this.charityActiveOrders, charityHomeResponse.charityActiveOrders) && Intrinsics.areEqual(this.charityName, charityHomeResponse.charityName);
    }

    @NotNull
    public final List<OrderChanges> getCharityActiveOrders() {
        return this.charityActiveOrders;
    }

    @NotNull
    public final List<CharityItem> getCharityItems() {
        return this.charityItems;
    }

    @Nullable
    public final String getCharityName() {
        return this.charityName;
    }

    @NotNull
    public final List<OrdersData> getCharityOrderHistory() {
        return this.charityOrderHistory;
    }

    @NotNull
    public final List<CharityHomePartnerStore> getPartnerStores() {
        return this.partnerStores;
    }

    public int hashCode() {
        int iC = f.c(this.charityActiveOrders, f.c(this.charityOrderHistory, f.c(this.partnerStores, this.charityItems.hashCode() * 31, 31), 31), 31);
        String str = this.charityName;
        return iC + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        List<CharityItem> list = this.charityItems;
        List<CharityHomePartnerStore> list2 = this.partnerStores;
        List<OrdersData> list3 = this.charityOrderHistory;
        List<OrderChanges> list4 = this.charityActiveOrders;
        String str = this.charityName;
        StringBuilder sb2 = new StringBuilder("CharityHomeResponse(charityItems=");
        sb2.append(list);
        sb2.append(", partnerStores=");
        sb2.append(list2);
        sb2.append(", charityOrderHistory=");
        sb2.append(list3);
        sb2.append(", charityActiveOrders=");
        sb2.append(list4);
        sb2.append(", charityName=");
        return k.p(sb2, str, ")");
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/user/response/charity/CharityHomeResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/user/response/charity/CharityHomeResponse;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return CharityHomeResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @g("charity_active_orders")
    public static /* synthetic */ void getCharityActiveOrders$annotations() {
    }

    @g("charity_items")
    public static /* synthetic */ void getCharityItems$annotations() {
    }

    @g("user_charity_name")
    public static /* synthetic */ void getCharityName$annotations() {
    }

    @g("charity_order_history")
    public static /* synthetic */ void getCharityOrderHistory$annotations() {
    }

    @g("charity_store_details")
    public static /* synthetic */ void getPartnerStores$annotations() {
    }

    public CharityHomeResponse() {
        this((List) null, (List) null, (List) null, (List) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    public CharityHomeResponse(@NotNull List<CharityItem> list, @NotNull List<CharityHomePartnerStore> list2, @NotNull List<OrdersData> list3, @NotNull List<OrderChanges> list4, @Nullable String str) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        this.charityItems = list;
        this.partnerStores = list2;
        this.charityOrderHistory = list3;
        this.charityActiveOrders = list4;
        this.charityName = str;
    }

    public CharityHomeResponse(List list, List list2, List list3, List list4, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? n0.f26529a : list, (i11 & 2) != 0 ? n0.f26529a : list2, (i11 & 4) != 0 ? n0.f26529a : list3, (i11 & 8) != 0 ? n0.f26529a : list4, (i11 & 16) != 0 ? null : str);
    }
}
