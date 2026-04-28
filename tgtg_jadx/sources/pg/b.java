package pg;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.app.tgtg.customview.TagContainerView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements sa.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewGroup f34781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f34782c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f34783d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final View f34784e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final View f34785f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final View f34786g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final View f34787h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final View f34788i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f34789j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final View f34790k;
    public final Object l;

    public b(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, TagContainerView tagContainerView, TextView textView, TextView textView2, TextView textView3, TextView textView4, LinearLayout linearLayout, ImageView imageView, TextView textView5, AppCompatTextView appCompatTextView) {
        this.f34780a = 3;
        this.f34782c = constraintLayout;
        this.f34783d = constraintLayout2;
        this.f34784e = tagContainerView;
        this.f34785f = textView;
        this.f34786g = textView2;
        this.f34787h = textView3;
        this.f34788i = textView4;
        this.f34781b = linearLayout;
        this.f34789j = imageView;
        this.f34790k = textView5;
        this.l = appCompatTextView;
    }

    @Override // sa.a
    public final View getRoot() {
        switch (this.f34780a) {
            case 0:
                return (LinearLayout) this.f34781b;
            case 1:
                return (RelativeLayout) this.f34781b;
            case 2:
                return (ConstraintLayout) this.f34781b;
            default:
                return (ConstraintLayout) this.f34782c;
        }
    }

    public /* synthetic */ b(ViewGroup viewGroup, View view, View view2, View view3, View view4, View view5, ViewGroup viewGroup2, View view6, Object obj, View view7, Object obj2, int i11) {
        this.f34780a = i11;
        this.f34781b = viewGroup;
        this.f34782c = view;
        this.f34783d = view2;
        this.f34784e = view3;
        this.f34785f = view4;
        this.f34786g = view5;
        this.f34787h = viewGroup2;
        this.f34788i = view6;
        this.f34789j = obj;
        this.f34790k = view7;
        this.l = obj2;
    }
}
