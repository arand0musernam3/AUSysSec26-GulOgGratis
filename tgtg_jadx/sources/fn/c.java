package fn;

import android.content.SharedPreferences;
import android.net.Uri;
import androidx.lifecycle.c1;
import androidx.lifecycle.l1;
import androidx.lifecycle.m1;
import androidx.lifecycle.o0;
import ao.g3;
import ao.m0;
import ao.r1;
import at.c0;
import com.app.tgtg.feature.flashsales.list.FlashSalesListActivity;
import com.app.tgtg.feature.rating.RatingActivity;
import com.app.tgtg.feature.recipegenerator.RecipeGeneratorActivity;
import com.app.tgtg.model.local.AppConstants;
import com.app.tgtg.model.local.GenericErrors;
import com.app.tgtg.model.remote.discover.response.DiscoverBucket;
import com.app.tgtg.model.remote.item.response.HeroComponentResponse;
import com.app.tgtg.model.remote.order.Order;
import com.app.tgtg.model.remote.user.requests.OnboardingUserAddress;
import com.app.tgtg.model.remote.user.response.Address;
import java.net.ConnectException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import retrofit2.HttpException;
import v80.b2;
import v80.f0;
import y80.a2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lfn/c;", "Landroidx/lifecycle/l1;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDiscoverViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiscoverViewModel.kt\ncom/app/tgtg/feature/main/fragments/discover/DiscoverViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,538:1\n363#2,7:539\n1807#2,3:546\n1586#2:549\n1661#2,3:550\n1586#2:553\n1661#2,3:554\n1807#2,3:557\n1#3:560\n*S KotlinDebug\n*F\n+ 1 DiscoverViewModel.kt\ncom/app/tgtg/feature/main/fragments/discover/DiscoverViewModel\n*L\n252#1:539,7\n364#1:546,3\n368#1:549\n368#1:550,3\n372#1:553\n372#1:554,3\n407#1:557,3\n*E\n"})
public final class c extends l1 {
    public final o0 A;
    public final o0 B;
    public final o0 C;
    public final o0 D;
    public final o0 E;
    public final a2 F;
    public final a2 G;
    public final a2 H;
    public final a2 I;
    public DiscoverBucket J;
    public nq.c K;
    public b2 L;
    public final long M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r1 f17794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g3 f17795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cv.b f17796c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m0 f17797d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ft.b f17798e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final rg.d f17799f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final mv.u f17800g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c1 f17801h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final gm.b f17802i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final wj.d f17803j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final jm.b f17804k;
    public final c0 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final d8.f f17805m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final o0 f17806n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final o0 f17807o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final o0 f17808p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final o0 f17809q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final o0 f17810r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final o0 f17811s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final o0 f17812t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final o0 f17813u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final o0 f17814v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final o0 f17815w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final o0 f17816x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final o0 f17817y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final o0 f17818z;

    public c(r1 r1Var, g3 g3Var, cv.b bVar, m0 m0Var, ft.b bVar2, rg.d dVar, mv.u uVar, c1 c1Var, gm.b bVar3, wj.d dVar2, jm.b bVar4, c0 c0Var, d8.f fVar) {
        r1Var.getClass();
        g3Var.getClass();
        bVar.getClass();
        m0Var.getClass();
        bVar2.getClass();
        dVar.getClass();
        uVar.getClass();
        c1Var.getClass();
        bVar3.getClass();
        dVar2.getClass();
        bVar4.getClass();
        c0Var.getClass();
        fVar.getClass();
        this.f17794a = r1Var;
        this.f17795b = g3Var;
        this.f17796c = bVar;
        this.f17797d = m0Var;
        this.f17798e = bVar2;
        this.f17799f = dVar;
        this.f17800g = uVar;
        this.f17801h = c1Var;
        this.f17802i = bVar3;
        this.f17803j = dVar2;
        this.f17804k = bVar4;
        this.l = c0Var;
        this.f17805m = fVar;
        o0 o0Var = new o0();
        this.f17806n = o0Var;
        this.f17807o = o0Var;
        o0 o0Var2 = new o0();
        this.f17808p = o0Var2;
        this.f17809q = o0Var2;
        o0 o0Var3 = new o0();
        this.f17810r = o0Var3;
        this.f17811s = o0Var3;
        o0 o0Var4 = new o0();
        this.f17812t = o0Var4;
        this.f17813u = o0Var4;
        o0 o0Var5 = new o0();
        this.f17814v = o0Var5;
        this.f17815w = o0Var5;
        o0 o0Var6 = new o0();
        this.f17816x = o0Var6;
        this.f17817y = o0Var6;
        o0 o0Var7 = new o0();
        this.f17818z = o0Var7;
        this.A = o0Var7;
        o0 o0Var8 = new o0();
        this.B = o0Var8;
        this.C = o0Var8;
        o0 o0Var9 = new o0();
        this.D = o0Var9;
        this.E = o0Var9;
        a2 a2VarC = y80.r.c(null);
        this.F = a2VarC;
        this.G = a2VarC;
        a2 a2VarC2 = y80.r.c(Boolean.FALSE);
        this.H = a2VarC2;
        this.I = a2VarC2;
        this.M = 500L;
        r1Var.l = (String) c1Var.a("HERO_COMPONENT_IDENTIFIER");
        r1Var.f4428m = (String) c1Var.a("HERO_COMPONENT_PARAMETER");
    }

