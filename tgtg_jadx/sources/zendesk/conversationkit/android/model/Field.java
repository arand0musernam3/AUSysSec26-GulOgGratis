package zendesk.conversationkit.android.model;

import b3.i;
import db0.a;
import i90.f;
import i90.g;
import i90.h;
import j4.s;
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
import r8.k;
import u70.j;
import u70.l;
import u70.m;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@h
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000  2\u00020\u0001:\u0004!\"# B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0018R\u0014\u0010\u001f\u001a\u00020\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0018\u0082\u0001\u0003$%&¨\u0006'"}, d2 = {"Lzendesk/conversationkit/android/model/Field;", "", "Lzendesk/conversationkit/android/model/FieldType;", "fieldType", "<init>", "(Lzendesk/conversationkit/android/model/FieldType;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILzendesk/conversationkit/android/model/FieldType;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lzendesk/conversationkit/android/model/Field;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lzendesk/conversationkit/android/model/FieldType;", "getFieldType", "()Lzendesk/conversationkit/android/model/FieldType;", "", "getId", "()Ljava/lang/String;", "id", "getName", "name", "getLabel", AnnotatedPrivateKey.LABEL, "getPlaceholder", "placeholder", "Companion", "Text", "Email", "Select", "Lzendesk/conversationkit/android/model/Field$Email;", "Lzendesk/conversationkit/android/model/Field$Select;", "Lzendesk/conversationkit/android/model/Field$Text;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class Field {

    @NotNull
    private static final j $cachedSerializer$delegate;

    @NotNull
    private static final j[] $childSerializers;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String SYSTEM_FIELD_NAME = "dataCapture.systemField.requester.name";

    @NotNull
    private final FieldType fieldType;

    static {
        m mVar = m.PUBLICATION;
        $childSerializers = new j[]{l.a(mVar, new a(3))};
        $cachedSerializer$delegate = l.a(mVar, new a(4));
    }

    public /* synthetic */ Field(int i11, FieldType fieldType, m1 m1Var) {
        this.fieldType = fieldType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return FieldType.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_$0() {
        return new f("zendesk.conversationkit.android.model.Field", Reflection.getOrCreateKotlinClass(Field.class), new KClass[]{Reflection.getOrCreateKotlinClass(Email.class), Reflection.getOrCreateKotlinClass(Select.class), Reflection.getOrCreateKotlinClass(Text.class)}, new KSerializer[]{Field$Email$$serializer.INSTANCE, Field$Select$$serializer.INSTANCE, Field$Text$$serializer.INSTANCE}, new Annotation[0]);
    }

    public static final /* synthetic */ void write$Self(Field self, b output, SerialDescriptor serialDesc) {
        output.i(serialDesc, 0, (KSerializer) $childSerializers[0].getValue(), self.fieldType);
    }

    @NotNull
    public final FieldType getFieldType() {
        return this.fieldType;
    }

    @NotNull
    public abstract String getId();

    @NotNull
    public abstract String getLabel();

    @NotNull
    public abstract String getName();

    @NotNull
    public abstract String getPlaceholder();

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000210B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tBW\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\b\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001bJB\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001bJ\u0010\u0010#\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b,\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b-\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b.\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b/\u0010\u001b¨\u00062"}, d2 = {"Lzendesk/conversationkit/android/model/Field$Email;", "Lzendesk/conversationkit/android/model/Field;", "", "id", "name", AnnotatedPrivateKey.LABEL, "placeholder", "email", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lzendesk/conversationkit/android/model/FieldType;", "fieldType", "Lm90/m1;", "serializationConstructorMarker", "(ILzendesk/conversationkit/android/model/FieldType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$zendesk_conversationkit_conversationkit_android", "(Lzendesk/conversationkit/android/model/Field$Email;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lzendesk/conversationkit/android/model/Field$Email;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getName", "getLabel", "getPlaceholder", "getEmail", "Companion", "$serializer", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @h
    @g("email")
    public static final /* data */ class Email extends Field {

        @NotNull
        private final String email;

        @NotNull
        private final String id;

        @NotNull
        private final String label;

        @NotNull
        private final String name;

        @NotNull
        private final String placeholder;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private static final j[] $childSerializers = {l.a(m.PUBLICATION, new a(5)), null, null, null, null, null};

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Email(int i11, FieldType fieldType, String str, String str2, String str3, String str4, String str5, m1 m1Var) {
            super(i11, fieldType, m1Var);
            if (63 != (i11 & 63)) {
                c1.j(i11, 63, Field$Email$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.id = str;
            this.name = str2;
            this.label = str3;
            this.placeholder = str4;
            this.email = str5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return FieldType.INSTANCE.serializer();
        }

        public static /* synthetic */ Email copy$default(Email email, String str, String str2, String str3, String str4, String str5, int i11, Object obj) {
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
                str4 = email.placeholder;
            }
            if ((i11 & 16) != 0) {
                str5 = email.email;
            }
            String str6 = str5;
            String str7 = str3;
            return email.copy(str, str2, str7, str4, str6);
        }

        public static final /* synthetic */ void write$Self$zendesk_conversationkit_conversationkit_android(Email self, b output, SerialDescriptor serialDesc) {
            Field.write$Self(self, output, serialDesc);
            output.q(serialDesc, 1, self.getId());
            output.q(serialDesc, 2, self.getName());
            output.q(serialDesc, 3, self.getLabel());
            output.q(serialDesc, 4, self.getPlaceholder());
            output.q(serialDesc, 5, self.email);
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
        public final String getPlaceholder() {
            return this.placeholder;
        }

        @NotNull
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getEmail() {
            return this.email;
        }

        @NotNull
        public final Email copy(@NotNull String id2, @NotNull String name, @NotNull String label, @NotNull String placeholder, @NotNull String email) {
            id2.getClass();
            name.getClass();
            label.getClass();
            placeholder.getClass();
            email.getClass();
            return new Email(id2, name, label, placeholder, email);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Email)) {
                return false;
            }
            Email email = (Email) other;
            return Intrinsics.areEqual(this.id, email.id) && Intrinsics.areEqual(this.name, email.name) && Intrinsics.areEqual(this.label, email.label) && Intrinsics.areEqual(this.placeholder, email.placeholder) && Intrinsics.areEqual(this.email, email.email);
        }

        @NotNull
        public final String getEmail() {
            return this.email;
        }

        @Override // zendesk.conversationkit.android.model.Field
        @NotNull
        public String getId() {
            return this.id;
        }

        @Override // zendesk.conversationkit.android.model.Field
        @NotNull
        public String getLabel() {
            return this.label;
        }

        @Override // zendesk.conversationkit.android.model.Field
        @NotNull
        public String getName() {
            return this.name;
        }

        @Override // zendesk.conversationkit.android.model.Field
        @NotNull
        public String getPlaceholder() {
            return this.placeholder;
        }

        public int hashCode() {
            return this.email.hashCode() + l1.b(l1.b(l1.b(this.id.hashCode() * 31, 31, this.name), 31, this.label), 31, this.placeholder);
        }

        @NotNull
        public String toString() {
            String str = this.id;
            String str2 = this.name;
            String str3 = this.label;
            String str4 = this.placeholder;
            String str5 = this.email;
            StringBuilder sbT = e0.f.t("Email(id=", str, ", name=", str2, ", label=");
            s.A(sbT, str3, ", placeholder=", str4, ", email=");
            return k.p(sbT, str5, ")");
        }

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/conversationkit/android/model/Field$Email$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/conversationkit/android/model/Field$Email;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return Field$Email$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Email(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
            super(FieldType.EMAIL, null);
            i.B(str, str2, str3, str4, str5);
            this.id = str;
            this.name = str2;
            this.label = str3;
            this.placeholder = str4;
            this.email = str5;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 ;2\u00020\u0001:\u0002;<BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\r\u0010\u000eBu\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\r\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001fJ\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001fJ\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0016\u0010'\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b'\u0010$Jb\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010\u001fJ\u0010\u0010+\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b+\u0010&J\u001a\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b/\u00100R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u0010\u001fR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u00101\u001a\u0004\b3\u0010\u001fR\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u00101\u001a\u0004\b4\u0010\u001fR\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u00101\u001a\u0004\b5\u0010\u001fR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u00106\u001a\u0004\b7\u0010$R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00108\u001a\u0004\b9\u0010&R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\f\u00106\u001a\u0004\b:\u0010$¨\u0006="}, d2 = {"Lzendesk/conversationkit/android/model/Field$Select;", "Lzendesk/conversationkit/android/model/Field;", "", "id", "name", AnnotatedPrivateKey.LABEL, "placeholder", "", "Lzendesk/conversationkit/android/model/FieldOption;", "options", "", "selectSize", "select", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/util/List;)V", "seen0", "Lzendesk/conversationkit/android/model/FieldType;", "fieldType", "Lm90/m1;", "serializationConstructorMarker", "(ILzendesk/conversationkit/android/model/FieldType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/util/List;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$zendesk_conversationkit_conversationkit_android", "(Lzendesk/conversationkit/android/model/Field$Select;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Ljava/util/List;", "component6", "()I", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/util/List;)Lzendesk/conversationkit/android/model/Field$Select;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getName", "getLabel", "getPlaceholder", "Ljava/util/List;", "getOptions", "I", "getSelectSize", "getSelect", "Companion", "$serializer", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @h
    @g("select")
    public static final /* data */ class Select extends Field {

        @NotNull
        private static final j[] $childSerializers;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        public static final int DEFAULT_SELECT_SIZE = 1;

        @NotNull
        private final String id;

        @NotNull
        private final String label;

        @NotNull
        private final String name;

        @NotNull
        private final List<FieldOption> options;

        @NotNull
        private final String placeholder;

        @NotNull
        private final List<FieldOption> select;
        private final int selectSize;

        static {
            m mVar = m.PUBLICATION;
            $childSerializers = new j[]{l.a(mVar, new a(6)), null, null, null, null, l.a(mVar, new a(7)), null, l.a(mVar, new a(8))};
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Select(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull List<FieldOption> list, int i11, @NotNull List<FieldOption> list2) {
            super(FieldType.SELECT, null);
            str.getClass();
            str2.getClass();
            str3.getClass();
            str4.getClass();
            list.getClass();
            list2.getClass();
            this.id = str;
            this.name = str2;
            this.label = str3;
            this.placeholder = str4;
            this.options = list;
            this.selectSize = i11;
            this.select = list2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return FieldType.INSTANCE.serializer();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
            return new d(FieldOption$$serializer.INSTANCE, 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
            return new d(FieldOption$$serializer.INSTANCE, 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Select copy$default(Select select, String str, String str2, String str3, String str4, List list, int i11, List list2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = select.id;
            }
            if ((i12 & 2) != 0) {
                str2 = select.name;
            }
            if ((i12 & 4) != 0) {
                str3 = select.label;
            }
            if ((i12 & 8) != 0) {
                str4 = select.placeholder;
            }
            if ((i12 & 16) != 0) {
                list = select.options;
            }
            if ((i12 & 32) != 0) {
                i11 = select.selectSize;
            }
            if ((i12 & 64) != 0) {
                list2 = select.select;
            }
            int i13 = i11;
            List list3 = list2;
            List list4 = list;
            String str5 = str3;
            return select.copy(str, str2, str5, str4, list4, i13, list3);
        }

        public static final /* synthetic */ void write$Self$zendesk_conversationkit_conversationkit_android(Select self, b output, SerialDescriptor serialDesc) {
            Field.write$Self(self, output, serialDesc);
            j[] jVarArr = $childSerializers;
            output.q(serialDesc, 1, self.getId());
            output.q(serialDesc, 2, self.getName());
            output.q(serialDesc, 3, self.getLabel());
            output.q(serialDesc, 4, self.getPlaceholder());
            output.i(serialDesc, 5, (KSerializer) jVarArr[5].getValue(), self.options);
            output.m(6, self.selectSize, serialDesc);
            output.i(serialDesc, 7, (KSerializer) jVarArr[7].getValue(), self.select);
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
        public final String getPlaceholder() {
            return this.placeholder;
        }

        @NotNull
        public final List<FieldOption> component5() {
            return this.options;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final int getSelectSize() {
            return this.selectSize;
        }

        @NotNull
        public final List<FieldOption> component7() {
            return this.select;
        }

        @NotNull
        public final Select copy(@NotNull String id2, @NotNull String name, @NotNull String label, @NotNull String placeholder, @NotNull List<FieldOption> options, int selectSize, @NotNull List<FieldOption> select) {
            id2.getClass();
            name.getClass();
            label.getClass();
            placeholder.getClass();
            options.getClass();
            select.getClass();
            return new Select(id2, name, label, placeholder, options, selectSize, select);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Select)) {
                return false;
            }
            Select select = (Select) other;
            return Intrinsics.areEqual(this.id, select.id) && Intrinsics.areEqual(this.name, select.name) && Intrinsics.areEqual(this.label, select.label) && Intrinsics.areEqual(this.placeholder, select.placeholder) && Intrinsics.areEqual(this.options, select.options) && this.selectSize == select.selectSize && Intrinsics.areEqual(this.select, select.select);
        }

        @Override // zendesk.conversationkit.android.model.Field
        @NotNull
        public String getId() {
            return this.id;
        }

        @Override // zendesk.conversationkit.android.model.Field
        @NotNull
        public String getLabel() {
            return this.label;
        }

        @Override // zendesk.conversationkit.android.model.Field
        @NotNull
        public String getName() {
            return this.name;
        }

        @NotNull
        public final List<FieldOption> getOptions() {
            return this.options;
        }

        @Override // zendesk.conversationkit.android.model.Field
        @NotNull
        public String getPlaceholder() {
            return this.placeholder;
        }

        @NotNull
        public final List<FieldOption> getSelect() {
            return this.select;
        }

        public final int getSelectSize() {
            return this.selectSize;
        }

        public int hashCode() {
            return this.select.hashCode() + k.b(this.selectSize, e0.f.c(this.options, l1.b(l1.b(l1.b(this.id.hashCode() * 31, 31, this.name), 31, this.label), 31, this.placeholder), 31), 31);
        }

        @NotNull
        public String toString() {
            String str = this.id;
            String str2 = this.name;
            String str3 = this.label;
            String str4 = this.placeholder;
            List<FieldOption> list = this.options;
            int i11 = this.selectSize;
            List<FieldOption> list2 = this.select;
            StringBuilder sbT = e0.f.t("Select(id=", str, ", name=", str2, ", label=");
            s.A(sbT, str3, ", placeholder=", str4, ", options=");
            sbT.append(list);
            sbT.append(", selectSize=");
            sbT.append(i11);
            sbT.append(", select=");
            return e0.f.p(sbT, list2, ")");
        }

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lzendesk/conversationkit/android/model/Field$Select$Companion;", "", "<init>", "()V", "DEFAULT_SELECT_SIZE", "", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/conversationkit/android/model/Field$Select;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer serializer() {
                return Field$Select$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Select(int i11, FieldType fieldType, String str, String str2, String str3, String str4, List list, int i12, List list2, m1 m1Var) {
            super(i11, fieldType, m1Var);
            if (255 != (i11 & 255)) {
                c1.j(i11, 255, Field$Select$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.id = str;
            this.name = str2;
            this.label = str3;
            this.placeholder = str4;
            this.options = list;
            this.selectSize = i12;
            this.select = list2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000278B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fBg\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u000b\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001dJ\u0010\u0010!\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001dJV\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u001dJ\u0010\u0010(\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b(\u0010\"J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b,\u0010-R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u001dR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010.\u001a\u0004\b0\u0010\u001dR\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b1\u0010\u001dR\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b2\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b4\u0010\"R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b5\u0010\"R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010.\u001a\u0004\b6\u0010\u001d¨\u00069"}, d2 = {"Lzendesk/conversationkit/android/model/Field$Text;", "Lzendesk/conversationkit/android/model/Field;", "", "id", "name", AnnotatedPrivateKey.LABEL, "placeholder", "", "minSize", "maxSize", TextBundle.TEXT_ENTRY, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;)V", "seen0", "Lzendesk/conversationkit/android/model/FieldType;", "fieldType", "Lm90/m1;", "serializationConstructorMarker", "(ILzendesk/conversationkit/android/model/FieldType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$zendesk_conversationkit_conversationkit_android", "(Lzendesk/conversationkit/android/model/Field$Text;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()I", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;)Lzendesk/conversationkit/android/model/Field$Text;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getName", "getLabel", "getPlaceholder", "I", "getMinSize", "getMaxSize", "getText", "Companion", "$serializer", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @h
    @g(TextBundle.TEXT_ENTRY)
    public static final /* data */ class Text extends Field {
        public static final int DEFAULT_MAX_SIZE = 128;
        public static final int DEFAULT_MIN_SIZE = 1;

        @NotNull
        private final String id;

        @NotNull
        private final String label;
        private final int maxSize;
        private final int minSize;

        @NotNull
        private final String name;

        @NotNull
        private final String placeholder;

        @NotNull
        private final String text;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private static final j[] $childSerializers = {l.a(m.PUBLICATION, new a(9)), null, null, null, null, null, null, null};

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Text(int i11, FieldType fieldType, String str, String str2, String str3, String str4, int i12, int i13, String str5, m1 m1Var) {
            super(i11, fieldType, m1Var);
            if (255 != (i11 & 255)) {
                c1.j(i11, 255, Field$Text$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.id = str;
            this.name = str2;
            this.label = str3;
            this.placeholder = str4;
            this.minSize = i12;
            this.maxSize = i13;
            this.text = str5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return FieldType.INSTANCE.serializer();
        }

        public static /* synthetic */ Text copy$default(Text text, String str, String str2, String str3, String str4, int i11, int i12, String str5, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = text.id;
            }
            if ((i13 & 2) != 0) {
                str2 = text.name;
            }
            if ((i13 & 4) != 0) {
                str3 = text.label;
            }
            if ((i13 & 8) != 0) {
                str4 = text.placeholder;
            }
            if ((i13 & 16) != 0) {
                i11 = text.minSize;
            }
            if ((i13 & 32) != 0) {
                i12 = text.maxSize;
            }
            if ((i13 & 64) != 0) {
                str5 = text.text;
            }
            int i14 = i12;
            String str6 = str5;
            int i15 = i11;
            String str7 = str3;
            return text.copy(str, str2, str7, str4, i15, i14, str6);
        }

        public static final /* synthetic */ void write$Self$zendesk_conversationkit_conversationkit_android(Text self, b output, SerialDescriptor serialDesc) {
            Field.write$Self(self, output, serialDesc);
            output.q(serialDesc, 1, self.getId());
            output.q(serialDesc, 2, self.getName());
            output.q(serialDesc, 3, self.getLabel());
            output.q(serialDesc, 4, self.getPlaceholder());
            output.m(5, self.minSize, serialDesc);
            output.m(6, self.maxSize, serialDesc);
            output.q(serialDesc, 7, self.text);
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
        public final String getPlaceholder() {
            return this.placeholder;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final int getMinSize() {
            return this.minSize;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final int getMaxSize() {
            return this.maxSize;
        }

        @NotNull
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @NotNull
        public final Text copy(@NotNull String id2, @NotNull String name, @NotNull String label, @NotNull String placeholder, int minSize, int maxSize, @NotNull String text) {
            id2.getClass();
            name.getClass();
            label.getClass();
            placeholder.getClass();
            text.getClass();
            return new Text(id2, name, label, placeholder, minSize, maxSize, text);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Text)) {
                return false;
            }
            Text text = (Text) other;
            return Intrinsics.areEqual(this.id, text.id) && Intrinsics.areEqual(this.name, text.name) && Intrinsics.areEqual(this.label, text.label) && Intrinsics.areEqual(this.placeholder, text.placeholder) && this.minSize == text.minSize && this.maxSize == text.maxSize && Intrinsics.areEqual(this.text, text.text);
        }

        @Override // zendesk.conversationkit.android.model.Field
        @NotNull
        public String getId() {
            return this.id;
        }

        @Override // zendesk.conversationkit.android.model.Field
        @NotNull
        public String getLabel() {
            return this.label;
        }

        public final int getMaxSize() {
            return this.maxSize;
        }

        public final int getMinSize() {
            return this.minSize;
        }

        @Override // zendesk.conversationkit.android.model.Field
        @NotNull
        public String getName() {
            return this.name;
        }

        @Override // zendesk.conversationkit.android.model.Field
        @NotNull
        public String getPlaceholder() {
            return this.placeholder;
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            return this.text.hashCode() + k.b(this.maxSize, k.b(this.minSize, l1.b(l1.b(l1.b(this.id.hashCode() * 31, 31, this.name), 31, this.label), 31, this.placeholder), 31), 31);
        }

        @NotNull
        public String toString() {
            String str = this.id;
            String str2 = this.name;
            String str3 = this.label;
            String str4 = this.placeholder;
            int i11 = this.minSize;
            int i12 = this.maxSize;
            String str5 = this.text;
            StringBuilder sbT = e0.f.t("Text(id=", str, ", name=", str2, ", label=");
            s.A(sbT, str3, ", placeholder=", str4, ", minSize=");
            e0.f.C(sbT, i11, ", maxSize=", i12, ", text=");
            return k.p(sbT, str5, ")");
        }

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lzendesk/conversationkit/android/model/Field$Text$Companion;", "", "<init>", "()V", "DEFAULT_MIN_SIZE", "", "DEFAULT_MAX_SIZE", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/conversationkit/android/model/Field$Text;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer serializer() {
                return Field$Text$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Text(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, int i11, int i12, @NotNull String str5) {
            super(FieldType.TEXT, null);
            i.B(str, str2, str3, str4, str5);
            this.id = str;
            this.name = str2;
            this.label = str3;
            this.placeholder = str4;
            this.minSize = i11;
            this.maxSize = i12;
            this.text = str5;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lzendesk/conversationkit/android/model/Field$Companion;", "", "<init>", "()V", "SYSTEM_FIELD_NAME", "", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/conversationkit/android/model/Field;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) Field.$cachedSerializer$delegate.getValue();
        }

        @NotNull
        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        private Companion() {
        }
    }

    public /* synthetic */ Field(FieldType fieldType, DefaultConstructorMarker defaultConstructorMarker) {
        this(fieldType);
    }

    private Field(FieldType fieldType) {
        this.fieldType = fieldType;
    }
}
