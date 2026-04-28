package rx;

import android.view.View;
import ax.a0;
import b0.g;
import fx.h;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;
import kotlin.text.y;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f implements View.OnClickListener {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final HashSet f38262e = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View.OnClickListener f38263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference f38264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakReference f38265c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f38266d;

    public f(View view, View view2, String str) {
        this.f38263a = h.f(view);
        this.f38264b = new WeakReference(view2);
        this.f38265c = new WeakReference(view);
        String lowerCase = str.toLowerCase();
        lowerCase.getClass();
        this.f38266d = y.n(lowerCase, "activity", "", false);
    }

    public final void a() {
        Set set = yx.a.f46339a;
        if (!set.contains(this)) {
            try {
                View view = (View) this.f38264b.get();
                View view2 = (View) this.f38265c.get();
                if (view != null && view2 != null) {
                    try {
                        String strD = c.d(view2);
                        String strB = b.b(view2, strD);
                        if (strB != null && !a.a(strB, strD)) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("view", c.b(view, view2));
                            jSONObject.put("screenname", this.f38266d);
                            try {
                                if (!set.contains(this)) {
                                    try {
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                    try {
                                        a0.c().execute(new g(9, jSONObject, strD, this, strB));
                                    } catch (Throwable th3) {
                                        th = th3;
                                        try {
                                            yx.a.a(this, th);
                                        } catch (Throwable th4) {
                                            th = th4;
                                            yx.a.a(this, th);
                                        }
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        }
                    } catch (Exception unused2) {
                    }
                }
            } catch (Throwable th5) {
                th = th5;
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (yx.a.f46339a.contains(this)) {
            return;
        }
        try {
            view.getClass();
            View.OnClickListener onClickListener = this.f38263a;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
            a();
        } catch (Throwable th2) {
            yx.a.a(this, th2);
        }
    }
}
