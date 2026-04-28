package g4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b Cancelled;
    public static final b None;
    public static final b RedirectCancelled;
    public static final b Redirected;

    static {
        b bVar = new b("None", 0);
        None = bVar;
        b bVar2 = new b("Cancelled", 1);
        Cancelled = bVar2;
        b bVar3 = new b("Redirected", 2);
        Redirected = bVar3;
        b bVar4 = new b("RedirectCancelled", 3);
        RedirectCancelled = bVar4;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4};
        $VALUES = bVarArr;
        $ENTRIES = new a80.b(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
