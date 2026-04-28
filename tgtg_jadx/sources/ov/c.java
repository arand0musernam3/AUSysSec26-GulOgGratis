package ov;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c BASE_ITEM;
    public static final c ITEM_EXTRA_1;
    public static final c ITEM_EXTRA_2;
    public static final c ITEM_EXTRA_3;
    public static final c ITEM_EXTRA_4;
    public static final c ITEM_EXTRA_5;
    public static final c LOADING_ITEM;

    static {
        c cVar = new c("BASE_ITEM", 0);
        BASE_ITEM = cVar;
        c cVar2 = new c("ITEM_EXTRA_1", 1);
        ITEM_EXTRA_1 = cVar2;
        c cVar3 = new c("ITEM_EXTRA_2", 2);
        ITEM_EXTRA_2 = cVar3;
        c cVar4 = new c("ITEM_EXTRA_3", 3);
        ITEM_EXTRA_3 = cVar4;
        c cVar5 = new c("ITEM_EXTRA_4", 4);
        ITEM_EXTRA_4 = cVar5;
        c cVar6 = new c("ITEM_EXTRA_5", 5);
        ITEM_EXTRA_5 = cVar6;
        c cVar7 = new c("LOADING_ITEM", 6);
        LOADING_ITEM = cVar7;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7};
        $VALUES = cVarArr;
        $ENTRIES = new a80.b(cVarArr);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }
}
