package zendesk.conversationkit.android.internal.rest.model;

import au.a;
import e0.f;
import i90.g;
import i90.h;
import j4.s;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import u70.j;
import u70.l;
import u70.m;
import w2.l1;
import zendesk.conversationkit.android.model.ConversationRoutingStatus;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@h
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001c\b\u0081\b\u0018\u0000 \\2\u00020\u0001:\u0002]\\Bµ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\n\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\n\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0019\u0010\u001aBÍ\u0001\b\u0010\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\n\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\n\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u0019\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010!J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010!J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010!J\u0010\u0010&\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0018\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b,\u0010+J\u0018\u0010-\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b-\u0010)J\u0018\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b.\u0010)J\u0012\u0010/\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b/\u0010!J\u001e\u00100\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u0016HÆ\u0003¢\u0006\u0004\b2\u00103J\u0012\u00104\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b4\u0010+JÚ\u0001\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\n2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\n2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b7\u0010!J\u0010\u00108\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b8\u00109J\u001a\u0010;\u001a\u00020\b2\b\u0010:\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b;\u0010<J'\u0010E\u001a\u00020B2\u0006\u0010=\u001a\u00020\u00002\u0006\u0010?\u001a\u00020>2\u0006\u0010A\u001a\u00020@H\u0001¢\u0006\u0004\bC\u0010DR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010F\u0012\u0004\bH\u0010I\u001a\u0004\bG\u0010!R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010F\u001a\u0004\bJ\u0010!R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010F\u001a\u0004\bK\u0010!R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010F\u001a\u0004\bL\u0010!R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010F\u001a\u0004\bM\u0010!R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010N\u001a\u0004\b\t\u0010'R\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010O\u001a\u0004\bP\u0010)R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010Q\u001a\u0004\bR\u0010+R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010Q\u001a\u0004\bS\u0010+R\u001f\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u0010\u0010O\u001a\u0004\bT\u0010)R\u001f\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u0012\u0010O\u001a\u0004\bU\u0010)R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010F\u001a\u0004\bV\u0010!R%\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010W\u001a\u0004\bX\u00101R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010Y\u001a\u0004\bZ\u00103R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u0018\u0010Q\u001a\u0004\b[\u0010+¨\u0006^"}, d2 = {"Lzendesk/conversationkit/android/internal/rest/model/ConversationDto;", "", "", "id", "displayName", "description", "iconUrl", "type", "", "isDefault", "", "appMakers", "", "appMakerLastRead", "lastUpdatedAt", "Lzendesk/conversationkit/android/internal/rest/model/ParticipantDto;", "participants", "Lzendesk/conversationkit/android/internal/rest/model/MessageDto;", "messages", "status", "", "metadata", "Lzendesk/conversationkit/android/model/ConversationRoutingStatus;", "routingStatus", "createdAt", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/Map;Lzendesk/conversationkit/android/model/ConversationRoutingStatus;Ljava/lang/Double;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/Map;Lzendesk/conversationkit/android/model/ConversationRoutingStatus;Ljava/lang/Double;Lm90/m1;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "()Z", "component7", "()Ljava/util/List;", "component8", "()Ljava/lang/Double;", "component9", "component10", "component11", "component12", "component13", "()Ljava/util/Map;", "component14", "()Lzendesk/conversationkit/android/model/ConversationRoutingStatus;", "component15", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/Map;Lzendesk/conversationkit/android/model/ConversationRoutingStatus;Ljava/lang/Double;)Lzendesk/conversationkit/android/internal/rest/model/ConversationDto;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$zendesk_conversationkit_conversationkit_android", "(Lzendesk/conversationkit/android/internal/rest/model/ConversationDto;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "getDisplayName", "getDescription", "getIconUrl", "getType", "Z", "Ljava/util/List;", "getAppMakers", "Ljava/lang/Double;", "getAppMakerLastRead", "getLastUpdatedAt", "getParticipants", "getMessages", "getStatus", "Ljava/util/Map;", "getMetadata", "Lzendesk/conversationkit/android/model/ConversationRoutingStatus;", "getRoutingStatus", "getCreatedAt", "Companion", "$serializer", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ConversationDto {

    @NotNull
    private static final j[] $childSerializers;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Double appMakerLastRead;

    @Nullable
    private final List<String> appMakers;

    @Nullable
    private final Double createdAt;

    @Nullable
    private final String description;

    @Nullable
    private final String displayName;

    @Nullable
    private final String iconUrl;

    @NotNull
    private final String id;
    private final boolean isDefault;

    @Nullable
    private final Double lastUpdatedAt;

    @Nullable
    private final List<MessageDto> messages;

    @Nullable
    private final Map<String, Object> metadata;

    @Nullable
    private final List<ParticipantDto> participants;

    @NotNull
    private final ConversationRoutingStatus routingStatus;

    @Nullable
    private final String status;

    @NotNull
    private final String type;

    static {
        m mVar = m.PUBLICATION;
        $childSerializers = new j[]{null, null, null, null, null, null, l.a(mVar, new a(23)), null, null, l.a(mVar, new a(24)), l.a(mVar, new a(25)), null, l.a(mVar, new a(26)), null, null};
    }

    public /* synthetic */ ConversationDto(int i11, String str, String str2, String str3, String str4, String str5, boolean z11, List list, Double d3, Double d11, List list2, List list3, String str6, Map map, ConversationRoutingStatus conversationRoutingStatus, Double d12, m1 m1Var) {
        if (24575 != (i11 & 24575)) {
            c1.j(i11, 24575, ConversationDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = str;
        this.displayName = str2;
        this.description = str3;
        this.iconUrl = str4;
        this.type = str5;
        this.isDefault = z11;
        this.appMakers = list;
        this.appMakerLastRead = d3;
        this.lastUpdatedAt = d11;
        this.participants = list2;
        this.messages = list3;
        this.status = str6;
        this.metadata = map;
        this.routingStatus = (i11 & 8192) == 0 ? ConversationRoutingStatus.UNKNOWN : conversationRoutingStatus;
        this.createdAt = d12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new d(r1.f29848a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new d(ParticipantDto$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return new d(MessageDto$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$2() {
        return new f0(r1.f29848a, new i90.a(Reflection.getOrCreateKotlinClass(Object.class), new KSerializer[0]), 1);
    }

    public static final /* synthetic */ void write$Self$zendesk_conversationkit_conversationkit_android(ConversationDto self, b output, SerialDescriptor serialDesc) {
        j[] jVarArr = $childSerializers;
        output.q(serialDesc, 0, self.id);
        r1 r1Var = r1.f29848a;
        output.r(serialDesc, 1, r1Var, self.displayName);
        output.r(serialDesc, 2, r1Var, self.description);
        output.r(serialDesc, 3, r1Var, self.iconUrl);
        output.q(serialDesc, 4, self.type);
        output.p(serialDesc, 5, self.isDefault);
        output.r(serialDesc, 6, (KSerializer) jVarArr[6].getValue(), self.appMakers);
        v vVar = v.f29868a;
        output.r(serialDesc, 7, vVar, self.appMakerLastRead);
        output.r(serialDesc, 8, vVar, self.lastUpdatedAt);
        output.r(serialDesc, 9, (KSerializer) jVarArr[9].getValue(), self.participants);
        output.r(serialDesc, 10, (KSerializer) jVarArr[10].getValue(), self.messages);
        output.r(serialDesc, 11, r1Var, self.status);
        output.r(serialDesc, 12, (KSerializer) jVarArr[12].getValue(), self.metadata);
        if (output.C(serialDesc) || self.routingStatus != ConversationRoutingStatus.UNKNOWN) {
            output.i(serialDesc, 13, ConversationRoutingStatus.ConversationRoutingStatusSerializer.INSTANCE, self.routingStatus);
        }
        output.r(serialDesc, 14, vVar, self.createdAt);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final List<ParticipantDto> component10() {
        return this.participants;
    }

    @Nullable
    public final List<MessageDto> component11() {
        return this.messages;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    public final Map<String, Object> component13() {
        return this.metadata;
    }

    @NotNull
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final ConversationRoutingStatus getRoutingStatus() {
        return this.routingStatus;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Double getCreatedAt() {
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
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getIsDefault() {
        return this.isDefault;
    }

    @Nullable
    public final List<String> component7() {
        return this.appMakers;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Double getAppMakerLastRead() {
        return this.appMakerLastRead;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Double getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    @NotNull
    public final ConversationDto copy(@NotNull String id2, @Nullable String displayName, @Nullable String description, @Nullable String iconUrl, @NotNull String type, boolean isDefault, @Nullable List<String> appMakers, @Nullable Double appMakerLastRead, @Nullable Double lastUpdatedAt, @Nullable List<ParticipantDto> participants, @Nullable List<MessageDto> messages, @Nullable String status, @Nullable Map<String, ? extends Object> metadata, @NotNull ConversationRoutingStatus routingStatus, @Nullable Double createdAt) {
        id2.getClass();
        type.getClass();
        routingStatus.getClass();
        return new ConversationDto(id2, displayName, description, iconUrl, type, isDefault, appMakers, appMakerLastRead, lastUpdatedAt, participants, messages, status, metadata, routingStatus, createdAt);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConversationDto)) {
            return false;
        }
        ConversationDto conversationDto = (ConversationDto) other;
        return Intrinsics.areEqual(this.id, conversationDto.id) && Intrinsics.areEqual(this.displayName, conversationDto.displayName) && Intrinsics.areEqual(this.description, conversationDto.description) && Intrinsics.areEqual(this.iconUrl, conversationDto.iconUrl) && Intrinsics.areEqual(this.type, conversationDto.type) && this.isDefault == conversationDto.isDefault && Intrinsics.areEqual(this.appMakers, conversationDto.appMakers) && Intrinsics.areEqual((Object) this.appMakerLastRead, (Object) conversationDto.appMakerLastRead) && Intrinsics.areEqual((Object) this.lastUpdatedAt, (Object) conversationDto.lastUpdatedAt) && Intrinsics.areEqual(this.participants, conversationDto.participants) && Intrinsics.areEqual(this.messages, conversationDto.messages) && Intrinsics.areEqual(this.status, conversationDto.status) && Intrinsics.areEqual(this.metadata, conversationDto.metadata) && this.routingStatus == conversationDto.routingStatus && Intrinsics.areEqual((Object) this.createdAt, (Object) conversationDto.createdAt);
    }

    @Nullable
    public final Double getAppMakerLastRead() {
        return this.appMakerLastRead;
    }

    @Nullable
    public final List<String> getAppMakers() {
        return this.appMakers;
    }

    @Nullable
    public final Double getCreatedAt() {
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

    @Nullable
    public final List<MessageDto> getMessages() {
        return this.messages;
    }

    @Nullable
    public final Map<String, Object> getMetadata() {
        return this.metadata;
    }

    @Nullable
    public final List<ParticipantDto> getParticipants() {
        return this.participants;
    }

    @NotNull
    public final ConversationRoutingStatus getRoutingStatus() {
        return this.routingStatus;
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.displayName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.description;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.iconUrl;
        int iE = k.e(l1.b((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.type), 31, this.isDefault);
        List<String> list = this.appMakers;
        int iHashCode4 = (iE + (list == null ? 0 : list.hashCode())) * 31;
        Double d3 = this.appMakerLastRead;
        int iHashCode5 = (iHashCode4 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d11 = this.lastUpdatedAt;
        int iHashCode6 = (iHashCode5 + (d11 == null ? 0 : d11.hashCode())) * 31;
        List<ParticipantDto> list2 = this.participants;
        int iHashCode7 = (iHashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<MessageDto> list3 = this.messages;
        int iHashCode8 = (iHashCode7 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str4 = this.status;
        int iHashCode9 = (iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Map<String, Object> map = this.metadata;
        int iHashCode10 = (this.routingStatus.hashCode() + ((iHashCode9 + (map == null ? 0 : map.hashCode())) * 31)) * 31;
        Double d12 = this.createdAt;
        return iHashCode10 + (d12 != null ? d12.hashCode() : 0);
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
        String str5 = this.type;
        boolean z11 = this.isDefault;
        List<String> list = this.appMakers;
        Double d3 = this.appMakerLastRead;
        Double d11 = this.lastUpdatedAt;
        List<ParticipantDto> list2 = this.participants;
        List<MessageDto> list3 = this.messages;
        String str6 = this.status;
        Map<String, Object> map = this.metadata;
        ConversationRoutingStatus conversationRoutingStatus = this.routingStatus;
        Double d12 = this.createdAt;
        StringBuilder sbT = f.t("ConversationDto(id=", str, ", displayName=", str2, ", description=");
        s.A(sbT, str3, ", iconUrl=", str4, ", type=");
        k.z(sbT, str5, ", isDefault=", z11, ", appMakers=");
        sbT.append(list);
        sbT.append(", appMakerLastRead=");
        sbT.append(d3);
        sbT.append(", lastUpdatedAt=");
        sbT.append(d11);
        sbT.append(", participants=");
        sbT.append(list2);
        sbT.append(", messages=");
        sbT.append(list3);
        sbT.append(", status=");
        sbT.append(str6);
        sbT.append(", metadata=");
        sbT.append(map);
        sbT.append(", routingStatus=");
        sbT.append(conversationRoutingStatus);
        sbT.append(", createdAt=");
        sbT.append(d12);
        sbT.append(")");
        return sbT.toString();
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/conversationkit/android/internal/rest/model/ConversationDto$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/conversationkit/android/internal/rest/model/ConversationDto;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return ConversationDto$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @g("_id")
    public static /* synthetic */ void getId$annotations() {
    }

    public ConversationDto(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @NotNull String str5, boolean z11, @Nullable List<String> list, @Nullable Double d3, @Nullable Double d11, @Nullable List<ParticipantDto> list2, @Nullable List<MessageDto> list3, @Nullable String str6, @Nullable Map<String, ? extends Object> map, @NotNull ConversationRoutingStatus conversationRoutingStatus, @Nullable Double d12) {
        str.getClass();
        str5.getClass();
        conversationRoutingStatus.getClass();
        this.id = str;
        this.displayName = str2;
        this.description = str3;
        this.iconUrl = str4;
        this.type = str5;
        this.isDefault = z11;
        this.appMakers = list;
        this.appMakerLastRead = d3;
        this.lastUpdatedAt = d11;
        this.participants = list2;
        this.messages = list3;
        this.status = str6;
        this.metadata = map;
        this.routingStatus = conversationRoutingStatus;
        this.createdAt = d12;
    }

    public /* synthetic */ ConversationDto(String str, String str2, String str3, String str4, String str5, boolean z11, List list, Double d3, Double d11, List list2, List list3, String str6, Map map, ConversationRoutingStatus conversationRoutingStatus, Double d12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, z11, list, d3, d11, list2, list3, str6, map, (i11 & 8192) != 0 ? ConversationRoutingStatus.UNKNOWN : conversationRoutingStatus, d12);
    }
}
