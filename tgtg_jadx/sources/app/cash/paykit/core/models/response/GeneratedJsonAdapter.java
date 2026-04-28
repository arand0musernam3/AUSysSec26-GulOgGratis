package app.cash.paykit.core.models.response;

import a60.b0;
import a60.h0;
import a60.k;
import a60.n;
import a60.p;
import a60.q;
import app.cash.paykit.core.models.common.Action;
import b60.d;
import b60.f;
import c50.w;
import com.braze.models.Banner;
import com.squareup.moshi.JsonEncodingException;
import fc.a;
import g90.b;
import java.io.EOFException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.p0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: app.cash.paykit.core.models.response.CustomerResponseDataJsonAdapter, reason: from toString */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lapp/cash/paykit/core/models/response/CustomerResponseDataJsonAdapter;", "La60/k;", "Lapp/cash/paykit/core/models/response/CustomerResponseData;", "La60/b0;", "moshi", "<init>", "(La60/b0;)V", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class GeneratedJsonAdapter extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f4696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f4697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f4698c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k f4699d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k f4700e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k f4701f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k f4702g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final k f4703h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final k f4704i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final k f4705j;

    public GeneratedJsonAdapter(@NotNull b0 b0Var) {
        b0Var.getClass();
        this.f4696a = n.a("actions", "auth_flow_triggers", "channel", "id", "origin", "requester_profile", "status", "updated_at", "created_at", Banner.EXPIRATION, "customer_profile", "grants", "reference_id");
        d dVarG = h0.g(Action.class);
        p0 p0Var = p0.f26531a;
        this.f4697b = b0Var.a(dVarG, p0Var, "actions");
        this.f4698c = b0Var.a(AuthFlowTriggers.class, p0Var, "authFlowTriggers");
        this.f4699d = b0Var.a(String.class, p0Var, "channel");
        this.f4700e = b0Var.a(Origin.class, p0Var, "origin");
        this.f4701f = b0Var.a(RequesterProfile.class, p0Var, "requesterProfile");
        this.f4702g = b0Var.a(b.class, p0Var, "updatedAt");
        this.f4703h = b0Var.a(CustomerProfile.class, p0Var, "customerProfile");
        this.f4704i = b0Var.a(h0.g(Grant.class), p0Var, "grants");
        this.f4705j = b0Var.a(a.class, p0Var, "referenceId");
    }

    @Override // a60.k
    public final Object a(p pVar) throws EOFException, JsonEncodingException {
        pVar.getClass();
        pVar.e();
        List list = null;
        AuthFlowTriggers authFlowTriggers = null;
        String str = null;
        String str2 = null;
        Origin origin = null;
        RequesterProfile requesterProfile = null;
        String str3 = null;
        b bVar = null;
        b bVar2 = null;
        b bVar3 = null;
        CustomerProfile customerProfile = null;
        List list2 = null;
        a aVar = null;
        while (true) {
            List list3 = list;
            AuthFlowTriggers authFlowTriggers2 = authFlowTriggers;
            String str4 = str;
            String str5 = str2;
            Origin origin2 = origin;
            RequesterProfile requesterProfile2 = requesterProfile;
            String str6 = str3;
            b bVar4 = bVar;
            b bVar5 = bVar2;
            if (!pVar.G()) {
                b bVar6 = bVar3;
                CustomerProfile customerProfile2 = customerProfile;
                pVar.t();
                if (list3 == null) {
                    throw f.e("actions", "actions", pVar);
                }
                if (str4 == null) {
                    throw f.e("channel", "channel", pVar);
                }
                if (str5 == null) {
                    throw f.e("id", "id", pVar);
                }
                if (origin2 == null) {
                    throw f.e("origin", "origin", pVar);
                }
                if (str6 == null) {
                    throw f.e("status", "status", pVar);
                }
                if (bVar4 == null) {
                    throw f.e("updatedAt", "updated_at", pVar);
                }
                if (bVar5 == null) {
                    throw f.e("createdAt", "created_at", pVar);
                }
                if (bVar6 != null) {
                    return new CustomerResponseData(list3, authFlowTriggers2, str4, str5, origin2, requesterProfile2, str6, bVar4, bVar5, bVar6, customerProfile2, list2, aVar);
                }
                throw f.e("expiresAt", Banner.EXPIRATION, pVar);
            }
            b bVar7 = bVar3;
            int iY0 = pVar.y0(this.f4696a);
            k kVar = this.f4699d;
            CustomerProfile customerProfile3 = customerProfile;
            k kVar2 = this.f4702g;
            switch (iY0) {
                case -1:
                    pVar.z0();
                    pVar.B0();
                    bVar3 = bVar7;
                    list = list3;
                    authFlowTriggers = authFlowTriggers2;
                    str = str4;
                    str2 = str5;
                    origin = origin2;
                    requesterProfile = requesterProfile2;
                    str3 = str6;
                    bVar = bVar4;
                    bVar2 = bVar5;
                    customerProfile = customerProfile3;
                    break;
                case 0:
                    list = (List) this.f4697b.a(pVar);
                    if (list == null) {
                        throw f.j("actions", "actions", pVar);
                    }
                    bVar3 = bVar7;
                    authFlowTriggers = authFlowTriggers2;
                    str = str4;
                    str2 = str5;
                    origin = origin2;
                    requesterProfile = requesterProfile2;
                    str3 = str6;
                    bVar = bVar4;
                    bVar2 = bVar5;
                    customerProfile = customerProfile3;
                    break;
                    break;
                case 1:
                    authFlowTriggers = (AuthFlowTriggers) this.f4698c.a(pVar);
                    bVar3 = bVar7;
                    list = list3;
                    str = str4;
                    str2 = str5;
                    origin = origin2;
                    requesterProfile = requesterProfile2;
                    str3 = str6;
                    bVar = bVar4;
                    bVar2 = bVar5;
                    customerProfile = customerProfile3;
                    break;
                case 2:
                    str = (String) kVar.a(pVar);
                    if (str == null) {
                        throw f.j("channel", "channel", pVar);
                    }
                    bVar3 = bVar7;
                    list = list3;
                    authFlowTriggers = authFlowTriggers2;
                    str2 = str5;
                    origin = origin2;
                    requesterProfile = requesterProfile2;
                    str3 = str6;
                    bVar = bVar4;
                    bVar2 = bVar5;
                    customerProfile = customerProfile3;
                    break;
                    break;
                case 3:
                    str2 = (String) kVar.a(pVar);
                    if (str2 == null) {
                        throw f.j("id", "id", pVar);
                    }
                    bVar3 = bVar7;
                    list = list3;
                    authFlowTriggers = authFlowTriggers2;
                    str = str4;
                    origin = origin2;
                    requesterProfile = requesterProfile2;
                    str3 = str6;
                    bVar = bVar4;
                    bVar2 = bVar5;
                    customerProfile = customerProfile3;
                    break;
                    break;
                case 4:
                    origin = (Origin) this.f4700e.a(pVar);
                    if (origin == null) {
                        throw f.j("origin", "origin", pVar);
                    }
                    bVar3 = bVar7;
                    list = list3;
                    authFlowTriggers = authFlowTriggers2;
                    str = str4;
                    str2 = str5;
                    requesterProfile = requesterProfile2;
                    str3 = str6;
                    bVar = bVar4;
                    bVar2 = bVar5;
                    customerProfile = customerProfile3;
                    break;
                    break;
                case 5:
                    requesterProfile = (RequesterProfile) this.f4701f.a(pVar);
                    bVar3 = bVar7;
                    list = list3;
                    authFlowTriggers = authFlowTriggers2;
                    str = str4;
                    str2 = str5;
                    origin = origin2;
                    str3 = str6;
                    bVar = bVar4;
                    bVar2 = bVar5;
                    customerProfile = customerProfile3;
                    break;
                case 6:
                    str3 = (String) kVar.a(pVar);
                    if (str3 == null) {
                        throw f.j("status", "status", pVar);
                    }
                    bVar3 = bVar7;
                    list = list3;
                    authFlowTriggers = authFlowTriggers2;
                    str = str4;
                    str2 = str5;
                    origin = origin2;
                    requesterProfile = requesterProfile2;
                    bVar = bVar4;
                    bVar2 = bVar5;
                    customerProfile = customerProfile3;
                    break;
                    break;
                case 7:
                    bVar = (b) kVar2.a(pVar);
                    if (bVar == null) {
                        throw f.j("updatedAt", "updated_at", pVar);
                    }
                    bVar3 = bVar7;
                    list = list3;
                    authFlowTriggers = authFlowTriggers2;
                    str = str4;
                    str2 = str5;
                    origin = origin2;
                    requesterProfile = requesterProfile2;
                    str3 = str6;
                    bVar2 = bVar5;
                    customerProfile = customerProfile3;
                    break;
                    break;
                case 8:
                    bVar2 = (b) kVar2.a(pVar);
                    if (bVar2 == null) {
                        throw f.j("createdAt", "created_at", pVar);
                    }
                    bVar3 = bVar7;
                    list = list3;
                    authFlowTriggers = authFlowTriggers2;
                    str = str4;
                    str2 = str5;
                    origin = origin2;
                    requesterProfile = requesterProfile2;
                    str3 = str6;
                    bVar = bVar4;
                    customerProfile = customerProfile3;
                    break;
                    break;
                case 9:
                    bVar3 = (b) kVar2.a(pVar);
                    if (bVar3 == null) {
                        throw f.j("expiresAt", Banner.EXPIRATION, pVar);
                    }
                    list = list3;
                    authFlowTriggers = authFlowTriggers2;
                    str = str4;
                    str2 = str5;
                    origin = origin2;
                    requesterProfile = requesterProfile2;
                    str3 = str6;
                    bVar = bVar4;
                    bVar2 = bVar5;
                    customerProfile = customerProfile3;
                    break;
                case 10:
                    customerProfile = (CustomerProfile) this.f4703h.a(pVar);
                    bVar3 = bVar7;
                    list = list3;
                    authFlowTriggers = authFlowTriggers2;
                    str = str4;
                    str2 = str5;
                    origin = origin2;
                    requesterProfile = requesterProfile2;
                    str3 = str6;
                    bVar = bVar4;
                    bVar2 = bVar5;
                    break;
                case 11:
                    list2 = (List) this.f4704i.a(pVar);
                    bVar3 = bVar7;
                    list = list3;
                    authFlowTriggers = authFlowTriggers2;
                    str = str4;
                    str2 = str5;
                    origin = origin2;
                    requesterProfile = requesterProfile2;
                    str3 = str6;
                    bVar = bVar4;
                    bVar2 = bVar5;
                    customerProfile = customerProfile3;
                    break;
                case 12:
                    aVar = (a) this.f4705j.a(pVar);
                    bVar3 = bVar7;
                    list = list3;
                    authFlowTriggers = authFlowTriggers2;
                    str = str4;
                    str2 = str5;
                    origin = origin2;
                    requesterProfile = requesterProfile2;
                    str3 = str6;
                    bVar = bVar4;
                    bVar2 = bVar5;
                    customerProfile = customerProfile3;
                    break;
                default:
                    bVar3 = bVar7;
                    list = list3;
                    authFlowTriggers = authFlowTriggers2;
                    str = str4;
                    str2 = str5;
                    origin = origin2;
                    requesterProfile = requesterProfile2;
                    str3 = str6;
                    bVar = bVar4;
                    bVar2 = bVar5;
                    customerProfile = customerProfile3;
                    break;
            }
        }
    }

    @Override // a60.k
    public final void e(q qVar, Object obj) {
        CustomerResponseData customerResponseData = (CustomerResponseData) obj;
        qVar.getClass();
        if (customerResponseData == null) {
            w.l("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        qVar.g();
        qVar.u("actions");
        this.f4697b.e(qVar, customerResponseData.f4684a);
        qVar.u("auth_flow_triggers");
        this.f4698c.e(qVar, customerResponseData.f4685b);
        qVar.u("channel");
        String str = customerResponseData.f4686c;
        k kVar = this.f4699d;
        kVar.e(qVar, str);
        qVar.u("id");
        kVar.e(qVar, customerResponseData.f4687d);
        qVar.u("origin");
        this.f4700e.e(qVar, customerResponseData.f4688e);
        qVar.u("requester_profile");
        this.f4701f.e(qVar, customerResponseData.f4689f);
        qVar.u("status");
        kVar.e(qVar, customerResponseData.f4690g);
        qVar.u("updated_at");
        b bVar = customerResponseData.f4691h;
        k kVar2 = this.f4702g;
        kVar2.e(qVar, bVar);
        qVar.u("created_at");
        kVar2.e(qVar, customerResponseData.f4692i);
        qVar.u(Banner.EXPIRATION);
        kVar2.e(qVar, customerResponseData.f4693j);
        qVar.u("customer_profile");
        this.f4703h.e(qVar, customerResponseData.f4694k);
        qVar.u("grants");
        this.f4704i.e(qVar, customerResponseData.l);
        qVar.u("reference_id");
        this.f4705j.e(qVar, customerResponseData.f4695m);
        qVar.r();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(42);
        sb2.append("GeneratedJsonAdapter(CustomerResponseData)");
        return sb2.toString();
    }
}
