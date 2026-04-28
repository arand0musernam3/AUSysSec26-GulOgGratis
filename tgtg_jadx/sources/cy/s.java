package cy;

import com.adyen.checkout.components.core.internal.util.StatusResponseUtils;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public enum s {
    SUCCESS("success"),
    CANCEL("cancel"),
    ERROR(StatusResponseUtils.RESULT_ERROR);


    @NotNull
    private final String loggingValue;

    s(String str) {
        this.loggingValue = str;
    }

    public final String a() {
        return this.loggingValue;
    }
}
