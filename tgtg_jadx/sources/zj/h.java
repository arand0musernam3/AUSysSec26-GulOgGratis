package zj;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.n1;
import androidx.lifecycle.o0;
import b0.z;
import c50.w;
import com.app.tgtg.R;
import com.app.tgtg.feature.filter.FilterSelectorButtonView;
import com.app.tgtg.feature.filter.ui.FlowLayout;
import com.app.tgtg.feature.main.MainActivity;
import com.app.tgtg.model.local.CollectionDayModel;
import com.app.tgtg.model.local.CollectionTimeModel;
import com.app.tgtg.model.local.DietPreferenceModel;
import com.app.tgtg.model.local.SearchFilter;
import com.app.tgtg.model.remote.item.ItemCategory;
import com.google.android.material.bottomsheet.l;
import com.google.android.material.bottomsheet.m;
import com.google.android.material.slider.RangeSlider;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import mv.r0;
import mv.u;
import p70.k;
import pg.z0;
import uk.p;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lzj/h;", "Lcom/google/android/material/bottomsheet/m;", "<init>", "()V", "zj/f", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFiltersBottomSheetFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FiltersBottomSheetFragment.kt\ncom/app/tgtg/feature/filter/FiltersBottomSheetFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,329:1\n172#2,9:330\n172#2,9:339\n*S KotlinDebug\n*F\n+ 1 FiltersBottomSheetFragment.kt\ncom/app/tgtg/feature/filter/FiltersBottomSheetFragment\n*L\n36#1:330,9\n37#1:339,9\n*E\n"})
public final class h extends m implements r70.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public k f47939a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile p70.g f47941c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public z0 f47944f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f47947i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f47940b = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f47942d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f47943e = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n1 f47945g = new n1(Reflection.getOrCreateKotlinClass(j.class), new g(this, 0), new g(this, 2), new g(this, 1));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final n1 f47946h = new n1(Reflection.getOrCreateKotlinClass(tm.e.class), new g(this, 3), new g(this, 5), new g(this, 4));

    @Override // r70.b
    public final Object a() {
        if (this.f47941c == null) {
            synchronized (this.f47942d) {
                try {
                    if (this.f47941c == null) {
                        this.f47941c = new p70.g(this);
                    }
                } finally {
                }
            }
        }
        return this.f47941c.a();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f47940b) {
            return null;
        }
        r();
        return this.f47939a;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.p
    public final ViewModelProvider$Factory getDefaultViewModelProviderFactory() {
        return zz.f.s(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        k kVar = this.f47939a;
        ox.h.q(kVar == null || p70.g.d(kVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        r();
        if (this.f47943e) {
            return;
        }
        this.f47943e = true;
        ((i) a()).getClass();
    }

    @Override // com.google.android.material.bottomsheet.m, k.z, androidx.fragment.app.y
    public final Dialog onCreateDialog(Bundle bundle) {
        l lVar = new l(requireContext(), getTheme());
        lVar.setOnShowListener(new b());
        return lVar;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.filters_bottom_sheet_fragment, viewGroup, false);
        int i11 = R.id.bottomNavLayout;
        if (((ConstraintLayout) pd.g.t(R.id.bottomNavLayout, viewInflate)) != null) {
            i11 = R.id.clearFilters;
            TextView textView = (TextView) pd.g.t(R.id.clearFilters, viewInflate);
            if (textView != null) {
                i11 = R.id.collectionDayContent;
                if (((LinearLayout) pd.g.t(R.id.collectionDayContent, viewInflate)) != null) {
                    i11 = R.id.collectionDayOptionToday;
                    FilterSelectorButtonView filterSelectorButtonView = (FilterSelectorButtonView) pd.g.t(R.id.collectionDayOptionToday, viewInflate);
                    if (filterSelectorButtonView != null) {
                        i11 = R.id.collectionDayOptionTomorrow;
                        FilterSelectorButtonView filterSelectorButtonView2 = (FilterSelectorButtonView) pd.g.t(R.id.collectionDayOptionTomorrow, viewInflate);
                        if (filterSelectorButtonView2 != null) {
                            i11 = R.id.collectionDayTitle;
                            if (((TextView) pd.g.t(R.id.collectionDayTitle, viewInflate)) != null) {
                                i11 = R.id.collectionTimeContent;
                                if (((LinearLayout) pd.g.t(R.id.collectionTimeContent, viewInflate)) != null) {
                                    i11 = R.id.collectionTimeDescription;
                                    TextView textView2 = (TextView) pd.g.t(R.id.collectionTimeDescription, viewInflate);
                                    if (textView2 != null) {
                                        i11 = R.id.collectionTimePicker;
                                        RangeSlider rangeSlider = (RangeSlider) pd.g.t(R.id.collectionTimePicker, viewInflate);
                                        if (rangeSlider != null) {
                                            i11 = R.id.collectionTimeTitle;
                                            if (((TextView) pd.g.t(R.id.collectionTimeTitle, viewInflate)) != null) {
                                                i11 = R.id.dietPreferencesContent;
                                                if (((LinearLayout) pd.g.t(R.id.dietPreferencesContent, viewInflate)) != null) {
                                                    i11 = R.id.dietaryPrefsOptionVegan;
                                                    FilterSelectorButtonView filterSelectorButtonView3 = (FilterSelectorButtonView) pd.g.t(R.id.dietaryPrefsOptionVegan, viewInflate);
                                                    if (filterSelectorButtonView3 != null) {
                                                        i11 = R.id.dietaryPrefsOptionVegetarian;
                                                        FilterSelectorButtonView filterSelectorButtonView4 = (FilterSelectorButtonView) pd.g.t(R.id.dietaryPrefsOptionVegetarian, viewInflate);
                                                        if (filterSelectorButtonView4 != null) {
                                                            i11 = R.id.dietaryPrefsTitle;
                                                            if (((TextView) pd.g.t(R.id.dietaryPrefsTitle, viewInflate)) != null) {
                                                                i11 = R.id.filtersBottomSheet;
                                                                if (((ConstraintLayout) pd.g.t(R.id.filtersBottomSheet, viewInflate)) != null) {
                                                                    i11 = R.id.foodTypeOptionBread;
                                                                    FilterSelectorButtonView filterSelectorButtonView5 = (FilterSelectorButtonView) pd.g.t(R.id.foodTypeOptionBread, viewInflate);
                                                                    if (filterSelectorButtonView5 != null) {
                                                                        i11 = R.id.foodTypeOptionFlowers;
                                                                        FilterSelectorButtonView filterSelectorButtonView6 = (FilterSelectorButtonView) pd.g.t(R.id.foodTypeOptionFlowers, viewInflate);
                                                                        if (filterSelectorButtonView6 != null) {
                                                                            i11 = R.id.foodTypeOptionGroceries;
                                                                            FilterSelectorButtonView filterSelectorButtonView7 = (FilterSelectorButtonView) pd.g.t(R.id.foodTypeOptionGroceries, viewInflate);
                                                                            if (filterSelectorButtonView7 != null) {
                                                                                i11 = R.id.foodTypeOptionMeals;
                                                                                FilterSelectorButtonView filterSelectorButtonView8 = (FilterSelectorButtonView) pd.g.t(R.id.foodTypeOptionMeals, viewInflate);
                                                                                if (filterSelectorButtonView8 != null) {
                                                                                    i11 = R.id.foodTypeOptionOther;
                                                                                    FilterSelectorButtonView filterSelectorButtonView9 = (FilterSelectorButtonView) pd.g.t(R.id.foodTypeOptionOther, viewInflate);
                                                                                    if (filterSelectorButtonView9 != null) {
                                                                                        i11 = R.id.foodTypeOptionPersonalCare;
                                                                                        FilterSelectorButtonView filterSelectorButtonView10 = (FilterSelectorButtonView) pd.g.t(R.id.foodTypeOptionPersonalCare, viewInflate);
                                                                                        if (filterSelectorButtonView10 != null) {
                                                                                            i11 = R.id.foodTypeOptionPetFood;
                                                                                            FilterSelectorButtonView filterSelectorButtonView11 = (FilterSelectorButtonView) pd.g.t(R.id.foodTypeOptionPetFood, viewInflate);
                                                                                            if (filterSelectorButtonView11 != null) {
                                                                                                i11 = R.id.foodTypesContent;
                                                                                                FlowLayout flowLayout = (FlowLayout) pd.g.t(R.id.foodTypesContent, viewInflate);
                                                                                                if (flowLayout != null) {
                                                                                                    i11 = R.id.foodTypesTitle;
                                                                                                    if (((TextView) pd.g.t(R.id.foodTypesTitle, viewInflate)) != null) {
                                                                                                        i11 = R.id.pageClose;
                                                                                                        ImageView imageView = (ImageView) pd.g.t(R.id.pageClose, viewInflate);
                                                                                                        if (imageView != null) {
                                                                                                            i11 = R.id.pageTitle;
                                                                                                            if (((TextView) pd.g.t(R.id.pageTitle, viewInflate)) != null) {
                                                                                                                i11 = R.id.showFilterResults;
                                                                                                                Button button = (Button) pd.g.t(R.id.showFilterResults, viewInflate);
                                                                                                                if (button != null) {
                                                                                                                    i11 = R.id.showSoldOutSwitch;
                                                                                                                    SwitchCompat switchCompat = (SwitchCompat) pd.g.t(R.id.showSoldOutSwitch, viewInflate);
                                                                                                                    if (switchCompat != null) {
                                                                                                                        i11 = R.id.soldOutTitle;
                                                                                                                        if (((TextView) pd.g.t(R.id.soldOutTitle, viewInflate)) != null) {
                                                                                                                            i11 = R.id.soldOutTopStroke;
                                                                                                                            if (pd.g.t(R.id.soldOutTopStroke, viewInflate) != null) {
                                                                                                                                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) viewInflate;
                                                                                                                                this.f47944f = new z0(coordinatorLayout, textView, filterSelectorButtonView, filterSelectorButtonView2, textView2, rangeSlider, filterSelectorButtonView3, filterSelectorButtonView4, filterSelectorButtonView5, filterSelectorButtonView6, filterSelectorButtonView7, filterSelectorButtonView8, filterSelectorButtonView9, filterSelectorButtonView10, filterSelectorButtonView11, flowLayout, imageView, button, switchCompat);
                                                                                                                                coordinatorLayout.getClass();
                                                                                                                                return coordinatorLayout;
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        w.l("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
        return null;
    }

    @Override // androidx.fragment.app.y, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(new k(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        j jVarQ = q();
        String str = this.f47947i;
        if (str == null) {
            str = "";
        }
        jVarQ.f47949b.c(cv.i.SCREEN_FILTER, h0.g.E(new Pair(dv.a.SCREEN, new dv.c(str))));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        j jVarQ = q();
        o0 o0Var = (o0) jVarQ.f47951d.getValue();
        androidx.fragment.app.o0 activity = getActivity();
        activity.getClass();
        final int i11 = 0;
        final int i12 = 11;
        o0Var.e((MainActivity) activity, new dk.b(new Function1(this) { // from class: zj.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f47934b;

            {
                this.f47934b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                SearchFilter searchFilter = (SearchFilter) obj;
                switch (i11) {
                    case 0:
                        searchFilter.getClass();
                        h hVar = this.f47934b;
                        z0 z0Var = hVar.f47944f;
                        z0Var.getClass();
                        if (z0Var.f35318s.isAttachedToWindow()) {
                            z0 z0Var2 = hVar.f47944f;
                            z0Var2.getClass();
                            z0Var2.f35318s.setChecked(!searchFilter.getShowOnlyAvailable());
                        }
                        break;
                    case 1:
                        searchFilter.getClass();
                        this.f47934b.u(searchFilter);
                        break;
                    case 2:
                        searchFilter.getClass();
                        h hVar2 = this.f47934b;
                        z0 z0Var3 = hVar2.f47944f;
                        z0Var3.getClass();
                        List<Float> rawTimes = searchFilter.getCollectionTimes().getRawTimes();
                        z0Var3.f35305e.setText(hVar2.s(searchFilter.getCollectionTimes()));
                        z0Var3.f35306f.setValues(rawTimes);
                        break;
                    case 3:
                        searchFilter.getClass();
                        this.f47934b.y(searchFilter);
                        break;
                    default:
                        searchFilter.getClass();
                        this.f47934b.w(searchFilter);
                        break;
                }
                return Unit.f26487a;
            }
        }, 11));
        o0 o0Var2 = (o0) jVarQ.f47952e.getValue();
        androidx.fragment.app.o0 activity2 = getActivity();
        activity2.getClass();
        final int i13 = 1;
        o0Var2.e((MainActivity) activity2, new dk.b(new Function1(this) { // from class: zj.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f47934b;

            {
                this.f47934b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                SearchFilter searchFilter = (SearchFilter) obj;
                switch (i13) {
                    case 0:
                        searchFilter.getClass();
                        h hVar = this.f47934b;
                        z0 z0Var = hVar.f47944f;
                        z0Var.getClass();
                        if (z0Var.f35318s.isAttachedToWindow()) {
                            z0 z0Var2 = hVar.f47944f;
                            z0Var2.getClass();
                            z0Var2.f35318s.setChecked(!searchFilter.getShowOnlyAvailable());
                        }
                        break;
                    case 1:
                        searchFilter.getClass();
                        this.f47934b.u(searchFilter);
                        break;
                    case 2:
                        searchFilter.getClass();
                        h hVar2 = this.f47934b;
                        z0 z0Var3 = hVar2.f47944f;
                        z0Var3.getClass();
                        List<Float> rawTimes = searchFilter.getCollectionTimes().getRawTimes();
                        z0Var3.f35305e.setText(hVar2.s(searchFilter.getCollectionTimes()));
                        z0Var3.f35306f.setValues(rawTimes);
                        break;
                    case 3:
                        searchFilter.getClass();
                        this.f47934b.y(searchFilter);
                        break;
                    default:
                        searchFilter.getClass();
                        this.f47934b.w(searchFilter);
                        break;
                }
                return Unit.f26487a;
            }
        }, 11));
        o0 o0Var3 = (o0) jVarQ.f47953f.getValue();
        androidx.fragment.app.o0 activity3 = getActivity();
        activity3.getClass();
        final int i14 = 2;
        o0Var3.e((MainActivity) activity3, new dk.b(new Function1(this) { // from class: zj.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f47934b;

            {
                this.f47934b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                SearchFilter searchFilter = (SearchFilter) obj;
                switch (i14) {
                    case 0:
                        searchFilter.getClass();
                        h hVar = this.f47934b;
                        z0 z0Var = hVar.f47944f;
                        z0Var.getClass();
                        if (z0Var.f35318s.isAttachedToWindow()) {
                            z0 z0Var2 = hVar.f47944f;
                            z0Var2.getClass();
                            z0Var2.f35318s.setChecked(!searchFilter.getShowOnlyAvailable());
                        }
                        break;
                    case 1:
                        searchFilter.getClass();
                        this.f47934b.u(searchFilter);
                        break;
                    case 2:
                        searchFilter.getClass();
                        h hVar2 = this.f47934b;
                        z0 z0Var3 = hVar2.f47944f;
                        z0Var3.getClass();
                        List<Float> rawTimes = searchFilter.getCollectionTimes().getRawTimes();
                        z0Var3.f35305e.setText(hVar2.s(searchFilter.getCollectionTimes()));
                        z0Var3.f35306f.setValues(rawTimes);
                        break;
                    case 3:
                        searchFilter.getClass();
                        this.f47934b.y(searchFilter);
                        break;
                    default:
                        searchFilter.getClass();
                        this.f47934b.w(searchFilter);
                        break;
                }
                return Unit.f26487a;
            }
        }, 11));
        o0 o0Var4 = (o0) jVarQ.f47954g.getValue();
        androidx.fragment.app.o0 activity4 = getActivity();
        activity4.getClass();
        final int i15 = 3;
        o0Var4.e((MainActivity) activity4, new dk.b(new Function1(this) { // from class: zj.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f47934b;

            {
                this.f47934b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                SearchFilter searchFilter = (SearchFilter) obj;
                switch (i15) {
                    case 0:
                        searchFilter.getClass();
                        h hVar = this.f47934b;
                        z0 z0Var = hVar.f47944f;
                        z0Var.getClass();
                        if (z0Var.f35318s.isAttachedToWindow()) {
                            z0 z0Var2 = hVar.f47944f;
                            z0Var2.getClass();
                            z0Var2.f35318s.setChecked(!searchFilter.getShowOnlyAvailable());
                        }
                        break;
                    case 1:
                        searchFilter.getClass();
                        this.f47934b.u(searchFilter);
                        break;
                    case 2:
                        searchFilter.getClass();
                        h hVar2 = this.f47934b;
                        z0 z0Var3 = hVar2.f47944f;
                        z0Var3.getClass();
                        List<Float> rawTimes = searchFilter.getCollectionTimes().getRawTimes();
                        z0Var3.f35305e.setText(hVar2.s(searchFilter.getCollectionTimes()));
                        z0Var3.f35306f.setValues(rawTimes);
                        break;
                    case 3:
                        searchFilter.getClass();
                        this.f47934b.y(searchFilter);
                        break;
                    default:
                        searchFilter.getClass();
                        this.f47934b.w(searchFilter);
                        break;
                }
                return Unit.f26487a;
            }
        }, 11));
        o0 o0Var5 = (o0) jVarQ.f47955h.getValue();
        androidx.fragment.app.o0 activity5 = getActivity();
        activity5.getClass();
        final int i16 = 4;
        o0Var5.e((MainActivity) activity5, new dk.b(new Function1(this) { // from class: zj.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f47934b;

            {
                this.f47934b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                SearchFilter searchFilter = (SearchFilter) obj;
                switch (i16) {
                    case 0:
                        searchFilter.getClass();
                        h hVar = this.f47934b;
                        z0 z0Var = hVar.f47944f;
                        z0Var.getClass();
                        if (z0Var.f35318s.isAttachedToWindow()) {
                            z0 z0Var2 = hVar.f47944f;
                            z0Var2.getClass();
                            z0Var2.f35318s.setChecked(!searchFilter.getShowOnlyAvailable());
                        }
                        break;
                    case 1:
                        searchFilter.getClass();
                        this.f47934b.u(searchFilter);
                        break;
                    case 2:
                        searchFilter.getClass();
                        h hVar2 = this.f47934b;
                        z0 z0Var3 = hVar2.f47944f;
                        z0Var3.getClass();
                        List<Float> rawTimes = searchFilter.getCollectionTimes().getRawTimes();
                        z0Var3.f35305e.setText(hVar2.s(searchFilter.getCollectionTimes()));
                        z0Var3.f35306f.setValues(rawTimes);
                        break;
                    case 3:
                        searchFilter.getClass();
                        this.f47934b.y(searchFilter);
                        break;
                    default:
                        searchFilter.getClass();
                        this.f47934b.w(searchFilter);
                        break;
                }
                return Unit.f26487a;
            }
        }, 11));
        z0 z0Var = this.f47944f;
        z0Var.getClass();
        z0Var.f35316q.setOnClickListener(new View.OnClickListener(this) { // from class: zj.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f47932b;

            {
                this.f47932b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i17 = i12;
                h hVar = this.f47932b;
                switch (i17) {
                    case 0:
                        hVar.x(ItemCategory.MEAL);
                        break;
                    case 1:
                        hVar.x(ItemCategory.BAKED_GOODS);
                        break;
                    case 2:
                        hVar.x(ItemCategory.GROCERIES);
                        break;
                    case 3:
                        hVar.x(ItemCategory.FLOWERS_PLANTS);
                        break;
                    case 4:
                        hVar.x(ItemCategory.PET_FOOD);
                        break;
                    case 5:
                        hVar.x(ItemCategory.PERSONAL_CARE);
                        break;
                    case 6:
                        hVar.x(ItemCategory.OTHER);
                        break;
                    case 7:
                        hVar.v(DietPreferenceModel.VEGETARIAN);
                        break;
                    case 8:
                        hVar.v(DietPreferenceModel.VEGAN);
                        break;
                    case 9:
                        hVar.t(CollectionDayModel.TODAY);
                        break;
                    case 10:
                        hVar.t(CollectionDayModel.TOMORROW);
                        break;
                    case 11:
                        hVar.dismiss();
                        break;
                    case 12:
                        Context contextRequireContext = hVar.requireContext();
                        contextRequireContext.getClass();
                        if (!r0.u(contextRequireContext)) {
                            Toast.makeText(hVar.getActivity(), R.string.generic_error_unable_to_connect_to_internet_please_try_again_later, 0).show();
                        } else {
                            ft.b bVar = hVar.q().f47948a;
                            bVar.b(bVar.f17901a);
                            hVar.q().f47956i.k(new qt.a(Unit.f26487a));
                            j jVarQ2 = hVar.q();
                            String str = hVar.f47947i;
                            if (str == null) {
                                str = "";
                            }
                            cv.b bVar2 = jVarQ2.f47949b;
                            cv.i iVar = cv.i.ACTION_FILTER_ENABLED;
                            dv.a aVar = dv.a.HIDE_SOLD_OUT;
                            jVarQ2.f47948a.getClass();
                            bVar2.c(iVar, h0.g.E(new Pair(aVar, new dv.c(Boolean.valueOf(ft.b.a().getShowOnlyAvailable()))), new Pair(dv.a.DAY, new dv.c(ft.b.a().getCollectionDaysStringList())), new Pair(dv.a.HAS_TIME_FILTER, new dv.c(Boolean.valueOf(ft.b.a().isPickupTimeSet()))), new Pair(dv.a.SELECTED_CATEGORY, new dv.c(ft.b.a().getFoodTypesStringList())), new Pair(dv.a.SELECTED_DIET_TYPE, new dv.c(ft.b.a().getDietPrefsStringList())), new Pair(dv.a.SCREEN, new dv.c(str))));
                            hVar.dismiss();
                        }
                        break;
                    default:
                        if (hVar.q().f47948a.f17901a.isFilterOn()) {
                            hVar.q().a();
                        }
                        break;
                }
            }
        });
        Button button = z0Var.f35317r;
        button.setText(getString(R.string.Filters_show_results_button));
        final int i17 = 12;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: zj.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f47932b;

            {
                this.f47932b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i172 = i17;
                h hVar = this.f47932b;
                switch (i172) {
                    case 0:
                        hVar.x(ItemCategory.MEAL);
                        break;
                    case 1:
                        hVar.x(ItemCategory.BAKED_GOODS);
                        break;
                    case 2:
                        hVar.x(ItemCategory.GROCERIES);
                        break;
                    case 3:
                        hVar.x(ItemCategory.FLOWERS_PLANTS);
                        break;
                    case 4:
                        hVar.x(ItemCategory.PET_FOOD);
                        break;
                    case 5:
                        hVar.x(ItemCategory.PERSONAL_CARE);
                        break;
                    case 6:
                        hVar.x(ItemCategory.OTHER);
                        break;
                    case 7:
                        hVar.v(DietPreferenceModel.VEGETARIAN);
                        break;
                    case 8:
                        hVar.v(DietPreferenceModel.VEGAN);
                        break;
                    case 9:
                        hVar.t(CollectionDayModel.TODAY);
                        break;
                    case 10:
                        hVar.t(CollectionDayModel.TOMORROW);
                        break;
                    case 11:
                        hVar.dismiss();
                        break;
                    case 12:
                        Context contextRequireContext = hVar.requireContext();
                        contextRequireContext.getClass();
                        if (!r0.u(contextRequireContext)) {
                            Toast.makeText(hVar.getActivity(), R.string.generic_error_unable_to_connect_to_internet_please_try_again_later, 0).show();
                        } else {
                            ft.b bVar = hVar.q().f47948a;
                            bVar.b(bVar.f17901a);
                            hVar.q().f47956i.k(new qt.a(Unit.f26487a));
                            j jVarQ2 = hVar.q();
                            String str = hVar.f47947i;
                            if (str == null) {
                                str = "";
                            }
                            cv.b bVar2 = jVarQ2.f47949b;
                            cv.i iVar = cv.i.ACTION_FILTER_ENABLED;
                            dv.a aVar = dv.a.HIDE_SOLD_OUT;
                            jVarQ2.f47948a.getClass();
                            bVar2.c(iVar, h0.g.E(new Pair(aVar, new dv.c(Boolean.valueOf(ft.b.a().getShowOnlyAvailable()))), new Pair(dv.a.DAY, new dv.c(ft.b.a().getCollectionDaysStringList())), new Pair(dv.a.HAS_TIME_FILTER, new dv.c(Boolean.valueOf(ft.b.a().isPickupTimeSet()))), new Pair(dv.a.SELECTED_CATEGORY, new dv.c(ft.b.a().getFoodTypesStringList())), new Pair(dv.a.SELECTED_DIET_TYPE, new dv.c(ft.b.a().getDietPrefsStringList())), new Pair(dv.a.SCREEN, new dv.c(str))));
                            hVar.dismiss();
                        }
                        break;
                    default:
                        if (hVar.q().f47948a.f17901a.isFilterOn()) {
                            hVar.q().a();
                        }
                        break;
                }
            }
        });
        final int i18 = 13;
        z0Var.f35302b.setOnClickListener(new View.OnClickListener(this) { // from class: zj.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f47932b;

            {
                this.f47932b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i172 = i18;
                h hVar = this.f47932b;
                switch (i172) {
                    case 0:
                        hVar.x(ItemCategory.MEAL);
                        break;
                    case 1:
                        hVar.x(ItemCategory.BAKED_GOODS);
                        break;
                    case 2:
                        hVar.x(ItemCategory.GROCERIES);
                        break;
                    case 3:
                        hVar.x(ItemCategory.FLOWERS_PLANTS);
                        break;
                    case 4:
                        hVar.x(ItemCategory.PET_FOOD);
                        break;
                    case 5:
                        hVar.x(ItemCategory.PERSONAL_CARE);
                        break;
                    case 6:
                        hVar.x(ItemCategory.OTHER);
                        break;
                    case 7:
                        hVar.v(DietPreferenceModel.VEGETARIAN);
                        break;
                    case 8:
                        hVar.v(DietPreferenceModel.VEGAN);
                        break;
                    case 9:
                        hVar.t(CollectionDayModel.TODAY);
                        break;
                    case 10:
                        hVar.t(CollectionDayModel.TOMORROW);
                        break;
                    case 11:
                        hVar.dismiss();
                        break;
                    case 12:
                        Context contextRequireContext = hVar.requireContext();
                        contextRequireContext.getClass();
                        if (!r0.u(contextRequireContext)) {
                            Toast.makeText(hVar.getActivity(), R.string.generic_error_unable_to_connect_to_internet_please_try_again_later, 0).show();
                        } else {
                            ft.b bVar = hVar.q().f47948a;
                            bVar.b(bVar.f17901a);
                            hVar.q().f47956i.k(new qt.a(Unit.f26487a));
                            j jVarQ2 = hVar.q();
                            String str = hVar.f47947i;
                            if (str == null) {
                                str = "";
                            }
                            cv.b bVar2 = jVarQ2.f47949b;
                            cv.i iVar = cv.i.ACTION_FILTER_ENABLED;
                            dv.a aVar = dv.a.HIDE_SOLD_OUT;
                            jVarQ2.f47948a.getClass();
                            bVar2.c(iVar, h0.g.E(new Pair(aVar, new dv.c(Boolean.valueOf(ft.b.a().getShowOnlyAvailable()))), new Pair(dv.a.DAY, new dv.c(ft.b.a().getCollectionDaysStringList())), new Pair(dv.a.HAS_TIME_FILTER, new dv.c(Boolean.valueOf(ft.b.a().isPickupTimeSet()))), new Pair(dv.a.SELECTED_CATEGORY, new dv.c(ft.b.a().getFoodTypesStringList())), new Pair(dv.a.SELECTED_DIET_TYPE, new dv.c(ft.b.a().getDietPrefsStringList())), new Pair(dv.a.SCREEN, new dv.c(str))));
                            hVar.dismiss();
                        }
                        break;
                    default:
                        if (hVar.q().f47948a.f17901a.isFilterOn()) {
                            hVar.q().a();
                        }
                        break;
                }
            }
        });
        z0 z0Var2 = this.f47944f;
        z0Var2.getClass();
        SwitchCompat switchCompat = z0Var2.f35318s;
        q().f47948a.getClass();
        switchCompat.setChecked(!ft.b.a().getShowOnlyAvailable());
        z0 z0Var3 = this.f47944f;
        z0Var3.getClass();
        final int i19 = 5;
        z0Var3.f35318s.setOnCheckedChangeListener(new com.adyen.checkout.card.internal.ui.view.c(this, i19));
        u(q().f47948a.f17901a);
        z0 z0Var4 = this.f47944f;
        z0Var4.getClass();
        final int i21 = 9;
        z0Var4.f35303c.setOnClickListener(new View.OnClickListener(this) { // from class: zj.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f47932b;

            {
                this.f47932b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i172 = i21;
                h hVar = this.f47932b;
                switch (i172) {
                    case 0:
                        hVar.x(ItemCategory.MEAL);
                        break;
                    case 1:
                        hVar.x(ItemCategory.BAKED_GOODS);
                        break;
                    case 2:
                        hVar.x(ItemCategory.GROCERIES);
                        break;
                    case 3:
                        hVar.x(ItemCategory.FLOWERS_PLANTS);
                        break;
                    case 4:
                        hVar.x(ItemCategory.PET_FOOD);
                        break;
                    case 5:
                        hVar.x(ItemCategory.PERSONAL_CARE);
                        break;
                    case 6:
                        hVar.x(ItemCategory.OTHER);
                        break;
                    case 7:
                        hVar.v(DietPreferenceModel.VEGETARIAN);
                        break;
                    case 8:
                        hVar.v(DietPreferenceModel.VEGAN);
                        break;
                    case 9:
                        hVar.t(CollectionDayModel.TODAY);
                        break;
                    case 10:
                        hVar.t(CollectionDayModel.TOMORROW);
                        break;
                    case 11:
                        hVar.dismiss();
                        break;
                    case 12:
                        Context contextRequireContext = hVar.requireContext();
                        contextRequireContext.getClass();
                        if (!r0.u(contextRequireContext)) {
                            Toast.makeText(hVar.getActivity(), R.string.generic_error_unable_to_connect_to_internet_please_try_again_later, 0).show();
                        } else {
                            ft.b bVar = hVar.q().f47948a;
                            bVar.b(bVar.f17901a);
                            hVar.q().f47956i.k(new qt.a(Unit.f26487a));
                            j jVarQ2 = hVar.q();
                            String str = hVar.f47947i;
                            if (str == null) {
                                str = "";
                            }
                            cv.b bVar2 = jVarQ2.f47949b;
                            cv.i iVar = cv.i.ACTION_FILTER_ENABLED;
                            dv.a aVar = dv.a.HIDE_SOLD_OUT;
                            jVarQ2.f47948a.getClass();
                            bVar2.c(iVar, h0.g.E(new Pair(aVar, new dv.c(Boolean.valueOf(ft.b.a().getShowOnlyAvailable()))), new Pair(dv.a.DAY, new dv.c(ft.b.a().getCollectionDaysStringList())), new Pair(dv.a.HAS_TIME_FILTER, new dv.c(Boolean.valueOf(ft.b.a().isPickupTimeSet()))), new Pair(dv.a.SELECTED_CATEGORY, new dv.c(ft.b.a().getFoodTypesStringList())), new Pair(dv.a.SELECTED_DIET_TYPE, new dv.c(ft.b.a().getDietPrefsStringList())), new Pair(dv.a.SCREEN, new dv.c(str))));
                            hVar.dismiss();
                        }
                        break;
                    default:
                        if (hVar.q().f47948a.f17901a.isFilterOn()) {
                            hVar.q().a();
                        }
                        break;
                }
            }
        });
        final int i22 = 10;
        z0Var4.f35304d.setOnClickListener(new View.OnClickListener(this) { // from class: zj.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f47932b;

            {
                this.f47932b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i172 = i22;
                h hVar = this.f47932b;
                switch (i172) {
                    case 0:
                        hVar.x(ItemCategory.MEAL);
                        break;
                    case 1:
                        hVar.x(ItemCategory.BAKED_GOODS);
                        break;
                    case 2:
                        hVar.x(ItemCategory.GROCERIES);
                        break;
                    case 3:
                        hVar.x(ItemCategory.FLOWERS_PLANTS);
                        break;
                    case 4:
                        hVar.x(ItemCategory.PET_FOOD);
                        break;
                    case 5:
                        hVar.x(ItemCategory.PERSONAL_CARE);
                        break;
                    case 6:
                        hVar.x(ItemCategory.OTHER);
                        break;
                    case 7:
                        hVar.v(DietPreferenceModel.VEGETARIAN);
                        break;
                    case 8:
                        hVar.v(DietPreferenceModel.VEGAN);
                        break;
                    case 9:
                        hVar.t(CollectionDayModel.TODAY);
                        break;
                    case 10:
                        hVar.t(CollectionDayModel.TOMORROW);
                        break;
                    case 11:
                        hVar.dismiss();
                        break;
                    case 12:
                        Context contextRequireContext = hVar.requireContext();
                        contextRequireContext.getClass();
                        if (!r0.u(contextRequireContext)) {
                            Toast.makeText(hVar.getActivity(), R.string.generic_error_unable_to_connect_to_internet_please_try_again_later, 0).show();
                        } else {
                            ft.b bVar = hVar.q().f47948a;
                            bVar.b(bVar.f17901a);
                            hVar.q().f47956i.k(new qt.a(Unit.f26487a));
                            j jVarQ2 = hVar.q();
                            String str = hVar.f47947i;
                            if (str == null) {
                                str = "";
                            }
                            cv.b bVar2 = jVarQ2.f47949b;
                            cv.i iVar = cv.i.ACTION_FILTER_ENABLED;
                            dv.a aVar = dv.a.HIDE_SOLD_OUT;
                            jVarQ2.f47948a.getClass();
                            bVar2.c(iVar, h0.g.E(new Pair(aVar, new dv.c(Boolean.valueOf(ft.b.a().getShowOnlyAvailable()))), new Pair(dv.a.DAY, new dv.c(ft.b.a().getCollectionDaysStringList())), new Pair(dv.a.HAS_TIME_FILTER, new dv.c(Boolean.valueOf(ft.b.a().isPickupTimeSet()))), new Pair(dv.a.SELECTED_CATEGORY, new dv.c(ft.b.a().getFoodTypesStringList())), new Pair(dv.a.SELECTED_DIET_TYPE, new dv.c(ft.b.a().getDietPrefsStringList())), new Pair(dv.a.SCREEN, new dv.c(str))));
                            hVar.dismiss();
                        }
                        break;
                    default:
                        if (hVar.q().f47948a.f17901a.isFilterOn()) {
                            hVar.q().a();
                        }
                        break;
                }
            }
        });
        SearchFilter searchFilter = q().f47948a.f17901a;
        z0 z0Var5 = this.f47944f;
        z0Var5.getClass();
        List<Float> rawTimes = searchFilter.getCollectionTimes().getRawTimes();
        z0Var5.f35305e.setText(s(searchFilter.getCollectionTimes()));
        z0Var5.f35306f.setValues(rawTimes);
        final z0 z0Var6 = this.f47944f;
        z0Var6.getClass();
        RangeSlider rangeSlider = z0Var6.f35306f;
        rangeSlider.f34171n.add(new p(this, 1));
        rangeSlider.f34169m.add(new p20.a() { // from class: zj.e
            @Override // p20.a
            public final void a(p20.e eVar, float f11) {
                TextView textView = z0Var6.f35305e;
                List<Float> values = ((RangeSlider) eVar).getValues();
                values.getClass();
                h hVar = this;
                textView.setText(hVar.s(new CollectionTimeModel(values, DateFormat.is24HourFormat(hVar.getContext()))));
            }
        });
        y(q().f47948a.f17901a);
        z0 z0Var7 = this.f47944f;
        z0Var7.getClass();
        FilterSelectorButtonView filterSelectorButtonView = z0Var7.f35313n;
        u uVar = q().f47950c;
        uVar.getClass();
        if (uVar.a(mv.k.APPTRK_CC_PERSONAL_CARE) == null) {
            z0Var7.f35315p.removeView(filterSelectorButtonView);
        }
        z0Var7.l.setOnClickListener(new View.OnClickListener(this) { // from class: zj.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f47932b;

            {
                this.f47932b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i172 = i11;
                h hVar = this.f47932b;
                switch (i172) {
                    case 0:
                        hVar.x(ItemCategory.MEAL);
                        break;
                    case 1:
                        hVar.x(ItemCategory.BAKED_GOODS);
                        break;
                    case 2:
                        hVar.x(ItemCategory.GROCERIES);
                        break;
                    case 3:
                        hVar.x(ItemCategory.FLOWERS_PLANTS);
                        break;
                    case 4:
                        hVar.x(ItemCategory.PET_FOOD);
                        break;
                    case 5:
                        hVar.x(ItemCategory.PERSONAL_CARE);
                        break;
                    case 6:
                        hVar.x(ItemCategory.OTHER);
                        break;
                    case 7:
                        hVar.v(DietPreferenceModel.VEGETARIAN);
                        break;
                    case 8:
                        hVar.v(DietPreferenceModel.VEGAN);
                        break;
                    case 9:
                        hVar.t(CollectionDayModel.TODAY);
                        break;
                    case 10:
                        hVar.t(CollectionDayModel.TOMORROW);
                        break;
                    case 11:
                        hVar.dismiss();
                        break;
                    case 12:
                        Context contextRequireContext = hVar.requireContext();
                        contextRequireContext.getClass();
                        if (!r0.u(contextRequireContext)) {
                            Toast.makeText(hVar.getActivity(), R.string.generic_error_unable_to_connect_to_internet_please_try_again_later, 0).show();
                        } else {
                            ft.b bVar = hVar.q().f47948a;
                            bVar.b(bVar.f17901a);
                            hVar.q().f47956i.k(new qt.a(Unit.f26487a));
                            j jVarQ2 = hVar.q();
                            String str = hVar.f47947i;
                            if (str == null) {
                                str = "";
                            }
                            cv.b bVar2 = jVarQ2.f47949b;
                            cv.i iVar = cv.i.ACTION_FILTER_ENABLED;
                            dv.a aVar = dv.a.HIDE_SOLD_OUT;
                            jVarQ2.f47948a.getClass();
                            bVar2.c(iVar, h0.g.E(new Pair(aVar, new dv.c(Boolean.valueOf(ft.b.a().getShowOnlyAvailable()))), new Pair(dv.a.DAY, new dv.c(ft.b.a().getCollectionDaysStringList())), new Pair(dv.a.HAS_TIME_FILTER, new dv.c(Boolean.valueOf(ft.b.a().isPickupTimeSet()))), new Pair(dv.a.SELECTED_CATEGORY, new dv.c(ft.b.a().getFoodTypesStringList())), new Pair(dv.a.SELECTED_DIET_TYPE, new dv.c(ft.b.a().getDietPrefsStringList())), new Pair(dv.a.SCREEN, new dv.c(str))));
                            hVar.dismiss();
                        }
                        break;
                    default:
                        if (hVar.q().f47948a.f17901a.isFilterOn()) {
                            hVar.q().a();
                        }
                        break;
                }
            }
        });
        z0Var7.f35309i.setOnClickListener(new View.OnClickListener(this) { // from class: zj.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f47932b;

            {
                this.f47932b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i172 = i13;
                h hVar = this.f47932b;
                switch (i172) {
                    case 0:
                        hVar.x(ItemCategory.MEAL);
                        break;
                    case 1:
                        hVar.x(ItemCategory.BAKED_GOODS);
                        break;
                    case 2:
                        hVar.x(ItemCategory.GROCERIES);
                        break;
                    case 3:
                        hVar.x(ItemCategory.FLOWERS_PLANTS);
                        break;
                    case 4:
                        hVar.x(ItemCategory.PET_FOOD);
                        break;
                    case 5:
                        hVar.x(ItemCategory.PERSONAL_CARE);
                        break;
                    case 6:
                        hVar.x(ItemCategory.OTHER);
                        break;
                    case 7:
                        hVar.v(DietPreferenceModel.VEGETARIAN);
                        break;
                    case 8:
                        hVar.v(DietPreferenceModel.VEGAN);
                        break;
                    case 9:
                        hVar.t(CollectionDayModel.TODAY);
                        break;
                    case 10:
                        hVar.t(CollectionDayModel.TOMORROW);
                        break;
                    case 11:
                        hVar.dismiss();
                        break;
                    case 12:
                        Context contextRequireContext = hVar.requireContext();
                        contextRequireContext.getClass();
                        if (!r0.u(contextRequireContext)) {
                            Toast.makeText(hVar.getActivity(), R.string.generic_error_unable_to_connect_to_internet_please_try_again_later, 0).show();
                        } else {
                            ft.b bVar = hVar.q().f47948a;
                            bVar.b(bVar.f17901a);
                            hVar.q().f47956i.k(new qt.a(Unit.f26487a));
                            j jVarQ2 = hVar.q();
                            String str = hVar.f47947i;
                            if (str == null) {
                                str = "";
                            }
                            cv.b bVar2 = jVarQ2.f47949b;
                            cv.i iVar = cv.i.ACTION_FILTER_ENABLED;
                            dv.a aVar = dv.a.HIDE_SOLD_OUT;
                            jVarQ2.f47948a.getClass();
                            bVar2.c(iVar, h0.g.E(new Pair(aVar, new dv.c(Boolean.valueOf(ft.b.a().getShowOnlyAvailable()))), new Pair(dv.a.DAY, new dv.c(ft.b.a().getCollectionDaysStringList())), new Pair(dv.a.HAS_TIME_FILTER, new dv.c(Boolean.valueOf(ft.b.a().isPickupTimeSet()))), new Pair(dv.a.SELECTED_CATEGORY, new dv.c(ft.b.a().getFoodTypesStringList())), new Pair(dv.a.SELECTED_DIET_TYPE, new dv.c(ft.b.a().getDietPrefsStringList())), new Pair(dv.a.SCREEN, new dv.c(str))));
                            hVar.dismiss();
                        }
                        break;
                    default:
                        if (hVar.q().f47948a.f17901a.isFilterOn()) {
                            hVar.q().a();
                        }
                        break;
                }
            }
        });
        z0Var7.f35311k.setOnClickListener(new View.OnClickListener(this) { // from class: zj.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f47932b;

            {
                this.f47932b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i172 = i14;
                h hVar = this.f47932b;
                switch (i172) {
                    case 0:
                        hVar.x(ItemCategory.MEAL);
                        break;
                    case 1:
                        hVar.x(ItemCategory.BAKED_GOODS);
                        break;
                    case 2:
                        hVar.x(ItemCategory.GROCERIES);
                        break;
                    case 3:
                        hVar.x(ItemCategory.FLOWERS_PLANTS);
                        break;
                    case 4:
                        hVar.x(ItemCategory.PET_FOOD);
                        break;
                    case 5:
                        hVar.x(ItemCategory.PERSONAL_CARE);
                        break;
                    case 6:
                        hVar.x(ItemCategory.OTHER);
                        break;
                    case 7:
                        hVar.v(DietPreferenceModel.VEGETARIAN);
                        break;
                    case 8:
                        hVar.v(DietPreferenceModel.VEGAN);
                        break;
                    case 9:
                        hVar.t(CollectionDayModel.TODAY);
                        break;
                    case 10:
                        hVar.t(CollectionDayModel.TOMORROW);
                        break;
                    case 11:
                        hVar.dismiss();
                        break;
                    case 12:
                        Context contextRequireContext = hVar.requireContext();
                        contextRequireContext.getClass();
                        if (!r0.u(contextRequireContext)) {
                            Toast.makeText(hVar.getActivity(), R.string.generic_error_unable_to_connect_to_internet_please_try_again_later, 0).show();
                        } else {
                            ft.b bVar = hVar.q().f47948a;
                            bVar.b(bVar.f17901a);
                            hVar.q().f47956i.k(new qt.a(Unit.f26487a));
                            j jVarQ2 = hVar.q();
                            String str = hVar.f47947i;
                            if (str == null) {
                                str = "";
                            }
                            cv.b bVar2 = jVarQ2.f47949b;
                            cv.i iVar = cv.i.ACTION_FILTER_ENABLED;
                            dv.a aVar = dv.a.HIDE_SOLD_OUT;
                            jVarQ2.f47948a.getClass();
                            bVar2.c(iVar, h0.g.E(new Pair(aVar, new dv.c(Boolean.valueOf(ft.b.a().getShowOnlyAvailable()))), new Pair(dv.a.DAY, new dv.c(ft.b.a().getCollectionDaysStringList())), new Pair(dv.a.HAS_TIME_FILTER, new dv.c(Boolean.valueOf(ft.b.a().isPickupTimeSet()))), new Pair(dv.a.SELECTED_CATEGORY, new dv.c(ft.b.a().getFoodTypesStringList())), new Pair(dv.a.SELECTED_DIET_TYPE, new dv.c(ft.b.a().getDietPrefsStringList())), new Pair(dv.a.SCREEN, new dv.c(str))));
                            hVar.dismiss();
                        }
                        break;
                    default:
                        if (hVar.q().f47948a.f17901a.isFilterOn()) {
                            hVar.q().a();
                        }
                        break;
                }
            }
        });
        z0Var7.f35310j.setOnClickListener(new View.OnClickListener(this) { // from class: zj.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f47932b;

            {
                this.f47932b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i172 = i15;
                h hVar = this.f47932b;
                switch (i172) {
                    case 0:
                        hVar.x(ItemCategory.MEAL);
                        break;
                    case 1:
                        hVar.x(ItemCategory.BAKED_GOODS);
                        break;
                    case 2:
                        hVar.x(ItemCategory.GROCERIES);
                        break;
                    case 3:
                        hVar.x(ItemCategory.FLOWERS_PLANTS);
                        break;
                    case 4:
                        hVar.x(ItemCategory.PET_FOOD);
                        break;
                    case 5:
                        hVar.x(ItemCategory.PERSONAL_CARE);
                        break;
                    case 6:
                        hVar.x(ItemCategory.OTHER);
                        break;
                    case 7:
                        hVar.v(DietPreferenceModel.VEGETARIAN);
                        break;
                    case 8:
                        hVar.v(DietPreferenceModel.VEGAN);
                        break;
                    case 9:
                        hVar.t(CollectionDayModel.TODAY);
                        break;
                    case 10:
                        hVar.t(CollectionDayModel.TOMORROW);
                        break;
                    case 11:
                        hVar.dismiss();
                        break;
                    case 12:
                        Context contextRequireContext = hVar.requireContext();
                        contextRequireContext.getClass();
                        if (!r0.u(contextRequireContext)) {
                            Toast.makeText(hVar.getActivity(), R.string.generic_error_unable_to_connect_to_internet_please_try_again_later, 0).show();
                        } else {
                            ft.b bVar = hVar.q().f47948a;
                            bVar.b(bVar.f17901a);
                            hVar.q().f47956i.k(new qt.a(Unit.f26487a));
                            j jVarQ2 = hVar.q();
                            String str = hVar.f47947i;
                            if (str == null) {
                                str = "";
                            }
                            cv.b bVar2 = jVarQ2.f47949b;
                            cv.i iVar = cv.i.ACTION_FILTER_ENABLED;
                            dv.a aVar = dv.a.HIDE_SOLD_OUT;
                            jVarQ2.f47948a.getClass();
                            bVar2.c(iVar, h0.g.E(new Pair(aVar, new dv.c(Boolean.valueOf(ft.b.a().getShowOnlyAvailable()))), new Pair(dv.a.DAY, new dv.c(ft.b.a().getCollectionDaysStringList())), new Pair(dv.a.HAS_TIME_FILTER, new dv.c(Boolean.valueOf(ft.b.a().isPickupTimeSet()))), new Pair(dv.a.SELECTED_CATEGORY, new dv.c(ft.b.a().getFoodTypesStringList())), new Pair(dv.a.SELECTED_DIET_TYPE, new dv.c(ft.b.a().getDietPrefsStringList())), new Pair(dv.a.SCREEN, new dv.c(str))));
                            hVar.dismiss();
                        }
                        break;
                    default:
                        if (hVar.q().f47948a.f17901a.isFilterOn()) {
                            hVar.q().a();
                        }
                        break;
                }
            }
        });
        z0Var7.f35314o.setOnClickListener(new View.OnClickListener(this) { // from class: zj.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f47932b;

            {
                this.f47932b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i172 = i16;
                h hVar = this.f47932b;
                switch (i172) {
                    case 0:
                        hVar.x(ItemCategory.MEAL);
                        break;
                    case 1:
                        hVar.x(ItemCategory.BAKED_GOODS);
                        break;
                    case 2:
                        hVar.x(ItemCategory.GROCERIES);
                        break;
                    case 3:
                        hVar.x(ItemCategory.FLOWERS_PLANTS);
                        break;
                    case 4:
                        hVar.x(ItemCategory.PET_FOOD);
                        break;
                    case 5:
                        hVar.x(ItemCategory.PERSONAL_CARE);
                        break;
                    case 6:
                        hVar.x(ItemCategory.OTHER);
                        break;
                    case 7:
                        hVar.v(DietPreferenceModel.VEGETARIAN);
                        break;
                    case 8:
                        hVar.v(DietPreferenceModel.VEGAN);
                        break;
                    case 9:
                        hVar.t(CollectionDayModel.TODAY);
                        break;
                    case 10:
                        hVar.t(CollectionDayModel.TOMORROW);
                        break;
                    case 11:
                        hVar.dismiss();
                        break;
                    case 12:
                        Context contextRequireContext = hVar.requireContext();
                        contextRequireContext.getClass();
                        if (!r0.u(contextRequireContext)) {
                            Toast.makeText(hVar.getActivity(), R.string.generic_error_unable_to_connect_to_internet_please_try_again_later, 0).show();
                        } else {
                            ft.b bVar = hVar.q().f47948a;
                            bVar.b(bVar.f17901a);
                            hVar.q().f47956i.k(new qt.a(Unit.f26487a));
                            j jVarQ2 = hVar.q();
                            String str = hVar.f47947i;
                            if (str == null) {
                                str = "";
                            }
                            cv.b bVar2 = jVarQ2.f47949b;
                            cv.i iVar = cv.i.ACTION_FILTER_ENABLED;
                            dv.a aVar = dv.a.HIDE_SOLD_OUT;
                            jVarQ2.f47948a.getClass();
                            bVar2.c(iVar, h0.g.E(new Pair(aVar, new dv.c(Boolean.valueOf(ft.b.a().getShowOnlyAvailable()))), new Pair(dv.a.DAY, new dv.c(ft.b.a().getCollectionDaysStringList())), new Pair(dv.a.HAS_TIME_FILTER, new dv.c(Boolean.valueOf(ft.b.a().isPickupTimeSet()))), new Pair(dv.a.SELECTED_CATEGORY, new dv.c(ft.b.a().getFoodTypesStringList())), new Pair(dv.a.SELECTED_DIET_TYPE, new dv.c(ft.b.a().getDietPrefsStringList())), new Pair(dv.a.SCREEN, new dv.c(str))));
                            hVar.dismiss();
                        }
                        break;
                    default:
                        if (hVar.q().f47948a.f17901a.isFilterOn()) {
                            hVar.q().a();
                        }
                        break;
                }
            }
        });
        filterSelectorButtonView.setOnClickListener(new View.OnClickListener(this) { // from class: zj.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f47932b;

            {
                this.f47932b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i172 = i19;
                h hVar = this.f47932b;
                switch (i172) {
                    case 0:
                        hVar.x(ItemCategory.MEAL);
                        break;
                    case 1:
                        hVar.x(ItemCategory.BAKED_GOODS);
                        break;
                    case 2:
                        hVar.x(ItemCategory.GROCERIES);
                        break;
                    case 3:
                        hVar.x(ItemCategory.FLOWERS_PLANTS);
                        break;
                    case 4:
                        hVar.x(ItemCategory.PET_FOOD);
                        break;
                    case 5:
                        hVar.x(ItemCategory.PERSONAL_CARE);
                        break;
                    case 6:
                        hVar.x(ItemCategory.OTHER);
                        break;
                    case 7:
                        hVar.v(DietPreferenceModel.VEGETARIAN);
                        break;
                    case 8:
                        hVar.v(DietPreferenceModel.VEGAN);
                        break;
                    case 9:
                        hVar.t(CollectionDayModel.TODAY);
                        break;
                    case 10:
                        hVar.t(CollectionDayModel.TOMORROW);
                        break;
                    case 11:
                        hVar.dismiss();
                        break;
                    case 12:
                        Context contextRequireContext = hVar.requireContext();
                        contextRequireContext.getClass();
                        if (!r0.u(contextRequireContext)) {
                            Toast.makeText(hVar.getActivity(), R.string.generic_error_unable_to_connect_to_internet_please_try_again_later, 0).show();
                        } else {
                            ft.b bVar = hVar.q().f47948a;
                            bVar.b(bVar.f17901a);
                            hVar.q().f47956i.k(new qt.a(Unit.f26487a));
                            j jVarQ2 = hVar.q();
                            String str = hVar.f47947i;
                            if (str == null) {
                                str = "";
                            }
                            cv.b bVar2 = jVarQ2.f47949b;
                            cv.i iVar = cv.i.ACTION_FILTER_ENABLED;
                            dv.a aVar = dv.a.HIDE_SOLD_OUT;
                            jVarQ2.f47948a.getClass();
                            bVar2.c(iVar, h0.g.E(new Pair(aVar, new dv.c(Boolean.valueOf(ft.b.a().getShowOnlyAvailable()))), new Pair(dv.a.DAY, new dv.c(ft.b.a().getCollectionDaysStringList())), new Pair(dv.a.HAS_TIME_FILTER, new dv.c(Boolean.valueOf(ft.b.a().isPickupTimeSet()))), new Pair(dv.a.SELECTED_CATEGORY, new dv.c(ft.b.a().getFoodTypesStringList())), new Pair(dv.a.SELECTED_DIET_TYPE, new dv.c(ft.b.a().getDietPrefsStringList())), new Pair(dv.a.SCREEN, new dv.c(str))));
                            hVar.dismiss();
                        }
                        break;
                    default:
                        if (hVar.q().f47948a.f17901a.isFilterOn()) {
                            hVar.q().a();
                        }
                        break;
                }
            }
        });
        final int i23 = 6;
        z0Var7.f35312m.setOnClickListener(new View.OnClickListener(this) { // from class: zj.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f47932b;

            {
                this.f47932b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i172 = i23;
                h hVar = this.f47932b;
                switch (i172) {
                    case 0:
                        hVar.x(ItemCategory.MEAL);
                        break;
                    case 1:
                        hVar.x(ItemCategory.BAKED_GOODS);
                        break;
                    case 2:
                        hVar.x(ItemCategory.GROCERIES);
                        break;
                    case 3:
                        hVar.x(ItemCategory.FLOWERS_PLANTS);
                        break;
                    case 4:
                        hVar.x(ItemCategory.PET_FOOD);
                        break;
                    case 5:
                        hVar.x(ItemCategory.PERSONAL_CARE);
                        break;
                    case 6:
                        hVar.x(ItemCategory.OTHER);
                        break;
                    case 7:
                        hVar.v(DietPreferenceModel.VEGETARIAN);
                        break;
                    case 8:
                        hVar.v(DietPreferenceModel.VEGAN);
                        break;
                    case 9:
                        hVar.t(CollectionDayModel.TODAY);
                        break;
                    case 10:
                        hVar.t(CollectionDayModel.TOMORROW);
                        break;
                    case 11:
                        hVar.dismiss();
                        break;
                    case 12:
                        Context contextRequireContext = hVar.requireContext();
                        contextRequireContext.getClass();
                        if (!r0.u(contextRequireContext)) {
                            Toast.makeText(hVar.getActivity(), R.string.generic_error_unable_to_connect_to_internet_please_try_again_later, 0).show();
                        } else {
                            ft.b bVar = hVar.q().f47948a;
                            bVar.b(bVar.f17901a);
                            hVar.q().f47956i.k(new qt.a(Unit.f26487a));
                            j jVarQ2 = hVar.q();
                            String str = hVar.f47947i;
                            if (str == null) {
                                str = "";
                            }
                            cv.b bVar2 = jVarQ2.f47949b;
                            cv.i iVar = cv.i.ACTION_FILTER_ENABLED;
                            dv.a aVar = dv.a.HIDE_SOLD_OUT;
                            jVarQ2.f47948a.getClass();
                            bVar2.c(iVar, h0.g.E(new Pair(aVar, new dv.c(Boolean.valueOf(ft.b.a().getShowOnlyAvailable()))), new Pair(dv.a.DAY, new dv.c(ft.b.a().getCollectionDaysStringList())), new Pair(dv.a.HAS_TIME_FILTER, new dv.c(Boolean.valueOf(ft.b.a().isPickupTimeSet()))), new Pair(dv.a.SELECTED_CATEGORY, new dv.c(ft.b.a().getFoodTypesStringList())), new Pair(dv.a.SELECTED_DIET_TYPE, new dv.c(ft.b.a().getDietPrefsStringList())), new Pair(dv.a.SCREEN, new dv.c(str))));
                            hVar.dismiss();
                        }
                        break;
                    default:
                        if (hVar.q().f47948a.f17901a.isFilterOn()) {
                            hVar.q().a();
                        }
                        break;
                }
            }
        });
        w(q().f47948a.f17901a);
        z0 z0Var8 = this.f47944f;
        z0Var8.getClass();
        final int i24 = 7;
        z0Var8.f35308h.setOnClickListener(new View.OnClickListener(this) { // from class: zj.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f47932b;

            {
                this.f47932b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i172 = i24;
                h hVar = this.f47932b;
                switch (i172) {
                    case 0:
                        hVar.x(ItemCategory.MEAL);
                        break;
                    case 1:
                        hVar.x(ItemCategory.BAKED_GOODS);
                        break;
                    case 2:
                        hVar.x(ItemCategory.GROCERIES);
                        break;
                    case 3:
                        hVar.x(ItemCategory.FLOWERS_PLANTS);
                        break;
                    case 4:
                        hVar.x(ItemCategory.PET_FOOD);
                        break;
                    case 5:
                        hVar.x(ItemCategory.PERSONAL_CARE);
                        break;
                    case 6:
                        hVar.x(ItemCategory.OTHER);
                        break;
                    case 7:
                        hVar.v(DietPreferenceModel.VEGETARIAN);
                        break;
                    case 8:
                        hVar.v(DietPreferenceModel.VEGAN);
                        break;
                    case 9:
                        hVar.t(CollectionDayModel.TODAY);
                        break;
                    case 10:
                        hVar.t(CollectionDayModel.TOMORROW);
                        break;
                    case 11:
                        hVar.dismiss();
                        break;
                    case 12:
                        Context contextRequireContext = hVar.requireContext();
                        contextRequireContext.getClass();
                        if (!r0.u(contextRequireContext)) {
                            Toast.makeText(hVar.getActivity(), R.string.generic_error_unable_to_connect_to_internet_please_try_again_later, 0).show();
                        } else {
                            ft.b bVar = hVar.q().f47948a;
                            bVar.b(bVar.f17901a);
                            hVar.q().f47956i.k(new qt.a(Unit.f26487a));
                            j jVarQ2 = hVar.q();
                            String str = hVar.f47947i;
                            if (str == null) {
                                str = "";
                            }
                            cv.b bVar2 = jVarQ2.f47949b;
                            cv.i iVar = cv.i.ACTION_FILTER_ENABLED;
                            dv.a aVar = dv.a.HIDE_SOLD_OUT;
                            jVarQ2.f47948a.getClass();
                            bVar2.c(iVar, h0.g.E(new Pair(aVar, new dv.c(Boolean.valueOf(ft.b.a().getShowOnlyAvailable()))), new Pair(dv.a.DAY, new dv.c(ft.b.a().getCollectionDaysStringList())), new Pair(dv.a.HAS_TIME_FILTER, new dv.c(Boolean.valueOf(ft.b.a().isPickupTimeSet()))), new Pair(dv.a.SELECTED_CATEGORY, new dv.c(ft.b.a().getFoodTypesStringList())), new Pair(dv.a.SELECTED_DIET_TYPE, new dv.c(ft.b.a().getDietPrefsStringList())), new Pair(dv.a.SCREEN, new dv.c(str))));
                            hVar.dismiss();
                        }
                        break;
                    default:
                        if (hVar.q().f47948a.f17901a.isFilterOn()) {
                            hVar.q().a();
                        }
                        break;
                }
            }
        });
        final int i25 = 8;
        z0Var8.f35307g.setOnClickListener(new View.OnClickListener(this) { // from class: zj.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f47932b;

            {
                this.f47932b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i172 = i25;
                h hVar = this.f47932b;
                switch (i172) {
                    case 0:
                        hVar.x(ItemCategory.MEAL);
                        break;
                    case 1:
                        hVar.x(ItemCategory.BAKED_GOODS);
                        break;
                    case 2:
                        hVar.x(ItemCategory.GROCERIES);
                        break;
                    case 3:
                        hVar.x(ItemCategory.FLOWERS_PLANTS);
                        break;
                    case 4:
                        hVar.x(ItemCategory.PET_FOOD);
                        break;
                    case 5:
                        hVar.x(ItemCategory.PERSONAL_CARE);
                        break;
                    case 6:
                        hVar.x(ItemCategory.OTHER);
                        break;
                    case 7:
                        hVar.v(DietPreferenceModel.VEGETARIAN);
                        break;
                    case 8:
                        hVar.v(DietPreferenceModel.VEGAN);
                        break;
                    case 9:
                        hVar.t(CollectionDayModel.TODAY);
                        break;
                    case 10:
                        hVar.t(CollectionDayModel.TOMORROW);
                        break;
                    case 11:
                        hVar.dismiss();
                        break;
                    case 12:
                        Context contextRequireContext = hVar.requireContext();
                        contextRequireContext.getClass();
                        if (!r0.u(contextRequireContext)) {
                            Toast.makeText(hVar.getActivity(), R.string.generic_error_unable_to_connect_to_internet_please_try_again_later, 0).show();
                        } else {
                            ft.b bVar = hVar.q().f47948a;
                            bVar.b(bVar.f17901a);
                            hVar.q().f47956i.k(new qt.a(Unit.f26487a));
                            j jVarQ2 = hVar.q();
                            String str = hVar.f47947i;
                            if (str == null) {
                                str = "";
                            }
                            cv.b bVar2 = jVarQ2.f47949b;
                            cv.i iVar = cv.i.ACTION_FILTER_ENABLED;
                            dv.a aVar = dv.a.HIDE_SOLD_OUT;
                            jVarQ2.f47948a.getClass();
                            bVar2.c(iVar, h0.g.E(new Pair(aVar, new dv.c(Boolean.valueOf(ft.b.a().getShowOnlyAvailable()))), new Pair(dv.a.DAY, new dv.c(ft.b.a().getCollectionDaysStringList())), new Pair(dv.a.HAS_TIME_FILTER, new dv.c(Boolean.valueOf(ft.b.a().isPickupTimeSet()))), new Pair(dv.a.SELECTED_CATEGORY, new dv.c(ft.b.a().getFoodTypesStringList())), new Pair(dv.a.SELECTED_DIET_TYPE, new dv.c(ft.b.a().getDietPrefsStringList())), new Pair(dv.a.SCREEN, new dv.c(str))));
                            hVar.dismiss();
                        }
                        break;
                    default:
                        if (hVar.q().f47948a.f17901a.isFilterOn()) {
                            hVar.q().a();
                        }
                        break;
                }
            }
        });
        q().f47948a.f17901a.setSearchText(ft.b.a().getSearchText());
        q().f47948a.f17901a.setSortOption(ft.b.a().getSortOption());
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f47947i = arguments.getString("source");
        }
    }

    public final j q() {
        return (j) this.f47945g.getValue();
    }

    public final void r() {
        if (this.f47939a == null) {
            this.f47939a = new k(super.getContext(), this);
            this.f47940b = z.v(super.getContext());
        }
    }

    public final String s(CollectionTimeModel collectionTimeModel) {
        String string;
        if (collectionTimeModel.isActive()) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String string2 = getString(R.string.filters_collection_time_between_option);
            string2.getClass();
            string = String.format(string2, Arrays.copyOf(new Object[]{collectionTimeModel.toString()}, 1));
        } else {
            string = getString(R.string.filters_collection_time_all_day_option);
        }
        string.getClass();
        return string;
    }

    public final void t(CollectionDayModel collectionDayModel) {
        j jVarQ = q();
        collectionDayModel.getClass();
        SearchFilter searchFilter = jVarQ.f47948a.f17901a;
        if (searchFilter.getCollectionDays().contains(collectionDayModel)) {
            searchFilter.getCollectionDays().remove(collectionDayModel);
        } else {
            searchFilter.getCollectionDays().add(collectionDayModel);
        }
        ((o0) jVarQ.f47952e.getValue()).k(searchFilter);
    }

    public final void u(SearchFilter searchFilter) {
        z0 z0Var = this.f47944f;
        z0Var.getClass();
        z0Var.f35303c.a(searchFilter.getCollectionDays().contains(CollectionDayModel.TODAY));
        z0Var.f35304d.a(searchFilter.getCollectionDays().contains(CollectionDayModel.TOMORROW));
    }

    public final void v(DietPreferenceModel dietPreferenceModel) {
        j jVarQ = q();
        dietPreferenceModel.getClass();
        SearchFilter searchFilter = jVarQ.f47948a.f17901a;
        if (searchFilter.getDietPrefs().contains(dietPreferenceModel)) {
            searchFilter.getDietPrefs().remove(dietPreferenceModel);
        } else {
            searchFilter.getDietPrefs().add(dietPreferenceModel);
        }
        ((o0) jVarQ.f47955h.getValue()).k(searchFilter);
    }

    public final void w(SearchFilter searchFilter) {
        z0 z0Var = this.f47944f;
        z0Var.getClass();
        z0Var.f35308h.a(searchFilter.getDietPrefs().contains(DietPreferenceModel.VEGETARIAN));
        z0Var.f35307g.a(searchFilter.getDietPrefs().contains(DietPreferenceModel.VEGAN));
    }

    public final void x(ItemCategory itemCategory) {
        j jVarQ = q();
        itemCategory.getClass();
        SearchFilter searchFilter = jVarQ.f47948a.f17901a;
        if (searchFilter.getFoodTypes().contains(itemCategory)) {
            searchFilter.getFoodTypes().remove(itemCategory);
        } else {
            searchFilter.getFoodTypes().add(itemCategory);
        }
        ((o0) jVarQ.f47954g.getValue()).k(searchFilter);
    }

    public final void y(SearchFilter searchFilter) {
        z0 z0Var = this.f47944f;
        z0Var.getClass();
        z0Var.l.a(searchFilter.getFoodTypes().contains(ItemCategory.MEAL));
        z0Var.f35309i.a(searchFilter.getFoodTypes().contains(ItemCategory.BAKED_GOODS));
        z0Var.f35311k.a(searchFilter.getFoodTypes().contains(ItemCategory.GROCERIES));
        z0Var.f35310j.a(searchFilter.getFoodTypes().contains(ItemCategory.FLOWERS_PLANTS));
        z0Var.f35314o.a(searchFilter.getFoodTypes().contains(ItemCategory.PET_FOOD));
        z0Var.f35313n.a(searchFilter.getFoodTypes().contains(ItemCategory.PERSONAL_CARE));
        z0Var.f35312m.a(searchFilter.getFoodTypes().contains(ItemCategory.OTHER));
    }

    @Override // androidx.fragment.app.y, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        r();
        if (this.f47943e) {
            return;
        }
        this.f47943e = true;
        ((i) a()).getClass();
    }
}
