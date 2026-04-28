package zendesk.android.internal;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x70.c;
import zendesk.android.Zendesk;
import zendesk.android.internal.ZendeskError;
import zendesk.conversationkit.android.internal.metadata.ConversationMetadataService;
import zendesk.logger.Logger;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0096@¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\r\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u0011\u0010\u0010¨\u0006\u0012"}, d2 = {"Lzendesk/android/internal/NotInitializedConversationMetadataService;", "Lzendesk/conversationkit/android/internal/metadata/ConversationMetadataService;", "<init>", "()V", "", "", "", "fields", "", "addConversationFields", "(Ljava/util/Map;Lx70/c;)Ljava/lang/Object;", "", "tags", "addConversationTags", "(Ljava/util/List;Lx70/c;)Ljava/lang/Object;", "removeConversationFields", "(Lx70/c;)Ljava/lang/Object;", "removeConversationTags", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class NotInitializedConversationMetadataService implements ConversationMetadataService {

    @NotNull
    public static final NotInitializedConversationMetadataService INSTANCE = new NotInitializedConversationMetadataService();

    private NotInitializedConversationMetadataService() {
    }

    @Override // zendesk.conversationkit.android.internal.metadata.ConversationMetadataService
    @Nullable
    public Object addConversationFields(@NotNull Map<String, ? extends Object> map, @NotNull c<? super Unit> cVar) {
        Logger.w(Zendesk.LOG_TAG, ZendeskError.NotInitialized.INSTANCE.getMessage(), new Object[0]);
        return Unit.f26487a;
    }

    @Override // zendesk.conversationkit.android.internal.metadata.ConversationMetadataService
    @Nullable
    public Object addConversationTags(@NotNull List<String> list, @NotNull c<? super Unit> cVar) {
        Logger.w(Zendesk.LOG_TAG, ZendeskError.NotInitialized.INSTANCE.getMessage(), new Object[0]);
        return Unit.f26487a;
    }

    @Override // zendesk.conversationkit.android.internal.metadata.ConversationMetadataService
    @Nullable
    public Object removeConversationFields(@NotNull c<? super Unit> cVar) {
        Logger.w(Zendesk.LOG_TAG, ZendeskError.NotInitialized.INSTANCE.getMessage(), new Object[0]);
        return Unit.f26487a;
    }

    @Override // zendesk.conversationkit.android.internal.metadata.ConversationMetadataService
    @Nullable
    public Object removeConversationTags(@NotNull c<? super Unit> cVar) {
        Logger.w(Zendesk.LOG_TAG, ZendeskError.NotInitialized.INSTANCE.getMessage(), new Object[0]);
        return Unit.f26487a;
    }
}
