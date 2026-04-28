package zendesk.android.settings.internal.model;

import com.braze.models.FeatureFlag;
import e0.f;
import i90.g;
import i90.h;
import j4.s;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.c1;
import m90.m1;
import m90.r1;
import org.bouncycastle.i18n.MessageBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@h
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b%\b\u0081\b\u0018\u0000 ;2\u00020\u0001:\u0002<;BW\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rB_\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001dJ\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001dJ\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001dJb\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u001dJ\u0010\u0010)\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010,\u001a\u00020\u00052\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010.\u0012\u0004\b0\u00101\u001a\u0004\b/\u0010\u001dR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010.\u001a\u0004\b2\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00103\u001a\u0004\b4\u0010 R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00105\u001a\u0004\b6\u0010\"R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b7\u0010\u001dR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010.\u001a\u0004\b8\u0010\u001dR\"\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010.\u0012\u0004\b:\u00101\u001a\u0004\b9\u0010\u001d¨\u0006="}, d2 = {"Lzendesk/android/settings/internal/model/NativeMessagingDto;", "", "", "integrationId", "platform", "", FeatureFlag.ENABLED, "Lzendesk/android/settings/internal/model/BrandDto;", "brand", MessageBundle.TITLE_ENTRY, "description", "logoUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLzendesk/android/settings/internal/model/BrandDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;ZLzendesk/android/settings/internal/model/BrandDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$zendesk_zendesk_android", "(Lzendesk/android/settings/internal/model/NativeMessagingDto;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "component4", "()Lzendesk/android/settings/internal/model/BrandDto;", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;ZLzendesk/android/settings/internal/model/BrandDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lzendesk/android/settings/internal/model/NativeMessagingDto;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getIntegrationId", "getIntegrationId$annotations", "()V", "getPlatform", "Z", "getEnabled", "Lzendesk/android/settings/internal/model/BrandDto;", "getBrand", "getTitle", "getDescription", "getLogoUrl", "getLogoUrl$annotations", "Companion", "$serializer", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class NativeMessagingDto {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final BrandDto brand;

    @Nullable
    private final String description;
    private final boolean enabled;

    @Nullable
    private final String integrationId;

    @Nullable
    private final String logoUrl;

    @Nullable
    private final String platform;

    @Nullable
    private final String title;

    public /* synthetic */ NativeMessagingDto(int i11, String str, String str2, boolean z11, BrandDto brandDto, String str3, String str4, String str5, m1 m1Var) {
        if (4 != (i11 & 4)) {
            c1.j(i11, 4, NativeMessagingDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i11 & 1) == 0) {
            this.integrationId = null;
        } else {
            this.integrationId = str;
        }
        if ((i11 & 2) == 0) {
            this.platform = null;
        } else {
            this.platform = str2;
        }
        this.enabled = z11;
        if ((i11 & 8) == 0) {
            this.brand = null;
        } else {
            this.brand = brandDto;
        }
        if ((i11 & 16) == 0) {
            this.title = null;
        } else {
            this.title = str3;
        }
        if ((i11 & 32) == 0) {
            this.description = null;
        } else {
            this.description = str4;
        }
        if ((i11 & 64) == 0) {
            this.logoUrl = null;
        } else {
            this.logoUrl = str5;
        }
    }

    public static /* synthetic */ NativeMessagingDto copy$default(NativeMessagingDto nativeMessagingDto, String str, String str2, boolean z11, BrandDto brandDto, String str3, String str4, String str5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = nativeMessagingDto.integrationId;
        }
        if ((i11 & 2) != 0) {
            str2 = nativeMessagingDto.platform;
        }
        if ((i11 & 4) != 0) {
            z11 = nativeMessagingDto.enabled;
        }
        if ((i11 & 8) != 0) {
            brandDto = nativeMessagingDto.brand;
        }
        if ((i11 & 16) != 0) {
            str3 = nativeMessagingDto.title;
        }
        if ((i11 & 32) != 0) {
            str4 = nativeMessagingDto.description;
        }
        if ((i11 & 64) != 0) {
            str5 = nativeMessagingDto.logoUrl;
        }
        String str6 = str4;
        String str7 = str5;
        String str8 = str3;
        boolean z12 = z11;
        return nativeMessagingDto.copy(str, str2, z12, brandDto, str8, str6, str7);
    }

    public static final /* synthetic */ void write$Self$zendesk_zendesk_android(NativeMessagingDto self, b output, SerialDescriptor serialDesc) {
        if (output.C(serialDesc) || self.integrationId != null) {
            output.r(serialDesc, 0, r1.f29848a, self.integrationId);
        }
        if (output.C(serialDesc) || self.platform != null) {
            output.r(serialDesc, 1, r1.f29848a, self.platform);
        }
        output.p(serialDesc, 2, self.enabled);
        if (output.C(serialDesc) || self.brand != null) {
            output.r(serialDesc, 3, BrandDto$$serializer.INSTANCE, self.brand);
        }
        if (output.C(serialDesc) || self.title != null) {
            output.r(serialDesc, 4, r1.f29848a, self.title);
        }
        if (output.C(serialDesc) || self.description != null) {
            output.r(serialDesc, 5, r1.f29848a, self.description);
        }
        if (!output.C(serialDesc) && self.logoUrl == null) {
            return;
        }
        output.r(serialDesc, 6, r1.f29848a, self.logoUrl);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIntegrationId() {
        return this.integrationId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPlatform() {
        return this.platform;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BrandDto getBrand() {
        return this.brand;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getLogoUrl() {
        return this.logoUrl;
    }

    @NotNull
    public final NativeMessagingDto copy(@Nullable String integrationId, @Nullable String platform, boolean enabled, @Nullable BrandDto brand, @Nullable String title, @Nullable String description, @Nullable String logoUrl) {
        return new NativeMessagingDto(integrationId, platform, enabled, brand, title, description, logoUrl);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NativeMessagingDto)) {
            return false;
        }
        NativeMessagingDto nativeMessagingDto = (NativeMessagingDto) other;
        return Intrinsics.areEqual(this.integrationId, nativeMessagingDto.integrationId) && Intrinsics.areEqual(this.platform, nativeMessagingDto.platform) && this.enabled == nativeMessagingDto.enabled && Intrinsics.areEqual(this.brand, nativeMessagingDto.brand) && Intrinsics.areEqual(this.title, nativeMessagingDto.title) && Intrinsics.areEqual(this.description, nativeMessagingDto.description) && Intrinsics.areEqual(this.logoUrl, nativeMessagingDto.logoUrl);
    }

    @Nullable
    public final BrandDto getBrand() {
        return this.brand;
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    @Nullable
    public final String getIntegrationId() {
        return this.integrationId;
    }

    @Nullable
    public final String getLogoUrl() {
        return this.logoUrl;
    }

    @Nullable
    public final String getPlatform() {
        return this.platform;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.integrationId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.platform;
        int iE = k.e((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.enabled);
        BrandDto brandDto = this.brand;
        int iHashCode2 = (iE + (brandDto == null ? 0 : brandDto.hashCode())) * 31;
        String str3 = this.title;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.description;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.logoUrl;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.integrationId;
        String str2 = this.platform;
        boolean z11 = this.enabled;
        BrandDto brandDto = this.brand;
        String str3 = this.title;
        String str4 = this.description;
        String str5 = this.logoUrl;
        StringBuilder sbT = f.t("NativeMessagingDto(integrationId=", str, ", platform=", str2, ", enabled=");
        sbT.append(z11);
        sbT.append(", brand=");
        sbT.append(brandDto);
        sbT.append(", title=");
        s.A(sbT, str3, ", description=", str4, ", logoUrl=");
        return k.p(sbT, str5, ")");
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/android/settings/internal/model/NativeMessagingDto$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/android/settings/internal/model/NativeMessagingDto;", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return NativeMessagingDto$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @g("integration_id")
    public static /* synthetic */ void getIntegrationId$annotations() {
    }

    @g("logo_url")
    public static /* synthetic */ void getLogoUrl$annotations() {
    }

    public NativeMessagingDto(@Nullable String str, @Nullable String str2, boolean z11, @Nullable BrandDto brandDto, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.integrationId = str;
        this.platform = str2;
        this.enabled = z11;
        this.brand = brandDto;
        this.title = str3;
        this.description = str4;
        this.logoUrl = str5;
    }

    public /* synthetic */ NativeMessagingDto(String str, String str2, boolean z11, BrandDto brandDto, String str3, String str4, String str5, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, z11, (i11 & 8) != 0 ? null : brandDto, (i11 & 16) != 0 ? null : str3, (i11 & 32) != 0 ? null : str4, (i11 & 64) != 0 ? null : str5);
    }
}
