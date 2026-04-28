package p;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.appcompat.widget.AppCompatSpinner;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 implements i0, DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public k.f f33856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d0 f33857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CharSequence f33858c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AppCompatSpinner f33859d;

    public c0(AppCompatSpinner appCompatSpinner) {
        this.f33859d = appCompatSpinner;
    }

    @Override // p.i0
    public final boolean a() {
        k.f fVar = this.f33856a;
        if (fVar != null) {
            return fVar.isShowing();
        }
        return false;
    }

    @Override // p.i0
    public final int b() {
        return 0;
    }

    @Override // p.i0
    public final void d(int i11) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // p.i0
    public final void dismiss() {
        k.f fVar = this.f33856a;
        if (fVar != null) {
            fVar.dismiss();
            this.f33856a = null;
        }
    }

    @Override // p.i0
    public final CharSequence e() {
        return this.f33858c;
    }

    @Override // p.i0
    public final Drawable f() {
        return null;
    }

    @Override // p.i0
    public final void h(CharSequence charSequence) {
        this.f33858c = charSequence;
    }

    @Override // p.i0
    public final void j(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // p.i0
    public final void k(int i11) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // p.i0
    public final void l(int i11) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // p.i0
    public final void m(int i11, int i12) {
        if (this.f33857b == null) {
            return;
        }
        AppCompatSpinner appCompatSpinner = this.f33859d;
        androidx.constraintlayout.widget.z zVar = new androidx.constraintlayout.widget.z(appCompatSpinner.getPopupContext());
        k.c cVar = (k.c) zVar.f2543c;
        CharSequence charSequence = this.f33858c;
        if (charSequence != null) {
            cVar.f25521d = charSequence;
        }
        d0 d0Var = this.f33857b;
        int selectedItemPosition = appCompatSpinner.getSelectedItemPosition();
        cVar.f25528k = d0Var;
        cVar.l = this;
        cVar.f25531o = selectedItemPosition;
        cVar.f25530n = true;
        k.f fVarG = zVar.g();
        this.f33856a = fVarG;
        AlertController$RecycleListView alertController$RecycleListView = fVarG.f25563a.f25538f;
        alertController$RecycleListView.setTextDirection(i11);
        alertController$RecycleListView.setTextAlignment(i12);
        this.f33856a.show();
    }

    @Override // p.i0
    public final int n() {
        return 0;
    }

    @Override // p.i0
    public final void o(ListAdapter listAdapter) {
        this.f33857b = (d0) listAdapter;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i11) {
        AppCompatSpinner appCompatSpinner = this.f33859d;
        appCompatSpinner.setSelection(i11);
        if (appCompatSpinner.getOnItemClickListener() != null) {
            appCompatSpinner.performItemClick(null, i11, this.f33857b.getItemId(i11));
        }
        dismiss();
    }
}
