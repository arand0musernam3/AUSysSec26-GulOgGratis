package atd.av;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ListView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
final class getSDKAppID extends ListView {
    private static int getDeviceData = 0;
    private static int getSDKTransactionID = 1;

    public getSDKAppID(Context context) {
        this(context, null);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i11, int i12) {
        int i13 = getDeviceData;
        int i14 = i13 ^ 75;
        int i15 = (i13 & 75) << 1;
        int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
        getSDKTransactionID = i16 % 128;
        if (i16 % 2 != 0) {
            super.onMeasure(i11, View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE));
            getLayoutParams().height = getMeasuredHeight();
        } else {
            super.onMeasure(i11, View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE));
            getLayoutParams().height = getMeasuredHeight();
            throw null;
        }
    }

    public getSDKAppID(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public getSDKAppID(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
    }
}
