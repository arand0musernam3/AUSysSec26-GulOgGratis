package zw;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f {
    private static final /* synthetic */ f[] $VALUES;
    public static final f CHILD;
    public static final f DESCENDANT;
    public static final f FOLLOWS;

    static {
        f fVar = new f("DESCENDANT", 0);
        DESCENDANT = fVar;
        f fVar2 = new f("CHILD", 1);
        CHILD = fVar2;
        f fVar3 = new f("FOLLOWS", 2);
        FOLLOWS = fVar3;
        $VALUES = new f[]{fVar, fVar2, fVar3};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }
}
