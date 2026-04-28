package zendesk.android.internal;

import android.content.Context;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v80.b0;
import x70.c;
import zendesk.android.settings.internal.model.SunCoConfigDto;
import zendesk.android.settings.internal.model.WaitConfigDto;
import zendesk.conversationkit.android.ConversationKit;
import zendesk.conversationkit.android.ConversationKitFactory;
import zendesk.conversationkit.android.ConversationKitSettings;
import zendesk.conversationkit.android.model.App;
import zendesk.conversationkit.android.model.Config;
import zendesk.conversationkit.android.model.Integration;
import zendesk.conversationkit.android.model.RestRetryPolicy;
import zendesk.conversationkit.android.model.WaitTimeConfig;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0080@¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0015\u001a\u00020\u0004*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lzendesk/android/internal/ConversationKitProvider;", "", "<init>", "()V", "Lzendesk/conversationkit/android/model/Config;", "conversationKitConfig", "", "integrationId", "Landroid/content/Context;", "context", "zendeskVersion", "Lv80/b0;", "coroutineScope", "Lzendesk/conversationkit/android/ConversationKit;", "createConversationKit$zendesk_zendesk_android", "(Lzendesk/conversationkit/android/model/Config;Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;Lv80/b0;Lx70/c;)Ljava/lang/Object;", "createConversationKit", "Lzendesk/android/settings/internal/model/SunCoConfigDto;", "settingsBaseUrl", "toConversationKitConfig$zendesk_zendesk_android", "(Lzendesk/android/settings/internal/model/SunCoConfigDto;Ljava/lang/String;)Lzendesk/conversationkit/android/model/Config;", "toConversationKitConfig", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ConversationKitProvider {

    @NotNull
    public static final ConversationKitProvider INSTANCE = new ConversationKitProvider();

    private ConversationKitProvider() {
    }

    @Nullable
    public final Object createConversationKit$zendesk_zendesk_android(@NotNull Config config, @NotNull String str, @NotNull Context context, @NotNull String str2, @NotNull b0 b0Var, @NotNull c<? super ConversationKit> cVar) {
        return ConversationKitFactory.INSTANCE.from(context).create(ConversationKitSettings.INSTANCE.builder(str, str2).build(), config, b0Var, cVar);
    }

    @NotNull
    public final Config toConversationKitConfig$zendesk_zendesk_android(@NotNull SunCoConfigDto sunCoConfigDto, @NotNull String str) {
        Integer queuePollingInterval;
        sunCoConfigDto.getClass();
        str.getClass();
        App app2 = new App(sunCoConfigDto.getApp().getId(), sunCoConfigDto.getApp().getStatus(), sunCoConfigDto.getApp().getName(), sunCoConfigDto.getApp().getSettings().isMultiConvoEnabled());
        String android2 = sunCoConfigDto.getBaseUrl().getAndroid();
        String id2 = sunCoConfigDto.getIntegration().getId();
        boolean canUserCreateMoreConversations = sunCoConfigDto.getIntegration().getCanUserCreateMoreConversations();
        boolean canUserSeeConversationList = sunCoConfigDto.getIntegration().getCanUserSeeConversationList();
        WaitConfigDto waitConfig = sunCoConfigDto.getIntegration().getWaitConfig();
        boolean waitTimeEnabled = waitConfig != null ? waitConfig.getWaitTimeEnabled() : false;
        WaitConfigDto waitConfig2 = sunCoConfigDto.getIntegration().getWaitConfig();
        boolean queuePositionEnabled = waitConfig2 != null ? waitConfig2.getQueuePositionEnabled() : false;
        WaitConfigDto waitConfig3 = sunCoConfigDto.getIntegration().getWaitConfig();
        boolean onlyDecreasingQueue = waitConfig3 != null ? waitConfig3.getOnlyDecreasingQueue() : false;
        WaitConfigDto waitConfig4 = sunCoConfigDto.getIntegration().getWaitConfig();
        Integer waitTimeOverride = waitConfig4 != null ? waitConfig4.getWaitTimeOverride() : null;
        WaitConfigDto waitConfig5 = sunCoConfigDto.getIntegration().getWaitConfig();
        return new Config(app2, android2, str, new Integration(id2, canUserCreateMoreConversations, canUserSeeConversationList, new WaitTimeConfig(waitTimeEnabled, queuePositionEnabled, onlyDecreasingQueue, waitTimeOverride, (waitConfig5 == null || (queuePollingInterval = waitConfig5.getQueuePollingInterval()) == null) ? 60 : queuePollingInterval.intValue())), new RestRetryPolicy(sunCoConfigDto.getRestRetryPolicy().getIntervals().getRegular(), sunCoConfigDto.getRestRetryPolicy().getIntervals().getAggressive(), null, sunCoConfigDto.getRestRetryPolicy().getBackoffMultiplier(), sunCoConfigDto.getRestRetryPolicy().getMaxRetries(), 4, null));
    }
}
