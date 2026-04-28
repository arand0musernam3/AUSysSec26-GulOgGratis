package zendesk.conversationkit.android.internal.rest.model;

import bb0.a;
import i90.f;
import i90.g;
import i90.h;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
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

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@h
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010$\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000  2\u00020\u0001:\u0003!\" B\u0013\b\u0004\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0013\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0015R\"\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001a8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0015\u0082\u0001\u0002#$¨\u0006%"}, d2 = {"Lzendesk/conversationkit/android/internal/rest/model/SendMessageDto;", "", "", "sendMessageType", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lzendesk/conversationkit/android/internal/rest/model/SendMessageDto;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getSendMessageType", "()Ljava/lang/String;", "getSendMessageType$annotations", "()V", "getRole", "role", "", "getMetadata", "()Ljava/util/Map;", "metadata", "getPayload", "payload", "Companion", "Text", "FormResponse", "Lzendesk/conversationkit/android/internal/rest/model/SendMessageDto$FormResponse;", "Lzendesk/conversationkit/android/internal/rest/model/SendMessageDto$Text;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class SendMessageDto {

    @NotNull
    private final String sendMessageType;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final j $cachedSerializer$delegate = l.a(m.PUBLICATION, new a(23));

    public /* synthetic */ SendMessageDto(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return new f("zendesk.conversationkit.android.internal.rest.model.SendMessageDto", Reflection.getOrCreateKotlinClass(SendMessageDto.class), new KClass[]{Reflection.getOrCreateKotlinClass(FormResponse.class), Reflection.getOrCreateKotlinClass(Text.class)}, new KSerializer[]{SendMessageDto$FormResponse$$serializer.INSTANCE, SendMessageDto$Text$$serializer.INSTANCE}, new Annotation[0]);
    }

    @Nullable
    public abstract Map<String, Object> getMetadata();

    @Nullable
    public abstract String getPayload();

    @NotNull
    public abstract String getRole();

    @NotNull
    public final String getSendMessageType() {
        return this.sendMessageType;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\r\b\u0081\b\u0018\u0000 52\u00020\u0001:\u000265BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rB_\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u001e\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001dJ\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001dJX\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\u000b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u001dJ\u0010\u0010'\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b+\u0010,R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001dR(\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b0\u0010\u001fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b1\u0010\u001dR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u00102\u001a\u0004\b3\u0010\"R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010-\u001a\u0004\b4\u0010\u001d¨\u00067"}, d2 = {"Lzendesk/conversationkit/android/internal/rest/model/SendMessageDto$FormResponse;", "Lzendesk/conversationkit/android/internal/rest/model/SendMessageDto;", "", "role", "", "", "metadata", "payload", "", "Lzendesk/conversationkit/android/internal/rest/model/SendFieldResponseDto;", "fields", "quotedMessageId", "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$zendesk_conversationkit_conversationkit_android", "(Lzendesk/conversationkit/android/internal/rest/model/SendMessageDto$FormResponse;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/Map;", "component3", "component4", "()Ljava/util/List;", "component5", "copy", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Lzendesk/conversationkit/android/internal/rest/model/SendMessageDto$FormResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getRole", "Ljava/util/Map;", "getMetadata", "getPayload", "Ljava/util/List;", "getFields", "getQuotedMessageId", "Companion", "$serializer", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @h
    @g("formResponse")
    public static final /* data */ class FormResponse extends SendMessageDto {

        @NotNull
        private static final j[] $childSerializers;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final List<SendFieldResponseDto> fields;

        @Nullable
        private final Map<String, Object> metadata;

        @Nullable
        private final String payload;

        @NotNull
        private final String quotedMessageId;

        @NotNull
        private final String role;

        static {
            m mVar = m.PUBLICATION;
            $childSerializers = new j[]{null, l.a(mVar, new a(24)), null, l.a(mVar, new a(25)), null};
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ FormResponse(int i11, String str, Map map, String str2, List list, String str3, m1 m1Var) {
            super(i11, m1Var);
            if (25 != (i11 & 25)) {
                c1.j(i11, 25, SendMessageDto$FormResponse$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.role = str;
            if ((i11 & 2) == 0) {
                this.metadata = null;
            } else {
                this.metadata = map;
            }
            if ((i11 & 4) == 0) {
                this.payload = null;
            } else {
                this.payload = str2;
            }
            this.fields = list;
            this.quotedMessageId = str3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new f0(r1.f29848a, new i90.a(Reflection.getOrCreateKotlinClass(Object.class), new KSerializer[0]), 1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
            return new d(SendFieldResponseDto.INSTANCE.serializer(), 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ FormResponse copy$default(FormResponse formResponse, String str, Map map, String str2, List list, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = formResponse.role;
            }
            if ((i11 & 2) != 0) {
                map = formResponse.metadata;
            }
            if ((i11 & 4) != 0) {
                str2 = formResponse.payload;
            }
            if ((i11 & 8) != 0) {
                list = formResponse.fields;
            }
            if ((i11 & 16) != 0) {
                str3 = formResponse.quotedMessageId;
            }
            String str4 = str3;
            String str5 = str2;
            return formResponse.copy(str, map, str5, list, str4);
        }

        public static final /* synthetic */ void write$Self$zendesk_conversationkit_conversationkit_android(FormResponse self, b output, SerialDescriptor serialDesc) {
            SendMessageDto.write$Self(self, output, serialDesc);
            j[] jVarArr = $childSerializers;
            output.q(serialDesc, 0, self.getRole());
            if (output.C(serialDesc) || self.getMetadata() != null) {
                output.r(serialDesc, 1, (KSerializer) jVarArr[1].getValue(), self.getMetadata());
            }
            if (output.C(serialDesc) || self.getPayload() != null) {
                output.r(serialDesc, 2, r1.f29848a, self.getPayload());
            }
            output.i(serialDesc, 3, (KSerializer) jVarArr[3].getValue(), self.fields);
            output.q(serialDesc, 4, self.quotedMessageId);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getRole() {
            return this.role;
        }

        @Nullable
        public final Map<String, Object> component2() {
            return this.metadata;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getPayload() {
            return this.payload;
        }

        @NotNull
        public final List<SendFieldResponseDto> component4() {
            return this.fields;
        }

        @NotNull
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getQuotedMessageId() {
            return this.quotedMessageId;
        }

        @NotNull
        public final FormResponse copy(@NotNull String role, @Nullable Map<String, ? extends Object> metadata, @Nullable String payload, @NotNull List<? extends SendFieldResponseDto> fields, @NotNull String quotedMessageId) {
            role.getClass();
            fields.getClass();
            quotedMessageId.getClass();
            return new FormResponse(role, metadata, payload, fields, quotedMessageId);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FormResponse)) {
                return false;
            }
            FormResponse formResponse = (FormResponse) other;
            return Intrinsics.areEqual(this.role, formResponse.role) && Intrinsics.areEqual(this.metadata, formResponse.metadata) && Intrinsics.areEqual(this.payload, formResponse.payload) && Intrinsics.areEqual(this.fields, formResponse.fields) && Intrinsics.areEqual(this.quotedMessageId, formResponse.quotedMessageId);
        }

        @NotNull
        public final List<SendFieldResponseDto> getFields() {
            return this.fields;
        }

        @Override // zendesk.conversationkit.android.internal.rest.model.SendMessageDto
        @Nullable
        public Map<String, Object> getMetadata() {
            return this.metadata;
        }

        @Override // zendesk.conversationkit.android.internal.rest.model.SendMessageDto
        @Nullable
        public String getPayload() {
            return this.payload;
        }

        @NotNull
        public final String getQuotedMessageId() {
            return this.quotedMessageId;
        }

        @Override // zendesk.conversationkit.android.internal.rest.model.SendMessageDto
        @NotNull
        public String getRole() {
            return this.role;
        }

        public int hashCode() {
            int iHashCode = this.role.hashCode() * 31;
            Map<String, Object> map = this.metadata;
            int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
            String str = this.payload;
            return this.quotedMessageId.hashCode() + e0.f.c(this.fields, (iHashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31);
        }

        @NotNull
        public String toString() {
            String str = this.role;
            Map<String, Object> map = this.metadata;
            String str2 = this.payload;
            List<SendFieldResponseDto> list = this.fields;
            String str3 = this.quotedMessageId;
            StringBuilder sb2 = new StringBuilder("FormResponse(role=");
            sb2.append(str);
            sb2.append(", metadata=");
            sb2.append(map);
            sb2.append(", payload=");
            sb2.append(str2);
            sb2.append(", fields=");
            sb2.append(list);
            sb2.append(", quotedMessageId=");
            return k.p(sb2, str3, ")");
        }

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/conversationkit/android/internal/rest/model/SendMessageDto$FormResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/conversationkit/android/internal/rest/model/SendMessageDto$FormResponse;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return SendMessageDto$FormResponse$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ FormResponse(String str, Map map, String str2, List list, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            String str4;
            List list2;
            String str5;
            map = (i11 & 2) != 0 ? null : map;
            if ((i11 & 4) != 0) {
                str4 = str3;
                list2 = list;
                str5 = null;
            } else {
                str4 = str3;
                list2 = list;
                str5 = str2;
            }
            this(str, map, str5, list2, str4);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public FormResponse(@NotNull String str, @Nullable Map<String, ? extends Object> map, @Nullable String str2, @NotNull List<? extends SendFieldResponseDto> list, @NotNull String str3) {
            super("formResponse", (DefaultConstructorMarker) null);
            str.getClass();
            list.getClass();
            str3.getClass();
            this.role = str;
            this.metadata = map;
            this.payload = str2;
            this.fields = list;
            this.quotedMessageId = str3;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u0000 .2\u00020\u0001:\u0002/.B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nBO\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u001e\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJH\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u001aJ\u0010\u0010\"\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b&\u0010'R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u001aR(\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010\u001cR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b,\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b-\u0010\u001a¨\u00060"}, d2 = {"Lzendesk/conversationkit/android/internal/rest/model/SendMessageDto$Text;", "Lzendesk/conversationkit/android/internal/rest/model/SendMessageDto;", "", "role", "", "", "metadata", "payload", TextBundle.TEXT_ENTRY, "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$zendesk_conversationkit_conversationkit_android", "(Lzendesk/conversationkit/android/internal/rest/model/SendMessageDto$Text;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/Map;", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)Lzendesk/conversationkit/android/internal/rest/model/SendMessageDto$Text;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getRole", "Ljava/util/Map;", "getMetadata", "getPayload", "getText", "Companion", "$serializer", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @h
    @g(TextBundle.TEXT_ENTRY)
    public static final /* data */ class Text extends SendMessageDto {

        @Nullable
        private final Map<String, Object> metadata;

        @Nullable
        private final String payload;

        @NotNull
        private final String role;

        @NotNull
        private final String text;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private static final j[] $childSerializers = {null, l.a(m.PUBLICATION, new a(26)), null, null};

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Text(int i11, String str, Map map, String str2, String str3, m1 m1Var) {
            super(i11, m1Var);
            if (9 != (i11 & 9)) {
                c1.j(i11, 9, SendMessageDto$Text$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.role = str;
            if ((i11 & 2) == 0) {
                this.metadata = null;
            } else {
                this.metadata = map;
            }
            if ((i11 & 4) == 0) {
                this.payload = null;
            } else {
                this.payload = str2;
            }
            this.text = str3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new f0(r1.f29848a, new i90.a(Reflection.getOrCreateKotlinClass(Object.class), new KSerializer[0]), 1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Text copy$default(Text text, String str, Map map, String str2, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = text.role;
            }
            if ((i11 & 2) != 0) {
                map = text.metadata;
            }
            if ((i11 & 4) != 0) {
                str2 = text.payload;
            }
            if ((i11 & 8) != 0) {
                str3 = text.text;
            }
            return text.copy(str, map, str2, str3);
        }

        public static final /* synthetic */ void write$Self$zendesk_conversationkit_conversationkit_android(Text self, b output, SerialDescriptor serialDesc) {
            SendMessageDto.write$Self(self, output, serialDesc);
            j[] jVarArr = $childSerializers;
            output.q(serialDesc, 0, self.getRole());
            if (output.C(serialDesc) || self.getMetadata() != null) {
                output.r(serialDesc, 1, (KSerializer) jVarArr[1].getValue(), self.getMetadata());
            }
            if (output.C(serialDesc) || self.getPayload() != null) {
                output.r(serialDesc, 2, r1.f29848a, self.getPayload());
            }
            output.q(serialDesc, 3, self.text);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getRole() {
            return this.role;
        }

        @Nullable
        public final Map<String, Object> component2() {
            return this.metadata;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getPayload() {
            return this.payload;
        }

        @NotNull
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @NotNull
        public final Text copy(@NotNull String role, @Nullable Map<String, ? extends Object> metadata, @Nullable String payload, @NotNull String text) {
            role.getClass();
            text.getClass();
            return new Text(role, metadata, payload, text);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Text)) {
                return false;
            }
            Text text = (Text) other;
            return Intrinsics.areEqual(this.role, text.role) && Intrinsics.areEqual(this.metadata, text.metadata) && Intrinsics.areEqual(this.payload, text.payload) && Intrinsics.areEqual(this.text, text.text);
        }

        @Override // zendesk.conversationkit.android.internal.rest.model.SendMessageDto
        @Nullable
        public Map<String, Object> getMetadata() {
            return this.metadata;
        }

        @Override // zendesk.conversationkit.android.internal.rest.model.SendMessageDto
        @Nullable
        public String getPayload() {
            return this.payload;
        }

        @Override // zendesk.conversationkit.android.internal.rest.model.SendMessageDto
        @NotNull
        public String getRole() {
            return this.role;
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            int iHashCode = this.role.hashCode() * 31;
            Map<String, Object> map = this.metadata;
            int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
            String str = this.payload;
            return this.text.hashCode() + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31);
        }

        @NotNull
        public String toString() {
            String str = this.role;
            Map<String, Object> map = this.metadata;
            String str2 = this.payload;
            String str3 = this.text;
            StringBuilder sb2 = new StringBuilder("Text(role=");
            sb2.append(str);
            sb2.append(", metadata=");
            sb2.append(map);
            sb2.append(", payload=");
            return e0.f.o(sb2, str2, ", text=", str3, ")");
        }

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/conversationkit/android/internal/rest/model/SendMessageDto$Text$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/conversationkit/android/internal/rest/model/SendMessageDto$Text;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return SendMessageDto$Text$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ Text(String str, Map map, String str2, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i11 & 2) != 0 ? null : map, (i11 & 4) != 0 ? null : str2, str3);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Text(@NotNull String str, @Nullable Map<String, ? extends Object> map, @Nullable String str2, @NotNull String str3) {
            super(TextBundle.TEXT_ENTRY, (DefaultConstructorMarker) null);
            str.getClass();
            str3.getClass();
            this.role = str;
            this.metadata = map;
            this.payload = str2;
            this.text = str3;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/conversationkit/android/internal/rest/model/SendMessageDto$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/conversationkit/android/internal/rest/model/SendMessageDto;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) SendMessageDto.$cachedSerializer$delegate.getValue();
        }

        @NotNull
        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ SendMessageDto(int i11, m1 m1Var) {
        this.sendMessageType = "";
    }

    private SendMessageDto(String str) {
        this.sendMessageType = str;
    }

    public static /* synthetic */ void getSendMessageType$annotations() {
    }

    public /* synthetic */ SendMessageDto(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public static final /* synthetic */ void write$Self(SendMessageDto self, b output, SerialDescriptor serialDesc) {
    }
}
