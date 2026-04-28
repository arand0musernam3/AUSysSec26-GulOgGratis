package com.app.tgtg.feature.tabprofile.storelogin.ui;

import a70.a;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.o0;
import c50.w;
import com.app.tgtg.R;
import com.app.tgtg.customview.MenuItemView;
import com.app.tgtg.feature.tabprofile.storelogin.ui.StoreLoginIntroFragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import lv.s;
import mv.d;
import pd.g;
import pg.b1;
import zs.j;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/app/tgtg/feature/tabprofile/storelogin/ui/StoreLoginIntroFragment;", "Lzs/j;", "<init>", "()V", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nStoreLoginIntroFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StoreLoginIntroFragment.kt\ncom/app/tgtg/feature/tabprofile/storelogin/ui/StoreLoginIntroFragment\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,48:1\n257#2,2:49\n257#2,2:51\n*S KotlinDebug\n*F\n+ 1 StoreLoginIntroFragment.kt\ncom/app/tgtg/feature/tabprofile/storelogin/ui/StoreLoginIntroFragment\n*L\n27#1:49,2\n32#1:51,2\n*E\n"})
public final class StoreLoginIntroFragment extends j {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public b1 f9456m;

    public StoreLoginIntroFragment() {
        super(R.layout.store_login_intro_view);
    }

