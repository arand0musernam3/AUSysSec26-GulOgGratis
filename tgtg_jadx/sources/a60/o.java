package a60;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class o {
    private static final /* synthetic */ o[] $VALUES;
    public static final o BEGIN_ARRAY;
    public static final o BEGIN_OBJECT;
    public static final o BOOLEAN;
    public static final o END_ARRAY;
    public static final o END_DOCUMENT;
    public static final o END_OBJECT;
    public static final o NAME;
    public static final o NULL;
    public static final o NUMBER;
    public static final o STRING;

    static {
        o oVar = new o("BEGIN_ARRAY", 0);
        BEGIN_ARRAY = oVar;
        o oVar2 = new o("END_ARRAY", 1);
        END_ARRAY = oVar2;
        o oVar3 = new o("BEGIN_OBJECT", 2);
        BEGIN_OBJECT = oVar3;
        o oVar4 = new o("END_OBJECT", 3);
        END_OBJECT = oVar4;
        o oVar5 = new o("NAME", 4);
        NAME = oVar5;
        o oVar6 = new o("STRING", 5);
        STRING = oVar6;
        o oVar7 = new o("NUMBER", 6);
        NUMBER = oVar7;
        o oVar8 = new o("BOOLEAN", 7);
        BOOLEAN = oVar8;
        o oVar9 = new o("NULL", 8);
        NULL = oVar9;
        o oVar10 = new o("END_DOCUMENT", 9);
        END_DOCUMENT = oVar10;
        $VALUES = new o[]{oVar, oVar2, oVar3, oVar4, oVar5, oVar6, oVar7, oVar8, oVar9, oVar10};
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) $VALUES.clone();
    }
}
