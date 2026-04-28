package zendesk.messaging.android.push.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lzendesk/messaging/android/push/internal/NotificationDisplayedState;", "", "Idle", "Displayed", "Lzendesk/messaging/android/push/internal/NotificationDisplayedState$Displayed;", "Lzendesk/messaging/android/push/internal/NotificationDisplayedState$Idle;", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface NotificationDisplayedState {

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lzendesk/messaging/android/push/internal/NotificationDisplayedState$Displayed;", "Lzendesk/messaging/android/push/internal/NotificationDisplayedState;", "conversationId", "", "messageReceivedTimestamp", "", "<init>", "(Ljava/lang/String;D)V", "getConversationId", "()Ljava/lang/String;", "getMessageReceivedTimestamp", "()D", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Displayed implements NotificationDisplayedState {

        @NotNull
        private final String conversationId;
        private final double messageReceivedTimestamp;

        public Displayed(@NotNull String str, double d3) {
            str.getClass();
            this.conversationId = str;
            this.messageReceivedTimestamp = d3;
        }

        public static /* synthetic */ Displayed copy$default(Displayed displayed, String str, double d3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = displayed.conversationId;
            }
            if ((i11 & 2) != 0) {
                d3 = displayed.messageReceivedTimestamp;
            }
            return displayed.copy(str, d3);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getConversationId() {
            return this.conversationId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final double getMessageReceivedTimestamp() {
            return this.messageReceivedTimestamp;
        }

        @NotNull
        public final Displayed copy(@NotNull String conversationId, double messageReceivedTimestamp) {
            conversationId.getClass();
            return new Displayed(conversationId, messageReceivedTimestamp);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Displayed)) {
                return false;
            }
            Displayed displayed = (Displayed) other;
            return Intrinsics.areEqual(this.conversationId, displayed.conversationId) && Double.compare(this.messageReceivedTimestamp, displayed.messageReceivedTimestamp) == 0;
        }

        @NotNull
        public final String getConversationId() {
            return this.conversationId;
        }

        public final double getMessageReceivedTimestamp() {
            return this.messageReceivedTimestamp;
        }

        public int hashCode() {
            return Double.hashCode(this.messageReceivedTimestamp) + (this.conversationId.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "Displayed(conversationId=" + this.conversationId + ", messageReceivedTimestamp=" + this.messageReceivedTimestamp + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lzendesk/messaging/android/push/internal/NotificationDisplayedState$Idle;", "Lzendesk/messaging/android/push/internal/NotificationDisplayedState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Idle implements NotificationDisplayedState {

        @NotNull
        public static final Idle INSTANCE = new Idle();

        private Idle() {
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Idle);
        }

        public int hashCode() {
            return -1099557329;
        }

        @NotNull
        public String toString() {
            return "Idle";
        }
    }
}
