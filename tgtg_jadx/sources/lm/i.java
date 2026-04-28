package lm;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowInsets;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.o0;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.m1;
import androidx.lifecycle.n1;
import androidx.viewpager2.widget.ViewPager2;
import com.app.tgtg.customview.SearchAndFilterView;
import com.app.tgtg.feature.main.MainActivity;
import com.app.tgtg.model.local.AppConstants;
import com.app.tgtg.model.local.SearchFilter;
import com.app.tgtg.model.remote.item.response.BasicItem;
import com.app.tgtg.model.remote.mapService.response.MapClustersResponse;
import com.app.tgtg.model.remote.mapService.response.MapFilters;
import com.app.tgtg.model.remote.mapService.response.SortingOption;
import com.google.android.material.tabs.TabLayout;
import gj.w;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.n0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import lv.s;
import lv.t;
import m3.k1;
import mv.z;
import om.l;
import v80.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Llm/i;", "Lkm/a;", "<init>", "()V", "Lgj/c0;", "state", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFragmentBrowse.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentBrowse.kt\ncom/app/tgtg/feature/main/fragments/browse/FragmentBrowse\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,581:1\n172#2,9:582\n172#2,9:591\n172#2,9:600\n257#3,2:609\n257#3,2:611\n257#3,2:613\n257#3,2:615\n257#3,2:617\n255#3:619\n257#3,2:620\n85#4:622\n*S KotlinDebug\n*F\n+ 1 FragmentBrowse.kt\ncom/app/tgtg/feature/main/fragments/browse/FragmentBrowse\n*L\n60#1:582,9\n61#1:591,9\n62#1:600,9\n154#1:609,2\n156#1:611,2\n184#1:613,2\n245#1:615,2\n433#1:617,2\n521#1:619\n159#1:620,2\n415#1:622\n*E\n"})
public final class i extends k {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f27921j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f27922k;
    public boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public mm.a f27923m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public MainActivity f27924n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public SearchFilter f27925o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public pg.b f27926p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f27928r;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n1 f27918g = new n1(Reflection.getOrCreateKotlinClass(tm.e.class), new h(this, 0), new h(this, 2), new h(this, 1));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final n1 f27919h = new n1(Reflection.getOrCreateKotlinClass(zj.j.class), new h(this, 3), new h(this, 5), new h(this, 4));

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final n1 f27920i = new n1(Reflection.getOrCreateKotlinClass(ej.c.class), new h(this, 6), new h(this, 8), new h(this, 7));

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final k1 f27927q = m3.i.w(Boolean.FALSE);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final k1 f27929s = m3.i.w(Boolean.TRUE);

    @Override // km.a
    public final z o() {
        return z.BROWSE;
    }

