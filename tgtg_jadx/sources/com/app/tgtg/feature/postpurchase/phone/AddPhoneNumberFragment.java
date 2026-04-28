package com.app.tgtg.feature.postpurchase.phone;

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
import com.adyen.checkout.components.core.internal.util.StatusResponseUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import ky.i;
import mr.e;
import p70.g;
import p70.k;
import qo.h;
import r70.c;
import u70.j;
import u70.l;
import u70.m;
import v0.n;
import v80.f0;
import vo.b;
import vo.d;
import zz.f;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\t²\u0006\u000e\u0010\u0005\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0006\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\b\u001a\u00020\u00078\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/app/tgtg/feature/postpurchase/phone/AddPhoneNumberFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "", "phonePrefix", "phoneNumber", "", StatusResponseUtils.RESULT_ERROR, "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAddPhoneNumberFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddPhoneNumberFragment.kt\ncom/app/tgtg/feature/postpurchase/phone/AddPhoneNumberFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 6 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 9 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 10 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 11 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,260:1\n172#2,9:261\n106#2,15:270\n122#3:285\n122#3:292\n122#3:293\n122#3:359\n122#3:392\n122#3:393\n122#3:394\n122#3:427\n122#3:428\n122#3:435\n122#3:436\n1128#4,6:286\n1128#4,6:294\n1128#4,6:309\n1128#4,6:315\n1128#4,6:321\n1128#4,6:429\n1128#4,6:437\n85#5:300\n117#5,2:301\n85#5:303\n117#5,2:304\n78#6:306\n111#6,2:307\n70#7:327\n67#7,9:328\n77#7:454\n81#8,6:337\n88#8,6:352\n81#8,6:370\n88#8,6:385\n81#8,6:405\n88#8,6:420\n96#8:445\n96#8:449\n96#8:453\n391#9,9:343\n400#9:358\n391#9,9:376\n400#9:391\n391#9,9:411\n400#9:426\n401#9,2:443\n401#9,2:447\n401#9,2:451\n87#10:360\n84#10,9:361\n94#10:450\n99#11:395\n96#11,9:396\n106#11:446\n*S KotlinDebug\n*F\n+ 1 AddPhoneNumberFragment.kt\ncom/app/tgtg/feature/postpurchase/phone/AddPhoneNumberFragment\n*L\n57#1:261,9\n58#1:270,15\n186#1:285\n202#1:292\n205#1:293\n93#1:359\n102#1:392\n108#1:393\n117#1:394\n121#1:427\n128#1:428\n143#1:435\n157#1:436\n188#1:286,6\n207#1:294,6\n76#1:309,6\n79#1:315,6\n82#1:321,6\n123#1:429,6\n145#1:437,6\n76#1:300\n76#1:301,2\n79#1:303\n79#1:304,2\n82#1:306\n82#1:307,2\n85#1:327\n85#1:328,9\n85#1:454\n85#1:337,6\n85#1:352,6\n91#1:370,6\n91#1:385,6\n113#1:405,6\n113#1:420,6\n113#1:445\n91#1:449\n85#1:453\n85#1:343,9\n85#1:358\n91#1:376,9\n91#1:391\n113#1:411,9\n113#1:426\n113#1:443,2\n91#1:447,2\n85#1:451,2\n91#1:360\n91#1:361,9\n91#1:450\n113#1:395\n113#1:396,9\n113#1:446\n*E\n"})
public final class AddPhoneNumberFragment extends Fragment implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public k f9212a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile g f9214c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n1 f9218g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e f9219h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f9213b = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f9215d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f9216e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n1 f9217f = new n1(Reflection.getOrCreateKotlinClass(h.class), new vo.c(this, 0), new vo.c(this, 2), new vo.c(this, 1));

    public AddPhoneNumberFragment() {
        j jVarA = l.a(m.NONE, new i(new vo.c(this, 3), 20));
        this.f9218g = new n1(Reflection.getOrCreateKotlinClass(vo.e.class), new bl.c(jVarA, 26), new r1(16, this, jVarA), new bl.c(jVarA, 27));
        this.f9219h = new e(this, 12);
    }

    @Override // r70.b
    public final Object a() {
        if (this.f9214c == null) {
            synchronized (this.f9215d) {
                try {
                    if (this.f9214c == null) {
                        this.f9214c = new g(this);
                    }
                } finally {
                }
            }
        }
        return this.f9214c.a();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f9213b) {
            return null;
        }
        o();
        return this.f9212a;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.p
    public final ViewModelProvider$Factory getDefaultViewModelProviderFactory() {
        return f.s(this, super.getDefaultViewModelProviderFactory());
    }

    public final void o() {
        if (this.f9212a == null) {
            this.f9212a = new k(super.getContext(), this);
            this.f9213b = z.v(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        k kVar = this.f9212a;
        ox.h.q(kVar == null || g.d(kVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        o();
        if (this.f9216e) {
            return;
        }
        this.f9216e = true;
        ((d) a()).getClass();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        n.G(requireActivity().getWindow(), false);
        x70.c cVar = null;
        f0.B(m1.c(this), null, null, new b(this, cVar, 1), 3);
        f0.B(m1.c(this), null, null, new b(this, cVar, 0), 3);
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6, null);
        composeView.setContent(new u3.d(new pm.m(this, 21), true, -471606751));
        return composeView;
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(new k(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        o();
        if (!this.f9216e) {
            this.f9216e = true;
            ((d) a()).getClass();
        }
        requireActivity().getOnBackPressedDispatcher().b(this.f9219h, this);
    }
}
