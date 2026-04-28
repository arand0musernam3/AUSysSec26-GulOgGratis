package oz;

import a3.i3;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Messenger;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.ArrayMap;
import android.util.Log;
import android.util.Pair;
import android.util.Size;
import android.view.Surface;
import android.view.View;
import android.widget.ImageView;
import androidx.camera.core.ImageCaptureException;
import androidx.cardview.widget.CardView;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.n1;
import co.datadome.sdk.x;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.internal.i0;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import fd.t;
import h7.w;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import kotlin.collections.x0;
import kotlin.jvm.internal.TypeIntrinsics;
import m0.a1;
import m0.n0;
import q1.b0;
import q90.r0;
import qc.y;
import r0.q;
import s0.e1;
import s0.f1;
import s0.k2;
import zw.q2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class m implements d10.b, oa0.k, OnCompleteListener, x0.c, f1, w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f33836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f33837c;

    public m(int i11) {
        this.f33835a = i11;
        switch (i11) {
            case 6:
                this.f33836b = new l20.c(21);
                this.f33837c = new b0(16);
                break;
            case 7:
                this.f33836b = new ArrayList();
                this.f33837c = new ArrayList();
                break;
            case 8:
            default:
                this.f33836b = new LinkedHashSet();
                this.f33837c = new LinkedHashMap();
                break;
            case 9:
                this.f33836b = Collections.synchronizedMap(new WeakHashMap());
                this.f33837c = Collections.synchronizedMap(new WeakHashMap());
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0046 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0041 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static oz.m d(android.content.Context r5) {
        /*
            java.lang.String r0 = "generatefid.lock"
            r1 = 0
            java.io.File r2 = new java.io.File     // Catch: java.nio.channels.OverlappingFileLockException -> L30 java.lang.Error -> L34 java.io.IOException -> L36
            java.io.File r5 = r5.getFilesDir()     // Catch: java.nio.channels.OverlappingFileLockException -> L30 java.lang.Error -> L34 java.io.IOException -> L36
            r2.<init>(r5, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L30 java.lang.Error -> L34 java.io.IOException -> L36
            java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch: java.nio.channels.OverlappingFileLockException -> L30 java.lang.Error -> L34 java.io.IOException -> L36
            java.lang.String r0 = "rw"
            r5.<init>(r2, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L30 java.lang.Error -> L34 java.io.IOException -> L36
            java.nio.channels.FileChannel r5 = r5.getChannel()     // Catch: java.nio.channels.OverlappingFileLockException -> L30 java.lang.Error -> L34 java.io.IOException -> L36
            java.nio.channels.FileLock r0 = r5.lock()     // Catch: java.nio.channels.OverlappingFileLockException -> L29 java.lang.Error -> L2c java.io.IOException -> L2e
            oz.m r2 = new oz.m     // Catch: java.nio.channels.OverlappingFileLockException -> L23 java.lang.Error -> L25 java.io.IOException -> L27
            r3 = 29
            r2.<init>(r3, r5, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L23 java.lang.Error -> L25 java.io.IOException -> L27
            return r2
        L23:
            r2 = move-exception
            goto L38
        L25:
            r2 = move-exception
            goto L38
        L27:
            r2 = move-exception
            goto L38
        L29:
            r2 = move-exception
        L2a:
            r0 = r1
            goto L38
        L2c:
            r2 = move-exception
            goto L2a
        L2e:
            r2 = move-exception
            goto L2a
        L30:
            r2 = move-exception
        L31:
            r5 = r1
            r0 = r5
            goto L38
        L34:
            r2 = move-exception
            goto L31
        L36:
            r2 = move-exception
            goto L31
        L38:
            java.lang.String r3 = "CrossProcessLock"
            java.lang.String r4 = "encountered error while creating and acquiring the lock, ignoring"
            android.util.Log.e(r3, r4, r2)
            if (r0 == 0) goto L44
            r0.release()     // Catch: java.io.IOException -> L44
        L44:
            if (r5 == 0) goto L49
            r5.close()     // Catch: java.io.IOException -> L49
        L49:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: oz.m.d(android.content.Context):oz.m");
    }

    public static Lifecycle p(td.i iVar) {
        xd.b bVar = iVar.f39998c;
        Object context = bVar instanceof xd.a ? ((xd.a) bVar).f44235b.getContext() : iVar.f39996a;
        while (!(context instanceof LifecycleOwner)) {
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return ((LifecycleOwner) context).getLifecycle();
    }

    public static boolean t(td.i iVar, Bitmap.Config config) {
        if (config == Bitmap.Config.HARDWARE) {
            if (!((Boolean) fd.o.e(iVar, td.k.f40025f)).booleanValue()) {
                return false;
            }
            xd.b bVar = iVar.f39998c;
            if (bVar instanceof xd.a) {
                ImageView imageView = ((xd.a) bVar).f44235b;
                if (imageView.isAttachedToWindow() && !imageView.isHardwareAccelerated()) {
                    return false;
                }
            }
        }
        return true;
    }

    public td.o A(td.o oVar) {
        fd.k kVar;
        boolean z11;
        fd.k kVar2 = oVar.f40039j;
        fd.j jVar = td.k.f40021b;
        if (((Bitmap.Config) fd.o.f(oVar, jVar)) != Bitmap.Config.HARDWARE || ((ae.e) this.f33837c).e()) {
            kVar = kVar2;
            z11 = false;
        } else {
            kVar2.getClass();
            LinkedHashMap linkedHashMapM = x0.m(kVar2.f17570a);
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            if (config != null) {
                linkedHashMapM.put(jVar, config);
            } else {
                linkedHashMapM.remove(jVar);
            }
            fd.k kVar3 = new fd.k(android.support.v4.media.session.a.M(linkedHashMapM));
            z11 = true;
            kVar = kVar3;
        }
        return z11 ? new td.o(oVar.f40030a, oVar.f40031b, oVar.f40032c, oVar.f40033d, oVar.f40034e, oVar.f40035f, oVar.f40036g, oVar.f40037h, oVar.f40038i, kVar) : oVar;
    }

    public void B(Status status, boolean z11) {
        HashMap map;
        HashMap map2;
        Map map3 = (Map) this.f33836b;
        synchronized (map3) {
            map = new HashMap(map3);
        }
        Map map4 = (Map) this.f33837c;
        synchronized (map4) {
            map2 = new HashMap(map4);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (z11 || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).c(status);
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (z11 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((d10.g) entry2.getKey()).c(new ApiException(status));
            }
        }
    }

    @Override // s0.f1
    public n0 a() {
        return n(((i3) this.f33836b).a());
    }

    @Override // s0.f1
    public int b() {
        return ((i3) this.f33836b).b();
    }

    @Override // s0.f1
    public int c() {
        return ((i3) this.f33836b).c();
    }

    @Override // s0.f1
    public void close() {
        ((i3) this.f33836b).close();
    }

    @Override // s0.f1
    public void e() {
        ((i3) this.f33836b).e();
    }

    @Override // oa0.k
    public Object f(Object obj) {
        r0 r0Var = (r0) obj;
        r0Var.getClass();
        jb.b bVar = (jb.b) this.f33837c;
        return ((n90.c) bVar.f24851a).b((i90.b) this.f33836b, r0Var.p());
    }

    @Override // d10.b
    public Object g(Task task) {
        Bundle bundle;
        b bVar = (b) this.f33836b;
        Bundle bundle2 = (Bundle) this.f33837c;
        bVar.getClass();
        return (task.isSuccessful() && (bundle = (Bundle) task.getResult()) != null && bundle.containsKey("google.messenger")) ? bVar.a(bundle2).o(h.f33818c, d.f33813d) : task;
    }

    @Override // s0.f1
    public int getHeight() {
        return ((i3) this.f33836b).getHeight();
    }

    @Override // s0.f1
    public Surface getSurface() {
        return ((i3) this.f33836b).getSurface();
    }

    public void h(String str, String str2) {
        str.getClass();
        str2.getClass();
        ((ArrayList) this.f33836b).add(fa0.a.b(str, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, 91));
        ((ArrayList) this.f33837c).add(fa0.a.b(str2, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, 91));
    }

    @Override // s0.f1
    public int i() {
        return ((i3) this.f33836b).i();
    }

    @Override // s0.f1
    public n0 j() {
        return n(((i3) this.f33836b).j());
    }

    @Override // s0.f1
    public void k(e1 e1Var, Executor executor) {
        ((i3) this.f33836b).k(new a50.d(26, this, e1Var), executor);
    }

    public v00.f l(v00.g gVar) {
        n00.c aVar;
        try {
            u00.g gVar2 = (u00.g) this.f33836b;
            Parcel parcelL = gVar2.L();
            n00.d.c(parcelL, gVar);
            Parcel parcelJ = gVar2.J(11, parcelL);
            IBinder strongBinder = parcelJ.readStrongBinder();
            int i11 = n00.b.f30267h;
            if (strongBinder == null) {
                aVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                aVar = iInterfaceQueryLocalInterface instanceof n00.c ? (n00.c) iInterfaceQueryLocalInterface : new n00.a(strongBinder, "com.google.android.gms.maps.model.internal.IMarkerDelegate", 5);
            }
            parcelJ.recycle();
            if (aVar != null) {
                return gVar.f41666q == 1 ? new v00.a(aVar) : new v00.f(aVar);
            }
            return null;
        } catch (RemoteException e5) {
            y.l(e5);
            return null;
        }
    }

    public void m(jb.b bVar, m mVar) {
        try {
            u00.g gVar = (u00.g) this.f33836b;
            yz.a aVar = (yz.a) bVar.f24851a;
            t00.g gVar2 = new t00.g(mVar);
            Parcel parcelL = gVar.L();
            n00.d.d(parcelL, aVar);
            n00.d.d(parcelL, gVar2);
            gVar.M(6, parcelL);
        } catch (RemoteException e5) {
            y.l(e5);
        }
    }

    public a1 n(n0 n0Var) {
        k2 k2Var;
        if (n0Var == null) {
            return null;
        }
        if (((r0.n) this.f33837c) == null) {
            k2Var = k2.f38372b;
        } else {
            r0.n nVar = (r0.n) this.f33837c;
            Pair pair = new Pair(nVar.f37491i, nVar.f37492j.get(0));
            k2 k2Var2 = k2.f38372b;
            ArrayMap arrayMap = new ArrayMap();
            arrayMap.put((String) pair.first, pair.second);
            k2Var = new k2(arrayMap);
        }
        this.f33837c = null;
        return new a1(n0Var, new Size(n0Var.b(), n0Var.getHeight()), new y0.b(new x((s0.y) null, k2Var, n0Var.Y().getTimestamp())));
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x019d, code lost:
    
        r0 = new r50.b[]{r7, r5}[1].f37731b;
        r1 = r22 - r0.length;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01aa, code lost:
    
        if (r6 >= r1) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01ac, code lost:
    
        r23[r4 + r6] = 0;
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01b4, code lost:
    
        java.lang.System.arraycopy(r0, 0, r23, r4 + r1, r0.length);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01ba, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void o(int r22, int[] r23) {
        /*
            Method dump skipped, instruction units count: 479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oz.m.o(int, int[]):void");
    }

    @Override // h7.w
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        ta.e eVar = (ta.e) this.f33837c;
        WindowInsetsCompat windowInsetsCompatO = ViewCompat.O(view, windowInsetsCompat);
        if (windowInsetsCompatO.q()) {
            return windowInsetsCompatO;
        }
        Rect rect = (Rect) this.f33836b;
        rect.left = windowInsetsCompatO.j();
        rect.top = windowInsetsCompatO.l();
        rect.right = windowInsetsCompatO.k();
        rect.bottom = windowInsetsCompatO.i();
        int childCount = eVar.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            WindowInsetsCompat windowInsetsCompatE = ViewCompat.e(eVar.getChildAt(i11), windowInsetsCompatO);
            rect.left = Math.min(windowInsetsCompatE.j(), rect.left);
            rect.top = Math.min(windowInsetsCompatE.l(), rect.top);
            rect.right = Math.min(windowInsetsCompatE.k(), rect.right);
            rect.bottom = Math.min(windowInsetsCompatE.i(), rect.bottom);
        }
        return windowInsetsCompatO.t(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        ((Map) ((m) this.f33837c).f33837c).remove((d10.g) this.f33836b);
    }

    @Override // x0.c
    public void onFailure(Throwable th2) {
        switch (this.f33835a) {
            case 13:
                a.a.t();
                r0.n nVar = (r0.n) this.f33836b;
                q2 q2Var = (q2) this.f33837c;
                if (nVar == ((r0.n) q2Var.f48333a)) {
                    wd.a.I("CaptureNode", "request aborted, id=" + ((r0.n) q2Var.f48333a).f37483a);
                    m mVar = (m) q2Var.f48338f;
                    if (mVar != null) {
                        mVar.f33837c = null;
                    }
                    q2Var.f48333a = null;
                }
                break;
            default:
                q qVar = (q) this.f33837c;
                m mVar2 = (m) this.f33836b;
                if (!((r0.o) mVar2.f33837c).f37500g) {
                    Object obj = ((s0.r0) ((ArrayList) mVar2.f33836b).get(0)).f38442e.f38373a.get("CAPTURE_CONFIG_ID_KEY");
                    int iIntValue = obj == null ? -1 : ((Integer) obj).intValue();
                    boolean z11 = th2 instanceof ImageCaptureException;
                    n1 n1Var = qVar.f37507c;
                    if (z11) {
                        r0.e eVar = new r0.e(iIntValue, (ImageCaptureException) th2);
                        n1Var.getClass();
                        a.a.t();
                        ((r0.a) n1Var.f3503e).f37439k.accept(eVar);
                    } else {
                        r0.e eVar2 = new r0.e(iIntValue, new ImageCaptureException(2, "Failed to submit capture request", th2));
                        n1Var.getClass();
                        a.a.t();
                        ((r0.a) n1Var.f3503e).f37439k.accept(eVar2);
                    }
                    qVar.f37506b.v();
                    break;
                }
                break;
        }
    }

    @Override // x0.c
    public void onSuccess(Object obj) {
        switch (this.f33835a) {
            case 13:
                break;
            default:
                ((q) this.f33837c).f37506b.v();
                break;
        }
    }

    public CameraPosition q() {
        try {
            u00.g gVar = (u00.g) this.f33836b;
            Parcel parcelJ = gVar.J(1, gVar.L());
            CameraPosition cameraPosition = (CameraPosition) n00.d.a(parcelJ, CameraPosition.CREATOR);
            parcelJ.recycle();
            return cameraPosition;
        } catch (RemoteException e5) {
            y.l(e5);
            return null;
        }
    }

    public m1.a r() {
        u00.b bVar;
        try {
            u00.g gVar = (u00.g) this.f33836b;
            Parcel parcelJ = gVar.J(26, gVar.L());
            IBinder strongBinder = parcelJ.readStrongBinder();
            if (strongBinder == null) {
                bVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
                bVar = iInterfaceQueryLocalInterface instanceof u00.b ? (u00.b) iInterfaceQueryLocalInterface : new u00.b(strongBinder, "com.google.android.gms.maps.internal.IProjectionDelegate", 5);
            }
            parcelJ.recycle();
            return new m1.a(bVar);
        } catch (RemoteException e5) {
            y.l(e5);
            return null;
        }
    }

    public jd.f s() {
        u00.c cVar;
        try {
            if (((jd.f) this.f33837c) == null) {
                u00.g gVar = (u00.g) this.f33836b;
                Parcel parcelJ = gVar.J(25, gVar.L());
                IBinder strongBinder = parcelJ.readStrongBinder();
                if (strongBinder == null) {
                    cVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    cVar = iInterfaceQueryLocalInterface instanceof u00.c ? (u00.c) iInterfaceQueryLocalInterface : new u00.c(strongBinder, "com.google.android.gms.maps.internal.IUiSettingsDelegate", 5);
                }
                parcelJ.recycle();
                this.f33837c = new jd.f(cVar, 26);
            }
            return (jd.f) this.f33837c;
        } catch (RemoteException e5) {
            y.l(e5);
            return null;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v0 td.o, still in use, count: 3, list:
          (r1v0 td.o) from 0x007e: MOVE (r18v0 td.o) = (r1v0 td.o) (LINE:127)
          (r1v0 td.o) from 0x0075: MOVE (r18v3 td.o) = (r1v0 td.o) (LINE:118)
          (r1v0 td.o) from 0x006a: MOVE (r18v5 td.o) = (r1v0 td.o) (LINE:107)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    public td.o u(td.i r20, ud.h r21) {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oz.m.u(td.i, ud.h):td.o");
    }

    public void v() {
        try {
            ((FileLock) this.f33837c).release();
            ((FileChannel) this.f33836b).close();
        } catch (IOException e5) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e5);
        }
    }

    public void w(t00.a aVar) {
        u00.g gVar = (u00.g) this.f33836b;
        try {
            t00.g gVar2 = new t00.g(this, aVar);
            Parcel parcelL = gVar.L();
            n00.d.d(parcelL, gVar2);
            gVar.M(99, parcelL);
        } catch (RemoteException e5) {
            y.l(e5);
        }
    }

    public void x(t00.b bVar) {
        u00.g gVar = (u00.g) this.f33836b;
        try {
            t00.g gVar2 = new t00.g(this, bVar);
            Parcel parcelL = gVar.L();
            n00.d.d(parcelL, gVar2);
            gVar.M(96, parcelL);
        } catch (RemoteException e5) {
            y.l(e5);
        }
    }

    public void y(int i11, int i12, int i13, int i14) {
        CardView cardView = (CardView) this.f33837c;
        cardView.f2231d.set(i11, i12, i13, i14);
        Rect rect = cardView.f2230c;
        super/*android.view.View*/.setPadding(i11 + rect.left, i12 + rect.top, i13 + rect.right, i14 + rect.bottom);
    }

    public synchronized void z(pf.c cVar, String str, Object obj) {
        if (str.length() == 0) {
            mf.a aVar = mf.a.f29926b;
            String str2 = "Attempting to perform operation " + cVar.a() + " with a null or empty string property, ignoring";
            aVar.getClass();
            aVar.e(kf.a.WARN, str2);
            return;
        }
        if (((LinkedHashMap) this.f33837c).containsKey(pf.c.CLEAR_ALL.a())) {
            mf.a aVar2 = mf.a.f29926b;
            aVar2.getClass();
            aVar2.e(kf.a.WARN, "This Identify already contains a $clearAll operation, ignoring operation %s");
            return;
        }
        if (!((LinkedHashSet) this.f33836b).contains(str)) {
            if (!((LinkedHashMap) this.f33837c).containsKey(cVar.a())) {
                ((LinkedHashMap) this.f33837c).put(cVar.a(), new LinkedHashMap());
            }
            Object obj2 = ((LinkedHashMap) this.f33837c).get(cVar.a());
            obj2.getClass();
            TypeIntrinsics.asMutableMap(obj2).put(str, obj);
            ((LinkedHashSet) this.f33836b).add(str);
            return;
        }
        mf.a aVar3 = mf.a.f29926b;
        String str3 = "Already used property " + str + " in previous operation, ignoring operation " + cVar.a();
        aVar3.getClass();
        aVar3.e(kf.a.WARN, str3);
    }

    public /* synthetic */ m(int i11, boolean z11) {
        this.f33835a = i11;
    }

    public /* synthetic */ m(Object obj, int i11) {
        this.f33835a = i11;
        this.f33837c = obj;
    }

    public /* synthetic */ m(Object obj, Object obj2, boolean z11, int i11) {
        this.f33835a = i11;
        this.f33836b = obj2;
        this.f33837c = obj;
    }

    public m(IBinder iBinder) throws RemoteException {
        this.f33835a = 0;
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.f33836b = new Messenger(iBinder);
            this.f33837c = null;
        } else if (Objects.equals(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
            this.f33837c = new g(iBinder);
            this.f33836b = null;
        } else {
            Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
            throw new RemoteException();
        }
    }

    public m(AppMeasurementSdk appMeasurementSdk, ub.a aVar) {
        this.f33835a = 18;
        this.f33837c = aVar;
        appMeasurementSdk.a(new s30.b(this, 0));
        this.f33836b = new HashSet();
    }

    public m(m mVar, d10.g gVar) {
        this.f33835a = 11;
        this.f33836b = gVar;
        Objects.requireNonNull(mVar);
        this.f33837c = mVar;
    }

    public m(u00.g gVar) {
        this.f33835a = 22;
        new HashMap();
        new HashMap();
        i0.h(gVar);
        this.f33836b = gVar;
    }

    public /* synthetic */ m(int i11, Object obj, Object obj2) {
        this.f33835a = i11;
        this.f33836b = obj;
        this.f33837c = obj2;
    }

    public m(Fragment fragment) {
        this.f33835a = 25;
        fragment.getClass();
        this.f33836b = fragment;
    }

    public m(r50.a aVar) {
        this.f33835a = 16;
        this.f33836b = aVar;
        ArrayList arrayList = new ArrayList();
        this.f33837c = arrayList;
        arrayList.add(new r50.b(aVar, new int[]{1}));
    }

    public m(android.app.Fragment fragment) {
        this.f33835a = 25;
        fragment.getClass();
        this.f33837c = fragment;
    }

    public m(t tVar) {
        Object jVar;
        this.f33835a = 24;
        this.f33836b = tVar;
        if (ae.f.f1252a) {
            jVar = new a1.b(false, 1);
        } else {
            int i11 = Build.VERSION.SDK_INT;
            if (i11 != 26 && i11 != 27) {
                jVar = new a1.b(true, 1);
            } else {
                jVar = new ae.j();
            }
        }
        this.f33837c = jVar;
    }

    public m(i3 i3Var) {
        this.f33835a = 14;
        this.f33836b = i3Var;
    }

    public m(ta.e eVar) {
        this.f33835a = 23;
        this.f33837c = eVar;
        this.f33836b = new Rect();
    }
}