    @Override // lm.k, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        if (context instanceof MainActivity) {
            this.f27924n = (MainActivity) context;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f27921j = arguments.getInt("START_PAGE");
            boolean z11 = arguments.getBoolean("OPEN_BROWSE_FILTER");
            this.f27922k = z11;
            this.l = z11 && s().f40311f.c();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00ca A[PHI: r1
      0x00ca: PHI (r1v12 int) = (r1v11 int), (r1v14 int) binds: [B:19:0x0071, B:21:0x007c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00dc A[PHI: r1
      0x00dc: PHI (r1v2 int) = (r1v1 int), (r1v4 int) binds: [B:3:0x0019, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.LayoutInflater r17, android.view.ViewGroup r18, android.os.Bundle r19) {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lm.i.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f27926p = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        t().f47948a.getClass();
        this.f27925o = ft.b.a();
        pg.b bVar = this.f27926p;
        bVar.getClass();
        ((ViewPager2) bVar.f34783d).setCurrentItem(this.f27921j, false);
    }

    @Override // km.a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        o0 o0VarRequireActivity = requireActivity();
        o0VarRequireActivity.getClass();
        a70.a.t(o0VarRequireActivity, s.J);
        this.f27928r = false;
        pg.b bVar = this.f27926p;
        bVar.getClass();
        ((RelativeLayout) bVar.f34784e).requestFocus();
        pg.b bVar2 = this.f27926p;
        bVar2.getClass();
        SearchAndFilterView searchAndFilterView = (SearchAndFilterView) bVar2.f34788i;
        t().f47948a.getClass();
        ((AppCompatImageView) searchAndFilterView.f8921j.f34762d).setActivated(ft.b.a().isFilterOn());
        t().f47948a.getClass();
        String searchText = ft.b.a().getSearchText();
        t().f47948a.getClass();
        if (ft.b.a().isFromDeepLink() && searchText.length() > 0) {
            pg.b bVar3 = this.f27926p;
            bVar3.getClass();
            ((SearchAndFilterView) bVar3.f34788i).getSearchBox().setText(searchText);
        }
        pg.b bVar4 = this.f27926p;
        bVar4.getClass();
        SearchAndFilterView searchAndFilterView2 = (SearchAndFilterView) bVar4.f34788i;
        final int i11 = 2;
        searchAndFilterView2.setOnSearchListener(new Function1(this) { // from class: lm.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f27906b;

            {
                this.f27906b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i11) {
                    case 0:
                        MapClustersResponse mapClustersResponse = (MapClustersResponse) obj;
                        i iVar = this.f27906b;
                        if (!iVar.f27928r) {
                            tm.e eVarS = iVar.s();
                            mapClustersResponse.getClass();
                            cv.i iVar2 = cv.i.SCREEN_BROWSE;
                            dv.a aVar = dv.a.AVAILABLE_ITEMS;
                            List<BasicItem> fullDetailItems = mapClustersResponse.getFullDetailItems();
                            int size = fullDetailItems != null ? fullDetailItems.size() : 0;
                            eVarS.n(iVar2, h0.g.E(new Pair(aVar, new dv.c(size <= 0 ? dv.d.BROWSE_AVAILABLE_ITEMS_ZERO.a() : size <= 10 ? dv.d.BROWSE_AVAILABLE_ITEMS_ONE_TO_TEN.a() : dv.d.BROWSE_AVAILABLE_ITEMS_ELEVEN_PLUS.a()))));
                            iVar.f27928r = true;
                        }
                        MapFilters filters = mapClustersResponse.getFilters();
                        if (filters != null) {
                            List<SortingOption> sorting = mapClustersResponse.getSorting();
                            if (sorting == null) {
                                sorting = n0.f26529a;
                            }
                            pg.b bVar5 = iVar.f27926p;
                            bVar5.getClass();
                            ((ComposeView) bVar5.f34785f).setContent(new u3.d(new ki.h(iVar, filters, sorting, 2), true, 82180767));
                        }
                        if (iVar.l) {
                            iVar.l = false;
                            FragmentManager parentFragmentManager = iVar.getParentFragmentManager();
                            parentFragmentManager.getClass();
                            new hj.d().show(parentFragmentManager, "FiltersFullScreenFragment");
                        }
                        break;
                    case 1:
                        Boolean bool = (Boolean) obj;
                        i iVar3 = this.f27906b;
                        pg.b bVar6 = iVar3.f27926p;
                        bVar6.getClass();
                        ComposeView composeView = (ComposeView) bVar6.f34786g;
                        bool.getClass();
                        composeView.setVisibility(bool.booleanValue() ? 0 : 8);
                        if (bool.booleanValue()) {
                            pg.b bVar7 = iVar3.f27926p;
                            bVar7.getClass();
                            ((ComposeView) bVar7.f34786g).setContent(a.f27904a);
                        }
                        break;
                    case 2:
                        String str = (String) obj;
                        str.getClass();
                        i iVar4 = this.f27906b;
                        pg.b bVar8 = iVar4.f27926p;
                        bVar8.getClass();
                        String string = ((SearchAndFilterView) bVar8.f34788i).getSearchBox().getText().toString();
                        SearchFilter searchFilter = iVar4.f27925o;
                        SearchFilter searchFilter2 = null;
                        if (searchFilter == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("searchFilter");
                            searchFilter = null;
                        }
                        if (!Intrinsics.areEqual(string, searchFilter.getSearchText())) {
                            SearchFilter searchFilter3 = iVar4.f27925o;
                            if (searchFilter3 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("searchFilter");
                                searchFilter3 = null;
                            }
                            searchFilter3.setSearchText(str);
                            zj.j jVarT = iVar4.t();
                            SearchFilter searchFilter4 = iVar4.f27925o;
                            if (searchFilter4 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("searchFilter");
                            } else {
                                searchFilter2 = searchFilter4;
                            }
                            searchFilter2.getClass();
                            jVarT.f47948a.b(searchFilter2);
                            iVar4.r();
                            iVar4.s().n(cv.i.ACTION_SEARCH_SUBMITTED, h0.g.E(new Pair(dv.a.SCREEN, new dv.c("Screen_Browse")), new Pair(dv.a.SEARCH_TYPE, new dv.c("Free_Text")), new Pair(dv.a.SEARCH_CONTEXT, new dv.c("Magic_Bag"))));
                        }
                        if (string.length() == 0) {
                            pg.b bVar9 = iVar4.f27926p;
                            bVar9.getClass();
                            ((SearchAndFilterView) bVar9.f34788i).k(false);
                        }
                        break;
                    default:
                        qt.a aVar2 = (qt.a) obj;
                        if (aVar2 != null && ((Unit) aVar2.a()) != null) {
                            this.f27906b.r();
                        }
                        break;
                }
                return Unit.f26487a;
            }
        });
        searchAndFilterView2.setOnFilterListener(new c(this, i11));
        searchAndFilterView2.setOnLocationBtnListener(new c(this, 3));
        searchAndFilterView2.setOnCancelListener(new c(this, 4));
        pg.b bVar5 = this.f27926p;
        bVar5.getClass();
        ((ConstraintLayout) ((mc.a) bVar5.f34789j).f29922b).setVisibility(0);
        pg.b bVar6 = this.f27926p;
        bVar6.getClass();
        ((LinearLayout) ((mc.a) bVar6.f34789j).f29923c).setOnClickListener(new ax.s(this, 18));
        pg.b bVar7 = this.f27926p;
        bVar7.getClass();
        ViewCompat.k0((RelativeLayout) bVar7.f34781b, new d(this));
        MainActivity mainActivity = this.f27924n;
        if (mainActivity == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mainActivity");
            mainActivity = null;
        }
        this.f27923m = new mm.a(this, mainActivity);
        pg.b bVar8 = this.f27926p;
        bVar8.getClass();
        ViewPager2 viewPager2 = (ViewPager2) bVar8.f34783d;
        mm.a aVar = this.f27923m;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewPagerAdapter");
            aVar = null;
        }
        viewPager2.setAdapter(aVar);
        pg.b bVar9 = this.f27926p;
        bVar9.getClass();
        ((ViewPager2) bVar9.f34783d).setUserInputEnabled(false);
        pg.b bVar10 = this.f27926p;
        bVar10.getClass();
        TabLayout tabLayout = (TabLayout) bVar10.f34790k;
        pg.b bVar11 = this.f27926p;
        bVar11.getClass();
        new ae.c(tabLayout, (ViewPager2) bVar11.f34783d, new d(this)).b();
        pg.b bVar12 = this.f27926p;
        bVar12.getClass();
        ((ViewPager2) bVar12.f34783d).b(new gl.i(this, 1));
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        f0.B(m1.c(viewLifecycleOwner), null, null, new g(this, null), 3);
        final int i12 = 3;
        t().f47957j.e(getViewLifecycleOwner(), new dk.b(new Function1(this) { // from class: lm.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f27906b;

            {
                this.f27906b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i12) {
                    case 0:
                        MapClustersResponse mapClustersResponse = (MapClustersResponse) obj;
                        i iVar = this.f27906b;
                        if (!iVar.f27928r) {
                            tm.e eVarS = iVar.s();
                            mapClustersResponse.getClass();
                            cv.i iVar2 = cv.i.SCREEN_BROWSE;
                            dv.a aVar2 = dv.a.AVAILABLE_ITEMS;
                            List<BasicItem> fullDetailItems = mapClustersResponse.getFullDetailItems();
                            int size = fullDetailItems != null ? fullDetailItems.size() : 0;
                            eVarS.n(iVar2, h0.g.E(new Pair(aVar2, new dv.c(size <= 0 ? dv.d.BROWSE_AVAILABLE_ITEMS_ZERO.a() : size <= 10 ? dv.d.BROWSE_AVAILABLE_ITEMS_ONE_TO_TEN.a() : dv.d.BROWSE_AVAILABLE_ITEMS_ELEVEN_PLUS.a()))));
                            iVar.f27928r = true;
                        }
                        MapFilters filters = mapClustersResponse.getFilters();
                        if (filters != null) {
                            List<SortingOption> sorting = mapClustersResponse.getSorting();
                            if (sorting == null) {
                                sorting = n0.f26529a;
                            }
                            pg.b bVar52 = iVar.f27926p;
                            bVar52.getClass();
                            ((ComposeView) bVar52.f34785f).setContent(new u3.d(new ki.h(iVar, filters, sorting, 2), true, 82180767));
                        }
                        if (iVar.l) {
                            iVar.l = false;
                            FragmentManager parentFragmentManager = iVar.getParentFragmentManager();
                            parentFragmentManager.getClass();
                            new hj.d().show(parentFragmentManager, "FiltersFullScreenFragment");
                        }
                        break;
                    case 1:
                        Boolean bool = (Boolean) obj;
                        i iVar3 = this.f27906b;
                        pg.b bVar62 = iVar3.f27926p;
                        bVar62.getClass();
                        ComposeView composeView = (ComposeView) bVar62.f34786g;
                        bool.getClass();
                        composeView.setVisibility(bool.booleanValue() ? 0 : 8);
                        if (bool.booleanValue()) {
                            pg.b bVar72 = iVar3.f27926p;
                            bVar72.getClass();
                            ((ComposeView) bVar72.f34786g).setContent(a.f27904a);
                        }
                        break;
                    case 2:
                        String str = (String) obj;
                        str.getClass();
                        i iVar4 = this.f27906b;
                        pg.b bVar82 = iVar4.f27926p;
                        bVar82.getClass();
                        String string = ((SearchAndFilterView) bVar82.f34788i).getSearchBox().getText().toString();
                        SearchFilter searchFilter = iVar4.f27925o;
                        SearchFilter searchFilter2 = null;
                        if (searchFilter == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("searchFilter");
                            searchFilter = null;
                        }
                        if (!Intrinsics.areEqual(string, searchFilter.getSearchText())) {
                            SearchFilter searchFilter3 = iVar4.f27925o;
                            if (searchFilter3 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("searchFilter");
                                searchFilter3 = null;
                            }
                            searchFilter3.setSearchText(str);
                            zj.j jVarT = iVar4.t();
                            SearchFilter searchFilter4 = iVar4.f27925o;
                            if (searchFilter4 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("searchFilter");
                            } else {
                                searchFilter2 = searchFilter4;
                            }
                            searchFilter2.getClass();
                            jVarT.f47948a.b(searchFilter2);
                            iVar4.r();
                            iVar4.s().n(cv.i.ACTION_SEARCH_SUBMITTED, h0.g.E(new Pair(dv.a.SCREEN, new dv.c("Screen_Browse")), new Pair(dv.a.SEARCH_TYPE, new dv.c("Free_Text")), new Pair(dv.a.SEARCH_CONTEXT, new dv.c("Magic_Bag"))));
                        }
                        if (string.length() == 0) {
                            pg.b bVar92 = iVar4.f27926p;
                            bVar92.getClass();
                            ((SearchAndFilterView) bVar92.f34788i).k(false);
                        }
                        break;
                    default:
                        qt.a aVar22 = (qt.a) obj;
                        if (aVar22 != null && ((Unit) aVar22.a()) != null) {
                            this.f27906b.r();
                        }
                        break;
                }
                return Unit.f26487a;
            }
        }, 3));
        final int i13 = 0;
        s().f40322r.e(getViewLifecycleOwner(), new dk.b(new Function1(this) { // from class: lm.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f27906b;

            {
                this.f27906b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i13) {
                    case 0:
                        MapClustersResponse mapClustersResponse = (MapClustersResponse) obj;
                        i iVar = this.f27906b;
                        if (!iVar.f27928r) {
                            tm.e eVarS = iVar.s();
                            mapClustersResponse.getClass();
                            cv.i iVar2 = cv.i.SCREEN_BROWSE;
                            dv.a aVar2 = dv.a.AVAILABLE_ITEMS;
                            List<BasicItem> fullDetailItems = mapClustersResponse.getFullDetailItems();
                            int size = fullDetailItems != null ? fullDetailItems.size() : 0;
                            eVarS.n(iVar2, h0.g.E(new Pair(aVar2, new dv.c(size <= 0 ? dv.d.BROWSE_AVAILABLE_ITEMS_ZERO.a() : size <= 10 ? dv.d.BROWSE_AVAILABLE_ITEMS_ONE_TO_TEN.a() : dv.d.BROWSE_AVAILABLE_ITEMS_ELEVEN_PLUS.a()))));
                            iVar.f27928r = true;
                        }
                        MapFilters filters = mapClustersResponse.getFilters();
                        if (filters != null) {
                            List<SortingOption> sorting = mapClustersResponse.getSorting();
                            if (sorting == null) {
                                sorting = n0.f26529a;
                            }
                            pg.b bVar52 = iVar.f27926p;
                            bVar52.getClass();
                            ((ComposeView) bVar52.f34785f).setContent(new u3.d(new ki.h(iVar, filters, sorting, 2), true, 82180767));
                        }
                        if (iVar.l) {
                            iVar.l = false;
                            FragmentManager parentFragmentManager = iVar.getParentFragmentManager();
                            parentFragmentManager.getClass();
                            new hj.d().show(parentFragmentManager, "FiltersFullScreenFragment");
                        }
                        break;
                    case 1:
                        Boolean bool = (Boolean) obj;
                        i iVar3 = this.f27906b;
                        pg.b bVar62 = iVar3.f27926p;
                        bVar62.getClass();
                        ComposeView composeView = (ComposeView) bVar62.f34786g;
                        bool.getClass();
                        composeView.setVisibility(bool.booleanValue() ? 0 : 8);
                        if (bool.booleanValue()) {
                            pg.b bVar72 = iVar3.f27926p;
                            bVar72.getClass();
                            ((ComposeView) bVar72.f34786g).setContent(a.f27904a);
                        }
                        break;
                    case 2:
                        String str = (String) obj;
                        str.getClass();
                        i iVar4 = this.f27906b;
                        pg.b bVar82 = iVar4.f27926p;
                        bVar82.getClass();
                        String string = ((SearchAndFilterView) bVar82.f34788i).getSearchBox().getText().toString();
                        SearchFilter searchFilter = iVar4.f27925o;
                        SearchFilter searchFilter2 = null;
                        if (searchFilter == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("searchFilter");
                            searchFilter = null;
                        }
                        if (!Intrinsics.areEqual(string, searchFilter.getSearchText())) {
                            SearchFilter searchFilter3 = iVar4.f27925o;
                            if (searchFilter3 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("searchFilter");
                                searchFilter3 = null;
                            }
                            searchFilter3.setSearchText(str);
                            zj.j jVarT = iVar4.t();
                            SearchFilter searchFilter4 = iVar4.f27925o;
                            if (searchFilter4 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("searchFilter");
                            } else {
                                searchFilter2 = searchFilter4;
                            }
                            searchFilter2.getClass();
                            jVarT.f47948a.b(searchFilter2);
                            iVar4.r();
                            iVar4.s().n(cv.i.ACTION_SEARCH_SUBMITTED, h0.g.E(new Pair(dv.a.SCREEN, new dv.c("Screen_Browse")), new Pair(dv.a.SEARCH_TYPE, new dv.c("Free_Text")), new Pair(dv.a.SEARCH_CONTEXT, new dv.c("Magic_Bag"))));
                        }
                        if (string.length() == 0) {
                            pg.b bVar92 = iVar4.f27926p;
                            bVar92.getClass();
                            ((SearchAndFilterView) bVar92.f34788i).k(false);
                        }
                        break;
                    default:
                        qt.a aVar22 = (qt.a) obj;
                        if (aVar22 != null && ((Unit) aVar22.a()) != null) {
                            this.f27906b.r();
                        }
                        break;
                }
                return Unit.f26487a;
            }
        }, 3));
        if (s().f40311f.b()) {
            pg.b bVar13 = this.f27926p;
            bVar13.getClass();
            final int i14 = 1;
            ((ComposeView) bVar13.l).setContent(new u3.d(new lk.a(this, 1), true, 239520559));
            pg.b bVar14 = this.f27926p;
            bVar14.getClass();
            ((TabLayout) bVar14.f34790k).setVisibility(8);
            pg.b bVar15 = this.f27926p;
            bVar15.getClass();
            p30.b.i((int) t.f28253g, (SearchAndFilterView) bVar15.f34788i);
            pg.b bVar16 = this.f27926p;
            bVar16.getClass();
            bVar16.f34782c.setVisibility(8);
            this.f27921j = 1;
            s().E.e(getViewLifecycleOwner(), new dk.b(new Function1(this) { // from class: lm.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ i f27906b;

                {
                    this.f27906b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    switch (i14) {
                        case 0:
                            MapClustersResponse mapClustersResponse = (MapClustersResponse) obj;
                            i iVar = this.f27906b;
                            if (!iVar.f27928r) {
                                tm.e eVarS = iVar.s();
                                mapClustersResponse.getClass();
                                cv.i iVar2 = cv.i.SCREEN_BROWSE;
                                dv.a aVar2 = dv.a.AVAILABLE_ITEMS;
                                List<BasicItem> fullDetailItems = mapClustersResponse.getFullDetailItems();
                                int size = fullDetailItems != null ? fullDetailItems.size() : 0;
                                eVarS.n(iVar2, h0.g.E(new Pair(aVar2, new dv.c(size <= 0 ? dv.d.BROWSE_AVAILABLE_ITEMS_ZERO.a() : size <= 10 ? dv.d.BROWSE_AVAILABLE_ITEMS_ONE_TO_TEN.a() : dv.d.BROWSE_AVAILABLE_ITEMS_ELEVEN_PLUS.a()))));
                                iVar.f27928r = true;
                            }
                            MapFilters filters = mapClustersResponse.getFilters();
                            if (filters != null) {
                                List<SortingOption> sorting = mapClustersResponse.getSorting();
                                if (sorting == null) {
                                    sorting = n0.f26529a;
                                }
                                pg.b bVar52 = iVar.f27926p;
                                bVar52.getClass();
                                ((ComposeView) bVar52.f34785f).setContent(new u3.d(new ki.h(iVar, filters, sorting, 2), true, 82180767));
                            }
                            if (iVar.l) {
                                iVar.l = false;
                                FragmentManager parentFragmentManager = iVar.getParentFragmentManager();
                                parentFragmentManager.getClass();
                                new hj.d().show(parentFragmentManager, "FiltersFullScreenFragment");
                            }
                            break;
                        case 1:
                            Boolean bool = (Boolean) obj;
                            i iVar3 = this.f27906b;
                            pg.b bVar62 = iVar3.f27926p;
                            bVar62.getClass();
                            ComposeView composeView = (ComposeView) bVar62.f34786g;
                            bool.getClass();
                            composeView.setVisibility(bool.booleanValue() ? 0 : 8);
                            if (bool.booleanValue()) {
                                pg.b bVar72 = iVar3.f27926p;
                                bVar72.getClass();
                                ((ComposeView) bVar72.f34786g).setContent(a.f27904a);
                            }
                            break;
                        case 2:
                            String str = (String) obj;
                            str.getClass();
                            i iVar4 = this.f27906b;
                            pg.b bVar82 = iVar4.f27926p;
                            bVar82.getClass();
                            String string = ((SearchAndFilterView) bVar82.f34788i).getSearchBox().getText().toString();
                            SearchFilter searchFilter = iVar4.f27925o;
                            SearchFilter searchFilter2 = null;
                            if (searchFilter == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("searchFilter");
                                searchFilter = null;
                            }
                            if (!Intrinsics.areEqual(string, searchFilter.getSearchText())) {
                                SearchFilter searchFilter3 = iVar4.f27925o;
                                if (searchFilter3 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("searchFilter");
                                    searchFilter3 = null;
                                }
                                searchFilter3.setSearchText(str);
                                zj.j jVarT = iVar4.t();
                                SearchFilter searchFilter4 = iVar4.f27925o;
                                if (searchFilter4 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("searchFilter");
                                } else {
                                    searchFilter2 = searchFilter4;
                                }
                                searchFilter2.getClass();
                                jVarT.f47948a.b(searchFilter2);
                                iVar4.r();
                                iVar4.s().n(cv.i.ACTION_SEARCH_SUBMITTED, h0.g.E(new Pair(dv.a.SCREEN, new dv.c("Screen_Browse")), new Pair(dv.a.SEARCH_TYPE, new dv.c("Free_Text")), new Pair(dv.a.SEARCH_CONTEXT, new dv.c("Magic_Bag"))));
                            }
                            if (string.length() == 0) {
                                pg.b bVar92 = iVar4.f27926p;
                                bVar92.getClass();
                                ((SearchAndFilterView) bVar92.f34788i).k(false);
                            }
                            break;
                        default:
                            qt.a aVar22 = (qt.a) obj;
                            if (aVar22 != null && ((Unit) aVar22.a()) != null) {
                                this.f27906b.r();
                            }
                            break;
                    }
                    return Unit.f26487a;
                }
            }, 3));
        }
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        viewLifecycleOwner2.getClass();
        f0.B(m1.c(viewLifecycleOwner2), null, null, new f(this, null), 3);
        t().f47948a.getClass();
        if (ft.b.a().isFromDeepLink()) {
            ft.b bVar17 = t().f47948a;
            bVar17.getClass();
            bVar17.f17901a = ft.b.a();
            t().f47948a.getClass();
            ft.b.a().setFromDeepLink(false);
        } else {
            t().f47948a.getClass();
            ft.b.a().setSearchText("");
        }
        if (!this.f27922k || s().f40311f.c()) {
            return;
        }
        x();
    }

    public final void q() {
        if (s().f40311f.c()) {
            w wVar = ((ej.c) this.f27920i.getValue()).f16043a;
            wVar.f20523c.i(gj.b.f20478a);
        }
        zj.j jVarT = t();
        ft.b bVar = jVarT.f47948a;
        bVar.b(new SearchFilter(false, null, null, null, null, "", null, false, AppConstants.GO_TO_GPS_SETTINGS, null));
        bVar.f17901a = ft.b.a();
        SearchFilter searchFilterA = ft.b.a();
        ((androidx.lifecycle.o0) jVarT.f47952e.getValue()).k(searchFilterA);
        ((androidx.lifecycle.o0) jVarT.f47953f.getValue()).k(searchFilterA);
        ((androidx.lifecycle.o0) jVarT.f47954g.getValue()).k(searchFilterA);
        ((androidx.lifecycle.o0) jVarT.f47955h.getValue()).k(searchFilterA);
        ((androidx.lifecycle.o0) jVarT.f47951d.getValue()).k(searchFilterA);
        pg.b bVar2 = this.f27926p;
        bVar2.getClass();
        SearchAndFilterView searchAndFilterView = (SearchAndFilterView) bVar2.f34788i;
        t().f47948a.getClass();
        ((AppCompatImageView) searchAndFilterView.f8921j.f34762d).setActivated(ft.b.a().isFilterOn());
        pg.b bVar3 = this.f27926p;
        bVar3.getClass();
        ((SearchAndFilterView) bVar3.f34788i).k(false);
        pg.b bVar4 = this.f27926p;
        bVar4.getClass();
        TextView textView = (TextView) ((mc.a) bVar4.f34789j).f29924d;
        t().f47948a.getClass();
        textView.setText(getString(ft.b.a().getSortOption().getNameRes()));
        zj.j jVarT2 = t();
        jVarT2.f47948a.b(new SearchFilter(true, null, null, null, null, null, null, false, 254, null));
        t().f47948a.getClass();
        this.f27925o = ft.b.a();
        pg.b bVar5 = this.f27926p;
        bVar5.getClass();
        AppCompatImageView filterBox = ((SearchAndFilterView) bVar5.f34788i).getFilterBox();
        t().f47948a.getClass();
        filterBox.setActivated(ft.b.a().isFilterOn());
        if (t().f47948a.f17901a.isFilterOn()) {
            t().a();
        }
        w(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [x70.c] */
    /* JADX WARN: Type inference failed for: r3v1 */
    public final void r() {
        mm.a aVar = 0;
        mm.a aVar2 = null;
        f0.B(m1.c(this), null, null, new e(this, aVar, 0), 3);
        t().f47948a.getClass();
        this.f27925o = ft.b.a();
        pg.b bVar = this.f27926p;
        bVar.getClass();
        SearchAndFilterView searchAndFilterView = (SearchAndFilterView) bVar.f34788i;
        t().f47948a.getClass();
        ((AppCompatImageView) searchAndFilterView.f8921j.f34762d).setActivated(ft.b.a().isFilterOn());
        pg.b bVar2 = this.f27926p;
        bVar2.getClass();
        SearchAndFilterView searchAndFilterView2 = (SearchAndFilterView) bVar2.f34788i;
        t().f47948a.getClass();
        searchAndFilterView2.k(ft.b.a().isSearchOn());
        pg.b bVar3 = this.f27926p;
        bVar3.getClass();
        TextView textView = (TextView) ((mc.a) bVar3.f34789j).f29924d;
        t().f47948a.getClass();
        textView.setText(getString(ft.b.a().getSortOption().getNameRes()));
        pg.b bVar4 = this.f27926p;
        bVar4.getClass();
        int currentItem = ((ViewPager2) bVar4.f34783d).getCurrentItem();
        mm.a aVar3 = this.f27923m;
        if (aVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewPagerAdapter");
            aVar3 = null;
        }
        boolean z11 = aVar3.i(currentItem) instanceof nm.e;
        mm.a aVar4 = this.f27923m;
        if (z11) {
            if (aVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewPagerAdapter");
            } else {
                aVar2 = aVar4;
            }
            Fragment fragmentI = aVar2.i(currentItem);
            fragmentI.getClass();
            ((nm.e) fragmentI).z();
            return;
        }
        if (aVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewPagerAdapter");
            aVar4 = null;
        }
        if (aVar4.i(currentItem) instanceof l) {
            mm.a aVar5 = this.f27923m;
            if (aVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewPagerAdapter");
            } else {
                aVar = aVar5;
            }
            Fragment fragmentI2 = aVar.i(currentItem);
            fragmentI2.getClass();
            ((l) fragmentI2).O();
        }
    }

    public final tm.e s() {
        return (tm.e) this.f27918g.getValue();
    }

    public final zj.j t() {
        return (zj.j) this.f27919h.getValue();
    }

    public final int u() {
        pg.b bVar = this.f27926p;
        bVar.getClass();
        int height = ((ComposeView) bVar.l).getHeight();
        if (s().f40311f.c()) {
            pg.b bVar2 = this.f27926p;
            bVar2.getClass();
            if (((ComposeView) bVar2.f34785f).getVisibility() == 0) {
                pg.b bVar3 = this.f27926p;
                bVar3.getClass();
                height += ((ComposeView) bVar3.f34785f).getHeight();
            }
        }
        if (requireContext().getResources().getDisplayMetrics().density <= 0.0f) {
            return 0;
        }
        if (Build.VERSION.SDK_INT >= 35) {
            WindowInsets rootWindowInsets = requireActivity().getWindow().getDecorView().getRootWindowInsets();
            rootWindowInsets.getClass();
            height += rootWindowInsets.getInsets(WindowInsets.Type.statusBars()).top;
        }
        return (int) (height / requireContext().getResources().getDisplayMetrics().density);
    }

    public final int v() {
        pg.b bVar = this.f27926p;
        bVar.getClass();
        int height = ((ComposeView) bVar.l).getHeight();
        if (requireContext().getResources().getDisplayMetrics().density > 0.0f) {
            return (int) (height / requireContext().getResources().getDisplayMetrics().density);
        }
        return 0;
    }

    public final void w(boolean z11) {
        pg.b bVar = this.f27926p;
        bVar.getClass();
        int currentItem = ((ViewPager2) bVar.f34783d).getCurrentItem();
        mm.a aVar = this.f27923m;
        mm.a aVar2 = null;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewPagerAdapter");
            aVar = null;
        }
        boolean z12 = aVar.i(currentItem) instanceof nm.e;
        mm.a aVar3 = this.f27923m;
        if (z12) {
            if (aVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewPagerAdapter");
            } else {
                aVar2 = aVar3;
            }
            Fragment fragmentI = aVar2.i(currentItem);
            fragmentI.getClass();
            ((nm.e) fragmentI).w();
            s().H = true;
            s().I = z11;
            return;
        }
        if (aVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewPagerAdapter");
            aVar3 = null;
        }
        if (aVar3.i(currentItem) instanceof l) {
            mm.a aVar4 = this.f27923m;
            if (aVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewPagerAdapter");
                aVar4 = null;
            }
            Fragment fragmentI2 = aVar4.i(currentItem);
            fragmentI2.getClass();
            l lVar = (l) fragmentI2;
            f0.B(lVar, null, null, new om.j(lVar, z11, null), 3);
            s().G = true;
        }
    }

    public final void x() {
        zj.h hVar = new zj.h();
        Bundle bundle = new Bundle();
        int i11 = this.f27921j;
        if (i11 == 0) {
            bundle.putString("source", zj.f.LIST.a());
        } else if (i11 == 1) {
            bundle.putString("source", zj.f.MAP.a());
        }
        hVar.setArguments(bundle);
        hVar.show(getParentFragmentManager(), "FiltersBottomSheetFragment");
    }

    public final void y(boolean z11) {
        pg.b bVar = this.f27926p;
        bVar.getClass();
        ConstraintLayout constraintLayout = (ConstraintLayout) ((mc.a) bVar.f34789j).f29922b;
        if (this.f27921j != 0) {
            z11 = false;
        }
        constraintLayout.setVisibility(z11 ? 0 : 8);
    }
}
