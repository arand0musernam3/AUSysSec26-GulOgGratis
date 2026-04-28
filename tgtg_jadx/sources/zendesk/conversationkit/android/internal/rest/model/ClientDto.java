package zendesk.conversationkit.android.internal.rest.model;

import e0.f;
import i90.h;
import j4.s;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.c1;
import m90.m1;
import m90.r1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w.a0;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@h
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0081\b\u0018\u0000 <2\u00020\u0001:\u0002=<Bc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eBu\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001eJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001eJ\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001eJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001eJ\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001eJ\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001eJ\u0012\u0010&\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b&\u0010'Jv\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010\u001eJ\u0010\u0010+\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b/\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u0010\u001eR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00101\u001a\u0004\b3\u0010\u001eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00101\u001a\u0004\b4\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00101\u001a\u0004\b5\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b6\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u00101\u001a\u0004\b7\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b8\u0010\u001eR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u00101\u001a\u0004\b9\u0010\u001eR\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010:\u001a\u0004\b;\u0010'¨\u0006>"}, d2 = {"Lzendesk/conversationkit/android/internal/rest/model/ClientDto;", "", "", "id", "status", "lastSeen", "platform", "integrationId", "pushNotificationToken", "appVersion", "displayName", "Lzendesk/conversationkit/android/internal/rest/model/ClientInfoDto;", "info", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lzendesk/conversationkit/android/internal/rest/model/ClientInfoDto;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lzendesk/conversationkit/android/internal/rest/model/ClientInfoDto;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$zendesk_conversationkit_conversationkit_android", "(Lzendesk/conversationkit/android/internal/rest/model/ClientDto;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "()Lzendesk/conversationkit/android/internal/rest/model/ClientInfoDto;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lzendesk/conversationkit/android/internal/rest/model/ClientInfoDto;)Lzendesk/conversationkit/android/internal/rest/model/ClientDto;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getStatus", "getLastSeen", "getPlatform", "getIntegrationId", "getPushNotificationToken", "getAppVersion", "getDisplayName", "Lzendesk/conversationkit/android/internal/rest/model/ClientInfoDto;", "getInfo", "Companion", "$serializer", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ClientDto {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final String appVersion;

    @Nullable
    private final String displayName;

    @NotNull
    private final String id;

    @Nullable
    private final ClientInfoDto info;

    @NotNull
    private final String integrationId;

    @Nullable
    private final String lastSeen;

    @NotNull
    private final String platform;

    @Nullable
    private final String pushNotificationToken;

    @Nullable
    private final String status;

    public /* synthetic */ ClientDto(int i11, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, ClientInfoDto clientInfoDto, m1 m1Var) {
        if (121 != (i11 & 121)) {
            c1.j(i11, 121, ClientDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = str;
        if ((i11 & 2) == 0) {
            this.status = null;
        } else {
            this.status = str2;
        }
        if ((i11 & 4) == 0) {
            this.lastSeen = null;
        } else {
            this.lastSeen = str3;
        }
        this.platform = str4;
        this.integrationId = str5;
        this.pushNotificationToken = str6;
        this.appVersion = str7;
        if ((i11 & 128) == 0) {
            this.displayName = null;
        } else {
            this.displayName = str8;
        }
        if ((i11 & 256) == 0) {
            this.info = null;
        } else {
            this.info = clientInfoDto;
        }
    }

    public static /* synthetic */ ClientDto copy$default(ClientDto clientDto, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, ClientInfoDto clientInfoDto, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = clientDto.id;
        }
        if ((i11 & 2) != 0) {
            str2 = clientDto.status;
        }
        if ((i11 & 4) != 0) {
            str3 = clientDto.lastSeen;
        }
        if ((i11 & 8) != 0) {
            str4 = clientDto.platform;
        }
        if ((i11 & 16) != 0) {
            str5 = clientDto.integrationId;
        }
        if ((i11 & 32) != 0) {
            str6 = clientDto.pushNotificationToken;
        }
        if ((i11 & 64) != 0) {
            str7 = clientDto.appVersion;
        }
        if ((i11 & 128) != 0) {
            str8 = clientDto.displayName;
        }
        if ((i11 & 256) != 0) {
            clientInfoDto = clientDto.info;
        }
        String str9 = str8;
        ClientInfoDto clientInfoDto2 = clientInfoDto;
        String str10 = str6;
        String str11 = str7;
        String str12 = str5;
        String str13 = str3;
        return clientDto.copy(str, str2, str13, str4, str12, str10, str11, str9, clientInfoDto2);
    }

    public static final /* synthetic */ void write$Self$zendesk_conversationkit_conversationkit_android(ClientDto self, b output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.id);
        if (output.C(serialDesc) || self.status != null) {
            output.r(serialDesc, 1, r1.f29848a, self.status);
        }
        if (output.C(serialDesc) || self.lastSeen != null) {
            output.r(serialDesc, 2, r1.f29848a, self.lastSeen);
        }
        output.q(serialDesc, 3, self.platform);
        output.q(serialDesc, 4, self.integrationId);
        r1 r1Var = r1.f29848a;
        output.r(serialDesc, 5, r1Var, self.pushNotificationToken);
        output.r(serialDesc, 6, r1Var, self.appVersion);
        if (output.C(serialDesc) || self.displayName != null) {
            output.r(serialDesc, 7, r1Var, self.displayName);
        }
        if (!output.C(serialDesc) && self.info == null) {
            return;
        }
        output.r(serialDesc, 8, ClientInfoDto$$serializer.INSTANCE, self.info);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLastSeen() {
        return this.lastSeen;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPlatform() {
        return this.platform;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getIntegrationId() {
        return this.integrationId;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getPushNotificationToken() {
        return this.pushNotificationToken;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getAppVersion() {
        return this.appVersion;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final ClientInfoDto getInfo() {
        return this.info;
    }

    @NotNull
    public final ClientDto copy(@NotNull String id2, @Nullable String status, @Nullable String lastSeen, @NotNull String platform, @NotNull String integrationId, @Nullable String pushNotificationToken, @Nullable String appVersion, @Nullable String displayName, @Nullable ClientInfoDto info) {
        id2.getClass();
        platform.getClass();
        integrationId.getClass();
        return new ClientDto(id2, status, lastSeen, platform, integrationId, pushNotificationToken, appVersion, displayName, info);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ClientDto)) {
            return false;
        }
        ClientDto clientDto = (ClientDto) other;
        return Intrinsics.areEqual(this.id, clientDto.id) && Intrinsics.areEqual(this.status, clientDto.status) && Intrinsics.areEqual(this.lastSeen, clientDto.lastSeen) && Intrinsics.areEqual(this.platform, clientDto.platform) && Intrinsics.areEqual(this.integrationId, clientDto.integrationId) && Intrinsics.areEqual(this.pushNotificationToken, clientDto.pushNotificationToken) && Intrinsics.areEqual(this.appVersion, clientDto.appVersion) && Intrinsics.areEqual(this.displayName, clientDto.displayName) && Intrinsics.areEqual(this.info, clientDto.info);
    }

    @Nullable
    public final String getAppVersion() {
        return this.appVersion;
    }

    @Nullable
    public final String getDisplayName() {
        return this.displayName;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final ClientInfoDto getInfo() {
        return this.info;
    }

    @NotNull
    public final String getIntegrationId() {
        return this.integrationId;
    }

    @Nullable
    public final String getLastSeen() {
        return this.lastSeen;
    }

    @NotNull
    public final String getPlatform() {
        return this.platform;
    }

    @Nullable
    public final String getPushNotificationToken() {
        return this.pushNotificationToken;
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.status;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.lastSeen;
        int iB = l1.b(l1.b((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.platform), 31, this.integrationId);
        String str3 = this.pushNotificationToken;
        int iHashCode3 = (iB + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.appVersion;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.displayName;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        ClientInfoDto clientInfoDto = this.info;
        return iHashCode5 + (clientInfoDto != null ? clientInfoDto.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.status;
        String str3 = this.lastSeen;
        String str4 = this.platform;
        String str5 = this.integrationId;
        String str6 = this.pushNotificationToken;
        String str7 = this.appVersion;
        String str8 = this.displayName;
        ClientInfoDto clientInfoDto = this.info;
        StringBuilder sbT = f.t("ClientDto(id=", str, ", status=", str2, ", lastSeen=");
        s.A(sbT, str3, ", platform=", str4, ", integrationId=");
        s.A(sbT, str5, ", pushNotificationToken=", str6, ", appVersion=");
        s.A(sbT, str7, ", displayName=", str8, ", info=");
        sbT.append(clientInfoDto);
        sbT.append(")");
        return sbT.toString();
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/conversationkit/android/internal/rest/model/ClientDto$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/conversationkit/android/internal/rest/model/ClientDto;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return ClientDto$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ClientDto(@NotNull String str, @Nullable String str2, @Nullable String str3, @NotNull String str4, @NotNull String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable ClientInfoDto clientInfoDto) {
        a0.C(str, str4, str5);
        this.id = str;
        this.status = str2;
        this.lastSeen = str3;
        this.platform = str4;
        this.integrationId = str5;
        this.pushNotificationToken = str6;
        this.appVersion = str7;
        this.displayName = str8;
        this.info = clientInfoDto;
    }

    public /* synthetic */ ClientDto(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, ClientInfoDto clientInfoDto, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, str4, str5, str6, str7, (i11 & 128) != 0 ? null : str8, (i11 & 256) != 0 ? null : clientInfoDto);
    }
}
