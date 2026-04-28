package qe;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class y {
    private static final /* synthetic */ y[] $VALUES;
    public static final y INDIVIDUALLY;
    public static final y SIMULTANEOUSLY;

    static {
        y yVar = new y("SIMULTANEOUSLY", 0);
        SIMULTANEOUSLY = yVar;
        y yVar2 = new y("INDIVIDUALLY", 1);
        INDIVIDUALLY = yVar2;
        $VALUES = new y[]{yVar, yVar2};
    }

    public static y valueOf(String str) {
        return (y) Enum.valueOf(y.class, str);
    }

    public static y[] values() {
        return (y[]) $VALUES.clone();
    }
}
