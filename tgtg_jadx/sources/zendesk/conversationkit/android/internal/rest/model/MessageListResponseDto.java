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
import m90.g;
import m90.m1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.j;
import u70.l;
import u70.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@h
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0081\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tB?\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ8\u0010\u001d\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010%\u001a\u00020\u00052\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b+\u0010\u001b¨\u0006."}, d2 = {"Lzendesk/conversationkit/android/internal/rest/model/MessageListResponseDto;", "", "", "Lzendesk/conversationkit/android/internal/rest/model/MessageDto;", "messages", "", "hasPrevious", "hasNext", "<init>", "(Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$zendesk_conversationkit_conversationkit_android", "(Lzendesk/conversationkit/android/internal/rest/model/MessageListResponseDto;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/Boolean;", "component3", "copy", "(Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lzendesk/conversationkit/android/internal/rest/model/MessageListResponseDto;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getMessages", "Ljava/lang/Boolean;", "getHasPrevious", "getHasNext", "Companion", "$serializer", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class MessageListResponseDto {

    @Nullable
    private final Boolean hasNext;

    @Nullable
    private final Boolean hasPrevious;

    @NotNull
    private final List<MessageDto> messages;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final j[] $childSerializers = {l.a(m.PUBLICATION, new a(17)), null, null};

    public /* synthetic */ MessageListResponseDto(int i11, List list, Boolean bool, Boolean bool2, m1 m1Var) {
        if (7 != (i11 & 7)) {
            c1.j(i11, 7, MessageListResponseDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.messages = list;
        this.hasPrevious = bool;
        this.hasNext = bool2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new d(MessageDto$$serializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MessageListResponseDto copy$default(MessageListResponseDto messageListResponseDto, List list, Boolean bool, Boolean bool2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = messageListResponseDto.messages;
        }
        if ((i11 & 2) != 0) {
            bool = messageListResponseDto.hasPrevious;
        }
        if ((i11 & 4) != 0) {
            bool2 = messageListResponseDto.hasNext;
        }
        return messageListResponseDto.copy(list, bool, bool2);
    }

    public static final /* synthetic */ void write$Self$zendesk_conversationkit_conversationkit_android(MessageListResponseDto self, b output, SerialDescriptor serialDesc) {
        output.i(serialDesc, 0, (KSerializer) $childSerializers[0].getValue(), self.messages);
        g gVar = g.f29797a;
        output.r(serialDesc, 1, gVar, self.hasPrevious);
        output.r(serialDesc, 2, gVar, self.hasNext);
    }

    @NotNull
    public final List<MessageDto> component1() {
        return this.messages;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getHasPrevious() {
        return this.hasPrevious;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getHasNext() {
        return this.hasNext;
    }

    @NotNull
    public final MessageListResponseDto copy(@NotNull List<MessageDto> messages, @Nullable Boolean hasPrevious, @Nullable Boolean hasNext) {
        messages.getClass();
        return new MessageListResponseDto(messages, hasPrevious, hasNext);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageListResponseDto)) {
            return false;
        }
        MessageListResponseDto messageListResponseDto = (MessageListResponseDto) other;
        return Intrinsics.areEqual(this.messages, messageListResponseDto.messages) && Intrinsics.areEqual(this.hasPrevious, messageListResponseDto.hasPrevious) && Intrinsics.areEqual(this.hasNext, messageListResponseDto.hasNext);
    }

    @Nullable
    public final Boolean getHasNext() {
        return this.hasNext;
    }

    @Nullable
    public final Boolean getHasPrevious() {
        return this.hasPrevious;
    }

    @NotNull
    public final List<MessageDto> getMessages() {
        return this.messages;
    }

    public int hashCode() {
        int iHashCode = this.messages.hashCode() * 31;
        Boolean bool = this.hasPrevious;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.hasNext;
        return iHashCode2 + (bool2 != null ? bool2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "MessageListResponseDto(messages=" + this.messages + ", hasPrevious=" + this.hasPrevious + ", hasNext=" + this.hasNext + ")";
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/conversationkit/android/internal/rest/model/MessageListResponseDto$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/conversationkit/android/internal/rest/model/MessageListResponseDto;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return MessageListResponseDto$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public MessageListResponseDto(@NotNull List<MessageDto> list, @Nullable Boolean bool, @Nullable Boolean bool2) {
        list.getClass();
        this.messages = list;
        this.hasPrevious = bool;
        this.hasNext = bool2;
    }
}
