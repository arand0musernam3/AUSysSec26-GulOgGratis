package androidx.core.app;

import android.app.Notification;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;
import com.adyen.checkout.ui.core.internal.ui.view.RoundCornerImageView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public IconCompat f2653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public IconCompat f2654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f2655c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2656d;

    public static IconCompat c(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        if (parcelable instanceof Icon) {
            return IconCompat.b((Icon) parcelable);
        }
        if (parcelable instanceof Bitmap) {
            return IconCompat.c((Bitmap) parcelable);
        }
        return null;
    }

    @Override // androidx.core.app.l0
    public final void apply(i iVar) {
        Bitmap bitmap;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(((o0) iVar).f2650b).setBigContentTitle(this.mBigContentTitle);
        IconCompat iconCompat = this.f2653a;
        if (iconCompat != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                p.a(bigContentTitle, iconCompat.h(iVar instanceof o0 ? ((o0) iVar).f2649a : null));
            } else {
                int iY = iconCompat.f2719a;
                if (iY == -1) {
                    iY = ba0.g.y(iconCompat.f2720b);
                }
                if (iY == 1) {
                    IconCompat iconCompat2 = this.f2653a;
                    int i11 = iconCompat2.f2719a;
                    if (i11 == -1) {
                        Object obj = iconCompat2.f2720b;
                        bitmap = obj instanceof Bitmap ? (Bitmap) obj : null;
                    } else if (i11 == 1) {
                        bitmap = (Bitmap) iconCompat2.f2720b;
                    } else {
                        if (i11 != 5) {
                            j4.d.e(iconCompat2, "called getBitmap() on ");
                            return;
                        }
                        Bitmap bitmap2 = (Bitmap) iconCompat2.f2720b;
                        int iMin = (int) (Math.min(bitmap2.getWidth(), bitmap2.getHeight()) * 0.6666667f);
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(bitmapCreateBitmap);
                        Paint paint = new Paint(3);
                        float f11 = iMin;
                        float f12 = 0.5f * f11;
                        float f13 = 0.9166667f * f12;
                        float f14 = 0.010416667f * f11;
                        paint.setColor(0);
                        paint.setShadowLayer(f14, 0.0f, f11 * 0.020833334f, 1023410176);
                        canvas.drawCircle(f12, f12, f13, paint);
                        paint.setShadowLayer(f14, 0.0f, 0.0f, 503316480);
                        canvas.drawCircle(f12, f12, f13, paint);
                        paint.clearShadowLayer();
                        paint.setColor(RoundCornerImageView.DEFAULT_STROKE_COLOR);
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                        Matrix matrix = new Matrix();
                        matrix.setTranslate((-(bitmap2.getWidth() - iMin)) / 2.0f, (-(bitmap2.getHeight() - iMin)) / 2.0f);
                        bitmapShader.setLocalMatrix(matrix);
                        paint.setShader(bitmapShader);
                        canvas.drawCircle(f12, f12, f13, paint);
                        canvas.setBitmap(null);
                        bitmap = bitmapCreateBitmap;
                    }
                    bigContentTitle = bigContentTitle.bigPicture(bitmap);
                }
            }
        }
        if (this.f2655c) {
            IconCompat iconCompat3 = this.f2654b;
            if (iconCompat3 == null) {
                bigContentTitle.bigLargeIcon((Bitmap) null);
            } else {
                bigContentTitle.bigLargeIcon(iconCompat3.h(iVar instanceof o0 ? ((o0) iVar).f2649a : null));
            }
        }
        if (this.mSummaryTextSet) {
            bigContentTitle.setSummaryText(this.mSummaryText);
        }
        if (Build.VERSION.SDK_INT >= 31) {
            p.c(bigContentTitle, this.f2656d);
            p.b(bigContentTitle, null);
        }
    }

    @Override // androidx.core.app.l0
    public final void clearCompatExtraKeys(Bundle bundle) {
        super.clearCompatExtraKeys(bundle);
        bundle.remove("android.largeIcon.big");
        bundle.remove("android.picture");
        bundle.remove("android.pictureIcon");
        bundle.remove("android.showBigPictureWhenCollapsed");
    }

    public final void d(CharSequence charSequence) {
        this.mBigContentTitle = s.b(charSequence);
    }

    public final void e(CharSequence charSequence) {
        this.mSummaryText = s.b(charSequence);
        this.mSummaryTextSet = true;
    }

    @Override // androidx.core.app.l0
    public final String getClassName() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }

    @Override // androidx.core.app.l0
    public final void restoreFromCompatExtras(Bundle bundle) {
        super.restoreFromCompatExtras(bundle);
        if (bundle.containsKey("android.largeIcon.big")) {
            this.f2654b = c(bundle.getParcelable("android.largeIcon.big"));
            this.f2655c = true;
        }
        Parcelable parcelable = bundle.getParcelable("android.picture");
        this.f2653a = parcelable != null ? c(parcelable) : c(bundle.getParcelable("android.pictureIcon"));
        this.f2656d = bundle.getBoolean("android.showBigPictureWhenCollapsed");
    }
}
