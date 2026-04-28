package zendesk.guidekit.android.model;

import e0.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import w.a0;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lzendesk/guidekit/android/model/Brand;", "", "channelId", "", "subdomain", "hostMapping", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getChannelId", "()Ljava/lang/String;", "getSubdomain", "getHostMapping", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "zendesk.guidekit_guidekit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class Brand {

    @NotNull
    private final String channelId;

    @NotNull
    private final String hostMapping;

    @NotNull
    private final String subdomain;

    public Brand(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        a0.C(str, str2, str3);
        this.channelId = str;
        this.subdomain = str2;
        this.hostMapping = str3;
    }

    public static /* synthetic */ Brand copy$default(Brand brand, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = brand.channelId;
        }
        if ((i11 & 2) != 0) {
            str2 = brand.subdomain;
        }
        if ((i11 & 4) != 0) {
            str3 = brand.hostMapping;
        }
        return brand.copy(str, str2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getChannelId() {
        return this.channelId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSubdomain() {
        return this.subdomain;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getHostMapping() {
        return this.hostMapping;
    }

    @NotNull
    public final Brand copy(@NotNull String channelId, @NotNull String subdomain, @NotNull String hostMapping) {
        channelId.getClass();
        subdomain.getClass();
        hostMapping.getClass();
        return new Brand(channelId, subdomain, hostMapping);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Brand)) {
            return false;
        }
        Brand brand = (Brand) other;
        return Intrinsics.areEqual(this.channelId, brand.channelId) && Intrinsics.areEqual(this.subdomain, brand.subdomain) && Intrinsics.areEqual(this.hostMapping, brand.hostMapping);
    }

    @NotNull
    public final String getChannelId() {
        return this.channelId;
    }

    @NotNull
    public final String getHostMapping() {
        return this.hostMapping;
    }

    @NotNull
    public final String getSubdomain() {
        return this.subdomain;
    }

    public int hashCode() {
        return this.hostMapping.hashCode() + l1.b(this.channelId.hashCode() * 31, 31, this.subdomain);
    }

    @NotNull
    public String toString() {
        String str = this.channelId;
        String str2 = this.subdomain;
        return k.p(f.t("Brand(channelId=", str, ", subdomain=", str2, ", hostMapping="), this.hostMapping, ")");
    }
}
