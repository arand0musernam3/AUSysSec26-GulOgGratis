package k6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j {
    private static final /* synthetic */ j[] $VALUES;
    public static final j BASELINE_TO_BASELINE;
    public static final j BASELINE_TO_BOTTOM;
    public static final j BASELINE_TO_TOP;
    public static final j BOTTOM_TO_BASELINE;
    public static final j BOTTOM_TO_BOTTOM;
    public static final j BOTTOM_TO_TOP;
    public static final j CENTER_HORIZONTALLY;
    public static final j CENTER_VERTICALLY;
    public static final j CIRCULAR_CONSTRAINT;
    public static final j END_TO_END;
    public static final j END_TO_START;
    public static final j LEFT_TO_LEFT;
    public static final j LEFT_TO_RIGHT;
    public static final j RIGHT_TO_LEFT;
    public static final j RIGHT_TO_RIGHT;
    public static final j START_TO_END;
    public static final j START_TO_START;
    public static final j TOP_TO_BASELINE;
    public static final j TOP_TO_BOTTOM;
    public static final j TOP_TO_TOP;

    static {
        j jVar = new j("LEFT_TO_LEFT", 0);
        LEFT_TO_LEFT = jVar;
        j jVar2 = new j("LEFT_TO_RIGHT", 1);
        LEFT_TO_RIGHT = jVar2;
        j jVar3 = new j("RIGHT_TO_LEFT", 2);
        RIGHT_TO_LEFT = jVar3;
        j jVar4 = new j("RIGHT_TO_RIGHT", 3);
        RIGHT_TO_RIGHT = jVar4;
        j jVar5 = new j("START_TO_START", 4);
        START_TO_START = jVar5;
        j jVar6 = new j("START_TO_END", 5);
        START_TO_END = jVar6;
        j jVar7 = new j("END_TO_START", 6);
        END_TO_START = jVar7;
        j jVar8 = new j("END_TO_END", 7);
        END_TO_END = jVar8;
        j jVar9 = new j("TOP_TO_TOP", 8);
        TOP_TO_TOP = jVar9;
        j jVar10 = new j("TOP_TO_BOTTOM", 9);
        TOP_TO_BOTTOM = jVar10;
        j jVar11 = new j("TOP_TO_BASELINE", 10);
        TOP_TO_BASELINE = jVar11;
        j jVar12 = new j("BOTTOM_TO_TOP", 11);
        BOTTOM_TO_TOP = jVar12;
        j jVar13 = new j("BOTTOM_TO_BOTTOM", 12);
        BOTTOM_TO_BOTTOM = jVar13;
        j jVar14 = new j("BOTTOM_TO_BASELINE", 13);
        BOTTOM_TO_BASELINE = jVar14;
        j jVar15 = new j("BASELINE_TO_BASELINE", 14);
        BASELINE_TO_BASELINE = jVar15;
        j jVar16 = new j("BASELINE_TO_TOP", 15);
        BASELINE_TO_TOP = jVar16;
        j jVar17 = new j("BASELINE_TO_BOTTOM", 16);
        BASELINE_TO_BOTTOM = jVar17;
        j jVar18 = new j("CENTER_HORIZONTALLY", 17);
        CENTER_HORIZONTALLY = jVar18;
        j jVar19 = new j("CENTER_VERTICALLY", 18);
        CENTER_VERTICALLY = jVar19;
        j jVar20 = new j("CIRCULAR_CONSTRAINT", 19);
        CIRCULAR_CONSTRAINT = jVar20;
        $VALUES = new j[]{jVar, jVar2, jVar3, jVar4, jVar5, jVar6, jVar7, jVar8, jVar9, jVar10, jVar11, jVar12, jVar13, jVar14, jVar15, jVar16, jVar17, jVar18, jVar19, jVar20};
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) $VALUES.clone();
    }
}
