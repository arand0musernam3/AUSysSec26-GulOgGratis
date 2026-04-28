package com.braze.models.push;

import android.content.Context;
import android.os.Bundle;
import androidx.core.app.y0;
import com.braze.Constants;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.models.inappmessage.InAppMessageBase;
import com.braze.support.BrazeLogger;
import com.braze.support.BundleUtils;
import com.braze.support.JsonUtils;
import j4.s;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;
import kotlin.text.y;
import org.bouncycastle.i18n.MessageBundle;
import org.bouncycastle.i18n.TextBundle;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u001c\n\u0002\u0010\t\n\u0002\bS\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\n\b\u0007\u0018\u0000 Ã\u00012\u00020\u0001:\n¿\u0001À\u0001Á\u0001Â\u0001Ã\u0001B7\b\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010¹\u0001\u001a\u00030º\u00012\u000f\u0010\u009a\u0001\u001a\n\u0012\u0005\u0012\u00030\u0099\u00010\u0098\u0001J\u0019\u0010»\u0001\u001a\u00030º\u00012\u000f\u0010¥\u0001\u001a\n\u0012\u0005\u0012\u00030¤\u00010\u0098\u0001J\u0010\u0010¼\u0001\u001a\u00030º\u00012\u0006\u0010+\u001a\u00020'J\n\u0010½\u0001\u001a\u00030º\u0001H\u0002J\t\u0010¾\u0001\u001a\u00020\u0016H\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0010\"\u0004\b\u0012\u0010\u0013R&\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001e\u0010\u001f\u001a\u0004\u0018\u00010 X\u0086\u000e¢\u0006\u0010\n\u0002\u0010%\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010&\u001a\u00020'X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010(\"\u0004\b)\u0010*R\u001a\u0010+\u001a\u00020'X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010(\"\u0004\b,\u0010*R\u001a\u0010-\u001a\u00020'X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010(\"\u0004\b.\u0010*R\u001c\u0010/\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001c\u00104\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00101\"\u0004\b6\u00103R\u001c\u00107\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00101\"\u0004\b9\u00103R\u001e\u0010:\u001a\u0004\u0018\u00010 X\u0086\u000e¢\u0006\u0010\n\u0002\u0010%\u001a\u0004\b;\u0010\"\"\u0004\b<\u0010$R\u001e\u0010=\u001a\u0004\u0018\u00010 X\u0086\u000e¢\u0006\u0010\n\u0002\u0010%\u001a\u0004\b>\u0010\"\"\u0004\b?\u0010$R\u001e\u0010@\u001a\u0004\u0018\u00010 X\u0086\u000e¢\u0006\u0010\n\u0002\u0010%\u001a\u0004\bA\u0010\"\"\u0004\bB\u0010$R\u001e\u0010C\u001a\u0004\u0018\u00010DX\u0086\u000e¢\u0006\u0010\n\u0002\u0010I\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u001e\u0010J\u001a\u0004\u0018\u00010 X\u0086\u000e¢\u0006\u0010\n\u0002\u0010%\u001a\u0004\bK\u0010\"\"\u0004\bL\u0010$R\u001a\u0010M\u001a\u00020'X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010(\"\u0004\bO\u0010*R\u001a\u0010P\u001a\u00020'X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010(\"\u0004\bR\u0010*R\u001a\u0010S\u001a\u00020'X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010(\"\u0004\bU\u0010*R\u001a\u0010V\u001a\u00020'X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010(\"\u0004\bW\u0010*R\u001c\u0010X\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bY\u00101\"\u0004\bZ\u00103R\u001c\u0010[\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\\\u00101\"\u0004\b]\u00103R\u001e\u0010^\u001a\u0004\u0018\u00010'X\u0086\u000e¢\u0006\u0010\n\u0002\u0010c\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\u001c\u0010d\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\be\u00101\"\u0004\bf\u00103R\u001c\u0010g\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bh\u00101\"\u0004\bi\u00103R\u001c\u0010j\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bk\u00101\"\u0004\bl\u00103R\u001c\u0010m\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bn\u00101\"\u0004\bo\u00103R\u001c\u0010p\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bq\u00101\"\u0004\br\u00103R\u001c\u0010s\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bt\u00101\"\u0004\bu\u00103R\u001c\u0010v\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bw\u00101\"\u0004\bx\u00103R \u0010y\u001a\u0004\u0018\u00010 8GX\u0086\u000e¢\u0006\u0010\n\u0002\u0010%\u001a\u0004\bz\u0010\"\"\u0004\b{\u0010$R\u001c\u0010|\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b}\u00101\"\u0004\b~\u00103R\u001e\u0010\u007f\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0080\u0001\u00101\"\u0005\b\u0081\u0001\u00103R)\u0010\u0082\u0001\u001a\u00020'8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0000\u0012\u0006\b\u0083\u0001\u0010\u0084\u0001\u001a\u0005\b\u0082\u0001\u0010(\"\u0005\b\u0085\u0001\u0010*R+\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0000\u0012\u0006\b\u0087\u0001\u0010\u0084\u0001\u001a\u0005\b\u0088\u0001\u00101\"\u0005\b\u0089\u0001\u00103R+\u0010\u008a\u0001\u001a\u00020D8\u0006@\u0006X\u0087\u000e¢\u0006\u001a\n\u0000\u0012\u0006\b\u008b\u0001\u0010\u0084\u0001\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001\"\u0006\b\u008e\u0001\u0010\u008f\u0001R+\u0010\u0090\u0001\u001a\u00020D8\u0006@\u0006X\u0087\u000e¢\u0006\u001a\n\u0000\u0012\u0006\b\u0091\u0001\u0010\u0084\u0001\u001a\u0006\b\u0092\u0001\u0010\u008d\u0001\"\u0006\b\u0093\u0001\u0010\u008f\u0001R\u001f\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0095\u0001\u00101\"\u0005\b\u0096\u0001\u00103R\u0017\u0010\u0097\u0001\u001a\n\u0012\u0005\u0012\u00030\u0099\u00010\u0098\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u009a\u0001\u001a\n\u0012\u0005\u0012\u00030\u0099\u00010\u009b\u00018F¢\u0006\b\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001R\u001f\u0010\u009e\u0001\u001a\u00020 X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u009f\u0001\u0010 \u0001\"\u0006\b¡\u0001\u0010¢\u0001R\u0017\u0010£\u0001\u001a\n\u0012\u0005\u0012\u00030¤\u00010\u0098\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010¥\u0001\u001a\n\u0012\u0005\u0012\u00030¤\u00010\u009b\u00018F¢\u0006\b\u001a\u0006\b¦\u0001\u0010\u009d\u0001R\u001d\u0010§\u0001\u001a\u00020'X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b§\u0001\u0010(\"\u0005\b¨\u0001\u0010*R\u0017\u0010©\u0001\u001a\n\u0012\u0005\u0012\u00030ª\u00010\u0098\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010«\u0001\u001a\n\u0012\u0005\u0012\u00030ª\u00010\u009b\u00018F¢\u0006\b\u001a\u0006\b¬\u0001\u0010\u009d\u0001R\u001f\u0010\u00ad\u0001\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0005\u0012\u00030¯\u00010®\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010°\u0001\u001a\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0005\u0012\u00030¯\u00010\u00158F¢\u0006\u0007\u001a\u0005\b±\u0001\u0010\u0018R\u001f\u0010²\u0001\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b³\u0001\u00101\"\u0005\b´\u0001\u00103R%\u0010¶\u0001\u001a\u0004\u0018\u00010\u00162\t\u0010µ\u0001\u001a\u0004\u0018\u00010\u0016@BX\u0086\u000e¢\u0006\t\n\u0000\u001a\u0005\b·\u0001\u00101R\u0013\u0010¸\u0001\u001a\u00020'8F¢\u0006\u0007\u001a\u0005\b¸\u0001\u0010(¨\u0006Ä\u0001"}, d2 = {"Lcom/braze/models/push/BrazeNotificationPayload;", "", "notificationExtras", "Landroid/os/Bundle;", "brazeExtras", "context", "Landroid/content/Context;", "configurationProvider", "Lcom/braze/configuration/BrazeConfigurationProvider;", "<init>", "(Landroid/os/Bundle;Landroid/os/Bundle;Landroid/content/Context;Lcom/braze/configuration/BrazeConfigurationProvider;)V", "getConfigurationProvider", "()Lcom/braze/configuration/BrazeConfigurationProvider;", "setConfigurationProvider", "(Lcom/braze/configuration/BrazeConfigurationProvider;)V", "getNotificationExtras", "()Landroid/os/Bundle;", "getBrazeExtras", "setBrazeExtras", "(Landroid/os/Bundle;)V", InAppMessageBase.EXTRAS, "", "", "getExtras", "()Ljava/util/Map;", "setExtras", "(Ljava/util/Map;)V", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "pushDuration", "", "getPushDuration", "()Ljava/lang/Integer;", "setPushDuration", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "isPushStory", "", "()Z", "setPushStory", "(Z)V", "isInlineImagePush", "setInlineImagePush", "isConversationalPush", "setConversationalPush", "publicNotificationExtras", "getPublicNotificationExtras", "()Ljava/lang/String;", "setPublicNotificationExtras", "(Ljava/lang/String;)V", "notificationChannelId", "getNotificationChannelId", "setNotificationChannelId", "notificationCategory", "getNotificationCategory", "setNotificationCategory", "notificationVisibility", "getNotificationVisibility", "setNotificationVisibility", "notificationBadgeNumber", "getNotificationBadgeNumber", "setNotificationBadgeNumber", "customNotificationId", "getCustomNotificationId", "setCustomNotificationId", "notificationReceivedTimestampMillis", "", "getNotificationReceivedTimestampMillis", "()Ljava/lang/Long;", "setNotificationReceivedTimestampMillis", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "notificationPriorityInt", "getNotificationPriorityInt", "setNotificationPriorityInt", "shouldFetchTestTriggers", "getShouldFetchTestTriggers", "setShouldFetchTestTriggers", "shouldRefreshFeatureFlags", "getShouldRefreshFeatureFlags", "setShouldRefreshFeatureFlags", "shouldRefreshBanners", "getShouldRefreshBanners", "setShouldRefreshBanners", "isUninstallTrackingPush", "setUninstallTrackingPush", "deeplink", "getDeeplink", "setDeeplink", "pushUniqueId", "getPushUniqueId", "setPushUniqueId", "useWebView", "getUseWebView", "()Ljava/lang/Boolean;", "setUseWebView", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "contentCardSyncData", "getContentCardSyncData", "setContentCardSyncData", "contentCardSyncUserId", "getContentCardSyncUserId", "setContentCardSyncUserId", "titleText", "getTitleText", "setTitleText", "contentText", "getContentText", "setContentText", "largeIcon", "getLargeIcon", "setLargeIcon", "notificationSound", "getNotificationSound", "setNotificationSound", "summaryText", "getSummaryText", "setSummaryText", "accentColor", "getAccentColor", "setAccentColor", "bigSummaryText", "getBigSummaryText", "setBigSummaryText", "bigTitleText", "getBigTitleText", "setBigTitleText", "isPushDeliveryEnabled", "isPushDeliveryEnabled$annotations", "()V", "setPushDeliveryEnabled", "campaignId", "getCampaignId$annotations", "getCampaignId", "setCampaignId", "flushMinMinutes", "getFlushMinMinutes$annotations", "getFlushMinMinutes", "()J", "setFlushMinMinutes", "(J)V", "flushMaxMinutes", "getFlushMaxMinutes$annotations", "getFlushMaxMinutes", "setFlushMaxMinutes", "bigImageUrl", "getBigImageUrl", "setBigImageUrl", "actionButtonsInternal", "", "Lcom/braze/models/push/BrazeNotificationPayload$ActionButton;", "actionButtons", "", "getActionButtons", "()Ljava/util/List;", "pushStoryPageIndex", "getPushStoryPageIndex", "()I", "setPushStoryPageIndex", "(I)V", "pushStoryPagesInternal", "Lcom/braze/models/push/BrazeNotificationPayload$PushStoryPage;", "pushStoryPages", "getPushStoryPages", "isNewlyReceivedPushStory", "setNewlyReceivedPushStory", "conversationMessagesInternal", "Lcom/braze/models/push/BrazeNotificationPayload$ConversationMessage;", "conversationMessages", "getConversationMessages", "conversationPersonMapInternal", "", "Lcom/braze/models/push/BrazeNotificationPayload$ConversationPerson;", "conversationPersonMap", "getConversationPersonMap", "conversationShortcutId", "getConversationShortcutId", "setConversationShortcutId", "value", "conversationReplyPersonId", "getConversationReplyPersonId", "isSilentPush", "setActionButtons", "", "setPushStoryPages", "setIsInlineImagePush", "parsePayloadFieldsFromBundle", "toString", "ActionButton", "PushStoryPage", "ConversationMessage", "ConversationPerson", "Companion", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BrazeNotificationPayload {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final long DEFAULT_PUSH_DELIVERY_MAX_FLUSH = 120;
    public static final long DEFAULT_PUSH_DELIVERY_MIN_FLUSH = 5;
    private Integer accentColor;
    private List<ActionButton> actionButtonsInternal;
    private String bigImageUrl;
    private String bigSummaryText;
    private String bigTitleText;
    private Bundle brazeExtras;
    private String campaignId;
    private BrazeConfigurationProvider configurationProvider;
    private String contentCardSyncData;
    private String contentCardSyncUserId;
    private String contentText;
    private Context context;
    private final List<ConversationMessage> conversationMessagesInternal;
    private final Map<String, ConversationPerson> conversationPersonMapInternal;
    private String conversationReplyPersonId;
    private String conversationShortcutId;
    private Integer customNotificationId;
    private String deeplink;
    private Map<String, String> extras;
    private long flushMaxMinutes;
    private long flushMinMinutes;
    private boolean isConversationalPush;
    private boolean isInlineImagePush;
    private boolean isNewlyReceivedPushStory;
    private boolean isPushDeliveryEnabled;
    private boolean isPushStory;
    private boolean isUninstallTrackingPush;
    private String largeIcon;
    private Integer notificationBadgeNumber;
    private String notificationCategory;
    private String notificationChannelId;
    private final Bundle notificationExtras;
    private Integer notificationPriorityInt;
    private Long notificationReceivedTimestampMillis;
    private String notificationSound;
    private Integer notificationVisibility;
    private String publicNotificationExtras;
    private Integer pushDuration;
    private int pushStoryPageIndex;
    private List<PushStoryPage> pushStoryPagesInternal;
    private String pushUniqueId;
    private boolean shouldFetchTestTriggers;
    private boolean shouldRefreshBanners;
    private boolean shouldRefreshFeatureFlags;
    private String summaryText;
    private String titleText;
    private Boolean useWebView;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0003J\b\u0010!\u001a\u00020\rH\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000f\"\u0004\b\u001a\u0010\u0011R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u000f\"\u0004\b\u001d\u0010\u0011¨\u0006\""}, d2 = {"Lcom/braze/models/push/BrazeNotificationPayload$ActionButton;", "", "notificationExtras", "Landroid/os/Bundle;", "actionIndex", "", "<init>", "(Landroid/os/Bundle;I)V", "getActionIndex", "()I", "setActionIndex", "(I)V", "type", "", "getType", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "actionId", "getActionId", "setActionId", "uri", "getUri", "setUri", "useWebview", "getUseWebview", "setUseWebview", TextBundle.TEXT_ENTRY, "getText", "setText", "putIntoBundle", "", "destination", "toString", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ActionButton {
        private String actionId;
        private int actionIndex;
        private String text;
        private String type;
        private String uri;
        private String useWebview;

        public ActionButton(Bundle bundle, int i11) {
            bundle.getClass();
            this.actionIndex = i11;
            Companion companion = BrazeNotificationPayload.INSTANCE;
            this.type = companion.getTemplateFieldAtIndex(i11, bundle, Constants.BRAZE_PUSH_ACTION_TYPE_KEY_TEMPLATE);
            this.actionId = companion.getTemplateFieldAtIndex(this.actionIndex, bundle, Constants.BRAZE_PUSH_ACTION_ID_KEY_TEMPLATE);
            this.uri = companion.getTemplateFieldAtIndex(this.actionIndex, bundle, Constants.BRAZE_PUSH_ACTION_URI_KEY_TEMPLATE);
            this.useWebview = companion.getTemplateFieldAtIndex(this.actionIndex, bundle, Constants.BRAZE_PUSH_ACTION_USE_WEBVIEW_KEY_TEMPLATE);
            this.text = companion.getTemplateFieldAtIndex(this.actionIndex, bundle, Constants.BRAZE_PUSH_ACTION_TEXT_KEY_TEMPLATE);
        }

        public final String getActionId() {
            return this.actionId;
        }

        public final int getActionIndex() {
            return this.actionIndex;
        }

        public final String getText() {
            return this.text;
        }

        public final String getType() {
            return this.type;
        }

        public final String getUri() {
            return this.uri;
        }

        public final String getUseWebview() {
            return this.useWebview;
        }

        public final void putIntoBundle(Bundle destination) {
            destination.getClass();
            destination.putInt(Constants.BRAZE_ACTION_INDEX_KEY, this.actionIndex);
            destination.putString(Constants.BRAZE_ACTION_TYPE_KEY, this.type);
            destination.putString(Constants.BRAZE_ACTION_ID_KEY, this.actionId);
            destination.putString(Constants.BRAZE_ACTION_URI_KEY, this.uri);
            destination.putString(Constants.BRAZE_ACTION_USE_WEBVIEW_KEY, this.useWebview);
        }

        public final void setActionId(String str) {
            this.actionId = str;
        }

        public final void setActionIndex(int i11) {
            this.actionIndex = i11;
        }

        public final void setText(String str) {
            this.text = str;
        }

        public final void setType(String str) {
            this.type = str;
        }

        public final void setUri(String str) {
            this.uri = str;
        }

        public final void setUseWebview(String str) {
            this.useWebview = str;
        }

        public String toString() {
            Companion companion = BrazeNotificationPayload.INSTANCE;
            return companion.stringAndKey("ActionIndex", Integer.valueOf(this.actionIndex)) + companion.stringAndKey("Type", this.type) + companion.stringAndKey("Id", this.actionId) + companion.stringAndKey("Uri", this.uri) + companion.stringAndKey("UseWebview", this.useWebview) + companion.stringAndKey("Text", this.text);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0012\u001a\u00020\tH\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000b¨\u0006\u0013"}, d2 = {"Lcom/braze/models/push/BrazeNotificationPayload$ConversationMessage;", "", "notificationExtras", "Landroid/os/Bundle;", "index", "", "<init>", "(Landroid/os/Bundle;I)V", InAppMessageBase.MESSAGE, "", "getMessage", "()Ljava/lang/String;", "timestamp", "", "getTimestamp", "()J", "personId", "getPersonId", "toString", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ConversationMessage {
        private final String message;
        private final String personId;
        private final long timestamp;

        public ConversationMessage(Bundle bundle, int i11) {
            bundle.getClass();
            Companion companion = BrazeNotificationPayload.INSTANCE;
            this.message = companion.getTemplateFieldAtIndex(i11, bundle, Constants.BRAZE_CONVERSATIONAL_PUSH_MESSAGE_TEXT_TEMPLATE);
            this.timestamp = companion.getTemplateFieldAtIndex(i11, bundle, Constants.BRAZE_CONVERSATIONAL_PUSH_MESSAGE_TIMESTAMP_TEMPLATE, 0L);
            this.personId = companion.getTemplateFieldAtIndex(i11, bundle, Constants.BRAZE_CONVERSATIONAL_PUSH_MESSAGE_PERSON_ID_TEMPLATE);
        }

        public final String getMessage() {
            return this.message;
        }

        public final String getPersonId() {
            return this.personId;
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        public String toString() {
            Companion companion = BrazeNotificationPayload.INSTANCE;
            return k.m(companion.stringAndKey("Message", this.message), companion.stringAndKey("Timestamp", Long.valueOf(this.timestamp)), companion.stringAndKey("PersonId", this.personId));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\nR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\f\u001a\u0004\b\u000f\u0010\nR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\nR\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0016\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u001a\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/braze/models/push/BrazeNotificationPayload$ConversationPerson;", "", "Landroid/os/Bundle;", "notificationExtras", "", "index", "<init>", "(Landroid/os/Bundle;I)V", "", "toString", "()Ljava/lang/String;", "personId", "Ljava/lang/String;", "getPersonId", "name", "getName", "uri", "getUri", "", "isImportant", "Z", "()Z", "isBot", "Landroidx/core/app/y0;", "getPerson", "()Landroidx/core/app/y0;", "person", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ConversationPerson {
        private final boolean isBot;
        private final boolean isImportant;
        private final String name;
        private final String personId;
        private final String uri;

        public ConversationPerson(Bundle bundle, int i11) {
            bundle.getClass();
            Companion companion = BrazeNotificationPayload.INSTANCE;
            this.personId = companion.getTemplateFieldAtIndex(i11, bundle, Constants.BRAZE_CONVERSATIONAL_PUSH_PERSON_ID_TEMPLATE);
            this.name = companion.getTemplateFieldAtIndex(i11, bundle, Constants.BRAZE_CONVERSATIONAL_PUSH_PERSON_NAME_TEMPLATE);
            this.uri = companion.getTemplateFieldAtIndex(i11, bundle, Constants.BRAZE_CONVERSATIONAL_PUSH_PERSON_URI_TEMPLATE, (String) null);
            this.isImportant = companion.getTemplateFieldAtIndex(i11, bundle, Constants.BRAZE_CONVERSATIONAL_PUSH_PERSON_IS_IMPORTANT_TEMPLATE, false);
            this.isBot = companion.getTemplateFieldAtIndex(i11, bundle, Constants.BRAZE_CONVERSATIONAL_PUSH_PERSON_IS_BOT_TEMPLATE, false);
        }

        public final String getName() {
            return this.name;
        }

        public final y0 getPerson() {
            String str = this.personId;
            String str2 = this.name;
            String str3 = this.uri;
            boolean z11 = this.isBot;
            boolean z12 = this.isImportant;
            y0 y0Var = new y0();
            y0Var.f2711a = str2;
            y0Var.f2712b = null;
            y0Var.f2713c = str3;
            y0Var.f2714d = str;
            y0Var.f2715e = z11;
            y0Var.f2716f = z12;
            return y0Var;
        }

        public final String getPersonId() {
            return this.personId;
        }

        public final String getUri() {
            return this.uri;
        }

        /* JADX INFO: renamed from: isBot, reason: from getter */
        public final boolean getIsBot() {
            return this.isBot;
        }

        /* JADX INFO: renamed from: isImportant, reason: from getter */
        public final boolean getIsImportant() {
            return this.isImportant;
        }

        public String toString() {
            Companion companion = BrazeNotificationPayload.INSTANCE;
            return companion.stringAndKey("PersonId", this.personId) + companion.stringAndKey("Name", this.name) + companion.stringAndKey("Uri", this.uri) + companion.stringAndKey("IsImportant", Boolean.valueOf(this.isImportant)) + companion.stringAndKey("IsBot", Boolean.valueOf(this.isBot));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u001d\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010)\u001a\u00020\rH\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000f\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\t\"\u0004\b\u0016\u0010\u000bR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000f\"\u0004\b\u0019\u0010\u0013R\u001a\u0010\u001a\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\t\"\u0004\b\u001c\u0010\u000bR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u000f\"\u0004\b\u001f\u0010\u0013R\u001c\u0010 \u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u000f\"\u0004\b\"\u0010\u0013R\u001c\u0010#\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u000f\"\u0004\b%\u0010\u0013R\u001c\u0010&\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u000f\"\u0004\b(\u0010\u0013¨\u0006*"}, d2 = {"Lcom/braze/models/push/BrazeNotificationPayload$PushStoryPage;", "", "notificationExtras", "Landroid/os/Bundle;", "actionIndex", "", "<init>", "(Landroid/os/Bundle;I)V", "getActionIndex", "()I", "setActionIndex", "(I)V", "campaignId", "", "getCampaignId", "()Ljava/lang/String;", MessageBundle.TITLE_ENTRY, "getTitle", "setTitle", "(Ljava/lang/String;)V", "titleGravity", "getTitleGravity", "setTitleGravity", "subtitle", "getSubtitle", "setSubtitle", "subtitleGravity", "getSubtitleGravity", "setSubtitleGravity", "bitmapUrl", "getBitmapUrl", "setBitmapUrl", "storyPageId", "getStoryPageId", "setStoryPageId", "deeplink", "getDeeplink", "setDeeplink", "useWebview", "getUseWebview", "setUseWebview", "toString", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class PushStoryPage {
        private int actionIndex;
        private String bitmapUrl;
        private final String campaignId;
        private String deeplink;
        private String storyPageId;
        private String subtitle;
        private int subtitleGravity;
        private String title;
        private int titleGravity;
        private String useWebview;

        public PushStoryPage(Bundle bundle, int i11) {
            bundle.getClass();
            this.actionIndex = i11;
            Companion companion = BrazeNotificationPayload.INSTANCE;
            this.campaignId = companion.parseString(bundle, Constants.BRAZE_PUSH_CAMPAIGN_ID_KEY);
            this.title = companion.getTemplateFieldAtIndex(this.actionIndex, bundle, Constants.BRAZE_PUSH_STORY_TITLE_KEY_TEMPLATE);
            this.titleGravity = companion.getPushStoryGravityAtIndex(this.actionIndex, bundle, Constants.BRAZE_PUSH_STORY_TITLE_JUSTIFICATION_KEY_TEMPLATE);
            this.subtitle = companion.getTemplateFieldAtIndex(this.actionIndex, bundle, Constants.BRAZE_PUSH_STORY_SUBTITLE_KEY_TEMPLATE);
            this.subtitleGravity = companion.getPushStoryGravityAtIndex(this.actionIndex, bundle, Constants.BRAZE_PUSH_STORY_SUBTITLE_JUSTIFICATION_KEY_TEMPLATE);
            this.bitmapUrl = companion.getTemplateFieldAtIndex(this.actionIndex, bundle, Constants.BRAZE_PUSH_STORY_IMAGE_KEY_TEMPLATE);
            this.storyPageId = companion.getTemplateFieldAtIndex(this.actionIndex, bundle, Constants.BRAZE_PUSH_STORY_ID_KEY_TEMPLATE, "");
            this.deeplink = companion.getTemplateFieldAtIndex(this.actionIndex, bundle, Constants.BRAZE_PUSH_STORY_DEEP_LINK_KEY_TEMPLATE);
            this.useWebview = companion.getTemplateFieldAtIndex(this.actionIndex, bundle, Constants.BRAZE_PUSH_STORY_USE_WEBVIEW_KEY_TEMPLATE);
        }

        public final int getActionIndex() {
            return this.actionIndex;
        }

        public final String getBitmapUrl() {
            return this.bitmapUrl;
        }

        public final String getCampaignId() {
            return this.campaignId;
        }

        public final String getDeeplink() {
            return this.deeplink;
        }

        public final String getStoryPageId() {
            return this.storyPageId;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final int getSubtitleGravity() {
            return this.subtitleGravity;
        }

        public final String getTitle() {
            return this.title;
        }

        public final int getTitleGravity() {
            return this.titleGravity;
        }

        public final String getUseWebview() {
            return this.useWebview;
        }

        public final void setActionIndex(int i11) {
            this.actionIndex = i11;
        }

        public final void setBitmapUrl(String str) {
            this.bitmapUrl = str;
        }

        public final void setDeeplink(String str) {
            this.deeplink = str;
        }

        public final void setStoryPageId(String str) {
            this.storyPageId = str;
        }

        public final void setSubtitle(String str) {
            this.subtitle = str;
        }

        public final void setSubtitleGravity(int i11) {
            this.subtitleGravity = i11;
        }

        public final void setTitle(String str) {
            this.title = str;
        }

        public final void setTitleGravity(int i11) {
            this.titleGravity = i11;
        }

        public final void setUseWebview(String str) {
            this.useWebview = str;
        }

        public String toString() {
            Companion companion = BrazeNotificationPayload.INSTANCE;
            String strStringAndKey = companion.stringAndKey("ActionIndex", Integer.valueOf(this.actionIndex));
            String strStringAndKey2 = companion.stringAndKey("CampaignId", this.campaignId);
            String strStringAndKey3 = companion.stringAndKey("Title", this.title);
            String strStringAndKey4 = companion.stringAndKey("TitleGravity", Integer.valueOf(this.titleGravity));
            String strStringAndKey5 = companion.stringAndKey("Subtitle", this.subtitle);
            String strStringAndKey6 = companion.stringAndKey("SubtitleGravity=", Integer.valueOf(this.subtitleGravity));
            String strStringAndKey7 = companion.stringAndKey("BitmapUrl", this.bitmapUrl);
            String strStringAndKey8 = companion.stringAndKey("StoryPageId", this.storyPageId);
            String strStringAndKey9 = companion.stringAndKey("Deeplink", this.deeplink);
            String strStringAndKey10 = companion.stringAndKey("UseWebview", this.useWebview);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(strStringAndKey);
            sb2.append(strStringAndKey2);
            sb2.append(strStringAndKey3);
            sb2.append(strStringAndKey4);
            sb2.append(strStringAndKey5);
            s.A(sb2, strStringAndKey6, strStringAndKey7, strStringAndKey8, strStringAndKey9);
            sb2.append(strStringAndKey10);
            return sb2.toString();
        }
    }

    public BrazeNotificationPayload(Bundle bundle, Bundle bundle2, Context context, BrazeConfigurationProvider brazeConfigurationProvider) {
        this.configurationProvider = brazeConfigurationProvider;
        this.notificationExtras = bundle == null ? new Bundle() : bundle;
        this.brazeExtras = bundle2 == null ? new Bundle() : bundle2;
        this.extras = BundleUtils.toStringMap(bundle2);
        this.context = context != null ? context.getApplicationContext() : null;
        this.flushMinMinutes = 5L;
        this.flushMaxMinutes = 120L;
        this.actionButtonsInternal = new ArrayList();
        this.pushStoryPagesInternal = new ArrayList();
        this.conversationMessagesInternal = new ArrayList();
        this.conversationPersonMapInternal = new HashMap();
        parsePayloadFieldsFromBundle();
    }

    public static final Bundle getAttachedBrazeExtras(Bundle bundle) {
        return INSTANCE.getAttachedBrazeExtras(bundle);
    }

    public static final int getPushStoryGravityAtIndex(int i11, Bundle bundle, String str) {
        return INSTANCE.getPushStoryGravityAtIndex(i11, bundle, str);
    }

    public static final long getTemplateFieldAtIndex(int i11, Bundle bundle, String str, long j9) {
        return INSTANCE.getTemplateFieldAtIndex(i11, bundle, str, j9);
    }

    public static final Long parseLong(Bundle bundle, String str) {
        return INSTANCE.parseLong(bundle, str);
    }

    public static final String parseNonBlankString(Bundle bundle, String str) {
        return INSTANCE.parseNonBlankString(bundle, str);
    }

    public static final int parseObjectAsInteger(Bundle bundle, String str, int i11) {
        return INSTANCE.parseObjectAsInteger(bundle, str, i11);
    }

    private final void parsePayloadFieldsFromBundle() {
        parsePayloadFieldsFromBundle$parseNotificationMetadata(this);
        parsePayloadFieldsFromBundle$parseContentCardData(this);
        parsePayloadFieldsFromBundle$parseVisibleContent(this);
        parsePayloadFieldsFromBundle$parseBigTextStyle(this);
        parsePayloadFieldsFromBundle$parseBigImageStyle(this);
        parsePayloadFieldsFromBundle$parseActionButtons(this);
        parsePayloadFieldsFromBundle$parsePushStoryData(this);
        parsePayloadFieldsFromBundle$parseConversationPushData(this);
        parsePayloadFieldsFromBundle$parsePushDeliveryEventData(this);
    }

    private static final void parsePayloadFieldsFromBundle$parseActionButtons(BrazeNotificationPayload brazeNotificationPayload) {
        brazeNotificationPayload.actionButtonsInternal.clear();
        int i11 = 0;
        while (true) {
            String templateFieldAtIndex = INSTANCE.getTemplateFieldAtIndex(i11, brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_ACTION_TYPE_KEY_TEMPLATE);
            if (templateFieldAtIndex == null || StringsKt.H(templateFieldAtIndex)) {
                return;
            }
            brazeNotificationPayload.actionButtonsInternal.add(new ActionButton(brazeNotificationPayload.notificationExtras, i11));
            i11++;
        }
    }

    private static final void parsePayloadFieldsFromBundle$parseBigImageStyle(BrazeNotificationPayload brazeNotificationPayload) {
        String str;
        String nonBlankString = INSTANCE.parseNonBlankString(brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_BIG_IMAGE_URL_TOP_LEVEL_KEY);
        brazeNotificationPayload.bigImageUrl = nonBlankString;
        if ((nonBlankString != null && !StringsKt.H(nonBlankString)) || (str = brazeNotificationPayload.extras.get(Constants.BRAZE_PUSH_BIG_IMAGE_URL_KEY)) == null || StringsKt.H(str)) {
            return;
        }
        brazeNotificationPayload.bigImageUrl = str;
    }

    private static final void parsePayloadFieldsFromBundle$parseBigTextStyle(BrazeNotificationPayload brazeNotificationPayload) {
        Companion companion = INSTANCE;
        brazeNotificationPayload.bigSummaryText = companion.parseString(brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_BIG_SUMMARY_TEXT_KEY);
        brazeNotificationPayload.bigTitleText = companion.parseString(brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_BIG_TITLE_TEXT_KEY);
    }

    private static final void parsePayloadFieldsFromBundle$parseContentCardData(BrazeNotificationPayload brazeNotificationPayload) {
        Companion companion = INSTANCE;
        brazeNotificationPayload.contentCardSyncData = companion.parseString(brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_CONTENT_CARD_SYNC_DATA_KEY);
        brazeNotificationPayload.contentCardSyncUserId = companion.parseString(brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_CONTENT_CARD_SYNC_USER_ID_KEY);
    }

    private static final void parsePayloadFieldsFromBundle$parseConversationPushData(BrazeNotificationPayload brazeNotificationPayload) {
        Companion companion = INSTANCE;
        brazeNotificationPayload.conversationShortcutId = companion.parseString(brazeNotificationPayload.notificationExtras, Constants.BRAZE_CONVERSATIONAL_PUSH_SHORTCUT_ID_KEY);
        brazeNotificationPayload.conversationReplyPersonId = companion.parseString(brazeNotificationPayload.notificationExtras, Constants.BRAZE_CONVERSATIONAL_PUSH_REPLY_PERSON_ID_KEY);
        brazeNotificationPayload.conversationMessagesInternal.clear();
        brazeNotificationPayload.conversationPersonMapInternal.clear();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            String templateFieldAtIndex = INSTANCE.getTemplateFieldAtIndex(i12, brazeNotificationPayload.notificationExtras, Constants.BRAZE_CONVERSATIONAL_PUSH_MESSAGE_TEXT_TEMPLATE);
            if (templateFieldAtIndex == null || StringsKt.H(templateFieldAtIndex)) {
                break;
            }
            brazeNotificationPayload.conversationMessagesInternal.add(new ConversationMessage(brazeNotificationPayload.notificationExtras, i12));
            i12++;
        }
        while (true) {
            String templateFieldAtIndex2 = INSTANCE.getTemplateFieldAtIndex(i11, brazeNotificationPayload.notificationExtras, Constants.BRAZE_CONVERSATIONAL_PUSH_PERSON_ID_TEMPLATE);
            if (templateFieldAtIndex2 == null || StringsKt.H(templateFieldAtIndex2)) {
                return;
            }
            ConversationPerson conversationPerson = new ConversationPerson(brazeNotificationPayload.notificationExtras, i11);
            brazeNotificationPayload.conversationPersonMapInternal.put(conversationPerson.getPersonId(), conversationPerson);
            i11++;
        }
    }

    private static final void parsePayloadFieldsFromBundle$parseNotificationMetadata(BrazeNotificationPayload brazeNotificationPayload) {
        Companion companion = INSTANCE;
        brazeNotificationPayload.pushDuration = companion.parseStringAsInteger(brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_NOTIFICATION_DURATION_KEY);
        brazeNotificationPayload.isPushStory = brazeNotificationPayload.notificationExtras.containsKey(Constants.BRAZE_PUSH_STORY_KEY);
        brazeNotificationPayload.notificationCategory = companion.parseString(brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_CATEGORY_KEY);
        brazeNotificationPayload.notificationVisibility = companion.parseStringAsInteger(brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_VISIBILITY_KEY);
        brazeNotificationPayload.notificationBadgeNumber = companion.parseStringAsInteger(brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_NOTIFICATION_BADGE_COUNT_KEY);
        brazeNotificationPayload.publicNotificationExtras = companion.parseString(brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_PUBLIC_NOTIFICATION_KEY);
        brazeNotificationPayload.customNotificationId = companion.parseStringAsInteger(brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_CUSTOM_NOTIFICATION_ID);
        brazeNotificationPayload.notificationReceivedTimestampMillis = companion.parseLong(brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_RECEIVED_TIMESTAMP_MILLIS);
        brazeNotificationPayload.isInlineImagePush = brazeNotificationPayload.notificationExtras.containsKey(Constants.BRAZE_PUSH_INLINE_IMAGE_STYLE_KEY);
        brazeNotificationPayload.isConversationalPush = brazeNotificationPayload.notificationExtras.containsKey(Constants.BRAZE_CONVERSATIONAL_PUSH_STYLE_KEY);
        brazeNotificationPayload.notificationPriorityInt = companion.parseStringAsInteger(brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_PRIORITY_KEY);
        brazeNotificationPayload.shouldFetchTestTriggers = companion.parseStringAsBoolean(brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_FETCH_TEST_TRIGGERS_KEY);
        brazeNotificationPayload.shouldRefreshFeatureFlags = companion.parseStringAsBoolean(brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_REFRESH_FEATURE_FLAGS);
        brazeNotificationPayload.shouldRefreshBanners = companion.parseStringAsBoolean(brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_REFRESH_BANNERS);
        brazeNotificationPayload.isUninstallTrackingPush = brazeNotificationPayload.notificationExtras.containsKey(Constants.BRAZE_PUSH_UNINSTALL_TRACKING_KEY) || brazeNotificationPayload.brazeExtras.containsKey(Constants.BRAZE_PUSH_UNINSTALL_TRACKING_KEY);
        brazeNotificationPayload.deeplink = companion.parseString(brazeNotificationPayload.notificationExtras, "uri");
        brazeNotificationPayload.campaignId = companion.parseString(brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_CAMPAIGN_ID_KEY);
        brazeNotificationPayload.pushUniqueId = companion.parseString(brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_UNIQUE_ID);
        brazeNotificationPayload.useWebView = Boolean.valueOf(companion.parseStringAsBoolean(brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_OPEN_URI_IN_WEBVIEW_KEY));
    }

    private static final void parsePayloadFieldsFromBundle$parsePushDeliveryEventData(BrazeNotificationPayload brazeNotificationPayload) {
        Companion companion = INSTANCE;
        Integer stringAsInteger = companion.parseStringAsInteger(brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_DELIVERY_ENABLED_KEY);
        brazeNotificationPayload.isPushDeliveryEnabled = (stringAsInteger != null ? stringAsInteger.intValue() : 0) == 1;
        Long stringAsLong = companion.parseStringAsLong(brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_DELIVERY_FLUSH_MIN_KEY);
        brazeNotificationPayload.flushMinMinutes = stringAsLong != null ? stringAsLong.longValue() : 5L;
        Long stringAsLong2 = companion.parseStringAsLong(brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_DELIVERY_FLUSH_MAX_KEY);
        brazeNotificationPayload.flushMaxMinutes = stringAsLong2 != null ? stringAsLong2.longValue() : 120L;
    }

    private static final void parsePayloadFieldsFromBundle$parsePushStoryData(BrazeNotificationPayload brazeNotificationPayload) {
        brazeNotificationPayload.pushStoryPageIndex = INSTANCE.parseObjectAsInteger(brazeNotificationPayload.notificationExtras, Constants.BRAZE_STORY_INDEX_KEY, 0);
        int i11 = 0;
        while (true) {
            String templateFieldAtIndex = INSTANCE.getTemplateFieldAtIndex(i11, brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_STORY_IMAGE_KEY_TEMPLATE);
            if (templateFieldAtIndex == null || StringsKt.H(templateFieldAtIndex)) {
                break;
            }
            brazeNotificationPayload.pushStoryPagesInternal.add(new PushStoryPage(brazeNotificationPayload.notificationExtras, i11));
            i11++;
        }
        brazeNotificationPayload.isNewlyReceivedPushStory = brazeNotificationPayload.notificationExtras.getBoolean(Constants.BRAZE_PUSH_STORY_IS_NEWLY_RECEIVED, false);
    }

    private static final void parsePayloadFieldsFromBundle$parseVisibleContent(BrazeNotificationPayload brazeNotificationPayload) {
        Companion companion = INSTANCE;
        brazeNotificationPayload.notificationChannelId = companion.parseNonBlankString(brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_NOTIFICATION_CHANNEL_ID_KEY);
        brazeNotificationPayload.titleText = companion.parseString(brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_TITLE_KEY);
        brazeNotificationPayload.contentText = companion.parseString(brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_CONTENT_KEY);
        brazeNotificationPayload.largeIcon = companion.parseString(brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_LARGE_ICON_KEY);
        brazeNotificationPayload.notificationSound = companion.parseString(brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_NOTIFICATION_SOUND_KEY);
        brazeNotificationPayload.summaryText = companion.parseString(brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_SUMMARY_TEXT_KEY);
        brazeNotificationPayload.accentColor = companion.parseStringAsColorInt(brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_ACCENT_KEY);
    }

    public static final String parseString(Bundle bundle, String str) {
        return INSTANCE.parseString(bundle, str);
    }

    public static final boolean parseStringAsBoolean(Bundle bundle, String str) {
        return INSTANCE.parseStringAsBoolean(bundle, str);
    }

    public static final Integer parseStringAsColorInt(Bundle bundle, String str) {
        return INSTANCE.parseStringAsColorInt(bundle, str);
    }

    public static final Integer parseStringAsInteger(Bundle bundle, String str) {
        return INSTANCE.parseStringAsInteger(bundle, str);
    }

    public static final Long parseStringAsLong(Bundle bundle, String str) {
        return INSTANCE.parseStringAsLong(bundle, str);
    }

    public final Integer getAccentColor() {
        return this.accentColor;
    }

    public final List<ActionButton> getActionButtons() {
        return this.actionButtonsInternal;
    }

    public final String getBigImageUrl() {
        return this.bigImageUrl;
    }

    public final String getBigSummaryText() {
        return this.bigSummaryText;
    }

    public final String getBigTitleText() {
        return this.bigTitleText;
    }

    public final Bundle getBrazeExtras() {
        return this.brazeExtras;
    }

    public final String getCampaignId() {
        return this.campaignId;
    }

    public final BrazeConfigurationProvider getConfigurationProvider() {
        return this.configurationProvider;
    }

    public final String getContentCardSyncData() {
        return this.contentCardSyncData;
    }

    public final String getContentCardSyncUserId() {
        return this.contentCardSyncUserId;
    }

    public final String getContentText() {
        return this.contentText;
    }

    public final Context getContext() {
        return this.context;
    }

    public final List<ConversationMessage> getConversationMessages() {
        return this.conversationMessagesInternal;
    }

    public final Map<String, ConversationPerson> getConversationPersonMap() {
        return this.conversationPersonMapInternal;
    }

    public final String getConversationReplyPersonId() {
        return this.conversationReplyPersonId;
    }

    public final String getConversationShortcutId() {
        return this.conversationShortcutId;
    }

    public final Integer getCustomNotificationId() {
        return this.customNotificationId;
    }

    public final String getDeeplink() {
        return this.deeplink;
    }

    public final Map<String, String> getExtras() {
        return this.extras;
    }

    public final long getFlushMaxMinutes() {
        return this.flushMaxMinutes;
    }

    public final long getFlushMinMinutes() {
        return this.flushMinMinutes;
    }

    public final String getLargeIcon() {
        return this.largeIcon;
    }

    public final Integer getNotificationBadgeNumber() {
        return this.notificationBadgeNumber;
    }

    public final String getNotificationCategory() {
        return this.notificationCategory;
    }

    public final String getNotificationChannelId() {
        return this.notificationChannelId;
    }

    public final Bundle getNotificationExtras() {
        return this.notificationExtras;
    }

    public final Integer getNotificationPriorityInt() {
        return this.notificationPriorityInt;
    }

    public final Long getNotificationReceivedTimestampMillis() {
        return this.notificationReceivedTimestampMillis;
    }

    public final String getNotificationSound() {
        return this.notificationSound;
    }

    public final Integer getNotificationVisibility() {
        return this.notificationVisibility;
    }

    public final String getPublicNotificationExtras() {
        return this.publicNotificationExtras;
    }

    public final Integer getPushDuration() {
        return this.pushDuration;
    }

    public final int getPushStoryPageIndex() {
        return this.pushStoryPageIndex;
    }

    public final List<PushStoryPage> getPushStoryPages() {
        return this.pushStoryPagesInternal;
    }

    public final String getPushUniqueId() {
        return this.pushUniqueId;
    }

    public final boolean getShouldFetchTestTriggers() {
        return this.shouldFetchTestTriggers;
    }

    public final boolean getShouldRefreshBanners() {
        return this.shouldRefreshBanners;
    }

    public final boolean getShouldRefreshFeatureFlags() {
        return this.shouldRefreshFeatureFlags;
    }

    public final String getSummaryText() {
        return this.summaryText;
    }

    public final String getTitleText() {
        return this.titleText;
    }

    public final Boolean getUseWebView() {
        return this.useWebView;
    }

    /* JADX INFO: renamed from: isConversationalPush, reason: from getter */
    public final boolean getIsConversationalPush() {
        return this.isConversationalPush;
    }

    /* JADX INFO: renamed from: isInlineImagePush, reason: from getter */
    public final boolean getIsInlineImagePush() {
        return this.isInlineImagePush;
    }

    /* JADX INFO: renamed from: isNewlyReceivedPushStory, reason: from getter */
    public final boolean getIsNewlyReceivedPushStory() {
        return this.isNewlyReceivedPushStory;
    }

    /* JADX INFO: renamed from: isPushDeliveryEnabled, reason: from getter */
    public final boolean getIsPushDeliveryEnabled() {
        return this.isPushDeliveryEnabled;
    }

    /* JADX INFO: renamed from: isPushStory, reason: from getter */
    public final boolean getIsPushStory() {
        return this.isPushStory;
    }

    public final boolean isSilentPush() {
        return this.titleText == null && this.contentText == null;
    }

    /* JADX INFO: renamed from: isUninstallTrackingPush, reason: from getter */
    public final boolean getIsUninstallTrackingPush() {
        return this.isUninstallTrackingPush;
    }

    public final void setAccentColor(Integer num) {
        this.accentColor = num;
    }

    public final void setActionButtons(List<ActionButton> actionButtons) {
        actionButtons.getClass();
        this.actionButtonsInternal = actionButtons;
    }

    public final void setBigImageUrl(String str) {
        this.bigImageUrl = str;
    }

    public final void setBigSummaryText(String str) {
        this.bigSummaryText = str;
    }

    public final void setBigTitleText(String str) {
        this.bigTitleText = str;
    }

    public final void setBrazeExtras(Bundle bundle) {
        bundle.getClass();
        this.brazeExtras = bundle;
    }

    public final void setCampaignId(String str) {
        this.campaignId = str;
    }

    public final void setConfigurationProvider(BrazeConfigurationProvider brazeConfigurationProvider) {
        this.configurationProvider = brazeConfigurationProvider;
    }

    public final void setContentCardSyncData(String str) {
        this.contentCardSyncData = str;
    }

    public final void setContentCardSyncUserId(String str) {
        this.contentCardSyncUserId = str;
    }

    public final void setContentText(String str) {
        this.contentText = str;
    }

    public final void setContext(Context context) {
        this.context = context;
    }

    public final void setConversationShortcutId(String str) {
        this.conversationShortcutId = str;
    }

    public final void setConversationalPush(boolean z11) {
        this.isConversationalPush = z11;
    }

    public final void setCustomNotificationId(Integer num) {
        this.customNotificationId = num;
    }

    public final void setDeeplink(String str) {
        this.deeplink = str;
    }

    public final void setExtras(Map<String, String> map) {
        map.getClass();
        this.extras = map;
    }

    public final void setFlushMaxMinutes(long j9) {
        this.flushMaxMinutes = j9;
    }

    public final void setFlushMinMinutes(long j9) {
        this.flushMinMinutes = j9;
    }

    public final void setInlineImagePush(boolean z11) {
        this.isInlineImagePush = z11;
    }

    public final void setIsInlineImagePush(boolean isInlineImagePush) {
        this.isInlineImagePush = isInlineImagePush;
    }

    public final void setLargeIcon(String str) {
        this.largeIcon = str;
    }

    public final void setNewlyReceivedPushStory(boolean z11) {
        this.isNewlyReceivedPushStory = z11;
    }

    public final void setNotificationBadgeNumber(Integer num) {
        this.notificationBadgeNumber = num;
    }

    public final void setNotificationCategory(String str) {
        this.notificationCategory = str;
    }

    public final void setNotificationChannelId(String str) {
        this.notificationChannelId = str;
    }

    public final void setNotificationPriorityInt(Integer num) {
        this.notificationPriorityInt = num;
    }

    public final void setNotificationReceivedTimestampMillis(Long l) {
        this.notificationReceivedTimestampMillis = l;
    }

    public final void setNotificationSound(String str) {
        this.notificationSound = str;
    }

    public final void setNotificationVisibility(Integer num) {
        this.notificationVisibility = num;
    }

    public final void setPublicNotificationExtras(String str) {
        this.publicNotificationExtras = str;
    }

    public final void setPushDeliveryEnabled(boolean z11) {
        this.isPushDeliveryEnabled = z11;
    }

    public final void setPushDuration(Integer num) {
        this.pushDuration = num;
    }

    public final void setPushStory(boolean z11) {
        this.isPushStory = z11;
    }

    public final void setPushStoryPageIndex(int i11) {
        this.pushStoryPageIndex = i11;
    }

    public final void setPushStoryPages(List<PushStoryPage> pushStoryPages) {
        pushStoryPages.getClass();
        this.pushStoryPagesInternal = pushStoryPages;
    }

    public final void setPushUniqueId(String str) {
        this.pushUniqueId = str;
    }

    public final void setShouldFetchTestTriggers(boolean z11) {
        this.shouldFetchTestTriggers = z11;
    }

    public final void setShouldRefreshBanners(boolean z11) {
        this.shouldRefreshBanners = z11;
    }

    public final void setShouldRefreshFeatureFlags(boolean z11) {
        this.shouldRefreshFeatureFlags = z11;
    }

    public final void setSummaryText(String str) {
        this.summaryText = str;
    }

    public final void setTitleText(String str) {
        this.titleText = str;
    }

    public final void setUninstallTrackingPush(boolean z11) {
        this.isUninstallTrackingPush = z11;
    }

    public final void setUseWebView(Boolean bool) {
        this.useWebView = bool;
    }

    public String toString() {
        Companion companion = INSTANCE;
        String strStringAndKey = companion.stringAndKey("PushDuration", this.pushDuration);
        String strStringAndKey2 = companion.stringAndKey("IsPushStory", Boolean.valueOf(this.isPushStory));
        String strStringAndKey3 = companion.stringAndKey("IsInlineImagePush", Boolean.valueOf(this.isInlineImagePush));
        String strStringAndKey4 = companion.stringAndKey("IsConversationalPush", Boolean.valueOf(this.isConversationalPush));
        String strStringAndKey5 = companion.stringAndKey("PublicNotificationExtras", this.publicNotificationExtras);
        String strStringAndKey6 = companion.stringAndKey("NotificationChannelId", this.notificationChannelId);
        String strStringAndKey7 = companion.stringAndKey("NotificationCategory", this.notificationCategory);
        String strStringAndKey8 = companion.stringAndKey("NotificationVisibility", this.notificationVisibility);
        String strStringAndKey9 = companion.stringAndKey("NotificationBadgeNumber", this.notificationBadgeNumber);
        String strStringAndKey10 = companion.stringAndKey("CustomNotificationId", this.customNotificationId);
        String strStringAndKey11 = companion.stringAndKey("NotificationReceivedTimestampMillis", this.notificationReceivedTimestampMillis);
        String strStringAndKey12 = companion.stringAndKey("ContentCardSyncData", this.contentCardSyncData);
        String strStringAndKey13 = companion.stringAndKey("ContentCardSyncUserId", this.contentCardSyncUserId);
        String strStringAndKey14 = companion.stringAndKey("TitleText", this.titleText);
        String strStringAndKey15 = companion.stringAndKey("ContentText", this.contentText);
        String strStringAndKey16 = companion.stringAndKey("LargeIcon", this.largeIcon);
        String strStringAndKey17 = companion.stringAndKey("NotificationSound", this.notificationSound);
        String strStringAndKey18 = companion.stringAndKey("SummaryText", this.summaryText);
        String strStringAndKey19 = companion.stringAndKey("AccentColor", this.accentColor);
        String strStringAndKey20 = companion.stringAndKey("BigSummaryText", this.bigSummaryText);
        String strStringAndKey21 = companion.stringAndKey("BigTitleText", this.bigTitleText);
        String strStringAndKey22 = companion.stringAndKey("BigImageUrl", this.bigImageUrl);
        String strStringAndKey23 = companion.stringAndKey("ActionButtons", getActionButtons());
        String strStringAndKey24 = companion.stringAndKey("PushStoryPageIndex", Integer.valueOf(this.pushStoryPageIndex));
        String strStringAndKey25 = companion.stringAndKey("PushStoryPages", this.pushStoryPagesInternal);
        String strStringAndKey26 = companion.stringAndKey("ConversationMessages", this.conversationMessagesInternal);
        String strStringAndKey27 = companion.stringAndKey("ConversationPersonMap", this.conversationPersonMapInternal);
        String strStringAndKey28 = companion.stringAndKey("PushDeliveryEnabled", Boolean.valueOf(this.isPushDeliveryEnabled));
        String strStringAndKey29 = companion.stringAndKey("PushUniqueId", this.pushUniqueId);
        String strStringAndKey30 = companion.stringAndKey("ConversationShortcutId", this.conversationShortcutId);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(strStringAndKey);
        sb2.append(strStringAndKey2);
        sb2.append(strStringAndKey3);
        sb2.append(strStringAndKey4);
        sb2.append(strStringAndKey5);
        s.A(sb2, strStringAndKey6, strStringAndKey7, strStringAndKey8, strStringAndKey9);
        s.A(sb2, strStringAndKey10, strStringAndKey11, strStringAndKey12, strStringAndKey13);
        s.A(sb2, strStringAndKey14, strStringAndKey15, strStringAndKey16, strStringAndKey17);
        s.A(sb2, strStringAndKey18, strStringAndKey19, strStringAndKey20, strStringAndKey21);
        s.A(sb2, strStringAndKey22, strStringAndKey23, strStringAndKey24, strStringAndKey25);
        s.A(sb2, strStringAndKey26, strStringAndKey27, strStringAndKey28, strStringAndKey29);
        sb2.append(strStringAndKey30);
        return sb2.toString();
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007J\"\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\rH\u0007J,\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\rH\u0007J(\u0010\f\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J(\u0010\f\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0005H\u0007J \u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\rH\u0007J\u001f\u0010\u0015\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\rH\u0007¢\u0006\u0002\u0010\u0018J \u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u000fH\u0007J\u001f\u0010\u001a\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\rH\u0007¢\u0006\u0002\u0010\u001bJ\u0018\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\rH\u0007J\u001f\u0010\u001d\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\rH\u0007¢\u0006\u0002\u0010\u001bJ\u001a\u0010\u001e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\rH\u0007J\u001f\u0010\u001f\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\rH\u0007¢\u0006\u0002\u0010\u0018J\u001a\u0010 \u001a\u0004\u0018\u00010\r2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\rH\u0007J\u001a\u0010!\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\r2\b\u0010#\u001a\u0004\u0018\u00010\u0001H\u0002R\u0016\u0010\u0004\u001a\u00020\u00058\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0003R\u0016\u0010\u0007\u001a\u00020\u00058\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0003¨\u0006$"}, d2 = {"Lcom/braze/models/push/BrazeNotificationPayload$Companion;", "", "<init>", "()V", "DEFAULT_PUSH_DELIVERY_MIN_FLUSH", "", "getDEFAULT_PUSH_DELIVERY_MIN_FLUSH$android_sdk_base_release$annotations", "DEFAULT_PUSH_DELIVERY_MAX_FLUSH", "getDEFAULT_PUSH_DELIVERY_MAX_FLUSH$android_sdk_base_release$annotations", "getAttachedBrazeExtras", "Landroid/os/Bundle;", "notificationExtras", "getTemplateFieldAtIndex", "", "index", "", "actionFieldKeyTemplate", "defaultValue", "", "actionIndex", "getPushStoryGravityAtIndex", "parseStringAsInteger", "bundle", "key", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Integer;", "parseObjectAsInteger", "parseStringAsLong", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Long;", "parseStringAsBoolean", "parseLong", "parseString", "parseStringAsColorInt", "parseNonBlankString", "stringAndKey", "prefix", "value", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getTemplateFieldAtIndex$lambda$0() {
            return "Failed to parse action field boolean. Returning default.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getTemplateFieldAtIndex$lambda$1() {
            return "Failed to parse action field long. Returning default.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String parseLong$lambda$10(String str, Bundle bundle) {
            return "Failed to parse long with key " + str + " and bundle: " + bundle;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String parseNonBlankString$lambda$14(String str, Bundle bundle) {
            return "Failed to parse non blank string with key " + str + " and bundle: " + bundle;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String parseObjectAsInteger$lambda$5(String str, Bundle bundle) {
            return "Failed to parse string as int with key " + str + " and bundle: " + bundle;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String parseString$lambda$11(String str, Bundle bundle) {
            return "Failed to parse string with key " + str + " and bundle: " + bundle;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String parseStringAsBoolean$lambda$9(String str, Bundle bundle) {
            return "Failed to parse string as boolean with key " + str + " and bundle: " + bundle;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String parseStringAsColorInt$lambda$13(String str, Bundle bundle) {
            return "Failed to parse string as color int with key " + str + " and bundle: " + bundle;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String parseStringAsInteger$lambda$3(String str, Bundle bundle) {
            return "Failed to parse string as int with key " + str + " and bundle: " + bundle;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String parseStringAsLong$lambda$7(String str, Bundle bundle) {
            return "Failed to parse string as long with key " + str + " and bundle: " + bundle;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String stringAndKey(String prefix, Object value) {
            if (value == null) {
                return "";
            }
            return "\n" + prefix + " = " + value;
        }

        public final Bundle getAttachedBrazeExtras(Bundle notificationExtras) {
            if (notificationExtras == null) {
                return new Bundle();
            }
            if (notificationExtras.containsKey(Constants.BRAZE_PUSH_STORY_IS_NEWLY_RECEIVED) && !notificationExtras.getBoolean(Constants.BRAZE_PUSH_STORY_IS_NEWLY_RECEIVED)) {
                Bundle bundle = notificationExtras.getBundle(Constants.BRAZE_PUSH_EXTRAS_KEY);
                return bundle == null ? new Bundle() : bundle;
            }
            if (Constants.isAmazonDevice()) {
                return new Bundle(notificationExtras);
            }
            Object obj = notificationExtras.get(Constants.BRAZE_PUSH_EXTRAS_KEY);
            return obj instanceof String ? JsonUtils.parseJsonObjectIntoBundle((String) obj) : obj instanceof Bundle ? (Bundle) obj : new Bundle();
        }

        public final int getPushStoryGravityAtIndex(int actionIndex, Bundle notificationExtras, String actionFieldKeyTemplate) {
            notificationExtras.getClass();
            actionFieldKeyTemplate.getClass();
            String string = notificationExtras.getString(y.n(actionFieldKeyTemplate, "*", String.valueOf(actionIndex), false));
            if (string == null || StringsKt.H(string)) {
                return 17;
            }
            int iHashCode = string.hashCode();
            if (iHashCode != -1364013995) {
                return iHashCode != 100571 ? (iHashCode == 109757538 && string.equals("start")) ? 8388611 : 17 : !string.equals("end") ? 17 : 8388613;
            }
            string.equals("center");
            return 17;
        }

        public final boolean getTemplateFieldAtIndex(int actionIndex, Bundle notificationExtras, String actionFieldKeyTemplate, boolean defaultValue) {
            notificationExtras.getClass();
            actionFieldKeyTemplate.getClass();
            String string = notificationExtras.getString(y.n(actionFieldKeyTemplate, "*", String.valueOf(actionIndex), false));
            if (string == null) {
                return defaultValue;
            }
            try {
                return Boolean.parseBoolean(string);
            } catch (Exception e5) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new eu.a(7), 4, (Object) null);
                return defaultValue;
            }
        }

        public final Long parseLong(Bundle bundle, String key) {
            bundle.getClass();
            key.getClass();
            try {
                if (bundle.containsKey(key)) {
                    return Long.valueOf(bundle.getLong(key));
                }
                return null;
            } catch (Exception unused) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new ew.a(3, bundle, key), 7, (Object) null);
                return null;
            }
        }

        public final String parseNonBlankString(Bundle bundle, String key) {
            bundle.getClass();
            key.getClass();
            try {
                String string = parseString(bundle, key);
                if (string == null) {
                    return null;
                }
                if (StringsKt.H(string)) {
                    return null;
                }
                return string;
            } catch (Exception unused) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new ew.a(6, bundle, key), 7, (Object) null);
                return null;
            }
        }

        public final int parseObjectAsInteger(Bundle bundle, String key, int defaultValue) {
            Object obj;
            bundle.getClass();
            key.getClass();
            try {
                return (!bundle.containsKey(key) || (obj = bundle.get(key)) == null) ? defaultValue : Integer.parseInt(obj.toString());
            } catch (Exception unused) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new ew.a(0, bundle, key), 7, (Object) null);
                return defaultValue;
            }
        }

        public final String parseString(Bundle bundle, String key) {
            bundle.getClass();
            key.getClass();
            try {
                if (bundle.containsKey(key)) {
                    return bundle.getString(key);
                }
                return null;
            } catch (Exception unused) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new ew.a(4, bundle, key), 7, (Object) null);
                return null;
            }
        }

        public final boolean parseStringAsBoolean(Bundle bundle, String key) {
            String string;
            bundle.getClass();
            key.getClass();
            try {
                if (!bundle.containsKey(key) || (string = bundle.getString(key)) == null) {
                    return false;
                }
                return Boolean.parseBoolean(string);
            } catch (Exception unused) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new ew.a(5, bundle, key), 7, (Object) null);
                return false;
            }
        }

        public final Integer parseStringAsColorInt(Bundle bundle, String key) {
            String string;
            bundle.getClass();
            key.getClass();
            try {
                if (!bundle.containsKey(key) || (string = bundle.getString(key)) == null) {
                    return null;
                }
                return Integer.valueOf((int) Long.parseLong(string));
            } catch (Exception unused) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new ew.a(2, bundle, key), 7, (Object) null);
                return null;
            }
        }

        public final Integer parseStringAsInteger(Bundle bundle, String key) {
            String string;
            bundle.getClass();
            key.getClass();
            try {
                if (!bundle.containsKey(key) || (string = bundle.getString(key)) == null) {
                    return null;
                }
                return Integer.valueOf(Integer.parseInt(string));
            } catch (Exception unused) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new ew.a(7, bundle, key), 7, (Object) null);
                return null;
            }
        }

        public final Long parseStringAsLong(Bundle bundle, String key) {
            String string;
            bundle.getClass();
            key.getClass();
            try {
                if (!bundle.containsKey(key) || (string = bundle.getString(key)) == null) {
                    return null;
                }
                return Long.valueOf(Long.parseLong(string));
            } catch (Exception unused) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new ew.a(1, bundle, key), 7, (Object) null);
                return null;
            }
        }

        private Companion() {
        }

        public static /* synthetic */ void getDEFAULT_PUSH_DELIVERY_MAX_FLUSH$android_sdk_base_release$annotations() {
        }

        public static /* synthetic */ void getDEFAULT_PUSH_DELIVERY_MIN_FLUSH$android_sdk_base_release$annotations() {
        }

        public final String getTemplateFieldAtIndex(int index, Bundle notificationExtras, String actionFieldKeyTemplate, String defaultValue) {
            notificationExtras.getClass();
            actionFieldKeyTemplate.getClass();
            String string = notificationExtras.getString(y.n(actionFieldKeyTemplate, "*", String.valueOf(index), false));
            return string == null ? defaultValue : string;
        }

        public final String getTemplateFieldAtIndex(int index, Bundle notificationExtras, String actionFieldKeyTemplate) {
            notificationExtras.getClass();
            actionFieldKeyTemplate.getClass();
            return getTemplateFieldAtIndex(index, notificationExtras, actionFieldKeyTemplate, "");
        }

        public final long getTemplateFieldAtIndex(int actionIndex, Bundle notificationExtras, String actionFieldKeyTemplate, long defaultValue) {
            notificationExtras.getClass();
            actionFieldKeyTemplate.getClass();
            String string = notificationExtras.getString(y.n(actionFieldKeyTemplate, "*", String.valueOf(actionIndex), false));
            if (string == null) {
                return defaultValue;
            }
            try {
                return Long.parseLong(string);
            } catch (Exception e5) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new eu.a(6), 4, (Object) null);
                return defaultValue;
            }
        }
    }

    public static final String getTemplateFieldAtIndex(int i11, Bundle bundle, String str) {
        return INSTANCE.getTemplateFieldAtIndex(i11, bundle, str);
    }

    public static final String getTemplateFieldAtIndex(int i11, Bundle bundle, String str, String str2) {
        return INSTANCE.getTemplateFieldAtIndex(i11, bundle, str, str2);
    }

    public static final boolean getTemplateFieldAtIndex(int i11, Bundle bundle, String str, boolean z11) {
        return INSTANCE.getTemplateFieldAtIndex(i11, bundle, str, z11);
    }

    public static /* synthetic */ void getCampaignId$annotations() {
    }

    public static /* synthetic */ void getFlushMaxMinutes$annotations() {
    }

    public static /* synthetic */ void getFlushMinMinutes$annotations() {
    }

    public static /* synthetic */ void isPushDeliveryEnabled$annotations() {
    }

    public BrazeNotificationPayload(Bundle bundle, Bundle bundle2) {
        this(bundle, bundle2, null, null, 12, null);
    }

    public BrazeNotificationPayload(Bundle bundle, Bundle bundle2, Context context) {
        this(bundle, bundle2, context, null, 8, null);
    }

    public BrazeNotificationPayload(Bundle bundle) {
        this(bundle, null, null, null, 14, null);
    }

    public /* synthetic */ BrazeNotificationPayload(Bundle bundle, Bundle bundle2, Context context, BrazeConfigurationProvider brazeConfigurationProvider, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(bundle, (i11 & 2) != 0 ? INSTANCE.getAttachedBrazeExtras(bundle) : bundle2, (i11 & 4) != 0 ? null : context, (i11 & 8) != 0 ? null : brazeConfigurationProvider);
    }
}
