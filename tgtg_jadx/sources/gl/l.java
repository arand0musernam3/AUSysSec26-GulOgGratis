package gl;

import a3.x1;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.e0;
import androidx.activity.result.ActivityResultLauncher;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.g1;
import androidx.fragment.app.o0;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.m1;
import androidx.lifecycle.n1;
import androidx.recyclerview.widget.l1;
import androidx.viewpager2.widget.ViewPager2;
import b0.z;
import c50.w;
import com.app.tgtg.R;
import com.google.android.material.tabs.TabLayout;
import i4.g0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.d0;
import kotlin.collections.x0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import lv.s;
import m3.k1;
import mv.m0;
import pg.t2;
import v80.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgl/l;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nOnboardingFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnboardingFragment.kt\ncom/app/tgtg/feature/login/onboarding/OnboardingFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,490:1\n106#2,15:491\n106#2,15:506\n85#3:521\n117#3,2:522\n255#4:524\n1#5:525\n1128#6,6:526\n1128#6,6:532\n*S KotlinDebug\n*F\n+ 1 OnboardingFragment.kt\ncom/app/tgtg/feature/login/onboarding/OnboardingFragment\n*L\n67#1:491,15\n68#1:506,15\n58#1:521\n58#1:522,2\n454#1:524\n186#1:526,6\n182#1:532,6\n*E\n"})
public final class l extends Fragment implements r70.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p70.k f20549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f20550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile p70.g f20551c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f20552d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f20553e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k1 f20554f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public i f20555g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public t2 f20556h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f20557i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final n1 f20558j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final n1 f20559k;
    public vg.e l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ActivityResultLauncher f20560m;

    public l() {
        super(R.layout.onboarding_fragment);
        this.f20550b = false;
        this.f20552d = new Object();
        this.f20553e = false;
        this.f20554f = m3.i.w(Boolean.FALSE);
        this.f20557i = true;
        k kVar = new k(this, 0);
        u70.m mVar = u70.m.NONE;
        u70.j jVarA = u70.l.a(mVar, new defpackage.a(kVar, 19));
        this.f20558j = new n1(Reflection.getOrCreateKotlinClass(q.class), new bl.c(jVarA, 10), new j(this, jVarA, 1), new bl.c(jVarA, 11));
        u70.j jVarA2 = u70.l.a(mVar, new defpackage.a(new k(this, 1), 20));
        this.f20559k = new n1(Reflection.getOrCreateKotlinClass(tg.i.class), new bl.c(jVarA2, 12), new j(this, jVarA2, 0), new bl.c(jVarA2, 13));
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult = registerForActivityResult(new g1(2), new e.b(this, 8));
        activityResultLauncherRegisterForActivityResult.getClass();
        this.f20560m = activityResultLauncherRegisterForActivityResult;
    }

    public static final void o(l lVar) {
        boolean z11;
        if (lVar.q() == 0) {
            z11 = true;
            break;
        }
        q qVarR = lVar.r();
        int iQ = lVar.q();
        List list = (List) x0.c(Integer.valueOf(iQ), ((jl.e) qVarR.f20575i.getValue()).f25314a);
        if (list == null || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((Boolean) it.next()).booleanValue()) {
                    z11 = true;
                    break;
                }
            }
        }
        z11 = false;
        t2 t2Var = lVar.f20556h;
        if (z11) {
            t2Var.getClass();
            Button button = (Button) t2Var.f35170g;
            t2 t2Var2 = lVar.f20556h;
            t2Var2.getClass();
            p(button, (Button) t2Var2.f35169f);
            return;
        }
        t2Var.getClass();
        Button button2 = (Button) t2Var.f35169f;
        t2 t2Var3 = lVar.f20556h;
        t2Var3.getClass();
        p(button2, (Button) t2Var3.f35170g);
    }

    public static void p(View view, View view2) {
        if (view.getVisibility() != 0) {
            view2.setEnabled(true);
            return;
        }
        view.animate().alpha(0.0f).setDuration(300L).withEndAction(new com.braze.ui.inappmessage.views.c(2, view)).start();
        view2.setAlpha(0.0f);
        view2.setVisibility(0);
        view2.animate().alpha(1.0f).setDuration(300L).start();
    }

    public static void u(View view, boolean z11) {
        view.getClass();
        view.setVisibility(z11 ? 0 : 4);
    }

    @Override // r70.b
    public final Object a() {
        if (this.f20551c == null) {
            synchronized (this.f20552d) {
                try {
                    if (this.f20551c == null) {
                        this.f20551c = new p70.g(this);
                    }
                } finally {
                }
            }
        }
        return this.f20551c.a();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f20550b) {
            return null;
        }
        t();
        return this.f20549a;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.p
    public final ViewModelProvider$Factory getDefaultViewModelProviderFactory() {
        return zz.f.s(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        p70.k kVar = this.f20549a;
        ox.h.q(kVar == null || p70.g.d(kVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        t();
        if (this.f20553e) {
            return;
        }
        this.f20553e = true;
        ((m) a()).getClass();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.onboarding_fragment, viewGroup, false);
        int i11 = R.id.barrier2;
        if (((Barrier) pd.g.t(R.id.barrier2, viewInflate)) != null) {
            i11 = R.id.bottomNav;
            if (((ConstraintLayout) pd.g.t(R.id.bottomNav, viewInflate)) != null) {
                i11 = R.id.btnBackNew;
                Button button = (Button) pd.g.t(R.id.btnBackNew, viewInflate);
                if (button != null) {
                    i11 = R.id.btnNextForSurprise;
                    Button button2 = (Button) pd.g.t(R.id.btnNextForSurprise, viewInflate);
                    if (button2 != null) {
                        i11 = R.id.btnNextNew;
                        Button button3 = (Button) pd.g.t(R.id.btnNextNew, viewInflate);
                        if (button3 != null) {
                            i11 = R.id.btnSkipNewWithNextCopy;
                            Button button4 = (Button) pd.g.t(R.id.btnSkipNewWithNextCopy, viewInflate);
                            if (button4 != null) {
                                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                i11 = R.id.guideline3;
                                if (((Guideline) pd.g.t(R.id.guideline3, viewInflate)) != null) {
                                    i11 = R.id.guidelineCenter;
                                    if (((Guideline) pd.g.t(R.id.guidelineCenter, viewInflate)) != null) {
                                        i11 = R.id.ivBackArrow;
                                        AppCompatImageView appCompatImageView = (AppCompatImageView) pd.g.t(R.id.ivBackArrow, viewInflate);
                                        if (appCompatImageView != null) {
                                            i11 = R.id.onboardingTabLayout;
                                            TabLayout tabLayout = (TabLayout) pd.g.t(R.id.onboardingTabLayout, viewInflate);
                                            if (tabLayout != null) {
                                                i11 = R.id.onboardingViewPager;
                                                ViewPager2 viewPager2 = (ViewPager2) pd.g.t(R.id.onboardingViewPager, viewInflate);
                                                if (viewPager2 != null) {
                                                    i11 = R.id.popupDialog;
                                                    ComposeView composeView = (ComposeView) pd.g.t(R.id.popupDialog, viewInflate);
                                                    if (composeView != null) {
                                                        this.f20556h = new t2(constraintLayout, button, button2, button3, button4, constraintLayout, appCompatImageView, tabLayout, viewPager2, composeView);
                                                        constraintLayout.getClass();
                                                        return constraintLayout;
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

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        t2 t2Var = this.f20556h;
        t2Var.getClass();
        ViewPager2 viewPager2 = (ViewPager2) t2Var.f35173j;
        i iVar = this.f20555g;
        if (iVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("onPageChangeCallback");
            iVar = null;
        }
        ((ArrayList) viewPager2.f4116c.f20543b).remove(iVar);
        this.f20556h = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(new p70.k(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        OnBackPressedDispatcher onBackPressedDispatcher;
        view.getClass();
        super.onViewCreated(view, bundle);
        t2 t2Var = this.f20556h;
        t2Var.getClass();
        int i11 = 1;
        ((ViewPager2) t2Var.f35173j).setAdapter(new ak.b(d0.j(new jl.d(getString(R.string.onboarding_ready_title_uppercase), getString(R.string.onboarding_ready_body), null, null, null, null, 121), new jl.d(null, null, getString(R.string.onboarding_what_title_uppercase), getString(R.string.onboarding_what_body), getString(R.string.onboarding_note), d0.h(getString(R.string.onboarding_what_answer1), getString(R.string.onboarding_what_answer2), getString(R.string.onboarding_what_answer3), getString(R.string.onboarding_what_answer4), getString(R.string.onboarding_what_answer5), getString(R.string.onboarding_what_answer6)), 7), new jl.d(null, null, getString(R.string.onboarding_when_title_uppercase), getString(R.string.onboarding_when_body), getString(R.string.onboarding_note), d0.h(getString(R.string.onboarding_when_answer1), getString(R.string.onboarding_when_answer2), getString(R.string.onboarding_when_answer3), getString(R.string.onboarding_when_answer4), getString(R.string.onboarding_when_answer5), getString(R.string.onboarding_when_answer6)), 7)), new d(this, 1), i11));
        t2 t2Var2 = this.f20556h;
        t2Var2.getClass();
        TabLayout tabLayout = (TabLayout) t2Var2.f35172i;
        t2 t2Var3 = this.f20556h;
        t2Var3.getClass();
        new ae.c(tabLayout, (ViewPager2) t2Var3.f35173j, new e40.a(22)).b();
        av.c cVar = r().f20577k;
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        int i12 = 0;
        cVar.e(viewLifecycleOwner, new al.c(new b(this, i12), 5));
        o0 activity = getActivity();
        if (activity != null && (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) != null) {
            LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
            viewLifecycleOwner2.getClass();
            onBackPressedDispatcher.b(new e0(this, 17), viewLifecycleOwner2);
        }
        f0.B(m1.c(this), null, null, new h(this, null), 3);
        t2 t2Var4 = this.f20556h;
        t2Var4.getClass();
        mv.d.x((Button) t2Var4.f35167d, new b(this, i11));
        t2 t2Var5 = this.f20556h;
        t2Var5.getClass();
        mv.d.x((Button) t2Var5.f35169f, new b(this, 2));
        t2 t2Var6 = this.f20556h;
        t2Var6.getClass();
        mv.d.x((Button) t2Var6.f35170g, new b(this, 3));
        t2 t2Var7 = this.f20556h;
        t2Var7.getClass();
        mv.d.x((Button) t2Var7.f35168e, new b(this, 4));
        this.f20555g = new i(this, i12);
        t2 t2Var8 = this.f20556h;
        t2Var8.getClass();
        ViewPager2 viewPager2 = (ViewPager2) t2Var8.f35173j;
        i iVar = this.f20555g;
        if (iVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("onPageChangeCallback");
            iVar = null;
        }
        viewPager2.b(iVar);
        t2 t2Var9 = this.f20556h;
        t2Var9.getClass();
        Button button = (Button) t2Var9.f35170g;
        Button button2 = (Button) t2Var9.f35169f;
        ((AppCompatImageView) t2Var9.f35171h).setVisibility(4);
        u((Button) t2Var9.f35167d, true);
        int iQ = q();
        Button button3 = (Button) t2Var9.f35168e;
        if (iQ == 0) {
            u(button3, true);
            button2.setVisibility(4);
            button.setVisibility(4);
        } else {
            button3.setVisibility(4);
            button2.setVisibility(4);
            u(button, true);
        }
        TabLayout tabLayout2 = (TabLayout) t2Var9.f35172i;
        int tabCount = tabLayout2.getTabCount();
        for (int i13 = 0; i13 < tabCount; i13++) {
            s20.g gVarH = tabLayout2.h(i13);
            s20.j jVar = gVarH != null ? gVarH.f38794g : null;
            Drawable drawable = requireContext().getDrawable(R.drawable.tab_selector_onboarding_new);
            if (jVar != null) {
                jVar.setBackground(drawable);
            }
        }
        t2 t2Var10 = this.f20556h;
        t2Var10.getClass();
        ((ViewPager2) t2Var10.f35173j).setUserInputEnabled(false);
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TL_BR;
        long j9 = s.f28245z;
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, new int[]{g0.C(j9), g0.C(s.J)});
        t2 t2Var11 = this.f20556h;
        t2Var11.getClass();
        ((ConstraintLayout) t2Var11.f35166c).setBackground(gradientDrawable);
        o0 o0VarRequireActivity = requireActivity();
        o0VarRequireActivity.getClass();
        a70.a.t(o0VarRequireActivity, j9);
    }

    public final int q() {
        t2 t2Var = this.f20556h;
        if (t2Var != null) {
            return ((ViewPager2) t2Var.f35173j).getCurrentItem();
        }
        return 0;
    }

    public final q r() {
        return (q) this.f20558j.getValue();
    }

    public final void s() {
        l1 adapter;
        m0 m0Var = sa0.a.f38953a;
        m0Var.h("OnboardingSurvey");
        m0Var.c(j4.s.f(q(), "handleOnboardingSurveyNextButton() - page "), new Object[0]);
        int iQ = q();
        t2 t2Var = this.f20556h;
        boolean z11 = iQ == ((t2Var == null || (adapter = ((ViewPager2) t2Var.f35173j).getAdapter()) == null) ? 0 : adapter.getItemCount() - 1);
        int iQ2 = q();
        if (iQ2 == 2 && z11) {
            r().e(q());
            m0Var.h("OnboardingSurvey");
            m0Var.c(j4.s.f(q(), "completeOnboarding() called from page "), new Object[0]);
            if (q() == 2) {
                r().f(q(), false);
            }
            q qVarR = r();
            f0.B(m1.d(qVarR), null, null, new x1(qVarR, (x70.c) null, 26), 3);
            return;
        }
        if (iQ2 != 1 && iQ2 != 2) {
            t2 t2Var2 = this.f20556h;
            t2Var2.getClass();
            pd.g.E((ViewPager2) t2Var2.f35173j);
        } else {
            r().e(q());
            r().f(q(), false);
            t2 t2Var3 = this.f20556h;
            t2Var3.getClass();
            pd.g.E((ViewPager2) t2Var3.f35173j);
        }
    }

    public final void t() {
        if (this.f20549a == null) {
            this.f20549a = new p70.k(super.getContext(), this);
            this.f20550b = z.v(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        t();
        if (this.f20553e) {
            return;
        }
        this.f20553e = true;
        ((m) a()).getClass();
    }
}
