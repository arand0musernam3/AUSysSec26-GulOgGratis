package zendesk.messaging.android.internal.conversationscreen.waittimebanner;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/waittimebanner/WaitTimeBannerAnalyticsEvent;", "", "TrackAgentQueued", "TrackAgentAssigned", "Lzendesk/messaging/android/internal/conversationscreen/waittimebanner/WaitTimeBannerAnalyticsEvent$TrackAgentAssigned;", "Lzendesk/messaging/android/internal/conversationscreen/waittimebanner/WaitTimeBannerAnalyticsEvent$TrackAgentQueued;", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface WaitTimeBannerAnalyticsEvent {

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/waittimebanner/WaitTimeBannerAnalyticsEvent$TrackAgentAssigned;", "Lzendesk/messaging/android/internal/conversationscreen/waittimebanner/WaitTimeBannerAnalyticsEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class TrackAgentAssigned implements WaitTimeBannerAnalyticsEvent {

        @NotNull
        public static final TrackAgentAssigned INSTANCE = new TrackAgentAssigned();

        private TrackAgentAssigned() {
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof TrackAgentAssigned);
        }

        public int hashCode() {
            return 1058558589;
        }

        @NotNull
        public String toString() {
            return "TrackAgentAssigned";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/waittimebanner/WaitTimeBannerAnalyticsEvent$TrackAgentQueued;", "Lzendesk/messaging/android/internal/conversationscreen/waittimebanner/WaitTimeBannerAnalyticsEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class TrackAgentQueued implements WaitTimeBannerAnalyticsEvent {

        @NotNull
        public static final TrackAgentQueued INSTANCE = new TrackAgentQueued();

        private TrackAgentQueued() {
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof TrackAgentQueued);
        }

        public int hashCode() {
            return -1930449438;
        }

        @NotNull
        public String toString() {
            return "TrackAgentQueued";
        }
    }
}
