package zendesk.messaging.android;

import com.braze.models.inappmessage.InAppMessageBase;
import e0.f;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.d;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\b\b\t\n\u000b\f\r\u000e\u000fB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\b\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lzendesk/messaging/android/MessagingError;", "", InAppMessageBase.MESSAGE, "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "InvalidChannelKey", "NoResultReceived", "NotInitialized", "SdkNotEnabled", "AccountNotFound", "MissingConfiguration", "FailedToInitialize", "ConversationNotFound", "Lzendesk/messaging/android/MessagingError$AccountNotFound;", "Lzendesk/messaging/android/MessagingError$ConversationNotFound;", "Lzendesk/messaging/android/MessagingError$FailedToInitialize;", "Lzendesk/messaging/android/MessagingError$InvalidChannelKey;", "Lzendesk/messaging/android/MessagingError$MissingConfiguration;", "Lzendesk/messaging/android/MessagingError$NoResultReceived;", "Lzendesk/messaging/android/MessagingError$NotInitialized;", "Lzendesk/messaging/android/MessagingError$SdkNotEnabled;", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@d
public abstract class MessagingError extends Throwable {

    @NotNull
    private final String message;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzendesk/messaging/android/MessagingError$AccountNotFound;", "Lzendesk/messaging/android/MessagingError;", "<init>", "()V", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AccountNotFound extends MessagingError {

        @NotNull
        public static final AccountNotFound INSTANCE = new AccountNotFound();

        private AccountNotFound() {
            super("No account found for the provided credentials.", null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzendesk/messaging/android/MessagingError$ConversationNotFound;", "Lzendesk/messaging/android/MessagingError;", "<init>", "()V", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ConversationNotFound extends MessagingError {

        @NotNull
        public static final ConversationNotFound INSTANCE = new ConversationNotFound();

        private ConversationNotFound() {
            super("There was a problem retrieving the conversation.", null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzendesk/messaging/android/MessagingError$InvalidChannelKey;", "Lzendesk/messaging/android/MessagingError;", "<init>", "()V", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InvalidChannelKey extends MessagingError {

        @NotNull
        public static final InvalidChannelKey INSTANCE = new InvalidChannelKey();

        private InvalidChannelKey() {
            super("The provided channelKey is invalid.", null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzendesk/messaging/android/MessagingError$MissingConfiguration;", "Lzendesk/messaging/android/MessagingError;", "<init>", "()V", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class MissingConfiguration extends MessagingError {

        @NotNull
        public static final MissingConfiguration INSTANCE = new MissingConfiguration();

        private MissingConfiguration() {
            super("The configuration for this Messaging integration could not be retrieved.", null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzendesk/messaging/android/MessagingError$NoResultReceived;", "Lzendesk/messaging/android/MessagingError;", "<init>", "()V", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class NoResultReceived extends MessagingError {

        @NotNull
        public static final NoResultReceived INSTANCE = new NoResultReceived();

        private NoResultReceived() {
            super("No MessagingResult to return for this call.", null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzendesk/messaging/android/MessagingError$NotInitialized;", "Lzendesk/messaging/android/MessagingError;", "<init>", "()V", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class NotInitialized extends MessagingError {

        @NotNull
        public static final NotInitialized INSTANCE = new NotInitialized();

        private NotInitialized() {
            super("Messaging.instance() was called before initialization was completed.", null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzendesk/messaging/android/MessagingError$SdkNotEnabled;", "Lzendesk/messaging/android/MessagingError;", "<init>", "()V", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SdkNotEnabled extends MessagingError {

        @NotNull
        public static final SdkNotEnabled INSTANCE = new SdkNotEnabled();

        private SdkNotEnabled() {
            super("The SDK is not enabled for this integration.", null);
        }
    }

    private MessagingError(String str) {
        super(str);
        this.message = str;
    }

    @Override // java.lang.Throwable
    @NotNull
    public String getMessage() {
        return this.message;
    }

    public /* synthetic */ MessagingError(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lzendesk/messaging/android/MessagingError$FailedToInitialize;", "Lzendesk/messaging/android/MessagingError;", "cause", "", "<init>", "(Ljava/lang/Throwable;)V", "getCause", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FailedToInitialize extends MessagingError {

        @Nullable
        private final Throwable cause;

        public /* synthetic */ FailedToInitialize(Throwable th2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : th2);
        }

        public static /* synthetic */ FailedToInitialize copy$default(FailedToInitialize failedToInitialize, Throwable th2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                th2 = failedToInitialize.cause;
            }
            return failedToInitialize.copy(th2);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Throwable getCause() {
            return this.cause;
        }

        @NotNull
        public final FailedToInitialize copy(@Nullable Throwable cause) {
            return new FailedToInitialize(cause);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof FailedToInitialize) && Intrinsics.areEqual(this.cause, ((FailedToInitialize) other).cause);
        }

        @Override // java.lang.Throwable
        @Nullable
        public Throwable getCause() {
            return this.cause;
        }

        public int hashCode() {
            Throwable th2 = this.cause;
            if (th2 == null) {
                return 0;
            }
            return th2.hashCode();
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            return f.l("FailedToInitialize(cause=", ")", this.cause);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public FailedToInitialize() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public FailedToInitialize(@Nullable Throwable th2) {
            super("Messaging failed to initialize.", null);
            this.cause = th2;
        }
    }
}
