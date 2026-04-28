package zendesk.android.messaging.model;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zendesk.android.settings.internal.model.BrandDto;
import zendesk.android.settings.internal.model.NativeMessagingDto;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\u001an\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0007H\u0000¨\u0006\u0012"}, d2 = {"toMessagingSettings", "Lzendesk/android/messaging/model/MessagingSettings;", "Lzendesk/android/settings/internal/model/NativeMessagingDto;", "lightTheme", "Lzendesk/android/messaging/model/ColorTheme;", "darkTheme", "canUserCreateMoreConversations", "", "isMultiConversationsEnabled", "hipaaAttachmentFlag", "identifier", "", "canUserSeeConversationList", "shouldTrackInternalAnalyticEvents", "isMultiAttachmentsEnabled", "isEndSessionEnabled", "isReopenConversationDisabled", "isConversationTranscriptEnabled", "zendesk_zendesk-android"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class MessagingSettingsKt {
    @NotNull
    public static final MessagingSettings toMessagingSettings(@NotNull NativeMessagingDto nativeMessagingDto, @NotNull ColorTheme colorTheme, @NotNull ColorTheme colorTheme2, boolean z11, boolean z12, boolean z13, @Nullable String str, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19) {
        String name;
        nativeMessagingDto.getClass();
        colorTheme.getClass();
        colorTheme2.getClass();
        String integrationId = nativeMessagingDto.getIntegrationId();
        boolean enabled = nativeMessagingDto.getEnabled();
        BrandDto brand = nativeMessagingDto.getBrand();
        if (brand == null || (name = brand.getName()) == null) {
            name = "";
        }
        String title = nativeMessagingDto.getTitle();
        if (title == null) {
            title = "";
        }
        String description = nativeMessagingDto.getDescription();
        if (description == null) {
            description = "";
        }
        String logoUrl = nativeMessagingDto.getLogoUrl();
        if (logoUrl == null) {
            logoUrl = "";
        }
        return new MessagingSettings(integrationId, enabled, name, title, description, logoUrl, colorTheme, colorTheme2, z11, z12, z13, str == null ? "" : str, z14, z15, z16, z17, z18, z19);
    }
}
