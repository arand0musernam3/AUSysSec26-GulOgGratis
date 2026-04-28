package zendesk.android.internal.proactivemessaging.campaigntriggerservice.model;

import e0.f;
import i90.g;
import i90.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.c1;
import m90.d;
import m90.m1;
import m90.r1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import u70.j;
import u70.l;
import u70.m;
import uu.a;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@h
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0081\b\u0018\u0000 .2\u00020\u0001:\u0002/.B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB=\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ4\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0018J\u0010\u0010 \u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b \u0010\u001cJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u0018R&\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010)\u0012\u0004\b+\u0010(\u001a\u0004\b*\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010\u001c¨\u00060"}, d2 = {"Lzendesk/android/internal/proactivemessaging/campaigntriggerservice/model/CampaignPathDto;", "", "", "campaignId", "", "pathIds", "", "version", "<init>", "(Ljava/lang/String;Ljava/util/List;I)V", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;ILm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$zendesk_zendesk_android", "(Lzendesk/android/internal/proactivemessaging/campaigntriggerservice/model/CampaignPathDto;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "()I", "copy", "(Ljava/lang/String;Ljava/util/List;I)Lzendesk/android/internal/proactivemessaging/campaigntriggerservice/model/CampaignPathDto;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCampaignId", "getCampaignId$annotations", "()V", "Ljava/util/List;", "getPathIds", "getPathIds$annotations", "I", "getVersion", "Companion", "$serializer", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class CampaignPathDto {

    @NotNull
    private final String campaignId;

    @NotNull
    private final List<String> pathIds;
    private final int version;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final j[] $childSerializers = {null, l.a(m.PUBLICATION, new a(5)), null};

    public /* synthetic */ CampaignPathDto(int i11, String str, List list, int i12, m1 m1Var) {
        if (7 != (i11 & 7)) {
            c1.j(i11, 7, CampaignPathDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.campaignId = str;
        this.pathIds = list;
        this.version = i12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new d(r1.f29848a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CampaignPathDto copy$default(CampaignPathDto campaignPathDto, String str, List list, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = campaignPathDto.campaignId;
        }
        if ((i12 & 2) != 0) {
            list = campaignPathDto.pathIds;
        }
        if ((i12 & 4) != 0) {
            i11 = campaignPathDto.version;
        }
        return campaignPathDto.copy(str, list, i11);
    }

    public static final /* synthetic */ void write$Self$zendesk_zendesk_android(CampaignPathDto self, b output, SerialDescriptor serialDesc) {
        j[] jVarArr = $childSerializers;
        output.q(serialDesc, 0, self.campaignId);
        output.i(serialDesc, 1, (KSerializer) jVarArr[1].getValue(), self.pathIds);
        output.m(2, self.version, serialDesc);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCampaignId() {
        return this.campaignId;
    }

    @NotNull
    public final List<String> component2() {
        return this.pathIds;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    @NotNull
    public final CampaignPathDto copy(@NotNull String campaignId, @NotNull List<String> pathIds, int version) {
        campaignId.getClass();
        pathIds.getClass();
        return new CampaignPathDto(campaignId, pathIds, version);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CampaignPathDto)) {
            return false;
        }
        CampaignPathDto campaignPathDto = (CampaignPathDto) other;
        return Intrinsics.areEqual(this.campaignId, campaignPathDto.campaignId) && Intrinsics.areEqual(this.pathIds, campaignPathDto.pathIds) && this.version == campaignPathDto.version;
    }

    @NotNull
    public final String getCampaignId() {
        return this.campaignId;
    }

    @NotNull
    public final List<String> getPathIds() {
        return this.pathIds;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return Integer.hashCode(this.version) + f.c(this.pathIds, this.campaignId.hashCode() * 31, 31);
    }

    @NotNull
    public String toString() {
        String str = this.campaignId;
        List<String> list = this.pathIds;
        int i11 = this.version;
        StringBuilder sb2 = new StringBuilder("CampaignPathDto(campaignId=");
        sb2.append(str);
        sb2.append(", pathIds=");
        sb2.append(list);
        sb2.append(", version=");
        return k.i(i11, ")", sb2);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/android/internal/proactivemessaging/campaigntriggerservice/model/CampaignPathDto$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/android/internal/proactivemessaging/campaigntriggerservice/model/CampaignPathDto;", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return CampaignPathDto$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @g("pcm_id")
    public static /* synthetic */ void getCampaignId$annotations() {
    }

    @g("path_ids")
    public static /* synthetic */ void getPathIds$annotations() {
    }

    public CampaignPathDto(@NotNull String str, @NotNull List<String> list, int i11) {
        str.getClass();
        list.getClass();
        this.campaignId = str;
        this.pathIds = list;
        this.version = i11;
    }
}
