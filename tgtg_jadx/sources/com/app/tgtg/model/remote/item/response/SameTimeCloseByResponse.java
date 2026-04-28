package com.app.tgtg.model.remote.item.response;

import i90.g;
import i90.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.n0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
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
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,+B'\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007B;\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J0\u0010\u001a\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u0017R&\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010%\u0012\u0004\b*\u0010(\u001a\u0004\b)\u0010\u0017¨\u0006-"}, d2 = {"Lcom/app/tgtg/model/remote/item/response/SameTimeCloseByResponse;", "", "", "Lcom/app/tgtg/model/remote/item/response/BasicItem;", "items", "itemsExpandedRadius", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/item/response/SameTimeCloseByResponse;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "recommendedItems", "()Ljava/util/List;", "component1", "component2", "copy", "(Ljava/util/List;Ljava/util/List;)Lcom/app/tgtg/model/remote/item/response/SameTimeCloseByResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getItems", "getItems$annotations", "()V", "getItemsExpandedRadius", "getItemsExpandedRadius$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSameTimeCloseByResponse.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SameTimeCloseByResponse.kt\ncom/app/tgtg/model/remote/item/response/SameTimeCloseByResponse\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,16:1\n1#2:17\n*E\n"})
public final /* data */ class SameTimeCloseByResponse {

    @NotNull
    private static final j[] $childSerializers;

    @NotNull
    private final List<BasicItem> items;

    @NotNull
    private final List<BasicItem> itemsExpandedRadius;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    static {
        m mVar = m.PUBLICATION;
        $childSerializers = new j[]{l.a(mVar, new a(6)), l.a(mVar, new a(7))};
    }

    public SameTimeCloseByResponse(int i11, List list, List list2, m1 m1Var) {
        this.items = (i11 & 1) == 0 ? n0.f26529a : list;
        if ((i11 & 2) == 0) {
            this.itemsExpandedRadius = n0.f26529a;
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
    public static /* synthetic */ SameTimeCloseByResponse copy$default(SameTimeCloseByResponse sameTimeCloseByResponse, List list, List list2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = sameTimeCloseByResponse.items;
        }
        if ((i11 & 2) != 0) {
            list2 = sameTimeCloseByResponse.itemsExpandedRadius;
        }
        return sameTimeCloseByResponse.copy(list, list2);
    }

    public static final void write$Self$app(SameTimeCloseByResponse self, b output, SerialDescriptor serialDesc) {
        j[] jVarArr = $childSerializers;
        if (output.C(serialDesc) || !Intrinsics.areEqual(self.items, n0.f26529a)) {
            output.i(serialDesc, 0, (KSerializer) jVarArr[0].getValue(), self.items);
        }
        if (!output.C(serialDesc) && Intrinsics.areEqual(self.itemsExpandedRadius, n0.f26529a)) {
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
    public final SameTimeCloseByResponse copy(@NotNull List<? extends BasicItem> items, @NotNull List<? extends BasicItem> itemsExpandedRadius) {
        items.getClass();
        itemsExpandedRadius.getClass();
        return new SameTimeCloseByResponse(items, itemsExpandedRadius);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SameTimeCloseByResponse)) {
            return false;
        }
        SameTimeCloseByResponse sameTimeCloseByResponse = (SameTimeCloseByResponse) other;
        return Intrinsics.areEqual(this.items, sameTimeCloseByResponse.items) && Intrinsics.areEqual(this.itemsExpandedRadius, sameTimeCloseByResponse.itemsExpandedRadius);
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

    @NotNull
    public final List<BasicItem> recommendedItems() {
        List<BasicItem> list = this.items;
        return list.isEmpty() ? this.itemsExpandedRadius : list;
    }

    @NotNull
    public String toString() {
        return "SameTimeCloseByResponse(items=" + this.items + ", itemsExpandedRadius=" + this.itemsExpandedRadius + ")";
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/item/response/SameTimeCloseByResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/item/response/SameTimeCloseByResponse;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return SameTimeCloseByResponse$$serializer.INSTANCE;
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

    public SameTimeCloseByResponse() {
        this((List) null, (List) null, 3, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SameTimeCloseByResponse(@NotNull List<? extends BasicItem> list, @NotNull List<? extends BasicItem> list2) {
        list.getClass();
        list2.getClass();
        this.items = list;
        this.itemsExpandedRadius = list2;
    }

    public SameTimeCloseByResponse(List list, List list2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? n0.f26529a : list, (i11 & 2) != 0 ? n0.f26529a : list2);
    }
}
