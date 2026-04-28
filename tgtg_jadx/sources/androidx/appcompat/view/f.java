package androidx.appcompat.view;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import o.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends android.view.ActionMode {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f1857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActionMode f1858b;

    public f(Context context, ActionMode actionMode) {
        this.f1857a = context;
        this.f1858b = actionMode;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f1858b.a();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f1858b.b();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new a0(this.f1857a, this.f1858b.c());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f1858b.d();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f1858b.e();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f1858b.f1838a;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f1858b.f();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f1858b.f1839b;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f1858b.g();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f1858b.h();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f1858b.i(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f1858b.l(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f1858b.f1838a = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f1858b.n(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z11) {
        this.f1858b.o(z11);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i11) {
        this.f1858b.k(i11);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i11) {
        this.f1858b.m(i11);
    }
}
