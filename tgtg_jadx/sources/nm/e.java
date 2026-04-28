package nm;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.m1;
import androidx.lifecycle.n1;
import androidx.lifecycle.o0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.n2;
import androidx.recyclerview.widget.r;
import androidx.recyclerview.widget.s1;
import androidx.recyclerview.widget.y1;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import bg.w0;
import br.k;
import c50.w;
import com.app.tgtg.R;
import com.app.tgtg.customview.GenericErrorView;
import com.app.tgtg.feature.locationpicker.newlocationpicker.NewLocationPicker;
import com.app.tgtg.model.local.DietPreferenceModel;
import com.app.tgtg.model.local.GenericErrors;
import com.app.tgtg.model.local.SearchFilter;
import com.app.tgtg.model.remote.item.ItemCategory;
import com.app.tgtg.model.remote.item.response.BasicItem;
import com.app.tgtg.model.remote.item.response.Item;
import cv.g;
import f70.i;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.e0;
import mv.r0;
import mv.u;
import nm.e;
import u70.l;
import u70.t;
import v80.f0;
import zendesk.messaging.android.internal.conversationscreen.TimeConstants;
import zj.j;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lnm/e;", "Landroidx/fragment/app/Fragment;", "Lmm/b;", "<init>", "()V", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFragmentBrowseList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentBrowseList.kt\ncom/app/tgtg/feature/main/fragments/browse/list/FragmentBrowseList\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,368:1\n172#2,9:369\n172#2,9:378\n257#3,2:387\n257#3,2:408\n777#4:389\n873#4,2:390\n812#4,12:392\n1586#4:404\n1661#4,3:405\n1586#4:410\n1661#4,3:411\n1586#4:414\n1661#4,3:415\n1924#4,3:418\n*S KotlinDebug\n*F\n+ 1 FragmentBrowseList.kt\ncom/app/tgtg/feature/main/fragments/browse/list/FragmentBrowseList\n*L\n53#1:369,9\n54#1:378,9\n94#1:387,2\n281#1:408,2\n266#1:389\n266#1:390,2\n269#1:392,12\n270#1:404\n270#1:405,3\n310#1:410\n310#1:411,3\n312#1:414\n312#1:415,3\n359#1:418,3\n*E\n"})
public final class e extends jg.d implements mm.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public e0 f31097g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final n1 f31098h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final n1 f31099i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f31100j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final g f31101k;
    public boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f31102m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f31103n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final k f31104o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public c f31105p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public pg.k f31106q;

    public e() {
        super(1);
        this.f31098h = new n1(Reflection.getOrCreateKotlinClass(tm.e.class), new d(this, 0), new d(this, 2), new d(this, 1));
        this.f31099i = new n1(Reflection.getOrCreateKotlinClass(j.class), new d(this, 3), new d(this, 5), new d(this, 4));
        this.f31100j = l.b(new b(this, 2));
        this.f31101k = g.LIST;
        this.l = true;
        this.f31102m = TimeConstants.ONE_MINUTE_DIFFERENCE;
        this.f31103n = System.currentTimeMillis();
        this.f31104o = new k(this, new ArrayList());
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.browse_list, viewGroup, false);
        int i11 = R.id.errorView;
        GenericErrorView genericErrorView = (GenericErrorView) pd.g.t(R.id.errorView, viewInflate);
        if (genericErrorView != null) {
            i11 = R.id.newLocationPicker;
            NewLocationPicker newLocationPicker = (NewLocationPicker) pd.g.t(R.id.newLocationPicker, viewInflate);
            if (newLocationPicker != null) {
                i11 = R.id.rvListItems;
                RecyclerView recyclerView = (RecyclerView) pd.g.t(R.id.rvListItems, viewInflate);
                if (recyclerView != null) {
                    i11 = R.id.swipeRefreshLayout;
                    SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) pd.g.t(R.id.swipeRefreshLayout, viewInflate);
                    if (swipeRefreshLayout != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                        this.f31106q = new pg.k(constraintLayout, genericErrorView, newLocationPicker, recyclerView, swipeRefreshLayout, 0);
                        constraintLayout.getClass();
                        return constraintLayout;
                    }
                }
            }
        }
        w.l("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f31106q = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        t tVar = this.f31100j;
        if (((w0) tVar.getValue()).f6243c) {
            ((w0) tVar.getValue()).a();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        e0 e0Var = this.f31097g;
        if (e0Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("impressionHelper");
            e0Var = null;
        }
        e0Var.f30176b.clear();
        pg.k kVar = this.f31106q;
        kVar.getClass();
        y1 layoutManager = ((RecyclerView) kVar.f34931e).getLayoutManager();
        layoutManager.getClass();
        if (((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition() > -1) {
            s();
        } else {
            this.l = true;
        }
        super.onResume();
        z();
        if (t().G) {
            w();
            t().G = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        pg.k kVar = this.f31106q;
        kVar.getClass();
        RecyclerView recyclerView = (RecyclerView) kVar.f34931e;
        final p70.k kVar2 = (p70.k) getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(kVar2) { // from class: com.app.tgtg.feature.main.fragments.browse.list.FragmentBrowseList$setupPagingAdapter$1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.y1
            public final RecyclerView.a generateDefaultLayoutParams() {
                return new RecyclerView.a(-1, -2);
            }

            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.y1
            public final void onLayoutCompleted(n2 n2Var) {
                n2Var.getClass();
                super.onLayoutCompleted(n2Var);
                e eVar = this.f9094a;
                if (eVar.l && findLastVisibleItemPosition() >= 0 && (findLastVisibleItemPosition() - findFirstVisibleItemPosition()) + 1 > 0) {
                    eVar.l = false;
                    eVar.s();
                }
            }
        });
        int i11 = t().P;
        pg.k kVar3 = this.f31106q;
        kVar3.getClass();
        y1 layoutManager = ((RecyclerView) kVar3.f34931e).getLayoutManager();
        layoutManager.getClass();
        this.f31105p = new c(this, i11, layoutManager, new m1.a(this));
        pg.k kVar4 = this.f31106q;
        kVar4.getClass();
        s1 itemAnimator = ((RecyclerView) kVar4.f34931e).getItemAnimator();
        itemAnimator.getClass();
        ((r) itemAnimator).f3888g = false;
        pg.k kVar5 = this.f31106q;
        kVar5.getClass();
        RecyclerView recyclerView2 = (RecyclerView) kVar5.f34931e;
        c cVar = this.f31105p;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("paginationListener");
            cVar = null;
        }
        recyclerView2.k(cVar);
        pg.k kVar6 = this.f31106q;
        kVar6.getClass();
        ((RecyclerView) kVar6.f34931e).setHasFixedSize(true);
        u uVar = t().f40311f;
        uVar.getClass();
        String strA = uVar.a(mv.k.APPTRK_CM_SPECIAL_REWARDS_EXP);
        k kVar7 = this.f31104o;
        kVar7.f6645k = strA;
        pg.k kVar8 = this.f31106q;
        kVar8.getClass();
        ((RecyclerView) kVar8.f34931e).setAdapter(kVar7);
        pg.k kVar9 = this.f31106q;
        kVar9.getClass();
        ((SwipeRefreshLayout) kVar9.f34932f).setOnRefreshListener(new mp.a(this, 2));
        tm.e eVarT = t();
        o0 o0Var = eVarT.f40317m;
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        m0.c.f0(o0Var, viewLifecycleOwner, new a(this, 0));
        o0 o0Var2 = eVarT.f40320p;
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        viewLifecycleOwner2.getClass();
        m0.c.f0(o0Var2, viewLifecycleOwner2, new a(this, 1));
        eVarT.f40318n.e(getViewLifecycleOwner(), new al.c(new a(this, 2), 10));
        o0 o0Var3 = eVarT.f40319o;
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        viewLifecycleOwner3.getClass();
        m0.c.f0(o0Var3, viewLifecycleOwner3, new a(this, 3));
        w();
    }

    public final void s() {
        ArrayList arrayList;
        e0 e0Var;
        ArrayList arrayList2 = this.f31104o.f6635a;
        if (arrayList2 != null) {
            arrayList = new ArrayList();
            for (Object obj : arrayList2) {
                if (((ov.b) obj).f33761a instanceof Item) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            e0 e0Var2 = this.f31097g;
            if (e0Var2 != null) {
                e0Var = e0Var2;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("impressionHelper");
                e0Var = null;
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (obj2 instanceof ov.b) {
                    arrayList3.add(obj2);
                }
            }
            ArrayList arrayList4 = new ArrayList(kotlin.collections.e0.o(arrayList3, 10));
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                arrayList4.add((BasicItem) ((ov.b) it.next()).f33761a);
            }
            pg.k kVar = this.f31106q;
            kVar.getClass();
            y1 layoutManager = ((RecyclerView) kVar.f34931e).getLayoutManager();
            layoutManager.getClass();
            e0.e(e0Var, arrayList4, (LinearLayoutManager) layoutManager, this.f31101k, null, 0, new a(this, 4), 56);
        }
    }

    public final tm.e t() {
        return (tm.e) this.f31098h.getValue();
    }

    public final void u() {
        t().S = true;
        tm.e eVarT = t();
        tm.e eVarT2 = t();
        int i11 = eVarT2.N;
        if (i11 > eVarT2.R) {
            eVarT2.Q = true;
        }
        eVarT2.N = i11 + 1;
        int i12 = t().P;
        double dK = r0.k();
        if (eVarT.N > eVarT.O && eVarT.Q) {
            eVarT.S = false;
            return;
        }
        eVarT.f40318n.k(Boolean.TRUE);
        eVarT.M = i12;
        f0.B(m1.d(eVarT), null, null, new tm.b(i11, eVarT, dK, null), 3);
    }

    public final void v(BasicItem basicItem) {
        basicItem.getClass();
        tm.e eVarT = t();
        i iVar = i.SCREEN_BROWSE_LIST;
        iVar.getClass();
        eVarT.f40316k.a(basicItem, iVar);
    }

    public final void w() {
        pg.k kVar = this.f31106q;
        if (kVar != null) {
            ((RecyclerView) kVar.f34931e).setVisibility(0);
            pg.k kVar2 = this.f31106q;
            kVar2.getClass();
            ((RecyclerView) kVar2.f34931e).j0(0);
        }
        k kVar3 = this.f31104o;
        ArrayList arrayList = kVar3.f6635a;
        int size = arrayList != null ? arrayList.size() : 0;
        if (arrayList != null) {
            arrayList.clear();
        }
        kVar3.notifyItemRangeRemoved(0, size);
        tm.e eVarT = t();
        eVarT.N = eVarT.O;
        eVarT.Q = false;
        eVarT.S = false;
        u();
    }

    public final void x(GenericErrors genericErrors) {
        pg.k kVar = this.f31106q;
        kVar.getClass();
        ((GenericErrorView) kVar.f34929c).k(genericErrors);
        pg.k kVar2 = this.f31106q;
        kVar2.getClass();
        ((RecyclerView) kVar2.f34931e).setVisibility(8);
    }

    public final void y() {
        if (!t().f40311f.d()) {
            t().f40316k.c(i.BROWSE);
            return;
        }
        pg.k kVar = this.f31106q;
        kVar.getClass();
        ((NewLocationPicker) kVar.f34930d).setVisibility(0);
        pg.k kVar2 = this.f31106q;
        kVar2.getClass();
        NewLocationPicker newLocationPicker = (NewLocationPicker) kVar2.f34930d;
        newLocationPicker.setOpenedFrom(dv.d.BROWSE.a());
        newLocationPicker.setShowSheet(true);
        newLocationPicker.setOnApplyChangesClicked(new b(this, 1));
    }

    public final void z() {
        ((j) this.f31099i.getValue()).f47948a.getClass();
        SearchFilter searchFilterA = ft.b.a();
        tm.e eVarT = t();
        cv.i iVar = cv.i.SCREEN_LIST;
        Pair pair = new Pair(dv.a.HAS_SEARCH, new dv.c(Boolean.valueOf(searchFilterA.isSearchOn())));
        Pair pair2 = new Pair(dv.a.HAS_TIME_FILTER, new dv.c(Boolean.valueOf(searchFilterA.isPickupTimeSet())));
        dv.a aVar = dv.a.SELECTED_CATEGORY;
        ArrayList<ItemCategory> foodTypes = searchFilterA.getFoodTypes();
        ArrayList arrayList = new ArrayList(kotlin.collections.e0.o(foodTypes, 10));
        Iterator<T> it = foodTypes.iterator();
        while (it.hasNext()) {
            arrayList.add(((ItemCategory) it.next()).name());
        }
        Pair pair3 = new Pair(aVar, new dv.c(arrayList));
        Pair pair4 = new Pair(dv.a.HIDE_SOLD_OUT, new dv.c(Boolean.valueOf(searchFilterA.getShowOnlyAvailable())));
        dv.a aVar2 = dv.a.SELECTED_DIET_TYPE;
        ArrayList<DietPreferenceModel> dietPrefs = searchFilterA.getDietPrefs();
        ArrayList arrayList2 = new ArrayList(kotlin.collections.e0.o(dietPrefs, 10));
        Iterator<T> it2 = dietPrefs.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((DietPreferenceModel) it2.next()).name());
        }
        eVarT.n(iVar, h0.g.E(pair, pair2, pair3, pair4, new Pair(aVar2, new dv.c(arrayList2))));
    }
}
