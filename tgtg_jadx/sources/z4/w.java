package z4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class w {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ w[] $VALUES;
    public static final w Height;
    public static final w Width;

    static {
        w wVar = new w("Width", 0);
        Width = wVar;
        w wVar2 = new w("Height", 1);
        Height = wVar2;
        w[] wVarArr = {wVar, wVar2};
        $VALUES = wVarArr;
        $ENTRIES = new a80.b(wVarArr);
    }

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) $VALUES.clone();
    }
}
