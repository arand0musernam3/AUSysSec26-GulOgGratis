package zendesk.android.internal.proactivemessaging;

import a80.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import v0.n;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00062\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lzendesk/android/internal/proactivemessaging/EvaluationLanguageMapper;", "", "<init>", "()V", "DeviceLanguage", "CampaignLanguage", "Companion", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class EvaluationLanguageMapper {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lzendesk/android/internal/proactivemessaging/EvaluationLanguageMapper$CampaignLanguage;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "SIMPLIFIED_CHINESE", "TRADITIONAL_CHINESE", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CampaignLanguage {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ CampaignLanguage[] $VALUES;
        public static final CampaignLanguage SIMPLIFIED_CHINESE = new CampaignLanguage("SIMPLIFIED_CHINESE", 0, "zh-cn");
        public static final CampaignLanguage TRADITIONAL_CHINESE = new CampaignLanguage("TRADITIONAL_CHINESE", 1, "zh-tw");

        @NotNull
        private final String value;

        private static final /* synthetic */ CampaignLanguage[] $values() {
            return new CampaignLanguage[]{SIMPLIFIED_CHINESE, TRADITIONAL_CHINESE};
        }

        static {
            CampaignLanguage[] campaignLanguageArr$values = $values();
            $VALUES = campaignLanguageArr$values;
            $ENTRIES = n.w(campaignLanguageArr$values);
        }

        private CampaignLanguage(String str, int i11, String str2) {
            this.value = str2;
        }

        @NotNull
        public static a getEntries() {
            return $ENTRIES;
        }

        public static CampaignLanguage valueOf(String str) {
            return (CampaignLanguage) Enum.valueOf(CampaignLanguage.class, str);
        }

        public static CampaignLanguage[] values() {
            return (CampaignLanguage[]) $VALUES.clone();
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lzendesk/android/internal/proactivemessaging/EvaluationLanguageMapper$DeviceLanguage;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "SIMPLIFIED_CHINESE", "TRADITIONAL_CHINESE", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DeviceLanguage {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ DeviceLanguage[] $VALUES;
        public static final DeviceLanguage SIMPLIFIED_CHINESE = new DeviceLanguage("SIMPLIFIED_CHINESE", 0, "zh-Hans");
        public static final DeviceLanguage TRADITIONAL_CHINESE = new DeviceLanguage("TRADITIONAL_CHINESE", 1, "zh-Hant");

        @NotNull
        private final String value;

        private static final /* synthetic */ DeviceLanguage[] $values() {
            return new DeviceLanguage[]{SIMPLIFIED_CHINESE, TRADITIONAL_CHINESE};
        }

        static {
            DeviceLanguage[] deviceLanguageArr$values = $values();
            $VALUES = deviceLanguageArr$values;
            $ENTRIES = n.w(deviceLanguageArr$values);
        }

        private DeviceLanguage(String str, int i11, String str2) {
            this.value = str2;
        }

        @NotNull
        public static a getEntries() {
            return $ENTRIES;
        }

        public static DeviceLanguage valueOf(String str) {
            return (DeviceLanguage) Enum.valueOf(DeviceLanguage.class, str);
        }

        public static DeviceLanguage[] values() {
            return (DeviceLanguage[]) $VALUES.clone();
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0004\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"Lzendesk/android/internal/proactivemessaging/EvaluationLanguageMapper$Companion;", "", "<init>", "()V", "mapLanguage", "", "campaignLanguage", "mapLanguage$zendesk_zendesk_android", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String mapLanguage$zendesk_zendesk_android(@NotNull String str, @NotNull String str2) {
            str.getClass();
            str2.getClass();
            CampaignLanguage campaignLanguage = CampaignLanguage.SIMPLIFIED_CHINESE;
            if (Intrinsics.areEqual(str2, campaignLanguage.getValue())) {
                return StringsKt.z(str, DeviceLanguage.SIMPLIFIED_CHINESE.getValue(), false) ? campaignLanguage.getValue() : str;
            }
            CampaignLanguage campaignLanguage2 = CampaignLanguage.TRADITIONAL_CHINESE;
            return (Intrinsics.areEqual(str2, campaignLanguage2.getValue()) && StringsKt.z(str, DeviceLanguage.TRADITIONAL_CHINESE.getValue(), false)) ? campaignLanguage2.getValue() : str;
        }

        private Companion() {
        }
    }
}
