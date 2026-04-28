package zendesk.conversationkit.android.internal.metadata;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x70.c;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J$\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002H¦@¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\n\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\bH¦@¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0005H¦@¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0005H¦@¢\u0006\u0004\b\u000e\u0010\r¨\u0006\u000f"}, d2 = {"Lzendesk/conversationkit/android/internal/metadata/ConversationMetadataService;", "", "", "", "fields", "", "addConversationFields", "(Ljava/util/Map;Lx70/c;)Ljava/lang/Object;", "", "tags", "addConversationTags", "(Ljava/util/List;Lx70/c;)Ljava/lang/Object;", "removeConversationFields", "(Lx70/c;)Ljava/lang/Object;", "removeConversationTags", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface ConversationMetadataService {
    @Nullable
    Object addConversationFields(@NotNull Map<String, ? extends Object> map, @NotNull c<? super Unit> cVar);

    @Nullable
    Object addConversationTags(@NotNull List<String> list, @NotNull c<? super Unit> cVar);

    @Nullable
    Object removeConversationFields(@NotNull c<? super Unit> cVar);

    @Nullable
    Object removeConversationTags(@NotNull c<? super Unit> cVar);
}
