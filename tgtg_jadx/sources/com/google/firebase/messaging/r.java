package com.google.firebase.messaging;

import a3.i3;
import android.app.job.JobParameters;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.Size;
import android.view.Surface;
import android.view.View;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.EditText;
import com.app.tgtg.feature.tabprofile.manageaccount.notificationsettings.ui.NotificationSettingsActivity;
import com.app.tgtg.model.remote.order.Order;
import com.facebook.login.widget.LoginButton;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.gms.internal.measurement.te;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.Charsets;
import m0.h1;
import m0.p0;
import m0.r0;
import m0.y0;
import org.bouncycastle.iana.AEADAlgorithm;
import pg.a2;
import s0.e1;
import v80.b2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f12874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f12875c;

    public /* synthetic */ r(int i11, Object obj, Object obj2) {
        this.f12873a = i11;
        this.f12874b = obj;
        this.f12875c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i11 = 1;
        switch (this.f12873a) {
            case 0:
                s sVar = (s) this.f12874b;
                d10.g gVar = (d10.g) this.f12875c;
                try {
                    gVar.b(sVar.a());
                    return;
                } catch (Exception e5) {
                    gVar.a(e5);
                    return;
                }
            case 1:
                View view = (View) this.f12874b;
                cx.d dVar = (cx.d) this.f12875c;
                if (yx.a.f46339a.contains(cx.d.class)) {
                    return;
                }
                try {
                    if (view instanceof EditText) {
                        dVar.b(view);
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    yx.a.a(cx.d.class, th2);
                    return;
                }
            case 2:
                cy.w wVar = (cy.w) this.f12874b;
                Bundle bundle = (Bundle) this.f12875c;
                if (yx.a.f46339a.contains(cy.w.class)) {
                    return;
                }
                try {
                    wVar.f13598b.M(bundle, "fb_mobile_login_heartbeat");
                    return;
                } catch (Throwable th3) {
                    yx.a.a(cy.w.class, th3);
                    return;
                }
            case 3:
                JobInfoSchedulerService jobInfoSchedulerService = (JobInfoSchedulerService) this.f12874b;
                JobParameters jobParameters = (JobParameters) this.f12875c;
                int i12 = JobInfoSchedulerService.f11006a;
                jobInfoSchedulerService.jobFinished(jobParameters, false);
                return;
            case 4:
                d1.d dVar2 = (d1.d) this.f12874b;
                h1 h1Var = (h1) this.f12875c;
                dVar2.f13681e++;
                d1.c cVar = dVar2.f13677a;
                boolean z11 = h1Var.f28518e;
                Size size = h1Var.f28515b;
                e1.j.d((AtomicBoolean) cVar.f6867c, true);
                e1.j.c((Thread) cVar.f6869e);
                SurfaceTexture surfaceTexture = new SurfaceTexture(z11 ? cVar.f13673n : cVar.f13674o);
                surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
                Surface surface = new Surface(surfaceTexture);
                h1Var.a(surface, dVar2.f13679c, new an.c(dVar2, surfaceTexture, surface, i11));
                if (z11) {
                    dVar2.f13685i = surfaceTexture;
                    return;
                } else {
                    dVar2.f13686j = surfaceTexture;
                    surfaceTexture.setOnFrameAvailableListener(dVar2, dVar2.f13680d);
                    return;
                }
            case 5:
                d1.d dVar3 = (d1.d) this.f12874b;
                c1.o oVar = (c1.o) this.f12875c;
                Surface surfaceE = oVar.e(dVar3.f13679c, new bs.c(2, dVar3, oVar));
                dVar3.f13677a.o(surfaceE);
                dVar3.f13684h.put(oVar, surfaceE);
                return;
            case 6:
                b7.a.a((d4.e) this.f12874b, (LongSparseArray) this.f12875c);
                return;
            case 7:
                ((d90.e) this.f12874b).i((d90.b) this.f12875c, Unit.f26487a);
                return;
            case 8:
                ((dn.f) this.f12874b).f14994a.f34817u.startAnimation((ScaleAnimation) this.f12875c);
                return;
            case 9:
                Integer num = (Integer) this.f12874b;
                List list = (List) this.f12875c;
                list.getClass();
                if (CollectionsKt.I(dx.q.f15211a, num) || !CollectionsKt.I(dx.q.f15212b, num)) {
                    return;
                }
                if (dx.q.f15215e >= 5) {
                    dx.q.a().clear();
                    dx.q.f15215e = 0;
                    return;
                } else {
                    dx.q.a().addAll(0, list);
                    dx.q.f15215e++;
                    return;
                }
            case 10:
                String str = (String) this.f12874b;
                LoginButton loginButton = (LoginButton) this.f12875c;
                int i13 = LoginButton.f10988y;
                loginButton.getActivity().runOnUiThread(new r(11, loginButton, tx.c0.k(str, false)));
                return;
            case 11:
                LoginButton loginButton2 = (LoginButton) this.f12874b;
                tx.z zVar = (tx.z) this.f12875c;
                int i14 = LoginButton.f10988y;
                if (yx.a.f46339a.contains(loginButton2) || zVar == null) {
                    return;
                }
                try {
                    if (zVar.f40585c && loginButton2.getVisibility() == 0) {
                        loginButton2.h(zVar.f40584b);
                        return;
                    }
                    return;
                } catch (Throwable th4) {
                    yx.a.a(loginButton2, th4);
                    return;
                }
            case 12:
                ((a2) this.f12874b).f34773v.startAnimation((TranslateAnimation) this.f12875c);
                return;
            case 13:
                String str2 = (String) this.f12874b;
                Bundle bundle2 = (Bundle) this.f12875c;
                if (yx.a.f46339a.contains(ex.c.class)) {
                    return;
                }
                try {
                    str2.getClass();
                    Context contextA = ax.a0.a();
                    contextA.getClass();
                    new bx.m(contextA, (String) null).d(bundle2, str2);
                    return;
                } catch (Throwable th5) {
                    yx.a.a(ex.c.class, th5);
                    return;
                }
            case 14:
                ex.j jVar = (ex.j) this.f12874b;
                ao.l0 l0Var = (ao.l0) this.f12875c;
                try {
                    if (yx.a.f46339a.contains(ex.j.class)) {
                        return;
                    }
                    try {
                        Timer timer = jVar.f16548c;
                        if (timer != null) {
                            timer.cancel();
                        }
                        jVar.f16549d = null;
                        Timer timer2 = new Timer();
                        timer2.scheduleAtFixedRate(l0Var, 0L, 1000L);
                        jVar.f16548c = timer2;
                        return;
                    } catch (Exception e11) {
                        Log.e(ex.j.f16545e, "Error scheduling indexing job", e11);
                        return;
                    }
                } catch (Throwable th6) {
                    yx.a.a(ex.j.class, th6);
                    return;
                }
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                String str3 = (String) this.f12874b;
                ex.j jVar2 = (ex.j) this.f12875c;
                if (yx.a.f46339a.contains(ex.j.class)) {
                    return;
                }
                try {
                    str3.getClass();
                    byte[] bytes = str3.getBytes(Charsets.UTF_8);
                    bytes.getClass();
                    try {
                        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                        messageDigest.getClass();
                        messageDigest.update(bytes);
                        byte[] bArrDigest = messageDigest.digest();
                        StringBuilder sb2 = new StringBuilder();
                        bArrDigest.getClass();
                        for (byte b8 : bArrDigest) {
                            sb2.append(Integer.toHexString((b8 >> 4) & 15));
                            sb2.append(Integer.toHexString(b8 & 15));
                        }
                        string = sb2.toString();
                    } catch (NoSuchAlgorithmException unused) {
                    }
                    Date date = ax.b.l;
                    ax.b bVarV = pd.g.v();
                    if (string == null || !Intrinsics.areEqual(string, jVar2.f16549d)) {
                        String str4 = ex.j.f16545e;
                        jVar2.b(o30.f0.s(str3, bVarV, ax.a0.b()), string);
                        return;
                    }
                    return;
                } catch (Throwable th7) {
                    yx.a.a(ex.j.class, th7);
                    return;
                }
            case 16:
                Ref.ObjectRef objectRef = (Ref.ObjectRef) this.f12874b;
                Ref.ObjectRef objectRef2 = (Ref.ObjectRef) this.f12875c;
                v80.f0.j((v80.b0) objectRef.element, null);
                v80.f0.j((v80.b0) objectRef2.element, null);
                return;
            case 17:
                Function0 function0 = (Function0) this.f12874b;
                nq.d dVar4 = (nq.d) this.f12875c;
                if (function0 != null) {
                    function0.invoke();
                }
                Order ratingOrder = ((nq.k) dVar4).f31366a.getRatingOrder();
                ft.c.Z(ratingOrder != null ? ratingOrder.m429getOrderIdreIZeYA() : null);
                return;
            case 18:
                h40.c cVar2 = (h40.c) this.f12874b;
                CountDownLatch countDownLatch = (CountDownLatch) this.f12875c;
                try {
                    wy.p.a().f43592d.j(((wy.i) cVar2.f21409h.f3499a).b(ty.d.HIGHEST), 1);
                    break;
                } catch (Exception unused2) {
                }
                countDownLatch.countDown();
                return;
            case 19:
                kp.d dVar5 = (kp.d) this.f12874b;
                hq.i iVar = (hq.i) this.f12875c;
                int iA = iVar.a(dVar5.getBucket());
                if (iA != -1) {
                    iVar.f22362a.remove(iA);
                    iVar.notifyItemRemoved(iA);
                    fn.e eVar = iVar.f22371j;
                    if (eVar != null) {
                        eVar.invoke();
                    }
                }
                ft.c.e0(ft.c.q() + 1);
                ft.c.f0(System.currentTimeMillis());
                iVar.f22378r.invoke();
                return;
            case 20:
                hq.w wVar2 = (hq.w) this.f12874b;
                hq.i iVar2 = (hq.i) this.f12875c;
                nq.d bucket = wVar2.getBucket();
                int iA2 = iVar2.a(bucket);
                if (iA2 != -1) {
                    iVar2.f22362a.remove(iA2);
                    iVar2.notifyItemRemoved(iA2);
                    fn.e eVar2 = iVar2.f22371j;
                    if (eVar2 != null) {
                        eVar2.invoke();
                    }
                }
                bucket.getClass();
                Order ratingOrder2 = ((nq.k) bucket).f31366a.getRatingOrder();
                ft.c.Z(ratingOrder2 != null ? ratingOrder2.m429getOrderIdreIZeYA() : null);
                return;
            case 21:
                hs.h hVar = (hs.h) this.f12874b;
                NotificationSettingsActivity notificationSettingsActivity = (NotificationSettingsActivity) this.f12875c;
                int i15 = NotificationSettingsActivity.f9422k;
                if (hVar.f22473b.a()) {
                    return;
                }
                notificationSettingsActivity.c0();
                return;
            case 22:
                o0.c cVar3 = (o0.c) this.f12874b;
                df.g gVar2 = (df.g) this.f12875c;
                HashSet hashSet = new HashSet();
                if (cVar3 != null) {
                    hashSet.addAll(cVar3.f31618a);
                }
                ((y0) gVar2.f14900h).getClass();
                return;
            case 23:
                jb.f fVar = (jb.f) this.f12874b;
                qb.h hVar2 = (qb.h) this.f12875c;
                synchronized (fVar.f24893k) {
                    try {
                        Iterator it = fVar.f24892j.iterator();
                        while (it.hasNext()) {
                            ((jb.c) it.next()).c(hVar2, false);
                        }
                    } finally {
                    }
                    break;
                }
                return;
            case 24:
                rb.k kVar = (rb.k) this.f12874b;
                try {
                    ((Runnable) this.f12875c).run();
                    return;
                } finally {
                    kVar.a();
                }
            case 25:
                ((dn.k) ((a0) this.f12874b).f12780c).y((jb.k) this.f12875c, 3);
                return;
            case 26:
                ((e1) this.f12875c).d((i3) this.f12874b);
                return;
            case 27:
                m0.w wVar3 = (m0.w) this.f12874b;
                e6.i iVar3 = (e6.i) this.f12875c;
                te teVar = wVar3.f28622g;
                if (!((AtomicBoolean) teVar.f11902j).getAndSet(true)) {
                    w.e eVar3 = (w.e) teVar.f11898f;
                    eVar3.getClass();
                    eVar3.f42673g = false;
                    synchronized (eVar3.f42668b) {
                        eVar3.f42669c = null;
                        kotlin.collections.o0.f26530a.getClass();
                        eVar3.f42670d = kotlin.collections.n0.f26529a;
                        eVar3.f42672f = 0;
                        eVar3.f42671e.clear();
                    }
                    w.j0 j0Var = (w.j0) teVar.f11899g;
                    j0Var.getClass();
                    Log.i("PipePresenceSrc", "Stopping camera ID flow collection.");
                    if (j0Var.f42708h.compareAndSet(true, false)) {
                        b2 b2Var = j0Var.f42709i;
                        if (b2Var != null) {
                            b2Var.a(null);
                        }
                        j0Var.f42709i = null;
                    }
                    if (((u70.t) teVar.f11894b).a()) {
                        e0.b0 b0Var = (e0.b0) ((u70.t) teVar.f11894b).getValue();
                        synchronized (b0Var.f15312c) {
                            if (b0Var.f15313d) {
                                throw new IllegalStateException("Check failed.");
                            }
                            ((j0.h) b0Var.f15310a.f18031e.get()).b();
                            b0Var.f15313d = true;
                        }
                    }
                }
                if (wVar3.f28621f != null) {
                    Executor executor = wVar3.f28619d;
                    if (executor instanceof m0.n) {
                        m0.n nVar = (m0.n) executor;
                        synchronized (nVar.f28569a) {
                            try {
                                if (!nVar.f28570b.isShutdown()) {
                                    nVar.f28570b.shutdown();
                                }
                            } finally {
                            }
                        }
                    }
                    wVar3.f28621f.quit();
                    break;
                }
                iVar3.b(null);
                return;
            case 28:
                ((e1) this.f12875c).d((p0) this.f12874b);
                return;
            default:
                ((r0) this.f12874b).c((h1) this.f12875c);
                return;
        }
    }
}
