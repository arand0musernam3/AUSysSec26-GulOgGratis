package h20;

import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.material.carousel.CarouselLayoutManager;
import zendesk.messaging.android.internal.conversationscreen.messagelog.MessageLogView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f21265b;

    public /* synthetic */ e(Object obj, int i11) {
        this.f21264a = i11;
        this.f21265b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        boolean z11;
        m10.a aVar;
        switch (this.f21264a) {
            case 0:
                p10.a aVar2 = (p10.a) this.f21265b;
                View view2 = aVar2.f21298r;
                ImageView imageView = aVar2.f21300t;
                if (imageView.getVisibility() == 0 && (aVar = aVar2.f21279g1) != null) {
                    Rect rect = new Rect();
                    imageView.getDrawingRect(rect);
                    aVar.setBounds(rect);
                    aVar.j(imageView, null);
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) aVar2.f21297q.getLayoutParams();
                int i19 = (i13 - i11) + layoutParams.rightMargin + layoutParams.leftMargin;
                int i21 = (i14 - i12) + layoutParams.topMargin + layoutParams.bottomMargin;
                boolean z12 = true;
                if (aVar2.f21282h1 == 1 && aVar2.V == -2) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) view2.getLayoutParams();
                    if (aVar2.V != -2 || view2.getMeasuredWidth() == i19) {
                        z11 = false;
                    } else {
                        layoutParams2.width = Math.max(i19, Math.min(aVar2.Q, aVar2.getMeasuredWidth() - (aVar2.t0 * 2)));
                        z11 = true;
                    }
                    if (view2.getMeasuredHeight() < i21) {
                        layoutParams2.height = i21;
                    } else {
                        z12 = z11;
                    }
                    if (z12) {
                        view2.setLayoutParams(layoutParams2);
                    }
                    break;
                }
                break;
            case 1:
                CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) this.f21265b;
                if (i13 - i11 != i17 - i15 || i14 - i12 != i18 - i16) {
                    view.post(new m0.l(carouselLayoutManager, 11));
                }
                break;
            default:
                MessageLogView._init_$lambda$0((MessageLogView) this.f21265b, view, i11, i12, i13, i14, i15, i16, i17, i18);
                break;
        }
    }
}
