package c50;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements o40.f {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ n[] $VALUES;
    public static final n EVENT_TYPE_UNKNOWN;
    public static final n SESSION_START;
    private final int number;

    static {
        n nVar = new n("EVENT_TYPE_UNKNOWN", 0, 0);
        EVENT_TYPE_UNKNOWN = nVar;
        n nVar2 = new n("SESSION_START", 1, 1);
        SESSION_START = nVar2;
        n[] nVarArr = {nVar, nVar2};
        $VALUES = nVarArr;
        $ENTRIES = new a80.b(nVarArr);
    }

    public n(String str, int i11, int i12) {
        this.number = i12;
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) $VALUES.clone();
    }

    @Override // o40.f
    public final int getNumber() {
        return this.number;
    }
}
