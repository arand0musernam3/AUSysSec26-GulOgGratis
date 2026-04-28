package ym;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import androidx.databinding.DataBinderMapperImpl;
import androidx.fragment.app.o0;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.n1;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b0;
import androidx.recyclerview.widget.n2;
import androidx.recyclerview.widget.y1;
import b5.r1;
import bg.k0;
import bg.w0;
import com.app.tgtg.R;
import com.app.tgtg.feature.catering.ui.CateringItemDetailsActivity;
import com.app.tgtg.feature.main.MainActivity;
import com.app.tgtg.feature.main.fragments.delivery.parcelitemdetails.BasketItemDetailsActivity;
import com.app.tgtg.feature.main.fragments.delivery.parcelitemdetails.ManufacturerItemDetailsActivity;
import com.app.tgtg.model.local.BasketManager;
import com.app.tgtg.model.local.GenericErrors;
import com.app.tgtg.model.remote.item.response.BaseItemMnuV2;
import com.app.tgtg.model.remote.item.response.CategoryCard;
import com.app.tgtg.model.remote.item.response.ItemType;
import com.app.tgtg.model.remote.item.response.SortingChoice;
import com.app.tgtg.model.remote.manufacturer.request.AdapterItemType;
import com.app.tgtg.model.remote.manufacturer.response.ManufacturerItemsV2Response;
import com.google.android.gms.internal.measurement.cg;
import dn.i;
import dn.m;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.d0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.e0;
import pg.c2;
import y80.a2;
import ym.o;
import ym.u;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lym/u;", "Lkm/a;", "Lym/y;", "Lym/z;", "", "<init>", "()V", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDeliveryFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeliveryFragment.kt\ncom/app/tgtg/feature/main/fragments/delivery/parcelfeed/DeliveryFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,869:1\n106#2,15:870\n257#3,2:885\n257#3,2:887\n257#3,2:894\n257#3,2:896\n257#3,2:898\n257#3,2:900\n257#3,2:902\n257#3,2:904\n777#4:889\n873#4,2:890\n296#4,2:892\n296#4,2:906\n1807#4,3:908\n1807#4,3:911\n1807#4,3:914\n1807#4,3:917\n1915#4:920\n1915#4,2:921\n1916#4:923\n*S KotlinDebug\n*F\n+ 1 DeliveryFragment.kt\ncom/app/tgtg/feature/main/fragments/delivery/parcelfeed/DeliveryFragment\n*L\n87#1:870,15\n294#1:885,2\n372#1:887,2\n562#1:894,2\n563#1:896,2\n564#1:898,2\n590#1:900,2\n592#1:902,2\n594#1:904,2\n520#1:889\n520#1:890,2\n541#1:892,2\n628#1:906,2\n630#1:908,3\n637#1:911,3\n642#1:914,3\n674#1:917,3\n683#1:920\n705#1:921,2\n683#1:923\n*E\n"})
public final class u extends a0 implements y, z {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c2 f46233g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final u70.t f46234h = u70.l.b(new r(this, 1));

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final n1 f46235i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public o f46236j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f46237k;
    public final String l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f46238m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f46239n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public dn.i f46240o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayList f46241p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ManufacturerItemsV2Response f46242q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ManufacturerItemsV2Response f46243r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Parcelable f46244s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f46245t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f46246u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public a8.h f46247v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public dn.f f46248w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public dn.m f46249x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public e0 f46250y;

    public u() {
        u70.j jVarA = u70.l.a(u70.m.NONE, new ky.i(new ky.i(this, 26), 27));
        this.f46235i = new n1(Reflection.getOrCreateKotlinClass(w.class), new xj.c(jVarA, 4), new r1(22, this, jVarA), new xj.c(jVarA, 5));
        this.f46237k = true;
        this.l = "bundle_mnu_recycler_layout";
        this.f46241p = new ArrayList();
    }

