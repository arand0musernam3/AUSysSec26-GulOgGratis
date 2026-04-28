package zendesk.messaging.android.internal.analytics;

import e0.f;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.provider.asymmetric.a;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import w.a0;
import w2.l1;
import zendesk.analyticskit.android.model.AnalyticsValueType;
import zendesk.messaging.android.internal.messagingscreen.MessagingScreenViewModel;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000 \u001b2\u00020\u0001:\f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001bB+\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u0082\u0001\u000b\u001c\u001d\u001e\u001f !\"#$%&¨\u0006'"}, d2 = {"Lzendesk/messaging/android/internal/analytics/AnalyticsEventType;", "", "category", "", "action", AnnotatedPrivateKey.LABEL, "valueType", "Lzendesk/analyticskit/android/model/AnalyticsValueType;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lzendesk/analyticskit/android/model/AnalyticsValueType;)V", "getCategory", "()Ljava/lang/String;", "getAction", "getLabel", "getValueType", "()Lzendesk/analyticskit/android/model/AnalyticsValueType;", "MessagingOpened", "NewConversationButtonClicked", "ConversationWithAgentRequested", "ConversationAgentAssigned", "ConversationExtensionClicked", "ConversationExtensionDisplayed", "CsatShown", "CsatSubmitted", "ArticleClicked", "ShowMessagingAPI", "AnalyticsEventTypeWithSource", "Companion", "Lzendesk/messaging/android/internal/analytics/AnalyticsEventType$AnalyticsEventTypeWithSource;", "Lzendesk/messaging/android/internal/analytics/AnalyticsEventType$ArticleClicked;", "Lzendesk/messaging/android/internal/analytics/AnalyticsEventType$ConversationAgentAssigned;", "Lzendesk/messaging/android/internal/analytics/AnalyticsEventType$ConversationExtensionClicked;", "Lzendesk/messaging/android/internal/analytics/AnalyticsEventType$ConversationExtensionDisplayed;", "Lzendesk/messaging/android/internal/analytics/AnalyticsEventType$ConversationWithAgentRequested;", "Lzendesk/messaging/android/internal/analytics/AnalyticsEventType$CsatShown;", "Lzendesk/messaging/android/internal/analytics/AnalyticsEventType$CsatSubmitted;", "Lzendesk/messaging/android/internal/analytics/AnalyticsEventType$MessagingOpened;", "Lzendesk/messaging/android/internal/analytics/AnalyticsEventType$NewConversationButtonClicked;", "Lzendesk/messaging/android/internal/analytics/AnalyticsEventType$ShowMessagingAPI;", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class AnalyticsEventType {

    @NotNull
    private static final String ACTION_ARTICLE_CLICKED = "articleClicked";

    @NotNull
    private static final String ACTION_CONVERSATION_AGENT_ASSIGNED = "conversationAssigned";

    @NotNull
    private static final String ACTION_CONVERSATION_OPENED = "conversationOpened";

    @NotNull
    private static final String ACTION_CONVERSATION_REQUESTED = "conversationRequested";

    @NotNull
    private static final String ACTION_EXTENSIONS_DISPLAYED = "extensionDisplayed";

    @NotNull
    private static final String ACTION_EXTENSIONS_LAUNCHED = "extensionLaunched";

    @NotNull
    private static final String ACTION_EXTENSIONS_OPENED = "extensionOpened";

    @NotNull
    private static final String ACTION_FEEDBACK_REQUESTED = "feedbackRequested";

    @NotNull
    private static final String ACTION_FIRST_MESSAGE_SENT = "firstMessageSent";

    @NotNull
    private static final String ACTION_GOOD_FEEDBACK_SUBMITTED = "goodFeedbackSubmitted";

    @NotNull
    private static final String ACTION_NEW_CONVERSATION_BUTTON_CLICKED = "newConversationButtonClicked";

    @NotNull
    private static final String ACTION_OPEN = "open";

    @NotNull
    private static final String CATEGORY_ARTICLE = "article";

    @NotNull
    private static final String CATEGORY_CONVERSATION = "conversation";

    @NotNull
    private static final String CATEGORY_EXTENSIONS = "extension";

    @NotNull
    private static final String CATEGORY_FEEDBACK = "feedback";

    @NotNull
    private static final String CATEGORY_MESSAGES = "messages";

    @NotNull
    private static final String CATEGORY_MESSENGER = "messenger";

    @NotNull
    private static final String CATEGORY_SHOW_MESSSAGING = "showMessaging";

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final String LABEL_ARTICLE = "article";

    @NotNull
    private static final String LABEL_CONVERSATION = "conversation";

    @NotNull
    private static final String LABEL_EXTENSIONS = "extension";

    @NotNull
    private static final String LABEL_FEEDBACK = "feedback";

    @NotNull
    private static final String LABEL_MESSAGES = "messages";

    @NotNull
    private static final String LABEL_MESSENGER = "messenger";

    @NotNull
    private static final String SOURCE_EXISTING_CONVERSATION = "existingConversation";

    @NotNull
    private static final String SOURCE_INPUT_FIELD = "inputField";

    @NotNull
    private static final String SOURCE_LAUNCHER = "launcher";

    @NotNull
    private static final String SOURCE_NEW_CONVERSATION_BUTTON = "newConversationButton";

    @NotNull
    private static final String SOURCE_NOTIFICATION = "notification";

    @NotNull
    private static final String SOURCE_PROACTIVE_MESSAGE = "proactiveMessage";

    @NotNull
    private static final String SOURCE_QUICK_REPLY = "quickReply";

    @NotNull
    private final String action;

    @NotNull
    private final String category;

    @NotNull
    private final String label;

    @NotNull
    private final AnalyticsValueType valueType;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lzendesk/messaging/android/internal/analytics/AnalyticsEventType$ArticleClicked;", "Lzendesk/messaging/android/internal/analytics/AnalyticsEventType;", "senderType", "", "<init>", "(Ljava/lang/String;)V", "getSenderType", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ArticleClicked extends AnalyticsEventType {

        @NotNull
        private final String senderType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ArticleClicked(@NotNull String str) {
            super("article", AnalyticsEventType.ACTION_ARTICLE_CLICKED, "article", new AnalyticsValueType.ArticleValueType(str), null);
            str.getClass();
            this.senderType = str;
        }

        public static /* synthetic */ ArticleClicked copy$default(ArticleClicked articleClicked, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = articleClicked.senderType;
            }
            return articleClicked.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getSenderType() {
            return this.senderType;
        }

        @NotNull
        public final ArticleClicked copy(@NotNull String senderType) {
            senderType.getClass();
            return new ArticleClicked(senderType);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ArticleClicked) && Intrinsics.areEqual(this.senderType, ((ArticleClicked) other).senderType);
        }

        @NotNull
        public final String getSenderType() {
            return this.senderType;
        }

        public int hashCode() {
            return this.senderType.hashCode();
        }

        @NotNull
        public String toString() {
            return a0.p("ArticleClicked(senderType=", this.senderType, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lzendesk/messaging/android/internal/analytics/AnalyticsEventType$ConversationAgentAssigned;", "Lzendesk/messaging/android/internal/analytics/AnalyticsEventType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ConversationAgentAssigned extends AnalyticsEventType {

        @NotNull
        public static final ConversationAgentAssigned INSTANCE = new ConversationAgentAssigned();

        private ConversationAgentAssigned() {
            super(MessagingScreenViewModel.MESSAGING_SCREEN_CONVERSATION, AnalyticsEventType.ACTION_CONVERSATION_AGENT_ASSIGNED, MessagingScreenViewModel.MESSAGING_SCREEN_CONVERSATION, null, 8, null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof ConversationAgentAssigned);
        }

        public int hashCode() {
            return 364134382;
        }

        @NotNull
        public String toString() {
            return "ConversationAgentAssigned";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lzendesk/messaging/android/internal/analytics/AnalyticsEventType$ConversationExtensionClicked;", "Lzendesk/messaging/android/internal/analytics/AnalyticsEventType;", "launchType", "", "size", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getLaunchType", "()Ljava/lang/String;", "getSize", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ConversationExtensionClicked extends AnalyticsEventType {

        @NotNull
        private final String launchType;

        @NotNull
        private final String size;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ConversationExtensionClicked(@NotNull String str, @NotNull String str2) {
            super("extension", AnalyticsEventType.ACTION_EXTENSIONS_LAUNCHED, "extension", new AnalyticsValueType.ConversationExtensionValueType(str, str2), null);
            str.getClass();
            str2.getClass();
            this.launchType = str;
            this.size = str2;
        }

        public static /* synthetic */ ConversationExtensionClicked copy$default(ConversationExtensionClicked conversationExtensionClicked, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = conversationExtensionClicked.launchType;
            }
            if ((i11 & 2) != 0) {
                str2 = conversationExtensionClicked.size;
            }
            return conversationExtensionClicked.copy(str, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getLaunchType() {
            return this.launchType;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getSize() {
            return this.size;
        }

        @NotNull
        public final ConversationExtensionClicked copy(@NotNull String launchType, @NotNull String size) {
            launchType.getClass();
            size.getClass();
            return new ConversationExtensionClicked(launchType, size);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ConversationExtensionClicked)) {
                return false;
            }
            ConversationExtensionClicked conversationExtensionClicked = (ConversationExtensionClicked) other;
            return Intrinsics.areEqual(this.launchType, conversationExtensionClicked.launchType) && Intrinsics.areEqual(this.size, conversationExtensionClicked.size);
        }

        @NotNull
        public final String getLaunchType() {
            return this.launchType;
        }

        @NotNull
        public final String getSize() {
            return this.size;
        }

        public int hashCode() {
            return this.size.hashCode() + (this.launchType.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return a.d("ConversationExtensionClicked(launchType=", this.launchType, ", size=", this.size, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lzendesk/messaging/android/internal/analytics/AnalyticsEventType$ConversationExtensionDisplayed;", "Lzendesk/messaging/android/internal/analytics/AnalyticsEventType;", "launchType", "", "size", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getLaunchType", "()Ljava/lang/String;", "getSize", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ConversationExtensionDisplayed extends AnalyticsEventType {

        @NotNull
        private final String launchType;

        @NotNull
        private final String size;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ConversationExtensionDisplayed(@NotNull String str, @NotNull String str2) {
            super("extension", AnalyticsEventType.ACTION_EXTENSIONS_DISPLAYED, "extension", new AnalyticsValueType.ConversationExtensionValueType(str, str2), null);
            str.getClass();
            str2.getClass();
            this.launchType = str;
            this.size = str2;
        }

        public static /* synthetic */ ConversationExtensionDisplayed copy$default(ConversationExtensionDisplayed conversationExtensionDisplayed, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = conversationExtensionDisplayed.launchType;
            }
            if ((i11 & 2) != 0) {
                str2 = conversationExtensionDisplayed.size;
            }
            return conversationExtensionDisplayed.copy(str, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getLaunchType() {
            return this.launchType;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getSize() {
            return this.size;
        }

        @NotNull
        public final ConversationExtensionDisplayed copy(@NotNull String launchType, @NotNull String size) {
            launchType.getClass();
            size.getClass();
            return new ConversationExtensionDisplayed(launchType, size);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ConversationExtensionDisplayed)) {
                return false;
            }
            ConversationExtensionDisplayed conversationExtensionDisplayed = (ConversationExtensionDisplayed) other;
            return Intrinsics.areEqual(this.launchType, conversationExtensionDisplayed.launchType) && Intrinsics.areEqual(this.size, conversationExtensionDisplayed.size);
        }

        @NotNull
        public final String getLaunchType() {
            return this.launchType;
        }

        @NotNull
        public final String getSize() {
            return this.size;
        }

        public int hashCode() {
            return this.size.hashCode() + (this.launchType.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return a.d("ConversationExtensionDisplayed(launchType=", this.launchType, ", size=", this.size, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lzendesk/messaging/android/internal/analytics/AnalyticsEventType$ConversationWithAgentRequested;", "Lzendesk/messaging/android/internal/analytics/AnalyticsEventType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ConversationWithAgentRequested extends AnalyticsEventType {

        @NotNull
        public static final ConversationWithAgentRequested INSTANCE = new ConversationWithAgentRequested();

        private ConversationWithAgentRequested() {
            super(MessagingScreenViewModel.MESSAGING_SCREEN_CONVERSATION, AnalyticsEventType.ACTION_CONVERSATION_REQUESTED, MessagingScreenViewModel.MESSAGING_SCREEN_CONVERSATION, null, 8, null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof ConversationWithAgentRequested);
        }

        public int hashCode() {
            return 1959336244;
        }

        @NotNull
        public String toString() {
            return "ConversationWithAgentRequested";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lzendesk/messaging/android/internal/analytics/AnalyticsEventType$CsatShown;", "Lzendesk/messaging/android/internal/analytics/AnalyticsEventType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CsatShown extends AnalyticsEventType {

        @NotNull
        public static final CsatShown INSTANCE = new CsatShown();

        private CsatShown() {
            super("feedback", AnalyticsEventType.ACTION_FEEDBACK_REQUESTED, "feedback", null, 8, null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof CsatShown);
        }

        public int hashCode() {
            return -1280777748;
        }

        @NotNull
        public String toString() {
            return "CsatShown";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lzendesk/messaging/android/internal/analytics/AnalyticsEventType$CsatSubmitted;", "Lzendesk/messaging/android/internal/analytics/AnalyticsEventType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CsatSubmitted extends AnalyticsEventType {

        @NotNull
        public static final CsatSubmitted INSTANCE = new CsatSubmitted();

        private CsatSubmitted() {
            super("feedback", AnalyticsEventType.ACTION_GOOD_FEEDBACK_SUBMITTED, "feedback", null, 8, null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof CsatSubmitted);
        }

        public int hashCode() {
            return -1796480938;
        }

        @NotNull
        public String toString() {
            return "CsatSubmitted";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lzendesk/messaging/android/internal/analytics/AnalyticsEventType$MessagingOpened;", "Lzendesk/messaging/android/internal/analytics/AnalyticsEventType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class MessagingOpened extends AnalyticsEventType {

        @NotNull
        public static final MessagingOpened INSTANCE = new MessagingOpened();

        private MessagingOpened() {
            super("messenger", AnalyticsEventType.ACTION_OPEN, "messenger", null, 8, null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof MessagingOpened);
        }

        public int hashCode() {
            return -2071925301;
        }

        @NotNull
        public String toString() {
            return "MessagingOpened";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lzendesk/messaging/android/internal/analytics/AnalyticsEventType$NewConversationButtonClicked;", "Lzendesk/messaging/android/internal/analytics/AnalyticsEventType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class NewConversationButtonClicked extends AnalyticsEventType {

        @NotNull
        public static final NewConversationButtonClicked INSTANCE = new NewConversationButtonClicked();

        private NewConversationButtonClicked() {
            super(MessagingScreenViewModel.MESSAGING_SCREEN_CONVERSATION, AnalyticsEventType.ACTION_NEW_CONVERSATION_BUTTON_CLICKED, MessagingScreenViewModel.MESSAGING_SCREEN_CONVERSATION, null, 8, null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof NewConversationButtonClicked);
        }

        public int hashCode() {
            return 1284460180;
        }

        @NotNull
        public String toString() {
            return "NewConversationButtonClicked";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, d2 = {"Lzendesk/messaging/android/internal/analytics/AnalyticsEventType$ShowMessagingAPI;", "Lzendesk/messaging/android/internal/analytics/AnalyticsEventType;", "showMessagingAction", "", "showMessagingLabel", "showMessagingExitAction", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getShowMessagingAction", "()Ljava/lang/String;", "getShowMessagingLabel", "getShowMessagingExitAction", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ShowMessagingAPI extends AnalyticsEventType {

        @NotNull
        private final String showMessagingAction;

        @NotNull
        private final String showMessagingExitAction;

        @NotNull
        private final String showMessagingLabel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowMessagingAPI(@NotNull String str, @NotNull String str2, @NotNull String str3) {
            super(AnalyticsEventType.CATEGORY_SHOW_MESSSAGING, str, str2, new AnalyticsValueType.MessagingScreenValueType(str3), null);
            str.getClass();
            str2.getClass();
            str3.getClass();
            this.showMessagingAction = str;
            this.showMessagingLabel = str2;
            this.showMessagingExitAction = str3;
        }

        public static /* synthetic */ ShowMessagingAPI copy$default(ShowMessagingAPI showMessagingAPI, String str, String str2, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = showMessagingAPI.showMessagingAction;
            }
            if ((i11 & 2) != 0) {
                str2 = showMessagingAPI.showMessagingLabel;
            }
            if ((i11 & 4) != 0) {
                str3 = showMessagingAPI.showMessagingExitAction;
            }
            return showMessagingAPI.copy(str, str2, str3);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getShowMessagingAction() {
            return this.showMessagingAction;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getShowMessagingLabel() {
            return this.showMessagingLabel;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getShowMessagingExitAction() {
            return this.showMessagingExitAction;
        }

        @NotNull
        public final ShowMessagingAPI copy(@NotNull String showMessagingAction, @NotNull String showMessagingLabel, @NotNull String showMessagingExitAction) {
            showMessagingAction.getClass();
            showMessagingLabel.getClass();
            showMessagingExitAction.getClass();
            return new ShowMessagingAPI(showMessagingAction, showMessagingLabel, showMessagingExitAction);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShowMessagingAPI)) {
                return false;
            }
            ShowMessagingAPI showMessagingAPI = (ShowMessagingAPI) other;
            return Intrinsics.areEqual(this.showMessagingAction, showMessagingAPI.showMessagingAction) && Intrinsics.areEqual(this.showMessagingLabel, showMessagingAPI.showMessagingLabel) && Intrinsics.areEqual(this.showMessagingExitAction, showMessagingAPI.showMessagingExitAction);
        }

        @NotNull
        public final String getShowMessagingAction() {
            return this.showMessagingAction;
        }

        @NotNull
        public final String getShowMessagingExitAction() {
            return this.showMessagingExitAction;
        }

        @NotNull
        public final String getShowMessagingLabel() {
            return this.showMessagingLabel;
        }

        public int hashCode() {
            return this.showMessagingExitAction.hashCode() + l1.b(this.showMessagingAction.hashCode() * 31, 31, this.showMessagingLabel);
        }

        @NotNull
        public String toString() {
            String str = this.showMessagingAction;
            String str2 = this.showMessagingLabel;
            return k.p(f.t("ShowMessagingAPI(showMessagingAction=", str, ", showMessagingLabel=", str2, ", showMessagingExitAction="), this.showMessagingExitAction, ")");
        }
    }

    public /* synthetic */ AnalyticsEventType(String str, String str2, String str3, AnalyticsValueType analyticsValueType, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i11 & 8) != 0 ? AnalyticsValueType.DefaultValueType.INSTANCE : analyticsValueType, null);
    }

    @NotNull
    public String getAction() {
        return this.action;
    }

    @NotNull
    public String getCategory() {
        return this.category;
    }

    @NotNull
    public String getLabel() {
        return this.label;
    }

    @NotNull
    public AnalyticsValueType getValueType() {
        return this.valueType;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b \b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lzendesk/messaging/android/internal/analytics/AnalyticsEventType$Companion;", "", "<init>", "()V", "CATEGORY_MESSENGER", "", "CATEGORY_CONVERSATION", "CATEGORY_MESSAGES", "CATEGORY_EXTENSIONS", "CATEGORY_FEEDBACK", "CATEGORY_ARTICLE", "CATEGORY_SHOW_MESSSAGING", "ACTION_OPEN", "ACTION_NEW_CONVERSATION_BUTTON_CLICKED", "ACTION_CONVERSATION_OPENED", "ACTION_FIRST_MESSAGE_SENT", "ACTION_CONVERSATION_REQUESTED", "ACTION_CONVERSATION_AGENT_ASSIGNED", "ACTION_EXTENSIONS_OPENED", "ACTION_EXTENSIONS_LAUNCHED", "ACTION_EXTENSIONS_DISPLAYED", "ACTION_FEEDBACK_REQUESTED", "ACTION_GOOD_FEEDBACK_SUBMITTED", "ACTION_ARTICLE_CLICKED", "LABEL_MESSENGER", "LABEL_CONVERSATION", "LABEL_MESSAGES", "LABEL_EXTENSIONS", "LABEL_FEEDBACK", "LABEL_ARTICLE", "SOURCE_NEW_CONVERSATION_BUTTON", "SOURCE_EXISTING_CONVERSATION", "SOURCE_PROACTIVE_MESSAGE", "SOURCE_NOTIFICATION", "SOURCE_LAUNCHER", "SOURCE_QUICK_REPLY", "SOURCE_INPUT_FIELD", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private AnalyticsEventType(String str, String str2, String str3, AnalyticsValueType analyticsValueType) {
        this.category = str;
        this.action = str2;
        this.label = str3;
        this.valueType = analyticsValueType;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\u0012\u0013\u0014\u0015\u0016\u0017\u0018B3\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0014\u0010\u0005\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f\u0082\u0001\u0007\u0019\u001a\u001b\u001c\u001d\u001e\u001f¨\u0006 "}, d2 = {"Lzendesk/messaging/android/internal/analytics/AnalyticsEventType$AnalyticsEventTypeWithSource;", "Lzendesk/messaging/android/internal/analytics/AnalyticsEventType;", "category", "", "action", AnnotatedPrivateKey.LABEL, "valueType", "Lzendesk/analyticskit/android/model/AnalyticsValueType;", "source", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lzendesk/analyticskit/android/model/AnalyticsValueType;Ljava/lang/String;)V", "getCategory", "()Ljava/lang/String;", "getAction", "getLabel", "getValueType", "()Lzendesk/analyticskit/android/model/AnalyticsValueType;", "getSource", "ConversationOpenedNewConversationButton", "ConversationOpenedExistingConversation", "ConversationOpenedProactiveMessage", "ConversationOpenedNotification", "ConversationOpenedLauncher", "FirstUserMessageSentQuickReply", "FirstUserMessageSentInputField", "Lzendesk/messaging/android/internal/analytics/AnalyticsEventType$AnalyticsEventTypeWithSource$ConversationOpenedExistingConversation;", "Lzendesk/messaging/android/internal/analytics/AnalyticsEventType$AnalyticsEventTypeWithSource$ConversationOpenedLauncher;", "Lzendesk/messaging/android/internal/analytics/AnalyticsEventType$AnalyticsEventTypeWithSource$ConversationOpenedNewConversationButton;", "Lzendesk/messaging/android/internal/analytics/AnalyticsEventType$AnalyticsEventTypeWithSource$ConversationOpenedNotification;", "Lzendesk/messaging/android/internal/analytics/AnalyticsEventType$AnalyticsEventTypeWithSource$ConversationOpenedProactiveMessage;", "Lzendesk/messaging/android/internal/analytics/AnalyticsEventType$AnalyticsEventTypeWithSource$FirstUserMessageSentInputField;", "Lzendesk/messaging/android/internal/analytics/AnalyticsEventType$AnalyticsEventTypeWithSource$FirstUserMessageSentQuickReply;", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class AnalyticsEventTypeWithSource extends AnalyticsEventType {

        @NotNull
        private final String action;

        @NotNull
        private final String category;

        @NotNull
        private final String label;

        @NotNull
        private final String source;

        @NotNull
        private final AnalyticsValueType valueType;

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lzendesk/messaging/android/internal/analytics/AnalyticsEventType$AnalyticsEventTypeWithSource$ConversationOpenedExistingConversation;", "Lzendesk/messaging/android/internal/analytics/AnalyticsEventType$AnalyticsEventTypeWithSource;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ConversationOpenedExistingConversation extends AnalyticsEventTypeWithSource {

            @NotNull
            public static final ConversationOpenedExistingConversation INSTANCE = new ConversationOpenedExistingConversation();

            private ConversationOpenedExistingConversation() {
                super(MessagingScreenViewModel.MESSAGING_SCREEN_CONVERSATION, AnalyticsEventType.ACTION_CONVERSATION_OPENED, MessagingScreenViewModel.MESSAGING_SCREEN_CONVERSATION, null, AnalyticsEventType.SOURCE_EXISTING_CONVERSATION, 8, null);
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof ConversationOpenedExistingConversation);
            }

            public int hashCode() {
                return -248578921;
            }

            @NotNull
            public String toString() {
                return "ConversationOpenedExistingConversation";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lzendesk/messaging/android/internal/analytics/AnalyticsEventType$AnalyticsEventTypeWithSource$ConversationOpenedLauncher;", "Lzendesk/messaging/android/internal/analytics/AnalyticsEventType$AnalyticsEventTypeWithSource;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ConversationOpenedLauncher extends AnalyticsEventTypeWithSource {

            @NotNull
            public static final ConversationOpenedLauncher INSTANCE = new ConversationOpenedLauncher();

            private ConversationOpenedLauncher() {
                super(MessagingScreenViewModel.MESSAGING_SCREEN_CONVERSATION, AnalyticsEventType.ACTION_CONVERSATION_OPENED, MessagingScreenViewModel.MESSAGING_SCREEN_CONVERSATION, null, AnalyticsEventType.SOURCE_LAUNCHER, 8, null);
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof ConversationOpenedLauncher);
            }

            public int hashCode() {
                return 518386697;
            }

            @NotNull
            public String toString() {
                return "ConversationOpenedLauncher";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lzendesk/messaging/android/internal/analytics/AnalyticsEventType$AnalyticsEventTypeWithSource$ConversationOpenedNewConversationButton;", "Lzendesk/messaging/android/internal/analytics/AnalyticsEventType$AnalyticsEventTypeWithSource;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ConversationOpenedNewConversationButton extends AnalyticsEventTypeWithSource {

            @NotNull
            public static final ConversationOpenedNewConversationButton INSTANCE = new ConversationOpenedNewConversationButton();

            private ConversationOpenedNewConversationButton() {
                super(MessagingScreenViewModel.MESSAGING_SCREEN_CONVERSATION, AnalyticsEventType.ACTION_CONVERSATION_OPENED, MessagingScreenViewModel.MESSAGING_SCREEN_CONVERSATION, null, AnalyticsEventType.SOURCE_NEW_CONVERSATION_BUTTON, 8, null);
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof ConversationOpenedNewConversationButton);
            }

            public int hashCode() {
                return 91082124;
            }

            @NotNull
            public String toString() {
                return "ConversationOpenedNewConversationButton";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lzendesk/messaging/android/internal/analytics/AnalyticsEventType$AnalyticsEventTypeWithSource$ConversationOpenedNotification;", "Lzendesk/messaging/android/internal/analytics/AnalyticsEventType$AnalyticsEventTypeWithSource;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ConversationOpenedNotification extends AnalyticsEventTypeWithSource {

            @NotNull
            public static final ConversationOpenedNotification INSTANCE = new ConversationOpenedNotification();

            private ConversationOpenedNotification() {
                super(MessagingScreenViewModel.MESSAGING_SCREEN_CONVERSATION, AnalyticsEventType.ACTION_CONVERSATION_OPENED, MessagingScreenViewModel.MESSAGING_SCREEN_CONVERSATION, null, AnalyticsEventType.SOURCE_NOTIFICATION, 8, null);
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof ConversationOpenedNotification);
            }

            public int hashCode() {
                return 1442255060;
            }

            @NotNull
            public String toString() {
                return "ConversationOpenedNotification";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lzendesk/messaging/android/internal/analytics/AnalyticsEventType$AnalyticsEventTypeWithSource$ConversationOpenedProactiveMessage;", "Lzendesk/messaging/android/internal/analytics/AnalyticsEventType$AnalyticsEventTypeWithSource;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ConversationOpenedProactiveMessage extends AnalyticsEventTypeWithSource {

            @NotNull
            public static final ConversationOpenedProactiveMessage INSTANCE = new ConversationOpenedProactiveMessage();

            private ConversationOpenedProactiveMessage() {
                super(MessagingScreenViewModel.MESSAGING_SCREEN_CONVERSATION, AnalyticsEventType.ACTION_CONVERSATION_OPENED, MessagingScreenViewModel.MESSAGING_SCREEN_CONVERSATION, null, AnalyticsEventType.SOURCE_PROACTIVE_MESSAGE, 8, null);
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof ConversationOpenedProactiveMessage);
            }

            public int hashCode() {
                return -1526497283;
            }

            @NotNull
            public String toString() {
                return "ConversationOpenedProactiveMessage";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lzendesk/messaging/android/internal/analytics/AnalyticsEventType$AnalyticsEventTypeWithSource$FirstUserMessageSentInputField;", "Lzendesk/messaging/android/internal/analytics/AnalyticsEventType$AnalyticsEventTypeWithSource;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class FirstUserMessageSentInputField extends AnalyticsEventTypeWithSource {

            @NotNull
            public static final FirstUserMessageSentInputField INSTANCE = new FirstUserMessageSentInputField();

            private FirstUserMessageSentInputField() {
                super(MessagingScreenViewModel.MESSAGING_SCREEN_CONVERSATION, AnalyticsEventType.ACTION_FIRST_MESSAGE_SENT, MessagingScreenViewModel.MESSAGING_SCREEN_CONVERSATION, null, AnalyticsEventType.SOURCE_INPUT_FIELD, 8, null);
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof FirstUserMessageSentInputField);
            }

            public int hashCode() {
                return 1063174161;
            }

            @NotNull
            public String toString() {
                return "FirstUserMessageSentInputField";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lzendesk/messaging/android/internal/analytics/AnalyticsEventType$AnalyticsEventTypeWithSource$FirstUserMessageSentQuickReply;", "Lzendesk/messaging/android/internal/analytics/AnalyticsEventType$AnalyticsEventTypeWithSource;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class FirstUserMessageSentQuickReply extends AnalyticsEventTypeWithSource {

            @NotNull
            public static final FirstUserMessageSentQuickReply INSTANCE = new FirstUserMessageSentQuickReply();

            private FirstUserMessageSentQuickReply() {
                super(MessagingScreenViewModel.MESSAGING_SCREEN_CONVERSATION, AnalyticsEventType.ACTION_FIRST_MESSAGE_SENT, MessagingScreenViewModel.MESSAGING_SCREEN_CONVERSATION, null, AnalyticsEventType.SOURCE_QUICK_REPLY, 8, null);
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof FirstUserMessageSentQuickReply);
            }

            public int hashCode() {
                return 1367130558;
            }

            @NotNull
            public String toString() {
                return "FirstUserMessageSentQuickReply";
            }
        }

        private AnalyticsEventTypeWithSource(String str, String str2, String str3, AnalyticsValueType analyticsValueType, String str4) {
            super(str, str2, str3, null, 8, null);
            this.category = str;
            this.action = str2;
            this.label = str3;
            this.valueType = analyticsValueType;
            this.source = str4;
        }

        @Override // zendesk.messaging.android.internal.analytics.AnalyticsEventType
        @NotNull
        public String getAction() {
            return this.action;
        }

        @Override // zendesk.messaging.android.internal.analytics.AnalyticsEventType
        @NotNull
        public String getCategory() {
            return this.category;
        }

        @Override // zendesk.messaging.android.internal.analytics.AnalyticsEventType
        @NotNull
        public String getLabel() {
            return this.label;
        }

        @NotNull
        public final String getSource() {
            return this.source;
        }

        @Override // zendesk.messaging.android.internal.analytics.AnalyticsEventType
        @NotNull
        public AnalyticsValueType getValueType() {
            return this.valueType;
        }

        public /* synthetic */ AnalyticsEventTypeWithSource(String str, String str2, String str3, AnalyticsValueType analyticsValueType, String str4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, (i11 & 8) != 0 ? AnalyticsValueType.DefaultValueType.INSTANCE : analyticsValueType, str4, null);
        }

        public /* synthetic */ AnalyticsEventTypeWithSource(String str, String str2, String str3, AnalyticsValueType analyticsValueType, String str4, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, analyticsValueType, str4);
        }
    }

    public /* synthetic */ AnalyticsEventType(String str, String str2, String str3, AnalyticsValueType analyticsValueType, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, analyticsValueType);
    }
}
