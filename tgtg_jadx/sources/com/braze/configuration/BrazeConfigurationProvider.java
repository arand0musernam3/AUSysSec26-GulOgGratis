package com.braze.configuration;

import a40.d0;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.braze.enums.BrazeSdkMetadata;
import com.braze.enums.DelayedInitializationAnalyticsBehavior;
import com.braze.enums.DeviceKey;
import com.braze.enums.LocationProviderName;
import com.braze.enums.SdkFlavor;
import com.braze.support.BrazeLogger;
import com.braze.support.PackageUtils;
import com.braze.support.j;
import com.braze.support.k;
import e0.f;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.p0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.text.StringsKt;
import rg.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\b\u0017\u0018\u0000 \u007f2\u00020\u0001:\u0003\n\u0080\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J;\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u000e\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0003\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0012\u0012\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u001a\u001a\u00020\u00168F¢\u0006\f\u0012\u0004\b\u0019\u0010\u0011\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001d\u001a\u00020\u00168G¢\u0006\f\u0012\u0004\b\u001c\u0010\u0011\u001a\u0004\b\u001b\u0010\u0018R\u001a\u0010\"\u001a\u00020\u001e8BX\u0082\u0004¢\u0006\f\u0012\u0004\b!\u0010\u0011\u001a\u0004\b\u001f\u0010 R\u0011\u0010$\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0017\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001e0&8F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0011\u0010+\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\b*\u0010 R\u0011\u0010/\u001a\u00020,8F¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0011\u00100\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b0\u0010%R\u0011\u00101\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b1\u0010%R\u0011\u00102\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b2\u0010%R\u0011\u00104\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b3\u0010\u0018R\u0011\u00106\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b5\u0010\u0018R\u0011\u0010:\u001a\u0002078F¢\u0006\u0006\u001a\u0004\b8\u00109R\u0011\u0010<\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b;\u0010\u0018R\u0013\u0010>\u001a\u0004\u0018\u00010\u001e8F¢\u0006\u0006\u001a\u0004\b=\u0010 R\u0011\u0010@\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b?\u0010%R\u0011\u0010B\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\bA\u0010 R\u0011\u0010D\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\bC\u0010 R\u0011\u0010F\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\bE\u0010\u0018R\u0013\u0010J\u001a\u0004\u0018\u00010G8F¢\u0006\u0006\u001a\u0004\bH\u0010IR\u0011\u0010K\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\bK\u0010%R\u0013\u0010M\u001a\u0004\u0018\u00010\u001e8F¢\u0006\u0006\u001a\u0004\bL\u0010 R\u0011\u0010N\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\bN\u0010%R\u0011\u0010O\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\bO\u0010%R\u0011\u0010P\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\bP\u0010%R\u0013\u0010R\u001a\u0004\u0018\u00010\u001e8F¢\u0006\u0006\u001a\u0004\bQ\u0010 R\u0017\u0010V\u001a\b\u0012\u0004\u0012\u00020S0\f8F¢\u0006\u0006\u001a\u0004\bT\u0010UR\u0011\u0010W\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\bW\u0010%R\u0011\u0010X\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\bX\u0010%R\u0011\u0010Y\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\bY\u0010%R\u0011\u0010Z\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\bZ\u0010%R\u0011\u0010\\\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b[\u0010%R\u0011\u0010]\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b]\u0010%R\u0011\u0010^\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b^\u0010%R\u0011\u0010`\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b_\u0010\u0018R\u0013\u0010b\u001a\u0004\u0018\u00010\u001e8F¢\u0006\u0006\u001a\u0004\ba\u0010 R\u0011\u0010d\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\bc\u0010\u0018R\u0017\u0010g\u001a\b\u0012\u0004\u0012\u00020e0\f8F¢\u0006\u0006\u001a\u0004\bf\u0010UR\u0011\u0010h\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\bh\u0010%R\u0011\u0010i\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\bi\u0010%R\u0011\u0010j\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\bj\u0010%R\u0011\u0010k\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\bk\u0010%R\u0017\u0010n\u001a\b\u0012\u0004\u0012\u00020l0\f8F¢\u0006\u0006\u001a\u0004\bm\u0010UR\u0011\u0010o\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\bo\u0010%R\u0013\u0010q\u001a\u0004\u0018\u00010\u001e8F¢\u0006\u0006\u001a\u0004\bp\u0010 R\u0011\u0010s\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\br\u0010%R\u0011\u0010u\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\bt\u0010%R\u0011\u0010v\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\bv\u0010%R\u0011\u0010z\u001a\u00020w8F¢\u0006\u0006\u001a\u0004\bx\u0010yR\u0011\u0010|\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b{\u0010%R\u0011\u0010~\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b}\u0010%¨\u0006\u0081\u0001"}, d2 = {"Lcom/braze/configuration/BrazeConfigurationProvider;", "Lcom/braze/configuration/CachedConfigurationProvider;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "E", "Ljava/lang/Class;", "targetEnumClass", "Lcom/braze/configuration/b;", "configField", "Ljava/util/EnumSet;", "getGenericEnumSetFromStringSet", "(Ljava/lang/Class;Lcom/braze/configuration/b;)Ljava/util/EnumSet;", "", "clear", "()V", "Landroid/content/Context;", "getContext$android_sdk_base_release", "()Landroid/content/Context;", "getContext$android_sdk_base_release$annotations", "", "getVersionCode", "()I", "getVersionCode$annotations", "versionCode", "getDefaultNotificationAccentColor", "getDefaultNotificationAccentColor$annotations", "defaultNotificationAccentColor", "", "getServerTarget", "()Ljava/lang/String;", "getServerTarget$annotations", "serverTarget", "", "isEphemeralEventsEnabled", "()Z", "", "getEphemeralEventKeys", "()Ljava/util/Set;", "ephemeralEventKeys", "getBaseUrlForRequests", "baseUrlForRequests", "Lcom/braze/models/outgoing/b;", "getBrazeApiKey", "()Lcom/braze/models/outgoing/b;", "brazeApiKey", "isAdmMessagingRegistrationEnabled", "isAutomaticLocationCollectionEnabled", "isGeofencesEnabled", "getSmallNotificationIconResourceId", "smallNotificationIconResourceId", "getLargeNotificationIconResourceId", "largeNotificationIconResourceId", "", "getTriggerActionMinimumTimeIntervalInSeconds", "()J", "triggerActionMinimumTimeIntervalInSeconds", "getSessionTimeoutSeconds", "sessionTimeoutSeconds", "getCustomEndpoint", "customEndpoint", "getDoesHandlePushDeepLinksAutomatically", "doesHandlePushDeepLinksAutomatically", "getDefaultNotificationChannelName", "defaultNotificationChannelName", "getDefaultNotificationChannelDescription", "defaultNotificationChannelDescription", "getApplicationIconResourceId", "applicationIconResourceId", "Lcom/braze/enums/SdkFlavor;", "getSdkFlavor", "()Lcom/braze/enums/SdkFlavor;", "sdkFlavor", "isPushDeepLinkBackStackActivityEnabled", "getPushDeepLinkBackStackActivityClassName", "pushDeepLinkBackStackActivityClassName", "isSessionStartBasedTimeoutEnabled", "isFirebaseCloudMessagingRegistrationEnabled", "isContentCardsUnreadVisualIndicatorEnabled", "getFirebaseCloudMessagingSenderIdKey", "firebaseCloudMessagingSenderIdKey", "Lcom/braze/enums/DeviceKey;", "getDeviceObjectAllowlist", "()Ljava/util/EnumSet;", "deviceObjectAllowlist", "isDeviceObjectAllowlistEnabled", "isInAppMessageAccessibilityExclusiveModeEnabled", "isPushWakeScreenForNotificationEnabled", "isPushNotificationHtmlRenderingEnabled", "getDoesPushStoryDismissOnClick", "doesPushStoryDismissOnClick", "isInAppMessageTestPushEagerDisplayEnabled", "isAutomaticGeofenceRequestsEnabled", "getLoggerInitialLogLevel", "loggerInitialLogLevel", "getCustomHtmlWebViewActivityClassName", "customHtmlWebViewActivityClassName", "getInAppMessageWebViewClientOnPageFinishedMaxWaitMs", "inAppMessageWebViewClientOnPageFinishedMaxWaitMs", "Lcom/braze/enums/LocationProviderName;", "getCustomLocationProviderNames", "customLocationProviderNames", "isFirebaseMessagingServiceOnNewTokenRegistrationEnabled", "isSdkAuthenticationEnabled", "isTouchModeRequiredForHtmlInAppMessages", "isHtmlInAppMessageHtmlLinkTargetEnabled", "Lcom/braze/enums/BrazeSdkMetadata;", "getSdkMetadata", "sdkMetadata", "isFallbackFirebaseMessagingServiceEnabled", "getFallbackFirebaseMessagingServiceClasspath", "fallbackFirebaseMessagingServiceClasspath", "getShouldOptInWhenPushAuthorized", "shouldOptInWhenPushAuthorized", "getShouldUseWindowFlagSecureInActivities", "shouldUseWindowFlagSecureInActivities", "isDelayedInitializationEnabled", "Lcom/braze/enums/DelayedInitializationAnalyticsBehavior;", "getDelayedInitializationAnalyticsBehavior", "()Lcom/braze/enums/DelayedInitializationAnalyticsBehavior;", "delayedInitializationAnalyticsBehavior", "getShouldPersistWebViewWhenBackgroundingApp", "shouldPersistWebViewWhenBackgroundingApp", "getShouldAddStatusBarPaddingToInAppMessages", "shouldAddStatusBarPaddingToInAppMessages", "Companion", "com/braze/configuration/a", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class BrazeConfigurationProvider extends CachedConfigurationProvider {
    public static final a Companion = new a();
    public static final int DEFAULT_IN_APP_MESSAGE_WEBVIEW_ONPAGEFINISHED_WAIT_MS = (int) 15000;
    public static final String DEFAULT_NOTIFICATION_CHANNEL_DESCRIPTION_DEFAULT_VALUE = "";
    public static final String DEFAULT_NOTIFICATION_CHANNEL_NAME_DEFAULT_VALUE = "General";
    private static final int DEFAULT_SESSION_TIMEOUT_SECONDS = 10;
    private static final int DEFAULT_TRIGGER_MINIMUM_INTERVAL = 30;
    public static final int MAX_ALLOWED_EPHEMERAL_EVENTS = 12;
    private final Context context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrazeConfigurationProvider(Context context) {
        super(context, false, null, 6, null);
        context.getClass();
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.context = applicationContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_applicationIconResourceId_$lambda$12(String str) {
        return f.k("Couldn't find application icon for package: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_brazeApiKey_$lambda$1() {
        return "Found an override api key. Using it to configure the Braze SDK";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_brazeApiKey_$lambda$10() {
        return "****************************************************";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_brazeApiKey_$lambda$2() {
        return "****************************************************";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_brazeApiKey_$lambda$3() {
        return "**                                                **";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_brazeApiKey_$lambda$4() {
        return "**                 !! WARNING !!                  **";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_brazeApiKey_$lambda$5() {
        return "**                                                **";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_brazeApiKey_$lambda$6() {
        return "**     No API key set in res/values/braze.xml     **";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_brazeApiKey_$lambda$7() {
        return "** No cached API Key found from Braze.configure   **";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_brazeApiKey_$lambda$8() {
        return "**          Braze functionality disabled          **";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_brazeApiKey_$lambda$9() {
        return "**                                                **";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_defaultNotificationAccentColor_$lambda$13() {
        return "Using default notification accent color found in resources";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_ephemeralEventKeys_$lambda$0() {
        return "More than 12 ephemeral/graylisted events detected. Only using first 12 events. Please truncate this list!";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_sdkFlavor_$lambda$14() {
        return "Exception while parsing stored SDK flavor. Returning null.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_versionCode_$lambda$11() {
        return "Unable to read the version code.";
    }

    private final <E extends Enum<E>> EnumSet<E> getGenericEnumSetFromStringSet(Class<E> targetEnumClass, b configField) {
        String str = configField.f9641a;
        if (getConfigurationCache().containsKey(str)) {
            Object obj = getConfigurationCache().get(str);
            obj.getClass();
            return (EnumSet) obj;
        }
        Set<String> stringSetValue = getStringSetValue(configField.f9641a, new HashSet());
        if (stringSetValue == null) {
            stringSetValue = new HashSet<>();
        }
        EnumSet<E> enumSetA = k.a(targetEnumClass, stringSetValue);
        getConfigurationCache().put(str, enumSetA);
        return enumSetA;
    }

    private final String getServerTarget() {
        b bVar = b.DEVICE_OBJECT_ALLOWLIST_VALUE;
        String stringValue = getStringValue("com_braze_server_target", "PROD");
        return stringValue == null ? "PROD" : stringValue;
    }

    public final void clear() throws Throwable {
        getConfigurationCache().clear();
        getRuntimeAppConfigurationProvider().clearAllConfigurationValues();
    }

    public final int getApplicationIconResourceId() {
        if (getConfigurationCache().containsKey("application_icon")) {
            Object obj = getConfigurationCache().get("application_icon");
            obj.getClass();
            return ((Integer) obj).intValue();
        }
        String packageName = this.context.getPackageName();
        int i11 = 0;
        try {
            int i12 = Build.VERSION.SDK_INT;
            Context context = this.context;
            ApplicationInfo applicationInfo = i12 >= 33 ? context.getPackageManager().getApplicationInfo(packageName, PackageManager.ApplicationInfoFlags.of(0L)) : context.getPackageManager().getApplicationInfo(packageName, 0);
            applicationInfo.getClass();
            i11 = applicationInfo.icon;
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new qw.e(packageName, 8), 4, (Object) null);
        }
        getConfigurationCache().put("application_icon", Integer.valueOf(i11));
        return i11;
    }

    public final String getBaseUrlForRequests() {
        String serverTarget = getServerTarget();
        Locale locale = Locale.US;
        locale.getClass();
        String upperCase = serverTarget.toUpperCase(locale);
        upperCase.getClass();
        return Intrinsics.areEqual("STAGING", upperCase) ? "https://sondheim.braze.com/api/v3/" : "https://sdk.iad-01.braze.com/api/v3/";
    }

    public final com.braze.models.outgoing.b getBrazeApiKey() {
        BrazeConfigurationProvider brazeConfigurationProvider;
        b bVar = b.DEVICE_OBJECT_ALLOWLIST_VALUE;
        String stringValue = (String) getConfigurationCache().get("com_braze_api_key");
        if (stringValue == null) {
            stringValue = getRuntimeAppConfigurationProvider().getStringValue("com_braze_api_key", null);
            if (stringValue != null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new m(18), 6, (Object) null);
                brazeConfigurationProvider = this;
            } else {
                brazeConfigurationProvider = this;
                stringValue = brazeConfigurationProvider.getStringValue("com_braze_api_key", null);
            }
            if (stringValue != null) {
                brazeConfigurationProvider.getConfigurationCache().put("com_braze_api_key", stringValue);
            }
        } else {
            brazeConfigurationProvider = this;
        }
        if (stringValue != null) {
            return new com.braze.models.outgoing.b(stringValue);
        }
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.W;
        BrazeLogger.brazelog$default(brazeLogger, (Object) brazeConfigurationProvider, priority, (Throwable) null, false, (Function0) new m(19), 6, (Object) null);
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) new m(20), 6, (Object) null);
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) new m(21), 6, (Object) null);
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) new m(22), 6, (Object) null);
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) new m(10), 6, (Object) null);
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) new m(11), 6, (Object) null);
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) new m(12), 6, (Object) null);
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) new m(13), 6, (Object) null);
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) new m(14), 6, (Object) null);
        d0.k("Unable to read the Braze API key from the res/values/braze.xml file or from runtime configuration via BrazeConfig. See log for more details.");
        return null;
    }

    /* JADX INFO: renamed from: getContext$android_sdk_base_release, reason: from getter */
    public final Context getContext() {
        return this.context;
    }

    public final String getCustomEndpoint() {
        b bVar = b.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getStringValue("com_braze_custom_endpoint", null);
    }

    public final String getCustomHtmlWebViewActivityClassName() {
        b bVar = b.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getStringValue("com_braze_custom_html_webview_activity_class_name", "");
    }

    public final EnumSet<LocationProviderName> getCustomLocationProviderNames() {
        return getGenericEnumSetFromStringSet(LocationProviderName.class, b.CUSTOM_LOCATION_PROVIDERS_LIST_KEY);
    }

    public final int getDefaultNotificationAccentColor() {
        b bVar = b.DEVICE_OBJECT_ALLOWLIST_VALUE;
        Integer colorValue = getColorValue("com_braze_default_notification_accent_color");
        if (colorValue == null) {
            return 0;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new m(15), 7, (Object) null);
        return colorValue.intValue();
    }

    public final String getDefaultNotificationChannelDescription() {
        b bVar = b.DEVICE_OBJECT_ALLOWLIST_VALUE;
        String stringValue = getStringValue("com_braze_default_notification_channel_description", "");
        return stringValue == null ? "" : stringValue;
    }

    public final String getDefaultNotificationChannelName() {
        b bVar = b.DEVICE_OBJECT_ALLOWLIST_VALUE;
        String stringValue = getStringValue("com_braze_default_notification_channel_name", DEFAULT_NOTIFICATION_CHANNEL_NAME_DEFAULT_VALUE);
        return stringValue == null ? DEFAULT_NOTIFICATION_CHANNEL_NAME_DEFAULT_VALUE : stringValue;
    }

    public final DelayedInitializationAnalyticsBehavior getDelayedInitializationAnalyticsBehavior() {
        DelayedInitializationAnalyticsBehavior.Companion companion = DelayedInitializationAnalyticsBehavior.INSTANCE;
        b bVar = b.DEVICE_OBJECT_ALLOWLIST_VALUE;
        DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior = DelayedInitializationAnalyticsBehavior.QUEUE;
        String stringValue = getStringValue("com_braze_delayed_initialization_analytics_behavior", delayedInitializationAnalyticsBehavior.getValue());
        if (stringValue == null) {
            stringValue = delayedInitializationAnalyticsBehavior.getValue();
        }
        return companion.fromString(stringValue);
    }

    public final EnumSet<DeviceKey> getDeviceObjectAllowlist() {
        return getGenericEnumSetFromStringSet(DeviceKey.class, b.DEVICE_OBJECT_ALLOWLIST_VALUE);
    }

    public final boolean getDoesHandlePushDeepLinksAutomatically() {
        b bVar = b.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getBooleanValue("com_braze_handle_push_deep_links_automatically", false);
    }

    public final boolean getDoesPushStoryDismissOnClick() {
        b bVar = b.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getBooleanValue("com_braze_does_push_story_dismiss_on_click", true);
    }

    public final Set<String> getEphemeralEventKeys() {
        b bVar = b.DEVICE_OBJECT_ALLOWLIST_VALUE;
        Set<String> set = p0.f26531a;
        Set<String> stringSetValue = getStringSetValue("com_braze_ephemeral_events_keys", set);
        if (stringSetValue != null) {
            set = stringSetValue;
        }
        if (set.size() > 12) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new m(16), 6, (Object) null);
        }
        return CollectionsKt.v0(CollectionsKt.m0(set, 12));
    }

    public final String getFallbackFirebaseMessagingServiceClasspath() {
        b bVar = b.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getStringValue("com_braze_fallback_firebase_cloud_messaging_service_classpath", null);
    }

    public final String getFirebaseCloudMessagingSenderIdKey() {
        b bVar = b.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getStringValue("com_braze_firebase_cloud_messaging_sender_id", null);
    }

    public final int getInAppMessageWebViewClientOnPageFinishedMaxWaitMs() {
        b bVar = b.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getIntValue("com_braze_in_app_message_webview_client_max_onpagefinished_wait_ms", DEFAULT_IN_APP_MESSAGE_WEBVIEW_ONPAGEFINISHED_WAIT_MS);
    }

    public final int getLargeNotificationIconResourceId() {
        b bVar = b.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getDrawableValue("com_braze_push_large_notification_icon", 0);
    }

    public final int getLoggerInitialLogLevel() {
        b bVar = b.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getIntValue("com_braze_logger_initial_log_level", 4);
    }

    public final String getPushDeepLinkBackStackActivityClassName() {
        b bVar = b.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getStringValue("com_braze_push_deep_link_back_stack_activity_class_name", "");
    }

    public final SdkFlavor getSdkFlavor() {
        b bVar = b.DEVICE_OBJECT_ALLOWLIST_VALUE;
        String stringValue = getStringValue("com_braze_sdk_flavor", null);
        if (stringValue != null && !StringsKt.H(stringValue)) {
            try {
                Locale locale = Locale.US;
                locale.getClass();
                String upperCase = stringValue.toUpperCase(locale);
                upperCase.getClass();
                return SdkFlavor.valueOf(upperCase);
            } catch (Exception e5) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new m(17), 4, (Object) null);
            }
        }
        return null;
    }

    public final EnumSet<BrazeSdkMetadata> getSdkMetadata() {
        String upperCase;
        int i11;
        b bVar = b.DEVICE_OBJECT_ALLOWLIST_VALUE;
        d dVar = d.STRING_ARRAY;
        Object resourceConfigurationValue = getResourceConfigurationValue(dVar, "com_braze_internal_sdk_metadata", new HashSet());
        resourceConfigurationValue.getClass();
        Set<String> setAsMutableSet = TypeIntrinsics.asMutableSet(resourceConfigurationValue);
        Object resourceConfigurationValue2 = getResourceConfigurationValue(dVar, "com_braze_sdk_metadata", new HashSet());
        resourceConfigurationValue2.getClass();
        Object runtimeConfigurationValue = getRuntimeConfigurationValue(dVar, "com_braze_sdk_metadata", new HashSet());
        runtimeConfigurationValue.getClass();
        setAsMutableSet.addAll((Set) resourceConfigurationValue2);
        setAsMutableSet.addAll((Set) runtimeConfigurationValue);
        EnumSet<BrazeSdkMetadata> enumSetNoneOf = EnumSet.noneOf(BrazeSdkMetadata.class);
        for (String str : setAsMutableSet) {
            try {
                Locale locale = Locale.US;
                locale.getClass();
                upperCase = str.toUpperCase(locale);
                upperCase.getClass();
            } catch (Exception e5) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) k.f10763a, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new j(str), 4, (Object) null);
            }
            for (BrazeSdkMetadata brazeSdkMetadata : BrazeSdkMetadata.values()) {
                if (Intrinsics.areEqual(brazeSdkMetadata.name(), upperCase)) {
                    enumSetNoneOf.add(brazeSdkMetadata);
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        enumSetNoneOf.getClass();
        return enumSetNoneOf;
    }

    public final int getSessionTimeoutSeconds() {
        b bVar = b.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getIntValue("com_braze_session_timeout", 10);
    }

    public final boolean getShouldAddStatusBarPaddingToInAppMessages() {
        b bVar = b.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getBooleanValue("com_braze_in_app_message_add_status_bar_padding", false);
    }

    public final boolean getShouldOptInWhenPushAuthorized() {
        b bVar = b.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getBooleanValue("com_braze_optin_when_push_authorized", true);
    }

    public final boolean getShouldPersistWebViewWhenBackgroundingApp() {
        b bVar = b.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getBooleanValue("com_braze_persist_webview_when_backgrounding_app", true);
    }

    public final boolean getShouldUseWindowFlagSecureInActivities() {
        b bVar = b.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getBooleanValue("com_braze_use_activity_window_flag_secure", false);
    }

    public final int getSmallNotificationIconResourceId() {
        b bVar = b.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getDrawableValue("com_braze_push_small_notification_icon", 0);
    }

    public final long getTriggerActionMinimumTimeIntervalInSeconds() {
        b bVar = b.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getIntValue("com_braze_trigger_action_minimum_time_interval_seconds", 30);
    }

    public final int getVersionCode() {
        int i11;
        if (getConfigurationCache().containsKey("version_code")) {
            Object obj = getConfigurationCache().get("version_code");
            obj.getClass();
            return ((Integer) obj).intValue();
        }
        try {
            i11 = this.context.getPackageManager().getPackageInfo(PackageUtils.getResourcePackageName(this.context), 0).versionCode;
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new m(9), 4, (Object) null);
            i11 = -1;
        }
        getConfigurationCache().put("version_code", Integer.valueOf(i11));
        return i11;
    }

    public final boolean isAdmMessagingRegistrationEnabled() {
        b bVar = b.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getBooleanValue("com_braze_push_adm_messaging_registration_enabled", false);
    }

    public final boolean isAutomaticGeofenceRequestsEnabled() {
        b bVar = b.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getBooleanValue("com_braze_automatic_geofence_requests_enabled", true);
    }

    public final boolean isAutomaticLocationCollectionEnabled() {
        b bVar = b.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getBooleanValue("com_braze_enable_location_collection", false);
    }

    public final boolean isContentCardsUnreadVisualIndicatorEnabled() {
        b bVar = b.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getBooleanValue("com_braze_content_cards_unread_visual_indicator_enabled", true);
    }

    public final boolean isDelayedInitializationEnabled() {
        b bVar = b.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getBooleanValue("com_braze_enable_delayed_initialization", false);
    }

    public final boolean isDeviceObjectAllowlistEnabled() {
        b bVar = b.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getBooleanValue("com_braze_device_object_whitelisting_enabled", false);
    }

    public final boolean isEphemeralEventsEnabled() {
        b bVar = b.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getBooleanValue("com_braze_ephemeral_events_enabled", false);
    }

    public final boolean isFallbackFirebaseMessagingServiceEnabled() {
        b bVar = b.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getBooleanValue("com_braze_fallback_firebase_cloud_messaging_service_enabled", false);
    }

    public final boolean isFirebaseCloudMessagingRegistrationEnabled() {
        b bVar = b.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getBooleanValue("com_braze_firebase_cloud_messaging_registration_enabled", false);
    }

    public final boolean isFirebaseMessagingServiceOnNewTokenRegistrationEnabled() {
        b bVar = b.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getBooleanValue("com_braze_firebase_messaging_service_automatically_register_on_new_token", isFirebaseCloudMessagingRegistrationEnabled());
    }

    public final boolean isGeofencesEnabled() {
        b bVar = b.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getBooleanValue("com_braze_geofences_enabled", isAutomaticLocationCollectionEnabled());
    }

    public final boolean isHtmlInAppMessageHtmlLinkTargetEnabled() {
        b bVar = b.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getBooleanValue("com_braze_html_in_app_message_enable_html_link_target", true);
    }

    public final boolean isInAppMessageAccessibilityExclusiveModeEnabled() {
        b bVar = b.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getBooleanValue("com_braze_device_in_app_message_accessibility_exclusive_mode_enabled", false);
    }

    public final boolean isInAppMessageTestPushEagerDisplayEnabled() {
        b bVar = b.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getBooleanValue("com_braze_in_app_message_push_test_eager_display_enabled", true);
    }

    public final boolean isPushDeepLinkBackStackActivityEnabled() {
        b bVar = b.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getBooleanValue("com_braze_push_deep_link_back_stack_activity_enabled", true);
    }

    public final boolean isPushNotificationHtmlRenderingEnabled() {
        b bVar = b.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getBooleanValue("com_braze_push_notification_html_rendering_enabled", false);
    }

    public final boolean isPushWakeScreenForNotificationEnabled() {
        b bVar = b.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getBooleanValue("com_braze_push_wake_screen_for_notification_enabled", true);
    }

    public final boolean isSdkAuthenticationEnabled() {
        b bVar = b.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getBooleanValue("com_braze_sdk_authentication_enabled", false);
    }

    public final boolean isSessionStartBasedTimeoutEnabled() {
        b bVar = b.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getBooleanValue("com_braze_session_start_based_timeout_enabled", false);
    }

    public final boolean isTouchModeRequiredForHtmlInAppMessages() {
        b bVar = b.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getBooleanValue("com_braze_require_touch_mode_for_html_in_app_messages", true);
    }

    public static /* synthetic */ void getContext$android_sdk_base_release$annotations() {
    }

    public static /* synthetic */ void getDefaultNotificationAccentColor$annotations() {
    }

    private static /* synthetic */ void getServerTarget$annotations() {
    }

    public static /* synthetic */ void getVersionCode$annotations() {
    }
}
