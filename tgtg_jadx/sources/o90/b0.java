package o90;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class b0 {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ b0[] $VALUES;
    public static final b0 LIST;
    public static final b0 MAP;
    public static final b0 OBJ;
    public static final b0 POLY_OBJ;
    public final char begin;
    public final char end;

    static {
        b0 b0Var = new b0("OBJ", 0, '{', '}');
        OBJ = b0Var;
        b0 b0Var2 = new b0("LIST", 1, '[', ']');
        LIST = b0Var2;
        b0 b0Var3 = new b0("MAP", 2, '{', '}');
        MAP = b0Var3;
        b0 b0Var4 = new b0("POLY_OBJ", 3, '[', ']');
        POLY_OBJ = b0Var4;
        b0[] b0VarArr = {b0Var, b0Var2, b0Var3, b0Var4};
        $VALUES = b0VarArr;
        $ENTRIES = new a80.b(b0VarArr);
    }

    public b0(String str, int i11, char c3, char c7) {
        this.begin = c3;
        this.end = c7;
    }

    public static a80.a a() {
        return $ENTRIES;
    }

    public static b0 valueOf(String str) {
        return (b0) Enum.valueOf(b0.class, str);
    }

    public static b0[] values() {
        return (b0[]) $VALUES.clone();
    }
}
