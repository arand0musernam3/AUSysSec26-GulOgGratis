package h70;

import android.view.View;
import android.view.Window;
import c50.w;
import java.lang.reflect.Field;
import u70.l;
import u70.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class g {
    static {
        l.a(m.NONE, a.f21650c);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, u70.j] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, u70.j] */
    public static final Window a(View view) {
        Field field;
        view.getClass();
        Object obj = i70.f.f23498a;
        View rootView = view.getRootView();
        rootView.getClass();
        Class cls = (Class) i70.f.f23498a.getValue();
        if (cls != null && cls.isInstance(rootView) && (field = (Field) i70.f.f23499b.getValue()) != null) {
            Object obj2 = field.get(rootView);
            if (obj2 != null) {
                return (Window) obj2;
            }
            w.l("null cannot be cast to non-null type android.view.Window");
        }
        return null;
    }
}
