package pg;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.material.slider.Slider;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class r1 implements sa.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f35116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinearLayout f35117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f35118c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Button f35119d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f35120e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Slider f35121f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LinearLayout f35122g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ListView f35123h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f35124i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ProgressBar f35125j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final EditText f35126k;
    public final TextView l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final TextView f35127m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Button f35128n;

    public r1(LinearLayout linearLayout, LinearLayout linearLayout2, ImageView imageView, Button button, TextView textView, Slider slider, LinearLayout linearLayout3, ListView listView, TextView textView2, ProgressBar progressBar, EditText editText, TextView textView3, TextView textView4, Button button2) {
        this.f35116a = linearLayout;
        this.f35117b = linearLayout2;
        this.f35118c = imageView;
        this.f35119d = button;
        this.f35120e = textView;
        this.f35121f = slider;
        this.f35122g = linearLayout3;
        this.f35123h = listView;
        this.f35124i = textView2;
        this.f35125j = progressBar;
        this.f35126k = editText;
        this.l = textView3;
        this.f35127m = textView4;
        this.f35128n = button2;
    }

    @Override // sa.a
    public final View getRoot() {
        return this.f35116a;
    }
}
