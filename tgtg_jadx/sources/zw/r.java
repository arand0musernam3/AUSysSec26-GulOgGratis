package zw;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class r {
    private static final /* synthetic */ r[] $VALUES;
    public static final r Document;
    public static final r RenderOptions;

    static {
        r rVar = new r("Document", 0);
        Document = rVar;
        r rVar2 = new r("RenderOptions", 1);
        RenderOptions = rVar2;
        $VALUES = new r[]{rVar, rVar2};
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) $VALUES.clone();
    }
}
