package p;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Method f33899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Method f33900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Method f33901c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f33902d;

    static {
        try {
            Class cls = Integer.TYPE;
            Class cls2 = Boolean.TYPE;
            Class cls3 = Float.TYPE;
            Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, cls2, cls3, cls3);
            f33899a = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
            f33900b = declaredMethod2;
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
            f33901c = declaredMethod3;
            declaredMethod3.setAccessible(true);
            f33902d = true;
        } catch (NoSuchMethodException e5) {
            e5.printStackTrace();
        }
    }
}
