package zendesk.conversationkit.android.internal.rest.model;

import e0.f;
import i90.h;
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
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@h
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u0000 -2\u00020\u0001:\u0002.-B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019J:\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b,\u0010\u0019¨\u0006/"}, d2 = {"Lzendesk/conversationkit/android/internal/rest/model/AuthorDto;", "", "", "appUserId", "role", "Lzendesk/conversationkit/android/internal/rest/model/ClientDto;", "client", "sessionId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lzendesk/conversationkit/android/internal/rest/model/ClientDto;Ljava/lang/String;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lzendesk/conversationkit/android/internal/rest/model/ClientDto;Ljava/lang/String;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$zendesk_conversationkit_conversationkit_android", "(Lzendesk/conversationkit/android/internal/rest/model/AuthorDto;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lzendesk/conversationkit/android/internal/rest/model/ClientDto;", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Lzendesk/conversationkit/android/internal/rest/model/ClientDto;Ljava/lang/String;)Lzendesk/conversationkit/android/internal/rest/model/AuthorDto;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAppUserId", "getRole", "Lzendesk/conversationkit/android/internal/rest/model/ClientDto;", "getClient", "getSessionId", "Companion", "$serializer", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class AuthorDto {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String appUserId;

    @NotNull
    private final ClientDto client;

    @NotNull
    private final String role;

    @Nullable
    private final String sessionId;

    public /* synthetic */ AuthorDto(int i11, String str, String str2, ClientDto clientDto, String str3, m1 m1Var) {
        if (7 != (i11 & 7)) {
            c1.j(i11, 7, AuthorDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.appUserId = str;
        this.role = str2;
        this.client = clientDto;
        if ((i11 & 8) == 0) {
            this.sessionId = null;
        } else {
            this.sessionId = str3;
        }
    }

    public static /* synthetic */ AuthorDto copy$default(AuthorDto authorDto, String str, String str2, ClientDto clientDto, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = authorDto.appUserId;
        }
        if ((i11 & 2) != 0) {
            str2 = authorDto.role;
        }
        if ((i11 & 4) != 0) {
            clientDto = authorDto.client;
        }
        if ((i11 & 8) != 0) {
            str3 = authorDto.sessionId;
        }
        return authorDto.copy(str, str2, clientDto, str3);
    }

    public static final /* synthetic */ void write$Self$zendesk_conversationkit_conversationkit_android(AuthorDto self, b output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.appUserId);
        output.q(serialDesc, 1, self.role);
        output.i(serialDesc, 2, ClientDto$$serializer.INSTANCE, self.client);
        if (!output.C(serialDesc) && self.sessionId == null) {
            return;
        }
        output.r(serialDesc, 3, r1.f29848a, self.sessionId);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAppUserId() {
        return this.appUserId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRole() {
        return this.role;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ClientDto getClient() {
        return this.client;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    @NotNull
    public final AuthorDto copy(@NotNull String appUserId, @NotNull String role, @NotNull ClientDto client, @Nullable String sessionId) {
        appUserId.getClass();
        role.getClass();
        client.getClass();
        return new AuthorDto(appUserId, role, client, sessionId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AuthorDto)) {
            return false;
        }
        AuthorDto authorDto = (AuthorDto) other;
        return Intrinsics.areEqual(this.appUserId, authorDto.appUserId) && Intrinsics.areEqual(this.role, authorDto.role) && Intrinsics.areEqual(this.client, authorDto.client) && Intrinsics.areEqual(this.sessionId, authorDto.sessionId);
    }

    @NotNull
    public final String getAppUserId() {
        return this.appUserId;
    }

    @NotNull
    public final ClientDto getClient() {
        return this.client;
    }

    @NotNull
    public final String getRole() {
        return this.role;
    }

    @Nullable
    public final String getSessionId() {
        return this.sessionId;
    }

    public int hashCode() {
        int iHashCode = (this.client.hashCode() + l1.b(this.appUserId.hashCode() * 31, 31, this.role)) * 31;
        String str = this.sessionId;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.appUserId;
        String str2 = this.role;
        ClientDto clientDto = this.client;
        String str3 = this.sessionId;
        StringBuilder sbT = f.t("AuthorDto(appUserId=", str, ", role=", str2, ", client=");
        sbT.append(clientDto);
        sbT.append(", sessionId=");
        sbT.append(str3);
        sbT.append(")");
        return sbT.toString();
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/conversationkit/android/internal/rest/model/AuthorDto$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/conversationkit/android/internal/rest/model/AuthorDto;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return AuthorDto$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public AuthorDto(@NotNull String str, @NotNull String str2, @NotNull ClientDto clientDto, @Nullable String str3) {
        str.getClass();
        str2.getClass();
        clientDto.getClass();
        this.appUserId = str;
        this.role = str2;
        this.client = clientDto;
        this.sessionId = str3;
    }

    public /* synthetic */ AuthorDto(String str, String str2, ClientDto clientDto, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, clientDto, (i11 & 8) != 0 ? null : str3);
    }
}
