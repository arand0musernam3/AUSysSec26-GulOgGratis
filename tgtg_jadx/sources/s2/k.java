package s2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ k[] $VALUES;
    public static final k Attached;
    public static final k Detached;
    public static final k Uninitialized;

    static {
        k kVar = new k("Uninitialized", 0);
        Uninitialized = kVar;
        k kVar2 = new k("Detached", 1);
        Detached = kVar2;
        k kVar3 = new k("Attached", 2);
        Attached = kVar3;
        k[] kVarArr = {kVar, kVar2, kVar3};
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
