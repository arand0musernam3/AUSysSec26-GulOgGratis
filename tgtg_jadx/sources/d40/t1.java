package d40;

import a3.m3;
import a3.u2;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Log;
import android.view.InputEvent;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.adyen.checkout.components.core.Address;
import com.app.tgtg.R;
import com.app.tgtg.model.remote.item.ItemCardType;
import com.app.tgtg.model.remote.item.ItemCardTypeEnum;
import com.app.tgtg.model.remote.item.response.BasicItem;
import com.app.tgtg.model.remote.order.Order;
import com.app.tgtg.model.remote.order.OrderState;
import com.app.tgtg.model.remote.user.requests.UserAddress;
import com.fingerprintjs.android.fingerprint.tools.threading.safe.ExecutionTimeoutException;
import com.google.android.gms.internal.measurement.ye;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import d2.w2;
import d40.t1;
import g3.f6;
import g3.ga;
import g3.r9;
import g3.v3;
import g3.w6;
import g3.x5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.reflect.KClass;
import kotlinx.coroutines.DispatchException;
import kotlinx.coroutines.TimeoutCancellationException;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static p4.f f14360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f14361b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f14362c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f14363d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f14364e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f14365f = 0;

    public static final void A(k4.d dVar, l4.b bVar) {
        boolean z11;
        boolean z12;
        Canvas canvas;
        boolean z13;
        float f11;
        i4.t tVarI = dVar.g0().i();
        l4.b bVar2 = (l4.b) dVar.g0().f24503c;
        l4.d dVar2 = bVar.f27273a;
        if (bVar.f27290s) {
            return;
        }
        bVar.a();
        if (!dVar2.q()) {
            try {
                bVar.f27273a.I(bVar.f27274b, bVar.f27275c, bVar, bVar.f27277e);
            } catch (Throwable unused) {
            }
        }
        boolean z14 = dVar2.K() > 0.0f;
        if (z14) {
            tVarI.s();
        }
        Canvas canvasA = i4.d.a(tVarI);
        boolean zIsHardwareAccelerated = canvasA.isHardwareAccelerated();
        if (!zIsHardwareAccelerated) {
            long j9 = bVar.f27291t;
            float f12 = (int) (j9 >> 32);
            float f13 = (int) (j9 & 4294967295L);
            long j11 = bVar.f27292u;
            float f14 = ((int) (j11 >> 32)) + f12;
            float f15 = ((int) (j11 & 4294967295L)) + f13;
            float fA = dVar2.a();
            i4.w wVarM = dVar2.m();
            int iN = dVar2.N();
            if (fA < 1.0f || iN != 3 || wVarM != null || dVar2.l() == 1) {
                i0.w wVarG = bVar.f27287p;
                if (wVarG == null) {
                    wVarG = i4.g0.g();
                    bVar.f27287p = wVarG;
                }
                wVarG.F(fA);
                wVarG.G(iN);
                wVarG.I(wVarM);
                canvasA = canvasA;
                f11 = f12;
                canvasA.saveLayer(f11, f13, f14, f15, (Paint) wVarG.f22746c);
            } else {
                canvasA.save();
                canvasA = canvasA;
                f11 = f12;
            }
            canvasA.translate(f11, f13);
            canvasA.concat(dVar2.H());
        }
        boolean z15 = !zIsHardwareAccelerated && bVar.f27294w;
        if (z15) {
            tVarI.e();
            i4.g0 g0VarD = bVar.d();
            if (g0VarD instanceof i4.n0) {
                i4.t.a(tVarI, ((i4.n0) g0VarD).f23271f);
            } else if (g0VarD instanceof i4.o0) {
                i4.h hVarA = bVar.f27284m;
                if (hVarA != null) {
                    hVarA.f23258a.rewind();
                } else {
                    hVarA = i4.l.a();
                    bVar.f27284m = hVarA;
                }
                i4.h.c(hVarA, ((i4.o0) g0VarD).f23274f);
                tVarI.c(hVarA);
            } else {
                if (!(g0VarD instanceof i4.m0)) {
                    e40.a.f();
                    return;
                }
                tVarI.c(((i4.m0) g0VarD).f23270f);
            }
        }
        if (bVar2 != null) {
            ae.c cVar = bVar2.f27289r;
            if (!cVar.f1242a) {
                i4.j0.a("Only add dependencies during a tracking");
            }
            q1.u0 u0Var = (q1.u0) cVar.f1245d;
            if (u0Var != null) {
                u0Var.d(bVar);
            } else if (((l4.b) cVar.f1243b) != null) {
                q1.u0 u0Var2 = q1.j1.f35777a;
                q1.u0 u0Var3 = new q1.u0();
                l4.b bVar3 = (l4.b) cVar.f1243b;
                bVar3.getClass();
                u0Var3.d(bVar3);
                u0Var3.d(bVar);
                cVar.f1245d = u0Var3;
                cVar.f1243b = null;
            } else {
                cVar.f1243b = bVar;
            }
            q1.u0 u0Var4 = (q1.u0) cVar.f1246e;
            if (u0Var4 != null) {
                z13 = !u0Var4.l(bVar);
            } else if (((l4.b) cVar.f1244c) != bVar) {
                z13 = true;
            } else {
                cVar.f1244c = null;
                z13 = false;
            }
            if (z13) {
                bVar.f27288q++;
            }
        }
        if (((i4.c) tVarI).f23230a.isHardwareAccelerated()) {
            z11 = z14;
            z12 = z15;
            canvas = canvasA;
            dVar2.i(tVarI);
        } else {
            k4.b bVar4 = bVar.f27286o;
            if (bVar4 == null) {
                bVar4 = new k4.b();
                bVar.f27286o = bVar4;
            }
            j30.g gVar = bVar4.f25938b;
            z5.c cVar2 = bVar.f27274b;
            z5.m mVar = bVar.f27275c;
            long jZ = b0.z.z(bVar.f27292u);
            k4.a aVar = ((k4.b) gVar.f24504d).f25937a;
            z5.c cVar3 = aVar.f25933a;
            z5.m mVar2 = aVar.f25934b;
            i4.t tVarI2 = gVar.i();
            z12 = z15;
            canvas = canvasA;
            long jO = gVar.o();
            z11 = z14;
            l4.b bVar5 = (l4.b) gVar.f24503c;
            gVar.y(cVar2);
            gVar.A(mVar);
            gVar.x(tVarI);
            gVar.B(jZ);
            gVar.f24503c = bVar;
            tVarI.e();
            try {
                bVar.c(bVar4);
            } finally {
                tVarI.o();
                gVar.y(cVar3);
                gVar.A(mVar2);
                gVar.x(tVarI2);
                gVar.B(jO);
                gVar.f24503c = bVar5;
            }
        }
        if (z12) {
            tVarI.o();
        }
        if (z11) {
            tVarI.f();
        }
        if (zIsHardwareAccelerated) {
            return;
        }
        canvas.restore();
    }

    public static final int C(long j9, m5.q0 q0Var) {
        int i11 = (int) (4294967295L & j9);
        if (Float.intBitsToFloat(i11) <= 0.0f) {
            return 0;
        }
        float fIntBitsToFloat = Float.intBitsToFloat(i11);
        m5.r rVar = q0Var.f29618b;
        return fIntBitsToFloat >= rVar.f29627e ? q0Var.f29617a.f29603a.f29538b.length() : rVar.g(j9);
    }

    public static final boolean D(String str) {
        return Intrinsics.areEqual("NL", str) || Intrinsics.areEqual("BE", str) || Intrinsics.areEqual("AT", str) || Intrinsics.areEqual("DE", str) || Intrinsics.areEqual("PL", str);
    }

    public static void E(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
        int colorForState = colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor());
        Drawable drawableMutate = drawable.mutate();
        drawableMutate.setTintList(ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(drawableMutate);
    }

    public static final Object H(long j9, Function0 function0) {
        Object pVar;
        Object pVar2;
        StackTraceElement[] stackTrace;
        function0.getClass();
        ArrayList arrayListW = null;
        AtomicReference atomicReference = new AtomicReference(null);
        Boolean bool = (Boolean) py.b.f35639a.get();
        if (bool == null ? false : bool.booleanValue()) {
            Log.e("FingerprintJS", "Unexpected error occurred. Feel free to create an issue on Github repository of the fingerprintjs-android library.", new IllegalStateException());
        }
        try {
            u70.o oVar = u70.q.f40850b;
            pVar = oy.a.f33798a.submit(new com.google.firebase.messaging.g(5, atomicReference, function0));
            pVar.getClass();
        } catch (Throwable th2) {
            u70.o oVar2 = u70.q.f40850b;
            pVar = new u70.p(th2);
        }
        Throwable thA = u70.q.a(pVar);
        if (thA != null) {
            return new u70.p(thA);
        }
        Future future = (Future) pVar;
        try {
            pVar2 = future.get(j9, TimeUnit.MILLISECONDS);
        } catch (Throwable th3) {
            u70.o oVar3 = u70.q.f40850b;
            pVar2 = new u70.p(th3);
        }
        Throwable thA2 = u70.q.a(pVar2);
        if (thA2 != null) {
            try {
                if (!(thA2 instanceof TimeoutException)) {
                    throw thA2;
                }
                TimeoutException timeoutException = (TimeoutException) thA2;
                Thread thread = (Thread) atomicReference.get();
                if (thread != null && (stackTrace = thread.getStackTrace()) != null) {
                    arrayListW = kotlin.collections.y.w(stackTrace);
                }
                throw new ExecutionTimeoutException(timeoutException, arrayListW);
            } catch (Throwable th4) {
                u70.o oVar4 = u70.q.f40850b;
                pVar2 = new u70.p(th4);
            }
        }
        if (u70.q.a(pVar2) != null) {
            try {
                future.cancel(true);
            } catch (Throwable unused) {
                u70.o oVar5 = u70.q.f40850b;
            }
        }
        return pVar2;
    }

    public static void I(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean zHasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z11 = onLongClickListener != null;
        boolean z12 = zHasOnClickListeners || z11;
        checkableImageButton.setFocusable(z12);
        checkableImageButton.setClickable(zHasOnClickListeners);
        checkableImageButton.setPressable(zHasOnClickListeners);
        checkableImageButton.setLongClickable(z11);
        checkableImageButton.setImportantForAccessibility(z12 ? 1 : 2);
    }

    public static final Object J(a90.s sVar, boolean z11, a90.s sVar2, Function2 function2) {
        Object tVar;
        Object objS;
        try {
            tVar = !(function2 instanceof z70.a) ? y70.f.c(function2, sVar2, sVar) : ((Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function2, 2)).invoke(sVar2, sVar);
        } catch (DispatchException e5) {
            Throwable th2 = e5.f26625a;
            sVar.R(new v80.t(th2, false));
            throw th2;
        } catch (Throwable th3) {
            tVar = new v80.t(th3, false);
        }
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        if (tVar == aVar || (objS = sVar.S(tVar)) == v80.f0.f42087e) {
            return aVar;
        }
        sVar.l0();
        if (!(objS instanceof v80.t)) {
            return v80.f0.J(objS);
        }
        if (!z11) {
            Throwable th4 = ((v80.t) objS).f42160a;
            if ((th4 instanceof TimeoutCancellationException) && ((TimeoutCancellationException) th4).f26627a == sVar) {
                if (tVar instanceof v80.t) {
                    throw ((v80.t) tVar).f42160a;
                }
                return tVar;
            }
        }
        throw ((v80.t) objS).f42160a;
    }

    public static final androidx.lifecycle.l1 K(KClass kClass, androidx.lifecycle.s1 s1Var, ViewModelProvider$Factory viewModelProvider$Factory, CreationExtras creationExtras, m3.n nVar) {
        androidx.lifecycle.r1 r1VarK;
        if (viewModelProvider$Factory != null) {
            ViewModelStore viewModelStore = s1Var.getViewModelStore();
            viewModelStore.getClass();
            creationExtras.getClass();
            r1VarK = new androidx.lifecycle.r1(viewModelStore, viewModelProvider$Factory, creationExtras);
        } else if (s1Var instanceof androidx.lifecycle.p) {
            ViewModelStore viewModelStore2 = s1Var.getViewModelStore();
            ViewModelProvider$Factory defaultViewModelProviderFactory = ((androidx.lifecycle.p) s1Var).getDefaultViewModelProviderFactory();
            viewModelStore2.getClass();
            defaultViewModelProviderFactory.getClass();
            creationExtras.getClass();
            r1VarK = new androidx.lifecycle.r1(viewModelStore2, defaultViewModelProviderFactory, creationExtras);
        } else {
            r1VarK = r40.d.k(s1Var, null, 6);
        }
        return r1VarK.a(kClass);
    }

    public static final Object L(Function1 function1, x70.c cVar, y9.v vVar) {
        rb.k kVar = null;
        da.f fVar = new da.f(function1, null);
        y9.c0 c0Var = (y9.c0) cVar.getContext().get(y9.c0.f45655b);
        kotlin.coroutines.d dVar = c0Var != null ? c0Var.f45656a : null;
        if (dVar != null) {
            return v80.f0.K(dVar, fVar, cVar);
        }
        v80.l lVar = new v80.l(1, y70.f.b(cVar));
        lVar.t();
        try {
            rb.k kVar2 = vVar.f45759d;
            if (kVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("internalTransactionExecutor");
            } else {
                kVar = kVar2;
            }
            kVar.execute(new ye(lVar, vVar, fVar, 15));
        } catch (RejectedExecutionException e5) {
            lVar.j(new IllegalStateException("Unable to acquire a thread to perform the database transaction.", e5));
        }
        Object objS = lVar.s();
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        return objS;
    }

    public static String M(String str, Object... objArr) {
        int length;
        int iIndexOf;
        StringBuilder sb2 = new StringBuilder(str.length() + (objArr.length * 16));
        int i11 = 0;
        int i12 = 0;
        while (true) {
            length = objArr.length;
            if (i11 >= length || (iIndexOf = str.indexOf("%s", i12)) == -1) {
                break;
            }
            sb2.append((CharSequence) str, i12, iIndexOf);
            sb2.append(N(objArr[i11]));
            i12 = iIndexOf + 2;
            i11++;
        }
        sb2.append((CharSequence) str, i12, str.length());
        if (i11 < length) {
            String str2 = " [";
            while (i11 < objArr.length) {
                sb2.append(str2);
                sb2.append(N(objArr[i11]));
                i11++;
                str2 = ", ";
            }
            sb2.append(']');
        }
        return sb2.toString();
    }

    public static String N(Object obj) {
        if (obj == null) {
            return Address.ADDRESS_NULL_PLACEHOLDER;
        }
        try {
            return obj.toString();
        } catch (Exception e5) {
            String name = obj.getClass().getName();
            String hexString = Integer.toHexString(System.identityHashCode(obj));
            String strN = e0.f.n(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, "@", hexString);
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strN), (Throwable) e5);
            String name2 = e5.getClass().getName();
            StringBuilder sb2 = new StringBuilder(strN.length() + 8 + name2.length() + 1);
            j4.s.A(sb2, "<", strN, " threw ", name2);
            sb2.append(">");
            return sb2.toString();
        }
    }

    public static final void a(Order order, m3.n nVar, int i11) {
        order.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(2127173200);
        int i12 = (sVar.h(order) ? 4 : 2) | i11;
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            OrderState state = order.getState();
            Integer numValueOf = Integer.valueOf(R.string.mnu_order_state_active);
            int i13 = mo.e.$EnumSwitchMapping$1[state.ordinal()];
            if (i13 == 4) {
                numValueOf = Integer.valueOf(R.string.mnu_order_state_cancelled);
            } else if (i13 == 5 || i13 == 6) {
                numValueOf = Integer.valueOf(R.string.mnu_order_state_refunded);
            }
            sVar.a0(-1625574708);
            r9.d(o30.f0.U(sVar, numValueOf.intValue()), d2.c.D(b4.q.f5711a, lv.t.f28249c, 0.0f, 0.0f, 0.0f, 14), lv.s.J, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.f28277q, sVar, 432, 12582912, 131064);
            sVar = sVar;
            sVar.q(false);
        } else {
            sVar.U();
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new co.v(order, i11, 6);
        }
    }

    public static final void b(String str, String str2, String str3, String str4, m3.n nVar, int i11) {
        b4.j jVar;
        b5.g gVar;
        b5.h hVar;
        str.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-1626838319);
        int i12 = (sVar.f(str) ? 4 : 2) | i11;
        if ((i11 & 48) == 0) {
            i12 |= sVar.f(str2) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar.f(str3) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.f(str4) ? NewHope.SENDB_BYTES : 1024;
        }
        if (sVar.R(i12 & 1, (i12 & 1171) != 1170)) {
            b4.q qVar = b4.q.f5711a;
            b4.t tVarD = d2.m2.d(qVar, 1.0f);
            b4.j jVar2 = b4.d.f5692j;
            d2.b bVar = d2.i.f13801a;
            d2.i2 i2VarA = d2.h2.a(bVar, jVar2, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(tVarD, sVar);
            b5.j.R.getClass();
            b5.h hVar2 = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar2);
            } else {
                sVar.n0();
            }
            b5.g gVar2 = b5.i.f5843f;
            m3.i.C(i2VarA, gVar2, sVar);
            b5.g gVar3 = b5.i.f5842e;
            m3.i.C(iVarL, gVar3, sVar);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b5.g gVar4 = b5.i.f5844g;
            m3.i.v(sVar, numValueOf, gVar4);
            b5.d dVar = b5.i.f5845h;
            m3.i.z(sVar, dVar);
            b5.g gVar5 = b5.i.f5841d;
            m3.i.C(tVarC, gVar5, sVar);
            if (1.0f <= 0.0d) {
                e2.a.a("invalid weight; must be greater than zero");
            }
            d2.n1 n1Var = new d2.n1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            m5.u0 u0Var = lv.v.f28279s;
            int i13 = i12;
            long j9 = lv.s.E;
            boolean z11 = false;
            r9.d(str, n1Var, j9, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var, sVar, (i13 & 14) | MLKEMEngine.KyberPolyBytes, 12582912, 131064);
            sVar = sVar;
            if (str3 == null) {
                sVar.a0(-1581085771);
                sVar.q(false);
                jVar = jVar2;
                gVar = gVar5;
                hVar = hVar2;
            } else {
                sVar.a0(-1581085770);
                if (str4 == null) {
                    sVar.a0(958456617);
                    sVar.q(false);
                    jVar = jVar2;
                    gVar = gVar5;
                    hVar = hVar2;
                } else {
                    sVar.a0(958456618);
                    jVar = jVar2;
                    gVar = gVar5;
                    hVar = hVar2;
                    r9.d(str3, null, j9, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 131066);
                    sVar = sVar;
                    sVar.q(false);
                }
                sVar.q(false);
            }
            sVar.q(true);
            d2.c.f(d2.m2.e(qVar, 2), sVar);
            b4.t tVarD2 = d2.m2.d(qVar, 1.0f);
            d2.i2 i2VarA2 = d2.h2.a(bVar, jVar, sVar, 48);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            b4.t tVarC2 = b4.a.c(tVarD2, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(i2VarA2, gVar2, sVar);
            m3.i.C(iVarL2, gVar3, sVar);
            w.a0.y(iHashCode2, sVar, gVar4, sVar, dVar);
            m3.i.C(tVarC2, gVar, sVar);
            if (str2 == null) {
                sVar.a0(1705069765);
                sVar.q(false);
            } else {
                sVar.a0(1705069766);
                if (1.0f <= 0.0d) {
                    e2.a.a("invalid weight; must be greater than zero");
                }
                m3.s sVar2 = sVar;
                r9.d(str2, new d2.n1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), lv.s.C, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.f28274n, sVar2, ((i13 >> 3) & 14) | MLKEMEngine.KyberPolyBytes, 12582912, 131064);
                sVar = sVar2;
                z11 = false;
                sVar.q(false);
            }
            if (str4 == null) {
                sVar.a0(1705223308);
                sVar.q(z11);
            } else {
                sVar.a0(1705223309);
                m3.s sVar3 = sVar;
                r9.d(str4, null, lv.s.C, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.f28274n, sVar3, MLKEMEngine.KyberPolyBytes, 12582912, 131066);
                sVar = sVar3;
                sVar.q(false);
            }
            sVar.q(true);
        } else {
            sVar.U();
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new a3.t0(str, str2, i11, str3, str4, 13);
        }
    }

    public static final void c(b4.t tVar, cm.d dVar, Function0 function0, Function0 function02, m3.n nVar, int i11) {
        m3.s sVar;
        b4.t tVar2;
        dVar.getClass();
        m3.s sVar2 = (m3.s) nVar;
        sVar2.c0(1950975461);
        int i12 = i11 | 6 | (sVar2.h(dVar) ? 32 : 16) | (sVar2.h(function0) ? 256 : 128) | (sVar2.h(function02) ? NewHope.SENDB_BYTES : 1024);
        if (sVar2.R(i12 & 1, (i12 & 1171) != 1170)) {
            Object objM = sVar2.M();
            m3.f fVar = m3.m.f29332a;
            if (objM == fVar) {
                objM = m3.i.w(Boolean.FALSE);
                sVar2.k0(objM);
            }
            m3.b1 b1Var = (m3.b1) objM;
            if (((Boolean) b1Var.getValue()).booleanValue()) {
                sVar2.a0(2012783469);
                w6 w6VarF = v3.f(6, 2, null, sVar2);
                boolean zH = sVar2.h(dVar);
                Object objM2 = sVar2.M();
                if (zH || objM2 == fVar) {
                    objM2 = new bs.b(4, dVar, b1Var);
                    sVar2.k0(objM2);
                }
                xz.b.f(w6VarF, (Function0) objM2, sVar2, 0);
                sVar2.q(false);
            } else {
                sVar2.a0(2013383133);
                sVar2.q(false);
            }
            Object objM3 = sVar2.M();
            if (objM3 == fVar) {
                objM3 = new bm.j(b1Var, 1);
                sVar2.k0(objM3);
            }
            Function0 function03 = (Function0) objM3;
            boolean zH2 = sVar2.h(dVar);
            Object objM4 = sVar2.M();
            if (zH2 || objM4 == fVar) {
                al.e eVar = new al.e(1, dVar, cm.d.class, "trackEvent", "trackEvent(Lcom/app/tgtg/services/analytics/TrackingEvent;Lcom/app/tgtg/services/analytics/model/TrackingProperties;)V", 0, 1);
                sVar2.k0(eVar);
                objM4 = eVar;
            }
            b4.q qVar = b4.q.f5711a;
            sVar = sVar2;
            bx.o.o(qVar, function03, function0, function02, (Function1) objM4, sVar, (i12 & 896) | 54 | (i12 & 7168));
            tVar2 = qVar;
        } else {
            sVar = sVar2;
            sVar.U();
            tVar2 = tVar;
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bn.p(tVar2, dVar, i11, function0, function02, 2);
        }
    }

    public static final void d(b4.t tVar, int i11, int i12, i4.v vVar, Function0 function0, m3.n nVar, int i13, int i14) {
        i4.v vVar2;
        int i15;
        b4.t tVar2;
        i4.v vVar3;
        boolean z11;
        function0.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(914105356);
        int i16 = i13 | 6 | (sVar.d(i11) ? 32 : 16) | (sVar.d(i12) ? 256 : 128);
        int i17 = i14 & 8;
        if (i17 != 0) {
            i15 = i16 | 3072;
            vVar2 = vVar;
        } else {
            vVar2 = vVar;
            i15 = i16 | (sVar.f(vVar2) ? NewHope.SENDB_BYTES : 1024);
        }
        int i18 = i15 | (sVar.h(function0) ? 16384 : 8192);
        if (sVar.R(i18 & 1, (i18 & 9363) != 9362)) {
            if (i17 != 0) {
                vVar2 = null;
            }
            tVar2 = b4.q.f5711a;
            b4.t tVarE = d2.m2.e(d2.m2.d(tVar2, 1.0f), 49);
            boolean z12 = (57344 & i18) == 16384;
            Object objM = sVar.M();
            if (z12 || objM == m3.m.f29332a) {
                objM = new rr.a(0, function0);
                sVar.k0(objM);
            }
            b4.t tVarC = androidx.compose.foundation.b.c(tVarE, false, null, null, (Function0) objM, 15);
            d2.i2 i2VarA = d2.h2.a(d2.i.f13801a, b4.d.f5692j, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC2 = b4.a.c(tVarC, sVar);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            b5.g gVar = b5.i.f5843f;
            m3.i.C(i2VarA, gVar, sVar);
            b5.g gVar2 = b5.i.f5842e;
            m3.i.C(iVarL, gVar2, sVar);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b5.g gVar3 = b5.i.f5844g;
            m3.i.v(sVar, numValueOf, gVar3);
            b5.d dVar = b5.i.f5845h;
            m3.i.z(sVar, dVar);
            b5.g gVar4 = b5.i.f5841d;
            m3.i.C(tVarC2, gVar4, sVar);
            b4.t tVarD = d2.c.D(d2.m2.u(tVar2, null, 3), 0.0f, 0.0f, o30.e0.s(sVar, R.dimen.spacing_1), 0.0f, 11);
            b4.j jVar = b4.d.f5693k;
            b4.t tVarG = b3.i.g(jVar, tVarD);
            z4.u0 u0VarD = d2.p.d(b4.d.f5683a, false);
            i4.v vVar4 = vVar2;
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            b4.t tVarC3 = b4.a.c(tVarG, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(u0VarD, gVar, sVar);
            m3.i.C(iVarL2, gVar2, sVar);
            w.a0.y(iHashCode2, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC3, gVar4, sVar);
            g3.i2.a(o00.x0.z(i12, sVar, (i18 >> 6) & 14), null, d2.m2.m(tVar2, 24), i4.v.f23315h, sVar, 3512, 0);
            if (vVar4 == null) {
                sVar.a0(-1406490092);
                sVar.q(false);
                vVar3 = vVar4;
                z11 = true;
            } else {
                sVar.a0(-1406490091);
                vVar3 = vVar4;
                long j9 = vVar3.f23317a;
                b4.t tVarM = d2.m2.m(d2.u.f13938a.a(tVar2, b4.d.f5685c), 10);
                z11 = true;
                float f11 = 1;
                long j11 = lv.s.J;
                l2.f fVar = l2.g.f26790a;
                d2.p.a(v1.n.j(f4.g.b(d2.c.z(v1.n.k(tVarM, f11, j11, fVar), f11), fVar), j9, i4.g0.f23254b), sVar, 0);
                sVar.q(false);
            }
            sVar.q(z11);
            if (1.0f <= 0.0d) {
                e2.a.a("invalid weight; must be greater than zero");
            }
            r9.d(o30.f0.U(sVar, i11), new d2.n1(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true).then(new w2(jVar)), 0L, 0L, null, 0L, null, null, 0L, 2, false, 0, 0, null, m5.u0.a(lv.v.f28274n, lv.s.C, 0L, null, null, 0L, null, 5, 0L, null, null, 16744446), sVar, 0, MLKEMEngine.KyberPolyBytes, 126972);
            sVar = sVar;
            g3.i2.a(o00.x0.z(R.drawable.system_icon_chevron_right_neutral_80, sVar, 0), null, d2.c.z(new w2(jVar), o30.e0.s(sVar, R.dimen.spacing_1)), 0L, sVar, 56, 8);
            sVar.q(true);
            vVar2 = vVar3;
        } else {
            sVar.U();
            tVar2 = tVar;
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new cg.g(tVar2, i11, i12, vVar2, function0, i13, i14);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(com.app.tgtg.model.remote.item.response.BasicItem r28, m3.n r29, int r30) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d40.t1.e(com.app.tgtg.model.remote.item.response.BasicItem, m3.n, int):void");
    }

    public static final void f(UserAddress userAddress, m3.n nVar, int i11) {
        boolean z11;
        b4.q qVar;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(1479143235);
        int i12 = i11 | (sVar.f(userAddress) ? 4 : 2);
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            float f11 = lv.t.f28254h;
            b4.q qVar2 = b4.q.f5711a;
            b(r8.k.f(f11, R.string.catering_address_extra_details_header, qVar2, sVar, sVar), null, null, null, sVar, 3504);
            String deliveryAccessCode = userAddress.getDeliveryAccessCode();
            if (deliveryAccessCode == null) {
                sVar.a0(-1207952877);
                sVar.q(false);
                z11 = false;
                qVar = qVar2;
            } else {
                sVar.a0(-1207952876);
                z11 = false;
                qVar = qVar2;
                r9.d(o30.f0.T(R.string.catering_address_security_code_formatted, new Object[]{deliveryAccessCode}, sVar), null, lv.s.D, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.f28274n, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 131066);
                sVar = sVar;
                sVar.q(false);
            }
            String deliveryInstructions = userAddress.getDeliveryInstructions();
            if (deliveryInstructions == null) {
                sVar.a0(-1207713061);
                sVar.q(z11);
            } else {
                sVar.a0(-1207713060);
                d2.c.f(d2.m2.m(qVar, lv.t.f28251e), sVar);
                m3.s sVar2 = sVar;
                r9.d(deliveryInstructions, null, lv.s.D, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.f28274n, sVar2, MLKEMEngine.KyberPolyBytes, 12582912, 131066);
                sVar = sVar2;
                sVar.q(z11);
            }
        } else {
            sVar.U();
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new lk.a(userAddress, i11, 17);
        }
    }

    public static final void g(Order order, boolean z11, i80.n nVar, m3.n nVar2, int i11) {
        long j9;
        order.getClass();
        nVar.getClass();
        m3.s sVar = (m3.s) nVar2;
        sVar.c0(-1978147407);
        int i12 = i11 | (sVar.h(order) ? 4 : 2) | (sVar.g(z11) ? 32 : 16) | (sVar.h(nVar) ? 256 : 128);
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            String strV = mv.p0.v((Context) sVar.j(c5.v0.f7390b), order.getTimeOfPurchase());
            b4.t tVarZ = d2.c.z(d2.m2.d(b4.q.f5711a, 1.0f), lv.t.f28253g);
            switch (mo.e.$EnumSwitchMapping$1[order.getState().ordinal()]) {
                case 1:
                case 2:
                case 3:
                    j9 = lv.s.f28221d;
                    break;
                case 4:
                case 7:
                    j9 = lv.s.f28231k;
                    break;
                case 5:
                case 6:
                    j9 = lv.s.D;
                    break;
                default:
                    j9 = lv.s.f28221d;
                    break;
            }
            g3.s0.b(tVarZ, l2.g.b(16), g3.s0.p(j9, sVar, 0), null, null, u3.e.e(-1844714369, sVar, new mo.d(order, strV, z11, nVar, 0)), sVar, 196614, 24);
        } else {
            sVar.U();
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bn.d(order, z11, nVar, i11, 8);
        }
    }

    public static final void h(BasicItem basicItem, long j9, m3.n nVar, int i11) {
        BasicItem basicItem2;
        int i12;
        m3.s sVar;
        basicItem.getClass();
        m3.s sVar2 = (m3.s) nVar;
        sVar2.c0(2060312176);
        if ((i11 & 6) == 0) {
            basicItem2 = basicItem;
            i12 = i11 | (sVar2.h(basicItem2) ? 4 : 2);
        } else {
            basicItem2 = basicItem;
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar2.e(j9) ? 32 : 16;
        }
        if (sVar2.R(i12 & 1, (i12 & 19) != 18)) {
            sVar = sVar2;
            r9.d(mv.d.i(basicItem2.getInformation().getDisplayPrice(), 1), null, j9, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.l, sVar, (i12 << 3) & 896, 12582912, 131066);
        } else {
            sVar = sVar2;
            sVar.U();
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new fg.l(basicItem, j9, i11, 2);
        }
    }

    public static final void i(b4.t tVar, final BasicItem basicItem, final long j9, boolean z11, boolean z12, m3.n nVar, final int i11, final int i12) {
        boolean z13;
        int i13;
        boolean z14;
        int i14;
        final boolean z15;
        final boolean z16;
        b4.t tVar2;
        ItemCardTypeEnum itemCardType;
        basicItem.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(283242697);
        int i15 = i11 | 6 | (sVar.h(basicItem) ? 32 : 16) | (sVar.e(j9) ? 256 : 128);
        int i16 = i12 & 8;
        if (i16 != 0) {
            i13 = i15 | 3072;
            z13 = z11;
        } else {
            z13 = z11;
            i13 = i15 | (sVar.g(z13) ? NewHope.SENDB_BYTES : 1024);
        }
        int i17 = i12 & 16;
        if (i17 != 0) {
            i14 = i13 | 24576;
            z14 = z12;
        } else {
            z14 = z12;
            i14 = i13 | (sVar.g(z14) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192);
        }
        int i18 = i14;
        if (sVar.R(i18 & 1, (i18 & 9363) != 9362)) {
            boolean z17 = i16 != 0 ? false : z13;
            boolean z18 = i17 != 0 ? false : z14;
            float f11 = lv.t.f28251e;
            tVar2 = b4.q.f5711a;
            b4.t tVarZ = d2.c.z(tVar2, f11);
            d2.i2 i2VarA = d2.h2.a(d2.i.f13801a, b4.d.f5693k, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(tVarZ, sVar);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(i2VarA, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar);
            ItemCardType itemCardType2 = basicItem.getItemCardType();
            d2.k2 k2Var = d2.k2.f13824a;
            if (itemCardType2 != null) {
                sVar.a0(378569550);
                ItemCardType itemCardType3 = basicItem.getItemCardType();
                if (!Intrinsics.areEqual((itemCardType3 == null || (itemCardType = itemCardType3.getItemCardType()) == null) ? null : itemCardType.name(), "SPECIAL_REWARD") || z17) {
                    sVar.a0(378792533);
                    sVar.q(false);
                } else {
                    sVar.a0(378725263);
                    d2.c.f(k2Var.a(1.0f, tVar2, true), sVar);
                    sVar.q(false);
                }
                int i19 = i18 >> 3;
                y9.w.a(d2.c.D(k2Var.a(1.0f, tVar2, true), 0.0f, 0.0f, f11, 0.0f, 11), basicItem, z17, z18, sVar, (i18 & 112) | (i19 & 896) | (i19 & 7168));
                sVar.q(false);
            } else {
                sVar.a0(379106935);
                d2.c.f(k2Var.a(1.0f, tVar2, true), sVar);
                sVar.q(false);
            }
            int i21 = i18 >> 3;
            e(basicItem, sVar, i21 & 14);
            h(basicItem, j9, sVar, i21 & 126);
            sVar.q(true);
            z15 = z17;
            z16 = z18;
        } else {
            sVar.U();
            z15 = z13;
            z16 = z14;
            tVar2 = tVar;
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            final b4.t tVar3 = tVar2;
            w1VarS.f29476d = new Function2(basicItem, j9, z15, z16, i11, i12) { // from class: fg.m

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ BasicItem f17721b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ long f17722c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ boolean f17723d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ boolean f17724e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ int f17725f;

                {
                    this.f17725f = i12;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iF = m3.i.F(1);
                    t1.i(this.f17720a, this.f17721b, this.f17722c, this.f17723d, this.f17724e, (m3.n) obj, iF, this.f17725f);
                    return Unit.f26487a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void j(com.app.tgtg.model.remote.order.Order r30, boolean r31, m3.n r32, int r33, int r34) {
        /*
            Method dump skipped, instruction units count: 1011
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d40.t1.j(com.app.tgtg.model.remote.order.Order, boolean, m3.n, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void k(com.app.tgtg.model.remote.order.Order r18, boolean r19, m3.n r20, int r21) {
        /*
            Method dump skipped, instruction units count: 619
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d40.t1.k(com.app.tgtg.model.remote.order.Order, boolean, m3.n, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01c5  */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void l(com.app.tgtg.model.remote.order.Order r31, boolean r32, m3.n r33, int r34) {
        /*
            Method dump skipped, instruction units count: 483
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d40.t1.l(com.app.tgtg.model.remote.order.Order, boolean, m3.n, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:147:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m(b4.t r21, final com.app.tgtg.model.remote.item.response.BasicItem r22, boolean r23, boolean r24, boolean r25, boolean r26, final kotlin.jvm.functions.Function1 r27, kotlin.jvm.functions.Function0 r28, kotlin.jvm.functions.Function1 r29, m3.n r30, final int r31, final int r32) {
        /*
            Method dump skipped, instruction units count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d40.t1.m(b4.t, com.app.tgtg.model.remote.item.response.BasicItem, boolean, boolean, boolean, boolean, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, m3.n, int, int):void");
    }

    public static final void n(at.g0 g0Var, a50.c cVar, WebView webView, bt.b bVar, m3.n nVar, int i11) {
        m3.s sVar;
        m3.s sVar2 = (m3.s) nVar;
        sVar2.c0(-690841897);
        int i12 = i11 | (sVar2.f(g0Var) ? 4 : 2) | (sVar2.f(cVar) ? 32 : 16) | (sVar2.h(webView) ? 256 : 128) | (sVar2.h(bVar) ? NewHope.SENDB_BYTES : 1024);
        if (sVar2.R(i12 & 1, (i12 & 1171) != 1170)) {
            d2.g0 g0Var2 = d2.m2.f13850c;
            z4.u0 u0VarD = d2.p.d(b4.d.f5687e, false);
            int iHashCode = Long.hashCode(sVar2.T);
            u3.i iVarL = sVar2.l();
            b4.t tVarC = b4.a.c(g0Var2, sVar2);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar2.e0();
            if (sVar2.S) {
                sVar2.k(hVar);
            } else {
                sVar2.n0();
            }
            m3.i.C(u0VarD, b5.i.f5843f, sVar2);
            m3.i.C(iVarL, b5.i.f5842e, sVar2);
            m3.i.v(sVar2, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar2, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar2);
            boolean zH = ((i12 & 14) == 4) | sVar2.h(webView) | sVar2.h(bVar) | ((i12 & 112) == 32);
            Object objM = sVar2.M();
            if (zH || objM == m3.m.f29332a) {
                b0.x1 x1Var = new b0.x1(3, webView, g0Var, bVar, cVar);
                sVar2.k0(x1Var);
                objM = x1Var;
            }
            Function1 function1 = (Function1) objM;
            sVar = sVar2;
            c6.r.b(function1, g0Var2, null, sVar, 48, 4);
            sVar.q(true);
        } else {
            sVar = sVar2;
            sVar.U();
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bn.p(g0Var, cVar, i11, webView, bVar, 8);
        }
    }

    public static final void o(b4.t tVar, boolean z11, Function1 function1, m3.n nVar, int i11) {
        int i12;
        int i13;
        boolean z12;
        boolean z13;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(1843357976);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(tVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        int i14 = i12 | 48;
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i14 = i12 | 176;
        }
        int i15 = i14 | 3072;
        if ((i11 & 24576) == 0) {
            i15 |= sVar.h(function1) ? 16384 : 8192;
        }
        if ((i15 & 9363) == 9362 && sVar.B()) {
            sVar.U();
            z13 = z11;
        } else {
            sVar.W();
            if ((i11 & 1) == 0 || sVar.z()) {
                i13 = i15 & (-897);
                z12 = true;
            } else {
                sVar.U();
                i13 = i15 & (-897);
                z12 = z11;
            }
            sVar.r();
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (objM == fVar) {
                m3.d0 d0Var = new m3.d0(m3.i.o(kotlin.coroutines.g.f26549a, sVar));
                sVar.k0(d0Var);
                objM = d0Var;
            }
            v80.b0 b0Var = ((m3.d0) objM).f29260a;
            Object objM2 = sVar.M();
            Object obj = objM2;
            if (objM2 == fVar) {
                k1.g gVar = new k1.g(b0Var);
                gVar.f25726d = -1;
                gVar.f25727e = -1;
                sVar.k0(gVar);
                obj = gVar;
            }
            k1.g gVar2 = (k1.g) obj;
            Object objM3 = sVar.M();
            if (objM3 == fVar) {
                objM3 = new im.a(23);
                sVar.k0(objM3);
            }
            Function1 function12 = (Function1) objM3;
            Object objM4 = sVar.M();
            if (objM4 == fVar) {
                objM4 = new im.a(24);
                sVar.k0(objM4);
            }
            Function1 function13 = (Function1) objM4;
            boolean zH = ((57344 & i13) == 16384) | sVar.h(gVar2) | sVar.e(0L) | ((i13 & 112) == 32) | ((i13 & 7168) == 2048);
            Object objM5 = sVar.M();
            if (zH || objM5 == fVar) {
                objM5 = new f6(gVar2, function1, z12);
                sVar.k0(objM5);
            }
            c6.r.a(function12, tVar, function13, null, (Function1) objM5, sVar, ((i13 << 3) & 112) | 390, 8);
            z13 = z12;
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new m3(i11, 9, tVar, function1, z13);
        }
    }

    public static final void p(at.h0 h0Var, a50.c cVar, WebView webView, bt.b bVar, m3.n nVar, int i11) {
        h0Var.getClass();
        cVar.getClass();
        webView.getClass();
        bVar.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-276889591);
        int i12 = i11 | (sVar.f(h0Var) ? 4 : 2) | (sVar.f(cVar) ? 32 : 16) | (sVar.h(webView) ? 256 : 128) | (sVar.h(bVar) ? NewHope.SENDB_BYTES : 1024);
        if (sVar.R(i12 & 1, (i12 & 1171) != 1170)) {
            g3.n1 n1VarA = ga.a(sVar);
            x5.a(v4.f.a(b4.q.f5711a, n1VarA.f19136e, null), u3.e.e(-667646267, sVar, new an.d(h0Var, cVar, n1VarA, 9)), null, null, null, 0, 0L, 0L, null, u3.e.e(685931930, sVar, new cn.x(2, h0Var, cVar, webView, bVar)), sVar, 805306416, 508);
        } else {
            sVar.U();
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bn.p(h0Var, cVar, i11, webView, bVar, 7);
        }
    }

    public static final void q(at.h0 h0Var, u3.d dVar, m3.n nVar, int i11) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(792988020);
        int i12 = (sVar.f(h0Var) ? 4 : 2) | i11;
        if (!sVar.R(i12 & 1, (i12 & 19) != 18)) {
            sVar.U();
        } else if (h0Var instanceof at.g0) {
            sVar.a0(1586106642);
            dVar.invoke(h0Var, sVar, Integer.valueOf(i12 & 126));
            sVar.q(false);
        } else if (h0Var instanceof at.e0) {
            sVar.a0(1586175431);
            dVar.invoke(((at.e0) h0Var).f4773a, sVar, 48);
            sVar.q(false);
        } else {
            sVar.a0(1586212910);
            sVar.q(false);
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new u2(h0Var, dVar, i11, 12);
        }
    }

    public static final a3.l r(a3.l lVar, a3.l lVar2, a3.p1 p1Var, long j9, a3.h0 h0Var) {
        if (h0Var != null) {
            int iCompare = p1Var.f514f.compare(Long.valueOf(h0Var.f368c), Long.valueOf(j9));
            a3.l lVar3 = iCompare < 0 ? a3.l.BEFORE : iCompare > 0 ? a3.l.AFTER : a3.l.ON;
            if (lVar3 != null) {
                return lVar3;
            }
        }
        return a3.s1.b(lVar, lVar2);
    }

    public static void s(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                drawable.setTintList(colorStateList);
            } else {
                int[] drawableState = textInputLayout.getDrawableState();
                int[] drawableState2 = checkableImageButton.getDrawableState();
                int length = drawableState.length;
                int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
                System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
                drawable.setTintList(ColorStateList.valueOf(colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                drawable.setTintMode(mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public static final void t(int i11, int i12) {
        if (i11 < 0 || i11 >= i12) {
            org.bouncycastle.jce.provider.a.v(r8.k.k("index: ", i11, i12, ", size: "));
        }
    }

    public static final void u(int i11, int i12) {
        if (i11 < 0 || i11 > i12) {
            org.bouncycastle.jce.provider.a.v(r8.k.k("index: ", i11, i12, ", size: "));
        }
    }

    public static final void v(int i11, int i12, int i13) {
        if (i11 < 0 || i12 > i13) {
            org.bouncycastle.jce.provider.a.e(i13, r8.k.r(i11, i12, "fromIndex: ", ", toIndex: ", ", size: "));
        } else {
            if (i11 <= i12) {
                return;
            }
            i4.a.f(r8.k.k("fromIndex: ", i11, i12, " > toIndex: "));
        }
    }

    public static final Object w(Function1 function1, x70.c cVar, y9.v vVar) {
        return (vVar.l() && vVar.o() && vVar.m()) ? function1.invoke(cVar) : cVar.getContext().get(y9.x.f45769a) == null ? function1.invoke(cVar) : L(function1, cVar, vVar);
    }

    public static final w2.t1 x(long j9) {
        int i11 = (int) (j9 & 4294967295L);
        if (i11 < 0) {
            return null;
        }
        return i11 == 0 ? w2.t1.Start : w2.t1.End;
    }

    public static long y(int i11, w2.t1 t1Var) {
        int i12 = -1;
        int i13 = t1Var == null ? -1 : x2.b.$EnumSwitchMapping$0[t1Var.ordinal()];
        if (i13 != -1) {
            i12 = 1;
            if (i13 == 1) {
                i12 = 0;
            } else if (i13 != 2) {
                e40.a.f();
                return 0L;
            }
        }
        return (((long) i11) << 32) | (((long) i12) & 4294967295L);
    }

    public static ImageView.ScaleType z(int i11) {
        return i11 != 0 ? i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 5 ? i11 != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE : ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_END : ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.FIT_START : ImageView.ScaleType.FIT_XY;
    }

    public abstract Object B(x70.c cVar);

    public abstract Object F(Uri uri, InputEvent inputEvent, x70.c cVar);

    public abstract Object G(Uri uri, x70.c cVar);
}
