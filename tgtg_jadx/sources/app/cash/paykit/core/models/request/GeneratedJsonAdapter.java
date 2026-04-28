package app.cash.paykit.core.models.request;

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
import com.squareup.moshi.JsonEncodingException;
import fc.a;
import java.io.EOFException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.p0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: app.cash.paykit.core.models.request.CustomerRequestDataJsonAdapter, reason: from toString */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lapp/cash/paykit/core/models/request/CustomerRequestDataJsonAdapter;", "La60/k;", "Lapp/cash/paykit/core/models/request/CustomerRequestData;", "La60/b0;", "moshi", "<init>", "(La60/b0;)V", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class GeneratedJsonAdapter extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f4658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f4659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f4660c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k f4661d;

    public GeneratedJsonAdapter(@NotNull b0 b0Var) {
        b0Var.getClass();
        this.f4658a = n.a("actions", "channel", "redirect_url", "reference_id");
        d dVarG = h0.g(Action.class);
        p0 p0Var = p0.f26531a;
        this.f4659b = b0Var.a(dVarG, p0Var, "actions");
        this.f4660c = b0Var.a(String.class, p0Var, "channel");
        this.f4661d = b0Var.a(a.class, p0Var, "redirectUri");
    }

    @Override // a60.k
    public final Object a(p pVar) throws EOFException, JsonEncodingException {
        pVar.getClass();
        pVar.e();
        List list = null;
        String str = null;
        a aVar = null;
        a aVar2 = null;
        while (pVar.G()) {
            int iY0 = pVar.y0(this.f4658a);
            if (iY0 == -1) {
                pVar.z0();
                pVar.B0();
            } else if (iY0 == 0) {
                list = (List) this.f4659b.a(pVar);
                if (list == null) {
                    throw f.j("actions", "actions", pVar);
                }
            } else if (iY0 != 1) {
                k kVar = this.f4661d;
                if (iY0 == 2) {
                    aVar = (a) kVar.a(pVar);
                } else if (iY0 == 3) {
                    aVar2 = (a) kVar.a(pVar);
                }
            } else {
                str = (String) this.f4660c.a(pVar);
            }
        }
        pVar.t();
        if (list != null) {
            return new CustomerRequestData(list, str, aVar, aVar2);
        }
        throw f.e("actions", "actions", pVar);
    }

    @Override // a60.k
    public final void e(q qVar, Object obj) {
        CustomerRequestData customerRequestData = (CustomerRequestData) obj;
        qVar.getClass();
        if (customerRequestData == null) {
            w.l("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        qVar.g();
        qVar.u("actions");
        this.f4659b.e(qVar, customerRequestData.f4654a);
        qVar.u("channel");
        this.f4660c.e(qVar, customerRequestData.f4655b);
        qVar.u("redirect_url");
        a aVar = customerRequestData.f4656c;
        k kVar = this.f4661d;
        kVar.e(qVar, aVar);
        qVar.u("reference_id");
        kVar.e(qVar, customerRequestData.f4657d);
        qVar.r();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(41);
        sb2.append("GeneratedJsonAdapter(CustomerRequestData)");
        return sb2.toString();
    }
}
