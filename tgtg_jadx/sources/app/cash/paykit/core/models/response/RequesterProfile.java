package app.cash.paykit.core.models.response;

import a60.i;
import a60.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.provider.asymmetric.a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@l(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\u0007\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lapp/cash/paykit/core/models/response/RequesterProfile;", "", "", "logoUrl", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lapp/cash/paykit/core/models/response/RequesterProfile;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class RequesterProfile {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4729b;

    public RequesterProfile(@i(name = "logo_url") @NotNull String str, @i(name = "name") @NotNull String str2) {
        str.getClass();
        str2.getClass();
        this.f4728a = str;
        this.f4729b = str2;
    }

    @NotNull
    public final RequesterProfile copy(@i(name = "logo_url") @NotNull String logoUrl, @i(name = "name") @NotNull String name) {
        logoUrl.getClass();
        name.getClass();
        return new RequesterProfile(logoUrl, name);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RequesterProfile)) {
            return false;
        }
        RequesterProfile requesterProfile = (RequesterProfile) obj;
        return Intrinsics.areEqual(this.f4728a, requesterProfile.f4728a) && Intrinsics.areEqual(this.f4729b, requesterProfile.f4729b);
    }

    public final int hashCode() {
        return this.f4729b.hashCode() + (this.f4728a.hashCode() * 31);
    }

    public final String toString() {
        return a.d("RequesterProfile(logoUrl=", this.f4728a, ", name=", this.f4729b, ")");
    }
}
