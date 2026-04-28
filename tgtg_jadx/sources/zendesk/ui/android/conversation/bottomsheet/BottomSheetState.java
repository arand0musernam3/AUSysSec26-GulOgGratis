package zendesk.ui.android.conversation.bottomsheet;

import com.braze.models.inappmessage.InAppMessageBase;
import e0.f;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b%\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u001b\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\u001cJ\u000e\u0010\u001d\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\u001eJ\u000e\u0010\u001f\u001a\u00020\u0006HÀ\u0003¢\u0006\u0002\b J\u000e\u0010!\u001a\u00020\bHÀ\u0003¢\u0006\u0002\b\"J\u0012\u0010#\u001a\u0004\u0018\u00010\nHÀ\u0003¢\u0006\u0004\b$\u0010\u0017J\u0012\u0010%\u001a\u0004\u0018\u00010\nHÀ\u0003¢\u0006\u0004\b&\u0010\u0017J\u0012\u0010'\u001a\u0004\u0018\u00010\nHÀ\u0003¢\u0006\u0004\b(\u0010\u0017JZ\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010*J\u0013\u0010+\u001a\u00020\b2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020\nHÖ\u0001J\t\u0010.\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\t\u001a\u0004\u0018\u00010\nX\u0080\u0004¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\nX\u0080\u0004¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0019\u0010\u0017R\u0018\u0010\f\u001a\u0004\u0018\u00010\nX\u0080\u0004¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u001a\u0010\u0017¨\u0006/"}, d2 = {"Lzendesk/ui/android/conversation/bottomsheet/BottomSheetState;", "", "messageText", "", "actionText", InAppMessageBase.DURATION, "", "showBottomSheet", "", "backgroundColor", "", "messageTextColor", "actionTextColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;JZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getMessageText$zendesk_ui_ui_android", "()Ljava/lang/String;", "getActionText$zendesk_ui_ui_android", "getDuration$zendesk_ui_ui_android", "()J", "getShowBottomSheet$zendesk_ui_ui_android", "()Z", "getBackgroundColor$zendesk_ui_ui_android", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMessageTextColor$zendesk_ui_ui_android", "getActionTextColor$zendesk_ui_ui_android", "component1", "component1$zendesk_ui_ui_android", "component2", "component2$zendesk_ui_ui_android", "component3", "component3$zendesk_ui_ui_android", "component4", "component4$zendesk_ui_ui_android", "component5", "component5$zendesk_ui_ui_android", "component6", "component6$zendesk_ui_ui_android", "component7", "component7$zendesk_ui_ui_android", "copy", "(Ljava/lang/String;Ljava/lang/String;JZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lzendesk/ui/android/conversation/bottomsheet/BottomSheetState;", "equals", "other", "hashCode", "toString", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class BottomSheetState {
    public static final int $stable = 0;

    @NotNull
    private final String actionText;

    @Nullable
    private final Integer actionTextColor;

    @Nullable
    private final Integer backgroundColor;
    private final long duration;

    @NotNull
    private final String messageText;

    @Nullable
    private final Integer messageTextColor;
    private final boolean showBottomSheet;

    public /* synthetic */ BottomSheetState(String str, String str2, long j9, boolean z11, Integer num, Integer num2, Integer num3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? "" : str2, (i11 & 4) != 0 ? 5000L : j9, (i11 & 8) != 0 ? false : z11, (i11 & 16) != 0 ? null : num, (i11 & 32) != 0 ? null : num2, (i11 & 64) != 0 ? null : num3);
    }

    public static /* synthetic */ BottomSheetState copy$default(BottomSheetState bottomSheetState, String str, String str2, long j9, boolean z11, Integer num, Integer num2, Integer num3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = bottomSheetState.messageText;
        }
        if ((i11 & 2) != 0) {
            str2 = bottomSheetState.actionText;
        }
        if ((i11 & 4) != 0) {
            j9 = bottomSheetState.duration;
        }
        if ((i11 & 8) != 0) {
            z11 = bottomSheetState.showBottomSheet;
        }
        if ((i11 & 16) != 0) {
            num = bottomSheetState.backgroundColor;
        }
        if ((i11 & 32) != 0) {
            num2 = bottomSheetState.messageTextColor;
        }
        if ((i11 & 64) != 0) {
            num3 = bottomSheetState.actionTextColor;
        }
        long j11 = j9;
        return bottomSheetState.copy(str, str2, j11, z11, num, num2, num3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1$zendesk_ui_ui_android, reason: from getter */
    public final String getMessageText() {
        return this.messageText;
    }

    @NotNull
    /* JADX INFO: renamed from: component2$zendesk_ui_ui_android, reason: from getter */
    public final String getActionText() {
        return this.actionText;
    }

    /* JADX INFO: renamed from: component3$zendesk_ui_ui_android, reason: from getter */
    public final long getDuration() {
        return this.duration;
    }

    /* JADX INFO: renamed from: component4$zendesk_ui_ui_android, reason: from getter */
    public final boolean getShowBottomSheet() {
        return this.showBottomSheet;
    }

    @Nullable
    /* JADX INFO: renamed from: component5$zendesk_ui_ui_android, reason: from getter */
    public final Integer getBackgroundColor() {
        return this.backgroundColor;
    }

    @Nullable
    /* JADX INFO: renamed from: component6$zendesk_ui_ui_android, reason: from getter */
    public final Integer getMessageTextColor() {
        return this.messageTextColor;
    }

    @Nullable
    /* JADX INFO: renamed from: component7$zendesk_ui_ui_android, reason: from getter */
    public final Integer getActionTextColor() {
        return this.actionTextColor;
    }

    @NotNull
    public final BottomSheetState copy(@NotNull String messageText, @NotNull String actionText, long duration, boolean showBottomSheet, @Nullable Integer backgroundColor, @Nullable Integer messageTextColor, @Nullable Integer actionTextColor) {
        messageText.getClass();
        actionText.getClass();
        return new BottomSheetState(messageText, actionText, duration, showBottomSheet, backgroundColor, messageTextColor, actionTextColor);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BottomSheetState)) {
            return false;
        }
        BottomSheetState bottomSheetState = (BottomSheetState) other;
        return Intrinsics.areEqual(this.messageText, bottomSheetState.messageText) && Intrinsics.areEqual(this.actionText, bottomSheetState.actionText) && this.duration == bottomSheetState.duration && this.showBottomSheet == bottomSheetState.showBottomSheet && Intrinsics.areEqual(this.backgroundColor, bottomSheetState.backgroundColor) && Intrinsics.areEqual(this.messageTextColor, bottomSheetState.messageTextColor) && Intrinsics.areEqual(this.actionTextColor, bottomSheetState.actionTextColor);
    }

    @NotNull
    public final String getActionText$zendesk_ui_ui_android() {
        return this.actionText;
    }

    @Nullable
    public final Integer getActionTextColor$zendesk_ui_ui_android() {
        return this.actionTextColor;
    }

    @Nullable
    public final Integer getBackgroundColor$zendesk_ui_ui_android() {
        return this.backgroundColor;
    }

    public final long getDuration$zendesk_ui_ui_android() {
        return this.duration;
    }

    @NotNull
    public final String getMessageText$zendesk_ui_ui_android() {
        return this.messageText;
    }

    @Nullable
    public final Integer getMessageTextColor$zendesk_ui_ui_android() {
        return this.messageTextColor;
    }

    public final boolean getShowBottomSheet$zendesk_ui_ui_android() {
        return this.showBottomSheet;
    }

    public int hashCode() {
        int iE = k.e(f.b(l1.b(this.messageText.hashCode() * 31, 31, this.actionText), 31, this.duration), 31, this.showBottomSheet);
        Integer num = this.backgroundColor;
        int iHashCode = (iE + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.messageTextColor;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.actionTextColor;
        return iHashCode2 + (num3 != null ? num3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.messageText;
        String str2 = this.actionText;
        long j9 = this.duration;
        boolean z11 = this.showBottomSheet;
        Integer num = this.backgroundColor;
        Integer num2 = this.messageTextColor;
        Integer num3 = this.actionTextColor;
        StringBuilder sbT = f.t("BottomSheetState(messageText=", str, ", actionText=", str2, ", duration=");
        sbT.append(j9);
        sbT.append(", showBottomSheet=");
        sbT.append(z11);
        sbT.append(", backgroundColor=");
        sbT.append(num);
        sbT.append(", messageTextColor=");
        sbT.append(num2);
        sbT.append(", actionTextColor=");
        sbT.append(num3);
        sbT.append(")");
        return sbT.toString();
    }

    public BottomSheetState(@NotNull String str, @NotNull String str2, long j9, boolean z11, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3) {
        str.getClass();
        str2.getClass();
        this.messageText = str;
        this.actionText = str2;
        this.duration = j9;
        this.showBottomSheet = z11;
        this.backgroundColor = num;
        this.messageTextColor = num2;
        this.actionTextColor = num3;
    }

    public BottomSheetState() {
        this(null, null, 0L, false, null, null, null, 127, null);
    }
}
