package m1;

import a3.i3;
import android.animation.AnimatorSet;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.core.internal.CameraUseCaseAdapter$CameraException;
import androidx.core.view.MenuProvider;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.viewpager2.widget.ViewPager2;
import ax.a0;
import com.app.tgtg.model.remote.item.response.BasicItem;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.internal.measurement.cg;
import com.google.android.material.bottomappbar.BottomAppBar;
import e20.k0;
import e20.l0;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.collections.i1;
import kotlin.jvm.internal.StringCompanionObject;
import o.j;
import o.l;
import o.w;
import oa0.k;
import q1.z;
import q90.r0;
import qz.q;
import retrofit2.HttpException;
import s0.g0;
import t1.p;
import t1.y;
import tx.d0;
import tx.n0;
import u70.o;
import w4.v;
import w4.x;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class a implements k, k0, oa0.f, oa0.g, w, j, q, p, t10.f, n50.d, AccessibilityViewCommand, e6.j, xc.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f28697a;

    public a(Bundle bundle, String str) {
        Uri uriA;
        bundle = bundle == null ? new Bundle() : bundle;
        d0[] d0VarArrValues = d0.values();
        ArrayList arrayList = new ArrayList(d0VarArrValues.length);
        for (d0 d0Var : d0VarArrValues) {
            arrayList.add(d0Var.a());
        }
        if (arrayList.contains(str)) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            a0 a0Var = a0.f4849a;
            uriA = n0.a(String.format("%s", Arrays.copyOf(new Object[]{"fb.gg"}, 1)), "/dialog/".concat(str), bundle);
        } else {
            uriA = n0.a(tx.j.d(), a0.d() + "/dialog/" + str, bundle);
        }
        this.f28697a = uriA;
    }

    public static dv.b g(String str, Boolean bool, dv.d dVar) {
        Pair pair = new Pair(dv.a.CLICK_FROM, new dv.c(dVar != null ? dVar.a() : null));
        Pair pair2 = new Pair(dv.a.ITEM_ID, new dv.c(str));
        dv.a aVar = dv.a.CURRENT_STATE;
        dv.d dVar2 = bool != null ? bool.booleanValue() ? dv.d.ON : dv.d.OFF : null;
        return h0.g.E(pair, pair2, new Pair(aVar, new dv.c(dVar2 != null ? dVar2.a() : null)));
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static q0.e t(n0.b r7, java.util.List r8) {
        /*
            Method dump skipped, instruction units count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.a.t(n0.b, java.util.List):q0.e");
    }

    public rc.g a() {
        rc.c cVarG;
        c40.q qVar = (c40.q) this.f28697a;
        rc.e eVar = (rc.e) qVar.f7095e;
        synchronized (eVar) {
            qVar.c(true);
            cVarG = eVar.g(((rc.b) qVar.f7093c).f37859a);
        }
        if (cVarG != null) {
            return new rc.g(cVarG, 0);
        }
        return null;
    }

    @Override // qz.q
    public void accept(Object obj, Object obj2) {
        d10.g gVar = (d10.g) obj2;
        sz.a aVar = (sz.a) ((sz.c) obj).getService();
        t tVar = (t) this.f28697a;
        aVar.getClass();
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(aVar.f11628i);
        int i11 = h00.a.f20992a;
        if (tVar == null) {
            parcelObtain.writeInt(0);
        } else {
            parcelObtain.writeInt(1);
            tVar.writeToParcel(parcelObtain, 0);
        }
        try {
            aVar.f11627h.transact(1, parcelObtain, null, 1);
            parcelObtain.recycle();
            gVar.b(null);
        } catch (Throwable th2) {
            parcelObtain.recycle();
            throw th2;
        }
    }

    @Override // xc.h
    public xc.c b(xc.b bVar) {
        return null;
    }

    @Override // androidx.core.view.accessibility.AccessibilityViewCommand
    public boolean d(View view) {
        wa.j jVar = (wa.j) this.f28697a;
        int currentItem = ((ViewPager2) view).getCurrentItem() - 1;
        ViewPager2 viewPager2 = jVar.f43370g;
        if (viewPager2.f4130r) {
            viewPager2.d(currentItem, true);
        }
        return true;
    }

    @Override // e20.k0
    public WindowInsetsCompat e(View view, WindowInsetsCompat windowInsetsCompat, l0 l0Var) {
        boolean z11;
        BottomAppBar bottomAppBar = (BottomAppBar) this.f28697a;
        if (bottomAppBar.f12294p1) {
            bottomAppBar.f12301w1 = windowInsetsCompat.i();
        }
        boolean z12 = false;
        if (bottomAppBar.f12295q1) {
            z11 = bottomAppBar.f12303y1 != windowInsetsCompat.j();
            bottomAppBar.f12303y1 = windowInsetsCompat.j();
        } else {
            z11 = false;
        }
        if (bottomAppBar.f12296r1) {
            boolean z13 = bottomAppBar.f12302x1 != windowInsetsCompat.k();
            bottomAppBar.f12302x1 = windowInsetsCompat.k();
            z12 = z13;
        }
        if (!z11 && !z12) {
            return windowInsetsCompat;
        }
        AnimatorSet animatorSet = bottomAppBar.f12284g1;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = bottomAppBar.f12283f1;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        bottomAppBar.I();
        bottomAppBar.H();
        return windowInsetsCompat;
    }

    @Override // oa0.k
    public Object f(Object obj) {
        r0 r0Var = (r0) obj;
        r0Var.getClass();
        if (r0Var.e() != 0) {
            return ((k) this.f28697a).f(r0Var);
        }
        return null;
    }

    @Override // t1.p
    public y get(int i11) {
        return (t1.a0) this.f28697a;
    }

    @Override // o.w
    public void h(l lVar, boolean z11) {
        if (lVar instanceof o.d0) {
            ((o.d0) lVar).f31501z.k().c(false);
        }
        w wVar = ((androidx.appcompat.widget.a) this.f28697a).f31496e;
        if (wVar != null) {
            wVar.h(lVar, z11);
        }
    }

    @Override // oa0.f
    public Type i() {
        return (Type) this.f28697a;
    }

    @Override // o.j
    public boolean j(l lVar, MenuItem menuItem) {
        j jVar = ((Toolbar) this.f28697a).O;
        return jVar != null && jVar.j(lVar, menuItem);
    }

    @Override // n50.d
    public q50.b k(String str, n50.a aVar, EnumMap enumMap) {
        if (aVar == n50.a.UPC_A) {
            return ((u50.g) this.f28697a).k("0".concat(String.valueOf(str)), n50.a.EAN_13, enumMap);
        }
        i4.a.f("Can only encode UPC-A, but got ".concat(String.valueOf(aVar)));
        return null;
    }

    @Override // oa0.f
    public Object l(oa0.w wVar) {
        oa0.h hVar = new oa0.h(wVar);
        wVar.g(new jb.b(hVar));
        return hVar;
    }

    @Override // oa0.g
    public void m(oa0.d dVar, oa0.n0 n0Var) {
        boolean z11 = n0Var.f32351a.f36597q;
        v80.l lVar = (v80.l) this.f28697a;
        if (z11) {
            o oVar = u70.q.f40850b;
            lVar.resumeWith(n0Var.f32352b);
        } else {
            o oVar2 = u70.q.f40850b;
            lVar.resumeWith(new u70.p(new HttpException(n0Var)));
        }
    }

    @Override // xc.h
    public void n(xc.b bVar, Bitmap bitmap, Map map) {
        ((xc.i) this.f28697a).e(bVar, bitmap, map, zz.f.r(bitmap));
    }

    @Override // e6.j
    public Object o(e6.i iVar) {
        x0.d dVar = (x0.d) this.f28697a;
        pd.g.n("The result can only set once!", dVar.f43623b == null);
        dVar.f43623b = iVar;
        return "FutureChain[" + dVar + "]";
    }

    @Override // oa0.g
    public void p(oa0.d dVar, Throwable th2) {
        v80.l lVar = (v80.l) this.f28697a;
        o oVar = u70.q.f40850b;
        lVar.resumeWith(new u70.p(th2));
    }

    @Override // o.j
    public void q(l lVar) {
        Toolbar toolbar = (Toolbar) this.f28697a;
        androidx.appcompat.widget.a aVar = toolbar.f2098a.f1990t;
        if (aVar == null || !aVar.m()) {
            Iterator it = toolbar.G.f21615b.iterator();
            while (it.hasNext()) {
                ((MenuProvider) it.next()).d(lVar);
            }
        }
        j jVar = toolbar.O;
        if (jVar != null) {
            jVar.q(lVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0097 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008c A[Catch: all -> 0x0086, TryCatch #0 {all -> 0x0086, blocks: (B:9:0x0025, B:11:0x0038, B:15:0x0046, B:18:0x0054, B:20:0x005b, B:22:0x006b, B:28:0x0081, B:33:0x008c, B:35:0x0094, B:36:0x0096, B:47:0x00c7, B:50:0x00ca, B:51:0x00cb, B:26:0x007b, B:37:0x0097, B:39:0x00a7, B:44:0x00bc), top: B:143:0x0025, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public od.b r(td.i r20, od.a r21, ud.h r22, ud.g r23) {
        /*
            Method dump skipped, instruction units count: 497
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.a.r(td.i, od.a, ud.h, ud.g):od.b");
    }

    public q0.f s(df.g gVar, ArrayList arrayList, int i11, List list) {
        if (i11 < arrayList.size()) {
            int i12 = i11 + 1;
            q0.f fVarS = s(gVar, arrayList, i12, CollectionsKt.e0(list, arrayList.get(i11)));
            return fVarS instanceof q0.b ? fVarS : s(gVar, arrayList, i12, list);
        }
        LinkedHashSet linkedHashSetH = i1.h((Set) gVar.f14897e, list);
        wd.a.p("DefaultFeatureGroupResolver", "getFeatureListResolvedByPriority: features = " + linkedHashSetH + ", useCases = " + ((List) gVar.f14899g));
        ArrayList arrayList2 = new ArrayList(e0.o(linkedHashSetH, 10));
        Iterator it = linkedHashSetH.iterator();
        while (it.hasNext()) {
            arrayList2.add(((n0.b) it.next()).a());
        }
        Iterator it2 = CollectionsKt.r0(CollectionsKt.u0(arrayList2)).iterator();
        while (true) {
            if (it2.hasNext()) {
                p0.b bVar = (p0.b) it2.next();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj : linkedHashSetH) {
                    if (((n0.b) obj).a() == bVar) {
                        arrayList3.add(obj);
                    }
                }
                if (arrayList3.size() > 1) {
                    break;
                }
            } else {
                g0 g0Var = (g0) this.f28697a;
                o0.c cVar = new o0.c(linkedHashSetH);
                Iterator it3 = linkedHashSetH.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        n0.b bVar2 = (n0.b) it3.next();
                        if (!bVar2.b(gVar, g0Var)) {
                            wd.a.p("CameraInfoInternal", bVar2 + " is not supported.");
                            break;
                        }
                    } else {
                        try {
                            cg.y(g0Var, gVar, cVar);
                            return new q0.b(new o0.c(linkedHashSetH));
                        } catch (CameraUseCaseAdapter$CameraException | IllegalArgumentException e5) {
                            if (wd.a.B(3, "CameraInfoInternal")) {
                                Log.d("CameraInfoInternal", "CameraInfoInternal.isResolvedFeatureGroupSupported failed", e5);
                            }
                        }
                    }
                }
            }
        }
        return q0.c.f35701a;
    }

    public v00.i u() {
        try {
            u00.b bVar = (u00.b) this.f28697a;
            Parcel parcelJ = bVar.J(3, bVar.L());
            v00.i iVar = (v00.i) n00.d.a(parcelJ, v00.i.CREATOR);
            parcelJ.recycle();
            return iVar;
        } catch (RemoteException e5) {
            qc.y.l(e5);
            return null;
        }
    }

    @Override // o.w
    public boolean v(l lVar) {
        androidx.appcompat.widget.a aVar = (androidx.appcompat.widget.a) this.f28697a;
        if (lVar == aVar.f31494c) {
            return false;
        }
        aVar.f2142y = ((o.d0) lVar).A.f31570a;
        w wVar = aVar.f31496e;
        if (wVar != null) {
            return wVar.v(lVar);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public od.a w(td.i r9, java.lang.Object r10, td.o r11, fd.g r12) {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.a.w(td.i, java.lang.Object, td.o, fd.g):od.a");
    }

    public i3 x(ub.a aVar, c5.y yVar) {
        int i11;
        long jG;
        long j9;
        boolean z11;
        z zVar = (z) this.f28697a;
        z zVar2 = new z(((List) aVar.f40981b).size());
        List list = (List) aVar.f40981b;
        int size = list.size();
        int i12 = 0;
        while (i12 < size) {
            x xVar = (x) list.get(i12);
            long j11 = xVar.f43195a;
            w4.w wVar = (w4.w) zVar.b(j11);
            if (wVar == null) {
                i11 = i12;
                j9 = xVar.f43196b;
                jG = xVar.f43198d;
                z11 = false;
            } else {
                long j12 = wVar.f43192a;
                boolean z12 = wVar.f43194c;
                i11 = i12;
                jG = yVar.G(wVar.f43193b);
                j9 = j12;
                z11 = z12;
            }
            long j13 = xVar.f43195a;
            List list2 = list;
            int i13 = size;
            zVar2.h(j13, new v(j13, xVar.f43196b, xVar.f43198d, xVar.f43199e, xVar.f43200f, j9, jG, z11, xVar.f43201g, xVar.f43203i, xVar.f43204j, xVar.f43205k));
            boolean z13 = xVar.f43199e;
            if (z13) {
                zVar.h(j11, new w4.w(xVar.f43196b, xVar.f43197c, z13));
            } else {
                zVar.i(j11);
            }
            i12 = i11 + 1;
            list = list2;
            size = i13;
        }
        i3 i3Var = new i3();
        i3Var.f395b = zVar2;
        i3Var.f396c = aVar;
        return i3Var;
    }

    public void y(BasicItem basicItem, dv.d dVar) {
        dVar.getClass();
        ((cv.b) this.f28697a).c(cv.i.ACTION_ADD_TO_FAVORITES, h0.g.E(new Pair(dv.a.SOURCE, new dv.c(dVar.a())), new Pair(dv.a.ITEM_ID, new dv.c(basicItem.getInformation().mo340getItemIdFvU5WIY())), new Pair(dv.a.ITEM_TYPE, new dv.c(basicItem.getItemType().name()))));
    }

    public void z(String str, boolean z11, boolean z12, dv.d dVar) {
        str.getClass();
        dVar.getClass();
        dv.b bVarG = g(str, Boolean.valueOf(z11), dVar);
        dv.a aVar = dv.a.REMINDER_TYPE;
        dv.d dVar2 = z12 ? dv.d.RECURRING_REMINDER : dv.d.ONE_TIME_REMINDER;
        bVarG.a(aVar, dVar2 != null ? dVar2.a() : null);
        ((cv.b) this.f28697a).c(cv.i.ACTION_SAVE_FAVORITE_REMINDER, bVarG);
    }

    @Override // xc.h
    public void c(int i11) {
    }

    public a(cv.b bVar) {
        bVar.getClass();
        this.f28697a = bVar;
    }

    public /* synthetic */ a(Object obj) {
        this.f28697a = obj;
    }

    public a(int i11) {
        switch (i11) {
            case 22:
                this.f28697a = new u50.g(0);
                break;
            case 25:
                this.f28697a = new z((Object) null);
                break;
            default:
                TimeUnit.MINUTES.getClass();
                t90.e eVar = t90.e.l;
                eVar.getClass();
                this.f28697a = new u90.p(eVar);
                break;
        }
    }
}
