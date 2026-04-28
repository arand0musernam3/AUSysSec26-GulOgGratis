package androidx.constraintlayout.widget;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    private static final /* synthetic */ a[] $VALUES;
    public static final a BOOLEAN_TYPE;
    public static final a COLOR_DRAWABLE_TYPE;
    public static final a COLOR_TYPE;
    public static final a DIMENSION_TYPE;
    public static final a FLOAT_TYPE;
    public static final a INT_TYPE;
    public static final a REFERENCE_TYPE;
    public static final a STRING_TYPE;

    static {
        a aVar = new a("INT_TYPE", 0);
        INT_TYPE = aVar;
        a aVar2 = new a("FLOAT_TYPE", 1);
        FLOAT_TYPE = aVar2;
        a aVar3 = new a("COLOR_TYPE", 2);
        COLOR_TYPE = aVar3;
        a aVar4 = new a("COLOR_DRAWABLE_TYPE", 3);
        COLOR_DRAWABLE_TYPE = aVar4;
        a aVar5 = new a("STRING_TYPE", 4);
        STRING_TYPE = aVar5;
        a aVar6 = new a("BOOLEAN_TYPE", 5);
        BOOLEAN_TYPE = aVar6;
        a aVar7 = new a("DIMENSION_TYPE", 6);
        DIMENSION_TYPE = aVar7;
        a aVar8 = new a("REFERENCE_TYPE", 7);
        REFERENCE_TYPE = aVar8;
        $VALUES = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
