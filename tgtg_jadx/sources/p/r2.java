package p;

import android.R;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class r2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f33994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f33995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f33996c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f33997d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ImageView f33998e;

    public r2(View view) {
        this.f33994a = (TextView) view.findViewById(R.id.text1);
        this.f33995b = (TextView) view.findViewById(R.id.text2);
        this.f33996c = (ImageView) view.findViewById(R.id.icon1);
        this.f33997d = (ImageView) view.findViewById(R.id.icon2);
        this.f33998e = (ImageView) view.findViewById(com.app.tgtg.R.id.edit_query);
    }
}
