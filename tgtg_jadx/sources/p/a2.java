package p;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a2 extends v1 implements w1 {
    public static final Method D;
    public jb.b C;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                D = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // p.w1
    public final void c(o.l lVar, MenuItem menuItem) {
        jb.b bVar = this.C;
        if (bVar != null) {
            bVar.c(lVar, menuItem);
        }
    }

    @Override // p.w1
    public final void i(o.l lVar, o.n nVar) {
        jb.b bVar = this.C;
        if (bVar != null) {
            bVar.i(lVar, nVar);
        }
    }

    @Override // p.v1
    public final k1 p(Context context, boolean z11) {
        z1 z1Var = new z1(context, z11);
        z1Var.setHoverListener(this);
        return z1Var;
    }
}
