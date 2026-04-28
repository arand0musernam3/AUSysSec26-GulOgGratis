package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.app.tgtg.model.local.AppConstants;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class t extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f2505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2506c;

    public t(Context context) {
        super(context);
        this.f2504a = -1;
        this.f2505b = null;
        this.f2506c = 4;
        a(null);
    }

    public final void a(AttributeSet attributeSet) {
        super.setVisibility(this.f2506c);
        this.f2504a = -1;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, v.f2509c);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i11);
                if (index == 0) {
                    this.f2504a = typedArrayObtainStyledAttributes.getResourceId(index, this.f2504a);
                } else if (index == 1) {
                    this.f2506c = typedArrayObtainStyledAttributes.getInt(index, this.f2506c);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public View getContent() {
        return this.f2505b;
    }

    public int getEmptyVisibility() {
        return this.f2506c;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(AppConstants.GO_TO_GPS_SETTINGS, AppConstants.GO_TO_GPS_SETTINGS, AppConstants.GO_TO_GPS_SETTINGS);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize(rect.height());
            int iHeight = rect.height();
            int iWidth = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((iWidth / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((rect.height() / 2.0f) + (iHeight / 2.0f)) - rect.bottom, paint);
        }
    }

    public void setContentId(int i11) {
        View viewFindViewById;
        if (this.f2504a == i11) {
            return;
        }
        View view = this.f2505b;
        if (view != null) {
            view.setVisibility(0);
            ((ConstraintLayout.a) this.f2505b.getLayoutParams()).f2317f0 = false;
            this.f2505b = null;
        }
        this.f2504a = i11;
        if (i11 == -1 || (viewFindViewById = ((View) getParent()).findViewById(i11)) == null) {
            return;
        }
        viewFindViewById.setVisibility(8);
    }

    public void setEmptyVisibility(int i11) {
        this.f2506c = i11;
    }

    public t(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2504a = -1;
        this.f2505b = null;
        this.f2506c = 4;
        a(attributeSet);
    }

    public t(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f2504a = -1;
        this.f2505b = null;
        this.f2506c = 4;
        a(attributeSet);
    }
}
