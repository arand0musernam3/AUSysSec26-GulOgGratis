package zendesk.messaging.android.internal.analytics;

import a80.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import v0.n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lzendesk/messaging/android/internal/analytics/ExtensionsLaunchType;", "", "analyticsValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getAnalyticsValue", "()Ljava/lang/String;", "CLICK", "AUTOMATICAL", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ExtensionsLaunchType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ExtensionsLaunchType[] $VALUES;

    @NotNull
    private final String analyticsValue;
    public static final ExtensionsLaunchType CLICK = new ExtensionsLaunchType("CLICK", 0, "click");
    public static final ExtensionsLaunchType AUTOMATICAL = new ExtensionsLaunchType("AUTOMATICAL", 1, "automatical");

    private static final /* synthetic */ ExtensionsLaunchType[] $values() {
        return new ExtensionsLaunchType[]{CLICK, AUTOMATICAL};
    }

    static {
        ExtensionsLaunchType[] extensionsLaunchTypeArr$values = $values();
        $VALUES = extensionsLaunchTypeArr$values;
        $ENTRIES = n.w(extensionsLaunchTypeArr$values);
    }

    private ExtensionsLaunchType(String str, int i11, String str2) {
        this.analyticsValue = str2;
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static ExtensionsLaunchType valueOf(String str) {
        return (ExtensionsLaunchType) Enum.valueOf(ExtensionsLaunchType.class, str);
    }

    public static ExtensionsLaunchType[] values() {
        return (ExtensionsLaunchType[]) $VALUES.clone();
    }

    @NotNull
    public final String getAnalyticsValue() {
        return this.analyticsValue;
    }
}
