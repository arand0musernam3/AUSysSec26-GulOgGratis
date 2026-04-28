package zendesk.messaging.android.internal.conversationscreen;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JM\u0010\u0004\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0004\u0012\u00020\t0\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\f\u001a\u00020\bH\u0000¢\u0006\u0002\b\r¨\u0006\u000e"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/PostbackMessageStatusUseCase;", "", "<init>", "()V", "updatePostbackStatus", "Lkotlin/Pair;", "", "", "Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenPostbackStatus;", "", "currentStatuses", "actionId", "updatedStatus", "updatePostbackStatus$zendesk_messaging_messaging_android", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PostbackMessageStatusUseCase {

    @NotNull
    public static final PostbackMessageStatusUseCase INSTANCE = new PostbackMessageStatusUseCase();

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ConversationScreenPostbackStatus.values().length];
            try {
                iArr[ConversationScreenPostbackStatus.FAILED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ConversationScreenPostbackStatus.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ConversationScreenPostbackStatus.LOADING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private PostbackMessageStatusUseCase() {
    }

    public static /* synthetic */ Pair updatePostbackStatus$zendesk_messaging_messaging_android$default(PostbackMessageStatusUseCase postbackMessageStatusUseCase, Map map, String str, ConversationScreenPostbackStatus conversationScreenPostbackStatus, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        return postbackMessageStatusUseCase.updatePostbackStatus$zendesk_messaging_messaging_android(map, str, conversationScreenPostbackStatus);
    }

    @NotNull
    public final Pair<Map<String, ConversationScreenPostbackStatus>, Boolean> updatePostbackStatus$zendesk_messaging_messaging_android(@NotNull Map<String, ConversationScreenPostbackStatus> currentStatuses, @Nullable String actionId, @NotNull ConversationScreenPostbackStatus updatedStatus) {
        currentStatuses.getClass();
        updatedStatus.getClass();
        int i11 = WhenMappings.$EnumSwitchMapping$0[updatedStatus.ordinal()];
        boolean z11 = true;
        if (i11 == 1) {
            currentStatuses.clear();
        } else {
            if (i11 != 2 && i11 != 3) {
                e40.a.f();
                return null;
            }
            if (actionId != null) {
                currentStatuses.put(actionId, updatedStatus);
            }
            z11 = false;
        }
        return new Pair<>(currentStatuses, Boolean.valueOf(z11));
    }
}
