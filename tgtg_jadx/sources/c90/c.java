package c90;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class c {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c BLOCKING;
    public static final c CPU_ACQUIRED;
    public static final c DORMANT;
    public static final c PARKING;
    public static final c TERMINATED;

    static {
        c cVar = new c("CPU_ACQUIRED", 0);
        CPU_ACQUIRED = cVar;
        c cVar2 = new c("BLOCKING", 1);
        BLOCKING = cVar2;
        c cVar3 = new c("PARKING", 2);
        PARKING = cVar3;
        c cVar4 = new c("DORMANT", 3);
        DORMANT = cVar4;
        c cVar5 = new c("TERMINATED", 4);
        TERMINATED = cVar5;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5};
        $VALUES = cVarArr;
        $ENTRIES = new a80.b(cVarArr);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }
}
