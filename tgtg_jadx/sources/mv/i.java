package mv;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class i {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ i[] $VALUES;
    public static final i CAROUSEL;
    public static final i SINGLE_ITEM;

    @NotNull
    private final String variant;

    static {
        i iVar = new i("CAROUSEL", 0, "carousel_shown_always");
        CAROUSEL = iVar;
        i iVar2 = new i("SINGLE_ITEM", 1, "single_item_until_mov_reached");
        SINGLE_ITEM = iVar2;
        i[] iVarArr = {iVar, iVar2};
        $VALUES = iVarArr;
        $ENTRIES = new a80.b(iVarArr);
    }

    public i(String str, int i11, String str2) {
        this.variant = str2;
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) $VALUES.clone();
    }

    public final String a() {
        return this.variant;
    }
}
