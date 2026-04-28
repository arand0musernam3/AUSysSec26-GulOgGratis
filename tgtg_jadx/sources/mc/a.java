package mc;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import c50.w;
import com.app.tgtg.R;
import pd.g;

/* JADX INFO: loaded from: classes.dex */
public final class a implements sa.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewGroup f29922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f29923c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f29924d;

    public a(RelativeLayout relativeLayout, ConstraintLayout constraintLayout, TextView textView) {
        this.f29921a = 5;
        this.f29923c = relativeLayout;
        this.f29922b = constraintLayout;
        this.f29924d = textView;
    }

    public static a a(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(R.layout.custom_marker_browse_map, (ViewGroup) null, false);
        int i11 = R.id.ivMarkerIcon;
        AppCompatImageView appCompatImageView = (AppCompatImageView) g.t(R.id.ivMarkerIcon, viewInflate);
        if (appCompatImageView != null) {
            i11 = R.id.tvMarker;
            AppCompatTextView appCompatTextView = (AppCompatTextView) g.t(R.id.tvMarker, viewInflate);
            if (appCompatTextView != null) {
                return new a((ConstraintLayout) viewInflate, appCompatImageView, appCompatTextView, 3);
            }
        }
        w.l("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
        return null;
    }

    @Override // sa.a
    public final View getRoot() {
        switch (this.f29921a) {
            case 0:
                return (ConstraintLayout) this.f29922b;
            case 1:
                return (ConstraintLayout) this.f29922b;
            case 2:
                return (ConstraintLayout) this.f29922b;
            case 3:
                return (ConstraintLayout) this.f29922b;
            case 4:
                return (ConstraintLayout) this.f29922b;
            case 5:
                return (RelativeLayout) this.f29923c;
            case 6:
                return (RelativeLayout) this.f29922b;
            default:
                return (LinearLayout) this.f29922b;
        }
    }

    public /* synthetic */ a(ViewGroup viewGroup, View view, View view2, int i11) {
        this.f29921a = i11;
        this.f29922b = viewGroup;
        this.f29923c = view;
        this.f29924d = view2;
    }
}
