package zendesk.conversationkit.android.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zendesk.conversationkit.android.ConversationKitEvent;
import zendesk.faye.internal.Bayeux;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\t\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ1\u0010\t\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u000b2\b\u0010\f\u001a\u0004\u0018\u00018\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0002¢\u0006\u0004\b\t\u0010\rJ\u0013\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lzendesk/conversationkit/android/internal/EventReceiver;", "", "Lkotlin/Function1;", "", "block", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Function0;", "Lzendesk/conversationkit/android/ConversationKitEvent;", "event", "(Lkotlin/jvm/functions/Function0;)V", "T", Bayeux.KEY_DATA, "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "", "toList", "()Ljava/util/List;", "", "events", "Ljava/util/List;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class EventReceiver {

    @NotNull
    private final List<ConversationKitEvent> events;

    public EventReceiver(@NotNull Function1<? super EventReceiver, Unit> function1) {
        function1.getClass();
        this.events = new ArrayList();
        function1.invoke(this);
    }

    public final <T> void event(@Nullable T data, @NotNull Function1<? super T, ? extends ConversationKitEvent> block) {
        block.getClass();
        List<ConversationKitEvent> list = this.events;
        if (data == null) {
            return;
        }
        list.add((ConversationKitEvent) block.invoke(data));
    }

    @NotNull
    public final List<ConversationKitEvent> toList() {
        return CollectionsKt.r0(this.events);
    }

    public final void event(@NotNull Function0<? extends ConversationKitEvent> block) {
        block.getClass();
        this.events.add((ConversationKitEvent) block.invoke());
    }
}
