package w0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f {
    private static final /* synthetic */ f[] $VALUES;
    public static final f IDLE;
    public static final f QUEUED;
    public static final f QUEUING;
    public static final f RUNNING;

    static {
        f fVar = new f("IDLE", 0);
        IDLE = fVar;
        f fVar2 = new f("QUEUING", 1);
        QUEUING = fVar2;
        f fVar3 = new f("QUEUED", 2);
        QUEUED = fVar3;
        f fVar4 = new f("RUNNING", 3);
        RUNNING = fVar4;
        $VALUES = new f[]{fVar, fVar2, fVar3, fVar4};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }
}
