package zendesk.conversationkit.android.model;

import db0.a;
import i90.h;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.o0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.c1;
import m90.f0;
import m90.m1;
import m90.r1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.j;
import u70.l;
import u70.m;
import zendesk.conversationkit.android.model.MessageStatus;
import zendesk.core.android.internal.DateKtxKt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@h
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 ^2\u00020\u0001:\u0002^_Bs\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0014\u0010\u0015B\u0093\u0001\b\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0014\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0002H\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\u001c2\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\"J\u0010\u0010(\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b.\u0010-J\u0010\u0010/\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b1\u00102J\u001e\u00103\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b3\u00104J\u0012\u00105\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b5\u0010\"J\u0010\u00106\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b6\u0010\"J\u0012\u00107\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b7\u0010\"J\u0092\u0001\u00108\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b8\u00109J'\u0010B\u001a\u00020?2\u0006\u0010:\u001a\u00020\u00002\u0006\u0010<\u001a\u00020;2\u0006\u0010>\u001a\u00020=H\u0001¢\u0006\u0004\b@\u0010AR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010C\u001a\u0004\bD\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010E\u001a\u0004\bF\u0010)R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010G\u001a\u0004\bH\u0010+R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010I\u0012\u0004\bK\u0010L\u001a\u0004\bJ\u0010-R \u0010\n\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010I\u0012\u0004\bN\u0010L\u001a\u0004\bM\u0010-R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010O\u001a\u0004\bP\u00100R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010Q\u001a\u0004\bR\u00102R%\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010S\u001a\u0004\bT\u00104R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010C\u001a\u0004\bU\u0010\"R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010C\u001a\u0004\bV\u0010\"R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010C\u001a\u0004\bW\u0010\"R\u0014\u0010[\u001a\u00020X8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bY\u0010ZR\u0011\u0010]\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\\\u0010-¨\u0006`"}, d2 = {"Lzendesk/conversationkit/android/model/Message;", "", "", "id", "Lzendesk/conversationkit/android/model/Author;", "author", "Lzendesk/conversationkit/android/model/MessageStatus;", "status", "Ljava/util/Date;", "created", "received", "", "beforeTimestamp", "Lzendesk/conversationkit/android/model/MessageContent;", "content", "", "metadata", "sourceId", "localId", "payload", "<init>", "(Ljava/lang/String;Lzendesk/conversationkit/android/model/Author;Lzendesk/conversationkit/android/model/MessageStatus;Ljava/util/Date;Ljava/util/Date;DLzendesk/conversationkit/android/model/MessageContent;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Lzendesk/conversationkit/android/model/Author;Lzendesk/conversationkit/android/model/MessageStatus;Ljava/util/Date;Ljava/util/Date;DLzendesk/conversationkit/android/model/MessageContent;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm90/m1;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Lzendesk/conversationkit/android/model/Participant;", "participant", "isAuthoredBy", "(Lzendesk/conversationkit/android/model/Participant;)Z", "component1", "component2", "()Lzendesk/conversationkit/android/model/Author;", "component3", "()Lzendesk/conversationkit/android/model/MessageStatus;", "component4", "()Ljava/util/Date;", "component5", "component6", "()D", "component7", "()Lzendesk/conversationkit/android/model/MessageContent;", "component8", "()Ljava/util/Map;", "component9", "component10", "component11", "copy", "(Ljava/lang/String;Lzendesk/conversationkit/android/model/Author;Lzendesk/conversationkit/android/model/MessageStatus;Ljava/util/Date;Ljava/util/Date;DLzendesk/conversationkit/android/model/MessageContent;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lzendesk/conversationkit/android/model/Message;", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$zendesk_conversationkit_conversationkit_android", "(Lzendesk/conversationkit/android/model/Message;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getId", "Lzendesk/conversationkit/android/model/Author;", "getAuthor", "Lzendesk/conversationkit/android/model/MessageStatus;", "getStatus", "Ljava/util/Date;", "getCreated", "getCreated$annotations", "()V", "getReceived", "getReceived$annotations", "D", "getBeforeTimestamp", "Lzendesk/conversationkit/android/model/MessageContent;", "getContent", "Ljava/util/Map;", "getMetadata", "getSourceId", "getLocalId", "getPayload", "Lzendesk/conversationkit/android/model/EssentialMessageData;", "getEssentialMessageData$zendesk_conversationkit_conversationkit_android", "()Lzendesk/conversationkit/android/model/EssentialMessageData;", "essentialMessageData", "getTimestamp", "timestamp", "Companion", "$serializer", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class Message {

    @NotNull
    private static final j[] $childSerializers;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final Author author;
    private final double beforeTimestamp;

    @NotNull
    private final MessageContent content;

    @Nullable
    private final Date created;

    @NotNull
    private final String id;

    @NotNull
    private final String localId;

    @Nullable
    private final Map<String, Object> metadata;

    @Nullable
    private final String payload;

    @NotNull
    private final Date received;

    @Nullable
    private final String sourceId;

    @NotNull
    private final MessageStatus status;

    static {
        m mVar = m.PUBLICATION;
        $childSerializers = new j[]{null, null, l.a(mVar, new a(11)), l.a(mVar, new a(12)), l.a(mVar, new a(13)), null, l.a(mVar, new a(14)), l.a(mVar, new a(15)), null, null, null};
    }

    public Message(@NotNull String str, @NotNull Author author, @NotNull MessageStatus messageStatus, @Nullable Date date, @NotNull Date date2, double d3, @NotNull MessageContent messageContent, @Nullable Map<String, ? extends Object> map, @Nullable String str2, @NotNull String str3, @Nullable String str4) {
        str.getClass();
        author.getClass();
        messageStatus.getClass();
        date2.getClass();
        messageContent.getClass();
        str3.getClass();
        this.id = str;
        this.author = author;
        this.status = messageStatus;
        this.created = date;
        this.received = date2;
        this.beforeTimestamp = d3;
        this.content = messageContent;
        this.metadata = map;
        this.sourceId = str2;
        this.localId = str3;
        this.payload = str4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return MessageStatus.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new i90.a(Reflection.getOrCreateKotlinClass(Date.class), new KSerializer[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return new i90.a(Reflection.getOrCreateKotlinClass(Date.class), new KSerializer[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$2() {
        return MessageContent.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$3() {
        return new f0(r1.f29848a, new i90.a(Reflection.getOrCreateKotlinClass(Object.class), new KSerializer[0]), 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Message copy$default(Message message, String str, Author author, MessageStatus messageStatus, Date date, Date date2, double d3, MessageContent messageContent, Map map, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = message.id;
        }
        if ((i11 & 2) != 0) {
            author = message.author;
        }
        if ((i11 & 4) != 0) {
            messageStatus = message.status;
        }
        if ((i11 & 8) != 0) {
            date = message.created;
        }
        if ((i11 & 16) != 0) {
            date2 = message.received;
        }
        if ((i11 & 32) != 0) {
            d3 = message.beforeTimestamp;
        }
        if ((i11 & 64) != 0) {
            messageContent = message.content;
        }
        if ((i11 & 128) != 0) {
            map = message.metadata;
        }
        if ((i11 & 256) != 0) {
            str2 = message.sourceId;
        }
        if ((i11 & 512) != 0) {
            str3 = message.localId;
        }
        if ((i11 & 1024) != 0) {
            str4 = message.payload;
        }
        String str5 = str4;
        String str6 = str2;
        MessageContent messageContent2 = messageContent;
        double d11 = d3;
        Date date3 = date;
        Date date4 = date2;
        MessageStatus messageStatus2 = messageStatus;
        return message.copy(str, author, messageStatus2, date3, date4, d11, messageContent2, map, str6, str3, str5);
    }

    @NotNull
    public static final Message create(@NotNull MessageContent messageContent) {
        return INSTANCE.create(messageContent);
    }

    public static final /* synthetic */ void write$Self$zendesk_conversationkit_conversationkit_android(Message self, b output, SerialDescriptor serialDesc) {
        j[] jVarArr = $childSerializers;
        output.q(serialDesc, 0, self.id);
        output.i(serialDesc, 1, Author$$serializer.INSTANCE, self.author);
        output.i(serialDesc, 2, (KSerializer) jVarArr[2].getValue(), self.status);
        output.r(serialDesc, 3, (KSerializer) jVarArr[3].getValue(), self.created);
        output.i(serialDesc, 4, (KSerializer) jVarArr[4].getValue(), self.received);
        output.z(serialDesc, 5, self.beforeTimestamp);
        output.i(serialDesc, 6, (KSerializer) jVarArr[6].getValue(), self.content);
        output.r(serialDesc, 7, (KSerializer) jVarArr[7].getValue(), self.metadata);
        r1 r1Var = r1.f29848a;
        output.r(serialDesc, 8, r1Var, self.sourceId);
        output.q(serialDesc, 9, self.localId);
        output.r(serialDesc, 10, r1Var, self.payload);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getLocalId() {
        return this.localId;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getPayload() {
        return this.payload;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Author getAuthor() {
        return this.author;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final MessageStatus getStatus() {
        return this.status;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Date getCreated() {
        return this.created;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Date getReceived() {
        return this.received;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final double getBeforeTimestamp() {
        return this.beforeTimestamp;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final MessageContent getContent() {
        return this.content;
    }

    @Nullable
    public final Map<String, Object> component8() {
        return this.metadata;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getSourceId() {
        return this.sourceId;
    }

    @NotNull
    public final Message copy(@NotNull String id2, @NotNull Author author, @NotNull MessageStatus status, @Nullable Date created, @NotNull Date received, double beforeTimestamp, @NotNull MessageContent content, @Nullable Map<String, ? extends Object> metadata, @Nullable String sourceId, @NotNull String localId, @Nullable String payload) {
        id2.getClass();
        author.getClass();
        status.getClass();
        received.getClass();
        content.getClass();
        localId.getClass();
        return new Message(id2, author, status, created, received, beforeTimestamp, content, metadata, sourceId, localId, payload);
    }

    public boolean equals(@Nullable Object other) {
        return (other instanceof Message) && Intrinsics.areEqual(getEssentialMessageData$zendesk_conversationkit_conversationkit_android(), ((Message) other).getEssentialMessageData$zendesk_conversationkit_conversationkit_android());
    }

    @NotNull
    public final Author getAuthor() {
        return this.author;
    }

    public final double getBeforeTimestamp() {
        return this.beforeTimestamp;
    }

    @NotNull
    public final MessageContent getContent() {
        return this.content;
    }

    @Nullable
    public final Date getCreated() {
        return this.created;
    }

    @NotNull
    public final EssentialMessageData getEssentialMessageData$zendesk_conversationkit_conversationkit_android() {
        return new EssentialMessageData(this);
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getLocalId() {
        return this.localId;
    }

    @Nullable
    public final Map<String, Object> getMetadata() {
        return this.metadata;
    }

    @Nullable
    public final String getPayload() {
        return this.payload;
    }

    @NotNull
    public final Date getReceived() {
        return this.received;
    }

    @Nullable
    public final String getSourceId() {
        return this.sourceId;
    }

    @NotNull
    public final MessageStatus getStatus() {
        return this.status;
    }

    @NotNull
    public final Date getTimestamp() {
        Date date = this.created;
        return date == null ? this.received : date;
    }

    public int hashCode() {
        return getEssentialMessageData$zendesk_conversationkit_conversationkit_android().hashCode();
    }

    public final boolean isAuthoredBy(@Nullable Participant participant) {
        return Intrinsics.areEqual(this.author.getUserId(), participant != null ? participant.getUserId() : null);
    }

    @NotNull
    public String toString() {
        String string = getEssentialMessageData$zendesk_conversationkit_conversationkit_android().toString();
        string.getClass();
        int iG = StringsKt.G(string, "EssentialMessageData", 0, false, 2);
        return iG < 0 ? string : StringsKt.Q(string, iG, "EssentialMessageData".length() + iG, "Message").toString();
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J<\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0007J\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f¨\u0006\u0010"}, d2 = {"Lzendesk/conversationkit/android/model/Message$Companion;", "", "<init>", "()V", "create", "Lzendesk/conversationkit/android/model/Message;", "content", "Lzendesk/conversationkit/android/model/MessageContent;", "createdTime", "Ljava/util/Date;", "metadata", "", "", "payload", "serializer", "Lkotlinx/serialization/KSerializer;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static Message create$default(Companion companion, MessageContent messageContent, Date date, Map map, String str, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                date = new Date();
            }
            if ((i11 & 4) != 0) {
                map = o0.f26530a;
                map.getClass();
            }
            if ((i11 & 8) != 0) {
                str = null;
            }
            return companion.create(messageContent, date, map, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final Message create(@NotNull MessageContent content, @NotNull Date createdTime, @NotNull Map<String, ? extends Object> metadata, @Nullable String payload) {
            content.getClass();
            createdTime.getClass();
            metadata.getClass();
            String string = UUID.randomUUID().toString();
            string.getClass();
            return new Message(string, new Author((String) null, (AuthorType) null, (List) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null), new MessageStatus.Pending(null, 1, 0 == true ? 1 : 0), createdTime, createdTime, DateKtxKt.toTimestamp(createdTime) / 1000, content, metadata, null, string, payload);
        }

        @NotNull
        public final KSerializer serializer() {
            return Message$$serializer.INSTANCE;
        }

        private Companion() {
        }

        @NotNull
        public final Message create(@NotNull MessageContent messageContent, @NotNull Date date) {
            messageContent.getClass();
            date.getClass();
            return create$default(this, messageContent, date, null, null, 12, null);
        }

        @NotNull
        public final Message create(@NotNull MessageContent messageContent, @NotNull Date date, @NotNull Map<String, ? extends Object> map) {
            messageContent.getClass();
            date.getClass();
            map.getClass();
            return create$default(this, messageContent, date, map, null, 8, null);
        }

        @NotNull
        public final Message create(@NotNull MessageContent messageContent) {
            messageContent.getClass();
            return create$default(this, messageContent, null, null, null, 14, null);
        }
    }

    @NotNull
    public static final Message create(@NotNull MessageContent messageContent, @NotNull Date date) {
        return INSTANCE.create(messageContent, date);
    }

    @NotNull
    public static final Message create(@NotNull MessageContent messageContent, @NotNull Date date, @NotNull Map<String, ? extends Object> map) {
        return INSTANCE.create(messageContent, date, map);
    }

    @NotNull
    public static final Message create(@NotNull MessageContent messageContent, @NotNull Date date, @NotNull Map<String, ? extends Object> map, @Nullable String str) {
        return INSTANCE.create(messageContent, date, map, str);
    }

    public static /* synthetic */ void getCreated$annotations() {
    }

    public static /* synthetic */ void getReceived$annotations() {
    }

    public /* synthetic */ Message(int i11, String str, Author author, MessageStatus messageStatus, Date date, Date date2, double d3, MessageContent messageContent, Map map, String str2, String str3, String str4, m1 m1Var) {
        if (2047 != (i11 & 2047)) {
            c1.j(i11, 2047, Message$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = str;
        this.author = author;
        this.status = messageStatus;
        this.created = date;
        this.received = date2;
        this.beforeTimestamp = d3;
        this.content = messageContent;
        this.metadata = map;
        this.sourceId = str2;
        this.localId = str3;
        this.payload = str4;
    }
}
