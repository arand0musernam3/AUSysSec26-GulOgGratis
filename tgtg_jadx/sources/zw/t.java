package zw;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class t {
    private static final /* synthetic */ t[] $VALUES;
    public static final t none;
    public static final t xMaxYMax;
    public static final t xMaxYMid;
    public static final t xMaxYMin;
    public static final t xMidYMax;
    public static final t xMidYMid;
    public static final t xMidYMin;
    public static final t xMinYMax;
    public static final t xMinYMid;
    public static final t xMinYMin;

    static {
        t tVar = new t("none", 0);
        none = tVar;
        t tVar2 = new t("xMinYMin", 1);
        xMinYMin = tVar2;
        t tVar3 = new t("xMidYMin", 2);
        xMidYMin = tVar3;
        t tVar4 = new t("xMaxYMin", 3);
        xMaxYMin = tVar4;
        t tVar5 = new t("xMinYMid", 4);
        xMinYMid = tVar5;
        t tVar6 = new t("xMidYMid", 5);
        xMidYMid = tVar6;
        t tVar7 = new t("xMaxYMid", 6);
        xMaxYMid = tVar7;
        t tVar8 = new t("xMinYMax", 7);
        xMinYMax = tVar8;
        t tVar9 = new t("xMidYMax", 8);
        xMidYMax = tVar9;
        t tVar10 = new t("xMaxYMax", 9);
        xMaxYMax = tVar10;
        $VALUES = new t[]{tVar, tVar2, tVar3, tVar4, tVar5, tVar6, tVar7, tVar8, tVar9, tVar10};
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) $VALUES.clone();
    }
}
