package al;

import android.app.Activity;
import android.app.Application;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Trace;
import android.util.Log;
import android.webkit.WebView;
import androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController;
import androidx.credentials.playservices.controllers.identityauth.createpassword.CredentialProviderCreatePasswordController;
import androidx.credentials.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController;
import androidx.credentials.playservices.controllers.identitycredentials.createdigitalcredential.CreateDigitalCredentialController;
import androidx.lifecycle.f0;
import androidx.lifecycle.n1;
import androidx.lifecycle.t0;
import com.adyen.checkout.qrcode.internal.ui.view.SimpleQRCodeView;
import com.adyen.checkout.voucher.internal.ui.view.FullVoucherView;
import com.appsflyer.AFLogger;
import com.google.android.material.button.MaterialButton;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function1;
import o30.m0;
import org.bouncycastle.iana.AEADAlgorithm;
import tx.n0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class u implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1594b;

    public /* synthetic */ u(Object obj, int i11) {
        this.f1593a = i11;
        this.f1594b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Map mapUnmodifiableMap;
        int i11 = 28;
        String str = null;
        Map map = null;
        Application application = null;
        boolean z11 = false;
        ?? r52 = 1;
        r52 = 1;
        switch (this.f1593a) {
            case 0:
                ((c0) this.f1594b).a(false);
                return;
            case 1:
                androidx.activity.k kVar = (androidx.activity.k) this.f1594b;
                Runnable runnable = kVar.f1734b;
                if (runnable != null) {
                    runnable.run();
                    kVar.f1734b = null;
                    return;
                }
                return;
            case 2:
                androidx.activity.o.a((androidx.activity.o) this.f1594b);
                return;
            case 3:
                Activity activity = (Activity) this.f1594b;
                if (activity.isFinishing()) {
                    return;
                }
                Handler handler = androidx.core.app.d.f2589g;
                Method method = androidx.core.app.d.f2588f;
                int i12 = Build.VERSION.SDK_INT;
                if (i12 >= 28) {
                    activity.recreate();
                    return;
                }
                if (((i12 != 26 && i12 != 27) || method != null) && (androidx.core.app.d.f2587e != null || androidx.core.app.d.f2586d != null)) {
                    try {
                        Object obj2 = androidx.core.app.d.f2585c.get(activity);
                        if (obj2 != null && (obj = androidx.core.app.d.f2584b.get(activity)) != null) {
                            Application application2 = activity.getApplication();
                            androidx.core.app.c cVar = new androidx.core.app.c(activity);
                            application2.registerActivityLifecycleCallbacks(cVar);
                            handler.post(new x0.f(1 == true ? 1 : 0, cVar, obj2));
                            if (i12 != 26 && i12 != 27) {
                                r52 = 0;
                            }
                            int i13 = 2;
                            try {
                                if (r52 != 0) {
                                    try {
                                        Boolean bool = Boolean.FALSE;
                                        application = application2;
                                        r52 = cVar;
                                        method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                                    } catch (Throwable th2) {
                                        th = th2;
                                        application = application2;
                                        ?? r53 = cVar;
                                        handler.post(new m0(i13, application, (Object) r53));
                                        throw th;
                                    }
                                } else {
                                    application = application2;
                                    r52 = cVar;
                                    activity.recreate();
                                }
                                handler.post(new m0(i13, application, (Object) r52));
                                return;
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
                activity.recreate();
                return;
            case 4:
                CredentialProviderBeginSignInController.invokePlayServices$lambda$2$lambda$1$lambda$0((CredentialProviderBeginSignInController) this.f1594b);
                return;
            case 5:
                CredentialProviderCreatePasswordController.invokePlayServices$lambda$2$lambda$1$lambda$0((CredentialProviderCreatePasswordController) this.f1594b);
                return;
            case 6:
                CredentialProviderGetSignInIntentController.invokePlayServices$lambda$4$lambda$3$lambda$2((CredentialProviderGetSignInIntentController) this.f1594b);
                return;
            case 7:
                CreateDigitalCredentialController.handleResponse$lambda$4$lambda$3((CreateDigitalCredentialController) this.f1594b);
                return;
            case 8:
                t0 t0Var = (t0) this.f1594b;
                f0 f0Var = t0Var.f3518f;
                if (t0Var.f3514b == 0) {
                    t0Var.f3515c = true;
                    f0Var.g(androidx.lifecycle.w.ON_PAUSE);
                }
                if (t0Var.f3513a == 0 && t0Var.f3515c) {
                    f0Var.g(androidx.lifecycle.w.ON_STOP);
                    t0Var.f3516d = true;
                    return;
                }
                return;
            case 9:
                ((ax.j) this.f1594b).a();
                return;
            case 10:
                ((ax.h) this.f1594b).a();
                return;
            case 11:
                bx.p pVar = (bx.p) this.f1594b;
                if (yx.a.f46339a.contains(bx.j.class)) {
                    return;
                }
                try {
                    pVar.getClass();
                    bx.j.d(pVar);
                    return;
                } catch (Throwable th4) {
                    yx.a.a(bx.j.class, th4);
                    return;
                }
            case 12:
                Bundle bundle = (Bundle) this.f1594b;
                bx.z zVar = bx.z.f6762a;
                if (yx.a.f46339a.contains(bx.z.class)) {
                    return;
                }
                try {
                    if (!bx.z.f6764c.get()) {
                        Log.w("z", "initStore should have been called before calling setUserData");
                        zVar.b();
                    }
                    zVar.f(bundle);
                    zVar.g("com.facebook.appevents.UserDataStore.userData", n0.B(bx.z.f6765d));
                    zVar.g("com.facebook.appevents.UserDataStore.internalUserData", n0.B(bx.z.f6766e));
                    return;
                } catch (Throwable th5) {
                    yx.a.a(bx.z.class, th5);
                    return;
                }
            case 13:
                ((e6.i) this.f1594b).d(new Exception("Failed to snapshot: OpenGLRenderer not ready."));
                return;
            case 14:
                ((c1.o) this.f1594b).close();
                return;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                c1.e eVar = (c1.e) this.f1594b;
                eVar.f6861j = true;
                eVar.d();
                return;
            case 16:
                c1.r rVar = (c1.r) ((a8.h) this.f1594b).f975d;
                if (rVar != null) {
                    Iterator it = rVar.values().iterator();
                    while (it.hasNext()) {
                        ((c1.n) it.next()).b();
                    }
                    return;
                }
                return;
            case 17:
                g40.b bVar = (g40.b) this.f1594b;
                synchronized (((AtomicMarkableReference) bVar.f20006g)) {
                    try {
                        if (((AtomicMarkableReference) bVar.f20006g).isMarked()) {
                            str = (String) ((AtomicMarkableReference) bVar.f20006g).getReference();
                            ((AtomicMarkableReference) bVar.f20006g).set(str, false);
                            z11 = true;
                        }
                    } finally {
                    }
                    break;
                }
                if (z11) {
                    ((c40.h) bVar.f20001b).i((String) bVar.f20000a, str);
                    return;
                }
                return;
            case 18:
                c40.q qVar = (c40.q) this.f1594b;
                ((AtomicReference) qVar.f7094d).set(null);
                synchronized (qVar) {
                    if (((AtomicMarkableReference) qVar.f7093c).isMarked()) {
                        c40.e eVar2 = (c40.e) ((AtomicMarkableReference) qVar.f7093c).getReference();
                        synchronized (eVar2) {
                            mapUnmodifiableMap = Collections.unmodifiableMap(new HashMap(eVar2.f7061a));
                        }
                        AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) qVar.f7093c;
                        atomicMarkableReference.set((c40.e) atomicMarkableReference.getReference(), false);
                        map = mapUnmodifiableMap;
                    }
                }
                if (map != null) {
                    g40.b bVar2 = (g40.b) qVar.f7095e;
                    ((c40.h) bVar2.f20001b).h((String) bVar2.f20000a, map, qVar.f7092b);
                    return;
                }
                return;
            case 19:
                c5.f0 f0Var2 = (c5.f0) this.f1594b;
                Trace.beginSection("measureAndLayout");
                try {
                    f0Var2.f7192a.u(true);
                    Trace.endSection();
                    Trace.beginSection("checkForSemanticsChanges");
                    try {
                        f0Var2.e();
                        Trace.endSection();
                        f0Var2.G = false;
                        return;
                    } finally {
                    }
                } finally {
                }
            case 20:
                SimpleQRCodeView.resetCopyButtonTextRunnable$lambda$0((SimpleQRCodeView) this.f1594b);
                return;
            case 21:
                FullVoucherView.resetCopyButtonTextRunnable$lambda$0((FullVoucherView) this.f1594b);
                return;
            case 22:
                AFLogger.getMediationNetwork((Function1) this.f1594b);
                return;
            case 23:
                ((WebView) this.f1594b).requestFocus();
                return;
            case 24:
                MaterialButton.a((MaterialButton) this.f1594b);
                return;
            case 25:
                n1 n1Var = (n1) this.f1594b;
                synchronized (((ArrayDeque) n1Var.f3502d)) {
                    SharedPreferences.Editor editorEdit = ((SharedPreferences) n1Var.f3499a).edit();
                    String str2 = (String) n1Var.f3500b;
                    StringBuilder sb2 = new StringBuilder();
                    Iterator it2 = ((ArrayDeque) n1Var.f3502d).iterator();
                    while (it2.hasNext()) {
                        sb2.append((String) it2.next());
                        sb2.append((String) n1Var.f3501c);
                    }
                    editorEdit.putString(str2, sb2.toString()).commit();
                    break;
                }
                return;
            case 26:
                com.google.firebase.messaging.n0 n0Var = (com.google.firebase.messaging.n0) this.f1594b;
                Log.w("FirebaseMessaging", "Service took too long to process intent: " + n0Var.f12852a.getAction() + " finishing.");
                n0Var.f12853b.d(null);
                return;
            case 27:
                ((cy.k) this.f1594b).u();
                return;
            case 28:
                com.google.firebase.messaging.a0 a0Var = (com.google.firebase.messaging.a0) this.f1594b;
                ((dz.g) a0Var.f12782e).t(new w.z(a0Var, i11));
                return;
            default:
                d1.d dVar = (d1.d) this.f1594b;
                dVar.f13682f = true;
                dVar.d();
                return;
        }
    }
}
