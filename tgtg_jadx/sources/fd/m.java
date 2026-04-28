package fd;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f17572b;

    public /* synthetic */ m(Object obj, int i11) {
        this.f17571a = i11;
        this.f17572b = obj;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        switch (this.f17571a) {
            case 0:
                ((l) this.f17572b).c(canvas);
                break;
            default:
                ActionBarContainer actionBarContainer = (ActionBarContainer) this.f17572b;
                if (actionBarContainer.f1939h) {
                    Drawable drawable = actionBarContainer.f1938g;
                    if (drawable != null) {
                        drawable.draw(canvas);
                    }
                    break;
                } else {
                    Drawable drawable2 = actionBarContainer.f1936e;
                    if (drawable2 != null) {
                        drawable2.draw(canvas);
                    }
                    Drawable drawable3 = actionBarContainer.f1937f;
                    if (drawable3 != null && actionBarContainer.f1940i) {
                        drawable3.draw(canvas);
                        break;
                    }
                }
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        switch (this.f17571a) {
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        switch (this.f17571a) {
            case 1:
                ActionBarContainer actionBarContainer = (ActionBarContainer) this.f17572b;
                if (!actionBarContainer.f1939h) {
                    Drawable drawable = actionBarContainer.f1936e;
                    if (drawable != null) {
                        drawable.getOutline(outline);
                    }
                } else if (actionBarContainer.f1938g != null) {
                    actionBarContainer.f1936e.getOutline(outline);
                }
                break;
            default:
                super.getOutline(outline);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i11) {
        int i12 = this.f17571a;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        int i11 = this.f17571a;
    }

    private final void a(int i11) {
    }

    private final void b(int i11) {
    }

    private final void c(ColorFilter colorFilter) {
    }

    private final void d(ColorFilter colorFilter) {
    }
}
