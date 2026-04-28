package e;

import a3.y0;
import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputContentInfo;
import android.webkit.ValueCallback;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.activity.result.ActivityResultCallback;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.n1;
import ao.g3;
import c1.q;
import com.app.tgtg.customview.manufactureaddressfragment.XmlCheckoutAddressFragment;
import com.app.tgtg.feature.login.email.EmailAccessActivity;
import com.app.tgtg.feature.login.email.EmailCodeAccessActivity;
import com.app.tgtg.feature.login.optin.OptInActivity;
import com.app.tgtg.feature.main.MainActivity;
import com.app.tgtg.feature.main.fragments.delivery.parcelitemdetails.ManufacturerItemDetailsActivity;
import com.app.tgtg.feature.tabprofile.manageaccount.SettingsActivity;
import com.app.tgtg.feature.tabprofile.manageaccount.notificationsettings.ui.NotificationSettingsActivity;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.messaging.r;
import f6.t;
import g3.q9;
import h7.w;
import j4.s;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m0.g1;
import m0.p0;
import m0.x0;
import m3.b1;
import mv.m0;
import org.bouncycastle.iana.AEADAlgorithm;
import pg.t2;
import s0.e1;
import s0.f1;
import s0.i0;
import v80.f0;
import y80.a2;
import zendesk.android.FailureCallback;
import zendesk.android.SuccessCallback;
import zendesk.android.ZendeskAuthenticationDelegate;
import zendesk.messaging.android.internal.permissions.RuntimePermissionLauncher;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements ActivityResultCallback, w, of.m, d10.e, SuccessCallback, FailureCallback, ZendeskAuthenticationDelegate, x0.a, s.a, j7.c, g1, e6.j, e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15275b;

    public /* synthetic */ b(Object obj, int i11) {
        this.f15274a = i11;
        this.f15275b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.activity.result.ActivityResultCallback
    public void a(Object obj) {
        eo.a aVar;
        String dataString;
        Uri uri;
        int i11 = this.f15274a;
        int i12 = 0;
        Uri[] uriArr = null;
        uriArr = null;
        uriArr = null;
        Object obj2 = this.f15275b;
        switch (i11) {
            case 0:
                ((Function1) ((b1) obj2).getValue()).invoke(obj);
                break;
            case 2:
                eo.d dVar = (eo.d) obj2;
                Boolean bool = (Boolean) obj;
                bool.getClass();
                if (bool.booleanValue() && (aVar = dVar.f16198b) != null) {
                    dVar.a(aVar);
                    dVar.f16198b = null;
                    break;
                }
                break;
            case 3:
                h.a aVar2 = (h.a) obj;
                aVar2.getClass();
                int i13 = aVar2.f20935a;
                ValueCallback valueCallback = ((eo.i) obj2).f16213b;
                if (i13 == -1) {
                    if (valueCallback != null) {
                        Intent intent = aVar2.f20936b;
                        if (intent != null && (dataString = intent.getDataString()) != null && (uri = Uri.parse(dataString)) != null) {
                            uriArr = new Uri[]{uri};
                        }
                        valueCallback.onReceiveValue(uriArr);
                    }
                } else if (valueCallback != null) {
                    valueCallback.onReceiveValue(null);
                }
                break;
            case 8:
                gl.l lVar = (gl.l) obj2;
                n1 n1Var = lVar.f20559k;
                Map map = (Map) obj;
                map.getClass();
                Object obj3 = map.get("android.permission.ACCESS_FINE_LOCATION");
                Boolean bool2 = Boolean.TRUE;
                Object[] objArr = Intrinsics.areEqual(obj3, bool2) || Intrinsics.areEqual(map.get("android.permission.ACCESS_COARSE_LOCATION"), bool2);
                vg.e eVar = lVar.l;
                int i14 = eVar == null ? -1 : gl.e.$EnumSwitchMapping$0[eVar.ordinal()];
                if (i14 != -1) {
                    if (i14 == 1) {
                        if (objArr == true) {
                            vg.e eVar2 = lVar.l;
                            if (eVar2 != null) {
                                m0 m0Var = sa0.a.f38953a;
                                m0Var.h("OnboardingSurvey");
                                m0Var.c("handleLocationRequest() - source: " + eVar2, new Object[0]);
                                int i15 = gl.e.$EnumSwitchMapping$0[eVar2.ordinal()];
                                if (i15 == 1) {
                                    tg.i iVar = (tg.i) n1Var.getValue();
                                    iVar.f40164c.e(true, new q(iVar, 7));
                                    ((tg.i) n1Var.getValue()).g(sm.b.CLICKED);
                                } else if (i15 != 2) {
                                    e40.a.f();
                                }
                            }
                            lVar.l = null;
                            break;
                        } else {
                            ((tg.i) n1Var.getValue()).getClass();
                            if (ft.c.m()) {
                                lVar.f20554f.setValue(bool2);
                                t2 t2Var = lVar.f20556h;
                                t2Var.getClass();
                                ((ComposeView) t2Var.f35174k).setContent(new u3.d(new gl.d(lVar, i12), true, -1283612075));
                            } else {
                                ((tg.i) n1Var.getValue()).getClass();
                                ft.c.Q();
                            }
                        }
                        break;
                    } else if (i14 != 2) {
                        e40.a.f();
                        break;
                    }
                }
                break;
            case 13:
                go.w wVar = (go.w) obj2;
                Map map2 = (Map) obj;
                map2.getClass();
                for (Map.Entry entry : map2.entrySet()) {
                    String str = (String) entry.getKey();
                    boolean zBooleanValue = ((Boolean) entry.getValue()).booleanValue();
                    if (Intrinsics.areEqual(str, "android.permission.POST_NOTIFICATIONS")) {
                        if (!zBooleanValue && !androidx.core.app.e.l(wVar, str)) {
                            ft.c.Y();
                        }
                    } else if (Intrinsics.areEqual(str, "android.permission.WRITE_CALENDAR") && !zBooleanValue && !androidx.core.app.e.l(wVar, str)) {
                        ft.c.K();
                    }
                }
                break;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                NotificationSettingsActivity notificationSettingsActivity = (NotificationSettingsActivity) obj2;
                Map map3 = (Map) obj;
                int i16 = NotificationSettingsActivity.f9422k;
                map3.getClass();
                for (Map.Entry entry2 : map3.entrySet()) {
                    String str2 = (String) entry2.getKey();
                    boolean zBooleanValue2 = ((Boolean) entry2.getValue()).booleanValue();
                    if (Intrinsics.areEqual(str2, "android.permission.POST_NOTIFICATIONS") && !zBooleanValue2 && !androidx.core.app.e.l(notificationSettingsActivity, "android.permission.POST_NOTIFICATIONS")) {
                        ft.c.Y();
                    } else if (Intrinsics.areEqual(str2, "android.permission.WRITE_CALENDAR") && !zBooleanValue2 && !androidx.core.app.e.l(notificationSettingsActivity, "android.permission.WRITE_CALENDAR")) {
                        ft.c.K();
                    }
                }
                notificationSettingsActivity.f9426i.setValue(Boolean.valueOf(mv.d.o(notificationSettingsActivity)));
                notificationSettingsActivity.a0().b(notificationSettingsActivity.b0());
                break;
            case 23:
                RuntimePermissionLauncher.setupSinglePermissionLauncher$lambda$0((RuntimePermissionLauncher) obj2, ((Boolean) obj).booleanValue());
                break;
            default:
                OptInActivity optInActivity = (OptInActivity) obj2;
                Boolean bool3 = (Boolean) obj;
                boolean zBooleanValue3 = bool3.booleanValue();
                int i17 = OptInActivity.f9058k;
                if (!zBooleanValue3 && !androidx.core.app.e.l(optInActivity, "android.permission.POST_NOTIFICATIONS")) {
                    ft.c.Y();
                }
                ll.g gVarA0 = optInActivity.a0();
                g3 g3Var = gVarA0.f27892a;
                cv.b bVar = gVarA0.f27893b;
                g3Var.m().setWantsPushNotifications(zBooleanValue3);
                bVar.f13429b.f(zBooleanValue3);
                dv.a aVar3 = dv.a.SCREEN;
                dv.d dVar2 = dv.d.ONBOARDING_NATIVE_PROMPT;
                dv.b bVarE = h0.g.E(new Pair(aVar3, new dv.c(dVar2 != null ? dVar2.a() : null)), new Pair(dv.a.PUSH_OPTIN_STATUS, new dv.c(bool3)));
                cv.i iVar2 = cv.i.CORE_NOTIFICATIONS_SAVED;
                iVar2.getClass();
                bVar.c(iVar2, bVarE);
                break;
        }
    }

    @Override // x0.a
    public ListenableFuture apply(Object obj) {
        return (ListenableFuture) ((q9) this.f15275b).invoke(obj);
    }

    @Override // j7.c
    public boolean b(se.b bVar, int i11, Bundle bundle) {
        h7.d cVar;
        p.o oVar = (p.o) this.f15275b;
        if ((i11 & 1) != 0) {
            try {
                ((InputContentInfo) ((lz.i) bVar.f39010b).f28446b).requestPermission();
                InputContentInfo inputContentInfo = (InputContentInfo) ((lz.i) bVar.f39010b).f28446b;
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo);
            } catch (Exception e5) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e5);
                return false;
            }
        }
        lz.i iVar = (lz.i) bVar.f39010b;
        lz.i iVar2 = (lz.i) bVar.f39010b;
        ClipData clipData = new ClipData(((InputContentInfo) iVar.f28446b).getDescription(), new ClipData.Item(((InputContentInfo) iVar2.f28446b).getContentUri()));
        if (Build.VERSION.SDK_INT >= 31) {
            cVar = new h7.c(clipData, 2);
        } else {
            h7.e eVar = new h7.e();
            eVar.f21528b = clipData;
            eVar.f21529c = 2;
            cVar = eVar;
        }
        cVar.b(((InputContentInfo) iVar2.f28446b).getLinkUri());
        cVar.setExtras(bundle);
        return ViewCompat.S(oVar, cVar.build()) == null;
    }

    @Override // m0.g1
    public void c(m0.j jVar) {
        ((a2) this.f15275b).j(jVar);
    }

    @Override // s0.e1
    public void d(f1 f1Var) {
        p0 p0Var = (p0) this.f15275b;
        synchronized (p0Var.f28574a) {
            p0Var.f28576c++;
        }
        p0Var.h(f1Var);
    }

    public float e(float f11) {
        return ((t) this.f15275b).f17439k.a() * f11;
    }

    @Override // of.m
    public of.l get() {
        switch (this.f15274a) {
        }
        return ((hf.c) this.f15275b).f22012b.c();
    }

    @Override // e6.j
    public Object o(e6.i iVar) {
        ListenableFuture listenableFutureA;
        m0.w wVar = (m0.w) this.f15275b;
        wVar.f28628n.f();
        if (wVar.f28629o.a()) {
            x0 x0Var = (x0) wVar.f28629o.getValue();
            synchronized (x0Var.f28634a) {
                x0Var.f28635b.disable();
                x0Var.f28636c.clear();
                x0Var.f28637d = -1;
            }
        }
        s0.p0 p0Var = wVar.f28616a;
        synchronized (p0Var.f38424a) {
            try {
                boolean zIsEmpty = p0Var.f38425b.isEmpty();
                listenableFutureA = p0Var.f38427d;
                if (!zIsEmpty) {
                    if (listenableFutureA == null) {
                        listenableFutureA = ox.h.A(new mp.a(p0Var, 11));
                        p0Var.f38427d = listenableFutureA;
                    }
                    p0Var.f38426c.addAll(p0Var.f38425b.values());
                    for (i0 i0Var : p0Var.f38425b.values()) {
                        i0Var.a().a(new mr.h(19, p0Var, i0Var), w.b.F());
                    }
                    p0Var.f38425b.clear();
                } else if (listenableFutureA == null) {
                    listenableFutureA = x0.i.f43629c;
                }
            } finally {
            }
        }
        listenableFutureA.a(new r(27, wVar, iVar), wVar.f28619d);
        return "CameraX shutdownInternal";
    }

    @Override // h7.w
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        int i11 = this.f15274a;
        pg.a2 a2Var = null;
        pg.r rVar = null;
        pg.d dVar = null;
        Object obj = this.f15275b;
        switch (i11) {
            case 1:
                int i12 = ManufacturerItemDetailsActivity.f9137q;
                x6.d dVarX = s.x(view, windowInsetsCompat);
                pg.a2 a2Var2 = ((ManufacturerItemDetailsActivity) obj).f9143m;
                if (a2Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    a2Var = a2Var2;
                }
                a2Var.f34777z.setPadding(0, dVarX.f43874b, 0, 0);
                a2Var.B.setPadding(0, dVarX.f43874b, 0, 0);
                a2Var.D.setPadding(0, dVarX.f43874b, 0, 0);
                view.setPadding(0, 0, 0, dVarX.f43876d);
                break;
            case 5:
                EmailAccessActivity emailAccessActivity = (EmailAccessActivity) obj;
                int i13 = EmailAccessActivity.f9043j;
                x6.d dVarX2 = s.x(view, windowInsetsCompat);
                pg.x0 x0Var = emailAccessActivity.f9045g;
                x0Var.getClass();
                ((ConstraintLayout) x0Var.f35262c).setPadding(0, dVarX2.f43874b, 0, 0);
                pg.x0 x0Var2 = emailAccessActivity.f9045g;
                x0Var2.getClass();
                ScrollView scrollView = (ScrollView) x0Var2.f35267h;
                pg.x0 x0Var3 = emailAccessActivity.f9045g;
                x0Var3.getClass();
                int paddingLeft = ((ScrollView) x0Var3.f35267h).getPaddingLeft();
                pg.x0 x0Var4 = emailAccessActivity.f9045g;
                x0Var4.getClass();
                scrollView.setPadding(paddingLeft, 0, ((ScrollView) x0Var4.f35267h).getPaddingRight(), dVarX2.f43876d);
                break;
            case 6:
                EmailCodeAccessActivity emailCodeAccessActivity = (EmailCodeAccessActivity) obj;
                int i14 = EmailCodeAccessActivity.f9048k;
                x6.d dVarX3 = s.x(view, windowInsetsCompat);
                pg.b bVar = emailCodeAccessActivity.f9050g;
                bVar.getClass();
                ((ConstraintLayout) bVar.f34789j).setPadding(0, dVarX3.f43874b, 0, 0);
                pg.b bVar2 = emailCodeAccessActivity.f9050g;
                bVar2.getClass();
                ((ScrollView) bVar2.f34787h).setPadding(0, 0, 0, dVarX3.f43876d);
                break;
            case 14:
                SettingsActivity settingsActivity = (SettingsActivity) obj;
                int i15 = SettingsActivity.l;
                x6.d dVarX4 = s.x(view, windowInsetsCompat);
                pg.d dVar2 = settingsActivity.f9353g;
                if (dVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    dVar2 = null;
                }
                ((LinearLayout) dVar2.f34831y.f34797e).setPadding(0, dVarX4.f43874b, 0, 0);
                pg.d dVar3 = settingsActivity.f9353g;
                if (dVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    dVar = dVar3;
                }
                dVar.f34832z.setPadding(0, 0, 0, dVarX4.f43876d);
                break;
            case 24:
                x6.d dVarX5 = s.x(view, windowInsetsCompat);
                pg.r rVar2 = ((XmlCheckoutAddressFragment) obj).f8936k;
                if (rVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    rVar = rVar2;
                }
                ConstraintLayout constraintLayout = rVar.K;
                constraintLayout.setPadding(constraintLayout.getPaddingLeft(), dVarX5.f43874b, rVar.K.getPaddingRight(), dVarX5.f43876d);
                break;
            default:
                x6.d dVarX6 = s.x(view, windowInsetsCompat);
                mn.l lVarQ = ((mn.c) obj).q();
                int i16 = dVarX6.f43874b;
                int i17 = dVarX6.f43876d;
                a2 a2Var3 = lVarQ.l;
                Integer numValueOf = Integer.valueOf(i16);
                a2Var3.getClass();
                a2Var3.k(null, numValueOf);
                a2 a2Var4 = lVarQ.f30031n;
                Integer numValueOf2 = Integer.valueOf(i17);
                a2Var4.getClass();
                a2Var4.k(null, numValueOf2);
                break;
        }
        return windowInsetsCompat;
    }

    @Override // zendesk.android.FailureCallback
    public void onFailure(Throwable th2) {
        q9 q9Var = (q9) this.f15275b;
        th2.getClass();
        sa0.a.f38953a.c("Failed logging out user -> " + th2, new Object[0]);
        q9Var.invoke(th2);
    }

    @Override // zendesk.android.ZendeskAuthenticationDelegate
    public void onInvalidAuth(Throwable th2, Function1 function1) {
        hv.j jVar = (hv.j) this.f15275b;
        function1.getClass();
        f0.B(jVar.f22532d, null, null, new gf.g(jVar, function1, null, 10), 3);
    }

    @Override // d10.e
    public void onSuccess(Object obj) throws Exception {
        int i11 = this.f15274a;
        Object obj2 = this.f15275b;
        switch (i11) {
            case 11:
                boolean z11 = MainActivity.f9078v;
                ((hm.g) obj2).invoke(obj);
                break;
            case 12:
                boolean z12 = MainActivity.f9078v;
                ((hm.g) obj2).invoke(obj);
                break;
            default:
                ((Unit) obj).getClass();
                ((hi.d) obj2).invoke();
                break;
        }
    }

    @Override // s.a
    /* JADX INFO: renamed from: apply, reason: collision with other method in class */
    public Object mo962apply(Object obj) {
        return (Void) ((y0) this.f15275b).invoke(obj);
    }
}
