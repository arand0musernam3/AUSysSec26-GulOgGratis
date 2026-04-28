package zendesk.android.internal.proactivemessaging.campaigntriggerservice.model.jwt;

import i90.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import m90.c1;
import m90.d;
import m90.m1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.j;
import u70.l;
import u70.m;
import vv.b;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@h
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u0000 *2\u00020\u0001:\u0002+*B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ*\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\tHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u001a¨\u0006,"}, d2 = {"Lzendesk/android/internal/proactivemessaging/campaigntriggerservice/model/jwt/ProactiveMessageResponse;", "", "Lzendesk/android/internal/proactivemessaging/campaigntriggerservice/model/jwt/ProactiveMessageCampaign;", "campaign", "", "Lzendesk/android/internal/proactivemessaging/campaigntriggerservice/model/jwt/ProactiveMessage;", "messages", "<init>", "(Lzendesk/android/internal/proactivemessaging/campaigntriggerservice/model/jwt/ProactiveMessageCampaign;Ljava/util/List;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILzendesk/android/internal/proactivemessaging/campaigntriggerservice/model/jwt/ProactiveMessageCampaign;Ljava/util/List;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$zendesk_zendesk_android", "(Lzendesk/android/internal/proactivemessaging/campaigntriggerservice/model/jwt/ProactiveMessageResponse;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lzendesk/android/internal/proactivemessaging/campaigntriggerservice/model/jwt/ProactiveMessageCampaign;", "component2", "()Ljava/util/List;", "copy", "(Lzendesk/android/internal/proactivemessaging/campaigntriggerservice/model/jwt/ProactiveMessageCampaign;Ljava/util/List;)Lzendesk/android/internal/proactivemessaging/campaigntriggerservice/model/jwt/ProactiveMessageResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lzendesk/android/internal/proactivemessaging/campaigntriggerservice/model/jwt/ProactiveMessageCampaign;", "getCampaign", "Ljava/util/List;", "getMessages", "Companion", "$serializer", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ProactiveMessageResponse {

    @NotNull
    private final ProactiveMessageCampaign campaign;

    @NotNull
    private final List<ProactiveMessage> messages;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final j[] $childSerializers = {null, l.a(m.PUBLICATION, new b(28))};

    public /* synthetic */ ProactiveMessageResponse(int i11, ProactiveMessageCampaign proactiveMessageCampaign, List list, m1 m1Var) {
        if (3 != (i11 & 3)) {
            c1.j(i11, 3, ProactiveMessageResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.campaign = proactiveMessageCampaign;
        this.messages = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new d(ProactiveMessage$$serializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProactiveMessageResponse copy$default(ProactiveMessageResponse proactiveMessageResponse, ProactiveMessageCampaign proactiveMessageCampaign, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            proactiveMessageCampaign = proactiveMessageResponse.campaign;
        }
        if ((i11 & 2) != 0) {
            list = proactiveMessageResponse.messages;
        }
        return proactiveMessageResponse.copy(proactiveMessageCampaign, list);
    }

    public static final /* synthetic */ void write$Self$zendesk_zendesk_android(ProactiveMessageResponse self, l90.b output, SerialDescriptor serialDesc) {
        j[] jVarArr = $childSerializers;
        output.i(serialDesc, 0, ProactiveMessageCampaign$$serializer.INSTANCE, self.campaign);
        output.i(serialDesc, 1, (KSerializer) jVarArr[1].getValue(), self.messages);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ProactiveMessageCampaign getCampaign() {
        return this.campaign;
    }

    @NotNull
    public final List<ProactiveMessage> component2() {
        return this.messages;
    }

    @NotNull
    public final ProactiveMessageResponse copy(@NotNull ProactiveMessageCampaign campaign, @NotNull List<ProactiveMessage> messages) {
        campaign.getClass();
        messages.getClass();
        return new ProactiveMessageResponse(campaign, messages);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProactiveMessageResponse)) {
            return false;
        }
        ProactiveMessageResponse proactiveMessageResponse = (ProactiveMessageResponse) other;
        return Intrinsics.areEqual(this.campaign, proactiveMessageResponse.campaign) && Intrinsics.areEqual(this.messages, proactiveMessageResponse.messages);
    }

    @NotNull
    public final ProactiveMessageCampaign getCampaign() {
        return this.campaign;
    }

    @NotNull
    public final List<ProactiveMessage> getMessages() {
        return this.messages;
    }

    public int hashCode() {
        return this.messages.hashCode() + (this.campaign.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "ProactiveMessageResponse(campaign=" + this.campaign + ", messages=" + this.messages + ")";
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/android/internal/proactivemessaging/campaigntriggerservice/model/jwt/ProactiveMessageResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/android/internal/proactivemessaging/campaigntriggerservice/model/jwt/ProactiveMessageResponse;", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return ProactiveMessageResponse$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ProactiveMessageResponse(@NotNull ProactiveMessageCampaign proactiveMessageCampaign, @NotNull List<ProactiveMessage> list) {
        proactiveMessageCampaign.getClass();
        list.getClass();
        this.campaign = proactiveMessageCampaign;
        this.messages = list;
    }
}
