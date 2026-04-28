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
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b0\b\u0087\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u000e\u0010%\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b&J\u0010\u0010'\u001a\u0004\u0018\u00010\u0003HÀ\u0003¢\u0006\u0002\b(J\u000e\u0010)\u001a\u00020\u0006HÀ\u0003¢\u0006\u0002\b*J\u0010\u0010+\u001a\u0004\u0018\u00010\u0003HÀ\u0003¢\u0006\u0002\b,J\u0012\u0010-\u001a\u0004\u0018\u00010\tHÀ\u0003¢\u0006\u0004\b.\u0010\u001bJ\u0012\u0010/\u001a\u0004\u0018\u00010\tHÀ\u0003¢\u0006\u0004\b0\u0010\u001bJ\u0010\u00101\u001a\u0004\u0018\u00010\u0003HÀ\u0003¢\u0006\u0002\b2J\u000e\u00103\u001a\u00020\u0006HÀ\u0003¢\u0006\u0002\b4J\u000e\u00105\u001a\u00020\u000eHÀ\u0003¢\u0006\u0002\b6J\u0012\u00107\u001a\u0004\u0018\u00010\tHÀ\u0003¢\u0006\u0004\b8\u0010\u001bJ\u000e\u00109\u001a\u00020\u0011HÀ\u0003¢\u0006\u0002\b:J\u0088\u0001\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0010\u001a\u00020\u0011HÆ\u0001¢\u0006\u0002\u0010<J\u0013\u0010=\u001a\u00020\u00062\b\u0010>\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010?\u001a\u00020\tHÖ\u0001J\t\u0010@\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0018\u0010\b\u001a\u0004\u0018\u00010\tX\u0080\u0004¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\n\u001a\u0004\u0018\u00010\tX\u0080\u0004¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001d\u0010\u001bR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0014\u0010\f\u001a\u00020\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0014\u0010\r\u001a\u00020\u000eX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\tX\u0080\u0004¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\"\u0010\u001bR\u0014\u0010\u0010\u001a\u00020\u0011X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$¨\u0006A"}, d2 = {"Lzendesk/ui/android/conversation/actionbutton/ActionButtonState;", "", TextBundle.TEXT_ENTRY, "", "uri", "isSupported", "", "urlSource", "backgroundColor", "", "textColor", "actionId", "isLoading", "size", "Lzendesk/core/ui/android/internal/model/MessageActionSize;", "loadingColor", "sourceType", "Lzendesk/core/ui/android/internal/model/MessageSourceType;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;ZLzendesk/core/ui/android/internal/model/MessageActionSize;Ljava/lang/Integer;Lzendesk/core/ui/android/internal/model/MessageSourceType;)V", "getText$zendesk_ui_ui_android", "()Ljava/lang/String;", "getUri$zendesk_ui_ui_android", "isSupported$zendesk_ui_ui_android", "()Z", "getUrlSource$zendesk_ui_ui_android", "getBackgroundColor$zendesk_ui_ui_android", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTextColor$zendesk_ui_ui_android", "getActionId$zendesk_ui_ui_android", "isLoading$zendesk_ui_ui_android", "getSize$zendesk_ui_ui_android", "()Lzendesk/core/ui/android/internal/model/MessageActionSize;", "getLoadingColor$zendesk_ui_ui_android", "getSourceType$zendesk_ui_ui_android", "()Lzendesk/core/ui/android/internal/model/MessageSourceType;", "component1", "component1$zendesk_ui_ui_android", "component2", "component2$zendesk_ui_ui_android", "component3", "component3$zendesk_ui_ui_android", "component4", "component4$zendesk_ui_ui_android", "component5", "component5$zendesk_ui_ui_android", "component6", "component6$zendesk_ui_ui_android", "component7", "component7$zendesk_ui_ui_android", "component8", "component8$zendesk_ui_ui_android", "component9", "component9$zendesk_ui_ui_android", "component10", "component10$zendesk_ui_ui_android", "component11", "component11$zendesk_ui_ui_android", "copy", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;ZLzendesk/core/ui/android/internal/model/MessageActionSize;Ljava/lang/Integer;Lzendesk/core/ui/android/internal/model/MessageSourceType;)Lzendesk/ui/android/conversation/actionbutton/ActionButtonState;", "equals", "other", "hashCode", "toString", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ActionButtonState {
    public static final int $stable = 0;

    @Nullable
    private final String actionId;

    @Nullable
    private final Integer backgroundColor;
    private final boolean isLoading;
    private final boolean isSupported;

    @Nullable
    private final Integer loadingColor;

    @NotNull
    private final MessageActionSize size;

    @NotNull
    private final MessageSourceType sourceType;

    @NotNull
    private final String text;

    @Nullable
    private final Integer textColor;

    @Nullable
    private final String uri;

    @Nullable
    private final String urlSource;

    public /* synthetic */ ActionButtonState(String str, String str2, boolean z11, String str3, Integer num, Integer num2, String str4, boolean z12, MessageActionSize messageActionSize, Integer num3, MessageSourceType messageSourceType, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? true : z11, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? null : num, (i11 & 32) != 0 ? null : num2, (i11 & 64) != 0 ? null : str4, (i11 & 128) != 0 ? false : z12, (i11 & 256) != 0 ? MessageActionSize.FULL : messageActionSize, (i11 & 512) != 0 ? null : num3, (i11 & 1024) != 0 ? MessageSourceType.BOT : messageSourceType);
    }

    public static /* synthetic */ ActionButtonState copy$default(ActionButtonState actionButtonState, String str, String str2, boolean z11, String str3, Integer num, Integer num2, String str4, boolean z12, MessageActionSize messageActionSize, Integer num3, MessageSourceType messageSourceType, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = actionButtonState.text;
        }
        if ((i11 & 2) != 0) {
            str2 = actionButtonState.uri;
        }
        if ((i11 & 4) != 0) {
            z11 = actionButtonState.isSupported;
        }
        if ((i11 & 8) != 0) {
            str3 = actionButtonState.urlSource;
        }
        if ((i11 & 16) != 0) {
            num = actionButtonState.backgroundColor;
        }
        if ((i11 & 32) != 0) {
            num2 = actionButtonState.textColor;
        }
        if ((i11 & 64) != 0) {
            str4 = actionButtonState.actionId;
        }
        if ((i11 & 128) != 0) {
            z12 = actionButtonState.isLoading;
        }
        if ((i11 & 256) != 0) {
            messageActionSize = actionButtonState.size;
        }
        if ((i11 & 512) != 0) {
            num3 = actionButtonState.loadingColor;
        }
        if ((i11 & 1024) != 0) {
            messageSourceType = actionButtonState.sourceType;
        }
        Integer num4 = num3;
        MessageSourceType messageSourceType2 = messageSourceType;
        boolean z13 = z12;
        MessageActionSize messageActionSize2 = messageActionSize;
        Integer num5 = num2;
        String str5 = str4;
        Integer num6 = num;
        boolean z14 = z11;
        return actionButtonState.copy(str, str2, z14, str3, num6, num5, str5, z13, messageActionSize2, num4, messageSourceType2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1$zendesk_ui_ui_android, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @Nullable
    /* JADX INFO: renamed from: component10$zendesk_ui_ui_android, reason: from getter */
    public final Integer getLoadingColor() {
        return this.loadingColor;
    }

    @NotNull
    /* JADX INFO: renamed from: component11$zendesk_ui_ui_android, reason: from getter */
    public final MessageSourceType getSourceType() {
        return this.sourceType;
    }

    @Nullable
    /* JADX INFO: renamed from: component2$zendesk_ui_ui_android, reason: from getter */
    public final String getUri() {
        return this.uri;
    }

    /* JADX INFO: renamed from: component3$zendesk_ui_ui_android, reason: from getter */
    public final boolean getIsSupported() {
        return this.isSupported;
    }

    @Nullable
    /* JADX INFO: renamed from: component4$zendesk_ui_ui_android, reason: from getter */
    public final String getUrlSource() {
        return this.urlSource;
    }

    @Nullable
    /* JADX INFO: renamed from: component5$zendesk_ui_ui_android, reason: from getter */
    public final Integer getBackgroundColor() {
        return this.backgroundColor;
    }

    @Nullable
    /* JADX INFO: renamed from: component6$zendesk_ui_ui_android, reason: from getter */
    public final Integer getTextColor() {
        return this.textColor;
    }

    @Nullable
    /* JADX INFO: renamed from: component7$zendesk_ui_ui_android, reason: from getter */
    public final String getActionId() {
        return this.actionId;
    }

    /* JADX INFO: renamed from: component8$zendesk_ui_ui_android, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    @NotNull
    /* JADX INFO: renamed from: component9$zendesk_ui_ui_android, reason: from getter */
    public final MessageActionSize getSize() {
        return this.size;
    }

    @NotNull
    public final ActionButtonState copy(@NotNull String text, @Nullable String uri, boolean isSupported, @Nullable String urlSource, @Nullable Integer backgroundColor, @Nullable Integer textColor, @Nullable String actionId, boolean isLoading, @NotNull MessageActionSize size, @Nullable Integer loadingColor, @NotNull MessageSourceType sourceType) {
        text.getClass();
        size.getClass();
        sourceType.getClass();
        return new ActionButtonState(text, uri, isSupported, urlSource, backgroundColor, textColor, actionId, isLoading, size, loadingColor, sourceType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActionButtonState)) {
            return false;
        }
        ActionButtonState actionButtonState = (ActionButtonState) other;
        return Intrinsics.areEqual(this.text, actionButtonState.text) && Intrinsics.areEqual(this.uri, actionButtonState.uri) && this.isSupported == actionButtonState.isSupported && Intrinsics.areEqual(this.urlSource, actionButtonState.urlSource) && Intrinsics.areEqual(this.backgroundColor, actionButtonState.backgroundColor) && Intrinsics.areEqual(this.textColor, actionButtonState.textColor) && Intrinsics.areEqual(this.actionId, actionButtonState.actionId) && this.isLoading == actionButtonState.isLoading && this.size == actionButtonState.size && Intrinsics.areEqual(this.loadingColor, actionButtonState.loadingColor) && this.sourceType == actionButtonState.sourceType;
    }

    @Nullable
    public final String getActionId$zendesk_ui_ui_android() {
        return this.actionId;
    }

    @Nullable
    public final Integer getBackgroundColor$zendesk_ui_ui_android() {
        return this.backgroundColor;
    }

    @Nullable
    public final Integer getLoadingColor$zendesk_ui_ui_android() {
        return this.loadingColor;
    }

    @NotNull
    public final MessageActionSize getSize$zendesk_ui_ui_android() {
        return this.size;
    }

    @NotNull
    public final MessageSourceType getSourceType$zendesk_ui_ui_android() {
        return this.sourceType;
    }

    @NotNull
    public final String getText$zendesk_ui_ui_android() {
        return this.text;
    }

    @Nullable
    public final Integer getTextColor$zendesk_ui_ui_android() {
        return this.textColor;
    }

    @Nullable
    public final String getUri$zendesk_ui_ui_android() {
        return this.uri;
    }

    @Nullable
    public final String getUrlSource$zendesk_ui_ui_android() {
        return this.urlSource;
    }

    public int hashCode() {
        int iHashCode = this.text.hashCode() * 31;
        String str = this.uri;
        int iE = k.e((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.isSupported);
        String str2 = this.urlSource;
        int iHashCode2 = (iE + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.backgroundColor;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.textColor;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.actionId;
        int iHashCode5 = (this.size.hashCode() + k.e((iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.isLoading)) * 31;
        Integer num3 = this.loadingColor;
        return this.sourceType.hashCode() + ((iHashCode5 + (num3 != null ? num3.hashCode() : 0)) * 31);
    }

    public final boolean isLoading$zendesk_ui_ui_android() {
        return this.isLoading;
    }

    public final boolean isSupported$zendesk_ui_ui_android() {
        return this.isSupported;
    }

    @NotNull
    public String toString() {
        String str = this.text;
        String str2 = this.uri;
        boolean z11 = this.isSupported;
        String str3 = this.urlSource;
        Integer num = this.backgroundColor;
        Integer num2 = this.textColor;
        String str4 = this.actionId;
        boolean z12 = this.isLoading;
        MessageActionSize messageActionSize = this.size;
        Integer num3 = this.loadingColor;
        MessageSourceType messageSourceType = this.sourceType;
        StringBuilder sbT = f.t("ActionButtonState(text=", str, ", uri=", str2, ", isSupported=");
        sbT.append(z11);
        sbT.append(", urlSource=");
        sbT.append(str3);
        sbT.append(", backgroundColor=");
        s.z(sbT, num, ", textColor=", num2, ", actionId=");
        k.z(sbT, str4, ", isLoading=", z12, ", size=");
        sbT.append(messageActionSize);
        sbT.append(", loadingColor=");
        sbT.append(num3);
        sbT.append(", sourceType=");
        sbT.append(messageSourceType);
        sbT.append(")");
        return sbT.toString();
    }

    public ActionButtonState(@NotNull String str, @Nullable String str2, boolean z11, @Nullable String str3, @Nullable Integer num, @Nullable Integer num2, @Nullable String str4, boolean z12, @NotNull MessageActionSize messageActionSize, @Nullable Integer num3, @NotNull MessageSourceType messageSourceType) {
        str.getClass();
        messageActionSize.getClass();
        messageSourceType.getClass();
        this.text = str;
        this.uri = str2;
        this.isSupported = z11;
        this.urlSource = str3;
        this.backgroundColor = num;
        this.textColor = num2;
        this.actionId = str4;
        this.isLoading = z12;
        this.size = messageActionSize;
        this.loadingColor = num3;
        this.sourceType = messageSourceType;
    }

    public ActionButtonState() {
        this(null, null, false, null, null, null, null, false, null, null, null, 2047, null);
    }
}
