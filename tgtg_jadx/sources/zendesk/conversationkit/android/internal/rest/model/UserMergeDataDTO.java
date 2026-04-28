package zendesk.conversationkit.android.internal.rest.model;

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

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@h
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u0000 '2\u00020\u0001:\u0002('B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0019¨\u0006)"}, d2 = {"Lzendesk/conversationkit/android/internal/rest/model/UserMergeDataDTO;", "", "Lzendesk/conversationkit/android/internal/rest/model/SurvivingAppUserDTO;", "survivingAppUser", "", "reason", "<init>", "(Lzendesk/conversationkit/android/internal/rest/model/SurvivingAppUserDTO;Ljava/lang/String;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILzendesk/conversationkit/android/internal/rest/model/SurvivingAppUserDTO;Ljava/lang/String;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$zendesk_conversationkit_conversationkit_android", "(Lzendesk/conversationkit/android/internal/rest/model/UserMergeDataDTO;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lzendesk/conversationkit/android/internal/rest/model/SurvivingAppUserDTO;", "component2", "()Ljava/lang/String;", "copy", "(Lzendesk/conversationkit/android/internal/rest/model/SurvivingAppUserDTO;Ljava/lang/String;)Lzendesk/conversationkit/android/internal/rest/model/UserMergeDataDTO;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lzendesk/conversationkit/android/internal/rest/model/SurvivingAppUserDTO;", "getSurvivingAppUser", "Ljava/lang/String;", "getReason", "Companion", "$serializer", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class UserMergeDataDTO {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String reason;

    @NotNull
    private final SurvivingAppUserDTO survivingAppUser;

    public /* synthetic */ UserMergeDataDTO(int i11, SurvivingAppUserDTO survivingAppUserDTO, String str, m1 m1Var) {
        if (3 != (i11 & 3)) {
            c1.j(i11, 3, UserMergeDataDTO$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.survivingAppUser = survivingAppUserDTO;
        this.reason = str;
    }

    public static /* synthetic */ UserMergeDataDTO copy$default(UserMergeDataDTO userMergeDataDTO, SurvivingAppUserDTO survivingAppUserDTO, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            survivingAppUserDTO = userMergeDataDTO.survivingAppUser;
        }
        if ((i11 & 2) != 0) {
            str = userMergeDataDTO.reason;
        }
        return userMergeDataDTO.copy(survivingAppUserDTO, str);
    }

    public static final /* synthetic */ void write$Self$zendesk_conversationkit_conversationkit_android(UserMergeDataDTO self, b output, SerialDescriptor serialDesc) {
        output.i(serialDesc, 0, SurvivingAppUserDTO$$serializer.INSTANCE, self.survivingAppUser);
        output.q(serialDesc, 1, self.reason);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final SurvivingAppUserDTO getSurvivingAppUser() {
        return this.survivingAppUser;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    @NotNull
    public final UserMergeDataDTO copy(@NotNull SurvivingAppUserDTO survivingAppUser, @NotNull String reason) {
        survivingAppUser.getClass();
        reason.getClass();
        return new UserMergeDataDTO(survivingAppUser, reason);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserMergeDataDTO)) {
            return false;
        }
        UserMergeDataDTO userMergeDataDTO = (UserMergeDataDTO) other;
        return Intrinsics.areEqual(this.survivingAppUser, userMergeDataDTO.survivingAppUser) && Intrinsics.areEqual(this.reason, userMergeDataDTO.reason);
    }

    @NotNull
    public final String getReason() {
        return this.reason;
    }

    @NotNull
    public final SurvivingAppUserDTO getSurvivingAppUser() {
        return this.survivingAppUser;
    }

    public int hashCode() {
        return this.reason.hashCode() + (this.survivingAppUser.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "UserMergeDataDTO(survivingAppUser=" + this.survivingAppUser + ", reason=" + this.reason + ")";
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/conversationkit/android/internal/rest/model/UserMergeDataDTO$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/conversationkit/android/internal/rest/model/UserMergeDataDTO;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return UserMergeDataDTO$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public UserMergeDataDTO(@NotNull SurvivingAppUserDTO survivingAppUserDTO, @NotNull String str) {
        survivingAppUserDTO.getClass();
        str.getClass();
        this.survivingAppUser = survivingAppUserDTO;
        this.reason = str;
    }
}
