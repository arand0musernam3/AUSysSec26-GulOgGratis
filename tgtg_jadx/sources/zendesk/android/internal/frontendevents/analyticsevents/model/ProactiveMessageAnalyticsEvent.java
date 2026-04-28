package zendesk.android.internal.frontendevents.analyticsevents.model;

import b3.i;
import e0.f;
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
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0081\b\u0018\u0000 62\u00020\u0001:\u000276B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fBa\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001cJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001cJ\u0010\u0010\"\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\"\u0010#JV\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u001cJ\u0010\u0010'\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010-\u001a\u0004\b/\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b0\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b1\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b2\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b3\u0010\u001cR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00104\u001a\u0004\b5\u0010#¨\u00068"}, d2 = {"Lzendesk/android/internal/frontendevents/analyticsevents/model/ProactiveMessageAnalyticsEvent;", "", "", "buid", "channel", "version", "timestamp", FrontendEventsStorage.KEY_SUID, "idempotencyToken", "Lzendesk/android/internal/frontendevents/analyticsevents/model/ProactiveCampaignAnalyticsDTO;", "proactiveCampaign", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lzendesk/android/internal/frontendevents/analyticsevents/model/ProactiveCampaignAnalyticsDTO;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lzendesk/android/internal/frontendevents/analyticsevents/model/ProactiveCampaignAnalyticsDTO;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$zendesk_zendesk_android", "(Lzendesk/android/internal/frontendevents/analyticsevents/model/ProactiveMessageAnalyticsEvent;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "()Lzendesk/android/internal/frontendevents/analyticsevents/model/ProactiveCampaignAnalyticsDTO;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lzendesk/android/internal/frontendevents/analyticsevents/model/ProactiveCampaignAnalyticsDTO;)Lzendesk/android/internal/frontendevents/analyticsevents/model/ProactiveMessageAnalyticsEvent;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getBuid", "getChannel", "getVersion", "getTimestamp", "getSuid", "getIdempotencyToken", "Lzendesk/android/internal/frontendevents/analyticsevents/model/ProactiveCampaignAnalyticsDTO;", "getProactiveCampaign", "Companion", "$serializer", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ProactiveMessageAnalyticsEvent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String buid;

    @NotNull
    private final String channel;

    @NotNull
    private final String idempotencyToken;

    @NotNull
    private final ProactiveCampaignAnalyticsDTO proactiveCampaign;

    @NotNull
    private final String suid;

    @NotNull
    private final String timestamp;

    @NotNull
    private final String version;

    public /* synthetic */ ProactiveMessageAnalyticsEvent(int i11, String str, String str2, String str3, String str4, String str5, String str6, ProactiveCampaignAnalyticsDTO proactiveCampaignAnalyticsDTO, m1 m1Var) {
        if (127 != (i11 & 127)) {
            c1.j(i11, 127, ProactiveMessageAnalyticsEvent$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.buid = str;
        this.channel = str2;
        this.version = str3;
        this.timestamp = str4;
        this.suid = str5;
        this.idempotencyToken = str6;
        this.proactiveCampaign = proactiveCampaignAnalyticsDTO;
    }

    public static /* synthetic */ ProactiveMessageAnalyticsEvent copy$default(ProactiveMessageAnalyticsEvent proactiveMessageAnalyticsEvent, String str, String str2, String str3, String str4, String str5, String str6, ProactiveCampaignAnalyticsDTO proactiveCampaignAnalyticsDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = proactiveMessageAnalyticsEvent.buid;
        }
        if ((i11 & 2) != 0) {
            str2 = proactiveMessageAnalyticsEvent.channel;
        }
        if ((i11 & 4) != 0) {
            str3 = proactiveMessageAnalyticsEvent.version;
        }
        if ((i11 & 8) != 0) {
            str4 = proactiveMessageAnalyticsEvent.timestamp;
        }
        if ((i11 & 16) != 0) {
            str5 = proactiveMessageAnalyticsEvent.suid;
        }
        if ((i11 & 32) != 0) {
            str6 = proactiveMessageAnalyticsEvent.idempotencyToken;
        }
        if ((i11 & 64) != 0) {
            proactiveCampaignAnalyticsDTO = proactiveMessageAnalyticsEvent.proactiveCampaign;
        }
        String str7 = str6;
        ProactiveCampaignAnalyticsDTO proactiveCampaignAnalyticsDTO2 = proactiveCampaignAnalyticsDTO;
        String str8 = str5;
        String str9 = str3;
        return proactiveMessageAnalyticsEvent.copy(str, str2, str9, str4, str8, str7, proactiveCampaignAnalyticsDTO2);
    }

    public static final /* synthetic */ void write$Self$zendesk_zendesk_android(ProactiveMessageAnalyticsEvent self, b output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.buid);
        output.q(serialDesc, 1, self.channel);
        output.q(serialDesc, 2, self.version);
        output.q(serialDesc, 3, self.timestamp);
        output.q(serialDesc, 4, self.suid);
        output.q(serialDesc, 5, self.idempotencyToken);
        output.i(serialDesc, 6, ProactiveCampaignAnalyticsDTO$$serializer.INSTANCE, self.proactiveCampaign);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBuid() {
        return this.buid;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getChannel() {
        return this.channel;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSuid() {
        return this.suid;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getIdempotencyToken() {
        return this.idempotencyToken;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final ProactiveCampaignAnalyticsDTO getProactiveCampaign() {
        return this.proactiveCampaign;
    }

    @NotNull
    public final ProactiveMessageAnalyticsEvent copy(@NotNull String buid, @NotNull String channel, @NotNull String version, @NotNull String timestamp, @NotNull String suid, @NotNull String idempotencyToken, @NotNull ProactiveCampaignAnalyticsDTO proactiveCampaign) {
        i.B(buid, channel, version, timestamp, suid);
        idempotencyToken.getClass();
        proactiveCampaign.getClass();
        return new ProactiveMessageAnalyticsEvent(buid, channel, version, timestamp, suid, idempotencyToken, proactiveCampaign);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProactiveMessageAnalyticsEvent)) {
            return false;
        }
        ProactiveMessageAnalyticsEvent proactiveMessageAnalyticsEvent = (ProactiveMessageAnalyticsEvent) other;
        return Intrinsics.areEqual(this.buid, proactiveMessageAnalyticsEvent.buid) && Intrinsics.areEqual(this.channel, proactiveMessageAnalyticsEvent.channel) && Intrinsics.areEqual(this.version, proactiveMessageAnalyticsEvent.version) && Intrinsics.areEqual(this.timestamp, proactiveMessageAnalyticsEvent.timestamp) && Intrinsics.areEqual(this.suid, proactiveMessageAnalyticsEvent.suid) && Intrinsics.areEqual(this.idempotencyToken, proactiveMessageAnalyticsEvent.idempotencyToken) && Intrinsics.areEqual(this.proactiveCampaign, proactiveMessageAnalyticsEvent.proactiveCampaign);
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
    public final String getIdempotencyToken() {
        return this.idempotencyToken;
    }

    @NotNull
    public final ProactiveCampaignAnalyticsDTO getProactiveCampaign() {
        return this.proactiveCampaign;
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
    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return this.proactiveCampaign.hashCode() + l1.b(l1.b(l1.b(l1.b(l1.b(this.buid.hashCode() * 31, 31, this.channel), 31, this.version), 31, this.timestamp), 31, this.suid), 31, this.idempotencyToken);
    }

    @NotNull
    public String toString() {
        String str = this.buid;
        String str2 = this.channel;
        String str3 = this.version;
        String str4 = this.timestamp;
        String str5 = this.suid;
        String str6 = this.idempotencyToken;
        ProactiveCampaignAnalyticsDTO proactiveCampaignAnalyticsDTO = this.proactiveCampaign;
        StringBuilder sbT = f.t("ProactiveMessageAnalyticsEvent(buid=", str, ", channel=", str2, ", version=");
        s.A(sbT, str3, ", timestamp=", str4, ", suid=");
        s.A(sbT, str5, ", idempotencyToken=", str6, ", proactiveCampaign=");
        sbT.append(proactiveCampaignAnalyticsDTO);
        sbT.append(")");
        return sbT.toString();
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/android/internal/frontendevents/analyticsevents/model/ProactiveMessageAnalyticsEvent$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/android/internal/frontendevents/analyticsevents/model/ProactiveMessageAnalyticsEvent;", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return ProactiveMessageAnalyticsEvent$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ProactiveMessageAnalyticsEvent(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull ProactiveCampaignAnalyticsDTO proactiveCampaignAnalyticsDTO) {
        i.B(str, str2, str3, str4, str5);
        str6.getClass();
        proactiveCampaignAnalyticsDTO.getClass();
        this.buid = str;
        this.channel = str2;
        this.version = str3;
        this.timestamp = str4;
        this.suid = str5;
        this.idempotencyToken = str6;
        this.proactiveCampaign = proactiveCampaignAnalyticsDTO;
    }
}
