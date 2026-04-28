package app.cash.paykit.core.models.response;

import a60.i;
import a60.l;
import app.cash.paykit.core.models.common.Action;
import com.braze.models.Banner;
import fc.a;
import g90.b;
import j4.s;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@l(generateAdapter = true)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u009f\u0001\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\t\u001a\u00020\u0007\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u0007\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u000f\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u000f\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0010\b\u0001\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ¨\u0001\u0010\u001b\u001a\u00020\u00002\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\b\u001a\u00020\u00072\b\b\u0003\u0010\t\u001a\u00020\u00072\b\b\u0003\u0010\u000b\u001a\u00020\n2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0003\u0010\u000e\u001a\u00020\u00072\b\b\u0003\u0010\u0010\u001a\u00020\u000f2\b\b\u0003\u0010\u0011\u001a\u00020\u000f2\b\b\u0003\u0010\u0012\u001a\u00020\u000f2\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0010\b\u0003\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00022\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lapp/cash/paykit/core/models/response/CustomerResponseData;", "", "", "Lapp/cash/paykit/core/models/common/Action;", "actions", "Lapp/cash/paykit/core/models/response/AuthFlowTriggers;", "authFlowTriggers", "", "channel", "id", "Lapp/cash/paykit/core/models/response/Origin;", "origin", "Lapp/cash/paykit/core/models/response/RequesterProfile;", "requesterProfile", "status", "Lg90/b;", "updatedAt", "createdAt", "expiresAt", "Lapp/cash/paykit/core/models/response/CustomerProfile;", "customerProfile", "Lapp/cash/paykit/core/models/response/Grant;", "grants", "Lfc/a;", "referenceId", "<init>", "(Ljava/util/List;Lapp/cash/paykit/core/models/response/AuthFlowTriggers;Ljava/lang/String;Ljava/lang/String;Lapp/cash/paykit/core/models/response/Origin;Lapp/cash/paykit/core/models/response/RequesterProfile;Ljava/lang/String;Lg90/b;Lg90/b;Lg90/b;Lapp/cash/paykit/core/models/response/CustomerProfile;Ljava/util/List;Lfc/a;)V", "copy", "(Ljava/util/List;Lapp/cash/paykit/core/models/response/AuthFlowTriggers;Ljava/lang/String;Ljava/lang/String;Lapp/cash/paykit/core/models/response/Origin;Lapp/cash/paykit/core/models/response/RequesterProfile;Ljava/lang/String;Lg90/b;Lg90/b;Lg90/b;Lapp/cash/paykit/core/models/response/CustomerProfile;Ljava/util/List;Lfc/a;)Lapp/cash/paykit/core/models/response/CustomerResponseData;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class CustomerResponseData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f4684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AuthFlowTriggers f4685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f4686c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f4687d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Origin f4688e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final RequesterProfile f4689f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f4690g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b f4691h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b f4692i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b f4693j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final CustomerProfile f4694k;
    public final List l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final a f4695m;

    public CustomerResponseData(@i(name = "actions") @NotNull List<Action> list, @i(name = "auth_flow_triggers") @Nullable AuthFlowTriggers authFlowTriggers, @i(name = "channel") @NotNull String str, @i(name = "id") @NotNull String str2, @i(name = "origin") @NotNull Origin origin, @i(name = "requester_profile") @Nullable RequesterProfile requesterProfile, @i(name = "status") @NotNull String str3, @i(name = "updated_at") @NotNull b bVar, @i(name = "created_at") @NotNull b bVar2, @i(name = Banner.EXPIRATION) @NotNull b bVar3, @i(name = "customer_profile") @Nullable CustomerProfile customerProfile, @i(name = "grants") @Nullable List<Grant> list2, @i(name = "reference_id") @Nullable a aVar) {
        list.getClass();
        str.getClass();
        str2.getClass();
        origin.getClass();
        str3.getClass();
        bVar.getClass();
        bVar2.getClass();
        bVar3.getClass();
        this.f4684a = list;
        this.f4685b = authFlowTriggers;
        this.f4686c = str;
        this.f4687d = str2;
        this.f4688e = origin;
        this.f4689f = requesterProfile;
        this.f4690g = str3;
        this.f4691h = bVar;
        this.f4692i = bVar2;
        this.f4693j = bVar3;
        this.f4694k = customerProfile;
        this.l = list2;
        this.f4695m = aVar;
    }

    @NotNull
    public final CustomerResponseData copy(@i(name = "actions") @NotNull List<Action> actions, @i(name = "auth_flow_triggers") @Nullable AuthFlowTriggers authFlowTriggers, @i(name = "channel") @NotNull String channel, @i(name = "id") @NotNull String id2, @i(name = "origin") @NotNull Origin origin, @i(name = "requester_profile") @Nullable RequesterProfile requesterProfile, @i(name = "status") @NotNull String status, @i(name = "updated_at") @NotNull b updatedAt, @i(name = "created_at") @NotNull b createdAt, @i(name = Banner.EXPIRATION) @NotNull b expiresAt, @i(name = "customer_profile") @Nullable CustomerProfile customerProfile, @i(name = "grants") @Nullable List<Grant> grants, @i(name = "reference_id") @Nullable a referenceId) {
        actions.getClass();
        channel.getClass();
        id2.getClass();
        origin.getClass();
        status.getClass();
        updatedAt.getClass();
        createdAt.getClass();
        expiresAt.getClass();
        return new CustomerResponseData(actions, authFlowTriggers, channel, id2, origin, requesterProfile, status, updatedAt, createdAt, expiresAt, customerProfile, grants, referenceId);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomerResponseData)) {
            return false;
        }
        CustomerResponseData customerResponseData = (CustomerResponseData) obj;
        return Intrinsics.areEqual(this.f4684a, customerResponseData.f4684a) && Intrinsics.areEqual(this.f4685b, customerResponseData.f4685b) && Intrinsics.areEqual(this.f4686c, customerResponseData.f4686c) && Intrinsics.areEqual(this.f4687d, customerResponseData.f4687d) && Intrinsics.areEqual(this.f4688e, customerResponseData.f4688e) && Intrinsics.areEqual(this.f4689f, customerResponseData.f4689f) && Intrinsics.areEqual(this.f4690g, customerResponseData.f4690g) && Intrinsics.areEqual(this.f4691h, customerResponseData.f4691h) && Intrinsics.areEqual(this.f4692i, customerResponseData.f4692i) && Intrinsics.areEqual(this.f4693j, customerResponseData.f4693j) && Intrinsics.areEqual(this.f4694k, customerResponseData.f4694k) && Intrinsics.areEqual(this.l, customerResponseData.l) && Intrinsics.areEqual(this.f4695m, customerResponseData.f4695m);
    }

    public final int hashCode() {
        int iHashCode = this.f4684a.hashCode() * 31;
        AuthFlowTriggers authFlowTriggers = this.f4685b;
        int iHashCode2 = (this.f4688e.hashCode() + l1.b(l1.b((iHashCode + (authFlowTriggers == null ? 0 : authFlowTriggers.hashCode())) * 31, 31, this.f4686c), 31, this.f4687d)) * 31;
        RequesterProfile requesterProfile = this.f4689f;
        int iHashCode3 = (this.f4693j.f20262a.hashCode() + ((this.f4692i.f20262a.hashCode() + ((this.f4691h.f20262a.hashCode() + l1.b((iHashCode2 + (requesterProfile == null ? 0 : requesterProfile.hashCode())) * 31, 31, this.f4690g)) * 31)) * 31)) * 31;
        CustomerProfile customerProfile = this.f4694k;
        int iHashCode4 = (iHashCode3 + (customerProfile == null ? 0 : customerProfile.hashCode())) * 31;
        List list = this.l;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        a aVar = this.f4695m;
        return iHashCode5 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CustomerResponseData(actions=");
        sb2.append(this.f4684a);
        sb2.append(", authFlowTriggers=");
        sb2.append(this.f4685b);
        sb2.append(", channel=");
        s.A(sb2, this.f4686c, ", id=", this.f4687d, ", origin=");
        sb2.append(this.f4688e);
        sb2.append(", requesterProfile=");
        sb2.append(this.f4689f);
        sb2.append(", status=");
        sb2.append(this.f4690g);
        sb2.append(", updatedAt=");
        sb2.append(this.f4691h);
        sb2.append(", createdAt=");
        sb2.append(this.f4692i);
        sb2.append(", expiresAt=");
        sb2.append(this.f4693j);
        sb2.append(", customerProfile=");
        sb2.append(this.f4694k);
        sb2.append(", grants=");
        sb2.append(this.l);
        sb2.append(", referenceId=");
        sb2.append(this.f4695m);
        sb2.append(")");
        return sb2.toString();
    }
}
