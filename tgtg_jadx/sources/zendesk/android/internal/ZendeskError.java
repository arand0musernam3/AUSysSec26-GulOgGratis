package zendesk.android.internal;

import com.braze.models.inappmessage.InAppMessageBase;
import e0.f;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\b\t\n\u000b\f\rB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0006\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lzendesk/android/internal/ZendeskError;", "", InAppMessageBase.MESSAGE, "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "InvalidChannelKey", "NotInitialized", "FailedToInitialize", "AccountNotFound", "MissingConfiguration", "SdkNotEnabled", "Lzendesk/android/internal/ZendeskError$AccountNotFound;", "Lzendesk/android/internal/ZendeskError$FailedToInitialize;", "Lzendesk/android/internal/ZendeskError$InvalidChannelKey;", "Lzendesk/android/internal/ZendeskError$MissingConfiguration;", "Lzendesk/android/internal/ZendeskError$NotInitialized;", "Lzendesk/android/internal/ZendeskError$SdkNotEnabled;", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class ZendeskError extends Throwable {

    @NotNull
    private final String message;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzendesk/android/internal/ZendeskError$AccountNotFound;", "Lzendesk/android/internal/ZendeskError;", "<init>", "()V", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AccountNotFound extends ZendeskError {

        @NotNull
        public static final AccountNotFound INSTANCE = new AccountNotFound();

        private AccountNotFound() {
            super("No account found for the provided credentials.", null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzendesk/android/internal/ZendeskError$InvalidChannelKey;", "Lzendesk/android/internal/ZendeskError;", "<init>", "()V", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InvalidChannelKey extends ZendeskError {

        @NotNull
        public static final InvalidChannelKey INSTANCE = new InvalidChannelKey();

        private InvalidChannelKey() {
            super("The provided channelKey is invalid.", null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzendesk/android/internal/ZendeskError$MissingConfiguration;", "Lzendesk/android/internal/ZendeskError;", "<init>", "()V", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class MissingConfiguration extends ZendeskError {

        @NotNull
        public static final MissingConfiguration INSTANCE = new MissingConfiguration();

        private MissingConfiguration() {
            super("The configuration for this Zendesk integration could not be retrieved.", null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzendesk/android/internal/ZendeskError$NotInitialized;", "Lzendesk/android/internal/ZendeskError;", "<init>", "()V", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class NotInitialized extends ZendeskError {

        @NotNull
        public static final NotInitialized INSTANCE = new NotInitialized();

        private NotInitialized() {
            super("Zendesk.instance() was called before initialization was completed.", null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzendesk/android/internal/ZendeskError$SdkNotEnabled;", "Lzendesk/android/internal/ZendeskError;", "<init>", "()V", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SdkNotEnabled extends ZendeskError {

        @NotNull
        public static final SdkNotEnabled INSTANCE = new SdkNotEnabled();

        private SdkNotEnabled() {
            super("The SDK is not enabled for this integration.", null);
        }
    }

    private ZendeskError(String str) {
        super(str);
        this.message = str;
    }

    @Override // java.lang.Throwable
    @NotNull
    public String getMessage() {
        return this.message;
    }

    public /* synthetic */ ZendeskError(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lzendesk/android/internal/ZendeskError$FailedToInitialize;", "Lzendesk/android/internal/ZendeskError;", "cause", "", "<init>", "(Ljava/lang/Throwable;)V", "getCause", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FailedToInitialize extends ZendeskError {

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
            super("Zendesk failed to initialize.", null);
            this.cause = th2;
        }
    }
}
