package com.app.tgtg.model.remote.item.response;

import com.app.tgtg.R;
import i90.g;
import i90.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import v0.n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h(with = ItemTypeSerializer.class)
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0011B\u001d\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0012"}, d2 = {"Lcom/app/tgtg/model/remote/item/response/ItemType;", "", "resId", "", "iconRes", "<init>", "(Ljava/lang/String;III)V", "getResId", "()I", "getIconRes", "MAGIC_BAG", "MANUFACTURER", "CHARITY", "FLASH_SALES", "CATERING", "TABLE_RESERVATION", "UNKNOWN", "Companion", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ItemType {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ ItemType[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    private final int iconRes;
    private final int resId;

    @g("MAGIC_BAG")
    public static final ItemType MAGIC_BAG = new ItemType("MAGIC_BAG", 0, R.string.item_type_surprise_bags, R.drawable.avatar_icon_shopping_bag);

    @g("MANUFACTURER")
    public static final ItemType MANUFACTURER = new ItemType("MANUFACTURER", 1, R.string.item_type_parcels, R.drawable.avatar_icon_resource_package);

    @g("CHARITY")
    public static final ItemType CHARITY = new ItemType("CHARITY", 2, 0, 0);

    @g("FLASH_SALES")
    public static final ItemType FLASH_SALES = new ItemType("FLASH_SALES", 3, R.string.item_type_flash_sales, 0);

    @g("CATERING")
    public static final ItemType CATERING = new ItemType("CATERING", 4, R.string.item_type_catering, R.drawable.avatar_icon_catering);

    @g("TABLE_RESERVATION")
    public static final ItemType TABLE_RESERVATION = new ItemType("TABLE_RESERVATION", 5, R.string.item_type_tables, R.drawable.avatar_icon_forkknife);
    public static final ItemType UNKNOWN = new ItemType("UNKNOWN", 6, 0, 0);

    private static final /* synthetic */ ItemType[] $values() {
        return new ItemType[]{MAGIC_BAG, MANUFACTURER, CHARITY, FLASH_SALES, CATERING, TABLE_RESERVATION, UNKNOWN};
    }

    static {
        ItemType[] itemTypeArr$values = $values();
        $VALUES = itemTypeArr$values;
        $ENTRIES = n.w(itemTypeArr$values);
        INSTANCE = new Companion(null);
    }

    private ItemType(String str, int i11, int i12, int i13) {
        this.resId = i12;
        this.iconRes = i13;
    }

    @NotNull
    public static a80.a getEntries() {
        return $ENTRIES;
    }

    public static ItemType valueOf(String str) {
        return (ItemType) Enum.valueOf(ItemType.class, str);
    }

    public static ItemType[] values() {
        return (ItemType[]) $VALUES.clone();
    }

    public final int getIconRes() {
        return this.iconRes;
    }

    public final int getResId() {
        return this.resId;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/item/response/ItemType$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/item/response/ItemType;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return ItemTypeSerializer.INSTANCE;
        }

        private Companion() {
        }
    }
}