    public final void A(GenericErrors genericErrors) {
        this.f46238m = 0L;
        c2 c2Var = this.f46233g;
        c2Var.getClass();
        c2Var.K.setRefreshing(false);
        c2 c2Var2 = this.f46233g;
        if (c2Var2 != null) {
            c2Var2.getClass();
            c2Var2.C.setVisibility(8);
            c2 c2Var3 = this.f46233g;
            c2Var3.getClass();
            c2Var3.M.setVisibility(8);
            c2 c2Var4 = this.f46233g;
            c2Var4.getClass();
            c2Var4.I.setVisibility(8);
            c2 c2Var5 = this.f46233g;
            c2Var5.getClass();
            c2Var5.A.setVisibility(0);
            c2 c2Var6 = this.f46233g;
            c2Var6.getClass();
            c2Var6.A.k(genericErrors);
        }
    }

    public final void B() {
        if (System.currentTimeMillis() - this.f46238m > 120000) {
            this.f46238m = System.currentTimeMillis();
            z("");
        } else {
            c2 c2Var = this.f46233g;
            c2Var.getClass();
            c2Var.K.setRefreshing(false);
        }
    }

    @Override // ym.z
    public final a2 d() {
        return r().f46266o;
    }

    @Override // ym.z
    public final void f() {
        w wVarR = r();
        BasketManager basketManagerRestoreBasketManager = new BasketManager(null, null, 0L, 0L, 0, null, null, 127, null).restoreBasketManager(wVarR.c(), wVarR.b());
        if (basketManagerRestoreBasketManager != null) {
            String strM184getBasketIdM00Rnn0 = basketManagerRestoreBasketManager.m184getBasketIdM00Rnn0(wVarR.f46254b.m().m285getUserId8nKqa5U());
            cv.i iVar = cv.i.SCREEN_BASKET_INFO;
            dv.a aVar = dv.a.TYPE;
            dv.d dVar = dv.d.PER_BASKET_LIMIT_REACHED;
            Pair pair = new Pair(aVar, new dv.c(dVar != null ? dVar.a() : null));
            Pair pair2 = new Pair(dv.a.BASKET_ID, new dv.c(strM184getBasketIdM00Rnn0));
            dv.a aVar2 = dv.a.SCREEN;
            dv.d dVar2 = dv.d.SCREEN_DELIVERY;
            wVarR.e(iVar, h0.g.E(pair, pair2, new Pair(aVar2, new dv.c(dVar2 != null ? dVar2.a() : null))));
        }
        k0 k0Var = new k0(requireActivity());
        k0Var.e(R.string.mnu_basket_screen_status_max_popup_title);
        k0Var.a(R.string.mnu_basket_screen_status_max_popup_body);
        k0Var.f6178i = R.drawable.parcel_max_blob;
        k0Var.c(R.string.mnu_basket_screen_status_fee_popup_cta_okay);
        k0Var.f();
    }

    @Override // ym.z
    public final BasketManager g() {
        return r().f46273v;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    @Override // ym.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.String r15, int r16, boolean r17) {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ym.u.i(java.lang.String, int, boolean):void");
    }

