package h7;

import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import androidx.core.view.WindowInsetsAnimationCompat$Callback;
import androidx.core.view.WindowInsetsCompat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class l1 extends WindowInsetsAnimation$Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WindowInsetsAnimationCompat$Callback f21583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f21584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f21585c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f21586d;

    public l1(WindowInsetsAnimationCompat$Callback windowInsetsAnimationCompat$Callback) {
        super(windowInsetsAnimationCompat$Callback.a());
        this.f21586d = new HashMap();
        this.f21583a = windowInsetsAnimationCompat$Callback;
    }

    public final o1 a(WindowInsetsAnimation windowInsetsAnimation) {
        o1 o1Var = (o1) this.f21586d.get(windowInsetsAnimation);
        if (o1Var != null) {
            return o1Var;
        }
        o1 o1Var2 = new o1(0, null, 0L);
        o1Var2.f21602a = new m1(windowInsetsAnimation);
        this.f21586d.put(windowInsetsAnimation, o1Var2);
        return o1Var2;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.f21583a.b(a(windowInsetsAnimation));
        this.f21586d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        this.f21583a.c(a(windowInsetsAnimation));
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.f21585c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f21585c = arrayList2;
            this.f21584b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimation = (WindowInsetsAnimation) list.get(size);
            o1 o1VarA = a(windowInsetsAnimation);
            o1VarA.f21602a.e(windowInsetsAnimation.getFraction());
            this.f21585c.add(o1VarA);
        }
        return this.f21583a.d(WindowInsetsCompat.v(windowInsets), this.f21584b).u();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        f1 f1VarE = this.f21583a.e(a(windowInsetsAnimation), new f1(bounds));
        f1VarE.getClass();
        k1.c();
        return k1.a(f1VarE.f21536a.d(), f1VarE.f21537b.d());
    }
}
