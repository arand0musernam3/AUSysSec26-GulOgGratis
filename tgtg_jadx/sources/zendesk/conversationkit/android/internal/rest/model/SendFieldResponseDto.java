package zendesk.conversationkit.android.internal.rest.model;

import bb0.a;
import i90.f;
import i90.g;
import i90.h;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.c1;
import m90.d;
import m90.m1;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.j;
import u70.l;
import u70.m;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@h
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000 \u001c2\u00020\u0001:\u0004\u001d\u001e\u001f\u001cB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0015R\u0014\u0010\u001b\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0015\u0082\u0001\u0003 !\"¨\u0006#"}, d2 = {"Lzendesk/conversationkit/android/internal/rest/model/SendFieldResponseDto;", "", "", "sendFieldResponseType", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lzendesk/conversationkit/android/internal/rest/model/SendFieldResponseDto;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getSendFieldResponseType", "()Ljava/lang/String;", "getId", "id", "getName", "name", "getLabel", AnnotatedPrivateKey.LABEL, "Companion", "Text", "Email", "Select", "Lzendesk/conversationkit/android/internal/rest/model/SendFieldResponseDto$Email;", "Lzendesk/conversationkit/android/internal/rest/model/SendFieldResponseDto$Select;", "Lzendesk/conversationkit/android/internal/rest/model/SendFieldResponseDto$Text;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class SendFieldResponseDto {

    @NotNull
    private final String sendFieldResponseType;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final j $cachedSerializer$delegate = l.a(m.PUBLICATION, new a(21));

    public /* synthetic */ SendFieldResponseDto(int i11, String str, m1 m1Var) {
        this.sendFieldResponseType = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return new f("zendesk.conversationkit.android.internal.rest.model.SendFieldResponseDto", Reflection.getOrCreateKotlinClass(SendFieldResponseDto.class), new KClass[]{Reflection.getOrCreateKotlinClass(Email.class), Reflection.getOrCreateKotlinClass(Select.class), Reflection.getOrCreateKotlinClass(Text.class)}, new KSerializer[]{SendFieldResponseDto$Email$$serializer.INSTANCE, SendFieldResponseDto$Select$$serializer.INSTANCE, SendFieldResponseDto$Text$$serializer.INSTANCE}, new Annotation[0]);
    }

    public static final /* synthetic */ void write$Self(SendFieldResponseDto self, b output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.sendFieldResponseType);
    }

    @NotNull
    public abstract String getId();

    @NotNull
    public abstract String getLabel();

    @NotNull
    public abstract String getName();

    @NotNull
    public final String getSendFieldResponseType() {
        return this.sendFieldResponseType;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u0000 .2\u00020\u0001:\u0002/.B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bBM\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0007\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J8\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J\u0010\u0010 \u001a\u00020\tHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R \u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010'\u0012\u0004\b)\u0010*\u001a\u0004\b(\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b+\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b,\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b-\u0010\u0019¨\u00060"}, d2 = {"Lzendesk/conversationkit/android/internal/rest/model/SendFieldResponseDto$Email;", "Lzendesk/conversationkit/android/internal/rest/model/SendFieldResponseDto;", "", "id", "name", AnnotatedPrivateKey.LABEL, "email", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "sendFieldResponseType", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$zendesk_conversationkit_conversationkit_android", "(Lzendesk/conversationkit/android/internal/rest/model/SendFieldResponseDto$Email;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lzendesk/conversationkit/android/internal/rest/model/SendFieldResponseDto$Email;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "getName", "getLabel", "getEmail", "Companion", "$serializer", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @h
    @g("email")
    public static final /* data */ class Email extends SendFieldResponseDto {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final String email;

        @NotNull
        private final String id;

        @NotNull
        private final String label;

        @NotNull
        private final String name;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Email(int i11, String str, String str2, String str3, String str4, String str5, m1 m1Var) {
            super(i11, str, m1Var);
            if (31 != (i11 & 31)) {
                c1.j(i11, 31, SendFieldResponseDto$Email$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.id = str2;
            this.name = str3;
            this.label = str4;
            this.email = str5;
        }

        public static /* synthetic */ Email copy$default(Email email, String str, String str2, String str3, String str4, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = email.id;
            }
            if ((i11 & 2) != 0) {
                str2 = email.name;
            }
            if ((i11 & 4) != 0) {
                str3 = email.label;
            }
            if ((i11 & 8) != 0) {
                str4 = email.email;
            }
            return email.copy(str, str2, str3, str4);
        }

        public static final /* synthetic */ void write$Self$zendesk_conversationkit_conversationkit_android(Email self, b output, SerialDescriptor serialDesc) {
            SendFieldResponseDto.write$Self(self, output, serialDesc);
            output.q(serialDesc, 1, self.getId());
            output.q(serialDesc, 2, self.getName());
            output.q(serialDesc, 3, self.getLabel());
            output.q(serialDesc, 4, self.email);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        @NotNull
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getEmail() {
            return this.email;
        }

        @NotNull
        public final Email copy(@NotNull String id2, @NotNull String name, @NotNull String label, @NotNull String email) {
            id2.getClass();
            name.getClass();
            label.getClass();
            email.getClass();
            return new Email(id2, name, label, email);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Email)) {
                return false;
            }
            Email email = (Email) other;
            return Intrinsics.areEqual(this.id, email.id) && Intrinsics.areEqual(this.name, email.name) && Intrinsics.areEqual(this.label, email.label) && Intrinsics.areEqual(this.email, email.email);
        }

        @NotNull
        public final String getEmail() {
            return this.email;
        }

        @Override // zendesk.conversationkit.android.internal.rest.model.SendFieldResponseDto
        @NotNull
        public String getId() {
            return this.id;
        }

        @Override // zendesk.conversationkit.android.internal.rest.model.SendFieldResponseDto
        @NotNull
        public String getLabel() {
            return this.label;
        }

        @Override // zendesk.conversationkit.android.internal.rest.model.SendFieldResponseDto
        @NotNull
        public String getName() {
            return this.name;
        }

        public int hashCode() {
            return this.email.hashCode() + l1.b(l1.b(this.id.hashCode() * 31, 31, this.name), 31, this.label);
        }

        @NotNull
        public String toString() {
            String str = this.id;
            String str2 = this.name;
            return e0.f.o(e0.f.t("Email(id=", str, ", name=", str2, ", label="), this.label, ", email=", this.email, ")");
        }

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/conversationkit/android/internal/rest/model/SendFieldResponseDto$Email$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/conversationkit/android/internal/rest/model/SendFieldResponseDto$Email;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return SendFieldResponseDto$Email$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @g("_id")
        public static /* synthetic */ void getId$annotations() {
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Email(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
            super("email", null);
            str.getClass();
            str2.getClass();
            str3.getClass();
            str4.getClass();
            this.id = str;
            this.name = str2;
            this.label = str3;
            this.email = str4;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0081\b\u0018\u0000 22\u00020\u0001:\u000232B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nBS\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\t\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ>\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001bJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R \u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010*\u0012\u0004\b,\u0010-\u001a\u0004\b+\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b.\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b/\u0010\u001bR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b1\u0010\u001f¨\u00064"}, d2 = {"Lzendesk/conversationkit/android/internal/rest/model/SendFieldResponseDto$Select;", "Lzendesk/conversationkit/android/internal/rest/model/SendFieldResponseDto;", "", "id", "name", AnnotatedPrivateKey.LABEL, "", "Lzendesk/conversationkit/android/internal/rest/model/SendFieldSelectDto;", "select", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "sendFieldResponseType", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$zendesk_conversationkit_conversationkit_android", "(Lzendesk/conversationkit/android/internal/rest/model/SendFieldResponseDto$Select;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lzendesk/conversationkit/android/internal/rest/model/SendFieldResponseDto$Select;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "getName", "getLabel", "Ljava/util/List;", "getSelect", "Companion", "$serializer", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @h
    @g("select")
    public static final /* data */ class Select extends SendFieldResponseDto {

        @NotNull
        private final String id;

        @NotNull
        private final String label;

        @NotNull
        private final String name;

        @NotNull
        private final List<SendFieldSelectDto> select;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private static final j[] $childSerializers = {null, null, null, null, l.a(m.PUBLICATION, new a(22))};

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Select(int i11, String str, String str2, String str3, String str4, List list, m1 m1Var) {
            super(i11, str, m1Var);
            if (31 != (i11 & 31)) {
                c1.j(i11, 31, SendFieldResponseDto$Select$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.id = str2;
            this.name = str3;
            this.label = str4;
            this.select = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new d(SendFieldSelectDto$$serializer.INSTANCE, 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Select copy$default(Select select, String str, String str2, String str3, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = select.id;
            }
            if ((i11 & 2) != 0) {
                str2 = select.name;
            }
            if ((i11 & 4) != 0) {
                str3 = select.label;
            }
            if ((i11 & 8) != 0) {
                list = select.select;
            }
            return select.copy(str, str2, str3, list);
        }

        public static final /* synthetic */ void write$Self$zendesk_conversationkit_conversationkit_android(Select self, b output, SerialDescriptor serialDesc) {
            SendFieldResponseDto.write$Self(self, output, serialDesc);
            j[] jVarArr = $childSerializers;
            output.q(serialDesc, 1, self.getId());
            output.q(serialDesc, 2, self.getName());
            output.q(serialDesc, 3, self.getLabel());
            output.i(serialDesc, 4, (KSerializer) jVarArr[4].getValue(), self.select);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        @NotNull
        public final List<SendFieldSelectDto> component4() {
            return this.select;
        }

        @NotNull
        public final Select copy(@NotNull String id2, @NotNull String name, @NotNull String label, @NotNull List<SendFieldSelectDto> select) {
            id2.getClass();
            name.getClass();
            label.getClass();
            select.getClass();
            return new Select(id2, name, label, select);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Select)) {
                return false;
            }
            Select select = (Select) other;
            return Intrinsics.areEqual(this.id, select.id) && Intrinsics.areEqual(this.name, select.name) && Intrinsics.areEqual(this.label, select.label) && Intrinsics.areEqual(this.select, select.select);
        }

        @Override // zendesk.conversationkit.android.internal.rest.model.SendFieldResponseDto
        @NotNull
        public String getId() {
            return this.id;
        }

        @Override // zendesk.conversationkit.android.internal.rest.model.SendFieldResponseDto
        @NotNull
        public String getLabel() {
            return this.label;
        }

        @Override // zendesk.conversationkit.android.internal.rest.model.SendFieldResponseDto
        @NotNull
        public String getName() {
            return this.name;
        }

        @NotNull
        public final List<SendFieldSelectDto> getSelect() {
            return this.select;
        }

        public int hashCode() {
            return this.select.hashCode() + l1.b(l1.b(this.id.hashCode() * 31, 31, this.name), 31, this.label);
        }

        @NotNull
        public String toString() {
            String str = this.id;
            String str2 = this.name;
            String str3 = this.label;
            List<SendFieldSelectDto> list = this.select;
            StringBuilder sbT = e0.f.t("Select(id=", str, ", name=", str2, ", label=");
            sbT.append(str3);
            sbT.append(", select=");
            sbT.append(list);
            sbT.append(")");
            return sbT.toString();
        }

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/conversationkit/android/internal/rest/model/SendFieldResponseDto$Select$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/conversationkit/android/internal/rest/model/SendFieldResponseDto$Select;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return SendFieldResponseDto$Select$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @g("_id")
        public static /* synthetic */ void getId$annotations() {
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Select(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull List<SendFieldSelectDto> list) {
            super("select", null);
            str.getClass();
            str2.getClass();
            str3.getClass();
            list.getClass();
            this.id = str;
            this.name = str2;
            this.label = str3;
            this.select = list;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u0000 .2\u00020\u0001:\u0002/.B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bBM\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0007\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J8\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J\u0010\u0010 \u001a\u00020\tHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R \u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010'\u0012\u0004\b)\u0010*\u001a\u0004\b(\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b+\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b,\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b-\u0010\u0019¨\u00060"}, d2 = {"Lzendesk/conversationkit/android/internal/rest/model/SendFieldResponseDto$Text;", "Lzendesk/conversationkit/android/internal/rest/model/SendFieldResponseDto;", "", "id", "name", AnnotatedPrivateKey.LABEL, TextBundle.TEXT_ENTRY, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "sendFieldResponseType", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$zendesk_conversationkit_conversationkit_android", "(Lzendesk/conversationkit/android/internal/rest/model/SendFieldResponseDto$Text;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lzendesk/conversationkit/android/internal/rest/model/SendFieldResponseDto$Text;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "getName", "getLabel", "getText", "Companion", "$serializer", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @h
    @g(TextBundle.TEXT_ENTRY)
    public static final /* data */ class Text extends SendFieldResponseDto {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final String id;

        @NotNull
        private final String label;

        @NotNull
        private final String name;

        @NotNull
        private final String text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Text(int i11, String str, String str2, String str3, String str4, String str5, m1 m1Var) {
            super(i11, str, m1Var);
            if (31 != (i11 & 31)) {
                c1.j(i11, 31, SendFieldResponseDto$Text$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.id = str2;
            this.name = str3;
            this.label = str4;
            this.text = str5;
        }

        public static /* synthetic */ Text copy$default(Text text, String str, String str2, String str3, String str4, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = text.id;
            }
            if ((i11 & 2) != 0) {
                str2 = text.name;
            }
            if ((i11 & 4) != 0) {
                str3 = text.label;
            }
            if ((i11 & 8) != 0) {
                str4 = text.text;
            }
            return text.copy(str, str2, str3, str4);
        }

        public static final /* synthetic */ void write$Self$zendesk_conversationkit_conversationkit_android(Text self, b output, SerialDescriptor serialDesc) {
            SendFieldResponseDto.write$Self(self, output, serialDesc);
            output.q(serialDesc, 1, self.getId());
            output.q(serialDesc, 2, self.getName());
            output.q(serialDesc, 3, self.getLabel());
            output.q(serialDesc, 4, self.text);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        @NotNull
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @NotNull
        public final Text copy(@NotNull String id2, @NotNull String name, @NotNull String label, @NotNull String text) {
            id2.getClass();
            name.getClass();
            label.getClass();
            text.getClass();
            return new Text(id2, name, label, text);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Text)) {
                return false;
            }
            Text text = (Text) other;
            return Intrinsics.areEqual(this.id, text.id) && Intrinsics.areEqual(this.name, text.name) && Intrinsics.areEqual(this.label, text.label) && Intrinsics.areEqual(this.text, text.text);
        }

        @Override // zendesk.conversationkit.android.internal.rest.model.SendFieldResponseDto
        @NotNull
        public String getId() {
            return this.id;
        }

        @Override // zendesk.conversationkit.android.internal.rest.model.SendFieldResponseDto
        @NotNull
        public String getLabel() {
            return this.label;
        }

        @Override // zendesk.conversationkit.android.internal.rest.model.SendFieldResponseDto
        @NotNull
        public String getName() {
            return this.name;
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            return this.text.hashCode() + l1.b(l1.b(this.id.hashCode() * 31, 31, this.name), 31, this.label);
        }

        @NotNull
        public String toString() {
            String str = this.id;
            String str2 = this.name;
            return e0.f.o(e0.f.t("Text(id=", str, ", name=", str2, ", label="), this.label, ", text=", this.text, ")");
        }

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/conversationkit/android/internal/rest/model/SendFieldResponseDto$Text$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/conversationkit/android/internal/rest/model/SendFieldResponseDto$Text;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return SendFieldResponseDto$Text$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @g("_id")
        public static /* synthetic */ void getId$annotations() {
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Text(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
            super(TextBundle.TEXT_ENTRY, null);
            str.getClass();
            str2.getClass();
            str3.getClass();
            str4.getClass();
            this.id = str;
            this.name = str2;
            this.label = str3;
            this.text = str4;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/conversationkit/android/internal/rest/model/SendFieldResponseDto$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/conversationkit/android/internal/rest/model/SendFieldResponseDto;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) SendFieldResponseDto.$cachedSerializer$delegate.getValue();
        }

        @NotNull
        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ SendFieldResponseDto(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    private SendFieldResponseDto(String str) {
        this.sendFieldResponseType = str;
    }
}
