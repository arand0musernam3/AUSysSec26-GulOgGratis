package androidx.datastore.preferences.protobuf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class w0 {
    private static final /* synthetic */ w0[] $VALUES;
    public static final w0 EDITIONS;
    public static final w0 PROTO2;
    public static final w0 PROTO3;

    static {
        w0 w0Var = new w0("PROTO2", 0);
        PROTO2 = w0Var;
        w0 w0Var2 = new w0("PROTO3", 1);
        PROTO3 = w0Var2;
        w0 w0Var3 = new w0("EDITIONS", 2);
        EDITIONS = w0Var3;
        $VALUES = new w0[]{w0Var, w0Var2, w0Var3};
    }

    public static w0 valueOf(String str) {
        return (w0) Enum.valueOf(w0.class, str);
    }

    public static w0[] values() {
        return (w0[]) $VALUES.clone();
    }
}
