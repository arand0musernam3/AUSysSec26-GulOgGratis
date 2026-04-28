package t00;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.google.android.gms.maps.GoogleMapOptions;
import cz.j;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public class c extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f39338a;

    public c(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f39338a = new j(this, context, GoogleMapOptions.d(context, attributeSet));
        setClickable(true);
    }

    public c(@NonNull Context context) {
        super(context);
        this.f39338a = new j(this, context, null);
        setClickable(true);
    }

    public c(@NonNull Context context, @NonNull AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f39338a = new j(this, context, GoogleMapOptions.d(context, attributeSet));
        setClickable(true);
    }
}
