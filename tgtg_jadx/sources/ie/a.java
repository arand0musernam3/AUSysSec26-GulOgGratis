package ie;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.os.LocaleList;
import ve.g;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends Paint {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23826a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(PorterDuff.Mode mode) {
        super(1);
        this.f23826a = 0;
        setXfermode(new PorterDuffXfermode(mode));
    }

    @Override // android.graphics.Paint
    public void setAlpha(int i11) {
        switch (this.f23826a) {
            case 0:
                if (Build.VERSION.SDK_INT >= 30) {
                    super.setAlpha(g.c(i11));
                } else {
                    setColor((g.c(i11) << 24) | (getColor() & 16777215));
                }
                break;
            default:
                super.setAlpha(i11);
                break;
        }
    }

    @Override // android.graphics.Paint
    public void setTextLocales(LocaleList localeList) {
        switch (this.f23826a) {
            case 0:
                break;
            default:
                super.setTextLocales(localeList);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i11, int i12) {
        super(i11);
        this.f23826a = i12;
    }

    private final void a(LocaleList localeList) {
    }
}
