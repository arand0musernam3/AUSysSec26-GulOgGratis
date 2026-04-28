package o;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements a7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CharSequence f31456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CharSequence f31457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Intent f31458c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public char f31459d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f31460e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public char f31461f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f31462g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Drawable f31463h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Context f31464i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CharSequence f31465j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CharSequence f31466k;
    public ColorStateList l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public PorterDuff.Mode f31467m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f31468n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f31469o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f31470p;

    public final void a() {
        Drawable drawable = this.f31463h;
        if (drawable != null) {
            if (this.f31468n || this.f31469o) {
                this.f31463h = drawable;
                Drawable drawableMutate = drawable.mutate();
                this.f31463h = drawableMutate;
                if (this.f31468n) {
                    drawableMutate.setTintList(this.l);
                }
                if (this.f31469o) {
                    this.f31463h.setTintMode(this.f31467m);
                }
            }
        }
    }

    @Override // a7.a
    public final o b() {
        return null;
    }

    @Override // a7.a
    public final a7.a c(o oVar) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        return null;
    }

    @Override // a7.a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f31462g;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f31461f;
    }

    @Override // a7.a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f31465j;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f31463h;
    }

    @Override // a7.a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.l;
    }

    @Override // a7.a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f31467m;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f31458c;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return R.id.home;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // a7.a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f31460e;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f31459d;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f31456a;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f31457b;
        return charSequence != null ? charSequence : this.f31456a;
    }

    @Override // a7.a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f31466k;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f31470p & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f31470p & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f31470p & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f31470p & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // a7.a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c3, int i11) {
        this.f31461f = Character.toLowerCase(c3);
        this.f31462g = KeyEvent.normalizeMetaState(i11);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z11) {
        this.f31470p = (z11 ? 1 : 0) | (this.f31470p & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z11) {
        this.f31470p = (z11 ? 2 : 0) | (this.f31470p & (-3));
        return this;
    }

    @Override // a7.a, android.view.MenuItem
    public final a7.a setContentDescription(CharSequence charSequence) {
        this.f31465j = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z11) {
        this.f31470p = (z11 ? 16 : 0) | (this.f31470p & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i11) {
        this.f31463h = this.f31464i.getDrawable(i11);
        a();
        return this;
    }

    @Override // a7.a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.l = colorStateList;
        this.f31468n = true;
        a();
        return this;
    }

    @Override // a7.a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f31467m = mode;
        this.f31469o = true;
        a();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f31458c = intent;
        return this;
    }

    @Override // a7.a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c3, int i11) {
        this.f31459d = c3;
        this.f31460e = KeyEvent.normalizeMetaState(i11);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // a7.a, android.view.MenuItem
    public final MenuItem setShortcut(char c3, char c7, int i11, int i12) {
        this.f31459d = c3;
        this.f31460e = KeyEvent.normalizeMetaState(i11);
        this.f31461f = Character.toLowerCase(c7);
        this.f31462g = KeyEvent.normalizeMetaState(i12);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i11) {
        this.f31456a = this.f31464i.getResources().getString(i11);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f31457b = charSequence;
        return this;
    }

    @Override // a7.a, android.view.MenuItem
    public final a7.a setTooltipText(CharSequence charSequence) {
        this.f31466k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z11) {
        this.f31470p = (this.f31470p & 8) | (z11 ? 0 : 8);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f31465j = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f31466k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i11) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c3) {
        this.f31459d = c3;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f31463h = drawable;
        a();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c3) {
        this.f31461f = Character.toLowerCase(c3);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f31456a = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c3, char c7) {
        this.f31459d = c3;
        this.f31461f = Character.toLowerCase(c7);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i11) {
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i11) {
        return this;
    }
}
