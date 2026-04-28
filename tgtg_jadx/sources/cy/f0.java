package cy;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public enum f0 {
    FACEBOOK("facebook"),
    INSTAGRAM("instagram");


    @NotNull
    public static final e0 Companion = new e0();

    @NotNull
    private final String targetApp;

    f0(String str) {
        this.targetApp = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.targetApp;
    }
}
