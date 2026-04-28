package a40;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCaptureSession;
import android.os.Bundle;
import android.util.Log;
import android.util.Pair;
import android.util.Size;
import android.view.Surface;
import android.view.ViewGroup;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.core.util.Consumer;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.GetCredentialUnknownException;
import androidx.credentials.exceptions.GetCredentialUnsupportedException;
import androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController;
import androidx.credentials.playservices.controllers.identityauth.createpassword.CredentialProviderCreatePasswordController;
import androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController;
import androidx.credentials.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController;
import androidx.credentials.playservices.controllers.identitycredentials.createdigitalcredential.CreateDigitalCredentialController;
import androidx.credentials.playservices.controllers.identitycredentials.createpasswordcredential.CreatePasswordCredentialController;
import androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController;
import ax.j0;
import ax.k0;
import b0.k3;
import com.adyen.checkout.components.core.internal.util.StatusResponseUtils;
import com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper;
import e0.h1;
import e0.i1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Ref;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f737c;

    public /* synthetic */ l(u uVar, Throwable th2) {
        this.f735a = 2;
        Map map = Collections.EMPTY_MAP;
        this.f737c = uVar;
        this.f736b = th2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        boolean zEquals = false;
        Object[] objArr = 0;
        int i11 = 1;
        switch (this.f735a) {
            case 0:
                ((o) this.f737c).c((String) this.f736b, Boolean.FALSE);
                return;
            case 1:
                u uVar = (u) this.f737c;
                String str = (String) this.f736b;
                g40.b bVar = uVar.f783g.f750d;
                bVar.getClass();
                String strA = c40.e.a(1024, str);
                synchronized (((AtomicMarkableReference) bVar.f20006g)) {
                    try {
                        String str2 = (String) ((AtomicMarkableReference) bVar.f20006g).getReference();
                        if (strA != null) {
                            zEquals = strA.equals(str2);
                        } else if (str2 == null) {
                            zEquals = true;
                        }
                        if (zEquals) {
                            return;
                        }
                        ((AtomicMarkableReference) bVar.f20006g).set(strA, true);
                        ((b40.f) bVar.f20002c).f5743b.a(new al.u(bVar, 17));
                        return;
                    } finally {
                    }
                }
            case 2:
                u uVar2 = (u) this.f737c;
                Throwable th2 = (Throwable) this.f736b;
                Map map = Collections.EMPTY_MAP;
                o oVar = uVar2.f783g;
                Thread threadCurrentThread = Thread.currentThread();
                oVar.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                w wVar = oVar.f759n;
                if (wVar == null || !wVar.f802e.get()) {
                    long j9 = jCurrentTimeMillis / 1000;
                    String strE = oVar.e();
                    if (strE == null) {
                        Log.w("FirebaseCrashlytics", "Tried to write a non-fatal exception while no session was open.", null);
                        return;
                    }
                    c40.c cVar = new c40.c(strE, j9, map);
                    g40.b bVar2 = oVar.f758m;
                    bVar2.getClass();
                    String strConcat = "Persisting non-fatal event for session ".concat(strE);
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", strConcat, null);
                    }
                    bVar2.j(th2, threadCurrentThread, StatusResponseUtils.RESULT_ERROR, cVar, false);
                    return;
                }
                return;
            case 3:
                ComponentActivity componentActivity = (ComponentActivity) this.f737c;
                OnBackPressedDispatcher onBackPressedDispatcher = (OnBackPressedDispatcher) this.f736b;
                int i12 = ComponentActivity.f1695a;
                componentActivity.getLifecycle().a(new androidx.activity.e(objArr == true ? 1 : 0, onBackPressedDispatcher, componentActivity));
                return;
            case 4:
                CredentialProviderBeginSignInController.handleResponse$lambda$13$lambda$12((CredentialProviderBeginSignInController) this.f737c, (Ref.ObjectRef) this.f736b);
                return;
            case 5:
                CredentialProviderBeginSignInController.handleResponse$lambda$17$lambda$16((CredentialProviderBeginSignInController) this.f737c, (GetCredentialUnknownException) this.f736b);
                return;
            case 6:
                CredentialProviderBeginSignInController.handleResponse$lambda$11$lambda$10((CredentialProviderBeginSignInController) this.f737c, (n7.t) this.f736b);
                return;
            case 7:
                CredentialProviderCreatePasswordController.handleResponse$lambda$11$lambda$10((CredentialProviderCreatePasswordController) this.f737c, (n7.c) this.f736b);
                return;
            case 8:
                CredentialProviderCreatePublicKeyCredentialController.handleResponse$lambda$18$lambda$17((CredentialProviderCreatePublicKeyCredentialController) this.f737c, (n7.c) this.f736b);
                return;
            case 9:
                CredentialProviderGetSignInIntentController.handleResponse$lambda$13$lambda$12((CredentialProviderGetSignInIntentController) this.f737c, (n7.t) this.f736b);
                return;
            case 10:
                CredentialProviderGetSignInIntentController.handleResponse$lambda$15$lambda$14((CredentialProviderGetSignInIntentController) this.f737c, (Ref.ObjectRef) this.f736b);
                return;
            case 11:
                CredentialProviderGetSignInIntentController.handleResponse$lambda$19$lambda$18((CredentialProviderGetSignInIntentController) this.f737c, (GetCredentialUnknownException) this.f736b);
                return;
            case 12:
                CredentialProviderGetSignInIntentController.invokePlayServices$lambda$1$lambda$0((CredentialProviderGetSignInIntentController) this.f737c, (GetCredentialUnsupportedException) this.f736b);
                return;
            case 13:
                CreateDigitalCredentialController.handleResponse$lambda$8$lambda$7((CreateDigitalCredentialController) this.f737c, (n7.c) this.f736b);
                return;
            case 14:
                CreatePasswordCredentialController.handleResponse$lambda$11$lambda$10((CreatePasswordCredentialController) this.f737c, (n7.c) this.f736b);
                return;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                ((n7.l) this.f737c).a((CreateCredentialException) this.f736b);
                return;
            case 16:
                CreatePublicKeyCredentialController.handleResponse$lambda$19$lambda$18((CreatePublicKeyCredentialController) this.f737c, (n7.c) this.f736b);
                return;
            case 17:
                ArrayList<Pair> arrayList = (ArrayList) this.f737c;
                j0 j0Var = (j0) this.f736b;
                j0Var.getClass();
                for (Pair pair : arrayList) {
                    ax.c0 c0Var = (ax.c0) pair.first;
                    Object obj = pair.second;
                    obj.getClass();
                    c0Var.a((k0) obj);
                }
                Iterator it = j0Var.f4939d.iterator();
                while (it.hasNext()) {
                    ((ax.g) it.next()).f4908a.run();
                }
                return;
            case 18:
                ((w.q) this.f737c).f42750a.onCaptureSequenceAborted((CameraCaptureSession) this.f736b, -1);
                return;
            case 19:
                ((h1) this.f737c).t((i1) this.f736b);
                return;
            case 20:
                Surface surface = (Surface) this.f737c;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.f736b;
                surface.release();
                surfaceTexture.release();
                return;
            case 21:
                k3 k3Var = (k3) this.f737c;
                Runnable runnable = (Runnable) this.f736b;
                ThreadLocal threadLocal = k3Var.f5268d;
                threadLocal.set(Boolean.TRUE);
                try {
                    runnable.run();
                    return;
                } finally {
                    threadLocal.remove();
                }
            case 22:
                bx.b bVar3 = (bx.b) this.f737c;
                bx.g gVar = (bx.g) this.f736b;
                if (yx.a.f46339a.contains(bx.j.class)) {
                    return;
                }
                try {
                    bVar3.getClass();
                    se.b bVar4 = bx.j.f6723a;
                    synchronized (bVar4) {
                        bx.x xVarO = bVar4.o(bVar3);
                        if (xVarO != null) {
                            xVarO.a(gVar);
                        }
                        break;
                    }
                    String str3 = bx.m.f6734c;
                    if (r40.d.q() != bx.l.EXPLICIT_ONLY && bx.j.f6723a.i() > 100) {
                        bx.j.d(bx.p.EVENT_THRESHOLD);
                        return;
                    } else {
                        if (bx.j.f6725c == null) {
                            bx.j.f6725c = bx.j.f6724b.schedule(bx.j.f6726d, 15L, TimeUnit.SECONDS);
                            return;
                        }
                        return;
                    }
                } catch (Throwable th3) {
                    yx.a.a(bx.j.class, th3);
                    return;
                }
            case 23:
                bx.b bVar5 = (bx.b) this.f737c;
                bx.x xVar = (bx.x) this.f736b;
                if (yx.a.f46339a.contains(bx.j.class)) {
                    return;
                }
                try {
                    bx.k.z(bVar5, xVar);
                    return;
                } catch (Throwable th4) {
                    yx.a.a(bx.j.class, th4);
                    return;
                }
            case 24:
                Context context = (Context) this.f737c;
                bx.m mVar = (bx.m) this.f736b;
                Bundle bundle = new Bundle();
                String[] strArr = {"com.facebook.core.Core", "com.facebook.login.Login", "com.facebook.share.Share", "com.facebook.places.Places", "com.facebook.messenger.Messenger", "com.facebook.applinks.AppLinks", "com.facebook.marketing.Marketing", "com.facebook.gamingservices.GamingServices", "com.facebook.all.All", "com.android.billingclient.api.BillingClient", "com.android.vending.billing.IInAppBillingService"};
                String[] strArr2 = {"core_lib_included", "login_lib_included", "share_lib_included", "places_lib_included", "messenger_lib_included", "applinks_lib_included", "marketing_lib_included", "gamingservices_lib_included", "all_lib_included", "billing_client_lib_included", "billing_service_lib_included"};
                int i13 = 0;
                for (int i14 = 0; i14 < 11; i14++) {
                    String str4 = strArr[i14];
                    String str5 = strArr2[i14];
                    try {
                        Class.forName(str4);
                        bundle.putInt(str5, 1);
                        i13 |= 1 << i14;
                    } catch (ClassNotFoundException unused) {
                    }
                }
                SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
                if (sharedPreferences.getInt("kitsBitmask", 0) != i13) {
                    sharedPreferences.edit().putInt("kitsBitmask", i13).apply();
                    mVar.g(bundle, "fb_sdk_initialize");
                    return;
                }
                return;
            case 25:
                c1.e eVar = (c1.e) this.f737c;
                c1.o oVar2 = (c1.o) this.f736b;
                Surface surfaceE = oVar2.e(eVar.f6854c, new bs.c(i11, eVar, oVar2));
                eVar.f6852a.o(surfaceE);
                eVar.f6859h.put(oVar2, surfaceE);
                return;
            case 26:
                ((c1.e) this.f737c).f6862k.add((c1.a) this.f736b);
                return;
            case 27:
                final c1.e eVar2 = (c1.e) this.f737c;
                final m0.h1 h1Var = (m0.h1) this.f736b;
                eVar2.f6860i++;
                c1.g gVar2 = eVar2.f6852a;
                e1.j.d((AtomicBoolean) gVar2.f6867c, true);
                e1.j.c((Thread) gVar2.f6869e);
                final SurfaceTexture surfaceTexture2 = new SurfaceTexture(gVar2.f6865a);
                Size size = h1Var.f28515b;
                surfaceTexture2.setDefaultBufferSize(size.getWidth(), size.getHeight());
                final Surface surface2 = new Surface(surfaceTexture2);
                w0.c cVar2 = eVar2.f6854c;
                h1Var.b(cVar2, new a50.d(4, eVar2, h1Var));
                h1Var.a(surface2, cVar2, new Consumer() { // from class: c1.d
                    @Override // androidx.core.util.Consumer
                    public final void accept(Object obj2) {
                        e eVar3 = eVar2;
                        m0.h1 h1Var2 = h1Var;
                        SurfaceTexture surfaceTexture3 = surfaceTexture2;
                        Surface surface3 = surface2;
                        synchronized (h1Var2.f28514a) {
                            h1Var2.f28525m = null;
                            h1Var2.f28526n = null;
                        }
                        surfaceTexture3.setOnFrameAvailableListener(null);
                        surfaceTexture3.release();
                        surface3.release();
                        eVar3.f6860i--;
                        eVar3.d();
                    }
                });
                surfaceTexture2.setOnFrameAvailableListener(eVar2, eVar2.f6855d);
                return;
            case 28:
                ((Consumer) ((AtomicReference) this.f736b).get()).accept(new m0.h((c1.o) this.f737c));
                return;
            default:
                DefaultInAppMessageViewWrapper.ViewOnLayoutChangeListenerC01502.onLayoutChange$lambda$1((DefaultInAppMessageViewWrapper) this.f737c, (ViewGroup) this.f736b);
                return;
        }
    }

    public /* synthetic */ l(int i11, Object obj, Object obj2) {
        this.f735a = i11;
        this.f737c = obj;
        this.f736b = obj2;
    }
}
