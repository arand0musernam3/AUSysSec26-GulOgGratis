package com.app.tgtg.model.remote.item;

import a80.a;
import com.app.tgtg.R;
import i90.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.y;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v0.n;
import zendesk.messaging.android.internal.conversationscreen.messagelog.MessageLogView;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h(with = ItemCategorySerializer.class)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0087\u0081\u0002\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0014B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0015"}, d2 = {"Lcom/app/tgtg/model/remote/item/ItemCategory;", "", "nameRes", "", "trackingName", "", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "getNameRes", "()I", "getTrackingName", "()Ljava/lang/String;", "MEAL", "BAKED_GOODS", "GROCERIES", "FLOWERS_PLANTS", "PET_FOOD", "PERSONAL_CARE", "OTHER", "SHOW_ALL", "Companion", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ItemCategory {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ItemCategory[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    private final int nameRes;

    @NotNull
    private final String trackingName;
    public static final ItemCategory MEAL = new ItemCategory("MEAL", 0, R.string.generic_category_meals, "Meals");
    public static final ItemCategory BAKED_GOODS = new ItemCategory("BAKED_GOODS", 1, R.string.generic_category_baked_goods, "Baked_Goods");
    public static final ItemCategory GROCERIES = new ItemCategory("GROCERIES", 2, R.string.generic_category_groceries, "Groceries");
    public static final ItemCategory FLOWERS_PLANTS = new ItemCategory("FLOWERS_PLANTS", 3, R.string.generic_category_flowers, "Flowers & plants");
    public static final ItemCategory PET_FOOD = new ItemCategory("PET_FOOD", 4, R.string.generic_category_pet_food, "Pet food");
    public static final ItemCategory PERSONAL_CARE = new ItemCategory("PERSONAL_CARE", 5, R.string.generic_category_personal_care, "Personal_Care");
    public static final ItemCategory OTHER = new ItemCategory("OTHER", 6, R.string.generic_category_other, "Other");
    public static final ItemCategory SHOW_ALL = new ItemCategory("SHOW_ALL", 7, R.string.generic_category_show_all, "Show_all");

    private static final /* synthetic */ ItemCategory[] $values() {
        return new ItemCategory[]{MEAL, BAKED_GOODS, GROCERIES, FLOWERS_PLANTS, PET_FOOD, PERSONAL_CARE, OTHER, SHOW_ALL};
    }

    static {
        ItemCategory[] itemCategoryArr$values = $values();
        $VALUES = itemCategoryArr$values;
        $ENTRIES = n.w(itemCategoryArr$values);
        INSTANCE = new Companion(null);
    }

    private ItemCategory(String str, int i11, int i12, String str2) {
        this.nameRes = i12;
        this.trackingName = str2;
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static ItemCategory valueOf(String str) {
        return (ItemCategory) Enum.valueOf(ItemCategory.class, str);
    }

    public static ItemCategory[] values() {
        return (ItemCategory[]) $VALUES.clone();
    }

    public final int getNameRes() {
        return this.nameRes;
    }

    @NotNull
    public final String getTrackingName() {
        return this.trackingName;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tJ\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b¨\u0006\f"}, d2 = {"Lcom/app/tgtg/model/remote/item/ItemCategory$Companion;", "", "<init>", "()V", "fromStringToList", "Ljava/util/ArrayList;", "Lcom/app/tgtg/model/remote/item/ItemCategory;", "Lkotlin/collections/ArrayList;", "input", "", "serializer", "Lkotlinx/serialization/KSerializer;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nItemCategory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ItemCategory.kt\ncom/app/tgtg/model/remote/item/ItemCategory$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,45:1\n1586#2:46\n1661#2,3:47\n1915#2:50\n1916#2:53\n14048#3,2:51\n*S KotlinDebug\n*F\n+ 1 ItemCategory.kt\ncom/app/tgtg/model/remote/item/ItemCategory$Companion\n*L\n25#1:46\n25#1:47,3\n27#1:50\n27#1:53\n28#1:51,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ArrayList<ItemCategory> fromStringToList(@Nullable String input) {
            if (input != null) {
                ArrayList<ItemCategory> arrayList = new ArrayList<>();
                List listSplit$default = StringsKt__StringsKt.split$default(input, new String[]{MessageLogView.COMMA_SEPARATOR}, false, 0, 6, null);
                ArrayList<String> arrayList2 = new ArrayList(e0.o(listSplit$default, 10));
                Iterator it = listSplit$default.iterator();
                while (it.hasNext()) {
                    arrayList2.add(StringsKt.e0((String) it.next()).toString());
                }
                for (String str : arrayList2) {
                    for (ItemCategory itemCategory : ItemCategory.values()) {
                        if (y.k(str, itemCategory.name(), true)) {
                            arrayList.add(itemCategory);
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    return arrayList;
                }
            }
            return new ArrayList<>();
        }

        @NotNull
        public final KSerializer serializer() {
            return ItemCategorySerializer.INSTANCE;
        }

        private Companion() {
        }
    }
}
