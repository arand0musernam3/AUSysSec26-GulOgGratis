package zendesk.ui.android.conversation.messagesdivider;

import android.content.Context;
import com.app.tgtg.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zendesk.ui.android.internal.ColorExtKt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB5\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ<\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u000f\u0010\rR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0010\u0010\r¨\u0006\u001d"}, d2 = {"Lzendesk/ui/android/conversation/messagesdivider/MessagesDividerState;", "", TextBundle.TEXT_ENTRY, "", "dividerColor", "", "textColor", "textStyle", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getText", "()Ljava/lang/String;", "getDividerColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTextColor", "getTextStyle", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lzendesk/ui/android/conversation/messagesdivider/MessagesDividerState;", "equals", "", "other", "hashCode", "toString", "Companion", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class MessagesDividerState {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final float LABEL_ALPHA = 0.65f;

    @Nullable
    private final Integer dividerColor;

    @NotNull
    private final String text;

    @Nullable
    private final Integer textColor;

    @Nullable
    private final Integer textStyle;

    public /* synthetic */ MessagesDividerState(String str, Integer num, Integer num2, Integer num3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? null : num, (i11 & 4) != 0 ? null : num2, (i11 & 8) != 0 ? null : num3);
    }

    public static /* synthetic */ MessagesDividerState copy$default(MessagesDividerState messagesDividerState, String str, Integer num, Integer num2, Integer num3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = messagesDividerState.text;
        }
        if ((i11 & 2) != 0) {
            num = messagesDividerState.dividerColor;
        }
        if ((i11 & 4) != 0) {
            num2 = messagesDividerState.textColor;
        }
        if ((i11 & 8) != 0) {
            num3 = messagesDividerState.textStyle;
        }
        return messagesDividerState.copy(str, num, num2, num3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getDividerColor() {
        return this.dividerColor;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getTextColor() {
        return this.textColor;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getTextStyle() {
        return this.textStyle;
    }

    @NotNull
    public final MessagesDividerState copy(@NotNull String text, @Nullable Integer dividerColor, @Nullable Integer textColor, @Nullable Integer textStyle) {
        text.getClass();
        return new MessagesDividerState(text, dividerColor, textColor, textStyle);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessagesDividerState)) {
            return false;
        }
        MessagesDividerState messagesDividerState = (MessagesDividerState) other;
        return Intrinsics.areEqual(this.text, messagesDividerState.text) && Intrinsics.areEqual(this.dividerColor, messagesDividerState.dividerColor) && Intrinsics.areEqual(this.textColor, messagesDividerState.textColor) && Intrinsics.areEqual(this.textStyle, messagesDividerState.textStyle);
    }

    @Nullable
    public final Integer getDividerColor() {
        return this.dividerColor;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    @Nullable
    public final Integer getTextColor() {
        return this.textColor;
    }

    @Nullable
    public final Integer getTextStyle() {
        return this.textStyle;
    }

    public int hashCode() {
        int iHashCode = this.text.hashCode() * 31;
        Integer num = this.dividerColor;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.textColor;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.textStyle;
        return iHashCode3 + (num3 != null ? num3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "MessagesDividerState(text=" + this.text + ", dividerColor=" + this.dividerColor + ", textColor=" + this.textColor + ", textStyle=" + this.textStyle + ")";
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lzendesk/ui/android/conversation/messagesdivider/MessagesDividerState$Companion;", "", "<init>", "()V", "LABEL_ALPHA", "", "newMessagesDividerState", "Lzendesk/ui/android/conversation/messagesdivider/MessagesDividerState;", "dividerColor", "", "timeDividerState", "context", "Landroid/content/Context;", "textColor", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final MessagesDividerState newMessagesDividerState(int dividerColor) {
            return new MessagesDividerState(null, Integer.valueOf(dividerColor), Integer.valueOf(dividerColor), Integer.valueOf(R.style.TextAppearance_MaterialComponents_Body2), 1, null);
        }

        @NotNull
        public final MessagesDividerState timeDividerState(@NotNull Context context, int textColor) {
            context.getClass();
            return new MessagesDividerState(null, Integer.valueOf(context.getColor(zendesk.ui.android.R.color.zuia_color_transparent)), Integer.valueOf(ColorExtKt.adjustAlpha(textColor, 0.65f)), Integer.valueOf(R.style.TextAppearance_MaterialComponents_Caption), 1, null);
        }

        private Companion() {
        }
    }

    public MessagesDividerState(@NotNull String str, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3) {
        str.getClass();
        this.text = str;
        this.dividerColor = num;
        this.textColor = num2;
        this.textStyle = num3;
    }

    public MessagesDividerState() {
        this(null, null, null, null, 15, null);
    }
}
