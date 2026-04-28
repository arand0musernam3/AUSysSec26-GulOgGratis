package zendesk.messaging.android.internal.validation;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ra0.f;
import x70.c;
import zendesk.messaging.android.internal.rest.model.ConversationFieldDto;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Keep
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lzendesk/messaging/android/internal/validation/ConversationFieldService;", "", "", "Lzendesk/messaging/android/internal/rest/model/ConversationFieldDto;", "getConversationFields", "(Lx70/c;)Ljava/lang/Object;", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface ConversationFieldService {
    @f("/embeddable/messaging/custom_ticket_fields")
    @Nullable
    Object getConversationFields(@NotNull c<? super List<ConversationFieldDto>> cVar);
}
