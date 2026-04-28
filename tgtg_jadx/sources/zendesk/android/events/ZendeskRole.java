package zendesk.android.events;

import a80.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import v0.n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lzendesk/android/events/ZendeskRole;", "", "<init>", "(Ljava/lang/String;I)V", "USER", "BUSINESS", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ZendeskRole {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ZendeskRole[] $VALUES;
    public static final ZendeskRole USER = new ZendeskRole("USER", 0);
    public static final ZendeskRole BUSINESS = new ZendeskRole("BUSINESS", 1);

    private static final /* synthetic */ ZendeskRole[] $values() {
        return new ZendeskRole[]{USER, BUSINESS};
    }

    static {
        ZendeskRole[] zendeskRoleArr$values = $values();
        $VALUES = zendeskRoleArr$values;
        $ENTRIES = n.w(zendeskRoleArr$values);
    }

    private ZendeskRole(String str, int i11) {
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static ZendeskRole valueOf(String str) {
        return (ZendeskRole) Enum.valueOf(ZendeskRole.class, str);
    }

    public static ZendeskRole[] values() {
        return (ZendeskRole[]) $VALUES.clone();
    }
}
