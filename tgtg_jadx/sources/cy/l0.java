package cy;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.o0;
import org.jetbrains.annotations.NotNull;
import tx.n0;
import tx.u0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class l0 extends g0 {

    @NotNull
    public static final Parcelable.Creator<l0> CREATOR = new b(9);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public u0 f13533e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f13534f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f13535g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ax.k f13536h;

    public l0(Parcel parcel) {
        super(1, parcel);
        this.f13535g = "web_view";
        this.f13536h = ax.k.WEB_VIEW;
        this.f13534f = parcel.readString();
    }

    @Override // cy.c0
    public final void b() {
        u0 u0Var = this.f13533e;
        if (u0Var != null) {
            if (u0Var != null) {
                u0Var.cancel();
            }
            this.f13533e = null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // cy.c0
    public final String e() {
        return this.f13535g;
    }

    @Override // cy.c0
    public final int k(r rVar) {
        o0 o0Var;
        u0 u0Var;
        Uri uriA;
        rVar.getClass();
        String str = rVar.f13557e;
        Bundle bundleN = n(rVar);
        l(bundleN, rVar);
        w2.z zVar = new w2.z(25, this, rVar);
        String strT = b0.z.t();
        this.f13534f = strT;
        a("e2e", strT);
        o0 o0VarE = d().e();
        if (o0VarE == null) {
            return 0;
        }
        boolean zU = n0.u(o0VarE);
        String str2 = rVar.f13556d;
        str2.getClass();
        tx.j.m(str2, "applicationId");
        String str3 = this.f13534f;
        str3.getClass();
        String str4 = zU ? "fbconnect://chrome_os_success" : "fbconnect://success";
        String str5 = rVar.f13562j;
        str5.getClass();
        q qVar = rVar.f13553a;
        qVar.getClass();
        f0 f0Var = rVar.f13565n;
        f0Var.getClass();
        boolean z11 = rVar.f13566o;
        boolean z12 = rVar.f13567p;
        boolean z13 = str == null || str.length() == 0;
        if (!bundleN.containsKey("redirect_uri")) {
            bundleN.putString("redirect_uri", str4);
        }
        bundleN.putString("client_id", str2);
        bundleN.putString("e2e", str3);
        bundleN.putString("response_type", f0Var == f0.INSTAGRAM ? "token,signed_request,graph_domain,granted_scopes" : "token,signed_request,graph_domain");
        bundleN.putString("return_scopes", "true");
        bundleN.putString("auth_type", str5);
        bundleN.putString("login_behavior", qVar.name());
        if (z11) {
            bundleN.putString("fx_app", f0Var.toString());
        }
        if (z12) {
            bundleN.putString("skip_dedupe", "true");
        }
        if (z13) {
            int i11 = u0.f40557m;
            u0.b(o0VarE);
            o0Var = o0VarE;
            u0Var = new u0(o0Var, "oauth", bundleN, f0Var, zVar);
        } else {
            int i12 = k0.f13528o;
            str.getClass();
            Bundle bundle = new Bundle(bundleN);
            bundle.putString("display", "touch");
            bundle.putString("client_id", ax.a0.b());
            bundle.putString("sdk", "android-18.2.3");
            if (j0.$EnumSwitchMapping$0[f0Var.ordinal()] == 1) {
                uriA = n0.a(tx.j.e(), "oauth/authorize", bundle);
            } else {
                uriA = n0.a(tx.j.d(), ax.a0.d() + "/dialog/oauth", bundle);
            }
            u0.b(o0VarE);
            String string = uriA.toString();
            string.getClass();
            k0 k0Var = new k0(o0VarE, string, str);
            k0Var.f40560c = zVar;
            o0Var = o0VarE;
            u0Var = k0Var;
        }
        this.f13533e = u0Var;
        tx.l lVar = new tx.l();
        lVar.setRetainInstance(true);
        lVar.f40527a = this.f13533e;
        lVar.show(o0Var.getSupportFragmentManager(), "FacebookDialogFragment");
        return 1;
    }

    @Override // cy.g0
    public final ax.k p() {
        return this.f13536h;
    }

    @Override // cy.c0, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.getClass();
        super.writeToParcel(parcel, i11);
        parcel.writeString(this.f13534f);
    }

    public l0(u uVar) {
        this.f13491b = uVar;
        this.f13535g = "web_view";
        this.f13536h = ax.k.WEB_VIEW;
    }
}
