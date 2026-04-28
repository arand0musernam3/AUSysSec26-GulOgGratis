package ng;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.y;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.m1;
import androidx.lifecycle.n1;
import ax.a0;
import b0.z;
import b4.q;
import b4.t;
import b5.r1;
import com.app.tgtg.R;
import com.app.tgtg.model.local.AppConstants;
import com.app.tgtg.model.remote.Server;
import d2.h2;
import d2.i2;
import d2.m2;
import d2.w;
import g3.r9;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import ky.i;
import lv.v;
import m2.h0;
import m3.n;
import m3.s;
import m3.w1;
import o30.e0;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import ox.h;
import p70.k;
import u70.j;
import u70.l;
import u70.m;
import v80.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\t²\u0006\u0014\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\nX\u008a\u0084\u0002²\u0006\u0016\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\b\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lng/d;", "Landroidx/fragment/app/y;", "<init>", "()V", "", "Lcom/app/tgtg/model/remote/Server;", "serverList", "serverListFiltered", "currentServer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nServerSelectorFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ServerSelectorFragment.kt\ncom/app/tgtg/customview/serverselector/ServerSelectorFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 9 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 11 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 12 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt\n*L\n1#1,263:1\n106#2,15:264\n87#3:279\n84#3,9:280\n94#3:320\n87#3:400\n85#3,8:401\n94#3:446\n81#4,6:289\n88#4,6:304\n96#4:319\n81#4,6:334\n88#4,6:349\n96#4:370\n81#4,6:409\n88#4,6:424\n96#4:445\n391#5,9:295\n400#5:310\n401#5,2:317\n391#5,9:340\n400#5:355\n401#5,2:368\n391#5,9:415\n400#5:430\n401#5,2:443\n1128#6,6:311\n1128#6,6:321\n1128#6,6:356\n1128#6,6:362\n1128#6,6:385\n1128#6,6:391\n1128#6,6:431\n1128#6,6:437\n122#7:327\n122#7:399\n99#8,6:328\n106#8:371\n231#9,2:372\n35#9,5:374\n233#9:379\n85#10:380\n85#10:381\n117#10,2:382\n85#10:384\n75#11:397\n75#11:398\n168#12,13:447\n*S KotlinDebug\n*F\n+ 1 ServerSelectorFragment.kt\ncom/app/tgtg/customview/serverselector/ServerSelectorFragment\n*L\n65#1:264,15\n181#1:279\n181#1:280,9\n181#1:320\n87#1:400\n87#1:401,8\n87#1:446\n181#1:289,6\n181#1:304,6\n181#1:319\n235#1:334,6\n235#1:349,6\n235#1:370\n87#1:409,6\n87#1:424,6\n87#1:445\n181#1:295,9\n181#1:310\n181#1:317,2\n235#1:340,9\n235#1:355\n235#1:368,2\n87#1:415,9\n87#1:430\n87#1:443,2\n202#1:311,6\n217#1:321,6\n248#1:356,6\n256#1:362,6\n76#1:385,6\n78#1:391,6\n103#1:431,6\n140#1:437,6\n240#1:327\n96#1:399\n235#1:328,6\n235#1:371\n104#1:372,2\n104#1:374,5\n104#1:379\n75#1:380\n76#1:381\n76#1:382,2\n77#1:384\n84#1:397\n85#1:398\n219#1:447,13\n*E\n"})
public final class d extends y implements r70.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public k f30832a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile p70.g f30834c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n1 f30837f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f30833b = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f30835d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f30836e = false;

    public d() {
        j jVarA = l.a(m.NONE, new i(new i(this, 7), 8));
        this.f30837f = new n1(Reflection.getOrCreateKotlinClass(g.class), new bl.c(jVarA, 18), new r1(12, this, jVarA), new bl.c(jVarA, 19));
    }

    @Override // r70.b
    public final Object a() {
        if (this.f30834c == null) {
            synchronized (this.f30835d) {
                try {
                    if (this.f30834c == null) {
                        this.f30834c = new p70.g(this);
                    }
                } finally {
                }
            }
        }
        return this.f30834c.a();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f30833b) {
            return null;
        }
        t();
        return this.f30832a;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.p
    public final ViewModelProvider$Factory getDefaultViewModelProviderFactory() {
        return zz.f.s(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        k kVar = this.f30832a;
        h.q(kVar == null || p70.g.d(kVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        t();
        if (this.f30836e) {
            return;
        }
        this.f30836e = true;
        ((e) a()).getClass();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6, null);
        composeView.setContent(new u3.d(new lk.a(this, 19), true, -323183958));
        return composeView;
    }

    @Override // androidx.fragment.app.y, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(new k(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        f0.B(m1.c(this), null, null, new c(this, null), 3);
    }

    public final void p(final Function0 function0, n nVar, int i11) {
        s sVar;
        function0.getClass();
        s sVar2 = (s) nVar;
        sVar2.c0(-375651897);
        int i12 = i11 | (sVar2.h(function0) ? 4 : 2) | (sVar2.h(this) ? 32 : 16);
        if (sVar2.R(i12 & 1, (i12 & 19) != 18)) {
            q qVar = q.f5711a;
            t tVarB = d2.c.B(m2.t(m2.d(qVar, 1.0f), 3), 0.0f, 16, 1);
            i2 i2VarA = h2.a(d2.i.f13806f, b4.d.l, sVar2, 54);
            int iHashCode = Long.hashCode(sVar2.T);
            u3.i iVarL = sVar2.l();
            t tVarC = b4.a.c(tVarB, sVar2);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar2.e0();
            if (sVar2.S) {
                sVar2.k(hVar);
            } else {
                sVar2.n0();
            }
            m3.i.C(i2VarA, b5.i.f5843f, sVar2);
            m3.i.C(iVarL, b5.i.f5842e, sVar2);
            m3.i.v(sVar2, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar2, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar2);
            t tVarV = m2.v(qVar, 3);
            int i13 = i12 & 14;
            boolean zH = (i13 == 4) | sVar2.h(this);
            Object objM = sVar2.M();
            m3.f fVar = m3.m.f29332a;
            if (zH || objM == fVar) {
                final int i14 = 0;
                objM = new Function0() { // from class: ng.b
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i14) {
                            case 0:
                                function0.invoke();
                                Handler handler = new Handler(Looper.getMainLooper());
                                final int i15 = 1;
                                final d dVar = this;
                                handler.postDelayed(new Runnable() { // from class: ng.a
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i15) {
                                            case 0:
                                                g gVarS = dVar.s();
                                                Server server = (Server) gVarS.f30843d.f45488a.getValue();
                                                String json = server.toJson();
                                                SharedPreferences sharedPreferences = ft.e.f17922c;
                                                if (sharedPreferences == null) {
                                                    Intrinsics.throwUninitializedPropertyAccessException("appDataStorage");
                                                    sharedPreferences = null;
                                                }
                                                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                                                editorEdit.putString("currentServer", json);
                                                editorEdit.apply();
                                                mv.b bVar = gVarS.f30841b;
                                                bVar.getClass();
                                                bVar.f30152c = server;
                                                gVarS.f30840a.d(null);
                                                String facebookId = AppConstants.INSTANCE.getFacebookId();
                                                a0 a0Var = a0.f4849a;
                                                facebookId.getClass();
                                                tx.j.k(facebookId, "applicationId");
                                                a0.f4852d = facebookId;
                                                f0.B(m1.d(gVarS), null, null, new f(gVarS, null, 1), 3);
                                                break;
                                            default:
                                                g gVarS2 = dVar.s();
                                                f0.B(m1.d(gVarS2), null, null, new f(gVarS2, null, 0), 3);
                                                break;
                                        }
                                    }
                                }, 100L);
                                break;
                            default:
                                function0.invoke();
                                Handler handler2 = new Handler(Looper.getMainLooper());
                                final int i16 = 0;
                                final d dVar2 = this;
                                handler2.postDelayed(new Runnable() { // from class: ng.a
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i16) {
                                            case 0:
                                                g gVarS = dVar2.s();
                                                Server server = (Server) gVarS.f30843d.f45488a.getValue();
                                                String json = server.toJson();
                                                SharedPreferences sharedPreferences = ft.e.f17922c;
                                                if (sharedPreferences == null) {
                                                    Intrinsics.throwUninitializedPropertyAccessException("appDataStorage");
                                                    sharedPreferences = null;
                                                }
                                                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                                                editorEdit.putString("currentServer", json);
                                                editorEdit.apply();
                                                mv.b bVar = gVarS.f30841b;
                                                bVar.getClass();
                                                bVar.f30152c = server;
                                                gVarS.f30840a.d(null);
                                                String facebookId = AppConstants.INSTANCE.getFacebookId();
                                                a0 a0Var = a0.f4849a;
                                                facebookId.getClass();
                                                tx.j.k(facebookId, "applicationId");
                                                a0.f4852d = facebookId;
                                                f0.B(m1.d(gVarS), null, null, new f(gVarS, null, 1), 3);
                                                break;
                                            default:
                                                g gVarS2 = dVar2.s();
                                                f0.B(m1.d(gVarS2), null, null, new f(gVarS2, null, 0), 3);
                                                break;
                                        }
                                    }
                                }, 100L);
                                break;
                        }
                        return Unit.f26487a;
                    }
                };
                sVar2.k0(objM);
            }
            v0.n.o(tVarV, "Cancel", null, null, null, false, (Function0) objM, sVar2, 54, 0, 1020);
            t tVarV2 = m2.v(qVar, 3);
            boolean zH2 = sVar2.h(this) | (i13 == 4);
            Object objM2 = sVar2.M();
            if (zH2 || objM2 == fVar) {
                final int i15 = 1;
                objM2 = new Function0() { // from class: ng.b
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i15) {
                            case 0:
                                function0.invoke();
                                Handler handler = new Handler(Looper.getMainLooper());
                                final int i152 = 1;
                                final d dVar = this;
                                handler.postDelayed(new Runnable() { // from class: ng.a
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i152) {
                                            case 0:
                                                g gVarS = dVar.s();
                                                Server server = (Server) gVarS.f30843d.f45488a.getValue();
                                                String json = server.toJson();
                                                SharedPreferences sharedPreferences = ft.e.f17922c;
                                                if (sharedPreferences == null) {
                                                    Intrinsics.throwUninitializedPropertyAccessException("appDataStorage");
                                                    sharedPreferences = null;
                                                }
                                                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                                                editorEdit.putString("currentServer", json);
                                                editorEdit.apply();
                                                mv.b bVar = gVarS.f30841b;
                                                bVar.getClass();
                                                bVar.f30152c = server;
                                                gVarS.f30840a.d(null);
                                                String facebookId = AppConstants.INSTANCE.getFacebookId();
                                                a0 a0Var = a0.f4849a;
                                                facebookId.getClass();
                                                tx.j.k(facebookId, "applicationId");
                                                a0.f4852d = facebookId;
                                                f0.B(m1.d(gVarS), null, null, new f(gVarS, null, 1), 3);
                                                break;
                                            default:
                                                g gVarS2 = dVar.s();
                                                f0.B(m1.d(gVarS2), null, null, new f(gVarS2, null, 0), 3);
                                                break;
                                        }
                                    }
                                }, 100L);
                                break;
                            default:
                                function0.invoke();
                                Handler handler2 = new Handler(Looper.getMainLooper());
                                final int i16 = 0;
                                final d dVar2 = this;
                                handler2.postDelayed(new Runnable() { // from class: ng.a
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i16) {
                                            case 0:
                                                g gVarS = dVar2.s();
                                                Server server = (Server) gVarS.f30843d.f45488a.getValue();
                                                String json = server.toJson();
                                                SharedPreferences sharedPreferences = ft.e.f17922c;
                                                if (sharedPreferences == null) {
                                                    Intrinsics.throwUninitializedPropertyAccessException("appDataStorage");
                                                    sharedPreferences = null;
                                                }
                                                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                                                editorEdit.putString("currentServer", json);
                                                editorEdit.apply();
                                                mv.b bVar = gVarS.f30841b;
                                                bVar.getClass();
                                                bVar.f30152c = server;
                                                gVarS.f30840a.d(null);
                                                String facebookId = AppConstants.INSTANCE.getFacebookId();
                                                a0 a0Var = a0.f4849a;
                                                facebookId.getClass();
                                                tx.j.k(facebookId, "applicationId");
                                                a0.f4852d = facebookId;
                                                f0.B(m1.d(gVarS), null, null, new f(gVarS, null, 1), 3);
                                                break;
                                            default:
                                                g gVarS2 = dVar2.s();
                                                f0.B(m1.d(gVarS2), null, null, new f(gVarS2, null, 0), 3);
                                                break;
                                        }
                                    }
                                }, 100L);
                                break;
                        }
                        return Unit.f26487a;
                    }
                };
                sVar2.k0(objM2);
            }
            v0.n.l(tVarV2, "Confirm", null, null, null, false, false, null, null, (Function0) objM2, sVar2, 54, 508);
            sVar = sVar2;
            sVar.q(true);
        } else {
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new kq.c(this, function0, i11, 10);
        }
    }

    public final void q(String str, Function1 function1, n nVar, int i11) {
        s sVar;
        str.getClass();
        function1.getClass();
        s sVar2 = (s) nVar;
        sVar2.c0(-447942889);
        int i12 = i11 | (sVar2.f(str) ? 4 : 2) | (sVar2.h(function1) ? 32 : 16);
        if (sVar2.R(i12 & 1, (i12 & 19) != 18)) {
            q qVar = q.f5711a;
            t tVarD = d2.c.D(m2.t(m2.d(qVar, 1.0f), 3), 0.0f, e0.s(sVar2, R.dimen.spacing_3), 0.0f, e0.s(sVar2, R.dimen.spacing_1), 5);
            d2.y yVarA = w.a(d2.i.f13803c, b4.d.f5695n, sVar2, 48);
            int iHashCode = Long.hashCode(sVar2.T);
            u3.i iVarL = sVar2.l();
            t tVarC = b4.a.c(tVarD, sVar2);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar2.e0();
            if (sVar2.S) {
                sVar2.k(hVar);
            } else {
                sVar2.n0();
            }
            m3.i.C(yVarA, b5.i.f5843f, sVar2);
            m3.i.C(iVarL, b5.i.f5842e, sVar2);
            m3.i.v(sVar2, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar2, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar2);
            r9.d("Select server", null, lv.s.C, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, v.f28270i, sVar2, 390, 12582912, 131066);
            sVar = sVar2;
            t tVarB = d2.c.B(qVar, e0.s(sVar, R.dimen.spacing_2), 0.0f, 2);
            String strConcat = "Current: ".concat(str);
            boolean z11 = (i12 & 112) == 32;
            Object objM = sVar.M();
            if (z11 || objM == m3.m.f29332a) {
                objM = new defpackage.d(function1, 24);
                sVar.k0(objM);
            }
            b0.a0.g(0, tVarB, strConcat, (Function1) objM, sVar);
            sVar.q(true);
        } else {
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new ki.h(this, str, function1, false, i11, 7);
        }
    }

    public final void r(t tVar, List list, Server server, n nVar, int i11) {
        t tVar2;
        s sVar = (s) nVar;
        sVar.c0(1075691526);
        int i12 = i11 | 6 | (sVar.h(list) ? 32 : 16) | (sVar.f(server) ? 256 : 128) | (sVar.h(this) ? NewHope.SENDB_BYTES : 1024);
        if (sVar.R(i12 & 1, (i12 & 1171) != 1170)) {
            boolean zH = sVar.h(list) | ((i12 & 896) == 256) | sVar.h(this);
            Object objM = sVar.M();
            if (zH || objM == m3.m.f29332a) {
                objM = new h0(list, server, this, 4);
                sVar.k0(objM);
            }
            q qVar = q.f5711a;
            h.c(qVar, null, null, null, null, null, false, null, (Function1) objM, sVar, 6, 510);
            tVar2 = qVar;
        } else {
            sVar.U();
            tVar2 = tVar;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new lp.v(this, tVar2, list, server, i11);
        }
    }

    public final g s() {
        return (g) this.f30837f.getValue();
    }

    public final void t() {
        if (this.f30832a == null) {
            this.f30832a = new k(super.getContext(), this);
            this.f30833b = z.v(super.getContext());
        }
    }

    @Override // androidx.fragment.app.y, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        t();
        if (this.f30836e) {
            return;
        }
        this.f30836e = true;
        ((e) a()).getClass();
    }
}
