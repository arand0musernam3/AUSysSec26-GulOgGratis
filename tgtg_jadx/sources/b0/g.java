package b0;

import android.content.Context;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import com.appsflyer.internal.AFd1zSDK;
import com.appsflyer.internal.AFj1rSDK;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.logging.Logger;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5185c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f5186d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f5187e;

    public /* synthetic */ g(int i11, Object obj, Object obj2, Object obj3, Object obj4) {
        this.f5183a = i11;
        this.f5184b = obj;
        this.f5185c = obj2;
        this.f5186d = obj3;
        this.f5187e = obj4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.io.Closeable] */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        BufferedWriter bufferedWriter;
        Exception e5;
        String[] strArrF;
        int i11 = this.f5183a;
        ?? r12 = 0;
        int i12 = 1;
        Object obj = this.f5187e;
        Object obj2 = this.f5186d;
        Object obj3 = this.f5185c;
        Object obj4 = this.f5184b;
        switch (i11) {
            case 0:
                ((w.q) obj4).f42750a.onCaptureCompleted((CameraCaptureSession) obj3, (CaptureRequest) obj2, (TotalCaptureResult) obj);
                return;
            case 1:
                ((w.q) obj4).f42750a.onCaptureFailed((CameraCaptureSession) obj3, (CaptureRequest) obj2, (CaptureFailure) obj);
                return;
            case 2:
                bz.a aVar = (bz.a) obj4;
                wy.i iVar = (wy.i) obj3;
                String str = iVar.f43571a;
                ty.g gVar = (ty.g) obj2;
                wy.h hVar = (wy.h) obj;
                aVar.getClass();
                Logger logger = bz.a.f6767f;
                try {
                    xy.g gVarA = aVar.f6770c.a(str);
                    if (gVarA == null) {
                        String str2 = "Transport backend '" + str + "' is not registered";
                        logger.warning(str2);
                        gVar.a(new IllegalArgumentException(str2));
                    } else {
                        aVar.f6772e.t(new b40.a(aVar, iVar, ((uy.b) gVarA).a(hVar), i12));
                        gVar.a(null);
                    }
                    return;
                } catch (Exception e11) {
                    logger.warning("Error scheduling event " + e11.getMessage());
                    gVar.a(e11);
                    return;
                }
            case 3:
                g40.b bVar = (g40.b) obj4;
                String str3 = (String) obj3;
                Map map = (Map) obj2;
                ?? r42 = (List) obj;
                c40.h hVar2 = (c40.h) bVar.f20001b;
                AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) bVar.f20006g;
                if (((String) atomicMarkableReference.getReference()) != null) {
                    hVar2.i(str3, (String) atomicMarkableReference.getReference());
                }
                if (!map.isEmpty()) {
                    hVar2.h(str3, map, false);
                }
                if (r42.isEmpty()) {
                    return;
                }
                File fileH = hVar2.f7068a.h(str3, "rollouts-state");
                try {
                    if (r42.isEmpty()) {
                        c40.h.g(fileH, "Rollout state is empty for session: " + str3);
                        return;
                    }
                    try {
                        String strE = c40.h.e(r42);
                        bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileH), c40.h.f7067b));
                        try {
                            bufferedWriter.write(strE);
                            bufferedWriter.flush();
                            r42 = bufferedWriter;
                        } catch (Exception e12) {
                            e5 = e12;
                            Log.w("FirebaseCrashlytics", "Error serializing rollouts state.", e5);
                            c40.h.f(fileH);
                            r42 = bufferedWriter;
                        }
                        break;
                    } catch (Exception e13) {
                        bufferedWriter = null;
                        e5 = e13;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    a40.g.b(r42, "Failed to close rollouts state file.");
                    return;
                } catch (Throwable th3) {
                    th = th3;
                    r12 = r42;
                }
                a40.g.b(r12, "Failed to close rollouts state file.");
                throw th;
            case 4:
                ((AFj1rSDK) obj4).getMonetizationNetwork((Context) obj3, (Runnable) obj2, (AFd1zSDK) obj);
                return;
            case 5:
                List list = (List) obj4;
                qb.h hVar3 = (qb.h) obj3;
                ib.b bVar2 = (ib.b) obj2;
                WorkDatabase workDatabase = (WorkDatabase) obj;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((jb.h) it.next()).d(hVar3.f36799a);
                }
                jb.j.b(bVar2, workDatabase, list);
                return;
            case 6:
                lx.k kVar = (lx.k) obj4;
                Runnable runnable = (Runnable) obj3;
                lx.t tVar = (lx.t) obj2;
                ArrayList arrayList = (ArrayList) obj;
                if (yx.a.f46339a.contains(lx.k.class)) {
                    return;
                }
                try {
                    Class cls = kVar.f28367e;
                    tVar.getClass();
                    lx.u.I(kVar.f28364b, kVar.d(), kVar.f28371i, kVar.f28373k.a(tVar, arrayList), Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new ab.d(kVar, runnable, i12)));
                    return;
                } catch (Throwable th4) {
                    yx.a.a(lx.k.class, th4);
                    return;
                }
            case 7:
                lx.l lVar = (lx.l) obj4;
                Runnable runnable2 = (Runnable) obj3;
                lx.t tVar2 = (lx.t) obj2;
                ArrayList arrayList2 = (ArrayList) obj;
                if (yx.a.f46339a.contains(lx.l.class)) {
                    return;
                }
                try {
                    Class cls2 = lVar.f28386n;
                    Object objNewProxyInstance = Proxy.newProxyInstance(cls2.getClassLoader(), new Class[]{cls2}, new ab.d(lVar, new Object[]{runnable2}, 2));
                    Object objF = lVar.f(tVar2, arrayList2);
                    if (objF != null) {
                        lx.u.I(lVar.f28375b, lVar.d(), lVar.f28394v, objF, objNewProxyInstance);
                        return;
                    }
                    return;
                } catch (Throwable th5) {
                    yx.a.a(lx.l.class, th5);
                    return;
                }
            case 8:
                ((m0.j0) obj4).H((m0.b0) obj3, (Executor) obj2, (jb.b) obj);
                return;
            default:
                JSONObject jSONObject = (JSONObject) obj4;
                String str4 = (String) obj3;
                rx.f fVar = (rx.f) obj2;
                String str5 = (String) obj;
                if (yx.a.f46339a.contains(rx.f.class)) {
                    return;
                }
                try {
                    str4.getClass();
                    try {
                        String lowerCase = tx.n0.l(ax.a0.a()).toLowerCase();
                        lowerCase.getClass();
                        float[] fArrC = rx.a.c(lowerCase, jSONObject);
                        String strE2 = rx.a.e(str4, fVar.f38266d, lowerCase);
                        if (fArrC != null && (strArrF = ox.g.f(ox.d.MTML_APP_EVENT_PREDICTION, new float[][]{fArrC}, new String[]{strE2})) != null) {
                            String str6 = strArrF[0];
                            rx.b.a(str5, str6);
                            if (Intrinsics.areEqual(str6, "other")) {
                                return;
                            }
                            HashSet hashSet = rx.f.f38262e;
                            rx.a.j(str6, str4, fArrC);
                            return;
                        }
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                } catch (Throwable th6) {
                    yx.a.a(rx.f.class, th6);
                    return;
                }
        }
    }
}
