package zendesk.android.messaging;

import com.tgtg.componentlibrary.component.pageheader.PantryPageHeaderKt;
import i90.f;
import i90.h;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.c1;
import m90.m1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.j;
import u70.l;
import u70.m;
import v0.n;
import yu.a;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@h
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00112\u00020\u0001:\u0006\u0012\u0013\u0014\u0015\u0016\u0011B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0001\u0004\u0017\u0018\u0019\u001a¨\u0006\u001b"}, d2 = {"Lzendesk/android/messaging/MessagingScreen;", "", "<init>", "()V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lzendesk/android/messaging/MessagingScreen;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Companion", "MostRecentActiveConversation", "ConversationsList", "Conversation", "NewConversation", "ExitAction", "Lzendesk/android/messaging/MessagingScreen$Conversation;", "Lzendesk/android/messaging/MessagingScreen$ConversationsList;", "Lzendesk/android/messaging/MessagingScreen$MostRecentActiveConversation;", "Lzendesk/android/messaging/MessagingScreen$NewConversation;", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class MessagingScreen {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final j $cachedSerializer$delegate = l.a(m.PUBLICATION, new a(18));

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @h
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005¨\u0006\u0006"}, d2 = {"Lzendesk/android/messaging/MessagingScreen$ConversationsList;", "Lzendesk/android/messaging/MessagingScreen;", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ConversationsList extends MessagingScreen {

        @NotNull
        public static final ConversationsList INSTANCE = new ConversationsList();
        private static final /* synthetic */ j $cachedSerializer$delegate = l.a(m.PUBLICATION, new a(20));

        private ConversationsList() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new i90.a("zendesk.android.messaging.MessagingScreen.ConversationsList", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        @NotNull
        public final KSerializer serializer() {
            return get$cachedSerializer();
        }
    }

    public /* synthetic */ MessagingScreen(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return new f("zendesk.android.messaging.MessagingScreen", Reflection.getOrCreateKotlinClass(MessagingScreen.class), new KClass[]{Reflection.getOrCreateKotlinClass(Conversation.class), Reflection.getOrCreateKotlinClass(ConversationsList.class), Reflection.getOrCreateKotlinClass(MostRecentActiveConversation.class), Reflection.getOrCreateKotlinClass(NewConversation.class)}, new KSerializer[]{MessagingScreen$Conversation$$serializer.INSTANCE, new i90.a("zendesk.android.messaging.MessagingScreen.ConversationsList", ConversationsList.INSTANCE, new Annotation[0]), MessagingScreen$MostRecentActiveConversation$$serializer.INSTANCE, MessagingScreen$NewConversation$$serializer.INSTANCE}, new Annotation[0]);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)(B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0019¨\u0006*"}, d2 = {"Lzendesk/android/messaging/MessagingScreen$Conversation;", "Lzendesk/android/messaging/MessagingScreen;", "", "id", "Lzendesk/android/messaging/MessagingScreen$ExitAction;", "onExit", "<init>", "(Ljava/lang/String;Lzendesk/android/messaging/MessagingScreen$ExitAction;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Lzendesk/android/messaging/MessagingScreen$ExitAction;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$zendesk_zendesk_android", "(Lzendesk/android/messaging/MessagingScreen$Conversation;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lzendesk/android/messaging/MessagingScreen$ExitAction;", "copy", "(Ljava/lang/String;Lzendesk/android/messaging/MessagingScreen$ExitAction;)Lzendesk/android/messaging/MessagingScreen$Conversation;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Lzendesk/android/messaging/MessagingScreen$ExitAction;", "getOnExit", "Companion", "$serializer", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @h
    public static final /* data */ class Conversation extends MessagingScreen {

        @NotNull
        private final String id;

        @NotNull
        private final ExitAction onExit;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private static final j[] $childSerializers = {null, l.a(m.PUBLICATION, new a(19))};

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Conversation(int i11, String str, ExitAction exitAction, m1 m1Var) {
            super(i11, m1Var);
            if (1 != (i11 & 1)) {
                c1.j(i11, 1, MessagingScreen$Conversation$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.id = str;
            if ((i11 & 2) == 0) {
                this.onExit = ExitAction.ReturnToConversationList;
            } else {
                this.onExit = exitAction;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return ExitAction.INSTANCE.serializer();
        }

        public static /* synthetic */ Conversation copy$default(Conversation conversation, String str, ExitAction exitAction, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = conversation.id;
            }
            if ((i11 & 2) != 0) {
                exitAction = conversation.onExit;
            }
            return conversation.copy(str, exitAction);
        }

        public static final /* synthetic */ void write$Self$zendesk_zendesk_android(Conversation self, b output, SerialDescriptor serialDesc) {
            MessagingScreen.write$Self(self, output, serialDesc);
            j[] jVarArr = $childSerializers;
            output.q(serialDesc, 0, self.id);
            if (!output.C(serialDesc) && self.onExit == ExitAction.ReturnToConversationList) {
                return;
            }
            output.i(serialDesc, 1, (KSerializer) jVarArr[1].getValue(), self.onExit);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final ExitAction getOnExit() {
            return this.onExit;
        }

        @NotNull
        public final Conversation copy(@NotNull String id2, @NotNull ExitAction onExit) {
            id2.getClass();
            onExit.getClass();
            return new Conversation(id2, onExit);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Conversation)) {
                return false;
            }
            Conversation conversation = (Conversation) other;
            return Intrinsics.areEqual(this.id, conversation.id) && this.onExit == conversation.onExit;
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        @NotNull
        public final ExitAction getOnExit() {
            return this.onExit;
        }

        public int hashCode() {
            return this.onExit.hashCode() + (this.id.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "Conversation(id=" + this.id + ", onExit=" + this.onExit + ")";
        }

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/android/messaging/MessagingScreen$Conversation$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/android/messaging/MessagingScreen$Conversation;", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return MessagingScreen$Conversation$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ Conversation(String str, ExitAction exitAction, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i11 & 2) != 0 ? ExitAction.ReturnToConversationList : exitAction);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Conversation(@NotNull String str, @NotNull ExitAction exitAction) {
            super(null);
            str.getClass();
            exitAction.getClass();
            this.id = str;
            this.onExit = exitAction;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/android/messaging/MessagingScreen$ExitAction;", "", "<init>", "(Ljava/lang/String;I)V", PantryPageHeaderKt.CLOSE_CONTENT_DESCRIPTION, "ReturnToConversationList", "Companion", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @h
    public static final class ExitAction {
        private static final /* synthetic */ a80.a $ENTRIES;
        private static final /* synthetic */ ExitAction[] $VALUES;

        @NotNull
        private static final j $cachedSerializer$delegate;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE;
        public static final ExitAction Close = new ExitAction(PantryPageHeaderKt.CLOSE_CONTENT_DESCRIPTION, 0);
        public static final ExitAction ReturnToConversationList = new ExitAction("ReturnToConversationList", 1);

        private static final /* synthetic */ ExitAction[] $values() {
            return new ExitAction[]{Close, ReturnToConversationList};
        }

        static {
            ExitAction[] exitActionArr$values = $values();
            $VALUES = exitActionArr$values;
            $ENTRIES = n.w(exitActionArr$values);
            INSTANCE = new Companion(null);
            $cachedSerializer$delegate = l.a(m.PUBLICATION, new a(21));
        }

        private ExitAction(String str, int i11) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final KSerializer _init_$_anonymous_() {
            ExitAction[] exitActionArrValues = values();
            exitActionArrValues.getClass();
            return new i90.a("zendesk.android.messaging.MessagingScreen.ExitAction", (Enum[]) exitActionArrValues);
        }

        @NotNull
        public static a80.a getEntries() {
            return $ENTRIES;
        }

        public static ExitAction valueOf(String str) {
            return (ExitAction) Enum.valueOf(ExitAction.class, str);
        }

        public static ExitAction[] values() {
            return (ExitAction[]) $VALUES.clone();
        }

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/android/messaging/MessagingScreen$ExitAction$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/android/messaging/MessagingScreen$ExitAction;", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            private final /* synthetic */ KSerializer get$cachedSerializer() {
                return (KSerializer) ExitAction.$cachedSerializer$delegate.getValue();
            }

            @NotNull
            public final KSerializer serializer() {
                return get$cachedSerializer();
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%$B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0015¨\u0006&"}, d2 = {"Lzendesk/android/messaging/MessagingScreen$MostRecentActiveConversation;", "Lzendesk/android/messaging/MessagingScreen;", "Lzendesk/android/messaging/MessagingScreen$ExitAction;", "onExit", "<init>", "(Lzendesk/android/messaging/MessagingScreen$ExitAction;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILzendesk/android/messaging/MessagingScreen$ExitAction;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$zendesk_zendesk_android", "(Lzendesk/android/messaging/MessagingScreen$MostRecentActiveConversation;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lzendesk/android/messaging/MessagingScreen$ExitAction;", "copy", "(Lzendesk/android/messaging/MessagingScreen$ExitAction;)Lzendesk/android/messaging/MessagingScreen$MostRecentActiveConversation;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lzendesk/android/messaging/MessagingScreen$ExitAction;", "getOnExit", "Companion", "$serializer", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @h
    public static final /* data */ class MostRecentActiveConversation extends MessagingScreen {

        @NotNull
        private final ExitAction onExit;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private static final j[] $childSerializers = {l.a(m.PUBLICATION, new a(22))};

        public /* synthetic */ MostRecentActiveConversation(int i11, ExitAction exitAction, m1 m1Var) {
            super(i11, m1Var);
            if ((i11 & 1) == 0) {
                this.onExit = ExitAction.ReturnToConversationList;
            } else {
                this.onExit = exitAction;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return ExitAction.INSTANCE.serializer();
        }

        public static /* synthetic */ MostRecentActiveConversation copy$default(MostRecentActiveConversation mostRecentActiveConversation, ExitAction exitAction, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                exitAction = mostRecentActiveConversation.onExit;
            }
            return mostRecentActiveConversation.copy(exitAction);
        }

        public static final /* synthetic */ void write$Self$zendesk_zendesk_android(MostRecentActiveConversation self, b output, SerialDescriptor serialDesc) {
            MessagingScreen.write$Self(self, output, serialDesc);
            j[] jVarArr = $childSerializers;
            if (!output.C(serialDesc) && self.onExit == ExitAction.ReturnToConversationList) {
                return;
            }
            output.i(serialDesc, 0, (KSerializer) jVarArr[0].getValue(), self.onExit);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final ExitAction getOnExit() {
            return this.onExit;
        }

        @NotNull
        public final MostRecentActiveConversation copy(@NotNull ExitAction onExit) {
            onExit.getClass();
            return new MostRecentActiveConversation(onExit);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof MostRecentActiveConversation) && this.onExit == ((MostRecentActiveConversation) other).onExit;
        }

        @NotNull
        public final ExitAction getOnExit() {
            return this.onExit;
        }

        public int hashCode() {
            return this.onExit.hashCode();
        }

        @NotNull
        public String toString() {
            return "MostRecentActiveConversation(onExit=" + this.onExit + ")";
        }

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/android/messaging/MessagingScreen$MostRecentActiveConversation$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/android/messaging/MessagingScreen$MostRecentActiveConversation;", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return MessagingScreen$MostRecentActiveConversation$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public MostRecentActiveConversation() {
            this((ExitAction) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public /* synthetic */ MostRecentActiveConversation(ExitAction exitAction, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? ExitAction.ReturnToConversationList : exitAction);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MostRecentActiveConversation(@NotNull ExitAction exitAction) {
            super(null);
            exitAction.getClass();
            this.onExit = exitAction;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%$B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0015¨\u0006&"}, d2 = {"Lzendesk/android/messaging/MessagingScreen$NewConversation;", "Lzendesk/android/messaging/MessagingScreen;", "Lzendesk/android/messaging/MessagingScreen$ExitAction;", "onExit", "<init>", "(Lzendesk/android/messaging/MessagingScreen$ExitAction;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILzendesk/android/messaging/MessagingScreen$ExitAction;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$zendesk_zendesk_android", "(Lzendesk/android/messaging/MessagingScreen$NewConversation;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lzendesk/android/messaging/MessagingScreen$ExitAction;", "copy", "(Lzendesk/android/messaging/MessagingScreen$ExitAction;)Lzendesk/android/messaging/MessagingScreen$NewConversation;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lzendesk/android/messaging/MessagingScreen$ExitAction;", "getOnExit", "Companion", "$serializer", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @h
    public static final /* data */ class NewConversation extends MessagingScreen {

        @NotNull
        private final ExitAction onExit;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private static final j[] $childSerializers = {l.a(m.PUBLICATION, new a(23))};

        public /* synthetic */ NewConversation(int i11, ExitAction exitAction, m1 m1Var) {
            super(i11, m1Var);
            if ((i11 & 1) == 0) {
                this.onExit = ExitAction.ReturnToConversationList;
            } else {
                this.onExit = exitAction;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return ExitAction.INSTANCE.serializer();
        }

        public static /* synthetic */ NewConversation copy$default(NewConversation newConversation, ExitAction exitAction, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                exitAction = newConversation.onExit;
            }
            return newConversation.copy(exitAction);
        }

        public static final /* synthetic */ void write$Self$zendesk_zendesk_android(NewConversation self, b output, SerialDescriptor serialDesc) {
            MessagingScreen.write$Self(self, output, serialDesc);
            j[] jVarArr = $childSerializers;
            if (!output.C(serialDesc) && self.onExit == ExitAction.ReturnToConversationList) {
                return;
            }
            output.i(serialDesc, 0, (KSerializer) jVarArr[0].getValue(), self.onExit);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final ExitAction getOnExit() {
            return this.onExit;
        }

        @NotNull
        public final NewConversation copy(@NotNull ExitAction onExit) {
            onExit.getClass();
            return new NewConversation(onExit);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NewConversation) && this.onExit == ((NewConversation) other).onExit;
        }

        @NotNull
        public final ExitAction getOnExit() {
            return this.onExit;
        }

        public int hashCode() {
            return this.onExit.hashCode();
        }

        @NotNull
        public String toString() {
            return "NewConversation(onExit=" + this.onExit + ")";
        }

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/android/messaging/MessagingScreen$NewConversation$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/android/messaging/MessagingScreen$NewConversation;", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return MessagingScreen$NewConversation$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public NewConversation() {
            this((ExitAction) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public /* synthetic */ NewConversation(ExitAction exitAction, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? ExitAction.ReturnToConversationList : exitAction);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NewConversation(@NotNull ExitAction exitAction) {
            super(null);
            exitAction.getClass();
            this.onExit = exitAction;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/android/messaging/MessagingScreen$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/android/messaging/MessagingScreen;", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) MessagingScreen.$cachedSerializer$delegate.getValue();
        }

        @NotNull
        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private MessagingScreen() {
    }

    public /* synthetic */ MessagingScreen(int i11, m1 m1Var) {
    }

    public static final /* synthetic */ void write$Self(MessagingScreen self, b output, SerialDescriptor serialDesc) {
    }
}
