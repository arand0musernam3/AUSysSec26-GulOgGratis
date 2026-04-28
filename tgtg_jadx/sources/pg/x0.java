package pg;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.app.tgtg.customview.TGTGLoadingView;
import com.google.android.material.textfield.TextInputEditText;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class x0 implements sa.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35260a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConstraintLayout f35261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ViewGroup f35262c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f35263d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final View f35264e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f35265f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f35266g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f35267h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f35268i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final View f35269j;

    public x0(ConstraintLayout constraintLayout, View view, ConstraintLayout constraintLayout2, TextView textView, TextView textView2, j1 j1Var, TextView textView3, TextView textView4, View view2) {
        this.f35261b = constraintLayout;
        this.f35264e = view;
        this.f35262c = constraintLayout2;
        this.f35263d = textView;
        this.f35265f = textView2;
        this.f35266g = j1Var;
        this.f35267h = textView3;
        this.f35268i = textView4;
        this.f35269j = view2;
    }

    @Override // sa.a
    public final View getRoot() {
        switch (this.f35260a) {
        }
        return this.f35261b;
    }

    public x0(ConstraintLayout constraintLayout, Button button, RecyclerView recyclerView, TGTGLoadingView tGTGLoadingView, LottieAnimationView lottieAnimationView, EditText editText, b1 b1Var, TextView textView, TextView textView2) {
        this.f35261b = constraintLayout;
        this.f35265f = button;
        this.f35262c = recyclerView;
        this.f35269j = tGTGLoadingView;
        this.f35264e = lottieAnimationView;
        this.f35266g = editText;
        this.f35267h = b1Var;
        this.f35263d = textView;
        this.f35268i = textView2;
    }

    public x0(ConstraintLayout constraintLayout, ImageButton imageButton, Button button, AppCompatCheckBox appCompatCheckBox, ScrollView scrollView, TextView textView, TextInputEditText textInputEditText, ConstraintLayout constraintLayout2, TGTGLoadingView tGTGLoadingView) {
        this.f35261b = constraintLayout;
        this.f35264e = imageButton;
        this.f35265f = button;
        this.f35266g = appCompatCheckBox;
        this.f35267h = scrollView;
        this.f35263d = textView;
        this.f35268i = textInputEditText;
        this.f35262c = constraintLayout2;
        this.f35269j = tGTGLoadingView;
    }
}
