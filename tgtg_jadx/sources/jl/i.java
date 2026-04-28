package jl;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class i {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ i[] $VALUES;
    public static final i MULTIPLE_CHOICE;

    @NotNull
    private final String value = "multiple_choice";

    static {
        i iVar = new i();
        MULTIPLE_CHOICE = iVar;
        i[] iVarArr = {iVar};
        $VALUES = iVarArr;
        $ENTRIES = new a80.b(iVarArr);
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) $VALUES.clone();
    }

    public final String a() {
        return this.value;
    }
}
