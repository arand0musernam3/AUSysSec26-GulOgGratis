package or;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f ON_CREATE_ACTIVITY;
    public static final f USER_ACTION;

    static {
        f fVar = new f("ON_CREATE_ACTIVITY", 0);
        ON_CREATE_ACTIVITY = fVar;
        f fVar2 = new f("USER_ACTION", 1);
        USER_ACTION = fVar2;
        f[] fVarArr = {fVar, fVar2};
        $VALUES = fVarArr;
        $ENTRIES = new a80.b(fVarArr);
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }
}
