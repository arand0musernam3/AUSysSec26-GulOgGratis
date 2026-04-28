package zendesk.ui.android.conversation.activitymessage;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\f\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\rJ\u000e\u0010\u000e\u001a\u00020\u0005HÀ\u0003¢\u0006\u0002\b\u000fJ\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lzendesk/ui/android/conversation/activitymessage/ActivityMessageState;", "", TextBundle.TEXT_ENTRY, "", "textColor", "", "<init>", "(Ljava/lang/String;I)V", "getText$zendesk_ui_ui_android", "()Ljava/lang/String;", "getTextColor$zendesk_ui_ui_android", "()I", "component1", "component1$zendesk_ui_ui_android", "component2", "component2$zendesk_ui_ui_android", "copy", "equals", "", "other", "hashCode", "toString", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ActivityMessageState {
    public static final int $stable = 0;

    @NotNull
    private final String text;
    private final int textColor;

    public /* synthetic */ ActivityMessageState(String str, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? "" : str, (i12 & 2) != 0 ? 0 : i11);
    }

    public static /* synthetic */ ActivityMessageState copy$default(ActivityMessageState activityMessageState, String str, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = activityMessageState.text;
        }
        if ((i12 & 2) != 0) {
            i11 = activityMessageState.textColor;
        }
        return activityMessageState.copy(str, i11);
    }

    @NotNull
    /* JADX INFO: renamed from: component1$zendesk_ui_ui_android, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component2$zendesk_ui_ui_android, reason: from getter */
    public final int getTextColor() {
        return this.textColor;
    }

    @NotNull
    public final ActivityMessageState copy(@NotNull String text, int textColor) {
        text.getClass();
        return new ActivityMessageState(text, textColor);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActivityMessageState)) {
            return false;
        }
        ActivityMessageState activityMessageState = (ActivityMessageState) other;
        return Intrinsics.areEqual(this.text, activityMessageState.text) && this.textColor == activityMessageState.textColor;
    }

    @NotNull
    public final String getText$zendesk_ui_ui_android() {
        return this.text;
    }

    public final int getTextColor$zendesk_ui_ui_android() {
        return this.textColor;
    }

    public int hashCode() {
        return Integer.hashCode(this.textColor) + (this.text.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "ActivityMessageState(text=" + this.text + ", textColor=" + this.textColor + ")";
    }

    public ActivityMessageState(@NotNull String str, int i11) {
        str.getClass();
        this.text = str;
        this.textColor = i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ActivityMessageState() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }
}
