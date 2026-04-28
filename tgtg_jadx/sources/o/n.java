package o;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements a7.a {
    public o A;
    public MenuItem.OnActionExpandListener B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f31570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f31571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f31572c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f31573d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f31574e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CharSequence f31575f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Intent f31576g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public char f31577h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public char f31579j;
    public Drawable l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final l f31582n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public d0 f31583o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f31584p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public CharSequence f31585q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public CharSequence f31586r;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f31593y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public View f31594z;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f31578i = 4096;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f31580k = 4096;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f31581m = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ColorStateList f31587s = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public PorterDuff.Mode f31588t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f31589u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f31590v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f31591w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f31592x = 16;
    public boolean C = false;

    public n(l lVar, int i11, int i12, int i13, int i14, CharSequence charSequence, int i15) {
        this.f31582n = lVar;
        this.f31570a = i12;
        this.f31571b = i11;
        this.f31572c = i13;
        this.f31573d = i14;
        this.f31574e = charSequence;
        this.f31593y = i15;
    }

    public static void a(int i11, int i12, String str, StringBuilder sb2) {
        if ((i11 & i12) == i12) {
            sb2.append(str);
        }
    }

    @Override // a7.a
    public final o b() {
        return this.A;
    }

    @Override // a7.a
    public final a7.a c(o oVar) {
        this.f31594z = null;
        this.A = oVar;
        this.f31582n.p(true);
        o oVar2 = this.A;
        if (oVar2 != null) {
            oVar2.f31595a = new m1.a(this);
            oVar2.f31596b.setVisibilityListener(oVar2);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f31593y & 8) == 0) {
            return false;
        }
        if (this.f31594z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f31582n.d(this);
        }
        return false;
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f31591w && (this.f31589u || this.f31590v)) {
            drawable = drawable.mutate();
            if (this.f31589u) {
                drawable.setTintList(this.f31587s);
            }
            if (this.f31590v) {
                drawable.setTintMode(this.f31588t);
            }
            this.f31591w = false;
        }
        return drawable;
    }

    public final boolean e() {
        o oVar;
        if ((this.f31593y & 8) != 0) {
            if (this.f31594z == null && (oVar = this.A) != null) {
                this.f31594z = oVar.f31596b.onCreateActionView(this);
            }
            if (this.f31594z != null) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f31582n.f(this);
        }
        return false;
    }

    public final void f(boolean z11) {
        this.f31592x = (z11 ? 4 : 0) | (this.f31592x & (-5));
    }

    public final void g(boolean z11) {
        int i11 = this.f31592x;
        if (z11) {
            this.f31592x = i11 | 32;
        } else {
            this.f31592x = i11 & (-33);
        }
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f31594z;
        if (view != null) {
            return view;
        }
        o oVar = this.A;
        if (oVar == null) {
            return null;
        }
        View viewOnCreateActionView = oVar.f31596b.onCreateActionView(this);
        this.f31594z = viewOnCreateActionView;
        return viewOnCreateActionView;
    }

    @Override // a7.a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f31580k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f31579j;
    }

    @Override // a7.a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f31585q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f31571b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.l;
        if (drawable != null) {
            return d(drawable);
        }
        int i11 = this.f31581m;
        if (i11 == 0) {
            return null;
        }
        Drawable drawableX = b0.a0.x(this.f31582n.f31544a, i11);
        this.f31581m = 0;
        this.l = drawableX;
        return d(drawableX);
    }

    @Override // a7.a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f31587s;
    }

    @Override // a7.a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f31588t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f31576g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f31570a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // a7.a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f31578i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f31577h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f31572c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f31583o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f31574e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f31575f;
        return charSequence != null ? charSequence : this.f31574e;
    }

    @Override // a7.a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f31586r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f31583o != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.C;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f31592x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f31592x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f31592x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        o oVar = this.A;
        return (oVar == null || !oVar.f31596b.overridesItemVisibility()) ? (this.f31592x & 8) == 0 : (this.f31592x & 8) == 0 && this.A.f31596b.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i11) {
        int i12;
        l lVar = this.f31582n;
        Context context = lVar.f31544a;
        View viewInflate = LayoutInflater.from(context).inflate(i11, (ViewGroup) new LinearLayout(context), false);
        this.f31594z = viewInflate;
        this.A = null;
        if (viewInflate != null && viewInflate.getId() == -1 && (i12 = this.f31570a) > 0) {
            viewInflate.setId(i12);
        }
        lVar.f31554k = true;
        lVar.p(true);
        return this;
    }

    @Override // a7.a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c3, int i11) {
        if (this.f31579j == c3 && this.f31580k == i11) {
            return this;
        }
        this.f31579j = Character.toLowerCase(c3);
        this.f31580k = KeyEvent.normalizeMetaState(i11);
        this.f31582n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z11) {
        int i11 = this.f31592x;
        int i12 = (z11 ? 1 : 0) | (i11 & (-2));
        this.f31592x = i12;
        if (i11 != i12) {
            this.f31582n.p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z11) {
        int i11 = this.f31592x;
        int i12 = i11 & 4;
        l lVar = this.f31582n;
        if (i12 == 0) {
            int i13 = (i11 & (-3)) | (z11 ? 2 : 0);
            this.f31592x = i13;
            if (i11 != i13) {
                lVar.p(false);
            }
            return this;
        }
        ArrayList arrayList = lVar.f31549f;
        int size = arrayList.size();
        lVar.y();
        for (int i14 = 0; i14 < size; i14++) {
            n nVar = (n) arrayList.get(i14);
            if (nVar.f31571b == this.f31571b && (nVar.f31592x & 4) != 0 && nVar.isCheckable()) {
                boolean z12 = nVar == this;
                int i15 = nVar.f31592x;
                int i16 = (z12 ? 2 : 0) | (i15 & (-3));
                nVar.f31592x = i16;
                if (i15 != i16) {
                    nVar.f31582n.p(false);
                }
            }
        }
        lVar.x();
        return this;
    }

    @Override // a7.a, android.view.MenuItem
    public final a7.a setContentDescription(CharSequence charSequence) {
        this.f31585q = charSequence;
        this.f31582n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z11) {
        int i11 = this.f31592x;
        if (z11) {
            this.f31592x = i11 | 16;
        } else {
            this.f31592x = i11 & (-17);
        }
        this.f31582n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i11) {
        this.l = null;
        this.f31581m = i11;
        this.f31591w = true;
        this.f31582n.p(false);
        return this;
    }

    @Override // a7.a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f31587s = colorStateList;
        this.f31589u = true;
        this.f31591w = true;
        this.f31582n.p(false);
        return this;
    }

    @Override // a7.a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f31588t = mode;
        this.f31590v = true;
        this.f31591w = true;
        this.f31582n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f31576g = intent;
        return this;
    }

    @Override // a7.a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c3, int i11) {
        if (this.f31577h == c3 && this.f31578i == i11) {
            return this;
        }
        this.f31577h = c3;
        this.f31578i = KeyEvent.normalizeMetaState(i11);
        this.f31582n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f31584p = onMenuItemClickListener;
        return this;
    }

    @Override // a7.a, android.view.MenuItem
    public final MenuItem setShortcut(char c3, char c7, int i11, int i12) {
        this.f31577h = c3;
        this.f31578i = KeyEvent.normalizeMetaState(i11);
        this.f31579j = Character.toLowerCase(c7);
        this.f31580k = KeyEvent.normalizeMetaState(i12);
        this.f31582n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i11) {
        int i12 = i11 & 3;
        if (i12 != 0 && i12 != 1 && i12 != 2) {
            i4.a.f("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
            return;
        }
        this.f31593y = i11;
        l lVar = this.f31582n;
        lVar.f31554k = true;
        lVar.p(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i11) {
        setShowAsAction(i11);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f31574e = charSequence;
        this.f31582n.p(false);
        d0 d0Var = this.f31583o;
        if (d0Var != null) {
            d0Var.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f31575f = charSequence;
        this.f31582n.p(false);
        return this;
    }

    @Override // a7.a, android.view.MenuItem
    public final a7.a setTooltipText(CharSequence charSequence) {
        this.f31586r = charSequence;
        this.f31582n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z11) {
        int i11 = this.f31592x;
        int i12 = (z11 ? 0 : 8) | (i11 & (-9));
        this.f31592x = i12;
        if (i11 != i12) {
            l lVar = this.f31582n;
            lVar.f31551h = true;
            lVar.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f31574e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f31581m = 0;
        this.l = drawable;
        this.f31591w = true;
        this.f31582n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i11) {
        setTitle(this.f31582n.f31544a.getString(i11));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c3) {
        if (this.f31577h == c3) {
            return this;
        }
        this.f31577h = c3;
        this.f31582n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c3, char c7) {
        this.f31577h = c3;
        this.f31579j = Character.toLowerCase(c7);
        this.f31582n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c3) {
        if (this.f31579j == c3) {
            return this;
        }
        this.f31579j = Character.toLowerCase(c3);
        this.f31582n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i11;
        this.f31594z = view;
        this.A = null;
        if (view != null && view.getId() == -1 && (i11 = this.f31570a) > 0) {
            view.setId(i11);
        }
        l lVar = this.f31582n;
        lVar.f31554k = true;
        lVar.p(true);
        return this;
    }
}
