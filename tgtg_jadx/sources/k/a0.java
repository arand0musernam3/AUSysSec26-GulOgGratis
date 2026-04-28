package k;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f25503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f25504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Method f25505c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f25506d;

    public a0(View view, String str) {
        this.f25503a = view;
        this.f25504b = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        Method method;
        if (this.f25505c == null) {
            View view2 = this.f25503a;
            Context context = view2.getContext();
            while (true) {
                String str2 = this.f25504b;
                if (context == null) {
                    int id2 = view2.getId();
                    if (id2 == -1) {
                        str = "";
                    } else {
                        str = " with id '" + view2.getContext().getResources().getResourceEntryName(id2) + "'";
                    }
                    StringBuilder sbS = e0.f.s("Could not find method ", str2, "(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                    sbS.append(view2.getClass());
                    sbS.append(str);
                    throw new IllegalStateException(sbS.toString());
                }
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                        this.f25505c = method;
                        this.f25506d = context;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
        }
        try {
            this.f25505c.invoke(this.f25506d, view);
        } catch (IllegalAccessException e5) {
            wy.o.k("Could not execute non-public method for android:onClick", e5);
        } catch (InvocationTargetException e11) {
            wy.o.k("Could not execute method for android:onClick", e11);
        }
    }
}
