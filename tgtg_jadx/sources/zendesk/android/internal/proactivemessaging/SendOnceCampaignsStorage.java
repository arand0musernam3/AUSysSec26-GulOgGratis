package zendesk.android.internal.proactivemessaging;

import e0.f;
import i90.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import m90.c1;
import m90.d;
import m90.m1;
import m90.r1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.j;
import u70.l;
import u70.m;
import yu.a;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@h
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081\b\u0018\u0000 #2\u00020\u0001:\u0002$#B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0017\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010\u0016¨\u0006%"}, d2 = {"Lzendesk/android/internal/proactivemessaging/SendOnceCampaignsStorage;", "", "", "", "campaignIds", "<init>", "(Ljava/util/List;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/util/List;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$zendesk_zendesk_android", "(Lzendesk/android/internal/proactivemessaging/SendOnceCampaignsStorage;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lzendesk/android/internal/proactivemessaging/SendOnceCampaignsStorage;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getCampaignIds", "Companion", "$serializer", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class SendOnceCampaignsStorage {

    @NotNull
    private final List<String> campaignIds;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final j[] $childSerializers = {l.a(m.PUBLICATION, new a(17))};

    public /* synthetic */ SendOnceCampaignsStorage(int i11, List list, m1 m1Var) {
        if (1 == (i11 & 1)) {
            this.campaignIds = list;
        } else {
            c1.j(i11, 1, SendOnceCampaignsStorage$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new d(r1.f29848a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SendOnceCampaignsStorage copy$default(SendOnceCampaignsStorage sendOnceCampaignsStorage, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = sendOnceCampaignsStorage.campaignIds;
        }
        return sendOnceCampaignsStorage.copy(list);
    }

    @NotNull
    public final List<String> component1() {
        return this.campaignIds;
    }

    @NotNull
    public final SendOnceCampaignsStorage copy(@NotNull List<String> campaignIds) {
        campaignIds.getClass();
        return new SendOnceCampaignsStorage(campaignIds);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SendOnceCampaignsStorage) && Intrinsics.areEqual(this.campaignIds, ((SendOnceCampaignsStorage) other).campaignIds);
    }

    @NotNull
    public final List<String> getCampaignIds() {
        return this.campaignIds;
    }

    public int hashCode() {
        return this.campaignIds.hashCode();
    }

    @NotNull
    public String toString() {
        return f.m("SendOnceCampaignsStorage(campaignIds=", ")", this.campaignIds);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/android/internal/proactivemessaging/SendOnceCampaignsStorage$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/android/internal/proactivemessaging/SendOnceCampaignsStorage;", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return SendOnceCampaignsStorage$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public SendOnceCampaignsStorage(@NotNull List<String> list) {
        list.getClass();
        this.campaignIds = list;
    }
}
