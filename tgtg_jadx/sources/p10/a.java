package p10;

import android.content.Context;
import androidx.annotation.NonNull;
import com.app.tgtg.R;
import h20.h;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public class a extends h {
    public a(@NonNull Context context) {
        super(context);
    }

    @Override // h20.h
    public int getItemDefaultMarginResId() {
        return R.dimen.design_bottom_navigation_margin;
    }

    @Override // h20.h
    public int getItemLayoutResId() {
        return R.layout.design_bottom_navigation_item;
    }
}
