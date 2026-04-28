package com.app.tgtg.feature.postpurchase.email;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.n1;
import b0.z;
import b5.r1;
import com.adyen.checkout.components.core.internal.util.StatusResponseUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import ky.i;
import p70.g;
import p70.k;
import qo.h;
import r70.c;
import to.d;
import to.e;
import to.f;
import u70.j;
import u70.l;
import u70.m;
import v0.n;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\b²\u0006\u000e\u0010\u0005\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0007\u001a\u00020\u00068\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/app/tgtg/feature/postpurchase/email/AddEmailFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "", "email", "", StatusResponseUtils.RESULT_ERROR, "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAddEmailFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddEmailFragment.kt\ncom/app/tgtg/feature/postpurchase/email/AddEmailFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 6 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 9 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 10 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n*L\n1#1,186:1\n172#2,9:187\n106#2,15:196\n122#3:211\n122#3:218\n122#3:219\n122#3:276\n122#3:309\n122#3:310\n122#3:311\n122#3:312\n1128#4,6:212\n1128#4,6:220\n1128#4,6:232\n1128#4,6:238\n1128#4,6:313\n85#5:226\n117#5,2:227\n78#6:229\n111#6,2:230\n70#7:244\n67#7,9:245\n77#7:326\n81#8,6:254\n88#8,6:269\n81#8,6:287\n88#8,6:302\n96#8:321\n96#8:325\n391#9,9:260\n400#9:275\n391#9,9:293\n400#9:308\n401#9,2:319\n401#9,2:323\n87#10:277\n84#10,9:278\n94#10:322\n*S KotlinDebug\n*F\n+ 1 AddEmailFragment.kt\ncom/app/tgtg/feature/postpurchase/email/AddEmailFragment\n*L\n51#1:187,9\n52#1:196,15\n141#1:211\n157#1:218\n160#1:219\n76#1:276\n85#1:309\n91#1:310\n99#1:311\n113#1:312\n143#1:212,6\n162#1:220,6\n62#1:232,6\n65#1:238,6\n101#1:313,6\n62#1:226\n62#1:227,2\n65#1:229\n65#1:230,2\n68#1:244\n68#1:245,9\n68#1:326\n68#1:254,6\n68#1:269,6\n74#1:287,6\n74#1:302,6\n74#1:321\n68#1:325\n68#1:260,9\n68#1:275\n74#1:293,9\n74#1:308\n74#1:319,2\n68#1:323,2\n74#1:277\n74#1:278,9\n74#1:322\n*E\n"})
public final class AddEmailFragment extends Fragment implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public k f9197a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile g f9199c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n1 f9203g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f9198b = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f9200d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f9201e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n1 f9202f = new n1(Reflection.getOrCreateKotlinClass(h.class), new d(this, 0), new d(this, 2), new d(this, 1));

    public AddEmailFragment() {
        j jVarA = l.a(m.NONE, new i(new d(this, 3), 14));
        this.f9203g = new n1(Reflection.getOrCreateKotlinClass(f.class), new bl.c(jVarA, 20), new r1(13, this, jVarA), new bl.c(jVarA, 21));
    }

    @Override // r70.b
    public final Object a() {
        if (this.f9199c == null) {
            synchronized (this.f9200d) {
                try {
                    if (this.f9199c == null) {
                        this.f9199c = new g(this);
                    }
                } finally {
                }
            }
        }
        return this.f9199c.a();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f9198b) {
            return null;
        }
        o();
        return this.f9197a;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.p
    public final ViewModelProvider$Factory getDefaultViewModelProviderFactory() {
        return zz.f.s(this, super.getDefaultViewModelProviderFactory());
    }

    public final void o() {
        if (this.f9197a == null) {
            this.f9197a = new k(super.getContext(), this);
            this.f9198b = z.v(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        k kVar = this.f9197a;
        ox.h.q(kVar == null || g.d(kVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        o();
        if (this.f9201e) {
            return;
        }
        this.f9201e = true;
        ((e) a()).getClass();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        n.G(requireActivity().getWindow(), false);
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6, null);
        composeView.setContent(new u3.d(new pm.m(this, 12), true, 752173289));
        return composeView;
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(new k(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        o();
        if (this.f9201e) {
            return;
        }
        this.f9201e = true;
        ((e) a()).getClass();
    }
}
