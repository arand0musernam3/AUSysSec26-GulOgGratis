package zendesk.ui.android.common.buttonbanner;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import v0.n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lzendesk/ui/android/common/buttonbanner/ButtonBannerViewType;", "", "<init>", "(Ljava/lang/String;I)V", "NEW_MESSAGES", "SEE_LATEST", "FAILED_BANNER", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ButtonBannerViewType {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ ButtonBannerViewType[] $VALUES;
    public static final ButtonBannerViewType NEW_MESSAGES = new ButtonBannerViewType("NEW_MESSAGES", 0);
    public static final ButtonBannerViewType SEE_LATEST = new ButtonBannerViewType("SEE_LATEST", 1);
    public static final ButtonBannerViewType FAILED_BANNER = new ButtonBannerViewType("FAILED_BANNER", 2);

    private static final /* synthetic */ ButtonBannerViewType[] $values() {
        return new ButtonBannerViewType[]{NEW_MESSAGES, SEE_LATEST, FAILED_BANNER};
    }

    static {
        ButtonBannerViewType[] buttonBannerViewTypeArr$values = $values();
        $VALUES = buttonBannerViewTypeArr$values;
        $ENTRIES = n.w(buttonBannerViewTypeArr$values);
    }

    private ButtonBannerViewType(String str, int i11) {
    }

    @NotNull
    public static a80.a getEntries() {
        return $ENTRIES;
    }

    public static ButtonBannerViewType valueOf(String str) {
        return (ButtonBannerViewType) Enum.valueOf(ButtonBannerViewType.class, str);
    }

    public static ButtonBannerViewType[] values() {
        return (ButtonBannerViewType[]) $VALUES.clone();
    }
}
