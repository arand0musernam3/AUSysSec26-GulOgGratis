package com.app.tgtg.model.remote.mapService.request;

import com.app.tgtg.model.PickupIntervalDateObject;
import com.app.tgtg.model.PickupIntervalDateObject$$serializer;
import e0.f;
import g60.d;
import i90.g;
import i90.h;
import j4.s;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.c1;
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
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000254BE\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fB]\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÂ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÂ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0018\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0002HÂ\u0003¢\u0006\u0004\b\u0015\u0010\u0013J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÂ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\tHÂ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\"\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0001¢\u0006\u0004\b \u0010!JX\u0010#\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b%\u0010\u0017J\u0010\u0010&\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010)\u001a\u00020\t2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0004\u0010+\u0012\u0004\b,\u0010-R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0005\u0010+\u0012\u0004\b.\u0010-R\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0007\u0010+\u0012\u0004\b/\u0010-R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00038\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\b\u00100\u0012\u0004\b1\u0010-R\u001a\u0010\n\u001a\u00020\t8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\n\u00102\u0012\u0004\b3\u0010-¨\u00066"}, d2 = {"Lcom/app/tgtg/model/remote/mapService/request/FilteredBy;", "", "", "", "itemCategory", "dietCategories", "Lcom/app/tgtg/model/PickupIntervalDateObject;", "pickupIntervals", "searchPhrase", "", "withStockOnly", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Z)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;ZLm90/m1;)V", "component1", "()Ljava/util/List;", "component2", "component3", "component4", "()Ljava/lang/String;", "component5", "()Z", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/mapService/request/FilteredBy;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Z)Lcom/app/tgtg/model/remote/mapService/request/FilteredBy;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getItemCategory$annotations", "()V", "getDietCategories$annotations", "getPickupIntervals$annotations", "Ljava/lang/String;", "getSearchPhrase$annotations", "Z", "getWithStockOnly$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class FilteredBy {

    @NotNull
    private static final j[] $childSerializers;

    @NotNull
    private final List<String> dietCategories;

    @NotNull
    private final List<String> itemCategory;

    @Nullable
    private final List<PickupIntervalDateObject> pickupIntervals;

    @Nullable
    private final String searchPhrase;
    private final boolean withStockOnly;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    static {
        m mVar = m.PUBLICATION;
        $childSerializers = new j[]{l.a(mVar, new d(25)), l.a(mVar, new d(26)), l.a(mVar, new d(27)), null, null};
    }

    public /* synthetic */ FilteredBy(int i11, List list, List list2, List list3, String str, boolean z11, m1 m1Var) {
        if (31 != (i11 & 31)) {
            c1.j(i11, 31, FilteredBy$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.itemCategory = list;
        this.dietCategories = list2;
        this.pickupIntervals = list3;
        this.searchPhrase = str;
        this.withStockOnly = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new m90.d(r1.f29848a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new m90.d(r1.f29848a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return new m90.d(PickupIntervalDateObject$$serializer.INSTANCE, 0);
    }

    private final List<String> component1() {
        return this.itemCategory;
    }

    private final List<String> component2() {
        return this.dietCategories;
    }

    private final List<PickupIntervalDateObject> component3() {
        return this.pickupIntervals;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    private final String getSearchPhrase() {
        return this.searchPhrase;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    private final boolean getWithStockOnly() {
        return this.withStockOnly;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FilteredBy copy$default(FilteredBy filteredBy, List list, List list2, List list3, String str, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = filteredBy.itemCategory;
        }
        if ((i11 & 2) != 0) {
            list2 = filteredBy.dietCategories;
        }
        if ((i11 & 4) != 0) {
            list3 = filteredBy.pickupIntervals;
        }
        if ((i11 & 8) != 0) {
            str = filteredBy.searchPhrase;
        }
        if ((i11 & 16) != 0) {
            z11 = filteredBy.withStockOnly;
        }
        boolean z12 = z11;
        List list4 = list3;
        return filteredBy.copy(list, list2, list4, str, z12);
    }

    public static final /* synthetic */ void write$Self$app(FilteredBy self, b output, SerialDescriptor serialDesc) {
        j[] jVarArr = $childSerializers;
        output.i(serialDesc, 0, (KSerializer) jVarArr[0].getValue(), self.itemCategory);
        output.i(serialDesc, 1, (KSerializer) jVarArr[1].getValue(), self.dietCategories);
        output.r(serialDesc, 2, (KSerializer) jVarArr[2].getValue(), self.pickupIntervals);
        output.r(serialDesc, 3, r1.f29848a, self.searchPhrase);
        output.p(serialDesc, 4, self.withStockOnly);
    }

    @NotNull
    public final FilteredBy copy(@NotNull List<String> itemCategory, @NotNull List<String> dietCategories, @Nullable List<PickupIntervalDateObject> pickupIntervals, @Nullable String searchPhrase, boolean withStockOnly) {
        itemCategory.getClass();
        dietCategories.getClass();
        return new FilteredBy(itemCategory, dietCategories, pickupIntervals, searchPhrase, withStockOnly);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FilteredBy)) {
            return false;
        }
        FilteredBy filteredBy = (FilteredBy) other;
        return Intrinsics.areEqual(this.itemCategory, filteredBy.itemCategory) && Intrinsics.areEqual(this.dietCategories, filteredBy.dietCategories) && Intrinsics.areEqual(this.pickupIntervals, filteredBy.pickupIntervals) && Intrinsics.areEqual(this.searchPhrase, filteredBy.searchPhrase) && this.withStockOnly == filteredBy.withStockOnly;
    }

    public int hashCode() {
        int iC = f.c(this.dietCategories, this.itemCategory.hashCode() * 31, 31);
        List<PickupIntervalDateObject> list = this.pickupIntervals;
        int iHashCode = (iC + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.searchPhrase;
        return Boolean.hashCode(this.withStockOnly) + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        List<String> list = this.itemCategory;
        List<String> list2 = this.dietCategories;
        List<PickupIntervalDateObject> list3 = this.pickupIntervals;
        String str = this.searchPhrase;
        boolean z11 = this.withStockOnly;
        StringBuilder sb2 = new StringBuilder("FilteredBy(itemCategory=");
        sb2.append(list);
        sb2.append(", dietCategories=");
        sb2.append(list2);
        sb2.append(", pickupIntervals=");
        sb2.append(list3);
        sb2.append(", searchPhrase=");
        sb2.append(str);
        sb2.append(", withStockOnly=");
        return s.o(sb2, z11, ")");
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/mapService/request/FilteredBy$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/mapService/request/FilteredBy;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return FilteredBy$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @g("diet_categories")
    private static /* synthetic */ void getDietCategories$annotations() {
    }

    @g("item_categories")
    private static /* synthetic */ void getItemCategory$annotations() {
    }

    @g("pickup_intervals")
    private static /* synthetic */ void getPickupIntervals$annotations() {
    }

    @g("search_phrase")
    private static /* synthetic */ void getSearchPhrase$annotations() {
    }

    @g("with_stock_only")
    private static /* synthetic */ void getWithStockOnly$annotations() {
    }

    public FilteredBy(@NotNull List<String> list, @NotNull List<String> list2, @Nullable List<PickupIntervalDateObject> list3, @Nullable String str, boolean z11) {
        list.getClass();
        list2.getClass();
        this.itemCategory = list;
        this.dietCategories = list2;
        this.pickupIntervals = list3;
        this.searchPhrase = str;
        this.withStockOnly = z11;
    }
}
