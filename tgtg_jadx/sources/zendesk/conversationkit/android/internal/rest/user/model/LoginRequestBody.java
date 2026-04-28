package zendesk.conversationkit.android.internal.rest.user.model;

import e0.f;
import i90.g;
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
import zendesk.conversationkit.android.internal.rest.model.ClientDto;
import zendesk.conversationkit.android.internal.rest.model.ClientDto$$serializer;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@h
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0081\b\u0018\u0000 22\u00020\u0001:\u000232B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019J<\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010'\u0012\u0004\b)\u0010*\u001a\u0004\b(\u0010\u0019R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010+\u0012\u0004\b-\u0010*\u001a\u0004\b,\u0010\u001bR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010'\u0012\u0004\b/\u0010*\u001a\u0004\b.\u0010\u0019R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010'\u0012\u0004\b1\u0010*\u001a\u0004\b0\u0010\u0019¨\u00064"}, d2 = {"Lzendesk/conversationkit/android/internal/rest/user/model/LoginRequestBody;", "", "", "userId", "Lzendesk/conversationkit/android/internal/rest/model/ClientDto;", "client", "appUserId", "sessionToken", "<init>", "(Ljava/lang/String;Lzendesk/conversationkit/android/internal/rest/model/ClientDto;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Lzendesk/conversationkit/android/internal/rest/model/ClientDto;Ljava/lang/String;Ljava/lang/String;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$zendesk_conversationkit_conversationkit_android", "(Lzendesk/conversationkit/android/internal/rest/user/model/LoginRequestBody;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lzendesk/conversationkit/android/internal/rest/model/ClientDto;", "component3", "component4", "copy", "(Ljava/lang/String;Lzendesk/conversationkit/android/internal/rest/model/ClientDto;Ljava/lang/String;Ljava/lang/String;)Lzendesk/conversationkit/android/internal/rest/user/model/LoginRequestBody;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUserId", "getUserId$annotations", "()V", "Lzendesk/conversationkit/android/internal/rest/model/ClientDto;", "getClient", "getClient$annotations", "getAppUserId", "getAppUserId$annotations", "getSessionToken", "getSessionToken$annotations", "Companion", "$serializer", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class LoginRequestBody {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final String appUserId;

    @NotNull
    private final ClientDto client;

    @Nullable
    private final String sessionToken;

    @NotNull
    private final String userId;

    public /* synthetic */ LoginRequestBody(int i11, String str, ClientDto clientDto, String str2, String str3, m1 m1Var) {
        if (3 != (i11 & 3)) {
            c1.j(i11, 3, LoginRequestBody$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.userId = str;
        this.client = clientDto;
        if ((i11 & 4) == 0) {
            this.appUserId = null;
        } else {
            this.appUserId = str2;
        }
        if ((i11 & 8) == 0) {
            this.sessionToken = null;
        } else {
            this.sessionToken = str3;
        }
    }

    public static /* synthetic */ LoginRequestBody copy$default(LoginRequestBody loginRequestBody, String str, ClientDto clientDto, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = loginRequestBody.userId;
        }
        if ((i11 & 2) != 0) {
            clientDto = loginRequestBody.client;
        }
        if ((i11 & 4) != 0) {
            str2 = loginRequestBody.appUserId;
        }
        if ((i11 & 8) != 0) {
            str3 = loginRequestBody.sessionToken;
        }
        return loginRequestBody.copy(str, clientDto, str2, str3);
    }

    public static final /* synthetic */ void write$Self$zendesk_conversationkit_conversationkit_android(LoginRequestBody self, b output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.userId);
        output.i(serialDesc, 1, ClientDto$$serializer.INSTANCE, self.client);
        if (output.C(serialDesc) || self.appUserId != null) {
            output.r(serialDesc, 2, r1.f29848a, self.appUserId);
        }
        if (!output.C(serialDesc) && self.sessionToken == null) {
            return;
        }
        output.r(serialDesc, 3, r1.f29848a, self.sessionToken);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ClientDto getClient() {
        return this.client;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAppUserId() {
        return this.appUserId;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSessionToken() {
        return this.sessionToken;
    }

    @NotNull
    public final LoginRequestBody copy(@NotNull String userId, @NotNull ClientDto client, @Nullable String appUserId, @Nullable String sessionToken) {
        userId.getClass();
        client.getClass();
        return new LoginRequestBody(userId, client, appUserId, sessionToken);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoginRequestBody)) {
            return false;
        }
        LoginRequestBody loginRequestBody = (LoginRequestBody) other;
        return Intrinsics.areEqual(this.userId, loginRequestBody.userId) && Intrinsics.areEqual(this.client, loginRequestBody.client) && Intrinsics.areEqual(this.appUserId, loginRequestBody.appUserId) && Intrinsics.areEqual(this.sessionToken, loginRequestBody.sessionToken);
    }

    @Nullable
    public final String getAppUserId() {
        return this.appUserId;
    }

    @NotNull
    public final ClientDto getClient() {
        return this.client;
    }

    @Nullable
    public final String getSessionToken() {
        return this.sessionToken;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int iHashCode = (this.client.hashCode() + (this.userId.hashCode() * 31)) * 31;
        String str = this.appUserId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.sessionToken;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.userId;
        ClientDto clientDto = this.client;
        String str2 = this.appUserId;
        String str3 = this.sessionToken;
        StringBuilder sb2 = new StringBuilder("LoginRequestBody(userId=");
        sb2.append(str);
        sb2.append(", client=");
        sb2.append(clientDto);
        sb2.append(", appUserId=");
        return f.o(sb2, str2, ", sessionToken=", str3, ")");
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/conversationkit/android/internal/rest/user/model/LoginRequestBody$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/conversationkit/android/internal/rest/user/model/LoginRequestBody;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return LoginRequestBody$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @g("appUserId")
    public static /* synthetic */ void getAppUserId$annotations() {
    }

    @g("client")
    public static /* synthetic */ void getClient$annotations() {
    }

    @g("sessionToken")
    public static /* synthetic */ void getSessionToken$annotations() {
    }

    @g("userId")
    public static /* synthetic */ void getUserId$annotations() {
    }

    public LoginRequestBody(@NotNull String str, @NotNull ClientDto clientDto, @Nullable String str2, @Nullable String str3) {
        str.getClass();
        clientDto.getClass();
        this.userId = str;
        this.client = clientDto;
        this.appUserId = str2;
        this.sessionToken = str3;
    }

    public /* synthetic */ LoginRequestBody(String str, ClientDto clientDto, String str2, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, clientDto, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : str3);
    }
}
