package zendesk.conversationkit.android.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import zendesk.conversationkit.android.internal.rest.model.AppUserResponseDto;
import zendesk.conversationkit.android.internal.rest.model.ConversationDto;
import zendesk.conversationkit.android.internal.rest.model.RealtimeSettingsDto;
import zendesk.conversationkit.android.internal.rest.model.TypingSettingsDto;
import zendesk.conversationkit.android.model.AuthenticationType;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0000\u001a\u001c\u0010\u0007\u001a\u00020\b*\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0000\u001a\f\u0010\u000b\u001a\u00020\f*\u00020\rH\u0000\u001a\u0012\u0010\u000e\u001a\u00020\u000f*\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u0011¨\u0006\u0012"}, d2 = {"toUser", "Lzendesk/conversationkit/android/model/User;", "Lzendesk/conversationkit/android/internal/rest/model/AppUserResponseDto;", "appId", "", "authenticationType", "Lzendesk/conversationkit/android/model/AuthenticationType;", "toRealtimeSettings", "Lzendesk/conversationkit/android/model/RealtimeSettings;", "Lzendesk/conversationkit/android/internal/rest/model/RealtimeSettingsDto;", "userId", "toTypingSettings", "Lzendesk/conversationkit/android/model/TypingSettings;", "Lzendesk/conversationkit/android/internal/rest/model/TypingSettingsDto;", "isNotAuthoredBySameUser", "", "author", "Lzendesk/conversationkit/android/model/Author;", "zendesk.conversationkit_conversationkit-android"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nUser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 User.kt\nzendesk/conversationkit/android/model/UserKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,179:1\n1563#2:180\n1634#2,3:181\n*S KotlinDebug\n*F\n+ 1 User.kt\nzendesk/conversationkit/android/model/UserKt\n*L\n85#1:180\n85#1:181,3\n*E\n"})
public final class UserKt {
    public static final boolean isNotAuthoredBySameUser(@NotNull User user, @NotNull Author author) {
        user.getClass();
        author.getClass();
        return !Intrinsics.areEqual(author.getUserId(), user.getId());
    }

    @NotNull
    public static final RealtimeSettings toRealtimeSettings(@NotNull RealtimeSettingsDto realtimeSettingsDto, @NotNull String str, @NotNull String str2) {
        realtimeSettingsDto.getClass();
        str.getClass();
        str2.getClass();
        return new RealtimeSettings(realtimeSettingsDto.getEnabled(), realtimeSettingsDto.getBaseUrl(), realtimeSettingsDto.getRetryInterval(), realtimeSettingsDto.getMaxConnectionAttempts(), realtimeSettingsDto.getConnectionDelay(), (TimeUnit) null, str, str2, 32, (DefaultConstructorMarker) null);
    }

    @NotNull
    public static final TypingSettings toTypingSettings(@NotNull TypingSettingsDto typingSettingsDto) {
        typingSettingsDto.getClass();
        return new TypingSettings(typingSettingsDto.getEnabled());
    }

    @NotNull
    public static final User toUser(@NotNull AppUserResponseDto appUserResponseDto, @NotNull String str, @NotNull AuthenticationType authenticationType) {
        appUserResponseDto.getClass();
        str.getClass();
        authenticationType.getClass();
        String id2 = appUserResponseDto.getAppUser().getId();
        String userId = appUserResponseDto.getAppUser().getUserId();
        String givenName = appUserResponseDto.getAppUser().getGivenName();
        String surname = appUserResponseDto.getAppUser().getSurname();
        String email = appUserResponseDto.getAppUser().getEmail();
        String locale = appUserResponseDto.getAppUser().getLocale();
        String signedUpAt = appUserResponseDto.getAppUser().getSignedUpAt();
        List<ConversationDto> conversations = appUserResponseDto.getConversations();
        ArrayList arrayList = new ArrayList(e0.o(conversations, 10));
        Iterator<T> it = conversations.iterator();
        while (it.hasNext()) {
            arrayList.add(ConversationKt.toConversation$default((ConversationDto) it.next(), appUserResponseDto.getAppUser().getId(), appUserResponseDto.getAppUsers(), null, false, null, 28, null));
        }
        RealtimeSettings realtimeSettings = toRealtimeSettings(appUserResponseDto.getSettings().getRealtime(), str, appUserResponseDto.getAppUser().getId());
        TypingSettings typingSettings = toTypingSettings(appUserResponseDto.getSettings().getTyping());
        AuthenticationType.Jwt jwt = authenticationType instanceof AuthenticationType.Jwt ? (AuthenticationType.Jwt) authenticationType : null;
        String value = jwt != null ? jwt.getValue() : null;
        AuthenticationType.SessionToken sessionToken = authenticationType instanceof AuthenticationType.SessionToken ? (AuthenticationType.SessionToken) authenticationType : null;
        return new User(id2, userId, givenName, surname, email, locale, signedUpAt, arrayList, realtimeSettings, typingSettings, sessionToken != null ? sessionToken.getValue() : null, value, appUserResponseDto.getConversationsPagination().getHasMore());
    }

    public static /* synthetic */ User toUser$default(AppUserResponseDto appUserResponseDto, String str, AuthenticationType authenticationType, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            authenticationType = appUserResponseDto.getSessionToken() != null ? new AuthenticationType.SessionToken(appUserResponseDto.getSessionToken()) : AuthenticationType.Unauthenticated.INSTANCE;
        }
        return toUser(appUserResponseDto, str, authenticationType);
    }
}
