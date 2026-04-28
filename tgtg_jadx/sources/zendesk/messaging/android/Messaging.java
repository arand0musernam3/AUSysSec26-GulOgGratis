package zendesk.messaging.android;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mp.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.d;
import zendesk.android.Zendesk;
import zendesk.android.internal.ZendeskError;
import zendesk.messaging.android.MessagingError;
import zendesk.messaging.android.internal.WrapperMessaging;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lzendesk/messaging/android/Messaging;", "Lzendesk/android/messaging/Messaging;", "Companion", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@d
public interface Messaging extends zendesk.android.messaging.Messaging {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J4\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0007J\b\u0010\u0010\u001a\u00020\fH\u0007J\b\u0010\u0011\u001a\u00020\u0005H\u0007J\u0012\u0010\u0012\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0007¨\u0006\u0015"}, d2 = {"Lzendesk/messaging/android/Messaging$Companion;", "", "<init>", "()V", "initialize", "", "context", "Landroid/content/Context;", "channelKey", "", "successCallback", "Lzendesk/messaging/android/SuccessCallback;", "Lzendesk/messaging/android/Messaging;", "failureCallback", "Lzendesk/messaging/android/FailureCallback;", "Lzendesk/messaging/android/MessagingError;", "instance", "invalidate", "setDelegate", "messagingDelegate", "Lzendesk/messaging/android/MessagingDelegate;", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void initialize$lambda$0(SuccessCallback successCallback, Zendesk zendesk2) {
            zendesk2.getClass();
            successCallback.onSuccess(new WrapperMessaging(zendesk2));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void initialize$lambda$1(FailureCallback failureCallback, Throwable th2) {
            th2.getClass();
            failureCallback.onFailure(Intrinsics.areEqual(th2, ZendeskError.AccountNotFound.INSTANCE) ? MessagingError.AccountNotFound.INSTANCE : th2 instanceof ZendeskError.FailedToInitialize ? new MessagingError.FailedToInitialize(((ZendeskError.FailedToInitialize) th2).getCause()) : Intrinsics.areEqual(th2, ZendeskError.InvalidChannelKey.INSTANCE) ? MessagingError.InvalidChannelKey.INSTANCE : Intrinsics.areEqual(th2, ZendeskError.MissingConfiguration.INSTANCE) ? MessagingError.MissingConfiguration.INSTANCE : Intrinsics.areEqual(th2, ZendeskError.NotInitialized.INSTANCE) ? MessagingError.NotInitialized.INSTANCE : Intrinsics.areEqual(th2, ZendeskError.SdkNotEnabled.INSTANCE) ? MessagingError.SdkNotEnabled.INSTANCE : null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @d
        public final void initialize(@NotNull Context context, @NotNull String channelKey, @NotNull SuccessCallback<Messaging> successCallback, @NotNull FailureCallback<MessagingError> failureCallback) {
            context.getClass();
            channelKey.getClass();
            successCallback.getClass();
            failureCallback.getClass();
            Zendesk.INSTANCE.initialize(context, channelKey, new a(successCallback, 24), new a(failureCallback, 25), new DefaultMessagingFactory(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0));
        }

        @d
        @NotNull
        public final Messaging instance() {
            return new WrapperMessaging(Zendesk.INSTANCE.getInstance());
        }

        @d
        public final void invalidate() {
            Zendesk.INSTANCE.invalidate();
        }

        @d
        public final void setDelegate(@Nullable MessagingDelegate messagingDelegate) {
            zendesk.android.messaging.Messaging.INSTANCE.setDelegate(messagingDelegate);
        }
    }

    @d
    static void initialize(@NotNull Context context, @NotNull String str, @NotNull SuccessCallback<Messaging> successCallback, @NotNull FailureCallback<MessagingError> failureCallback) {
        INSTANCE.initialize(context, str, successCallback, failureCallback);
    }

    @d
    @NotNull
    static Messaging instance() {
        return INSTANCE.instance();
    }

    @d
    static void invalidate() {
        INSTANCE.invalidate();
    }

    @d
    static void setDelegate(@Nullable MessagingDelegate messagingDelegate) {
        INSTANCE.setDelegate(messagingDelegate);
    }
}
