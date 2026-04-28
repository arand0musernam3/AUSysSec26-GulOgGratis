package zendesk.analyticskit.android.internal.model;

import b3.i;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w2.l1;
import zendesk.android.internal.frontendevents.FrontendEventsStorage;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@h
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0081\b\u0018\u0000 ;2\u00020\u0001:\u0002<;BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rBk\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001dJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001dJ\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001dJ\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001dJ\u0010\u0010$\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b$\u0010%J`\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u001dJ\u0010\u0010)\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010/\u001a\u0004\b1\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b2\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b3\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b4\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b5\u0010\u001dR \u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010/\u0012\u0004\b7\u00108\u001a\u0004\b6\u0010\u001dR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00109\u001a\u0004\b:\u0010%¨\u0006="}, d2 = {"Lzendesk/analyticskit/android/internal/model/AnalyticsEventDto;", "", "", "buid", FrontendEventsStorage.KEY_SUID, "uuid", "version", "channel", "timestamp", "acceptLanguage", "Lzendesk/analyticskit/android/internal/model/UserActionDto;", "userAction", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lzendesk/analyticskit/android/internal/model/UserActionDto;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lzendesk/analyticskit/android/internal/model/UserActionDto;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$zendesk_analyticskit_analyticskit_android", "(Lzendesk/analyticskit/android/internal/model/AnalyticsEventDto;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "()Lzendesk/analyticskit/android/internal/model/UserActionDto;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lzendesk/analyticskit/android/internal/model/UserActionDto;)Lzendesk/analyticskit/android/internal/model/AnalyticsEventDto;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getBuid", "getSuid", "getUuid", "getVersion", "getChannel", "getTimestamp", "getAcceptLanguage", "getAcceptLanguage$annotations", "()V", "Lzendesk/analyticskit/android/internal/model/UserActionDto;", "getUserAction", "Companion", "$serializer", "zendesk.analyticskit_analyticskit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class AnalyticsEventDto {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String acceptLanguage;

    @NotNull
    private final String buid;

    @NotNull
    private final String channel;

    @NotNull
    private final String suid;

    @NotNull
    private final String timestamp;

    @NotNull
    private final UserActionDto userAction;

    @NotNull
    private final String uuid;

    @NotNull
    private final String version;

    public /* synthetic */ AnalyticsEventDto(int i11, String str, String str2, String str3, String str4, String str5, String str6, String str7, UserActionDto userActionDto, m1 m1Var) {
        if (255 != (i11 & 255)) {
            c1.j(i11, 255, AnalyticsEventDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.buid = str;
        this.suid = str2;
        this.uuid = str3;
        this.version = str4;
        this.channel = str5;
        this.timestamp = str6;
        this.acceptLanguage = str7;
        this.userAction = userActionDto;
    }

    public static /* synthetic */ AnalyticsEventDto copy$default(AnalyticsEventDto analyticsEventDto, String str, String str2, String str3, String str4, String str5, String str6, String str7, UserActionDto userActionDto, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = analyticsEventDto.buid;
        }
        if ((i11 & 2) != 0) {
            str2 = analyticsEventDto.suid;
        }
        if ((i11 & 4) != 0) {
            str3 = analyticsEventDto.uuid;
        }
        if ((i11 & 8) != 0) {
            str4 = analyticsEventDto.version;
        }
        if ((i11 & 16) != 0) {
            str5 = analyticsEventDto.channel;
        }
        if ((i11 & 32) != 0) {
            str6 = analyticsEventDto.timestamp;
        }
        if ((i11 & 64) != 0) {
            str7 = analyticsEventDto.acceptLanguage;
        }
        if ((i11 & 128) != 0) {
            userActionDto = analyticsEventDto.userAction;
        }
        String str8 = str7;
        UserActionDto userActionDto2 = userActionDto;
        String str9 = str5;
        String str10 = str6;
        return analyticsEventDto.copy(str, str2, str3, str4, str9, str10, str8, userActionDto2);
    }

    public static final /* synthetic */ void write$Self$zendesk_analyticskit_analyticskit_android(AnalyticsEventDto self, b output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.buid);
        output.q(serialDesc, 1, self.suid);
        output.q(serialDesc, 2, self.uuid);
        output.q(serialDesc, 3, self.version);
        output.q(serialDesc, 4, self.channel);
        output.q(serialDesc, 5, self.timestamp);
        output.q(serialDesc, 6, self.acceptLanguage);
        output.i(serialDesc, 7, UserActionDto$$serializer.INSTANCE, self.userAction);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBuid() {
        return this.buid;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSuid() {
        return this.suid;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUuid() {
        return this.uuid;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getChannel() {
        return this.channel;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final UserActionDto getUserAction() {
        return this.userAction;
    }

    @NotNull
    public final AnalyticsEventDto copy(@NotNull String buid, @NotNull String suid, @NotNull String uuid, @NotNull String version, @NotNull String channel, @NotNull String timestamp, @NotNull String acceptLanguage, @NotNull UserActionDto userAction) {
        i.B(buid, suid, uuid, version, channel);
        timestamp.getClass();
        acceptLanguage.getClass();
        userAction.getClass();
        return new AnalyticsEventDto(buid, suid, uuid, version, channel, timestamp, acceptLanguage, userAction);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnalyticsEventDto)) {
            return false;
        }
        AnalyticsEventDto analyticsEventDto = (AnalyticsEventDto) other;
        return Intrinsics.areEqual(this.buid, analyticsEventDto.buid) && Intrinsics.areEqual(this.suid, analyticsEventDto.suid) && Intrinsics.areEqual(this.uuid, analyticsEventDto.uuid) && Intrinsics.areEqual(this.version, analyticsEventDto.version) && Intrinsics.areEqual(this.channel, analyticsEventDto.channel) && Intrinsics.areEqual(this.timestamp, analyticsEventDto.timestamp) && Intrinsics.areEqual(this.acceptLanguage, analyticsEventDto.acceptLanguage) && Intrinsics.areEqual(this.userAction, analyticsEventDto.userAction);
    }

    @NotNull
    public final String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    @NotNull
    public final String getBuid() {
        return this.buid;
    }

    @NotNull
    public final String getChannel() {
        return this.channel;
    }

    @NotNull
    public final String getSuid() {
        return this.suid;
    }

    @NotNull
    public final String getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final UserActionDto getUserAction() {
        return this.userAction;
    }

    @NotNull
    public final String getUuid() {
        return this.uuid;
    }

    @NotNull
    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return this.userAction.hashCode() + l1.b(l1.b(l1.b(l1.b(l1.b(l1.b(this.buid.hashCode() * 31, 31, this.suid), 31, this.uuid), 31, this.version), 31, this.channel), 31, this.timestamp), 31, this.acceptLanguage);
    }

    @NotNull
    public String toString() {
        String str = this.buid;
        String str2 = this.suid;
        String str3 = this.uuid;
        String str4 = this.version;
        String str5 = this.channel;
        String str6 = this.timestamp;
        String str7 = this.acceptLanguage;
        UserActionDto userActionDto = this.userAction;
        StringBuilder sbT = f.t("AnalyticsEventDto(buid=", str, ", suid=", str2, ", uuid=");
        s.A(sbT, str3, ", version=", str4, ", channel=");
        s.A(sbT, str5, ", timestamp=", str6, ", acceptLanguage=");
        sbT.append(str7);
        sbT.append(", userAction=");
        sbT.append(userActionDto);
        sbT.append(")");
        return sbT.toString();
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/analyticskit/android/internal/model/AnalyticsEventDto$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/analyticskit/android/internal/model/AnalyticsEventDto;", "zendesk.analyticskit_analyticskit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return AnalyticsEventDto$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @g("accept_language")
    public static /* synthetic */ void getAcceptLanguage$annotations() {
    }

    public AnalyticsEventDto(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull UserActionDto userActionDto) {
        i.B(str, str2, str3, str4, str5);
        str6.getClass();
        str7.getClass();
        userActionDto.getClass();
        this.buid = str;
        this.suid = str2;
        this.uuid = str3;
        this.version = str4;
        this.channel = str5;
        this.timestamp = str6;
        this.acceptLanguage = str7;
        this.userAction = userActionDto;
    }
}
