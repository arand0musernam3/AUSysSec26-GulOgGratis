package zendesk.messaging.android.internal.messagingscreen;

import com.adyen.checkout.components.core.internal.util.StatusResponseUtils;
import e0.f;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zendesk.android.messaging.MessagingScreen;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lzendesk/messaging/android/internal/messagingscreen/MessagingFragmentScreen;", "", "ConversationFragmentScreen", "ConversationListFragmentScreen", "FailedResolvedFragmentScreen", "MainAppScreen", "Lzendesk/messaging/android/internal/messagingscreen/MessagingFragmentScreen$ConversationFragmentScreen;", "Lzendesk/messaging/android/internal/messagingscreen/MessagingFragmentScreen$ConversationListFragmentScreen;", "Lzendesk/messaging/android/internal/messagingscreen/MessagingFragmentScreen$FailedResolvedFragmentScreen;", "Lzendesk/messaging/android/internal/messagingscreen/MessagingFragmentScreen$MainAppScreen;", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface MessagingFragmentScreen {

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lzendesk/messaging/android/internal/messagingscreen/MessagingFragmentScreen$ConversationListFragmentScreen;", "Lzendesk/messaging/android/internal/messagingscreen/MessagingFragmentScreen;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ConversationListFragmentScreen implements MessagingFragmentScreen {

        @NotNull
        public static final ConversationListFragmentScreen INSTANCE = new ConversationListFragmentScreen();

        private ConversationListFragmentScreen() {
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof ConversationListFragmentScreen);
        }

        public int hashCode() {
            return -1444307617;
        }

        @NotNull
        public String toString() {
            return "ConversationListFragmentScreen";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lzendesk/messaging/android/internal/messagingscreen/MessagingFragmentScreen$FailedResolvedFragmentScreen;", "Lzendesk/messaging/android/internal/messagingscreen/MessagingFragmentScreen;", StatusResponseUtils.RESULT_ERROR, "", "<init>", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FailedResolvedFragmentScreen implements MessagingFragmentScreen {

        @NotNull
        private final Throwable error;

        public FailedResolvedFragmentScreen(@NotNull Throwable th2) {
            th2.getClass();
            this.error = th2;
        }

        public static /* synthetic */ FailedResolvedFragmentScreen copy$default(FailedResolvedFragmentScreen failedResolvedFragmentScreen, Throwable th2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                th2 = failedResolvedFragmentScreen.error;
            }
            return failedResolvedFragmentScreen.copy(th2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Throwable getError() {
            return this.error;
        }

        @NotNull
        public final FailedResolvedFragmentScreen copy(@NotNull Throwable error) {
            error.getClass();
            return new FailedResolvedFragmentScreen(error);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof FailedResolvedFragmentScreen) && Intrinsics.areEqual(this.error, ((FailedResolvedFragmentScreen) other).error);
        }

        @NotNull
        public final Throwable getError() {
            return this.error;
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        @NotNull
        public String toString() {
            return f.l("FailedResolvedFragmentScreen(error=", ")", this.error);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lzendesk/messaging/android/internal/messagingscreen/MessagingFragmentScreen$MainAppScreen;", "Lzendesk/messaging/android/internal/messagingscreen/MessagingFragmentScreen;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class MainAppScreen implements MessagingFragmentScreen {

        @NotNull
        public static final MainAppScreen INSTANCE = new MainAppScreen();

        private MainAppScreen() {
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof MainAppScreen);
        }

        public int hashCode() {
            return 198102930;
        }

        @NotNull
        public String toString() {
            return "MainAppScreen";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0014J>\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, d2 = {"Lzendesk/messaging/android/internal/messagingscreen/MessagingFragmentScreen$ConversationFragmentScreen;", "Lzendesk/messaging/android/internal/messagingscreen/MessagingFragmentScreen;", "conversationId", "", "proactiveId", "", "messagingScreenNavigation", "Lzendesk/android/messaging/MessagingScreen;", "shouldStartDefaultConversation", "", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Lzendesk/android/messaging/MessagingScreen;Ljava/lang/Boolean;)V", "getConversationId", "()Ljava/lang/String;", "getProactiveId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMessagingScreenNavigation", "()Lzendesk/android/messaging/MessagingScreen;", "getShouldStartDefaultConversation", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Lzendesk/android/messaging/MessagingScreen;Ljava/lang/Boolean;)Lzendesk/messaging/android/internal/messagingscreen/MessagingFragmentScreen$ConversationFragmentScreen;", "equals", "other", "", "hashCode", "toString", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ConversationFragmentScreen implements MessagingFragmentScreen {

        @Nullable
        private final String conversationId;

        @Nullable
        private final MessagingScreen messagingScreenNavigation;

        @Nullable
        private final Integer proactiveId;

        @Nullable
        private final Boolean shouldStartDefaultConversation;

        public /* synthetic */ ConversationFragmentScreen(String str, Integer num, MessagingScreen messagingScreen, Boolean bool, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : num, (i11 & 4) != 0 ? null : messagingScreen, (i11 & 8) != 0 ? Boolean.FALSE : bool);
        }

        public static /* synthetic */ ConversationFragmentScreen copy$default(ConversationFragmentScreen conversationFragmentScreen, String str, Integer num, MessagingScreen messagingScreen, Boolean bool, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = conversationFragmentScreen.conversationId;
            }
            if ((i11 & 2) != 0) {
                num = conversationFragmentScreen.proactiveId;
            }
            if ((i11 & 4) != 0) {
                messagingScreen = conversationFragmentScreen.messagingScreenNavigation;
            }
            if ((i11 & 8) != 0) {
                bool = conversationFragmentScreen.shouldStartDefaultConversation;
            }
            return conversationFragmentScreen.copy(str, num, messagingScreen, bool);
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

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final MessagingScreen getMessagingScreenNavigation() {
            return this.messagingScreenNavigation;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final Boolean getShouldStartDefaultConversation() {
            return this.shouldStartDefaultConversation;
        }

        @NotNull
        public final ConversationFragmentScreen copy(@Nullable String conversationId, @Nullable Integer proactiveId, @Nullable MessagingScreen messagingScreenNavigation, @Nullable Boolean shouldStartDefaultConversation) {
            return new ConversationFragmentScreen(conversationId, proactiveId, messagingScreenNavigation, shouldStartDefaultConversation);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ConversationFragmentScreen)) {
                return false;
            }
            ConversationFragmentScreen conversationFragmentScreen = (ConversationFragmentScreen) other;
            return Intrinsics.areEqual(this.conversationId, conversationFragmentScreen.conversationId) && Intrinsics.areEqual(this.proactiveId, conversationFragmentScreen.proactiveId) && Intrinsics.areEqual(this.messagingScreenNavigation, conversationFragmentScreen.messagingScreenNavigation) && Intrinsics.areEqual(this.shouldStartDefaultConversation, conversationFragmentScreen.shouldStartDefaultConversation);
        }

        @Nullable
        public final String getConversationId() {
            return this.conversationId;
        }

        @Nullable
        public final MessagingScreen getMessagingScreenNavigation() {
            return this.messagingScreenNavigation;
        }

        @Nullable
        public final Integer getProactiveId() {
            return this.proactiveId;
        }

        @Nullable
        public final Boolean getShouldStartDefaultConversation() {
            return this.shouldStartDefaultConversation;
        }

        public int hashCode() {
            String str = this.conversationId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Integer num = this.proactiveId;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            MessagingScreen messagingScreen = this.messagingScreenNavigation;
            int iHashCode3 = (iHashCode2 + (messagingScreen == null ? 0 : messagingScreen.hashCode())) * 31;
            Boolean bool = this.shouldStartDefaultConversation;
            return iHashCode3 + (bool != null ? bool.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "ConversationFragmentScreen(conversationId=" + this.conversationId + ", proactiveId=" + this.proactiveId + ", messagingScreenNavigation=" + this.messagingScreenNavigation + ", shouldStartDefaultConversation=" + this.shouldStartDefaultConversation + ")";
        }

        public ConversationFragmentScreen(@Nullable String str, @Nullable Integer num, @Nullable MessagingScreen messagingScreen, @Nullable Boolean bool) {
            this.conversationId = str;
            this.proactiveId = num;
            this.messagingScreenNavigation = messagingScreen;
            this.shouldStartDefaultConversation = bool;
        }

        public ConversationFragmentScreen() {
            this(null, null, null, null, 15, null);
        }
    }
}
