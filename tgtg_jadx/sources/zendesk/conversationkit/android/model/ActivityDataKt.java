package zendesk.conversationkit.android.model;

import java.util.Date;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zendesk.conversationkit.android.internal.faye.WsActivityEventDto;
import zendesk.conversationkit.android.internal.faye.WsResponseTimeDto;
import zendesk.core.android.internal.DateKtxKt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a#\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0002\u0010\u0007\u001a\u000e\u0010\b\u001a\u0004\u0018\u00010\t*\u00020\nH\u0000¨\u0006\u000b"}, d2 = {"toActivityEvent", "Lzendesk/conversationkit/android/model/ActivityEvent;", "Lzendesk/conversationkit/android/internal/faye/WsActivityEventDto;", "conversationId", "", "appMakerLastRead", "", "(Lzendesk/conversationkit/android/internal/faye/WsActivityEventDto;Ljava/lang/String;Ljava/lang/Double;)Lzendesk/conversationkit/android/model/ActivityEvent;", "toConversationRoutingStatus", "Lzendesk/conversationkit/android/model/ConversationRoutingStatus;", "Lzendesk/conversationkit/android/model/ActivityData;", "zendesk.conversationkit_conversationkit-android"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nActivityData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityData.kt\nzendesk/conversationkit/android/model/ActivityDataKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,123:1\n1#2:124\n*E\n"})
public final class ActivityDataKt {

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ActivityData.values().length];
            try {
                iArr[ActivityData.CONVERSATION_ROUTING_QUEUED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ActivityData.CONVERSATION_ROUTING_ASSIGNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ActivityData.CONVERSATION_ROUTING_CLEARED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final ActivityEvent toActivityEvent(@NotNull WsActivityEventDto wsActivityEventDto, @NotNull String str, @Nullable Double d3) {
        Object obj;
        Object next;
        wsActivityEventDto.getClass();
        str.getClass();
        Iterator<E> it = ActivityData.getEntries().iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((ActivityData) next).getType(), wsActivityEventDto.getType())) {
                break;
            }
        }
        ActivityData activityData = (ActivityData) next;
        String appUserId = wsActivityEventDto.getAppUserId();
        String name = wsActivityEventDto.getData().getName();
        String avatarUrl = wsActivityEventDto.getData().getAvatarUrl();
        Iterator<E> it2 = AuthorType.getEntries().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            if (Intrinsics.areEqual(((AuthorType) next2).getValue(), wsActivityEventDto.getRole())) {
                obj = next2;
                break;
            }
        }
        AuthorType authorType = (AuthorType) obj;
        Date date = Intrinsics.areEqual(AuthorType.BUSINESS.getValue(), wsActivityEventDto.getRole()) ? DateKtxKt.toDate(d3) : DateKtxKt.toDate(wsActivityEventDto.getData().getLastRead());
        WsResponseTimeDto responseTime = wsActivityEventDto.getData().getResponseTime();
        Long queuePosition = wsActivityEventDto.getData().getQueuePosition();
        Long lValueOf = Long.valueOf(queuePosition != null ? queuePosition.longValue() : 0L);
        Long lowestQueuePosition = wsActivityEventDto.getData().getLowestQueuePosition();
        return new ActivityEvent(str, activityData, appUserId, name, avatarUrl, authorType, date, responseTime, lValueOf, Long.valueOf(lowestQueuePosition != null ? lowestQueuePosition.longValue() : 0L));
    }

    @Nullable
    public static final ConversationRoutingStatus toConversationRoutingStatus(@NotNull ActivityData activityData) {
        activityData.getClass();
        int i11 = WhenMappings.$EnumSwitchMapping$0[activityData.ordinal()];
        if (i11 == 1) {
            return ConversationRoutingStatus.QUEUED;
        }
        if (i11 == 2) {
            return ConversationRoutingStatus.ASSIGNED;
        }
        if (i11 != 3) {
            return null;
        }
        return ConversationRoutingStatus.UNKNOWN;
    }
}
