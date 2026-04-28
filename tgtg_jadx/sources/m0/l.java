package m0;

import android.app.Activity;
import android.graphics.Rect;
import android.os.Process;
import android.view.ActionMode;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.camera.core.ImageCaptureException;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import c5.i2;
import com.app.tgtg.feature.itemview.ui.ItemViewActivity;
import com.app.tgtg.feature.tabprofile.manageaccount.contactus.autorefund.AutoRefundActivity;
import com.braze.h2;
import com.braze.ui.banners.BannerView;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.bouncycastle.iana.AEADAlgorithm;
import pg.r1;
import y00.t1;
import zw.q2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f28547b;

    public /* synthetic */ l(r0.f fVar, ImageCaptureException imageCaptureException) {
        this.f28546a = 10;
        this.f28547b = fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v44, types: [java.lang.Object, u70.j] */
    /* JADX WARN: Type inference failed for: r10v2, types: [T, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r10v3, types: [T, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r10v6, types: [T, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r1v27, types: [java.lang.Object, u70.j] */
    @Override // java.lang.Runnable
    public final void run() {
        View viewFindFocus;
        x70.c cVar = null;
        int i11 = 0;
        switch (this.f28546a) {
            case 0:
                Runnable runnable = (Runnable) this.f28547b;
                Process.setThreadPriority(-3);
                runnable.run();
                return;
            case 1:
                ((s0) this.f28547b).p();
                return;
            case 2:
                ((nm.e) this.f28547b).u();
                return;
            case 3:
                i2 i2Var = (i2) this.f28547b;
                i2Var.f7254c = false;
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) i2Var.f7256e;
                z7.e eVar = sideSheetBehavior.f12588i;
                if (eVar != null && eVar.g()) {
                    i2Var.b(i2Var.f7253b);
                    return;
                } else {
                    if (sideSheetBehavior.f12587h == 2) {
                        sideSheetBehavior.x(i2Var.f7253b);
                        return;
                    }
                    return;
                }
            case 4:
                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) this.f28547b;
                int[] iArr = SwipeRefreshLayout.O;
                swipeRefreshLayout.l();
                return;
            case 5:
                ((om.l) this.f28547b).onResume();
                return;
            case 6:
                br.k kVar = (br.k) this.f28547b;
                ArrayList arrayList = kVar.f6635a;
                arrayList.getClass();
                arrayList.add(new ov.b(null, ov.c.LOADING_ITEM));
                kVar.notifyItemInserted(arrayList.size() - 1);
                return;
            case 7:
                ((d6.c) this.f28547b).invoke();
                return;
            case 8:
                p20.e eVar2 = (p20.e) this.f28547b;
                eVar2.setActiveThumbIndex(-1);
                eVar2.invalidate();
                return;
            case 9:
                r0.n nVar = (r0.n) ((q2) ((g1.g) this.f28547b).f18096b).f48333a;
                if (nVar != null) {
                    wd.a.p("ProcessingRequest", "onCaptureStarted: request ID = " + nVar.f37483a);
                    r0.o oVar = nVar.f37490h;
                    a.a.t();
                    if (oVar.f37500g || oVar.f37501h) {
                        return;
                    }
                    oVar.f37501h = true;
                    return;
                }
                return;
            case 10:
                jb.b bVar = ((r0.f) this.f28547b).f37453d;
                if (bVar != null) {
                    ((fi.b) bVar.f24851a).invoke(null);
                    return;
                } else {
                    h2.b("One and only one callback is allowed.");
                    return;
                }
            case 11:
                ((CarouselLayoutManager) this.f28547b).requestLayout();
                return;
            case 12:
                ActionMode actionMode = ((r2.f) this.f28547b).f37557h;
                if (actionMode != null) {
                    actionMode.finish();
                    return;
                }
                return;
            case 13:
                r5.c0 c0Var = (r5.c0) this.f28547b;
                j30.g gVar = c0Var.f37653b;
                c0Var.f37664n = null;
                o3.e eVar3 = c0Var.f37663m;
                View view = c0Var.f37652a;
                if (!view.isFocused() && (viewFindFocus = view.getRootView().findFocus()) != null && viewFindFocus.onCheckIsTextEditor()) {
                    eVar3.g();
                    return;
                }
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                Object[] objArr = eVar3.f31830a;
                int i12 = eVar3.f31832c;
                for (int i13 = 0; i13 < i12; i13++) {
                    r5.a0 a0Var = (r5.a0) objArr[i13];
                    int i14 = r5.b0.$EnumSwitchMapping$0[a0Var.ordinal()];
                    if (i14 == 1) {
                        ?? r102 = Boolean.TRUE;
                        objectRef.element = r102;
                        objectRef2.element = r102;
                    } else if (i14 == 2) {
                        ?? r103 = Boolean.FALSE;
                        objectRef.element = r103;
                        objectRef2.element = r103;
                    } else if (i14 != 3 && i14 != 4) {
                        e40.a.f();
                        return;
                    } else if (!Intrinsics.areEqual(objectRef.element, Boolean.FALSE)) {
                        objectRef2.element = Boolean.valueOf(a0Var == r5.a0.ShowKeyboard);
                    }
                }
                eVar3.g();
                if (Intrinsics.areEqual(objectRef.element, Boolean.TRUE)) {
                    ((InputMethodManager) gVar.f24503c.getValue()).restartInput((View) gVar.f24502b);
                }
                Boolean bool = (Boolean) objectRef2.element;
                if (bool != null) {
                    if (bool.booleanValue()) {
                        ((h7.e0) ((a50.c) gVar.f24504d).f822b).c();
                    } else {
                        ((h7.e0) ((a50.c) gVar.f24504d).f822b).b();
                    }
                }
                if (Intrinsics.areEqual(objectRef.element, Boolean.FALSE)) {
                    ((InputMethodManager) gVar.f24503c.getValue()).restartInput((View) gVar.f24502b);
                    return;
                }
                return;
            case 14:
                rx.e eVar4 = (rx.e) this.f28547b;
                if (yx.a.f46339a.contains(rx.e.class)) {
                    return;
                }
                try {
                    WeakReference weakReference = eVar4.f38259a;
                    View viewU = nx.d.u((Activity) weakReference.get());
                    Activity activity = (Activity) weakReference.get();
                    if (viewU != null && activity != null) {
                        for (View view2 : rx.c.a(viewU)) {
                            if (!fx.g.b(view2)) {
                                String strD = rx.c.d(view2);
                                if (strD.length() > 0 && strD.length() <= 300) {
                                    HashSet hashSet = rx.f.f38262e;
                                    String localClassName = activity.getLocalClassName();
                                    localClassName.getClass();
                                    rx.a.b(view2, viewU, localClassName);
                                }
                            }
                            break;
                        }
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                } catch (Throwable th2) {
                    yx.a.a(rx.e.class, th2);
                    return;
                }
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                ((Set) this.f28547b).getClass();
                return;
            case 16:
                yi.f0 f0VarB = ((ItemViewActivity) this.f28547b).B();
                if (f0VarB != null) {
                    yi.f0.v(f0VarB, false, 1);
                    return;
                }
                return;
            case 17:
                Runnable runnable2 = ((sr.q) this.f28547b).f39113b;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            case 18:
                t.v vVar = ((t.m) this.f28547b).f39300a;
                if (vVar.f39314b == null) {
                    vVar.f39314b = new t.s();
                }
                vVar.f39314b.getClass();
                return;
            case 19:
                ((t20.c) this.f28547b).s(true);
                return;
            case 20:
                t20.i iVar = (t20.i) this.f28547b;
                boolean zIsPopupShowing = iVar.f39686h.isPopupShowing();
                iVar.s(zIsPopupShowing);
                iVar.f39690m = zIsPopupShowing;
                return;
            case 21:
                ((TextInputLayout) this.f28547b).f12646e.requestLayout();
                return;
            case 22:
                AutoRefundActivity autoRefundActivity = (AutoRefundActivity) this.f28547b;
                int i15 = AutoRefundActivity.f9403j;
                autoRefundActivity.getOnBackPressedDispatcher().d();
                return;
            case 23:
                tx.p.g((tx.p) this.f28547b);
                return;
            case 24:
                tx.v vVar2 = (tx.v) this.f28547b;
                vVar2.f40569a.a(tx.w.b(vVar2.f40570b));
                return;
            case 25:
                cz.j jVar = (cz.j) this.f28547b;
                if (((AtomicBoolean) jVar.f13639i).compareAndSet(true, false)) {
                    ArrayList arrayList2 = (ArrayList) jVar.f13635e;
                    ub.a aVar = (ub.a) jVar.f13634d;
                    ExecutorService executorService = (ExecutorService) jVar.f13637g;
                    if (executorService != null) {
                        executorService.shutdown();
                        aVar.L("PayKitAnalytics", "Executor service shutdown.");
                    }
                    ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) jVar.f13638h;
                    if (scheduledExecutorService != null) {
                        scheduledExecutorService.shutdown();
                        aVar.L("PayKitAnalytics", "Scheduled executor service shutdown.");
                    }
                    if (!arrayList2.isEmpty()) {
                        arrayList2.clear();
                        aVar.L("PayKitAnalytics", "FutureTask list cleared.");
                    }
                    ((xb.a) jVar.f13632b).close();
                    aVar.L("PayKitAnalytics", "Shutdown completed.");
                    return;
                }
                synchronized (jVar) {
                    ((ub.a) jVar.f13634d).L("PayKitAnalytics", "startDelivery(false)");
                    jVar.b();
                    jVar.a();
                    t5.a aVar2 = (t5.a) jVar.f13633c;
                    ArrayList arrayList3 = (ArrayList) jVar.f13636f;
                    ub.a aVar3 = (ub.a) jVar.f13634d;
                    aVar2.getClass();
                    arrayList3.getClass();
                    aVar3.getClass();
                    ub.c cVar2 = new ub.c(new t1(aVar2, arrayList3, aVar3));
                    ((ArrayList) jVar.f13635e).add(cVar2);
                    ExecutorService executorService2 = (ExecutorService) jVar.f13637g;
                    executorService2.getClass();
                    executorService2.execute(cVar2);
                }
                return;
            case 26:
                uk.q qVar = (uk.q) this.f28547b;
                int i16 = uk.q.f41347y;
                ((r1) qVar.f41370x.f35151e).f35117b.getGlobalVisibleRect(new Rect());
                return;
            case 27:
                BannerView.setWebviewToEmpty$lambda$5((BannerView) this.f28547b);
                return;
            case 28:
                ((w20.d) this.f28547b).j();
                return;
            default:
                y9.y yVar = (y9.y) this.f28547b;
                boolean z11 = yVar.f3471c > 0;
                if (yVar.f45773p.compareAndSet(false, true) && z11) {
                    a90.d dVar = yVar.l.f45756a;
                    if (dVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("coroutineScope");
                        dVar = null;
                    }
                    v80.f0.B(dVar, yVar.f45776s, null, new y9.z(yVar, cVar, i11), 2);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ l(Object obj, int i11) {
        this.f28546a = i11;
        this.f28547b = obj;
    }

    public /* synthetic */ l(s0.l0 l0Var, Set set) {
        this.f28546a = 15;
        this.f28547b = set;
    }
}
