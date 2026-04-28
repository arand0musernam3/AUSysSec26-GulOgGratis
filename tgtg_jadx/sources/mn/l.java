package mn;

import android.os.Bundle;
import androidx.lifecycle.l1;
import ao.g3;
import at.c0;
import com.app.tgtg.feature.recipegenerator.RecipeGeneratorActivity;
import com.app.tgtg.feature.tabprofile.manageaccount.vouchers.VoucherActivity;
import com.app.tgtg.model.remote.VoucherId;
import com.app.tgtg.model.remote.profile.response.LoyaltyCardDetails;
import com.app.tgtg.model.remote.profile.response.ProfileFeature;
import com.app.tgtg.model.remote.profile.response.ProfileFeatureState;
import et.z;
import jp.q;
import kotlin.Metadata;
import kotlin.Pair;
import mv.u;
import y80.a2;
import y80.h1;
import y80.r;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lmn/l;", "Landroidx/lifecycle/l1;", "mn/e", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l extends l1 {
    public final h1 A;
    public final a2 B;
    public final h1 C;
    public final a2 D;
    public final h1 E;
    public ProfileFeatureState F;
    public boolean G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g3 f30019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ln.i f30020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z f30021c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q f30022d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final gm.b f30023e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final cv.b f30024f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final u f30025g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final hv.b f30026h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final jn.a f30027i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final c0 f30028j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final d8.f f30029k;
    public final a2 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final a2 f30030m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final a2 f30031n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final a2 f30032o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final a2 f30033p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final a2 f30034q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final a2 f30035r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final a2 f30036s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final a2 f30037t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final a2 f30038u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final a2 f30039v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final a2 f30040w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final a2 f30041x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final a2 f30042y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final a2 f30043z;

    public l(g3 g3Var, ln.i iVar, z zVar, q qVar, gm.b bVar, cv.b bVar2, mv.b bVar3, u uVar, hv.b bVar4, jn.a aVar, c0 c0Var, d8.f fVar) {
        g3Var.getClass();
        iVar.getClass();
        zVar.getClass();
        qVar.getClass();
        bVar.getClass();
        bVar2.getClass();
        bVar3.getClass();
        uVar.getClass();
        bVar4.getClass();
        aVar.getClass();
        c0Var.getClass();
        fVar.getClass();
        this.f30019a = g3Var;
        this.f30020b = iVar;
        this.f30021c = zVar;
        this.f30022d = qVar;
        this.f30023e = bVar;
        this.f30024f = bVar2;
        this.f30025g = uVar;
        this.f30026h = bVar4;
        this.f30027i = aVar;
        this.f30028j = c0Var;
        this.f30029k = fVar;
        a2 a2VarC = r.c(0);
        this.l = a2VarC;
        this.f30030m = a2VarC;
        a2 a2VarC2 = r.c(0);
        this.f30031n = a2VarC2;
        this.f30032o = a2VarC2;
        a2 a2VarC3 = r.c(null);
        this.f30033p = a2VarC3;
        this.f30034q = a2VarC3;
        a2 a2VarC4 = r.c(null);
        this.f30035r = a2VarC4;
        this.f30036s = a2VarC4;
        a2 a2VarC5 = r.c(null);
        this.f30037t = a2VarC5;
        this.f30038u = a2VarC5;
        a2 a2VarC6 = r.c(null);
        this.f30039v = a2VarC6;
        this.f30040w = a2VarC6;
        a2 a2VarC7 = r.c(null);
        this.f30041x = a2VarC7;
        this.f30042y = a2VarC7;
        Boolean bool = Boolean.FALSE;
        a2 a2VarC8 = r.c(bool);
        this.f30043z = a2VarC8;
        this.A = new h1(a2VarC8);
        a2 a2VarC9 = r.c(bool);
        this.B = a2VarC9;
        this.C = new h1(a2VarC9);
        a2 a2VarC10 = r.c(bool);
        this.D = a2VarC10;
        this.E = new h1(a2VarC10);
    }

    public static dv.b a(ProfileFeature profileFeature) {
        profileFeature.getClass();
        LoyaltyCardDetails loyaltyCardDetails = profileFeature.getLoyaltyCardDetails();
        if (loyaltyCardDetails != null) {
            return h0.g.E(new Pair(dv.a.LOYALTY_CARD_STATE, new dv.c(profileFeature.getFeatureState().name())), new Pair(dv.a.LOYALTY_CARD_STAMPS, new dv.c(Integer.valueOf(loyaltyCardDetails.getOrderCount()))));
        }
        return null;
    }

    public final void b(boolean z11) {
        f70.i iVar = f70.i.PROFILE;
        jn.a aVar = this.f30027i;
        aVar.getClass();
        iVar.getClass();
        aVar.f25317a.a(new f70.b(RecipeGeneratorActivity.class, jb.u.x(new Pair("ORIGIN", iVar), new Pair("OPEN_SAVED_RECIPES", Boolean.valueOf(z11))), false, false, false, null, null, null, null, false, 1020));
    }

    public final void c(String str) {
        f70.g gVar = this.f30027i.f25317a;
        Bundle bundle = new Bundle(0);
        if (str != null) {
            bundle.putParcelable("VOUCHER_ID", VoucherId.m298boximpl(str));
        }
        gVar.a(new f70.b(VoucherActivity.class, bundle, false, false, false, null, null, null, null, false, 1020));
    }

    public final void d(cv.i iVar, dv.a aVar, Object obj) {
        iVar.getClass();
        aVar.getClass();
        this.f30024f.d(iVar, aVar, obj);
    }
}
