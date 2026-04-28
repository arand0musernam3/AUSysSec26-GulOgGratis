package pg;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.app.tgtg.R;
import com.app.tgtg.customview.MenuItemView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements sa.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConstraintLayout f34801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f34802c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f34803d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final View f34804e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final View f34805f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final View f34806g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f34807h;

    public /* synthetic */ c(ConstraintLayout constraintLayout, Object obj, View view, View view2, View view3, View view4, Object obj2, int i11) {
        this.f34800a = i11;
        this.f34801b = constraintLayout;
        this.f34802c = obj;
        this.f34803d = view;
        this.f34804e = view2;
        this.f34805f = view3;
        this.f34806g = view4;
        this.f34807h = obj2;
    }

    public static c a(LayoutInflater layoutInflater, MenuItemView menuItemView) {
        View viewInflate = layoutInflater.inflate(R.layout.menu_item, (ViewGroup) menuItemView, false);
        menuItemView.addView(viewInflate);
        int i11 = R.id.favIcon;
        ImageView imageView = (ImageView) pd.g.t(R.id.favIcon, viewInflate);
        if (imageView != null) {
            i11 = R.id.imBreadcrumb;
            ImageView imageView2 = (ImageView) pd.g.t(R.id.imBreadcrumb, viewInflate);
            if (imageView2 != null) {
                i11 = R.id.ivArrow;
                ImageView imageView3 = (ImageView) pd.g.t(R.id.ivArrow, viewInflate);
                if (imageView3 != null) {
                    i11 = R.id.ivEmailBreadcrumb;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) pd.g.t(R.id.ivEmailBreadcrumb, viewInflate);
                    if (appCompatImageView != null) {
                        i11 = R.id.tvMenuTitle;
                        TextView textView = (TextView) pd.g.t(R.id.tvMenuTitle, viewInflate);
                        if (textView != null) {
                            i11 = R.id.tvSubTitle;
                            TextView textView2 = (TextView) pd.g.t(R.id.tvSubTitle, viewInflate);
                            if (textView2 != null) {
                                return new c((ConstraintLayout) viewInflate, imageView, imageView2, imageView3, appCompatImageView, textView, textView2, 3);
                            }
                        }
                    }
                }
            }
        }
        c50.w.l("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
        return null;
    }

    @Override // sa.a
    public final View getRoot() {
        switch (this.f34800a) {
        }
        return this.f34801b;
    }
}
