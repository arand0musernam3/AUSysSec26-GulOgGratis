package zendesk.core.android.internal;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lzendesk/core/android/internal/DateKtxConstants;", "", "<init>", "()V", "TIME_24_FORMAT_PATTERN", "", "TIME_12_FORMAT_PATTERN", "DAY_MONTH_PATTERN", "FULL_MONTH_DAY_PATTERN", "MONTH_DAY_YEAR_PATTERN", "FULL_MONTH_DAY_YEAR_PATTERN", "ISO_8601_UTC_PATTERN", "UTC_TIMEZONE", "zendesk.core_core-utilities"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class DateKtxConstants {

    @NotNull
    public static final String DAY_MONTH_PATTERN = "MMM dd";

    @NotNull
    public static final String FULL_MONTH_DAY_PATTERN = "MMMM dd";

    @NotNull
    public static final String FULL_MONTH_DAY_YEAR_PATTERN = "MMMM dd, yyyy";

    @NotNull
    public static final DateKtxConstants INSTANCE = new DateKtxConstants();

    @NotNull
    public static final String ISO_8601_UTC_PATTERN = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";

    @NotNull
    public static final String MONTH_DAY_YEAR_PATTERN = "MMM dd, yyyy";

    @NotNull
    public static final String TIME_12_FORMAT_PATTERN = "h:mm a";

    @NotNull
    public static final String TIME_24_FORMAT_PATTERN = "H:mm";

    @NotNull
    public static final String UTC_TIMEZONE = "UTC";

    private DateKtxConstants() {
    }
}
