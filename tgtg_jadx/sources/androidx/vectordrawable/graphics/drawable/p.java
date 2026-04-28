package androidx.vectordrawable.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o f4093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ColorStateList f4094c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public PorterDuff.Mode f4095d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f4096e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Bitmap f4097f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ColorStateList f4098g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f4099h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f4100i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f4101j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f4102k;
    public Paint l;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f4092a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new r(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new r(this);
    }
}
