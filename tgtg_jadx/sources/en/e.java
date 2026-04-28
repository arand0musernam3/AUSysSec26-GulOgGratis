package en;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import android.widget.ImageView;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.z;
import b0.i0;
import com.app.tgtg.R;
import com.app.tgtg.feature.main.fragments.delivery.parcelitemdetails.ManufacturerItemDetailsActivity;
import java.util.ArrayList;
import java.util.List;
import pg.a2;
import pg.i2;
import v80.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a2 f16126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f16127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f16128c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f16129d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f16130e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f16131f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f16132g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f16133h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f16134i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c f16135j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public d f16136k;

    public e(a2 a2Var) {
        a2Var.getClass();
        this.f16126a = a2Var;
        this.f16127b = new ArrayList();
        this.f16128c = new ArrayList();
        this.f16129d = new ArrayList();
        this.f16130e = new ArrayList();
        this.f16132g = -1;
        this.f16133h = new ArrayList();
        this.f16134i = -1;
    }

    public static final boolean a(e eVar, int i11) {
        Rect rect = new Rect();
        eVar.f16126a.E.getLocalVisibleRect(rect);
        ArrayList arrayList = eVar.f16127b;
        View view = ((i2) arrayList.get(i11)).f34913x;
        view.getClass();
        float y5 = 0.0f;
        for (int i12 = 0; i12 < 10 && !(view instanceof NestedScrollView); i12++) {
            y5 += view.getY();
            Object parent = view.getParent();
            parent.getClass();
            view = (View) parent;
        }
        return ((double) rect.bottom) > ((((double) (y5 + ((float) ((i2) arrayList.get(i11)).f986f.getHeight()))) - (((double) ((i2) arrayList.get(i11)).f986f.getHeight()) * 0.8d)) + ((double) eVar.f16134i)) + ((double) (i11 * 6));
    }

    public final void b(List list, z zVar) {
        List list2;
        int i11 = this.f16132g;
        if (list != null) {
            if (i11 >= this.f16127b.size() - 1) {
                this.f16131f = true;
                return;
            }
            int size = list.size();
            int i12 = i11 + 1;
            while (i12 < size) {
                if (this.f16133h.contains(Integer.valueOf(i12)) || i12 >= list.size()) {
                    list2 = list;
                } else {
                    list2 = list;
                    f0.B(zVar, null, null, new i0(list2, i12, this, null, 2), 3);
                }
                i12++;
                list = list2;
            }
        }
    }

    public final void c(int i11, ManufacturerItemDetailsActivity manufacturerItemDetailsActivity) {
        i2 i2Var = (i2) this.f16127b.get(i11);
        i2Var.f34913x.setTextAppearance(R.style.Body1_Black);
        i2Var.A.setPadding(d70.b.a(0), d70.b.a(16), d70.b.a(0), d70.b.a(16));
        i2Var.f34908s.setVisibility(8);
        i2Var.f34915z.setVisibility(8);
        ImageView imageView = i2Var.f34910u;
        Resources resources = manufacturerItemDetailsActivity.getResources();
        ThreadLocal threadLocal = w6.j.f43256a;
        imageView.setImageDrawable(resources.getDrawable(R.drawable.system_icon_chevron_down_primary_30, null));
    }
}
