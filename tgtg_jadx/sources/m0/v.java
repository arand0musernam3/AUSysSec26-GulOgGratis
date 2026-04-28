package m0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class v {
    private static final /* synthetic */ v[] $VALUES;
    public static final v INITIALIZED;
    public static final v INITIALIZING;
    public static final v INITIALIZING_ERROR;
    public static final v SHUTDOWN;
    public static final v UNINITIALIZED;

    static {
        v vVar = new v("UNINITIALIZED", 0);
        UNINITIALIZED = vVar;
        v vVar2 = new v("INITIALIZING", 1);
        INITIALIZING = vVar2;
        v vVar3 = new v("INITIALIZING_ERROR", 2);
        INITIALIZING_ERROR = vVar3;
        v vVar4 = new v("INITIALIZED", 3);
        INITIALIZED = vVar4;
        v vVar5 = new v("SHUTDOWN", 4);
        SHUTDOWN = vVar5;
        $VALUES = new v[]{vVar, vVar2, vVar3, vVar4, vVar5};
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) $VALUES.clone();
    }
}
