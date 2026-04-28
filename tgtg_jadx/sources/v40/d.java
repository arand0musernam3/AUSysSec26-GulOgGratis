package v40;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d {
    private static final /* synthetic */ d[] $VALUES;
    public static final d ATTEMPT_MIGRATION;
    public static final d NOT_GENERATED;
    public static final d REGISTERED;
    public static final d REGISTER_ERROR;
    public static final d UNREGISTERED;

    static {
        d dVar = new d("ATTEMPT_MIGRATION", 0);
        ATTEMPT_MIGRATION = dVar;
        d dVar2 = new d("NOT_GENERATED", 1);
        NOT_GENERATED = dVar2;
        d dVar3 = new d("UNREGISTERED", 2);
        UNREGISTERED = dVar3;
        d dVar4 = new d("REGISTERED", 3);
        REGISTERED = dVar4;
        d dVar5 = new d("REGISTER_ERROR", 4);
        REGISTER_ERROR = dVar5;
        $VALUES = new d[]{dVar, dVar2, dVar3, dVar4, dVar5};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }
}