    @Override // km.a
    public final mv.z o() {
        return mv.z.MANUFACTURER;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        int i11 = c2.N;
        DataBinderMapperImpl dataBinderMapperImpl = a8.c.f965a;
        c2 c2Var = (c2) a8.k.Z(layoutInflater, R.layout.manufacturer_list, viewGroup, false, null);
        this.f46233g = c2Var;
        c2Var.getClass();
        View view = c2Var.f986f;
        view.getClass();
        return view;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f46233g = null;
        dn.f fVar = this.f46248w;
        if (fVar != null) {
            fVar.c(false, false);
        }
        r().d();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        r().f46273v = null;
        ((w0) this.f46234h.getValue()).a();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        dn.f fVar = this.f46248w;
        if (fVar != null) {
            r().f46273v = new BasketManager(null, null, 0L, 0L, 0, null, null, 127, null).restoreBasketManager(r().f46272u, r().b());
            fVar.f(r().b(), r().c());
        } else {
            if (r().f46254b.n().getUseManufacturerBasketFlow()) {
                c2 c2Var = this.f46233g;
                c2Var.getClass();
                this.f46248w = new dn.f(c2Var, r());
            }
            dn.f fVar2 = this.f46248w;
            if (fVar2 != null) {
                fVar2.f(r().b(), r().c());
            }
        }
        c2 c2Var2 = this.f46233g;
        c2Var2.getClass();
        e0 e0Var = this.f46250y;
        if (e0Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("impressionHelper");
            e0Var = null;
        }
        this.f46240o = new dn.i(c2Var2, e0Var, r());
        ao.r1 r1Var = r().f46253a;
        r1Var.getClass();
        if (System.currentTimeMillis() - r1Var.f4432q > 180000) {
            t();
        }
        o oVar = this.f46236j;
        if (oVar != null) {
            oVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        super.onSaveInstanceState(bundle);
        c2 c2Var = this.f46233g;
        c2Var.getClass();
        y1 layoutManager = c2Var.C.getLayoutManager();
        bundle.putParcelable(this.l, layoutManager != null ? layoutManager.onSaveInstanceState() : null);
    }

    @Override // km.a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        o0 o0VarRequireActivity = requireActivity();
        o0VarRequireActivity.getClass();
        a70.a.t(o0VarRequireActivity, lv.s.J);
        o0 activity = getActivity();
        activity.getClass();
        MainActivity mainActivity = (MainActivity) activity;
        this.f46247v = new a8.h(this, r());
        c2 c2Var = this.f46233g;
        c2Var.getClass();
        this.f46249x = new dn.m(c2Var, r());
        if (r().f46254b.n().getUseManufacturerBasketFlow()) {
            c2 c2Var2 = this.f46233g;
            c2Var2.getClass();
            this.f46248w = new dn.f(c2Var2, r());
        }
        c2 c2Var3 = this.f46233g;
        c2Var3.getClass();
        ViewCompat.k0(c2Var3.f986f, new a50.d(28, mainActivity, this));
        w wVarR = r();
        androidx.lifecycle.o0 o0Var = wVarR.f46261i;
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        final int i11 = 0;
        m0.c.f0(o0Var, viewLifecycleOwner, new Function1(this) { // from class: ym.s

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u f46232b;

            {
                this.f46232b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:58:0x0178  */
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r13) {
                /*
                    Method dump skipped, instruction units count: 576
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: ym.s.invoke(java.lang.Object):java.lang.Object");
            }
        });
        final int i12 = 1;
        wVarR.f46262j.e(getViewLifecycleOwner(), new dk.b(new Function1(this) { // from class: ym.s

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u f46232b;

            {
                this.f46232b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:58:0x0178  */
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r13) {
                /*
                    Method dump skipped, instruction units count: 576
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: ym.s.invoke(java.lang.Object):java.lang.Object");
            }
        }, 10));
        androidx.lifecycle.o0 o0Var2 = wVarR.l;
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        viewLifecycleOwner2.getClass();
        final int i13 = 2;
        m0.c.f0(o0Var2, viewLifecycleOwner2, new Function1(this) { // from class: ym.s

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u f46232b;

            {
                this.f46232b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:58:0x0178  */
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r13) {
                /*
                    Method dump skipped, instruction units count: 576
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: ym.s.invoke(java.lang.Object):java.lang.Object");
            }
        });
        final int i14 = 3;
        wVarR.f46264m.e(getViewLifecycleOwner(), new dk.b(new Function1(this) { // from class: ym.s

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u f46232b;

            {
                this.f46232b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:58:0x0178  */
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r13) {
                /*
                    Method dump skipped, instruction units count: 576
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: ym.s.invoke(java.lang.Object):java.lang.Object");
            }
        }, 10));
        androidx.lifecycle.o0 o0Var3 = wVarR.f46263k;
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        viewLifecycleOwner3.getClass();
        final int i15 = 4;
        m0.c.f0(o0Var3, viewLifecycleOwner3, new Function1(this) { // from class: ym.s

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u f46232b;

            {
                this.f46232b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:58:0x0178  */
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r13) {
                /*
                    Method dump skipped, instruction units count: 576
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: ym.s.invoke(java.lang.Object):java.lang.Object");
            }
        });
        r().f46268q = zz.f.y(this.f26467a).a();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewStateRestored(Bundle bundle) {
        Parcelable parcelable;
        super.onViewStateRestored(bundle);
        if (bundle != null) {
            String str = this.l;
            if (!bundle.containsKey(str) || (parcelable = (Parcelable) h0.g.t(bundle, str, Parcelable.class)) == null) {
                return;
            }
            c2 c2Var = this.f46233g;
            c2Var.getClass();
            y1 layoutManager = c2Var.C.getLayoutManager();
            if (layoutManager != null) {
                layoutManager.onRestoreInstanceState(parcelable);
            }
        }
    }

    public final w r() {
        return (w) this.f46235i.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0294 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:300:? A[LOOP:4: B:110:0x0261->B:300:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s(com.app.tgtg.model.remote.manufacturer.response.ManufacturerItemsV2Response r27) {
        /*
            Method dump skipped, instruction units count: 1550
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ym.u.s(com.app.tgtg.model.remote.manufacturer.response.ManufacturerItemsV2Response):void");
    }

    public final void t() {
        if (this.f46236j == null) {
            this.f46236j = new o(this, this, new ArrayList(), r().f46254b.n().getManufacturerBasketItemsLimit(), r().f46254b.n().getUseManufacturerBasketFlow(), r().c());
            c2 c2Var = this.f46233g;
            c2Var.getClass();
            RecyclerView recyclerView = c2Var.C;
            final p70.k kVar = (p70.k) getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager(kVar) { // from class: com.app.tgtg.feature.main.fragments.delivery.parcelfeed.DeliveryFragment$setupAdapter$1
                @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.y1
                public final RecyclerView.a generateDefaultLayoutParams() {
                    return new RecyclerView.a(-1, -2);
                }

                @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.y1
                public final void onLayoutCompleted(n2 n2Var) {
                    n2Var.getClass();
                    super.onLayoutCompleted(n2Var);
                    u uVar = this.f9116a;
                    if (uVar.f46237k) {
                        if (findLastVisibleItemPosition() >= 0 && (findLastVisibleItemPosition() - findFirstVisibleItemPosition()) + 1 > 0) {
                            uVar.f46237k = false;
                            i iVar = uVar.f46240o;
                            if (iVar == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("deliveryFeedImpressionHandler");
                                iVar = null;
                            }
                            o oVar = uVar.f46236j;
                            iVar.a(oVar != null ? oVar.f46203c : null);
                        }
                        m mVar = uVar.f46249x;
                        if (mVar == null || !mVar.f15025c) {
                            return;
                        }
                        c2 c2Var2 = uVar.f46233g;
                        c2Var2.getClass();
                        y1 layoutManager = c2Var2.C.getLayoutManager();
                        layoutManager.getClass();
                        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                        o oVar2 = uVar.f46236j;
                        if (oVar2 != null) {
                            mVar.b(oVar2.c(linearLayoutManager.findFirstVisibleItemPosition(), linearLayoutManager.findLastVisibleItemPosition(), false));
                        }
                    }
                }
            });
            b0 b0Var = new b0(this, 5);
            c2 c2Var2 = this.f46233g;
            c2Var2.getClass();
            c2Var2.C.k(b0Var);
            c2 c2Var3 = this.f46233g;
            c2Var3.getClass();
            c2Var3.C.setHasFixedSize(true);
            c2 c2Var4 = this.f46233g;
            c2Var4.getClass();
            c2Var4.C.setAdapter(this.f46236j);
            c2 c2Var5 = this.f46233g;
            c2Var5.getClass();
            c2Var5.K.setOnRefreshListener(new mp.a(this, 23));
        }
        z("");
    }

    public final void u() {
        this.f46238m = 0L;
        r().d();
        this.f46245t = false;
        this.f46246u = false;
        B();
    }

    public final void v(CategoryCard categoryCard) {
        categoryCard.getClass();
        if (this.f46243r == null) {
            this.f46243r = this.f46242q;
        }
        c2 c2Var = this.f46233g;
        c2Var.getClass();
        y1 layoutManager = c2Var.C.getLayoutManager();
        this.f46244s = layoutManager != null ? layoutManager.onSaveInstanceState() : null;
        this.f46245t = true;
        this.f46237k = true;
        String actionData = categoryCard.getActionData();
        if (actionData == null) {
            actionData = "";
        }
        z(actionData);
    }

    public final void w(AdapterItemType adapterItemType, dn.o oVar, String str) {
        Map map;
        adapterItemType.getClass();
        dn.i iVar = this.f46240o;
        if (iVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("deliveryFeedImpressionHandler");
            iVar = null;
        }
        o oVar2 = this.f46236j;
        ArrayList arrayList = oVar2 != null ? oVar2.f46203c : null;
        LinkedHashMap linkedHashMap = iVar.f15016h;
        dn.n nVar = oVar.f15034a;
        int i11 = oVar.f15036c;
        if (nVar != null) {
            switch (dn.h.$EnumSwitchMapping$0[adapterItemType.ordinal()]) {
                case 1:
                    if (str != null) {
                        if (!linkedHashMap.containsKey(str) || (map = (Map) linkedHashMap.get(str)) == null || !map.containsKey(String.valueOf(i11))) {
                            Object linkedHashMap2 = linkedHashMap.get(str);
                            if (linkedHashMap2 == null) {
                                linkedHashMap2 = new LinkedHashMap();
                                linkedHashMap.put(str, linkedHashMap2);
                            }
                            ((Map) linkedHashMap2).put(String.valueOf(i11), nVar.f15030a);
                        }
                    }
                    break;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    cv.e eVarC = e0.c(iVar.f15010b, nVar, iVar.f15012d, oVar.f15038e, oVar.f15036c, dn.i.b(oVar.f15037d, arrayList));
                    w wVar = iVar.f15011c;
                    wVar.getClass();
                    wVar.f46256d.a(eVarC);
                    break;
            }
        }
    }

    public final void x(BaseItemMnuV2 baseItemMnuV2) {
        baseItemMnuV2.getClass();
        y(false);
        if (baseItemMnuV2.getAvailableStock() > 0) {
            this.f46239n = true;
        }
        if (!r().f46254b.n().getShowManufacturerItems()) {
            mv.a0 a0Var = new mv.a0();
            o0 o0VarRequireActivity = requireActivity();
            o0VarRequireActivity.getClass();
            a0Var.c(o0VarRequireActivity);
            return;
        }
        Class cls = baseItemMnuV2.getItemType() == ItemType.CATERING ? CateringItemDetailsActivity.class : r().f46254b.n().getUseManufacturerBasketFlow() ? BasketItemDetailsActivity.class : ManufacturerItemDetailsActivity.class;
        String strM393getItemIdFvU5WIY = baseItemMnuV2.m393getItemIdFvU5WIY();
        o0 o0VarRequireActivity2 = requireActivity();
        o0VarRequireActivity2.getClass();
        ag.l lVar = new ag.l(o0VarRequireActivity2, r().f46267p, f70.i.SCREEN_DELIVERY);
        strM393getItemIdFvU5WIY.getClass();
        if (bx.o.M(lVar)) {
            return;
        }
        bx.o.Q(lVar, new Intent(o0VarRequireActivity2, (Class<?>) cls), strM393getItemIdFvU5WIY);
    }

    public final void y(boolean z11) {
        if (isAdded()) {
            dn.i iVar = null;
            if (this.f46240o == null) {
                c2 c2Var = this.f46233g;
                c2Var.getClass();
                e0 e0Var = this.f46250y;
                if (e0Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("impressionHelper");
                    e0Var = null;
                }
                this.f46240o = new dn.i(c2Var, e0Var, r());
            }
            dn.i iVar2 = this.f46240o;
            if (iVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("deliveryFeedImpressionHandler");
                iVar2 = null;
            }
            iVar2.d();
            dn.m mVar = this.f46249x;
            if (mVar != null) {
                mVar.a();
            }
            if (z11) {
                int i11 = 0;
                if (this.f46239n) {
                    SharedPreferences sharedPreferencesX = ft.c.x();
                    String strY = ft.c.y();
                    if (strY == null) {
                        strY = null;
                    }
                    if (!sharedPreferencesX.getBoolean(strY + "_firstMnuPurchaseMade", false)) {
                        if (ft.c.b() == 2) {
                            w wVarR = r();
                            cv.i iVar3 = cv.i.ACTION_LEAVE_DELIVERY;
                            iVar3.getClass();
                            wVarR.f46255c.b(iVar3);
                        }
                        int iB = ft.c.b() + 1;
                        SharedPreferences.Editor editorEdit = ft.c.x().edit();
                        String strY2 = ft.c.y();
                        if (strY2 == null) {
                            strY2 = null;
                        }
                        editorEdit.putInt(strY2 + "_actionLeaveDeliveryCount", iB);
                        editorEdit.apply();
                    }
                }
                a8.h hVar = this.f46247v;
                if (hVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("deliveryFeedNpsHandler");
                    hVar = null;
                }
                dn.i iVar4 = this.f46240o;
                if (iVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("deliveryFeedImpressionHandler");
                    iVar4 = null;
                }
                hVar.getClass();
                iVar4.getClass();
                ArrayList arrayList = (ArrayList) hVar.f975d;
                if (cg.q(arrayList)) {
                    for (Object obj : arrayList) {
                        int i12 = i11 + 1;
                        if (i11 < 0) {
                            d0.n();
                            throw null;
                        }
                        mg.a aVar = (mg.a) obj;
                        if (iVar4.f15014f && aVar.f29934g) {
                            hVar.A(i11);
                        }
                        i11 = i12;
                    }
                }
                dn.i iVar5 = this.f46240o;
                if (iVar5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("deliveryFeedImpressionHandler");
                    iVar5 = null;
                }
                if (iVar5.f15013e) {
                    r().e(cv.i.SCREEN_DELIVERY_INFO, h0.g.E(new Pair(dv.a.TYPE, new dv.c("MP_Story"))));
                }
                dn.i iVar6 = this.f46240o;
                if (iVar6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("deliveryFeedImpressionHandler");
                } else {
                    iVar = iVar6;
                }
                if (iVar.f15015g) {
                    r().e(cv.i.SCREEN_DELIVERY_INFO, h0.g.E(new Pair(dv.a.TYPE, new dv.c("Basket_Intro"))));
                }
            }
        }
    }

    public final void z(String str) {
        String actionData;
        str.getClass();
        String str2 = (String) r().f46260h.a("CATEGORY_QUERY");
        dn.i iVar = null;
        if (str2 != null && !r().f46254b.n().getUseManufacturerBasketFlow()) {
            this.f46246u = true;
            this.f46245t = true;
            r().f46260h.d(null, "CATEGORY_QUERY");
            str = str2;
        }
        SortingChoice sortingChoice = r().f46271t;
        if (sortingChoice != null && (actionData = sortingChoice.getActionData()) != null) {
            str = actionData;
        }
        if (this.f46236j == null) {
            t();
        }
        if (!r().f46254b.n().getShowManufacturerItems()) {
            mv.a0 a0Var = new mv.a0();
            o0 o0VarRequireActivity = requireActivity();
            o0VarRequireActivity.getClass();
            a0Var.c(o0VarRequireActivity);
            return;
        }
        if (this.f46240o == null) {
            c2 c2Var = this.f46233g;
            c2Var.getClass();
            e0 e0Var = this.f46250y;
            if (e0Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("impressionHelper");
                e0Var = null;
            }
            this.f46240o = new dn.i(c2Var, e0Var, r());
        }
        dn.i iVar2 = this.f46240o;
        if (iVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("deliveryFeedImpressionHandler");
        } else {
            iVar = iVar2;
        }
        iVar.d();
        dn.m mVar = this.f46249x;
        if (mVar != null) {
            mVar.a();
        }
        r().a(str);
    }
}
