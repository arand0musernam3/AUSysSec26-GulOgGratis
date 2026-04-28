package or;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@i90.h(with = h.class)
public final class e {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;

    @NotNull
    public static final d Companion;
    public static final e EMAIL_MISSING;
    public static final e EMAIL_VERIFIED;
    public static final e UNKNOWN;
    public static final e VERIFY_CURRENT_EMAIL;
    public static final e VERIFY_EMAIL_CHANGE;

    static {
        e eVar = new e("VERIFY_EMAIL_CHANGE", 0);
        VERIFY_EMAIL_CHANGE = eVar;
        e eVar2 = new e("VERIFY_CURRENT_EMAIL", 1);
        VERIFY_CURRENT_EMAIL = eVar2;
        e eVar3 = new e("EMAIL_VERIFIED", 2);
        EMAIL_VERIFIED = eVar3;
        e eVar4 = new e("EMAIL_MISSING", 3);
        EMAIL_MISSING = eVar4;
        e eVar5 = new e("UNKNOWN", 4);
        UNKNOWN = eVar5;
        e[] eVarArr = {eVar, eVar2, eVar3, eVar4, eVar5};
        $VALUES = eVarArr;
        $ENTRIES = new a80.b(eVarArr);
        Companion = new d();
    }

    public static a80.a a() {
        return $ENTRIES;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }
}
