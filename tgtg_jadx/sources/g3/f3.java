package g3;

import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.core.view.WindowInsetsControllerCompat;
import com.app.tgtg.R;
import java.util.UUID;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f3 extends androidx.activity.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Function0 f18591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public w3 f18592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f18593c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f18594d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b3 f18595e;

    /* JADX WARN: Illegal instructions before constructor call */
    public f3(Function0 function0, w3 w3Var, long j9, View view, z5.m mVar, z5.c cVar, UUID uuid, t1.b bVar, v80.b0 b0Var) {
        boolean z11 = false;
        z11 = false;
        super(new ContextThemeWrapper(view.getContext(), R.style.EdgeToEdgeFloatingDialogWindowTheme), z11 ? 1 : 0, 2, null);
        this.f18591a = function0;
        this.f18592b = w3Var;
        this.f18593c = j9;
        this.f18594d = view;
        float f11 = 8;
        Window window = getWindow();
        if (window == null) {
            com.braze.h2.b("Dialog has no window");
            throw null;
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        v0.n.G(window, false);
        b3 b3Var = new b3(getContext(), window);
        b3Var.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        b3Var.setClipChildren(false);
        b3Var.setElevation(cVar.c0(f11));
        b3Var.setOutlineProvider(new c5.v3(3));
        this.f18595e = b3Var;
        setContentView(b3Var);
        b3Var.setTag(R.id.view_tree_lifecycle_owner, androidx.lifecycle.m1.a(view));
        b3Var.setTag(R.id.view_tree_view_model_store_owner, androidx.lifecycle.m1.b(view));
        b3Var.setTag(R.id.view_tree_saved_state_registry_owner, y9.w.s(view));
        c(this.f18591a, this.f18592b, this.f18593c, mVar);
        WindowInsetsControllerCompat windowInsetsControllerCompat = new WindowInsetsControllerCompat(window, window.getDecorView());
        this.f18592b.getClass();
        long j11 = this.f18593c;
        long j12 = i4.v.f23314g;
        windowInsetsControllerCompat.d(!i4.v.c(j11, j12) && ((double) i4.g0.u(j11)) <= 0.5d);
        this.f18592b.getClass();
        if (!i4.v.c(this.f18593c, j12) && i4.g0.u(r5) <= 0.5d) {
            z11 = true;
        }
        windowInsetsControllerCompat.c(z11);
        getOnBackPressedDispatcher().b(new d3(this.f18592b.f19693b, b0Var, bVar, new cw.b(this, 18)), this);
    }

    public final void c(Function0 function0, w3 w3Var, long j9, z5.m mVar) {
        this.f18591a = function0;
        this.f18592b = w3Var;
        this.f18593c = j9;
        d6.k0 k0Var = w3Var.f19692a;
        ViewGroup.LayoutParams layoutParams = this.f18594d.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        int i11 = 1;
        boolean z11 = (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
        int i12 = i3.g.$EnumSwitchMapping$0[k0Var.ordinal()];
        if (i12 == 1) {
            z11 = false;
        } else if (i12 == 2) {
            z11 = true;
        } else if (i12 != 3) {
            e40.a.f();
            return;
        }
        Window window = getWindow();
        window.getClass();
        window.setFlags(z11 ? 8192 : -8193, 8192);
        int i13 = e3.$EnumSwitchMapping$0[mVar.ordinal()];
        if (i13 == 1) {
            i11 = 0;
        } else if (i13 != 2) {
            e40.a.f();
            return;
        }
        this.f18595e.setLayoutDirection(i11);
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setLayout(-1, -1);
        }
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setSoftInputMode(Build.VERSION.SDK_INT >= 30 ? 48 : 16);
        }
    }

    @Override // android.app.Dialog
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (zOnTouchEvent) {
            this.f18591a.invoke();
        }
        return zOnTouchEvent;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }
}
