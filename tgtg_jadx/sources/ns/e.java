package ns;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e CLAIMED;
    public static final e EXPIRED;
    public static final e REDEEMED;
    public static final e RESERVED;

    static {
        e eVar = new e("RESERVED", 0);
        RESERVED = eVar;
        e eVar2 = new e("CLAIMED", 1);
        CLAIMED = eVar2;
        e eVar3 = new e("REDEEMED", 2);
        REDEEMED = eVar3;
        e eVar4 = new e("EXPIRED", 3);
        EXPIRED = eVar4;
        e[] eVarArr = {eVar, eVar2, eVar3, eVar4};
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
