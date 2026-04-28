package px;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public enum c {
    MOBILE_APP_INSTALL("MOBILE_APP_INSTALL"),
    CUSTOM_APP_EVENTS("CUSTOM_APP_EVENTS");


    @NotNull
    private final String eventType;

    c(String str) {
        this.eventType = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.eventType;
    }
}
