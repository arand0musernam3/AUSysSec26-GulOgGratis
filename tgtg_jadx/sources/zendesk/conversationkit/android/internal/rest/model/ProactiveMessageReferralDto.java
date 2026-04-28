package zendesk.conversationkit.android.internal.rest.model;

import bb0.a;
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
import u70.j;
import u70.l;
import u70.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@h
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0081\b\u0018\u0000 :2\u00020\u0001:\u0002;:BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eBS\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b%\u0010&JN\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010\u001eJ\u0010\u0010*\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b.\u0010/R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u001eR\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00102\u001a\u0004\b3\u0010 R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00104\u001a\u0004\b5\u0010\"R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00106\u001a\u0004\b7\u0010$R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00108\u001a\u0004\b9\u0010&¨\u0006<"}, d2 = {"Lzendesk/conversationkit/android/internal/rest/model/ProactiveMessageReferralDto;", "", "", "signedCampaignData", "", "Lzendesk/conversationkit/android/internal/rest/model/MessageDto;", "messages", "Lzendesk/conversationkit/android/internal/rest/model/PostbackDto;", "postback", "Lzendesk/conversationkit/android/internal/rest/model/AuthorDto;", "author", "Lzendesk/conversationkit/android/internal/rest/model/Intent;", "intent", "<init>", "(Ljava/lang/String;Ljava/util/List;Lzendesk/conversationkit/android/internal/rest/model/PostbackDto;Lzendesk/conversationkit/android/internal/rest/model/AuthorDto;Lzendesk/conversationkit/android/internal/rest/model/Intent;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lzendesk/conversationkit/android/internal/rest/model/PostbackDto;Lzendesk/conversationkit/android/internal/rest/model/AuthorDto;Lzendesk/conversationkit/android/internal/rest/model/Intent;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$zendesk_conversationkit_conversationkit_android", "(Lzendesk/conversationkit/android/internal/rest/model/ProactiveMessageReferralDto;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "()Lzendesk/conversationkit/android/internal/rest/model/PostbackDto;", "component4", "()Lzendesk/conversationkit/android/internal/rest/model/AuthorDto;", "component5", "()Lzendesk/conversationkit/android/internal/rest/model/Intent;", "copy", "(Ljava/lang/String;Ljava/util/List;Lzendesk/conversationkit/android/internal/rest/model/PostbackDto;Lzendesk/conversationkit/android/internal/rest/model/AuthorDto;Lzendesk/conversationkit/android/internal/rest/model/Intent;)Lzendesk/conversationkit/android/internal/rest/model/ProactiveMessageReferralDto;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSignedCampaignData", "Ljava/util/List;", "getMessages", "Lzendesk/conversationkit/android/internal/rest/model/PostbackDto;", "getPostback", "Lzendesk/conversationkit/android/internal/rest/model/AuthorDto;", "getAuthor", "Lzendesk/conversationkit/android/internal/rest/model/Intent;", "getIntent", "Companion", "$serializer", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ProactiveMessageReferralDto {

    @NotNull
    private static final j[] $childSerializers;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final AuthorDto author;

    @NotNull
    private final Intent intent;

    @Nullable
    private final List<MessageDto> messages;

    @Nullable
    private final PostbackDto postback;

    @Nullable
    private final String signedCampaignData;

    static {
        m mVar = m.PUBLICATION;
        $childSerializers = new j[]{null, l.a(mVar, new a(19)), null, null, l.a(mVar, new a(20))};
    }

    public /* synthetic */ ProactiveMessageReferralDto(int i11, String str, List list, PostbackDto postbackDto, AuthorDto authorDto, Intent intent, m1 m1Var) {
        if (8 != (i11 & 8)) {
            c1.j(i11, 8, ProactiveMessageReferralDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i11 & 1) == 0) {
            this.signedCampaignData = null;
        } else {
            this.signedCampaignData = str;
        }
        if ((i11 & 2) == 0) {
            this.messages = null;
        } else {
            this.messages = list;
        }
        if ((i11 & 4) == 0) {
            this.postback = null;
        } else {
            this.postback = postbackDto;
        }
        this.author = authorDto;
        if ((i11 & 16) == 0) {
            this.intent = Intent.PROACTIVE;
        } else {
            this.intent = intent;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new d(MessageDto$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return Intent.INSTANCE.serializer();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProactiveMessageReferralDto copy$default(ProactiveMessageReferralDto proactiveMessageReferralDto, String str, List list, PostbackDto postbackDto, AuthorDto authorDto, Intent intent, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = proactiveMessageReferralDto.signedCampaignData;
        }
        if ((i11 & 2) != 0) {
            list = proactiveMessageReferralDto.messages;
        }
        if ((i11 & 4) != 0) {
            postbackDto = proactiveMessageReferralDto.postback;
        }
        if ((i11 & 8) != 0) {
            authorDto = proactiveMessageReferralDto.author;
        }
        if ((i11 & 16) != 0) {
            intent = proactiveMessageReferralDto.intent;
        }
        Intent intent2 = intent;
        PostbackDto postbackDto2 = postbackDto;
        return proactiveMessageReferralDto.copy(str, list, postbackDto2, authorDto, intent2);
    }

    public static final /* synthetic */ void write$Self$zendesk_conversationkit_conversationkit_android(ProactiveMessageReferralDto self, b output, SerialDescriptor serialDesc) {
        j[] jVarArr = $childSerializers;
        if (output.C(serialDesc) || self.signedCampaignData != null) {
            output.r(serialDesc, 0, r1.f29848a, self.signedCampaignData);
        }
        if (output.C(serialDesc) || self.messages != null) {
            output.r(serialDesc, 1, (KSerializer) jVarArr[1].getValue(), self.messages);
        }
        if (output.C(serialDesc) || self.postback != null) {
            output.r(serialDesc, 2, PostbackDto$$serializer.INSTANCE, self.postback);
        }
        output.i(serialDesc, 3, AuthorDto$$serializer.INSTANCE, self.author);
        if (!output.C(serialDesc) && self.intent == Intent.PROACTIVE) {
            return;
        }
        output.i(serialDesc, 4, (KSerializer) jVarArr[4].getValue(), self.intent);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSignedCampaignData() {
        return this.signedCampaignData;
    }

    @Nullable
    public final List<MessageDto> component2() {
        return this.messages;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final PostbackDto getPostback() {
        return this.postback;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final AuthorDto getAuthor() {
        return this.author;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Intent getIntent() {
        return this.intent;
    }

    @NotNull
    public final ProactiveMessageReferralDto copy(@Nullable String signedCampaignData, @Nullable List<MessageDto> messages, @Nullable PostbackDto postback, @NotNull AuthorDto author, @NotNull Intent intent) {
        author.getClass();
        intent.getClass();
        return new ProactiveMessageReferralDto(signedCampaignData, messages, postback, author, intent);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProactiveMessageReferralDto)) {
            return false;
        }
        ProactiveMessageReferralDto proactiveMessageReferralDto = (ProactiveMessageReferralDto) other;
        return Intrinsics.areEqual(this.signedCampaignData, proactiveMessageReferralDto.signedCampaignData) && Intrinsics.areEqual(this.messages, proactiveMessageReferralDto.messages) && Intrinsics.areEqual(this.postback, proactiveMessageReferralDto.postback) && Intrinsics.areEqual(this.author, proactiveMessageReferralDto.author) && this.intent == proactiveMessageReferralDto.intent;
    }

    @NotNull
    public final AuthorDto getAuthor() {
        return this.author;
    }

    @NotNull
    public final Intent getIntent() {
        return this.intent;
    }

    @Nullable
    public final List<MessageDto> getMessages() {
        return this.messages;
    }

    @Nullable
    public final PostbackDto getPostback() {
        return this.postback;
    }

    @Nullable
    public final String getSignedCampaignData() {
        return this.signedCampaignData;
    }

    public int hashCode() {
        String str = this.signedCampaignData;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<MessageDto> list = this.messages;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        PostbackDto postbackDto = this.postback;
        return this.intent.hashCode() + ((this.author.hashCode() + ((iHashCode2 + (postbackDto != null ? postbackDto.hashCode() : 0)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "ProactiveMessageReferralDto(signedCampaignData=" + this.signedCampaignData + ", messages=" + this.messages + ", postback=" + this.postback + ", author=" + this.author + ", intent=" + this.intent + ")";
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/conversationkit/android/internal/rest/model/ProactiveMessageReferralDto$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/conversationkit/android/internal/rest/model/ProactiveMessageReferralDto;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return ProactiveMessageReferralDto$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ProactiveMessageReferralDto(@Nullable String str, @Nullable List<MessageDto> list, @Nullable PostbackDto postbackDto, @NotNull AuthorDto authorDto, @NotNull Intent intent) {
        authorDto.getClass();
        intent.getClass();
        this.signedCampaignData = str;
        this.messages = list;
        this.postback = postbackDto;
        this.author = authorDto;
        this.intent = intent;
    }

    public /* synthetic */ ProactiveMessageReferralDto(String str, List list, PostbackDto postbackDto, AuthorDto authorDto, Intent intent, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : list, (i11 & 4) != 0 ? null : postbackDto, authorDto, (i11 & 16) != 0 ? Intent.PROACTIVE : intent);
    }
}
