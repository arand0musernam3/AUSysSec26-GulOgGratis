package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class AlertController$RecycleListView extends ListView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1767b;

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.a.f24272u);
        this.f1767b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.f1766a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }

    public void setHasDecor(boolean z11, boolean z12) {
        if (z12 && z11) {
            return;
        }
        setPadding(getPaddingLeft(), z11 ? getPaddingTop() : this.f1766a, getPaddingRight(), z12 ? getPaddingBottom() : this.f1767b);
    }

    public AlertController$RecycleListView(Context context) {
        this(context, null);
    }
}
