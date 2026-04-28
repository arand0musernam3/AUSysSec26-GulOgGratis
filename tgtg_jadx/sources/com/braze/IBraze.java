package com.braze;

import android.app.Activity;
import android.content.Intent;
import com.appsflyer.AppsFlyerProperties;
import com.braze.events.BannersUpdatedEvent;
import com.braze.events.BrazeNetworkFailureEvent;
import com.braze.events.BrazePushEvent;
import com.braze.events.BrazeSdkAuthenticationErrorEvent;
import com.braze.events.BrazeUserChangeEvent;
import com.braze.events.ContentCardsUpdatedEvent;
import com.braze.events.FeatureFlagsUpdatedEvent;
import com.braze.events.IEventSubscriber;
import com.braze.events.IValueCallback;
import com.braze.events.InAppMessageEvent;
import com.braze.events.NoMatchingTriggerEvent;
import com.braze.events.SessionStateChangedEvent;
import com.braze.images.IBrazeImageLoader;
import com.braze.models.Banner;
import com.braze.models.FeatureFlag;
import com.braze.models.cards.Card;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.outgoing.BrazeProperties;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000ð\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006J\u0019\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH&¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\r\u001a\u0004\u0018\u00010\fH&¢\u0006\u0004\b\n\u0010\u000eJ-\u0010\u0013\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H&¢\u0006\u0004\b\u0013\u0010\u0014J7\u0010\u0013\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\r\u001a\u0004\u0018\u00010\fH&¢\u0006\u0004\b\u0013\u0010\u0015J5\u0010\u0013\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\b\u0013\u0010\u0018JC\u0010\u0013\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0017\u001a\u00020\u00162\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH&¢\u0006\u0004\b\u0013\u0010\u0019J\u0019\u0010\u001b\u001a\u00020\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\bH&¢\u0006\u0004\b\u001b\u0010\u000bJ\u0019\u0010\u001b\u001a\u00020\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH&¢\u0006\u0004\b\u001b\u0010\u001eJ-\u0010!\u001a\u00020\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\b2\b\u0010\u001f\u001a\u0004\u0018\u00010\b2\b\u0010 \u001a\u0004\u0018\u00010\bH&¢\u0006\u0004\b!\u0010\"J#\u0010$\u001a\u00020\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\b2\b\u0010#\u001a\u0004\u0018\u00010\bH&¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0004H&¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0004H&¢\u0006\u0004\b(\u0010'J\u000f\u0010)\u001a\u00020\u0004H&¢\u0006\u0004\b)\u0010'J\u001d\u0010,\u001a\u00020\u00042\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\b0*H&¢\u0006\u0004\b,\u0010-J/\u0010,\u001a\u00020\u00042\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\b0*2\u0010\b\u0002\u00100\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010.H&¢\u0006\u0004\b,\u00101J\u0019\u00104\u001a\u0004\u0018\u0001032\u0006\u00102\u001a\u00020\bH&¢\u0006\u0004\b4\u00105J\u0017\u00108\u001a\u0002072\u0006\u00106\u001a\u00020\bH&¢\u0006\u0004\b8\u00109J!\u0010;\u001a\u00020\u00042\u0006\u00106\u001a\u00020\b2\b\u0010:\u001a\u0004\u0018\u00010\bH&¢\u0006\u0004\b;\u0010%J\u0015\u0010=\u001a\b\u0012\u0004\u0012\u00020<0*H&¢\u0006\u0004\b=\u0010>J\u0019\u0010?\u001a\u0004\u0018\u00010<2\u0006\u00102\u001a\u00020\bH&¢\u0006\u0004\b?\u0010@J\u0017\u0010A\u001a\u00020\u00042\u0006\u00102\u001a\u00020\bH&¢\u0006\u0004\bA\u0010\u000bJ\u000f\u0010B\u001a\u00020\u0004H&¢\u0006\u0004\bB\u0010'J\u001d\u0010F\u001a\u00020\u00042\f\u0010E\u001a\b\u0012\u0004\u0012\u00020D0CH&¢\u0006\u0004\bF\u0010GJ\u001d\u0010I\u001a\u00020\u00042\f\u0010E\u001a\b\u0012\u0004\u0012\u00020H0CH&¢\u0006\u0004\bI\u0010GJ\u001d\u0010J\u001a\u00020\u00042\f\u0010E\u001a\b\u0012\u0004\u0012\u00020/0CH&¢\u0006\u0004\bJ\u0010GJ\u001d\u0010L\u001a\u00020\u00042\f\u0010E\u001a\b\u0012\u0004\u0012\u00020K0CH&¢\u0006\u0004\bL\u0010GJ\u001d\u0010N\u001a\u00020\u00042\f\u0010E\u001a\b\u0012\u0004\u0012\u00020M0CH&¢\u0006\u0004\bN\u0010GJ\u001d\u0010P\u001a\u00020\u00042\f\u0010E\u001a\b\u0012\u0004\u0012\u00020O0CH&¢\u0006\u0004\bP\u0010GJ\u001d\u0010R\u001a\u00020\u00042\f\u0010E\u001a\b\u0012\u0004\u0012\u00020Q0CH&¢\u0006\u0004\bR\u0010GJ\u001d\u0010T\u001a\u00020\u00042\f\u0010E\u001a\b\u0012\u0004\u0012\u00020S0CH&¢\u0006\u0004\bT\u0010GJ\u001d\u0010V\u001a\u00020\u00042\f\u0010E\u001a\b\u0012\u0004\u0012\u00020U0CH&¢\u0006\u0004\bV\u0010GJ\u001d\u0010X\u001a\u00020\u00042\f\u0010E\u001a\b\u0012\u0004\u0012\u00020W0CH&¢\u0006\u0004\bX\u0010GJ\u001d\u0010Z\u001a\u00020\u00042\f\u0010E\u001a\b\u0012\u0004\u0012\u00020Y0CH&¢\u0006\u0004\bZ\u0010GJ1\u0010^\u001a\u00020\u0004\"\u0004\b\u0000\u0010[2\f\u0010E\u001a\b\u0012\u0004\u0012\u00028\u00000C2\f\u0010]\u001a\b\u0012\u0004\u0012\u00028\u00000\\H&¢\u0006\u0004\b^\u0010_J3\u0010`\u001a\u00020\u0004\"\u0004\b\u0000\u0010[2\u000e\u0010E\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010C2\f\u0010]\u001a\b\u0012\u0004\u0012\u00028\u00000\\H&¢\u0006\u0004\b`\u0010_J\u0019\u0010b\u001a\u00020\u00042\b\u0010a\u001a\u0004\u0018\u00010\bH&¢\u0006\u0004\bb\u0010\u000bJ#\u0010b\u001a\u00020\u00042\b\u0010a\u001a\u0004\u0018\u00010\b2\b\u0010c\u001a\u0004\u0018\u00010\bH&¢\u0006\u0004\bb\u0010%J\u001d\u0010e\u001a\u00020\u00042\f\u00100\u001a\b\u0012\u0004\u0012\u00020d0.H&¢\u0006\u0004\be\u0010fJ\u001d\u0010g\u001a\u00020\u00042\f\u00100\u001a\b\u0012\u0004\u0012\u00020\b0.H&¢\u0006\u0004\bg\u0010fJ\u000f\u0010h\u001a\u00020\u0016H&¢\u0006\u0004\bh\u0010iJ\u000f\u0010j\u001a\u00020\u0016H&¢\u0006\u0004\bj\u0010iJ\u000f\u0010l\u001a\u00020kH&¢\u0006\u0004\bl\u0010mJ\u0017\u0010o\u001a\n\u0012\u0004\u0012\u00020n\u0018\u00010*H&¢\u0006\u0004\bo\u0010>J!\u0010r\u001a\u00020\u00042\b\u0010p\u001a\u0004\u0018\u00010\b2\u0006\u0010q\u001a\u000207H&¢\u0006\u0004\br\u0010sJ\u001b\u0010v\u001a\u0004\u0018\u00010u2\b\u0010t\u001a\u0004\u0018\u00010\bH&¢\u0006\u0004\bv\u0010wJ\u001b\u0010y\u001a\u0004\u0018\u00010n2\b\u0010x\u001a\u0004\u0018\u00010\bH&¢\u0006\u0004\by\u0010zJ\u001b\u0010y\u001a\u0004\u0018\u00010n2\b\u0010|\u001a\u0004\u0018\u00010{H&¢\u0006\u0004\by\u0010}J\u000f\u0010~\u001a\u00020\u0004H&¢\u0006\u0004\b~\u0010'J$\u0010\u0082\u0001\u001a\u00020\u00042\u0007\u0010\u0080\u0001\u001a\u00020\u007f2\u0007\u0010\u0081\u0001\u001a\u00020\u007fH&¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J\u001a\u0010\u0085\u0001\u001a\u00020\u00042\u0007\u0010\u0084\u0001\u001a\u00020\bH&¢\u0006\u0005\b\u0085\u0001\u0010\u000bR\u0018\u0010\u0087\u0001\u001a\u0004\u0018\u00010d8&X¦\u0004¢\u0006\u0007\u001a\u0005\be\u0010\u0086\u0001R\"\u0010\u008d\u0001\u001a\u00030\u0088\u00018&@&X¦\u000e¢\u0006\u0010\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001\"\u0006\b\u008b\u0001\u0010\u008c\u0001R\"\u0010\u0091\u0001\u001a\u0004\u0018\u00010\b8&@&X¦\u000e¢\u0006\u000f\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001\"\u0005\b\u0090\u0001\u0010\u000bR\u0017\u0010\u0093\u0001\u001a\u00020\b8&X¦\u0004¢\u0006\b\u001a\u0006\b\u0092\u0001\u0010\u008f\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0094\u0001À\u0006\u0001"}, d2 = {"Lcom/braze/IBraze;", "", "Landroid/app/Activity;", "activity", "", "openSession", "(Landroid/app/Activity;)V", "closeSession", "", "eventName", "logCustomEvent", "(Ljava/lang/String;)V", "Lcom/braze/models/outgoing/BrazeProperties;", "properties", "(Ljava/lang/String;Lcom/braze/models/outgoing/BrazeProperties;)V", "productId", AppsFlyerProperties.CURRENCY_CODE, "Ljava/math/BigDecimal;", "price", "logPurchase", "(Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Lcom/braze/models/outgoing/BrazeProperties;)V", "", "quantity", "(Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;I)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;ILcom/braze/models/outgoing/BrazeProperties;)V", "campaignId", "logPushNotificationOpened", "Landroid/content/Intent;", "intent", "(Landroid/content/Intent;)V", "actionId", "actionType", "logPushNotificationActionClicked", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "pageId", "logPushStoryPageClicked", "(Ljava/lang/String;Ljava/lang/String;)V", "requestContentCardsRefresh", "()V", "requestContentCardsRefreshFromCache", "refreshFeatureFlags", "", "ids", "requestBannersRefresh", "(Ljava/util/List;)V", "Lcom/braze/events/IValueCallback;", "Lcom/braze/events/BannersUpdatedEvent;", "completionCallback", "(Ljava/util/List;Lcom/braze/events/IValueCallback;)V", "id", "Lcom/braze/models/Banner;", "getBanner", "(Ljava/lang/String;)Lcom/braze/models/Banner;", "placementId", "", "logBannerImpression", "(Ljava/lang/String;)Z", "buttonId", "logBannerClick", "Lcom/braze/models/FeatureFlag;", "getAllFeatureFlags", "()Ljava/util/List;", "getFeatureFlag", "(Ljava/lang/String;)Lcom/braze/models/FeatureFlag;", "logFeatureFlagImpression", "requestImmediateDataFlush", "Lcom/braze/events/IEventSubscriber;", "Lcom/braze/events/ContentCardsUpdatedEvent;", "subscriber", "subscribeToContentCardsUpdates", "(Lcom/braze/events/IEventSubscriber;)V", "Lcom/braze/events/FeatureFlagsUpdatedEvent;", "subscribeToFeatureFlagsUpdates", "subscribeToBannersUpdates", "Lcom/braze/events/internal/b;", "subscribeToBannersErrors", "Lcom/braze/events/InAppMessageEvent;", "subscribeToNewInAppMessages", "Lcom/braze/events/BrazeUserChangeEvent;", "subscribeToChangeUserEvents", "Lcom/braze/events/NoMatchingTriggerEvent;", "subscribeToNoMatchingTriggerForEvent", "Lcom/braze/events/SessionStateChangedEvent;", "subscribeToSessionUpdates", "Lcom/braze/events/BrazeNetworkFailureEvent;", "subscribeToNetworkFailures", "Lcom/braze/events/BrazeSdkAuthenticationErrorEvent;", "subscribeToSdkAuthenticationFailures", "Lcom/braze/events/BrazePushEvent;", "subscribeToPushNotificationEvents", "T", "Ljava/lang/Class;", "eventClass", "addSingleSynchronousSubscription", "(Lcom/braze/events/IEventSubscriber;Ljava/lang/Class;)V", "removeSingleSubscription", "userId", "changeUser", "sdkAuthSignature", "Lcom/braze/BrazeUser;", "getCurrentUser", "(Lcom/braze/events/IValueCallback;)V", "getDeviceIdAsync", "getContentCardCount", "()I", "getContentCardUnviewedCount", "", "getContentCardsLastUpdatedInSecondsFromEpoch", "()J", "Lcom/braze/models/cards/Card;", "getCachedContentCards", "googleAdvertisingId", "isLimitAdTrackingEnabled", "setGoogleAdvertisingId", "(Ljava/lang/String;Z)V", "inAppMessageString", "Lcom/braze/models/inappmessage/IInAppMessage;", "deserializeInAppMessageString", "(Ljava/lang/String;)Lcom/braze/models/inappmessage/IInAppMessage;", "contentCardString", "deserializeContentCard", "(Ljava/lang/String;)Lcom/braze/models/cards/Card;", "Lorg/json/JSONObject;", "contentCardJson", "(Lorg/json/JSONObject;)Lcom/braze/models/cards/Card;", "requestLocationInitialization", "", "latitude", "longitude", "requestGeofences", "(DD)V", "signature", "setSdkAuthenticationSignature", "()Lcom/braze/BrazeUser;", "currentUser", "Lcom/braze/images/IBrazeImageLoader;", "getImageLoader", "()Lcom/braze/images/IBrazeImageLoader;", "setImageLoader", "(Lcom/braze/images/IBrazeImageLoader;)V", "imageLoader", "getRegisteredPushToken", "()Ljava/lang/String;", "setRegisteredPushToken", "registeredPushToken", "getDeviceId", "deviceId", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface IBraze {
    static /* synthetic */ void logPurchase$default(IBraze iBraze, String str, String str2, BigDecimal bigDecimal, int i11, BrazeProperties brazeProperties, int i12, Object obj) {
        if (obj != null) {
            h2.a("Super calls with default arguments not supported in this target, function: logPurchase");
            return;
        }
        if ((i12 & 8) != 0) {
            i11 = 1;
        }
        int i13 = i11;
        if ((i12 & 16) != 0) {
            brazeProperties = null;
        }
        iBraze.logPurchase(str, str2, bigDecimal, i13, brazeProperties);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void requestBannersRefresh$default(IBraze iBraze, List list, IValueCallback iValueCallback, int i11, Object obj) {
        if (obj != null) {
            h2.a("Super calls with default arguments not supported in this target, function: requestBannersRefresh");
            return;
        }
        if ((i11 & 2) != 0) {
            iValueCallback = null;
        }
        iBraze.requestBannersRefresh(list, iValueCallback);
    }

    <T> void addSingleSynchronousSubscription(IEventSubscriber<T> subscriber, Class<T> eventClass);

    void changeUser(String userId);

    void changeUser(String userId, String sdkAuthSignature);

    void closeSession(Activity activity);

    Card deserializeContentCard(String contentCardString);

    Card deserializeContentCard(JSONObject contentCardJson);

    IInAppMessage deserializeInAppMessageString(String inAppMessageString);

    List<FeatureFlag> getAllFeatureFlags();

    Banner getBanner(String id2);

    List<Card> getCachedContentCards();

    int getContentCardCount();

    int getContentCardUnviewedCount();

    long getContentCardsLastUpdatedInSecondsFromEpoch();

    BrazeUser getCurrentUser();

    void getCurrentUser(IValueCallback<BrazeUser> completionCallback);

    String getDeviceId();

    void getDeviceIdAsync(IValueCallback<String> completionCallback);

    FeatureFlag getFeatureFlag(String id2);

    IBrazeImageLoader getImageLoader();

    String getRegisteredPushToken();

    void logBannerClick(String placementId, String buttonId);

    boolean logBannerImpression(String placementId);

    void logCustomEvent(String eventName);

    void logCustomEvent(String eventName, BrazeProperties properties);

    void logFeatureFlagImpression(String id2);

    void logPurchase(String productId, String currencyCode, BigDecimal price);

    void logPurchase(String productId, String currencyCode, BigDecimal price, int quantity);

    void logPurchase(String productId, String currencyCode, BigDecimal price, int quantity, BrazeProperties properties);

    void logPurchase(String productId, String currencyCode, BigDecimal price, BrazeProperties properties);

    void logPushNotificationActionClicked(String campaignId, String actionId, String actionType);

    void logPushNotificationOpened(Intent intent);

    void logPushNotificationOpened(String campaignId);

    void logPushStoryPageClicked(String campaignId, String pageId);

    void openSession(Activity activity);

    void refreshFeatureFlags();

    <T> void removeSingleSubscription(IEventSubscriber<T> subscriber, Class<T> eventClass);

    void requestBannersRefresh(List<String> ids);

    void requestBannersRefresh(List<String> ids, IValueCallback<BannersUpdatedEvent> completionCallback);

    void requestContentCardsRefresh();

    void requestContentCardsRefreshFromCache();

    void requestGeofences(double latitude, double longitude);

    void requestImmediateDataFlush();

    void requestLocationInitialization();

    void setGoogleAdvertisingId(String googleAdvertisingId, boolean isLimitAdTrackingEnabled);

    void setImageLoader(IBrazeImageLoader iBrazeImageLoader);

    void setRegisteredPushToken(String str);

    void setSdkAuthenticationSignature(String signature);

    void subscribeToBannersErrors(IEventSubscriber<com.braze.events.internal.b> subscriber);

    void subscribeToBannersUpdates(IEventSubscriber<BannersUpdatedEvent> subscriber);

    void subscribeToChangeUserEvents(IEventSubscriber<BrazeUserChangeEvent> subscriber);

    void subscribeToContentCardsUpdates(IEventSubscriber<ContentCardsUpdatedEvent> subscriber);

    void subscribeToFeatureFlagsUpdates(IEventSubscriber<FeatureFlagsUpdatedEvent> subscriber);

    void subscribeToNetworkFailures(IEventSubscriber<BrazeNetworkFailureEvent> subscriber);

    void subscribeToNewInAppMessages(IEventSubscriber<InAppMessageEvent> subscriber);

    void subscribeToNoMatchingTriggerForEvent(IEventSubscriber<NoMatchingTriggerEvent> subscriber);

    void subscribeToPushNotificationEvents(IEventSubscriber<BrazePushEvent> subscriber);

    void subscribeToSdkAuthenticationFailures(IEventSubscriber<BrazeSdkAuthenticationErrorEvent> subscriber);

    void subscribeToSessionUpdates(IEventSubscriber<SessionStateChangedEvent> subscriber);
}
