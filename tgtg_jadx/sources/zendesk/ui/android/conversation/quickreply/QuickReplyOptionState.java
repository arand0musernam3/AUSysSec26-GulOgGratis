package zendesk.ui.android.conversation.quickreply;

import e0.f;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0010\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\u0011J\u000e\u0010\u0012\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\u0013J\u000e\u0010\u0014\u001a\u00020\u0006HÀ\u0003¢\u0006\u0002\b\u0015J\u000e\u0010\u0016\u001a\u00020\u0006HÀ\u0003¢\u0006\u0002\b\u0017J1\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001e"}, d2 = {"Lzendesk/ui/android/conversation/quickreply/QuickReplyOptionState;", "", "id", "", TextBundle.TEXT_ENTRY, "color", "", "backgroundColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;II)V", "getId$zendesk_ui_ui_android", "()Ljava/lang/String;", "getText$zendesk_ui_ui_android", "getColor$zendesk_ui_ui_android", "()I", "getBackgroundColor$zendesk_ui_ui_android", "component1", "component1$zendesk_ui_ui_android", "component2", "component2$zendesk_ui_ui_android", "component3", "component3$zendesk_ui_ui_android", "component4", "component4$zendesk_ui_ui_android", "copy", "equals", "", "other", "hashCode", "toString", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class QuickReplyOptionState {
    public static final int $stable = 0;
    private final int backgroundColor;
    private final int color;

    @NotNull
    private final String id;

    @NotNull
    private final String text;

    public /* synthetic */ QuickReplyOptionState(String str, String str2, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? "" : str2, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    public static /* synthetic */ QuickReplyOptionState copy$default(QuickReplyOptionState quickReplyOptionState, String str, String str2, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = quickReplyOptionState.id;
        }
        if ((i13 & 2) != 0) {
            str2 = quickReplyOptionState.text;
        }
        if ((i13 & 4) != 0) {
            i11 = quickReplyOptionState.color;
        }
        if ((i13 & 8) != 0) {
            i12 = quickReplyOptionState.backgroundColor;
        }
        return quickReplyOptionState.copy(str, str2, i11, i12);
    }

    @NotNull
    /* JADX INFO: renamed from: component1$zendesk_ui_ui_android, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2$zendesk_ui_ui_android, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component3$zendesk_ui_ui_android, reason: from getter */
    public final int getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: component4$zendesk_ui_ui_android, reason: from getter */
    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final QuickReplyOptionState copy(@NotNull String id2, @NotNull String text, int color, int backgroundColor) {
        id2.getClass();
        text.getClass();
        return new QuickReplyOptionState(id2, text, color, backgroundColor);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QuickReplyOptionState)) {
            return false;
        }
        QuickReplyOptionState quickReplyOptionState = (QuickReplyOptionState) other;
        return Intrinsics.areEqual(this.id, quickReplyOptionState.id) && Intrinsics.areEqual(this.text, quickReplyOptionState.text) && this.color == quickReplyOptionState.color && this.backgroundColor == quickReplyOptionState.backgroundColor;
    }

    public final int getBackgroundColor$zendesk_ui_ui_android() {
        return this.backgroundColor;
    }

    public final int getColor$zendesk_ui_ui_android() {
        return this.color;
    }

    @NotNull
    public final String getId$zendesk_ui_ui_android() {
        return this.id;
    }

    @NotNull
    public final String getText$zendesk_ui_ui_android() {
        return this.text;
    }

    public int hashCode() {
        return Integer.hashCode(this.backgroundColor) + k.b(this.color, l1.b(this.id.hashCode() * 31, 31, this.text), 31);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.text;
        int i11 = this.color;
        int i12 = this.backgroundColor;
        StringBuilder sbT = f.t("QuickReplyOptionState(id=", str, ", text=", str2, ", color=");
        sbT.append(i11);
        sbT.append(", backgroundColor=");
        sbT.append(i12);
        sbT.append(")");
        return sbT.toString();
    }

    public QuickReplyOptionState(@NotNull String str, @NotNull String str2, int i11, int i12) {
        str.getClass();
        str2.getClass();
        this.id = str;
        this.text = str2;
        this.color = i11;
        this.backgroundColor = i12;
    }

    public QuickReplyOptionState() {
        this(null, null, 0, 0, 15, null);
    }
}
