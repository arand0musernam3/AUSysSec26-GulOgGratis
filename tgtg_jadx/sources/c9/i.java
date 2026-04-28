package c9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i {
    private static final /* synthetic */ i[] $VALUES;
    public static final i FINISHED;
    public static final i PENDING;
    public static final i RUNNING;

    static {
        i iVar = new i("PENDING", 0);
        PENDING = iVar;
        i iVar2 = new i("RUNNING", 1);
        RUNNING = iVar2;
        i iVar3 = new i("FINISHED", 2);
        FINISHED = iVar3;
        $VALUES = new i[]{iVar, iVar2, iVar3};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) $VALUES.clone();
    }
}
