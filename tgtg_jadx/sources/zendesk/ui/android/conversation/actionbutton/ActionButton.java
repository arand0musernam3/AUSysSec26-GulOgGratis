package zendesk.ui.android.conversation.actionbutton;

import e0.f;
import j4.s;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import zendesk.core.ui.android.internal.model.MessageActionSize;
import zendesk.core.ui.android.internal.model.MessageSourceType;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\t\u0010#\u001a\u00020\fHÆ\u0003J\t\u0010$\u001a\u00020\u000eHÆ\u0003Jk\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0013\u0010&\u001a\u00020\u00072\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006+"}, d2 = {"Lzendesk/ui/android/conversation/actionbutton/ActionButton;", "", TextBundle.TEXT_ENTRY, "", "uri", "fallback", "isSupported", "", "urlSource", "actionId", "isLoading", "size", "Lzendesk/core/ui/android/internal/model/MessageActionSize;", "sourceType", "Lzendesk/core/ui/android/internal/model/MessageSourceType;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZLzendesk/core/ui/android/internal/model/MessageActionSize;Lzendesk/core/ui/android/internal/model/MessageSourceType;)V", "getText", "()Ljava/lang/String;", "getUri", "getFallback", "()Z", "getUrlSource", "getActionId", "getSize", "()Lzendesk/core/ui/android/internal/model/MessageActionSize;", "getSourceType", "()Lzendesk/core/ui/android/internal/model/MessageSourceType;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ActionButton {
    public static final int $stable = 0;

    @Nullable
    private final String actionId;

    @Nullable
    private final String fallback;
    private final boolean isLoading;
    private final boolean isSupported;

    @NotNull
    private final MessageActionSize size;

    @NotNull
    private final MessageSourceType sourceType;

    @NotNull
    private final String text;

    @Nullable
    private final String uri;

    @Nullable
    private final String urlSource;

    public /* synthetic */ ActionButton(String str, String str2, String str3, boolean z11, String str4, String str5, boolean z12, MessageActionSize messageActionSize, MessageSourceType messageSourceType, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? true : z11, (i11 & 16) != 0 ? null : str4, (i11 & 32) != 0 ? null : str5, (i11 & 64) != 0 ? false : z12, (i11 & 128) != 0 ? MessageActionSize.FULL : messageActionSize, (i11 & 256) != 0 ? MessageSourceType.BOT : messageSourceType);
    }

    public static /* synthetic */ ActionButton copy$default(ActionButton actionButton, String str, String str2, String str3, boolean z11, String str4, String str5, boolean z12, MessageActionSize messageActionSize, MessageSourceType messageSourceType, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = actionButton.text;
        }
        if ((i11 & 2) != 0) {
            str2 = actionButton.uri;
        }
        if ((i11 & 4) != 0) {
            str3 = actionButton.fallback;
        }
        if ((i11 & 8) != 0) {
            z11 = actionButton.isSupported;
        }
        if ((i11 & 16) != 0) {
            str4 = actionButton.urlSource;
        }
        if ((i11 & 32) != 0) {
            str5 = actionButton.actionId;
        }
        if ((i11 & 64) != 0) {
            z12 = actionButton.isLoading;
        }
        if ((i11 & 128) != 0) {
            messageActionSize = actionButton.size;
        }
        if ((i11 & 256) != 0) {
            messageSourceType = actionButton.sourceType;
        }
        MessageActionSize messageActionSize2 = messageActionSize;
        MessageSourceType messageSourceType2 = messageSourceType;
        String str6 = str5;
        boolean z13 = z12;
        String str7 = str4;
        String str8 = str3;
        return actionButton.copy(str, str2, str8, z11, str7, str6, z13, messageActionSize2, messageSourceType2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUri() {
        return this.uri;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFallback() {
        return this.fallback;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsSupported() {
        return this.isSupported;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getUrlSource() {
        return this.urlSource;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getActionId() {
        return this.actionId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final MessageActionSize getSize() {
        return this.size;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final MessageSourceType getSourceType() {
        return this.sourceType;
    }

    @NotNull
    public final ActionButton copy(@NotNull String text, @Nullable String uri, @Nullable String fallback, boolean isSupported, @Nullable String urlSource, @Nullable String actionId, boolean isLoading, @NotNull MessageActionSize size, @NotNull MessageSourceType sourceType) {
        text.getClass();
        size.getClass();
        sourceType.getClass();
        return new ActionButton(text, uri, fallback, isSupported, urlSource, actionId, isLoading, size, sourceType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActionButton)) {
            return false;
        }
        ActionButton actionButton = (ActionButton) other;
        return Intrinsics.areEqual(this.text, actionButton.text) && Intrinsics.areEqual(this.uri, actionButton.uri) && Intrinsics.areEqual(this.fallback, actionButton.fallback) && this.isSupported == actionButton.isSupported && Intrinsics.areEqual(this.urlSource, actionButton.urlSource) && Intrinsics.areEqual(this.actionId, actionButton.actionId) && this.isLoading == actionButton.isLoading && this.size == actionButton.size && this.sourceType == actionButton.sourceType;
    }

    @Nullable
    public final String getActionId() {
        return this.actionId;
    }

    @Nullable
    public final String getFallback() {
        return this.fallback;
    }

    @NotNull
    public final MessageActionSize getSize() {
        return this.size;
    }

    @NotNull
    public final MessageSourceType getSourceType() {
        return this.sourceType;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    @Nullable
    public final String getUri() {
        return this.uri;
    }

    @Nullable
    public final String getUrlSource() {
        return this.urlSource;
    }

    public int hashCode() {
        int iHashCode = this.text.hashCode() * 31;
        String str = this.uri;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.fallback;
        int iE = k.e((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.isSupported);
        String str3 = this.urlSource;
        int iHashCode3 = (iE + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.actionId;
        return this.sourceType.hashCode() + ((this.size.hashCode() + k.e((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31, 31, this.isLoading)) * 31);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final boolean isSupported() {
        return this.isSupported;
    }

    @NotNull
    public String toString() {
        String str = this.text;
        String str2 = this.uri;
        String str3 = this.fallback;
        boolean z11 = this.isSupported;
        String str4 = this.urlSource;
        String str5 = this.actionId;
        boolean z12 = this.isLoading;
        MessageActionSize messageActionSize = this.size;
        MessageSourceType messageSourceType = this.sourceType;
        StringBuilder sbT = f.t("ActionButton(text=", str, ", uri=", str2, ", fallback=");
        k.z(sbT, str3, ", isSupported=", z11, ", urlSource=");
        s.A(sbT, str4, ", actionId=", str5, ", isLoading=");
        sbT.append(z12);
        sbT.append(", size=");
        sbT.append(messageActionSize);
        sbT.append(", sourceType=");
        sbT.append(messageSourceType);
        sbT.append(")");
        return sbT.toString();
    }

    public ActionButton(@NotNull String str, @Nullable String str2, @Nullable String str3, boolean z11, @Nullable String str4, @Nullable String str5, boolean z12, @NotNull MessageActionSize messageActionSize, @NotNull MessageSourceType messageSourceType) {
        str.getClass();
        messageActionSize.getClass();
        messageSourceType.getClass();
        this.text = str;
        this.uri = str2;
        this.fallback = str3;
        this.isSupported = z11;
        this.urlSource = str4;
        this.actionId = str5;
        this.isLoading = z12;
        this.size = messageActionSize;
        this.sourceType = messageSourceType;
    }
}
