package com.app.tgtg.feature.postpurchase.success.purchase.ui;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.m1;
import androidx.lifecycle.n1;
import b0.z;
import b5.r1;
import com.app.tgtg.model.remote.ItemId;
import com.app.tgtg.model.remote.item.response.ItemType;
import com.app.tgtg.model.remote.user.response.UserImpactResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import ky.i;
import p70.g;
import p70.k;
import qo.h;
import r70.c;
import u70.j;
import u70.l;
import u70.m;
import v80.f0;
import yo.a;
import yo.b;
import yo.d;
import zz.f;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/app/tgtg/feature/postpurchase/success/purchase/ui/PurchaseSuccessFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPurchaseSuccessFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PurchaseSuccessFragment.kt\ncom/app/tgtg/feature/postpurchase/success/purchase/ui/PurchaseSuccessFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,51:1\n172#2,9:52\n106#2,15:61\n*S KotlinDebug\n*F\n+ 1 PurchaseSuccessFragment.kt\ncom/app/tgtg/feature/postpurchase/success/purchase/ui/PurchaseSuccessFragment\n*L\n19#1:52,9\n20#1:61,15\n*E\n"})
public final class PurchaseSuccessFragment extends Fragment implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public k f9226a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile g f9228c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n1 f9232g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f9227b = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f9229d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f9230e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n1 f9231f = new n1(Reflection.getOrCreateKotlinClass(h.class), new a(this, 0), new a(this, 2), new a(this, 1));

    public PurchaseSuccessFragment() {
        j jVarA = l.a(m.NONE, new i(new a(this, 3), 28));
        this.f9232g = new n1(Reflection.getOrCreateKotlinClass(d.class), new xj.c(jVarA, 6), new r1(23, this, jVarA), new xj.c(jVarA, 7));
    }

    @Override // r70.b
    public final Object a() {
        if (this.f9228c == null) {
            synchronized (this.f9229d) {
                try {
                    if (this.f9228c == null) {
                        this.f9228c = new g(this);
                    }
                } finally {
                }
            }
        }
        return this.f9228c.a();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f9227b) {
            return null;
        }
        p();
        return this.f9226a;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.p
    public final ViewModelProvider$Factory getDefaultViewModelProviderFactory() {
        return f.s(this, super.getDefaultViewModelProviderFactory());
    }

    public final h o() {
        return (h) this.f9231f.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        k kVar = this.f9226a;
        ox.h.q(kVar == null || g.d(kVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        p();
        if (this.f9230e) {
            return;
        }
        this.f9230e = true;
        ((b) a()).getClass();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        UserImpactResponse userImpactResponseO = ft.c.o();
        int magicBagCount = userImpactResponseO.getMagicBagCount();
        Integer num = (Integer) o().f37208a.a("QUANTITY");
        userImpactResponseO.setMagicBagCount(magicBagCount + (num != null ? num.intValue() : 0));
        ft.c.T(userImpactResponseO);
        n1 n1Var = this.f9232g;
        if (((d) n1Var.getValue()).f46328a.n().getShowManufacturerItems()) {
            d dVar = (d) n1Var.getValue();
            ItemId itemId = (ItemId) o().f37208a.a("ITEM_ID");
            String strM205unboximpl = itemId != null ? itemId.m205unboximpl() : null;
            ItemType itemTypeA = o().a();
            aj.c cVar = (aj.c) o().f37208a.a("BASKET_CHECKOUT_DATA");
            itemTypeA.getClass();
            f0.B(m1.d(dVar), null, null, new af.b(dVar, strM205unboximpl, cVar, itemTypeA, null, 21), 3);
        } else {
            ((d) n1Var.getValue()).b(o().a(), null);
        }
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6, null);
        composeView.setContent(new u3.d(new pm.m(this, 29), true, -1432456057));
        return composeView;
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(new k(layoutInflaterOnGetLayoutInflater, this));
    }

    public final void p() {
        if (this.f9226a == null) {
            this.f9226a = new k(super.getContext(), this);
            this.f9227b = z.v(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        p();
        if (this.f9230e) {
            return;
        }
        this.f9230e = true;
        ((b) a()).getClass();
    }
}
