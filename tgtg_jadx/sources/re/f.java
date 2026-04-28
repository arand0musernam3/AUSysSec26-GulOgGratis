package re;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f {
    private static final /* synthetic */ f[] $VALUES;
    public static final f IMAGE;
    public static final f NULL;
    public static final f PRE_COMP;
    public static final f SHAPE;
    public static final f SOLID;
    public static final f TEXT;
    public static final f UNKNOWN;

    static {
        f fVar = new f("PRE_COMP", 0);
        PRE_COMP = fVar;
        f fVar2 = new f("SOLID", 1);
        SOLID = fVar2;
        f fVar3 = new f("IMAGE", 2);
        IMAGE = fVar3;
        f fVar4 = new f("NULL", 3);
        NULL = fVar4;
        f fVar5 = new f("SHAPE", 4);
        SHAPE = fVar5;
        f fVar6 = new f("TEXT", 5);
        TEXT = fVar6;
        f fVar7 = new f("UNKNOWN", 6);
        UNKNOWN = fVar7;
        $VALUES = new f[]{fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }
}
