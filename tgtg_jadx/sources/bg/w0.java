package bg;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.app.tgtg.R;
import com.app.tgtg.customview.TGTGLoadingView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class w0 extends PopupWindow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f6241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TGTGLoadingView f6242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f6243c;

    public w0(Context context) {
        super(context);
        this.f6241a = context;
        setContentView(LayoutInflater.from(context).inflate(R.layout.loading_modal_view, (ViewGroup) null));
        View viewFindViewById = getContentView().findViewById(R.id.loadingAnimation);
        viewFindViewById.getClass();
        this.f6242b = (TGTGLoadingView) viewFindViewById;
        setHeight(-1);
        setWidth(-1);
        setFocusable(false);
        setOutsideTouchable(false);
        setElevation(20.0f);
        setBackgroundDrawable(new ColorDrawable(0));
    }

    public final void a() {
        dismiss();
        this.f6243c = false;
    }

    public final void b(View view) {
        if (view == null || view.getContext() == null) {
            return;
        }
        if (view.getContext() instanceof Activity) {
            Context context = view.getContext();
            context.getClass();
            if (((Activity) context).isFinishing()) {
                return;
            }
        }
        if (view.getWindowToken() == null || this.f6241a == null) {
            return;
        }
        showAtLocation(view, 17, 0, 0);
        this.f6242b.setVisibility(0);
        this.f6243c = true;
    }

    @Override // android.widget.PopupWindow
    public final boolean isShowing() {
        return this.f6243c;
    }
}
