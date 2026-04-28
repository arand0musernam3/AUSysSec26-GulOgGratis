package k6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class l {
    private static final /* synthetic */ l[] $VALUES;
    public static final l ALIGN_HORIZONTALLY;
    public static final l ALIGN_VERTICALLY;
    public static final l BARRIER;
    public static final l COLUMN;
    public static final l FLOW;
    public static final l GRID;
    public static final l HORIZONTAL_CHAIN;
    public static final l HORIZONTAL_FLOW;
    public static final l LAYER;
    public static final l ROW;
    public static final l VERTICAL_CHAIN;
    public static final l VERTICAL_FLOW;

    static {
        l lVar = new l("HORIZONTAL_CHAIN", 0);
        HORIZONTAL_CHAIN = lVar;
        l lVar2 = new l("VERTICAL_CHAIN", 1);
        VERTICAL_CHAIN = lVar2;
        l lVar3 = new l("ALIGN_HORIZONTALLY", 2);
        ALIGN_HORIZONTALLY = lVar3;
        l lVar4 = new l("ALIGN_VERTICALLY", 3);
        ALIGN_VERTICALLY = lVar4;
        l lVar5 = new l("BARRIER", 4);
        BARRIER = lVar5;
        l lVar6 = new l("LAYER", 5);
        LAYER = lVar6;
        l lVar7 = new l("HORIZONTAL_FLOW", 6);
        HORIZONTAL_FLOW = lVar7;
        l lVar8 = new l("VERTICAL_FLOW", 7);
        VERTICAL_FLOW = lVar8;
        l lVar9 = new l("GRID", 8);
        GRID = lVar9;
        l lVar10 = new l("ROW", 9);
        ROW = lVar10;
        l lVar11 = new l("COLUMN", 10);
        COLUMN = lVar11;
        l lVar12 = new l("FLOW", 11);
        FLOW = lVar12;
        $VALUES = new l[]{lVar, lVar2, lVar3, lVar4, lVar5, lVar6, lVar7, lVar8, lVar9, lVar10, lVar11, lVar12};
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) $VALUES.clone();
    }
}
