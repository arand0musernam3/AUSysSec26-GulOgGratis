package com.app.tgtg.model.remote.item.response;

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
@h(with = ItemStateSerializer.class)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/app/tgtg/model/remote/item/response/ItemState;", "", "<init>", "(Ljava/lang/String;I)V", "FEW_LEFT", "AVAILABLE", "SOLD_OUT", "SALES_ENDED", "INACTIVE_TODAY", "UNKNOWN", "Companion", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ItemState {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ ItemState[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final ItemState FEW_LEFT = new ItemState("FEW_LEFT", 0);
    public static final ItemState AVAILABLE = new ItemState("AVAILABLE", 1);
    public static final ItemState SOLD_OUT = new ItemState("SOLD_OUT", 2);
    public static final ItemState SALES_ENDED = new ItemState("SALES_ENDED", 3);
    public static final ItemState INACTIVE_TODAY = new ItemState("INACTIVE_TODAY", 4);
    public static final ItemState UNKNOWN = new ItemState("UNKNOWN", 5);

    private static final /* synthetic */ ItemState[] $values() {
        return new ItemState[]{FEW_LEFT, AVAILABLE, SOLD_OUT, SALES_ENDED, INACTIVE_TODAY, UNKNOWN};
    }

    static {
        ItemState[] itemStateArr$values = $values();
        $VALUES = itemStateArr$values;
        $ENTRIES = n.w(itemStateArr$values);
        INSTANCE = new Companion(null);
    }

    private ItemState(String str, int i11) {
    }

    @NotNull
    public static a80.a getEntries() {
        return $ENTRIES;
    }

    public static ItemState valueOf(String str) {
        return (ItemState) Enum.valueOf(ItemState.class, str);
    }

    public static ItemState[] values() {
        return (ItemState[]) $VALUES.clone();
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/item/response/ItemState$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/item/response/ItemState;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return ItemStateSerializer.INSTANCE;
        }

        private Companion() {
        }
    }
}
