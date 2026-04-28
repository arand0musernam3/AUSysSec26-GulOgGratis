package androidx.activity;

import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import h7.a1;
import h7.z0;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f1751a = Color.argb(230, 255, 255, 255);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f1752b = Color.argb(128, 27, 27, 27);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static s f1753c;

    public static void a(ComponentActivity componentActivity) {
        g0 g0Var = new g0(0, 0, new defpackage.g(5));
        g0 g0Var2 = new g0(f1751a, f1752b, new defpackage.g(5));
        componentActivity.getClass();
        View decorView = componentActivity.getWindow().getDecorView();
        decorView.getClass();
        s wVar = f1753c;
        if (wVar == null) {
            int i11 = Build.VERSION.SDK_INT;
            wVar = i11 >= 35 ? new w() : i11 >= 30 ? new v() : i11 >= 29 ? new u() : i11 >= 28 ? new t() : new s();
            f1753c = wVar;
        }
        s sVar = wVar;
        p pVar = new p(sVar, g0Var, g0Var2, componentActivity, decorView, 0);
        ViewGroup viewGroup = (ViewGroup) decorView;
        Iterator it = new z0(viewGroup).iterator();
        while (true) {
            a1 a1Var = (a1) it;
            if (!a1Var.hasNext()) {
                q qVar = new q(pVar, viewGroup.getContext());
                qVar.setTag(sVar);
                qVar.setVisibility(8);
                qVar.setWillNotDraw(true);
                viewGroup.addView(qVar);
                break;
            }
            if (((View) a1Var.next()).getTag() instanceof s) {
                break;
            }
        }
        pVar.run();
        Window window = componentActivity.getWindow();
        window.getClass();
        sVar.a(window);
    }
}
