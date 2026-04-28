package nr;

import a80.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a DELIVERY;
    public static final a HOME;
    public static final a OTHER;
    public static final a UNKNOWN;
    public static final a WORK;

    static {
        a aVar = new a("HOME", 0);
        HOME = aVar;
        a aVar2 = new a("WORK", 1);
        WORK = aVar2;
        a aVar3 = new a("OTHER", 2);
        OTHER = aVar3;
        a aVar4 = new a("DELIVERY", 3);
        DELIVERY = aVar4;
        a aVar5 = new a("UNKNOWN", 4);
        UNKNOWN = aVar5;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5};
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
