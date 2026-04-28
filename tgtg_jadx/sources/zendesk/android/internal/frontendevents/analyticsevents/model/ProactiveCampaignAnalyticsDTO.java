package zendesk.android.internal.frontendevents.analyticsevents.model;

import i90.h;
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
import r8.k;
import tr.e;
import u70.j;
import u70.l;
import u70.m;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@h
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\r\b\u0081\b\u0018\u0000 12\u00020\u0001:\u000221B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bBK\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001aJB\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u001aJ\u0010\u0010$\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b$\u0010\u001fJ\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b-\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b/\u0010\u001fR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b0\u0010\u001a¨\u00063"}, d2 = {"Lzendesk/android/internal/frontendevents/analyticsevents/model/ProactiveCampaignAnalyticsDTO;", "", "", "campaignId", "Lzendesk/android/internal/frontendevents/analyticsevents/model/ProactiveCampaignAnalyticsAction;", "action", "timestamp", "", "version", "visitorId", "<init>", "(Ljava/lang/String;Lzendesk/android/internal/frontendevents/analyticsevents/model/ProactiveCampaignAnalyticsAction;Ljava/lang/String;ILjava/lang/String;)V", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Lzendesk/android/internal/frontendevents/analyticsevents/model/ProactiveCampaignAnalyticsAction;Ljava/lang/String;ILjava/lang/String;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$zendesk_zendesk_android", "(Lzendesk/android/internal/frontendevents/analyticsevents/model/ProactiveCampaignAnalyticsDTO;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lzendesk/android/internal/frontendevents/analyticsevents/model/ProactiveCampaignAnalyticsAction;", "component3", "component4", "()I", "component5", "copy", "(Ljava/lang/String;Lzendesk/android/internal/frontendevents/analyticsevents/model/ProactiveCampaignAnalyticsAction;Ljava/lang/String;ILjava/lang/String;)Lzendesk/android/internal/frontendevents/analyticsevents/model/ProactiveCampaignAnalyticsDTO;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCampaignId", "Lzendesk/android/internal/frontendevents/analyticsevents/model/ProactiveCampaignAnalyticsAction;", "getAction", "getTimestamp", "I", "getVersion", "getVisitorId", "Companion", "$serializer", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ProactiveCampaignAnalyticsDTO {

    @NotNull
    private final ProactiveCampaignAnalyticsAction action;

    @NotNull
    private final String campaignId;

    @NotNull
    private final String timestamp;
    private final int version;

    @NotNull
    private final String visitorId;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final j[] $childSerializers = {null, l.a(m.PUBLICATION, new e(26)), null, null, null};

    public /* synthetic */ ProactiveCampaignAnalyticsDTO(int i11, String str, ProactiveCampaignAnalyticsAction proactiveCampaignAnalyticsAction, String str2, int i12, String str3, m1 m1Var) {
        if (31 != (i11 & 31)) {
            c1.j(i11, 31, ProactiveCampaignAnalyticsDTO$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.campaignId = str;
        this.action = proactiveCampaignAnalyticsAction;
        this.timestamp = str2;
        this.version = i12;
        this.visitorId = str3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return ProactiveCampaignAnalyticsAction.INSTANCE.serializer();
    }

    public static /* synthetic */ ProactiveCampaignAnalyticsDTO copy$default(ProactiveCampaignAnalyticsDTO proactiveCampaignAnalyticsDTO, String str, ProactiveCampaignAnalyticsAction proactiveCampaignAnalyticsAction, String str2, int i11, String str3, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = proactiveCampaignAnalyticsDTO.campaignId;
        }
        if ((i12 & 2) != 0) {
            proactiveCampaignAnalyticsAction = proactiveCampaignAnalyticsDTO.action;
        }
        if ((i12 & 4) != 0) {
            str2 = proactiveCampaignAnalyticsDTO.timestamp;
        }
        if ((i12 & 8) != 0) {
            i11 = proactiveCampaignAnalyticsDTO.version;
        }
        if ((i12 & 16) != 0) {
            str3 = proactiveCampaignAnalyticsDTO.visitorId;
        }
        String str4 = str3;
        String str5 = str2;
        return proactiveCampaignAnalyticsDTO.copy(str, proactiveCampaignAnalyticsAction, str5, i11, str4);
    }

    public static final /* synthetic */ void write$Self$zendesk_zendesk_android(ProactiveCampaignAnalyticsDTO self, b output, SerialDescriptor serialDesc) {
        j[] jVarArr = $childSerializers;
        output.q(serialDesc, 0, self.campaignId);
        output.i(serialDesc, 1, (KSerializer) jVarArr[1].getValue(), self.action);
        output.q(serialDesc, 2, self.timestamp);
        output.m(3, self.version, serialDesc);
        output.q(serialDesc, 4, self.visitorId);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCampaignId() {
        return this.campaignId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ProactiveCampaignAnalyticsAction getAction() {
        return this.action;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getVisitorId() {
        return this.visitorId;
    }

    @NotNull
    public final ProactiveCampaignAnalyticsDTO copy(@NotNull String campaignId, @NotNull ProactiveCampaignAnalyticsAction action, @NotNull String timestamp, int version, @NotNull String visitorId) {
        campaignId.getClass();
        action.getClass();
        timestamp.getClass();
        visitorId.getClass();
        return new ProactiveCampaignAnalyticsDTO(campaignId, action, timestamp, version, visitorId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProactiveCampaignAnalyticsDTO)) {
            return false;
        }
        ProactiveCampaignAnalyticsDTO proactiveCampaignAnalyticsDTO = (ProactiveCampaignAnalyticsDTO) other;
        return Intrinsics.areEqual(this.campaignId, proactiveCampaignAnalyticsDTO.campaignId) && this.action == proactiveCampaignAnalyticsDTO.action && Intrinsics.areEqual(this.timestamp, proactiveCampaignAnalyticsDTO.timestamp) && this.version == proactiveCampaignAnalyticsDTO.version && Intrinsics.areEqual(this.visitorId, proactiveCampaignAnalyticsDTO.visitorId);
    }

    @NotNull
    public final ProactiveCampaignAnalyticsAction getAction() {
        return this.action;
    }

    @NotNull
    public final String getCampaignId() {
        return this.campaignId;
    }

    @NotNull
    public final String getTimestamp() {
        return this.timestamp;
    }

    public final int getVersion() {
        return this.version;
    }

    @NotNull
    public final String getVisitorId() {
        return this.visitorId;
    }

    public int hashCode() {
        return this.visitorId.hashCode() + k.b(this.version, l1.b((this.action.hashCode() + (this.campaignId.hashCode() * 31)) * 31, 31, this.timestamp), 31);
    }

    @NotNull
    public String toString() {
        String str = this.campaignId;
        ProactiveCampaignAnalyticsAction proactiveCampaignAnalyticsAction = this.action;
        String str2 = this.timestamp;
        int i11 = this.version;
        String str3 = this.visitorId;
        StringBuilder sb2 = new StringBuilder("ProactiveCampaignAnalyticsDTO(campaignId=");
        sb2.append(str);
        sb2.append(", action=");
        sb2.append(proactiveCampaignAnalyticsAction);
        sb2.append(", timestamp=");
        sb2.append(str2);
        sb2.append(", version=");
        sb2.append(i11);
        sb2.append(", visitorId=");
        return k.p(sb2, str3, ")");
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/android/internal/frontendevents/analyticsevents/model/ProactiveCampaignAnalyticsDTO$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/android/internal/frontendevents/analyticsevents/model/ProactiveCampaignAnalyticsDTO;", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return ProactiveCampaignAnalyticsDTO$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ProactiveCampaignAnalyticsDTO(@NotNull String str, @NotNull ProactiveCampaignAnalyticsAction proactiveCampaignAnalyticsAction, @NotNull String str2, int i11, @NotNull String str3) {
        str.getClass();
        proactiveCampaignAnalyticsAction.getClass();
        str2.getClass();
        str3.getClass();
        this.campaignId = str;
        this.action = proactiveCampaignAnalyticsAction;
        this.timestamp = str2;
        this.version = i11;
        this.visitorId = str3;
    }
}
