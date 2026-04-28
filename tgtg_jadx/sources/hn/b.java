package hn;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.o0;
import androidx.lifecycle.n1;
import at.c0;
import b5.r1;
import c50.w;
import com.app.tgtg.R;
import com.app.tgtg.customview.MenuItemView;
import com.app.tgtg.feature.main.MainActivity;
import com.app.tgtg.feature.tabprofile.legal.LegalActivity;
import com.app.tgtg.feature.tabprofile.manageaccount.SettingsActivity;
import cv.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.z;
import pd.g;
import u70.j;
import u70.l;
import u70.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhn/b;", "Lkm/a;", "<init>", "()V", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFragmentMystoreMorePage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentMystoreMorePage.kt\ncom/app/tgtg/feature/main/fragments/mystoremore/FragmentMystoreMorePage\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,125:1\n106#2,15:126\n257#3,2:141\n257#3,2:143\n*S KotlinDebug\n*F\n+ 1 FragmentMystoreMorePage.kt\ncom/app/tgtg/feature/main/fragments/mystoremore/FragmentMystoreMorePage\n*L\n27#1:126,15\n107#1:141,2\n108#1:143,2\n*E\n"})
public final class b extends e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public pg.a f22177g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final n1 f22178h;

    public b() {
        j jVarA = l.a(m.NONE, new defpackage.a(new defpackage.a(this, 22), 23));
        this.f22178h = new n1(Reflection.getOrCreateKotlinClass(c.class), new bl.c(jVarA, 14), new r1(10, this, jVarA), new bl.c(jVarA, 15));
    }

    @Override // km.a
    public final z o() {
        return z.MY_STORE_MORE;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View viewInflate = layoutInflater.inflate(R.layout.fragment_mystore_more_page, viewGroup, false);
        int i11 = R.id.items;
        if (((LinearLayout) g.t(R.id.items, viewInflate)) != null) {
            i11 = R.id.miBlog;
            MenuItemView menuItemView = (MenuItemView) g.t(R.id.miBlog, viewInflate);
            if (menuItemView != null) {
                i11 = R.id.miLegal;
                MenuItemView menuItemView2 = (MenuItemView) g.t(R.id.miLegal, viewInflate);
                if (menuItemView2 != null) {
                    i11 = R.id.miSettings;
                    MenuItemView menuItemView3 = (MenuItemView) g.t(R.id.miSettings, viewInflate);
                    if (menuItemView3 != null) {
                        i11 = R.id.miSwitchMode;
                        MenuItemView menuItemView4 = (MenuItemView) g.t(R.id.miSwitchMode, viewInflate);
                        if (menuItemView4 != null) {
                            i11 = R.id.scrollContent;
                            if (((ScrollView) g.t(R.id.scrollContent, viewInflate)) != null) {
                                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                this.f22177g = new pg.a(constraintLayout, menuItemView, menuItemView2, menuItemView3, menuItemView4, constraintLayout);
                                constraintLayout.getClass();
                                return constraintLayout;
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
    public final void onResume() {
        super.onResume();
        pg.a aVar = this.f22177g;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            aVar = null;
        }
        ((MenuItemView) aVar.f34764f).setExpiredPaymentBreadcrumb(q().f22179a.n().getHasExpiredPaymentMethods());
        c cVarQ = q();
        i iVar = i.SCREEN_MENU;
        iVar.getClass();
        cv.b bVar = cVarQ.f22180b;
        bVar.getClass();
        bVar.c(iVar, null);
    }

    @Override // km.a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        pg.a aVar = null;
        if (getActivity() instanceof MainActivity) {
            o0 activity = getActivity();
            activity.getClass();
            MainActivity mainActivity = (MainActivity) activity;
            pg.a aVar2 = this.f22177g;
            if (aVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                aVar2 = null;
            }
            ViewCompat.k0(aVar2.f34760b, new a50.d(17, mainActivity, this));
        }
        pg.a aVar3 = this.f22177g;
        if (aVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            aVar = aVar3;
        }
        r();
        final int i11 = 0;
        ((MenuItemView) aVar.f34764f).setOnClickListener(new View.OnClickListener(this) { // from class: hn.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f22176b;

            {
                this.f22176b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i12 = i11;
                b bVar = this.f22176b;
                switch (i12) {
                    case 0:
                        bVar.q().f22182d.f25316a.a(new f70.b(SettingsActivity.class, null, false, false, false, null, null, null, null, false, 1022));
                        break;
                    case 1:
                        bVar.q().f22182d.f25316a.a(new f70.b(LegalActivity.class, null, false, false, false, 2, null, null, null, false, 990));
                        break;
                    case 2:
                        c cVarQ = bVar.q();
                        String blogUrl = bVar.q().f22179a.n().getBlogUrl();
                        ct.a aVar4 = ct.a.BLOG;
                        Integer numValueOf = Integer.valueOf(R.string.webview_blog_title);
                        aVar4.getClass();
                        c0.c(cVarQ.f22183e, blogUrl, aVar4, numValueOf, false, 24);
                        break;
                    default:
                        boolean z11 = !ft.c.C();
                        ft.c.J(z11);
                        bVar.r();
                        bVar.q().f22181c.c();
                        o0 activity2 = bVar.getActivity();
                        if (activity2 != null && (activity2 instanceof MainActivity)) {
                            ((MainActivity) activity2).q0(z11, f70.i.MYSTORE_MORE);
                            break;
                        }
                        break;
                }
            }
        });
        final int i12 = 1;
        ((MenuItemView) aVar.f34763e).setOnClickListener(new View.OnClickListener(this) { // from class: hn.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f22176b;

            {
                this.f22176b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i122 = i12;
                b bVar = this.f22176b;
                switch (i122) {
                    case 0:
                        bVar.q().f22182d.f25316a.a(new f70.b(SettingsActivity.class, null, false, false, false, null, null, null, null, false, 1022));
                        break;
                    case 1:
                        bVar.q().f22182d.f25316a.a(new f70.b(LegalActivity.class, null, false, false, false, 2, null, null, null, false, 990));
                        break;
                    case 2:
                        c cVarQ = bVar.q();
                        String blogUrl = bVar.q().f22179a.n().getBlogUrl();
                        ct.a aVar4 = ct.a.BLOG;
                        Integer numValueOf = Integer.valueOf(R.string.webview_blog_title);
                        aVar4.getClass();
                        c0.c(cVarQ.f22183e, blogUrl, aVar4, numValueOf, false, 24);
                        break;
                    default:
                        boolean z11 = !ft.c.C();
                        ft.c.J(z11);
                        bVar.r();
                        bVar.q().f22181c.c();
                        o0 activity2 = bVar.getActivity();
                        if (activity2 != null && (activity2 instanceof MainActivity)) {
                            ((MainActivity) activity2).q0(z11, f70.i.MYSTORE_MORE);
                            break;
                        }
                        break;
                }
            }
        });
        final int i13 = 2;
        ((MenuItemView) aVar.f34762d).setOnClickListener(new View.OnClickListener(this) { // from class: hn.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f22176b;

            {
                this.f22176b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i122 = i13;
                b bVar = this.f22176b;
                switch (i122) {
                    case 0:
                        bVar.q().f22182d.f25316a.a(new f70.b(SettingsActivity.class, null, false, false, false, null, null, null, null, false, 1022));
                        break;
                    case 1:
                        bVar.q().f22182d.f25316a.a(new f70.b(LegalActivity.class, null, false, false, false, 2, null, null, null, false, 990));
                        break;
                    case 2:
                        c cVarQ = bVar.q();
                        String blogUrl = bVar.q().f22179a.n().getBlogUrl();
                        ct.a aVar4 = ct.a.BLOG;
                        Integer numValueOf = Integer.valueOf(R.string.webview_blog_title);
                        aVar4.getClass();
                        c0.c(cVarQ.f22183e, blogUrl, aVar4, numValueOf, false, 24);
                        break;
                    default:
                        boolean z11 = !ft.c.C();
                        ft.c.J(z11);
                        bVar.r();
                        bVar.q().f22181c.c();
                        o0 activity2 = bVar.getActivity();
                        if (activity2 != null && (activity2 instanceof MainActivity)) {
                            ((MainActivity) activity2).q0(z11, f70.i.MYSTORE_MORE);
                            break;
                        }
                        break;
                }
            }
        });
        final int i14 = 3;
        ((MenuItemView) aVar.f34765g).setOnClickListener(new View.OnClickListener(this) { // from class: hn.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f22176b;

            {
                this.f22176b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i122 = i14;
                b bVar = this.f22176b;
                switch (i122) {
                    case 0:
                        bVar.q().f22182d.f25316a.a(new f70.b(SettingsActivity.class, null, false, false, false, null, null, null, null, false, 1022));
                        break;
                    case 1:
                        bVar.q().f22182d.f25316a.a(new f70.b(LegalActivity.class, null, false, false, false, 2, null, null, null, false, 990));
                        break;
                    case 2:
                        c cVarQ = bVar.q();
                        String blogUrl = bVar.q().f22179a.n().getBlogUrl();
                        ct.a aVar4 = ct.a.BLOG;
                        Integer numValueOf = Integer.valueOf(R.string.webview_blog_title);
                        aVar4.getClass();
                        c0.c(cVarQ.f22183e, blogUrl, aVar4, numValueOf, false, 24);
                        break;
                    default:
                        boolean z11 = !ft.c.C();
                        ft.c.J(z11);
                        bVar.r();
                        bVar.q().f22181c.c();
                        o0 activity2 = bVar.getActivity();
                        if (activity2 != null && (activity2 instanceof MainActivity)) {
                            ((MainActivity) activity2).q0(z11, f70.i.MYSTORE_MORE);
                            break;
                        }
                        break;
                }
            }
        });
    }

    public final c q() {
        return (c) this.f22178h.getValue();
    }

    public final void r() {
        pg.a aVar = this.f22177g;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            aVar = null;
        }
        int i11 = 8;
        ((MenuItemView) aVar.f34765g).setVisibility((q().f22179a.n().isBusiness() && ft.c.C()) ? 0 : 8);
        MenuItemView menuItemView = (MenuItemView) aVar.f34762d;
        String blogUrl = q().f22179a.n().getBlogUrl();
        if (blogUrl != null && blogUrl.length() != 0) {
            i11 = 0;
        }
        menuItemView.setVisibility(i11);
    }
}
