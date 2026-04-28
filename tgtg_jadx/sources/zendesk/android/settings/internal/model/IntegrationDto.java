package zendesk.android.settings.internal.model;

import i90.g;
import i90.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.c1;
import m90.m1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@h
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001e\b\u0081\b\u0018\u0000 12\u00020\u0001:\u000221B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB?\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ:\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010&\u001a\u00020\u00042\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010(\u0012\u0004\b*\u0010+\u001a\u0004\b)\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b.\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b0\u0010\u001f¨\u00063"}, d2 = {"Lzendesk/android/settings/internal/model/IntegrationDto;", "", "", "id", "", "canUserCreateMoreConversations", "canUserSeeConversationList", "Lzendesk/android/settings/internal/model/WaitConfigDto;", "waitConfig", "<init>", "(Ljava/lang/String;ZZLzendesk/android/settings/internal/model/WaitConfigDto;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;ZZLzendesk/android/settings/internal/model/WaitConfigDto;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$zendesk_zendesk_android", "(Lzendesk/android/settings/internal/model/IntegrationDto;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "component4", "()Lzendesk/android/settings/internal/model/WaitConfigDto;", "copy", "(Ljava/lang/String;ZZLzendesk/android/settings/internal/model/WaitConfigDto;)Lzendesk/android/settings/internal/model/IntegrationDto;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "Z", "getCanUserCreateMoreConversations", "getCanUserSeeConversationList", "Lzendesk/android/settings/internal/model/WaitConfigDto;", "getWaitConfig", "Companion", "$serializer", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class IntegrationDto {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final boolean canUserCreateMoreConversations;
    private final boolean canUserSeeConversationList;

    @NotNull
    private final String id;

    @Nullable
    private final WaitConfigDto waitConfig;

    public /* synthetic */ IntegrationDto(int i11, String str, boolean z11, boolean z12, WaitConfigDto waitConfigDto, m1 m1Var) {
        if (15 != (i11 & 15)) {
            c1.j(i11, 15, IntegrationDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = str;
        this.canUserCreateMoreConversations = z11;
        this.canUserSeeConversationList = z12;
        this.waitConfig = waitConfigDto;
    }

    public static /* synthetic */ IntegrationDto copy$default(IntegrationDto integrationDto, String str, boolean z11, boolean z12, WaitConfigDto waitConfigDto, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = integrationDto.id;
        }
        if ((i11 & 2) != 0) {
            z11 = integrationDto.canUserCreateMoreConversations;
        }
        if ((i11 & 4) != 0) {
            z12 = integrationDto.canUserSeeConversationList;
        }
        if ((i11 & 8) != 0) {
            waitConfigDto = integrationDto.waitConfig;
        }
        return integrationDto.copy(str, z11, z12, waitConfigDto);
    }

    public static final /* synthetic */ void write$Self$zendesk_zendesk_android(IntegrationDto self, b output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.id);
        output.p(serialDesc, 1, self.canUserCreateMoreConversations);
        output.p(serialDesc, 2, self.canUserSeeConversationList);
        output.r(serialDesc, 3, WaitConfigDto$$serializer.INSTANCE, self.waitConfig);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getCanUserCreateMoreConversations() {
        return this.canUserCreateMoreConversations;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getCanUserSeeConversationList() {
        return this.canUserSeeConversationList;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final WaitConfigDto getWaitConfig() {
        return this.waitConfig;
    }

    @NotNull
    public final IntegrationDto copy(@NotNull String id2, boolean canUserCreateMoreConversations, boolean canUserSeeConversationList, @Nullable WaitConfigDto waitConfig) {
        id2.getClass();
        return new IntegrationDto(id2, canUserCreateMoreConversations, canUserSeeConversationList, waitConfig);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IntegrationDto)) {
            return false;
        }
        IntegrationDto integrationDto = (IntegrationDto) other;
        return Intrinsics.areEqual(this.id, integrationDto.id) && this.canUserCreateMoreConversations == integrationDto.canUserCreateMoreConversations && this.canUserSeeConversationList == integrationDto.canUserSeeConversationList && Intrinsics.areEqual(this.waitConfig, integrationDto.waitConfig);
    }

    public final boolean getCanUserCreateMoreConversations() {
        return this.canUserCreateMoreConversations;
    }

    public final boolean getCanUserSeeConversationList() {
        return this.canUserSeeConversationList;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final WaitConfigDto getWaitConfig() {
        return this.waitConfig;
    }

    public int hashCode() {
        int iE = k.e(k.e(this.id.hashCode() * 31, 31, this.canUserCreateMoreConversations), 31, this.canUserSeeConversationList);
        WaitConfigDto waitConfigDto = this.waitConfig;
        return iE + (waitConfigDto == null ? 0 : waitConfigDto.hashCode());
    }

    @NotNull
    public String toString() {
        return "IntegrationDto(id=" + this.id + ", canUserCreateMoreConversations=" + this.canUserCreateMoreConversations + ", canUserSeeConversationList=" + this.canUserSeeConversationList + ", waitConfig=" + this.waitConfig + ")";
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/android/settings/internal/model/IntegrationDto$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/android/settings/internal/model/IntegrationDto;", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return IntegrationDto$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @g("_id")
    public static /* synthetic */ void getId$annotations() {
    }

    public IntegrationDto(@NotNull String str, boolean z11, boolean z12, @Nullable WaitConfigDto waitConfigDto) {
        str.getClass();
        this.id = str;
        this.canUserCreateMoreConversations = z11;
        this.canUserSeeConversationList = z12;
        this.waitConfig = waitConfigDto;
    }
}
