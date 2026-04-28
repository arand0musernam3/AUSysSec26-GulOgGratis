package td;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b DISABLED;
    public static final b ENABLED;
    public static final b READ_ONLY;
    public static final b WRITE_ONLY;
    private final boolean readEnabled;
    private final boolean writeEnabled;

    static {
        b bVar = new b("ENABLED", 0, true, true);
        ENABLED = bVar;
        b bVar2 = new b("READ_ONLY", 1, true, false);
        READ_ONLY = bVar2;
        b bVar3 = new b("WRITE_ONLY", 2, false, true);
        WRITE_ONLY = bVar3;
        b bVar4 = new b("DISABLED", 3, false, false);
        DISABLED = bVar4;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4};
        $VALUES = bVarArr;
        $ENTRIES = new a80.b(bVarArr);
    }

    public b(String str, int i11, boolean z11, boolean z12) {
        this.readEnabled = z11;
        this.writeEnabled = z12;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }

    public final boolean a() {
        return this.readEnabled;
    }

    public final boolean c() {
        return this.writeEnabled;
    }
}
