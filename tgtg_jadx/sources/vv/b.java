package vv;

import com.braze.ui.banners.listeners.DefaultBannerWebViewClientListener;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import m3.d3;
import org.bouncycastle.iana.AEADAlgorithm;
import r8.k;
import s0.c2;
import s0.d2;
import s0.e2;
import s0.g2;
import s0.i2;
import u70.t;
import w.f0;
import zendesk.android.internal.proactivemessaging.campaigntriggerservice.model.jwt.ProactiveMessageResponse;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42519a;

    public /* synthetic */ b(int i11) {
        this.f42519a = i11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f42519a) {
            case 0:
                return com.braze.events.a.f();
            case 1:
                return com.braze.events.a.g();
            case 2:
                return com.braze.events.a.h();
            case 3:
                return com.braze.events.a.i();
            case 4:
                return com.braze.events.a.j();
            case 5:
                return com.braze.events.a.k();
            case 6:
                return com.braze.events.a.l();
            case 7:
                return com.braze.events.a.S();
            case 8:
                return com.braze.events.a.T();
            case 9:
                return com.braze.events.a.e();
            case 10:
                return com.braze.events.a.J();
            case 11:
                return com.braze.events.a.K();
            case 12:
                return com.braze.events.a.P();
            case 13:
                return com.braze.events.a.Q();
            case 14:
                return com.braze.events.a.Y();
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return com.braze.events.a.Z();
            case 16:
                return com.braze.events.a.c();
            case 17:
                return com.braze.events.a.d();
            case 18:
                return com.braze.events.a.V();
            case 19:
                return com.braze.events.a.W();
            case 20:
                return com.braze.events.d.b();
            case 21:
                return DefaultBannerWebViewClientListener.onCloseAction$lambda$0();
            case 22:
                return DefaultBannerWebViewClientListener.onOtherUrlAction$lambda$2();
            case 23:
                return DefaultBannerWebViewClientListener.onCustomEventAction$lambda$1();
            case 24:
                t tVar = f0.f42677a;
                ArrayList arrayList = new ArrayList();
                d2 d2Var = new d2();
                c2 c2Var = i2.f38344e;
                g2 g2Var = g2.PRIV;
                e2 e2Var = e2.S1080P_16_9;
                c2 c2Var2 = i2.f38344e;
                d2Var.a(l50.a.n(g2Var, e2Var, c2Var2));
                arrayList.add(d2Var);
                d2 d2Var2 = new d2();
                e2 e2Var2 = e2.S720P_16_9;
                d2Var2.a(l50.a.n(g2Var, e2Var2, c2Var2));
                arrayList.add(d2Var2);
                e2 e2Var3 = e2.MAXIMUM_16_9;
                arrayList.addAll(f0.a(e2Var, e2Var3));
                e2 e2Var4 = e2.UHD;
                arrayList.addAll(f0.a(e2Var, e2Var4));
                arrayList.addAll(f0.a(e2Var, e2.S1440P_16_9));
                arrayList.addAll(f0.a(e2Var, e2Var));
                arrayList.addAll(f0.a(e2Var2, e2Var3));
                arrayList.addAll(f0.a(e2Var2, e2Var4));
                arrayList.addAll(f0.a(e2Var2, e2Var));
                e2 e2Var5 = e2.X_VGA;
                e2 e2Var6 = e2.MAXIMUM_4_3;
                arrayList.addAll(f0.a(e2Var5, e2Var6));
                arrayList.addAll(f0.a(e2.S1080P_4_3, e2Var6));
                return arrayList;
            case 25:
                ArrayList arrayList2 = new ArrayList();
                d2 d2Var3 = new d2();
                c2 c2Var3 = i2.f38344e;
                g2 g2Var2 = g2.PRIV;
                e2 e2Var7 = e2.S1080P_16_9;
                c2 c2Var4 = i2.f38344e;
                k.B(d2Var3, l50.a.n(g2Var2, e2Var7, c2Var4), g2Var2, e2Var7, c2Var4);
                d2 d2VarS = k.s(arrayList2, d2Var3);
                d2VarS.a(l50.a.n(g2Var2, e2Var7, c2Var4));
                d2VarS.a(l50.a.n(g2Var2, e2.S1440P_16_9, c2Var4));
                arrayList2.add(d2VarS);
                d2 d2Var4 = new d2();
                d2Var4.a(l50.a.n(g2Var2, e2Var7, c2Var4));
                d2Var4.a(l50.a.n(g2Var2, e2.UHD, c2Var4));
                arrayList2.add(d2Var4);
                d2 d2Var5 = new d2();
                d2Var5.a(l50.a.n(g2Var2, e2Var7, c2Var4));
                k.B(d2Var5, l50.a.n(g2.YUV, e2Var7, c2Var4), g2Var2, e2Var7, c2Var4);
                arrayList2.add(d2Var5);
                return arrayList2;
            case 26:
                d3 d3Var = w3.b.f43093a;
                return w3.a.f43092a;
            case 27:
                throw new IllegalStateException("CompositionLocal LocalLifecycleOwner not present");
            case 28:
                return ProactiveMessageResponse._childSerializers$_anonymous_();
            default:
                return Unit.f26487a;
        }
    }
}
