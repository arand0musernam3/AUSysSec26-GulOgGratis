package mr;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;
import androidx.camera.core.ImageCaptureException;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.credentials.exceptions.publickeycredential.SignalCredentialUnknownException;
import androidx.fragment.app.strictmode.Violation;
import androidx.lifecycle.p0;
import com.app.tgtg.R;
import com.app.tgtg.feature.locationpicker.LocationPickerOverlay;
import com.app.tgtg.model.remote.item.response.CateringItem;
import com.app.tgtg.model.remote.user.requests.CollectionTime;
import com.braze.h2;
import com.braze.ui.banners.BannerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import jb.s;
import kotlin.jvm.internal.Intrinsics;
import m0.n0;
import mv.r0;
import n7.y;
import o30.d0;
import org.bouncycastle.iana.AEADAlgorithm;
import pg.s1;
import q6.g0;
import s0.i0;
import s0.l0;
import s0.x0;
import t.v;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f30086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f30087c;

    public /* synthetic */ h(List list, ob.e eVar) {
        this.f30085a = 4;
        this.f30087c = list;
        this.f30086b = eVar;
    }

    private final void a() {
        u30.l lVar = (u30.l) this.f30086b;
        t40.b bVar = (t40.b) this.f30087c;
        synchronized (lVar) {
            try {
                if (lVar.f40702b == null) {
                    lVar.f40701a.add(bVar);
                } else {
                    lVar.f40702b.add(bVar.get());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        t40.a aVar;
        switch (this.f30085a) {
            case 0:
                r rVar = (r) this.f30086b;
                List<? extends CollectionTime> list = (List) this.f30087c;
                list.getClass();
                rVar.f30110b.m().setCollectionTimes(CollectionTime.INSTANCE.toRawValues(list));
                rVar.f30126s = list;
                return;
            case 1:
                Context context = (Context) this.f30086b;
                Throwable th2 = (Throwable) this.f30087c;
                if (!r0.u(context)) {
                    Toast.makeText(context, R.string.generic_error_unable_to_connect_to_internet_please_try_again_later, 0).show();
                    return;
                } else {
                    Toast.makeText(context, R.string.generic_error_servers_are_busy, 0).show();
                    sa0.a.f38953a.d(th2);
                    return;
                }
            case 2:
                ((d0) this.f30086b).t((ListenableFuture) this.f30087c);
                return;
            case 3:
                ((d0) this.f30086b).q((k30.b) this.f30087c);
                return;
            case 4:
                List list2 = (List) this.f30087c;
                ob.e eVar = (ob.e) this.f30086b;
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    ((nb.a) it.next()).a(eVar.f32417e);
                }
                return;
            case 5:
                ((pt.a) this.f30086b).f35619a.accept((Editable) this.f30087c);
                return;
            case 6:
                g0 g0Var = (g0) this.f30086b;
                View[] viewArr = (View[]) this.f30087c;
                if (g0Var.f36207p != -1) {
                    for (View view : viewArr) {
                        view.setTag(g0Var.f36207p, Long.valueOf(System.nanoTime()));
                    }
                }
                if (g0Var.f36208q != -1) {
                    for (View view2 : viewArr) {
                        view2.setTag(g0Var.f36208q, null);
                    }
                    return;
                }
                return;
            case 7:
                String str = (String) this.f30086b;
                Violation violation = (Violation) this.f30087c;
                Log.e("FragmentStrictMode", "Policy violation with PENALTY_DEATH in ".concat(str), violation);
                throw violation;
            case 8:
                r0.n nVar = (r0.n) this.f30086b;
                Bitmap bitmap = (Bitmap) this.f30087c;
                wd.a.y("ProcessingRequest", "onPostviewBitmapAvailable: request ID = " + nVar.f37483a);
                r0.o oVar = nVar.f37490h;
                a.a.t();
                if (oVar.f37500g) {
                    return;
                }
                r0.f fVar = oVar.f37494a;
                fVar.f37452c.execute(new bx.c(fVar, bitmap, 18));
                return;
            case 9:
                r0.n nVar2 = (r0.n) this.f30086b;
                n0 n0Var = (n0) this.f30087c;
                wd.a.y("ProcessingRequest", "onFinalResult(ImageProxy): request ID = " + nVar2.f37483a);
                r0.o oVar2 = nVar2.f37490h;
                a.a.t();
                if (oVar2.f37500g) {
                    n0Var.close();
                    return;
                }
                pd.g.n("onImageCaptured() must be called before onFinalResult()", oVar2.f37496c.f15782b.isDone());
                oVar2.a();
                r0.f fVar2 = oVar2.f37494a;
                fVar2.f37452c.execute(new bx.c(fVar2, n0Var, 20));
                return;
            case 10:
                r0.n nVar3 = (r0.n) this.f30086b;
                jd.f fVar3 = (jd.f) this.f30087c;
                wd.a.y("ProcessingRequest", "onFinalResult(OutputFileResults): request ID = " + nVar3.f37483a);
                r0.o oVar3 = nVar3.f37490h;
                a.a.t();
                if (oVar3.f37500g) {
                    return;
                }
                pd.g.n("onImageCaptured() must be called before onFinalResult()", oVar3.f37496c.f15782b.isDone());
                oVar3.a();
                r0.f fVar4 = oVar3.f37494a;
                fVar4.f37452c.execute(new h(13, fVar4, fVar3));
                return;
            case 11:
                r0.n nVar4 = (r0.n) this.f30086b;
                ImageCaptureException imageCaptureException = (ImageCaptureException) this.f30087c;
                wd.a.J("ProcessingRequest", "onProcessFailure: request ID = " + nVar4.f37483a, imageCaptureException);
                r0.o oVar4 = nVar4.f37490h;
                a.a.t();
                if (oVar4.f37500g) {
                    return;
                }
                pd.g.n("onImageCaptured() must be called before onFinalResult()", oVar4.f37496c.f15782b.isDone());
                oVar4.a();
                a.a.t();
                r0.f fVar5 = oVar4.f37494a;
                fVar5.f37452c.execute(new m0.l(fVar5, imageCaptureException));
                return;
            case 12:
                ((r0.q) this.f30086b).f37509e.remove((r0.o) this.f30087c);
                return;
            case 13:
                r0.f fVar6 = (r0.f) this.f30086b;
                jd.f fVar7 = (jd.f) this.f30087c;
                jb.b bVar = fVar6.f37453d;
                Objects.requireNonNull(bVar);
                Objects.requireNonNull(fVar7);
                ((fi.b) bVar.f24851a).invoke((Uri) fVar7.f24983b);
                return;
            case 14:
                ((n7.l) this.f30086b).a(this.f30087c);
                return;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                s sVar = (s) this.f30086b;
                String string = ((UUID) this.f30087c).toString();
                string.getClass();
                rb.g.a(sVar, string);
                return;
            case 16:
                l0 l0Var = (l0) this.f30086b;
                Set<m0.p> set = (Set) this.f30087c;
                i1.d dVar = l0Var.f38379a;
                set.getClass();
                a.a.t();
                synchronized (dVar.f22761a) {
                    try {
                        for (m0.p pVar : set) {
                            Set setKeySet = dVar.f22767g.keySet();
                            ArrayList arrayList = new ArrayList();
                            for (Object obj : setKeySet) {
                                if (Intrinsics.areEqual(((m0.p) obj).f28572a, pVar.f28572a)) {
                                    arrayList.add(obj);
                                }
                            }
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                dVar.f22767g.remove((m0.p) it2.next());
                            }
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                    break;
                }
                return;
            case 17:
                ((i0) this.f30086b).q().j().j((p0) this.f30087c);
                return;
            case 18:
                ((s0.g0) this.f30086b).j().f((av.d) this.f30087c);
                return;
            case 19:
                s0.p0 p0Var = (s0.p0) this.f30086b;
                i0 i0Var = (i0) this.f30087c;
                synchronized (p0Var.f38424a) {
                    try {
                        p0Var.f38426c.remove(i0Var);
                        if (p0Var.f38426c.isEmpty()) {
                            p0Var.f38428e.getClass();
                            p0Var.f38428e.b(null);
                            p0Var.f38428e = null;
                            p0Var.f38427d = null;
                        }
                    } finally {
                    }
                    break;
                }
                return;
            case 20:
                x0 x0Var = (x0) this.f30086b;
                String str2 = (String) this.f30087c;
                try {
                    x0Var.f38469e.get();
                    x0Var.e(x0.f38464m.decrementAndGet(), x0.l.get(), "Surface terminated");
                    return;
                } catch (Exception e5) {
                    wd.a.r("DeferrableSurface", "Unexpected surface termination for " + x0Var + "\nStack Trace:\n" + str2);
                    synchronized (x0Var.f38465a) {
                        throw new IllegalArgumentException(String.format("DeferrableSurface %s [closed: %b, use_count: %s] terminated with unexpected exception.", x0Var, Boolean.valueOf(x0Var.f38467c), Integer.valueOf(x0Var.f38466b)), e5);
                    }
                }
            case 21:
                t.m mVar = (t.m) this.f30086b;
                t.p pVar2 = (t.p) this.f30087c;
                v vVar = mVar.f39300a;
                if (vVar.f39314b == null) {
                    vVar.f39314b = new t.s();
                }
                vVar.f39314b.F(pVar2);
                return;
            case 22:
                u30.m mVar2 = (u30.m) this.f30086b;
                t40.b bVar2 = (t40.b) this.f30087c;
                if (mVar2.f40706b != u30.m.f40704d) {
                    h2.b("provide() can be called only once.");
                    return;
                }
                synchronized (mVar2) {
                    aVar = mVar2.f40705a;
                    mVar2.f40705a = null;
                    mVar2.f40706b = bVar2;
                    break;
                }
                aVar.f(bVar2);
                return;
            case 23:
                a();
                return;
            case 24:
                ((n7.l) this.f30086b).a((SignalCredentialUnknownException) this.f30087c);
                return;
            case 25:
                ((n7.l) this.f30086b).onResult((y) this.f30087c);
                return;
            case 26:
                mk.a.e((uh.g) this.f30086b, (CateringItem) this.f30087c);
                return;
            case 27:
                final uk.q qVar = (uk.q) this.f30086b;
                st.a aVar2 = (st.a) this.f30087c;
                BottomSheetBehavior bottomSheetBehavior = qVar.f41366t;
                bottomSheetBehavior.getClass();
                int i11 = bottomSheetBehavior.f12315f ? -1 : bottomSheetBehavior.f12314e;
                s1 s1Var = qVar.f41370x;
                int height = i11 - ((RelativeLayout) s1Var.f35155i).getHeight();
                ViewGroup.LayoutParams layoutParams = ((ImageView) s1Var.f35154h).getLayoutParams();
                layoutParams.getClass();
                final ConstraintLayout.a aVar3 = (ConstraintLayout.a) layoutParams;
                final ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, height);
                valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: uk.l
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        int i12 = q.f41347y;
                        valueAnimator.getClass();
                        q qVar2 = qVar;
                        t00.c cVar = qVar2.f41350c;
                        s1 s1Var2 = qVar2.f41370x;
                        if (cVar == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mapView");
                            cVar = null;
                        }
                        ValueAnimator valueAnimator2 = valueAnimatorOfInt;
                        Object animatedValue = valueAnimator2.getAnimatedValue();
                        animatedValue.getClass();
                        cVar.setPadding(0, 0, 0, ((Integer) animatedValue).intValue());
                        Object animatedValue2 = valueAnimator2.getAnimatedValue();
                        animatedValue2.getClass();
                        int iIntValue = ((Integer) animatedValue2).intValue();
                        ConstraintLayout.a aVar4 = aVar3;
                        aVar4.setMargins(0, 0, 0, iIntValue);
                        ((ImageView) s1Var2.f35154h).setLayoutParams(aVar4);
                        LocationPickerOverlay locationPickerOverlay = (LocationPickerOverlay) s1Var2.f35150d;
                        Object animatedValue3 = valueAnimator2.getAnimatedValue();
                        animatedValue3.getClass();
                        locationPickerOverlay.setPadding(0, 0, 0, ((Integer) animatedValue3).intValue());
                    }
                });
                valueAnimatorOfInt.setDuration(200L);
                valueAnimatorOfInt.start();
                LocationPickerOverlay locationPickerOverlay = (LocationPickerOverlay) s1Var.f35150d;
                locationPickerOverlay.setOffset(height);
                locationPickerOverlay.setMap(aVar2);
                return;
            case 28:
                ((BannerView) this.f30086b).loadHtmlData((String) this.f30087c);
                return;
            default:
                d1.e eVar2 = (d1.e) this.f30086b;
                CountDownLatch countDownLatch = (CountDownLatch) this.f30087c;
                try {
                    eVar2.run();
                    return;
                } finally {
                    countDownLatch.countDown();
                }
        }
    }

    public /* synthetic */ h(int i11, Object obj, Object obj2) {
        this.f30085a = i11;
        this.f30086b = obj;
        this.f30087c = obj2;
    }

    public /* synthetic */ h(d0 d0Var, int i11, ListenableFuture listenableFuture) {
        this.f30085a = 2;
        this.f30086b = d0Var;
        this.f30087c = listenableFuture;
    }
}
