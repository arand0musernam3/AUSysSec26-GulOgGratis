package d6;

import android.graphics.Rect;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import androidx.lifecycle.m1;
import c5.v3;
import com.app.tgtg.R;
import com.app.tgtg.model.local.AppConstants;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import m3.k1;
import m3.w1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 extends c5.a {
    public static final d C = d.f14445g;
    public boolean A;
    public final int[] B;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Function0 f14465i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public j0 f14466j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f14467k;
    public final View l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f14468m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final n20.f f14469n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final WindowManager f14470o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final WindowManager.LayoutParams f14471p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public i0 f14472q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public z5.m f14473r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final k1 f14474s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final k1 f14475t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public z5.k f14476u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final m3.i0 f14477v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Rect f14478w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final z3.x f14479x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public v f14480y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final k1 f14481z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(Function0 function0, j0 j0Var, String str, View view, z5.c cVar, i0 i0Var, UUID uuid, boolean z11) {
        super(view.getContext());
        int i11 = 12;
        n20.f h0Var = Build.VERSION.SDK_INT >= 29 ? new h0(i11) : new n20.f(i11);
        this.f14465i = function0;
        this.f14466j = j0Var;
        this.f14467k = str;
        this.l = view;
        this.f14468m = z11;
        this.f14469n = h0Var;
        Object systemService = view.getContext().getSystemService("window");
        systemService.getClass();
        this.f14470o = (WindowManager) systemService;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        j0 j0Var2 = this.f14466j;
        boolean zC = r.c(view);
        boolean z12 = j0Var2.f14498b;
        int i12 = j0Var2.f14497a;
        if (z12 && zC) {
            i12 |= 8192;
        } else if (z12 && !zC) {
            i12 &= -8193;
        }
        layoutParams.flags = i12;
        layoutParams.type = AppConstants.RESULT_CODE_AUTO_REFUND;
        layoutParams.token = view.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(view.getContext().getResources().getString(R.string.default_popup_window_title));
        this.f14471p = layoutParams;
        this.f14472q = i0Var;
        this.f14473r = z5.m.Ltr;
        this.f14474s = m3.i.w(null);
        this.f14475t = m3.i.w(null);
        this.f14477v = m3.i.q(new defpackage.a(this, 10));
        this.f14478w = new Rect();
        this.f14479x = new z3.x(new m(this, 2));
        setId(android.R.id.content);
        setTag(R.id.view_tree_lifecycle_owner, m1.a(view));
        setTag(R.id.view_tree_view_model_store_owner, m1.b(view));
        setTag(R.id.view_tree_saved_state_registry_owner, y9.w.s(view));
        setTag(R.id.compose_view_saveable_id_tag, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(cVar.c0((float) 8));
        setOutlineProvider(new v3(2));
        this.f14481z = m3.i.w(y.f14534a);
        this.B = new int[2];
    }

    private final Function2<m3.n, Integer, Unit> getContent() {
        return (Function2) this.f14481z.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final z4.z getParentLayoutCoordinates() {
        return (z4.z) this.f14475t.getValue();
    }

    private final z5.k getVisibleDisplayBounds() {
        this.f14469n.getClass();
        View view = this.l;
        Rect rect = this.f14478w;
        view.getWindowVisibleDisplayFrame(rect);
        return new z5.k(rect.left, rect.top, rect.right, rect.bottom);
    }

    private final void setParentLayoutCoordinates(z4.z zVar) {
        this.f14475t.setValue(zVar);
    }

    @Override // c5.a
    public final void a(m3.n nVar, int i11) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-857613600);
        int i12 = (sVar.h(this) ? 4 : 2) | i11;
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            getContent().invoke(sVar, 0);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new b4.p(this, i11, 6);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f14466j.f14499c) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getKeyCode() == 4 || keyEvent.getKeyCode() == 111) {
            KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
            if (keyDispatcherState == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                keyDispatcherState.startTracking(keyEvent, this);
                return true;
            }
            if (keyEvent.getAction() == 1 && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                Function0 function0 = this.f14465i;
                if (function0 != null) {
                    function0.invoke();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // c5.a
    public final void f(int i11, int i12, int i13, int i14, boolean z11) {
        super.f(i11, i12, i13, i14, z11);
        this.f14466j.getClass();
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        WindowManager.LayoutParams layoutParams = this.f14471p;
        layoutParams.width = measuredWidth;
        layoutParams.height = childAt.getMeasuredHeight();
        this.f14469n.getClass();
        this.f14470o.updateViewLayout(this, layoutParams);
    }

    @Override // c5.a
    public final void g(int i11, int i12) {
        this.f14466j.getClass();
        z5.k visibleDisplayBounds = getVisibleDisplayBounds();
        super.g(View.MeasureSpec.makeMeasureSpec(visibleDisplayBounds.d(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(visibleDisplayBounds.b(), Integer.MIN_VALUE));
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.f14477v.getValue()).booleanValue();
    }

    @NotNull
    public final WindowManager.LayoutParams getParams$ui() {
        return this.f14471p;
    }

    @NotNull
    public final z5.m getParentLayoutDirection() {
        return this.f14473r;
    }

    @Nullable
    /* JADX INFO: renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final z5.l m960getPopupContentSizebOM6tXw() {
        return (z5.l) this.f14474s.getValue();
    }

    @NotNull
    public final i0 getPositionProvider() {
        return this.f14472q;
    }

    @Override // c5.a
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.A;
    }

    @NotNull
    public final String getTestTag() {
        return this.f14467k;
    }

    @Nullable
    public /* bridge */ /* synthetic */ View getViewRoot() {
        return null;
    }

    public final void j(Function0 function0, j0 j0Var, String str, z5.m mVar) {
        this.f14465i = function0;
        this.f14467k = str;
        if (!Intrinsics.areEqual(this.f14466j, j0Var)) {
            j0Var.getClass();
            this.f14466j = j0Var;
            boolean zC = r.c(this.l);
            boolean z11 = j0Var.f14498b;
            int i11 = j0Var.f14497a;
            if (z11 && zC) {
                i11 |= 8192;
            } else if (z11 && !zC) {
                i11 &= -8193;
            }
            WindowManager.LayoutParams layoutParams = this.f14471p;
            layoutParams.flags = i11;
            this.f14469n.getClass();
            this.f14470o.updateViewLayout(this, layoutParams);
        }
        int i12 = e0.$EnumSwitchMapping$0[mVar.ordinal()];
        int i13 = 1;
        if (i12 == 1) {
            i13 = 0;
        } else if (i12 != 2) {
            e40.a.f();
            return;
        }
        super.setLayoutDirection(i13);
    }

    public final void k() {
        z4.z parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            if (!parentLayoutCoordinates.n()) {
                parentLayoutCoordinates = null;
            }
            if (parentLayoutCoordinates == null) {
                return;
            }
            long jU = parentLayoutCoordinates.u();
            long jZ = this.f14468m ? parentLayoutCoordinates.z(0L) : parentLayoutCoordinates.e(0L);
            z5.k kVarD = android.support.v4.media.session.a.d((((long) Math.round(Float.intBitsToFloat((int) (jZ >> 32)))) << 32) | (4294967295L & ((long) Math.round(Float.intBitsToFloat((int) (jZ & 4294967295L))))), jU);
            if (Intrinsics.areEqual(kVarD, this.f14476u)) {
                return;
            }
            this.f14476u = kVarD;
            m();
        }
    }

    public final void l(z4.z zVar) {
        setParentLayoutCoordinates(zVar);
        k();
    }

    public final void m() {
        z5.l lVarM960getPopupContentSizebOM6tXw;
        z5.k kVar = this.f14476u;
        if (kVar == null || (lVarM960getPopupContentSizebOM6tXw = m960getPopupContentSizebOM6tXw()) == null) {
            return;
        }
        long j9 = lVarM960getPopupContentSizebOM6tXw.f47286a;
        z5.k visibleDisplayBounds = getVisibleDisplayBounds();
        long jB = (((long) visibleDisplayBounds.b()) & 4294967295L) | (((long) visibleDisplayBounds.d()) << 32);
        Ref.LongRef longRef = new Ref.LongRef();
        longRef.element = 0L;
        this.f14479x.d(this, C, new f0(longRef, this, kVar, jB, j9));
        long j11 = longRef.element;
        WindowManager.LayoutParams layoutParams = this.f14471p;
        layoutParams.x = (int) (j11 >> 32);
        layoutParams.y = (int) (j11 & 4294967295L);
        boolean z11 = this.f14466j.f14501e;
        n20.f fVar = this.f14469n;
        if (z11) {
            fVar.x(this, (int) (jB >> 32), (int) (jB & 4294967295L));
        }
        fVar.getClass();
        this.f14470o.updateViewLayout(this, layoutParams);
    }

    @Override // c5.a, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f14479x.e();
        if (!this.f14466j.f14499c || Build.VERSION.SDK_INT < 33) {
            return;
        }
        if (this.f14480y == null) {
            this.f14480y = new v(this.f14465i, 0);
        }
        a70.a.p(this, this.f14480y);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z3.x xVar = this.f14479x;
        gn.q qVar = xVar.f47083h;
        if (qVar != null) {
            qVar.a();
        }
        xVar.a();
        if (Build.VERSION.SDK_INT >= 33) {
            a70.a.q(this, this.f14480y);
        }
        this.f14480y = null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f14466j.f14500d) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < 0.0f || motionEvent.getX() >= getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() >= getHeight())) {
            Function0 function0 = this.f14465i;
            if (function0 != null) {
                function0.invoke();
            }
            return true;
        }
        if (motionEvent == null || motionEvent.getAction() != 4) {
            return super.onTouchEvent(motionEvent);
        }
        Function0 function02 = this.f14465i;
        if (function02 != null) {
            function02.invoke();
        }
        return true;
    }

    public final void setContent(@NotNull m3.x xVar, @NotNull Function2<? super m3.n, ? super Integer, Unit> function2) {
        setParentCompositionContext(xVar);
        setContent(function2);
        this.A = true;
    }

    public final void setParentLayoutDirection(@NotNull z5.m mVar) {
        this.f14473r = mVar;
    }

    /* JADX INFO: renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m961setPopupContentSizefhxjrPA(@Nullable z5.l lVar) {
        this.f14474s.setValue(lVar);
    }

    public final void setPositionProvider(@NotNull i0 i0Var) {
        this.f14472q = i0Var;
    }

    public final void setTestTag(@NotNull String str) {
        this.f14467k = str;
    }

    private final void setContent(Function2<? super m3.n, ? super Integer, Unit> function2) {
        this.f14481z.setValue(function2);
    }

    public static /* synthetic */ void getParams$ui$annotations() {
    }

    @NotNull
    public c5.a getSubCompositionView() {
        return this;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i11) {
    }
}
