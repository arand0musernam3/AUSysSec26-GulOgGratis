package zendesk.faye.internal;

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
import m90.m1;
import m90.r1;
import n90.n;
import n90.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import w.a0;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@h
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0081\b\u0018\u0000 72\u00020\u0001:\u000287B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nBM\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJF\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R \u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010*\u0012\u0004\b,\u0010-\u001a\u0004\b+\u0010\u001aR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010*\u0012\u0004\b/\u0010-\u001a\u0004\b.\u0010\u001aR \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010*\u0012\u0004\b1\u0010-\u001a\u0004\b0\u0010\u001aR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0007\u00102\u0012\u0004\b4\u0010-\u001a\u0004\b3\u0010\u001eR\"\u0010\b\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\b\u0010*\u0012\u0004\b6\u0010-\u001a\u0004\b5\u0010\u001a¨\u00069"}, d2 = {"Lzendesk/faye/internal/SubscribeRequest;", "Lzendesk/faye/internal/BayeuxRequest;", "", "channel", Bayeux.KEY_CLIENT_ID, Bayeux.KEY_SUBSCRIPTION, "Ln90/n;", "ext", "id", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ln90/n;Ljava/lang/String;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ln90/n;Ljava/lang/String;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$zendesk_faye_faye", "(Lzendesk/faye/internal/SubscribeRequest;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ln90/n;", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ln90/n;Ljava/lang/String;)Lzendesk/faye/internal/SubscribeRequest;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getChannel", "getChannel$annotations", "()V", "getClientId", "getClientId$annotations", "getSubscription", "getSubscription$annotations", "Ln90/n;", "getExt", "getExt$annotations", "getId", "getId$annotations", "Companion", "$serializer", "zendesk.faye_faye"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class SubscribeRequest implements BayeuxRequest {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String channel;

    @NotNull
    private final String clientId;

    @Nullable
    private final n ext;

    @Nullable
    private final String id;

    @NotNull
    private final String subscription;

    public /* synthetic */ SubscribeRequest(int i11, String str, String str2, String str3, n nVar, String str4, m1 m1Var) {
        if (7 != (i11 & 7)) {
            c1.j(i11, 7, SubscribeRequest$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.channel = str;
        this.clientId = str2;
        this.subscription = str3;
        if ((i11 & 8) == 0) {
            this.ext = null;
        } else {
            this.ext = nVar;
        }
        if ((i11 & 16) == 0) {
            this.id = null;
        } else {
            this.id = str4;
        }
    }

    public static /* synthetic */ SubscribeRequest copy$default(SubscribeRequest subscribeRequest, String str, String str2, String str3, n nVar, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = subscribeRequest.channel;
        }
        if ((i11 & 2) != 0) {
            str2 = subscribeRequest.clientId;
        }
        if ((i11 & 4) != 0) {
            str3 = subscribeRequest.subscription;
        }
        if ((i11 & 8) != 0) {
            nVar = subscribeRequest.ext;
        }
        if ((i11 & 16) != 0) {
            str4 = subscribeRequest.id;
        }
        String str5 = str4;
        String str6 = str3;
        return subscribeRequest.copy(str, str2, str6, nVar, str5);
    }

    public static final /* synthetic */ void write$Self$zendesk_faye_faye(SubscribeRequest self, b output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.getChannel());
        output.q(serialDesc, 1, self.clientId);
        output.q(serialDesc, 2, self.subscription);
        if (output.C(serialDesc) || self.getExt() != null) {
            output.r(serialDesc, 3, q.f30781a, self.getExt());
        }
        if (!output.C(serialDesc) && self.getId() == null) {
            return;
        }
        output.r(serialDesc, 4, r1.f29848a, self.getId());
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getChannel() {
        return this.channel;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getClientId() {
        return this.clientId;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSubscription() {
        return this.subscription;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final n getExt() {
        return this.ext;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final SubscribeRequest copy(@NotNull String channel, @NotNull String clientId, @NotNull String subscription, @Nullable n ext, @Nullable String id2) {
        channel.getClass();
        clientId.getClass();
        subscription.getClass();
        return new SubscribeRequest(channel, clientId, subscription, ext, id2);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubscribeRequest)) {
            return false;
        }
        SubscribeRequest subscribeRequest = (SubscribeRequest) other;
        return Intrinsics.areEqual(this.channel, subscribeRequest.channel) && Intrinsics.areEqual(this.clientId, subscribeRequest.clientId) && Intrinsics.areEqual(this.subscription, subscribeRequest.subscription) && Intrinsics.areEqual(this.ext, subscribeRequest.ext) && Intrinsics.areEqual(this.id, subscribeRequest.id);
    }

    @Override // zendesk.faye.internal.BayeuxRequest
    @NotNull
    public String getChannel() {
        return this.channel;
    }

    @NotNull
    public final String getClientId() {
        return this.clientId;
    }

    @Override // zendesk.faye.internal.BayeuxRequest
    @Nullable
    public n getExt() {
        return this.ext;
    }

    @Override // zendesk.faye.internal.BayeuxRequest
    @Nullable
    public String getId() {
        return this.id;
    }

    @NotNull
    public final String getSubscription() {
        return this.subscription;
    }

    public int hashCode() {
        int iB = l1.b(l1.b(this.channel.hashCode() * 31, 31, this.clientId), 31, this.subscription);
        n nVar = this.ext;
        int iHashCode = (iB + (nVar == null ? 0 : nVar.hashCode())) * 31;
        String str = this.id;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.channel;
        String str2 = this.clientId;
        String str3 = this.subscription;
        n nVar = this.ext;
        String str4 = this.id;
        StringBuilder sbT = f.t("SubscribeRequest(channel=", str, ", clientId=", str2, ", subscription=");
        sbT.append(str3);
        sbT.append(", ext=");
        sbT.append(nVar);
        sbT.append(", id=");
        return k.p(sbT, str4, ")");
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/faye/internal/SubscribeRequest$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/faye/internal/SubscribeRequest;", "zendesk.faye_faye"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return SubscribeRequest$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @g("channel")
    public static /* synthetic */ void getChannel$annotations() {
    }

    @g(Bayeux.KEY_CLIENT_ID)
    public static /* synthetic */ void getClientId$annotations() {
    }

    @g("ext")
    public static /* synthetic */ void getExt$annotations() {
    }

    @g("id")
    public static /* synthetic */ void getId$annotations() {
    }

    @g(Bayeux.KEY_SUBSCRIPTION)
    public static /* synthetic */ void getSubscription$annotations() {
    }

    public SubscribeRequest(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable n nVar, @Nullable String str4) {
        a0.C(str, str2, str3);
        this.channel = str;
        this.clientId = str2;
        this.subscription = str3;
        this.ext = nVar;
        this.id = str4;
    }

    public /* synthetic */ SubscribeRequest(String str, String str2, String str3, n nVar, String str4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i11 & 8) != 0 ? null : nVar, (i11 & 16) != 0 ? null : str4);
    }
}
