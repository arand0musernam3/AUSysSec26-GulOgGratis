package zendesk.conversationkit.android.internal;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import zendesk.conversationkit.android.ConversationKitEvent;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlin/Function1;", "Lzendesk/conversationkit/android/internal/EventReceiver;", "", "block", "", "Lzendesk/conversationkit/android/ConversationKitEvent;", "mapEvents", "(Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "zendesk.conversationkit_conversationkit-android"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class EffectMapperKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final List<ConversationKitEvent> mapEvents(Function1<? super EventReceiver, Unit> function1) {
        return new EventReceiver(function1).toList();
    }
}
