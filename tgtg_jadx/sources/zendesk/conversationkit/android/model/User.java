package zendesk.conversationkit.android.model;

import db0.c;
import e0.f;
import i90.h;
import j4.s;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.c1;
import m90.d;
import m90.m1;
import m90.r1;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.j;
import u70.l;
import u70.m;
import zendesk.conversationkit.android.model.AuthenticationType;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@h
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0018\b\u0087\b\u0018\u0000 V2\u00020\u0001:\u0002WVB\u008b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016B¡\u0001\b\u0010\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u0015\u0010\u001bJ\r\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010 J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010 J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010 J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010 J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010 J\u0016\u0010'\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010.\u001a\u0004\u0018\u00010\u0002HÀ\u0003¢\u0006\u0004\b-\u0010 J\u0012\u00100\u001a\u0004\u0018\u00010\u0002HÀ\u0003¢\u0006\u0004\b/\u0010 J\u0010\u00101\u001a\u00020\u0013HÆ\u0003¢\u0006\u0004\b1\u00102J¨\u0001\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u0013HÆ\u0001¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b5\u0010 J\u0010\u00106\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b6\u00107J\u001a\u00109\u001a\u00020\u00132\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b9\u0010:J'\u0010C\u001a\u00020@2\u0006\u0010;\u001a\u00020\u00002\u0006\u0010=\u001a\u00020<2\u0006\u0010?\u001a\u00020>H\u0001¢\u0006\u0004\bA\u0010BR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010D\u001a\u0004\bE\u0010 R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010D\u001a\u0004\bF\u0010 R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010D\u001a\u0004\bG\u0010 R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010D\u001a\u0004\bH\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010D\u001a\u0004\bI\u0010 R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010D\u001a\u0004\bJ\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010D\u001a\u0004\bK\u0010 R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\f\u0010L\u001a\u0004\bM\u0010(R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010N\u001a\u0004\bO\u0010*R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010P\u001a\u0004\bQ\u0010,R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010D\u001a\u0004\bR\u0010 R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010D\u001a\u0004\bS\u0010 R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010T\u001a\u0004\bU\u00102¨\u0006X"}, d2 = {"Lzendesk/conversationkit/android/model/User;", "", "", "id", "externalId", "givenName", "surname", "email", "locale", "signedUpAt", "", "Lzendesk/conversationkit/android/model/Conversation;", "conversations", "Lzendesk/conversationkit/android/model/RealtimeSettings;", "realtimeSettings", "Lzendesk/conversationkit/android/model/TypingSettings;", "typingSettings", "sessionToken", "jwt", "", "hasMore", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lzendesk/conversationkit/android/model/RealtimeSettings;Lzendesk/conversationkit/android/model/TypingSettings;Ljava/lang/String;Ljava/lang/String;Z)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lzendesk/conversationkit/android/model/RealtimeSettings;Lzendesk/conversationkit/android/model/TypingSettings;Ljava/lang/String;Ljava/lang/String;ZLm90/m1;)V", "Lzendesk/conversationkit/android/model/AuthenticationType;", "getAuthenticationType", "()Lzendesk/conversationkit/android/model/AuthenticationType;", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "()Ljava/util/List;", "component9", "()Lzendesk/conversationkit/android/model/RealtimeSettings;", "component10", "()Lzendesk/conversationkit/android/model/TypingSettings;", "component11$zendesk_conversationkit_conversationkit_android", "component11", "component12$zendesk_conversationkit_conversationkit_android", "component12", "component13", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lzendesk/conversationkit/android/model/RealtimeSettings;Lzendesk/conversationkit/android/model/TypingSettings;Ljava/lang/String;Ljava/lang/String;Z)Lzendesk/conversationkit/android/model/User;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$zendesk_conversationkit_conversationkit_android", "(Lzendesk/conversationkit/android/model/User;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getId", "getExternalId", "getGivenName", "getSurname", "getEmail", "getLocale", "getSignedUpAt", "Ljava/util/List;", "getConversations", "Lzendesk/conversationkit/android/model/RealtimeSettings;", "getRealtimeSettings", "Lzendesk/conversationkit/android/model/TypingSettings;", "getTypingSettings", "getSessionToken$zendesk_conversationkit_conversationkit_android", "getJwt$zendesk_conversationkit_conversationkit_android", "Z", "getHasMore", "Companion", "$serializer", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class User {

    @NotNull
    private final List<Conversation> conversations;

    @Nullable
    private final String email;

    @Nullable
    private final String externalId;

    @Nullable
    private final String givenName;
    private final boolean hasMore;

    @NotNull
    private final String id;

    @Nullable
    private final String jwt;

    @Nullable
    private final String locale;

    @NotNull
    private final RealtimeSettings realtimeSettings;

    @Nullable
    private final String sessionToken;

    @Nullable
    private final String signedUpAt;

    @Nullable
    private final String surname;

    @NotNull
    private final TypingSettings typingSettings;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final j[] $childSerializers = {null, null, null, null, null, null, null, l.a(m.PUBLICATION, new c(9)), null, null, null, null, null};

    public /* synthetic */ User(int i11, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, RealtimeSettings realtimeSettings, TypingSettings typingSettings, String str8, String str9, boolean z11, m1 m1Var) {
        if (1023 != (i11 & 1023)) {
            c1.j(i11, 1023, User$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = str;
        this.externalId = str2;
        this.givenName = str3;
        this.surname = str4;
        this.email = str5;
        this.locale = str6;
        this.signedUpAt = str7;
        this.conversations = list;
        this.realtimeSettings = realtimeSettings;
        this.typingSettings = typingSettings;
        if ((i11 & 1024) == 0) {
            this.sessionToken = null;
        } else {
            this.sessionToken = str8;
        }
        if ((i11 & NewHope.SENDB_BYTES) == 0) {
            this.jwt = null;
        } else {
            this.jwt = str9;
        }
        this.hasMore = (i11 & 4096) == 0 ? false : z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new d(Conversation$$serializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ User copy$default(User user, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, RealtimeSettings realtimeSettings, TypingSettings typingSettings, String str8, String str9, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = user.id;
        }
        return user.copy(str, (i11 & 2) != 0 ? user.externalId : str2, (i11 & 4) != 0 ? user.givenName : str3, (i11 & 8) != 0 ? user.surname : str4, (i11 & 16) != 0 ? user.email : str5, (i11 & 32) != 0 ? user.locale : str6, (i11 & 64) != 0 ? user.signedUpAt : str7, (i11 & 128) != 0 ? user.conversations : list, (i11 & 256) != 0 ? user.realtimeSettings : realtimeSettings, (i11 & 512) != 0 ? user.typingSettings : typingSettings, (i11 & 1024) != 0 ? user.sessionToken : str8, (i11 & NewHope.SENDB_BYTES) != 0 ? user.jwt : str9, (i11 & 4096) != 0 ? user.hasMore : z11);
    }

    public static final /* synthetic */ void write$Self$zendesk_conversationkit_conversationkit_android(User self, b output, SerialDescriptor serialDesc) {
        j[] jVarArr = $childSerializers;
        output.q(serialDesc, 0, self.id);
        r1 r1Var = r1.f29848a;
        output.r(serialDesc, 1, r1Var, self.externalId);
        output.r(serialDesc, 2, r1Var, self.givenName);
        output.r(serialDesc, 3, r1Var, self.surname);
        output.r(serialDesc, 4, r1Var, self.email);
        output.r(serialDesc, 5, r1Var, self.locale);
        output.r(serialDesc, 6, r1Var, self.signedUpAt);
        output.i(serialDesc, 7, (KSerializer) jVarArr[7].getValue(), self.conversations);
        output.i(serialDesc, 8, RealtimeSettings$$serializer.INSTANCE, self.realtimeSettings);
        output.i(serialDesc, 9, TypingSettings$$serializer.INSTANCE, self.typingSettings);
        if (output.C(serialDesc) || self.sessionToken != null) {
            output.r(serialDesc, 10, r1Var, self.sessionToken);
        }
        if (output.C(serialDesc) || self.jwt != null) {
            output.r(serialDesc, 11, r1Var, self.jwt);
        }
        if (output.C(serialDesc) || self.hasMore) {
            output.p(serialDesc, 12, self.hasMore);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final TypingSettings getTypingSettings() {
        return this.typingSettings;
    }

    @Nullable
    /* JADX INFO: renamed from: component11$zendesk_conversationkit_conversationkit_android, reason: from getter */
    public final String getSessionToken() {
        return this.sessionToken;
    }

    @Nullable
    /* JADX INFO: renamed from: component12$zendesk_conversationkit_conversationkit_android, reason: from getter */
    public final String getJwt() {
        return this.jwt;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final boolean getHasMore() {
        return this.hasMore;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getExternalId() {
        return this.externalId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getGivenName() {
        return this.givenName;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSurname() {
        return this.surname;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getLocale() {
        return this.locale;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getSignedUpAt() {
        return this.signedUpAt;
    }

    @NotNull
    public final List<Conversation> component8() {
        return this.conversations;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final RealtimeSettings getRealtimeSettings() {
        return this.realtimeSettings;
    }

    @NotNull
    public final User copy(@NotNull String id2, @Nullable String externalId, @Nullable String givenName, @Nullable String surname, @Nullable String email, @Nullable String locale, @Nullable String signedUpAt, @NotNull List<Conversation> conversations, @NotNull RealtimeSettings realtimeSettings, @NotNull TypingSettings typingSettings, @Nullable String sessionToken, @Nullable String jwt, boolean hasMore) {
        id2.getClass();
        conversations.getClass();
        realtimeSettings.getClass();
        typingSettings.getClass();
        return new User(id2, externalId, givenName, surname, email, locale, signedUpAt, conversations, realtimeSettings, typingSettings, sessionToken, jwt, hasMore);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof User)) {
            return false;
        }
        User user = (User) other;
        return Intrinsics.areEqual(this.id, user.id) && Intrinsics.areEqual(this.externalId, user.externalId) && Intrinsics.areEqual(this.givenName, user.givenName) && Intrinsics.areEqual(this.surname, user.surname) && Intrinsics.areEqual(this.email, user.email) && Intrinsics.areEqual(this.locale, user.locale) && Intrinsics.areEqual(this.signedUpAt, user.signedUpAt) && Intrinsics.areEqual(this.conversations, user.conversations) && Intrinsics.areEqual(this.realtimeSettings, user.realtimeSettings) && Intrinsics.areEqual(this.typingSettings, user.typingSettings) && Intrinsics.areEqual(this.sessionToken, user.sessionToken) && Intrinsics.areEqual(this.jwt, user.jwt) && this.hasMore == user.hasMore;
    }

    @NotNull
    public final AuthenticationType getAuthenticationType() {
        String str = this.jwt;
        if (str != null) {
            return new AuthenticationType.Jwt(str);
        }
        String str2 = this.sessionToken;
        return str2 != null ? new AuthenticationType.SessionToken(str2) : AuthenticationType.Unauthenticated.INSTANCE;
    }

    @NotNull
    public final List<Conversation> getConversations() {
        return this.conversations;
    }

    @Nullable
    public final String getEmail() {
        return this.email;
    }

    @Nullable
    public final String getExternalId() {
        return this.externalId;
    }

    @Nullable
    public final String getGivenName() {
        return this.givenName;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getJwt$zendesk_conversationkit_conversationkit_android() {
        return this.jwt;
    }

    @Nullable
    public final String getLocale() {
        return this.locale;
    }

    @NotNull
    public final RealtimeSettings getRealtimeSettings() {
        return this.realtimeSettings;
    }

    @Nullable
    public final String getSessionToken$zendesk_conversationkit_conversationkit_android() {
        return this.sessionToken;
    }

    @Nullable
    public final String getSignedUpAt() {
        return this.signedUpAt;
    }

    @Nullable
    public final String getSurname() {
        return this.surname;
    }

    @NotNull
    public final TypingSettings getTypingSettings() {
        return this.typingSettings;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.externalId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.givenName;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.surname;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.email;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.locale;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.signedUpAt;
        int iHashCode7 = (this.typingSettings.hashCode() + ((this.realtimeSettings.hashCode() + f.c(this.conversations, (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31, 31)) * 31)) * 31;
        String str7 = this.sessionToken;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.jwt;
        return Boolean.hashCode(this.hasMore) + ((iHashCode8 + (str8 != null ? str8.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.externalId;
        String str3 = this.givenName;
        String str4 = this.surname;
        String str5 = this.email;
        String str6 = this.locale;
        String str7 = this.signedUpAt;
        List<Conversation> list = this.conversations;
        RealtimeSettings realtimeSettings = this.realtimeSettings;
        TypingSettings typingSettings = this.typingSettings;
        String str8 = this.sessionToken;
        String str9 = this.jwt;
        boolean z11 = this.hasMore;
        StringBuilder sbT = f.t("User(id=", str, ", externalId=", str2, ", givenName=");
        s.A(sbT, str3, ", surname=", str4, ", email=");
        s.A(sbT, str5, ", locale=", str6, ", signedUpAt=");
        sbT.append(str7);
        sbT.append(", conversations=");
        sbT.append(list);
        sbT.append(", realtimeSettings=");
        sbT.append(realtimeSettings);
        sbT.append(", typingSettings=");
        sbT.append(typingSettings);
        sbT.append(", sessionToken=");
        s.A(sbT, str8, ", jwt=", str9, ", hasMore=");
        return s.o(sbT, z11, ")");
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/conversationkit/android/model/User$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/conversationkit/android/model/User;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return User$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public User(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @NotNull List<Conversation> list, @NotNull RealtimeSettings realtimeSettings, @NotNull TypingSettings typingSettings, @Nullable String str8, @Nullable String str9, boolean z11) {
        str.getClass();
        list.getClass();
        realtimeSettings.getClass();
        typingSettings.getClass();
        this.id = str;
        this.externalId = str2;
        this.givenName = str3;
        this.surname = str4;
        this.email = str5;
        this.locale = str6;
        this.signedUpAt = str7;
        this.conversations = list;
        this.realtimeSettings = realtimeSettings;
        this.typingSettings = typingSettings;
        this.sessionToken = str8;
        this.jwt = str9;
        this.hasMore = z11;
    }

    public /* synthetic */ User(String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, RealtimeSettings realtimeSettings, TypingSettings typingSettings, String str8, String str9, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, str7, list, realtimeSettings, typingSettings, (i11 & 1024) != 0 ? null : str8, (i11 & NewHope.SENDB_BYTES) != 0 ? null : str9, (i11 & 4096) != 0 ? false : z11);
    }
}
