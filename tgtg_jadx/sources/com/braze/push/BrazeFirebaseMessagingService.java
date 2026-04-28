package com.braze.push;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.braze.Braze;
import com.braze.BrazeInternal;
import com.braze.Constants;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.f1;
import com.braze.push.BrazePushReceiver;
import com.braze.support.BrazeLogger;
import com.braze.support.ReflectionUtils;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.y;
import j4.s;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/braze/push/BrazeFirebaseMessagingService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "<init>", "()V", "", "newToken", "", "onNewToken", "(Ljava/lang/String;)V", "Lcom/google/firebase/messaging/y;", "remoteMessage", BrazeFirebaseMessagingService.FCM_SERVICE_OMR_METHOD, "(Lcom/google/firebase/messaging/y;)V", "Companion", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class BrazeFirebaseMessagingService extends FirebaseMessagingService {

    @NotNull
    private static final String CONTEXT_ATTACH_METHOD = "attachBaseContext";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String FCM_SERVICE_OMR_METHOD = "onMessageReceived";

    public static final boolean handleBrazeRemoteMessage(@NotNull Context context, @NotNull y yVar) {
        return INSTANCE.handleBrazeRemoteMessage(context, yVar);
    }

    public static final void handleOnNewToken(@NotNull Context context, @NotNull String str) {
        INSTANCE.handleOnNewToken(context, str);
    }

    public static final boolean isBrazePushNotification(@NotNull y yVar) {
        return INSTANCE.isBrazePushNotification(yVar);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onMessageReceived(@NotNull y remoteMessage) {
        remoteMessage.getClass();
        super.onMessageReceived(remoteMessage);
        INSTANCE.handleBrazeRemoteMessage(this, remoteMessage);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(@NotNull String newToken) {
        newToken.getClass();
        super.onNewToken(newToken);
        INSTANCE.handleOnNewToken(this, newToken);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/braze/push/BrazeFirebaseMessagingService$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "newToken", "", "handleOnNewToken", "(Landroid/content/Context;Ljava/lang/String;)V", "Lcom/google/firebase/messaging/y;", "remoteMessage", "", "handleBrazeRemoteMessage", "(Landroid/content/Context;Lcom/google/firebase/messaging/y;)Z", "isBrazePushNotification", "(Lcom/google/firebase/messaging/y;)Z", "classpath", "invokeFallbackFirebaseService$android_sdk_ui_release", "(Ljava/lang/String;Lcom/google/firebase/messaging/y;Landroid/content/Context;)V", "invokeFallbackFirebaseService", "FCM_SERVICE_OMR_METHOD", "Ljava/lang/String;", "CONTEXT_ATTACH_METHOD", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handleBrazeRemoteMessage$lambda$3(y yVar) {
            return "Remote message did not originate from Braze. Not consuming remote message: " + yVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handleBrazeRemoteMessage$lambda$4(String str) {
            return e0.f.k("Fallback FCM service enabled. Attempting to use fallback class at ", str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handleBrazeRemoteMessage$lambda$5() {
            return "Fallback FCM service enabled but classpath is null. Not routing to any fallback service.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handleBrazeRemoteMessage$lambda$6() {
            return "FallbackFirebaseMessagingService is not enabled";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handleBrazeRemoteMessage$lambda$7(Map map) {
            return "Got remote message from FCM: " + map;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handleBrazeRemoteMessage$lambda$8(String str, String str2) {
            return s.k("Adding bundle item from FCM remote data with key: ", str, " and value: ", str2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handleOnNewToken$lambda$0(String str) {
            return e0.f.k("No configured API key, not registering token in handleOnNewToken. Token: ", str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handleOnNewToken$lambda$1(String str) {
            return e0.f.k("Automatic FirebaseMessagingService.onNewToken() registration disabled, not registering token: ", str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handleOnNewToken$lambda$2(String str) {
            return e0.f.k("Registering Firebase push token in handleOnNewToken. Token: ", str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String invokeFallbackFirebaseService$lambda$10(String str) {
            return a0.p("Attempting to call ", str, " attachBaseContext");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String invokeFallbackFirebaseService$lambda$11(String str) {
            return a0.p("Failure invoking ", str, ".attachBaseContext. Not doing anything.");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String invokeFallbackFirebaseService$lambda$12() {
            return "Could not find attachBaseContext. Not doing anything.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String invokeFallbackFirebaseService$lambda$13(String str) {
            return a0.p("Fallback firebase messaging service method ", str, ".onMessageReceived could not be retrieved. Not routing fallback RemoteMessage.");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String invokeFallbackFirebaseService$lambda$14(String str) {
            return a0.p("Attempting to invoke firebase messaging fallback service ", str, ".onMessageReceived");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String invokeFallbackFirebaseService$lambda$9(String str) {
            return a0.p("Fallback firebase messaging service ", str, " could not be constructed. Not routing fallback RemoteMessage.");
        }

        public final boolean handleBrazeRemoteMessage(@NotNull Context context, @NotNull y remoteMessage) {
            context.getClass();
            remoteMessage.getClass();
            if (!isBrazePushNotification(remoteMessage)) {
                BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                BrazeLogger.Priority priority = BrazeLogger.Priority.I;
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) new h(remoteMessage, 1), 6, (Object) null);
                BrazeConfigurationProvider configurationProvider = BrazeInternal.INSTANCE.getConfigurationProvider(context);
                if (!configurationProvider.isFallbackFirebaseMessagingServiceEnabled()) {
                    BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new k(2), 7, (Object) null);
                    return false;
                }
                String fallbackFirebaseMessagingServiceClasspath = configurationProvider.getFallbackFirebaseMessagingServiceClasspath();
                if (fallbackFirebaseMessagingServiceClasspath == null) {
                    BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new k(1), 7, (Object) null);
                    return false;
                }
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) new a(fallbackFirebaseMessagingServiceClasspath, 5), 6, (Object) null);
                invokeFallbackFirebaseService$android_sdk_ui_release(fallbackFirebaseMessagingServiceClasspath, remoteMessage, context);
                return false;
            }
            Map mapD = remoteMessage.d();
            mapD.getClass();
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new b(mapD, 0), 6, (Object) null);
            Intent intent = new Intent(BrazePushReceiver.FIREBASE_MESSAGING_SERVICE_ROUTING_ACTION);
            Bundle bundle = new Bundle();
            for (Map.Entry entry : ((q1.e) mapD).entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new f1(str, str2, 5), 6, (Object) null);
                bundle.putString(str, str2);
            }
            intent.putExtras(bundle);
            BrazePushReceiver.Companion.handleReceivedIntent$default(BrazePushReceiver.INSTANCE, context, intent, false, 4, null);
            return true;
        }

        public final void handleOnNewToken(@NotNull Context context, @NotNull String newToken) {
            context.getClass();
            newToken.getClass();
            BrazeInternal.applyPendingRuntimeConfiguration(context);
            BrazeConfigurationProvider configurationProvider = BrazeInternal.INSTANCE.getConfigurationProvider(context);
            Braze.Companion companion = Braze.INSTANCE;
            String configuredApiKey = companion.getConfiguredApiKey(configurationProvider);
            if (configuredApiKey == null || configuredApiKey.length() == 0) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new a(newToken, 2), 6, (Object) null);
            } else if (!configurationProvider.isFirebaseMessagingServiceOnNewTokenRegistrationEnabled()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new a(newToken, 3), 6, (Object) null);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new a(newToken, 4), 6, (Object) null);
                companion.getInstance(context).setRegisteredPushToken(newToken);
            }
        }

        public final void invokeFallbackFirebaseService$android_sdk_ui_release(@NotNull String classpath, @NotNull y remoteMessage, @NotNull Context context) {
            classpath.getClass();
            remoteMessage.getClass();
            context.getClass();
            ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
            Object objConstructObjectQuietly$default = ReflectionUtils.constructObjectQuietly$default(reflectionUtils, classpath, null, null, 6, null);
            if (objConstructObjectQuietly$default == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new a(classpath, 6), 7, (Object) null);
                return;
            }
            Method declaredMethodQuietly = reflectionUtils.getDeclaredMethodQuietly(classpath, BrazeFirebaseMessagingService.CONTEXT_ATTACH_METHOD, Context.class);
            if (declaredMethodQuietly == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new k(3), 7, (Object) null);
                return;
            }
            declaredMethodQuietly.setAccessible(true);
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new a(classpath, 7), 7, (Object) null);
            if (!((Boolean) ReflectionUtils.invokeMethodQuietly(objConstructObjectQuietly$default, declaredMethodQuietly, context).f26485a).booleanValue()) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new a(classpath, 8), 7, (Object) null);
                return;
            }
            Method methodQuietly = ReflectionUtils.getMethodQuietly(classpath, BrazeFirebaseMessagingService.FCM_SERVICE_OMR_METHOD, (Class<?>[]) new Class[]{y.class});
            if (methodQuietly == null) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new a(classpath, 0), 7, (Object) null);
            } else {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new a(classpath, 1), 7, (Object) null);
                ((Boolean) ReflectionUtils.invokeMethodQuietly(objConstructObjectQuietly$default, methodQuietly, remoteMessage).f26485a).getClass();
            }
        }

        public final boolean isBrazePushNotification(@NotNull y remoteMessage) {
            remoteMessage.getClass();
            Map mapD = remoteMessage.d();
            mapD.getClass();
            return Intrinsics.areEqual("true", ((q1.e) mapD).get(Constants.BRAZE_PUSH_BRAZE_KEY));
        }

        private Companion() {
        }
    }
}
