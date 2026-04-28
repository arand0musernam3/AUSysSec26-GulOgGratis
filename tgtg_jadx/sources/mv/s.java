package mv;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class s {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ s[] $VALUES;
    public static final s CONTROL1;
    public static final s TREATMENT1;
    public static final s TREATMENT2;

    @NotNull
    private final String variant;

    static {
        s sVar = new s("CONTROL1", 0, "control1");
        CONTROL1 = sVar;
        s sVar2 = new s("TREATMENT1", 1, "treatment1");
        TREATMENT1 = sVar2;
        s sVar3 = new s("TREATMENT2", 2, "treatment2");
        TREATMENT2 = sVar3;
        s[] sVarArr = {sVar, sVar2, sVar3};
        $VALUES = sVarArr;
        $ENTRIES = new a80.b(sVarArr);
    }

    public s(String str, int i11, String str2) {
        this.variant = str2;
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) $VALUES.clone();
    }

    public final String a() {
        return this.variant;
    }
}
