package s0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class u {
    private static final /* synthetic */ u[] $VALUES;
    public static final u INACTIVE;
    public static final u LOCKED_FOCUSED;
    public static final u LOCKED_NOT_FOCUSED;
    public static final u PASSIVE_FOCUSED;
    public static final u PASSIVE_NOT_FOCUSED;
    public static final u SCANNING;
    public static final u UNKNOWN;

    static {
        u uVar = new u("UNKNOWN", 0);
        UNKNOWN = uVar;
        u uVar2 = new u("INACTIVE", 1);
        INACTIVE = uVar2;
        u uVar3 = new u("SCANNING", 2);
        SCANNING = uVar3;
        u uVar4 = new u("PASSIVE_FOCUSED", 3);
        PASSIVE_FOCUSED = uVar4;
        u uVar5 = new u("PASSIVE_NOT_FOCUSED", 4);
        PASSIVE_NOT_FOCUSED = uVar5;
        u uVar6 = new u("LOCKED_FOCUSED", 5);
        LOCKED_FOCUSED = uVar6;
        u uVar7 = new u("LOCKED_NOT_FOCUSED", 6);
        LOCKED_NOT_FOCUSED = uVar7;
        $VALUES = new u[]{uVar, uVar2, uVar3, uVar4, uVar5, uVar6, uVar7};
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) $VALUES.clone();
    }
}
