package zendesk.messaging.android.internal.rest.model;

import i90.g;
import i90.h;
import java.util.List;
import jq.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.c1;
import m90.d;
import m90.m1;
import m90.r1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.j;
import u70.l;
import u70.m;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@h
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0081\b\u0018\u0000 22\u00020\u0001:\u000232B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nBG\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJB\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\"\u0010\u001cJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u001cR\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b.\u0010\u001eR\"\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010+\u0012\u0004\b0\u00101\u001a\u0004\b/\u0010\u001c¨\u00064"}, d2 = {"Lzendesk/messaging/android/internal/rest/model/ConversationFieldDto;", "", "", "id", "", "type", "", "options", "regexp", "<init>", "(JLjava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(IJLjava/lang/String;Ljava/util/List;Ljava/lang/String;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$zendesk_messaging_messaging_android", "(Lzendesk/messaging/android/internal/rest/model/ConversationFieldDto;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()J", "component2", "()Ljava/lang/String;", "component3", "()Ljava/util/List;", "component4", "copy", "(JLjava/lang/String;Ljava/util/List;Ljava/lang/String;)Lzendesk/messaging/android/internal/rest/model/ConversationFieldDto;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "Ljava/lang/String;", "getType", "Ljava/util/List;", "getOptions", "getRegexp", "getRegexp$annotations", "()V", "Companion", "$serializer", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ConversationFieldDto {
    private final long id;

    @Nullable
    private final List<String> options;

    @Nullable
    private final String regexp;

    @NotNull
    private final String type;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final j[] $childSerializers = {null, null, l.a(m.PUBLICATION, new a(5)), null};

    public /* synthetic */ ConversationFieldDto(int i11, long j9, String str, List list, String str2, m1 m1Var) {
        if (3 != (i11 & 3)) {
            c1.j(i11, 3, ConversationFieldDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = j9;
        this.type = str;
        if ((i11 & 4) == 0) {
            this.options = null;
        } else {
            this.options = list;
        }
        if ((i11 & 8) == 0) {
            this.regexp = null;
        } else {
            this.regexp = str2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new d(r1.f29848a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ConversationFieldDto copy$default(ConversationFieldDto conversationFieldDto, long j9, String str, List list, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j9 = conversationFieldDto.id;
        }
        long j11 = j9;
        if ((i11 & 2) != 0) {
            str = conversationFieldDto.type;
        }
        String str3 = str;
        if ((i11 & 4) != 0) {
            list = conversationFieldDto.options;
        }
        List list2 = list;
        if ((i11 & 8) != 0) {
            str2 = conversationFieldDto.regexp;
        }
        return conversationFieldDto.copy(j11, str3, list2, str2);
    }

    public static final /* synthetic */ void write$Self$zendesk_messaging_messaging_android(ConversationFieldDto self, b output, SerialDescriptor serialDesc) {
        j[] jVarArr = $childSerializers;
        output.B(serialDesc, 0, self.id);
        output.q(serialDesc, 1, self.type);
        if (output.C(serialDesc) || self.options != null) {
            output.r(serialDesc, 2, (KSerializer) jVarArr[2].getValue(), self.options);
        }
        if (!output.C(serialDesc) && self.regexp == null) {
            return;
        }
        output.r(serialDesc, 3, r1.f29848a, self.regexp);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    public final List<String> component3() {
        return this.options;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getRegexp() {
        return this.regexp;
    }

    @NotNull
    public final ConversationFieldDto copy(long id2, @NotNull String type, @Nullable List<String> options, @Nullable String regexp) {
        type.getClass();
        return new ConversationFieldDto(id2, type, options, regexp);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConversationFieldDto)) {
            return false;
        }
        ConversationFieldDto conversationFieldDto = (ConversationFieldDto) other;
        return this.id == conversationFieldDto.id && Intrinsics.areEqual(this.type, conversationFieldDto.type) && Intrinsics.areEqual(this.options, conversationFieldDto.options) && Intrinsics.areEqual(this.regexp, conversationFieldDto.regexp);
    }

    public final long getId() {
        return this.id;
    }

    @Nullable
    public final List<String> getOptions() {
        return this.options;
    }

    @Nullable
    public final String getRegexp() {
        return this.regexp;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int iB = l1.b(Long.hashCode(this.id) * 31, 31, this.type);
        List<String> list = this.options;
        int iHashCode = (iB + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.regexp;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ConversationFieldDto(id=" + this.id + ", type=" + this.type + ", options=" + this.options + ", regexp=" + this.regexp + ")";
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/messaging/android/internal/rest/model/ConversationFieldDto$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/messaging/android/internal/rest/model/ConversationFieldDto;", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return ConversationFieldDto$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ConversationFieldDto(long j9, @NotNull String str, @Nullable List<String> list, @Nullable String str2) {
        str.getClass();
        this.id = j9;
        this.type = str;
        this.options = list;
        this.regexp = str2;
    }

    public /* synthetic */ ConversationFieldDto(long j9, String str, List list, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j9, str, (i11 & 4) != 0 ? null : list, (i11 & 8) != 0 ? null : str2);
    }

    @g("regexp_for_validation")
    public static /* synthetic */ void getRegexp$annotations() {
    }
}
