package zendesk.messaging.android.internal.messagingscreen;

import com.adyen.checkout.components.core.internal.util.StatusResponseUtils;
import e0.f;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lzendesk/messaging/android/internal/messagingscreen/MessagingScreenState;", "", "Idle", "Loading", "Success", "Error", "Lzendesk/messaging/android/internal/messagingscreen/MessagingScreenState$Error;", "Lzendesk/messaging/android/internal/messagingscreen/MessagingScreenState$Idle;", "Lzendesk/messaging/android/internal/messagingscreen/MessagingScreenState$Loading;", "Lzendesk/messaging/android/internal/messagingscreen/MessagingScreenState$Success;", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface MessagingScreenState {

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lzendesk/messaging/android/internal/messagingscreen/MessagingScreenState$Error;", "Lzendesk/messaging/android/internal/messagingscreen/MessagingScreenState;", StatusResponseUtils.RESULT_ERROR, "", "<init>", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Error implements MessagingScreenState {

        @NotNull
        private final Throwable error;

        public Error(@NotNull Throwable th2) {
            th2.getClass();
            this.error = th2;
        }

        public static /* synthetic */ Error copy$default(Error error, Throwable th2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                th2 = error.error;
            }
            return error.copy(th2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Throwable getError() {
            return this.error;
        }

        @NotNull
        public final Error copy(@NotNull Throwable error) {
            error.getClass();
            return new Error(error);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && Intrinsics.areEqual(this.error, ((Error) other).error);
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
            return f.l("Error(error=", ")", this.error);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lzendesk/messaging/android/internal/messagingscreen/MessagingScreenState$Idle;", "Lzendesk/messaging/android/internal/messagingscreen/MessagingScreenState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Idle implements MessagingScreenState {

        @NotNull
        public static final Idle INSTANCE = new Idle();

        private Idle() {
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Idle);
        }

        public int hashCode() {
            return 1751627725;
        }

        @NotNull
        public String toString() {
            return "Idle";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lzendesk/messaging/android/internal/messagingscreen/MessagingScreenState$Loading;", "Lzendesk/messaging/android/internal/messagingscreen/MessagingScreenState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Loading implements MessagingScreenState {

        @NotNull
        public static final Loading INSTANCE = new Loading();

        private Loading() {
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return 1856256675;
        }

        @NotNull
        public String toString() {
            return "Loading";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lzendesk/messaging/android/internal/messagingscreen/MessagingScreenState$Success;", "Lzendesk/messaging/android/internal/messagingscreen/MessagingScreenState;", "isPushNotification", "", "screen", "Lzendesk/messaging/android/internal/messagingscreen/MessagingFragmentScreen;", "<init>", "(ZLzendesk/messaging/android/internal/messagingscreen/MessagingFragmentScreen;)V", "()Z", "getScreen", "()Lzendesk/messaging/android/internal/messagingscreen/MessagingFragmentScreen;", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Success implements MessagingScreenState {
        private final boolean isPushNotification;

        @NotNull
        private final MessagingFragmentScreen screen;

        public Success(boolean z11, @NotNull MessagingFragmentScreen messagingFragmentScreen) {
            messagingFragmentScreen.getClass();
            this.isPushNotification = z11;
            this.screen = messagingFragmentScreen;
        }

        public static /* synthetic */ Success copy$default(Success success, boolean z11, MessagingFragmentScreen messagingFragmentScreen, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                z11 = success.isPushNotification;
            }
            if ((i11 & 2) != 0) {
                messagingFragmentScreen = success.screen;
            }
            return success.copy(z11, messagingFragmentScreen);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getIsPushNotification() {
            return this.isPushNotification;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final MessagingFragmentScreen getScreen() {
            return this.screen;
        }

        @NotNull
        public final Success copy(boolean isPushNotification, @NotNull MessagingFragmentScreen screen) {
            screen.getClass();
            return new Success(isPushNotification, screen);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Success)) {
                return false;
            }
            Success success = (Success) other;
            return this.isPushNotification == success.isPushNotification && Intrinsics.areEqual(this.screen, success.screen);
        }

        @NotNull
        public final MessagingFragmentScreen getScreen() {
            return this.screen;
        }

        public int hashCode() {
            return this.screen.hashCode() + (Boolean.hashCode(this.isPushNotification) * 31);
        }

        public final boolean isPushNotification() {
            return this.isPushNotification;
        }

        @NotNull
        public String toString() {
            return "Success(isPushNotification=" + this.isPushNotification + ", screen=" + this.screen + ")";
        }

        public /* synthetic */ Success(boolean z11, MessagingFragmentScreen messagingFragmentScreen, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? false : z11, messagingFragmentScreen);
        }
    }
}
