package zendesk.messaging.android.internal.conversationslistscreen.conversation.cache;

import e0.f;
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
import w.a0;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@h
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u0000 '2\u00020\u0001:\u0002('B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J.\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b&\u0010\u0017¨\u0006)"}, d2 = {"Lzendesk/messaging/android/internal/conversationslistscreen/conversation/cache/ConversationsListUIPersistenceItem;", "", "", "conversationId", "participantName", "avatarUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$zendesk_messaging_messaging_android", "(Lzendesk/messaging/android/internal/conversationslistscreen/conversation/cache/ConversationsListUIPersistenceItem;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lzendesk/messaging/android/internal/conversationslistscreen/conversation/cache/ConversationsListUIPersistenceItem;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getConversationId", "getParticipantName", "getAvatarUrl", "Companion", "$serializer", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ConversationsListUIPersistenceItem {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String avatarUrl;

    @NotNull
    private final String conversationId;

    @NotNull
    private final String participantName;

    public /* synthetic */ ConversationsListUIPersistenceItem(int i11, String str, String str2, String str3, m1 m1Var) {
        if (1 != (i11 & 1)) {
            c1.j(i11, 1, ConversationsListUIPersistenceItem$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.conversationId = str;
        if ((i11 & 2) == 0) {
            this.participantName = "";
        } else {
            this.participantName = str2;
        }
        if ((i11 & 4) == 0) {
            this.avatarUrl = "";
        } else {
            this.avatarUrl = str3;
        }
    }

    public static /* synthetic */ ConversationsListUIPersistenceItem copy$default(ConversationsListUIPersistenceItem conversationsListUIPersistenceItem, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = conversationsListUIPersistenceItem.conversationId;
        }
        if ((i11 & 2) != 0) {
            str2 = conversationsListUIPersistenceItem.participantName;
        }
        if ((i11 & 4) != 0) {
            str3 = conversationsListUIPersistenceItem.avatarUrl;
        }
        return conversationsListUIPersistenceItem.copy(str, str2, str3);
    }

    public static final /* synthetic */ void write$Self$zendesk_messaging_messaging_android(ConversationsListUIPersistenceItem self, b output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.conversationId);
        if (output.C(serialDesc) || !Intrinsics.areEqual(self.participantName, "")) {
            output.q(serialDesc, 1, self.participantName);
        }
        if (!output.C(serialDesc) && Intrinsics.areEqual(self.avatarUrl, "")) {
            return;
        }
        output.q(serialDesc, 2, self.avatarUrl);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getConversationId() {
        return this.conversationId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getParticipantName() {
        return this.participantName;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    @NotNull
    public final ConversationsListUIPersistenceItem copy(@NotNull String conversationId, @NotNull String participantName, @NotNull String avatarUrl) {
        conversationId.getClass();
        participantName.getClass();
        avatarUrl.getClass();
        return new ConversationsListUIPersistenceItem(conversationId, participantName, avatarUrl);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConversationsListUIPersistenceItem)) {
            return false;
        }
        ConversationsListUIPersistenceItem conversationsListUIPersistenceItem = (ConversationsListUIPersistenceItem) other;
        return Intrinsics.areEqual(this.conversationId, conversationsListUIPersistenceItem.conversationId) && Intrinsics.areEqual(this.participantName, conversationsListUIPersistenceItem.participantName) && Intrinsics.areEqual(this.avatarUrl, conversationsListUIPersistenceItem.avatarUrl);
    }

    @NotNull
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    @NotNull
    public final String getConversationId() {
        return this.conversationId;
    }

    @NotNull
    public final String getParticipantName() {
        return this.participantName;
    }

    public int hashCode() {
        return this.avatarUrl.hashCode() + l1.b(this.conversationId.hashCode() * 31, 31, this.participantName);
    }

    @NotNull
    public String toString() {
        String str = this.conversationId;
        String str2 = this.participantName;
        return k.p(f.t("ConversationsListUIPersistenceItem(conversationId=", str, ", participantName=", str2, ", avatarUrl="), this.avatarUrl, ")");
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/messaging/android/internal/conversationslistscreen/conversation/cache/ConversationsListUIPersistenceItem$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/messaging/android/internal/conversationslistscreen/conversation/cache/ConversationsListUIPersistenceItem;", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return ConversationsListUIPersistenceItem$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ConversationsListUIPersistenceItem(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        a0.C(str, str2, str3);
        this.conversationId = str;
        this.participantName = str2;
        this.avatarUrl = str3;
    }

    public /* synthetic */ ConversationsListUIPersistenceItem(String str, String str2, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? "" : str2, (i11 & 4) != 0 ? "" : str3);
    }
}
