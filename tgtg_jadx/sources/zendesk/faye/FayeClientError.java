package zendesk.faye;

import a80.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import v0.n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lzendesk/faye/FayeClientError;", "", "<init>", "(Ljava/lang/String;I)V", "CLIENT_TRANSPORT_ERROR", "CLIENT_NOT_CONNECTED_ERROR", "CLIENT_SUBSCRIBE_FAILED_ERROR", "zendesk.faye_faye"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FayeClientError {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ FayeClientError[] $VALUES;
    public static final FayeClientError CLIENT_TRANSPORT_ERROR = new FayeClientError("CLIENT_TRANSPORT_ERROR", 0);
    public static final FayeClientError CLIENT_NOT_CONNECTED_ERROR = new FayeClientError("CLIENT_NOT_CONNECTED_ERROR", 1);
    public static final FayeClientError CLIENT_SUBSCRIBE_FAILED_ERROR = new FayeClientError("CLIENT_SUBSCRIBE_FAILED_ERROR", 2);

    private static final /* synthetic */ FayeClientError[] $values() {
        return new FayeClientError[]{CLIENT_TRANSPORT_ERROR, CLIENT_NOT_CONNECTED_ERROR, CLIENT_SUBSCRIBE_FAILED_ERROR};
    }

    static {
        FayeClientError[] fayeClientErrorArr$values = $values();
        $VALUES = fayeClientErrorArr$values;
        $ENTRIES = n.w(fayeClientErrorArr$values);
    }

    private FayeClientError(String str, int i11) {
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static FayeClientError valueOf(String str) {
        return (FayeClientError) Enum.valueOf(FayeClientError.class, str);
    }

    public static FayeClientError[] values() {
        return (FayeClientError[]) $VALUES.clone();
    }
}
