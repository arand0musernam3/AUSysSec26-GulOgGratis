package zendesk.android.internal.proactivemessaging.campaigntriggerservice.model;

import com.braze.models.inappmessage.InAppMessageBase;
import e0.f;
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
import m90.r1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@h
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u0000 )2\u00020\u0001:\u0002*)B'\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J2\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\u0017R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010#\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u0017¨\u0006+"}, d2 = {"Lzendesk/android/internal/proactivemessaging/campaigntriggerservice/model/CtsResponseDto;", "", "", "jwt", InAppMessageBase.MESSAGE, "campaignId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$zendesk_zendesk_android", "(Lzendesk/android/internal/proactivemessaging/campaigntriggerservice/model/CtsResponseDto;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lzendesk/android/internal/proactivemessaging/campaigntriggerservice/model/CtsResponseDto;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getJwt", "getMessage", "getCampaignId", "getCampaignId$annotations", "()V", "Companion", "$serializer", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class CtsResponseDto {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final String campaignId;

    @Nullable
    private final String jwt;

    @NotNull
    private final String message;

    public /* synthetic */ CtsResponseDto(int i11, String str, String str2, String str3, m1 m1Var) {
        if (2 != (i11 & 2)) {
            c1.j(i11, 2, CtsResponseDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i11 & 1) == 0) {
            this.jwt = null;
        } else {
            this.jwt = str;
        }
        this.message = str2;
        if ((i11 & 4) == 0) {
            this.campaignId = null;
        } else {
            this.campaignId = str3;
        }
    }

    public static /* synthetic */ CtsResponseDto copy$default(CtsResponseDto ctsResponseDto, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = ctsResponseDto.jwt;
        }
        if ((i11 & 2) != 0) {
            str2 = ctsResponseDto.message;
        }
        if ((i11 & 4) != 0) {
            str3 = ctsResponseDto.campaignId;
        }
        return ctsResponseDto.copy(str, str2, str3);
    }

    public static final /* synthetic */ void write$Self$zendesk_zendesk_android(CtsResponseDto self, b output, SerialDescriptor serialDesc) {
        if (output.C(serialDesc) || self.jwt != null) {
            output.r(serialDesc, 0, r1.f29848a, self.jwt);
        }
        output.q(serialDesc, 1, self.message);
        if (!output.C(serialDesc) && self.campaignId == null) {
            return;
        }
        output.r(serialDesc, 2, r1.f29848a, self.campaignId);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getJwt() {
        return this.jwt;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCampaignId() {
        return this.campaignId;
    }

    @NotNull
    public final CtsResponseDto copy(@Nullable String jwt, @NotNull String message, @Nullable String campaignId) {
        message.getClass();
        return new CtsResponseDto(jwt, message, campaignId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CtsResponseDto)) {
            return false;
        }
        CtsResponseDto ctsResponseDto = (CtsResponseDto) other;
        return Intrinsics.areEqual(this.jwt, ctsResponseDto.jwt) && Intrinsics.areEqual(this.message, ctsResponseDto.message) && Intrinsics.areEqual(this.campaignId, ctsResponseDto.campaignId);
    }

    @Nullable
    public final String getCampaignId() {
        return this.campaignId;
    }

    @Nullable
    public final String getJwt() {
        return this.jwt;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        String str = this.jwt;
        int iB = l1.b((str == null ? 0 : str.hashCode()) * 31, 31, this.message);
        String str2 = this.campaignId;
        return iB + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.jwt;
        String str2 = this.message;
        return k.p(f.t("CtsResponseDto(jwt=", str, ", message=", str2, ", campaignId="), this.campaignId, ")");
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/android/internal/proactivemessaging/campaigntriggerservice/model/CtsResponseDto$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/android/internal/proactivemessaging/campaigntriggerservice/model/CtsResponseDto;", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return CtsResponseDto$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @g("pcm_id")
    public static /* synthetic */ void getCampaignId$annotations() {
    }

    public CtsResponseDto(@Nullable String str, @NotNull String str2, @Nullable String str3) {
        str2.getClass();
        this.jwt = str;
        this.message = str2;
        this.campaignId = str3;
    }

    public /* synthetic */ CtsResponseDto(String str, String str2, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, str2, (i11 & 4) != 0 ? null : str3);
    }
}
