package zendesk.conversationkit.android.internal.rest.model;

import b3.i;
import bb0.a;
import e0.f;
import i90.g;
import i90.h;
import j4.s;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.c1;
import m90.d;
import m90.f0;
import m90.l0;
import m90.m1;
import m90.r1;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.j;
import u70.l;
import u70.m;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@h
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0019\b\u0081\b\u0018\u0000 P2\u00020\u0001:\u0002QPB\u0099\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0014\u0010\u0015Bµ\u0001\b\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0014\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u001e\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001bJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001bJ\u0012\u0010#\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b%\u0010$J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u001bJ\u0018\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0018\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b)\u0010(J\u0012\u0010*\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b*\u0010$J¼\u0001\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b-\u0010\u001bJ\u0010\u0010.\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b.\u0010/J\u001a\u00102\u001a\u0002012\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b2\u00103J'\u0010<\u001a\u0002092\u0006\u00104\u001a\u00020\u00002\u0006\u00106\u001a\u0002052\u0006\u00108\u001a\u000207H\u0001¢\u0006\u0004\b:\u0010;R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010=\u0012\u0004\b?\u0010@\u001a\u0004\b>\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010=\u001a\u0004\bA\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010=\u001a\u0004\bB\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010=\u001a\u0004\bC\u0010\u001bR%\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010D\u001a\u0004\bE\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010=\u001a\u0004\bF\u0010\u001bR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010=\u001a\u0004\bG\u0010\u001bR\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010H\u001a\u0004\bI\u0010$R\u0019\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010H\u001a\u0004\bJ\u0010$R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010=\u001a\u0004\bK\u0010\u001bR\u001f\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010L\u001a\u0004\bM\u0010(R\u001f\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0012\u0010L\u001a\u0004\bN\u0010(R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u0013\u0010H\u001a\u0004\bO\u0010$¨\u0006R"}, d2 = {"Lzendesk/conversationkit/android/internal/rest/model/MessageFieldDto;", "", "", "id", "name", AnnotatedPrivateKey.LABEL, "type", "", "metadata", "placeholder", TextBundle.TEXT_ENTRY, "", "minSize", "maxSize", "email", "", "Lzendesk/conversationkit/android/internal/rest/model/MessageFieldOptionDto;", "options", "select", "selectSize", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;)V", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Lm90/m1;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Ljava/util/Map;", "component6", "component7", "component8", "()Ljava/lang/Integer;", "component9", "component10", "component11", "()Ljava/util/List;", "component12", "component13", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;)Lzendesk/conversationkit/android/internal/rest/model/MessageFieldDto;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$zendesk_conversationkit_conversationkit_android", "(Lzendesk/conversationkit/android/internal/rest/model/MessageFieldDto;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "getName", "getLabel", "getType", "Ljava/util/Map;", "getMetadata", "getPlaceholder", "getText", "Ljava/lang/Integer;", "getMinSize", "getMaxSize", "getEmail", "Ljava/util/List;", "getOptions", "getSelect", "getSelectSize", "Companion", "$serializer", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class MessageFieldDto {

    @NotNull
    private static final j[] $childSerializers;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final String email;

    @NotNull
    private final String id;

    @NotNull
    private final String label;

    @Nullable
    private final Integer maxSize;

    @Nullable
    private final Map<String, Object> metadata;

    @Nullable
    private final Integer minSize;

    @NotNull
    private final String name;

    @Nullable
    private final List<MessageFieldOptionDto> options;

    @Nullable
    private final String placeholder;

    @Nullable
    private final List<MessageFieldOptionDto> select;

    @Nullable
    private final Integer selectSize;

    @Nullable
    private final String text;

    @NotNull
    private final String type;

    static {
        m mVar = m.PUBLICATION;
        $childSerializers = new j[]{null, null, null, null, l.a(mVar, new a(12)), null, null, null, null, null, l.a(mVar, new a(13)), l.a(mVar, new a(14)), null};
    }

    public /* synthetic */ MessageFieldDto(int i11, String str, String str2, String str3, String str4, Map map, String str5, String str6, Integer num, Integer num2, String str7, List list, List list2, Integer num3, m1 m1Var) {
        if (8191 != (i11 & 8191)) {
            c1.j(i11, 8191, MessageFieldDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = str;
        this.name = str2;
        this.label = str3;
        this.type = str4;
        this.metadata = map;
        this.placeholder = str5;
        this.text = str6;
        this.minSize = num;
        this.maxSize = num2;
        this.email = str7;
        this.options = list;
        this.select = list2;
        this.selectSize = num3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new f0(r1.f29848a, new i90.a(Reflection.getOrCreateKotlinClass(Object.class), new KSerializer[0]), 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new d(MessageFieldOptionDto$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return new d(MessageFieldOptionDto$$serializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MessageFieldDto copy$default(MessageFieldDto messageFieldDto, String str, String str2, String str3, String str4, Map map, String str5, String str6, Integer num, Integer num2, String str7, List list, List list2, Integer num3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = messageFieldDto.id;
        }
        return messageFieldDto.copy(str, (i11 & 2) != 0 ? messageFieldDto.name : str2, (i11 & 4) != 0 ? messageFieldDto.label : str3, (i11 & 8) != 0 ? messageFieldDto.type : str4, (i11 & 16) != 0 ? messageFieldDto.metadata : map, (i11 & 32) != 0 ? messageFieldDto.placeholder : str5, (i11 & 64) != 0 ? messageFieldDto.text : str6, (i11 & 128) != 0 ? messageFieldDto.minSize : num, (i11 & 256) != 0 ? messageFieldDto.maxSize : num2, (i11 & 512) != 0 ? messageFieldDto.email : str7, (i11 & 1024) != 0 ? messageFieldDto.options : list, (i11 & NewHope.SENDB_BYTES) != 0 ? messageFieldDto.select : list2, (i11 & 4096) != 0 ? messageFieldDto.selectSize : num3);
    }

    public static final /* synthetic */ void write$Self$zendesk_conversationkit_conversationkit_android(MessageFieldDto self, b output, SerialDescriptor serialDesc) {
        j[] jVarArr = $childSerializers;
        output.q(serialDesc, 0, self.id);
        output.q(serialDesc, 1, self.name);
        output.q(serialDesc, 2, self.label);
        output.q(serialDesc, 3, self.type);
        output.r(serialDesc, 4, (KSerializer) jVarArr[4].getValue(), self.metadata);
        r1 r1Var = r1.f29848a;
        output.r(serialDesc, 5, r1Var, self.placeholder);
        output.r(serialDesc, 6, r1Var, self.text);
        l0 l0Var = l0.f29821a;
        output.r(serialDesc, 7, l0Var, self.minSize);
        output.r(serialDesc, 8, l0Var, self.maxSize);
        output.r(serialDesc, 9, r1Var, self.email);
        output.r(serialDesc, 10, (KSerializer) jVarArr[10].getValue(), self.options);
        output.r(serialDesc, 11, (KSerializer) jVarArr[11].getValue(), self.select);
        output.r(serialDesc, 12, l0Var, self.selectSize);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    @Nullable
    public final List<MessageFieldOptionDto> component11() {
        return this.options;
    }

    @Nullable
    public final List<MessageFieldOptionDto> component12() {
        return this.select;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Integer getSelectSize() {
        return this.selectSize;
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
    public final String getType() {
        return this.type;
    }

    @Nullable
    public final Map<String, Object> component5() {
        return this.metadata;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getPlaceholder() {
        return this.placeholder;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Integer getMinSize() {
        return this.minSize;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Integer getMaxSize() {
        return this.maxSize;
    }

    @NotNull
    public final MessageFieldDto copy(@NotNull String id2, @NotNull String name, @NotNull String label, @NotNull String type, @Nullable Map<String, ? extends Object> metadata, @Nullable String placeholder, @Nullable String text, @Nullable Integer minSize, @Nullable Integer maxSize, @Nullable String email, @Nullable List<MessageFieldOptionDto> options, @Nullable List<MessageFieldOptionDto> select, @Nullable Integer selectSize) {
        id2.getClass();
        name.getClass();
        label.getClass();
        type.getClass();
        return new MessageFieldDto(id2, name, label, type, metadata, placeholder, text, minSize, maxSize, email, options, select, selectSize);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageFieldDto)) {
            return false;
        }
        MessageFieldDto messageFieldDto = (MessageFieldDto) other;
        return Intrinsics.areEqual(this.id, messageFieldDto.id) && Intrinsics.areEqual(this.name, messageFieldDto.name) && Intrinsics.areEqual(this.label, messageFieldDto.label) && Intrinsics.areEqual(this.type, messageFieldDto.type) && Intrinsics.areEqual(this.metadata, messageFieldDto.metadata) && Intrinsics.areEqual(this.placeholder, messageFieldDto.placeholder) && Intrinsics.areEqual(this.text, messageFieldDto.text) && Intrinsics.areEqual(this.minSize, messageFieldDto.minSize) && Intrinsics.areEqual(this.maxSize, messageFieldDto.maxSize) && Intrinsics.areEqual(this.email, messageFieldDto.email) && Intrinsics.areEqual(this.options, messageFieldDto.options) && Intrinsics.areEqual(this.select, messageFieldDto.select) && Intrinsics.areEqual(this.selectSize, messageFieldDto.selectSize);
    }

    @Nullable
    public final String getEmail() {
        return this.email;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getLabel() {
        return this.label;
    }

    @Nullable
    public final Integer getMaxSize() {
        return this.maxSize;
    }

    @Nullable
    public final Map<String, Object> getMetadata() {
        return this.metadata;
    }

    @Nullable
    public final Integer getMinSize() {
        return this.minSize;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final List<MessageFieldOptionDto> getOptions() {
        return this.options;
    }

    @Nullable
    public final String getPlaceholder() {
        return this.placeholder;
    }

    @Nullable
    public final List<MessageFieldOptionDto> getSelect() {
        return this.select;
    }

    @Nullable
    public final Integer getSelectSize() {
        return this.selectSize;
    }

    @Nullable
    public final String getText() {
        return this.text;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int iB = l1.b(l1.b(l1.b(this.id.hashCode() * 31, 31, this.name), 31, this.label), 31, this.type);
        Map<String, Object> map = this.metadata;
        int iHashCode = (iB + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.placeholder;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.text;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.minSize;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.maxSize;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.email;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<MessageFieldOptionDto> list = this.options;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        List<MessageFieldOptionDto> list2 = this.select;
        int iHashCode8 = (iHashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num3 = this.selectSize;
        return iHashCode8 + (num3 != null ? num3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.name;
        String str3 = this.label;
        String str4 = this.type;
        Map<String, Object> map = this.metadata;
        String str5 = this.placeholder;
        String str6 = this.text;
        Integer num = this.minSize;
        Integer num2 = this.maxSize;
        String str7 = this.email;
        List<MessageFieldOptionDto> list = this.options;
        List<MessageFieldOptionDto> list2 = this.select;
        Integer num3 = this.selectSize;
        StringBuilder sbT = f.t("MessageFieldDto(id=", str, ", name=", str2, ", label=");
        s.A(sbT, str3, ", type=", str4, ", metadata=");
        sbT.append(map);
        sbT.append(", placeholder=");
        sbT.append(str5);
        sbT.append(", text=");
        sbT.append(str6);
        sbT.append(", minSize=");
        sbT.append(num);
        sbT.append(", maxSize=");
        sbT.append(num2);
        sbT.append(", email=");
        sbT.append(str7);
        sbT.append(", options=");
        sbT.append(list);
        sbT.append(", select=");
        sbT.append(list2);
        sbT.append(", selectSize=");
        return i.m(sbT, num3, ")");
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/conversationkit/android/internal/rest/model/MessageFieldDto$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/conversationkit/android/internal/rest/model/MessageFieldDto;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return MessageFieldDto$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @g("_id")
    public static /* synthetic */ void getId$annotations() {
    }

    public MessageFieldDto(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @Nullable Map<String, ? extends Object> map, @Nullable String str5, @Nullable String str6, @Nullable Integer num, @Nullable Integer num2, @Nullable String str7, @Nullable List<MessageFieldOptionDto> list, @Nullable List<MessageFieldOptionDto> list2, @Nullable Integer num3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.id = str;
        this.name = str2;
        this.label = str3;
        this.type = str4;
        this.metadata = map;
        this.placeholder = str5;
        this.text = str6;
        this.minSize = num;
        this.maxSize = num2;
        this.email = str7;
        this.options = list;
        this.select = list2;
        this.selectSize = num3;
    }
}
