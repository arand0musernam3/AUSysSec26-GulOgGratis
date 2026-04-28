package h20;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.app.tgtg.R;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class o extends FrameLayout implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f21346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f21347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f21348c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public o.n f21349d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ColorStateList f21350e;

    public o(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(R.layout.m3_navigation_menu_subheader, (ViewGroup) this, true);
        this.f21346a = (TextView) findViewById(R.id.navigation_menu_subheader_label);
    }

    @Override // o.y
    public final void a(o.n nVar) {
        this.f21349d = nVar;
        nVar.setCheckable(false);
        this.f21346a.setText(nVar.f31574e);
        b();
    }

    public final void b() {
        o.n nVar = this.f21349d;
        if (nVar != null) {
            setVisibility((!nVar.isVisible() || (!this.f21347b && this.f21348c)) ? 8 : 0);
        }
    }

    @Override // o.y
    public o.n getItemData() {
        return this.f21349d;
    }

    @Override // h20.k
    public void setExpanded(boolean z11) {
        this.f21347b = z11;
        b();
    }

    @Override // h20.k
    public void setOnlyShowWhenExpanded(boolean z11) {
        this.f21348c = z11;
        b();
    }

    public void setTextAppearance(int i11) {
        TextView textView = this.f21346a;
        textView.setTextAppearance(i11);
        ColorStateList colorStateList = this.f21350e;
        if (colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f21350e = colorStateList;
        if (colorStateList != null) {
            this.f21346a.setTextColor(colorStateList);
        }
    }

    public void setCheckable(boolean z11) {
    }

    public void setChecked(boolean z11) {
    }

    @Override // android.view.View
    public void setEnabled(boolean z11) {
    }

    public void setIcon(Drawable drawable) {
    }

    public void setTitle(CharSequence charSequence) {
    }

    public void setShortcut(boolean z11, char c3) {
    }
}
