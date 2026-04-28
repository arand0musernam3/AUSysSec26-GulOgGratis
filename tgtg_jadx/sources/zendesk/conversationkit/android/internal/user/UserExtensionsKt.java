package zendesk.conversationkit.android.internal.user;

import e0.f;
import ia0.j;
import java.nio.charset.Charset;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zendesk.conversationkit.android.model.AuthenticationType;
import zendesk.conversationkit.android.model.Conversation;
import zendesk.conversationkit.android.model.User;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"authorization", "", "Lzendesk/conversationkit/android/model/User;", "getAuthorization", "(Lzendesk/conversationkit/android/model/User;)Ljava/lang/String;", "defaultConversationId", "getDefaultConversationId", "zendesk.conversationkit_conversationkit-android"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nUserExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserExtensions.kt\nzendesk/conversationkit/android/internal/user/UserExtensionsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,33:1\n295#2,2:34\n*S KotlinDebug\n*F\n+ 1 UserExtensions.kt\nzendesk/conversationkit/android/internal/user/UserExtensionsKt\n*L\n32#1:34,2\n*E\n"})
public final class UserExtensionsKt {
    @NotNull
    public static final String getAuthorization(@NotNull User user) {
        user.getClass();
        AuthenticationType authenticationType = user.getAuthenticationType();
        if (authenticationType instanceof AuthenticationType.Jwt) {
            return f.k("Bearer ", ((AuthenticationType.Jwt) authenticationType).getValue());
        }
        if (!(authenticationType instanceof AuthenticationType.SessionToken)) {
            return "";
        }
        String id2 = user.getId();
        String value = ((AuthenticationType.SessionToken) authenticationType).getValue();
        Charset charset = Charsets.f26581e;
        id2.getClass();
        value.getClass();
        charset.getClass();
        byte[] bytes = (id2 + ':' + value).getBytes(charset);
        bytes.getClass();
        return "Basic ".concat(new j(bytes).a());
    }

    @Nullable
    public static final String getDefaultConversationId(@NotNull User user) {
        Object next;
        user.getClass();
        Iterator<T> it = user.getConversations().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((Conversation) next).isDefault()) {
                break;
            }
        }
        Conversation conversation = (Conversation) next;
        if (conversation != null) {
            return conversation.getId();
        }
        return null;
    }
}
