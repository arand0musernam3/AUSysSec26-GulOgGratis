package zendesk.conversationkit.android.internal.metadata;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x70.c;
import y70.a;
import zendesk.conversationkit.android.internal.Action;
import zendesk.conversationkit.android.internal.ConversationKitStore;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u00020\n2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0096@¢\u0006\u0004\b\u000b\u0010\fJ\u001e\u0010\u000f\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\rH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014¨\u0006\u0015"}, d2 = {"Lzendesk/conversationkit/android/internal/metadata/DefaultConversationMetadataService;", "Lzendesk/conversationkit/android/internal/metadata/ConversationMetadataService;", "Lzendesk/conversationkit/android/internal/ConversationKitStore;", "conversationKitStore", "<init>", "(Lzendesk/conversationkit/android/internal/ConversationKitStore;)V", "", "", "", "fields", "", "addConversationFields", "(Ljava/util/Map;Lx70/c;)Ljava/lang/Object;", "", "tags", "addConversationTags", "(Ljava/util/List;Lx70/c;)Ljava/lang/Object;", "removeConversationFields", "(Lx70/c;)Ljava/lang/Object;", "removeConversationTags", "Lzendesk/conversationkit/android/internal/ConversationKitStore;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DefaultConversationMetadataService implements ConversationMetadataService {

    @NotNull
    private final ConversationKitStore conversationKitStore;

    public DefaultConversationMetadataService(@NotNull ConversationKitStore conversationKitStore) {
        conversationKitStore.getClass();
        this.conversationKitStore = conversationKitStore;
    }

    @Override // zendesk.conversationkit.android.internal.metadata.ConversationMetadataService
    @Nullable
    public Object addConversationFields(@NotNull Map<String, ? extends Object> map, @NotNull c<? super Unit> cVar) {
        Object objDispatch = this.conversationKitStore.dispatch(new Action.AddConversationFields(map), cVar);
        return objDispatch == a.COROUTINE_SUSPENDED ? objDispatch : Unit.f26487a;
    }

    @Override // zendesk.conversationkit.android.internal.metadata.ConversationMetadataService
    @Nullable
    public Object addConversationTags(@NotNull List<String> list, @NotNull c<? super Unit> cVar) {
        Object objDispatch = this.conversationKitStore.dispatch(new Action.AddConversationTags(list), cVar);
        return objDispatch == a.COROUTINE_SUSPENDED ? objDispatch : Unit.f26487a;
    }

    @Override // zendesk.conversationkit.android.internal.metadata.ConversationMetadataService
    @Nullable
    public Object removeConversationFields(@NotNull c<? super Unit> cVar) {
        Object objDispatch = this.conversationKitStore.dispatch(Action.ClearConversationFields.INSTANCE, cVar);
        return objDispatch == a.COROUTINE_SUSPENDED ? objDispatch : Unit.f26487a;
    }

    @Override // zendesk.conversationkit.android.internal.metadata.ConversationMetadataService
    @Nullable
    public Object removeConversationTags(@NotNull c<? super Unit> cVar) {
        Object objDispatch = this.conversationKitStore.dispatch(Action.ClearConversationTags.INSTANCE, cVar);
        return objDispatch == a.COROUTINE_SUSPENDED ? objDispatch : Unit.f26487a;
    }
}
