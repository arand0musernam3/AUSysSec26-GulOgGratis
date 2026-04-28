package bg;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.n1;
import com.app.tgtg.R;
import com.app.tgtg.model.local.SortingPreference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbg/s0;", "Lcom/google/android/material/bottomsheet/m;", "<init>", "()V", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSortedByBottomSheetFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SortedByBottomSheetFragment.kt\ncom/app/tgtg/customview/SortedByBottomSheetFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,117:1\n172#2,9:118\n*S KotlinDebug\n*F\n+ 1 SortedByBottomSheetFragment.kt\ncom/app/tgtg/customview/SortedByBottomSheetFragment\n*L\n23#1:118,9\n*E\n"})
public final class s0 extends com.google.android.material.bottomsheet.m implements r70.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p70.k f6220a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile p70.g f6222c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public pg.v f6225f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public zj.a f6227h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public zj.a f6228i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public zj.a f6229j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public zj.a f6230k;
    public lm.c l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f6221b = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f6223d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f6224e = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n1 f6226g = new n1(Reflection.getOrCreateKotlinClass(zj.j.class), new r0(this, 0), new r0(this, 2), new r0(this, 1));

    @Override // r70.b
    public final Object a() {
        if (this.f6222c == null) {
            synchronized (this.f6223d) {
                try {
                    if (this.f6222c == null) {
                        this.f6222c = new p70.g(this);
                    }
                } finally {
                }
            }
        }
        return this.f6222c.a();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f6221b) {
            return null;
        }
        q();
        return this.f6220a;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.p
    public final ViewModelProvider$Factory getDefaultViewModelProviderFactory() {
        return zz.f.s(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        p70.k kVar = this.f6220a;
        ox.h.q(kVar == null || p70.g.d(kVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        q();
        if (this.f6224e) {
            return;
        }
        this.f6224e = true;
        ((t0) a()).getClass();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.sorted_by_bottom_sheet_fragment, viewGroup, false);
        int i11 = R.id.dividerLine;
        if (pd.g.t(R.id.dividerLine, viewInflate) != null) {
            i11 = R.id.optionsContainer;
            LinearLayout linearLayout = (LinearLayout) pd.g.t(R.id.optionsContainer, viewInflate);
            if (linearLayout != null) {
                i11 = R.id.tvTitle;
                if (((TextView) pd.g.t(R.id.tvTitle, viewInflate)) != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                    this.f6225f = new pg.v(constraintLayout, linearLayout, 7);
                    constraintLayout.getClass();
                    return constraintLayout;
                }
            }
        }
        c50.w.l("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
        return null;
    }

    @Override // androidx.fragment.app.y, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(new p70.k(layoutInflaterOnGetLayoutInflater, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        Context context = getContext();
        if (context != null) {
            n1 n1Var = this.f6226g;
            ((zj.j) n1Var.getValue()).f47948a.getClass();
            Object[] objArr = 0;
            final int i11 = 1;
            p70.k kVar = (p70.k) context;
            zj.a aVar = new zj.a(kVar, R.string.discover_search_sorting_by_relevance, ft.b.a().getSortOption() == SortingPreference.RELEVANCE);
            this.f6227h = aVar;
            final Object[] objArr2 = objArr == true ? 1 : 0;
            mv.d.x(aVar, new Function1(this) { // from class: bg.q0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ s0 f6215b;

                {
                    this.f6215b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    View view2 = (View) obj;
                    switch (objArr2) {
                        case 0:
                            view2.getClass();
                            this.f6215b.r(SortingPreference.RELEVANCE);
                            break;
                        case 1:
                            view2.getClass();
                            this.f6215b.r(SortingPreference.DISTANCE);
                            break;
                        case 2:
                            view2.getClass();
                            this.f6215b.r(SortingPreference.PRICE);
                            break;
                        default:
                            view2.getClass();
                            this.f6215b.r(SortingPreference.RATING);
                            break;
                    }
                    return Unit.f26487a;
                }
            });
            ((zj.j) n1Var.getValue()).f47948a.getClass();
            zj.a aVar2 = new zj.a(kVar, R.string.discover_search_sorting_by_distance, ft.b.a().getSortOption() == SortingPreference.DISTANCE);
            this.f6228i = aVar2;
            mv.d.x(aVar2, new Function1(this) { // from class: bg.q0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ s0 f6215b;

                {
                    this.f6215b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    View view2 = (View) obj;
                    switch (i11) {
                        case 0:
                            view2.getClass();
                            this.f6215b.r(SortingPreference.RELEVANCE);
                            break;
                        case 1:
                            view2.getClass();
                            this.f6215b.r(SortingPreference.DISTANCE);
                            break;
                        case 2:
                            view2.getClass();
                            this.f6215b.r(SortingPreference.PRICE);
                            break;
                        default:
                            view2.getClass();
                            this.f6215b.r(SortingPreference.RATING);
                            break;
                    }
                    return Unit.f26487a;
                }
            });
            ((zj.j) n1Var.getValue()).f47948a.getClass();
            zj.a aVar3 = new zj.a(kVar, R.string.discover_search_sorting_by_price, ft.b.a().getSortOption() == SortingPreference.PRICE);
            this.f6229j = aVar3;
            final int i12 = 2;
            mv.d.x(aVar3, new Function1(this) { // from class: bg.q0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ s0 f6215b;

                {
                    this.f6215b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    View view2 = (View) obj;
                    switch (i12) {
                        case 0:
                            view2.getClass();
                            this.f6215b.r(SortingPreference.RELEVANCE);
                            break;
                        case 1:
                            view2.getClass();
                            this.f6215b.r(SortingPreference.DISTANCE);
                            break;
                        case 2:
                            view2.getClass();
                            this.f6215b.r(SortingPreference.PRICE);
                            break;
                        default:
                            view2.getClass();
                            this.f6215b.r(SortingPreference.RATING);
                            break;
                    }
                    return Unit.f26487a;
                }
            });
            ((zj.j) n1Var.getValue()).f47948a.getClass();
            zj.a aVar4 = new zj.a(kVar, R.string.discover_search_sorting_by_rating, ft.b.a().getSortOption() == SortingPreference.RATING);
            this.f6230k = aVar4;
            final int i13 = 3;
            mv.d.x(aVar4, new Function1(this) { // from class: bg.q0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ s0 f6215b;

                {
                    this.f6215b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    View view2 = (View) obj;
                    switch (i13) {
                        case 0:
                            view2.getClass();
                            this.f6215b.r(SortingPreference.RELEVANCE);
                            break;
                        case 1:
                            view2.getClass();
                            this.f6215b.r(SortingPreference.DISTANCE);
                            break;
                        case 2:
                            view2.getClass();
                            this.f6215b.r(SortingPreference.PRICE);
                            break;
                        default:
                            view2.getClass();
                            this.f6215b.r(SortingPreference.RATING);
                            break;
                    }
                    return Unit.f26487a;
                }
            });
            pg.v vVar = this.f6225f;
            vVar.getClass();
            LinearLayout linearLayout = (LinearLayout) vVar.f35202c;
            View view2 = this.f6227h;
            View view3 = null;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rbRelevance");
                view2 = null;
            }
            linearLayout.addView(view2);
            View view4 = this.f6228i;
            if (view4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rbDistance");
                view4 = null;
            }
            linearLayout.addView(view4);
            View view5 = this.f6229j;
            if (view5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rbPrice");
                view5 = null;
            }
            linearLayout.addView(view5);
            View view6 = this.f6230k;
            if (view6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rbRating");
            } else {
                view3 = view6;
            }
            linearLayout.addView(view3);
        }
    }

    public final void q() {
        if (this.f6220a == null) {
            this.f6220a = new p70.k(super.getContext(), this);
            this.f6221b = b0.z.v(super.getContext());
        }
    }

    public final void r(SortingPreference sortingPreference) {
        if (sortingPreference != null) {
            ((zj.j) this.f6226g.getValue()).f47948a.getClass();
            ft.b.a().setSortOption(sortingPreference);
            zj.a aVar = this.f6227h;
            zj.a aVar2 = null;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rbRelevance");
                aVar = null;
            }
            aVar.a(sortingPreference == SortingPreference.RELEVANCE);
            zj.a aVar3 = this.f6228i;
            if (aVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rbDistance");
                aVar3 = null;
            }
            aVar3.a(sortingPreference == SortingPreference.DISTANCE);
            zj.a aVar4 = this.f6229j;
            if (aVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rbPrice");
                aVar4 = null;
            }
            aVar4.a(sortingPreference == SortingPreference.PRICE);
            zj.a aVar5 = this.f6230k;
            if (aVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rbRating");
            } else {
                aVar2 = aVar5;
            }
            aVar2.a(sortingPreference == SortingPreference.RATING);
            lm.c cVar = this.l;
            if (cVar != null) {
                cVar.invoke();
            }
            dismiss();
        }
    }

    @Override // androidx.fragment.app.y, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        q();
        if (this.f6224e) {
            return;
        }
        this.f6224e = true;
        ((t0) a()).getClass();
    }
}
