package app.cash.paykit.core.models.response;

import a60.i;
import a60.l;
import app.cash.paykit.core.models.common.Action;
import com.braze.models.Banner;
import e0.f;
import j4.s;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r8.k;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@l(generateAdapter = true)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\t\u001a\u00020\u0002\u0012\b\b\u0001\u0010\n\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0001\u0010\f\u001a\u00020\u0002\u0012\b\b\u0001\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJj\u0010\u0010\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\b\u001a\u00020\u00072\b\b\u0003\u0010\t\u001a\u00020\u00022\b\b\u0003\u0010\n\u001a\u00020\u00022\b\b\u0003\u0010\u000b\u001a\u00020\u00022\b\b\u0003\u0010\f\u001a\u00020\u00022\b\b\u0003\u0010\r\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lapp/cash/paykit/core/models/response/Grant;", "", "", "id", "status", "Lapp/cash/paykit/core/models/response/GrantType;", "type", "Lapp/cash/paykit/core/models/common/Action;", "action", "channel", "customerId", "updatedAt", "createdAt", "expiresAt", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lapp/cash/paykit/core/models/response/GrantType;Lapp/cash/paykit/core/models/common/Action;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Lapp/cash/paykit/core/models/response/GrantType;Lapp/cash/paykit/core/models/common/Action;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lapp/cash/paykit/core/models/response/Grant;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class Grant {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final GrantType f4711c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Action f4712d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f4713e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f4714f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f4715g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f4716h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f4717i;

    public Grant(@i(name = "id") @NotNull String str, @i(name = "status") @NotNull String str2, @i(name = "type") @NotNull GrantType grantType, @i(name = "action") @NotNull Action action, @i(name = "channel") @NotNull String str3, @i(name = "customer_id") @NotNull String str4, @i(name = "updated_at") @NotNull String str5, @i(name = "created_at") @NotNull String str6, @i(name = Banner.EXPIRATION) @NotNull String str7) {
        str.getClass();
        str2.getClass();
        grantType.getClass();
        action.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        str7.getClass();
        this.f4709a = str;
        this.f4710b = str2;
        this.f4711c = grantType;
        this.f4712d = action;
        this.f4713e = str3;
        this.f4714f = str4;
        this.f4715g = str5;
        this.f4716h = str6;
        this.f4717i = str7;
    }

    @NotNull
    public final Grant copy(@i(name = "id") @NotNull String id2, @i(name = "status") @NotNull String status, @i(name = "type") @NotNull GrantType type, @i(name = "action") @NotNull Action action, @i(name = "channel") @NotNull String channel, @i(name = "customer_id") @NotNull String customerId, @i(name = "updated_at") @NotNull String updatedAt, @i(name = "created_at") @NotNull String createdAt, @i(name = Banner.EXPIRATION) @NotNull String expiresAt) {
        id2.getClass();
        status.getClass();
        type.getClass();
        action.getClass();
        channel.getClass();
        customerId.getClass();
        updatedAt.getClass();
        createdAt.getClass();
        expiresAt.getClass();
        return new Grant(id2, status, type, action, channel, customerId, updatedAt, createdAt, expiresAt);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Grant)) {
            return false;
        }
        Grant grant = (Grant) obj;
        return Intrinsics.areEqual(this.f4709a, grant.f4709a) && Intrinsics.areEqual(this.f4710b, grant.f4710b) && this.f4711c == grant.f4711c && Intrinsics.areEqual(this.f4712d, grant.f4712d) && Intrinsics.areEqual(this.f4713e, grant.f4713e) && Intrinsics.areEqual(this.f4714f, grant.f4714f) && Intrinsics.areEqual(this.f4715g, grant.f4715g) && Intrinsics.areEqual(this.f4716h, grant.f4716h) && Intrinsics.areEqual(this.f4717i, grant.f4717i);
    }

    public final int hashCode() {
        return this.f4717i.hashCode() + l1.b(l1.b(l1.b(l1.b((this.f4712d.hashCode() + ((this.f4711c.hashCode() + l1.b(this.f4709a.hashCode() * 31, 31, this.f4710b)) * 31)) * 31, 31, this.f4713e), 31, this.f4714f), 31, this.f4715g), 31, this.f4716h);
    }

    public final String toString() {
        StringBuilder sbT = f.t("Grant(id=", this.f4709a, ", status=", this.f4710b, ", type=");
        sbT.append(this.f4711c);
        sbT.append(", action=");
        sbT.append(this.f4712d);
        sbT.append(", channel=");
        s.A(sbT, this.f4713e, ", customerId=", this.f4714f, ", updatedAt=");
        s.A(sbT, this.f4715g, ", createdAt=", this.f4716h, ", expiresAt=");
        return k.p(sbT, this.f4717i, ")");
    }

    public /* synthetic */ Grant(String str, String str2, GrantType grantType, Action action, String str3, String str4, String str5, String str6, String str7, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i11 & 4) != 0 ? GrantType.UNKNOWN : grantType, action, str3, str4, str5, str6, str7);
    }
}
