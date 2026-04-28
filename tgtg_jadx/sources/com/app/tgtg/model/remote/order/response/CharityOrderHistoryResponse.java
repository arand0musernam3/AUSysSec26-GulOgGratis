package com.app.tgtg.model.remote.order.response;

import com.app.tgtg.model.remote.user.response.ItemsListPaging;
import com.app.tgtg.model.remote.user.response.ItemsListPaging$$serializer;
import i90.g;
import i90.h;
import java.util.List;
import jq.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.c1;
import m90.d;
import m90.m1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.j;
import u70.l;
import u70.m;
import zendesk.faye.internal.Bayeux;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002.-B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ*\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\tHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010&\u0012\u0004\b(\u0010)\u001a\u0004\b'\u0010\u0018R&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010*\u0012\u0004\b,\u0010)\u001a\u0004\b+\u0010\u001a¨\u0006/"}, d2 = {"Lcom/app/tgtg/model/remote/order/response/CharityOrderHistoryResponse;", "", "Lcom/app/tgtg/model/remote/user/response/ItemsListPaging;", "paging", "", "Lcom/app/tgtg/model/remote/order/response/OrdersData;", Bayeux.KEY_DATA, "<init>", "(Lcom/app/tgtg/model/remote/user/response/ItemsListPaging;Ljava/util/List;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILcom/app/tgtg/model/remote/user/response/ItemsListPaging;Ljava/util/List;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/order/response/CharityOrderHistoryResponse;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/app/tgtg/model/remote/user/response/ItemsListPaging;", "component2", "()Ljava/util/List;", "copy", "(Lcom/app/tgtg/model/remote/user/response/ItemsListPaging;Ljava/util/List;)Lcom/app/tgtg/model/remote/order/response/CharityOrderHistoryResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/app/tgtg/model/remote/user/response/ItemsListPaging;", "getPaging", "getPaging$annotations", "()V", "Ljava/util/List;", "getData", "getData$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class CharityOrderHistoryResponse {

    @NotNull
    private final List<OrdersData> data;

    @NotNull
    private final ItemsListPaging paging;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private static final j[] $childSerializers = {null, l.a(m.PUBLICATION, new a(10))};

    public /* synthetic */ CharityOrderHistoryResponse(int i11, ItemsListPaging itemsListPaging, List list, m1 m1Var) {
        if (3 != (i11 & 3)) {
            c1.j(i11, 3, CharityOrderHistoryResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.paging = itemsListPaging;
        this.data = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new d(OrdersData$$serializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CharityOrderHistoryResponse copy$default(CharityOrderHistoryResponse charityOrderHistoryResponse, ItemsListPaging itemsListPaging, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            itemsListPaging = charityOrderHistoryResponse.paging;
        }
        if ((i11 & 2) != 0) {
            list = charityOrderHistoryResponse.data;
        }
        return charityOrderHistoryResponse.copy(itemsListPaging, list);
    }

    public static final /* synthetic */ void write$Self$app(CharityOrderHistoryResponse self, b output, SerialDescriptor serialDesc) {
        j[] jVarArr = $childSerializers;
        output.i(serialDesc, 0, ItemsListPaging$$serializer.INSTANCE, self.paging);
        output.i(serialDesc, 1, (KSerializer) jVarArr[1].getValue(), self.data);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ItemsListPaging getPaging() {
        return this.paging;
    }

    @NotNull
    public final List<OrdersData> component2() {
        return this.data;
    }

    @NotNull
    public final CharityOrderHistoryResponse copy(@NotNull ItemsListPaging paging, @NotNull List<OrdersData> data) {
        paging.getClass();
        data.getClass();
        return new CharityOrderHistoryResponse(paging, data);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CharityOrderHistoryResponse)) {
            return false;
        }
        CharityOrderHistoryResponse charityOrderHistoryResponse = (CharityOrderHistoryResponse) other;
        return Intrinsics.areEqual(this.paging, charityOrderHistoryResponse.paging) && Intrinsics.areEqual(this.data, charityOrderHistoryResponse.data);
    }

    @NotNull
    public final List<OrdersData> getData() {
        return this.data;
    }

    @NotNull
    public final ItemsListPaging getPaging() {
        return this.paging;
    }

    public int hashCode() {
        return this.data.hashCode() + (this.paging.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "CharityOrderHistoryResponse(paging=" + this.paging + ", data=" + this.data + ")";
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/order/response/CharityOrderHistoryResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/order/response/CharityOrderHistoryResponse;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return CharityOrderHistoryResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @g(Bayeux.KEY_DATA)
    public static /* synthetic */ void getData$annotations() {
    }

    @g("paging")
    public static /* synthetic */ void getPaging$annotations() {
    }

    public CharityOrderHistoryResponse(@NotNull ItemsListPaging itemsListPaging, @NotNull List<OrdersData> list) {
        itemsListPaging.getClass();
        list.getClass();
        this.paging = itemsListPaging;
        this.data = list;
    }
}
