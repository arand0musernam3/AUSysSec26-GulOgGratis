package zendesk.conversationkit.android.model;

import com.app.tgtg.model.local.AppConstants;
import db0.a;
import i90.f;
import i90.g;
import i90.h;
import j4.s;
import java.lang.annotation.Annotation;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.o0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.c1;
import m90.f0;
import m90.m1;
import m90.r1;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import u70.j;
import u70.l;
import u70.m;
import w.a0;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@h
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u001e2\u00020\u0001:\b\u001f !\"#$%\u001eB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R \u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u001a8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c\u0082\u0001\u0007&'()*+,¨\u0006-"}, d2 = {"Lzendesk/conversationkit/android/model/MessageAction;", "", "Lzendesk/conversationkit/android/model/MessageActionType;", "messageActionType", "<init>", "(Lzendesk/conversationkit/android/model/MessageActionType;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILzendesk/conversationkit/android/model/MessageActionType;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lzendesk/conversationkit/android/model/MessageAction;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lzendesk/conversationkit/android/model/MessageActionType;", "getMessageActionType", "()Lzendesk/conversationkit/android/model/MessageActionType;", "", "getId", "()Ljava/lang/String;", "id", "", "getMetadata", "()Ljava/util/Map;", "metadata", "Companion", "Buy", "Link", "LocationRequest", "Postback", "Reply", "Share", "WebView", "Lzendesk/conversationkit/android/model/MessageAction$Buy;", "Lzendesk/conversationkit/android/model/MessageAction$Link;", "Lzendesk/conversationkit/android/model/MessageAction$LocationRequest;", "Lzendesk/conversationkit/android/model/MessageAction$Postback;", "Lzendesk/conversationkit/android/model/MessageAction$Reply;", "Lzendesk/conversationkit/android/model/MessageAction$Share;", "Lzendesk/conversationkit/android/model/MessageAction$WebView;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class MessageAction {

    @NotNull
    private static final j $cachedSerializer$delegate;

    @NotNull
    private static final j[] $childSerializers;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final MessageActionType messageActionType;

    static {
        m mVar = m.PUBLICATION;
        $childSerializers = new j[]{l.a(mVar, new a(16))};
        $cachedSerializer$delegate = l.a(mVar, new a(17));
    }

    public /* synthetic */ MessageAction(int i11, MessageActionType messageActionType, m1 m1Var) {
        this.messageActionType = messageActionType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return MessageActionType.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_$0() {
        return new f("zendesk.conversationkit.android.model.MessageAction", Reflection.getOrCreateKotlinClass(MessageAction.class), new KClass[]{Reflection.getOrCreateKotlinClass(Buy.class), Reflection.getOrCreateKotlinClass(Link.class), Reflection.getOrCreateKotlinClass(LocationRequest.class), Reflection.getOrCreateKotlinClass(Postback.class), Reflection.getOrCreateKotlinClass(Reply.class), Reflection.getOrCreateKotlinClass(Share.class), Reflection.getOrCreateKotlinClass(WebView.class)}, new KSerializer[]{MessageAction$Buy$$serializer.INSTANCE, MessageAction$Link$$serializer.INSTANCE, MessageAction$LocationRequest$$serializer.INSTANCE, MessageAction$Postback$$serializer.INSTANCE, MessageAction$Reply$$serializer.INSTANCE, MessageAction$Share$$serializer.INSTANCE, MessageAction$WebView$$serializer.INSTANCE}, new Annotation[0]);
    }

    public static final /* synthetic */ void write$Self(MessageAction self, b output, SerialDescriptor serialDesc) {
        output.i(serialDesc, 0, (KSerializer) $childSerializers[0].getValue(), self.messageActionType);
    }

    @NotNull
    public abstract String getId();

    @NotNull
    public final MessageActionType getMessageActionType() {
        return this.messageActionType;
    }

    @NotNull
    public abstract Map<String, Object> getMetadata();

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 ?2\u00020\u0001:\u0002@?BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fBu\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u000e\u0010\u0016J'\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010!J\u001c\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010!J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010!J\u0010\u0010&\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b(\u0010!J\u0010\u0010)\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b)\u0010*Jb\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b-\u0010!J\u0010\u0010.\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b.\u0010/J\u001a\u00102\u001a\u0002012\b\u00100\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b2\u00103R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u00104\u001a\u0004\b5\u0010!R&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u00106\u001a\u0004\b7\u0010#R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00104\u001a\u0004\b8\u0010!R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u00104\u001a\u0004\b9\u0010!R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010:\u001a\u0004\b;\u0010'R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00104\u001a\u0004\b<\u0010!R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010=\u001a\u0004\b>\u0010*¨\u0006A"}, d2 = {"Lzendesk/conversationkit/android/model/MessageAction$Buy;", "Lzendesk/conversationkit/android/model/MessageAction;", "", "id", "", "", "metadata", TextBundle.TEXT_ENTRY, "uri", "", "amount", "currency", "Lzendesk/conversationkit/android/model/MessageActionBuyState;", "state", "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Lzendesk/conversationkit/android/model/MessageActionBuyState;)V", "", "seen0", "Lzendesk/conversationkit/android/model/MessageActionType;", "messageActionType", "Lm90/m1;", "serializationConstructorMarker", "(ILzendesk/conversationkit/android/model/MessageActionType;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Lzendesk/conversationkit/android/model/MessageActionBuyState;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$zendesk_conversationkit_conversationkit_android", "(Lzendesk/conversationkit/android/model/MessageAction$Buy;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/Map;", "component3", "component4", "component5", "()J", "component6", "component7", "()Lzendesk/conversationkit/android/model/MessageActionBuyState;", "copy", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Lzendesk/conversationkit/android/model/MessageActionBuyState;)Lzendesk/conversationkit/android/model/MessageAction$Buy;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Ljava/util/Map;", "getMetadata", "getText", "getUri", "J", "getAmount", "getCurrency", "Lzendesk/conversationkit/android/model/MessageActionBuyState;", "getState", "Companion", "$serializer", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @h
    @g("buy")
    public static final /* data */ class Buy extends MessageAction {

        @NotNull
        private static final j[] $childSerializers;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        private final long amount;

        @NotNull
        private final String currency;

        @NotNull
        private final String id;

        @NotNull
        private final Map<String, Object> metadata;

        @NotNull
        private final MessageActionBuyState state;

        @NotNull
        private final String text;

        @NotNull
        private final String uri;

        static {
            m mVar = m.PUBLICATION;
            $childSerializers = new j[]{l.a(mVar, new a(18)), null, l.a(mVar, new a(19)), null, null, null, null, l.a(mVar, new a(20))};
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Buy(int i11, MessageActionType messageActionType, String str, Map map, String str2, String str3, long j9, String str4, MessageActionBuyState messageActionBuyState, m1 m1Var) {
            super(i11, messageActionType, m1Var);
            if (251 != (i11 & 251)) {
                c1.j(i11, 251, MessageAction$Buy$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.id = str;
            if ((i11 & 4) == 0) {
                o0 o0Var = o0.f26530a;
                o0Var.getClass();
                this.metadata = o0Var;
            } else {
                this.metadata = map;
            }
            this.text = str2;
            this.uri = str3;
            this.amount = j9;
            this.currency = str4;
            this.state = messageActionBuyState;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return MessageActionType.INSTANCE.serializer();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
            return new f0(r1.f29848a, new i90.a(Reflection.getOrCreateKotlinClass(Object.class), new KSerializer[0]), 1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
            return MessageActionBuyState.INSTANCE.serializer();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Buy copy$default(Buy buy, String str, Map map, String str2, String str3, long j9, String str4, MessageActionBuyState messageActionBuyState, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = buy.id;
            }
            if ((i11 & 2) != 0) {
                map = buy.metadata;
            }
            if ((i11 & 4) != 0) {
                str2 = buy.text;
            }
            if ((i11 & 8) != 0) {
                str3 = buy.uri;
            }
            if ((i11 & 16) != 0) {
                j9 = buy.amount;
            }
            if ((i11 & 32) != 0) {
                str4 = buy.currency;
            }
            if ((i11 & 64) != 0) {
                messageActionBuyState = buy.state;
            }
            long j11 = j9;
            String str5 = str2;
            String str6 = str3;
            return buy.copy(str, map, str5, str6, j11, str4, messageActionBuyState);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static final void write$Self$zendesk_conversationkit_conversationkit_android(zendesk.conversationkit.android.model.MessageAction.Buy r4, l90.b r5, kotlinx.serialization.descriptors.SerialDescriptor r6) {
            /*
                zendesk.conversationkit.android.model.MessageAction.write$Self(r4, r5, r6)
                u70.j[] r0 = zendesk.conversationkit.android.model.MessageAction.Buy.$childSerializers
                r1 = 1
                java.lang.String r2 = r4.getId()
                r5.q(r6, r1, r2)
                boolean r1 = r5.C(r6)
                if (r1 == 0) goto L14
                goto L23
            L14:
                java.util.Map r1 = r4.getMetadata()
                kotlin.collections.o0 r2 = kotlin.collections.o0.f26530a
                r2.getClass()
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
                if (r1 != 0) goto L33
            L23:
                r1 = 2
                r2 = r0[r1]
                java.lang.Object r2 = r2.getValue()
                kotlinx.serialization.KSerializer r2 = (kotlinx.serialization.KSerializer) r2
                java.util.Map r3 = r4.getMetadata()
                r5.i(r6, r1, r2, r3)
            L33:
                r1 = 3
                java.lang.String r2 = r4.text
                r5.q(r6, r1, r2)
                r1 = 4
                java.lang.String r2 = r4.uri
                r5.q(r6, r1, r2)
                r1 = 5
                long r2 = r4.amount
                r5.B(r6, r1, r2)
                r1 = 6
                java.lang.String r2 = r4.currency
                r5.q(r6, r1, r2)
                r1 = 7
                r0 = r0[r1]
                java.lang.Object r0 = r0.getValue()
                kotlinx.serialization.KSerializer r0 = (kotlinx.serialization.KSerializer) r0
                zendesk.conversationkit.android.model.MessageActionBuyState r4 = r4.state
                r5.i(r6, r1, r0, r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.model.MessageAction.Buy.write$Self$zendesk_conversationkit_conversationkit_android(zendesk.conversationkit.android.model.MessageAction$Buy, l90.b, kotlinx.serialization.descriptors.SerialDescriptor):void");
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @NotNull
        public final Map<String, Object> component2() {
            return this.metadata;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @NotNull
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getUri() {
            return this.uri;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final long getAmount() {
            return this.amount;
        }

        @NotNull
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getCurrency() {
            return this.currency;
        }

        @NotNull
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final MessageActionBuyState getState() {
            return this.state;
        }

        @NotNull
        public final Buy copy(@NotNull String id2, @NotNull Map<String, ? extends Object> metadata, @NotNull String text, @NotNull String uri, long amount, @NotNull String currency, @NotNull MessageActionBuyState state) {
            id2.getClass();
            metadata.getClass();
            text.getClass();
            uri.getClass();
            currency.getClass();
            state.getClass();
            return new Buy(id2, metadata, text, uri, amount, currency, state);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Buy)) {
                return false;
            }
            Buy buy = (Buy) other;
            return Intrinsics.areEqual(this.id, buy.id) && Intrinsics.areEqual(this.metadata, buy.metadata) && Intrinsics.areEqual(this.text, buy.text) && Intrinsics.areEqual(this.uri, buy.uri) && this.amount == buy.amount && Intrinsics.areEqual(this.currency, buy.currency) && this.state == buy.state;
        }

        public final long getAmount() {
            return this.amount;
        }

        @NotNull
        public final String getCurrency() {
            return this.currency;
        }

        @Override // zendesk.conversationkit.android.model.MessageAction
        @NotNull
        public String getId() {
            return this.id;
        }

        @Override // zendesk.conversationkit.android.model.MessageAction
        @NotNull
        public Map<String, Object> getMetadata() {
            return this.metadata;
        }

        @NotNull
        public final MessageActionBuyState getState() {
            return this.state;
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        @NotNull
        public final String getUri() {
            return this.uri;
        }

        public int hashCode() {
            return this.state.hashCode() + l1.b(e0.f.b(l1.b(l1.b(a0.f(this.metadata, this.id.hashCode() * 31, 31), 31, this.text), 31, this.uri), 31, this.amount), 31, this.currency);
        }

        @NotNull
        public String toString() {
            String str = this.id;
            Map<String, Object> map = this.metadata;
            String str2 = this.text;
            String str3 = this.uri;
            long j9 = this.amount;
            String str4 = this.currency;
            MessageActionBuyState messageActionBuyState = this.state;
            StringBuilder sb2 = new StringBuilder("Buy(id=");
            sb2.append(str);
            sb2.append(", metadata=");
            sb2.append(map);
            sb2.append(", text=");
            s.A(sb2, str2, ", uri=", str3, ", amount=");
            sb2.append(j9);
            sb2.append(", currency=");
            sb2.append(str4);
            sb2.append(", state=");
            sb2.append(messageActionBuyState);
            sb2.append(")");
            return sb2.toString();
        }

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/conversationkit/android/model/MessageAction$Buy$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/conversationkit/android/model/MessageAction$Buy;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return MessageAction$Buy$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Buy(String str, Map map, String str2, String str3, long j9, String str4, MessageActionBuyState messageActionBuyState, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i11 & 2) != 0) {
                map = o0.f26530a;
                map.getClass();
            }
            this(str, map, str2, str3, j9, str4, messageActionBuyState);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Buy(@NotNull String str, @NotNull Map<String, ? extends Object> map, @NotNull String str2, @NotNull String str3, long j9, @NotNull String str4, @NotNull MessageActionBuyState messageActionBuyState) {
            super(MessageActionType.BUY, null);
            str.getClass();
            map.getClass();
            str2.getClass();
            str3.getClass();
            str4.getClass();
            messageActionBuyState.getClass();
            this.id = str;
            this.metadata = map;
            this.text = str2;
            this.uri = str3;
            this.amount = j9;
            this.currency = str4;
            this.state = messageActionBuyState;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\"\b\u0087\b\u0018\u0000 ;2\u00020\u0001:\u0002<;BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eBk\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\r\u0010\u0015J'\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u001c\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010 J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010 J\u0010\u0010%\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b'\u0010(JX\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b+\u0010 J\u0010\u0010,\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u0010/\u001a\u00020\t2\b\u0010.\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b/\u00100R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u0010 R&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u00103\u001a\u0004\b4\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b5\u0010 R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u00101\u001a\u0004\b6\u0010 R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00107\u001a\u0004\b8\u0010&R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00109\u001a\u0004\b:\u0010(¨\u0006="}, d2 = {"Lzendesk/conversationkit/android/model/MessageAction$Link;", "Lzendesk/conversationkit/android/model/MessageAction;", "", "id", "", "", "metadata", TextBundle.TEXT_ENTRY, "uri", "", "default", "Lzendesk/conversationkit/android/model/MessageSourceType;", "sourceType", "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;ZLzendesk/conversationkit/android/model/MessageSourceType;)V", "", "seen0", "Lzendesk/conversationkit/android/model/MessageActionType;", "messageActionType", "Lm90/m1;", "serializationConstructorMarker", "(ILzendesk/conversationkit/android/model/MessageActionType;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;ZLzendesk/conversationkit/android/model/MessageSourceType;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$zendesk_conversationkit_conversationkit_android", "(Lzendesk/conversationkit/android/model/MessageAction$Link;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/Map;", "component3", "component4", "component5", "()Z", "component6", "()Lzendesk/conversationkit/android/model/MessageSourceType;", "copy", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;ZLzendesk/conversationkit/android/model/MessageSourceType;)Lzendesk/conversationkit/android/model/MessageAction$Link;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Ljava/util/Map;", "getMetadata", "getText", "getUri", "Z", "getDefault", "Lzendesk/conversationkit/android/model/MessageSourceType;", "getSourceType", "Companion", "$serializer", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @h
    @g("link")
    public static final /* data */ class Link extends MessageAction {

        @NotNull
        private static final j[] $childSerializers;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        private final boolean default;

        @NotNull
        private final String id;

        @NotNull
        private final Map<String, Object> metadata;

        @NotNull
        private final MessageSourceType sourceType;

        @NotNull
        private final String text;

        @NotNull
        private final String uri;

        static {
            m mVar = m.PUBLICATION;
            $childSerializers = new j[]{l.a(mVar, new a(21)), null, l.a(mVar, new a(22)), null, null, null, l.a(mVar, new a(23))};
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Link(int i11, MessageActionType messageActionType, String str, Map map, String str2, String str3, boolean z11, MessageSourceType messageSourceType, m1 m1Var) {
            super(i11, messageActionType, m1Var);
            if (123 != (i11 & AppConstants.RESULT_CODE_ORDER_CANCELLED)) {
                c1.j(i11, AppConstants.RESULT_CODE_ORDER_CANCELLED, MessageAction$Link$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.id = str;
            if ((i11 & 4) == 0) {
                o0 o0Var = o0.f26530a;
                o0Var.getClass();
                this.metadata = o0Var;
            } else {
                this.metadata = map;
            }
            this.text = str2;
            this.uri = str3;
            this.default = z11;
            this.sourceType = messageSourceType;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return MessageActionType.INSTANCE.serializer();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
            return new f0(r1.f29848a, new i90.a(Reflection.getOrCreateKotlinClass(Object.class), new KSerializer[0]), 1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
            return MessageSourceType.INSTANCE.serializer();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Link copy$default(Link link, String str, Map map, String str2, String str3, boolean z11, MessageSourceType messageSourceType, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = link.id;
            }
            if ((i11 & 2) != 0) {
                map = link.metadata;
            }
            if ((i11 & 4) != 0) {
                str2 = link.text;
            }
            if ((i11 & 8) != 0) {
                str3 = link.uri;
            }
            if ((i11 & 16) != 0) {
                z11 = link.default;
            }
            if ((i11 & 32) != 0) {
                messageSourceType = link.sourceType;
            }
            boolean z12 = z11;
            MessageSourceType messageSourceType2 = messageSourceType;
            return link.copy(str, map, str2, str3, z12, messageSourceType2);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static final void write$Self$zendesk_conversationkit_conversationkit_android(zendesk.conversationkit.android.model.MessageAction.Link r4, l90.b r5, kotlinx.serialization.descriptors.SerialDescriptor r6) {
            /*
                zendesk.conversationkit.android.model.MessageAction.write$Self(r4, r5, r6)
                u70.j[] r0 = zendesk.conversationkit.android.model.MessageAction.Link.$childSerializers
                r1 = 1
                java.lang.String r2 = r4.getId()
                r5.q(r6, r1, r2)
                boolean r1 = r5.C(r6)
                if (r1 == 0) goto L14
                goto L23
            L14:
                java.util.Map r1 = r4.getMetadata()
                kotlin.collections.o0 r2 = kotlin.collections.o0.f26530a
                r2.getClass()
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
                if (r1 != 0) goto L33
            L23:
                r1 = 2
                r2 = r0[r1]
                java.lang.Object r2 = r2.getValue()
                kotlinx.serialization.KSerializer r2 = (kotlinx.serialization.KSerializer) r2
                java.util.Map r3 = r4.getMetadata()
                r5.i(r6, r1, r2, r3)
            L33:
                r1 = 3
                java.lang.String r2 = r4.text
                r5.q(r6, r1, r2)
                r1 = 4
                java.lang.String r2 = r4.uri
                r5.q(r6, r1, r2)
                r1 = 5
                boolean r2 = r4.default
                r5.p(r6, r1, r2)
                r1 = 6
                r0 = r0[r1]
                java.lang.Object r0 = r0.getValue()
                kotlinx.serialization.KSerializer r0 = (kotlinx.serialization.KSerializer) r0
                zendesk.conversationkit.android.model.MessageSourceType r4 = r4.sourceType
                r5.i(r6, r1, r0, r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.model.MessageAction.Link.write$Self$zendesk_conversationkit_conversationkit_android(zendesk.conversationkit.android.model.MessageAction$Link, l90.b, kotlinx.serialization.descriptors.SerialDescriptor):void");
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @NotNull
        public final Map<String, Object> component2() {
            return this.metadata;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @NotNull
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getUri() {
            return this.uri;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final boolean getDefault() {
            return this.default;
        }

        @NotNull
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final MessageSourceType getSourceType() {
            return this.sourceType;
        }

        @NotNull
        public final Link copy(@NotNull String id2, @NotNull Map<String, ? extends Object> metadata, @NotNull String text, @NotNull String uri, boolean z11, @NotNull MessageSourceType sourceType) {
            id2.getClass();
            metadata.getClass();
            text.getClass();
            uri.getClass();
            sourceType.getClass();
            return new Link(id2, metadata, text, uri, z11, sourceType);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Link)) {
                return false;
            }
            Link link = (Link) other;
            return Intrinsics.areEqual(this.id, link.id) && Intrinsics.areEqual(this.metadata, link.metadata) && Intrinsics.areEqual(this.text, link.text) && Intrinsics.areEqual(this.uri, link.uri) && this.default == link.default && this.sourceType == link.sourceType;
        }

        public final boolean getDefault() {
            return this.default;
        }

        @Override // zendesk.conversationkit.android.model.MessageAction
        @NotNull
        public String getId() {
            return this.id;
        }

        @Override // zendesk.conversationkit.android.model.MessageAction
        @NotNull
        public Map<String, Object> getMetadata() {
            return this.metadata;
        }

        @NotNull
        public final MessageSourceType getSourceType() {
            return this.sourceType;
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        @NotNull
        public final String getUri() {
            return this.uri;
        }

        public int hashCode() {
            return this.sourceType.hashCode() + k.e(l1.b(l1.b(a0.f(this.metadata, this.id.hashCode() * 31, 31), 31, this.text), 31, this.uri), 31, this.default);
        }

        @NotNull
        public String toString() {
            String str = this.id;
            Map<String, Object> map = this.metadata;
            String str2 = this.text;
            String str3 = this.uri;
            boolean z11 = this.default;
            MessageSourceType messageSourceType = this.sourceType;
            StringBuilder sb2 = new StringBuilder("Link(id=");
            sb2.append(str);
            sb2.append(", metadata=");
            sb2.append(map);
            sb2.append(", text=");
            s.A(sb2, str2, ", uri=", str3, ", default=");
            sb2.append(z11);
            sb2.append(", sourceType=");
            sb2.append(messageSourceType);
            sb2.append(")");
            return sb2.toString();
        }

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/conversationkit/android/model/MessageAction$Link$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/conversationkit/android/model/MessageAction$Link;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return MessageAction$Link$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Link(String str, Map map, String str2, String str3, boolean z11, MessageSourceType messageSourceType, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i11 & 2) != 0) {
                map = o0.f26530a;
                map.getClass();
            }
            this(str, map, str2, str3, z11, messageSourceType);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Link(@NotNull String str, @NotNull Map<String, ? extends Object> map, @NotNull String str2, @NotNull String str3, boolean z11, @NotNull MessageSourceType messageSourceType) {
            super(MessageActionType.LINK, null);
            str.getClass();
            map.getClass();
            str2.getClass();
            str3.getClass();
            messageSourceType.getClass();
            this.id = str;
            this.metadata = map;
            this.text = str2;
            this.uri = str3;
            this.default = z11;
            this.sourceType = messageSourceType;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002.-B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tBO\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\b\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u001c\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ:\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u001bJ\u0010\u0010\"\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b&\u0010'R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u001bR&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b,\u0010\u001b¨\u0006/"}, d2 = {"Lzendesk/conversationkit/android/model/MessageAction$LocationRequest;", "Lzendesk/conversationkit/android/model/MessageAction;", "", "id", "", "", "metadata", TextBundle.TEXT_ENTRY, "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V", "", "seen0", "Lzendesk/conversationkit/android/model/MessageActionType;", "messageActionType", "Lm90/m1;", "serializationConstructorMarker", "(ILzendesk/conversationkit/android/model/MessageActionType;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$zendesk_conversationkit_conversationkit_android", "(Lzendesk/conversationkit/android/model/MessageAction$LocationRequest;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/Map;", "component3", "copy", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)Lzendesk/conversationkit/android/model/MessageAction$LocationRequest;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Ljava/util/Map;", "getMetadata", "getText", "Companion", "$serializer", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @h
    @g("locationRequest")
    public static final /* data */ class LocationRequest extends MessageAction {

        @NotNull
        private static final j[] $childSerializers;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final String id;

        @NotNull
        private final Map<String, Object> metadata;

        @NotNull
        private final String text;

        static {
            m mVar = m.PUBLICATION;
            $childSerializers = new j[]{l.a(mVar, new a(24)), null, l.a(mVar, new a(25)), null};
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LocationRequest(int i11, MessageActionType messageActionType, String str, Map map, String str2, m1 m1Var) {
            super(i11, messageActionType, m1Var);
            if (11 != (i11 & 11)) {
                c1.j(i11, 11, MessageAction$LocationRequest$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.id = str;
            if ((i11 & 4) == 0) {
                o0 o0Var = o0.f26530a;
                o0Var.getClass();
                this.metadata = o0Var;
            } else {
                this.metadata = map;
            }
            this.text = str2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return MessageActionType.INSTANCE.serializer();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
            return new f0(r1.f29848a, new i90.a(Reflection.getOrCreateKotlinClass(Object.class), new KSerializer[0]), 1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ LocationRequest copy$default(LocationRequest locationRequest, String str, Map map, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = locationRequest.id;
            }
            if ((i11 & 2) != 0) {
                map = locationRequest.metadata;
            }
            if ((i11 & 4) != 0) {
                str2 = locationRequest.text;
            }
            return locationRequest.copy(str, map, str2);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static final void write$Self$zendesk_conversationkit_conversationkit_android(zendesk.conversationkit.android.model.MessageAction.LocationRequest r3, l90.b r4, kotlinx.serialization.descriptors.SerialDescriptor r5) {
            /*
                zendesk.conversationkit.android.model.MessageAction.write$Self(r3, r4, r5)
                u70.j[] r0 = zendesk.conversationkit.android.model.MessageAction.LocationRequest.$childSerializers
                r1 = 1
                java.lang.String r2 = r3.getId()
                r4.q(r5, r1, r2)
                boolean r1 = r4.C(r5)
                if (r1 == 0) goto L14
                goto L23
            L14:
                java.util.Map r1 = r3.getMetadata()
                kotlin.collections.o0 r2 = kotlin.collections.o0.f26530a
                r2.getClass()
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
                if (r1 != 0) goto L33
            L23:
                r1 = 2
                r0 = r0[r1]
                java.lang.Object r0 = r0.getValue()
                kotlinx.serialization.KSerializer r0 = (kotlinx.serialization.KSerializer) r0
                java.util.Map r2 = r3.getMetadata()
                r4.i(r5, r1, r0, r2)
            L33:
                r0 = 3
                java.lang.String r3 = r3.text
                r4.q(r5, r0, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.model.MessageAction.LocationRequest.write$Self$zendesk_conversationkit_conversationkit_android(zendesk.conversationkit.android.model.MessageAction$LocationRequest, l90.b, kotlinx.serialization.descriptors.SerialDescriptor):void");
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @NotNull
        public final Map<String, Object> component2() {
            return this.metadata;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @NotNull
        public final LocationRequest copy(@NotNull String id2, @NotNull Map<String, ? extends Object> metadata, @NotNull String text) {
            id2.getClass();
            metadata.getClass();
            text.getClass();
            return new LocationRequest(id2, metadata, text);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LocationRequest)) {
                return false;
            }
            LocationRequest locationRequest = (LocationRequest) other;
            return Intrinsics.areEqual(this.id, locationRequest.id) && Intrinsics.areEqual(this.metadata, locationRequest.metadata) && Intrinsics.areEqual(this.text, locationRequest.text);
        }

        @Override // zendesk.conversationkit.android.model.MessageAction
        @NotNull
        public String getId() {
            return this.id;
        }

        @Override // zendesk.conversationkit.android.model.MessageAction
        @NotNull
        public Map<String, Object> getMetadata() {
            return this.metadata;
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            return this.text.hashCode() + a0.f(this.metadata, this.id.hashCode() * 31, 31);
        }

        @NotNull
        public String toString() {
            String str = this.id;
            Map<String, Object> map = this.metadata;
            String str2 = this.text;
            StringBuilder sb2 = new StringBuilder("LocationRequest(id=");
            sb2.append(str);
            sb2.append(", metadata=");
            sb2.append(map);
            sb2.append(", text=");
            return k.p(sb2, str2, ")");
        }

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/conversationkit/android/model/MessageAction$LocationRequest$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/conversationkit/android/model/MessageAction$LocationRequest;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return MessageAction$LocationRequest$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public LocationRequest(String str, Map map, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i11 & 2) != 0) {
                map = o0.f26530a;
                map.getClass();
            }
            this(str, map, str2);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LocationRequest(@NotNull String str, @NotNull Map<String, ? extends Object> map, @NotNull String str2) {
            super(MessageActionType.LOCATION_REQUEST, null);
            str.getClass();
            map.getClass();
            str2.getClass();
            this.id = str;
            this.metadata = map;
            this.text = str2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001d\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000254B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fBa\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u000b\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u001c\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001eJ\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001eJ\u0010\u0010#\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b#\u0010$JN\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u001eJ\u0010\u0010(\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010+\u001a\u00020\t2\b\u0010*\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b+\u0010,R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001eR&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b0\u0010 R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b1\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b2\u0010\u001eR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00103\u001a\u0004\b\n\u0010$¨\u00066"}, d2 = {"Lzendesk/conversationkit/android/model/MessageAction$Postback;", "Lzendesk/conversationkit/android/model/MessageAction;", "", "id", "", "", "metadata", TextBundle.TEXT_ENTRY, "payload", "", "isLoading", "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Z)V", "", "seen0", "Lzendesk/conversationkit/android/model/MessageActionType;", "messageActionType", "Lm90/m1;", "serializationConstructorMarker", "(ILzendesk/conversationkit/android/model/MessageActionType;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;ZLm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$zendesk_conversationkit_conversationkit_android", "(Lzendesk/conversationkit/android/model/MessageAction$Postback;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/Map;", "component3", "component4", "component5", "()Z", "copy", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Z)Lzendesk/conversationkit/android/model/MessageAction$Postback;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Ljava/util/Map;", "getMetadata", "getText", "getPayload", "Z", "Companion", "$serializer", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @h
    @g("postback")
    public static final /* data */ class Postback extends MessageAction {

        @NotNull
        private static final j[] $childSerializers;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final String id;
        private final boolean isLoading;

        @NotNull
        private final Map<String, Object> metadata;

        @NotNull
        private final String payload;

        @NotNull
        private final String text;

        static {
            m mVar = m.PUBLICATION;
            $childSerializers = new j[]{l.a(mVar, new a(26)), null, l.a(mVar, new a(27)), null, null, null};
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Postback(int i11, MessageActionType messageActionType, String str, Map map, String str2, String str3, boolean z11, m1 m1Var) {
            super(i11, messageActionType, m1Var);
            if (59 != (i11 & 59)) {
                c1.j(i11, 59, MessageAction$Postback$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.id = str;
            if ((i11 & 4) == 0) {
                o0 o0Var = o0.f26530a;
                o0Var.getClass();
                this.metadata = o0Var;
            } else {
                this.metadata = map;
            }
            this.text = str2;
            this.payload = str3;
            this.isLoading = z11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return MessageActionType.INSTANCE.serializer();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
            return new f0(r1.f29848a, new i90.a(Reflection.getOrCreateKotlinClass(Object.class), new KSerializer[0]), 1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Postback copy$default(Postback postback, String str, Map map, String str2, String str3, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = postback.id;
            }
            if ((i11 & 2) != 0) {
                map = postback.metadata;
            }
            if ((i11 & 4) != 0) {
                str2 = postback.text;
            }
            if ((i11 & 8) != 0) {
                str3 = postback.payload;
            }
            if ((i11 & 16) != 0) {
                z11 = postback.isLoading;
            }
            boolean z12 = z11;
            String str4 = str2;
            return postback.copy(str, map, str4, str3, z12);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static final void write$Self$zendesk_conversationkit_conversationkit_android(zendesk.conversationkit.android.model.MessageAction.Postback r3, l90.b r4, kotlinx.serialization.descriptors.SerialDescriptor r5) {
            /*
                zendesk.conversationkit.android.model.MessageAction.write$Self(r3, r4, r5)
                u70.j[] r0 = zendesk.conversationkit.android.model.MessageAction.Postback.$childSerializers
                r1 = 1
                java.lang.String r2 = r3.getId()
                r4.q(r5, r1, r2)
                boolean r1 = r4.C(r5)
                if (r1 == 0) goto L14
                goto L23
            L14:
                java.util.Map r1 = r3.getMetadata()
                kotlin.collections.o0 r2 = kotlin.collections.o0.f26530a
                r2.getClass()
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
                if (r1 != 0) goto L33
            L23:
                r1 = 2
                r0 = r0[r1]
                java.lang.Object r0 = r0.getValue()
                kotlinx.serialization.KSerializer r0 = (kotlinx.serialization.KSerializer) r0
                java.util.Map r2 = r3.getMetadata()
                r4.i(r5, r1, r0, r2)
            L33:
                r0 = 3
                java.lang.String r1 = r3.text
                r4.q(r5, r0, r1)
                r0 = 4
                java.lang.String r1 = r3.payload
                r4.q(r5, r0, r1)
                r0 = 5
                boolean r3 = r3.isLoading
                r4.p(r5, r0, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.model.MessageAction.Postback.write$Self$zendesk_conversationkit_conversationkit_android(zendesk.conversationkit.android.model.MessageAction$Postback, l90.b, kotlinx.serialization.descriptors.SerialDescriptor):void");
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @NotNull
        public final Map<String, Object> component2() {
            return this.metadata;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @NotNull
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getPayload() {
            return this.payload;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final boolean getIsLoading() {
            return this.isLoading;
        }

        @NotNull
        public final Postback copy(@NotNull String id2, @NotNull Map<String, ? extends Object> metadata, @NotNull String text, @NotNull String payload, boolean isLoading) {
            id2.getClass();
            metadata.getClass();
            text.getClass();
            payload.getClass();
            return new Postback(id2, metadata, text, payload, isLoading);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Postback)) {
                return false;
            }
            Postback postback = (Postback) other;
            return Intrinsics.areEqual(this.id, postback.id) && Intrinsics.areEqual(this.metadata, postback.metadata) && Intrinsics.areEqual(this.text, postback.text) && Intrinsics.areEqual(this.payload, postback.payload) && this.isLoading == postback.isLoading;
        }

        @Override // zendesk.conversationkit.android.model.MessageAction
        @NotNull
        public String getId() {
            return this.id;
        }

        @Override // zendesk.conversationkit.android.model.MessageAction
        @NotNull
        public Map<String, Object> getMetadata() {
            return this.metadata;
        }

        @NotNull
        public final String getPayload() {
            return this.payload;
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isLoading) + l1.b(l1.b(a0.f(this.metadata, this.id.hashCode() * 31, 31), 31, this.text), 31, this.payload);
        }

        public final boolean isLoading() {
            return this.isLoading;
        }

        @NotNull
        public String toString() {
            String str = this.id;
            Map<String, Object> map = this.metadata;
            String str2 = this.text;
            String str3 = this.payload;
            boolean z11 = this.isLoading;
            StringBuilder sb2 = new StringBuilder("Postback(id=");
            sb2.append(str);
            sb2.append(", metadata=");
            sb2.append(map);
            sb2.append(", text=");
            s.A(sb2, str2, ", payload=", str3, ", isLoading=");
            return s.o(sb2, z11, ")");
        }

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/conversationkit/android/model/MessageAction$Postback$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/conversationkit/android/model/MessageAction$Postback;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return MessageAction$Postback$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Postback(String str, Map map, String str2, String str3, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i11 & 2) != 0) {
                map = o0.f26530a;
                map.getClass();
            }
            this(str, map, str2, str3, z11);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Postback(@NotNull String str, @NotNull Map<String, ? extends Object> map, @NotNull String str2, @NotNull String str3, boolean z11) {
            super(MessageActionType.POSTBACK, null);
            str.getClass();
            map.getClass();
            str2.getClass();
            str3.getClass();
            this.id = str;
            this.metadata = map;
            this.text = str2;
            this.payload = str3;
            this.isLoading = z11;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000243B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bBc\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\n\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u001c\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001dJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001dJ\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001dJP\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u001dJ\u0010\u0010&\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b*\u0010+R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u001dR&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b/\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b0\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b1\u0010\u001dR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b2\u0010\u001d¨\u00065"}, d2 = {"Lzendesk/conversationkit/android/model/MessageAction$Reply;", "Lzendesk/conversationkit/android/model/MessageAction;", "", "id", "", "", "metadata", TextBundle.TEXT_ENTRY, "iconUrl", "payload", "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lzendesk/conversationkit/android/model/MessageActionType;", "messageActionType", "Lm90/m1;", "serializationConstructorMarker", "(ILzendesk/conversationkit/android/model/MessageActionType;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$zendesk_conversationkit_conversationkit_android", "(Lzendesk/conversationkit/android/model/MessageAction$Reply;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/Map;", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lzendesk/conversationkit/android/model/MessageAction$Reply;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Ljava/util/Map;", "getMetadata", "getText", "getIconUrl", "getPayload", "Companion", "$serializer", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @h
    @g("reply")
    public static final /* data */ class Reply extends MessageAction {

        @NotNull
        private static final j[] $childSerializers;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @Nullable
        private final String iconUrl;

        @NotNull
        private final String id;

        @NotNull
        private final Map<String, Object> metadata;

        @NotNull
        private final String payload;

        @NotNull
        private final String text;

        static {
            m mVar = m.PUBLICATION;
            $childSerializers = new j[]{l.a(mVar, new a(28)), null, l.a(mVar, new a(29)), null, null, null};
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Reply(int i11, MessageActionType messageActionType, String str, Map map, String str2, String str3, String str4, m1 m1Var) {
            super(i11, messageActionType, m1Var);
            if (59 != (i11 & 59)) {
                c1.j(i11, 59, MessageAction$Reply$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.id = str;
            if ((i11 & 4) == 0) {
                o0 o0Var = o0.f26530a;
                o0Var.getClass();
                this.metadata = o0Var;
            } else {
                this.metadata = map;
            }
            this.text = str2;
            this.iconUrl = str3;
            this.payload = str4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return MessageActionType.INSTANCE.serializer();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
            return new f0(r1.f29848a, new i90.a(Reflection.getOrCreateKotlinClass(Object.class), new KSerializer[0]), 1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Reply copy$default(Reply reply, String str, Map map, String str2, String str3, String str4, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = reply.id;
            }
            if ((i11 & 2) != 0) {
                map = reply.metadata;
            }
            if ((i11 & 4) != 0) {
                str2 = reply.text;
            }
            if ((i11 & 8) != 0) {
                str3 = reply.iconUrl;
            }
            if ((i11 & 16) != 0) {
                str4 = reply.payload;
            }
            String str5 = str4;
            String str6 = str2;
            return reply.copy(str, map, str6, str3, str5);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static final void write$Self$zendesk_conversationkit_conversationkit_android(zendesk.conversationkit.android.model.MessageAction.Reply r3, l90.b r4, kotlinx.serialization.descriptors.SerialDescriptor r5) {
            /*
                zendesk.conversationkit.android.model.MessageAction.write$Self(r3, r4, r5)
                u70.j[] r0 = zendesk.conversationkit.android.model.MessageAction.Reply.$childSerializers
                r1 = 1
                java.lang.String r2 = r3.getId()
                r4.q(r5, r1, r2)
                boolean r1 = r4.C(r5)
                if (r1 == 0) goto L14
                goto L23
            L14:
                java.util.Map r1 = r3.getMetadata()
                kotlin.collections.o0 r2 = kotlin.collections.o0.f26530a
                r2.getClass()
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
                if (r1 != 0) goto L33
            L23:
                r1 = 2
                r0 = r0[r1]
                java.lang.Object r0 = r0.getValue()
                kotlinx.serialization.KSerializer r0 = (kotlinx.serialization.KSerializer) r0
                java.util.Map r2 = r3.getMetadata()
                r4.i(r5, r1, r0, r2)
            L33:
                r0 = 3
                java.lang.String r1 = r3.text
                r4.q(r5, r0, r1)
                m90.r1 r0 = m90.r1.f29848a
                java.lang.String r1 = r3.iconUrl
                r2 = 4
                r4.r(r5, r2, r0, r1)
                r0 = 5
                java.lang.String r3 = r3.payload
                r4.q(r5, r0, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.model.MessageAction.Reply.write$Self$zendesk_conversationkit_conversationkit_android(zendesk.conversationkit.android.model.MessageAction$Reply, l90.b, kotlinx.serialization.descriptors.SerialDescriptor):void");
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @NotNull
        public final Map<String, Object> component2() {
            return this.metadata;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getIconUrl() {
            return this.iconUrl;
        }

        @NotNull
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getPayload() {
            return this.payload;
        }

        @NotNull
        public final Reply copy(@NotNull String id2, @NotNull Map<String, ? extends Object> metadata, @NotNull String text, @Nullable String iconUrl, @NotNull String payload) {
            id2.getClass();
            metadata.getClass();
            text.getClass();
            payload.getClass();
            return new Reply(id2, metadata, text, iconUrl, payload);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Reply)) {
                return false;
            }
            Reply reply = (Reply) other;
            return Intrinsics.areEqual(this.id, reply.id) && Intrinsics.areEqual(this.metadata, reply.metadata) && Intrinsics.areEqual(this.text, reply.text) && Intrinsics.areEqual(this.iconUrl, reply.iconUrl) && Intrinsics.areEqual(this.payload, reply.payload);
        }

        @Nullable
        public final String getIconUrl() {
            return this.iconUrl;
        }

        @Override // zendesk.conversationkit.android.model.MessageAction
        @NotNull
        public String getId() {
            return this.id;
        }

        @Override // zendesk.conversationkit.android.model.MessageAction
        @NotNull
        public Map<String, Object> getMetadata() {
            return this.metadata;
        }

        @NotNull
        public final String getPayload() {
            return this.payload;
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            int iB = l1.b(a0.f(this.metadata, this.id.hashCode() * 31, 31), 31, this.text);
            String str = this.iconUrl;
            return this.payload.hashCode() + ((iB + (str == null ? 0 : str.hashCode())) * 31);
        }

        @NotNull
        public String toString() {
            String str = this.id;
            Map<String, Object> map = this.metadata;
            String str2 = this.text;
            String str3 = this.iconUrl;
            String str4 = this.payload;
            StringBuilder sb2 = new StringBuilder("Reply(id=");
            sb2.append(str);
            sb2.append(", metadata=");
            sb2.append(map);
            sb2.append(", text=");
            s.A(sb2, str2, ", iconUrl=", str3, ", payload=");
            return k.p(sb2, str4, ")");
        }

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/conversationkit/android/model/MessageAction$Reply$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/conversationkit/android/model/MessageAction$Reply;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return MessageAction$Reply$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Reply(String str, Map map, String str2, String str3, String str4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i11 & 2) != 0) {
                map = o0.f26530a;
                map.getClass();
            }
            this(str, map, str2, str3, str4);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Reply(@NotNull String str, @NotNull Map<String, ? extends Object> map, @NotNull String str2, @Nullable String str3, @NotNull String str4) {
            super(MessageActionType.REPLY, null);
            str.getClass();
            map.getClass();
            str2.getClass();
            str4.getClass();
            this.id = str;
            this.metadata = map;
            this.text = str2;
            this.iconUrl = str3;
            this.payload = str4;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bBE\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0007\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u001c\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ0\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u001aJ\u0010\u0010 \u001a\u00020\tHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u001aR&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u001c¨\u0006,"}, d2 = {"Lzendesk/conversationkit/android/model/MessageAction$Share;", "Lzendesk/conversationkit/android/model/MessageAction;", "", "id", "", "", "metadata", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "", "seen0", "Lzendesk/conversationkit/android/model/MessageActionType;", "messageActionType", "Lm90/m1;", "serializationConstructorMarker", "(ILzendesk/conversationkit/android/model/MessageActionType;Ljava/lang/String;Ljava/util/Map;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$zendesk_conversationkit_conversationkit_android", "(Lzendesk/conversationkit/android/model/MessageAction$Share;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/util/Map;)Lzendesk/conversationkit/android/model/MessageAction$Share;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Ljava/util/Map;", "getMetadata", "Companion", "$serializer", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @h
    @g("share")
    public static final /* data */ class Share extends MessageAction {

        @NotNull
        private static final j[] $childSerializers;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final String id;

        @NotNull
        private final Map<String, Object> metadata;

        static {
            m mVar = m.PUBLICATION;
            $childSerializers = new j[]{l.a(mVar, new db0.b(0)), null, l.a(mVar, new db0.b(1))};
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Share(int i11, MessageActionType messageActionType, String str, Map map, m1 m1Var) {
            super(i11, messageActionType, m1Var);
            if (3 != (i11 & 3)) {
                c1.j(i11, 3, MessageAction$Share$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.id = str;
            if ((i11 & 4) != 0) {
                this.metadata = map;
                return;
            }
            o0 o0Var = o0.f26530a;
            o0Var.getClass();
            this.metadata = o0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return MessageActionType.INSTANCE.serializer();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
            return new f0(r1.f29848a, new i90.a(Reflection.getOrCreateKotlinClass(Object.class), new KSerializer[0]), 1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Share copy$default(Share share, String str, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = share.id;
            }
            if ((i11 & 2) != 0) {
                map = share.metadata;
            }
            return share.copy(str, map);
        }

        public static final void write$Self$zendesk_conversationkit_conversationkit_android(Share self, b output, SerialDescriptor serialDesc) {
            MessageAction.write$Self(self, output, serialDesc);
            j[] jVarArr = $childSerializers;
            output.q(serialDesc, 1, self.getId());
            if (!output.C(serialDesc)) {
                Map<String, Object> metadata = self.getMetadata();
                o0 o0Var = o0.f26530a;
                o0Var.getClass();
                if (Intrinsics.areEqual(metadata, o0Var)) {
                    return;
                }
            }
            output.i(serialDesc, 2, (KSerializer) jVarArr[2].getValue(), self.getMetadata());
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @NotNull
        public final Map<String, Object> component2() {
            return this.metadata;
        }

        @NotNull
        public final Share copy(@NotNull String id2, @NotNull Map<String, ? extends Object> metadata) {
            id2.getClass();
            metadata.getClass();
            return new Share(id2, metadata);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Share)) {
                return false;
            }
            Share share = (Share) other;
            return Intrinsics.areEqual(this.id, share.id) && Intrinsics.areEqual(this.metadata, share.metadata);
        }

        @Override // zendesk.conversationkit.android.model.MessageAction
        @NotNull
        public String getId() {
            return this.id;
        }

        @Override // zendesk.conversationkit.android.model.MessageAction
        @NotNull
        public Map<String, Object> getMetadata() {
            return this.metadata;
        }

        public int hashCode() {
            return this.metadata.hashCode() + (this.id.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "Share(id=" + this.id + ", metadata=" + this.metadata + ")";
        }

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/conversationkit/android/model/MessageAction$Share$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/conversationkit/android/model/MessageAction$Share;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return MessageAction$Share$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Share(String str, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i11 & 2) != 0) {
                map = o0.f26530a;
                map.getClass();
            }
            this(str, map);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Share(@NotNull String str, @NotNull Map<String, ? extends Object> map) {
            super(MessageActionType.SHARE, null);
            str.getClass();
            map.getClass();
            this.id = str;
            this.metadata = map;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u0000 G2\u00020\u0001:\u0002HGB]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012B\u0087\u0001\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0011\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u001c\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001bJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001bJ\u0010\u0010!\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0010\u0010$\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b&\u0010'Jv\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000fHÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010\u001bJ\u0010\u0010+\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u0010.\u001a\u00020\n2\b\u0010-\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b.\u0010/J'\u00108\u001a\u0002052\u0006\u00100\u001a\u00020\u00002\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u000203H\u0001¢\u0006\u0004\b6\u00107R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u00109\u001a\u0004\b:\u0010\u001bR&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010;\u001a\u0004\b<\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00109\u001a\u0004\b=\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u00109\u001a\u0004\b>\u0010\u001bR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u00109\u001a\u0004\b?\u0010\u001bR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010@\u001a\u0004\bA\u0010\"R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\f\u0010@\u001a\u0004\bB\u0010\"R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010C\u001a\u0004\bD\u0010%R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010E\u001a\u0004\bF\u0010'¨\u0006I"}, d2 = {"Lzendesk/conversationkit/android/model/MessageAction$WebView;", "Lzendesk/conversationkit/android/model/MessageAction;", "", "id", "", "", "metadata", TextBundle.TEXT_ENTRY, "uri", "fallback", "", "default", "openOnReceive", "Lzendesk/conversationkit/android/model/MessageActionSize;", "size", "Lzendesk/conversationkit/android/model/MessageSourceType;", "sourceType", "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLzendesk/conversationkit/android/model/MessageActionSize;Lzendesk/conversationkit/android/model/MessageSourceType;)V", "", "seen0", "Lzendesk/conversationkit/android/model/MessageActionType;", "messageActionType", "Lm90/m1;", "serializationConstructorMarker", "(ILzendesk/conversationkit/android/model/MessageActionType;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLzendesk/conversationkit/android/model/MessageActionSize;Lzendesk/conversationkit/android/model/MessageSourceType;Lm90/m1;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/Map;", "component3", "component4", "component5", "component6", "()Z", "component7", "component8", "()Lzendesk/conversationkit/android/model/MessageActionSize;", "component9", "()Lzendesk/conversationkit/android/model/MessageSourceType;", "copy", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLzendesk/conversationkit/android/model/MessageActionSize;Lzendesk/conversationkit/android/model/MessageSourceType;)Lzendesk/conversationkit/android/model/MessageAction$WebView;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$zendesk_conversationkit_conversationkit_android", "(Lzendesk/conversationkit/android/model/MessageAction$WebView;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getId", "Ljava/util/Map;", "getMetadata", "getText", "getUri", "getFallback", "Z", "getDefault", "getOpenOnReceive", "Lzendesk/conversationkit/android/model/MessageActionSize;", "getSize", "Lzendesk/conversationkit/android/model/MessageSourceType;", "getSourceType", "Companion", "$serializer", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @h
    @g("webview")
    public static final /* data */ class WebView extends MessageAction {

        @NotNull
        private static final j[] $childSerializers;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        private final boolean default;

        @NotNull
        private final String fallback;

        @NotNull
        private final String id;

        @NotNull
        private final Map<String, Object> metadata;
        private final boolean openOnReceive;

        @NotNull
        private final MessageActionSize size;

        @NotNull
        private final MessageSourceType sourceType;

        @NotNull
        private final String text;

        @NotNull
        private final String uri;

        static {
            m mVar = m.PUBLICATION;
            $childSerializers = new j[]{l.a(mVar, new db0.b(2)), null, l.a(mVar, new db0.b(3)), null, null, null, null, null, l.a(mVar, new db0.b(4)), l.a(mVar, new db0.b(5))};
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WebView(int i11, MessageActionType messageActionType, String str, Map map, String str2, String str3, String str4, boolean z11, boolean z12, MessageActionSize messageActionSize, MessageSourceType messageSourceType, m1 m1Var) {
            super(i11, messageActionType, m1Var);
            if (1019 != (i11 & 1019)) {
                c1.j(i11, 1019, MessageAction$WebView$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.id = str;
            if ((i11 & 4) == 0) {
                o0 o0Var = o0.f26530a;
                o0Var.getClass();
                this.metadata = o0Var;
            } else {
                this.metadata = map;
            }
            this.text = str2;
            this.uri = str3;
            this.fallback = str4;
            this.default = z11;
            this.openOnReceive = z12;
            this.size = messageActionSize;
            this.sourceType = messageSourceType;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return MessageActionType.INSTANCE.serializer();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
            return new f0(r1.f29848a, new i90.a(Reflection.getOrCreateKotlinClass(Object.class), new KSerializer[0]), 1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
            return MessageActionSize.INSTANCE.serializer();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$2() {
            return MessageSourceType.INSTANCE.serializer();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ WebView copy$default(WebView webView, String str, Map map, String str2, String str3, String str4, boolean z11, boolean z12, MessageActionSize messageActionSize, MessageSourceType messageSourceType, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = webView.id;
            }
            if ((i11 & 2) != 0) {
                map = webView.metadata;
            }
            if ((i11 & 4) != 0) {
                str2 = webView.text;
            }
            if ((i11 & 8) != 0) {
                str3 = webView.uri;
            }
            if ((i11 & 16) != 0) {
                str4 = webView.fallback;
            }
            if ((i11 & 32) != 0) {
                z11 = webView.default;
            }
            if ((i11 & 64) != 0) {
                z12 = webView.openOnReceive;
            }
            if ((i11 & 128) != 0) {
                messageActionSize = webView.size;
            }
            if ((i11 & 256) != 0) {
                messageSourceType = webView.sourceType;
            }
            MessageActionSize messageActionSize2 = messageActionSize;
            MessageSourceType messageSourceType2 = messageSourceType;
            boolean z13 = z11;
            boolean z14 = z12;
            String str5 = str4;
            String str6 = str2;
            return webView.copy(str, map, str6, str3, str5, z13, z14, messageActionSize2, messageSourceType2);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static final void write$Self$zendesk_conversationkit_conversationkit_android(zendesk.conversationkit.android.model.MessageAction.WebView r4, l90.b r5, kotlinx.serialization.descriptors.SerialDescriptor r6) {
            /*
                zendesk.conversationkit.android.model.MessageAction.write$Self(r4, r5, r6)
                u70.j[] r0 = zendesk.conversationkit.android.model.MessageAction.WebView.$childSerializers
                r1 = 1
                java.lang.String r2 = r4.getId()
                r5.q(r6, r1, r2)
                boolean r1 = r5.C(r6)
                if (r1 == 0) goto L14
                goto L23
            L14:
                java.util.Map r1 = r4.getMetadata()
                kotlin.collections.o0 r2 = kotlin.collections.o0.f26530a
                r2.getClass()
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
                if (r1 != 0) goto L33
            L23:
                r1 = 2
                r2 = r0[r1]
                java.lang.Object r2 = r2.getValue()
                kotlinx.serialization.KSerializer r2 = (kotlinx.serialization.KSerializer) r2
                java.util.Map r3 = r4.getMetadata()
                r5.i(r6, r1, r2, r3)
            L33:
                r1 = 3
                java.lang.String r2 = r4.text
                r5.q(r6, r1, r2)
                r1 = 4
                java.lang.String r2 = r4.uri
                r5.q(r6, r1, r2)
                r1 = 5
                java.lang.String r2 = r4.fallback
                r5.q(r6, r1, r2)
                r1 = 6
                boolean r2 = r4.default
                r5.p(r6, r1, r2)
                r1 = 7
                boolean r2 = r4.openOnReceive
                r5.p(r6, r1, r2)
                r1 = 8
                r2 = r0[r1]
                java.lang.Object r2 = r2.getValue()
                kotlinx.serialization.KSerializer r2 = (kotlinx.serialization.KSerializer) r2
                zendesk.conversationkit.android.model.MessageActionSize r3 = r4.size
                r5.i(r6, r1, r2, r3)
                r1 = 9
                r0 = r0[r1]
                java.lang.Object r0 = r0.getValue()
                kotlinx.serialization.KSerializer r0 = (kotlinx.serialization.KSerializer) r0
                zendesk.conversationkit.android.model.MessageSourceType r4 = r4.sourceType
                r5.i(r6, r1, r0, r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.model.MessageAction.WebView.write$Self$zendesk_conversationkit_conversationkit_android(zendesk.conversationkit.android.model.MessageAction$WebView, l90.b, kotlinx.serialization.descriptors.SerialDescriptor):void");
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @NotNull
        public final Map<String, Object> component2() {
            return this.metadata;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @NotNull
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getUri() {
            return this.uri;
        }

        @NotNull
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getFallback() {
            return this.fallback;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final boolean getDefault() {
            return this.default;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final boolean getOpenOnReceive() {
            return this.openOnReceive;
        }

        @NotNull
        /* JADX INFO: renamed from: component8, reason: from getter */
        public final MessageActionSize getSize() {
            return this.size;
        }

        @NotNull
        /* JADX INFO: renamed from: component9, reason: from getter */
        public final MessageSourceType getSourceType() {
            return this.sourceType;
        }

        @NotNull
        public final WebView copy(@NotNull String id2, @NotNull Map<String, ? extends Object> metadata, @NotNull String text, @NotNull String uri, @NotNull String fallback, boolean z11, boolean openOnReceive, @NotNull MessageActionSize size, @NotNull MessageSourceType sourceType) {
            id2.getClass();
            metadata.getClass();
            text.getClass();
            uri.getClass();
            fallback.getClass();
            size.getClass();
            sourceType.getClass();
            return new WebView(id2, metadata, text, uri, fallback, z11, openOnReceive, size, sourceType);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WebView)) {
                return false;
            }
            WebView webView = (WebView) other;
            return Intrinsics.areEqual(this.id, webView.id) && Intrinsics.areEqual(this.metadata, webView.metadata) && Intrinsics.areEqual(this.text, webView.text) && Intrinsics.areEqual(this.uri, webView.uri) && Intrinsics.areEqual(this.fallback, webView.fallback) && this.default == webView.default && this.openOnReceive == webView.openOnReceive && this.size == webView.size && this.sourceType == webView.sourceType;
        }

        public final boolean getDefault() {
            return this.default;
        }

        @NotNull
        public final String getFallback() {
            return this.fallback;
        }

        @Override // zendesk.conversationkit.android.model.MessageAction
        @NotNull
        public String getId() {
            return this.id;
        }

        @Override // zendesk.conversationkit.android.model.MessageAction
        @NotNull
        public Map<String, Object> getMetadata() {
            return this.metadata;
        }

        public final boolean getOpenOnReceive() {
            return this.openOnReceive;
        }

        @NotNull
        public final MessageActionSize getSize() {
            return this.size;
        }

        @NotNull
        public final MessageSourceType getSourceType() {
            return this.sourceType;
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        @NotNull
        public final String getUri() {
            return this.uri;
        }

        public int hashCode() {
            return this.sourceType.hashCode() + ((this.size.hashCode() + k.e(k.e(l1.b(l1.b(l1.b(a0.f(this.metadata, this.id.hashCode() * 31, 31), 31, this.text), 31, this.uri), 31, this.fallback), 31, this.default), 31, this.openOnReceive)) * 31);
        }

        @NotNull
        public String toString() {
            String str = this.id;
            Map<String, Object> map = this.metadata;
            String str2 = this.text;
            String str3 = this.uri;
            String str4 = this.fallback;
            boolean z11 = this.default;
            boolean z12 = this.openOnReceive;
            MessageActionSize messageActionSize = this.size;
            MessageSourceType messageSourceType = this.sourceType;
            StringBuilder sb2 = new StringBuilder("WebView(id=");
            sb2.append(str);
            sb2.append(", metadata=");
            sb2.append(map);
            sb2.append(", text=");
            s.A(sb2, str2, ", uri=", str3, ", fallback=");
            k.z(sb2, str4, ", default=", z11, ", openOnReceive=");
            sb2.append(z12);
            sb2.append(", size=");
            sb2.append(messageActionSize);
            sb2.append(", sourceType=");
            sb2.append(messageSourceType);
            sb2.append(")");
            return sb2.toString();
        }

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/conversationkit/android/model/MessageAction$WebView$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/conversationkit/android/model/MessageAction$WebView;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return MessageAction$WebView$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public WebView(String str, Map map, String str2, String str3, String str4, boolean z11, boolean z12, MessageActionSize messageActionSize, MessageSourceType messageSourceType, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i11 & 2) != 0) {
                map = o0.f26530a;
                map.getClass();
            }
            this(str, map, str2, str3, str4, z11, z12, messageActionSize, messageSourceType);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WebView(@NotNull String str, @NotNull Map<String, ? extends Object> map, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z11, boolean z12, @NotNull MessageActionSize messageActionSize, @NotNull MessageSourceType messageSourceType) {
            super(MessageActionType.WEBVIEW, null);
            str.getClass();
            map.getClass();
            str2.getClass();
            str3.getClass();
            str4.getClass();
            messageActionSize.getClass();
            messageSourceType.getClass();
            this.id = str;
            this.metadata = map;
            this.text = str2;
            this.uri = str3;
            this.fallback = str4;
            this.default = z11;
            this.openOnReceive = z12;
            this.size = messageActionSize;
            this.sourceType = messageSourceType;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/conversationkit/android/model/MessageAction$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/conversationkit/android/model/MessageAction;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) MessageAction.$cachedSerializer$delegate.getValue();
        }

        @NotNull
        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ MessageAction(MessageActionType messageActionType, DefaultConstructorMarker defaultConstructorMarker) {
        this(messageActionType);
    }

    private MessageAction(MessageActionType messageActionType) {
        this.messageActionType = messageActionType;
    }
}
