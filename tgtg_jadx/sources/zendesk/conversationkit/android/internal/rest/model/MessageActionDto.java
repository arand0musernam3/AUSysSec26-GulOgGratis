package zendesk.conversationkit.android.internal.rest.model;

import bb0.a;
import e0.f;
import i90.h;
import j4.s;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.c1;
import m90.f0;
import m90.g;
import m90.m1;
import m90.q0;
import m90.r1;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.j;
import u70.l;
import u70.m;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@h
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010$\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001a\b\u0081\b\u0018\u0000 R2\u00020\u0001:\u0002SRB\u009b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0014\u0010\u0015B³\u0001\b\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0014\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001cJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001cJ\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001cJ\u001e\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010\u001cJ\u0012\u0010*\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b*\u0010\u001cJ\u0012\u0010+\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b+\u0010!J\u0012\u0010,\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b,\u0010\u001cJÀ\u0001\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b/\u0010\u001cJ\u0010\u00100\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b0\u00101J\u001a\u00103\u001a\u00020\u00072\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b3\u00104J'\u0010=\u001a\u00020:2\u0006\u00105\u001a\u00020\u00002\u0006\u00107\u001a\u0002062\u0006\u00109\u001a\u000208H\u0001¢\u0006\u0004\b;\u0010<R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010>\u0012\u0004\b@\u0010A\u001a\u0004\b?\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010>\u001a\u0004\bB\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010>\u001a\u0004\bC\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010>\u001a\u0004\bD\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010E\u001a\u0004\bF\u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010>\u001a\u0004\bG\u0010\u001cR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010>\u001a\u0004\bH\u0010\u001cR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010>\u001a\u0004\bI\u0010\u001cR%\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010J\u001a\u0004\bK\u0010&R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010L\u001a\u0004\bM\u0010(R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010>\u001a\u0004\bN\u0010\u001cR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010>\u001a\u0004\bO\u0010\u001cR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0012\u0010E\u001a\u0004\bP\u0010!R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010>\u001a\u0004\bQ\u0010\u001c¨\u0006T"}, d2 = {"Lzendesk/conversationkit/android/internal/rest/model/MessageActionDto;", "", "", "id", "type", TextBundle.TEXT_ENTRY, "uri", "", "default", "iconUrl", "fallback", "payload", "", "metadata", "", "amount", "currency", "state", "openOnReceive", "size", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lm90/m1;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Ljava/lang/Boolean;", "component6", "component7", "component8", "component9", "()Ljava/util/Map;", "component10", "()Ljava/lang/Long;", "component11", "component12", "component13", "component14", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Lzendesk/conversationkit/android/internal/rest/model/MessageActionDto;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$zendesk_conversationkit_conversationkit_android", "(Lzendesk/conversationkit/android/internal/rest/model/MessageActionDto;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "getType", "getText", "getUri", "Ljava/lang/Boolean;", "getDefault", "getIconUrl", "getFallback", "getPayload", "Ljava/util/Map;", "getMetadata", "Ljava/lang/Long;", "getAmount", "getCurrency", "getState", "getOpenOnReceive", "getSize", "Companion", "$serializer", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class MessageActionDto {

    @Nullable
    private final Long amount;

    @Nullable
    private final String currency;

    @Nullable
    private final Boolean default;

    @Nullable
    private final String fallback;

    @Nullable
    private final String iconUrl;

    @NotNull
    private final String id;

    @Nullable
    private final Map<String, Object> metadata;

    @Nullable
    private final Boolean openOnReceive;

    @Nullable
    private final String payload;

    @Nullable
    private final String size;

    @Nullable
    private final String state;

    @Nullable
    private final String text;

    @NotNull
    private final String type;

    @Nullable
    private final String uri;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final j[] $childSerializers = {null, null, null, null, null, null, null, null, l.a(m.PUBLICATION, new a(6)), null, null, null, null, null};

    public /* synthetic */ MessageActionDto(int i11, String str, String str2, String str3, String str4, Boolean bool, String str5, String str6, String str7, Map map, Long l, String str8, String str9, Boolean bool2, String str10, m1 m1Var) {
        if (16383 != (i11 & 16383)) {
            c1.j(i11, 16383, MessageActionDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = str;
        this.type = str2;
        this.text = str3;
        this.uri = str4;
        this.default = bool;
        this.iconUrl = str5;
        this.fallback = str6;
        this.payload = str7;
        this.metadata = map;
        this.amount = l;
        this.currency = str8;
        this.state = str9;
        this.openOnReceive = bool2;
        this.size = str10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new f0(r1.f29848a, new i90.a(Reflection.getOrCreateKotlinClass(Object.class), new KSerializer[0]), 1);
    }

    public static final /* synthetic */ void write$Self$zendesk_conversationkit_conversationkit_android(MessageActionDto self, b output, SerialDescriptor serialDesc) {
        j[] jVarArr = $childSerializers;
        output.q(serialDesc, 0, self.id);
        output.q(serialDesc, 1, self.type);
        r1 r1Var = r1.f29848a;
        output.r(serialDesc, 2, r1Var, self.text);
        output.r(serialDesc, 3, r1Var, self.uri);
        g gVar = g.f29797a;
        output.r(serialDesc, 4, gVar, self.default);
        output.r(serialDesc, 5, r1Var, self.iconUrl);
        output.r(serialDesc, 6, r1Var, self.fallback);
        output.r(serialDesc, 7, r1Var, self.payload);
        output.r(serialDesc, 8, (KSerializer) jVarArr[8].getValue(), self.metadata);
        output.r(serialDesc, 9, q0.f29842a, self.amount);
        output.r(serialDesc, 10, r1Var, self.currency);
        output.r(serialDesc, 11, r1Var, self.state);
        output.r(serialDesc, 12, gVar, self.openOnReceive);
        output.r(serialDesc, 13, r1Var, self.size);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Long getAmount() {
        return this.amount;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getState() {
        return this.state;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Boolean getOpenOnReceive() {
        return this.openOnReceive;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getSize() {
        return this.size;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getUri() {
        return this.uri;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getDefault() {
        return this.default;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getFallback() {
        return this.fallback;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getPayload() {
        return this.payload;
    }

    @Nullable
    public final Map<String, Object> component9() {
        return this.metadata;
    }

    @NotNull
    public final MessageActionDto copy(@NotNull String id2, @NotNull String type, @Nullable String text, @Nullable String uri, @Nullable Boolean bool, @Nullable String iconUrl, @Nullable String fallback, @Nullable String payload, @Nullable Map<String, ? extends Object> metadata, @Nullable Long amount, @Nullable String currency, @Nullable String state, @Nullable Boolean openOnReceive, @Nullable String size) {
        id2.getClass();
        type.getClass();
        return new MessageActionDto(id2, type, text, uri, bool, iconUrl, fallback, payload, metadata, amount, currency, state, openOnReceive, size);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageActionDto)) {
            return false;
        }
        MessageActionDto messageActionDto = (MessageActionDto) other;
        return Intrinsics.areEqual(this.id, messageActionDto.id) && Intrinsics.areEqual(this.type, messageActionDto.type) && Intrinsics.areEqual(this.text, messageActionDto.text) && Intrinsics.areEqual(this.uri, messageActionDto.uri) && Intrinsics.areEqual(this.default, messageActionDto.default) && Intrinsics.areEqual(this.iconUrl, messageActionDto.iconUrl) && Intrinsics.areEqual(this.fallback, messageActionDto.fallback) && Intrinsics.areEqual(this.payload, messageActionDto.payload) && Intrinsics.areEqual(this.metadata, messageActionDto.metadata) && Intrinsics.areEqual(this.amount, messageActionDto.amount) && Intrinsics.areEqual(this.currency, messageActionDto.currency) && Intrinsics.areEqual(this.state, messageActionDto.state) && Intrinsics.areEqual(this.openOnReceive, messageActionDto.openOnReceive) && Intrinsics.areEqual(this.size, messageActionDto.size);
    }

    @Nullable
    public final Long getAmount() {
        return this.amount;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final Boolean getDefault() {
        return this.default;
    }

    @Nullable
    public final String getFallback() {
        return this.fallback;
    }

    @Nullable
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final Map<String, Object> getMetadata() {
        return this.metadata;
    }

    @Nullable
    public final Boolean getOpenOnReceive() {
        return this.openOnReceive;
    }

    @Nullable
    public final String getPayload() {
        return this.payload;
    }

    @Nullable
    public final String getSize() {
        return this.size;
    }

    @Nullable
    public final String getState() {
        return this.state;
    }

    @Nullable
    public final String getText() {
        return this.text;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    @Nullable
    public final String getUri() {
        return this.uri;
    }

    public int hashCode() {
        int iB = l1.b(this.id.hashCode() * 31, 31, this.type);
        String str = this.text;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.uri;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.default;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.iconUrl;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.fallback;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.payload;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Map<String, Object> map = this.metadata;
        int iHashCode7 = (iHashCode6 + (map == null ? 0 : map.hashCode())) * 31;
        Long l = this.amount;
        int iHashCode8 = (iHashCode7 + (l == null ? 0 : l.hashCode())) * 31;
        String str6 = this.currency;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.state;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Boolean bool2 = this.openOnReceive;
        int iHashCode11 = (iHashCode10 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str8 = this.size;
        return iHashCode11 + (str8 != null ? str8.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.type;
        String str3 = this.text;
        String str4 = this.uri;
        Boolean bool = this.default;
        String str5 = this.iconUrl;
        String str6 = this.fallback;
        String str7 = this.payload;
        Map<String, Object> map = this.metadata;
        Long l = this.amount;
        String str8 = this.currency;
        String str9 = this.state;
        Boolean bool2 = this.openOnReceive;
        String str10 = this.size;
        StringBuilder sbT = f.t("MessageActionDto(id=", str, ", type=", str2, ", text=");
        s.A(sbT, str3, ", uri=", str4, ", default=");
        sbT.append(bool);
        sbT.append(", iconUrl=");
        sbT.append(str5);
        sbT.append(", fallback=");
        s.A(sbT, str6, ", payload=", str7, ", metadata=");
        sbT.append(map);
        sbT.append(", amount=");
        sbT.append(l);
        sbT.append(", currency=");
        s.A(sbT, str8, ", state=", str9, ", openOnReceive=");
        sbT.append(bool2);
        sbT.append(", size=");
        sbT.append(str10);
        sbT.append(")");
        return sbT.toString();
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/conversationkit/android/internal/rest/model/MessageActionDto$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/conversationkit/android/internal/rest/model/MessageActionDto;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return MessageActionDto$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @i90.g("_id")
    public static /* synthetic */ void getId$annotations() {
    }

    public MessageActionDto(@NotNull String str, @NotNull String str2, @Nullable String str3, @Nullable String str4, @Nullable Boolean bool, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable Map<String, ? extends Object> map, @Nullable Long l, @Nullable String str8, @Nullable String str9, @Nullable Boolean bool2, @Nullable String str10) {
        str.getClass();
        str2.getClass();
        this.id = str;
        this.type = str2;
        this.text = str3;
        this.uri = str4;
        this.default = bool;
        this.iconUrl = str5;
        this.fallback = str6;
        this.payload = str7;
        this.metadata = map;
        this.amount = l;
        this.currency = str8;
        this.state = str9;
        this.openOnReceive = bool2;
        this.size = str10;
    }
}
