package zendesk.conversationkit.android.model;

import db0.b;
import i90.f;
import i90.g;
import i90.h;
import j4.s;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import m90.c1;
import m90.d;
import m90.m1;
import m90.r1;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.j;
import u70.l;
import u70.m;
import w.a0;
import w2.l1;
import zendesk.conversationkit.android.internal.FileExtKt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@h
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u001e2\u00020\u0001:\t\u001f !\"#$%&\u001eB\u001f\b\u0004\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0015\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u001a\u0012\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001b\u0010\u001c\u0082\u0001\b'()*+,-.¨\u0006/"}, d2 = {"Lzendesk/conversationkit/android/model/MessageContent;", "", "Lzendesk/conversationkit/android/model/MessageType;", "messageContentType", "", "blockChatInput", "<init>", "(Lzendesk/conversationkit/android/model/MessageType;Ljava/lang/Boolean;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lzendesk/conversationkit/android/model/MessageContent;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lzendesk/conversationkit/android/model/MessageType;", "getMessageContentType", "()Lzendesk/conversationkit/android/model/MessageType;", "getMessageContentType$annotations", "()V", "Ljava/lang/Boolean;", "getBlockChatInput", "()Ljava/lang/Boolean;", "getBlockChatInput$annotations", "Companion", "Unsupported", "Text", "FileUpload", "File", "Form", "FormResponse", "Carousel", "Image", "Lzendesk/conversationkit/android/model/MessageContent$Carousel;", "Lzendesk/conversationkit/android/model/MessageContent$File;", "Lzendesk/conversationkit/android/model/MessageContent$FileUpload;", "Lzendesk/conversationkit/android/model/MessageContent$Form;", "Lzendesk/conversationkit/android/model/MessageContent$FormResponse;", "Lzendesk/conversationkit/android/model/MessageContent$Image;", "Lzendesk/conversationkit/android/model/MessageContent$Text;", "Lzendesk/conversationkit/android/model/MessageContent$Unsupported;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class MessageContent {

    @Nullable
    private final Boolean blockChatInput;

    @NotNull
    private final MessageType messageContentType;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final j $cachedSerializer$delegate = l.a(m.PUBLICATION, new b(9));

    public /* synthetic */ MessageContent(MessageType messageType, Boolean bool, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? MessageType.UNSUPPORTED : messageType, (i11 & 2) != 0 ? null : bool, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return new f("zendesk.conversationkit.android.model.MessageContent", Reflection.getOrCreateKotlinClass(MessageContent.class), new KClass[]{Reflection.getOrCreateKotlinClass(Carousel.class), Reflection.getOrCreateKotlinClass(File.class), Reflection.getOrCreateKotlinClass(FileUpload.class), Reflection.getOrCreateKotlinClass(Form.class), Reflection.getOrCreateKotlinClass(FormResponse.class), Reflection.getOrCreateKotlinClass(Image.class), Reflection.getOrCreateKotlinClass(Text.class), Reflection.getOrCreateKotlinClass(Unsupported.class)}, new KSerializer[]{MessageContent$Carousel$$serializer.INSTANCE, MessageContent$File$$serializer.INSTANCE, MessageContent$FileUpload$$serializer.INSTANCE, MessageContent$Form$$serializer.INSTANCE, MessageContent$FormResponse$$serializer.INSTANCE, MessageContent$Image$$serializer.INSTANCE, MessageContent$Text$$serializer.INSTANCE, MessageContent$Unsupported$$serializer.INSTANCE}, new Annotation[0]);
    }

    @Nullable
    public Boolean getBlockChatInput() {
        return this.blockChatInput;
    }

    @NotNull
    public final MessageType getMessageContentType() {
        return this.messageContentType;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000210B+\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB?\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ6\u0010\u001f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020\u00072\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b(\u0010)R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b+\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b-\u0010\u001cR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b/\u0010\u001e¨\u00062"}, d2 = {"Lzendesk/conversationkit/android/model/MessageContent$Carousel;", "Lzendesk/conversationkit/android/model/MessageContent;", "", "Lzendesk/conversationkit/android/model/MessageItem;", "items", "Lzendesk/conversationkit/android/model/MessageSourceType;", "sourceType", "", "blockChatInput", "<init>", "(Ljava/util/List;Lzendesk/conversationkit/android/model/MessageSourceType;Ljava/lang/Boolean;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/util/List;Lzendesk/conversationkit/android/model/MessageSourceType;Ljava/lang/Boolean;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$zendesk_conversationkit_conversationkit_android", "(Lzendesk/conversationkit/android/model/MessageContent$Carousel;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()Lzendesk/conversationkit/android/model/MessageSourceType;", "component3", "()Ljava/lang/Boolean;", "copy", "(Ljava/util/List;Lzendesk/conversationkit/android/model/MessageSourceType;Ljava/lang/Boolean;)Lzendesk/conversationkit/android/model/MessageContent$Carousel;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getItems", "Lzendesk/conversationkit/android/model/MessageSourceType;", "getSourceType", "Ljava/lang/Boolean;", "getBlockChatInput", "Companion", "$serializer", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @h
    @g("carousel")
    public static final /* data */ class Carousel extends MessageContent {

        @NotNull
        private static final j[] $childSerializers;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @Nullable
        private final Boolean blockChatInput;

        @NotNull
        private final List<MessageItem> items;

        @NotNull
        private final MessageSourceType sourceType;

        static {
            m mVar = m.PUBLICATION;
            $childSerializers = new j[]{l.a(mVar, new b(10)), l.a(mVar, new b(11)), null};
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Carousel(int i11, List list, MessageSourceType messageSourceType, Boolean bool, m1 m1Var) {
            super(i11, m1Var);
            if (1 != (i11 & 1)) {
                c1.j(i11, 1, MessageContent$Carousel$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.items = list;
            if ((i11 & 2) == 0) {
                this.sourceType = MessageSourceType.BOT;
            } else {
                this.sourceType = messageSourceType;
            }
            if ((i11 & 4) == 0) {
                this.blockChatInput = Boolean.FALSE;
            } else {
                this.blockChatInput = bool;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new d(MessageItem$$serializer.INSTANCE, 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
            return MessageSourceType.INSTANCE.serializer();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Carousel copy$default(Carousel carousel, List list, MessageSourceType messageSourceType, Boolean bool, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = carousel.items;
            }
            if ((i11 & 2) != 0) {
                messageSourceType = carousel.sourceType;
            }
            if ((i11 & 4) != 0) {
                bool = carousel.blockChatInput;
            }
            return carousel.copy(list, messageSourceType, bool);
        }

        public static final /* synthetic */ void write$Self$zendesk_conversationkit_conversationkit_android(Carousel self, l90.b output, SerialDescriptor serialDesc) {
            MessageContent.write$Self(self, output, serialDesc);
            j[] jVarArr = $childSerializers;
            output.i(serialDesc, 0, (KSerializer) jVarArr[0].getValue(), self.items);
            if (output.C(serialDesc) || self.sourceType != MessageSourceType.BOT) {
                output.i(serialDesc, 1, (KSerializer) jVarArr[1].getValue(), self.sourceType);
            }
            if (!output.C(serialDesc) && Intrinsics.areEqual(self.getBlockChatInput(), Boolean.FALSE)) {
                return;
            }
            output.r(serialDesc, 2, m90.g.f29797a, self.getBlockChatInput());
        }

        @NotNull
        public final List<MessageItem> component1() {
            return this.items;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final MessageSourceType getSourceType() {
            return this.sourceType;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Boolean getBlockChatInput() {
            return this.blockChatInput;
        }

        @NotNull
        public final Carousel copy(@NotNull List<MessageItem> items, @NotNull MessageSourceType sourceType, @Nullable Boolean blockChatInput) {
            items.getClass();
            sourceType.getClass();
            return new Carousel(items, sourceType, blockChatInput);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Carousel)) {
                return false;
            }
            Carousel carousel = (Carousel) other;
            return Intrinsics.areEqual(this.items, carousel.items) && this.sourceType == carousel.sourceType && Intrinsics.areEqual(this.blockChatInput, carousel.blockChatInput);
        }

        @Override // zendesk.conversationkit.android.model.MessageContent
        @Nullable
        public Boolean getBlockChatInput() {
            return this.blockChatInput;
        }

        @NotNull
        public final List<MessageItem> getItems() {
            return this.items;
        }

        @NotNull
        public final MessageSourceType getSourceType() {
            return this.sourceType;
        }

        public int hashCode() {
            int iHashCode = (this.sourceType.hashCode() + (this.items.hashCode() * 31)) * 31;
            Boolean bool = this.blockChatInput;
            return iHashCode + (bool == null ? 0 : bool.hashCode());
        }

        @NotNull
        public String toString() {
            return "Carousel(items=" + this.items + ", sourceType=" + this.sourceType + ", blockChatInput=" + this.blockChatInput + ")";
        }

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/conversationkit/android/model/MessageContent$Carousel$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/conversationkit/android/model/MessageContent$Carousel;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return MessageContent$Carousel$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ Carousel(List list, MessageSourceType messageSourceType, Boolean bool, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, (i11 & 2) != 0 ? MessageSourceType.BOT : messageSourceType, (i11 & 4) != 0 ? Boolean.FALSE : bool);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Carousel(@NotNull List<MessageItem> list, @NotNull MessageSourceType messageSourceType, @Nullable Boolean bool) {
            super(MessageType.CAROUSEL, null, 2, 0 == true ? 1 : 0);
            list.getClass();
            messageSourceType.getClass();
            this.items = list;
            this.sourceType = messageSourceType;
            this.blockChatInput = bool;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0087\b\u0018\u0000 ?2\u00020\u0001:\u0002@?BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fBi\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001fJ\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001fJ\u0010\u0010#\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001fJ\u0010\u0010&\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b(\u0010)Jd\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b,\u0010\u001fJ\u0010\u0010-\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b-\u0010.J\u001a\u00101\u001a\u00020\f2\b\u00100\u001a\u0004\u0018\u00010/HÖ\u0003¢\u0006\u0004\b1\u00102R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00103\u001a\u0004\b5\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00103\u001a\u0004\b6\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00103\u001a\u0004\b7\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00108\u001a\u0004\b9\u0010$R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b:\u0010\u001fR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010;\u001a\u0004\b<\u0010'R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010=\u001a\u0004\b>\u0010)¨\u0006A"}, d2 = {"Lzendesk/conversationkit/android/model/MessageContent$File;", "Lzendesk/conversationkit/android/model/MessageContent;", "", TextBundle.TEXT_ENTRY, "altText", "mediaUrl", "mediaType", "", "mediaSize", "attachmentId", "Lzendesk/conversationkit/android/model/MessageSourceType;", "sourceType", "", "blockChatInput", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Lzendesk/conversationkit/android/model/MessageSourceType;Ljava/lang/Boolean;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Lzendesk/conversationkit/android/model/MessageSourceType;Ljava/lang/Boolean;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$zendesk_conversationkit_conversationkit_android", "(Lzendesk/conversationkit/android/model/MessageContent$File;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()J", "component6", "component7", "()Lzendesk/conversationkit/android/model/MessageSourceType;", "component8", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Lzendesk/conversationkit/android/model/MessageSourceType;Ljava/lang/Boolean;)Lzendesk/conversationkit/android/model/MessageContent$File;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getText", "getAltText", "getMediaUrl", "getMediaType", "J", "getMediaSize", "getAttachmentId", "Lzendesk/conversationkit/android/model/MessageSourceType;", "getSourceType", "Ljava/lang/Boolean;", "getBlockChatInput", "Companion", "$serializer", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @h
    @g("file")
    public static final /* data */ class File extends MessageContent {

        @NotNull
        private final String altText;

        @Nullable
        private final String attachmentId;

        @Nullable
        private final Boolean blockChatInput;
        private final long mediaSize;

        @NotNull
        private final String mediaType;

        @NotNull
        private final String mediaUrl;

        @NotNull
        private final MessageSourceType sourceType;

        @NotNull
        private final String text;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private static final j[] $childSerializers = {null, null, null, null, null, null, l.a(m.PUBLICATION, new b(12)), null};

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ File(int i11, String str, String str2, String str3, String str4, long j9, String str5, MessageSourceType messageSourceType, Boolean bool, m1 m1Var) {
            super(i11, m1Var);
            if (63 != (i11 & 63)) {
                c1.j(i11, 63, MessageContent$File$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.text = str;
            this.altText = str2;
            this.mediaUrl = str3;
            this.mediaType = str4;
            this.mediaSize = j9;
            this.attachmentId = str5;
            if ((i11 & 64) == 0) {
                this.sourceType = MessageSourceType.BOT;
            } else {
                this.sourceType = messageSourceType;
            }
            if ((i11 & 128) == 0) {
                this.blockChatInput = Boolean.FALSE;
            } else {
                this.blockChatInput = bool;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return MessageSourceType.INSTANCE.serializer();
        }

        public static /* synthetic */ File copy$default(File file, String str, String str2, String str3, String str4, long j9, String str5, MessageSourceType messageSourceType, Boolean bool, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = file.text;
            }
            if ((i11 & 2) != 0) {
                str2 = file.altText;
            }
            if ((i11 & 4) != 0) {
                str3 = file.mediaUrl;
            }
            if ((i11 & 8) != 0) {
                str4 = file.mediaType;
            }
            if ((i11 & 16) != 0) {
                j9 = file.mediaSize;
            }
            if ((i11 & 32) != 0) {
                str5 = file.attachmentId;
            }
            if ((i11 & 64) != 0) {
                messageSourceType = file.sourceType;
            }
            if ((i11 & 128) != 0) {
                bool = file.blockChatInput;
            }
            Boolean bool2 = bool;
            String str6 = str5;
            long j11 = j9;
            String str7 = str3;
            String str8 = str4;
            return file.copy(str, str2, str7, str8, j11, str6, messageSourceType, bool2);
        }

        public static final /* synthetic */ void write$Self$zendesk_conversationkit_conversationkit_android(File self, l90.b output, SerialDescriptor serialDesc) {
            MessageContent.write$Self(self, output, serialDesc);
            j[] jVarArr = $childSerializers;
            output.q(serialDesc, 0, self.text);
            output.q(serialDesc, 1, self.altText);
            output.q(serialDesc, 2, self.mediaUrl);
            output.q(serialDesc, 3, self.mediaType);
            output.B(serialDesc, 4, self.mediaSize);
            output.r(serialDesc, 5, r1.f29848a, self.attachmentId);
            if (output.C(serialDesc) || self.sourceType != MessageSourceType.BOT) {
                output.i(serialDesc, 6, (KSerializer) jVarArr[6].getValue(), self.sourceType);
            }
            if (!output.C(serialDesc) && Intrinsics.areEqual(self.getBlockChatInput(), Boolean.FALSE)) {
                return;
            }
            output.r(serialDesc, 7, m90.g.f29797a, self.getBlockChatInput());
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getAltText() {
            return this.altText;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getMediaUrl() {
            return this.mediaUrl;
        }

        @NotNull
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getMediaType() {
            return this.mediaType;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final long getMediaSize() {
            return this.mediaSize;
        }

        @Nullable
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getAttachmentId() {
            return this.attachmentId;
        }

        @NotNull
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final MessageSourceType getSourceType() {
            return this.sourceType;
        }

        @Nullable
        /* JADX INFO: renamed from: component8, reason: from getter */
        public final Boolean getBlockChatInput() {
            return this.blockChatInput;
        }

        @NotNull
        public final File copy(@NotNull String text, @NotNull String altText, @NotNull String mediaUrl, @NotNull String mediaType, long mediaSize, @Nullable String attachmentId, @NotNull MessageSourceType sourceType, @Nullable Boolean blockChatInput) {
            text.getClass();
            altText.getClass();
            mediaUrl.getClass();
            mediaType.getClass();
            sourceType.getClass();
            return new File(text, altText, mediaUrl, mediaType, mediaSize, attachmentId, sourceType, blockChatInput);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof File)) {
                return false;
            }
            File file = (File) other;
            return Intrinsics.areEqual(this.text, file.text) && Intrinsics.areEqual(this.altText, file.altText) && Intrinsics.areEqual(this.mediaUrl, file.mediaUrl) && Intrinsics.areEqual(this.mediaType, file.mediaType) && this.mediaSize == file.mediaSize && Intrinsics.areEqual(this.attachmentId, file.attachmentId) && this.sourceType == file.sourceType && Intrinsics.areEqual(this.blockChatInput, file.blockChatInput);
        }

        @NotNull
        public final String getAltText() {
            return this.altText;
        }

        @Nullable
        public final String getAttachmentId() {
            return this.attachmentId;
        }

        @Override // zendesk.conversationkit.android.model.MessageContent
        @Nullable
        public Boolean getBlockChatInput() {
            return this.blockChatInput;
        }

        public final long getMediaSize() {
            return this.mediaSize;
        }

        @NotNull
        public final String getMediaType() {
            return this.mediaType;
        }

        @NotNull
        public final String getMediaUrl() {
            return this.mediaUrl;
        }

        @NotNull
        public final MessageSourceType getSourceType() {
            return this.sourceType;
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            int iB = e0.f.b(l1.b(l1.b(l1.b(this.text.hashCode() * 31, 31, this.altText), 31, this.mediaUrl), 31, this.mediaType), 31, this.mediaSize);
            String str = this.attachmentId;
            int iHashCode = (this.sourceType.hashCode() + ((iB + (str == null ? 0 : str.hashCode())) * 31)) * 31;
            Boolean bool = this.blockChatInput;
            return iHashCode + (bool != null ? bool.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.text;
            String str2 = this.altText;
            String str3 = this.mediaUrl;
            String str4 = this.mediaType;
            long j9 = this.mediaSize;
            String str5 = this.attachmentId;
            MessageSourceType messageSourceType = this.sourceType;
            Boolean bool = this.blockChatInput;
            StringBuilder sbT = e0.f.t("File(text=", str, ", altText=", str2, ", mediaUrl=");
            s.A(sbT, str3, ", mediaType=", str4, ", mediaSize=");
            sbT.append(j9);
            sbT.append(", attachmentId=");
            sbT.append(str5);
            sbT.append(", sourceType=");
            sbT.append(messageSourceType);
            sbT.append(", blockChatInput=");
            sbT.append(bool);
            sbT.append(")");
            return sbT.toString();
        }

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/conversationkit/android/model/MessageContent$File$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/conversationkit/android/model/MessageContent$File;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return MessageContent$File$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ File(String str, String str2, String str3, String str4, long j9, String str5, MessageSourceType messageSourceType, Boolean bool, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, str4, j9, str5, (i11 & 64) != 0 ? MessageSourceType.BOT : messageSourceType, (i11 & 128) != 0 ? Boolean.FALSE : bool);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public File(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, long j9, @Nullable String str5, @NotNull MessageSourceType messageSourceType, @Nullable Boolean bool) {
            super(MessageType.FILE, null, 2, 0 == true ? 1 : 0);
            str.getClass();
            str2.getClass();
            str3.getClass();
            str4.getClass();
            messageSourceType.getClass();
            this.text = str;
            this.altText = str2;
            this.mediaUrl = str3;
            this.mediaType = str4;
            this.mediaSize = j9;
            this.attachmentId = str5;
            this.sourceType = messageSourceType;
            this.blockChatInput = bool;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0087\b\u0018\u0000 62\u00020\u0001:\u000276B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bBK\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001eJ\u0010\u0010#\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b#\u0010$JB\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u001eJ\u0010\u0010(\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020\u001a2\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010.\u001a\u0004\b0\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00101\u001a\u0004\b2\u0010!R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b3\u0010\u001eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00104\u001a\u0004\b5\u0010$¨\u00068"}, d2 = {"Lzendesk/conversationkit/android/model/MessageContent$FileUpload;", "Lzendesk/conversationkit/android/model/MessageContent;", "", "uri", "name", "", "size", "mimeType", "Lzendesk/conversationkit/android/model/MessageSourceType;", "sourceType", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Lzendesk/conversationkit/android/model/MessageSourceType;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;JLjava/lang/String;Lzendesk/conversationkit/android/model/MessageSourceType;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$zendesk_conversationkit_conversationkit_android", "(Lzendesk/conversationkit/android/model/MessageContent$FileUpload;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "isImageMimeType", "()Z", "component1", "()Ljava/lang/String;", "component2", "component3", "()J", "component4", "component5", "()Lzendesk/conversationkit/android/model/MessageSourceType;", "copy", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Lzendesk/conversationkit/android/model/MessageSourceType;)Lzendesk/conversationkit/android/model/MessageContent$FileUpload;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUri", "getName", "J", "getSize", "getMimeType", "Lzendesk/conversationkit/android/model/MessageSourceType;", "getSourceType", "Companion", "$serializer", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @h
    @g("file_upload")
    public static final /* data */ class FileUpload extends MessageContent {

        @NotNull
        private final String mimeType;

        @NotNull
        private final String name;
        private final long size;

        @NotNull
        private final MessageSourceType sourceType;

        @NotNull
        private final String uri;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private static final j[] $childSerializers = {null, null, null, null, l.a(m.PUBLICATION, new b(13))};

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ FileUpload(int i11, String str, String str2, long j9, String str3, MessageSourceType messageSourceType, m1 m1Var) {
            super(i11, m1Var);
            if (15 != (i11 & 15)) {
                c1.j(i11, 15, MessageContent$FileUpload$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.uri = str;
            this.name = str2;
            this.size = j9;
            this.mimeType = str3;
            if ((i11 & 16) == 0) {
                this.sourceType = MessageSourceType.BOT;
            } else {
                this.sourceType = messageSourceType;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return MessageSourceType.INSTANCE.serializer();
        }

        public static /* synthetic */ FileUpload copy$default(FileUpload fileUpload, String str, String str2, long j9, String str3, MessageSourceType messageSourceType, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = fileUpload.uri;
            }
            if ((i11 & 2) != 0) {
                str2 = fileUpload.name;
            }
            if ((i11 & 4) != 0) {
                j9 = fileUpload.size;
            }
            if ((i11 & 8) != 0) {
                str3 = fileUpload.mimeType;
            }
            if ((i11 & 16) != 0) {
                messageSourceType = fileUpload.sourceType;
            }
            long j11 = j9;
            return fileUpload.copy(str, str2, j11, str3, messageSourceType);
        }

        public static final /* synthetic */ void write$Self$zendesk_conversationkit_conversationkit_android(FileUpload self, l90.b output, SerialDescriptor serialDesc) {
            MessageContent.write$Self(self, output, serialDesc);
            j[] jVarArr = $childSerializers;
            output.q(serialDesc, 0, self.uri);
            output.q(serialDesc, 1, self.name);
            output.B(serialDesc, 2, self.size);
            output.q(serialDesc, 3, self.mimeType);
            if (!output.C(serialDesc) && self.sourceType == MessageSourceType.BOT) {
                return;
            }
            output.i(serialDesc, 4, (KSerializer) jVarArr[4].getValue(), self.sourceType);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getUri() {
            return this.uri;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final long getSize() {
            return this.size;
        }

        @NotNull
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getMimeType() {
            return this.mimeType;
        }

        @NotNull
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final MessageSourceType getSourceType() {
            return this.sourceType;
        }

        @NotNull
        public final FileUpload copy(@NotNull String uri, @NotNull String name, long size, @NotNull String mimeType, @NotNull MessageSourceType sourceType) {
            uri.getClass();
            name.getClass();
            mimeType.getClass();
            sourceType.getClass();
            return new FileUpload(uri, name, size, mimeType, sourceType);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FileUpload)) {
                return false;
            }
            FileUpload fileUpload = (FileUpload) other;
            return Intrinsics.areEqual(this.uri, fileUpload.uri) && Intrinsics.areEqual(this.name, fileUpload.name) && this.size == fileUpload.size && Intrinsics.areEqual(this.mimeType, fileUpload.mimeType) && this.sourceType == fileUpload.sourceType;
        }

        @NotNull
        public final String getMimeType() {
            return this.mimeType;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        public final long getSize() {
            return this.size;
        }

        @NotNull
        public final MessageSourceType getSourceType() {
            return this.sourceType;
        }

        @NotNull
        public final String getUri() {
            return this.uri;
        }

        public int hashCode() {
            return this.sourceType.hashCode() + l1.b(e0.f.b(l1.b(this.uri.hashCode() * 31, 31, this.name), 31, this.size), 31, this.mimeType);
        }

        public final boolean isImageMimeType() {
            return FileExtKt.isImageMimeType(this.mimeType);
        }

        @NotNull
        public String toString() {
            String str = this.uri;
            String str2 = this.name;
            long j9 = this.size;
            String str3 = this.mimeType;
            MessageSourceType messageSourceType = this.sourceType;
            StringBuilder sbT = e0.f.t("FileUpload(uri=", str, ", name=", str2, ", size=");
            sbT.append(j9);
            sbT.append(", mimeType=");
            sbT.append(str3);
            sbT.append(", sourceType=");
            sbT.append(messageSourceType);
            sbT.append(")");
            return sbT.toString();
        }

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/conversationkit/android/model/MessageContent$FileUpload$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/conversationkit/android/model/MessageContent$FileUpload;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return MessageContent$FileUpload$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ FileUpload(String str, String str2, long j9, String str3, MessageSourceType messageSourceType, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, j9, str3, (i11 & 16) != 0 ? MessageSourceType.BOT : messageSourceType);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public FileUpload(@NotNull String str, @NotNull String str2, long j9, @NotNull String str3, @NotNull MessageSourceType messageSourceType) {
            super(MessageType.FILE_UPLOAD, null, 2, 0 == true ? 1 : 0);
            str.getClass();
            str2.getClass();
            str3.getClass();
            messageSourceType.getClass();
            this.uri = str;
            this.name = str2;
            this.size = j9;
            this.mimeType = str3;
            this.sourceType = messageSourceType;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/.B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB?\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ6\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u001aJ\u0010\u0010\"\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020\u00072\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u001aR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010\u001cR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b-\u0010\u001e¨\u00060"}, d2 = {"Lzendesk/conversationkit/android/model/MessageContent$Form;", "Lzendesk/conversationkit/android/model/MessageContent;", "", "formId", "", "Lzendesk/conversationkit/android/model/Field;", "fields", "", "blockChatInput", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$zendesk_conversationkit_conversationkit_android", "(Lzendesk/conversationkit/android/model/MessageContent$Form;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;)Lzendesk/conversationkit/android/model/MessageContent$Form;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getFormId", "Ljava/util/List;", "getFields", "Ljava/lang/Boolean;", "getBlockChatInput", "Companion", "$serializer", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @h
    @g("form")
    public static final /* data */ class Form extends MessageContent {

        @Nullable
        private final Boolean blockChatInput;

        @NotNull
        private final List<Field> fields;

        @NotNull
        private final String formId;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private static final j[] $childSerializers = {null, l.a(m.PUBLICATION, new b(14)), null};

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Form(int i11, String str, List list, Boolean bool, m1 m1Var) {
            super(i11, m1Var);
            if (3 != (i11 & 3)) {
                c1.j(i11, 3, MessageContent$Form$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.formId = str;
            this.fields = list;
            if ((i11 & 4) == 0) {
                this.blockChatInput = Boolean.FALSE;
            } else {
                this.blockChatInput = bool;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new d(Field.INSTANCE.serializer(), 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Form copy$default(Form form, String str, List list, Boolean bool, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = form.formId;
            }
            if ((i11 & 2) != 0) {
                list = form.fields;
            }
            if ((i11 & 4) != 0) {
                bool = form.blockChatInput;
            }
            return form.copy(str, list, bool);
        }

        public static final /* synthetic */ void write$Self$zendesk_conversationkit_conversationkit_android(Form self, l90.b output, SerialDescriptor serialDesc) {
            MessageContent.write$Self(self, output, serialDesc);
            j[] jVarArr = $childSerializers;
            output.q(serialDesc, 0, self.formId);
            output.i(serialDesc, 1, (KSerializer) jVarArr[1].getValue(), self.fields);
            if (!output.C(serialDesc) && Intrinsics.areEqual(self.getBlockChatInput(), Boolean.FALSE)) {
                return;
            }
            output.r(serialDesc, 2, m90.g.f29797a, self.getBlockChatInput());
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getFormId() {
            return this.formId;
        }

        @NotNull
        public final List<Field> component2() {
            return this.fields;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Boolean getBlockChatInput() {
            return this.blockChatInput;
        }

        @NotNull
        public final Form copy(@NotNull String formId, @NotNull List<? extends Field> fields, @Nullable Boolean blockChatInput) {
            formId.getClass();
            fields.getClass();
            return new Form(formId, fields, blockChatInput);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Form)) {
                return false;
            }
            Form form = (Form) other;
            return Intrinsics.areEqual(this.formId, form.formId) && Intrinsics.areEqual(this.fields, form.fields) && Intrinsics.areEqual(this.blockChatInput, form.blockChatInput);
        }

        @Override // zendesk.conversationkit.android.model.MessageContent
        @Nullable
        public Boolean getBlockChatInput() {
            return this.blockChatInput;
        }

        @NotNull
        public final List<Field> getFields() {
            return this.fields;
        }

        @NotNull
        public final String getFormId() {
            return this.formId;
        }

        public int hashCode() {
            int iC = e0.f.c(this.fields, this.formId.hashCode() * 31, 31);
            Boolean bool = this.blockChatInput;
            return iC + (bool == null ? 0 : bool.hashCode());
        }

        @NotNull
        public String toString() {
            return "Form(formId=" + this.formId + ", fields=" + this.fields + ", blockChatInput=" + this.blockChatInput + ")";
        }

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/conversationkit/android/model/MessageContent$Form$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/conversationkit/android/model/MessageContent$Form;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return MessageContent$Form$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ Form(String str, List list, Boolean bool, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, list, (i11 & 4) != 0 ? Boolean.FALSE : bool);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Form(@NotNull String str, @NotNull List<? extends Field> list, @Nullable Boolean bool) {
            super(MessageType.FORM, null, 2, 0 == true ? 1 : 0);
            str.getClass();
            list.getClass();
            this.formId = str;
            this.fields = list;
            this.blockChatInput = bool;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*)B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ*\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0018J\u0010\u0010\u001e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010\u001a¨\u0006+"}, d2 = {"Lzendesk/conversationkit/android/model/MessageContent$FormResponse;", "Lzendesk/conversationkit/android/model/MessageContent;", "", "quotedMessageId", "", "Lzendesk/conversationkit/android/model/Field;", "fields", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$zendesk_conversationkit_conversationkit_android", "(Lzendesk/conversationkit/android/model/MessageContent$FormResponse;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lzendesk/conversationkit/android/model/MessageContent$FormResponse;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getQuotedMessageId", "Ljava/util/List;", "getFields", "Companion", "$serializer", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @h
    @g("formResponse")
    public static final /* data */ class FormResponse extends MessageContent {

        @NotNull
        private final List<Field> fields;

        @NotNull
        private final String quotedMessageId;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private static final j[] $childSerializers = {null, l.a(m.PUBLICATION, new b(15))};

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ FormResponse(int i11, String str, List list, m1 m1Var) {
            super(i11, m1Var);
            if (3 != (i11 & 3)) {
                c1.j(i11, 3, MessageContent$FormResponse$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.quotedMessageId = str;
            this.fields = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new d(Field.INSTANCE.serializer(), 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ FormResponse copy$default(FormResponse formResponse, String str, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = formResponse.quotedMessageId;
            }
            if ((i11 & 2) != 0) {
                list = formResponse.fields;
            }
            return formResponse.copy(str, list);
        }

        public static final /* synthetic */ void write$Self$zendesk_conversationkit_conversationkit_android(FormResponse self, l90.b output, SerialDescriptor serialDesc) {
            MessageContent.write$Self(self, output, serialDesc);
            j[] jVarArr = $childSerializers;
            output.q(serialDesc, 0, self.quotedMessageId);
            output.i(serialDesc, 1, (KSerializer) jVarArr[1].getValue(), self.fields);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getQuotedMessageId() {
            return this.quotedMessageId;
        }

        @NotNull
        public final List<Field> component2() {
            return this.fields;
        }

        @NotNull
        public final FormResponse copy(@NotNull String quotedMessageId, @NotNull List<? extends Field> fields) {
            quotedMessageId.getClass();
            fields.getClass();
            return new FormResponse(quotedMessageId, fields);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FormResponse)) {
                return false;
            }
            FormResponse formResponse = (FormResponse) other;
            return Intrinsics.areEqual(this.quotedMessageId, formResponse.quotedMessageId) && Intrinsics.areEqual(this.fields, formResponse.fields);
        }

        @NotNull
        public final List<Field> getFields() {
            return this.fields;
        }

        @NotNull
        public final String getQuotedMessageId() {
            return this.quotedMessageId;
        }

        public int hashCode() {
            return this.fields.hashCode() + (this.quotedMessageId.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "FormResponse(quotedMessageId=" + this.quotedMessageId + ", fields=" + this.fields + ")";
        }

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/conversationkit/android/model/MessageContent$FormResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/conversationkit/android/model/MessageContent$FormResponse;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return MessageContent$FormResponse$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public FormResponse(@NotNull String str, @NotNull List<? extends Field> list) {
            super(MessageType.FORM_RESPONSE, null, 2, 0 == true ? 1 : 0);
            str.getClass();
            list.getClass();
            this.quotedMessageId = str;
            this.fields = list;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u0000 L2\u00020\u0001:\u0002MLB{\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014B\u008d\u0001\b\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0013\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0010\u0010\u001f\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010!\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001bJ\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001bJ\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001bJ\u0010\u0010&\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0090\u0001\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b,\u0010\u001bJ\u0010\u0010-\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b-\u0010.J\u001a\u00101\u001a\u00020\u00112\b\u00100\u001a\u0004\u0018\u00010/HÖ\u0003¢\u0006\u0004\b1\u00102J'\u0010;\u001a\u0002082\u0006\u00103\u001a\u00020\u00002\u0006\u00105\u001a\u0002042\u0006\u00107\u001a\u000206H\u0001¢\u0006\u0004\b9\u0010:R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010<\u001a\u0004\b=\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010<\u001a\u0004\b>\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010<\u001a\u0004\b?\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010<\u001a\u0004\b@\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010A\u001a\u0004\bB\u0010 R\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010C\u001a\u0004\bD\u0010\"R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010<\u001a\u0004\bE\u0010\u001bR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010<\u001a\u0004\bF\u0010\u001bR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010<\u001a\u0004\bG\u0010\u001bR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010H\u001a\u0004\bI\u0010'R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010J\u001a\u0004\bK\u0010)¨\u0006N"}, d2 = {"Lzendesk/conversationkit/android/model/MessageContent$Image;", "Lzendesk/conversationkit/android/model/MessageContent;", "", TextBundle.TEXT_ENTRY, "mediaUrl", "localUri", "mediaType", "", "mediaSize", "", "Lzendesk/conversationkit/android/model/MessageAction;", "actions", "attachmentId", "htmlText", "altText", "Lzendesk/conversationkit/android/model/MessageSourceType;", "sourceType", "", "blockChatInput", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lzendesk/conversationkit/android/model/MessageSourceType;Ljava/lang/Boolean;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lzendesk/conversationkit/android/model/MessageSourceType;Ljava/lang/Boolean;Lm90/m1;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()J", "component6", "()Ljava/util/List;", "component7", "component8", "component9", "component10", "()Lzendesk/conversationkit/android/model/MessageSourceType;", "component11", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lzendesk/conversationkit/android/model/MessageSourceType;Ljava/lang/Boolean;)Lzendesk/conversationkit/android/model/MessageContent$Image;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$zendesk_conversationkit_conversationkit_android", "(Lzendesk/conversationkit/android/model/MessageContent$Image;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getText", "getMediaUrl", "getLocalUri", "getMediaType", "J", "getMediaSize", "Ljava/util/List;", "getActions", "getAttachmentId", "getHtmlText", "getAltText", "Lzendesk/conversationkit/android/model/MessageSourceType;", "getSourceType", "Ljava/lang/Boolean;", "getBlockChatInput", "Companion", "$serializer", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @h
    @g("image")
    public static final /* data */ class Image extends MessageContent {

        @NotNull
        private static final j[] $childSerializers;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @Nullable
        private final List<MessageAction> actions;

        @Nullable
        private final String altText;

        @Nullable
        private final String attachmentId;

        @Nullable
        private final Boolean blockChatInput;

        @Nullable
        private final String htmlText;

        @Nullable
        private final String localUri;
        private final long mediaSize;

        @NotNull
        private final String mediaType;

        @NotNull
        private final String mediaUrl;

        @NotNull
        private final MessageSourceType sourceType;

        @NotNull
        private final String text;

        static {
            m mVar = m.PUBLICATION;
            $childSerializers = new j[]{null, null, null, null, null, l.a(mVar, new b(16)), null, null, null, l.a(mVar, new b(17)), null};
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Image(int i11, String str, String str2, String str3, String str4, long j9, List list, String str5, String str6, String str7, MessageSourceType messageSourceType, Boolean bool, m1 m1Var) {
            super(i11, m1Var);
            if (95 != (i11 & 95)) {
                c1.j(i11, 95, MessageContent$Image$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.text = str;
            this.mediaUrl = str2;
            this.localUri = str3;
            this.mediaType = str4;
            this.mediaSize = j9;
            if ((i11 & 32) == 0) {
                this.actions = null;
            } else {
                this.actions = list;
            }
            this.attachmentId = str5;
            if ((i11 & 128) == 0) {
                this.htmlText = null;
            } else {
                this.htmlText = str6;
            }
            if ((i11 & 256) == 0) {
                this.altText = null;
            } else {
                this.altText = str7;
            }
            if ((i11 & 512) == 0) {
                this.sourceType = MessageSourceType.BOT;
            } else {
                this.sourceType = messageSourceType;
            }
            this.blockChatInput = (i11 & 1024) == 0 ? Boolean.FALSE : bool;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new d(MessageAction.INSTANCE.serializer(), 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
            return MessageSourceType.INSTANCE.serializer();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Image copy$default(Image image, String str, String str2, String str3, String str4, long j9, List list, String str5, String str6, String str7, MessageSourceType messageSourceType, Boolean bool, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = image.text;
            }
            if ((i11 & 2) != 0) {
                str2 = image.mediaUrl;
            }
            if ((i11 & 4) != 0) {
                str3 = image.localUri;
            }
            if ((i11 & 8) != 0) {
                str4 = image.mediaType;
            }
            if ((i11 & 16) != 0) {
                j9 = image.mediaSize;
            }
            if ((i11 & 32) != 0) {
                list = image.actions;
            }
            if ((i11 & 64) != 0) {
                str5 = image.attachmentId;
            }
            if ((i11 & 128) != 0) {
                str6 = image.htmlText;
            }
            if ((i11 & 256) != 0) {
                str7 = image.altText;
            }
            if ((i11 & 512) != 0) {
                messageSourceType = image.sourceType;
            }
            if ((i11 & 1024) != 0) {
                bool = image.blockChatInput;
            }
            MessageSourceType messageSourceType2 = messageSourceType;
            Boolean bool2 = bool;
            long j11 = j9;
            String str8 = str3;
            String str9 = str4;
            return image.copy(str, str2, str8, str9, j11, list, str5, str6, str7, messageSourceType2, bool2);
        }

        public static final /* synthetic */ void write$Self$zendesk_conversationkit_conversationkit_android(Image self, l90.b output, SerialDescriptor serialDesc) {
            MessageContent.write$Self(self, output, serialDesc);
            j[] jVarArr = $childSerializers;
            output.q(serialDesc, 0, self.text);
            output.q(serialDesc, 1, self.mediaUrl);
            r1 r1Var = r1.f29848a;
            output.r(serialDesc, 2, r1Var, self.localUri);
            output.q(serialDesc, 3, self.mediaType);
            output.B(serialDesc, 4, self.mediaSize);
            if (output.C(serialDesc) || self.actions != null) {
                output.r(serialDesc, 5, (KSerializer) jVarArr[5].getValue(), self.actions);
            }
            output.r(serialDesc, 6, r1Var, self.attachmentId);
            if (output.C(serialDesc) || self.htmlText != null) {
                output.r(serialDesc, 7, r1Var, self.htmlText);
            }
            if (output.C(serialDesc) || self.altText != null) {
                output.r(serialDesc, 8, r1Var, self.altText);
            }
            if (output.C(serialDesc) || self.sourceType != MessageSourceType.BOT) {
                output.i(serialDesc, 9, (KSerializer) jVarArr[9].getValue(), self.sourceType);
            }
            if (!output.C(serialDesc) && Intrinsics.areEqual(self.getBlockChatInput(), Boolean.FALSE)) {
                return;
            }
            output.r(serialDesc, 10, m90.g.f29797a, self.getBlockChatInput());
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @NotNull
        /* JADX INFO: renamed from: component10, reason: from getter */
        public final MessageSourceType getSourceType() {
            return this.sourceType;
        }

        @Nullable
        /* JADX INFO: renamed from: component11, reason: from getter */
        public final Boolean getBlockChatInput() {
            return this.blockChatInput;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getMediaUrl() {
            return this.mediaUrl;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getLocalUri() {
            return this.localUri;
        }

        @NotNull
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getMediaType() {
            return this.mediaType;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final long getMediaSize() {
            return this.mediaSize;
        }

        @Nullable
        public final List<MessageAction> component6() {
            return this.actions;
        }

        @Nullable
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getAttachmentId() {
            return this.attachmentId;
        }

        @Nullable
        /* JADX INFO: renamed from: component8, reason: from getter */
        public final String getHtmlText() {
            return this.htmlText;
        }

        @Nullable
        /* JADX INFO: renamed from: component9, reason: from getter */
        public final String getAltText() {
            return this.altText;
        }

        @NotNull
        public final Image copy(@NotNull String text, @NotNull String mediaUrl, @Nullable String localUri, @NotNull String mediaType, long mediaSize, @Nullable List<? extends MessageAction> actions, @Nullable String attachmentId, @Nullable String htmlText, @Nullable String altText, @NotNull MessageSourceType sourceType, @Nullable Boolean blockChatInput) {
            text.getClass();
            mediaUrl.getClass();
            mediaType.getClass();
            sourceType.getClass();
            return new Image(text, mediaUrl, localUri, mediaType, mediaSize, actions, attachmentId, htmlText, altText, sourceType, blockChatInput);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Image)) {
                return false;
            }
            Image image = (Image) other;
            return Intrinsics.areEqual(this.text, image.text) && Intrinsics.areEqual(this.mediaUrl, image.mediaUrl) && Intrinsics.areEqual(this.localUri, image.localUri) && Intrinsics.areEqual(this.mediaType, image.mediaType) && this.mediaSize == image.mediaSize && Intrinsics.areEqual(this.actions, image.actions) && Intrinsics.areEqual(this.attachmentId, image.attachmentId) && Intrinsics.areEqual(this.htmlText, image.htmlText) && Intrinsics.areEqual(this.altText, image.altText) && this.sourceType == image.sourceType && Intrinsics.areEqual(this.blockChatInput, image.blockChatInput);
        }

        @Nullable
        public final List<MessageAction> getActions() {
            return this.actions;
        }

        @Nullable
        public final String getAltText() {
            return this.altText;
        }

        @Nullable
        public final String getAttachmentId() {
            return this.attachmentId;
        }

        @Override // zendesk.conversationkit.android.model.MessageContent
        @Nullable
        public Boolean getBlockChatInput() {
            return this.blockChatInput;
        }

        @Nullable
        public final String getHtmlText() {
            return this.htmlText;
        }

        @Nullable
        public final String getLocalUri() {
            return this.localUri;
        }

        public final long getMediaSize() {
            return this.mediaSize;
        }

        @NotNull
        public final String getMediaType() {
            return this.mediaType;
        }

        @NotNull
        public final String getMediaUrl() {
            return this.mediaUrl;
        }

        @NotNull
        public final MessageSourceType getSourceType() {
            return this.sourceType;
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            int iB = l1.b(this.text.hashCode() * 31, 31, this.mediaUrl);
            String str = this.localUri;
            int iB2 = e0.f.b(l1.b((iB + (str == null ? 0 : str.hashCode())) * 31, 31, this.mediaType), 31, this.mediaSize);
            List<MessageAction> list = this.actions;
            int iHashCode = (iB2 + (list == null ? 0 : list.hashCode())) * 31;
            String str2 = this.attachmentId;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.htmlText;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.altText;
            int iHashCode4 = (this.sourceType.hashCode() + ((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31)) * 31;
            Boolean bool = this.blockChatInput;
            return iHashCode4 + (bool != null ? bool.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.text;
            String str2 = this.mediaUrl;
            String str3 = this.localUri;
            String str4 = this.mediaType;
            long j9 = this.mediaSize;
            List<MessageAction> list = this.actions;
            String str5 = this.attachmentId;
            String str6 = this.htmlText;
            String str7 = this.altText;
            MessageSourceType messageSourceType = this.sourceType;
            Boolean bool = this.blockChatInput;
            StringBuilder sbT = e0.f.t("Image(text=", str, ", mediaUrl=", str2, ", localUri=");
            s.A(sbT, str3, ", mediaType=", str4, ", mediaSize=");
            sbT.append(j9);
            sbT.append(", actions=");
            sbT.append(list);
            s.A(sbT, ", attachmentId=", str5, ", htmlText=", str6);
            sbT.append(", altText=");
            sbT.append(str7);
            sbT.append(", sourceType=");
            sbT.append(messageSourceType);
            sbT.append(", blockChatInput=");
            sbT.append(bool);
            sbT.append(")");
            return sbT.toString();
        }

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/conversationkit/android/model/MessageContent$Image$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/conversationkit/android/model/MessageContent$Image;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return MessageContent$Image$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ Image(String str, String str2, String str3, String str4, long j9, List list, String str5, String str6, String str7, MessageSourceType messageSourceType, Boolean bool, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, str4, j9, (i11 & 32) != 0 ? null : list, str5, (i11 & 128) != 0 ? null : str6, (i11 & 256) != 0 ? null : str7, (i11 & 512) != 0 ? MessageSourceType.BOT : messageSourceType, (i11 & 1024) != 0 ? Boolean.FALSE : bool);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Image(@NotNull String str, @NotNull String str2, @Nullable String str3, @NotNull String str4, long j9, @Nullable List<? extends MessageAction> list, @Nullable String str5, @Nullable String str6, @Nullable String str7, @NotNull MessageSourceType messageSourceType, @Nullable Boolean bool) {
            super(MessageType.IMAGE, null, 2, 0 == true ? 1 : 0);
            str.getClass();
            str2.getClass();
            str4.getClass();
            messageSourceType.getClass();
            this.text = str;
            this.mediaUrl = str2;
            this.localUri = str3;
            this.mediaType = str4;
            this.mediaSize = j9;
            this.actions = list;
            this.attachmentId = str5;
            this.htmlText = str6;
            this.altText = str7;
            this.sourceType = messageSourceType;
            this.blockChatInput = bool;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000287BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rBS\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001dJ\u0010\u0010!\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b#\u0010$JN\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u001dJ\u0010\u0010(\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020\n2\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u001dR\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b1\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b2\u0010\u001dR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b4\u0010\"R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u00105\u001a\u0004\b6\u0010$¨\u00069"}, d2 = {"Lzendesk/conversationkit/android/model/MessageContent$Text;", "Lzendesk/conversationkit/android/model/MessageContent;", "", TextBundle.TEXT_ENTRY, "", "Lzendesk/conversationkit/android/model/MessageAction;", "actions", "htmlText", "Lzendesk/conversationkit/android/model/MessageSourceType;", "sourceType", "", "blockChatInput", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lzendesk/conversationkit/android/model/MessageSourceType;Ljava/lang/Boolean;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Lzendesk/conversationkit/android/model/MessageSourceType;Ljava/lang/Boolean;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$zendesk_conversationkit_conversationkit_android", "(Lzendesk/conversationkit/android/model/MessageContent$Text;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "component4", "()Lzendesk/conversationkit/android/model/MessageSourceType;", "component5", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lzendesk/conversationkit/android/model/MessageSourceType;Ljava/lang/Boolean;)Lzendesk/conversationkit/android/model/MessageContent$Text;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getText", "Ljava/util/List;", "getActions", "getHtmlText", "Lzendesk/conversationkit/android/model/MessageSourceType;", "getSourceType", "Ljava/lang/Boolean;", "getBlockChatInput", "Companion", "$serializer", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @h
    @g(TextBundle.TEXT_ENTRY)
    public static final /* data */ class Text extends MessageContent {

        @NotNull
        private static final j[] $childSerializers;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @Nullable
        private final List<MessageAction> actions;

        @Nullable
        private final Boolean blockChatInput;

        @Nullable
        private final String htmlText;

        @NotNull
        private final MessageSourceType sourceType;

        @NotNull
        private final String text;

        static {
            m mVar = m.PUBLICATION;
            $childSerializers = new j[]{null, l.a(mVar, new b(18)), null, l.a(mVar, new b(19)), null};
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Text(int i11, String str, List list, String str2, MessageSourceType messageSourceType, Boolean bool, m1 m1Var) {
            super(i11, m1Var);
            if (1 != (i11 & 1)) {
                c1.j(i11, 1, MessageContent$Text$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.text = str;
            if ((i11 & 2) == 0) {
                this.actions = null;
            } else {
                this.actions = list;
            }
            if ((i11 & 4) == 0) {
                this.htmlText = null;
            } else {
                this.htmlText = str2;
            }
            if ((i11 & 8) == 0) {
                this.sourceType = MessageSourceType.BOT;
            } else {
                this.sourceType = messageSourceType;
            }
            if ((i11 & 16) == 0) {
                this.blockChatInput = Boolean.FALSE;
            } else {
                this.blockChatInput = bool;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new d(MessageAction.INSTANCE.serializer(), 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
            return MessageSourceType.INSTANCE.serializer();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Text copy$default(Text text, String str, List list, String str2, MessageSourceType messageSourceType, Boolean bool, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = text.text;
            }
            if ((i11 & 2) != 0) {
                list = text.actions;
            }
            if ((i11 & 4) != 0) {
                str2 = text.htmlText;
            }
            if ((i11 & 8) != 0) {
                messageSourceType = text.sourceType;
            }
            if ((i11 & 16) != 0) {
                bool = text.blockChatInput;
            }
            Boolean bool2 = bool;
            String str3 = str2;
            return text.copy(str, list, str3, messageSourceType, bool2);
        }

        public static final /* synthetic */ void write$Self$zendesk_conversationkit_conversationkit_android(Text self, l90.b output, SerialDescriptor serialDesc) {
            MessageContent.write$Self(self, output, serialDesc);
            j[] jVarArr = $childSerializers;
            output.q(serialDesc, 0, self.text);
            if (output.C(serialDesc) || self.actions != null) {
                output.r(serialDesc, 1, (KSerializer) jVarArr[1].getValue(), self.actions);
            }
            if (output.C(serialDesc) || self.htmlText != null) {
                output.r(serialDesc, 2, r1.f29848a, self.htmlText);
            }
            if (output.C(serialDesc) || self.sourceType != MessageSourceType.BOT) {
                output.i(serialDesc, 3, (KSerializer) jVarArr[3].getValue(), self.sourceType);
            }
            if (!output.C(serialDesc) && Intrinsics.areEqual(self.getBlockChatInput(), Boolean.FALSE)) {
                return;
            }
            output.r(serialDesc, 4, m90.g.f29797a, self.getBlockChatInput());
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @Nullable
        public final List<MessageAction> component2() {
            return this.actions;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getHtmlText() {
            return this.htmlText;
        }

        @NotNull
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final MessageSourceType getSourceType() {
            return this.sourceType;
        }

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final Boolean getBlockChatInput() {
            return this.blockChatInput;
        }

        @NotNull
        public final Text copy(@NotNull String text, @Nullable List<? extends MessageAction> actions, @Nullable String htmlText, @NotNull MessageSourceType sourceType, @Nullable Boolean blockChatInput) {
            text.getClass();
            sourceType.getClass();
            return new Text(text, actions, htmlText, sourceType, blockChatInput);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Text)) {
                return false;
            }
            Text text = (Text) other;
            return Intrinsics.areEqual(this.text, text.text) && Intrinsics.areEqual(this.actions, text.actions) && Intrinsics.areEqual(this.htmlText, text.htmlText) && this.sourceType == text.sourceType && Intrinsics.areEqual(this.blockChatInput, text.blockChatInput);
        }

        @Nullable
        public final List<MessageAction> getActions() {
            return this.actions;
        }

        @Override // zendesk.conversationkit.android.model.MessageContent
        @Nullable
        public Boolean getBlockChatInput() {
            return this.blockChatInput;
        }

        @Nullable
        public final String getHtmlText() {
            return this.htmlText;
        }

        @NotNull
        public final MessageSourceType getSourceType() {
            return this.sourceType;
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            int iHashCode = this.text.hashCode() * 31;
            List<MessageAction> list = this.actions;
            int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.htmlText;
            int iHashCode3 = (this.sourceType.hashCode() + ((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31)) * 31;
            Boolean bool = this.blockChatInput;
            return iHashCode3 + (bool != null ? bool.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Text(text=" + this.text + ", actions=" + this.actions + ", htmlText=" + this.htmlText + ", sourceType=" + this.sourceType + ", blockChatInput=" + this.blockChatInput + ")";
        }

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/conversationkit/android/model/MessageContent$Text$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/conversationkit/android/model/MessageContent$Text;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return MessageContent$Text$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ Text(String str, List list, String str2, MessageSourceType messageSourceType, Boolean bool, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i11 & 2) != 0 ? null : list, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? MessageSourceType.BOT : messageSourceType, (i11 & 16) != 0 ? Boolean.FALSE : bool);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Text(@NotNull String str, @Nullable List<? extends MessageAction> list, @Nullable String str2, @NotNull MessageSourceType messageSourceType, @Nullable Boolean bool) {
            super(MessageType.TEXT, null, 2, 0 == true ? 1 : 0);
            str.getClass();
            messageSourceType.getClass();
            this.text = str;
            this.actions = list;
            this.htmlText = str2;
            this.sourceType = messageSourceType;
            this.blockChatInput = bool;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002$#B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0016\u001a\u00020\u0002HÀ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0015J\u0010\u0010\u001a\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0015¨\u0006%"}, d2 = {"Lzendesk/conversationkit/android/model/MessageContent$Unsupported;", "Lzendesk/conversationkit/android/model/MessageContent;", "", "id", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$zendesk_conversationkit_conversationkit_android", "(Lzendesk/conversationkit/android/model/MessageContent$Unsupported;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1$zendesk_conversationkit_conversationkit_android", "()Ljava/lang/String;", "component1", "copy", "(Ljava/lang/String;)Lzendesk/conversationkit/android/model/MessageContent$Unsupported;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId$zendesk_conversationkit_conversationkit_android", "Companion", "$serializer", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @h
    @g("unsupported")
    public static final /* data */ class Unsupported extends MessageContent {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final String id;

        public /* synthetic */ Unsupported(int i11, String str, m1 m1Var) {
            super(i11, m1Var);
            if ((i11 & 1) == 0) {
                this.id = UUID.randomUUID().toString();
            } else {
                this.id = str;
            }
        }

        public static /* synthetic */ Unsupported copy$default(Unsupported unsupported, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = unsupported.id;
            }
            return unsupported.copy(str);
        }

        public static final /* synthetic */ void write$Self$zendesk_conversationkit_conversationkit_android(Unsupported self, l90.b output, SerialDescriptor serialDesc) {
            MessageContent.write$Self(self, output, serialDesc);
            if (!output.C(serialDesc) && Intrinsics.areEqual(self.id, UUID.randomUUID().toString())) {
                return;
            }
            output.q(serialDesc, 0, self.id);
        }

        @NotNull
        /* JADX INFO: renamed from: component1$zendesk_conversationkit_conversationkit_android, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @NotNull
        public final Unsupported copy(@NotNull String id2) {
            id2.getClass();
            return new Unsupported(id2);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Unsupported) && Intrinsics.areEqual(this.id, ((Unsupported) other).id);
        }

        @NotNull
        public final String getId$zendesk_conversationkit_conversationkit_android() {
            return this.id;
        }

        public int hashCode() {
            return this.id.hashCode();
        }

        @NotNull
        public String toString() {
            return a0.p("Unsupported(id=", this.id, ")");
        }

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/conversationkit/android/model/MessageContent$Unsupported$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/conversationkit/android/model/MessageContent$Unsupported;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return MessageContent$Unsupported$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Unsupported() {
            this((String) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public /* synthetic */ Unsupported(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? UUID.randomUUID().toString() : str);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Unsupported(@NotNull String str) {
            super(MessageType.UNSUPPORTED, null, 2, 0 == true ? 1 : 0);
            str.getClass();
            this.id = str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/conversationkit/android/model/MessageContent$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/conversationkit/android/model/MessageContent;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) MessageContent.$cachedSerializer$delegate.getValue();
        }

        @NotNull
        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static /* synthetic */ void getBlockChatInput$annotations() {
    }

    public static /* synthetic */ void getMessageContentType$annotations() {
    }

    public /* synthetic */ MessageContent(int i11, m1 m1Var) {
        this.messageContentType = MessageType.UNSUPPORTED;
        this.blockChatInput = null;
    }

    private MessageContent(MessageType messageType, Boolean bool) {
        this.messageContentType = messageType;
        this.blockChatInput = bool;
    }

    public /* synthetic */ MessageContent(MessageType messageType, Boolean bool, DefaultConstructorMarker defaultConstructorMarker) {
        this(messageType, bool);
    }

    public static final /* synthetic */ void write$Self(MessageContent self, l90.b output, SerialDescriptor serialDesc) {
    }
}
