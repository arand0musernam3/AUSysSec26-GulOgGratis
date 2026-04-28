package c5;

import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.node.Owner;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.app.tgtg.R;
import java.lang.ref.WeakReference;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakReference f7096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public IBinder f7097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public k4 f7098c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public m3.x f7099d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Function0 f7100e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f7101f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f7102g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f7103h;

    public a(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(1);
        o3 o3Var = new o3(this, 0);
        addOnAttachStateChangeListener(o3Var);
        m3 m3Var = new m3(this);
        o00.h0.y(this).f44024a.add(m3Var);
        this.f7100e = new n3(this, o3Var, m3Var, 0);
    }

    private final void setParentContext(m3.x xVar) {
        if (this.f7099d != xVar) {
            this.f7099d = xVar;
            if (xVar != null) {
                this.f7096a = null;
            }
            k4 k4Var = this.f7098c;
            if (k4Var != null) {
                k4Var.a();
                this.f7098c = null;
                if (isAttachedToWindow()) {
                    e();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.f7097b != iBinder) {
            this.f7097b = iBinder;
            this.f7096a = null;
        }
    }

    public abstract void a(m3.n nVar, int i11);

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        b();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i11, ViewGroup.LayoutParams layoutParams) {
        b();
        return super.addViewInLayout(view, i11, layoutParams);
    }

    public final void b() {
        if (this.f7102g) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    public final void c() {
        if (this.f7099d != null || isAttachedToWindow()) {
            e();
        } else {
            com.braze.h2.b("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
        }
    }

    public final void d() {
        k4 k4Var = this.f7098c;
        if (k4Var != null) {
            k4Var.a();
        }
        this.f7098c = null;
        requestLayout();
    }

    public final void e() {
        if (this.f7098c == null) {
            try {
                this.f7102g = true;
                this.f7098c = m4.a(this, h(), new u3.d(new b4.p(this, 1), true, -656146368));
            } finally {
                this.f7102g = false;
            }
        }
    }

    public void f(int i11, int i12, int i13, int i14, boolean z11) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i13 - i11) - getPaddingRight(), (i14 - i12) - getPaddingBottom());
        }
    }

    public void g(int i11, int i12) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i11, i12);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i11) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i11)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i12) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i12)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    /* JADX INFO: renamed from: getAutoClearFocusBehavior-4UtRPd4, reason: not valid java name */
    public final int m59getAutoClearFocusBehavior4UtRPd4() {
        Object tag = getTag(R.id.auto_clear_focus_behavior_tag);
        n1 n1Var = tag instanceof n1 ? (n1) tag : null;
        if (n1Var != null) {
            return n1Var.f7298a;
        }
        return 1;
    }

    public final boolean getHasComposition() {
        return this.f7098c != null;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.f7101f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25, types: [kotlin.coroutines.CoroutineContext] */
    /* JADX WARN: Type inference failed for: r3v11, types: [T, c5.u2] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v7, types: [kotlin.coroutines.CoroutineContext] */
    public final m3.x h() {
        m3.b2 b2Var;
        CoroutineContext coroutineContext;
        m3.n1 n1Var;
        int i11;
        m3.x xVarB = this.f7099d;
        if (xVarB == null) {
            xVarB = g4.b(this);
            if (xVarB == null) {
                Object parent = getParent();
                while (xVarB == null && (parent instanceof View)) {
                    View view = (View) parent;
                    xVarB = g4.b(view);
                    parent = dx.f.s(view);
                }
            }
            boolean z11 = false;
            if (xVarB != null) {
                m3.x xVar = (!(xVarB instanceof m3.b2) || ((m3.z1) ((m3.b2) xVarB).f29244u.getValue()).compareTo(m3.z1.ShuttingDown) > 0) ? xVarB : null;
                if (xVar != null) {
                    this.f7096a = new WeakReference(xVar);
                }
            } else {
                xVarB = null;
            }
            if (xVarB == null) {
                WeakReference weakReference = this.f7096a;
                if (weakReference == null || (xVarB = (m3.x) weakReference.get()) == null || ((xVarB instanceof m3.b2) && ((m3.z1) ((m3.b2) xVarB).f29244u.getValue()).compareTo(m3.z1.ShuttingDown) <= 0)) {
                    xVarB = null;
                }
                if (xVarB == null) {
                    if (!isAttachedToWindow()) {
                        y4.a.b("Cannot locate windowRecomposer; View " + this + " is not attached to a window");
                    }
                    View view2 = this;
                    Object parent2 = getParent();
                    while (parent2 instanceof View) {
                        View view3 = (View) parent2;
                        if (view3.getId() == 16908290) {
                            break;
                        }
                        view2 = view3;
                        parent2 = view3.getParent();
                    }
                    m3.x xVarB2 = g4.b(view2);
                    if (xVarB2 == null) {
                        ((z3) a4.f7112a.get()).getClass();
                        CoroutineContext coroutineContext2 = kotlin.coroutines.g.f26549a;
                        x70.d dVar = kotlin.coroutines.d.f26548k0;
                        coroutineContext2.getClass();
                        dVar.getClass();
                        u70.t tVar = c1.l;
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            coroutineContext = (CoroutineContext) c1.l.getValue();
                        } else {
                            coroutineContext = (CoroutineContext) c1.f7137m.get();
                            if (coroutineContext == null) {
                                com.braze.h2.b("no AndroidUiDispatcher for this thread");
                                return null;
                            }
                        }
                        CoroutineContext coroutineContextPlus = coroutineContext.plus(coroutineContext2);
                        m3.x0 x0Var = (m3.x0) coroutineContextPlus.get(m3.f.f29271c);
                        if (x0Var != null) {
                            n1Var = new m3.n1(x0Var);
                            c40.q qVar = n1Var.f29349b;
                            synchronized (qVar.f7093c) {
                                qVar.f7092b = false;
                            }
                        } else {
                            n1Var = null;
                        }
                        Ref.ObjectRef objectRef = new Ref.ObjectRef();
                        b4.u uVar = (b4.u) coroutineContextPlus.get(b4.d.f5697p);
                        ?? r32 = uVar;
                        if (uVar == null) {
                            ?? u2Var = new u2();
                            objectRef.element = u2Var;
                            r32 = u2Var;
                        }
                        if (n1Var != null) {
                            coroutineContext2 = n1Var;
                        }
                        CoroutineContext coroutineContextPlus2 = coroutineContextPlus.plus(coroutineContext2).plus(r32);
                        b2Var = new m3.b2(coroutineContextPlus2);
                        synchronized (b2Var.f29227c) {
                            i11 = 1;
                            b2Var.f29243t = true;
                        }
                        a90.d dVarB = v80.f0.b(coroutineContextPlus2);
                        LifecycleOwner lifecycleOwnerA = androidx.lifecycle.m1.a(view2);
                        Lifecycle lifecycle = lifecycleOwnerA != null ? lifecycleOwnerA.getLifecycle() : null;
                        if (lifecycle == null) {
                            y4.a.c("ViewTreeLifecycleOwner not found from " + view2);
                            qc.y.m();
                            return null;
                        }
                        view2.addOnAttachStateChangeListener(new b4(view2, b2Var));
                        lifecycle.a(new e4(dVarB, n1Var, b2Var, objectRef, view2));
                        view2.setTag(R.id.androidx_compose_ui_view_composition_context, b2Var);
                        v80.c1 c1Var = v80.c1.f42075a;
                        Handler handler = view2.getHandler();
                        int i12 = w80.e.f43298a;
                        view2.addOnAttachStateChangeListener(new o3(v80.f0.B(c1Var, new w80.c(handler, "windowRecomposer cleanup", false).f43295e, null, new a3.x(b2Var, view2, z11 ? 1 : 0, 21), 2), i11));
                    } else {
                        if (!(xVarB2 instanceof m3.b2)) {
                            com.braze.h2.b("root viewTreeParentCompositionContext is not a Recomposer");
                            return null;
                        }
                        b2Var = (m3.b2) xVarB2;
                    }
                    m3.b2 b2Var2 = ((m3.z1) b2Var.f29244u.getValue()).compareTo(m3.z1.ShuttingDown) > 0 ? b2Var : null;
                    if (b2Var2 != null) {
                        this.f7096a = new WeakReference(b2Var2);
                    }
                    return b2Var;
                }
            }
        }
        return xVarB;
    }

    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
        return !this.f7103h || super.isTransitionGroup();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPreviousAttachedWindowToken(getWindowToken());
        if (getShouldCreateCompositionOnAttachedToWindow()) {
            e();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        f(i11, i12, i13, i14, z11);
    }

    @Override // android.view.View
    public final void onMeasure(int i11, int i12) {
        e();
        g(i11, i12);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i11) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i11);
        }
    }

    /* JADX INFO: renamed from: setAutoClearFocusBehavior-17tfJxM, reason: not valid java name */
    public final void m60setAutoClearFocusBehavior17tfJxM(int i11) {
        setTag(R.id.auto_clear_focus_behavior_tag, new n1(i11));
    }

    public final void setParentCompositionContext(@Nullable m3.x xVar) {
        setParentContext(xVar);
    }

    public final void setShowLayoutBounds(boolean z11) {
        this.f7101f = z11;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((y) ((Owner) childAt)).setShowLayoutBounds(z11);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z11) {
        super.setTransitionGroup(z11);
        this.f7103h = true;
    }

    public final void setViewCompositionStrategy(@NotNull s3 s3Var) {
        Function0 function0 = this.f7100e;
        if (function0 != null) {
            function0.invoke();
        }
        this.f7100e = s3Var.j(this);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i11) {
        b();
        super.addView(view, i11);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i11, ViewGroup.LayoutParams layoutParams, boolean z11) {
        b();
        return super.addViewInLayout(view, i11, layoutParams, z11);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i11, int i12) {
        b();
        super.addView(view, i11, i12);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        b();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i11, ViewGroup.LayoutParams layoutParams) {
        b();
        super.addView(view, i11, layoutParams);
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    public /* synthetic */ a(Context context) {
        this(context, null, 0);
    }
}
