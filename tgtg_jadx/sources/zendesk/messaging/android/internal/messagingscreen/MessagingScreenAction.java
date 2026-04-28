package zendesk.messaging.android.internal.messagingscreen;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lzendesk/messaging/android/internal/messagingscreen/MessagingScreenAction;", "", "ResolveScreen", "LaunchConversationScreenFromNotification", "NavigationComplete", "Lzendesk/messaging/android/internal/messagingscreen/MessagingScreenAction$LaunchConversationScreenFromNotification;", "Lzendesk/messaging/android/internal/messagingscreen/MessagingScreenAction$NavigationComplete;", "Lzendesk/messaging/android/internal/messagingscreen/MessagingScreenAction$ResolveScreen;", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface MessagingScreenAction {

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lzendesk/messaging/android/internal/messagingscreen/MessagingScreenAction$NavigationComplete;", "Lzendesk/messaging/android/internal/messagingscreen/MessagingScreenAction;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class NavigationComplete implements MessagingScreenAction {

        @NotNull
        public static final NavigationComplete INSTANCE = new NavigationComplete();

        private NavigationComplete() {
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof NavigationComplete);
        }

        public int hashCode() {
            return -177346007;
        }

        @NotNull
        public String toString() {
            return "NavigationComplete";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lzendesk/messaging/android/internal/messagingscreen/MessagingScreenAction$ResolveScreen;", "Lzendesk/messaging/android/internal/messagingscreen/MessagingScreenAction;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ResolveScreen implements MessagingScreenAction {

        @NotNull
        public static final ResolveScreen INSTANCE = new ResolveScreen();

        private ResolveScreen() {
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof ResolveScreen);
        }

        public int hashCode() {
            return -1566430916;
        }

        @NotNull
        public String toString() {
            return "ResolveScreen";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lzendesk/messaging/android/internal/messagingscreen/MessagingScreenAction$LaunchConversationScreenFromNotification;", "Lzendesk/messaging/android/internal/messagingscreen/MessagingScreenAction;", "conversationId", "", "proactiveId", "", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;)V", "getConversationId", "()Ljava/lang/String;", "getProactiveId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Integer;)Lzendesk/messaging/android/internal/messagingscreen/MessagingScreenAction$LaunchConversationScreenFromNotification;", "equals", "", "other", "", "hashCode", "toString", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LaunchConversationScreenFromNotification implements MessagingScreenAction {

        @Nullable
        private final String conversationId;

        @Nullable
        private final Integer proactiveId;

        public /* synthetic */ LaunchConversationScreenFromNotification(String str, Integer num, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : num);
        }

        public static /* synthetic */ LaunchConversationScreenFromNotification copy$default(LaunchConversationScreenFromNotification launchConversationScreenFromNotification, String str, Integer num, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = launchConversationScreenFromNotification.conversationId;
            }
            if ((i11 & 2) != 0) {
                num = launchConversationScreenFromNotification.proactiveId;
            }
            return launchConversationScreenFromNotification.copy(str, num);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getConversationId() {
            return this.conversationId;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Integer getProactiveId() {
            return this.proactiveId;
        }

        @NotNull
        public final LaunchConversationScreenFromNotification copy(@Nullable String conversationId, @Nullable Integer proactiveId) {
            return new LaunchConversationScreenFromNotification(conversationId, proactiveId);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LaunchConversationScreenFromNotification)) {
                return false;
            }
            LaunchConversationScreenFromNotification launchConversationScreenFromNotification = (LaunchConversationScreenFromNotification) other;
            return Intrinsics.areEqual(this.conversationId, launchConversationScreenFromNotification.conversationId) && Intrinsics.areEqual(this.proactiveId, launchConversationScreenFromNotification.proactiveId);
        }

        @Nullable
        public final String getConversationId() {
            return this.conversationId;
        }

        @Nullable
        public final Integer getProactiveId() {
            return this.proactiveId;
        }

        public int hashCode() {
            String str = this.conversationId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Integer num = this.proactiveId;
            return iHashCode + (num != null ? num.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "LaunchConversationScreenFromNotification(conversationId=" + this.conversationId + ", proactiveId=" + this.proactiveId + ")";
        }

        public LaunchConversationScreenFromNotification(@Nullable String str, @Nullable Integer num) {
            this.conversationId = str;
            this.proactiveId = num;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public LaunchConversationScreenFromNotification() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }
}