    @Override // zs.j, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        int i11 = R.id.goToMyStore;
        MenuItemView menuItemView = (MenuItemView) g.t(R.id.goToMyStore, view);
        if (menuItemView != null) {
            i11 = R.id.signUpButton;
            MenuItemView menuItemView2 = (MenuItemView) g.t(R.id.signUpButton, view);
            if (menuItemView2 != null) {
                i11 = R.id.suggestStoreBtn;
                MenuItemView menuItemView3 = (MenuItemView) g.t(R.id.suggestStoreBtn, view);
                if (menuItemView3 != null) {
                    this.f9456m = new b1((ConstraintLayout) view, menuItemView, menuItemView2, menuItemView3, 5);
                    o0 o0VarRequireActivity = requireActivity();
                    o0VarRequireActivity.getClass();
                    a.t(o0VarRequireActivity, s.J);
                    ((TextView) o().f34795c).setText(getString(R.string.me_menu_tab_title_store_login));
                    b1 b1Var = this.f9456m;
                    b1Var.getClass();
                    MenuItemView menuItemView4 = (MenuItemView) b1Var.f34796d;
                    MenuItemView menuItemView5 = (MenuItemView) b1Var.f34797e;
                    final int i12 = 0;
                    menuItemView5.setVisibility((p().f48100c.n().isBusiness() || p().f48100c.n().getShouldVerifyEmail()) ? 8 : 0);
                    d.x(menuItemView5, new Function1(this) { // from class: zs.l

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ StoreLoginIntroFragment f48093b;

                        {
                            this.f48093b = this;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            int i13 = i12;
                            StoreLoginIntroFragment storeLoginIntroFragment = this.f48093b;
                            View view2 = (View) obj;
                            switch (i13) {
                                case 0:
                                    view2.getClass();
                                    storeLoginIntroFragment.p().f48104g.i(new qt.a(Integer.valueOf(R.id.action_storeLoginIntroFragment_to_storeSignupFragmentWeb)));
                                    break;
                                case 1:
                                    view2.getClass();
                                    ft.c.J(!ft.c.C());
                                    o0 activity = storeLoginIntroFragment.getActivity();
                                    if (activity != null) {
                                        activity.setResult(-1);
                                    }
                                    o0 activity2 = storeLoginIntroFragment.getActivity();
                                    if (activity2 != null) {
                                        activity2.finish();
                                    }
                                    break;
                                default:
                                    view2.getClass();
                                    if (storeLoginIntroFragment.p().f48100c.n().getUserStoreRecommendationUrl() != null) {
                                        storeLoginIntroFragment.p().f48104g.i(new qt.a(Integer.valueOf(R.id.action_storeLoginIntroFragment_to_recommendStoreFragmentWeb)));
                                    } else {
                                        storeLoginIntroFragment.p().f48104g.i(new qt.a(Integer.valueOf(R.id.action_storeLoginIntroFragment_to_recommendStoreFragment)));
                                    }
                                    break;
                            }
                            return Unit.f26487a;
                        }
                    });
                    menuItemView4.setVisibility(p().f48100c.n().isBusiness() ? 0 : 8);
                    final int i13 = 1;
                    d.x(menuItemView4, new Function1(this) { // from class: zs.l

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ StoreLoginIntroFragment f48093b;

                        {
                            this.f48093b = this;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            int i132 = i13;
                            StoreLoginIntroFragment storeLoginIntroFragment = this.f48093b;
                            View view2 = (View) obj;
                            switch (i132) {
                                case 0:
                                    view2.getClass();
                                    storeLoginIntroFragment.p().f48104g.i(new qt.a(Integer.valueOf(R.id.action_storeLoginIntroFragment_to_storeSignupFragmentWeb)));
                                    break;
                                case 1:
                                    view2.getClass();
                                    ft.c.J(!ft.c.C());
                                    o0 activity = storeLoginIntroFragment.getActivity();
                                    if (activity != null) {
                                        activity.setResult(-1);
                                    }
                                    o0 activity2 = storeLoginIntroFragment.getActivity();
                                    if (activity2 != null) {
                                        activity2.finish();
                                    }
                                    break;
                                default:
                                    view2.getClass();
                                    if (storeLoginIntroFragment.p().f48100c.n().getUserStoreRecommendationUrl() != null) {
                                        storeLoginIntroFragment.p().f48104g.i(new qt.a(Integer.valueOf(R.id.action_storeLoginIntroFragment_to_recommendStoreFragmentWeb)));
                                    } else {
                                        storeLoginIntroFragment.p().f48104g.i(new qt.a(Integer.valueOf(R.id.action_storeLoginIntroFragment_to_recommendStoreFragment)));
                                    }
                                    break;
                            }
                            return Unit.f26487a;
                        }
                    });
                    final int i14 = 2;
                    d.x((MenuItemView) b1Var.f34795c, new Function1(this) { // from class: zs.l

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ StoreLoginIntroFragment f48093b;

                        {
                            this.f48093b = this;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            int i132 = i14;
                            StoreLoginIntroFragment storeLoginIntroFragment = this.f48093b;
                            View view2 = (View) obj;
                            switch (i132) {
                                case 0:
                                    view2.getClass();
                                    storeLoginIntroFragment.p().f48104g.i(new qt.a(Integer.valueOf(R.id.action_storeLoginIntroFragment_to_storeSignupFragmentWeb)));
                                    break;
                                case 1:
                                    view2.getClass();
                                    ft.c.J(!ft.c.C());
                                    o0 activity = storeLoginIntroFragment.getActivity();
                                    if (activity != null) {
                                        activity.setResult(-1);
                                    }
                                    o0 activity2 = storeLoginIntroFragment.getActivity();
                                    if (activity2 != null) {
                                        activity2.finish();
                                    }
                                    break;
                                default:
                                    view2.getClass();
                                    if (storeLoginIntroFragment.p().f48100c.n().getUserStoreRecommendationUrl() != null) {
                                        storeLoginIntroFragment.p().f48104g.i(new qt.a(Integer.valueOf(R.id.action_storeLoginIntroFragment_to_recommendStoreFragmentWeb)));
                                    } else {
                                        storeLoginIntroFragment.p().f48104g.i(new qt.a(Integer.valueOf(R.id.action_storeLoginIntroFragment_to_recommendStoreFragment)));
                                    }
                                    break;
                            }
                            return Unit.f26487a;
                        }
                    });
                    return;
                }
            }
        }
        w.l("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }
}
