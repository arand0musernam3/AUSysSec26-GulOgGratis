package vh;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import android.widget.ImageView;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.z;
import b0.i0;
import com.app.tgtg.R;
import java.util.ArrayList;
import java.util.List;
import pg.i2;
import pg.n;
import v80.f0;
import w6.j;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f42329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f42330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f42331c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f42332d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f42333e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f42334f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f42335g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f42336h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f42337i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public en.c f42338j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public en.d f42339k;

    public d(n nVar) {
        nVar.getClass();
        this.f42329a = nVar;
        this.f42330b = new ArrayList();
        this.f42331c = new ArrayList();
        this.f42332d = new ArrayList();
        this.f42333e = new ArrayList();
        this.f42335g = -1;
        this.f42336h = new ArrayList();
        this.f42337i = -1;
    }

    public static final boolean a(d dVar, int i11) {
        Rect rect = new Rect();
        dVar.f42329a.C.getLocalVisibleRect(rect);
        ArrayList arrayList = dVar.f42330b;
        View view = ((i2) arrayList.get(i11)).f34913x;
        view.getClass();
        float y5 = 0.0f;
        for (int i12 = 0; i12 < 10 && !(view instanceof NestedScrollView); i12++) {
            y5 += view.getY();
            Object parent = view.getParent();
            parent.getClass();
            view = (View) parent;
        }
        return ((double) rect.bottom) > ((((double) (y5 + ((float) ((i2) arrayList.get(i11)).f986f.getHeight()))) - (((double) ((i2) arrayList.get(i11)).f986f.getHeight()) * 0.8d)) + ((double) dVar.f42337i)) + ((double) (i11 * 6));
    }

    public final void b(List list, z zVar) {
        List list2;
        int i11 = this.f42335g;
        if (i11 >= this.f42330b.size() - 1) {
            this.f42334f = true;
            return;
        }
        list.getClass();
        int size = list.size();
        int i12 = i11 + 1;
        while (i12 < size) {
            if (this.f42336h.contains(Integer.valueOf(i12)) || i12 >= list.size()) {
                list2 = list;
            } else {
                list2 = list;
                f0.B(zVar, null, null, new i0(list2, i12, this, null, 6), 3);
            }
            i12++;
            list = list2;
        }
    }

    public final void c(int i11, Activity activity) {
        i2 i2Var = (i2) this.f42330b.get(i11);
        i2Var.f34913x.setTextAppearance(R.style.Body1_Black);
        i2Var.A.setPadding(d70.b.a(0), d70.b.a(16), d70.b.a(0), d70.b.a(16));
        i2Var.f34908s.setVisibility(8);
        i2Var.f34915z.setVisibility(8);
        ImageView imageView = i2Var.f34910u;
        Resources resources = activity.getResources();
        ThreadLocal threadLocal = j.f43256a;
        imageView.setImageDrawable(resources.getDrawable(R.drawable.system_icon_chevron_down_primary_30, null));
    }
}
