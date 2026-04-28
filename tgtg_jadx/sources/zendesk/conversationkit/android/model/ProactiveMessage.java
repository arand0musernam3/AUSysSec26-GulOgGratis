package zendesk.conversationkit.android.model;

import i90.h;
import j4.s;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import l80.e;
import m90.c1;
import m90.m1;
import org.bouncycastle.i18n.MessageBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@h
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000221B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bBS\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJ\u0010\u0010 \u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b \u0010\u001cJL\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b#\u0010\u001cJ\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001aJ\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b-\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b.\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b/\u0010\u001aR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b0\u0010\u001c¨\u00063"}, d2 = {"Lzendesk/conversationkit/android/model/ProactiveMessage;", "", "", "id", "", MessageBundle.TITLE_ENTRY, "body", "campaignId", "campaignVersion", "jwt", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$zendesk_conversationkit_conversationkit_android", "(Lzendesk/conversationkit/android/model/ProactiveMessage;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Lzendesk/conversationkit/android/model/ProactiveMessage;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Ljava/lang/String;", "getTitle", "getBody", "getCampaignId", "getCampaignVersion", "getJwt", "Companion", "$serializer", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ProactiveMessage {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String body;

    @NotNull
    private final String campaignId;
    private final int campaignVersion;
    private final int id;

    @NotNull
    private final String jwt;

    @NotNull
    private final String title;

    public ProactiveMessage(int i11, int i12, String str, String str2, String str3, int i13, String str4, m1 m1Var) {
        if (62 != (i11 & 62)) {
            c1.j(i11, 62, ProactiveMessage$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i11 & 1) == 0) {
            e.f27503a.getClass();
            this.id = e.f27504b.b();
        } else {
            this.id = i12;
        }
        this.title = str;
        this.body = str2;
        this.campaignId = str3;
        this.campaignVersion = i13;
        this.jwt = str4;
    }

    public static /* synthetic */ ProactiveMessage copy$default(ProactiveMessage proactiveMessage, int i11, String str, String str2, String str3, int i12, String str4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = proactiveMessage.id;
        }
        if ((i13 & 2) != 0) {
            str = proactiveMessage.title;
        }
        if ((i13 & 4) != 0) {
            str2 = proactiveMessage.body;
        }
        if ((i13 & 8) != 0) {
            str3 = proactiveMessage.campaignId;
        }
        if ((i13 & 16) != 0) {
            i12 = proactiveMessage.campaignVersion;
        }
        if ((i13 & 32) != 0) {
            str4 = proactiveMessage.jwt;
        }
        int i14 = i12;
        String str5 = str4;
        return proactiveMessage.copy(i11, str, str2, str3, i14, str5);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void write$Self$zendesk_conversationkit_conversationkit_android(zendesk.conversationkit.android.model.ProactiveMessage r2, l90.b r3, kotlinx.serialization.descriptors.SerialDescriptor r4) {
        /*
            boolean r0 = r3.C(r4)
            if (r0 == 0) goto L7
            goto L16
        L7:
            int r0 = r2.id
            l80.d r1 = l80.e.f27503a
            r1.getClass()
            l80.a r1 = l80.e.f27504b
            int r1 = r1.b()
            if (r0 == r1) goto L1c
        L16:
            int r0 = r2.id
            r1 = 0
            r3.m(r1, r0, r4)
        L1c:
            r0 = 1
            java.lang.String r1 = r2.title
            r3.q(r4, r0, r1)
            r0 = 2
            java.lang.String r1 = r2.body
            r3.q(r4, r0, r1)
            r0 = 3
            java.lang.String r1 = r2.campaignId
            r3.q(r4, r0, r1)
            r0 = 4
            int r1 = r2.campaignVersion
            r3.m(r0, r1, r4)
            r0 = 5
            java.lang.String r2 = r2.jwt
            r3.q(r4, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.model.ProactiveMessage.write$Self$zendesk_conversationkit_conversationkit_android(zendesk.conversationkit.android.model.ProactiveMessage, l90.b, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCampaignId() {
        return this.campaignId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getCampaignVersion() {
        return this.campaignVersion;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getJwt() {
        return this.jwt;
    }

    @NotNull
    public final ProactiveMessage copy(int id2, @NotNull String title, @NotNull String body, @NotNull String campaignId, int campaignVersion, @NotNull String jwt) {
        title.getClass();
        body.getClass();
        campaignId.getClass();
        jwt.getClass();
        return new ProactiveMessage(id2, title, body, campaignId, campaignVersion, jwt);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProactiveMessage)) {
            return false;
        }
        ProactiveMessage proactiveMessage = (ProactiveMessage) other;
        return this.id == proactiveMessage.id && Intrinsics.areEqual(this.title, proactiveMessage.title) && Intrinsics.areEqual(this.body, proactiveMessage.body) && Intrinsics.areEqual(this.campaignId, proactiveMessage.campaignId) && this.campaignVersion == proactiveMessage.campaignVersion && Intrinsics.areEqual(this.jwt, proactiveMessage.jwt);
    }

    @NotNull
    public final String getBody() {
        return this.body;
    }

    @NotNull
    public final String getCampaignId() {
        return this.campaignId;
    }

    public final int getCampaignVersion() {
        return this.campaignVersion;
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final String getJwt() {
        return this.jwt;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.jwt.hashCode() + k.b(this.campaignVersion, l1.b(l1.b(l1.b(Integer.hashCode(this.id) * 31, 31, this.title), 31, this.body), 31, this.campaignId), 31);
    }

    @NotNull
    public String toString() {
        int i11 = this.id;
        String str = this.title;
        String str2 = this.body;
        String str3 = this.campaignId;
        int i12 = this.campaignVersion;
        String str4 = this.jwt;
        StringBuilder sb2 = new StringBuilder("ProactiveMessage(id=");
        sb2.append(i11);
        sb2.append(", title=");
        sb2.append(str);
        sb2.append(", body=");
        s.A(sb2, str2, ", campaignId=", str3, ", campaignVersion=");
        sb2.append(i12);
        sb2.append(", jwt=");
        sb2.append(str4);
        sb2.append(")");
        return sb2.toString();
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/conversationkit/android/model/ProactiveMessage$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/conversationkit/android/model/ProactiveMessage;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return ProactiveMessage$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ProactiveMessage(int i11, @NotNull String str, @NotNull String str2, @NotNull String str3, int i12, @NotNull String str4) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.id = i11;
        this.title = str;
        this.body = str2;
        this.campaignId = str3;
        this.campaignVersion = i12;
        this.jwt = str4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ProactiveMessage(int i11, String str, String str2, String str3, int i12, String str4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i13 & 1) != 0) {
            e.f27503a.getClass();
            i11 = e.f27504b.b();
        }
        this(i11, str, str2, str3, i12, str4);
    }
}
