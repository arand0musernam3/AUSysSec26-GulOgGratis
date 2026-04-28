package com.app.tgtg.feature.main.fragments.discover.herocomponent;

import android.content.Context;
import android.util.AttributeSet;
import androidx.lifecycle.p;
import androidx.lifecycle.s1;
import b4.q;
import b4.t;
import b5.h;
import b5.j;
import c5.a;
import com.app.tgtg.model.remote.item.response.BasicItem;
import com.braze.h2;
import d40.t1;
import dn.k;
import fn.c;
import g3.q9;
import g3.y0;
import g60.d;
import g9.r0;
import gn.a0;
import gn.b;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.n0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import lq.l;
import m3.b1;
import m3.f;
import m3.i;
import m3.k1;
import m3.m;
import m3.n;
import m3.s;
import m3.w1;
import o30.e0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u3.e;
import z4.u0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class DiscoverSheetView extends a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f9147q = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final k1 f9148i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Function0 f9149j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Function1 f9150k;
    public Function2 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Function1 f9151m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Function1 f9152n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Function1 f9153o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Function2 f9154p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiscoverSheetView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        context.getClass();
        this.f9148i = i.w(n0.f26529a);
        this.f9149j = new d(22);
        this.f9150k = new r0(10);
        this.l = new g60.a(6);
    }

    @Override // c5.a
    public final void a(n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.c0(-1889894401);
        int i12 = (sVar.h(this) ? 4 : 2) | i11;
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            s1 s1VarA = z8.a.a(sVar);
            if (s1VarA == null) {
                h2.b("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            c cVar = (c) t1.K(Reflection.getOrCreateKotlinClass(c.class), s1VarA, e0.r(s1VarA, sVar), s1VarA instanceof p ? ((p) s1VarA).getDefaultViewModelCreationExtras() : y8.a.f45423b, sVar);
            b1 b1VarN = i.n(cVar.G, sVar, 0);
            Object objM = sVar.M();
            f fVar = m.f29332a;
            if (objM == fVar) {
                objM = i.w(a0.HalfExpanded);
                sVar.k0(objM);
            }
            a0 a0Var = (a0) ((b1) objM).getValue();
            boolean zH = sVar.h(this);
            Object objM2 = sVar.M();
            if (zH || objM2 == fVar) {
                objM2 = new q9(this, 3);
                sVar.k0(objM2);
            }
            Function1 function1 = (Function1) objM2;
            a0Var.getClass();
            t1.b1 b1Var = b.f20582a;
            Object objM3 = sVar.M();
            if (objM3 == fVar) {
                objM3 = new r0(9);
                sVar.k0(objM3);
            }
            sVar.Y(-1298616559, a0Var);
            k kVar = new k(a0Var, function1, b1Var, s1.k1.a(sVar), (Function1) objM3);
            sVar.q(false);
            u0 u0VarD = d2.p.d(b4.d.f5683a, false);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = b4.a.c(q.f5711a, sVar);
            j.R.getClass();
            h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            i.C(u0VarD, b5.i.f5843f, sVar);
            i.C(iVarL, b5.i.f5842e, sVar);
            i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            i.z(sVar, b5.i.f5845h);
            i.C(tVarC, b5.i.f5841d, sVar);
            gn.a.e(cVar, kVar, sVar, 0);
            gn.a.f(sVar, 0);
            gn.a.b(kVar, e.e(-1766534985, sVar, new ap.e(this, cVar, kVar, 4)), null, lv.s.J, e.e(-190379021, sVar, new ap.e(b1VarN, this, cVar, 5)), sVar, 27696);
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new y0(this, i11, 4);
        }
    }

    @NotNull
    public final List<nq.d> getDiscoverRows() {
        return (List) this.f9148i.getValue();
    }

    @Nullable
    public final Function1<cv.e, Unit> getImpressionListener() {
        return this.f9151m;
    }

    @Nullable
    public final Function1<l, Unit> getOnFavoriteAdapterSet() {
        return this.f9153o;
    }

    @Nullable
    public final Function1<mq.a, Unit> getOnFavoriteClicked() {
        return this.f9152n;
    }

    @Nullable
    public final Function2<mq.a, lq.j, Unit> getOnFlashSalesItemClicked() {
        return this.f9154p;
    }

    @NotNull
    public final Function1<Boolean, Unit> getOnFullyExpanded() {
        return this.f9150k;
    }

    @NotNull
    public final Function2<BasicItem, String, Unit> getOnItemClicked() {
        return this.l;
    }

    @NotNull
    public final Function0<Unit> getOnLocationViewClicked() {
        return this.f9149j;
    }

    public final void setDiscoverRows(@NotNull List<? extends nq.d> list) {
        list.getClass();
        this.f9148i.setValue(list);
    }

    public final void setImpressionListener(@Nullable Function1<? super cv.e, Unit> function1) {
        this.f9151m = function1;
    }

    public final void setOnFavoriteAdapterSet(@Nullable Function1<? super l, Unit> function1) {
        this.f9153o = function1;
    }

    public final void setOnFavoriteClicked(@Nullable Function1<? super mq.a, Unit> function1) {
        this.f9152n = function1;
    }

    public final void setOnFlashSalesItemClicked(@Nullable Function2<? super mq.a, ? super lq.j, Unit> function2) {
        this.f9154p = function2;
    }

    public final void setOnFullyExpanded(@NotNull Function1<? super Boolean, Unit> function1) {
        function1.getClass();
        this.f9150k = function1;
    }

    public final void setOnItemClicked(@NotNull Function2<? super BasicItem, ? super String, Unit> function2) {
        function2.getClass();
        this.l = function2;
    }

    public final void setOnLocationViewClicked(@NotNull Function0<Unit> function0) {
        function0.getClass();
        this.f9149j = function0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DiscoverSheetView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DiscoverSheetView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ DiscoverSheetView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }
}
