package ly;

import a80.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a OPTIMAL;
    public static final a STABLE;
    public static final a UNIQUE;

    static {
        a aVar = new a("STABLE", 0);
        STABLE = aVar;
        a aVar2 = new a("OPTIMAL", 1);
        OPTIMAL = aVar2;
        a aVar3 = new a("UNIQUE", 2);
        UNIQUE = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
        $VALUES = aVarArr;
        $ENTRIES = new b(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
