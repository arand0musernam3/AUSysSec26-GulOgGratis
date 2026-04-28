package zendesk.conversationkit.android.internal.rest.model;

import bb0.a;
import i90.h;
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
import m90.m1;
import m90.r1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.j;
import u70.l;
import u70.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@h
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u0000 )2\u00020\u0001:\u0002*)B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB;\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u001e\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ2\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R%\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010\u001a¨\u0006+"}, d2 = {"Lzendesk/conversationkit/android/internal/rest/model/UpdateConversationRequestDto;", "", "Lzendesk/conversationkit/android/internal/rest/model/ClientDto;", "client", "", "", "metadata", "<init>", "(Lzendesk/conversationkit/android/internal/rest/model/ClientDto;Ljava/util/Map;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILzendesk/conversationkit/android/internal/rest/model/ClientDto;Ljava/util/Map;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$zendesk_conversationkit_conversationkit_android", "(Lzendesk/conversationkit/android/internal/rest/model/UpdateConversationRequestDto;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lzendesk/conversationkit/android/internal/rest/model/ClientDto;", "component2", "()Ljava/util/Map;", "copy", "(Lzendesk/conversationkit/android/internal/rest/model/ClientDto;Ljava/util/Map;)Lzendesk/conversationkit/android/internal/rest/model/UpdateConversationRequestDto;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lzendesk/conversationkit/android/internal/rest/model/ClientDto;", "getClient", "Ljava/util/Map;", "getMetadata", "Companion", "$serializer", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class UpdateConversationRequestDto {

    @NotNull
    private final ClientDto client;

    @Nullable
    private final Map<String, Object> metadata;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final j[] $childSerializers = {null, l.a(m.PUBLICATION, new a(29))};

    public /* synthetic */ UpdateConversationRequestDto(int i11, ClientDto clientDto, Map map, m1 m1Var) {
        if (1 != (i11 & 1)) {
            c1.j(i11, 1, UpdateConversationRequestDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.client = clientDto;
        if ((i11 & 2) == 0) {
            this.metadata = null;
        } else {
            this.metadata = map;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new f0(r1.f29848a, new i90.a(Reflection.getOrCreateKotlinClass(Object.class), new KSerializer[0]), 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UpdateConversationRequestDto copy$default(UpdateConversationRequestDto updateConversationRequestDto, ClientDto clientDto, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            clientDto = updateConversationRequestDto.client;
        }
        if ((i11 & 2) != 0) {
            map = updateConversationRequestDto.metadata;
        }
        return updateConversationRequestDto.copy(clientDto, map);
    }

    public static final /* synthetic */ void write$Self$zendesk_conversationkit_conversationkit_android(UpdateConversationRequestDto self, b output, SerialDescriptor serialDesc) {
        j[] jVarArr = $childSerializers;
        output.i(serialDesc, 0, ClientDto$$serializer.INSTANCE, self.client);
        if (!output.C(serialDesc) && self.metadata == null) {
            return;
        }
        output.r(serialDesc, 1, (KSerializer) jVarArr[1].getValue(), self.metadata);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ClientDto getClient() {
        return this.client;
    }

    @Nullable
    public final Map<String, Object> component2() {
        return this.metadata;
    }

    @NotNull
    public final UpdateConversationRequestDto copy(@NotNull ClientDto client, @Nullable Map<String, ? extends Object> metadata) {
        client.getClass();
        return new UpdateConversationRequestDto(client, metadata);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdateConversationRequestDto)) {
            return false;
        }
        UpdateConversationRequestDto updateConversationRequestDto = (UpdateConversationRequestDto) other;
        return Intrinsics.areEqual(this.client, updateConversationRequestDto.client) && Intrinsics.areEqual(this.metadata, updateConversationRequestDto.metadata);
    }

    @NotNull
    public final ClientDto getClient() {
        return this.client;
    }

    @Nullable
    public final Map<String, Object> getMetadata() {
        return this.metadata;
    }

    public int hashCode() {
        int iHashCode = this.client.hashCode() * 31;
        Map<String, Object> map = this.metadata;
        return iHashCode + (map == null ? 0 : map.hashCode());
    }

    @NotNull
    public String toString() {
        return "UpdateConversationRequestDto(client=" + this.client + ", metadata=" + this.metadata + ")";
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/conversationkit/android/internal/rest/model/UpdateConversationRequestDto$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/conversationkit/android/internal/rest/model/UpdateConversationRequestDto;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return UpdateConversationRequestDto$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public UpdateConversationRequestDto(@NotNull ClientDto clientDto, @Nullable Map<String, ? extends Object> map) {
        clientDto.getClass();
        this.client = clientDto;
        this.metadata = map;
    }

    public /* synthetic */ UpdateConversationRequestDto(ClientDto clientDto, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(clientDto, (i11 & 2) != 0 ? null : map);
    }
}