    public static final void a(c cVar, Throwable th2) {
        o0 o0Var = cVar.f17814v;
        if (th2 instanceof qg.b) {
            if (((qg.b) th2).f37050a) {
                o0Var.k(GenericErrors.LocationServiceNotAvailable.INSTANCE);
                return;
            } else {
                o0Var.k(new GenericErrors.LocationNotAvailable(new a(cVar, 0)));
                return;
            }
        }
        if (th2 instanceof HttpException) {
            o0Var.k(new GenericErrors.UnknownError(new a(cVar, 1)));
            sa0.a.f38953a.d(th2);
        } else if (th2 instanceof UnknownHostException) {
            o0Var.k(GenericErrors.Offline.INSTANCE);
        } else if (th2 instanceof ConnectException) {
            o0Var.k(GenericErrors.Offline.INSTANCE);
        } else {
            o0Var.k(new GenericErrors.UnknownError(new a(cVar, 2)));
            sa0.a.f38953a.d(th2);
        }
    }

    public static final ArrayList b(c cVar, nq.c cVar2) {
        cVar.K = cVar2;
        ArrayList<nq.d> arrayList = new ArrayList(cVar2.f31351a);
        Iterator it = arrayList.iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            }
            if (((nq.d) it.next()) instanceof nq.g) {
                break;
            }
            i11++;
        }
        if (i11 != -1) {
            SharedPreferences sharedPreferencesX = ft.c.x();
            String strY = ft.c.y();
            if (strY == null) {
                strY = null;
            }
            long j9 = sharedPreferencesX.getLong(strY + "_loyaltyCardFirstShownMillis", 0L);
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (j9 == 0) {
                SharedPreferences.Editor editorEdit = ft.c.x().edit();
                String strY2 = ft.c.y();
                editorEdit.putLong((strY2 != null ? strY2 : null) + "_loyaltyCardFirstShownMillis", jCurrentTimeMillis);
                editorEdit.apply();
            } else if (jCurrentTimeMillis - j9 > 2592000000L) {
                arrayList.remove(i11);
                cVar.h();
            }
        }
        for (nq.d dVar : arrayList) {
            if (dVar instanceof DiscoverBucket) {
                DiscoverBucket discoverBucket = (DiscoverBucket) dVar;
                if (Intrinsics.areEqual(discoverBucket.getDisplayType(), "FAVORITES")) {
                    cVar.J = discoverBucket;
                }
            }
        }
        return arrayList;
    }

    public final String c() {
        OnboardingUserAddress onboardingUserAddress;
        Address address;
        Object next;
        jl.b bVarT = ft.c.t();
        List<OnboardingUserAddress> userPointsOfInterests = this.f17795b.m().getUserPointsOfInterests();
        String displayName = null;
        if (userPointsOfInterests != null) {
            Iterator<T> it = userPointsOfInterests.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.areEqual(((OnboardingUserAddress) next).getType(), bVarT.name())) {
                    break;
                }
            }
            onboardingUserAddress = (OnboardingUserAddress) next;
        } else {
            onboardingUserAddress = null;
        }
        if (onboardingUserAddress != null && (address = onboardingUserAddress.getAddress()) != null) {
            displayName = address.getDisplayName();
        }
        if ((displayName == null || StringsKt.H(displayName)) && bVarT == jl.b.OTHER) {
            return ft.c.A();
        }
        if (bVarT == jl.b.GPS) {
            String strA = ft.c.A();
            if (strA != null) {
                return strA;
            }
        } else {
            if (bVarT != jl.b.SELECTED) {
                return displayName;
            }
            String strS = ft.c.s();
            if (strS != null) {
                return strS;
            }
        }
        return "";
    }

    public final LinkedHashSet d() {
        boolean zT = this.f17794a.t();
        ft.b bVar = this.f17798e;
        if (!zT) {
            return bVar.f17903c;
        }
        bVar.f17903c.clear();
        return bVar.f17903c;
    }

    public final void e(String str, String str2, String str3) {
        this.f17804k.f25316a.a(new f70.b(FlashSalesListActivity.class, jb.u.x(new Pair("FILLER_TYPE", str), new Pair("DISPLAY_TYPE", str2), new Pair("TITLE", str3)), false, false, false, null, null, null, null, false, 1020));
    }

    public final void f(Order order, int i11) {
        order.getClass();
        bp.u uVar = bp.u.DISCOVER;
        jm.b bVar = this.f17804k;
        bVar.getClass();
        uVar.getClass();
        bVar.f25316a.a(new f70.b(RatingActivity.class, jb.u.x(new Pair("ORDER", order), new Pair("RATING", Integer.valueOf(i11)), new Pair("SOURCE", uVar)), false, false, false, null, null, null, null, false, 1020));
    }

    public final void g() {
        f70.i iVar = f70.i.DISCOVER;
        jm.b bVar = this.f17804k;
        bVar.getClass();
        iVar.getClass();
        bVar.f25316a.a(new f70.b(RecipeGeneratorActivity.class, jb.u.x(new Pair("ORIGIN", iVar), new Pair("OPEN_SAVED_RECIPES", Boolean.FALSE)), false, false, false, null, null, null, null, false, 1020));
    }

    public final void h() {
        f0.B(m1.d(this), null, null, new b(this, null, 0), 3);
    }

    public final void i(boolean z11, boolean z12) {
        g3 g3Var = this.f17795b;
        g3Var.getClass();
        String strR = ft.c.r();
        boolean zAreEqual = Intrinsics.areEqual(strR, AppConstants.LOCATION_PICKER_YOUR_LOCATION);
        o0 o0Var = this.f17808p;
        o0 o0Var2 = this.f17806n;
        if ((!zAreEqual || g3Var.f4262f.b()) && !Intrinsics.areEqual(strR, AppConstants.LOCATION_PICKER_NO_SELECTED_LOCATION)) {
            if (z12) {
                o0Var.k(Boolean.TRUE);
            } else {
                o0Var2.k(Boolean.TRUE);
            }
            f0.B(m1.d(this), null, null, new b0.v(this, z11, null, 2), 3);
            return;
        }
        Boolean bool = Boolean.FALSE;
        o0Var2.k(bool);
        o0Var.k(bool);
        boolean zAreEqual2 = Intrinsics.areEqual(ft.c.r(), AppConstants.LOCATION_PICKER_NO_SELECTED_LOCATION);
        o0 o0Var3 = this.f17814v;
        if (zAreEqual2) {
            o0Var3.k(new GenericErrors.NoLocationSelected(new eu.a(9)));
        } else {
            o0Var3.k(GenericErrors.LocationServiceNotAvailable.INSTANCE);
        }
    }

    public final void j(String str) {
        str.getClass();
        jm.b bVar = this.f17804k;
        bVar.getClass();
        bVar.f25316a.a(new f70.o(Uri.parse(str)));
    }

    public final boolean k(boolean z11) {
        if (z11) {
            return false;
        }
        a2 a2Var = this.F;
        if (a2Var.getValue() == null) {
            return false;
        }
        HeroComponentResponse heroComponentResponse = (HeroComponentResponse) a2Var.getValue();
        return Intrinsics.areEqual(heroComponentResponse != null ? heroComponentResponse.getContentType() : null, "ITEMS");
    }

    public final void l(List list) {
        list.getClass();
        b2 b2Var = this.L;
        x70.c cVar = null;
        if (b2Var != null) {
            b2Var.a(null);
        }
        this.L = f0.B(m1.d(this), null, null, new d8.c(this, list, cVar, 24), 3);
    }
}
