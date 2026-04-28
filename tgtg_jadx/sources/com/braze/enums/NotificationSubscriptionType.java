package com.braze.enums;

import com.braze.models.IPutIntoJson;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.collections.w0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import v0.n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0003:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\f\u001a\u00020\u0002H\u0016R\u0011\u0010\u0004\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\u000e"}, d2 = {"Lcom/braze/enums/NotificationSubscriptionType;", "Lcom/braze/models/IPutIntoJson;", "", "", "key", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getKey", "()Ljava/lang/String;", "OPTED_IN", "SUBSCRIBED", "UNSUBSCRIBED", "forJsonPut", "Companion", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NotificationSubscriptionType implements IPutIntoJson<String> {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ NotificationSubscriptionType[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final NotificationSubscriptionType OPTED_IN = new NotificationSubscriptionType("OPTED_IN", 0, "opted_in");
    public static final NotificationSubscriptionType SUBSCRIBED = new NotificationSubscriptionType("SUBSCRIBED", 1, "subscribed");
    public static final NotificationSubscriptionType UNSUBSCRIBED = new NotificationSubscriptionType("UNSUBSCRIBED", 2, "unsubscribed");
    private static final Map<String, NotificationSubscriptionType> map;
    private final String key;

    private static final /* synthetic */ NotificationSubscriptionType[] $values() {
        return new NotificationSubscriptionType[]{OPTED_IN, SUBSCRIBED, UNSUBSCRIBED};
    }

    static {
        NotificationSubscriptionType[] notificationSubscriptionTypeArr$values = $values();
        $VALUES = notificationSubscriptionTypeArr$values;
        $ENTRIES = n.w(notificationSubscriptionTypeArr$values);
        INSTANCE = new Companion(null);
        a80.a entries = getEntries();
        int iA = w0.a(e0.o(entries, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA < 16 ? 16 : iA);
        for (Object obj : entries) {
            linkedHashMap.put(((NotificationSubscriptionType) obj).key, obj);
        }
        map = linkedHashMap;
    }

    private NotificationSubscriptionType(String str, int i11, String str2) {
        this.key = str2;
    }

    public static final NotificationSubscriptionType fromValue(String str) {
        return INSTANCE.fromValue(str);
    }

    public static a80.a getEntries() {
        return $ENTRIES;
    }

    public static NotificationSubscriptionType valueOf(String str) {
        return (NotificationSubscriptionType) Enum.valueOf(NotificationSubscriptionType.class, str);
    }

    public static NotificationSubscriptionType[] values() {
        return (NotificationSubscriptionType[]) $VALUES.clone();
    }

    public final String getKey() {
        return this.key;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0007R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/braze/enums/NotificationSubscriptionType$Companion;", "", "<init>", "()V", "map", "", "", "Lcom/braze/enums/NotificationSubscriptionType;", "fromValue", "value", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final NotificationSubscriptionType fromValue(String value) {
            String lowerCase;
            Map map = NotificationSubscriptionType.map;
            if (value != null) {
                Locale locale = Locale.US;
                locale.getClass();
                lowerCase = value.toLowerCase(locale);
                lowerCase.getClass();
            } else {
                lowerCase = null;
            }
            if (lowerCase == null) {
                lowerCase = "";
            }
            Object obj = map.get(lowerCase);
            return (NotificationSubscriptionType) (obj != null ? obj : null);
        }

        private Companion() {
        }
    }

    @Override // com.braze.models.IPutIntoJson
    /* JADX INFO: renamed from: forJsonPut, reason: avoid collision after fix types in other method and from getter */
    public String getKey() {
        return this.key;
    }
}
