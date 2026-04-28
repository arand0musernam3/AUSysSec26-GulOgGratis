package zendesk.conversationkit.android;

import com.braze.models.inappmessage.InAppMessageBase;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\b\t\n\u000b\fB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0005\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lzendesk/conversationkit/android/ConversationKitError;", "", InAppMessageBase.MESSAGE, "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "NoResultReceived", "FailedToInitialize", "UnexpectedType", "IncorrectAccessLevelForAction", "UserAlreadyExists", "Lzendesk/conversationkit/android/ConversationKitError$FailedToInitialize;", "Lzendesk/conversationkit/android/ConversationKitError$IncorrectAccessLevelForAction;", "Lzendesk/conversationkit/android/ConversationKitError$NoResultReceived;", "Lzendesk/conversationkit/android/ConversationKitError$UnexpectedType;", "Lzendesk/conversationkit/android/ConversationKitError$UserAlreadyExists;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class ConversationKitError extends Throwable {

    @NotNull
    private final String message;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzendesk/conversationkit/android/ConversationKitError$FailedToInitialize;", "Lzendesk/conversationkit/android/ConversationKitError;", "<init>", "()V", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FailedToInitialize extends ConversationKitError {

        @NotNull
        public static final FailedToInitialize INSTANCE = new FailedToInitialize();

        private FailedToInitialize() {
            super("The provided parameters were not valid to create an instance of ConversationKit.", null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzendesk/conversationkit/android/ConversationKitError$IncorrectAccessLevelForAction;", "Lzendesk/conversationkit/android/ConversationKitError;", "<init>", "()V", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class IncorrectAccessLevelForAction extends ConversationKitError {

        @NotNull
        public static final IncorrectAccessLevelForAction INSTANCE = new IncorrectAccessLevelForAction();

        private IncorrectAccessLevelForAction() {
            super("Action cannot be performed in current state of the SDK.", null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzendesk/conversationkit/android/ConversationKitError$NoResultReceived;", "Lzendesk/conversationkit/android/ConversationKitError;", "<init>", "()V", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class NoResultReceived extends ConversationKitError {

        @NotNull
        public static final NoResultReceived INSTANCE = new NoResultReceived();

        private NoResultReceived() {
            super("No ConversationKitResult to return for this call.", null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzendesk/conversationkit/android/ConversationKitError$UnexpectedType;", "Lzendesk/conversationkit/android/ConversationKitError;", "<init>", "()V", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class UnexpectedType extends ConversationKitError {

        @NotNull
        public static final UnexpectedType INSTANCE = new UnexpectedType();

        private UnexpectedType() {
            super("Unexpected type received, unable to return.", null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzendesk/conversationkit/android/ConversationKitError$UserAlreadyExists;", "Lzendesk/conversationkit/android/ConversationKitError;", "<init>", "()V", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class UserAlreadyExists extends ConversationKitError {

        @NotNull
        public static final UserAlreadyExists INSTANCE = new UserAlreadyExists();

        private UserAlreadyExists() {
            super("A user already exists for this client.", null);
        }
    }

    private ConversationKitError(String str) {
        super(str);
        this.message = str;
    }

    @Override // java.lang.Throwable
    @NotNull
    public String getMessage() {
        return this.message;
    }

    public /* synthetic */ ConversationKitError(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
