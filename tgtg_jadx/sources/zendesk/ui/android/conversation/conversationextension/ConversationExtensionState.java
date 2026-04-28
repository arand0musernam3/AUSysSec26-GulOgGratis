package zendesk.ui.android.conversation.conversationextension;

import com.braze.Constants;
import e0.f;
import j4.s;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.MessageBundle;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b1\b\u0087\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0003\u0010\b\u001a\u00020\u0005\u0012\b\b\u0003\u0010\t\u001a\u00020\u0005\u0012\b\b\u0003\u0010\n\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0003\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u000e\u0010&\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b'J\u000e\u0010(\u001a\u00020\u0005HÀ\u0003¢\u0006\u0002\b)J\u000e\u0010*\u001a\u00020\u0005HÀ\u0003¢\u0006\u0002\b+J\u000e\u0010,\u001a\u00020\u0005HÀ\u0003¢\u0006\u0002\b-J\u000e\u0010.\u001a\u00020\u0005HÀ\u0003¢\u0006\u0002\b/J\u000e\u00100\u001a\u00020\u0005HÀ\u0003¢\u0006\u0002\b1J\u000e\u00102\u001a\u00020\u0005HÀ\u0003¢\u0006\u0002\b3J\t\u00104\u001a\u00020\u0005HÆ\u0003J\t\u00105\u001a\u00020\u0005HÆ\u0003J\u000e\u00106\u001a\u00020\u000eHÀ\u0003¢\u0006\u0002\b7J\u000e\u00108\u001a\u00020\u000eHÀ\u0003¢\u0006\u0002\b9J\u000e\u0010:\u001a\u00020\u000eHÀ\u0003¢\u0006\u0002\b;J\u000e\u0010<\u001a\u00020\u0012HÀ\u0003¢\u0006\u0002\b=J\u008b\u0001\u0010>\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u00052\b\b\u0003\u0010\b\u001a\u00020\u00052\b\b\u0003\u0010\t\u001a\u00020\u00052\b\b\u0003\u0010\n\u001a\u00020\u00052\b\b\u0003\u0010\u000b\u001a\u00020\u00052\b\b\u0003\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0012HÆ\u0001J\u0013\u0010?\u001a\u00020\u00122\b\u0010@\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010A\u001a\u00020\u0005HÖ\u0001J\t\u0010B\u001a\u00020\u000eHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0006\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0014\u0010\b\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0014\u0010\t\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0014\u0010\n\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0014\u0010\r\u001a\u00020\u000eX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0014\u0010\u000f\u001a\u00020\u000eX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0014\u0010\u0010\u001a\u00020\u000eX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010!R\u0014\u0010\u0011\u001a\u00020\u0012X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%¨\u0006C"}, d2 = {"Lzendesk/ui/android/conversation/conversationextension/ConversationExtensionState;", "", "contentState", "Lzendesk/ui/android/conversation/conversationextension/ConversationExtensionLoadingState;", "iconColor", "", "backgroundColor", "buttonBackgroundColor", "textColor", "buttonColor", "indicatorColor", "navigationButtonBackgroundColor", "focusedStateBorderColor", MessageBundle.TITLE_ENTRY, "", Constants.BRAZE_WEBVIEW_URL_EXTRA, "userAgent", "showBackButton", "", "<init>", "(Lzendesk/ui/android/conversation/conversationextension/ConversationExtensionLoadingState;IIIIIIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getContentState$zendesk_ui_ui_android", "()Lzendesk/ui/android/conversation/conversationextension/ConversationExtensionLoadingState;", "getIconColor$zendesk_ui_ui_android", "()I", "getBackgroundColor$zendesk_ui_ui_android", "getButtonBackgroundColor$zendesk_ui_ui_android", "getTextColor$zendesk_ui_ui_android", "getButtonColor$zendesk_ui_ui_android", "getIndicatorColor$zendesk_ui_ui_android", "getNavigationButtonBackgroundColor", "getFocusedStateBorderColor", "getTitle$zendesk_ui_ui_android", "()Ljava/lang/String;", "getUrl$zendesk_ui_ui_android", "getUserAgent$zendesk_ui_ui_android", "getShowBackButton$zendesk_ui_ui_android", "()Z", "component1", "component1$zendesk_ui_ui_android", "component2", "component2$zendesk_ui_ui_android", "component3", "component3$zendesk_ui_ui_android", "component4", "component4$zendesk_ui_ui_android", "component5", "component5$zendesk_ui_ui_android", "component6", "component6$zendesk_ui_ui_android", "component7", "component7$zendesk_ui_ui_android", "component8", "component9", "component10", "component10$zendesk_ui_ui_android", "component11", "component11$zendesk_ui_ui_android", "component12", "component12$zendesk_ui_ui_android", "component13", "component13$zendesk_ui_ui_android", "copy", "equals", "other", "hashCode", "toString", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ConversationExtensionState {
    public static final int $stable = 0;
    private final int backgroundColor;
    private final int buttonBackgroundColor;
    private final int buttonColor;

    @NotNull
    private final ConversationExtensionLoadingState contentState;
    private final int focusedStateBorderColor;
    private final int iconColor;
    private final int indicatorColor;
    private final int navigationButtonBackgroundColor;
    private final boolean showBackButton;
    private final int textColor;

    @NotNull
    private final String title;

    @NotNull
    private final String url;

    @NotNull
    private final String userAgent;

    public /* synthetic */ ConversationExtensionState(ConversationExtensionLoadingState conversationExtensionLoadingState, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, String str, String str2, String str3, boolean z11, int i19, DefaultConstructorMarker defaultConstructorMarker) {
        this((i19 & 1) != 0 ? ConversationExtensionLoadingState.IDLE : conversationExtensionLoadingState, (i19 & 2) != 0 ? 0 : i11, (i19 & 4) != 0 ? 0 : i12, (i19 & 8) != 0 ? 0 : i13, (i19 & 16) != 0 ? 0 : i14, (i19 & 32) != 0 ? 0 : i15, (i19 & 64) != 0 ? 0 : i16, (i19 & 128) != 0 ? 0 : i17, (i19 & 256) != 0 ? 0 : i18, (i19 & 512) != 0 ? "" : str, (i19 & 1024) != 0 ? "" : str2, (i19 & NewHope.SENDB_BYTES) == 0 ? str3 : "", (i19 & 4096) != 0 ? false : z11);
    }

    public static /* synthetic */ ConversationExtensionState copy$default(ConversationExtensionState conversationExtensionState, ConversationExtensionLoadingState conversationExtensionLoadingState, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, String str, String str2, String str3, boolean z11, int i19, Object obj) {
        if ((i19 & 1) != 0) {
            conversationExtensionLoadingState = conversationExtensionState.contentState;
        }
        return conversationExtensionState.copy(conversationExtensionLoadingState, (i19 & 2) != 0 ? conversationExtensionState.iconColor : i11, (i19 & 4) != 0 ? conversationExtensionState.backgroundColor : i12, (i19 & 8) != 0 ? conversationExtensionState.buttonBackgroundColor : i13, (i19 & 16) != 0 ? conversationExtensionState.textColor : i14, (i19 & 32) != 0 ? conversationExtensionState.buttonColor : i15, (i19 & 64) != 0 ? conversationExtensionState.indicatorColor : i16, (i19 & 128) != 0 ? conversationExtensionState.navigationButtonBackgroundColor : i17, (i19 & 256) != 0 ? conversationExtensionState.focusedStateBorderColor : i18, (i19 & 512) != 0 ? conversationExtensionState.title : str, (i19 & 1024) != 0 ? conversationExtensionState.url : str2, (i19 & NewHope.SENDB_BYTES) != 0 ? conversationExtensionState.userAgent : str3, (i19 & 4096) != 0 ? conversationExtensionState.showBackButton : z11);
    }

    @NotNull
    /* JADX INFO: renamed from: component1$zendesk_ui_ui_android, reason: from getter */
    public final ConversationExtensionLoadingState getContentState() {
        return this.contentState;
    }

    @NotNull
    /* JADX INFO: renamed from: component10$zendesk_ui_ui_android, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* JADX INFO: renamed from: component11$zendesk_ui_ui_android, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    /* JADX INFO: renamed from: component12$zendesk_ui_ui_android, reason: from getter */
    public final String getUserAgent() {
        return this.userAgent;
    }

    /* JADX INFO: renamed from: component13$zendesk_ui_ui_android, reason: from getter */
    public final boolean getShowBackButton() {
        return this.showBackButton;
    }

    /* JADX INFO: renamed from: component2$zendesk_ui_ui_android, reason: from getter */
    public final int getIconColor() {
        return this.iconColor;
    }

    /* JADX INFO: renamed from: component3$zendesk_ui_ui_android, reason: from getter */
    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    /* JADX INFO: renamed from: component4$zendesk_ui_ui_android, reason: from getter */
    public final int getButtonBackgroundColor() {
        return this.buttonBackgroundColor;
    }

    /* JADX INFO: renamed from: component5$zendesk_ui_ui_android, reason: from getter */
    public final int getTextColor() {
        return this.textColor;
    }

    /* JADX INFO: renamed from: component6$zendesk_ui_ui_android, reason: from getter */
    public final int getButtonColor() {
        return this.buttonColor;
    }

    /* JADX INFO: renamed from: component7$zendesk_ui_ui_android, reason: from getter */
    public final int getIndicatorColor() {
        return this.indicatorColor;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getNavigationButtonBackgroundColor() {
        return this.navigationButtonBackgroundColor;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getFocusedStateBorderColor() {
        return this.focusedStateBorderColor;
    }

    @NotNull
    public final ConversationExtensionState copy(@NotNull ConversationExtensionLoadingState contentState, int iconColor, int backgroundColor, int buttonBackgroundColor, int textColor, int buttonColor, int indicatorColor, int navigationButtonBackgroundColor, int focusedStateBorderColor, @NotNull String title, @NotNull String url, @NotNull String userAgent, boolean showBackButton) {
        contentState.getClass();
        title.getClass();
        url.getClass();
        userAgent.getClass();
        return new ConversationExtensionState(contentState, iconColor, backgroundColor, buttonBackgroundColor, textColor, buttonColor, indicatorColor, navigationButtonBackgroundColor, focusedStateBorderColor, title, url, userAgent, showBackButton);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConversationExtensionState)) {
            return false;
        }
        ConversationExtensionState conversationExtensionState = (ConversationExtensionState) other;
        return this.contentState == conversationExtensionState.contentState && this.iconColor == conversationExtensionState.iconColor && this.backgroundColor == conversationExtensionState.backgroundColor && this.buttonBackgroundColor == conversationExtensionState.buttonBackgroundColor && this.textColor == conversationExtensionState.textColor && this.buttonColor == conversationExtensionState.buttonColor && this.indicatorColor == conversationExtensionState.indicatorColor && this.navigationButtonBackgroundColor == conversationExtensionState.navigationButtonBackgroundColor && this.focusedStateBorderColor == conversationExtensionState.focusedStateBorderColor && Intrinsics.areEqual(this.title, conversationExtensionState.title) && Intrinsics.areEqual(this.url, conversationExtensionState.url) && Intrinsics.areEqual(this.userAgent, conversationExtensionState.userAgent) && this.showBackButton == conversationExtensionState.showBackButton;
    }

    public final int getBackgroundColor$zendesk_ui_ui_android() {
        return this.backgroundColor;
    }

    public final int getButtonBackgroundColor$zendesk_ui_ui_android() {
        return this.buttonBackgroundColor;
    }

    public final int getButtonColor$zendesk_ui_ui_android() {
        return this.buttonColor;
    }

    @NotNull
    public final ConversationExtensionLoadingState getContentState$zendesk_ui_ui_android() {
        return this.contentState;
    }

    public final int getFocusedStateBorderColor() {
        return this.focusedStateBorderColor;
    }

    public final int getIconColor$zendesk_ui_ui_android() {
        return this.iconColor;
    }

    public final int getIndicatorColor$zendesk_ui_ui_android() {
        return this.indicatorColor;
    }

    public final int getNavigationButtonBackgroundColor() {
        return this.navigationButtonBackgroundColor;
    }

    public final boolean getShowBackButton$zendesk_ui_ui_android() {
        return this.showBackButton;
    }

    public final int getTextColor$zendesk_ui_ui_android() {
        return this.textColor;
    }

    @NotNull
    public final String getTitle$zendesk_ui_ui_android() {
        return this.title;
    }

    @NotNull
    public final String getUrl$zendesk_ui_ui_android() {
        return this.url;
    }

    @NotNull
    public final String getUserAgent$zendesk_ui_ui_android() {
        return this.userAgent;
    }

    public int hashCode() {
        return Boolean.hashCode(this.showBackButton) + l1.b(l1.b(l1.b(k.b(this.focusedStateBorderColor, k.b(this.navigationButtonBackgroundColor, k.b(this.indicatorColor, k.b(this.buttonColor, k.b(this.textColor, k.b(this.buttonBackgroundColor, k.b(this.backgroundColor, k.b(this.iconColor, this.contentState.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31, this.title), 31, this.url), 31, this.userAgent);
    }

    @NotNull
    public String toString() {
        ConversationExtensionLoadingState conversationExtensionLoadingState = this.contentState;
        int i11 = this.iconColor;
        int i12 = this.backgroundColor;
        int i13 = this.buttonBackgroundColor;
        int i14 = this.textColor;
        int i15 = this.buttonColor;
        int i16 = this.indicatorColor;
        int i17 = this.navigationButtonBackgroundColor;
        int i18 = this.focusedStateBorderColor;
        String str = this.title;
        String str2 = this.url;
        String str3 = this.userAgent;
        boolean z11 = this.showBackButton;
        StringBuilder sb2 = new StringBuilder("ConversationExtensionState(contentState=");
        sb2.append(conversationExtensionLoadingState);
        sb2.append(", iconColor=");
        sb2.append(i11);
        sb2.append(", backgroundColor=");
        f.C(sb2, i12, ", buttonBackgroundColor=", i13, ", textColor=");
        f.C(sb2, i14, ", buttonColor=", i15, ", indicatorColor=");
        f.C(sb2, i16, ", navigationButtonBackgroundColor=", i17, ", focusedStateBorderColor=");
        sb2.append(i18);
        sb2.append(", title=");
        sb2.append(str);
        sb2.append(", url=");
        s.A(sb2, str2, ", userAgent=", str3, ", showBackButton=");
        return s.o(sb2, z11, ")");
    }

    public ConversationExtensionState(@NotNull ConversationExtensionLoadingState conversationExtensionLoadingState, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, @NotNull String str, @NotNull String str2, @NotNull String str3, boolean z11) {
        conversationExtensionLoadingState.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.contentState = conversationExtensionLoadingState;
        this.iconColor = i11;
        this.backgroundColor = i12;
        this.buttonBackgroundColor = i13;
        this.textColor = i14;
        this.buttonColor = i15;
        this.indicatorColor = i16;
        this.navigationButtonBackgroundColor = i17;
        this.focusedStateBorderColor = i18;
        this.title = str;
        this.url = str2;
        this.userAgent = str3;
        this.showBackButton = z11;
    }

    public ConversationExtensionState() {
        this(null, 0, 0, 0, 0, 0, 0, 0, 0, null, null, null, false, 8191, null);
    }
}
