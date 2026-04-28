package fn;

import a3.m2;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.e0;
import androidx.activity.result.ActivityResultLauncher;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.g1;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.m1;
import androidx.lifecycle.n1;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b0;
import androidx.recyclerview.widget.y1;
import ao.g3;
import c50.w;
import com.app.tgtg.R;
import com.app.tgtg.customview.DiscoverLocationView;
import com.app.tgtg.customview.GenericErrorView;
import com.app.tgtg.customview.MessageBarView;
import com.app.tgtg.customview.TGTGLoadingView;
import com.app.tgtg.feature.locationpicker.newlocationpicker.NewLocationPicker;
import com.app.tgtg.feature.main.MainActivity;
import com.app.tgtg.feature.main.fragments.discover.herocomponent.DiscoverSheetView;
import com.app.tgtg.model.local.AppConstants;
import com.google.firebase.messaging.x;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import m3.k1;
import mv.z;
import pg.b1;
import pg.o0;
import v80.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007²\u0006\u000e\u0010\u0006\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002"}, d2 = {"Lfn/t;", "Lkm/a;", "<init>", "()V", "bs/e", "", "openInfoSheet", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFragmentDiscover.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentDiscover.kt\ncom/app/tgtg/feature/main/fragments/discover/FragmentDiscover\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 Color.kt\nandroidx/core/graphics/ColorKt\n+ 7 ViewExt.kt\ncom/tgtg/core/common/ext/ViewExtKt\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 9 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1017:1\n106#2,15:1018\n106#2,15:1033\n106#2,15:1048\n85#3:1063\n117#3,2:1064\n85#3:1133\n117#3,2:1134\n67#4,4:1066\n37#4,2:1070\n55#4:1072\n72#4:1073\n257#4,2:1080\n257#4,2:1082\n257#4,2:1084\n257#4,2:1086\n257#4,2:1103\n257#4,2:1105\n257#4,2:1107\n255#4:1110\n257#4,2:1111\n255#4:1113\n257#4,2:1126\n255#4:1129\n255#4:1130\n257#4,2:1131\n777#5:1074\n873#5,2:1075\n777#5:1077\n873#5,2:1078\n404#6:1088\n404#6:1128\n8#7,7:1089\n8#7,7:1096\n1#8:1109\n1128#9,6:1114\n1128#9,6:1120\n1128#9,6:1136\n1128#9,6:1142\n1128#9,6:1148\n1128#9,6:1154\n*S KotlinDebug\n*F\n+ 1 FragmentDiscover.kt\ncom/app/tgtg/feature/main/fragments/discover/FragmentDiscover\n*L\n94#1:1018,15\n95#1:1033,15\n96#1:1048,15\n98#1:1063\n98#1:1064,2\n948#1:1133\n948#1:1134,2\n320#1:1066,4\n320#1:1070,2\n320#1:1072\n320#1:1073\n520#1:1080,2\n521#1:1082,2\n522#1:1084,2\n527#1:1086,2\n816#1:1103,2\n823#1:1105,2\n903#1:1107,2\n915#1:1110\n919#1:1111,2\n926#1:1113\n421#1:1126,2\n595#1:1129\n600#1:1130\n932#1:1131,2\n327#1:1074\n327#1:1075,2\n339#1:1077\n339#1:1078,2\n557#1:1088\n563#1:1128\n624#1:1089,7\n761#1:1096,7\n210#1:1114,6\n206#1:1120,6\n948#1:1136,6\n969#1:1142,6\n979#1:1148,6\n987#1:1154,6\n*E\n"})
public final class t extends v {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n1 f17848g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final n1 f17849h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final n1 f17850i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final k1 f17851j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public lq.l f17852k;
    public boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public hq.i f17853m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f17854n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f17855o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public pt.b f17856p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Parcelable f17857q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ArrayList f17858r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public o0 f17859s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f17860t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public vg.e f17861u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ActivityResultLauncher f17862v;

