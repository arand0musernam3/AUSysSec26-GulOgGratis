package cy;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.o0;
import com.facebook.CustomTabMainActivity;
import java.math.BigInteger;
import java.security.SecureRandom;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import tx.n0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c extends g0 {

    @NotNull
    public static final Parcelable.Creator<c> CREATOR = new b(0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static boolean f13484j;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f13485e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f13486f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f13487g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f13488h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ax.k f13489i;

    public c(u uVar) {
        this.f13491b = uVar;
        this.f13488h = "custom_tab";
        this.f13489i = ax.k.CHROME_CUSTOM_TAB;
        String string = new BigInteger(100, new SecureRandom()).toString(32);
        string.getClass();
        this.f13486f = string;
        f13484j = false;
        this.f13487g = tx.j.g(super.f());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // cy.c0
    public final String e() {
        return this.f13488h;
    }

    @Override // cy.c0
    public final String f() {
        return this.f13487g;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000e  */
    @Override // cy.g0, cy.c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h(int r7, int r8, android.content.Intent r9) {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cy.c.h(int, int, android.content.Intent):boolean");
    }

    @Override // cy.c0
    public final void j(JSONObject jSONObject) throws JSONException {
        jSONObject.put("7_challenge", this.f13486f);
    }

    @Override // cy.c0
    public final int k(r rVar) {
        Uri uriA;
        rVar.getClass();
        f0 f0Var = rVar.f13565n;
        u uVarD = d();
        if (this.f13487g.length() == 0) {
            return 0;
        }
        Bundle bundleN = n(rVar);
        l(bundleN, rVar);
        if (f13484j) {
            bundleN.putString("cct_over_app_switch", "1");
        }
        if (ax.a0.f4861n) {
            if (f0Var == f0.INSTAGRAM) {
                oz.m mVar = d.f13492b;
                if (Intrinsics.areEqual("oauth", "oauth")) {
                    uriA = n0.a(tx.j.e(), "oauth/authorize", bundleN);
                } else {
                    uriA = n0.a(tx.j.e(), ax.a0.d() + "/dialog/oauth", bundleN);
                }
                android.support.v4.media.session.a.D(uriA);
            } else {
                oz.m mVar2 = d.f13492b;
                android.support.v4.media.session.a.D(n0.a(tx.j.d(), ax.a0.d() + "/dialog/oauth", bundleN));
            }
        }
        o0 o0VarE = uVarD.e();
        if (o0VarE == null) {
            return 0;
        }
        Intent intent = new Intent(o0VarE, (Class<?>) CustomTabMainActivity.class);
        int i11 = CustomTabMainActivity.f10978c;
        intent.putExtra("CustomTabMainActivity.extra_action", "oauth");
        intent.putExtra("CustomTabMainActivity.extra_params", bundleN);
        String strB = this.f13485e;
        if (strB == null) {
            strB = tx.j.b();
            this.f13485e = strB;
        }
        intent.putExtra("CustomTabMainActivity.extra_chromePackage", strB);
        intent.putExtra("CustomTabMainActivity.extra_targetApp", f0Var.toString());
        v vVar = uVarD.f13582c;
        if (vVar != null) {
            vVar.startActivityForResult(intent, 1);
        }
        return 1;
    }

    @Override // cy.g0
    public final void l(Bundle bundle, r rVar) {
        rVar.getClass();
        super.l(bundle, rVar);
        String str = rVar.f13558f;
        String strConcat = rVar.f13557e;
        if (strConcat == null || strConcat.length() == 0) {
            strConcat = (str == null || str.length() == 0) ? this.f13487g : "intent://".concat(str);
        }
        bundle.putString("redirect_uri", strConcat);
    }

    @Override // cy.g0
    public final String o() {
        return "chrome_custom_tab";
    }

    @Override // cy.g0
    public final ax.k p() {
        return this.f13489i;
    }

    @Override // cy.c0, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.getClass();
        super.writeToParcel(parcel, i11);
        parcel.writeString(this.f13486f);
    }

    public c(Parcel parcel) {
        super(1, parcel);
        this.f13488h = "custom_tab";
        this.f13489i = ax.k.CHROME_CUSTOM_TAB;
        this.f13486f = parcel.readString();
        this.f13487g = tx.j.g(super.f());
    }
}
