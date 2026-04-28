package w2;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.hardware.camera2.CameraCaptureSession;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import androidx.camera.core.ProcessingException;
import androidx.camera.core.internal.compat.quirk.ImageCaptureFailedForSpecificCombinationQuirk;
import androidx.camera.core.internal.compat.quirk.PreviewGreenTintQuirk;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.e3;
import androidx.recyclerview.widget.r2;
import b0.u1;
import com.app.tgtg.R;
import com.braze.h2;
import com.facebook.FacebookException;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import java.io.File;
import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import pg.u2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class z implements OnCompleteListener, d10.f, td.h, x0.c, c20.h, cy.i0, tx.p0, i30.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f43083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f43084c;

    public z(int i11) {
        this.f43082a = i11;
        switch (i11) {
            case 6:
                this.f43083b = new AtomicInteger();
                this.f43084c = new AtomicInteger();
                break;
            case 8:
                this.f43083b = new SparseIntArray();
                this.f43084c = new SparseIntArray();
                break;
            case 9:
                this.f43083b = new q1.k1(0);
                this.f43084c = new q1.z((Object) null);
                break;
            case 10:
                this.f43083b = new u1();
                this.f43084c = w.b.r(kotlin.collections.n0.f26529a);
                break;
            case 11:
                b0.m mVar = new b0.m();
                mVar.f5304a = w.b.r(kotlin.collections.n0.f26529a);
                this.f43083b = mVar;
                this.f43084c = new z(10);
                break;
            case 14:
                this.f43083b = new o3.e(new b5.m0[16], 0);
                break;
            case 20:
                this.f43083b = new o3.e(new Reference[16], 0);
                this.f43084c = new ReferenceQueue();
                break;
            case 23:
                GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.f11044d;
                this.f43083b = new SparseIntArray();
                this.f43084c = googleApiAvailability;
                break;
            default:
                this.f43083b = (ImageCaptureFailedForSpecificCombinationQuirk) z0.a.f46383a.b(ImageCaptureFailedForSpecificCombinationQuirk.class);
                this.f43084c = (PreviewGreenTintQuirk) z0.a.f46383a.b(PreviewGreenTintQuirk.class);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [b4.s] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [b4.s] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [o3.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [o3.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v5 */
    public static void l(b5.m0 m0Var) {
        if (m0Var.Q > 0) {
            if (m0Var.H.f5931d == b5.h0.Idle && !m0Var.q() && !m0Var.r() && !m0Var.T && m0Var.J()) {
                b5.l1 l1Var = m0Var.G;
                if ((l1Var.f5860f.getAggregateChildKindSet$ui() & 256) != 0) {
                    for (b4.s child$ui = l1Var.f5860f; child$ui != null; child$ui = child$ui.getChild$ui()) {
                        if ((child$ui.getKindSet$ui() & 256) != 0) {
                            ?? B = child$ui;
                            ?? eVar = 0;
                            while (B != 0) {
                                if (B instanceof b5.s) {
                                    b5.s sVar = (b5.s) B;
                                    sVar.v(b5.m.e(sVar, 256));
                                } else if ((B.getKindSet$ui() & 256) != 0 && (B instanceof b5.n)) {
                                    b4.s child$ui2 = ((b5.n) B).f5892p;
                                    int i11 = 0;
                                    B = B;
                                    eVar = eVar;
                                    while (child$ui2 != null) {
                                        if ((child$ui2.getKindSet$ui() & 256) != 0) {
                                            i11++;
                                            eVar = eVar;
                                            if (i11 == 1) {
                                                B = child$ui2;
                                            } else {
                                                if (eVar == 0) {
                                                    eVar = new o3.e(new b4.s[16], 0);
                                                }
                                                if (B != 0) {
                                                    eVar.b(B);
                                                    B = 0;
                                                }
                                                eVar.b(child$ui2);
                                            }
                                        }
                                        child$ui2 = child$ui2.getChild$ui();
                                        B = B;
                                        eVar = eVar;
                                    }
                                    if (i11 == 1) {
                                    }
                                }
                                B = b5.m.b(eVar);
                            }
                        }
                        if ((child$ui.getAggregateChildKindSet$ui() & 256) == 0) {
                            break;
                        }
                    }
                }
            }
            m0Var.P = false;
            o3.e eVarA = m0Var.A();
            Object[] objArr = eVarA.f31830a;
            int i12 = eVarA.f31832c;
            for (int i13 = 0; i13 < i12; i13++) {
                l((b5.m0) objArr[i13]);
            }
        }
    }

    public static int s(int i11, int i12) {
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < i11; i15++) {
            i13++;
            if (i13 == i12) {
                i14++;
                i13 = 0;
            } else if (i13 > i12) {
                i14++;
                i13 = 1;
            }
        }
        return i13 + 1 > i12 ? i14 + 1 : i14;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object A(int r12, z70.c r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof bi.i
            if (r0 == 0) goto L13
            r0 = r13
            bi.i r0 = (bi.i) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            bi.i r0 = new bi.i
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.f6285j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            ba0.g.M(r13)
            u70.q r13 = (u70.q) r13
            java.lang.Object r12 = r13.f40851a
            return r12
        L2b:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r12)
            r12 = 0
            return r12
        L32:
            ba0.g.M(r13)
            java.lang.Object r13 = r11.f43083b
            zh.a r13 = (zh.a) r13
            com.app.tgtg.model.remote.user.response.charity.CharityOrderHistory r2 = new com.app.tgtg.model.remote.user.response.charity.CharityOrderHistory
            com.app.tgtg.model.remote.user.response.ItemsListPaging r4 = new com.app.tgtg.model.remote.user.response.ItemsListPaging
            r9 = 12
            r10 = 0
            r5 = 30
            r7 = 0
            r8 = 0
            r6 = r12
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r2.<init>(r4)
            r0.l = r3
            java.lang.Object r12 = r13.k(r2, r0)
            if (r12 != r1) goto L54
            return r1
        L54:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.z.A(int, z70.c):java.lang.Object");
    }

    public androidx.recyclerview.widget.r1 B(r2 r2Var, int i11) {
        e3 e3Var;
        androidx.recyclerview.widget.r1 r1Var;
        q1.k1 k1Var = (q1.k1) this.f43083b;
        int iE = k1Var.e(r2Var);
        if (iE >= 0 && (e3Var = (e3) k1Var.j(iE)) != null) {
            int i12 = e3Var.f3721a;
            if ((i12 & i11) != 0) {
                int i13 = i12 & (~i11);
                e3Var.f3721a = i13;
                if (i11 == 4) {
                    r1Var = e3Var.f3722b;
                } else {
                    if (i11 != 8) {
                        i4.a.f("Must provide flag PRE or POST");
                        return null;
                    }
                    r1Var = e3Var.f3723c;
                }
                if ((i13 & 12) == 0) {
                    k1Var.h(iE);
                    e3Var.f3721a = 0;
                    e3Var.f3722b = null;
                    e3Var.f3723c = null;
                    e3.f3720d.c(e3Var);
                }
                return r1Var;
            }
        }
        return null;
    }

    public void C(r2 r2Var) {
        e3 e3Var = (e3) ((q1.k1) this.f43083b).get(r2Var);
        if (e3Var == null) {
            return;
        }
        e3Var.f3721a &= -2;
    }

    public void D(r2 r2Var) {
        q1.z zVar = (q1.z) this.f43084c;
        int iJ = zVar.j() - 1;
        while (true) {
            if (iJ < 0) {
                break;
            }
            if (r2Var == zVar.k(iJ)) {
                Object[] objArr = zVar.f35866c;
                Object obj = objArr[iJ];
                Object obj2 = q1.a0.f35710a;
                if (obj != obj2) {
                    objArr[iJ] = obj2;
                    zVar.f35864a = true;
                }
            } else {
                iJ--;
            }
        }
        e3 e3Var = (e3) ((q1.k1) this.f43083b).remove(r2Var);
        if (e3Var != null) {
            e3Var.f3721a = 0;
            e3Var.f3722b = null;
            e3Var.f3723c = null;
            e3.f3720d.c(e3Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object E(boolean r12, boolean r13, java.lang.String r14, java.lang.String r15, java.lang.Boolean r16, z70.c r17) {
        /*
            r11 = this;
            r0 = r17
            boolean r1 = r0 instanceof bi.j
            if (r1 == 0) goto L15
            r1 = r0
            bi.j r1 = (bi.j) r1
            int r2 = r1.l
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.l = r2
            goto L1a
        L15:
            bi.j r1 = new bi.j
            r1.<init>(r11, r0)
        L1a:
            java.lang.Object r0 = r1.f6287j
            y70.a r2 = y70.a.COROUTINE_SUSPENDED
            int r3 = r1.l
            r4 = 1
            if (r3 == 0) goto L34
            if (r3 != r4) goto L2d
            ba0.g.M(r0)
            u70.q r0 = (u70.q) r0
            java.lang.Object r12 = r0.f40851a
            return r12
        L2d:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r12)
            r12 = 0
            return r12
        L34:
            ba0.g.M(r0)
            java.lang.Object r0 = r11.f43083b
            zh.a r0 = (zh.a) r0
            ai.c r5 = new ai.c
            r6 = r12
            r7 = r13
            r8 = r14
            r9 = r15
            r10 = r16
            r5.<init>(r6, r7, r8, r9, r10)
            r1.l = r4
            java.lang.Object r12 = r0.h(r5, r1)
            if (r12 != r2) goto L4f
            return r2
        L4f:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.z.E(boolean, boolean, java.lang.String, java.lang.String, java.lang.Boolean, z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object F(com.app.tgtg.model.remote.user.response.charity.CharityGeneralSchedule r5, z70.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof bi.k
            if (r0 == 0) goto L13
            r0 = r6
            bi.k r0 = (bi.k) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            bi.k r0 = new bi.k
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f6289j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            ba0.g.M(r6)
            u70.q r6 = (u70.q) r6
            java.lang.Object r5 = r6.f40851a
            return r5
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L32:
            ba0.g.M(r6)
            java.lang.Object r6 = r4.f43083b
            zh.a r6 = (zh.a) r6
            r0.l = r3
            java.lang.Object r5 = r6.f(r5, r0)
            if (r5 != r1) goto L42
            return r1
        L42:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.z.F(com.app.tgtg.model.remote.user.response.charity.CharityGeneralSchedule, z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object G(java.lang.String r5, z70.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof bi.l
            if (r0 == 0) goto L13
            r0 = r6
            bi.l r0 = (bi.l) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            bi.l r0 = new bi.l
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f6291j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            ba0.g.M(r6)
            u70.q r6 = (u70.q) r6
            java.lang.Object r5 = r6.f40851a
            return r5
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L32:
            ba0.g.M(r6)
            java.lang.Object r6 = r4.f43083b
            zh.a r6 = (zh.a) r6
            r0.l = r3
            java.lang.Object r5 = r6.g(r5, r0)
            if (r5 != r1) goto L42
            return r1
        L42:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.z.G(java.lang.String, z70.c):java.lang.Object");
    }

    public int H(Context context, com.google.android.gms.common.api.f fVar) {
        int i11;
        com.google.android.gms.common.internal.i0.h(context);
        com.google.android.gms.common.internal.i0.h(fVar);
        int iB = 0;
        if (!fVar.requiresGooglePlayServices()) {
            return 0;
        }
        int minApkVersion = fVar.getMinApkVersion();
        SparseIntArray sparseIntArray = (SparseIntArray) this.f43083b;
        synchronized (sparseIntArray) {
            i11 = sparseIntArray.get(minApkVersion, -1);
        }
        if (i11 != -1) {
            return i11;
        }
        SparseIntArray sparseIntArray2 = (SparseIntArray) this.f43083b;
        synchronized (sparseIntArray2) {
            int i12 = 0;
            while (true) {
                try {
                    if (i12 >= sparseIntArray2.size()) {
                        iB = -1;
                        break;
                    }
                    int iKeyAt = sparseIntArray2.keyAt(i12);
                    if (iKeyAt > minApkVersion && sparseIntArray2.get(iKeyAt) == 0) {
                        break;
                    }
                    i12++;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (iB == -1) {
                iB = ((GoogleApiAvailability) this.f43084c).b(context, minApkVersion);
            }
            sparseIntArray2.put(minApkVersion, iB);
        }
        return iB;
    }

    @Override // i30.h
    public Object a() {
        return new d30.e(((i30.g) this.f43083b).f23220a, (i30.n) ((i30.e) this.f43084c).a(), new d30.b(4));
    }

    @Override // c20.h
    public int b() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        a50.c cVar = (a50.c) this.f43083b;
        ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) this.f43084c;
        if (!(extendedFloatingActionButton.getParent() instanceof View)) {
            return cVar.b();
        }
        View view = (View) extendedFloatingActionButton.getParent();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null || layoutParams.width != -2) {
            return (view.getWidth() - ((!(extendedFloatingActionButton.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) extendedFloatingActionButton.getLayoutParams()) == null) ? 0 : marginLayoutParams.leftMargin + marginLayoutParams.rightMargin)) - (view.getPaddingRight() + view.getPaddingLeft());
        }
        return cVar.b();
    }

    @Override // c20.h
    public int c() {
        return ((ExtendedFloatingActionButton) this.f43084c).f12452i;
    }

    public void d(r2 r2Var, androidx.recyclerview.widget.r1 r1Var) {
        q1.k1 k1Var = (q1.k1) this.f43083b;
        e3 e3VarA = (e3) k1Var.get(r2Var);
        if (e3VarA == null) {
            e3VarA = e3.a();
            k1Var.put(r2Var, e3VarA);
        }
        e3VarA.f3723c = r1Var;
        e3VarA.f3721a |= 8;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Enum e(java.lang.String r8, z70.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof bi.a
            if (r0 == 0) goto L13
            r0 = r9
            bi.a r0 = (bi.a) r0
            int r1 = r0.f6270n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6270n = r1
            goto L18
        L13:
            bi.a r0 = new bi.a
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.l
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f6270n
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L42
            if (r2 == r4) goto L38
            if (r2 != r3) goto L32
            com.app.tgtg.model.remote.order.CancelOrderState r8 = r0.f6268k
            ba0.g.M(r9)
            u70.q r9 = (u70.q) r9
            r9.getClass()
            return r8
        L32:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r8)
            return r5
        L38:
            java.lang.String r8 = r0.f6267j
            ba0.g.M(r9)
            u70.q r9 = (u70.q) r9
            java.lang.Object r9 = r9.f40851a
            goto L5b
        L42:
            ba0.g.M(r9)
            java.lang.Object r9 = r7.f43083b
            zh.a r9 = (zh.a) r9
            com.app.tgtg.model.remote.order.request.CancelOrderRequest r2 = new com.app.tgtg.model.remote.order.request.CancelOrderRequest
            java.lang.String r6 = "1"
            r2.<init>(r6)
            r0.f6267j = r8
            r0.f6270n = r4
            java.lang.Object r9 = r9.e(r8, r2, r0)
            if (r9 != r1) goto L5b
            goto L7a
        L5b:
            u70.o r2 = u70.q.f40850b
            boolean r2 = r9 instanceof u70.p
            if (r2 == 0) goto L62
            r9 = r5
        L62:
            com.app.tgtg.model.remote.order.response.CancelOrderResponse r9 = (com.app.tgtg.model.remote.order.response.CancelOrderResponse) r9
            if (r9 == 0) goto L6b
            com.app.tgtg.model.remote.order.CancelOrderState r9 = r9.getState()
            goto L6c
        L6b:
            r9 = r5
        L6c:
            if (r9 == 0) goto L7b
            r0.f6267j = r5
            r0.f6268k = r9
            r0.f6270n = r3
            java.lang.Object r8 = r7.n(r8, r0)
            if (r8 != r1) goto L7b
        L7a:
            return r1
        L7b:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.z.e(java.lang.String, z70.c):java.lang.Enum");
    }

    @Override // cy.i0
    public Activity f() {
        return (Activity) this.f43084c;
    }

    @Override // c20.h
    public ViewGroup.LayoutParams g() {
        int i11 = ((ExtendedFloatingActionButton) this.f43084c).f12458p;
        if (i11 == 0) {
            i11 = -2;
        }
        return new ViewGroup.LayoutParams(-1, i11);
    }

    @Override // c20.h
    public int getHeight() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) ((a50.c) this.f43083b).f822b;
        ExtendedFloatingActionButton extendedFloatingActionButton2 = (ExtendedFloatingActionButton) this.f43084c;
        int i11 = extendedFloatingActionButton2.f12458p;
        if (i11 != -1) {
            return (i11 == 0 || i11 == -2) ? extendedFloatingActionButton.getMeasuredHeight() : i11;
        }
        if (!(extendedFloatingActionButton2.getParent() instanceof View)) {
            return extendedFloatingActionButton.getMeasuredHeight();
        }
        View view = (View) extendedFloatingActionButton2.getParent();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null || layoutParams.height != -2) {
            return (view.getHeight() - ((!(extendedFloatingActionButton2.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) extendedFloatingActionButton2.getLayoutParams()) == null) ? 0 : marginLayoutParams.topMargin + marginLayoutParams.bottomMargin)) - (view.getPaddingBottom() + view.getPaddingTop());
        }
        return extendedFloatingActionButton.getMeasuredHeight();
    }

    @Override // d10.f
    public Task h(Object obj) {
        Boolean bool = (Boolean) obj;
        a40.o oVar = (a40.o) this.f43084c;
        if (bool.booleanValue()) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Sending cached crash reports...", null);
            }
            boolean zBooleanValue = bool.booleanValue();
            a40.x xVar = oVar.f748b;
            if (zBooleanValue) {
                ((d10.g) xVar.f810h).d(null);
                return ((Task) this.f43083b).o(oVar.f751e.f5742a, new a50.c(this, 3));
            }
            xVar.getClass();
            h2.b("An invalid data collection token was used.");
            return null;
        }
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Deleting cached crash reports...", null);
        }
        g40.b bVar = oVar.f753g;
        Iterator it = g40.b.m(((File) bVar.f20002c).listFiles(a40.o.f745r)).iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
        g40.b bVar2 = ((g40.a) oVar.f758m.f20001b).f19997b;
        g40.a.a(g40.b.m(((File) bVar2.f20004e).listFiles()));
        g40.a.a(g40.b.m(((File) bVar2.f20005f).listFiles()));
        g40.a.a(g40.b.m(((File) bVar2.f20006g).listFiles()));
        oVar.f762q.d(null);
        return Tasks.d(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object i(java.util.List r5, z70.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof bi.b
            if (r0 == 0) goto L13
            r0 = r6
            bi.b r0 = (bi.b) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            bi.b r0 = new bi.b
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f6271j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            ba0.g.M(r6)
            u70.q r6 = (u70.q) r6
            java.lang.Object r5 = r6.f40851a
            return r5
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L32:
            ba0.g.M(r6)
            java.lang.Object r6 = r4.f43083b
            zh.a r6 = (zh.a) r6
            com.app.tgtg.model.remote.user.response.charity.CharityBulkCancelOrder r2 = new com.app.tgtg.model.remote.user.response.charity.CharityBulkCancelOrder
            r2.<init>(r5)
            r0.l = r3
            java.lang.Object r5 = r6.j(r2, r0)
            if (r5 != r1) goto L47
            return r1
        L47:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.z.i(java.util.List, z70.c):java.lang.Object");
    }

    public void j() {
        String str = (String) this.f43083b;
        try {
            g40.b bVar = (g40.b) this.f43084c;
            bVar.getClass();
            new File((File) bVar.f20002c, str).createNewFile();
        } catch (IOException e5) {
            Log.e("FirebaseCrashlytics", "Error creating marker: ".concat(str), e5);
        }
    }

    @Override // c20.h
    public int k() {
        return ((ExtendedFloatingActionButton) this.f43084c).f12451h;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m(z70.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof bi.c
            if (r0 == 0) goto L13
            r0 = r5
            bi.c r0 = (bi.c) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            bi.c r0 = new bi.c
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f6273j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            ba0.g.M(r5)
            u70.q r5 = (u70.q) r5
            java.lang.Object r5 = r5.f40851a
            return r5
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L32:
            ba0.g.M(r5)
            java.lang.Object r5 = r4.f43083b
            zh.a r5 = (zh.a) r5
            r0.l = r3
            java.lang.Object r5 = r5.i(r0)
            if (r5 != r1) goto L42
            return r1
        L42:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.z.m(z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object n(java.lang.String r5, z70.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof bi.d
            if (r0 == 0) goto L13
            r0 = r6
            bi.d r0 = (bi.d) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            bi.d r0 = new bi.d
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f6275j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            ba0.g.M(r6)
            u70.q r6 = (u70.q) r6
            java.lang.Object r5 = r6.f40851a
            return r5
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L32:
            ba0.g.M(r6)
            java.lang.Object r6 = r4.f43083b
            zh.a r6 = (zh.a) r6
            r0.l = r3
            java.lang.Object r5 = r6.l(r5, r0)
            if (r5 != r1) goto L42
            return r1
        L42:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.z.n(java.lang.String, z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object o(java.lang.String r5, z70.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof bi.e
            if (r0 == 0) goto L13
            r0 = r6
            bi.e r0 = (bi.e) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            bi.e r0 = new bi.e
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f6277j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            ba0.g.M(r6)
            u70.q r6 = (u70.q) r6
            java.lang.Object r5 = r6.f40851a
            return r5
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L32:
            ba0.g.M(r6)
            java.lang.Object r6 = r4.f43083b
            zh.a r6 = (zh.a) r6
            r0.l = r3
            java.lang.Object r5 = r6.b(r5, r0)
            if (r5 != r1) goto L42
            return r1
        L42:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.z.o(java.lang.String, z70.c):java.lang.Object");
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        a30.p pVar = (a30.p) this.f43083b;
        d10.g gVar = (d10.g) this.f43084c;
        synchronized (pVar.f673f) {
            pVar.f672e.remove(gVar);
        }
    }

    @Override // td.h
    public void onError() {
        ImageView imageView = ((u2) this.f43083b).f35194u;
        imageView.getClass();
        fd.t tVarA = fd.w.a(imageView.getContext());
        td.e eVar = new td.e(imageView.getContext());
        eVar.f39959c = 2131232043;
        td.k.b(eVar, imageView);
        tVarA.a(eVar.a());
        td.e eVar2 = (td.e) this.f43084c;
        yd.b[] bVarArr = {new yd.a()};
        fd.j jVar = td.j.f40016a;
        td.j.a(eVar2, kotlin.collections.y.T(bVarArr));
    }

    @Override // x0.c
    public void onFailure(Throwable th2) {
        switch (this.f43082a) {
            case 17:
                int i11 = ((c1.n) this.f43083b).f6901f;
                if (i11 == 2 && (th2 instanceof CancellationException)) {
                    wd.a.p("SurfaceProcessorNode", "Downstream VideoCapture failed to provide Surface.");
                } else {
                    wd.a.J("SurfaceProcessorNode", "Downstream node failed to provide Surface. Target: " + v0.n.z(i11), th2);
                }
                break;
            default:
                int i12 = ((c1.n) this.f43083b).f6901f;
                if (i12 == 2 && (th2 instanceof CancellationException)) {
                    wd.a.p("DualSurfaceProcessorNode", "Downstream VideoCapture failed to provide Surface.");
                } else {
                    wd.a.J("DualSurfaceProcessorNode", "Downstream node failed to provide Surface. Target: " + v0.n.z(i12), th2);
                }
                break;
        }
    }

    @Override // x0.c
    public void onSuccess(Object obj) {
        switch (this.f43082a) {
            case 17:
                c1.o oVar = (c1.o) obj;
                oVar.getClass();
                try {
                    ((c1.e) ((a8.h) this.f43084c).f973b).c(oVar);
                } catch (ProcessingException e5) {
                    wd.a.s("SurfaceProcessorNode", "Failed to send SurfaceOutput to SurfaceProcessor.", e5);
                    return;
                }
                break;
            default:
                c1.o oVar2 = (c1.o) obj;
                oVar2.getClass();
                try {
                    ((c1.p) ((androidx.lifecycle.n1) this.f43084c).f3499a).c(oVar2);
                } catch (ProcessingException e11) {
                    wd.a.s("DualSurfaceProcessorNode", "Failed to send SurfaceOutput to SurfaceProcessor.", e11);
                }
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object p(z70.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof bi.f
            if (r0 == 0) goto L13
            r0 = r5
            bi.f r0 = (bi.f) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            bi.f r0 = new bi.f
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f6279j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            ba0.g.M(r5)
            u70.q r5 = (u70.q) r5
            java.lang.Object r5 = r5.f40851a
            return r5
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L32:
            ba0.g.M(r5)
            java.lang.Object r5 = r4.f43083b
            zh.a r5 = (zh.a) r5
            r0.l = r3
            java.lang.Object r5 = r5.c(r0)
            if (r5 != r1) goto L42
            return r1
        L42:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.z.p(z70.c):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, u70.j] */
    public InputMethodManager q() {
        return (InputMethodManager) this.f43084c.getValue();
    }

    public z4.u0 r() {
        return (z4.u0) ((m3.k1) this.f43084c).getValue();
    }

    @Override // cy.i0
    public void startActivityForResult(Intent intent, int i11) {
        oz.m mVar = (oz.m) this.f43083b;
        Fragment fragment = (Fragment) mVar.f33836b;
        if (fragment != null) {
            fragment.startActivityForResult(intent, i11);
            return;
        }
        android.app.Fragment fragment2 = (android.app.Fragment) mVar.f33837c;
        if (fragment2 != null) {
            fragment2.startActivityForResult(intent, i11);
        }
    }

    public String t(String str) {
        String str2 = (String) this.f43084c;
        Resources resources = (Resources) this.f43083b;
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object u(z70.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof bi.g
            if (r0 == 0) goto L13
            r0 = r5
            bi.g r0 = (bi.g) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            bi.g r0 = new bi.g
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f6281j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            ba0.g.M(r5)
            u70.q r5 = (u70.q) r5
            java.lang.Object r5 = r5.f40851a
            return r5
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L32:
            ba0.g.M(r5)
            java.lang.Object r5 = r4.f43083b
            zh.a r5 = (zh.a) r5
            r0.l = r3
            java.lang.Object r5 = r5.a(r0)
            if (r5 != r1) goto L42
            return r1
        L42:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.z.u(z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object v(java.util.Date r6, java.util.Date r7, z70.c r8) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f43084c
            java.text.SimpleDateFormat r0 = (java.text.SimpleDateFormat) r0
            boolean r1 = r8 instanceof bi.h
            if (r1 == 0) goto L17
            r1 = r8
            bi.h r1 = (bi.h) r1
            int r2 = r1.l
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.l = r2
            goto L1c
        L17:
            bi.h r1 = new bi.h
            r1.<init>(r5, r8)
        L1c:
            java.lang.Object r8 = r1.f6283j
            y70.a r2 = y70.a.COROUTINE_SUSPENDED
            int r3 = r1.l
            r4 = 1
            if (r3 == 0) goto L36
            if (r3 != r4) goto L2f
            ba0.g.M(r8)
            u70.q r8 = (u70.q) r8
            java.lang.Object r6 = r8.f40851a
            return r6
        L2f:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r6)
            r6 = 0
            return r6
        L36:
            ba0.g.M(r8)
            java.lang.Object r8 = r5.f43083b
            zh.a r8 = (zh.a) r8
            com.app.tgtg.model.remote.user.requests.CharityScheduleRequest r3 = new com.app.tgtg.model.remote.user.requests.CharityScheduleRequest
            java.lang.String r6 = r0.format(r6)
            r6.getClass()
            java.lang.String r7 = r0.format(r7)
            r7.getClass()
            r3.<init>(r6, r7)
            r1.l = r4
            java.lang.Object r6 = r8.d(r3, r1)
            if (r6 != r2) goto L59
            return r2
        L59:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.z.v(java.util.Date, java.util.Date, z70.c):java.lang.Object");
    }

    public void w() {
        ((SparseIntArray) this.f43083b).clear();
    }

    public void x(String str) {
        str.getClass();
        Iterator it = ((List) ((r80.d) this.f43084c).f37785a).iterator();
        while (it.hasNext()) {
            ((CameraCaptureSession.StateCallback) it.next()).onClosed((u1) this.f43083b);
        }
    }

    public void y(String str) {
        str.getClass();
        Iterator it = ((List) ((r80.d) this.f43084c).f37785a).iterator();
        while (it.hasNext()) {
            ((CameraCaptureSession.StateCallback) it.next()).onConfigureFailed((u1) this.f43083b);
        }
    }

    public void z(String str) {
        str.getClass();
        Iterator it = ((List) ((r80.d) this.f43084c).f37785a).iterator();
        while (it.hasNext()) {
            ((CameraCaptureSession.StateCallback) it.next()).onConfigured((u1) this.f43083b);
        }
    }

    @Override // tx.p0
    public void a(Bundle bundle, FacebookException facebookException) {
        cy.l0 l0Var = (cy.l0) this.f43083b;
        cy.r rVar = (cy.r) this.f43084c;
        rVar.getClass();
        l0Var.s(rVar, bundle, facebookException);
    }

    public z(i30.g gVar, i30.e eVar, d30.b bVar) {
        this.f43082a = 27;
        this.f43083b = gVar;
        this.f43084c = eVar;
    }

    public /* synthetic */ z(Object obj, Object obj2, boolean z11, int i11) {
        this.f43082a = i11;
        this.f43084c = obj;
        this.f43083b = obj2;
    }

    public z(Context context) {
        this.f43082a = 22;
        com.google.android.gms.common.internal.i0.h(context);
        Resources resources = context.getResources();
        this.f43083b = resources;
        this.f43084c = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
    }

    public z(zh.a aVar) {
        this.f43082a = 15;
        this.f43083b = aVar;
        this.f43084c = new SimpleDateFormat("yyyy-MM-dd");
    }

    public z(b5.m0 m0Var, z4.u0 u0Var) {
        this.f43082a = 12;
        this.f43083b = m0Var;
        this.f43084c = m3.i.w(u0Var);
    }

    public /* synthetic */ z(int i11, Object obj, Object obj2) {
        this.f43082a = i11;
        this.f43083b = obj;
        this.f43084c = obj2;
    }

    public z(lv.r rVar, lv.q qVar, lv.e eVar) {
        Object obj;
        Object obj2;
        this.f43082a = 29;
        rVar.getClass();
        qVar.getClass();
        eVar.getClass();
        int i11 = dg.a.$EnumSwitchMapping$0[eVar.ordinal()];
        if (i11 == 1) {
            obj = lv.a.f28172h;
        } else if (i11 == 2) {
            obj = lv.b.f28174h;
        } else if (i11 == 3) {
            obj = lv.c.f28176h;
        } else {
            e40.a.f();
            throw null;
        }
        this.f43083b = obj;
        int i12 = dg.a.$EnumSwitchMapping$2[rVar.ordinal()];
        if (i12 == 1) {
            int i13 = dg.a.$EnumSwitchMapping$1[qVar.ordinal()];
            if (i13 == 1) {
                obj2 = lv.i.f28195d;
            } else if (i13 == 2) {
                obj2 = lv.g.f28191d;
            } else if (i13 != 3) {
                obj2 = lv.i.f28195d;
            } else {
                obj2 = lv.h.f28193d;
            }
        } else if (i12 == 2) {
            int i14 = dg.a.$EnumSwitchMapping$1[qVar.ordinal()];
            if (i14 == 1) {
                obj2 = lv.l.f28201d;
            } else if (i14 == 2) {
                obj2 = lv.j.f28197d;
            } else if (i14 != 3) {
                obj2 = lv.l.f28201d;
            } else {
                obj2 = lv.k.f28199d;
            }
        } else if (i12 == 3) {
            int i15 = dg.a.$EnumSwitchMapping$1[qVar.ordinal()];
            if (i15 == 1) {
                obj2 = lv.p.f28209d;
            } else if (i15 == 2) {
                obj2 = lv.m.f28203d;
            } else if (i15 == 3) {
                obj2 = lv.o.f28207d;
            } else if (i15 != 4) {
                obj2 = lv.p.f28209d;
            } else {
                obj2 = lv.n.f28205d;
            }
        } else {
            e40.a.f();
            throw null;
        }
        this.f43084c = obj2;
    }

    public z(View view) {
        this.f43082a = 0;
        this.f43083b = view;
        this.f43084c = u70.l.a(u70.m.NONE, new rv.a(this, 22));
    }

    public z(oz.m mVar) {
        Activity activity;
        this.f43082a = 24;
        this.f43083b = mVar;
        Fragment fragment = (Fragment) mVar.f33836b;
        if (fragment != null) {
            activity = fragment.getActivity();
        } else {
            android.app.Fragment fragment2 = (android.app.Fragment) mVar.f33837c;
            activity = fragment2 != null ? fragment2.getActivity() : null;
        }
        this.f43084c = activity;
    }
}
