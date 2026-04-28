package zendesk.conversationkit.android.model;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u001a7\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\t\u001a\n\u0010\n\u001a\u00020\u0001*\u00020\u0002¨\u0006\u000b"}, d2 = {"shouldShowBanner", "", "Lzendesk/conversationkit/android/model/WaitTimeConfig;", "lower", "", "upper", "queuePos", "", "lowestQueuePos", "(Lzendesk/conversationkit/android/model/WaitTimeConfig;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;)Z", "shouldContinuePoll", "zendesk.conversationkit_conversationkit-android"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class WaitTimeConfigKt {
    public static final boolean shouldContinuePoll(@NotNull WaitTimeConfig waitTimeConfig) {
        waitTimeConfig.getClass();
        return waitTimeConfig.getWaitTimeEnabled() || waitTimeConfig.getQueuePositionEnabled();
    }

    public static final boolean shouldShowBanner(@NotNull WaitTimeConfig waitTimeConfig, @Nullable Long l, @Nullable Long l7, @Nullable Integer num, @Nullable Integer num2) {
        waitTimeConfig.getClass();
        boolean z11 = l == null && l7 == null;
        boolean z12 = num == null && num2 == null;
        if (!waitTimeConfig.getWaitTimeEnabled() && !waitTimeConfig.getQueuePositionEnabled()) {
            return false;
        }
        if (waitTimeConfig.getWaitTimeEnabled() && z11 && !waitTimeConfig.getQueuePositionEnabled()) {
            return false;
        }
        if (waitTimeConfig.getQueuePositionEnabled() && z12 && !waitTimeConfig.getWaitTimeEnabled()) {
            return false;
        }
        return (z11 && z12) ? false : true;
    }
}
