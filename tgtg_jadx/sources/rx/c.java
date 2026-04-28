package rx;

import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TimePicker;
import fx.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.d0;
import org.bouncycastle.i18n.TextBundle;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f38252a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f38253b = d0.h(Switch.class, Spinner.class, DatePicker.class, TimePicker.class, RadioGroup.class, RatingBar.class, EditText.class, AdapterView.class);

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:
    
        if (r5.isClickable() == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0035, code lost:
    
        r0.add(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
    
        r5 = fx.h.b(r5).iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        if (r5.hasNext() == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        r0.addAll(a((android.view.View) r5.next()));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.ArrayList a(android.view.View r5) {
        /*
            java.util.Set r0 = yx.a.f46339a
            java.lang.Class<rx.c> r1 = rx.c.class
            boolean r0 = r0.contains(r1)
            r2 = 0
            if (r0 == 0) goto Lc
            return r2
        Lc:
            r5.getClass()     // Catch: java.lang.Throwable -> L2d
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L2d
            r0.<init>()     // Catch: java.lang.Throwable -> L2d
            java.util.List r3 = rx.c.f38253b     // Catch: java.lang.Throwable -> L2d
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L2d
        L1a:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L2d
            if (r4 == 0) goto L2f
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L2d
            java.lang.Class r4 = (java.lang.Class) r4     // Catch: java.lang.Throwable -> L2d
            boolean r4 = r4.isInstance(r5)     // Catch: java.lang.Throwable -> L2d
            if (r4 == 0) goto L1a
            goto L54
        L2d:
            r5 = move-exception
            goto L55
        L2f:
            boolean r3 = r5.isClickable()     // Catch: java.lang.Throwable -> L2d
            if (r3 == 0) goto L38
            r0.add(r5)     // Catch: java.lang.Throwable -> L2d
        L38:
            java.util.ArrayList r5 = fx.h.b(r5)     // Catch: java.lang.Throwable -> L2d
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L2d
        L40:
            boolean r3 = r5.hasNext()     // Catch: java.lang.Throwable -> L2d
            if (r3 == 0) goto L54
            java.lang.Object r3 = r5.next()     // Catch: java.lang.Throwable -> L2d
            android.view.View r3 = (android.view.View) r3     // Catch: java.lang.Throwable -> L2d
            java.util.ArrayList r3 = a(r3)     // Catch: java.lang.Throwable -> L2d
            r0.addAll(r3)     // Catch: java.lang.Throwable -> L2d
            goto L40
        L54:
            return r0
        L55:
            yx.a.a(r1, r5)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: rx.c.a(android.view.View):java.util.ArrayList");
    }

    public static final JSONObject b(View view, View view2) {
        if (yx.a.f46339a.contains(c.class)) {
            return null;
        }
        try {
            view.getClass();
            JSONObject jSONObject = new JSONObject();
            if (view == view2) {
                try {
                    jSONObject.put("is_interacted", true);
                } catch (JSONException unused) {
                }
            }
            e(view, jSONObject);
            JSONArray jSONArray = new JSONArray();
            Iterator it = h.b(view).iterator();
            while (it.hasNext()) {
                jSONArray.put(b((View) it.next(), view2));
            }
            jSONObject.put("childviews", jSONArray);
            return jSONObject;
        } catch (Throwable th2) {
            yx.a.a(c.class, th2);
            return null;
        }
    }

    public static final String d(View view) {
        if (yx.a.f46339a.contains(c.class)) {
            return null;
        }
        try {
            view.getClass();
            String strJ = h.j(view);
            if (strJ.length() > 0) {
                return strJ;
            }
            String strJoin = TextUtils.join(" ", f38252a.c(view));
            strJoin.getClass();
            return strJoin;
        } catch (Throwable th2) {
            yx.a.a(c.class, th2);
            return null;
        }
    }

    public static final void e(View view, JSONObject jSONObject) {
        if (yx.a.f46339a.contains(c.class)) {
            return;
        }
        try {
            view.getClass();
            try {
                String strJ = h.j(view);
                String strH = h.h(view);
                jSONObject.put("classname", view.getClass().getSimpleName());
                jSONObject.put("classtypebitmask", h.c(view));
                if (strJ.length() > 0) {
                    jSONObject.put(TextBundle.TEXT_ENTRY, strJ);
                }
                if (strH.length() > 0) {
                    jSONObject.put("hint", strH);
                }
                if (view instanceof EditText) {
                    jSONObject.put("inputtype", ((EditText) view).getInputType());
                }
            } catch (JSONException unused) {
            }
        } catch (Throwable th2) {
            yx.a.a(c.class, th2);
        }
    }

    public final ArrayList c(View view) {
        if (yx.a.f46339a.contains(this)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            for (View view2 : h.b(view)) {
                String strJ = h.j(view2);
                if (strJ.length() > 0) {
                    arrayList.add(strJ);
                }
                arrayList.addAll(c(view2));
            }
            return arrayList;
        } catch (Throwable th2) {
            yx.a.a(this, th2);
            return null;
        }
    }
}
