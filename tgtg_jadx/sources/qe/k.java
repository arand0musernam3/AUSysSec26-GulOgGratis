package qe;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k {
    private static final /* synthetic */ k[] $VALUES;
    public static final k ADD;
    public static final k EXCLUDE_INTERSECTIONS;
    public static final k INTERSECT;
    public static final k MERGE;
    public static final k SUBTRACT;

    static {
        k kVar = new k("MERGE", 0);
        MERGE = kVar;
        k kVar2 = new k("ADD", 1);
        ADD = kVar2;
        k kVar3 = new k("SUBTRACT", 2);
        SUBTRACT = kVar3;
        k kVar4 = new k("INTERSECT", 3);
        INTERSECT = kVar4;
        k kVar5 = new k("EXCLUDE_INTERSECTIONS", 4);
        EXCLUDE_INTERSECTIONS = kVar5;
        $VALUES = new k[]{kVar, kVar2, kVar3, kVar4, kVar5};
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) $VALUES.clone();
    }
}
