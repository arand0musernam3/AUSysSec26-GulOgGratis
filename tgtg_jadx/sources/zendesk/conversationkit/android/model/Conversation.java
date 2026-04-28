package zendesk.conversationkit.android.model;

import cu.a;
import e0.f;
import i90.h;
import j4.s;
import java.util.Date;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.c1;
import m90.d;
import m90.f0;
import m90.m1;
import m90.r1;
import m90.v;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import u70.j;
import u70.l;
import u70.m;
import zendesk.conversationkit.android.model.ConversationRoutingStatus;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@h
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b#\b\u0087\b\u0018\u0000 n2\u00020\u0001:\u0002onB¿\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u000b\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u000b\u0012\u0006\u0010\u0016\u001a\u00020\t\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0019\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u001e\u0010\u001fBß\u0001\b\u0010\u0012\u0006\u0010!\u001a\u00020 \u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000b\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u000b\u0012\u0006\u0010\u0016\u001a\u00020\t\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\r\u0012\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b\u001e\u0010$J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010&J\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010&J\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010&J\u0010\u0010*\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0016\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bHÆ\u0003¢\u0006\u0004\b.\u0010/J\u0012\u00100\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b0\u00101J\u0012\u00102\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b2\u00103J\u0012\u00104\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b4\u00105J\u0016\u00106\u001a\b\u0012\u0004\u0012\u00020\u00110\u000bHÆ\u0003¢\u0006\u0004\b6\u0010/J\u0016\u00107\u001a\b\u0012\u0004\u0012\u00020\u00140\u000bHÆ\u0003¢\u0006\u0004\b7\u0010/J\u0010\u00108\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b8\u0010-J\u0010\u00109\u001a\u00020\u0017HÆ\u0003¢\u0006\u0004\b9\u0010:J\u001e\u0010;\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0019HÆ\u0003¢\u0006\u0004\b;\u0010<J\u0010\u0010=\u001a\u00020\u001bHÆ\u0003¢\u0006\u0004\b=\u0010>J\u0012\u0010?\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b?\u00101Jè\u0001\u0010@\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u000b2\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\t2\b\b\u0002\u0010\u0018\u001a\u00020\u00172\u0016\b\u0002\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b@\u0010AJ\u0010\u0010B\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bB\u0010&J\u0010\u0010C\u001a\u00020 HÖ\u0001¢\u0006\u0004\bC\u0010DJ\u001a\u0010F\u001a\u00020\t2\b\u0010E\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bF\u0010GJ'\u0010P\u001a\u00020M2\u0006\u0010H\u001a\u00020\u00002\u0006\u0010J\u001a\u00020I2\u0006\u0010L\u001a\u00020KH\u0001¢\u0006\u0004\bN\u0010OR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010Q\u001a\u0004\bR\u0010&R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010Q\u001a\u0004\bS\u0010&R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010Q\u001a\u0004\bT\u0010&R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010Q\u001a\u0004\bU\u0010&R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010V\u001a\u0004\bW\u0010+R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010X\u001a\u0004\b\n\u0010-R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010Y\u001a\u0004\bZ\u0010/R\"\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010[\u0012\u0004\b]\u0010^\u001a\u0004\b\\\u00101R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010_\u001a\u0004\b`\u00103R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010a\u001a\u0004\bb\u00105R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u000b8\u0006¢\u0006\f\n\u0004\b\u0013\u0010Y\u001a\u0004\bc\u0010/R\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u000b8\u0006¢\u0006\f\n\u0004\b\u0015\u0010Y\u001a\u0004\bd\u0010/R\u0017\u0010\u0016\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0016\u0010X\u001a\u0004\be\u0010-R\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010f\u001a\u0004\bg\u0010:R%\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010h\u001a\u0004\bi\u0010<R\u0017\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010j\u001a\u0004\bk\u0010>R\"\u0010\u001d\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010[\u0012\u0004\bm\u0010^\u001a\u0004\bl\u00101¨\u0006p"}, d2 = {"Lzendesk/conversationkit/android/model/Conversation;", "", "", "id", "displayName", "description", "iconUrl", "Lzendesk/conversationkit/android/model/ConversationType;", "type", "", "isDefault", "", "business", "Ljava/util/Date;", "businessLastRead", "", "lastUpdatedAt", "Lzendesk/conversationkit/android/model/Participant;", "myself", "participants", "Lzendesk/conversationkit/android/model/Message;", "messages", "hasPrevious", "Lzendesk/conversationkit/android/model/ConversationStatus;", "status", "", "metadata", "Lzendesk/conversationkit/android/model/ConversationRoutingStatus;", "routingStatus", "createdAt", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lzendesk/conversationkit/android/model/ConversationType;ZLjava/util/List;Ljava/util/Date;Ljava/lang/Double;Lzendesk/conversationkit/android/model/Participant;Ljava/util/List;Ljava/util/List;ZLzendesk/conversationkit/android/model/ConversationStatus;Ljava/util/Map;Lzendesk/conversationkit/android/model/ConversationRoutingStatus;Ljava/util/Date;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lzendesk/conversationkit/android/model/ConversationType;ZLjava/util/List;Ljava/util/Date;Ljava/lang/Double;Lzendesk/conversationkit/android/model/Participant;Ljava/util/List;Ljava/util/List;ZLzendesk/conversationkit/android/model/ConversationStatus;Ljava/util/Map;Lzendesk/conversationkit/android/model/ConversationRoutingStatus;Ljava/util/Date;Lm90/m1;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lzendesk/conversationkit/android/model/ConversationType;", "component6", "()Z", "component7", "()Ljava/util/List;", "component8", "()Ljava/util/Date;", "component9", "()Ljava/lang/Double;", "component10", "()Lzendesk/conversationkit/android/model/Participant;", "component11", "component12", "component13", "component14", "()Lzendesk/conversationkit/android/model/ConversationStatus;", "component15", "()Ljava/util/Map;", "component16", "()Lzendesk/conversationkit/android/model/ConversationRoutingStatus;", "component17", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lzendesk/conversationkit/android/model/ConversationType;ZLjava/util/List;Ljava/util/Date;Ljava/lang/Double;Lzendesk/conversationkit/android/model/Participant;Ljava/util/List;Ljava/util/List;ZLzendesk/conversationkit/android/model/ConversationStatus;Ljava/util/Map;Lzendesk/conversationkit/android/model/ConversationRoutingStatus;Ljava/util/Date;)Lzendesk/conversationkit/android/model/Conversation;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$zendesk_conversationkit_conversationkit_android", "(Lzendesk/conversationkit/android/model/Conversation;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getId", "getDisplayName", "getDescription", "getIconUrl", "Lzendesk/conversationkit/android/model/ConversationType;", "getType", "Z", "Ljava/util/List;", "getBusiness", "Ljava/util/Date;", "getBusinessLastRead", "getBusinessLastRead$annotations", "()V", "Ljava/lang/Double;", "getLastUpdatedAt", "Lzendesk/conversationkit/android/model/Participant;", "getMyself", "getParticipants", "getMessages", "getHasPrevious", "Lzendesk/conversationkit/android/model/ConversationStatus;", "getStatus", "Ljava/util/Map;", "getMetadata", "Lzendesk/conversationkit/android/model/ConversationRoutingStatus;", "getRoutingStatus", "getCreatedAt", "getCreatedAt$annotations", "Companion", "$serializer", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class Conversation {

    @NotNull
    private static final j[] $childSerializers;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final List<String> business;

    @Nullable
    private final Date businessLastRead;

    @Nullable
    private final Date createdAt;

    @Nullable
    private final String description;

    @Nullable
    private final String displayName;
    private final boolean hasPrevious;

    @Nullable
    private final String iconUrl;

    @NotNull
    private final String id;
    private final boolean isDefault;

    @Nullable
    private final Double lastUpdatedAt;

    @NotNull
    private final List<Message> messages;

    @Nullable
    private final Map<String, Object> metadata;

    @Nullable
    private final Participant myself;

    @NotNull
    private final List<Participant> participants;

    @NotNull
    private final ConversationRoutingStatus routingStatus;

    @NotNull
    private final ConversationStatus status;

    @NotNull
    private final ConversationType type;

    static {
        m mVar = m.PUBLICATION;
        $childSerializers = new j[]{null, null, null, null, l.a(mVar, new a(22)), null, l.a(mVar, new a(23)), l.a(mVar, new a(24)), null, null, l.a(mVar, new a(25)), l.a(mVar, new a(26)), null, l.a(mVar, new a(27)), l.a(mVar, new a(28)), null, l.a(mVar, new a(29))};
    }

    public /* synthetic */ Conversation(int i11, String str, String str2, String str3, String str4, ConversationType conversationType, boolean z11, List list, Date date, Double d3, Participant participant, List list2, List list3, boolean z12, ConversationStatus conversationStatus, Map map, ConversationRoutingStatus conversationRoutingStatus, Date date2, m1 m1Var) {
        if (98303 != (i11 & 98303)) {
            c1.j(i11, 98303, Conversation$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = str;
        this.displayName = str2;
        this.description = str3;
        this.iconUrl = str4;
        this.type = conversationType;
        this.isDefault = z11;
        this.business = list;
        this.businessLastRead = date;
        this.lastUpdatedAt = d3;
        this.myself = participant;
        this.participants = list2;
        this.messages = list3;
        this.hasPrevious = z12;
        this.status = conversationStatus;
        this.metadata = map;
        this.routingStatus = (i11 & 32768) == 0 ? ConversationRoutingStatus.UNKNOWN : conversationRoutingStatus;
        this.createdAt = date2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return ConversationType.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new d(r1.f29848a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return new i90.a(Reflection.getOrCreateKotlinClass(Date.class), new KSerializer[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$2() {
        return new d(Participant$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$3() {
        return new d(Message$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$4() {
        return ConversationStatus.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$5() {
        return new f0(r1.f29848a, new i90.a(Reflection.getOrCreateKotlinClass(Object.class), new KSerializer[0]), 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$6() {
        return new i90.a(Reflection.getOrCreateKotlinClass(Date.class), new KSerializer[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Conversation copy$default(Conversation conversation, String str, String str2, String str3, String str4, ConversationType conversationType, boolean z11, List list, Date date, Double d3, Participant participant, List list2, List list3, boolean z12, ConversationStatus conversationStatus, Map map, ConversationRoutingStatus conversationRoutingStatus, Date date2, int i11, Object obj) {
        Date date3;
        ConversationRoutingStatus conversationRoutingStatus2;
        String str5;
        Conversation conversation2;
        Map map2;
        String str6;
        String str7;
        String str8;
        ConversationType conversationType2;
        boolean z13;
        List list4;
        Date date4;
        Double d11;
        Participant participant2;
        List list5;
        List list6;
        boolean z14;
        ConversationStatus conversationStatus2;
        String str9 = (i11 & 1) != 0 ? conversation.id : str;
        String str10 = (i11 & 2) != 0 ? conversation.displayName : str2;
        String str11 = (i11 & 4) != 0 ? conversation.description : str3;
        String str12 = (i11 & 8) != 0 ? conversation.iconUrl : str4;
        ConversationType conversationType3 = (i11 & 16) != 0 ? conversation.type : conversationType;
        boolean z15 = (i11 & 32) != 0 ? conversation.isDefault : z11;
        List list7 = (i11 & 64) != 0 ? conversation.business : list;
        Date date5 = (i11 & 128) != 0 ? conversation.businessLastRead : date;
        Double d12 = (i11 & 256) != 0 ? conversation.lastUpdatedAt : d3;
        Participant participant3 = (i11 & 512) != 0 ? conversation.myself : participant;
        List list8 = (i11 & 1024) != 0 ? conversation.participants : list2;
        List list9 = (i11 & NewHope.SENDB_BYTES) != 0 ? conversation.messages : list3;
        boolean z16 = (i11 & 4096) != 0 ? conversation.hasPrevious : z12;
        ConversationStatus conversationStatus3 = (i11 & 8192) != 0 ? conversation.status : conversationStatus;
        String str13 = str9;
        Map map3 = (i11 & BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE) != 0 ? conversation.metadata : map;
        ConversationRoutingStatus conversationRoutingStatus3 = (i11 & 32768) != 0 ? conversation.routingStatus : conversationRoutingStatus;
        if ((i11 & 65536) != 0) {
            conversationRoutingStatus2 = conversationRoutingStatus3;
            date3 = conversation.createdAt;
            map2 = map3;
            str6 = str10;
            str7 = str11;
            str8 = str12;
            conversationType2 = conversationType3;
            z13 = z15;
            list4 = list7;
            date4 = date5;
            d11 = d12;
            participant2 = participant3;
            list5 = list8;
            list6 = list9;
            z14 = z16;
            conversationStatus2 = conversationStatus3;
            str5 = str13;
            conversation2 = conversation;
        } else {
            date3 = date2;
            conversationRoutingStatus2 = conversationRoutingStatus3;
            str5 = str13;
            conversation2 = conversation;
            map2 = map3;
            str6 = str10;
            str7 = str11;
            str8 = str12;
            conversationType2 = conversationType3;
            z13 = z15;
            list4 = list7;
            date4 = date5;
            d11 = d12;
            participant2 = participant3;
            list5 = list8;
            list6 = list9;
            z14 = z16;
            conversationStatus2 = conversationStatus3;
        }
        return conversation2.copy(str5, str6, str7, str8, conversationType2, z13, list4, date4, d11, participant2, list5, list6, z14, conversationStatus2, map2, conversationRoutingStatus2, date3);
    }

    public static final /* synthetic */ void write$Self$zendesk_conversationkit_conversationkit_android(Conversation self, b output, SerialDescriptor serialDesc) {
        j[] jVarArr = $childSerializers;
        output.q(serialDesc, 0, self.id);
        r1 r1Var = r1.f29848a;
        output.r(serialDesc, 1, r1Var, self.displayName);
        output.r(serialDesc, 2, r1Var, self.description);
        output.r(serialDesc, 3, r1Var, self.iconUrl);
        output.i(serialDesc, 4, (KSerializer) jVarArr[4].getValue(), self.type);
        output.p(serialDesc, 5, self.isDefault);
        output.i(serialDesc, 6, (KSerializer) jVarArr[6].getValue(), self.business);
        output.r(serialDesc, 7, (KSerializer) jVarArr[7].getValue(), self.businessLastRead);
        output.r(serialDesc, 8, v.f29868a, self.lastUpdatedAt);
        output.r(serialDesc, 9, Participant$$serializer.INSTANCE, self.myself);
        output.i(serialDesc, 10, (KSerializer) jVarArr[10].getValue(), self.participants);
        output.i(serialDesc, 11, (KSerializer) jVarArr[11].getValue(), self.messages);
        output.p(serialDesc, 12, self.hasPrevious);
        output.i(serialDesc, 13, (KSerializer) jVarArr[13].getValue(), self.status);
        output.r(serialDesc, 14, (KSerializer) jVarArr[14].getValue(), self.metadata);
        if (output.C(serialDesc) || self.routingStatus != ConversationRoutingStatus.UNKNOWN) {
            output.i(serialDesc, 15, ConversationRoutingStatus.ConversationRoutingStatusSerializer.INSTANCE, self.routingStatus);
        }
        output.r(serialDesc, 16, (KSerializer) jVarArr[16].getValue(), self.createdAt);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Participant getMyself() {
        return this.myself;
    }

    @NotNull
    public final List<Participant> component11() {
        return this.participants;
    }

    @NotNull
    public final List<Message> component12() {
        return this.messages;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final boolean getHasPrevious() {
        return this.hasPrevious;
    }

    @NotNull
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final ConversationStatus getStatus() {
        return this.status;
    }

    @Nullable
    public final Map<String, Object> component15() {
        return this.metadata;
    }

    @NotNull
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final ConversationRoutingStatus getRoutingStatus() {
        return this.routingStatus;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final Date getCreatedAt() {
        return this.createdAt;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final ConversationType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getIsDefault() {
        return this.isDefault;
    }

    @NotNull
    public final List<String> component7() {
        return this.business;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Date getBusinessLastRead() {
        return this.businessLastRead;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Double getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    @NotNull
    public final Conversation copy(@NotNull String id2, @Nullable String displayName, @Nullable String description, @Nullable String iconUrl, @NotNull ConversationType type, boolean isDefault, @NotNull List<String> business, @Nullable Date businessLastRead, @Nullable Double lastUpdatedAt, @Nullable Participant myself, @NotNull List<Participant> participants, @NotNull List<Message> messages, boolean hasPrevious, @NotNull ConversationStatus status, @Nullable Map<String, ? extends Object> metadata, @NotNull ConversationRoutingStatus routingStatus, @Nullable Date createdAt) {
        id2.getClass();
        type.getClass();
        business.getClass();
        participants.getClass();
        messages.getClass();
        status.getClass();
        routingStatus.getClass();
        return new Conversation(id2, displayName, description, iconUrl, type, isDefault, business, businessLastRead, lastUpdatedAt, myself, participants, messages, hasPrevious, status, metadata, routingStatus, createdAt);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Conversation)) {
            return false;
        }
        Conversation conversation = (Conversation) other;
        return Intrinsics.areEqual(this.id, conversation.id) && Intrinsics.areEqual(this.displayName, conversation.displayName) && Intrinsics.areEqual(this.description, conversation.description) && Intrinsics.areEqual(this.iconUrl, conversation.iconUrl) && this.type == conversation.type && this.isDefault == conversation.isDefault && Intrinsics.areEqual(this.business, conversation.business) && Intrinsics.areEqual(this.businessLastRead, conversation.businessLastRead) && Intrinsics.areEqual((Object) this.lastUpdatedAt, (Object) conversation.lastUpdatedAt) && Intrinsics.areEqual(this.myself, conversation.myself) && Intrinsics.areEqual(this.participants, conversation.participants) && Intrinsics.areEqual(this.messages, conversation.messages) && this.hasPrevious == conversation.hasPrevious && this.status == conversation.status && Intrinsics.areEqual(this.metadata, conversation.metadata) && this.routingStatus == conversation.routingStatus && Intrinsics.areEqual(this.createdAt, conversation.createdAt);
    }

    @NotNull
    public final List<String> getBusiness() {
        return this.business;
    }

    @Nullable
    public final Date getBusinessLastRead() {
        return this.businessLastRead;
    }

    @Nullable
    public final Date getCreatedAt() {
        return this.createdAt;
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    public final String getDisplayName() {
        return this.displayName;
    }

    public final boolean getHasPrevious() {
        return this.hasPrevious;
    }

    @Nullable
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final Double getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    @NotNull
    public final List<Message> getMessages() {
        return this.messages;
    }

    @Nullable
    public final Map<String, Object> getMetadata() {
        return this.metadata;
    }

    @Nullable
    public final Participant getMyself() {
        return this.myself;
    }

    @NotNull
    public final List<Participant> getParticipants() {
        return this.participants;
    }

    @NotNull
    public final ConversationRoutingStatus getRoutingStatus() {
        return this.routingStatus;
    }

    @NotNull
    public final ConversationStatus getStatus() {
        return this.status;
    }

    @NotNull
    public final ConversationType getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.displayName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.description;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.iconUrl;
        int iC = f.c(this.business, k.e((this.type.hashCode() + ((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31, 31, this.isDefault), 31);
        Date date = this.businessLastRead;
        int iHashCode4 = (iC + (date == null ? 0 : date.hashCode())) * 31;
        Double d3 = this.lastUpdatedAt;
        int iHashCode5 = (iHashCode4 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Participant participant = this.myself;
        int iHashCode6 = (this.status.hashCode() + k.e(f.c(this.messages, f.c(this.participants, (iHashCode5 + (participant == null ? 0 : participant.hashCode())) * 31, 31), 31), 31, this.hasPrevious)) * 31;
        Map<String, Object> map = this.metadata;
        int iHashCode7 = (this.routingStatus.hashCode() + ((iHashCode6 + (map == null ? 0 : map.hashCode())) * 31)) * 31;
        Date date2 = this.createdAt;
        return iHashCode7 + (date2 != null ? date2.hashCode() : 0);
    }

    public final boolean isDefault() {
        return this.isDefault;
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.displayName;
        String str3 = this.description;
        String str4 = this.iconUrl;
        ConversationType conversationType = this.type;
        boolean z11 = this.isDefault;
        List<String> list = this.business;
        Date date = this.businessLastRead;
        Double d3 = this.lastUpdatedAt;
        Participant participant = this.myself;
        List<Participant> list2 = this.participants;
        List<Message> list3 = this.messages;
        boolean z12 = this.hasPrevious;
        ConversationStatus conversationStatus = this.status;
        Map<String, Object> map = this.metadata;
        ConversationRoutingStatus conversationRoutingStatus = this.routingStatus;
        Date date2 = this.createdAt;
        StringBuilder sbT = f.t("Conversation(id=", str, ", displayName=", str2, ", description=");
        s.A(sbT, str3, ", iconUrl=", str4, ", type=");
        sbT.append(conversationType);
        sbT.append(", isDefault=");
        sbT.append(z11);
        sbT.append(", business=");
        sbT.append(list);
        sbT.append(", businessLastRead=");
        sbT.append(date);
        sbT.append(", lastUpdatedAt=");
        sbT.append(d3);
        sbT.append(", myself=");
        sbT.append(participant);
        sbT.append(", participants=");
        sbT.append(list2);
        sbT.append(", messages=");
        sbT.append(list3);
        sbT.append(", hasPrevious=");
        sbT.append(z12);
        sbT.append(", status=");
        sbT.append(conversationStatus);
        sbT.append(", metadata=");
        sbT.append(map);
        sbT.append(", routingStatus=");
        sbT.append(conversationRoutingStatus);
        sbT.append(", createdAt=");
        sbT.append(date2);
        sbT.append(")");
        return sbT.toString();
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/conversationkit/android/model/Conversation$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/conversationkit/android/model/Conversation;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return Conversation$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static /* synthetic */ void getBusinessLastRead$annotations() {
    }

    public static /* synthetic */ void getCreatedAt$annotations() {
    }

    public Conversation(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @NotNull ConversationType conversationType, boolean z11, @NotNull List<String> list, @Nullable Date date, @Nullable Double d3, @Nullable Participant participant, @NotNull List<Participant> list2, @NotNull List<Message> list3, boolean z12, @NotNull ConversationStatus conversationStatus, @Nullable Map<String, ? extends Object> map, @NotNull ConversationRoutingStatus conversationRoutingStatus, @Nullable Date date2) {
        str.getClass();
        conversationType.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        conversationStatus.getClass();
        conversationRoutingStatus.getClass();
        this.id = str;
        this.displayName = str2;
        this.description = str3;
        this.iconUrl = str4;
        this.type = conversationType;
        this.isDefault = z11;
        this.business = list;
        this.businessLastRead = date;
        this.lastUpdatedAt = d3;
        this.myself = participant;
        this.participants = list2;
        this.messages = list3;
        this.hasPrevious = z12;
        this.status = conversationStatus;
        this.metadata = map;
        this.routingStatus = conversationRoutingStatus;
        this.createdAt = date2;
    }

    public /* synthetic */ Conversation(String str, String str2, String str3, String str4, ConversationType conversationType, boolean z11, List list, Date date, Double d3, Participant participant, List list2, List list3, boolean z12, ConversationStatus conversationStatus, Map map, ConversationRoutingStatus conversationRoutingStatus, Date date2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, conversationType, z11, list, date, d3, participant, list2, list3, z12, conversationStatus, map, (i11 & 32768) != 0 ? ConversationRoutingStatus.UNKNOWN : conversationRoutingStatus, date2);
    }
}
