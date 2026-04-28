package com.app.tgtg.model.remote.mapService.response;

import e0.f;
import hp.f0;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.j;
import u70.l;
import u70.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000210B7\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002¢\u0006\u0004\b\t\u0010\nBK\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ@\u0010\u001d\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010(\u0012\u0004\b*\u0010+\u001a\u0004\b)\u0010\u001aR&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010(\u0012\u0004\b-\u0010+\u001a\u0004\b,\u0010\u001aR&\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010(\u0012\u0004\b/\u0010+\u001a\u0004\b.\u0010\u001a¨\u00062"}, d2 = {"Lcom/app/tgtg/model/remote/mapService/response/MapFilters;", "", "", "Lcom/app/tgtg/model/remote/mapService/response/FilterChipOption;", "chips", "Lcom/app/tgtg/model/remote/mapService/response/FilterCategory;", "categories", "Lcom/app/tgtg/model/remote/mapService/response/FilterDiet;", "diets", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Ljava/util/List;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/mapService/response/MapFilters;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "component3", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/app/tgtg/model/remote/mapService/response/MapFilters;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getChips", "getChips$annotations", "()V", "getCategories", "getCategories$annotations", "getDiets", "getDiets$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class MapFilters {

    @NotNull
    private static final j[] $childSerializers;

    @NotNull
    private final List<FilterCategory> categories;

    @NotNull
    private final List<FilterChipOption> chips;

    @NotNull
    private final List<FilterDiet> diets;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    static {
        m mVar = m.PUBLICATION;
        $childSerializers = new j[]{l.a(mVar, new f0(14)), l.a(mVar, new f0(15)), l.a(mVar, new f0(16))};
    }

    public MapFilters(int i11, List list, List list2, List list3, m1 m1Var) {
        this.chips = (i11 & 1) == 0 ? n0.f26529a : list;
        if ((i11 & 2) == 0) {
            this.categories = n0.f26529a;
        } else {
            this.categories = list2;
        }
        if ((i11 & 4) == 0) {
            this.diets = n0.f26529a;
        } else {
            this.diets = list3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new d(FilterChipOption$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new d(FilterCategory$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return new d(FilterDiet$$serializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MapFilters copy$default(MapFilters mapFilters, List list, List list2, List list3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = mapFilters.chips;
        }
        if ((i11 & 2) != 0) {
            list2 = mapFilters.categories;
        }
        if ((i11 & 4) != 0) {
            list3 = mapFilters.diets;
        }
        return mapFilters.copy(list, list2, list3);
    }

    public static final void write$Self$app(MapFilters self, b output, SerialDescriptor serialDesc) {
        j[] jVarArr = $childSerializers;
        if (output.C(serialDesc) || !Intrinsics.areEqual(self.chips, n0.f26529a)) {
            output.i(serialDesc, 0, (KSerializer) jVarArr[0].getValue(), self.chips);
        }
        if (output.C(serialDesc) || !Intrinsics.areEqual(self.categories, n0.f26529a)) {
            output.i(serialDesc, 1, (KSerializer) jVarArr[1].getValue(), self.categories);
        }
        if (!output.C(serialDesc) && Intrinsics.areEqual(self.diets, n0.f26529a)) {
            return;
        }
        output.i(serialDesc, 2, (KSerializer) jVarArr[2].getValue(), self.diets);
    }

    @NotNull
    public final List<FilterChipOption> component1() {
        return this.chips;
    }

    @NotNull
    public final List<FilterCategory> component2() {
        return this.categories;
    }

    @NotNull
    public final List<FilterDiet> component3() {
        return this.diets;
    }

    @NotNull
    public final MapFilters copy(@NotNull List<FilterChipOption> chips, @NotNull List<FilterCategory> categories, @NotNull List<FilterDiet> diets) {
        chips.getClass();
        categories.getClass();
        diets.getClass();
        return new MapFilters(chips, categories, diets);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MapFilters)) {
            return false;
        }
        MapFilters mapFilters = (MapFilters) other;
        return Intrinsics.areEqual(this.chips, mapFilters.chips) && Intrinsics.areEqual(this.categories, mapFilters.categories) && Intrinsics.areEqual(this.diets, mapFilters.diets);
    }

    @NotNull
    public final List<FilterCategory> getCategories() {
        return this.categories;
    }

    @NotNull
    public final List<FilterChipOption> getChips() {
        return this.chips;
    }

    @NotNull
    public final List<FilterDiet> getDiets() {
        return this.diets;
    }

    public int hashCode() {
        return this.diets.hashCode() + f.c(this.categories, this.chips.hashCode() * 31, 31);
    }

    @NotNull
    public String toString() {
        List<FilterChipOption> list = this.chips;
        List<FilterCategory> list2 = this.categories;
        List<FilterDiet> list3 = this.diets;
        StringBuilder sb2 = new StringBuilder("MapFilters(chips=");
        sb2.append(list);
        sb2.append(", categories=");
        sb2.append(list2);
        sb2.append(", diets=");
        return f.p(sb2, list3, ")");
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/mapService/response/MapFilters$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/mapService/response/MapFilters;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return MapFilters$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @g("categories")
    public static /* synthetic */ void getCategories$annotations() {
    }

    @g("chips")
    public static /* synthetic */ void getChips$annotations() {
    }

    @g("diets")
    public static /* synthetic */ void getDiets$annotations() {
    }

    public MapFilters() {
        this((List) null, (List) null, (List) null, 7, (DefaultConstructorMarker) null);
    }

    public MapFilters(@NotNull List<FilterChipOption> list, @NotNull List<FilterCategory> list2, @NotNull List<FilterDiet> list3) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.chips = list;
        this.categories = list2;
        this.diets = list3;
    }

    public MapFilters(List list, List list2, List list3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? n0.f26529a : list, (i11 & 2) != 0 ? n0.f26529a : list2, (i11 & 4) != 0 ? n0.f26529a : list3);
    }
}
