package l1;

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
    public static final b EMBEDDED;
    public static final b EXTERNAL;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final int f26754id;

    static {
        b bVar = new b("EXTERNAL", 0, 0);
        EXTERNAL = bVar;
        b bVar2 = new b("EMBEDDED", 1, 1);
        EMBEDDED = bVar2;
        b[] bVarArr = {bVar, bVar2};
        $VALUES = bVarArr;
        $ENTRIES = new a80.b(bVarArr);
        Companion = new a();
    }

    public b(String str, int i11, int i12) {
        this.f26754id = i12;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
