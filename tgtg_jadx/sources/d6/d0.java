package d6;

import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.lifecycle.m1;
import c5.v3;
import com.app.tgtg.R;
import com.braze.h2;
import java.util.UUID;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends androidx.activity.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Function0 f14447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a0 f14448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f14449c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z f14450d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f14451e;

    /* JADX WARN: Multi-variable type inference failed */
    public d0(Function0 function0, a0 a0Var, View view, z5.m mVar, z5.c cVar, UUID uuid) {
        super(new ContextThemeWrapper(view.getContext(), a0Var.f14431e ? R.style.DialogWindowTheme : R.style.FloatingDialogWindowTheme), 0, 2, 0 == true ? 1 : 0);
        this.f14447a = function0;
        this.f14448b = a0Var;
        this.f14449c = view;
        float f11 = 8;
        Window window = getWindow();
        if (window == null) {
            h2.b("Dialog has no window");
            throw null;
        }
        int i11 = 1;
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        v0.n.G(window, this.f14448b.f14431e);
        window.setGravity(17);
        if (!this.f14448b.f14431e) {
            window.addFlags(65792);
            WindowManager.LayoutParams attributes = window.getAttributes();
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 28) {
                t.f14526a.a(attributes);
            }
            if (i12 >= 30) {
                u uVar = u.f14527a;
                uVar.b(attributes, 0);
                uVar.c(attributes, 0);
            }
            window.setAttributes(attributes);
        }
        z zVar = new z(getContext(), window);
        setTitle(this.f14448b.f14432f);
        zVar.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        zVar.setClipChildren(false);
        zVar.setElevation(cVar.c0(f11));
        zVar.setOutlineProvider(new v3(1));
        this.f14450d = zVar;
        View decorView = window.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            c(viewGroup);
        }
        setContentView(zVar);
        zVar.setTag(R.id.view_tree_lifecycle_owner, m1.a(view));
        zVar.setTag(R.id.view_tree_view_model_store_owner, m1.b(view));
        zVar.setTag(R.id.view_tree_saved_state_registry_owner, y9.w.s(view));
        d(this.f14447a, this.f14448b, mVar);
        lx.u.u(getOnBackPressedDispatcher(), this, new b(this, i11));
    }

    public static final void c(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof z) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = viewGroup.getChildAt(i11);
            ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                c(viewGroup2);
            }
        }
    }

    public final void d(Function0 function0, a0 a0Var, z5.m mVar) {
        int i11;
        this.f14447a = function0;
        this.f14448b = a0Var;
        k0 k0Var = a0Var.f14429c;
        boolean zC = r.c(this.f14449c);
        int i12 = l0.$EnumSwitchMapping$0[k0Var.ordinal()];
        if (i12 == 1) {
            zC = false;
        } else if (i12 == 2) {
            zC = true;
        } else if (i12 != 3) {
            e40.a.f();
            return;
        }
        Window window = getWindow();
        window.getClass();
        window.setFlags(zC ? 8192 : -8193, 8192);
        int i13 = c0.$EnumSwitchMapping$0[mVar.ordinal()];
        if (i13 == 1) {
            i11 = 0;
        } else {
            if (i13 != 2) {
                e40.a.f();
                return;
            }
            i11 = 1;
        }
        z zVar = this.f14450d;
        zVar.setLayoutDirection(i11);
        boolean z11 = a0Var.f14431e;
        boolean z12 = a0Var.f14430d;
        Window window2 = zVar.f14535i;
        boolean z13 = (zVar.f14538m && z12 == zVar.f14537k && z11 == zVar.l) ? false : true;
        zVar.f14537k = z12;
        zVar.l = z11;
        if (z13) {
            WindowManager.LayoutParams attributes = window2.getAttributes();
            int i14 = z12 ? -2 : -1;
            if (i14 != attributes.width || !zVar.f14538m) {
                window2.setLayout(i14, -2);
                zVar.f14538m = true;
            }
        }
        setCanceledOnTouchOutside(a0Var.f14428b);
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setSoftInputMode(z11 ? 0 : Build.VERSION.SDK_INT < 31 ? 16 : 48);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (!this.f14448b.f14427a || !keyEvent.isTracking() || keyEvent.isCanceled() || i11 != 111) {
            return super.onKeyUp(i11, keyEvent);
        }
        this.f14447a.invoke();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x008b  */
    @Override // android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            boolean r0 = super.onTouchEvent(r10)
            d6.a0 r1 = r9.f14448b
            boolean r1 = r1.f14428b
            r2 = 3
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L8b
            d6.z r1 = r9.f14450d
            r1.getClass()
            float r5 = r10.getX()
            boolean r6 = java.lang.Float.isInfinite(r5)
            if (r6 != 0) goto L6e
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 != 0) goto L6e
            float r5 = r10.getY()
            boolean r6 = java.lang.Float.isInfinite(r5)
            if (r6 != 0) goto L6e
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 != 0) goto L6e
            android.view.View r5 = r1.getChildAt(r3)
            if (r5 != 0) goto L39
            goto L6e
        L39:
            int r6 = r1.getLeft()
            int r7 = r5.getLeft()
            int r7 = r7 + r6
            int r6 = r5.getWidth()
            int r6 = r6 + r7
            int r1 = r1.getTop()
            int r8 = r5.getTop()
            int r8 = r8 + r1
            int r1 = r5.getHeight()
            int r1 = r1 + r8
            float r5 = r10.getX()
            int r5 = j80.c.b(r5)
            if (r7 > r5) goto L6e
            if (r5 > r6) goto L6e
            float r5 = r10.getY()
            int r5 = j80.c.b(r5)
            if (r8 > r5) goto L6e
            if (r5 > r1) goto L6e
            goto L8b
        L6e:
            int r10 = r10.getActionMasked()
            if (r10 == 0) goto L88
            if (r10 == r4) goto L7c
            if (r10 == r2) goto L79
            goto L95
        L79:
            r9.f14451e = r3
            return r0
        L7c:
            boolean r10 = r9.f14451e
            if (r10 == 0) goto L95
            kotlin.jvm.functions.Function0 r10 = r9.f14447a
            r10.invoke()
            r9.f14451e = r3
            return r4
        L88:
            r9.f14451e = r4
            return r4
        L8b:
            int r10 = r10.getActionMasked()
            if (r10 == 0) goto L96
            if (r10 == r4) goto L96
            if (r10 == r2) goto L96
        L95:
            return r0
        L96:
            r9.f14451e = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: d6.d0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }
}
