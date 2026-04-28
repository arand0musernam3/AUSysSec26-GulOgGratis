package k6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k {
    private static final /* synthetic */ k[] $VALUES;
    public static final k BOTTOM;
    public static final k END;
    public static final k LEFT;
    public static final k RIGHT;
    public static final k START;
    public static final k TOP;

    static {
        k kVar = new k("LEFT", 0);
        LEFT = kVar;
        k kVar2 = new k("RIGHT", 1);
        RIGHT = kVar2;
        k kVar3 = new k("START", 2);
        START = kVar3;
        k kVar4 = new k("END", 3);
        END = kVar4;
        k kVar5 = new k("TOP", 4);
        TOP = kVar5;
        k kVar6 = new k("BOTTOM", 5);
        BOTTOM = kVar6;
        $VALUES = new k[]{kVar, kVar2, kVar3, kVar4, kVar5, kVar6};
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) $VALUES.clone();
    }
}
