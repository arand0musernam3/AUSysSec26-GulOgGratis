package zendesk.analyticskit.android.model;

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
import w.a0;
import yu.a;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@h
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00112\u00020\u0001:\u0006\u0012\u0013\u0014\u0015\u0016\u0011B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0001\u0005\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"Lzendesk/analyticskit/android/model/AnalyticsValueType;", "", "<init>", "()V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lzendesk/analyticskit/android/model/AnalyticsValueType;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Companion", "DefaultValueType", "ConversationExtensionValueType", "ArticleValueType", "CustomizedAPIValueType", "MessagingScreenValueType", "Lzendesk/analyticskit/android/model/AnalyticsValueType$ArticleValueType;", "Lzendesk/analyticskit/android/model/AnalyticsValueType$ConversationExtensionValueType;", "Lzendesk/analyticskit/android/model/AnalyticsValueType$CustomizedAPIValueType;", "Lzendesk/analyticskit/android/model/AnalyticsValueType$DefaultValueType;", "Lzendesk/analyticskit/android/model/AnalyticsValueType$MessagingScreenValueType;", "zendesk.analyticskit_analyticskit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class AnalyticsValueType {

    @NotNull
    public static final String ARTICLE_TYPE = "Article";

    @NotNull
    public static final String CONVERSATION_EXTENSION_TYPE = "ConversationExtension";

    @NotNull
    public static final String CUSTOMIZATION_API_TYPE = "CustomizationAPI";

    @NotNull
    public static final String DEFAULT_TYPE = "Default";

    @NotNull
    public static final String SHOW_MESSAGING_TYPE = "ShowMessaging";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final j $cachedSerializer$delegate = l.a(m.PUBLICATION, new a(14));

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @h
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\u000bJ\t\u0010\f\u001a\u00020\rHÖ\u0001¨\u0006\u000e"}, d2 = {"Lzendesk/analyticskit/android/model/AnalyticsValueType$DefaultValueType;", "Lzendesk/analyticskit/android/model/AnalyticsValueType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "zendesk.analyticskit_analyticskit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class DefaultValueType extends AnalyticsValueType {

        @NotNull
        public static final DefaultValueType INSTANCE = new DefaultValueType();
        private static final /* synthetic */ j $cachedSerializer$delegate = l.a(m.PUBLICATION, new a(15));

        private DefaultValueType() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new i90.a("zendesk.analyticskit.android.model.AnalyticsValueType.DefaultValueType", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof DefaultValueType);
        }

        public int hashCode() {
            return 342263043;
        }

        @NotNull
        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        @NotNull
        public String toString() {
            return "DefaultValueType";
        }
    }

    public /* synthetic */ AnalyticsValueType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return new f("zendesk.analyticskit.android.model.AnalyticsValueType", Reflection.getOrCreateKotlinClass(AnalyticsValueType.class), new KClass[]{Reflection.getOrCreateKotlinClass(ArticleValueType.class), Reflection.getOrCreateKotlinClass(ConversationExtensionValueType.class), Reflection.getOrCreateKotlinClass(CustomizedAPIValueType.class), Reflection.getOrCreateKotlinClass(DefaultValueType.class), Reflection.getOrCreateKotlinClass(MessagingScreenValueType.class)}, new KSerializer[]{AnalyticsValueType$ArticleValueType$$serializer.INSTANCE, AnalyticsValueType$ConversationExtensionValueType$$serializer.INSTANCE, AnalyticsValueType$CustomizedAPIValueType$$serializer.INSTANCE, new i90.a("zendesk.analyticskit.android.model.AnalyticsValueType.DefaultValueType", DefaultValueType.INSTANCE, new Annotation[0]), AnalyticsValueType$MessagingScreenValueType$$serializer.INSTANCE}, new Annotation[0]);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002#\"B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0015¨\u0006$"}, d2 = {"Lzendesk/analyticskit/android/model/AnalyticsValueType$ArticleValueType;", "Lzendesk/analyticskit/android/model/AnalyticsValueType;", "", "senderType", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$zendesk_analyticskit_analyticskit_android", "(Lzendesk/analyticskit/android/model/AnalyticsValueType$ArticleValueType;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lzendesk/analyticskit/android/model/AnalyticsValueType$ArticleValueType;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSenderType", "Companion", "$serializer", "zendesk.analyticskit_analyticskit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @h
    public static final /* data */ class ArticleValueType extends AnalyticsValueType {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final String senderType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ ArticleValueType(int i11, String str, m1 m1Var) {
            super(i11, m1Var);
            if (1 != (i11 & 1)) {
                c1.j(i11, 1, AnalyticsValueType$ArticleValueType$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.senderType = str;
        }

        public static /* synthetic */ ArticleValueType copy$default(ArticleValueType articleValueType, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = articleValueType.senderType;
            }
            return articleValueType.copy(str);
        }

        public static final /* synthetic */ void write$Self$zendesk_analyticskit_analyticskit_android(ArticleValueType self, b output, SerialDescriptor serialDesc) {
            AnalyticsValueType.write$Self(self, output, serialDesc);
            output.q(serialDesc, 0, self.senderType);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getSenderType() {
            return this.senderType;
        }

        @NotNull
        public final ArticleValueType copy(@NotNull String senderType) {
            senderType.getClass();
            return new ArticleValueType(senderType);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ArticleValueType) && Intrinsics.areEqual(this.senderType, ((ArticleValueType) other).senderType);
        }

        @NotNull
        public final String getSenderType() {
            return this.senderType;
        }

        public int hashCode() {
            return this.senderType.hashCode();
        }

        @NotNull
        public String toString() {
            return a0.p("ArticleValueType(senderType=", this.senderType, ")");
        }

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/analyticskit/android/model/AnalyticsValueType$ArticleValueType$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/analyticskit/android/model/AnalyticsValueType$ArticleValueType;", "zendesk.analyticskit_analyticskit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return AnalyticsValueType$ArticleValueType$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ArticleValueType(@NotNull String str) {
            super(null);
            str.getClass();
            this.senderType = str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&%B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J$\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u0016¨\u0006'"}, d2 = {"Lzendesk/analyticskit/android/model/AnalyticsValueType$ConversationExtensionValueType;", "Lzendesk/analyticskit/android/model/AnalyticsValueType;", "", "launchType", "size", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$zendesk_analyticskit_analyticskit_android", "(Lzendesk/analyticskit/android/model/AnalyticsValueType$ConversationExtensionValueType;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lzendesk/analyticskit/android/model/AnalyticsValueType$ConversationExtensionValueType;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLaunchType", "getSize", "Companion", "$serializer", "zendesk.analyticskit_analyticskit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @h
    public static final /* data */ class ConversationExtensionValueType extends AnalyticsValueType {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final String launchType;

        @NotNull
        private final String size;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ ConversationExtensionValueType(int i11, String str, String str2, m1 m1Var) {
            super(i11, m1Var);
            if (3 != (i11 & 3)) {
                c1.j(i11, 3, AnalyticsValueType$ConversationExtensionValueType$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.launchType = str;
            this.size = str2;
        }

        public static /* synthetic */ ConversationExtensionValueType copy$default(ConversationExtensionValueType conversationExtensionValueType, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = conversationExtensionValueType.launchType;
            }
            if ((i11 & 2) != 0) {
                str2 = conversationExtensionValueType.size;
            }
            return conversationExtensionValueType.copy(str, str2);
        }

        public static final /* synthetic */ void write$Self$zendesk_analyticskit_analyticskit_android(ConversationExtensionValueType self, b output, SerialDescriptor serialDesc) {
            AnalyticsValueType.write$Self(self, output, serialDesc);
            output.q(serialDesc, 0, self.launchType);
            output.q(serialDesc, 1, self.size);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getLaunchType() {
            return this.launchType;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getSize() {
            return this.size;
        }

        @NotNull
        public final ConversationExtensionValueType copy(@NotNull String launchType, @NotNull String size) {
            launchType.getClass();
            size.getClass();
            return new ConversationExtensionValueType(launchType, size);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ConversationExtensionValueType)) {
                return false;
            }
            ConversationExtensionValueType conversationExtensionValueType = (ConversationExtensionValueType) other;
            return Intrinsics.areEqual(this.launchType, conversationExtensionValueType.launchType) && Intrinsics.areEqual(this.size, conversationExtensionValueType.size);
        }

        @NotNull
        public final String getLaunchType() {
            return this.launchType;
        }

        @NotNull
        public final String getSize() {
            return this.size;
        }

        public int hashCode() {
            return this.size.hashCode() + (this.launchType.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return org.bouncycastle.jcajce.provider.asymmetric.a.d("ConversationExtensionValueType(launchType=", this.launchType, ", size=", this.size, ")");
        }

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/analyticskit/android/model/AnalyticsValueType$ConversationExtensionValueType$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/analyticskit/android/model/AnalyticsValueType$ConversationExtensionValueType;", "zendesk.analyticskit_analyticskit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return AnalyticsValueType$ConversationExtensionValueType$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ConversationExtensionValueType(@NotNull String str, @NotNull String str2) {
            super(null);
            str.getClass();
            str2.getClass();
            this.launchType = str;
            this.size = str2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002#\"B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0015¨\u0006$"}, d2 = {"Lzendesk/analyticskit/android/model/AnalyticsValueType$CustomizedAPIValueType;", "Lzendesk/analyticskit/android/model/AnalyticsValueType;", "", "elementChanged", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$zendesk_analyticskit_analyticskit_android", "(Lzendesk/analyticskit/android/model/AnalyticsValueType$CustomizedAPIValueType;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lzendesk/analyticskit/android/model/AnalyticsValueType$CustomizedAPIValueType;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getElementChanged", "Companion", "$serializer", "zendesk.analyticskit_analyticskit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @h
    public static final /* data */ class CustomizedAPIValueType extends AnalyticsValueType {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final String elementChanged;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ CustomizedAPIValueType(int i11, String str, m1 m1Var) {
            super(i11, m1Var);
            if (1 != (i11 & 1)) {
                c1.j(i11, 1, AnalyticsValueType$CustomizedAPIValueType$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.elementChanged = str;
        }

        public static /* synthetic */ CustomizedAPIValueType copy$default(CustomizedAPIValueType customizedAPIValueType, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = customizedAPIValueType.elementChanged;
            }
            return customizedAPIValueType.copy(str);
        }

        public static final /* synthetic */ void write$Self$zendesk_analyticskit_analyticskit_android(CustomizedAPIValueType self, b output, SerialDescriptor serialDesc) {
            AnalyticsValueType.write$Self(self, output, serialDesc);
            output.q(serialDesc, 0, self.elementChanged);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getElementChanged() {
            return this.elementChanged;
        }

        @NotNull
        public final CustomizedAPIValueType copy(@NotNull String elementChanged) {
            elementChanged.getClass();
            return new CustomizedAPIValueType(elementChanged);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CustomizedAPIValueType) && Intrinsics.areEqual(this.elementChanged, ((CustomizedAPIValueType) other).elementChanged);
        }

        @NotNull
        public final String getElementChanged() {
            return this.elementChanged;
        }

        public int hashCode() {
            return this.elementChanged.hashCode();
        }

        @NotNull
        public String toString() {
            return a0.p("CustomizedAPIValueType(elementChanged=", this.elementChanged, ")");
        }

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/analyticskit/android/model/AnalyticsValueType$CustomizedAPIValueType$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/analyticskit/android/model/AnalyticsValueType$CustomizedAPIValueType;", "zendesk.analyticskit_analyticskit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return AnalyticsValueType$CustomizedAPIValueType$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CustomizedAPIValueType(@NotNull String str) {
            super(null);
            str.getClass();
            this.elementChanged = str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002#\"B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0015¨\u0006$"}, d2 = {"Lzendesk/analyticskit/android/model/AnalyticsValueType$MessagingScreenValueType;", "Lzendesk/analyticskit/android/model/AnalyticsValueType;", "", "exitAction", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$zendesk_analyticskit_analyticskit_android", "(Lzendesk/analyticskit/android/model/AnalyticsValueType$MessagingScreenValueType;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lzendesk/analyticskit/android/model/AnalyticsValueType$MessagingScreenValueType;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getExitAction", "Companion", "$serializer", "zendesk.analyticskit_analyticskit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @h
    public static final /* data */ class MessagingScreenValueType extends AnalyticsValueType {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final String exitAction;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ MessagingScreenValueType(int i11, String str, m1 m1Var) {
            super(i11, m1Var);
            if (1 != (i11 & 1)) {
                c1.j(i11, 1, AnalyticsValueType$MessagingScreenValueType$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.exitAction = str;
        }

        public static /* synthetic */ MessagingScreenValueType copy$default(MessagingScreenValueType messagingScreenValueType, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = messagingScreenValueType.exitAction;
            }
            return messagingScreenValueType.copy(str);
        }

        public static final /* synthetic */ void write$Self$zendesk_analyticskit_analyticskit_android(MessagingScreenValueType self, b output, SerialDescriptor serialDesc) {
            AnalyticsValueType.write$Self(self, output, serialDesc);
            output.q(serialDesc, 0, self.exitAction);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getExitAction() {
            return this.exitAction;
        }

        @NotNull
        public final MessagingScreenValueType copy(@NotNull String exitAction) {
            exitAction.getClass();
            return new MessagingScreenValueType(exitAction);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof MessagingScreenValueType) && Intrinsics.areEqual(this.exitAction, ((MessagingScreenValueType) other).exitAction);
        }

        @NotNull
        public final String getExitAction() {
            return this.exitAction;
        }

        public int hashCode() {
            return this.exitAction.hashCode();
        }

        @NotNull
        public String toString() {
            return a0.p("MessagingScreenValueType(exitAction=", this.exitAction, ")");
        }

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/analyticskit/android/model/AnalyticsValueType$MessagingScreenValueType$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/analyticskit/android/model/AnalyticsValueType$MessagingScreenValueType;", "zendesk.analyticskit_analyticskit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return AnalyticsValueType$MessagingScreenValueType$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MessagingScreenValueType(@NotNull String str) {
            super(null);
            str.getClass();
            this.exitAction = str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lzendesk/analyticskit/android/model/AnalyticsValueType$Companion;", "", "<init>", "()V", "DEFAULT_TYPE", "", "CONVERSATION_EXTENSION_TYPE", "ARTICLE_TYPE", "CUSTOMIZATION_API_TYPE", "SHOW_MESSAGING_TYPE", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/analyticskit/android/model/AnalyticsValueType;", "zendesk.analyticskit_analyticskit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) AnalyticsValueType.$cachedSerializer$delegate.getValue();
        }

        @NotNull
        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        private Companion() {
        }
    }

    private AnalyticsValueType() {
    }

    public /* synthetic */ AnalyticsValueType(int i11, m1 m1Var) {
    }

    public static final /* synthetic */ void write$Self(AnalyticsValueType self, b output, SerialDescriptor serialDesc) {
    }
}
