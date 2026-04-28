package w4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class z {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ z[] $VALUES;
    public static final z Dispatching;
    public static final z NotDispatching;
    public static final z Unknown;

    static {
        z zVar = new z("Unknown", 0);
        Unknown = zVar;
        z zVar2 = new z("Dispatching", 1);
        Dispatching = zVar2;
        z zVar3 = new z("NotDispatching", 2);
        NotDispatching = zVar3;
        z[] zVarArr = {zVar, zVar2, zVar3};
        $VALUES = zVarArr;
        $ENTRIES = new a80.b(zVarArr);
    }

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    public static z[] values() {
        return (z[]) $VALUES.clone();
    }
}
