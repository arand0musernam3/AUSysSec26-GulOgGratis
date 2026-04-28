package b4;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputConnection;
import androidx.fragment.app.o0;
import b5.m0;
import b5.s2;
import c5.c1;
import c5.d1;
import c5.e1;
import c5.k2;
import c5.s0;
import c5.t0;
import c5.u0;
import c5.x0;
import c5.x2;
import com.google.firebase.messaging.a0;
import d6.g0;
import d6.i0;
import i4.w0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.bouncycastle.iana.AEADAlgorithm;
import r5.z;
import s1.e0;
import v80.j0;
import w2.f1;
import w4.b0;
import z4.l1;
import z4.m1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class x extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5730c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(int i11, Object obj, Object obj2) {
        super(1);
        this.f5728a = i11;
        this.f5729b = obj;
        this.f5730c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InputConnection inputConnection;
        String strX;
        int i11 = 1;
        Activity activity = null;
        Function1 function1 = null;
        Function1 function12 = null;
        int i12 = 0;
        switch (this.f5728a) {
            case 0:
                ((l1) obj).j((m1) this.f5729b, 0, 0, ((y) this.f5730c).f5731o);
                return Unit.f26487a;
            case 1:
                Context context = (Context) this.f5729b;
                Context applicationContext = context.getApplicationContext();
                t0 t0Var = (t0) this.f5730c;
                applicationContext.registerComponentCallbacks(t0Var);
                return new s0(i12, context, t0Var);
            case 2:
                Context context2 = (Context) this.f5729b;
                Context applicationContext2 = context2.getApplicationContext();
                u0 u0Var = (u0) this.f5730c;
                applicationContext2.registerComponentCallbacks(u0Var);
                return new s0(i11, context2, u0Var);
            case 3:
                return new k2((x2) this.f5729b, new defpackage.a((x0) this.f5730c, 5));
            case 4:
                k2 k2Var = (k2) this.f5729b;
                synchronized (k2Var.f7271c) {
                    try {
                        k2Var.f7273e = true;
                        o3.e eVar = k2Var.f7272d;
                        Object[] objArr = eVar.f31830a;
                        int i13 = eVar.f31832c;
                        while (i12 < i13) {
                            r5.p pVar = (r5.p) ((s2) objArr[i12]).get();
                            if (pVar != null && (inputConnection = pVar.f37698b) != null) {
                                inputConnection.closeConnection();
                                pVar.f37698b = null;
                            }
                            i12++;
                        }
                        k2Var.f7272d.g();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                z zVar = ((x0) this.f5730c).f7406b;
                zVar.f37718b.set(null);
                zVar.f37717a.e();
                return Unit.f26487a;
            case 5:
                c1 c1Var = (c1) this.f5729b;
                d1 d1Var = (d1) this.f5730c;
                synchronized (c1Var.f7140d) {
                    c1Var.f7142f.remove(d1Var);
                }
                return Unit.f26487a;
            case 6:
                ((e1) this.f5729b).f7180a.removeFrameCallback((d1) this.f5730c);
                return Unit.f26487a;
            case 7:
                ((m0) this.f5729b).g0(((t) obj).then((t) this.f5730c));
                return Unit.f26487a;
            case 8:
                h.a aVar = (h.a) obj;
                aVar.getClass();
                int i14 = aVar.f20935a;
                if (i14 == -1) {
                    ((cy.v) this.f5729b).o().i(tx.h.Login.a(), i14, aVar.f20936b);
                } else {
                    ((o0) this.f5730c).finish();
                }
                return Unit.f26487a;
            case 9:
                g0 g0Var = (g0) this.f5729b;
                g0Var.setPositionProvider((i0) this.f5730c);
                g0Var.m();
                return new d6.l(0);
            case 10:
                View view = (View) obj;
                view.getClass();
                df.g gVar = (df.g) this.f5729b;
                gf.e eVar2 = (gf.e) gVar.f14897e;
                Window window = (Window) this.f5730c;
                LinkedHashMap linkedHashMap = (LinkedHashMap) gVar.f14899g;
                kf.b bVar = (kf.b) gVar.f14898f;
                if (!gVar.f14894b) {
                    bVar.b("WindowCallbackManager stopped, skipping window wrap");
                } else if (!linkedHashMap.containsKey(window)) {
                    Context context3 = window.getContext();
                    context3.getClass();
                    while (true) {
                        if (context3 instanceof ContextWrapper) {
                            if (context3 instanceof Activity) {
                                activity = (Activity) context3;
                            } else {
                                context3 = ((ContextWrapper) context3).getBaseContext();
                                context3.getClass();
                            }
                        }
                    }
                    if (activity == null || (strX = pd.g.x(activity)) == null) {
                        bVar.b("Unable to get Activity from window context, skipping window");
                    } else {
                        Window.Callback callback = window.getCallback();
                        if (callback == null) {
                            callback = new df.d();
                        }
                        Window.Callback callback2 = callback;
                        linkedHashMap.put(window, window.getCallback());
                        ye.q qVar = (ye.q) gVar.f14896d;
                        gf.h hVar = (gf.h) gVar.f14895c;
                        window.setCallback(qVar != null ? new df.c(callback2, view, strX, hVar, (List) ((Function1) ef.e.f15951a.getValue()).invoke(bVar), (kf.b) gVar.f14898f, eVar2, (ye.q) gVar.f14896d) : new df.b(callback2, view, strX, hVar, (List) ((Function1) ef.e.f15951a.getValue()).invoke(bVar), (kf.b) gVar.f14898f, eVar2));
                        bVar.b("Wrapped window callback for ".concat(strX));
                    }
                }
                return Unit.f26487a;
            case 11:
                if (((Boolean) ((sg.c) this.f5729b).invoke((e4.d) obj)).booleanValue()) {
                    return (f1) this.f5730c;
                }
                return null;
            case 12:
                l1.v((l1) obj, (m1) this.f5729b, 0, 0, ((i4.q) this.f5730c).f23277o, 4);
                return Unit.f26487a;
            case 13:
                l1.v((l1) obj, (m1) this.f5729b, 0, 0, ((w0) this.f5730c).A, 4);
                return Unit.f26487a;
            case 14:
                ((l1) obj).j((m1) this.f5729b, 0, 0, ((e0) this.f5730c).f38574c.h());
                return Unit.f26487a;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                Throwable th3 = (Throwable) obj;
                e6.i iVar = (e6.i) this.f5729b;
                if (th3 == null) {
                    iVar.b(((j0) this.f5730c).C());
                } else if (th3 instanceof CancellationException) {
                    iVar.c();
                } else {
                    iVar.d(th3);
                }
                return Unit.f26487a;
            default:
                MotionEvent motionEvent = (MotionEvent) obj;
                b0 b0Var = (b0) this.f5730c;
                if (motionEvent.getActionMasked() == 0) {
                    a0 a0Var = (a0) this.f5729b;
                    Function1 function13 = b0Var.f43102a;
                    if (function13 != null) {
                        function1 = function13;
                    } else {
                        Intrinsics.throwUninitializedPropertyAccessException("onTouchEvent");
                    }
                    a0Var.f12780c = ((Boolean) function1.invoke(motionEvent)).booleanValue() ? w4.z.Dispatching : w4.z.NotDispatching;
                } else {
                    Function1 function14 = b0Var.f43102a;
                    if (function14 != null) {
                        function12 = function14;
                    } else {
                        Intrinsics.throwUninitializedPropertyAccessException("onTouchEvent");
                    }
                    function12.invoke(motionEvent);
                }
                return Unit.f26487a;
        }
    }
}
