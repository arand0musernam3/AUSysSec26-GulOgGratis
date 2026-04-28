package dy;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public enum d {
    AUTOMATIC("automatic", 0),
    DISPLAY_ALWAYS("display_always", 1),
    NEVER_DISPLAY("never_display", 2);


    @NotNull
    public static final c Companion;

    @NotNull
    private static final d DEFAULT;
    private final int intValue;

    @NotNull
    private final String stringValue;

    static {
        d dVar = AUTOMATIC;
        Companion = new c();
        DEFAULT = dVar;
    }

    d(String str, int i11) {
        this.stringValue = str;
        this.intValue = i11;
    }

    public final int c() {
        return this.intValue;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.stringValue;
    }
}
