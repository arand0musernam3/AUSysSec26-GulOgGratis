package m9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e ARRAY;
    public static final e BOOL;
    public static final e BOOL_ARRAY;
    public static final e BOOL_NULLABLE;
    public static final e DOUBLE;
    public static final e DOUBLE_ARRAY;
    public static final e DOUBLE_NULLABLE;
    public static final e ENUM;
    public static final e ENUM_NULLABLE;
    public static final e FLOAT;
    public static final e FLOAT_ARRAY;
    public static final e FLOAT_NULLABLE;
    public static final e INT;
    public static final e INT_ARRAY;
    public static final e INT_NULLABLE;
    public static final e LIST;
    public static final e LONG;
    public static final e LONG_ARRAY;
    public static final e LONG_NULLABLE;
    public static final e STRING;
    public static final e STRING_NULLABLE;
    public static final e UNKNOWN;

    static {
        e eVar = new e("INT", 0);
        INT = eVar;
        e eVar2 = new e("INT_NULLABLE", 1);
        INT_NULLABLE = eVar2;
        e eVar3 = new e("BOOL", 2);
        BOOL = eVar3;
        e eVar4 = new e("BOOL_NULLABLE", 3);
        BOOL_NULLABLE = eVar4;
        e eVar5 = new e("DOUBLE", 4);
        DOUBLE = eVar5;
        e eVar6 = new e("DOUBLE_NULLABLE", 5);
        DOUBLE_NULLABLE = eVar6;
        e eVar7 = new e("FLOAT", 6);
        FLOAT = eVar7;
        e eVar8 = new e("FLOAT_NULLABLE", 7);
        FLOAT_NULLABLE = eVar8;
        e eVar9 = new e("LONG", 8);
        LONG = eVar9;
        e eVar10 = new e("LONG_NULLABLE", 9);
        LONG_NULLABLE = eVar10;
        e eVar11 = new e("STRING", 10);
        STRING = eVar11;
        e eVar12 = new e("STRING_NULLABLE", 11);
        STRING_NULLABLE = eVar12;
        e eVar13 = new e("INT_ARRAY", 12);
        INT_ARRAY = eVar13;
        e eVar14 = new e("BOOL_ARRAY", 13);
        BOOL_ARRAY = eVar14;
        e eVar15 = new e("DOUBLE_ARRAY", 14);
        DOUBLE_ARRAY = eVar15;
        e eVar16 = new e("FLOAT_ARRAY", 15);
        FLOAT_ARRAY = eVar16;
        e eVar17 = new e("LONG_ARRAY", 16);
        LONG_ARRAY = eVar17;
        e eVar18 = new e("ARRAY", 17);
        ARRAY = eVar18;
        e eVar19 = new e("LIST", 18);
        LIST = eVar19;
        e eVar20 = new e("ENUM", 19);
        ENUM = eVar20;
        e eVar21 = new e("ENUM_NULLABLE", 20);
        ENUM_NULLABLE = eVar21;
        e eVar22 = new e("UNKNOWN", 21);
        UNKNOWN = eVar22;
        e[] eVarArr = {eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7, eVar8, eVar9, eVar10, eVar11, eVar12, eVar13, eVar14, eVar15, eVar16, eVar17, eVar18, eVar19, eVar20, eVar21, eVar22};
        $VALUES = eVarArr;
        $ENTRIES = new a80.b(eVarArr);
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }
}
