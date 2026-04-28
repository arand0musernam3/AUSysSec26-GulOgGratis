package dy;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.app.tgtg.R;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class h extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageView f15227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f15228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f15229c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f15230d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context) {
        super(context);
        context.getClass();
        LayoutInflater.from(context).inflate(R.layout.com_facebook_tooltip_bubble, this);
        View viewFindViewById = findViewById(R.id.com_facebook_tooltip_bubble_view_top_pointer);
        viewFindViewById.getClass();
        this.f15227a = (ImageView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.com_facebook_tooltip_bubble_view_bottom_pointer);
        viewFindViewById2.getClass();
        this.f15228b = (ImageView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.com_facebook_body_frame);
        viewFindViewById3.getClass();
        this.f15229c = viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.com_facebook_button_xout);
        viewFindViewById4.getClass();
        this.f15230d = (ImageView) viewFindViewById4;
    }
}
