package zendesk.android.internal.proactivemessaging.model;

import e0.f;
import i90.g;
import i90.h;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.c1;
import m90.d;
import m90.m1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import u70.j;
import u70.l;
import u70.m;
import xw.a;
import zendesk.android.internal.proactivemessaging.model.Status;
import zendesk.android.pageviewevents.PageView;
import zendesk.conversationkit.android.model.VisitType;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@h
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0081\b\u0018\u0000 O2\u00020\u0001:\u0002POBE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012Be\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0011\u0010\u0016J'\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ+\u0010&\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b0\u00101J\u0016\u00102\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b4\u00105J\\\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u0010\u001a\u00020\u000fHÆ\u0001¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b8\u0010)J\u0010\u00109\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b9\u00105J\u001a\u0010<\u001a\u00020;2\b\u0010:\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b<\u0010=R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010>\u0012\u0004\b@\u0010A\u001a\u0004\b?\u0010)R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010B\u001a\u0004\bC\u0010+R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010D\u0012\u0004\bF\u0010A\u001a\u0004\bE\u0010-R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010G\u001a\u0004\bH\u0010/R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010I\u001a\u0004\bJ\u00101R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010K\u001a\u0004\bL\u00103R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010M\u001a\u0004\bN\u00105¨\u0006Q"}, d2 = {"Lzendesk/android/internal/proactivemessaging/model/Campaign;", "", "", "campaignId", "Lzendesk/android/internal/proactivemessaging/model/Integration;", "integration", "Lzendesk/android/internal/proactivemessaging/model/Trigger;", "trigger", "Lzendesk/android/internal/proactivemessaging/model/Schedule;", "schedule", "Lzendesk/android/internal/proactivemessaging/model/Status;", "status", "", "Lzendesk/android/internal/proactivemessaging/model/Path;", "paths", "", "version", "<init>", "(Ljava/lang/String;Lzendesk/android/internal/proactivemessaging/model/Integration;Lzendesk/android/internal/proactivemessaging/model/Trigger;Lzendesk/android/internal/proactivemessaging/model/Schedule;Lzendesk/android/internal/proactivemessaging/model/Status;Ljava/util/List;I)V", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Lzendesk/android/internal/proactivemessaging/model/Integration;Lzendesk/android/internal/proactivemessaging/model/Trigger;Lzendesk/android/internal/proactivemessaging/model/Schedule;Lzendesk/android/internal/proactivemessaging/model/Status;Ljava/util/List;ILm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$zendesk_zendesk_android", "(Lzendesk/android/internal/proactivemessaging/model/Campaign;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lzendesk/android/pageviewevents/PageView;", "event", "Ljava/util/Locale;", "locale", "Lzendesk/conversationkit/android/model/VisitType;", "visitType", "evaluate", "(Lzendesk/android/pageviewevents/PageView;Ljava/util/Locale;Lzendesk/conversationkit/android/model/VisitType;)Ljava/util/List;", "component1", "()Ljava/lang/String;", "component2", "()Lzendesk/android/internal/proactivemessaging/model/Integration;", "component3", "()Lzendesk/android/internal/proactivemessaging/model/Trigger;", "component4", "()Lzendesk/android/internal/proactivemessaging/model/Schedule;", "component5", "()Lzendesk/android/internal/proactivemessaging/model/Status;", "component6", "()Ljava/util/List;", "component7", "()I", "copy", "(Ljava/lang/String;Lzendesk/android/internal/proactivemessaging/model/Integration;Lzendesk/android/internal/proactivemessaging/model/Trigger;Lzendesk/android/internal/proactivemessaging/model/Schedule;Lzendesk/android/internal/proactivemessaging/model/Status;Ljava/util/List;I)Lzendesk/android/internal/proactivemessaging/model/Campaign;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCampaignId", "getCampaignId$annotations", "()V", "Lzendesk/android/internal/proactivemessaging/model/Integration;", "getIntegration", "Lzendesk/android/internal/proactivemessaging/model/Trigger;", "getTrigger", "getTrigger$annotations", "Lzendesk/android/internal/proactivemessaging/model/Schedule;", "getSchedule", "Lzendesk/android/internal/proactivemessaging/model/Status;", "getStatus", "Ljava/util/List;", "getPaths", "I", "getVersion", "Companion", "$serializer", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCampaign.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Campaign.kt\nzendesk/android/internal/proactivemessaging/model/Campaign\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,67:1\n1869#2:68\n1869#2,2:69\n1870#2:71\n*S KotlinDebug\n*F\n+ 1 Campaign.kt\nzendesk/android/internal/proactivemessaging/model/Campaign\n*L\n50#1:68\n52#1:69,2\n50#1:71\n*E\n"})
public final /* data */ class Campaign {

    @NotNull
    private final String campaignId;

    @NotNull
    private final Integration integration;

    @NotNull
    private final List<Path> paths;

    @NotNull
    private final Schedule schedule;

    @NotNull
    private final Status status;

    @NotNull
    private final Trigger trigger;
    private final int version;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final j[] $childSerializers = {null, null, null, null, null, l.a(m.PUBLICATION, new a(17)), null};

    public Campaign(@NotNull String str, @NotNull Integration integration, @NotNull Trigger trigger, @NotNull Schedule schedule, @NotNull Status status, @NotNull List<Path> list, int i11) {
        str.getClass();
        integration.getClass();
        trigger.getClass();
        schedule.getClass();
        status.getClass();
        list.getClass();
        this.campaignId = str;
        this.integration = integration;
        this.trigger = trigger;
        this.schedule = schedule;
        this.status = status;
        this.paths = list;
        this.version = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new d(Path$$serializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Campaign copy$default(Campaign campaign, String str, Integration integration, Trigger trigger, Schedule schedule, Status status, List list, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = campaign.campaignId;
        }
        if ((i12 & 2) != 0) {
            integration = campaign.integration;
        }
        if ((i12 & 4) != 0) {
            trigger = campaign.trigger;
        }
        if ((i12 & 8) != 0) {
            schedule = campaign.schedule;
        }
        if ((i12 & 16) != 0) {
            status = campaign.status;
        }
        if ((i12 & 32) != 0) {
            list = campaign.paths;
        }
        if ((i12 & 64) != 0) {
            i11 = campaign.version;
        }
        List list2 = list;
        int i13 = i11;
        Status status2 = status;
        Trigger trigger2 = trigger;
        return campaign.copy(str, integration, trigger2, schedule, status2, list2, i13);
    }

    public static final /* synthetic */ void write$Self$zendesk_zendesk_android(Campaign self, b output, SerialDescriptor serialDesc) {
        j[] jVarArr = $childSerializers;
        output.q(serialDesc, 0, self.campaignId);
        output.i(serialDesc, 1, Integration$$serializer.INSTANCE, self.integration);
        output.i(serialDesc, 2, Trigger$$serializer.INSTANCE, self.trigger);
        output.i(serialDesc, 3, Schedule$$serializer.INSTANCE, self.schedule);
        output.i(serialDesc, 4, Status.StatusSerializer.INSTANCE, self.status);
        output.i(serialDesc, 5, (KSerializer) jVarArr[5].getValue(), self.paths);
        output.m(6, self.version, serialDesc);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCampaignId() {
        return this.campaignId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integration getIntegration() {
        return this.integration;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Trigger getTrigger() {
        return this.trigger;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Schedule getSchedule() {
        return this.schedule;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Status getStatus() {
        return this.status;
    }

    @NotNull
    public final List<Path> component6() {
        return this.paths;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    @NotNull
    public final Campaign copy(@NotNull String campaignId, @NotNull Integration integration, @NotNull Trigger trigger, @NotNull Schedule schedule, @NotNull Status status, @NotNull List<Path> paths, int version) {
        campaignId.getClass();
        integration.getClass();
        trigger.getClass();
        schedule.getClass();
        status.getClass();
        paths.getClass();
        return new Campaign(campaignId, integration, trigger, schedule, status, paths, version);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Campaign)) {
            return false;
        }
        Campaign campaign = (Campaign) other;
        return Intrinsics.areEqual(this.campaignId, campaign.campaignId) && Intrinsics.areEqual(this.integration, campaign.integration) && Intrinsics.areEqual(this.trigger, campaign.trigger) && Intrinsics.areEqual(this.schedule, campaign.schedule) && this.status == campaign.status && Intrinsics.areEqual(this.paths, campaign.paths) && this.version == campaign.version;
    }

    @NotNull
    public final List<Path> evaluate(@NotNull PageView event, @NotNull Locale locale, @NotNull VisitType visitType) {
        boolean z11;
        event.getClass();
        locale.getClass();
        visitType.getClass();
        ArrayList arrayList = new ArrayList();
        for (Path path : this.paths) {
            while (true) {
                for (Expression expression : path.getCondition().getExpressions()) {
                    z11 = z11 && expression.evaluate$zendesk_zendesk_android(event, locale, visitType);
                }
            }
            if (z11) {
                arrayList.add(path);
            }
        }
        return arrayList;
    }

    @NotNull
    public final String getCampaignId() {
        return this.campaignId;
    }

    @NotNull
    public final Integration getIntegration() {
        return this.integration;
    }

    @NotNull
    public final List<Path> getPaths() {
        return this.paths;
    }

    @NotNull
    public final Schedule getSchedule() {
        return this.schedule;
    }

    @NotNull
    public final Status getStatus() {
        return this.status;
    }

    @NotNull
    public final Trigger getTrigger() {
        return this.trigger;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return Integer.hashCode(this.version) + f.c(this.paths, (this.status.hashCode() + ((this.schedule.hashCode() + ((this.trigger.hashCode() + ((this.integration.hashCode() + (this.campaignId.hashCode() * 31)) * 31)) * 31)) * 31)) * 31, 31);
    }

    @NotNull
    public String toString() {
        String str = this.campaignId;
        Integration integration = this.integration;
        Trigger trigger = this.trigger;
        Schedule schedule = this.schedule;
        Status status = this.status;
        List<Path> list = this.paths;
        int i11 = this.version;
        StringBuilder sb2 = new StringBuilder("Campaign(campaignId=");
        sb2.append(str);
        sb2.append(", integration=");
        sb2.append(integration);
        sb2.append(", trigger=");
        sb2.append(trigger);
        sb2.append(", schedule=");
        sb2.append(schedule);
        sb2.append(", status=");
        sb2.append(status);
        sb2.append(", paths=");
        sb2.append(list);
        sb2.append(", version=");
        return k.i(i11, ")", sb2);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/android/internal/proactivemessaging/model/Campaign$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/android/internal/proactivemessaging/model/Campaign;", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return Campaign$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @g("campaign_id")
    public static /* synthetic */ void getCampaignId$annotations() {
    }

    @g("when")
    public static /* synthetic */ void getTrigger$annotations() {
    }

    public /* synthetic */ Campaign(int i11, String str, Integration integration, Trigger trigger, Schedule schedule, Status status, List list, int i12, m1 m1Var) {
        if (127 != (i11 & 127)) {
            c1.j(i11, 127, Campaign$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.campaignId = str;
        this.integration = integration;
        this.trigger = trigger;
        this.schedule = schedule;
        this.status = status;
        this.paths = list;
        this.version = i12;
    }
}
