package app.cash.paykit.core.models.response;

import a60.i;
import a60.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.provider.asymmetric.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@l(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J&\u0010\u0007\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lapp/cash/paykit/core/models/response/Origin;", "", "", "id", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lapp/cash/paykit/core/models/response/Origin;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class Origin {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4724b;

    public Origin(@i(name = "id") @Nullable String str, @i(name = "type") @NotNull String str2) {
        str2.getClass();
        this.f4723a = str;
        this.f4724b = str2;
    }

    @NotNull
    public final Origin copy(@i(name = "id") @Nullable String id2, @i(name = "type") @NotNull String type) {
        type.getClass();
        return new Origin(id2, type);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Origin)) {
            return false;
        }
        Origin origin = (Origin) obj;
        return Intrinsics.areEqual(this.f4723a, origin.f4723a) && Intrinsics.areEqual(this.f4724b, origin.f4724b);
    }

    public final int hashCode() {
        String str = this.f4723a;
        return this.f4724b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return a.d("Origin(id=", this.f4723a, ", type=", this.f4724b, ")");
    }
}
