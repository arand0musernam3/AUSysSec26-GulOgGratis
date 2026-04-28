package zendesk.messaging.android.internal.conversationslistscreen.list;

import androidx.recyclerview.widget.w;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zendesk.core.ui.android.internal.model.ConversationEntry;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lzendesk/messaging/android/internal/conversationslistscreen/list/ConversationDiffCallback;", "Landroidx/recyclerview/widget/w;", "Lzendesk/core/ui/android/internal/model/ConversationEntry;", "<init>", "()V", "oldItem", "newItem", "", "areItemsTheSame", "(Lzendesk/core/ui/android/internal/model/ConversationEntry;Lzendesk/core/ui/android/internal/model/ConversationEntry;)Z", "areContentsTheSame", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class ConversationDiffCallback extends w {

    @NotNull
    public static final ConversationDiffCallback INSTANCE = new ConversationDiffCallback();

    private ConversationDiffCallback() {
    }

    @Override // androidx.recyclerview.widget.w
    public boolean areContentsTheSame(@NotNull ConversationEntry oldItem, @NotNull ConversationEntry newItem) {
        oldItem.getClass();
        newItem.getClass();
        return Intrinsics.areEqual(oldItem, newItem);
    }

    @Override // androidx.recyclerview.widget.w
    public boolean areItemsTheSame(@NotNull ConversationEntry oldItem, @NotNull ConversationEntry newItem) {
        oldItem.getClass();
        newItem.getClass();
        return Intrinsics.areEqual(oldItem.getId(), newItem.getId());
    }
}
