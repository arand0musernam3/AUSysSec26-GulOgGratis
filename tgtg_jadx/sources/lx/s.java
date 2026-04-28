package lx;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public enum s {
    NONE("none"),
    V1("Android-GPBL-V1"),
    V2_V4("Android-GPBL-V2-V4"),
    V5_V7("Android-GPBL-V5-V7");


    @NotNull
    private final String type;

    s(String str) {
        this.type = str;
    }

    public final String a() {
        return this.type;
    }
}
