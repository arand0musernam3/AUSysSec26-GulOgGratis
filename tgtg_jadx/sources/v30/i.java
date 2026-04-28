package v30;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i {
    private static final /* synthetic */ i[] $VALUES;
    public static final i IDLE;
    public static final i QUEUED;
    public static final i QUEUING;
    public static final i RUNNING;

    static {
        i iVar = new i("IDLE", 0);
        IDLE = iVar;
        i iVar2 = new i("QUEUING", 1);
        QUEUING = iVar2;
        i iVar3 = new i("QUEUED", 2);
        QUEUED = iVar3;
        i iVar4 = new i("RUNNING", 3);
        RUNNING = iVar4;
        $VALUES = new i[]{iVar, iVar2, iVar3, iVar4};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) $VALUES.clone();
    }
}
