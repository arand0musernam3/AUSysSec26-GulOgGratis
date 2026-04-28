package ti;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class i {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ i[] $VALUES;
    public static final i DIVERGENCE;
    public static final i INITIAL;
    public static final i NONE;
    public static final i SAVE;

    @NotNull
    private final String trackingName;

    static {
        i iVar = new i("INITIAL", 0, "Manage_Custom_Days_Closed");
        INITIAL = iVar;
        i iVar2 = new i("DIVERGENCE", 1, "Available_Custom_Days_Closed");
        DIVERGENCE = iVar2;
        i iVar3 = new i("SAVE", 2, "Save_Custom_Days_Closed");
        SAVE = iVar3;
        i iVar4 = new i("NONE", 3, "");
        NONE = iVar4;
        i[] iVarArr = {iVar, iVar2, iVar3, iVar4};
        $VALUES = iVarArr;
        $ENTRIES = new a80.b(iVarArr);
    }

    public i(String str, int i11, String str2) {
        this.trackingName = str2;
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) $VALUES.clone();
    }

    public final String a() {
        return this.trackingName;
    }
}
