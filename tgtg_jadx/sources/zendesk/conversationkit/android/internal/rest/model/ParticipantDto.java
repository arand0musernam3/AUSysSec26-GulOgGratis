package zendesk.conversationkit.android.internal.rest.model;

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
import m90.l0;
import m90.m1;
import m90.v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@h
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0081\b\u0018\u0000 12\u00020\u0001:\u000221B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ<\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u0019J\u0010\u0010\"\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010(\u0012\u0004\b*\u0010+\u001a\u0004\b)\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b,\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b.\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b0\u0010\u001e¨\u00063"}, d2 = {"Lzendesk/conversationkit/android/internal/rest/model/ParticipantDto;", "", "", "id", "appUserId", "", "unreadCount", "", "lastRead", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;)V", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$zendesk_conversationkit_conversationkit_android", "(Lzendesk/conversationkit/android/internal/rest/model/ParticipantDto;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Integer;", "component4", "()Ljava/lang/Double;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;)Lzendesk/conversationkit/android/internal/rest/model/ParticipantDto;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "getAppUserId", "Ljava/lang/Integer;", "getUnreadCount", "Ljava/lang/Double;", "getLastRead", "Companion", "$serializer", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ParticipantDto {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String appUserId;

    @NotNull
    private final String id;

    @Nullable
    private final Double lastRead;

    @Nullable
    private final Integer unreadCount;

    public /* synthetic */ ParticipantDto(int i11, String str, String str2, Integer num, Double d3, m1 m1Var) {
        if (15 != (i11 & 15)) {
            c1.j(i11, 15, ParticipantDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = str;
        this.appUserId = str2;
        this.unreadCount = num;
        this.lastRead = d3;
    }

    public static /* synthetic */ ParticipantDto copy$default(ParticipantDto participantDto, String str, String str2, Integer num, Double d3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = participantDto.id;
        }
        if ((i11 & 2) != 0) {
            str2 = participantDto.appUserId;
        }
        if ((i11 & 4) != 0) {
            num = participantDto.unreadCount;
        }
        if ((i11 & 8) != 0) {
            d3 = participantDto.lastRead;
        }
        return participantDto.copy(str, str2, num, d3);
    }

    public static final /* synthetic */ void write$Self$zendesk_conversationkit_conversationkit_android(ParticipantDto self, b output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.id);
        output.q(serialDesc, 1, self.appUserId);
        output.r(serialDesc, 2, l0.f29821a, self.unreadCount);
        output.r(serialDesc, 3, v.f29868a, self.lastRead);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAppUserId() {
        return this.appUserId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getUnreadCount() {
        return this.unreadCount;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Double getLastRead() {
        return this.lastRead;
    }

    @NotNull
    public final ParticipantDto copy(@NotNull String id2, @NotNull String appUserId, @Nullable Integer unreadCount, @Nullable Double lastRead) {
        id2.getClass();
        appUserId.getClass();
        return new ParticipantDto(id2, appUserId, unreadCount, lastRead);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ParticipantDto)) {
            return false;
        }
        ParticipantDto participantDto = (ParticipantDto) other;
        return Intrinsics.areEqual(this.id, participantDto.id) && Intrinsics.areEqual(this.appUserId, participantDto.appUserId) && Intrinsics.areEqual(this.unreadCount, participantDto.unreadCount) && Intrinsics.areEqual((Object) this.lastRead, (Object) participantDto.lastRead);
    }

    @NotNull
    public final String getAppUserId() {
        return this.appUserId;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final Double getLastRead() {
        return this.lastRead;
    }

    @Nullable
    public final Integer getUnreadCount() {
        return this.unreadCount;
    }

    public int hashCode() {
        int iB = l1.b(this.id.hashCode() * 31, 31, this.appUserId);
        Integer num = this.unreadCount;
        int iHashCode = (iB + (num == null ? 0 : num.hashCode())) * 31;
        Double d3 = this.lastRead;
        return iHashCode + (d3 != null ? d3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.appUserId;
        Integer num = this.unreadCount;
        Double d3 = this.lastRead;
        StringBuilder sbT = f.t("ParticipantDto(id=", str, ", appUserId=", str2, ", unreadCount=");
        sbT.append(num);
        sbT.append(", lastRead=");
        sbT.append(d3);
        sbT.append(")");
        return sbT.toString();
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/conversationkit/android/internal/rest/model/ParticipantDto$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/conversationkit/android/internal/rest/model/ParticipantDto;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return ParticipantDto$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @g("_id")
    public static /* synthetic */ void getId$annotations() {
    }

    public ParticipantDto(@NotNull String str, @NotNull String str2, @Nullable Integer num, @Nullable Double d3) {
        str.getClass();
        str2.getClass();
        this.id = str;
        this.appUserId = str2;
        this.unreadCount = num;
        this.lastRead = d3;
    }
}
