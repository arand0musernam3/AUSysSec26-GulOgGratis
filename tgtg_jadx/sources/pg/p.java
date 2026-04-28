package pg;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.app.tgtg.customview.ExpandableTextView;
import com.app.tgtg.customview.MenuItemView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements sa.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35036a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinearLayout f35037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConstraintLayout f35038c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ComposeView f35039d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ImageView f35040e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinearLayout f35041f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f35042g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f35043h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f35044i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f35045j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final LinearLayout f35046k;
    public final View l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final View f35047m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final View f35048n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final View f35049o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final View f35050p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final View f35051q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final View f35052r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final View f35053s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ConstraintLayout f35054t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Object f35055u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final TextView f35056v;

    public p(LinearLayout linearLayout, Button button, ConstraintLayout constraintLayout, ComposeView composeView, EditText editText, EditText editText2, ImageView imageView, ListView listView, ListView listView2, ListView listView3, MenuItemView menuItemView, MenuItemView menuItemView2, MenuItemView menuItemView3, LinearLayout linearLayout2, b1 b1Var, TextView textView, TextView textView2, TextView textView3, TextView textView4, Button button2, LinearLayout linearLayout3) {
        this.f35037b = linearLayout;
        this.l = button;
        this.f35038c = constraintLayout;
        this.f35039d = composeView;
        this.f35047m = editText;
        this.f35048n = editText2;
        this.f35040e = imageView;
        this.f35049o = listView;
        this.f35050p = listView2;
        this.f35051q = listView3;
        this.f35052r = menuItemView;
        this.f35053s = menuItemView2;
        this.f35054t = menuItemView3;
        this.f35041f = linearLayout2;
        this.f35055u = b1Var;
        this.f35042g = textView;
        this.f35043h = textView2;
        this.f35044i = textView3;
        this.f35045j = textView4;
        this.f35056v = button2;
        this.f35046k = linearLayout3;
    }

    @Override // sa.a
    public final View getRoot() {
        switch (this.f35036a) {
        }
        return this.f35037b;
    }

    public p(LinearLayout linearLayout, TextView textView, ConstraintLayout constraintLayout, FrameLayout frameLayout, ExpandableTextView expandableTextView, LinearLayout linearLayout2, LinearLayout linearLayout3, TextView textView2, LinearLayout linearLayout4, TextView textView3, TextView textView4, LinearLayout linearLayout5, ConstraintLayout constraintLayout2, TextView textView5, ComposeView composeView, TextView textView6, LinearLayout linearLayout6, ImageView imageView, TextView textView7, TextView textView8, TextView textView9) {
        this.f35037b = linearLayout;
        this.f35042g = textView;
        this.f35038c = constraintLayout;
        this.f35055u = frameLayout;
        this.f35056v = expandableTextView;
        this.f35041f = linearLayout2;
        this.f35046k = linearLayout3;
        this.f35043h = textView2;
        this.l = linearLayout4;
        this.f35044i = textView3;
        this.f35045j = textView4;
        this.f35047m = linearLayout5;
        this.f35054t = constraintLayout2;
        this.f35049o = textView5;
        this.f35039d = composeView;
        this.f35050p = textView6;
        this.f35048n = linearLayout6;
        this.f35040e = imageView;
        this.f35051q = textView7;
        this.f35052r = textView8;
        this.f35053s = textView9;
    }
}
