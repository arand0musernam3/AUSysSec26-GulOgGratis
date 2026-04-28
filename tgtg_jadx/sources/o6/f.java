package o6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f {
    private static final /* synthetic */ f[] $VALUES;
    public static final f BASELINE;
    public static final f BOTTOM;
    public static final f HORIZONTAL_DIMENSION;
    public static final f LEFT;
    public static final f RIGHT;
    public static final f TOP;
    public static final f UNKNOWN;
    public static final f VERTICAL_DIMENSION;

    static {
        f fVar = new f("UNKNOWN", 0);
        UNKNOWN = fVar;
        f fVar2 = new f("HORIZONTAL_DIMENSION", 1);
        HORIZONTAL_DIMENSION = fVar2;
        f fVar3 = new f("VERTICAL_DIMENSION", 2);
        VERTICAL_DIMENSION = fVar3;
        f fVar4 = new f("LEFT", 3);
        LEFT = fVar4;
        f fVar5 = new f("RIGHT", 4);
        RIGHT = fVar5;
        f fVar6 = new f("TOP", 5);
        TOP = fVar6;
        f fVar7 = new f("BOTTOM", 6);
        BOTTOM = fVar7;
        f fVar8 = new f("BASELINE", 7);
        BASELINE = fVar8;
        $VALUES = new f[]{fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }
}
