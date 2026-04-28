package zendesk.android.settings.internal.model;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0004\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0005\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0006"}, d2 = {"canUserCreateMoreConversations", "", "Lzendesk/android/settings/internal/model/SettingsDto;", "canUserSeeConversationList", "isMultiConversationsEnabled", "isMultiAttachmentsEnabled", "zendesk_zendesk-android"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class SettingsDtoKt {
    public static final boolean canUserCreateMoreConversations(@NotNull SettingsDto settingsDto) {
        IntegrationDto integration;
        settingsDto.getClass();
        SunCoConfigDto sunCoConfigDto = settingsDto.getSunCoConfigDto();
        if (sunCoConfigDto == null || (integration = sunCoConfigDto.getIntegration()) == null) {
            return false;
        }
        return integration.getCanUserCreateMoreConversations();
    }

    public static final boolean canUserSeeConversationList(@NotNull SettingsDto settingsDto) {
        IntegrationDto integration;
        settingsDto.getClass();
        SunCoConfigDto sunCoConfigDto = settingsDto.getSunCoConfigDto();
        if (sunCoConfigDto == null || (integration = sunCoConfigDto.getIntegration()) == null) {
            return true;
        }
        return integration.getCanUserSeeConversationList();
    }

    public static final boolean isMultiAttachmentsEnabled(@NotNull SettingsDto settingsDto) {
        settingsDto.getClass();
        AttachmentsRulesDto attachmentRulesDto = settingsDto.getAttachmentRulesDto();
        if (attachmentRulesDto != null) {
            return attachmentRulesDto.getMultiAttachments();
        }
        return false;
    }

    public static final boolean isMultiConversationsEnabled(@NotNull SettingsDto settingsDto) {
        AppDto app2;
        AppSettingsDto settings;
        settingsDto.getClass();
        SunCoConfigDto sunCoConfigDto = settingsDto.getSunCoConfigDto();
        if (sunCoConfigDto == null || (app2 = sunCoConfigDto.getApp()) == null || (settings = app2.getSettings()) == null) {
            return false;
        }
        return settings.isMultiConvoEnabled();
    }
}
