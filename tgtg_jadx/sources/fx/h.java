package fx;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EditText;
import android.widget.TextView;
import ax.a0;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.TextBundle;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tx.n0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f17991a = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static WeakReference f17992b = new WeakReference(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Method f17993c;

    public static final View a(View view) {
        if (!yx.a.f46339a.contains(h.class)) {
            while (view != null) {
                try {
                    h hVar = f17991a;
                    boolean zAreEqual = false;
                    if (!yx.a.f46339a.contains(hVar)) {
                        try {
                            zAreEqual = Intrinsics.areEqual(view.getClass().getName(), "com.facebook.react.ReactRootView");
                        } catch (Throwable th2) {
                            yx.a.a(hVar, th2);
                        }
                    }
                    if (!zAreEqual) {
                        Object parent = view.getParent();
                        if (!(parent instanceof View)) {
                            break;
                        }
                        view = (View) parent;
                    } else {
                        return view;
                    }
                } catch (Throwable th3) {
                    yx.a.a(h.class, th3);
                }
            }
        }
        return null;
    }

    public static final ArrayList b(View view) {
        if (yx.a.f46339a.contains(h.class)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (view instanceof ViewGroup) {
                int childCount = ((ViewGroup) view).getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    arrayList.add(((ViewGroup) view).getChildAt(i11));
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            yx.a.a(h.class, th2);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0050 A[Catch: all -> 0x004e, TRY_LEAVE, TryCatch #3 {all -> 0x004e, blocks: (B:16:0x0027, B:19:0x0030, B:28:0x0047, B:33:0x0050, B:41:0x0062, B:39:0x005d, B:26:0x0041, B:23:0x003b), top: B:84:0x0027, outer: #2, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0062 A[Catch: all -> 0x004e, TRY_LEAVE, TryCatch #3 {all -> 0x004e, blocks: (B:16:0x0027, B:19:0x0030, B:28:0x0047, B:33:0x0050, B:41:0x0062, B:39:0x005d, B:26:0x0041, B:23:0x003b), top: B:84:0x0027, outer: #2, inners: #4 }] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int c(android.view.View r8) {
        /*
            java.util.Set r0 = yx.a.f46339a
            java.lang.Class<fx.h> r1 = fx.h.class
            boolean r2 = r0.contains(r1)
            r3 = 0
            if (r2 == 0) goto Lc
            return r3
        Lc:
            r8.getClass()     // Catch: java.lang.Throwable -> L8b
            boolean r2 = r8 instanceof android.widget.ImageView     // Catch: java.lang.Throwable -> L8b
            if (r2 == 0) goto L15
            r2 = 2
            goto L16
        L15:
            r2 = r3
        L16:
            boolean r4 = r8.isClickable()     // Catch: java.lang.Throwable -> L8b
            if (r4 == 0) goto L1e
            r2 = r2 | 32
        L1e:
            boolean r4 = r0.contains(r1)     // Catch: java.lang.Throwable -> L8b
            fx.h r5 = fx.h.f17991a
            if (r4 == 0) goto L27
            goto L6e
        L27:
            android.view.ViewParent r4 = r8.getParent()     // Catch: java.lang.Throwable -> L4e
            boolean r6 = r4 instanceof android.widget.AdapterView     // Catch: java.lang.Throwable -> L4e
            if (r6 == 0) goto L30
            goto L68
        L30:
            java.lang.String r6 = "android.support.v4.view.NestedScrollingChild"
            boolean r0 = r0.contains(r5)     // Catch: java.lang.Throwable -> L4e
            r7 = 0
            if (r0 == 0) goto L3b
        L39:
            r0 = r7
            goto L45
        L3b:
            java.lang.Class r0 = java.lang.Class.forName(r6)     // Catch: java.lang.ClassNotFoundException -> L39 java.lang.Throwable -> L40
            goto L45
        L40:
            r0 = move-exception
            yx.a.a(r5, r0)     // Catch: java.lang.Throwable -> L4e
            goto L39
        L45:
            if (r0 == 0) goto L50
            boolean r0 = r0.isInstance(r4)     // Catch: java.lang.Throwable -> L4e
            if (r0 == 0) goto L50
            goto L68
        L4e:
            r0 = move-exception
            goto L6b
        L50:
            java.util.Set r0 = yx.a.f46339a     // Catch: java.lang.Throwable -> L4e
            boolean r0 = r0.contains(r5)     // Catch: java.lang.Throwable -> L4e
            if (r0 == 0) goto L59
            goto L60
        L59:
            java.lang.Class<h7.s> r7 = h7.s.class
            goto L60
        L5c:
            r0 = move-exception
            yx.a.a(r5, r0)     // Catch: java.lang.Throwable -> L4e
        L60:
            if (r7 == 0) goto L6e
            boolean r0 = r7.isInstance(r4)     // Catch: java.lang.Throwable -> L4e
            if (r0 == 0) goto L6e
        L68:
            r2 = r2 | 512(0x200, float:7.17E-43)
            goto L6e
        L6b:
            yx.a.a(r1, r0)     // Catch: java.lang.Throwable -> L8b
        L6e:
            boolean r0 = r8 instanceof android.widget.TextView     // Catch: java.lang.Throwable -> L8b
            if (r0 == 0) goto L94
            r0 = r2 | 1025(0x401, float:1.436E-42)
            boolean r4 = r8 instanceof android.widget.Button     // Catch: java.lang.Throwable -> L8b
            if (r4 == 0) goto L80
            r0 = r2 | 1029(0x405, float:1.442E-42)
            boolean r4 = r8 instanceof android.widget.Switch     // Catch: java.lang.Throwable -> L8b
            if (r4 == 0) goto L82
            r0 = r2 | 9221(0x2405, float:1.2921E-41)
        L80:
            r2 = r0
            goto L8d
        L82:
            boolean r4 = r8 instanceof android.widget.CheckBox     // Catch: java.lang.Throwable -> L8b
            if (r4 == 0) goto L80
            r0 = 33797(0x8405, float:4.736E-41)
            r0 = r0 | r2
            goto L80
        L8b:
            r8 = move-exception
            goto Lc4
        L8d:
            boolean r8 = r8 instanceof android.widget.EditText     // Catch: java.lang.Throwable -> L8b
            if (r8 == 0) goto Lc3
            r2 = r2 | 2048(0x800, float:2.87E-42)
            goto Lc3
        L94:
            boolean r0 = r8 instanceof android.widget.Spinner     // Catch: java.lang.Throwable -> L8b
            if (r0 != 0) goto Lc1
            boolean r0 = r8 instanceof android.widget.DatePicker     // Catch: java.lang.Throwable -> L8b
            if (r0 == 0) goto L9d
            goto Lc1
        L9d:
            boolean r0 = r8 instanceof android.widget.RatingBar     // Catch: java.lang.Throwable -> L8b
            if (r0 == 0) goto La5
            r8 = 65536(0x10000, float:9.1835E-41)
            r2 = r2 | r8
            goto Lc3
        La5:
            boolean r0 = r8 instanceof android.widget.RadioGroup     // Catch: java.lang.Throwable -> L8b
            if (r0 == 0) goto Lac
            r2 = r2 | 16384(0x4000, float:2.2959E-41)
            goto Lc3
        Lac:
            boolean r0 = r8 instanceof android.view.ViewGroup     // Catch: java.lang.Throwable -> L8b
            if (r0 == 0) goto Lc3
            java.lang.ref.WeakReference r0 = fx.h.f17992b     // Catch: java.lang.Throwable -> L8b
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L8b
            android.view.View r0 = (android.view.View) r0     // Catch: java.lang.Throwable -> L8b
            boolean r8 = r5.m(r8, r0)     // Catch: java.lang.Throwable -> L8b
            if (r8 == 0) goto Lc3
            r2 = r2 | 64
            goto Lc3
        Lc1:
            r2 = r2 | 4096(0x1000, float:5.74E-42)
        Lc3:
            return r2
        Lc4:
            yx.a.a(r1, r8)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: fx.h.c(android.view.View):int");
    }

    public static final JSONObject d(View view) {
        if (yx.a.f46339a.contains(h.class)) {
            return null;
        }
        try {
            view.getClass();
            if (Intrinsics.areEqual(view.getClass().getName(), "com.facebook.react.ReactRootView")) {
                f17992b = new WeakReference(view);
            }
            JSONObject jSONObject = new JSONObject();
            try {
                n(view, jSONObject);
                JSONArray jSONArray = new JSONArray();
                ArrayList arrayListB = b(view);
                int size = arrayListB.size();
                for (int i11 = 0; i11 < size; i11++) {
                    jSONArray.put(d((View) arrayListB.get(i11)));
                }
                jSONObject.put("childviews", jSONArray);
                return jSONObject;
            } catch (JSONException e5) {
                Log.e("fx.h", "Failed to create JSONObject for view.", e5);
                return jSONObject;
            }
        } catch (Throwable th2) {
            yx.a.a(h.class, th2);
            return null;
        }
    }

    public static final View.OnClickListener f(View view) {
        Field declaredField;
        if (yx.a.f46339a.contains(h.class)) {
            return null;
        }
        try {
            Field declaredField2 = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
            if (declaredField2 != null) {
                declaredField2.setAccessible(true);
            }
            Object obj = declaredField2.get(view);
            if (obj == null || (declaredField = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener")) == null) {
                return null;
            }
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(obj);
            obj2.getClass();
            return (View.OnClickListener) obj2;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
            return null;
        } catch (Throwable th2) {
            yx.a.a(h.class, th2);
            return null;
        }
    }

    public static final View.OnTouchListener g(View view) {
        Field declaredField;
        try {
            if (!yx.a.f46339a.contains(h.class)) {
                try {
                    Field declaredField2 = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
                    if (declaredField2 != null) {
                        declaredField2.setAccessible(true);
                    }
                    Object obj = declaredField2.get(view);
                    if (obj != null && (declaredField = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnTouchListener")) != null) {
                        declaredField.setAccessible(true);
                        Object obj2 = declaredField.get(obj);
                        obj2.getClass();
                        return (View.OnTouchListener) obj2;
                    }
                } catch (ClassNotFoundException unused) {
                    a0 a0Var = a0.f4849a;
                } catch (IllegalAccessException unused2) {
                    a0 a0Var2 = a0.f4849a;
                } catch (NoSuchFieldException unused3) {
                    a0 a0Var3 = a0.f4849a;
                }
            }
            return null;
        } catch (Throwable th2) {
            yx.a.a(h.class, th2);
            return null;
        }
    }

    public static final String h(View view) {
        if (yx.a.f46339a.contains(h.class)) {
            return null;
        }
        try {
            CharSequence hint = view instanceof EditText ? ((EditText) view).getHint() : view instanceof TextView ? ((TextView) view).getHint() : null;
            if (hint == null) {
                return "";
            }
            String string = hint.toString();
            return string == null ? "" : string;
        } catch (Throwable th2) {
            yx.a.a(h.class, th2);
            return null;
        }
    }

    public static final ViewGroup i(View view) {
        if (!yx.a.f46339a.contains(h.class)) {
            try {
                ViewParent parent = view.getParent();
                if (parent instanceof ViewGroup) {
                    return (ViewGroup) parent;
                }
            } catch (Throwable th2) {
                yx.a.a(h.class, th2);
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String j(android.view.View r7) {
        /*
            Method dump skipped, instruction units count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fx.h.j(android.view.View):java.lang.String");
    }

    public static final void n(View view, JSONObject jSONObject) {
        if (yx.a.f46339a.contains(h.class)) {
            return;
        }
        try {
            view.getClass();
            try {
                String strJ = j(view);
                String strH = h(view);
                Object tag = view.getTag();
                CharSequence contentDescription = view.getContentDescription();
                jSONObject.put("classname", view.getClass().getCanonicalName());
                jSONObject.put("classtypebitmask", c(view));
                jSONObject.put("id", view.getId());
                if (g.b(view)) {
                    jSONObject.put(TextBundle.TEXT_ENTRY, "");
                    jSONObject.put("is_user_input", true);
                } else {
                    jSONObject.put(TextBundle.TEXT_ENTRY, n0.d(n0.H(strJ)));
                }
                jSONObject.put("hint", n0.d(n0.H(strH)));
                if (tag != null) {
                    jSONObject.put("tag", n0.d(n0.H(tag.toString())));
                }
                if (contentDescription != null) {
                    jSONObject.put("description", n0.d(n0.H(contentDescription.toString())));
                }
                jSONObject.put("dimension", f17991a.e(view));
            } catch (JSONException unused) {
                a0 a0Var = a0.f4849a;
            }
        } catch (Throwable th2) {
            yx.a.a(h.class, th2);
        }
    }

    public final JSONObject e(View view) {
        if (yx.a.f46339a.contains(this)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("top", view.getTop());
                jSONObject.put("left", view.getLeft());
                jSONObject.put("width", view.getWidth());
                jSONObject.put("height", view.getHeight());
                jSONObject.put("scrollx", view.getScrollX());
                jSONObject.put("scrolly", view.getScrollY());
                jSONObject.put("visibility", view.getVisibility());
                return jSONObject;
            } catch (JSONException e5) {
                Log.e("fx.h", "Failed to create JSONObject for dimension.", e5);
                return jSONObject;
            }
        } catch (Throwable th2) {
            yx.a.a(this, th2);
            return null;
        }
    }

    public final View k(View view, float[] fArr) {
        if (!yx.a.f46339a.contains(this)) {
            try {
                l();
                Method method = f17993c;
                if (method != null && view != null) {
                    try {
                        Object objInvoke = method.invoke(null, fArr, view);
                        objInvoke.getClass();
                        View view2 = (View) objInvoke;
                        if (view2.getId() > 0) {
                            Object parent = view2.getParent();
                            parent.getClass();
                            return (View) parent;
                        }
                    } catch (IllegalAccessException unused) {
                        a0 a0Var = a0.f4849a;
                    } catch (InvocationTargetException unused2) {
                        a0 a0Var2 = a0.f4849a;
                    }
                }
            } catch (Throwable th2) {
                yx.a.a(this, th2);
                return null;
            }
        }
        return null;
    }

    public final void l() {
        if (yx.a.f46339a.contains(this)) {
            return;
        }
        try {
            if (f17993c != null) {
                return;
            }
            try {
                Method declaredMethod = Class.forName("com.facebook.react.uimanager.TouchTargetHelper").getDeclaredMethod("findTouchTargetView", float[].class, ViewGroup.class);
                f17993c = declaredMethod;
                if (declaredMethod == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                declaredMethod.setAccessible(true);
            } catch (ClassNotFoundException unused) {
                a0 a0Var = a0.f4849a;
            } catch (NoSuchMethodException unused2) {
                a0 a0Var2 = a0.f4849a;
            }
        } catch (Throwable th2) {
            yx.a.a(this, th2);
        }
    }

    public final boolean m(View view, View view2) {
        Set set = yx.a.f46339a;
        if (set.contains(this)) {
            return false;
        }
        try {
            view.getClass();
            if (!Intrinsics.areEqual(view.getClass().getName(), "com.facebook.react.views.view.ReactViewGroup")) {
                return false;
            }
            float[] fArr = null;
            if (!set.contains(this)) {
                try {
                    view.getLocationOnScreen(new int[2]);
                    fArr = new float[]{r4[0], r4[1]};
                } catch (Throwable th2) {
                    yx.a.a(this, th2);
                }
            }
            View viewK = k(view2, fArr);
            if (viewK != null) {
                return viewK.getId() == view.getId();
            }
            return false;
        } catch (Throwable th3) {
            yx.a.a(this, th3);
            return false;
        }
    }
}
