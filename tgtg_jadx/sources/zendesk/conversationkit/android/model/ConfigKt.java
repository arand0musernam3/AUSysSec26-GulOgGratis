package zendesk.conversationkit.android.model;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u0012\u0010\u0003\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"waitTimePollingInterval", "", "Lzendesk/conversationkit/android/model/Config;", "exponentialBackoffInterval", "retry", "", "zendesk.conversationkit_conversationkit-android"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ConfigKt {
    public static final long exponentialBackoffInterval(@NotNull Config config, int i11) {
        config.getClass();
        return config.getRestRetryPolicy().getBackoffMultiplier() * i11 * config.getRestRetryPolicy().getRegular();
    }

    public static final long waitTimePollingInterval(@NotNull Config config) {
        config.getClass();
        return config.getIntegration().getWaitTimeConfig().getQueuePollingInterval();
    }
}
