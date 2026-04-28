package kf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a DEBUG;
    public static final a ERROR;
    public static final a INFO;
    public static final a OFF;
    public static final a WARN;

    static {
        a aVar = new a("DEBUG", 0);
        DEBUG = aVar;
        a aVar2 = new a("INFO", 1);
        INFO = aVar2;
        a aVar3 = new a("WARN", 2);
        WARN = aVar3;
        a aVar4 = new a("ERROR", 3);
        ERROR = aVar4;
        a aVar5 = new a("OFF", 4);
        OFF = aVar5;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5};
        $VALUES = aVarArr;
        $ENTRIES = new a80.b(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
