package com.app.tgtg.feature.postpurchase.specialrewards;

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
import kotlin.Metadata;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import ky.i;
import p70.g;
import p70.k;
import qo.h;
import r70.c;
import u3.d;
import u70.j;
import u70.l;
import u70.m;
import wo.a;
import zz.f;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\f²\u0006\u000e\u0010\u0005\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0007\u001a\u0004\u0018\u00010\u00068\nX\u008a\u0084\u0002²\u0006\u000e\u0010\b\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\n\u001a\u00020\t8\nX\u008a\u0084\u0002²\u0006\f\u0010\u000b\u001a\u00020\t8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/app/tgtg/feature/postpurchase/specialrewards/SpecialRewardCelebrationFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "", "boxUnwrapped", "Lhe/k;", "composition", "isRotated", "", "animatedAngle", "animatedAlpha", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSpecialRewardCelebrationFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpecialRewardCelebrationFragment.kt\ncom/app/tgtg/feature/postpurchase/specialrewards/SpecialRewardCelebrationFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 8 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,184:1\n106#2,15:185\n85#3:200\n117#3,2:201\n85#3:203\n85#3:204\n85#3:205\n117#3,2:206\n85#3:208\n70#4:209\n67#4,9:210\n77#4:304\n81#5,6:219\n88#5,6:234\n81#5,6:251\n88#5,6:266\n96#5:299\n96#5:303\n391#6,9:225\n400#6:240\n391#6,9:257\n400#6:272\n401#6,2:297\n401#6,2:301\n87#7:241\n84#7,9:242\n94#7:300\n1128#8,6:273\n1128#8,6:279\n1128#8,6:285\n1128#8,6:291\n1128#8,6:305\n*S KotlinDebug\n*F\n+ 1 SpecialRewardCelebrationFragment.kt\ncom/app/tgtg/feature/postpurchase/specialrewards/SpecialRewardCelebrationFragment\n*L\n53#1:185,15\n105#1:200\n105#1:201,2\n106#1:203\n114#1:204\n62#1:205\n62#1:206,2\n63#1:208\n71#1:209\n71#1:210,9\n71#1:304\n71#1:219,6\n71#1:234,6\n77#1:251,6\n77#1:266,6\n77#1:299\n71#1:303\n71#1:225,9\n71#1:240\n77#1:257,9\n77#1:272\n77#1:297,2\n71#1:301,2\n77#1:241\n77#1:242,9\n77#1:300\n105#1:273,6\n122#1:279,6\n140#1:285,6\n166#1:291,6\n62#1:305,6\n*E\n"})
public final class SpecialRewardCelebrationFragment extends Fragment implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public k f9220a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile g f9222c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n1 f9225f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f9221b = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f9223d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f9224e = false;

    public SpecialRewardCelebrationFragment() {
        j jVarA = l.a(m.NONE, new i(new i(this, 21), 22));
        this.f9225f = new n1(Reflection.getOrCreateKotlinClass(h.class), new bl.c(jVarA, 28), new r1(18, this, jVarA), new bl.c(jVarA, 29));
    }

    @Override // r70.b
    public final Object a() {
        if (this.f9222c == null) {
            synchronized (this.f9223d) {
                try {
                    if (this.f9222c == null) {
                        this.f9222c = new g(this);
                    }
                } finally {
                }
            }
        }
        return this.f9222c.a();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f9221b) {
            return null;
        }
        o();
        return this.f9220a;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.p
    public final ViewModelProvider$Factory getDefaultViewModelProviderFactory() {
        return f.s(this, super.getDefaultViewModelProviderFactory());
    }

    public final void o() {
        if (this.f9220a == null) {
            this.f9220a = new k(super.getContext(), this);
            this.f9221b = z.v(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        k kVar = this.f9220a;
        ox.h.q(kVar == null || g.d(kVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        o();
        if (this.f9224e) {
            return;
        }
        this.f9224e = true;
        ((a) a()).getClass();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6, null);
        composeView.setContent(new d(new pm.m(this, 26), true, 1361937124));
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
        if (this.f9224e) {
            return;
        }
        this.f9224e = true;
        ((a) a()).getClass();
    }
}
