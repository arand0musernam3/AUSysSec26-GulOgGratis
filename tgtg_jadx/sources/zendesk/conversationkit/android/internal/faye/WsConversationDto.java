package zendesk.conversationkit.android.internal.faye;

import i90.g;
import i90.h;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.f0;
import m90.m1;
import m90.r1;
import m90.v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.j;
import u70.l;
import u70.m;
import yu.a;
import zendesk.conversationkit.android.model.ConversationStatus;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@h
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0081\b\u0018\u0000 52\u00020\u0001:\u000265BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBO\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u001e\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b \u0010!JL\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001bJ\u0010\u0010%\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010+\u0012\u0004\b-\u0010.\u001a\u0004\b,\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b0\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b2\u0010\u001fR%\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b4\u0010!¨\u00067"}, d2 = {"Lzendesk/conversationkit/android/internal/faye/WsConversationDto;", "", "", "id", "", "appMakerLastRead", "Lzendesk/conversationkit/android/model/ConversationStatus;", "status", "", "metadata", "<init>", "(Ljava/lang/String;Ljava/lang/Double;Lzendesk/conversationkit/android/model/ConversationStatus;Ljava/util/Map;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Double;Lzendesk/conversationkit/android/model/ConversationStatus;Ljava/util/Map;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$zendesk_conversationkit_conversationkit_android", "(Lzendesk/conversationkit/android/internal/faye/WsConversationDto;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Double;", "component3", "()Lzendesk/conversationkit/android/model/ConversationStatus;", "component4", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/lang/Double;Lzendesk/conversationkit/android/model/ConversationStatus;Ljava/util/Map;)Lzendesk/conversationkit/android/internal/faye/WsConversationDto;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "Ljava/lang/Double;", "getAppMakerLastRead", "Lzendesk/conversationkit/android/model/ConversationStatus;", "getStatus", "Ljava/util/Map;", "getMetadata", "Companion", "$serializer", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class WsConversationDto {

    @NotNull
    private static final j[] $childSerializers;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Double appMakerLastRead;

    @Nullable
    private final String id;

    @Nullable
    private final Map<String, Object> metadata;

    @Nullable
    private final ConversationStatus status;

    static {
        m mVar = m.PUBLICATION;
        $childSerializers = new j[]{null, null, l.a(mVar, new a(24)), l.a(mVar, new a(25))};
    }

    public /* synthetic */ WsConversationDto(int i11, String str, Double d3, ConversationStatus conversationStatus, Map map, m1 m1Var) {
        if ((i11 & 1) == 0) {
            this.id = null;
        } else {
            this.id = str;
        }
        if ((i11 & 2) == 0) {
            this.appMakerLastRead = null;
        } else {
            this.appMakerLastRead = d3;
        }
        if ((i11 & 4) == 0) {
            this.status = null;
        } else {
            this.status = conversationStatus;
        }
        if ((i11 & 8) == 0) {
            this.metadata = null;
        } else {
            this.metadata = map;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return ConversationStatus.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new f0(r1.f29848a, new i90.a(Reflection.getOrCreateKotlinClass(Object.class), new KSerializer[0]), 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WsConversationDto copy$default(WsConversationDto wsConversationDto, String str, Double d3, ConversationStatus conversationStatus, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = wsConversationDto.id;
        }
        if ((i11 & 2) != 0) {
            d3 = wsConversationDto.appMakerLastRead;
        }
        if ((i11 & 4) != 0) {
            conversationStatus = wsConversationDto.status;
        }
        if ((i11 & 8) != 0) {
            map = wsConversationDto.metadata;
        }
        return wsConversationDto.copy(str, d3, conversationStatus, map);
    }

    public static final /* synthetic */ void write$Self$zendesk_conversationkit_conversationkit_android(WsConversationDto self, b output, SerialDescriptor serialDesc) {
        j[] jVarArr = $childSerializers;
        if (output.C(serialDesc) || self.id != null) {
            output.r(serialDesc, 0, r1.f29848a, self.id);
        }
        if (output.C(serialDesc) || self.appMakerLastRead != null) {
            output.r(serialDesc, 1, v.f29868a, self.appMakerLastRead);
        }
        if (output.C(serialDesc) || self.status != null) {
            output.r(serialDesc, 2, (KSerializer) jVarArr[2].getValue(), self.status);
        }
        if (!output.C(serialDesc) && self.metadata == null) {
            return;
        }
        output.r(serialDesc, 3, (KSerializer) jVarArr[3].getValue(), self.metadata);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Double getAppMakerLastRead() {
        return this.appMakerLastRead;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ConversationStatus getStatus() {
        return this.status;
    }

    @Nullable
    public final Map<String, Object> component4() {
        return this.metadata;
    }

    @NotNull
    public final WsConversationDto copy(@Nullable String id2, @Nullable Double appMakerLastRead, @Nullable ConversationStatus status, @Nullable Map<String, ? extends Object> metadata) {
        return new WsConversationDto(id2, appMakerLastRead, status, metadata);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WsConversationDto)) {
            return false;
        }
        WsConversationDto wsConversationDto = (WsConversationDto) other;
        return Intrinsics.areEqual(this.id, wsConversationDto.id) && Intrinsics.areEqual((Object) this.appMakerLastRead, (Object) wsConversationDto.appMakerLastRead) && this.status == wsConversationDto.status && Intrinsics.areEqual(this.metadata, wsConversationDto.metadata);
    }

    @Nullable
    public final Double getAppMakerLastRead() {
        return this.appMakerLastRead;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final Map<String, Object> getMetadata() {
        return this.metadata;
    }

    @Nullable
    public final ConversationStatus getStatus() {
        return this.status;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Double d3 = this.appMakerLastRead;
        int iHashCode2 = (iHashCode + (d3 == null ? 0 : d3.hashCode())) * 31;
        ConversationStatus conversationStatus = this.status;
        int iHashCode3 = (iHashCode2 + (conversationStatus == null ? 0 : conversationStatus.hashCode())) * 31;
        Map<String, Object> map = this.metadata;
        return iHashCode3 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "WsConversationDto(id=" + this.id + ", appMakerLastRead=" + this.appMakerLastRead + ", status=" + this.status + ", metadata=" + this.metadata + ")";
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/conversationkit/android/internal/faye/WsConversationDto$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/conversationkit/android/internal/faye/WsConversationDto;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return WsConversationDto$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @g("_id")
    public static /* synthetic */ void getId$annotations() {
    }

    public WsConversationDto() {
        this((String) null, (Double) null, (ConversationStatus) null, (Map) null, 15, (DefaultConstructorMarker) null);
    }

    public WsConversationDto(@Nullable String str, @Nullable Double d3, @Nullable ConversationStatus conversationStatus, @Nullable Map<String, ? extends Object> map) {
        this.id = str;
        this.appMakerLastRead = d3;
        this.status = conversationStatus;
        this.metadata = map;
    }

    public /* synthetic */ WsConversationDto(String str, Double d3, ConversationStatus conversationStatus, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : d3, (i11 & 4) != 0 ? null : conversationStatus, (i11 & 8) != 0 ? null : map);
    }
}
