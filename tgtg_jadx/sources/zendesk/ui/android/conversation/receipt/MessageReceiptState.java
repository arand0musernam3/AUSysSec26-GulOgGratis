package zendesk.ui.android.conversation.receipt;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001:\u0001-BG\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010\u001b\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\u001cJ\u000e\u0010\u001d\u001a\u00020\u0005HÀ\u0003¢\u0006\u0002\b\u001eJ\u000e\u0010\u001f\u001a\u00020\u0007HÀ\u0003¢\u0006\u0002\b J\u0012\u0010!\u001a\u0004\u0018\u00010\tHÀ\u0003¢\u0006\u0004\b\"\u0010\u0015J\u0012\u0010#\u001a\u0004\u0018\u00010\tHÀ\u0003¢\u0006\u0004\b$\u0010\u0015J\u000e\u0010%\u001a\u00020\u0007HÀ\u0003¢\u0006\u0002\b&JN\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0002\u0010(J\u0013\u0010)\u001a\u00020\u00072\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020\tHÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\b\u001a\u0004\u0018\u00010\tX\u0080\u0004¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\n\u001a\u0004\u0018\u00010\tX\u0080\u0004¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0017\u0010\u0015R\u0014\u0010\u000b\u001a\u00020\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013¨\u0006."}, d2 = {"Lzendesk/ui/android/conversation/receipt/MessageReceiptState;", "", AnnotatedPrivateKey.LABEL, "", "messageReceiptPosition", "Lzendesk/ui/android/conversation/receipt/MessageReceiptPosition;", "showIcon", "", "labelColor", "", "iconColor", "shouldAnimateReceipt", "<init>", "(Ljava/lang/String;Lzendesk/ui/android/conversation/receipt/MessageReceiptPosition;ZLjava/lang/Integer;Ljava/lang/Integer;Z)V", "getLabel$zendesk_ui_ui_android", "()Ljava/lang/String;", "getMessageReceiptPosition$zendesk_ui_ui_android", "()Lzendesk/ui/android/conversation/receipt/MessageReceiptPosition;", "getShowIcon$zendesk_ui_ui_android", "()Z", "getLabelColor$zendesk_ui_ui_android", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getIconColor$zendesk_ui_ui_android", "getShouldAnimateReceipt$zendesk_ui_ui_android", "toBuilder", "Lzendesk/ui/android/conversation/receipt/MessageReceiptState$Builder;", "component1", "component1$zendesk_ui_ui_android", "component2", "component2$zendesk_ui_ui_android", "component3", "component3$zendesk_ui_ui_android", "component4", "component4$zendesk_ui_ui_android", "component5", "component5$zendesk_ui_ui_android", "component6", "component6$zendesk_ui_ui_android", "copy", "(Ljava/lang/String;Lzendesk/ui/android/conversation/receipt/MessageReceiptPosition;ZLjava/lang/Integer;Ljava/lang/Integer;Z)Lzendesk/ui/android/conversation/receipt/MessageReceiptState;", "equals", "other", "hashCode", "toString", "Builder", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class MessageReceiptState {
    public static final int $stable = 0;

    @Nullable
    private final Integer iconColor;

    @NotNull
    private final String label;

    @Nullable
    private final Integer labelColor;

    @NotNull
    private final MessageReceiptPosition messageReceiptPosition;
    private final boolean shouldAnimateReceipt;
    private final boolean showIcon;

    public /* synthetic */ MessageReceiptState(String str, MessageReceiptPosition messageReceiptPosition, boolean z11, Integer num, Integer num2, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? MessageReceiptPosition.NONE : messageReceiptPosition, (i11 & 4) != 0 ? true : z11, (i11 & 8) != 0 ? null : num, (i11 & 16) != 0 ? null : num2, (i11 & 32) != 0 ? false : z12);
    }

    public static /* synthetic */ MessageReceiptState copy$default(MessageReceiptState messageReceiptState, String str, MessageReceiptPosition messageReceiptPosition, boolean z11, Integer num, Integer num2, boolean z12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = messageReceiptState.label;
        }
        if ((i11 & 2) != 0) {
            messageReceiptPosition = messageReceiptState.messageReceiptPosition;
        }
        if ((i11 & 4) != 0) {
            z11 = messageReceiptState.showIcon;
        }
        if ((i11 & 8) != 0) {
            num = messageReceiptState.labelColor;
        }
        if ((i11 & 16) != 0) {
            num2 = messageReceiptState.iconColor;
        }
        if ((i11 & 32) != 0) {
            z12 = messageReceiptState.shouldAnimateReceipt;
        }
        Integer num3 = num2;
        boolean z13 = z12;
        return messageReceiptState.copy(str, messageReceiptPosition, z11, num, num3, z13);
    }

    @NotNull
    /* JADX INFO: renamed from: component1$zendesk_ui_ui_android, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    @NotNull
    /* JADX INFO: renamed from: component2$zendesk_ui_ui_android, reason: from getter */
    public final MessageReceiptPosition getMessageReceiptPosition() {
        return this.messageReceiptPosition;
    }

    /* JADX INFO: renamed from: component3$zendesk_ui_ui_android, reason: from getter */
    public final boolean getShowIcon() {
        return this.showIcon;
    }

    @Nullable
    /* JADX INFO: renamed from: component4$zendesk_ui_ui_android, reason: from getter */
    public final Integer getLabelColor() {
        return this.labelColor;
    }

    @Nullable
    /* JADX INFO: renamed from: component5$zendesk_ui_ui_android, reason: from getter */
    public final Integer getIconColor() {
        return this.iconColor;
    }

    /* JADX INFO: renamed from: component6$zendesk_ui_ui_android, reason: from getter */
    public final boolean getShouldAnimateReceipt() {
        return this.shouldAnimateReceipt;
    }

    @NotNull
    public final MessageReceiptState copy(@NotNull String label, @NotNull MessageReceiptPosition messageReceiptPosition, boolean showIcon, @Nullable Integer labelColor, @Nullable Integer iconColor, boolean shouldAnimateReceipt) {
        label.getClass();
        messageReceiptPosition.getClass();
        return new MessageReceiptState(label, messageReceiptPosition, showIcon, labelColor, iconColor, shouldAnimateReceipt);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageReceiptState)) {
            return false;
        }
        MessageReceiptState messageReceiptState = (MessageReceiptState) other;
        return Intrinsics.areEqual(this.label, messageReceiptState.label) && this.messageReceiptPosition == messageReceiptState.messageReceiptPosition && this.showIcon == messageReceiptState.showIcon && Intrinsics.areEqual(this.labelColor, messageReceiptState.labelColor) && Intrinsics.areEqual(this.iconColor, messageReceiptState.iconColor) && this.shouldAnimateReceipt == messageReceiptState.shouldAnimateReceipt;
    }

    @Nullable
    public final Integer getIconColor$zendesk_ui_ui_android() {
        return this.iconColor;
    }

    @NotNull
    public final String getLabel$zendesk_ui_ui_android() {
        return this.label;
    }

    @Nullable
    public final Integer getLabelColor$zendesk_ui_ui_android() {
        return this.labelColor;
    }

    @NotNull
    public final MessageReceiptPosition getMessageReceiptPosition$zendesk_ui_ui_android() {
        return this.messageReceiptPosition;
    }

    public final boolean getShouldAnimateReceipt$zendesk_ui_ui_android() {
        return this.shouldAnimateReceipt;
    }

    public final boolean getShowIcon$zendesk_ui_ui_android() {
        return this.showIcon;
    }

    public int hashCode() {
        int iE = k.e((this.messageReceiptPosition.hashCode() + (this.label.hashCode() * 31)) * 31, 31, this.showIcon);
        Integer num = this.labelColor;
        int iHashCode = (iE + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.iconColor;
        return Boolean.hashCode(this.shouldAnimateReceipt) + ((iHashCode + (num2 != null ? num2.hashCode() : 0)) * 31);
    }

    @NotNull
    public final Builder toBuilder() {
        return new Builder(this);
    }

    @NotNull
    public String toString() {
        return "MessageReceiptState(label=" + this.label + ", messageReceiptPosition=" + this.messageReceiptPosition + ", showIcon=" + this.showIcon + ", labelColor=" + this.labelColor + ", iconColor=" + this.iconColor + ", shouldAnimateReceipt=" + this.shouldAnimateReceipt + ")";
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\rJ\u0010\u0010\u000e\u001a\u00020\u00002\b\b\u0001\u0010\u000f\u001a\u00020\u0010J\u0010\u0010\u0011\u001a\u00020\u00002\b\b\u0001\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u0013\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lzendesk/ui/android/conversation/receipt/MessageReceiptState$Builder;", "", "<init>", "()V", "state", "Lzendesk/ui/android/conversation/receipt/MessageReceiptState;", "(Lzendesk/ui/android/conversation/receipt/MessageReceiptState;)V", AnnotatedPrivateKey.LABEL, "", "messageReceiptPosition", "Lzendesk/ui/android/conversation/receipt/MessageReceiptPosition;", "showIcon", "value", "", "labelColor", "color", "", "iconColor", "shouldAnimateReceipt", "build", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;

        @NotNull
        private MessageReceiptState state;

        public Builder() {
            this.state = new MessageReceiptState(null, null, false, null, null, false, 63, null);
        }

        @NotNull
        /* JADX INFO: renamed from: build, reason: from getter */
        public final MessageReceiptState getState() {
            return this.state;
        }

        @NotNull
        public final Builder iconColor(int color) {
            this.state = MessageReceiptState.copy$default(this.state, null, null, false, null, Integer.valueOf(color), false, 47, null);
            return this;
        }

        @NotNull
        public final Builder label(@NotNull String label) {
            label.getClass();
            this.state = MessageReceiptState.copy$default(this.state, label, null, false, null, null, false, 62, null);
            return this;
        }

        @NotNull
        public final Builder labelColor(int color) {
            this.state = MessageReceiptState.copy$default(this.state, null, null, false, Integer.valueOf(color), null, false, 55, null);
            return this;
        }

        @NotNull
        public final Builder messageReceiptPosition(@NotNull MessageReceiptPosition messageReceiptPosition) {
            messageReceiptPosition.getClass();
            this.state = MessageReceiptState.copy$default(this.state, null, messageReceiptPosition, false, null, null, false, 61, null);
            return this;
        }

        @NotNull
        public final Builder shouldAnimateReceipt(boolean value) {
            this.state = MessageReceiptState.copy$default(this.state, null, null, false, null, null, value, 31, null);
            return this;
        }

        @NotNull
        public final Builder showIcon(boolean value) {
            this.state = MessageReceiptState.copy$default(this.state, null, null, value, null, null, false, 59, null);
            return this;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(@NotNull MessageReceiptState messageReceiptState) {
            this();
            messageReceiptState.getClass();
            this.state = messageReceiptState;
        }
    }

    public MessageReceiptState(@NotNull String str, @NotNull MessageReceiptPosition messageReceiptPosition, boolean z11, @Nullable Integer num, @Nullable Integer num2, boolean z12) {
        str.getClass();
        messageReceiptPosition.getClass();
        this.label = str;
        this.messageReceiptPosition = messageReceiptPosition;
        this.showIcon = z11;
        this.labelColor = num;
        this.iconColor = num2;
        this.shouldAnimateReceipt = z12;
    }

    public MessageReceiptState() {
        this(null, null, false, null, null, false, 63, null);
    }
}
