package q6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class z {
    private static final /* synthetic */ z[] $VALUES;
    public static final z FINISHED;
    public static final z MOVING;
    public static final z SETUP;
    public static final z UNDEFINED;

    static {
        z zVar = new z("UNDEFINED", 0);
        UNDEFINED = zVar;
        z zVar2 = new z("SETUP", 1);
        SETUP = zVar2;
        z zVar3 = new z("MOVING", 2);
        MOVING = zVar3;
        z zVar4 = new z("FINISHED", 3);
        FINISHED = zVar4;
        $VALUES = new z[]{zVar, zVar2, zVar3, zVar4};
    }

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    public static z[] values() {
        return (z[]) $VALUES.clone();
    }
}
