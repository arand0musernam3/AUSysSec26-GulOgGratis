package o;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.app.tgtg.R;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f31606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f31607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f31608c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f31609d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f31610e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f31612g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public w f31613h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public t f31614i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public PopupWindow.OnDismissListener f31615j;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f31611f = 8388611;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final u f31616k = new u(this);

    public v(Context context, l lVar, View view, boolean z11, int i11, int i12) {
        this.f31606a = context;
        this.f31607b = lVar;
        this.f31610e = view;
        this.f31608c = z11;
        this.f31609d = i11;
    }

    public final t a() {
        t c0Var;
        if (this.f31614i == null) {
            Context context = this.f31606a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            int iMin = Math.min(point.x, point.y);
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width);
            Context context2 = this.f31606a;
            if (iMin >= dimensionPixelSize) {
                c0Var = new f(context2, this.f31610e, this.f31609d, this.f31608c);
            } else {
                c0Var = new c0(context2, this.f31607b, this.f31610e, this.f31609d, this.f31608c);
            }
            c0Var.m(this.f31607b);
            c0Var.s(this.f31616k);
            c0Var.o(this.f31610e);
            c0Var.j(this.f31613h);
            c0Var.p(this.f31612g);
            c0Var.q(this.f31611f);
            this.f31614i = c0Var;
        }
        return this.f31614i;
    }

    public final boolean b() {
        t tVar = this.f31614i;
        return tVar != null && tVar.a();
    }

    public void c() {
        this.f31614i = null;
        PopupWindow.OnDismissListener onDismissListener = this.f31615j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i11, int i12, boolean z11, boolean z12) {
        t tVarA = a();
        tVarA.t(z12);
        if (z11) {
            if ((Gravity.getAbsoluteGravity(this.f31611f, this.f31610e.getLayoutDirection()) & 7) == 5) {
                i11 -= this.f31610e.getWidth();
            }
            tVarA.r(i11);
            tVarA.u(i12);
            int i13 = (int) ((this.f31606a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            tVarA.f31604a = new Rect(i11 - i13, i12 - i13, i11 + i13, i12 + i13);
        }
        tVarA.show();
    }
}
