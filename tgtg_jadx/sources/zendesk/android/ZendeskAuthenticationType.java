package zendesk.android;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import v0.n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lzendesk/android/ZendeskAuthenticationType;", "", "<init>", "(Ljava/lang/String;I)V", "SessionToken", "Jwt", "Unauthenticated", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ZendeskAuthenticationType {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ ZendeskAuthenticationType[] $VALUES;
    public static final ZendeskAuthenticationType SessionToken = new ZendeskAuthenticationType("SessionToken", 0);
    public static final ZendeskAuthenticationType Jwt = new ZendeskAuthenticationType("Jwt", 1);
    public static final ZendeskAuthenticationType Unauthenticated = new ZendeskAuthenticationType("Unauthenticated", 2);

    private static final /* synthetic */ ZendeskAuthenticationType[] $values() {
        return new ZendeskAuthenticationType[]{SessionToken, Jwt, Unauthenticated};
    }

    static {
        ZendeskAuthenticationType[] zendeskAuthenticationTypeArr$values = $values();
        $VALUES = zendeskAuthenticationTypeArr$values;
        $ENTRIES = n.w(zendeskAuthenticationTypeArr$values);
    }

    private ZendeskAuthenticationType(String str, int i11) {
    }

    @NotNull
    public static a80.a getEntries() {
        return $ENTRIES;
    }

    public static ZendeskAuthenticationType valueOf(String str) {
        return (ZendeskAuthenticationType) Enum.valueOf(ZendeskAuthenticationType.class, str);
    }

    public static ZendeskAuthenticationType[] values() {
        return (ZendeskAuthenticationType[]) $VALUES.clone();
    }
}
