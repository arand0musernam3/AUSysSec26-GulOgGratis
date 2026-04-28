package zendesk.faye.internal;

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
import n90.n;
import n90.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.j;
import u70.l;
import u70.m;
import w2.l1;
import yu.a;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@h
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0081\b\u0018\u0000 >2\u00020\u0001:\u0002?>BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fB]\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001cJV\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u001cJ\u0010\u0010'\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b,\u0010-R \u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010.\u0012\u0004\b0\u00101\u001a\u0004\b/\u0010\u001cR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010.\u0012\u0004\b3\u00101\u001a\u0004\b2\u0010\u001cR \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010.\u0012\u0004\b5\u00101\u001a\u0004\b4\u0010\u001cR&\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00106\u0012\u0004\b8\u00101\u001a\u0004\b7\u0010 R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\t\u00109\u0012\u0004\b;\u00101\u001a\u0004\b:\u0010\"R\"\u0010\n\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\n\u0010.\u0012\u0004\b=\u00101\u001a\u0004\b<\u0010\u001c¨\u0006@"}, d2 = {"Lzendesk/faye/internal/HandshakeRequest;", "Lzendesk/faye/internal/BayeuxRequest;", "", "channel", "version", "minimumVersion", "", "supportedConnectionTypes", "Ln90/n;", "ext", "id", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ln90/n;Ljava/lang/String;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ln90/n;Ljava/lang/String;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$zendesk_faye_faye", "(Lzendesk/faye/internal/HandshakeRequest;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/util/List;", "component5", "()Ln90/n;", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ln90/n;Ljava/lang/String;)Lzendesk/faye/internal/HandshakeRequest;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getChannel", "getChannel$annotations", "()V", "getVersion", "getVersion$annotations", "getMinimumVersion", "getMinimumVersion$annotations", "Ljava/util/List;", "getSupportedConnectionTypes", "getSupportedConnectionTypes$annotations", "Ln90/n;", "getExt", "getExt$annotations", "getId", "getId$annotations", "Companion", "$serializer", "zendesk.faye_faye"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class HandshakeRequest implements BayeuxRequest {

    @NotNull
    private final String channel;

    @Nullable
    private final n ext;

    @Nullable
    private final String id;

    @NotNull
    private final String minimumVersion;

    @NotNull
    private final List<String> supportedConnectionTypes;

    @NotNull
    private final String version;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final j[] $childSerializers = {null, null, null, l.a(m.PUBLICATION, new a(27)), null, null};

    public /* synthetic */ HandshakeRequest(int i11, String str, String str2, String str3, List list, n nVar, String str4, m1 m1Var) {
        if (15 != (i11 & 15)) {
            c1.j(i11, 15, HandshakeRequest$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.channel = str;
        this.version = str2;
        this.minimumVersion = str3;
        this.supportedConnectionTypes = list;
        if ((i11 & 16) == 0) {
            this.ext = null;
        } else {
            this.ext = nVar;
        }
        if ((i11 & 32) == 0) {
            this.id = null;
        } else {
            this.id = str4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new d(r1.f29848a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HandshakeRequest copy$default(HandshakeRequest handshakeRequest, String str, String str2, String str3, List list, n nVar, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = handshakeRequest.channel;
        }
        if ((i11 & 2) != 0) {
            str2 = handshakeRequest.version;
        }
        if ((i11 & 4) != 0) {
            str3 = handshakeRequest.minimumVersion;
        }
        if ((i11 & 8) != 0) {
            list = handshakeRequest.supportedConnectionTypes;
        }
        if ((i11 & 16) != 0) {
            nVar = handshakeRequest.ext;
        }
        if ((i11 & 32) != 0) {
            str4 = handshakeRequest.id;
        }
        n nVar2 = nVar;
        String str5 = str4;
        return handshakeRequest.copy(str, str2, str3, list, nVar2, str5);
    }

    public static final /* synthetic */ void write$Self$zendesk_faye_faye(HandshakeRequest self, b output, SerialDescriptor serialDesc) {
        j[] jVarArr = $childSerializers;
        output.q(serialDesc, 0, self.getChannel());
        output.q(serialDesc, 1, self.version);
        output.q(serialDesc, 2, self.minimumVersion);
        output.i(serialDesc, 3, (KSerializer) jVarArr[3].getValue(), self.supportedConnectionTypes);
        if (output.C(serialDesc) || self.getExt() != null) {
            output.r(serialDesc, 4, q.f30781a, self.getExt());
        }
        if (!output.C(serialDesc) && self.getId() == null) {
            return;
        }
        output.r(serialDesc, 5, r1.f29848a, self.getId());
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getChannel() {
        return this.channel;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMinimumVersion() {
        return this.minimumVersion;
    }

    @NotNull
    public final List<String> component4() {
        return this.supportedConnectionTypes;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final n getExt() {
        return this.ext;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final HandshakeRequest copy(@NotNull String channel, @NotNull String version, @NotNull String minimumVersion, @NotNull List<String> supportedConnectionTypes, @Nullable n ext, @Nullable String id2) {
        channel.getClass();
        version.getClass();
        minimumVersion.getClass();
        supportedConnectionTypes.getClass();
        return new HandshakeRequest(channel, version, minimumVersion, supportedConnectionTypes, ext, id2);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HandshakeRequest)) {
            return false;
        }
        HandshakeRequest handshakeRequest = (HandshakeRequest) other;
        return Intrinsics.areEqual(this.channel, handshakeRequest.channel) && Intrinsics.areEqual(this.version, handshakeRequest.version) && Intrinsics.areEqual(this.minimumVersion, handshakeRequest.minimumVersion) && Intrinsics.areEqual(this.supportedConnectionTypes, handshakeRequest.supportedConnectionTypes) && Intrinsics.areEqual(this.ext, handshakeRequest.ext) && Intrinsics.areEqual(this.id, handshakeRequest.id);
    }

    @Override // zendesk.faye.internal.BayeuxRequest
    @NotNull
    public String getChannel() {
        return this.channel;
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
    public final String getMinimumVersion() {
        return this.minimumVersion;
    }

    @NotNull
    public final List<String> getSupportedConnectionTypes() {
        return this.supportedConnectionTypes;
    }

    @NotNull
    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        int iC = f.c(this.supportedConnectionTypes, l1.b(l1.b(this.channel.hashCode() * 31, 31, this.version), 31, this.minimumVersion), 31);
        n nVar = this.ext;
        int iHashCode = (iC + (nVar == null ? 0 : nVar.hashCode())) * 31;
        String str = this.id;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.channel;
        String str2 = this.version;
        String str3 = this.minimumVersion;
        List<String> list = this.supportedConnectionTypes;
        n nVar = this.ext;
        String str4 = this.id;
        StringBuilder sbT = f.t("HandshakeRequest(channel=", str, ", version=", str2, ", minimumVersion=");
        sbT.append(str3);
        sbT.append(", supportedConnectionTypes=");
        sbT.append(list);
        sbT.append(", ext=");
        sbT.append(nVar);
        sbT.append(", id=");
        sbT.append(str4);
        sbT.append(")");
        return sbT.toString();
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/faye/internal/HandshakeRequest$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/faye/internal/HandshakeRequest;", "zendesk.faye_faye"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return HandshakeRequest$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @g("channel")
    public static /* synthetic */ void getChannel$annotations() {
    }

    @g("ext")
    public static /* synthetic */ void getExt$annotations() {
    }

    @g("id")
    public static /* synthetic */ void getId$annotations() {
    }

    @g("minimumVersion")
    public static /* synthetic */ void getMinimumVersion$annotations() {
    }

    @g("supportedConnectionTypes")
    public static /* synthetic */ void getSupportedConnectionTypes$annotations() {
    }

    @g("version")
    public static /* synthetic */ void getVersion$annotations() {
    }

    public HandshakeRequest(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull List<String> list, @Nullable n nVar, @Nullable String str4) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        list.getClass();
        this.channel = str;
        this.version = str2;
        this.minimumVersion = str3;
        this.supportedConnectionTypes = list;
        this.ext = nVar;
        this.id = str4;
    }

    public /* synthetic */ HandshakeRequest(String str, String str2, String str3, List list, n nVar, String str4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, list, (i11 & 16) != 0 ? null : nVar, (i11 & 32) != 0 ? null : str4);
    }
}
