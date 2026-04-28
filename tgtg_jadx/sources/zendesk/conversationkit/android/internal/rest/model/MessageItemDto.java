package zendesk.conversationkit.android.internal.rest.model;

import bb0.a;
import e0.f;
import i90.h;
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
import m90.m1;
import m90.r1;
import org.bouncycastle.i18n.MessageBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import u70.j;
import u70.l;
import u70.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@h
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0081\b\u0018\u0000 :2\u00020\u0001:\u0002;:B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eBs\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001eJ\u001e\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001eJ\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u001eJr\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010\u001eJ\u0010\u0010*\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b.\u0010/R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u001eR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00100\u001a\u0004\b2\u0010\u001eR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u00103\u001a\u0004\b4\u0010!R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b5\u0010\u001eR%\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00106\u001a\u0004\b7\u0010$R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00100\u001a\u0004\b8\u0010\u001eR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u00100\u001a\u0004\b9\u0010\u001e¨\u0006<"}, d2 = {"Lzendesk/conversationkit/android/internal/rest/model/MessageItemDto;", "", "", MessageBundle.TITLE_ENTRY, "description", "", "Lzendesk/conversationkit/android/internal/rest/model/MessageActionDto;", "actions", "size", "", "metadata", "mediaUrl", "mediaType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$zendesk_conversationkit_conversationkit_android", "(Lzendesk/conversationkit/android/internal/rest/model/MessageItemDto;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "component4", "component5", "()Ljava/util/Map;", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)Lzendesk/conversationkit/android/internal/rest/model/MessageItemDto;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getDescription", "Ljava/util/List;", "getActions", "getSize", "Ljava/util/Map;", "getMetadata", "getMediaUrl", "getMediaType", "Companion", "$serializer", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class MessageItemDto {

    @NotNull
    private static final j[] $childSerializers;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final List<MessageActionDto> actions;

    @Nullable
    private final String description;

    @Nullable
    private final String mediaType;

    @Nullable
    private final String mediaUrl;

    @Nullable
    private final Map<String, Object> metadata;

    @Nullable
    private final String size;

    @NotNull
    private final String title;

    static {
        m mVar = m.PUBLICATION;
        $childSerializers = new j[]{null, null, l.a(mVar, new a(15)), null, l.a(mVar, new a(16)), null, null};
    }

    public /* synthetic */ MessageItemDto(int i11, String str, String str2, List list, String str3, Map map, String str4, String str5, m1 m1Var) {
        if (127 != (i11 & 127)) {
            c1.j(i11, 127, MessageItemDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.title = str;
        this.description = str2;
        this.actions = list;
        this.size = str3;
        this.metadata = map;
        this.mediaUrl = str4;
        this.mediaType = str5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new d(MessageActionDto$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new f0(r1.f29848a, new i90.a(Reflection.getOrCreateKotlinClass(Object.class), new KSerializer[0]), 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MessageItemDto copy$default(MessageItemDto messageItemDto, String str, String str2, List list, String str3, Map map, String str4, String str5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = messageItemDto.title;
        }
        if ((i11 & 2) != 0) {
            str2 = messageItemDto.description;
        }
        if ((i11 & 4) != 0) {
            list = messageItemDto.actions;
        }
        if ((i11 & 8) != 0) {
            str3 = messageItemDto.size;
        }
        if ((i11 & 16) != 0) {
            map = messageItemDto.metadata;
        }
        if ((i11 & 32) != 0) {
            str4 = messageItemDto.mediaUrl;
        }
        if ((i11 & 64) != 0) {
            str5 = messageItemDto.mediaType;
        }
        String str6 = str4;
        String str7 = str5;
        Map map2 = map;
        List list2 = list;
        return messageItemDto.copy(str, str2, list2, str3, map2, str6, str7);
    }

    public static final /* synthetic */ void write$Self$zendesk_conversationkit_conversationkit_android(MessageItemDto self, b output, SerialDescriptor serialDesc) {
        j[] jVarArr = $childSerializers;
        output.q(serialDesc, 0, self.title);
        r1 r1Var = r1.f29848a;
        output.r(serialDesc, 1, r1Var, self.description);
        output.i(serialDesc, 2, (KSerializer) jVarArr[2].getValue(), self.actions);
        output.r(serialDesc, 3, r1Var, self.size);
        output.r(serialDesc, 4, (KSerializer) jVarArr[4].getValue(), self.metadata);
        output.r(serialDesc, 5, r1Var, self.mediaUrl);
        output.r(serialDesc, 6, r1Var, self.mediaType);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final List<MessageActionDto> component3() {
        return this.actions;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSize() {
        return this.size;
    }

    @Nullable
    public final Map<String, Object> component5() {
        return this.metadata;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getMediaUrl() {
        return this.mediaUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getMediaType() {
        return this.mediaType;
    }

    @NotNull
    public final MessageItemDto copy(@NotNull String title, @Nullable String description, @NotNull List<MessageActionDto> actions, @Nullable String size, @Nullable Map<String, ? extends Object> metadata, @Nullable String mediaUrl, @Nullable String mediaType) {
        title.getClass();
        actions.getClass();
        return new MessageItemDto(title, description, actions, size, metadata, mediaUrl, mediaType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageItemDto)) {
            return false;
        }
        MessageItemDto messageItemDto = (MessageItemDto) other;
        return Intrinsics.areEqual(this.title, messageItemDto.title) && Intrinsics.areEqual(this.description, messageItemDto.description) && Intrinsics.areEqual(this.actions, messageItemDto.actions) && Intrinsics.areEqual(this.size, messageItemDto.size) && Intrinsics.areEqual(this.metadata, messageItemDto.metadata) && Intrinsics.areEqual(this.mediaUrl, messageItemDto.mediaUrl) && Intrinsics.areEqual(this.mediaType, messageItemDto.mediaType);
    }

    @NotNull
    public final List<MessageActionDto> getActions() {
        return this.actions;
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    public final String getMediaType() {
        return this.mediaType;
    }

    @Nullable
    public final String getMediaUrl() {
        return this.mediaUrl;
    }

    @Nullable
    public final Map<String, Object> getMetadata() {
        return this.metadata;
    }

    @Nullable
    public final String getSize() {
        return this.size;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.description;
        int iC = f.c(this.actions, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.size;
        int iHashCode2 = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map<String, Object> map = this.metadata;
        int iHashCode3 = (iHashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        String str3 = this.mediaUrl;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.mediaType;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.title;
        String str2 = this.description;
        List<MessageActionDto> list = this.actions;
        String str3 = this.size;
        Map<String, Object> map = this.metadata;
        String str4 = this.mediaUrl;
        String str5 = this.mediaType;
        StringBuilder sbT = f.t("MessageItemDto(title=", str, ", description=", str2, ", actions=");
        sbT.append(list);
        sbT.append(", size=");
        sbT.append(str3);
        sbT.append(", metadata=");
        sbT.append(map);
        sbT.append(", mediaUrl=");
        sbT.append(str4);
        sbT.append(", mediaType=");
        return k.p(sbT, str5, ")");
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/conversationkit/android/internal/rest/model/MessageItemDto$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/conversationkit/android/internal/rest/model/MessageItemDto;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return MessageItemDto$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public MessageItemDto(@NotNull String str, @Nullable String str2, @NotNull List<MessageActionDto> list, @Nullable String str3, @Nullable Map<String, ? extends Object> map, @Nullable String str4, @Nullable String str5) {
        str.getClass();
        list.getClass();
        this.title = str;
        this.description = str2;
        this.actions = list;
        this.size = str3;
        this.metadata = map;
        this.mediaUrl = str4;
        this.mediaType = str5;
    }
}
