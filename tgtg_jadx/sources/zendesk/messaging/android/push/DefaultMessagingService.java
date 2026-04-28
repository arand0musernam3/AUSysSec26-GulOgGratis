package zendesk.messaging.android.push;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.y;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import zendesk.logger.Logger;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lzendesk/messaging/android/push/DefaultMessagingService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "<init>", "()V", "Lcom/google/firebase/messaging/y;", "remoteMessage", "", "onMessageReceived", "(Lcom/google/firebase/messaging/y;)V", "", "newToken", "onNewToken", "(Ljava/lang/String;)V", "Companion", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DefaultMessagingService extends FirebaseMessagingService {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final String LOG_TAG = "DefaultMessagingService";

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PushResponsibility.values().length];
            try {
                iArr[PushResponsibility.MESSAGING_SHOULD_DISPLAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PushResponsibility.MESSAGING_SHOULD_NOT_DISPLAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PushResponsibility.NOT_FROM_MESSAGING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onMessageReceived(@NotNull y remoteMessage) {
        remoteMessage.getClass();
        Map mapD = remoteMessage.d();
        mapD.getClass();
        int i11 = WhenMappings.$EnumSwitchMapping$0[PushNotifications.shouldBeDisplayed(mapD).ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                Logger.d(LOG_TAG, "Notification received from Messaging but shouldn't be displayed", new Object[0]);
                return;
            } else if (i11 == 3) {
                Logger.d(LOG_TAG, "Notification received but doesn't belong to Messaging", new Object[0]);
                return;
            } else {
                e40.a.f();
                return;
            }
        }
        Map mapD2 = remoteMessage.d();
        mapD2.getClass();
        if (!PushNotifications.validatePushIntegration(this, mapD2)) {
            Logger.d(LOG_TAG, "Notification received from Messaging but shouldn't be displayed since push integration is not valid.", new Object[0]);
            return;
        }
        Logger.d(LOG_TAG, "Notification received from Messaging and should be displayed", new Object[0]);
        Map mapD3 = remoteMessage.d();
        mapD3.getClass();
        PushNotifications.displayNotification(this, mapD3);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(@NotNull String newToken) {
        newToken.getClass();
        Logger.d(LOG_TAG, "New FCM token: " + newToken, new Object[0]);
        PushNotifications.updatePushNotificationToken(newToken);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lzendesk/messaging/android/push/DefaultMessagingService$Companion;", "", "<init>", "()V", "LOG_TAG", "", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
