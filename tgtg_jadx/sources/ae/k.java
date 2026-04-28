package ae;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ k[] $VALUES;
    public static final k Debug;
    public static final k Error;
    public static final k Info;
    public static final k Verbose;
    public static final k Warn;

    static {
        k kVar = new k("Verbose", 0);
        Verbose = kVar;
        k kVar2 = new k("Debug", 1);
        Debug = kVar2;
        k kVar3 = new k("Info", 2);
        Info = kVar3;
        k kVar4 = new k("Warn", 3);
        Warn = kVar4;
        k kVar5 = new k("Error", 4);
        Error = kVar5;
        k[] kVarArr = {kVar, kVar2, kVar3, kVar4, kVar5};
        $VALUES = kVarArr;
        $ENTRIES = new a80.b(kVarArr);
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) $VALUES.clone();
    }
}
