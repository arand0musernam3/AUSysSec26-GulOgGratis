package zendesk.android.settings.internal.model;

import i90.h;
import j4.s;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.c1;
import m90.g;
import m90.m1;
import m90.q0;
import m90.r1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@h
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0019\b\u0081\b\u0018\u0000 E2\u00020\u0001:\u0002FEBq\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000e\u0010\u000fBu\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0019J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0016J\u0012\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b \u0010\u0019J|\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b#\u0010\u0019J\u0010\u0010$\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010'\u001a\u00020\u00072\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(J'\u00101\u001a\u00020.2\u0006\u0010)\u001a\u00020\u00002\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,H\u0001¢\u0006\u0004\b/\u00100R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u0010\u0016R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u00102\u0012\u0004\b5\u00106\u001a\u0004\b4\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00107\u001a\u0004\b8\u0010\u0019R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00109\u001a\u0004\b:\u0010\u001bR\"\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00107\u0012\u0004\b<\u00106\u001a\u0004\b;\u0010\u0019R\"\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00107\u0012\u0004\b>\u00106\u001a\u0004\b=\u0010\u0019R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00107\u0012\u0004\b@\u00106\u001a\u0004\b?\u0010\u0019R\"\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00102\u0012\u0004\bB\u00106\u001a\u0004\bA\u0010\u0016R\"\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u00107\u0012\u0004\bD\u00106\u001a\u0004\bC\u0010\u0019¨\u0006G"}, d2 = {"Lzendesk/android/settings/internal/model/BrandDto;", "", "", "id", "accountId", "", "name", "", "active", "deletedAt", "createdAt", "updatedAt", "routeId", "signatureTemplate", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lm90/m1;)V", "component1", "()Ljava/lang/Long;", "component2", "component3", "()Ljava/lang/String;", "component4", "()Ljava/lang/Boolean;", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)Lzendesk/android/settings/internal/model/BrandDto;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$zendesk_zendesk_android", "(Lzendesk/android/settings/internal/model/BrandDto;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/Long;", "getId", "getAccountId", "getAccountId$annotations", "()V", "Ljava/lang/String;", "getName", "Ljava/lang/Boolean;", "getActive", "getDeletedAt", "getDeletedAt$annotations", "getCreatedAt", "getCreatedAt$annotations", "getUpdatedAt", "getUpdatedAt$annotations", "getRouteId", "getRouteId$annotations", "getSignatureTemplate", "getSignatureTemplate$annotations", "Companion", "$serializer", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class BrandDto {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Long accountId;

    @Nullable
    private final Boolean active;

    @Nullable
    private final String createdAt;

    @Nullable
    private final String deletedAt;

    @Nullable
    private final Long id;

    @Nullable
    private final String name;

    @Nullable
    private final Long routeId;

    @Nullable
    private final String signatureTemplate;

    @Nullable
    private final String updatedAt;

    public /* synthetic */ BrandDto(int i11, Long l, Long l7, String str, Boolean bool, String str2, String str3, String str4, Long l11, String str5, m1 m1Var) {
        if (1 != (i11 & 1)) {
            c1.j(i11, 1, BrandDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = l;
        if ((i11 & 2) == 0) {
            this.accountId = null;
        } else {
            this.accountId = l7;
        }
        if ((i11 & 4) == 0) {
            this.name = null;
        } else {
            this.name = str;
        }
        if ((i11 & 8) == 0) {
            this.active = null;
        } else {
            this.active = bool;
        }
        if ((i11 & 16) == 0) {
            this.deletedAt = null;
        } else {
            this.deletedAt = str2;
        }
        if ((i11 & 32) == 0) {
            this.createdAt = null;
        } else {
            this.createdAt = str3;
        }
        if ((i11 & 64) == 0) {
            this.updatedAt = null;
        } else {
            this.updatedAt = str4;
        }
        if ((i11 & 128) == 0) {
            this.routeId = null;
        } else {
            this.routeId = l11;
        }
        if ((i11 & 256) == 0) {
            this.signatureTemplate = null;
        } else {
            this.signatureTemplate = str5;
        }
    }

    public static /* synthetic */ BrandDto copy$default(BrandDto brandDto, Long l, Long l7, String str, Boolean bool, String str2, String str3, String str4, Long l11, String str5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            l = brandDto.id;
        }
        if ((i11 & 2) != 0) {
            l7 = brandDto.accountId;
        }
        if ((i11 & 4) != 0) {
            str = brandDto.name;
        }
        if ((i11 & 8) != 0) {
            bool = brandDto.active;
        }
        if ((i11 & 16) != 0) {
            str2 = brandDto.deletedAt;
        }
        if ((i11 & 32) != 0) {
            str3 = brandDto.createdAt;
        }
        if ((i11 & 64) != 0) {
            str4 = brandDto.updatedAt;
        }
        if ((i11 & 128) != 0) {
            l11 = brandDto.routeId;
        }
        if ((i11 & 256) != 0) {
            str5 = brandDto.signatureTemplate;
        }
        Long l12 = l11;
        String str6 = str5;
        String str7 = str3;
        String str8 = str4;
        String str9 = str2;
        String str10 = str;
        return brandDto.copy(l, l7, str10, bool, str9, str7, str8, l12, str6);
    }

    public static final /* synthetic */ void write$Self$zendesk_zendesk_android(BrandDto self, b output, SerialDescriptor serialDesc) {
        q0 q0Var = q0.f29842a;
        output.r(serialDesc, 0, q0Var, self.id);
        if (output.C(serialDesc) || self.accountId != null) {
            output.r(serialDesc, 1, q0Var, self.accountId);
        }
        if (output.C(serialDesc) || self.name != null) {
            output.r(serialDesc, 2, r1.f29848a, self.name);
        }
        if (output.C(serialDesc) || self.active != null) {
            output.r(serialDesc, 3, g.f29797a, self.active);
        }
        if (output.C(serialDesc) || self.deletedAt != null) {
            output.r(serialDesc, 4, r1.f29848a, self.deletedAt);
        }
        if (output.C(serialDesc) || self.createdAt != null) {
            output.r(serialDesc, 5, r1.f29848a, self.createdAt);
        }
        if (output.C(serialDesc) || self.updatedAt != null) {
            output.r(serialDesc, 6, r1.f29848a, self.updatedAt);
        }
        if (output.C(serialDesc) || self.routeId != null) {
            output.r(serialDesc, 7, q0Var, self.routeId);
        }
        if (!output.C(serialDesc) && self.signatureTemplate == null) {
            return;
        }
        output.r(serialDesc, 8, r1.f29848a, self.signatureTemplate);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getAccountId() {
        return this.accountId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getActive() {
        return this.active;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDeletedAt() {
        return this.deletedAt;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCreatedAt() {
        return this.createdAt;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Long getRouteId() {
        return this.routeId;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getSignatureTemplate() {
        return this.signatureTemplate;
    }

    @NotNull
    public final BrandDto copy(@Nullable Long id2, @Nullable Long accountId, @Nullable String name, @Nullable Boolean active, @Nullable String deletedAt, @Nullable String createdAt, @Nullable String updatedAt, @Nullable Long routeId, @Nullable String signatureTemplate) {
        return new BrandDto(id2, accountId, name, active, deletedAt, createdAt, updatedAt, routeId, signatureTemplate);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BrandDto)) {
            return false;
        }
        BrandDto brandDto = (BrandDto) other;
        return Intrinsics.areEqual(this.id, brandDto.id) && Intrinsics.areEqual(this.accountId, brandDto.accountId) && Intrinsics.areEqual(this.name, brandDto.name) && Intrinsics.areEqual(this.active, brandDto.active) && Intrinsics.areEqual(this.deletedAt, brandDto.deletedAt) && Intrinsics.areEqual(this.createdAt, brandDto.createdAt) && Intrinsics.areEqual(this.updatedAt, brandDto.updatedAt) && Intrinsics.areEqual(this.routeId, brandDto.routeId) && Intrinsics.areEqual(this.signatureTemplate, brandDto.signatureTemplate);
    }

    @Nullable
    public final Long getAccountId() {
        return this.accountId;
    }

    @Nullable
    public final Boolean getActive() {
        return this.active;
    }

    @Nullable
    public final String getCreatedAt() {
        return this.createdAt;
    }

    @Nullable
    public final String getDeletedAt() {
        return this.deletedAt;
    }

    @Nullable
    public final Long getId() {
        return this.id;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final Long getRouteId() {
        return this.routeId;
    }

    @Nullable
    public final String getSignatureTemplate() {
        return this.signatureTemplate;
    }

    @Nullable
    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        Long l = this.id;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l7 = this.accountId;
        int iHashCode2 = (iHashCode + (l7 == null ? 0 : l7.hashCode())) * 31;
        String str = this.name;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.active;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.deletedAt;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.createdAt;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.updatedAt;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l11 = this.routeId;
        int iHashCode8 = (iHashCode7 + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str5 = this.signatureTemplate;
        return iHashCode8 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Long l = this.id;
        Long l7 = this.accountId;
        String str = this.name;
        Boolean bool = this.active;
        String str2 = this.deletedAt;
        String str3 = this.createdAt;
        String str4 = this.updatedAt;
        Long l11 = this.routeId;
        String str5 = this.signatureTemplate;
        StringBuilder sb2 = new StringBuilder("BrandDto(id=");
        sb2.append(l);
        sb2.append(", accountId=");
        sb2.append(l7);
        sb2.append(", name=");
        sb2.append(str);
        sb2.append(", active=");
        sb2.append(bool);
        sb2.append(", deletedAt=");
        s.A(sb2, str2, ", createdAt=", str3, ", updatedAt=");
        sb2.append(str4);
        sb2.append(", routeId=");
        sb2.append(l11);
        sb2.append(", signatureTemplate=");
        return k.p(sb2, str5, ")");
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/android/settings/internal/model/BrandDto$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/android/settings/internal/model/BrandDto;", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return BrandDto$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @i90.g("account_id")
    public static /* synthetic */ void getAccountId$annotations() {
    }

    @i90.g("created_at")
    public static /* synthetic */ void getCreatedAt$annotations() {
    }

    @i90.g("deleted_at")
    public static /* synthetic */ void getDeletedAt$annotations() {
    }

    @i90.g("route_id")
    public static /* synthetic */ void getRouteId$annotations() {
    }

    @i90.g("signature_template")
    public static /* synthetic */ void getSignatureTemplate$annotations() {
    }

    @i90.g("updated_at")
    public static /* synthetic */ void getUpdatedAt$annotations() {
    }

    public BrandDto(@Nullable Long l, @Nullable Long l7, @Nullable String str, @Nullable Boolean bool, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Long l11, @Nullable String str5) {
        this.id = l;
        this.accountId = l7;
        this.name = str;
        this.active = bool;
        this.deletedAt = str2;
        this.createdAt = str3;
        this.updatedAt = str4;
        this.routeId = l11;
        this.signatureTemplate = str5;
    }

    public /* synthetic */ BrandDto(Long l, Long l7, String str, Boolean bool, String str2, String str3, String str4, Long l11, String str5, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(l, (i11 & 2) != 0 ? null : l7, (i11 & 4) != 0 ? null : str, (i11 & 8) != 0 ? null : bool, (i11 & 16) != 0 ? null : str2, (i11 & 32) != 0 ? null : str3, (i11 & 64) != 0 ? null : str4, (i11 & 128) != 0 ? null : l11, (i11 & 256) != 0 ? null : str5);
    }
}
