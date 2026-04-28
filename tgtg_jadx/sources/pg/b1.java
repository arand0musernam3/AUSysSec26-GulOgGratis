package pg;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.app.tgtg.R;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b1 implements sa.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewGroup f34794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f34795c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f34796d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final View f34797e;

    public b1(CardView cardView, CardView cardView2, ConstraintLayout constraintLayout, TextView textView) {
        this.f34793a = 1;
        this.f34796d = cardView;
        this.f34797e = cardView2;
        this.f34794b = constraintLayout;
        this.f34795c = textView;
    }

    public static b1 a(View view) {
        CardView cardView = (CardView) view;
        int i11 = R.id.checkedIv;
        if (((ImageView) pd.g.t(R.id.checkedIv, view)) != null) {
            i11 = R.id.constraint;
            ConstraintLayout constraintLayout = (ConstraintLayout) pd.g.t(R.id.constraint, view);
            if (constraintLayout != null) {
                i11 = R.id.title;
                TextView textView = (TextView) pd.g.t(R.id.title, view);
                if (textView != null) {
                    return new b1(cardView, cardView, constraintLayout, textView);
                }
            }
        }
        c50.w.l("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
        return null;
    }

    public static b1 b(View view) {
        int i11 = R.id.ivToolbarBack;
        ImageButton imageButton = (ImageButton) pd.g.t(R.id.ivToolbarBack, view);
        if (imageButton != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            i11 = R.id.tvToolbarTitle;
            TextView textView = (TextView) pd.g.t(R.id.tvToolbarTitle, view);
            if (textView != null) {
                return new b1(linearLayout, imageButton, linearLayout, textView, 6);
            }
        }
        c50.w.l("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
        return null;
    }

    public static b1 c(View view) {
        int i11 = R.id.ibAction;
        ImageButton imageButton = (ImageButton) pd.g.t(R.id.ibAction, view);
        if (imageButton != null) {
            i11 = R.id.ivToolbarBack;
            ImageButton imageButton2 = (ImageButton) pd.g.t(R.id.ivToolbarBack, view);
            if (imageButton2 != null) {
                LinearLayout linearLayout = (LinearLayout) view;
                i11 = R.id.tvToolbarTitle;
                TextView textView = (TextView) pd.g.t(R.id.tvToolbarTitle, view);
                if (textView != null) {
                    return new b1(linearLayout, imageButton, imageButton2, textView, 7);
                }
            }
        }
        c50.w.l("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
        return null;
    }

    @Override // sa.a
    public final View getRoot() {
        switch (this.f34793a) {
        }
        return (LinearLayout) this.f34794b;
    }

    public /* synthetic */ b1(ViewGroup viewGroup, View view, View view2, View view3, int i11) {
        this.f34793a = i11;
        this.f34794b = viewGroup;
        this.f34796d = view;
        this.f34797e = view2;
        this.f34795c = view3;
    }

    public b1(ConstraintLayout constraintLayout, TextView textView, Button button, TextView textView2) {
        this.f34793a = 4;
        this.f34794b = constraintLayout;
        this.f34795c = textView;
        this.f34796d = button;
        this.f34797e = textView2;
    }
}
