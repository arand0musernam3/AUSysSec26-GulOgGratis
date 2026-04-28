package zendesk.messaging.android;

import com.braze.models.inappmessage.InAppMessageBase;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.provider.asymmetric.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.d;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0002\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lzendesk/messaging/android/MessagingResult;", "T", "", "<init>", "()V", "Success", "Failure", "Lzendesk/messaging/android/MessagingResult$Failure;", "Lzendesk/messaging/android/MessagingResult$Success;", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@d
public abstract class MessagingResult<T> {

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\t\u001a\u00028\u0001HÆ\u0003¢\u0006\u0002\u0010\u0007J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u0001HÆ\u0001¢\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0003\u001a\u00028\u0001¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"Lzendesk/messaging/android/MessagingResult$Success;", "T", "Lzendesk/messaging/android/MessagingResult;", "value", "<init>", "(Ljava/lang/Object;)V", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lzendesk/messaging/android/MessagingResult$Success;", "equals", "", "other", "", "hashCode", "", "toString", "", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Success<T> extends MessagingResult<T> {
        private final T value;

        public Success(T t9) {
            super(null);
            this.value = t9;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Success copy$default(Success success, Object obj, int i11, Object obj2) {
            if ((i11 & 1) != 0) {
                obj = success.value;
            }
            return success.copy(obj);
        }

        public final T component1() {
            return this.value;
        }

        @NotNull
        public final Success<T> copy(T value) {
            return new Success<>(value);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Success) && Intrinsics.areEqual(this.value, ((Success) other).value);
        }

        public final T getValue() {
            return this.value;
        }

        public int hashCode() {
            T t9 = this.value;
            if (t9 == null) {
                return 0;
            }
            return t9.hashCode();
        }

        @NotNull
        public String toString() {
            return a.c(this.value, "Success(value=", ")");
        }
    }

    public /* synthetic */ MessagingResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private MessagingResult() {
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0015\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\nHÖ\u0001R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lzendesk/messaging/android/MessagingResult$Failure;", "Lzendesk/messaging/android/MessagingResult;", "", "cause", "Lzendesk/messaging/android/MessagingError;", "<init>", "(Lzendesk/messaging/android/MessagingError;)V", "getCause", "()Lzendesk/messaging/android/MessagingError;", InAppMessageBase.MESSAGE, "", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Failure extends MessagingResult {

        @Nullable
        private final MessagingError cause;

        @NotNull
        private final String message;

        public Failure(@Nullable MessagingError messagingError) {
            String message;
            super(null);
            this.cause = messagingError;
            this.message = (messagingError == null || (message = messagingError.getMessage()) == null) ? "" : message;
        }

        public static /* synthetic */ Failure copy$default(Failure failure, MessagingError messagingError, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                messagingError = failure.cause;
            }
            return failure.copy(messagingError);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final MessagingError getCause() {
            return this.cause;
        }

        @NotNull
        public final Failure copy(@Nullable MessagingError cause) {
            return new Failure(cause);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Failure) && Intrinsics.areEqual(this.cause, ((Failure) other).cause);
        }

        @Nullable
        public final MessagingError getCause() {
            return this.cause;
        }

        @NotNull
        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            MessagingError messagingError = this.cause;
            if (messagingError == null) {
                return 0;
            }
            return messagingError.hashCode();
        }

        @NotNull
        public String toString() {
            return "Failure(cause=" + this.cause + ")";
        }

        public /* synthetic */ Failure(MessagingError messagingError, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : messagingError);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Failure() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }
}