    public t() {
        s sVar = new s(this, 1);
        u70.m mVar = u70.m.NONE;
        u70.j jVarA = u70.l.a(mVar, new defpackage.a(sVar, 16));
        this.f17848g = new n1(Reflection.getOrCreateKotlinClass(c.class), new bl.c(jVarA, 6), new r(this, jVarA, 2), new bl.c(jVarA, 7));
        u70.j jVarA2 = u70.l.a(mVar, new defpackage.a(new s(this, 2), 17));
        this.f17849h = new n1(Reflection.getOrCreateKotlinClass(yk.h.class), new bl.c(jVarA2, 8), new r(this, jVarA2, 0), new bl.c(jVarA2, 9));
        u70.j jVarA3 = u70.l.a(mVar, new defpackage.a(new s(this, 0), 15));
        this.f17850i = new n1(Reflection.getOrCreateKotlinClass(tg.i.class), new bl.c(jVarA3, 4), new r(this, jVarA3, 1), new bl.c(jVarA3, 5));
        this.f17851j = m3.i.w(Boolean.FALSE);
        this.f17858r = new ArrayList();
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult = registerForActivityResult(new g1(3), new f(this));
        activityResultLauncherRegisterForActivityResult.getClass();
        this.f17862v = activityResultLauncherRegisterForActivityResult;
    }

    public final void A() {
        if (!s().f17800g.d()) {
            s().f17804k.c(f70.i.DISCOVER);
            return;
        }
        o0 o0Var = this.f17859s;
        o0Var.getClass();
        ((NewLocationPicker) o0Var.f35024j).setVisibility(0);
        o0 o0Var2 = this.f17859s;
        o0Var2.getClass();
        NewLocationPicker newLocationPicker = (NewLocationPicker) o0Var2.f35024j;
        newLocationPicker.setOpenedFrom(dv.d.DISCOVER.a());
        newLocationPicker.setShowSheet(true);
        newLocationPicker.setOnApplyChangesClicked(new e(this, 7));
    }

