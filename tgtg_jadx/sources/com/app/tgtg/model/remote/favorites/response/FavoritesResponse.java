package com.app.tgtg.model.remote.favorites.response;

import bg.a;
import com.app.tgtg.model.remote.item.response.BasicItem;
import com.app.tgtg.model.remote.user.response.ItemsListPaging;
import com.app.tgtg.model.remote.user.response.ItemsListPaging$$serializer;
import e0.f;
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
import m90.c1;
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
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000254B/\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\b\u0010\tBE\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J:\u0010\u001d\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R.\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0004\u0010(\u0012\u0004\b,\u0010-\u001a\u0004\b)\u0010\u0019\"\u0004\b*\u0010+R \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010.\u0012\u0004\b0\u0010-\u001a\u0004\b/\u0010\u001bR.\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0007\u0010(\u0012\u0004\b3\u0010-\u001a\u0004\b1\u0010\u0019\"\u0004\b2\u0010+¨\u00066"}, d2 = {"Lcom/app/tgtg/model/remote/favorites/response/FavoritesResponse;", "", "", "Lcom/app/tgtg/model/remote/item/response/BasicItem;", "items", "Lcom/app/tgtg/model/remote/user/response/ItemsListPaging;", "paging", "recentOrders", "<init>", "(Ljava/util/List;Lcom/app/tgtg/model/remote/user/response/ItemsListPaging;Ljava/util/List;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/util/List;Lcom/app/tgtg/model/remote/user/response/ItemsListPaging;Ljava/util/List;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/favorites/response/FavoritesResponse;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()Lcom/app/tgtg/model/remote/user/response/ItemsListPaging;", "component3", "copy", "(Ljava/util/List;Lcom/app/tgtg/model/remote/user/response/ItemsListPaging;Ljava/util/List;)Lcom/app/tgtg/model/remote/favorites/response/FavoritesResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getItems", "setItems", "(Ljava/util/List;)V", "getItems$annotations", "()V", "Lcom/app/tgtg/model/remote/user/response/ItemsListPaging;", "getPaging", "getPaging$annotations", "getRecentOrders", "setRecentOrders", "getRecentOrders$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class FavoritesResponse {

    @NotNull
    private static final j[] $childSerializers;

    @NotNull
    private List<? extends BasicItem> items;

    @NotNull
    private final ItemsListPaging paging;

    @NotNull
    private List<? extends BasicItem> recentOrders;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    static {
        m mVar = m.PUBLICATION;
        $childSerializers = new j[]{l.a(mVar, new a(26)), null, l.a(mVar, new a(27))};
    }

    public /* synthetic */ FavoritesResponse(int i11, List list, ItemsListPaging itemsListPaging, List list2, m1 m1Var) {
        if (2 != (i11 & 2)) {
            c1.j(i11, 2, FavoritesResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.items = (i11 & 1) == 0 ? new ArrayList() : list;
        this.paging = itemsListPaging;
        if ((i11 & 4) == 0) {
            this.recentOrders = new ArrayList();
        } else {
            this.recentOrders = list2;
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
    public static /* synthetic */ FavoritesResponse copy$default(FavoritesResponse favoritesResponse, List list, ItemsListPaging itemsListPaging, List list2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = favoritesResponse.items;
        }
        if ((i11 & 2) != 0) {
            itemsListPaging = favoritesResponse.paging;
        }
        if ((i11 & 4) != 0) {
            list2 = favoritesResponse.recentOrders;
        }
        return favoritesResponse.copy(list, itemsListPaging, list2);
    }

    public static final /* synthetic */ void write$Self$app(FavoritesResponse self, b output, SerialDescriptor serialDesc) {
        j[] jVarArr = $childSerializers;
        if (output.C(serialDesc) || !Intrinsics.areEqual(self.items, new ArrayList())) {
            output.i(serialDesc, 0, (KSerializer) jVarArr[0].getValue(), self.items);
        }
        output.i(serialDesc, 1, ItemsListPaging$$serializer.INSTANCE, self.paging);
        if (!output.C(serialDesc) && Intrinsics.areEqual(self.recentOrders, new ArrayList())) {
            return;
        }
        output.i(serialDesc, 2, (KSerializer) jVarArr[2].getValue(), self.recentOrders);
    }

    @NotNull
    public final List<BasicItem> component1() {
        return this.items;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ItemsListPaging getPaging() {
        return this.paging;
    }

    @NotNull
    public final List<BasicItem> component3() {
        return this.recentOrders;
    }

    @NotNull
    public final FavoritesResponse copy(@NotNull List<? extends BasicItem> items, @NotNull ItemsListPaging paging, @NotNull List<? extends BasicItem> recentOrders) {
        items.getClass();
        paging.getClass();
        recentOrders.getClass();
        return new FavoritesResponse(items, paging, recentOrders);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FavoritesResponse)) {
            return false;
        }
        FavoritesResponse favoritesResponse = (FavoritesResponse) other;
        return Intrinsics.areEqual(this.items, favoritesResponse.items) && Intrinsics.areEqual(this.paging, favoritesResponse.paging) && Intrinsics.areEqual(this.recentOrders, favoritesResponse.recentOrders);
    }

    @NotNull
    public final List<BasicItem> getItems() {
        return this.items;
    }

    @NotNull
    public final ItemsListPaging getPaging() {
        return this.paging;
    }

    @NotNull
    public final List<BasicItem> getRecentOrders() {
        return this.recentOrders;
    }

    public int hashCode() {
        return this.recentOrders.hashCode() + ((this.paging.hashCode() + (this.items.hashCode() * 31)) * 31);
    }

    public final void setItems(@NotNull List<? extends BasicItem> list) {
        list.getClass();
        this.items = list;
    }

    public final void setRecentOrders(@NotNull List<? extends BasicItem> list) {
        list.getClass();
        this.recentOrders = list;
    }

    @NotNull
    public String toString() {
        List<? extends BasicItem> list = this.items;
        ItemsListPaging itemsListPaging = this.paging;
        List<? extends BasicItem> list2 = this.recentOrders;
        StringBuilder sb2 = new StringBuilder("FavoritesResponse(items=");
        sb2.append(list);
        sb2.append(", paging=");
        sb2.append(itemsListPaging);
        sb2.append(", recentOrders=");
        return f.p(sb2, list2, ")");
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/favorites/response/FavoritesResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/favorites/response/FavoritesResponse;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return FavoritesResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @g("favourite_items")
    public static /* synthetic */ void getItems$annotations() {
    }

    @g("paging")
    public static /* synthetic */ void getPaging$annotations() {
    }

    @g("favorite_carousel_items")
    public static /* synthetic */ void getRecentOrders$annotations() {
    }

    public FavoritesResponse(@NotNull List<? extends BasicItem> list, @NotNull ItemsListPaging itemsListPaging, @NotNull List<? extends BasicItem> list2) {
        list.getClass();
        itemsListPaging.getClass();
        list2.getClass();
        this.items = list;
        this.paging = itemsListPaging;
        this.recentOrders = list2;
    }

    public /* synthetic */ FavoritesResponse(List list, ItemsListPaging itemsListPaging, List list2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? new ArrayList() : list, itemsListPaging, (i11 & 4) != 0 ? new ArrayList() : list2);
    }
}
