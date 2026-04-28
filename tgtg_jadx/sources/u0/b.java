package u0;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;

    @NotNull
    public static final a Companion;
    public static final b OFF;
    public static final b ON;
    public static final b PREVIEW;
    public static final b UNSPECIFIED;

    static {
        b bVar = new b("UNSPECIFIED", 0);
        UNSPECIFIED = bVar;
        b bVar2 = new b("OFF", 1);
        OFF = bVar2;
        b bVar3 = new b("ON", 2);
        ON = bVar3;
        b bVar4 = new b("PREVIEW", 3);
        PREVIEW = bVar4;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4};
        $VALUES = bVarArr;
        $ENTRIES = new a80.b(bVarArr);
        Companion = new a();
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
