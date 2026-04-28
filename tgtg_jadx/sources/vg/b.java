package vg;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b ADD;
    public static final b ADD_STATIONS;
    public static final b APPLY;
    public static final b CLOSE;
    public static final b CONFIRM;
    public static final b SAVE;

    static {
        b bVar = new b("CLOSE", 0);
        CLOSE = bVar;
        b bVar2 = new b("ADD", 1);
        ADD = bVar2;
        b bVar3 = new b("ADD_STATIONS", 2);
        ADD_STATIONS = bVar3;
        b bVar4 = new b("SAVE", 3);
        SAVE = bVar4;
        b bVar5 = new b("APPLY", 4);
        APPLY = bVar5;
        b bVar6 = new b("CONFIRM", 5);
        CONFIRM = bVar6;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6};
        $VALUES = bVarArr;
        $ENTRIES = new a80.b(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
