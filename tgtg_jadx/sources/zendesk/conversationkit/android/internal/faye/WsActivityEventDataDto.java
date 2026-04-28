package zendesk.conversationkit.android.internal.faye;

import e0.f;
import i90.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.m1;
import m90.q0;
import m90.r1;
import m90.v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@h
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0081\b\u0018\u0000 92\u00020\u0001:\u0002:9BO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rBW\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b%\u0010$JX\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u001dJ\u0010\u0010)\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u001dR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010/\u001a\u0004\b1\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00102\u001a\u0004\b3\u0010 R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00104\u001a\u0004\b5\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00106\u001a\u0004\b7\u0010$R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u00106\u001a\u0004\b8\u0010$¨\u0006;"}, d2 = {"Lzendesk/conversationkit/android/internal/faye/WsActivityEventDataDto;", "", "", "name", "avatarUrl", "", "lastRead", "Lzendesk/conversationkit/android/internal/faye/WsResponseTimeDto;", "responseTime", "", "queuePosition", "lowestQueuePosition", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Lzendesk/conversationkit/android/internal/faye/WsResponseTimeDto;Ljava/lang/Long;Ljava/lang/Long;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Double;Lzendesk/conversationkit/android/internal/faye/WsResponseTimeDto;Ljava/lang/Long;Ljava/lang/Long;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$zendesk_conversationkit_conversationkit_android", "(Lzendesk/conversationkit/android/internal/faye/WsActivityEventDataDto;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Double;", "component4", "()Lzendesk/conversationkit/android/internal/faye/WsResponseTimeDto;", "component5", "()Ljava/lang/Long;", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Lzendesk/conversationkit/android/internal/faye/WsResponseTimeDto;Ljava/lang/Long;Ljava/lang/Long;)Lzendesk/conversationkit/android/internal/faye/WsActivityEventDataDto;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "getAvatarUrl", "Ljava/lang/Double;", "getLastRead", "Lzendesk/conversationkit/android/internal/faye/WsResponseTimeDto;", "getResponseTime", "Ljava/lang/Long;", "getQueuePosition", "getLowestQueuePosition", "Companion", "$serializer", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class WsActivityEventDataDto {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final String avatarUrl;

    @Nullable
    private final Double lastRead;

    @Nullable
    private final Long lowestQueuePosition;

    @Nullable
    private final String name;

    @Nullable
    private final Long queuePosition;

    @Nullable
    private final WsResponseTimeDto responseTime;

    public /* synthetic */ WsActivityEventDataDto(int i11, String str, String str2, Double d3, WsResponseTimeDto wsResponseTimeDto, Long l, Long l7, m1 m1Var) {
        if ((i11 & 1) == 0) {
            this.name = null;
        } else {
            this.name = str;
        }
        if ((i11 & 2) == 0) {
            this.avatarUrl = null;
        } else {
            this.avatarUrl = str2;
        }
        if ((i11 & 4) == 0) {
            this.lastRead = null;
        } else {
            this.lastRead = d3;
        }
        if ((i11 & 8) == 0) {
            this.responseTime = null;
        } else {
            this.responseTime = wsResponseTimeDto;
        }
        if ((i11 & 16) == 0) {
            this.queuePosition = null;
        } else {
            this.queuePosition = l;
        }
        if ((i11 & 32) == 0) {
            this.lowestQueuePosition = null;
        } else {
            this.lowestQueuePosition = l7;
        }
    }

    public static /* synthetic */ WsActivityEventDataDto copy$default(WsActivityEventDataDto wsActivityEventDataDto, String str, String str2, Double d3, WsResponseTimeDto wsResponseTimeDto, Long l, Long l7, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = wsActivityEventDataDto.name;
        }
        if ((i11 & 2) != 0) {
            str2 = wsActivityEventDataDto.avatarUrl;
        }
        if ((i11 & 4) != 0) {
            d3 = wsActivityEventDataDto.lastRead;
        }
        if ((i11 & 8) != 0) {
            wsResponseTimeDto = wsActivityEventDataDto.responseTime;
        }
        if ((i11 & 16) != 0) {
            l = wsActivityEventDataDto.queuePosition;
        }
        if ((i11 & 32) != 0) {
            l7 = wsActivityEventDataDto.lowestQueuePosition;
        }
        Long l11 = l;
        Long l12 = l7;
        return wsActivityEventDataDto.copy(str, str2, d3, wsResponseTimeDto, l11, l12);
    }

    public static final /* synthetic */ void write$Self$zendesk_conversationkit_conversationkit_android(WsActivityEventDataDto self, b output, SerialDescriptor serialDesc) {
        if (output.C(serialDesc) || self.name != null) {
            output.r(serialDesc, 0, r1.f29848a, self.name);
        }
        if (output.C(serialDesc) || self.avatarUrl != null) {
            output.r(serialDesc, 1, r1.f29848a, self.avatarUrl);
        }
        if (output.C(serialDesc) || self.lastRead != null) {
            output.r(serialDesc, 2, v.f29868a, self.lastRead);
        }
        if (output.C(serialDesc) || self.responseTime != null) {
            output.r(serialDesc, 3, WsResponseTimeDto$$serializer.INSTANCE, self.responseTime);
        }
        if (output.C(serialDesc) || self.queuePosition != null) {
            output.r(serialDesc, 4, q0.f29842a, self.queuePosition);
        }
        if (!output.C(serialDesc) && self.lowestQueuePosition == null) {
            return;
        }
        output.r(serialDesc, 5, q0.f29842a, self.lowestQueuePosition);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Double getLastRead() {
        return this.lastRead;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final WsResponseTimeDto getResponseTime() {
        return this.responseTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Long getQueuePosition() {
        return this.queuePosition;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Long getLowestQueuePosition() {
        return this.lowestQueuePosition;
    }

    @NotNull
    public final WsActivityEventDataDto copy(@Nullable String name, @Nullable String avatarUrl, @Nullable Double lastRead, @Nullable WsResponseTimeDto responseTime, @Nullable Long queuePosition, @Nullable Long lowestQueuePosition) {
        return new WsActivityEventDataDto(name, avatarUrl, lastRead, responseTime, queuePosition, lowestQueuePosition);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WsActivityEventDataDto)) {
            return false;
        }
        WsActivityEventDataDto wsActivityEventDataDto = (WsActivityEventDataDto) other;
        return Intrinsics.areEqual(this.name, wsActivityEventDataDto.name) && Intrinsics.areEqual(this.avatarUrl, wsActivityEventDataDto.avatarUrl) && Intrinsics.areEqual((Object) this.lastRead, (Object) wsActivityEventDataDto.lastRead) && Intrinsics.areEqual(this.responseTime, wsActivityEventDataDto.responseTime) && Intrinsics.areEqual(this.queuePosition, wsActivityEventDataDto.queuePosition) && Intrinsics.areEqual(this.lowestQueuePosition, wsActivityEventDataDto.lowestQueuePosition);
    }

    @Nullable
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    @Nullable
    public final Double getLastRead() {
        return this.lastRead;
    }

    @Nullable
    public final Long getLowestQueuePosition() {
        return this.lowestQueuePosition;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final Long getQueuePosition() {
        return this.queuePosition;
    }

    @Nullable
    public final WsResponseTimeDto getResponseTime() {
        return this.responseTime;
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.avatarUrl;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d3 = this.lastRead;
        int iHashCode3 = (iHashCode2 + (d3 == null ? 0 : d3.hashCode())) * 31;
        WsResponseTimeDto wsResponseTimeDto = this.responseTime;
        int iHashCode4 = (iHashCode3 + (wsResponseTimeDto == null ? 0 : wsResponseTimeDto.hashCode())) * 31;
        Long l = this.queuePosition;
        int iHashCode5 = (iHashCode4 + (l == null ? 0 : l.hashCode())) * 31;
        Long l7 = this.lowestQueuePosition;
        return iHashCode5 + (l7 != null ? l7.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.name;
        String str2 = this.avatarUrl;
        Double d3 = this.lastRead;
        WsResponseTimeDto wsResponseTimeDto = this.responseTime;
        Long l = this.queuePosition;
        Long l7 = this.lowestQueuePosition;
        StringBuilder sbT = f.t("WsActivityEventDataDto(name=", str, ", avatarUrl=", str2, ", lastRead=");
        sbT.append(d3);
        sbT.append(", responseTime=");
        sbT.append(wsResponseTimeDto);
        sbT.append(", queuePosition=");
        sbT.append(l);
        sbT.append(", lowestQueuePosition=");
        sbT.append(l7);
        sbT.append(")");
        return sbT.toString();
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/conversationkit/android/internal/faye/WsActivityEventDataDto$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/conversationkit/android/internal/faye/WsActivityEventDataDto;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return WsActivityEventDataDto$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public WsActivityEventDataDto() {
        this((String) null, (String) null, (Double) null, (WsResponseTimeDto) null, (Long) null, (Long) null, 63, (DefaultConstructorMarker) null);
    }

    public WsActivityEventDataDto(@Nullable String str, @Nullable String str2, @Nullable Double d3, @Nullable WsResponseTimeDto wsResponseTimeDto, @Nullable Long l, @Nullable Long l7) {
        this.name = str;
        this.avatarUrl = str2;
        this.lastRead = d3;
        this.responseTime = wsResponseTimeDto;
        this.queuePosition = l;
        this.lowestQueuePosition = l7;
    }

    public /* synthetic */ WsActivityEventDataDto(String str, String str2, Double d3, WsResponseTimeDto wsResponseTimeDto, Long l, Long l7, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : d3, (i11 & 8) != 0 ? null : wsResponseTimeDto, (i11 & 16) != 0 ? null : l, (i11 & 32) != 0 ? null : l7);
    }
}
