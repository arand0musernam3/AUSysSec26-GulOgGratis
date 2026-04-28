package com.app.tgtg.model.remote.item.response;

import i90.g;
import i90.h;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.d;
import m90.m1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.j;
import u70.l;
import u70.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002.-B'\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007B;\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J0\u0010\u0019\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R.\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0004\u0010$\u0012\u0004\b(\u0010)\u001a\u0004\b%\u0010\u0017\"\u0004\b&\u0010'R.\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0005\u0010$\u0012\u0004\b,\u0010)\u001a\u0004\b*\u0010\u0017\"\u0004\b+\u0010'¨\u0006/"}, d2 = {"Lcom/app/tgtg/model/remote/item/response/ListItemResponse;", "", "", "Lcom/app/tgtg/model/remote/item/response/BasicItem;", "items", "itemsExpandedRadius", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/item/response/ListItemResponse;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "copy", "(Ljava/util/List;Ljava/util/List;)Lcom/app/tgtg/model/remote/item/response/ListItemResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getItems", "setItems", "(Ljava/util/List;)V", "getItems$annotations", "()V", "getItemsExpandedRadius", "setItemsExpandedRadius", "getItemsExpandedRadius$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class ListItemResponse {

    @NotNull
    private static final j[] $childSerializers;

    @NotNull
    private List<? extends BasicItem> items;

    @NotNull
    private List<? extends BasicItem> itemsExpandedRadius;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    static {
        m mVar = m.PUBLICATION;
        $childSerializers = new j[]{l.a(mVar, new a(2)), l.a(mVar, new a(3))};
    }

    public /* synthetic */ ListItemResponse(int i11, List list, List list2, m1 m1Var) {
        this.items = (i11 & 1) == 0 ? new ArrayList() : list;
        if ((i11 & 2) == 0) {
            this.itemsExpandedRadius = new ArrayList();
        } else {
            this.itemsExpandedRadius = list2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new d(BasicItem.INSTANCE.serializer(), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new d(BasicItem.INSTANCE.serializer(), 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ListItemResponse copy$default(ListItemResponse listItemResponse, List list, List list2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = listItemResponse.items;
        }
        if ((i11 & 2) != 0) {
            list2 = listItemResponse.itemsExpandedRadius;
        }
        return listItemResponse.copy(list, list2);
    }

    public static final /* synthetic */ void write$Self$app(ListItemResponse self, b output, SerialDescriptor serialDesc) {
        j[] jVarArr = $childSerializers;
        if (output.C(serialDesc) || !Intrinsics.areEqual(self.items, new ArrayList())) {
            output.i(serialDesc, 0, (KSerializer) jVarArr[0].getValue(), self.items);
        }
        if (!output.C(serialDesc) && Intrinsics.areEqual(self.itemsExpandedRadius, new ArrayList())) {
            return;
        }
        output.i(serialDesc, 1, (KSerializer) jVarArr[1].getValue(), self.itemsExpandedRadius);
    }

    @NotNull
    public final List<BasicItem> component1() {
        return this.items;
    }

    @NotNull
    public final List<BasicItem> component2() {
        return this.itemsExpandedRadius;
    }

    @NotNull
    public final ListItemResponse copy(@NotNull List<? extends BasicItem> items, @NotNull List<? extends BasicItem> itemsExpandedRadius) {
        items.getClass();
        itemsExpandedRadius.getClass();
        return new ListItemResponse(items, itemsExpandedRadius);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ListItemResponse)) {
            return false;
        }
        ListItemResponse listItemResponse = (ListItemResponse) other;
        return Intrinsics.areEqual(this.items, listItemResponse.items) && Intrinsics.areEqual(this.itemsExpandedRadius, listItemResponse.itemsExpandedRadius);
    }

    @NotNull
    public final List<BasicItem> getItems() {
        return this.items;
    }

    @NotNull
    public final List<BasicItem> getItemsExpandedRadius() {
        return this.itemsExpandedRadius;
    }

    public int hashCode() {
        return this.itemsExpandedRadius.hashCode() + (this.items.hashCode() * 31);
    }

    public final void setItems(@NotNull List<? extends BasicItem> list) {
        list.getClass();
        this.items = list;
    }

    public final void setItemsExpandedRadius(@NotNull List<? extends BasicItem> list) {
        list.getClass();
        this.itemsExpandedRadius = list;
    }

    @NotNull
    public String toString() {
        return "ListItemResponse(items=" + this.items + ", itemsExpandedRadius=" + this.itemsExpandedRadius + ")";
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/item/response/ListItemResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/item/response/ListItemResponse;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return ListItemResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @g("items")
    public static /* synthetic */ void getItems$annotations() {
    }

    @g("items_expanded_radius")
    public static /* synthetic */ void getItemsExpandedRadius$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ListItemResponse() {
        this((List) null, (List) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public ListItemResponse(@NotNull List<? extends BasicItem> list, @NotNull List<? extends BasicItem> list2) {
        list.getClass();
        list2.getClass();
        this.items = list;
        this.itemsExpandedRadius = list2;
    }

    public /* synthetic */ ListItemResponse(List list, List list2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? new ArrayList() : list, (i11 & 2) != 0 ? new ArrayList() : list2);
    }
}
