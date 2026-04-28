package com.app.tgtg.model.remote.item.requests;

import a80.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import v0.n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/app/tgtg/model/remote/item/requests/ItemStockOptionType;", "", "<init>", "(Ljava/lang/String;I)V", "STOCK_AVAILABLE_FIRST", "STOCK_ONLY", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ItemStockOptionType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ItemStockOptionType[] $VALUES;
    public static final ItemStockOptionType STOCK_AVAILABLE_FIRST = new ItemStockOptionType("STOCK_AVAILABLE_FIRST", 0);
    public static final ItemStockOptionType STOCK_ONLY = new ItemStockOptionType("STOCK_ONLY", 1);

    private static final /* synthetic */ ItemStockOptionType[] $values() {
        return new ItemStockOptionType[]{STOCK_AVAILABLE_FIRST, STOCK_ONLY};
    }

    static {
        ItemStockOptionType[] itemStockOptionTypeArr$values = $values();
        $VALUES = itemStockOptionTypeArr$values;
        $ENTRIES = n.w(itemStockOptionTypeArr$values);
    }

    private ItemStockOptionType(String str, int i11) {
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static ItemStockOptionType valueOf(String str) {
        return (ItemStockOptionType) Enum.valueOf(ItemStockOptionType.class, str);
    }

    public static ItemStockOptionType[] values() {
        return (ItemStockOptionType[]) $VALUES.clone();
    }
}
