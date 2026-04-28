package pg;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class o3 implements sa.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f35031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AppCompatCheckBox f35032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AppCompatCheckBox f35033c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f35034d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f35035e;

    public o3(ConstraintLayout constraintLayout, AppCompatCheckBox appCompatCheckBox, AppCompatCheckBox appCompatCheckBox2, TextView textView, TextView textView2) {
        this.f35031a = constraintLayout;
        this.f35032b = appCompatCheckBox;
        this.f35033c = appCompatCheckBox2;
        this.f35034d = textView;
        this.f35035e = textView2;
    }

    @Override // sa.a
    public final View getRoot() {
        return this.f35031a;
    }
}
