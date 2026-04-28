package com.app.tgtg.model.remote.user.response;

import i90.g;
import i90.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.c1;
import m90.m1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u00020/B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bB;\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0017J8\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0017J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u0017R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010%\u0012\u0004\b*\u0010(\u001a\u0004\b)\u0010\u0017R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010%\u0012\u0004\b,\u0010(\u001a\u0004\b+\u0010\u0017R \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010%\u0012\u0004\b.\u0010(\u001a\u0004\b-\u0010\u0017¨\u00061"}, d2 = {"Lcom/app/tgtg/model/remote/user/response/ItemsListPaging;", "", "", "size", "page", "totalPages", "totalElements", "<init>", "(IIII)V", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(IIIIILm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/user/response/ItemsListPaging;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "component3", "component4", "copy", "(IIII)Lcom/app/tgtg/model/remote/user/response/ItemsListPaging;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getSize", "getSize$annotations", "()V", "getPage", "getPage$annotations", "getTotalPages", "getTotalPages$annotations", "getTotalElements", "getTotalElements$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class ItemsListPaging {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int page;
    private final int size;
    private final int totalElements;
    private final int totalPages;

    public /* synthetic */ ItemsListPaging(int i11, int i12, int i13, int i14, int i15, m1 m1Var) {
        if (3 != (i11 & 3)) {
            c1.j(i11, 3, ItemsListPaging$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.size = i12;
        this.page = i13;
        if ((i11 & 4) == 0) {
            this.totalPages = 0;
        } else {
            this.totalPages = i14;
        }
        if ((i11 & 8) == 0) {
            this.totalElements = 0;
        } else {
            this.totalElements = i15;
        }
    }

    public static /* synthetic */ ItemsListPaging copy$default(ItemsListPaging itemsListPaging, int i11, int i12, int i13, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i11 = itemsListPaging.size;
        }
        if ((i15 & 2) != 0) {
            i12 = itemsListPaging.page;
        }
        if ((i15 & 4) != 0) {
            i13 = itemsListPaging.totalPages;
        }
        if ((i15 & 8) != 0) {
            i14 = itemsListPaging.totalElements;
        }
        return itemsListPaging.copy(i11, i12, i13, i14);
    }

    public static final /* synthetic */ void write$Self$app(ItemsListPaging self, b output, SerialDescriptor serialDesc) {
        output.m(0, self.size, serialDesc);
        output.m(1, self.page, serialDesc);
        if (output.C(serialDesc) || self.totalPages != 0) {
            output.m(2, self.totalPages, serialDesc);
        }
        if (!output.C(serialDesc) && self.totalElements == 0) {
            return;
        }
        output.m(3, self.totalElements, serialDesc);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getSize() {
        return this.size;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getPage() {
        return this.page;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getTotalPages() {
        return this.totalPages;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getTotalElements() {
        return this.totalElements;
    }

    @NotNull
    public final ItemsListPaging copy(int size, int page, int totalPages, int totalElements) {
        return new ItemsListPaging(size, page, totalPages, totalElements);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ItemsListPaging)) {
            return false;
        }
        ItemsListPaging itemsListPaging = (ItemsListPaging) other;
        return this.size == itemsListPaging.size && this.page == itemsListPaging.page && this.totalPages == itemsListPaging.totalPages && this.totalElements == itemsListPaging.totalElements;
    }

    public final int getPage() {
        return this.page;
    }

    public final int getSize() {
        return this.size;
    }

    public final int getTotalElements() {
        return this.totalElements;
    }

    public final int getTotalPages() {
        return this.totalPages;
    }

    public int hashCode() {
        return Integer.hashCode(this.totalElements) + k.b(this.totalPages, k.b(this.page, Integer.hashCode(this.size) * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        int i11 = this.size;
        int i12 = this.page;
        int i13 = this.totalPages;
        int i14 = this.totalElements;
        StringBuilder sbR = k.r(i11, i12, "ItemsListPaging(size=", ", page=", ", totalPages=");
        sbR.append(i13);
        sbR.append(", totalElements=");
        sbR.append(i14);
        sbR.append(")");
        return sbR.toString();
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/user/response/ItemsListPaging$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/user/response/ItemsListPaging;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return ItemsListPaging$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @g("page")
    public static /* synthetic */ void getPage$annotations() {
    }

    @g("size")
    public static /* synthetic */ void getSize$annotations() {
    }

    @g("total_elements")
    public static /* synthetic */ void getTotalElements$annotations() {
    }

    @g("total_pages")
    public static /* synthetic */ void getTotalPages$annotations() {
    }

    public ItemsListPaging(int i11, int i12, int i13, int i14) {
        this.size = i11;
        this.page = i12;
        this.totalPages = i13;
        this.totalElements = i14;
    }

    public /* synthetic */ ItemsListPaging(int i11, int i12, int i13, int i14, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, i12, (i15 & 4) != 0 ? 0 : i13, (i15 & 8) != 0 ? 0 : i14);
    }
}
