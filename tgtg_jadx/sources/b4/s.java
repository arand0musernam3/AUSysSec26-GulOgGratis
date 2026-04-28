package b4;

import androidx.compose.ui.ModifierNodeDetachedCancellationException;
import b5.s1;
import b5.z1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q1.o0;
import v80.b0;
import v80.f0;
import v80.h1;
import v80.i1;
import v80.j1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s implements b5.l {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a90.d f5713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5714c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public s f5716e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public s f5717f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public z1 f5718g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public s1 f5719h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f5720i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f5721j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f5722k;
    public boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Function0 f5723m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f5724n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public s f5712a = this;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f5715d = -1;

    public final int getAggregateChildKindSet$ui() {
        return this.f5715d;
    }

    @Nullable
    public final s getChild$ui() {
        return this.f5717f;
    }

    @Nullable
    public final s1 getCoordinator$ui() {
        return this.f5719h;
    }

    @NotNull
    public final b0 getCoroutineScope() {
        a90.d dVar = this.f5713b;
        if (dVar != null) {
            return dVar;
        }
        a90.d dVarB = f0.b(((c5.y) b5.m.h(this)).getCoroutineContext().plus(new j1((i1) ((c5.y) b5.m.h(this)).getCoroutineContext().get(h1.f42106a))));
        this.f5713b = dVarB;
        return dVarB;
    }

    @Nullable
    public final Function0<Unit> getDetachedListener$ui() {
        return this.f5723m;
    }

    public final boolean getInsertedNodeAwaitingAttachForInvalidation$ui() {
        return this.f5720i;
    }

    public final int getKindSet$ui() {
        return this.f5714c;
    }

    @Override // b5.l
    @NotNull
    public final s getNode() {
        return this.f5712a;
    }

    @Nullable
    public final z1 getOwnerScope$ui() {
        return this.f5718g;
    }

    @Nullable
    public final s getParent$ui() {
        return this.f5716e;
    }

    public boolean getShouldAutoInvalidate() {
        return !(this instanceof v1.o);
    }

    public final boolean getUpdatedNodeAwaitingAttachForInvalidation$ui() {
        return this.f5721j;
    }

    public final boolean isAttached() {
        return this.f5724n;
    }

    /* JADX INFO: renamed from: isKind-H91voCI$ui, reason: not valid java name */
    public final boolean m57isKindH91voCI$ui(int i11) {
        return (i11 & getKindSet$ui()) != 0;
    }

    public void markAsAttached$ui() {
        if (this.f5724n) {
            y4.a.b("node attached multiple times");
        }
        if (this.f5719h == null) {
            y4.a.b("attach invoked on a node without a coordinator");
        }
        this.f5724n = true;
        this.f5722k = true;
    }

    public void markAsDetached$ui() {
        if (!this.f5724n) {
            y4.a.b("Cannot detach a node that is not attached");
        }
        if (this.f5722k) {
            y4.a.b("Must run runAttachLifecycle() before markAsDetached()");
        }
        if (this.l) {
            y4.a.b("Must run runDetachLifecycle() before markAsDetached()");
        }
        this.f5724n = false;
        a90.d dVar = this.f5713b;
        if (dVar != null) {
            f0.j(dVar, new ModifierNodeDetachedCancellationException("The Modifier.Node was detached"));
            this.f5713b = null;
        }
    }

    public boolean p() {
        return isAttached();
    }

    public void reset$ui() {
        if (!this.f5724n) {
            y4.a.b("reset() called on an unattached node");
        }
        onReset();
    }

    public void runAttachLifecycle$ui() {
        if (!this.f5724n) {
            y4.a.b("Must run markAsAttached() prior to runAttachLifecycle");
        }
        if (!this.f5722k) {
            y4.a.b("Must run runAttachLifecycle() only once after markAsAttached()");
        }
        this.f5722k = false;
        onAttach();
        this.l = true;
    }

    public void runDetachLifecycle$ui() {
        if (!this.f5724n) {
            y4.a.b("node detached multiple times");
        }
        if (this.f5719h == null) {
            y4.a.b("detach invoked on a node without a coordinator");
        }
        if (!this.l) {
            y4.a.b("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
        }
        this.l = false;
        Function0 function0 = this.f5723m;
        if (function0 != null) {
            function0.invoke();
        }
        onDetach();
    }

    public final void setAggregateChildKindSet$ui(int i11) {
        this.f5715d = i11;
    }

    public void setAsDelegateTo$ui(@NotNull s sVar) {
        this.f5712a = sVar;
    }

    public final void setChild$ui(@Nullable s sVar) {
        this.f5717f = sVar;
    }

    public final void setDetachedListener$ui(@Nullable Function0<Unit> function0) {
        this.f5723m = function0;
    }

    public final void setInsertedNodeAwaitingAttachForInvalidation$ui(boolean z11) {
        this.f5720i = z11;
    }

    public final void setKindSet$ui(int i11) {
        this.f5714c = i11;
    }

    public final void setOwnerScope$ui(@Nullable z1 z1Var) {
        this.f5718g = z1Var;
    }

    public final void setParent$ui(@Nullable s sVar) {
        this.f5716e = sVar;
    }

    public final void setUpdatedNodeAwaitingAttachForInvalidation$ui(boolean z11) {
        this.f5721j = z11;
    }

    public final void sideEffect(@NotNull Function0<Unit> function0) {
        o0 o0Var = ((c5.y) b5.m.h(this)).D1;
        if (o0Var.c(function0) >= 0) {
            return;
        }
        o0Var.g(function0);
    }

    public void updateCoordinator$ui(@Nullable s1 s1Var) {
        this.f5719h = s1Var;
    }

    public static /* synthetic */ void getNode$annotations() {
    }

    public static /* synthetic */ void getShouldAutoInvalidate$annotations() {
    }

    public void onAttach() {
    }

    public void onDetach() {
    }

    public void onReset() {
    }
}
