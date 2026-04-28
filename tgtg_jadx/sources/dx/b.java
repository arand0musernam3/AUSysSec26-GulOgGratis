package dx;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b {
    private static final /* synthetic */ b[] $VALUES;
    public static final b CUSTOM;

    @NotNull
    public static final a Companion;
    public static final b MOBILE_APP_INSTALL;
    public static final b OTHER;

    static {
        b bVar = new b("MOBILE_APP_INSTALL", 0);
        MOBILE_APP_INSTALL = bVar;
        b bVar2 = new b("CUSTOM", 1);
        CUSTOM = bVar2;
        b bVar3 = new b("OTHER", 2);
        OTHER = bVar3;
        $VALUES = new b[]{bVar, bVar2, bVar3};
        Companion = new a();
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
