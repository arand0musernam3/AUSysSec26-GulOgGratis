package zendesk.messaging.android.push.internal;

import e0.f;
import i90.g;
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
import m90.q0;
import m90.r1;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@h
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0016\b\u0081\b\u0018\u0000 G2\u00020\u0001:\u0002HGBk\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011B\u0087\u0001\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0010\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0018J\u0010\u0010\u001d\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0018J\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0018J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u0018J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u0018J\u0012\u0010#\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b#\u0010$J\u008a\u0001\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u0018J\u0010\u0010(\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-J'\u00106\u001a\u0002032\u0006\u0010.\u001a\u00020\u00002\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u000201H\u0001¢\u0006\u0004\b4\u00105R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00107\u0012\u0004\b9\u0010:\u001a\u0004\b8\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00107\u001a\u0004\b;\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00107\u001a\u0004\b<\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00107\u001a\u0004\b=\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00107\u001a\u0004\b>\u0010\u0018R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010?\u001a\u0004\b@\u0010\u001eR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u00107\u001a\u0004\bA\u0010\u0018R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00107\u001a\u0004\bB\u0010\u0018R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u00107\u001a\u0004\bC\u0010\u0018R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u00107\u001a\u0004\bD\u0010\u0018R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010E\u001a\u0004\bF\u0010$¨\u0006I"}, d2 = {"Lzendesk/messaging/android/push/internal/MessagePayload;", "", "", "id", "authorId", "role", "name", "avatarUrl", "", "received", "type", TextBundle.TEXT_ENTRY, "mediaUrl", "mediaType", "", "mediaSize", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lm90/m1;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "()D", "component7", "component8", "component9", "component10", "component11", "()Ljava/lang/Long;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lzendesk/messaging/android/push/internal/MessagePayload;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$zendesk_messaging_messaging_android", "(Lzendesk/messaging/android/push/internal/MessagePayload;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "getAuthorId", "getRole", "getName", "getAvatarUrl", "D", "getReceived", "getType", "getText", "getMediaUrl", "getMediaType", "Ljava/lang/Long;", "getMediaSize", "Companion", "$serializer", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class MessagePayload {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String authorId;

    @Nullable
    private final String avatarUrl;

    @NotNull
    private final String id;

    @Nullable
    private final Long mediaSize;

    @Nullable
    private final String mediaType;

    @Nullable
    private final String mediaUrl;

    @Nullable
    private final String name;
    private final double received;

    @NotNull
    private final String role;

    @Nullable
    private final String text;

    @NotNull
    private final String type;

    public /* synthetic */ MessagePayload(int i11, String str, String str2, String str3, String str4, String str5, double d3, String str6, String str7, String str8, String str9, Long l, m1 m1Var) {
        if (2047 != (i11 & 2047)) {
            c1.j(i11, 2047, MessagePayload$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = str;
        this.authorId = str2;
        this.role = str3;
        this.name = str4;
        this.avatarUrl = str5;
        this.received = d3;
        this.type = str6;
        this.text = str7;
        this.mediaUrl = str8;
        this.mediaType = str9;
        this.mediaSize = l;
    }

    public static /* synthetic */ MessagePayload copy$default(MessagePayload messagePayload, String str, String str2, String str3, String str4, String str5, double d3, String str6, String str7, String str8, String str9, Long l, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = messagePayload.id;
        }
        if ((i11 & 2) != 0) {
            str2 = messagePayload.authorId;
        }
        if ((i11 & 4) != 0) {
            str3 = messagePayload.role;
        }
        if ((i11 & 8) != 0) {
            str4 = messagePayload.name;
        }
        if ((i11 & 16) != 0) {
            str5 = messagePayload.avatarUrl;
        }
        if ((i11 & 32) != 0) {
            d3 = messagePayload.received;
        }
        if ((i11 & 64) != 0) {
            str6 = messagePayload.type;
        }
        if ((i11 & 128) != 0) {
            str7 = messagePayload.text;
        }
        if ((i11 & 256) != 0) {
            str8 = messagePayload.mediaUrl;
        }
        if ((i11 & 512) != 0) {
            str9 = messagePayload.mediaType;
        }
        if ((i11 & 1024) != 0) {
            l = messagePayload.mediaSize;
        }
        Long l7 = l;
        String str10 = str8;
        String str11 = str6;
        double d11 = d3;
        String str12 = str4;
        String str13 = str5;
        String str14 = str3;
        return messagePayload.copy(str, str2, str14, str12, str13, d11, str11, str7, str10, str9, l7);
    }

    public static final /* synthetic */ void write$Self$zendesk_messaging_messaging_android(MessagePayload self, b output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.id);
        output.q(serialDesc, 1, self.authorId);
        output.q(serialDesc, 2, self.role);
        r1 r1Var = r1.f29848a;
        output.r(serialDesc, 3, r1Var, self.name);
        output.r(serialDesc, 4, r1Var, self.avatarUrl);
        output.z(serialDesc, 5, self.received);
        output.q(serialDesc, 6, self.type);
        output.r(serialDesc, 7, r1Var, self.text);
        output.r(serialDesc, 8, r1Var, self.mediaUrl);
        output.r(serialDesc, 9, r1Var, self.mediaType);
        output.r(serialDesc, 10, q0.f29842a, self.mediaSize);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getMediaType() {
        return this.mediaType;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Long getMediaSize() {
        return this.mediaSize;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAuthorId() {
        return this.authorId;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRole() {
        return this.role;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final double getReceived() {
        return this.received;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getMediaUrl() {
        return this.mediaUrl;
    }

    @NotNull
    public final MessagePayload copy(@NotNull String id2, @NotNull String authorId, @NotNull String role, @Nullable String name, @Nullable String avatarUrl, double received, @NotNull String type, @Nullable String text, @Nullable String mediaUrl, @Nullable String mediaType, @Nullable Long mediaSize) {
        id2.getClass();
        authorId.getClass();
        role.getClass();
        type.getClass();
        return new MessagePayload(id2, authorId, role, name, avatarUrl, received, type, text, mediaUrl, mediaType, mediaSize);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessagePayload)) {
            return false;
        }
        MessagePayload messagePayload = (MessagePayload) other;
        return Intrinsics.areEqual(this.id, messagePayload.id) && Intrinsics.areEqual(this.authorId, messagePayload.authorId) && Intrinsics.areEqual(this.role, messagePayload.role) && Intrinsics.areEqual(this.name, messagePayload.name) && Intrinsics.areEqual(this.avatarUrl, messagePayload.avatarUrl) && Double.compare(this.received, messagePayload.received) == 0 && Intrinsics.areEqual(this.type, messagePayload.type) && Intrinsics.areEqual(this.text, messagePayload.text) && Intrinsics.areEqual(this.mediaUrl, messagePayload.mediaUrl) && Intrinsics.areEqual(this.mediaType, messagePayload.mediaType) && Intrinsics.areEqual(this.mediaSize, messagePayload.mediaSize);
    }

    @NotNull
    public final String getAuthorId() {
        return this.authorId;
    }

    @Nullable
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final Long getMediaSize() {
        return this.mediaSize;
    }

    @Nullable
    public final String getMediaType() {
        return this.mediaType;
    }

    @Nullable
    public final String getMediaUrl() {
        return this.mediaUrl;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public final double getReceived() {
        return this.received;
    }

    @NotNull
    public final String getRole() {
        return this.role;
    }

    @Nullable
    public final String getText() {
        return this.text;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int iB = l1.b(l1.b(this.id.hashCode() * 31, 31, this.authorId), 31, this.role);
        String str = this.name;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.avatarUrl;
        int iB2 = l1.b(s.b(this.received, (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31, this.type);
        String str3 = this.text;
        int iHashCode2 = (iB2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.mediaUrl;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.mediaType;
        int iHashCode4 = (iHashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Long l = this.mediaSize;
        return iHashCode4 + (l != null ? l.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.authorId;
        String str3 = this.role;
        String str4 = this.name;
        String str5 = this.avatarUrl;
        double d3 = this.received;
        String str6 = this.type;
        String str7 = this.text;
        String str8 = this.mediaUrl;
        String str9 = this.mediaType;
        Long l = this.mediaSize;
        StringBuilder sbT = f.t("MessagePayload(id=", str, ", authorId=", str2, ", role=");
        s.A(sbT, str3, ", name=", str4, ", avatarUrl=");
        sbT.append(str5);
        sbT.append(", received=");
        sbT.append(d3);
        s.A(sbT, ", type=", str6, ", text=", str7);
        s.A(sbT, ", mediaUrl=", str8, ", mediaType=", str9);
        sbT.append(", mediaSize=");
        sbT.append(l);
        sbT.append(")");
        return sbT.toString();
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/messaging/android/push/internal/MessagePayload$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/messaging/android/push/internal/MessagePayload;", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return MessagePayload$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public MessagePayload(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable String str4, @Nullable String str5, double d3, @NotNull String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable Long l) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str6.getClass();
        this.id = str;
        this.authorId = str2;
        this.role = str3;
        this.name = str4;
        this.avatarUrl = str5;
        this.received = d3;
        this.type = str6;
        this.text = str7;
        this.mediaUrl = str8;
        this.mediaType = str9;
        this.mediaSize = l;
    }

    @g("_id")
    public static /* synthetic */ void getId$annotations() {
    }
}
