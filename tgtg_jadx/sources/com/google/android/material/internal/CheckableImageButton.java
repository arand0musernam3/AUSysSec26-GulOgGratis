package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.core.view.ViewCompat;
import com.google.android.material.button.g;
import e20.b;
import org.bouncycastle.pqc.crypto.newhope.NewHope;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public class CheckableImageButton extends AppCompatImageButton implements Checkable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f12497g = {R.attr.state_checked};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f12498d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f12499e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f12500f;

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f12499e = true;
        this.f12500f = true;
        ViewCompat.b0(this, new g(this, 1));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f12498d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i11) {
        return this.f12498d ? View.mergeDrawableStates(super.onCreateDrawableState(i11 + 1), f12497g) : super.onCreateDrawableState(i11);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.f45418a);
        setChecked(bVar.f15583c);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f15583c = this.f12498d;
        return bVar;
    }

    public void setCheckable(boolean z11) {
        if (this.f12499e != z11) {
            this.f12499e = z11;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z11) {
        if (!this.f12499e || this.f12498d == z11) {
            return;
        }
        this.f12498d = z11;
        refreshDrawableState();
        sendAccessibilityEvent(NewHope.SENDB_BYTES);
    }

    public void setPressable(boolean z11) {
        this.f12500f = z11;
    }

    @Override // android.view.View
    public void setPressed(boolean z11) {
        if (this.f12500f) {
            super.setPressed(z11);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f12498d);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.app.tgtg.R.attr.imageButtonStyle);
    }

    public CheckableImageButton(Context context) {
        this(context, null);
    }
}
