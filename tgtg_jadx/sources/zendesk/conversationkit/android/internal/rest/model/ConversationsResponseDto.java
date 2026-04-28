package zendesk.conversationkit.android.internal.rest.model;

import au.a;
import e0.f;
import i90.h;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.c1;
import m90.d;
import m90.f0;
import m90.m1;
import m90.r1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.j;
import u70.l;
import u70.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@h
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0081\b\u0018\u0000 <2\u00020\u0001:\u0002=<BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0\u000b¢\u0006\u0004\b\u000e\u0010\u000fB_\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b$\u0010%J\u001c\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0\u000bHÆ\u0003¢\u0006\u0004\b&\u0010'JT\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0\u000bHÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u00100\u001a\u00020/2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b0\u00101R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u0010\u001fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00104\u001a\u0004\b5\u0010!R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00106\u001a\u0004\b7\u0010#R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00108\u001a\u0004\b9\u0010%R#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010:\u001a\u0004\b;\u0010'¨\u0006>"}, d2 = {"Lzendesk/conversationkit/android/internal/rest/model/ConversationsResponseDto;", "", "Lzendesk/conversationkit/android/internal/rest/model/UserSettingsDto;", "settings", "", "Lzendesk/conversationkit/android/internal/rest/model/ConversationDto;", "conversations", "Lzendesk/conversationkit/android/internal/rest/model/ConversationsPaginationDto;", "conversationsPagination", "Lzendesk/conversationkit/android/internal/rest/model/AppUserDto;", "appUser", "", "", "appUsers", "<init>", "(Lzendesk/conversationkit/android/internal/rest/model/UserSettingsDto;Ljava/util/List;Lzendesk/conversationkit/android/internal/rest/model/ConversationsPaginationDto;Lzendesk/conversationkit/android/internal/rest/model/AppUserDto;Ljava/util/Map;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILzendesk/conversationkit/android/internal/rest/model/UserSettingsDto;Ljava/util/List;Lzendesk/conversationkit/android/internal/rest/model/ConversationsPaginationDto;Lzendesk/conversationkit/android/internal/rest/model/AppUserDto;Ljava/util/Map;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$zendesk_conversationkit_conversationkit_android", "(Lzendesk/conversationkit/android/internal/rest/model/ConversationsResponseDto;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lzendesk/conversationkit/android/internal/rest/model/UserSettingsDto;", "component2", "()Ljava/util/List;", "component3", "()Lzendesk/conversationkit/android/internal/rest/model/ConversationsPaginationDto;", "component4", "()Lzendesk/conversationkit/android/internal/rest/model/AppUserDto;", "component5", "()Ljava/util/Map;", "copy", "(Lzendesk/conversationkit/android/internal/rest/model/UserSettingsDto;Ljava/util/List;Lzendesk/conversationkit/android/internal/rest/model/ConversationsPaginationDto;Lzendesk/conversationkit/android/internal/rest/model/AppUserDto;Ljava/util/Map;)Lzendesk/conversationkit/android/internal/rest/model/ConversationsResponseDto;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lzendesk/conversationkit/android/internal/rest/model/UserSettingsDto;", "getSettings", "Ljava/util/List;", "getConversations", "Lzendesk/conversationkit/android/internal/rest/model/ConversationsPaginationDto;", "getConversationsPagination", "Lzendesk/conversationkit/android/internal/rest/model/AppUserDto;", "getAppUser", "Ljava/util/Map;", "getAppUsers", "Companion", "$serializer", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ConversationsResponseDto {

    @NotNull
    private static final j[] $childSerializers;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final AppUserDto appUser;

    @NotNull
    private final Map<String, AppUserDto> appUsers;

    @NotNull
    private final List<ConversationDto> conversations;

    @NotNull
    private final ConversationsPaginationDto conversationsPagination;

    @NotNull
    private final UserSettingsDto settings;

    static {
        m mVar = m.PUBLICATION;
        $childSerializers = new j[]{null, l.a(mVar, new a(29)), null, null, l.a(mVar, new bb0.a(0))};
    }

    public /* synthetic */ ConversationsResponseDto(int i11, UserSettingsDto userSettingsDto, List list, ConversationsPaginationDto conversationsPaginationDto, AppUserDto appUserDto, Map map, m1 m1Var) {
        if (31 != (i11 & 31)) {
            c1.j(i11, 31, ConversationsResponseDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.settings = userSettingsDto;
        this.conversations = list;
        this.conversationsPagination = conversationsPaginationDto;
        this.appUser = appUserDto;
        this.appUsers = map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new d(ConversationDto$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new f0(r1.f29848a, AppUserDto$$serializer.INSTANCE, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ConversationsResponseDto copy$default(ConversationsResponseDto conversationsResponseDto, UserSettingsDto userSettingsDto, List list, ConversationsPaginationDto conversationsPaginationDto, AppUserDto appUserDto, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            userSettingsDto = conversationsResponseDto.settings;
        }
        if ((i11 & 2) != 0) {
            list = conversationsResponseDto.conversations;
        }
        if ((i11 & 4) != 0) {
            conversationsPaginationDto = conversationsResponseDto.conversationsPagination;
        }
        if ((i11 & 8) != 0) {
            appUserDto = conversationsResponseDto.appUser;
        }
        if ((i11 & 16) != 0) {
            map = conversationsResponseDto.appUsers;
        }
        Map map2 = map;
        ConversationsPaginationDto conversationsPaginationDto2 = conversationsPaginationDto;
        return conversationsResponseDto.copy(userSettingsDto, list, conversationsPaginationDto2, appUserDto, map2);
    }

    public static final /* synthetic */ void write$Self$zendesk_conversationkit_conversationkit_android(ConversationsResponseDto self, b output, SerialDescriptor serialDesc) {
        j[] jVarArr = $childSerializers;
        output.i(serialDesc, 0, UserSettingsDto$$serializer.INSTANCE, self.settings);
        output.i(serialDesc, 1, (KSerializer) jVarArr[1].getValue(), self.conversations);
        output.i(serialDesc, 2, ConversationsPaginationDto$$serializer.INSTANCE, self.conversationsPagination);
        output.i(serialDesc, 3, AppUserDto$$serializer.INSTANCE, self.appUser);
        output.i(serialDesc, 4, (KSerializer) jVarArr[4].getValue(), self.appUsers);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final UserSettingsDto getSettings() {
        return this.settings;
    }

    @NotNull
    public final List<ConversationDto> component2() {
        return this.conversations;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ConversationsPaginationDto getConversationsPagination() {
        return this.conversationsPagination;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final AppUserDto getAppUser() {
        return this.appUser;
    }

    @NotNull
    public final Map<String, AppUserDto> component5() {
        return this.appUsers;
    }

    @NotNull
    public final ConversationsResponseDto copy(@NotNull UserSettingsDto settings, @NotNull List<ConversationDto> conversations, @NotNull ConversationsPaginationDto conversationsPagination, @NotNull AppUserDto appUser, @NotNull Map<String, AppUserDto> appUsers) {
        settings.getClass();
        conversations.getClass();
        conversationsPagination.getClass();
        appUser.getClass();
        appUsers.getClass();
        return new ConversationsResponseDto(settings, conversations, conversationsPagination, appUser, appUsers);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConversationsResponseDto)) {
            return false;
        }
        ConversationsResponseDto conversationsResponseDto = (ConversationsResponseDto) other;
        return Intrinsics.areEqual(this.settings, conversationsResponseDto.settings) && Intrinsics.areEqual(this.conversations, conversationsResponseDto.conversations) && Intrinsics.areEqual(this.conversationsPagination, conversationsResponseDto.conversationsPagination) && Intrinsics.areEqual(this.appUser, conversationsResponseDto.appUser) && Intrinsics.areEqual(this.appUsers, conversationsResponseDto.appUsers);
    }

    @NotNull
    public final AppUserDto getAppUser() {
        return this.appUser;
    }

    @NotNull
    public final Map<String, AppUserDto> getAppUsers() {
        return this.appUsers;
    }

    @NotNull
    public final List<ConversationDto> getConversations() {
        return this.conversations;
    }

    @NotNull
    public final ConversationsPaginationDto getConversationsPagination() {
        return this.conversationsPagination;
    }

    @NotNull
    public final UserSettingsDto getSettings() {
        return this.settings;
    }

    public int hashCode() {
        return this.appUsers.hashCode() + ((this.appUser.hashCode() + ((this.conversationsPagination.hashCode() + f.c(this.conversations, this.settings.hashCode() * 31, 31)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "ConversationsResponseDto(settings=" + this.settings + ", conversations=" + this.conversations + ", conversationsPagination=" + this.conversationsPagination + ", appUser=" + this.appUser + ", appUsers=" + this.appUsers + ")";
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/conversationkit/android/internal/rest/model/ConversationsResponseDto$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/conversationkit/android/internal/rest/model/ConversationsResponseDto;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return ConversationsResponseDto$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ConversationsResponseDto(@NotNull UserSettingsDto userSettingsDto, @NotNull List<ConversationDto> list, @NotNull ConversationsPaginationDto conversationsPaginationDto, @NotNull AppUserDto appUserDto, @NotNull Map<String, AppUserDto> map) {
        userSettingsDto.getClass();
        list.getClass();
        conversationsPaginationDto.getClass();
        appUserDto.getClass();
        map.getClass();
        this.settings = userSettingsDto;
        this.conversations = list;
        this.conversationsPagination = conversationsPaginationDto;
        this.appUser = appUserDto;
        this.appUsers = map;
    }
}
