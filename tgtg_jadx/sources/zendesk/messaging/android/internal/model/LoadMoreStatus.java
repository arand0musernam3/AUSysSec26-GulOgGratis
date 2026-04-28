package zendesk.messaging.android.internal.model;

import a80.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import v0.n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lzendesk/messaging/android/internal/model/LoadMoreStatus;", "", "<init>", "(Ljava/lang/String;I)V", "LOADING", "FAILED", "NONE", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LoadMoreStatus {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ LoadMoreStatus[] $VALUES;
    public static final LoadMoreStatus LOADING = new LoadMoreStatus("LOADING", 0);
    public static final LoadMoreStatus FAILED = new LoadMoreStatus("FAILED", 1);
    public static final LoadMoreStatus NONE = new LoadMoreStatus("NONE", 2);

    private static final /* synthetic */ LoadMoreStatus[] $values() {
        return new LoadMoreStatus[]{LOADING, FAILED, NONE};
    }

    static {
        LoadMoreStatus[] loadMoreStatusArr$values = $values();
        $VALUES = loadMoreStatusArr$values;
        $ENTRIES = n.w(loadMoreStatusArr$values);
    }

    private LoadMoreStatus(String str, int i11) {
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static LoadMoreStatus valueOf(String str) {
        return (LoadMoreStatus) Enum.valueOf(LoadMoreStatus.class, str);
    }

    public static LoadMoreStatus[] values() {
        return (LoadMoreStatus[]) $VALUES.clone();
    }
}
