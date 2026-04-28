package com.app.tgtg.feature.postpurchase.notification;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResultLauncher;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.g1;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.m1;
import androidx.lifecycle.n1;
import b0.z;
import b5.r1;
import kotlin.Metadata;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import ky.i;
import mp.a;
import p70.g;
import p70.k;
import qo.h;
import r70.c;
import u70.j;
import u70.l;
import u70.m;
import uo.d;
import uo.e;
import v0.n;
import v80.f0;
import zz.f;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002²\u0006\f\u0010\u0006\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lcom/app/tgtg/feature/postpurchase/notification/AddReminderFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "", "notificationAlert", "calendarAlert", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAddReminderFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddReminderFragment.kt\ncom/app/tgtg/feature/postpurchase/notification/AddReminderFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 9 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 10 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,217:1\n172#2,9:218\n106#2,15:227\n122#3:242\n122#3:249\n122#3:250\n122#3:323\n1128#4,6:243\n1128#4,6:251\n1128#4,6:324\n1128#4,6:330\n85#5:257\n85#5:258\n70#6:259\n67#6,9:260\n77#6:343\n81#7,6:269\n88#7,6:284\n81#7,6:301\n88#7,6:316\n96#7:338\n96#7:342\n391#8,9:275\n400#8:290\n391#8,9:307\n400#8:322\n401#8,2:336\n401#8,2:340\n87#9:291\n84#9,9:292\n94#9:339\n1915#10,2:344\n*S KotlinDebug\n*F\n+ 1 AddReminderFragment.kt\ncom/app/tgtg/feature/postpurchase/notification/AddReminderFragment\n*L\n54#1:218,9\n55#1:227,15\n106#1:242\n124#1:249\n127#1:250\n82#1:323\n108#1:243,6\n129#1:251,6\n90#1:324,6\n93#1:330,6\n67#1:257\n68#1:258\n70#1:259\n70#1:260,9\n70#1:343\n70#1:269,6\n70#1:284,6\n76#1:301,6\n76#1:316,6\n76#1:338\n70#1:342\n70#1:275,9\n70#1:290\n76#1:307,9\n76#1:322\n76#1:336,2\n70#1:340,2\n76#1:291\n76#1:292,9\n76#1:339\n151#1:344,2\n*E\n"})
public final class AddReminderFragment extends Fragment implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public k f9204a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile g f9206c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ActivityResultLauncher f9209f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final n1 f9211h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f9205b = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f9207d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f9208e = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n1 f9210g = new n1(Reflection.getOrCreateKotlinClass(h.class), new d(this, 0), new d(this, 2), new d(this, 1));

    public AddReminderFragment() {
        j jVarA = l.a(m.NONE, new i(new d(this, 3), 17));
        this.f9211h = new n1(Reflection.getOrCreateKotlinClass(uo.h.class), new bl.c(jVarA, 24), new r1(15, this, jVarA), new bl.c(jVarA, 25));
    }

    @Override // r70.b
    public final Object a() {
        if (this.f9206c == null) {
            synchronized (this.f9207d) {
                try {
                    if (this.f9206c == null) {
                        this.f9206c = new g(this);
                    }
                } finally {
                }
            }
        }
        return this.f9206c.a();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f9205b) {
            return null;
        }
        p();
        return this.f9204a;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.p
    public final ViewModelProvider$Factory getDefaultViewModelProviderFactory() {
        return f.s(this, super.getDefaultViewModelProviderFactory());
    }

    public final uo.h o() {
        return (uo.h) this.f9211h.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        k kVar = this.f9204a;
        ox.h.q(kVar == null || g.d(kVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        p();
        if (this.f9208e) {
            return;
        }
        this.f9208e = true;
        ((e) a()).getClass();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult = registerForActivityResult(new g1(2), new a(this, 16));
        activityResultLauncherRegisterForActivityResult.getClass();
        this.f9209f = activityResultLauncherRegisterForActivityResult;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        n.G(requireActivity().getWindow(), false);
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6, null);
        composeView.setContent(new u3.d(new pm.m(this, 15), true, -1594153594));
        return composeView;
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(new k(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        o().a();
        uo.h hVarO = o();
        hVarO.getClass();
        f0.B(m1.d(hVarO), null, null, new uo.f(hVarO, null), 3);
    }

    public final void p() {
        if (this.f9204a == null) {
            this.f9204a = new k(super.getContext(), this);
            this.f9205b = z.v(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        p();
        if (this.f9208e) {
            return;
        }
        this.f9208e = true;
        ((e) a()).getClass();
    }
}
