package jl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b GPS;
    public static final b HOME;
    public static final b NONE;
    public static final b OTHER;
    public static final b SELECTED;
    public static final b STATIONS;
    public static final b WORK;

    static {
        b bVar = new b("GPS", 0);
        GPS = bVar;
        b bVar2 = new b("HOME", 1);
        HOME = bVar2;
        b bVar3 = new b("WORK", 2);
        WORK = bVar3;
        b bVar4 = new b("OTHER", 3);
        OTHER = bVar4;
        b bVar5 = new b("STATIONS", 4);
        STATIONS = bVar5;
        b bVar6 = new b("SELECTED", 5);
        SELECTED = bVar6;
        b bVar7 = new b("NONE", 6);
        NONE = bVar7;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7};
        $VALUES = bVarArr;
        $ENTRIES = new a80.b(bVarArr);
    }

    public static a80.a a() {
        return $ENTRIES;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
