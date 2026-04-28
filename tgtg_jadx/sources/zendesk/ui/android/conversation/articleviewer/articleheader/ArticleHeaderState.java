package zendesk.ui.android.conversation.articleviewer.articleheader;

import e0.f;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import v0.n;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u001c\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001&BC\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0014\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\u0015J\u000e\u0010\u0016\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\u0017J\u000e\u0010\u0018\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\u0019J\u000e\u0010\u001a\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\u001bJ\u000e\u0010\u001c\u001a\u00020\bHÀ\u0003¢\u0006\u0002\b\u001dJ\u000e\u0010\u001e\u001a\u00020\bHÀ\u0003¢\u0006\u0002\b\u001fJE\u0010 \u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\u0013\u0010!\u001a\u00020\b2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u0003HÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0014\u0010\u0005\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0014\u0010\u0006\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0014\u0010\u0007\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\t\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012¨\u0006'"}, d2 = {"Lzendesk/ui/android/conversation/articleviewer/articleheader/ArticleHeaderState;", "", "backgroundColor", "", "buttonBackgroundColor", "iconColor", "focusedBorderColor", "showShareButton", "", "showBackButton", "<init>", "(IIIIZZ)V", "getBackgroundColor$zendesk_ui_ui_android", "()I", "getButtonBackgroundColor$zendesk_ui_ui_android", "getIconColor$zendesk_ui_ui_android", "getFocusedBorderColor$zendesk_ui_ui_android", "getShowShareButton$zendesk_ui_ui_android", "()Z", "getShowBackButton$zendesk_ui_ui_android", "component1", "component1$zendesk_ui_ui_android", "component2", "component2$zendesk_ui_ui_android", "component3", "component3$zendesk_ui_ui_android", "component4", "component4$zendesk_ui_ui_android", "component5", "component5$zendesk_ui_ui_android", "component6", "component6$zendesk_ui_ui_android", "copy", "equals", "other", "hashCode", "toString", "", "ButtonName", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ArticleHeaderState {
    public static final int $stable = 0;
    private final int backgroundColor;
    private final int buttonBackgroundColor;
    private final int focusedBorderColor;
    private final int iconColor;
    private final boolean showBackButton;
    private final boolean showShareButton;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lzendesk/ui/android/conversation/articleviewer/articleheader/ArticleHeaderState$ButtonName;", "", "<init>", "(Ljava/lang/String;I)V", "BACK", "SHARE", "CLOSE", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ButtonName {
        private static final /* synthetic */ a80.a $ENTRIES;
        private static final /* synthetic */ ButtonName[] $VALUES;
        public static final ButtonName BACK = new ButtonName("BACK", 0);
        public static final ButtonName SHARE = new ButtonName("SHARE", 1);
        public static final ButtonName CLOSE = new ButtonName("CLOSE", 2);

        private static final /* synthetic */ ButtonName[] $values() {
            return new ButtonName[]{BACK, SHARE, CLOSE};
        }

        static {
            ButtonName[] buttonNameArr$values = $values();
            $VALUES = buttonNameArr$values;
            $ENTRIES = n.w(buttonNameArr$values);
        }

        private ButtonName(String str, int i11) {
        }

        @NotNull
        public static a80.a getEntries() {
            return $ENTRIES;
        }

        public static ButtonName valueOf(String str) {
            return (ButtonName) Enum.valueOf(ButtonName.class, str);
        }

        public static ButtonName[] values() {
            return (ButtonName[]) $VALUES.clone();
        }
    }

    public /* synthetic */ ArticleHeaderState(int i11, int i12, int i13, int i14, boolean z11, boolean z12, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this((i15 & 1) != 0 ? 0 : i11, (i15 & 2) != 0 ? 0 : i12, (i15 & 4) != 0 ? 0 : i13, (i15 & 8) != 0 ? 0 : i14, (i15 & 16) != 0 ? false : z11, (i15 & 32) != 0 ? false : z12);
    }

    public static /* synthetic */ ArticleHeaderState copy$default(ArticleHeaderState articleHeaderState, int i11, int i12, int i13, int i14, boolean z11, boolean z12, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i11 = articleHeaderState.backgroundColor;
        }
        if ((i15 & 2) != 0) {
            i12 = articleHeaderState.buttonBackgroundColor;
        }
        if ((i15 & 4) != 0) {
            i13 = articleHeaderState.iconColor;
        }
        if ((i15 & 8) != 0) {
            i14 = articleHeaderState.focusedBorderColor;
        }
        if ((i15 & 16) != 0) {
            z11 = articleHeaderState.showShareButton;
        }
        if ((i15 & 32) != 0) {
            z12 = articleHeaderState.showBackButton;
        }
        boolean z13 = z11;
        boolean z14 = z12;
        return articleHeaderState.copy(i11, i12, i13, i14, z13, z14);
    }

    /* JADX INFO: renamed from: component1$zendesk_ui_ui_android, reason: from getter */
    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    /* JADX INFO: renamed from: component2$zendesk_ui_ui_android, reason: from getter */
    public final int getButtonBackgroundColor() {
        return this.buttonBackgroundColor;
    }

    /* JADX INFO: renamed from: component3$zendesk_ui_ui_android, reason: from getter */
    public final int getIconColor() {
        return this.iconColor;
    }

    /* JADX INFO: renamed from: component4$zendesk_ui_ui_android, reason: from getter */
    public final int getFocusedBorderColor() {
        return this.focusedBorderColor;
    }

    /* JADX INFO: renamed from: component5$zendesk_ui_ui_android, reason: from getter */
    public final boolean getShowShareButton() {
        return this.showShareButton;
    }

    /* JADX INFO: renamed from: component6$zendesk_ui_ui_android, reason: from getter */
    public final boolean getShowBackButton() {
        return this.showBackButton;
    }

    @NotNull
    public final ArticleHeaderState copy(int backgroundColor, int buttonBackgroundColor, int iconColor, int focusedBorderColor, boolean showShareButton, boolean showBackButton) {
        return new ArticleHeaderState(backgroundColor, buttonBackgroundColor, iconColor, focusedBorderColor, showShareButton, showBackButton);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ArticleHeaderState)) {
            return false;
        }
        ArticleHeaderState articleHeaderState = (ArticleHeaderState) other;
        return this.backgroundColor == articleHeaderState.backgroundColor && this.buttonBackgroundColor == articleHeaderState.buttonBackgroundColor && this.iconColor == articleHeaderState.iconColor && this.focusedBorderColor == articleHeaderState.focusedBorderColor && this.showShareButton == articleHeaderState.showShareButton && this.showBackButton == articleHeaderState.showBackButton;
    }

    public final int getBackgroundColor$zendesk_ui_ui_android() {
        return this.backgroundColor;
    }

    public final int getButtonBackgroundColor$zendesk_ui_ui_android() {
        return this.buttonBackgroundColor;
    }

    public final int getFocusedBorderColor$zendesk_ui_ui_android() {
        return this.focusedBorderColor;
    }

    public final int getIconColor$zendesk_ui_ui_android() {
        return this.iconColor;
    }

    public final boolean getShowBackButton$zendesk_ui_ui_android() {
        return this.showBackButton;
    }

    public final boolean getShowShareButton$zendesk_ui_ui_android() {
        return this.showShareButton;
    }

    public int hashCode() {
        return Boolean.hashCode(this.showBackButton) + k.e(k.b(this.focusedBorderColor, k.b(this.iconColor, k.b(this.buttonBackgroundColor, Integer.hashCode(this.backgroundColor) * 31, 31), 31), 31), 31, this.showShareButton);
    }

    @NotNull
    public String toString() {
        int i11 = this.backgroundColor;
        int i12 = this.buttonBackgroundColor;
        int i13 = this.iconColor;
        int i14 = this.focusedBorderColor;
        boolean z11 = this.showShareButton;
        boolean z12 = this.showBackButton;
        StringBuilder sbR = k.r(i11, i12, "ArticleHeaderState(backgroundColor=", ", buttonBackgroundColor=", ", iconColor=");
        f.C(sbR, i13, ", focusedBorderColor=", i14, ", showShareButton=");
        sbR.append(z11);
        sbR.append(", showBackButton=");
        sbR.append(z12);
        sbR.append(")");
        return sbR.toString();
    }

    public ArticleHeaderState(int i11, int i12, int i13, int i14, boolean z11, boolean z12) {
        this.backgroundColor = i11;
        this.buttonBackgroundColor = i12;
        this.iconColor = i13;
        this.focusedBorderColor = i14;
        this.showShareButton = z11;
        this.showBackButton = z12;
    }

    public ArticleHeaderState() {
        this(0, 0, 0, 0, false, false, 63, null);
    }
}
