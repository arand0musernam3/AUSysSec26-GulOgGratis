package app.cash.paykit.core.models.response;

import a60.i;
import a60.l;
import e0.f;
import g90.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@l(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ8\u0010\n\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00022\b\b\u0003\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lapp/cash/paykit/core/models/response/AuthFlowTriggers;", "", "", "mobileUrl", "qrCodeImageUrl", "qrCodeSvgUrl", "Lg90/b;", "refreshesAt", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lg90/b;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lg90/b;)Lapp/cash/paykit/core/models/response/AuthFlowTriggers;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class AuthFlowTriggers {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f4674c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f4675d;

    public AuthFlowTriggers(@i(name = "mobile_url") @NotNull String str, @i(name = "qr_code_image_url") @NotNull String str2, @i(name = "qr_code_svg_url") @NotNull String str3, @i(name = "refreshes_at") @NotNull b bVar) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        bVar.getClass();
        this.f4672a = str;
        this.f4673b = str2;
        this.f4674c = str3;
        this.f4675d = bVar;
    }

    @NotNull
    public final AuthFlowTriggers copy(@i(name = "mobile_url") @NotNull String mobileUrl, @i(name = "qr_code_image_url") @NotNull String qrCodeImageUrl, @i(name = "qr_code_svg_url") @NotNull String qrCodeSvgUrl, @i(name = "refreshes_at") @NotNull b refreshesAt) {
        mobileUrl.getClass();
        qrCodeImageUrl.getClass();
        qrCodeSvgUrl.getClass();
        refreshesAt.getClass();
        return new AuthFlowTriggers(mobileUrl, qrCodeImageUrl, qrCodeSvgUrl, refreshesAt);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthFlowTriggers)) {
            return false;
        }
        AuthFlowTriggers authFlowTriggers = (AuthFlowTriggers) obj;
        return Intrinsics.areEqual(this.f4672a, authFlowTriggers.f4672a) && Intrinsics.areEqual(this.f4673b, authFlowTriggers.f4673b) && Intrinsics.areEqual(this.f4674c, authFlowTriggers.f4674c) && Intrinsics.areEqual(this.f4675d, authFlowTriggers.f4675d);
    }

    public final int hashCode() {
        return this.f4675d.f20262a.hashCode() + l1.b(l1.b(this.f4672a.hashCode() * 31, 31, this.f4673b), 31, this.f4674c);
    }

    public final String toString() {
        StringBuilder sbT = f.t("AuthFlowTriggers(mobileUrl=", this.f4672a, ", qrCodeImageUrl=", this.f4673b, ", qrCodeSvgUrl=");
        sbT.append(this.f4674c);
        sbT.append(", refreshesAt=");
        sbT.append(this.f4675d);
        sbT.append(")");
        return sbT.toString();
    }
}
