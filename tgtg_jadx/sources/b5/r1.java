package b5;

import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelProvider$Factory;
import c5.d3;
import c5.q3;
import com.app.tgtg.feature.postpurchase.email.AddEmailFragment;
import com.app.tgtg.feature.postpurchase.notification.AddReminderFragment;
import com.app.tgtg.feature.postpurchase.phone.AddPhoneNumberFragment;
import com.app.tgtg.feature.postpurchase.specialrewards.SpecialRewardCelebrationFragment;
import com.app.tgtg.feature.postpurchase.success.purchase.ui.PurchaseSuccessFragment;
import com.app.tgtg.feature.tabprofile.storelogin.ui.RecommendStoreFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class r1 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5958c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r1(int i11, Object obj, Object obj2) {
        super(0);
        this.f5956a = i11;
        this.f5957b = obj;
        this.f5958c = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v107, types: [java.lang.Object, u70.j] */
    /* JADX WARN: Type inference failed for: r0v117, types: [java.lang.Object, u70.j] */
    /* JADX WARN: Type inference failed for: r0v127, types: [java.lang.Object, u70.j] */
    /* JADX WARN: Type inference failed for: r0v140, types: [java.lang.Object, u70.j] */
    /* JADX WARN: Type inference failed for: r0v150, types: [java.lang.Object, u70.j] */
    /* JADX WARN: Type inference failed for: r0v162, types: [java.lang.Object, u70.j] */
    /* JADX WARN: Type inference failed for: r0v172, types: [java.lang.Object, u70.j] */
    /* JADX WARN: Type inference failed for: r0v182, types: [java.lang.Object, u70.j] */
    /* JADX WARN: Type inference failed for: r0v192, types: [java.lang.Object, u70.j] */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Object, u70.j] */
    /* JADX WARN: Type inference failed for: r0v67, types: [java.lang.Object, u70.j] */
    /* JADX WARN: Type inference failed for: r0v77, types: [java.lang.Object, u70.j] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, u70.j] */
    /* JADX WARN: Type inference failed for: r0v87, types: [java.lang.Object, u70.j] */
    /* JADX WARN: Type inference failed for: r0v97, types: [java.lang.Object, u70.j] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ViewModelProvider$Factory defaultViewModelProviderFactory;
        j5.t tVar;
        m0 m0Var;
        ViewModelProvider$Factory defaultViewModelProviderFactory2;
        h4.c cVar;
        ViewModelProvider$Factory defaultViewModelProviderFactory3;
        ViewModelProvider$Factory defaultViewModelProviderFactory4;
        ViewModelProvider$Factory defaultViewModelProviderFactory5;
        ViewModelProvider$Factory defaultViewModelProviderFactory6;
        ViewModelProvider$Factory defaultViewModelProviderFactory7;
        ViewModelProvider$Factory defaultViewModelProviderFactory8;
        ViewModelProvider$Factory defaultViewModelProviderFactory9;
        ViewModelProvider$Factory defaultViewModelProviderFactory10;
        ViewModelProvider$Factory defaultViewModelProviderFactory11;
        ViewModelProvider$Factory defaultViewModelProviderFactory12;
        ViewModelProvider$Factory defaultViewModelProviderFactory13;
        ViewModelProvider$Factory defaultViewModelProviderFactory14;
        ViewModelProvider$Factory defaultViewModelProviderFactory15;
        switch (this.f5956a) {
            case 0:
                Function1 function1 = (Function1) this.f5957b;
                i4.s0 s0Var = s1.Q;
                function1.invoke(s0Var);
                s1 s1Var = (s1) this.f5958c;
                i4.v0 v0Var = s1Var.E;
                i4.v0 v0Var2 = s0Var.f23295o;
                boolean z11 = v0Var != v0Var2;
                boolean z12 = s1Var.F;
                boolean z13 = s0Var.f23296p;
                boolean z14 = z12 != z13;
                if (z11 || z14) {
                    s1Var.E = v0Var2;
                    s1Var.F = z13;
                    if (s1Var.G && (z14 || (z13 && z11))) {
                        s1Var.f5966p.G();
                    }
                }
                s1Var.G = true;
                s0Var.f23301u = s0Var.f23295o.a(s0Var.f23297q, s0Var.f23299s, s0Var.f23298r);
                return Unit.f26487a;
            case 1:
                androidx.lifecycle.s1 s1Var2 = (androidx.lifecycle.s1) this.f5958c.getValue();
                androidx.lifecycle.p pVar = s1Var2 instanceof androidx.lifecycle.p ? (androidx.lifecycle.p) s1Var2 : null;
                return (pVar == null || (defaultViewModelProviderFactory = pVar.getDefaultViewModelProviderFactory()) == null) ? ((bl.d) this.f5957b).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
            case 2:
                return Boolean.valueOf(super/*android.view.ViewGroup*/.dispatchKeyEvent((KeyEvent) this.f5958c));
            case 3:
                return Boolean.valueOf(super/*android.view.View*/.dispatchGenericMotionEvent((MotionEvent) this.f5958c));
            case 4:
                c5.f0 f0Var = (c5.f0) this.f5958c;
                d3 d3Var = (d3) this.f5957b;
                j5.k kVar = d3Var.f7165e;
                j5.k kVar2 = d3Var.f7166f;
                Float f11 = d3Var.f7163c;
                Float f12 = d3Var.f7164d;
                float fFloatValue = (kVar == null || f11 == null) ? 0.0f : ((Number) kVar.f24633a.invoke()).floatValue() - f11.floatValue();
                float fFloatValue2 = (kVar2 == null || f12 == null) ? 0.0f : ((Number) kVar2.f24633a.invoke()).floatValue() - f12.floatValue();
                if (fFloatValue != 0.0f || fFloatValue2 != 0.0f) {
                    int iS = f0Var.s(d3Var.f7161a);
                    j5.u uVar = (j5.u) f0Var.j().b(f0Var.f7200i);
                    if (uVar != null) {
                        try {
                            AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = f0Var.f7202k;
                            if (accessibilityNodeInfoCompat != null) {
                                accessibilityNodeInfoCompat.e0(f0Var.b(uVar));
                            }
                            break;
                        } catch (IllegalStateException unused) {
                        }
                    }
                    j5.u uVar2 = (j5.u) f0Var.j().b(f0Var.f7201j);
                    if (uVar2 != null) {
                        try {
                            AccessibilityNodeInfoCompat accessibilityNodeInfoCompat2 = f0Var.l;
                            if (accessibilityNodeInfoCompat2 != null) {
                                accessibilityNodeInfoCompat2.e0(f0Var.b(uVar2));
                            }
                            break;
                        } catch (IllegalStateException unused2) {
                        }
                    }
                    f0Var.f7192a.invalidate();
                    j5.u uVar3 = (j5.u) f0Var.j().b(iS);
                    if (uVar3 != null && (tVar = uVar3.f24700a) != null && (m0Var = tVar.f24695c) != null) {
                        if (kVar != null) {
                            f0Var.f7204n.i(iS, kVar);
                        }
                        if (kVar2 != null) {
                            f0Var.f7205o.i(iS, kVar2);
                        }
                        f0Var.o(m0Var);
                    }
                }
                if (kVar != null) {
                    d3Var.f7163c = (Float) kVar.f24633a.invoke();
                }
                if (kVar2 != null) {
                    d3Var.f7164d = (Float) kVar2.f24633a.invoke();
                }
                return Unit.f26487a;
            case 5:
                ((c5.a) this.f5957b).removeOnAttachStateChangeListener((q3) this.f5958c);
                return Unit.f26487a;
            case 6:
                ((Lifecycle) this.f5957b).d((androidx.lifecycle.s) this.f5958c);
                return Unit.f26487a;
            case 7:
                androidx.lifecycle.s1 s1Var3 = (androidx.lifecycle.s1) this.f5958c.getValue();
                androidx.lifecycle.p pVar2 = s1Var3 instanceof androidx.lifecycle.p ? (androidx.lifecycle.p) s1Var3 : null;
                return (pVar2 == null || (defaultViewModelProviderFactory2 = pVar2.getDefaultViewModelProviderFactory()) == null) ? ((eo.f) this.f5957b).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory2;
            case 8:
                ((f4.b) this.f5957b).f17291r.invoke((f4.c) this.f5958c);
                return Unit.f26487a;
            case 9:
                Function0 function0 = (Function0) this.f5957b;
                if (function0 != null && (cVar = (h4.c) function0.invoke()) != null) {
                    return cVar;
                }
                s1 s1Var4 = (s1) this.f5958c;
                if (!s1Var4.n()) {
                    s1Var4 = null;
                }
                if (s1Var4 != null) {
                    return na0.a.S(0L, b0.z.z(s1Var4.f47185c));
                }
                return null;
            case 10:
                androidx.lifecycle.s1 s1Var5 = (androidx.lifecycle.s1) this.f5958c.getValue();
                androidx.lifecycle.p pVar3 = s1Var5 instanceof androidx.lifecycle.p ? (androidx.lifecycle.p) s1Var5 : null;
                return (pVar3 == null || (defaultViewModelProviderFactory3 = pVar3.getDefaultViewModelProviderFactory()) == null) ? ((hn.b) this.f5957b).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory3;
            case 11:
                androidx.lifecycle.s1 s1Var6 = (androidx.lifecycle.s1) this.f5958c.getValue();
                androidx.lifecycle.p pVar4 = s1Var6 instanceof androidx.lifecycle.p ? (androidx.lifecycle.p) s1Var6 : null;
                return (pVar4 == null || (defaultViewModelProviderFactory4 = pVar4.getDefaultViewModelProviderFactory()) == null) ? ((mn.c) this.f5957b).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory4;
            case 12:
                androidx.lifecycle.s1 s1Var7 = (androidx.lifecycle.s1) this.f5958c.getValue();
                androidx.lifecycle.p pVar5 = s1Var7 instanceof androidx.lifecycle.p ? (androidx.lifecycle.p) s1Var7 : null;
                return (pVar5 == null || (defaultViewModelProviderFactory5 = pVar5.getDefaultViewModelProviderFactory()) == null) ? ((ng.d) this.f5957b).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory5;
            case 13:
                androidx.lifecycle.s1 s1Var8 = (androidx.lifecycle.s1) this.f5958c.getValue();
                androidx.lifecycle.p pVar6 = s1Var8 instanceof androidx.lifecycle.p ? (androidx.lifecycle.p) s1Var8 : null;
                return (pVar6 == null || (defaultViewModelProviderFactory6 = pVar6.getDefaultViewModelProviderFactory()) == null) ? ((AddEmailFragment) this.f5957b).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory6;
            case 14:
                androidx.lifecycle.s1 s1Var9 = (androidx.lifecycle.s1) this.f5958c.getValue();
                androidx.lifecycle.p pVar7 = s1Var9 instanceof androidx.lifecycle.p ? (androidx.lifecycle.p) s1Var9 : null;
                return (pVar7 == null || (defaultViewModelProviderFactory7 = pVar7.getDefaultViewModelProviderFactory()) == null) ? ((uk.c) this.f5957b).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory7;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                androidx.lifecycle.s1 s1Var10 = (androidx.lifecycle.s1) this.f5958c.getValue();
                androidx.lifecycle.p pVar8 = s1Var10 instanceof androidx.lifecycle.p ? (androidx.lifecycle.p) s1Var10 : null;
                return (pVar8 == null || (defaultViewModelProviderFactory8 = pVar8.getDefaultViewModelProviderFactory()) == null) ? ((AddReminderFragment) this.f5957b).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory8;
            case 16:
                androidx.lifecycle.s1 s1Var11 = (androidx.lifecycle.s1) this.f5958c.getValue();
                androidx.lifecycle.p pVar9 = s1Var11 instanceof androidx.lifecycle.p ? (androidx.lifecycle.p) s1Var11 : null;
                return (pVar9 == null || (defaultViewModelProviderFactory9 = pVar9.getDefaultViewModelProviderFactory()) == null) ? ((AddPhoneNumberFragment) this.f5957b).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory9;
            case 17:
                ((w4.c) this.f5957b).d((b4.s) this.f5958c);
                return Unit.f26487a;
            case 18:
                androidx.lifecycle.s1 s1Var12 = (androidx.lifecycle.s1) this.f5958c.getValue();
                androidx.lifecycle.p pVar10 = s1Var12 instanceof androidx.lifecycle.p ? (androidx.lifecycle.p) s1Var12 : null;
                return (pVar10 == null || (defaultViewModelProviderFactory10 = pVar10.getDefaultViewModelProviderFactory()) == null) ? ((SpecialRewardCelebrationFragment) this.f5957b).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory10;
            case 19:
                androidx.lifecycle.s1 s1Var13 = (androidx.lifecycle.s1) this.f5958c.getValue();
                androidx.lifecycle.p pVar11 = s1Var13 instanceof androidx.lifecycle.p ? (androidx.lifecycle.p) s1Var13 : null;
                return (pVar11 == null || (defaultViewModelProviderFactory11 = pVar11.getDefaultViewModelProviderFactory()) == null) ? ((xj.d) this.f5957b).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory11;
            case 20:
                ye.b bVar = (ye.b) this.f5958c;
                ye.g gVar = (ye.g) this.f5957b;
                return new ye.c(gVar.f45906v, gVar.f45902r, gVar.f45904t ? (tf.c) bVar.f45866p.getValue() : null, bVar.f(), bVar.c());
            case 21:
                androidx.lifecycle.s1 s1Var14 = (androidx.lifecycle.s1) this.f5958c.getValue();
                androidx.lifecycle.p pVar12 = s1Var14 instanceof androidx.lifecycle.p ? (androidx.lifecycle.p) s1Var14 : null;
                return (pVar12 == null || (defaultViewModelProviderFactory12 = pVar12.getDefaultViewModelProviderFactory()) == null) ? ((yi.f0) this.f5957b).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory12;
            case 22:
                androidx.lifecycle.s1 s1Var15 = (androidx.lifecycle.s1) this.f5958c.getValue();
                androidx.lifecycle.p pVar13 = s1Var15 instanceof androidx.lifecycle.p ? (androidx.lifecycle.p) s1Var15 : null;
                return (pVar13 == null || (defaultViewModelProviderFactory13 = pVar13.getDefaultViewModelProviderFactory()) == null) ? ((ym.u) this.f5957b).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory13;
            case 23:
                androidx.lifecycle.s1 s1Var16 = (androidx.lifecycle.s1) this.f5958c.getValue();
                androidx.lifecycle.p pVar14 = s1Var16 instanceof androidx.lifecycle.p ? (androidx.lifecycle.p) s1Var16 : null;
                return (pVar14 == null || (defaultViewModelProviderFactory14 = pVar14.getDefaultViewModelProviderFactory()) == null) ? ((PurchaseSuccessFragment) this.f5957b).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory14;
            default:
                androidx.lifecycle.s1 s1Var17 = (androidx.lifecycle.s1) this.f5958c.getValue();
                androidx.lifecycle.p pVar15 = s1Var17 instanceof androidx.lifecycle.p ? (androidx.lifecycle.p) s1Var17 : null;
                return (pVar15 == null || (defaultViewModelProviderFactory15 = pVar15.getDefaultViewModelProviderFactory()) == null) ? ((RecommendStoreFragment) this.f5957b).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory15;
        }
    }
}
