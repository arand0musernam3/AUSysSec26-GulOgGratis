package j30;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b {
    private static final /* synthetic */ b[] $VALUES;
    public static final b DONE;
    public static final b FAILED;
    public static final b NOT_READY;
    public static final b READY;

    static {
        b bVar = new b("READY", 0);
        READY = bVar;
        b bVar2 = new b("NOT_READY", 1);
        NOT_READY = bVar2;
        b bVar3 = new b("DONE", 2);
        DONE = bVar3;
        b bVar4 = new b("FAILED", 3);
        FAILED = bVar4;
        $VALUES = new b[]{bVar, bVar2, bVar3, bVar4};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
