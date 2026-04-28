package s20;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Drawable f38788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CharSequence f38789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CharSequence f38790c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f38791d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f38792e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TabLayout f38793f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public j f38794g;

    public final void a(View view) {
        this.f38792e = view;
        c();
    }

    public final void b(CharSequence charSequence) {
        if (TextUtils.isEmpty(this.f38790c) && !TextUtils.isEmpty(charSequence)) {
            this.f38794g.setContentDescription(charSequence);
        }
        this.f38789b = charSequence;
        c();
    }

    public final void c() {
        j jVar = this.f38794g;
        if (jVar != null) {
            jVar.d();
        }
    }
}
