package zendesk.ui.android.conversation.quickreply;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.n0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÀ\u0003¢\u0006\u0002\b\u0010J\u000e\u0010\u0011\u001a\u00020\u0006HÀ\u0003¢\u0006\u0002\b\u0012J\u000e\u0010\u0013\u001a\u00020\u0006HÀ\u0003¢\u0006\u0002\b\u0014J-\u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0007\u001a\u00020\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u001c"}, d2 = {"Lzendesk/ui/android/conversation/quickreply/QuickReplyState;", "", "quickReplyOptions", "", "Lzendesk/ui/android/conversation/quickreply/QuickReplyOption;", "color", "", "backgroundColor", "<init>", "(Ljava/util/List;II)V", "getQuickReplyOptions$zendesk_ui_ui_android", "()Ljava/util/List;", "getColor$zendesk_ui_ui_android", "()I", "getBackgroundColor$zendesk_ui_ui_android", "component1", "component1$zendesk_ui_ui_android", "component2", "component2$zendesk_ui_ui_android", "component3", "component3$zendesk_ui_ui_android", "copy", "equals", "", "other", "hashCode", "toString", "", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class QuickReplyState {
    public static final int $stable = 8;
    private final int backgroundColor;
    private final int color;

    @NotNull
    private final List<QuickReplyOption> quickReplyOptions;

    public QuickReplyState(List list, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? n0.f26529a : list, (i13 & 2) != 0 ? 0 : i11, (i13 & 4) != 0 ? 0 : i12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QuickReplyState copy$default(QuickReplyState quickReplyState, List list, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = quickReplyState.quickReplyOptions;
        }
        if ((i13 & 2) != 0) {
            i11 = quickReplyState.color;
        }
        if ((i13 & 4) != 0) {
            i12 = quickReplyState.backgroundColor;
        }
        return quickReplyState.copy(list, i11, i12);
    }

    @NotNull
    public final List<QuickReplyOption> component1$zendesk_ui_ui_android() {
        return this.quickReplyOptions;
    }

    /* JADX INFO: renamed from: component2$zendesk_ui_ui_android, reason: from getter */
    public final int getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: component3$zendesk_ui_ui_android, reason: from getter */
    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final QuickReplyState copy(@NotNull List<QuickReplyOption> quickReplyOptions, int color, int backgroundColor) {
        quickReplyOptions.getClass();
        return new QuickReplyState(quickReplyOptions, color, backgroundColor);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QuickReplyState)) {
            return false;
        }
        QuickReplyState quickReplyState = (QuickReplyState) other;
        return Intrinsics.areEqual(this.quickReplyOptions, quickReplyState.quickReplyOptions) && this.color == quickReplyState.color && this.backgroundColor == quickReplyState.backgroundColor;
    }

    public final int getBackgroundColor$zendesk_ui_ui_android() {
        return this.backgroundColor;
    }

    public final int getColor$zendesk_ui_ui_android() {
        return this.color;
    }

    @NotNull
    public final List<QuickReplyOption> getQuickReplyOptions$zendesk_ui_ui_android() {
        return this.quickReplyOptions;
    }

    public int hashCode() {
        return Integer.hashCode(this.backgroundColor) + k.b(this.color, this.quickReplyOptions.hashCode() * 31, 31);
    }

    @NotNull
    public String toString() {
        List<QuickReplyOption> list = this.quickReplyOptions;
        int i11 = this.color;
        int i12 = this.backgroundColor;
        StringBuilder sb2 = new StringBuilder("QuickReplyState(quickReplyOptions=");
        sb2.append(list);
        sb2.append(", color=");
        sb2.append(i11);
        sb2.append(", backgroundColor=");
        return k.i(i12, ")", sb2);
    }

    public QuickReplyState(@NotNull List<QuickReplyOption> list, int i11, int i12) {
        list.getClass();
        this.quickReplyOptions = list;
        this.color = i11;
        this.backgroundColor = i12;
    }

    public QuickReplyState() {
        this(null, 0, 0, 7, null);
    }
}
