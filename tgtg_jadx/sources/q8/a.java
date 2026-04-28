package q8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    private static final /* synthetic */ a[] $VALUES;
    public static final a DETECT_FRAGMENT_REUSE;
    public static final a DETECT_FRAGMENT_TAG_USAGE;
    public static final a DETECT_RETAIN_INSTANCE_USAGE;
    public static final a DETECT_SET_USER_VISIBLE_HINT;
    public static final a DETECT_TARGET_FRAGMENT_USAGE;
    public static final a DETECT_WRONG_FRAGMENT_CONTAINER;
    public static final a DETECT_WRONG_NESTED_HIERARCHY;
    public static final a PENALTY_DEATH;
    public static final a PENALTY_LOG;

    static {
        a aVar = new a("PENALTY_LOG", 0);
        PENALTY_LOG = aVar;
        a aVar2 = new a("PENALTY_DEATH", 1);
        PENALTY_DEATH = aVar2;
        a aVar3 = new a("DETECT_FRAGMENT_REUSE", 2);
        DETECT_FRAGMENT_REUSE = aVar3;
        a aVar4 = new a("DETECT_FRAGMENT_TAG_USAGE", 3);
        DETECT_FRAGMENT_TAG_USAGE = aVar4;
        a aVar5 = new a("DETECT_WRONG_NESTED_HIERARCHY", 4);
        DETECT_WRONG_NESTED_HIERARCHY = aVar5;
        a aVar6 = new a("DETECT_RETAIN_INSTANCE_USAGE", 5);
        DETECT_RETAIN_INSTANCE_USAGE = aVar6;
        a aVar7 = new a("DETECT_SET_USER_VISIBLE_HINT", 6);
        DETECT_SET_USER_VISIBLE_HINT = aVar7;
        a aVar8 = new a("DETECT_TARGET_FRAGMENT_USAGE", 7);
        DETECT_TARGET_FRAGMENT_USAGE = aVar8;
        a aVar9 = new a("DETECT_WRONG_FRAGMENT_CONTAINER", 8);
        DETECT_WRONG_FRAGMENT_CONTAINER = aVar9;
        $VALUES = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
