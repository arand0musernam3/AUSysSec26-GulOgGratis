package vg;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d DRAGGING_MAP;
    public static final d NONE;
    public static final d PRE_FILLED_ADDRESS;
    public static final d SELECTED_ADDRESS;

    static {
        d dVar = new d("NONE", 0);
        NONE = dVar;
        d dVar2 = new d("PRE_FILLED_ADDRESS", 1);
        PRE_FILLED_ADDRESS = dVar2;
        d dVar3 = new d("SELECTED_ADDRESS", 2);
        SELECTED_ADDRESS = dVar3;
        d dVar4 = new d("DRAGGING_MAP", 3);
        DRAGGING_MAP = dVar4;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4};
        $VALUES = dVarArr;
        $ENTRIES = new a80.b(dVarArr);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }
}
