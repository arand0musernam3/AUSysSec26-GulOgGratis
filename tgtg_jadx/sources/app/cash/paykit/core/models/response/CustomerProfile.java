package app.cash.paykit.core.models.response;

import a60.i;
import a60.l;
import fc.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@l(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lapp/cash/paykit/core/models/response/CustomerProfile;", "", "", "id", "Lfc/a;", "cashTag", "<init>", "(Ljava/lang/String;Lfc/a;)V", "copy", "(Ljava/lang/String;Lfc/a;)Lapp/cash/paykit/core/models/response/CustomerProfile;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class CustomerProfile {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f4680b;

    public CustomerProfile(@i(name = "id") @NotNull String str, @i(name = "cashtag") @NotNull a aVar) {
        str.getClass();
        aVar.getClass();
        this.f4679a = str;
        this.f4680b = aVar;
    }

    @NotNull
    public final CustomerProfile copy(@i(name = "id") @NotNull String id2, @i(name = "cashtag") @NotNull a cashTag) {
        id2.getClass();
        cashTag.getClass();
        return new CustomerProfile(id2, cashTag);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomerProfile)) {
            return false;
        }
        CustomerProfile customerProfile = (CustomerProfile) obj;
        return Intrinsics.areEqual(this.f4679a, customerProfile.f4679a) && Intrinsics.areEqual(this.f4680b, customerProfile.f4680b);
    }

    public final int hashCode() {
        return this.f4680b.hashCode() + (this.f4679a.hashCode() * 31);
    }

    public final String toString() {
        return "CustomerProfile(id=" + this.f4679a + ", cashTag=" + this.f4680b + ")";
    }
}