    @Override // km.a
    public final z o() {
        return z.DISCOVER;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.discover_fragment, viewGroup, false);
        int i11 = R.id.bucketListRecyclerView;
        RecyclerView recyclerView = (RecyclerView) pd.g.t(R.id.bucketListRecyclerView, viewInflate);
        if (recyclerView != null) {
            i11 = R.id.cvC2CReferralInviteFriendDialog;
            if (((ComposeView) pd.g.t(R.id.cvC2CReferralInviteFriendDialog, viewInflate)) != null) {
                i11 = R.id.cvLoyaltyCardInfoBottomSheet;
                ComposeView composeView = (ComposeView) pd.g.t(R.id.cvLoyaltyCardInfoBottomSheet, viewInflate);
                if (composeView != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                    i11 = R.id.discoverMessageBar;
                    if (((MessageBarView) pd.g.t(R.id.discoverMessageBar, viewInflate)) != null) {
                        i11 = R.id.discoverSheetView;
                        DiscoverSheetView discoverSheetView = (DiscoverSheetView) pd.g.t(R.id.discoverSheetView, viewInflate);
                        if (discoverSheetView != null) {
                            i11 = R.id.errorView;
                            GenericErrorView genericErrorView = (GenericErrorView) pd.g.t(R.id.errorView, viewInflate);
                            if (genericErrorView != null) {
                                i11 = R.id.loadingProgressBar;
                                TGTGLoadingView tGTGLoadingView = (TGTGLoadingView) pd.g.t(R.id.loadingProgressBar, viewInflate);
                                if (tGTGLoadingView != null) {
                                    i11 = R.id.locationHeaderView;
                                    DiscoverLocationView discoverLocationView = (DiscoverLocationView) pd.g.t(R.id.locationHeaderView, viewInflate);
                                    if (discoverLocationView != null) {
                                        i11 = R.id.newLocationPicker;
                                        NewLocationPicker newLocationPicker = (NewLocationPicker) pd.g.t(R.id.newLocationPicker, viewInflate);
                                        if (newLocationPicker != null) {
                                            i11 = R.id.panicMessageView;
                                            View viewT = pd.g.t(R.id.panicMessageView, viewInflate);
                                            if (viewT != null) {
                                                ConstraintLayout constraintLayout2 = (ConstraintLayout) viewT;
                                                int i12 = R.id.panicClose;
                                                ImageView imageView = (ImageView) pd.g.t(R.id.panicClose, viewT);
                                                if (imageView != null) {
                                                    i12 = R.id.panicIcon;
                                                    if (((ImageView) pd.g.t(R.id.panicIcon, viewT)) != null) {
                                                        i12 = R.id.panicMessage;
                                                        TextView textView = (TextView) pd.g.t(R.id.panicMessage, viewT);
                                                        if (textView != null) {
                                                            b1 b1Var = new b1(constraintLayout2, constraintLayout2, imageView, textView, 3);
                                                            i11 = R.id.popupDialog;
                                                            ComposeView composeView2 = (ComposeView) pd.g.t(R.id.popupDialog, viewInflate);
                                                            if (composeView2 != null) {
                                                                i11 = R.id.transparentOverlay;
                                                                FrameLayout frameLayout = (FrameLayout) pd.g.t(R.id.transparentOverlay, viewInflate);
                                                                if (frameLayout != null) {
                                                                    i11 = R.id.verifyEmailView;
                                                                    View viewT2 = pd.g.t(R.id.verifyEmailView, viewInflate);
                                                                    if (viewT2 != null) {
                                                                        int i13 = R.id.attentionIcon;
                                                                        if (((ImageView) pd.g.t(R.id.attentionIcon, viewT2)) != null) {
                                                                            i13 = R.id.continueIcon;
                                                                            if (((ImageView) pd.g.t(R.id.continueIcon, viewT2)) != null) {
                                                                                i13 = R.id.title;
                                                                                if (((TextView) pd.g.t(R.id.title, viewT2)) != null) {
                                                                                    ConstraintLayout constraintLayout3 = (ConstraintLayout) viewT2;
                                                                                    this.f17859s = new o0(constraintLayout, recyclerView, composeView, discoverSheetView, genericErrorView, tGTGLoadingView, discoverLocationView, newLocationPicker, b1Var, composeView2, frameLayout, new pg.v(constraintLayout3, constraintLayout3, 8));
                                                                                    constraintLayout.getClass();
                                                                                    return constraintLayout;
                                                                                }
                                                                            }
                                                                        }
                                                                        w.l("Missing required view with ID: ".concat(viewT2.getResources().getResourceName(i13)));
                                                                        return null;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                w.l("Missing required view with ID: ".concat(viewT.getResources().getResourceName(i12)));
                                                return null;
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
        this.f17859s = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        o0 o0Var = this.f17859s;
        o0Var.getClass();
        y1 layoutManager = o0Var.f35016b.getLayoutManager();
        this.f17857q = layoutManager != null ? layoutManager.onSaveInstanceState() : null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (!this.f17860t) {
            s().i(MainActivity.f9078v, false);
            MainActivity.f9078v = false;
        }
        g3 g3Var = s().f17795b;
        String panicMessage = g3Var.n().getPanicMessage();
        if (panicMessage == null || panicMessage.length() == 0 || g3Var.f4278w) {
            return;
        }
        String panicMessage2 = s().f17795b.n().getPanicMessage();
        panicMessage2.getClass();
        o0 o0Var = this.f17859s;
        o0Var.getClass();
        b1 b1Var = (b1) o0Var.f35025k;
        ConstraintLayout constraintLayout = (ConstraintLayout) b1Var.f34796d;
        constraintLayout.getViewTreeObserver().addOnGlobalLayoutListener(new en.j(constraintLayout, this, b1Var, 1));
        ((TextView) b1Var.f34795c).setText(panicMessage2);
        p30.b.E(constraintLayout, true);
        constraintLayout.setOnClickListener(new com.braze.ui.inappmessage.f(1));
        mv.d.x((ImageView) b1Var.f34797e, new ek.a(6, b1Var, this));
    }

    @Override // km.a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        OnBackPressedDispatcher onBackPressedDispatcher;
        view.getClass();
        super.onViewCreated(view, bundle);
        androidx.fragment.app.o0 o0VarRequireActivity = requireActivity();
        o0VarRequireActivity.getClass();
        a70.a.t(o0VarRequireActivity, lv.s.J);
        this.l = requireContext().getResources().getConfiguration().screenHeightDp < 650;
        v6.d dVarRequireActivity = requireActivity();
        dVarRequireActivity.getClass();
        this.f17856p = (pt.b) dVarRequireActivity;
        c cVarS = s();
        cVarS.f17809q.e(getViewLifecycleOwner(), new dk.b(new d(this, 13), 2));
        cVarS.f17807o.e(getViewLifecycleOwner(), new dk.b(new d(this, 14), 2));
        cVarS.f17815w.e(getViewLifecycleOwner(), new dk.b(new d(this, 15), 2));
        cVarS.f17817y.e(getViewLifecycleOwner(), new dk.b(new d(this, 16), 2));
        cVarS.f17811s.e(getViewLifecycleOwner(), new dk.b(new d(this, 17), 2));
        cVarS.f17813u.e(getViewLifecycleOwner(), new dk.b(new d(this, 18), 2));
        androidx.lifecycle.o0 o0Var = cVarS.A;
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        m0.c.f0(o0Var, viewLifecycleOwner, new d(this, 1));
        cVarS.C.e(getViewLifecycleOwner(), new dk.b(new d(this, 2), 2));
        cVarS.E.e(getViewLifecycleOwner(), new dk.b(new d(this, 3), 2));
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        viewLifecycleOwner2.getClass();
        hq.i iVar = null;
        f0.B(m1.c(viewLifecycleOwner2), null, null, new n(this, null), 3);
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        viewLifecycleOwner3.getClass();
        f0.B(m1.c(viewLifecycleOwner3), null, null, new o(this, null), 3);
        o0 o0Var2 = this.f17859s;
        o0Var2.getClass();
        o0Var2.f35016b.setHasFixedSize(true);
        o0 o0Var3 = this.f17859s;
        o0Var3.getClass();
        o0Var3.f35016b.i(new bs.e(1));
        o0 o0Var4 = this.f17859s;
        o0Var4.getClass();
        o0Var4.f35016b.k(new b0(this, 3));
        o0 o0Var5 = this.f17859s;
        o0Var5.getClass();
        o0Var5.f35016b.j(new p(this, 0));
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        o0 o0Var6 = this.f17859s;
        o0Var6.getClass();
        o0Var6.f35016b.setLayoutManager(linearLayoutManager);
        hq.i iVar2 = new hq.i();
        this.f17853m = iVar2;
        iVar2.f22364c = s().f17800g.e();
        hq.i iVar3 = this.f17853m;
        if (iVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("discoverAdapter");
            iVar3 = null;
        }
        iVar3.f22365d = s().f17803j.d();
        hq.i iVar4 = this.f17853m;
        if (iVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("discoverAdapter");
            iVar4 = null;
        }
        iVar4.f22369h = new d(this, 7);
        hq.i iVar5 = this.f17853m;
        if (iVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("discoverAdapter");
            iVar5 = null;
        }
        iVar5.f22366e = new g(this, 0);
        hq.i iVar6 = this.f17853m;
        if (iVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("discoverAdapter");
            iVar6 = null;
        }
        iVar6.f22368g = new d(this, 8);
        hq.i iVar7 = this.f17853m;
        if (iVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("discoverAdapter");
            iVar7 = null;
        }
        iVar7.f22367f = new d(this, 9);
        hq.i iVar8 = this.f17853m;
        if (iVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("discoverAdapter");
            iVar8 = null;
        }
        iVar8.f22371j = new e(this, 6);
        hq.i iVar9 = this.f17853m;
        if (iVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("discoverAdapter");
            iVar9 = null;
        }
        iVar9.f22372k = new g(this, 1);
        hq.i iVar10 = this.f17853m;
        if (iVar10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("discoverAdapter");
            iVar10 = null;
        }
        iVar10.f22379s = new m2(this, 7);
        hq.i iVar11 = this.f17853m;
        if (iVar11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("discoverAdapter");
            iVar11 = null;
        }
        iVar11.f22370i = new g(this, 2);
        o0 o0Var7 = this.f17859s;
        o0Var7.getClass();
        RecyclerView recyclerView = o0Var7.f35016b;
        hq.i iVar12 = this.f17853m;
        if (iVar12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("discoverAdapter");
            iVar12 = null;
        }
        recyclerView.setAdapter(iVar12);
        hq.i iVar13 = this.f17853m;
        if (iVar13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("discoverAdapter");
            iVar13 = null;
        }
        d dVar = new d(this, 4);
        iVar13.getClass();
        iVar13.l = dVar;
        hq.i iVar14 = this.f17853m;
        if (iVar14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("discoverAdapter");
            iVar14 = null;
        }
        e eVar = new e(this, 0);
        iVar14.getClass();
        iVar14.f22373m = eVar;
        hq.i iVar15 = this.f17853m;
        if (iVar15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("discoverAdapter");
            iVar15 = null;
        }
        iVar15.f22374n = new e(this, 1);
        hq.i iVar16 = this.f17853m;
        if (iVar16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("discoverAdapter");
            iVar16 = null;
        }
        d dVar2 = new d(this, 5);
        iVar16.getClass();
        iVar16.f22375o = dVar2;
        hq.i iVar17 = this.f17853m;
        if (iVar17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("discoverAdapter");
            iVar17 = null;
        }
        e eVar2 = new e(this, 2);
        iVar17.getClass();
        iVar17.f22376p = eVar2;
        hq.i iVar18 = this.f17853m;
        if (iVar18 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("discoverAdapter");
            iVar18 = null;
        }
        e eVar3 = new e(this, 3);
        iVar18.getClass();
        iVar18.f22377q = eVar3;
        hq.i iVar19 = this.f17853m;
        if (iVar19 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("discoverAdapter");
            iVar19 = null;
        }
        e eVar4 = new e(this, 4);
        iVar19.getClass();
        iVar19.f22378r = eVar4;
        hq.i iVar20 = this.f17853m;
        if (iVar20 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("discoverAdapter");
        } else {
            iVar = iVar20;
        }
        iVar.f22380t = new d(this, 6);
        q(0);
        v();
        boolean zX = s().f17795b.x();
        o0 o0Var8 = this.f17859s;
        o0Var8.getClass();
        pg.v vVar = (pg.v) o0Var8.f35026m;
        ConstraintLayout constraintLayout = (ConstraintLayout) vVar.f35202c;
        if (zX) {
            constraintLayout.getViewTreeObserver().addOnGlobalLayoutListener(new en.j(constraintLayout, this, vVar, 2));
            p30.b.E(constraintLayout, true);
            mv.d.x(constraintLayout, new d(this, 0));
        } else {
            constraintLayout.setVisibility(8);
        }
        androidx.fragment.app.o0 activity = getActivity();
        if (activity != null && (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) != null) {
            LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
            viewLifecycleOwner4.getClass();
            onBackPressedDispatcher.b(new e0(this, 14), viewLifecycleOwner4);
        }
        y(true);
    }

    public final void q(int i11) {
        if (getActivity() instanceof MainActivity) {
            androidx.fragment.app.o0 activity = getActivity();
            activity.getClass();
            o0 o0Var = this.f17859s;
            o0Var.getClass();
            ViewCompat.k0(o0Var.f35017c, new cz.f(this, i11, (MainActivity) activity));
        }
    }

    public final void r() {
        o0 o0Var = this.f17859s;
        o0Var.getClass();
        pg.v vVar = (pg.v) o0Var.f35026m;
        ConstraintLayout constraintLayout = (ConstraintLayout) vVar.f35202c;
        int height = constraintLayout.getHeight();
        ViewPropertyAnimator duration = constraintLayout.animate().alpha(0.0f).translationYBy(-height).setDuration(350L);
        c70.b bVar = new c70.b(null, null, 15);
        bVar.f7799c = new c1.q(vVar, 3);
        duration.setListener(bVar).start();
        int i11 = this.f17854n;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i11, i11 - height);
        valueAnimatorOfInt.addUpdateListener(new bg.t(this, 2));
        valueAnimatorOfInt.setDuration(350L);
        valueAnimatorOfInt.start();
    }

    public final c s() {
        return (c) this.f17848g.getValue();
    }

    public final yk.h t() {
        return (yk.h) this.f17849h.getValue();
    }

    public final void u(vg.e eVar) {
        int i11 = k.$EnumSwitchMapping$0[eVar.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                e40.a.f();
                return;
            }
            n1 n1Var = this.f17850i;
            tg.i iVar = (tg.i) n1Var.getValue();
            iVar.f40164c.e(true, new c1.q(iVar, 7));
            ((tg.i) n1Var.getValue()).g(sm.b.CLICKED);
            return;
        }
        yk.h hVarT = t();
        hVarT.getClass();
        hVarT.f46131d.getClass();
        ft.c.g0(AppConstants.LOCATION_PICKER_YOUR_LOCATION);
        t().a();
        s().i(true, false);
        o0 o0Var = this.f17859s;
        o0Var.getClass();
        ((NewLocationPicker) o0Var.f35024j).setShowSheet(false);
    }

    public final void v() {
        o0 o0Var = this.f17859s;
        o0Var.getClass();
        DiscoverLocationView discoverLocationView = (DiscoverLocationView) o0Var.f35023i;
        discoverLocationView.setupLocation(s().f17800g.d(), s().c());
        discoverLocationView.setVisibility(0);
        discoverLocationView.setOnChangeLocation(new e(this, 5));
    }

    public final void w(Intent intent) {
        intent.getClass();
        if (intent.getBooleanExtra("REFRESH", false)) {
            o0 o0Var = this.f17859s;
            o0Var.getClass();
            ((TGTGLoadingView) o0Var.f35022h).setVisibility(0);
            this.f17858r.clear();
            hq.i iVar = this.f17853m;
            if (iVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("discoverAdapter");
                iVar = null;
            }
            iVar.f22362a.clear();
            iVar.notifyDataSetChanged();
        }
    }

    public final void x() {
        s().i(true, false);
    }

    public final void y(boolean z11) {
        o0 o0Var;
        o0 o0Var2 = this.f17859s;
        o0Var2.getClass();
        ViewCompat.k0((DiscoverLocationView) o0Var2.f35023i, new x(this, z11));
        if (z11 || (o0Var = this.f17859s) == null) {
            return;
        }
        DiscoverLocationView discoverLocationView = (DiscoverLocationView) o0Var.f35023i;
        o0Var.getClass();
        int paddingLeft = ((DiscoverLocationView) o0Var.f35023i).getPaddingLeft();
        o0 o0Var3 = this.f17859s;
        o0Var3.getClass();
        int paddingRight = ((DiscoverLocationView) o0Var3.f35023i).getPaddingRight();
        o0 o0Var4 = this.f17859s;
        o0Var4.getClass();
        discoverLocationView.setPadding(paddingLeft, 0, paddingRight, ((DiscoverLocationView) o0Var4.f35023i).getPaddingBottom());
    }

    public final void z() {
        this.f17851j.setValue(Boolean.TRUE);
        o0 o0Var = this.f17859s;
        o0Var.getClass();
        ((ComposeView) o0Var.f35019e).setContent(new u3.d(new g(this, 5), true, 990467158));
    }
}
