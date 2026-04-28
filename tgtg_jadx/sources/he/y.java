package he;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class y {
    private static final /* synthetic */ y[] $VALUES;
    public static final y NONE;
    public static final y PLAY;
    public static final y RESUME;

    static {
        y yVar = new y("NONE", 0);
        NONE = yVar;
        y yVar2 = new y("PLAY", 1);
        PLAY = yVar2;
        y yVar3 = new y("RESUME", 2);
        RESUME = yVar3;
        $VALUES = new y[]{yVar, yVar2, yVar3};
    }

    public static y valueOf(String str) {
        return (y) Enum.valueOf(y.class, str);
    }

    public static y[] values() {
        return (y[]) $VALUES.clone();
    }
}
