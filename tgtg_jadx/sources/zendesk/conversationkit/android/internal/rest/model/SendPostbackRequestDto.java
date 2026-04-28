package zendesk.conversationkit.android.internal.rest.model;

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

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@h
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u0000 )2\u00020\u0001:\u0002*)B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u0019¨\u0006+"}, d2 = {"Lzendesk/conversationkit/android/internal/rest/model/SendPostbackRequestDto;", "", "Lzendesk/conversationkit/android/internal/rest/model/AuthorDto;", "author", "Lzendesk/conversationkit/android/internal/rest/model/PostbackDto;", "postback", "<init>", "(Lzendesk/conversationkit/android/internal/rest/model/AuthorDto;Lzendesk/conversationkit/android/internal/rest/model/PostbackDto;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILzendesk/conversationkit/android/internal/rest/model/AuthorDto;Lzendesk/conversationkit/android/internal/rest/model/PostbackDto;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$zendesk_conversationkit_conversationkit_android", "(Lzendesk/conversationkit/android/internal/rest/model/SendPostbackRequestDto;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lzendesk/conversationkit/android/internal/rest/model/AuthorDto;", "component2", "()Lzendesk/conversationkit/android/internal/rest/model/PostbackDto;", "copy", "(Lzendesk/conversationkit/android/internal/rest/model/AuthorDto;Lzendesk/conversationkit/android/internal/rest/model/PostbackDto;)Lzendesk/conversationkit/android/internal/rest/model/SendPostbackRequestDto;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lzendesk/conversationkit/android/internal/rest/model/AuthorDto;", "getAuthor", "Lzendesk/conversationkit/android/internal/rest/model/PostbackDto;", "getPostback", "Companion", "$serializer", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class SendPostbackRequestDto {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final AuthorDto author;

    @NotNull
    private final PostbackDto postback;

    public /* synthetic */ SendPostbackRequestDto(int i11, AuthorDto authorDto, PostbackDto postbackDto, m1 m1Var) {
        if (3 != (i11 & 3)) {
            c1.j(i11, 3, SendPostbackRequestDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.author = authorDto;
        this.postback = postbackDto;
    }

    public static /* synthetic */ SendPostbackRequestDto copy$default(SendPostbackRequestDto sendPostbackRequestDto, AuthorDto authorDto, PostbackDto postbackDto, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            authorDto = sendPostbackRequestDto.author;
        }
        if ((i11 & 2) != 0) {
            postbackDto = sendPostbackRequestDto.postback;
        }
        return sendPostbackRequestDto.copy(authorDto, postbackDto);
    }

    public static final /* synthetic */ void write$Self$zendesk_conversationkit_conversationkit_android(SendPostbackRequestDto self, b output, SerialDescriptor serialDesc) {
        output.i(serialDesc, 0, AuthorDto$$serializer.INSTANCE, self.author);
        output.i(serialDesc, 1, PostbackDto$$serializer.INSTANCE, self.postback);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final AuthorDto getAuthor() {
        return this.author;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final PostbackDto getPostback() {
        return this.postback;
    }

    @NotNull
    public final SendPostbackRequestDto copy(@NotNull AuthorDto author, @NotNull PostbackDto postback) {
        author.getClass();
        postback.getClass();
        return new SendPostbackRequestDto(author, postback);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SendPostbackRequestDto)) {
            return false;
        }
        SendPostbackRequestDto sendPostbackRequestDto = (SendPostbackRequestDto) other;
        return Intrinsics.areEqual(this.author, sendPostbackRequestDto.author) && Intrinsics.areEqual(this.postback, sendPostbackRequestDto.postback);
    }

    @NotNull
    public final AuthorDto getAuthor() {
        return this.author;
    }

    @NotNull
    public final PostbackDto getPostback() {
        return this.postback;
    }

    public int hashCode() {
        return this.postback.hashCode() + (this.author.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "SendPostbackRequestDto(author=" + this.author + ", postback=" + this.postback + ")";
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/conversationkit/android/internal/rest/model/SendPostbackRequestDto$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/conversationkit/android/internal/rest/model/SendPostbackRequestDto;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return SendPostbackRequestDto$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public SendPostbackRequestDto(@NotNull AuthorDto authorDto, @NotNull PostbackDto postbackDto) {
        authorDto.getClass();
        postbackDto.getClass();
        this.author = authorDto;
        this.postback = postbackDto;
    }
}
