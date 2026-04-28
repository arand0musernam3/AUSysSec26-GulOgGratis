package d90;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class h {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;
    public static final h ALREADY_SELECTED;
    public static final h CANCELLED;
    public static final h REREGISTER;
    public static final h SUCCESSFUL;

    static {
        h hVar = new h("SUCCESSFUL", 0);
        SUCCESSFUL = hVar;
        h hVar2 = new h("REREGISTER", 1);
        REREGISTER = hVar2;
        h hVar3 = new h("CANCELLED", 2);
        CANCELLED = hVar3;
        h hVar4 = new h("ALREADY_SELECTED", 3);
        ALREADY_SELECTED = hVar4;
        h[] hVarArr = {hVar, hVar2, hVar3, hVar4};
        $VALUES = hVarArr;
        $ENTRIES = new a80.b(hVarArr);
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }
}
