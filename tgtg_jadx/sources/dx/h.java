package dx;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public enum h {
    OPTIONS("data_processing_options"),
    COUNTRY("data_processing_options_country"),
    STATE("data_processing_options_state");


    @NotNull
    public static final g Companion = new g();

    @NotNull
    private final String rawValue;

    h(String str) {
        this.rawValue = str;
    }

    public final String a() {
        return this.rawValue;
    }
}
