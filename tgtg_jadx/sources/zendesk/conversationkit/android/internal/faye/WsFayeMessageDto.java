package zendesk.conversationkit.android.internal.faye;

import com.braze.models.inappmessage.InAppMessageBase;
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
import zendesk.conversationkit.android.internal.rest.model.MessageDto;
import zendesk.conversationkit.android.internal.rest.model.MessageDto$$serializer;
import zendesk.messaging.android.internal.messagingscreen.MessagingScreenViewModel;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@h
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\r\b\u0081\b\u0018\u0000 32\u00020\u0001:\u000243B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBC\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b \u0010!J<\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001bJ\u0010\u0010%\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b0\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b2\u0010!¨\u00065"}, d2 = {"Lzendesk/conversationkit/android/internal/faye/WsFayeMessageDto;", "", "", "type", "Lzendesk/conversationkit/android/internal/faye/WsConversationDto;", MessagingScreenViewModel.MESSAGING_SCREEN_CONVERSATION, "Lzendesk/conversationkit/android/internal/rest/model/MessageDto;", InAppMessageBase.MESSAGE, "Lzendesk/conversationkit/android/internal/faye/WsActivityEventDto;", "activity", "<init>", "(Ljava/lang/String;Lzendesk/conversationkit/android/internal/faye/WsConversationDto;Lzendesk/conversationkit/android/internal/rest/model/MessageDto;Lzendesk/conversationkit/android/internal/faye/WsActivityEventDto;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Lzendesk/conversationkit/android/internal/faye/WsConversationDto;Lzendesk/conversationkit/android/internal/rest/model/MessageDto;Lzendesk/conversationkit/android/internal/faye/WsActivityEventDto;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$zendesk_conversationkit_conversationkit_android", "(Lzendesk/conversationkit/android/internal/faye/WsFayeMessageDto;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lzendesk/conversationkit/android/internal/faye/WsConversationDto;", "component3", "()Lzendesk/conversationkit/android/internal/rest/model/MessageDto;", "component4", "()Lzendesk/conversationkit/android/internal/faye/WsActivityEventDto;", "copy", "(Ljava/lang/String;Lzendesk/conversationkit/android/internal/faye/WsConversationDto;Lzendesk/conversationkit/android/internal/rest/model/MessageDto;Lzendesk/conversationkit/android/internal/faye/WsActivityEventDto;)Lzendesk/conversationkit/android/internal/faye/WsFayeMessageDto;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getType", "Lzendesk/conversationkit/android/internal/faye/WsConversationDto;", "getConversation", "Lzendesk/conversationkit/android/internal/rest/model/MessageDto;", "getMessage", "Lzendesk/conversationkit/android/internal/faye/WsActivityEventDto;", "getActivity", "Companion", "$serializer", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class WsFayeMessageDto {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final WsActivityEventDto activity;

    @NotNull
    private final WsConversationDto conversation;

    @Nullable
    private final MessageDto message;

    @NotNull
    private final String type;

    public /* synthetic */ WsFayeMessageDto(int i11, String str, WsConversationDto wsConversationDto, MessageDto messageDto, WsActivityEventDto wsActivityEventDto, m1 m1Var) {
        if (3 != (i11 & 3)) {
            c1.j(i11, 3, WsFayeMessageDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.type = str;
        this.conversation = wsConversationDto;
        if ((i11 & 4) == 0) {
            this.message = null;
        } else {
            this.message = messageDto;
        }
        if ((i11 & 8) == 0) {
            this.activity = null;
        } else {
            this.activity = wsActivityEventDto;
        }
    }

    public static /* synthetic */ WsFayeMessageDto copy$default(WsFayeMessageDto wsFayeMessageDto, String str, WsConversationDto wsConversationDto, MessageDto messageDto, WsActivityEventDto wsActivityEventDto, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = wsFayeMessageDto.type;
        }
        if ((i11 & 2) != 0) {
            wsConversationDto = wsFayeMessageDto.conversation;
        }
        if ((i11 & 4) != 0) {
            messageDto = wsFayeMessageDto.message;
        }
        if ((i11 & 8) != 0) {
            wsActivityEventDto = wsFayeMessageDto.activity;
        }
        return wsFayeMessageDto.copy(str, wsConversationDto, messageDto, wsActivityEventDto);
    }

    public static final /* synthetic */ void write$Self$zendesk_conversationkit_conversationkit_android(WsFayeMessageDto self, b output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.type);
        output.i(serialDesc, 1, WsConversationDto$$serializer.INSTANCE, self.conversation);
        if (output.C(serialDesc) || self.message != null) {
            output.r(serialDesc, 2, MessageDto$$serializer.INSTANCE, self.message);
        }
        if (!output.C(serialDesc) && self.activity == null) {
            return;
        }
        output.r(serialDesc, 3, WsActivityEventDto$$serializer.INSTANCE, self.activity);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final WsConversationDto getConversation() {
        return this.conversation;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final MessageDto getMessage() {
        return this.message;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final WsActivityEventDto getActivity() {
        return this.activity;
    }

    @NotNull
    public final WsFayeMessageDto copy(@NotNull String type, @NotNull WsConversationDto conversation, @Nullable MessageDto message, @Nullable WsActivityEventDto activity) {
        type.getClass();
        conversation.getClass();
        return new WsFayeMessageDto(type, conversation, message, activity);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WsFayeMessageDto)) {
            return false;
        }
        WsFayeMessageDto wsFayeMessageDto = (WsFayeMessageDto) other;
        return Intrinsics.areEqual(this.type, wsFayeMessageDto.type) && Intrinsics.areEqual(this.conversation, wsFayeMessageDto.conversation) && Intrinsics.areEqual(this.message, wsFayeMessageDto.message) && Intrinsics.areEqual(this.activity, wsFayeMessageDto.activity);
    }

    @Nullable
    public final WsActivityEventDto getActivity() {
        return this.activity;
    }

    @NotNull
    public final WsConversationDto getConversation() {
        return this.conversation;
    }

    @Nullable
    public final MessageDto getMessage() {
        return this.message;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = (this.conversation.hashCode() + (this.type.hashCode() * 31)) * 31;
        MessageDto messageDto = this.message;
        int iHashCode2 = (iHashCode + (messageDto == null ? 0 : messageDto.hashCode())) * 31;
        WsActivityEventDto wsActivityEventDto = this.activity;
        return iHashCode2 + (wsActivityEventDto != null ? wsActivityEventDto.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "WsFayeMessageDto(type=" + this.type + ", conversation=" + this.conversation + ", message=" + this.message + ", activity=" + this.activity + ")";
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/conversationkit/android/internal/faye/WsFayeMessageDto$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/conversationkit/android/internal/faye/WsFayeMessageDto;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return WsFayeMessageDto$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public WsFayeMessageDto(@NotNull String str, @NotNull WsConversationDto wsConversationDto, @Nullable MessageDto messageDto, @Nullable WsActivityEventDto wsActivityEventDto) {
        str.getClass();
        wsConversationDto.getClass();
        this.type = str;
        this.conversation = wsConversationDto;
        this.message = messageDto;
        this.activity = wsActivityEventDto;
    }

    public /* synthetic */ WsFayeMessageDto(String str, WsConversationDto wsConversationDto, MessageDto messageDto, WsActivityEventDto wsActivityEventDto, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, wsConversationDto, (i11 & 4) != 0 ? null : messageDto, (i11 & 8) != 0 ? null : wsActivityEventDto);
    }
}
